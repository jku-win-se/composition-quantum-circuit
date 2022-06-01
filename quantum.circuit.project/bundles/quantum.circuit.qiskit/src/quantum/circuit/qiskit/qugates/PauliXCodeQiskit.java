package quantum.circuit.qiskit.qugates;

import quantum.circuit.qiskit.api.QiskitOperationGeneration;
import quantum.circuit.qiskit.utils.QiskitCodeGenerationUtils;
import qucircuit.ElementaryQuantumGate;
import qucircuit.QuantumOperation;

public class PauliXCodeQiskit implements QiskitOperationGeneration {

	@Override
	public String generateQiskitCode(QuantumOperation quOpe) {
		String tQubits = QiskitCodeGenerationUtils.targetQubits(quOpe);
		String pauliXQiskit = "tqubits = " + tQubits + System.getProperty(QiskitCodeGenerationUtils.LINE_SEPARATOR);
		if (quOpe instanceof ElementaryQuantumGate elementaryQuantumGate) {	
			if (elementaryQuantumGate.getControlQubits().size() == 0) {//No controlled
				pauliXQiskit += """
					for t in tqubits: 
						qc.x(t)
					""";				
			} else if (elementaryQuantumGate.getControlQubits().size() == 1) {//Single-controlled
				pauliXQiskit += "cqubits = " + QiskitCodeGenerationUtils.controlQubits(elementaryQuantumGate) + System.getProperty(QiskitCodeGenerationUtils.LINE_SEPARATOR);
				pauliXQiskit += """
						for t in tqubits:
							qc.cx(cqubits[0], t)
						""";
			} else {
				pauliXQiskit += "cqubits = " + QiskitCodeGenerationUtils.controlQubits(elementaryQuantumGate) + System.getProperty(QiskitCodeGenerationUtils.LINE_SEPARATOR);
				pauliXQiskit += """
						for t in tqubits:
							qc.mct(cqubits, t)							
						""";
			}
		} else
			throw new IllegalArgumentException("Expected ElementaryQuantumGate type object");		
		return pauliXQiskit;
	}

}
