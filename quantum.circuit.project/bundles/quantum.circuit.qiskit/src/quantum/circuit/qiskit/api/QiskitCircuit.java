package quantum.circuit.qiskit.api;

import qucircuit.QuantumCircuit;

public interface QiskitCircuit {
	
	public String generateCircuitFile(QuantumCircuit qucircuit);
	
}
