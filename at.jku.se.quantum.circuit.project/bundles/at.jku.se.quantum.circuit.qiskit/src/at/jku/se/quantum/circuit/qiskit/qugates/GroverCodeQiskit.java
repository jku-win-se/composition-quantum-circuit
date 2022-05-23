package at.jku.se.quantum.circuit.qiskit.qugates;

import at.jku.se.quantum.circuit.qiskit.api.QiskitOperationGeneration;
import at.jku.se.quantum.circuit.qiskit.utils.QiskitCodeGenerationUtils;
import qucircuit.AbstractQuantumGate;
import qucircuit.QuantumOperation;

public class GroverCodeQiskit implements QiskitOperationGeneration {

	@Override
	public String generateQiskitCode(QuantumOperation quOpe) {
		StringBuilder grover = new StringBuilder();
		grover.append("""
				def grover(tqubits): #general defintion of cgrover as Alternative
				    n = len(tqubits)
				    qc = QuantumCircuit(n)
				    for q in range(n):
				        qc.h(q)
				""");
		//Oracle
		final var oracleQiskit = new OracleCodeQiskit();
		grover.append(oracleQiskit.generateQiskitCode(quOpe, "[0,1,2]")
				.indent(4));
		//Amplitude Amplification
		final var ampAmp = new AmplificationCodeQiskit();
		grover.append(ampAmp.generateQiskitCode(quOpe, "[0,1,2]")//TODO dynamically calculate the positions e.g. 5 qubist [0,1,2,3,4]
				.indent(4));
		grover.append("""
				grover = qc.to_gate()
				grover.label = "Grover"
				return grover
				""".indent(4));
		grover.append("tqubits = " +  QiskitCodeGenerationUtils.targetQubits(quOpe) + System.getProperty(QiskitCodeGenerationUtils.LINE_SEPARATOR));
		grover.append("cqubits = " + QiskitCodeGenerationUtils.controlQubits((AbstractQuantumGate) quOpe) + System.getProperty(QiskitCodeGenerationUtils.LINE_SEPARATOR));
		grover.append("""
				grover = grover(tqubits)
				for i in range(len(cqubits)):
				    grover = grover.control()
				qc.append(grover, cqubits + tqubits)
				""");		
		return grover.toString();
	}

}
