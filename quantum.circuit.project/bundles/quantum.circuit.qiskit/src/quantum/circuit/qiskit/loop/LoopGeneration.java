package quantum.circuit.qiskit.loop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

import quantum.circuit.qiskit.api.QiskitLoopOperation;
import quantum.circuit.qiskit.circuit.QuantumCircuitMetadata;
import quantum.circuit.qiskit.qubo.MatrixGeneration;
import quantum.circuit.qiskit.utils.QiskitCodeGenerationUtils;
import quantum.operation.contribution.compositequantumgate.CostUnitary;
import quantum.operation.contribution.compositequantumgate.Grover;
import quantum.operation.contribution.compositequantumgate.MixerUnitaryQAOA;
import quantum.operation.contribution.compositequantumgate.QFT;
import quantum.operation.contribution.compositequantumgate.QFTElement;
import quantum.operation.contribution.elementaryquantumgate.Hadamard;
import quantum.operation.contribution.elementaryquantumgate.P;
import quantum.operation.contribution.elementaryquantumgate.PauliX;
import quantum.operation.contribution.elementaryquantumgate.PauliY;
import quantum.operation.contribution.elementaryquantumgate.PauliZ;
import quantum.operation.contribution.elementaryquantumgate.RX;
import quantum.operation.contribution.elementaryquantumgate.RY;
import quantum.operation.contribution.elementaryquantumgate.RZ;
import quantum.operation.contribution.elementaryquantumgate.Swap;
import quantum.operation.contribution.loops.GeneralLoop;
import quantum.operation.contribution.loops.Power2Loop;
import quantum.operation.contribution.loops.StaticLoop;
import qucircuit.LoopOperation;
import qucircuit.Operation;
import qucircuit.QuantumCircuit;
import qucircuit.QuantumOperation;

public class LoopGeneration implements QiskitLoopOperation {
	
