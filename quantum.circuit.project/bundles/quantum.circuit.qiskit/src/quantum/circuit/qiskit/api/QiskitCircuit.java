package quantum.circuit.qiskit.api;

import quantum.circuit.qiskit.circuit.QuantumCircuitMetadata;
import qucircuit.QuantumCircuit;

public interface QiskitCircuit {
	
	public String generateCode(QuantumCircuit quCircuit, QuantumCircuitMetadata quCircuitMetadata);
	
}
