package quantum.circuit.qiskit.api;

import qucircuit.CompositeQuantumGate;
import qucircuit.QuantumCircuit;

public interface QiskitCompositeGate {
	
	public String generateCode(QuantumCircuit qucircuit, CompositeQuantumGate compositeGate);
}