	@Override
	public String generateCode(QuantumCircuit qucircuit, LoopOperation loopOperation) {
		StringBuilder quantumOperation = new StringBuilder();
		
		var quCircuitMetadata = new QuantumCircuitMetadata(qucircuit);
		quCircuitMetadata.generateMetadata();
		
		//Loop target Qubits
		quantumOperation.append("loop_tqubits = " + QiskitCodeGenerationUtils.indexesQuantumRegister(loopOperation.getLoopTargetQubits(), quCircuitMetadata.getQuantumRegisterIndexes())).append("\n");
		if (loopOperation.getLoopControlQubits().isEmpty()){
			quantumOperation.append("loop_cqubits = None").append("\n");
		} else { 
			quantumOperation.append("loop_cqubits = " + QiskitCodeGenerationUtils.indexesQuantumRegister(loopOperation.getLoopControlQubits(), quCircuitMetadata.getQuantumRegisterIndexes())).append("\n");
		}
		
		if (loopOperation.getControlQubits().isEmpty()){
			quantumOperation.append("overall_control_qubits = None").append("\n");
		} else {			
			quantumOperation.append("overall_control_qubits = " + QiskitCodeGenerationUtils.indexesQuantumRegister(loopOperation.getControlQubits(), quCircuitMetadata.getQuantumRegisterIndexes())).append("\n"); 
		}

		
		// Options for All loops
		var target_and_control_qubits = "target_qubits=loop_tqubits, control_qubits=loop_cqubits";
		var inverseOption = "inverse=" + (loopOperation.getInverseForm() ? "True" : "False");

		// For Power2Loop & GeneralLoop
		var gateName = mapOperationToPython(qucircuit, loopOperation.getOperations().get(0));
		
		var increment_cOption = "increment_c=True";
		if (loopOperation.getIncrementBlockControlQubits() != null) {
			increment_cOption = "increment_c=" + (loopOperation.getIncrementControlQubits() ? "True" : "False");
		}
		
		var increment_tOption = "increment_t=True";
		if (loopOperation.getIncrementBlockControlQubits() != null) {
			increment_tOption = "increment_t=" + (loopOperation.getIncrementTargetQubits() ? "True" : "False");
		}
		
		// TODO: Note, only StaticLoop gets several gates (operations)
		// TODO: allow all operations on all loops! (forward correct type)
		
		// Power2Loop
		if (loopOperation.getLoop().getName().equals(Power2Loop.class.getSimpleName())) {
			// determine gate name, gate args and gate kwargs
						
			quantumOperation.append(qucircuit.getName() + ".append(") // start append
							.append("l_gate.Power_2_loop(")
							.append("gate=" + gateName + ", ")
							// INFO: We are not using Args here...
							.append("gate_args=[], ")
							.append("gate_kwargs=" + mapOperationToKwAargsDict(qucircuit, loopOperation.getOperations().get(0)) + ",")
							.append(target_and_control_qubits + ", ")
							.append(increment_cOption + ", ")
							.append(increment_tOption + ", ")
							.append("overall_control_qubits=overall_control_qubits, ")
							.append(inverseOption)
							.append("), target_qubits)").append("\n"); // end append
		}
		
		// General Loop
		else if (loopOperation.getLoop().getName().equals(GeneralLoop.class.getSimpleName())) {
			
			var f_tqubitsOption = "f_tqubits=None";
			if (!loopOperation.getFixedTargetQubits().isEmpty()){			
				f_tqubitsOption = "f_tqubits=" + QiskitCodeGenerationUtils.indexesQuantumRegister(loopOperation.getFixedTargetQubits(), quCircuitMetadata.getQuantumRegisterIndexes()); 
			}
			
			var f_cqubitsOption = "f_cqubits=None";
			if (!loopOperation.getFixedTargetQubits().isEmpty()){			
				f_cqubitsOption = "f_cqubits=" + QiskitCodeGenerationUtils.indexesQuantumRegister(loopOperation.getFixedControlQubits(), quCircuitMetadata.getQuantumRegisterIndexes());
			}
			
			
			var iter_type_tOption = "iter_type_t=";
			switch(loopOperation.getTargetQubitsIterationType()) {
			case CHANGE_BLOCK:
				iter_type_tOption += "'change_block'";
				break;
			case NONE:
				iter_type_tOption += "None";
				break;
			case SHIFT:
				iter_type_tOption += "'shift'";
				break;
			default:
				break;
			}
			
			var iter_type_cOption = "iter_type_c=";
			switch(loopOperation.getControlQubitsIterationType()) {
			case CHANGE_BLOCK:
				iter_type_cOption += "'change_block'";
				break;
			case NONE:
				iter_type_cOption += "None";
				break;
			case SHIFT:
				iter_type_cOption += "'shift'";
				break;
			default:
				break;
			}
			
			var incr_block_tq = "incr_block_tq=True";
			if (loopOperation.getIncrementBlockTargetQubits() != null) {
				incr_block_tq = "incr_block_tq=" + (loopOperation.getIncrementBlockTargetQubits() ? "True" : "False");
			}
			var incr_block_cq = "incr_block_cq=True";
			if (loopOperation.getIncrementBlockControlQubits() != null) {
				incr_block_cq = "incr_block_cq=" + (loopOperation.getIncrementBlockControlQubits() ? "True" : "False");
			}
			
			var block_size_tq = "block_size_tq=1";
			if (loopOperation.getTargetQubitsBlockSize() != null) {
				block_size_tq = "block_size_tq=" + loopOperation.getTargetQubitsBlockSize();
			}
			
			var block_size_cq = "block_size_cq=1";
			if (loopOperation.getControlQubitsBlockSize() != null) {
				block_size_cq = "block_size_cq=" + loopOperation.getControlQubitsBlockSize();
			}
			
			var incr_by = "incr_by=1";
			if (loopOperation.getIncrementBy() != null) {
				incr_by = "incr_by=" + loopOperation.getIncrementBy();
			}
			
			var p_Iterations = "p=None";
			if(loopOperation.getIterations() > 0) {
				p_Iterations = "p=" + loopOperation.getIterations();
			}
			
			quantumOperation.append(qucircuit.getName() + ".append(") // start append
					.append("l_gate.general_loop(")
					.append("gate=" + gateName + ", ")
					.append("gate_args=[], ")
					.append("gate_kwargs=" + mapOperationToKwAargsDict(qucircuit, loopOperation.getOperations().get(0)) + ",")
					.append(target_and_control_qubits + ", ")
					.append(f_tqubitsOption + ", ")
					.append(f_cqubitsOption + ", ")
					.append(iter_type_tOption + ", ")
					.append(iter_type_cOption + ", ")
					.append(increment_cOption + ", ")
					.append(increment_tOption + ", ")
					.append(p_Iterations + ", ")
					.append(block_size_tq+", ")
					.append(block_size_cq+", ")
					.append(incr_block_tq + ", ")
					.append(incr_block_cq + ", ")
					.append("overall_control_qubits=overall_control_qubits, ")
					.append(inverseOption + ", ")
					.append(incr_by)
					.append("), target_qubits)").append("\n"); // end append
//			
//			quantumOperation.append("loopGate=l_gate.general_loop(");
//			if (loopOperation.getOperations().get(0).getOperation().getName().equals(Swap.class.getSimpleName()))
//				quantumOperation.append("e_gate.swap, loop_tqubits, loop_cqubits, iter_type_t=\"shift\", iter_type_c=\"shift\", block_size_tq=1, block_size_cq=1, increment_t=False, increment_c=True) #definition of LoopOperation").append("\n");
//			else if (loopOperation.getOperations().get(0).getOperation().getName().equals(QFTElement.class.getSimpleName()))
//				quantumOperation.append("c_gate.qft_elements, qft_loop_tqubits,iter_type_t=\"change_block\", block_size_tq=1)").append("\n");
//			
//			quantumOperation.append(qucircuit.getName() + ".append(loopGate, target_qubits) #append LoopOperation to Circuit").append("\n");
		}
		
		// Static Loop
		else if (loopOperation.getLoop().getName().equals(StaticLoop.class.getSimpleName())) {
			var gates = loopOperation.getOperations().stream()
					.map(ope -> 
						"(" + mapOperationToPython(qucircuit, ope) + ", " + "[], " + mapOperationToKwAargsDict(qucircuit, ope)  + ")"
					)
					.collect(Collectors.joining(", "));
			
			gates = "[" + gates + "]";
			
			quantumOperation.append(qucircuit.getName() + ".append(") // start append
					.append("l_gate.simple_loop(")
					.append(loopOperation.getIterations() + ", ")
					.append("gates=" + gates + ", ")
					.append(target_and_control_qubits + ", ")
					.append("overall_control_qubits=overall_control_qubits, ")
					.append(inverseOption)
					.append("), target_qubits)").append("\n"); // end append
			
//			
//			quantumOperation.append("sl_gate=l_gate.simple_loop(" + loopOperation.getIterations()+ ", [");
//			
//			var operations = new ArrayList<String>();
//			for(var ope : loopOperation.getOperations()) {
//				var opName = ope.getOperation().getName();
//				if(opName.equals(CostUnitary.class.getSimpleName())) {
//					operations.add("c_gate.cost_unitary(" + new MatrixGeneration().generateCode(qucircuit, ope.getQubo().getMatrix()) + ")");
//				} else if (opName.equals(MixerUnitaryQAOA.class.getSimpleName())) {
//					operations.add("c_gate.mixer_unitary("+qucircuit.getName()+".num_qubits)");
//				}
//			}
//			quantumOperation.append(String.join(", ", operations)); // add comma-separated list to operation
////			quantumOperation.append("c_gate.cost_unitary_fixed(), c_gate.mixer_unitary("+qucircuit.getName()+".num_qubits)");
//			quantumOperation.append("], loopTargetQubits)" )
//							.append("\n");
//			quantumOperation.append(qucircuit.getName() + ".append(sl_gate,target_qubits)").append("\n");						
		}
		return quantumOperation.toString();
	}
	
