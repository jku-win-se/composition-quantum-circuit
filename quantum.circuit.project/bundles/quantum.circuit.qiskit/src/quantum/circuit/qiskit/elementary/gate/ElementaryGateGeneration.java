package quantum.circuit.qiskit.elementary.gate;

import quantum.circuit.qiskit.api.QiskitElementaryGate;
import quantum.circuit.qiskit.circuit.QuantumCircuitMetadata;
import quantum.circuit.qiskit.utils.QiskitCodeGenerationUtils;
import quantum.operation.contribution.elementaryquantumgate.CNOT;
import quantum.operation.contribution.elementaryquantumgate.Hadamard;
import quantum.operation.contribution.elementaryquantumgate.P;
import quantum.operation.contribution.elementaryquantumgate.PauliX;
import quantum.operation.contribution.elementaryquantumgate.PauliY;
import quantum.operation.contribution.elementaryquantumgate.PauliZ;
import quantum.operation.contribution.elementaryquantumgate.RX;
import quantum.operation.contribution.elementaryquantumgate.RY;
import quantum.operation.contribution.elementaryquantumgate.RZ;
import quantum.operation.contribution.elementaryquantumgate.Swap;
import qucircuit.ElementaryQuantumGate;
import qucircuit.QuantumCircuit;

public class ElementaryGateGeneration implements QiskitElementaryGate {

	@Override
	public String generateCode(QuantumCircuit qucircuit, ElementaryQuantumGate elementaryGate) {
		var elementaryGateGeneration = new StringBuilder();
		String gateName = null;
		var operation = elementaryGate.getOperations().get(0).getOperation();
		
		// parameters
		var inverseOption = "inverse=" + (elementaryGate.getInverseForm() ? "True" : "False");
		
		var quCircuitMetadata = new QuantumCircuitMetadata(qucircuit);
		quCircuitMetadata.generateMetadata();

		var controlQubitsOption = "control_qubits=None";
		if(!elementaryGate.getControlQubits().isEmpty()) {
			controlQubitsOption = "control_qubits=" + QiskitCodeGenerationUtils.indexesQuantumRegister(elementaryGate.getControlQubits(), 
					quCircuitMetadata.getQuantumRegisterIndexes());
		}
		
		
		// get the correct gate name
		if (operation.getName().equals(RX.class.getSimpleName())) {
			gateName = "rx_gate";
		} else if (operation.getName().equals(RY.class.getSimpleName())) {
			gateName = "ry_gate";
		} else if (operation.getName().equals(RZ.class.getSimpleName())) {
			gateName = "rz_gate";
		} else if (operation.getName().equals(Hadamard.class.getSimpleName())) {
			gateName = "hadamard";
		} else if (operation.getName().equals(PauliX.class.getSimpleName())) {
			gateName = "x_gate";
		} else if (operation.getName().equals(PauliY.class.getSimpleName())) {
			gateName = "y_gate";
		} else if (operation.getName().equals(PauliZ.class.getSimpleName())) {
			gateName = "z_gate";
		} else if (operation.getName().equals(Swap.class.getSimpleName())) {
			gateName = "swap";
		} else  if (operation.getName().equals(P.class.getSimpleName())) {
			gateName = "p_gate";
		} else {
			return "# Gate " + gateName + " is not supported here";
		}
			
		var extra_arguments = "";
		if (operation.getName().equals(RX.class.getSimpleName()) ||
			operation.getName().equals(RY.class.getSimpleName()) ||
			operation.getName().equals(RZ.class.getSimpleName()) ||
			operation.getName().equals(P.class.getSimpleName())) { 
			if(elementaryGate.getAngleParameter() != null && elementaryGate.getAngleParameter().getTheta() != null) {
				extra_arguments = "theta="+elementaryGate.getAngleParameter().getTheta() + ", ";
			}
		}
		
		// TODO: swap uses different parameters
		
		elementaryGateGeneration.append(qucircuit.getName() + ".append(e_gate." + gateName + "(size=len(target_qubits), " + extra_arguments + controlQubitsOption + ", " + inverseOption + "), target_qubits)").append("\n");
		return elementaryGateGeneration.toString();
	}

}
