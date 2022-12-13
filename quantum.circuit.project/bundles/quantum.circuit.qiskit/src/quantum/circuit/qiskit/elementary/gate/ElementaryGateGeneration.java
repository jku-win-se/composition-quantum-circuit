package quantum.circuit.qiskit.elementary.gate;

import quantum.circuit.qiskit.api.QiskitElementaryGate;
import quantum.operation.contribution.elementaryquantumgate.Hadamard;
import quantum.operation.contribution.elementaryquantumgate.Swap;
import qucircuit.ElementaryQuantumGate;
import qucircuit.QuantumCircuit;

public class ElementaryGateGeneration implements QiskitElementaryGate {

	@Override
	public String generateCode(QuantumCircuit qucircuit, ElementaryQuantumGate elementaryGate) {
		var elementaryGateGeneration = new StringBuilder();
		String gateName = null;
		var operation = elementaryGate.getOperations().get(0).getOperation();
		if (operation.getName().equals(Hadamard.class.getSimpleName()))
			gateName = "hadamard";
		if (operation.getName().equals(Swap.class.getSimpleName()))
			gateName = "swap";
		elementaryGateGeneration.append(qucircuit.getName() + ".append(e_gate." + gateName +"(target_qubits), target_qubits)").append("\n");
		return elementaryGateGeneration.toString();
	}

}