	public static String mapOperationToKwAargsDict(QuantumCircuit qucircuit, Operation ope) {
		var opName = ope.getOperation().getName();
		
		// Elementary gates
		
		// TODO: cannot specify beta inside a loop yet
		if (opName.equals(RX.class.getSimpleName()) || 
			opName.equals(RY.class.getSimpleName()) ||
			opName.equals(RZ.class.getSimpleName())) {
			return "dict(size=len(loop_tqubits))";
		} 
		
		// TODO: cannot specify theta inside a loop yet
		if (opName.equals(P.class.getSimpleName())) {
			return "dict(size=len(loop_tqubits))";
		} 
		
		// TODO: All these require size(target_qubits) but we cannot specify them in the grammar yet
		if (opName.equals(Hadamard.class.getSimpleName()) ||
			opName.equals(PauliX.class.getSimpleName()) ||
			opName.equals(PauliY.class.getSimpleName()) ||
			opName.equals(PauliZ.class.getSimpleName())) {
			return "dict(size=len(loop_tqubits))";
		}
		
		if(opName.equals(Grover.class.getSimpleName())) {
			return "dict(qubits=len(loop_tqubits))";
		}
			
		if (opName.equals(MixerUnitaryQAOA.class.getSimpleName())) {
			return "dict(size=" + qucircuit.getName() + ".num_qubits)";
		}
		
		if (opName.equals(CostUnitary.class.getSimpleName())) {
			return "dict(w=" + new MatrixGeneration().generateCode(qucircuit, ope.getQubo().getMatrix()) + ")";
		}
		return "{}";
	}
	
	public static String mapOperationToPython(QuantumCircuit qucircuit, Operation ope) {
		var opName = ope.getOperation().getName();
		
		// Elementary gates
		if (opName.equals(RX.class.getSimpleName())) {
			return "e_gate.rx_gate";
		} else if (opName.equals(RY.class.getSimpleName())) {
			return "e_gate.ry_gate";
		} else if (opName.equals(RZ.class.getSimpleName())) {
			return "e_gate.rz_gate";
		} else if (opName.equals(Hadamard.class.getSimpleName())) {
			return "e_gate.hadamard";
		} else if (opName.equals(PauliX.class.getSimpleName())) {
			return "e_gate.x_gate";
		} else if (opName.equals(PauliY.class.getSimpleName())) {
			return "e_gate.y_gate";
		} else if (opName.equals(PauliZ.class.getSimpleName())) {
			return "e_gate.z_gate";
		} else if (opName.equals(Swap.class.getSimpleName())) {
			return "e_gate.swap";
		} else  if (opName.equals(P.class.getSimpleName())) {
			return "e_gate.p_gate";
		}
		
		// Composite gates
		if (opName.equals(QFT.class.getSimpleName())) {
			return "c_gate.qft";
		} else if (opName.equals(CostUnitary.class.getSimpleName())) {
			return "c_gate.cost_unitary";
		} else if (opName.equals(MixerUnitaryQAOA.class.getSimpleName())) {
			return "c_gate.mixer_unitary";
		} else if (opName.equals(QFTElement.class.getSimpleName())) {
			return "c_gate.qft_elements";
		} else if (opName.equals(Grover.class.getSimpleName())) {
			return "c_gate.grover";
		}
		
		return "<<< UNSUPPORTED GATE IN LOOP>>>";
	}
	
}
