package at.jku.se.quantum.circuit.qiskit.qugates;

import at.jku.se.quantum.circuit.qiskit.api.QiskitOperationGeneration;
import at.jku.se.quantum.circuit.qiskit.utils.QiskitCodeGenerationUtils;
import qucircuit.QuantumOperation;

public class AmplificationCodeQiskit implements QiskitOperationGeneration {

	@Override
	public String generateQiskitCode(QuantumOperation quOpe) {
		return generateQiskitCode(quOpe, QiskitCodeGenerationUtils.targetQubits(quOpe));
	}
	
	public String generateQiskitCode(QuantumOperation quOpe, String positions) {
		final StringBuilder ampAmp = new StringBuilder();
		ampAmp.append("""
			def AA(nqubits):
				qc = QuantumCircuit(nqubits)
				for qubit in range(nqubits):
					qc.h(qubit)
				for qubit in range(nqubits):
					qc.x(qubit)
				qc.h(nqubits-1)
				qc.mct(list(range(nqubits-1)), nqubits-1)
				qc.h(nqubits-1)
				for qubit in range(nqubits):
					qc.x(qubit)
				for qubit in range(nqubits):
					qc.h(qubit)
				U_s = qc.to_gate()
				U_s.name = "AA"
				return U_s
				""");
		ampAmp.append("tqubits = " + positions  + System.getProperty(QiskitCodeGenerationUtils.LINE_SEPARATOR));
		ampAmp.append("""		
					n = len(tqubits)
					qc.append(AA(n), tqubits)
					""");
		return ampAmp.toString();
	}

}
