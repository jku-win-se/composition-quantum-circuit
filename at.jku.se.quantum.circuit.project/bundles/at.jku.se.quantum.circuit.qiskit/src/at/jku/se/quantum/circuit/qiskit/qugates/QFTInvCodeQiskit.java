package at.jku.se.quantum.circuit.qiskit.qugates;

import at.jku.se.quantum.circuit.qiskit.api.QiskitOperationGeneration;
import at.jku.se.quantum.circuit.qiskit.utils.QiskitCodeGenerationUtils;
import qucircuit.QuantumOperation;

public class QFTInvCodeQiskit implements QiskitOperationGeneration {

	@Override
	public String generateQiskitCode(QuantumOperation quOpe) {
		final StringBuilder qftInv = new StringBuilder();
		qftInv.append("""
				def qft_inv(n):   
					circuit = QuantumCircuit(n)
					def swap_registers(circuit, n):
						for qubit in range(n//2):
							circuit.swap(qubit, n-qubit-1)
						return circuit
					def qft_rotations(circuit, n):				       
						if n == 0:
							return circuit
						n -= 1
						circuit.h(n)
						for qubit in range(n):
							circuit.cp(np.pi/2**(n-qubit), qubit, n)
						qft_rotations(circuit, n)				    
					qft_rotations(circuit, n)
					swap_registers(circuit, n)
					qft_gate = circuit.to_gate()
					qft_dagger=qft_gate.inverse()
					qft_dagger.label = "QFT_inv"
					return qft_dagger
				""");
		qftInv.append("tqubits = " +  QiskitCodeGenerationUtils.targetQubits(quOpe) + System.getProperty(QiskitCodeGenerationUtils.LINE_SEPARATOR));
		qftInv.append("""
					n = len(tqubits)
					qc.append(qft_inv(n),tqubits)
					""");
		return qftInv.toString();
	}

}
