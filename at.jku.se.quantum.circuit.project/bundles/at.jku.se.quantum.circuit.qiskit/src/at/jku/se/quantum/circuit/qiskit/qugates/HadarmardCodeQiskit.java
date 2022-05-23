package at.jku.se.quantum.circuit.qiskit.qugates;

import at.jku.se.quantum.circuit.qiskit.api.QiskitOperationGeneration;
import at.jku.se.quantum.circuit.qiskit.utils.QiskitCodeGenerationUtils;
import qucircuit.ElementaryQuantumGate;
import qucircuit.QuantumOperation;

public class HadarmardCodeQiskit implements QiskitOperationGeneration {

	@Override
	public String generateQiskitCode(QuantumOperation quOpe) {
		String tQubits = QiskitCodeGenerationUtils.targetQubits(quOpe);
		String hadamardQiskit = "tqubits = " + tQubits + System.getProperty(QiskitCodeGenerationUtils.LINE_SEPARATOR);
		if (quOpe instanceof ElementaryQuantumGate elementaryQuantumGate) {			
			if (elementaryQuantumGate.getControlQubits().size() == 0) {//No controlled
				hadamardQiskit += """
					for t in tqubits: 
						qc.h(t)
					""";				
			} else if (elementaryQuantumGate.getControlQubits().size() == 1) {//Single-controlled
				hadamardQiskit += "cqubits = " + QiskitCodeGenerationUtils.controlQubits(elementaryQuantumGate) + System.getProperty(QiskitCodeGenerationUtils.LINE_SEPARATOR);
				hadamardQiskit += """
						for t in tqubits:
							qc.ch(cqubits[0], t)
						""";
			}  else {//Multi-controlled
				hadamardQiskit += "cqubits = " + QiskitCodeGenerationUtils.controlQubits(elementaryQuantumGate) + System.getProperty(QiskitCodeGenerationUtils.LINE_SEPARATOR);
				hadamardQiskit += """
						def had():
					        n = 1
					        qr = QuantumRegister(n, 'q')
					        qc = QuantumCircuit(qr)
					        qc.h(0)
					        had = qc.to_gate()
					        had.label = "Had"
					        return had
						had = had()
					    for i in range(len(cqubits)):
					        had = had.control()
					    for t in tqubits:
					        qc.append(had, cqubits + [t]) 
						""";
			}		
		} else
			throw new IllegalArgumentException("Expected ElementaryQuantumGate type object");
		return hadamardQiskit;
	}

}
