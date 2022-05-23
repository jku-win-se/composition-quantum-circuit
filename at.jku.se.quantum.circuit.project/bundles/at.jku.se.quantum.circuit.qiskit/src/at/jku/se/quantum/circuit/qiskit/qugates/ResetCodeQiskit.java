package at.jku.se.quantum.circuit.qiskit.qugates;

import at.jku.se.quantum.circuit.qiskit.api.QiskitOperationGeneration;
import at.jku.se.quantum.circuit.qiskit.utils.QiskitCodeGenerationUtils;
import qucircuit.QuantumOperation;

public class ResetCodeQiskit implements QiskitOperationGeneration {

	@Override
	public String generateQiskitCode(QuantumOperation quOpe) {
		String tqubits = QiskitCodeGenerationUtils.targetQubits(quOpe);	
		String quOpeQiskitCode = "tqubits =" + tqubits + System.getProperty(QiskitCodeGenerationUtils.LINE_SEPARATOR) +
									"""
										for t in tqubits:
											qc.reset(t)	
										"""
										;		
		return quOpeQiskitCode;
	}

}
