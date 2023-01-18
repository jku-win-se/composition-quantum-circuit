package quantum.circuit.qiskit.composite.gate;

import java.util.Arrays;

import quantum.circuit.qiskit.api.QiskitCompositeGate;
import quantum.circuit.qiskit.circuit.QuantumCircuitMetadata;
import quantum.circuit.qiskit.qubo.MatrixGeneration;
import quantum.circuit.qiskit.utils.QiskitCodeGenerationUtils;
import quantum.operation.contribution.compositequantumgate.Amplification;
import quantum.operation.contribution.compositequantumgate.CostUnitary;
import quantum.operation.contribution.compositequantumgate.Grover;
import quantum.operation.contribution.compositequantumgate.Initialize;
import quantum.operation.contribution.compositequantumgate.MixerUnitaryQAOA;
import quantum.operation.contribution.compositequantumgate.Oracle;
import quantum.operation.contribution.compositequantumgate.QFT;
import quantum.operation.contribution.compositequantumgate.QFTElement;
import qucircuit.CompositeQuantumGate;
import qucircuit.QuantumCircuit;

public class CompositeGateGeneration implements QiskitCompositeGate {

	@Override
	public String generateCode(QuantumCircuit qucircuit, CompositeQuantumGate compositeGate) {
		/* 
		 * We need options for QFT, CostUnitary, MixerUnitaryQAOA, QFTElement, Grover
		 * For now we ignore Initialize, Amplification, Oracle
		 */
		var quCircuitMetadata = new QuantumCircuitMetadata(qucircuit);
		quCircuitMetadata.generateMetadata();
		
		var compositeGateSB = new StringBuilder();  // return value
		
		// compute options
		var inverseOption = "inverse=" + (compositeGate.getInverseForm() ? "True" : "False");
		
		var controlQubitsOption = "control_qubits=None";
		if(!compositeGate.getControlQubits().isEmpty()) {
			controlQubitsOption = "control_qubits=" + QiskitCodeGenerationUtils.indexesQuantumRegister(compositeGate.getControlQubits(), 
					quCircuitMetadata.getQuantumRegisterIndexes());
		}
		
		// start of append
		compositeGateSB.append(qucircuit.getName() + ".append("); 
		var opName = compositeGate.getOperations().get(0).getOperation().getName();
		if (opName.equals(QFT.class.getSimpleName())) {
			compositeGateSB.append("c_gate.qft(")
							.append("size=len(target_qubits), ");
		} else if (opName.equals(CostUnitary.class.getSimpleName())) {
			compositeGateSB.append("c_gate.cost_unitary(")
							.append(new MatrixGeneration().generateCode(qucircuit, compositeGate.getOperations().get(0).getQubo().getMatrix()));
		} else if (opName.equals(MixerUnitaryQAOA.class.getSimpleName())) {
			compositeGateSB.append("c_gate.mixer_unitary(size="+qucircuit.getName()+".num_qubits, "); // note size here is NOT len(target_qubits)
		} else if (opName.equals(QFTElement.class.getSimpleName())) {
			compositeGateSB.append("c_gate.qft_element(")
							.append("size=len(target_qubits), ");
		} else if (opName.equals(Grover.class.getSimpleName())) {
			compositeGateSB.append("c_gate.grover4(");
														
//		} else if (opName.equals(Initialize.class.getSimpleName())) {
//			
//		} else if (opName.equals(Amplification.class.getSimpleName())) {
//			
//		} else if (opName.equals(Oracle.class.getSimpleName())) {
//			
		} else {
			return "# Operation "+ compositeGate.getOperations().get(0).getOperation().getName()+ " not supported yet in CompositeQuantumGates";
		}
		
		
		compositeGateSB
			.append(controlQubitsOption + ", ")
			.append(inverseOption)
			.append("), target_qubits)")
			.append("\n");
		
		return compositeGateSB.toString();
	}

}
