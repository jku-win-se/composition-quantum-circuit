package quantum.circuit.qiskit.api;

import qubo.Matrix;
import qucircuit.QuantumCircuit;

public interface QiskitQuboMatrix {

	public String generateCode(QuantumCircuit qucircuit, Matrix matrix);

}
