package at.jku.se.qubo.lang.utils;

import at.jku.se.qubo.mm.qubo.Qubo;
import qucircuit.QuCircuitFactory;
import qucircuit.QuantumCircuit;

public class QuboUtils {
	
	public static QuantumCircuit createQuboCircuit(Qubo qubo) {
		//TODO @Felix this is the method to create the quantum circuit
		QuantumCircuit quCircuit = QuCircuitFactory.eINSTANCE.createQuantumCircuit();
		quCircuit.setName("Generate Qubo Circuit");
		return quCircuit;		
	}

}
