package quantum.circuit.qiskit.loop;

import java.util.ArrayList;

import quantum.circuit.qiskit.api.QiskitLoopOperation;
import quantum.circuit.qiskit.circuit.QuantumCircuitMetadata;
import quantum.circuit.qiskit.utils.QiskitCodeGenerationUtils;
import quantum.operation.contribution.compositequantumgate.QFTElement;
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
		quantumOperation.append("loop_tqubits=" + QiskitCodeGenerationUtils.indexesQuantumRegister(loopOperation.getLoopTargetQubits(), quCircuitMetadata.getQuantumRegisterIndexes())).append("\n");
		if (!loopOperation.getLoopControlQubits().isEmpty())
			quantumOperation.append("loop_cqubits=" + QiskitCodeGenerationUtils.indexesQuantumRegister(loopOperation.getLoopControlQubits(), quCircuitMetadata.getQuantumRegisterIndexes())).append("\n");
		if (loopOperation.getLoop().getName().equals(Power2Loop.class.getSimpleName())) {
			quantumOperation.append(qucircuit.getName() + ".append(l_gate.Power_2_loop(c_gate.grover4,loop_target_qubits,loop_control_qubits, increment_t=True), target_qubits)").append("\n");
		}
		else if (loopOperation.getLoop().getName().equals(GeneralLoop.class.getSimpleName())) {
			quantumOperation.append("loopGate=l_gate.general_loop(");
			if (loopOperation.getOperations().get(0).getOperation().getName().equals(Swap.class.getSimpleName()))
				quantumOperation.append("e_gate.swap, loop_tqubits, loop_cqubits, iter_type_t=\"shift\", iter_type_c=\"shift\", block_size_tq=1, block_size_cq=1, increment_t=False, increment_c=True) #definition of LoopOperation").append("\n");
			else if (loopOperation.getOperations().get(0).getOperation().getName().equals(QFTElement.class.getSimpleName()))
				quantumOperation.append("c_gate.qft_elements, qft_loop_tqubits,iter_type_t=\"change_block\", block_size_tq=1)").append("\n");
			
			quantumOperation.append(qucircuit.getName() + ".append(loopGate, target_qubits) #append LoopOperation to Circuit").append("\n");
		}
		else if (loopOperation.getLoop().getName().equals(StaticLoop.class.getSimpleName())) {
			quantumOperation.append("sl_gate=l_gate.simple_loop(" + loopOperation.getIterations()+ ", [");
			
			var operations = new ArrayList<String>();
			for(var ope : loopOperation.getOperations()) {
				if(ope.getOperation().getName().equals("CostUnitary")) {
					var matrixStringBuilder = new StringBuilder();
					matrixStringBuilder.append("c_gate.cost_unitary([");
					for(var row : ope.getQubo().getMatrix().getRows()) {
						matrixStringBuilder.append("[");
						for (var col : row.getColumns()) {
							matrixStringBuilder.append(col.getValue()).append(", ");
						}
						matrixStringBuilder.append("], ");
					}
					matrixStringBuilder.append("]");
					operations.add(matrixStringBuilder.toString());
				} else if (ope.getOperation().getName().equals("MixerUnitaryQAOA")) {
					operations.add("c_gate.mixer_unitary("+qucircuit.getName()+".num_qubits)");
				}
			}
			quantumOperation.append(String.join(",", operations)); // add comma-separated list to operation
//			quantumOperation.append("c_gate.cost_unitary_fixed(), c_gate.mixer_unitary("+qucircuit.getName()+".num_qubits)");
			quantumOperation.append("], loopTargetQubits)" )
							.append("\n");
			quantumOperation.append(qucircuit.getName() + ".append(sl_gate,target_qubits)").append("\n");						
		}
		return quantumOperation.toString();
	}
	
}
