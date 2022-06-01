package quantum.circuit.qiskit.api;

import qucircuit.QuantumOperation;

public interface QiskitOperationGeneration {
	
	public String generateQiskitCode(QuantumOperation quOpe);
}
