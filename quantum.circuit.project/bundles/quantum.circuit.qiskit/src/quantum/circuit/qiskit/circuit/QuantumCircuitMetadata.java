package quantum.circuit.qiskit.circuit;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import qucircuit.ClassicRegister;
import qucircuit.QuantumCircuit;
import qucircuit.QuantumRegister;
import qucircuit.Register;

public class QuantumCircuitMetadata {
	
	private final QuantumCircuit quCircuit;
	/*
	 * Get pre-defined the indexes to calculate the indexes of target qubits
	 * map is quantum register and the sum of the size of the predecessor registers
	 * */
	private Map<QuantumRegister,Integer> quantumRegisterIndexes;
	/*
	 * Get pre-defined the indexes to calculate the indexes of target bits 
	 * map is classic register and the sum of the size of the predecessor registers
	 * */
	private Map<ClassicRegister,Integer> classicRegisterIndexes;
	
	public QuantumCircuitMetadata(QuantumCircuit quCircuit) {
		this.quCircuit = quCircuit;
		this.quantumRegisterIndexes = new HashMap<>();
		this.classicRegisterIndexes = new HashMap<>();
	}
	
	public void generateMetadata() {
		this.quantumRegisterIndexes = generateQuantumRegisterIndexes(quCircuit.getQuantumRegisters());
		this.classicRegisterIndexes = generateClassicRegisterIndexes(quCircuit.getClassicRegisters());
	}

	private HashMap<QuantumRegister,Integer> generateQuantumRegisterIndexes(Collection<QuantumRegister> register) {
		var registerIndexes = new HashMap<QuantumRegister,Integer>(quCircuit.getQuantumRegisters().size());
		int size = 0;
		for (QuantumRegister quRegister : quCircuit.getQuantumRegisters()) {
			registerIndexes.put(quRegister, size);
			size += quRegister.getNumberOfQubits();
		}
		return registerIndexes;
	}
	
	private HashMap<ClassicRegister,Integer> generateClassicRegisterIndexes(Collection<ClassicRegister> register) {
		var registerIndexes = new HashMap<ClassicRegister,Integer>(quCircuit.getClassicRegisters().size());
		int size = 0;
		for (ClassicRegister quRegister : quCircuit.getClassicRegisters()) {
			registerIndexes.put(quRegister, size);
			size += quRegister.getNumberOfBits();
		}
		return registerIndexes;
	}
	
	public Map<QuantumRegister, Integer> getQuantumRegisterIndexes() {
		return quantumRegisterIndexes;
	}
	
	public Map<ClassicRegister, Integer> getClassicRegisterIndexes() {
		return classicRegisterIndexes;
	}
}
