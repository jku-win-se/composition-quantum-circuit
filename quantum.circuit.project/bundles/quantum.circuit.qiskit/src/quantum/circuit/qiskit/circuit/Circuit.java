package quantum.circuit.qiskit.circuit;

import org.eclipse.emf.common.util.EList;

import quantum.circuit.qiskit.api.QiskitCircuit;
import quantum.operation.contribution.compositequantumgate.QFTElement;
import quantum.operation.contribution.elementaryquantumgate.Swap;
import quantum.operation.contribution.loops.GeneralLoop;
import quantum.operation.contribution.loops.Power2Loop;
import quantum.operation.contribution.loops.StaticLoop;
import qucircuit.ClassicRegister;
import qucircuit.ElementaryQuantumGate;
import qucircuit.Index;
import qucircuit.IndexInt;
import qucircuit.IndexRange;
import qucircuit.Layer;
import qucircuit.LoopOperation;
import qucircuit.Measurement;
import qucircuit.Operation;
import qucircuit.QuantumCircuit;
import qucircuit.QuantumOperation;
import qucircuit.QuantumRegister;
import quope.ConcreteQuantumOperation;

public class Circuit implements QiskitCircuit {

	@Override
	public String generateCircuitFile(QuantumCircuit qucircuit) {
		var quantumCircuitDef = new StringBuilder().append(qucircuit.getName() + " = QuantumCircuit(");		
		var quantumRegisters = new StringBuilder();
		for (QuantumRegister qr : qucircuit.getQuantumRegisters()) {
			quantumRegisters
				.append(qr.getName())
				.append("=QuantumRegister(" + qr.getNumberOfQubits() + ")")
				.append("\n");
			quantumCircuitDef.append(qr.getName() + ",");
		}
		
		var classicRegisters = new StringBuilder();
		for (ClassicRegister cr : qucircuit.getClassicRegisters()) {
			classicRegisters
				.append(cr.getName())
				.append("=QuantumRegister(" + cr.getNumberOfBits() + ")")
				.append("\n");
			quantumCircuitDef.append(cr.getName() + ",");
		}	
		//Delete the last comma
		quantumCircuitDef.deleteCharAt(quantumCircuitDef.length() - 1);
		quantumCircuitDef. append(")");
		
		//TODO refactor to only include the necessary libraries
		var objectQuantumOperations = 
				"""
				#Create objects for quantum operations
				e_gate=Elementary_Gates.ElementaryGate()
				c_gate=Composite_Gates.CompositeGate()
				l_gate=Loop_Operations.LoopOperation()
				m_gate=Measurements.MeasurementGate()
				""";
		
		var quantumOperation = new StringBuilder();
		
		for (Layer l : qucircuit.getLayers()) {
			for (QuantumOperation quOpe : l.getQuantumOperations()) {
				//Target Qubits
				quantumOperation.append("target_qubits=" + indexes(quOpe.getTargetQubits())).append("\n");
				//Append Operation
				if (quOpe instanceof ElementaryQuantumGate elementaryGate) {//TODO ask hadamard
					quantumOperation.append(qucircuit.getName() + ".append(e_gate.hadamard(target_qubits), target_qubits)").append("\n");
				}
				else if (quOpe instanceof Measurement measurement) {
					quantumOperation.append("cbits=" + indexes(measurement.getClassicBits())).append("\n");
					quantumOperation.append(qucircuit.getName() + ".append(m_gate.measurement(target_qubits,cbits), target_qubits, cbits)").append("\n");
				}
				else if (quOpe instanceof LoopOperation loopOperation) {
					//Loop target Qubits
					quantumOperation.append("loop_tqubits=" + indexes(loopOperation.getLoopTargetQubits())).append("\n");
					if (!loopOperation.getLoopControlQubits().isEmpty())
						quantumOperation.append("loop_cqubits=" + indexes(loopOperation.getLoopControlQubits())).append("\n");
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
						quantumOperation.append("sl_gate=l_gate.simple_loop(" + loopOperation.getIterations() + ", [c_gate.cost_unitary_fixed(), c_gate.mixer_unitary(qc.num_qubits)],loopTargetQubits)" ).append("\n");
						quantumOperation.append("qc.append(sl_gate,target_qubits)").append("\n");						
					}
				}
			}		
			
		}
		
		
		return """
				from qiskit import QuantumCircuit, ClassicalRegister, QuantumRegister
				from qiskit.circuit import Gate
				import numpy as np
				#Import Library 			
				import Composite_Gates
				import Loop_Operations
				import Measurements
				import Elementary_Gates
				#Create empty Quantum Circuit				
				""" 
				+ quantumRegisters.toString()
				+ classicRegisters.toString()
				+ quantumCircuitDef.toString()
				+ objectQuantumOperations
				+ quantumOperation.toString()
				;
	}

	private String indexes(EList<Index> indexes) {
		var rangeOfValues = new StringBuilder().append("[");
		for (Index index : indexes) {
			if (index instanceof IndexInt indexObject) {
				rangeOfValues.append(indexObject.getIndex()).append(",");
			}
			else if (index instanceof IndexRange indexRangeObject) {
				for (int i = indexRangeObject.getBegin(); i <= indexRangeObject.getEnd(); i++) {
					rangeOfValues.append(i).append(",");				
				}
			}
		}
		//Delete the last comma
		rangeOfValues.deleteCharAt(rangeOfValues.length() - 1);
		return rangeOfValues.append("]").toString();
	}
	
	

}
