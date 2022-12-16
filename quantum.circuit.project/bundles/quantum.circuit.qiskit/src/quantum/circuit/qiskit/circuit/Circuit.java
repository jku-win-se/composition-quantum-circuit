package quantum.circuit.qiskit.circuit;

import quantum.circuit.qiskit.api.QiskitCircuit;
import quantum.circuit.qiskit.elementary.gate.ElementaryGateGeneration;
import quantum.circuit.qiskit.library.GenerateLibrary;
import quantum.circuit.qiskit.loop.LoopGeneration;
import quantum.circuit.qiskit.measurement.MeasurementGeneration;
import quantum.circuit.qiskit.utils.QiskitCodeGenerationUtils;
import qucircuit.ClassicRegister;
import qucircuit.CompositeQuantumGate;
import qucircuit.ElementaryQuantumGate;
import qucircuit.Layer;
import qucircuit.LoopOperation;
import qucircuit.Measurement;
import qucircuit.QuantumCircuit;
import qucircuit.QuantumOperation;
import qucircuit.QuantumRegister;

public class Circuit implements QiskitCircuit {

	@Override
	public String generateCode(QuantumCircuit quCircuit, QuantumCircuitMetadata quCircuitMetadata) {
		var quantumCircuitDef = new StringBuilder().append(quCircuit.getName() + " = QuantumCircuit(");		
		var quantumRegisters = new StringBuilder();
		for (QuantumRegister qr : quCircuit.getQuantumRegisters()) {
			quantumRegisters
				.append(qr.getName())
				.append("=QuantumRegister(" + qr.getNumberOfQubits() + ")")
				.append("\n");
			quantumCircuitDef.append(qr.getName() + ",");
		}
		
		var classicRegisters = new StringBuilder();
		for (ClassicRegister cr : quCircuit.getClassicRegisters()) {
			classicRegisters
				.append(cr.getName())
				.append("=ClassicalRegister(" + cr.getNumberOfBits() + ")")
				.append("\n");
			quantumCircuitDef.append(cr.getName() + ",");
		}	
		//Delete the last comma
		quantumCircuitDef.deleteCharAt(quantumCircuitDef.length() - 1);
		quantumCircuitDef. append(")");
		
		//Include the necessary libraries
		var objectQuantumOperations = new GenerateLibrary().generateCode(quCircuit,quCircuitMetadata); 
		var quantumOperation = new StringBuilder();
		
		for (Layer l : quCircuit.getLayers()) {
			// Place Layer name to make debugging easier
			quantumOperation.append("\n")
							.append("# Layer " + l.getName())
							.append("\n");
			
			for (QuantumOperation quOpe : l.getQuantumOperations()) {
				//Append Operation
				
				// every QuantumOperation has target_qubits!
				var target_qubits = QiskitCodeGenerationUtils.indexesQuantumRegister(quOpe.getTargetQubits(), quCircuitMetadata.getQuantumRegisterIndexes());
				quantumOperation.append("target_qubits = " + target_qubits)
								.append("\n");
				
				if (quOpe instanceof ElementaryQuantumGate elementaryGate) {
					quantumOperation.append(new ElementaryGateGeneration().generateCode(quCircuit, elementaryGate));
				}
				else if (quOpe instanceof Measurement measurement) {
					quantumOperation.append(new MeasurementGeneration().generateCode(quCircuit, measurement));
				}
				else if (quOpe instanceof LoopOperation loopOperation) {
					quantumOperation.append(new LoopGeneration().generateCode(quCircuit, loopOperation));
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

	
	
	

}
