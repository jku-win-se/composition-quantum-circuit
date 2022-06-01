package quantum.circuit.qiskit.qugates;

import quantum.circuit.qiskit.api.QiskitOperationGeneration;
import quantum.circuit.qiskit.utils.QiskitCodeGenerationUtils;
import qucircuit.ElementaryQuantumGate;
import qucircuit.QuantumOperation;

public class PauliZCodeQiskit implements QiskitOperationGeneration {

	@Override
	public String generateQiskitCode(QuantumOperation quOpe) {
		String tQubits = QiskitCodeGenerationUtils.targetQubits(quOpe);
		String pauliZQiskit = "tqubits = " + tQubits + System.getProperty(QiskitCodeGenerationUtils.LINE_SEPARATOR);
		if (quOpe instanceof ElementaryQuantumGate elementaryQuantumGate) {	
			if (elementaryQuantumGate.getControlQubits().size() == 0) {//No controlled
				pauliZQiskit += """
					for t in tqubits: 
						qc.z(t)
					""";				
			} else if (elementaryQuantumGate.getControlQubits().size() == 1) {//Single-controlled
				pauliZQiskit += "cqubits = " + QiskitCodeGenerationUtils.controlQubits(elementaryQuantumGate) + System.getProperty(QiskitCodeGenerationUtils.LINE_SEPARATOR);
				pauliZQiskit += """
						for t in tqubits:
							qc.cz(cqubits[0], t)
						""";
			} else {
				pauliZQiskit += "cqubits = " + QiskitCodeGenerationUtils.controlQubits(elementaryQuantumGate) + System.getProperty(QiskitCodeGenerationUtils.LINE_SEPARATOR);
				pauliZQiskit += """
						for t in tqubits:
							qc.h(t)
							qc.mct(cqubits, t)
							qc.h(t)
						""";
			}
		} else
			throw new IllegalArgumentException("Expected ElementaryQuantumGate type object");		
		return pauliZQiskit;
	}

}
