package quantum.circuit.qiskit.qubo;

import quantum.circuit.qiskit.api.QiskitQuboMatrix;
import qubo.Matrix;
import qucircuit.QuantumCircuit;

public class MatrixGeneration implements QiskitQuboMatrix {

	@Override
	public String generateCode(QuantumCircuit qucircuit, Matrix matrix) {
		var matrixStringBuilder = new StringBuilder();
		matrixStringBuilder.append("["); // start row-list
		for(var row : matrix.getRows()) {
			matrixStringBuilder.append("["); // start row
			for (var col : row.getColumns()) {
				matrixStringBuilder.append(col.getValue()).append(", ");
			}
			matrixStringBuilder.append("], "); // end row
		}
		matrixStringBuilder.append("]"); // end row-list
		return matrixStringBuilder.toString();
	}

}
