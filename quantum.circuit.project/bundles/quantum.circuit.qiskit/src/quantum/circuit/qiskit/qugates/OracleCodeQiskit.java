package quantum.circuit.qiskit.qugates;

import quantum.circuit.qiskit.api.QiskitOperationGeneration;
import quantum.circuit.qiskit.utils.QiskitCodeGenerationUtils;
import qucircuit.QuantumOperation;

public class OracleCodeQiskit implements QiskitOperationGeneration {

	@Override
	public String generateQiskitCode(QuantumOperation quOpe) {
		return generateQiskitCode(quOpe, QiskitCodeGenerationUtils.targetQubits(quOpe));
	}
	
	public String generateQiskitCode(QuantumOperation quOpe, String positions) {
		final StringBuilder oracle3Qubits = new StringBuilder();
		oracle3Qubits.append(""" 
				def oracle():
				    qc = QuantumCircuit(3)
				    qc.cz(0, 2)
				    qc.cz(1, 2)
				    oracle_ex3 = qc.to_gate()
				    oracle_ex3.name = "Oracle"
				    return oracle_ex3
				""");
		oracle3Qubits.append("""
					#application of oracle to circuit
					qc.append(oracle(),""" + positions + ")" + System.getProperty(QiskitCodeGenerationUtils.LINE_SEPARATOR));					
		return oracle3Qubits.toString();
	}

}
