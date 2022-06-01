package qubo.lang.utils;

import java.util.Random;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import at.jku.se.quantum.operation.contribution.utils.QuantumOperationContributionUtils;
import at.jku.se.quantum.operation.library.mm.quope.QuantumOperationLibrary;
import qucircuit.Layer;
import qucircuit.QuCircuitFactory;
import qucircuit.QuantumCircuit;
import qucircuit.QuantumRegister;
import qucircuit.Qubit;
import qubo.Qubo;

public class QuboUtils {
	
	public static QuantumCircuit createQuboCircuit(Qubo qubo, QuantumOperationLibrary quantumOpLib) {
		final var rz = QuantumOperationContributionUtils.getRZOperation(quantumOpLib);
		final var cnot = QuantumOperationContributionUtils.getCNOTOperation(quantumOpLib);	
		//Number of Qubits
		final int numberOfQubits = qubo.getMatrix().getRows().size();
		//Gamma value
		final double gamma = Math.PI * new Random().nextDouble();
		//Create the Circuit		
		final QuantumCircuit quCircuit = QuCircuitFactory.eINSTANCE.createQuantumCircuit();
		quCircuit.setName("Generated Qubo Circuit");
		final QuantumRegister quRegister = QuCircuitFactory.eINSTANCE.createQuantumRegister();
		final EList<Qubit> quBits = new BasicEList<Qubit>(numberOfQubits);
		for (int i = 0; i < numberOfQubits; i++) {
			quBits.add(QuCircuitFactory.eINSTANCE.createQubit());			
		}		
		quRegister.getQubits().addAll(quBits);
		quCircuit.getQuantumRegisters().add(quRegister);	
		//Diagonal Rz
		final Layer diagonalRzLayer = QuCircuitFactory.eINSTANCE.createLayer();		
		for (int i = 0; i < numberOfQubits; i++) {
			var quOpeDiagonalRz = QuCircuitFactory.eINSTANCE.createElementaryQuantumGate();
			quOpeDiagonalRz.setOperation(rz);
			//Set angle
			var parameter =  QuCircuitFactory.eINSTANCE.createAngleParameter();
			parameter.setTheta(2*gamma*qubo.getMatrix().getRows().get(i).getColumns().get(0).getValue());
			//Set Parameter
			quOpeDiagonalRz.setAngleParameter(parameter);
			//Set Qubit
			quOpeDiagonalRz.getTargetQubits().add(quBits.get(i));
			//add to Diagonal Layer
			diagonalRzLayer.getQuantumOperations().add(quOpeDiagonalRz);
			for (int j = 1; j < qubo.getMatrix().getRows().get(i).getColumns().size(); j++) {
				final Layer cnotLayer = QuCircuitFactory.eINSTANCE.createLayer();
				var quOpeCNotBegin = QuCircuitFactory.eINSTANCE.createElementaryQuantumGate();
				quOpeCNotBegin.setOperation(cnot);
				quOpeCNotBegin.getTargetQubits().add(quBits.get(j));
				quOpeCNotBegin.getControlQubits().add(quBits.get(i));
				cnotLayer.getQuantumOperations().add(quOpeCNotBegin);
				quCircuit.getLayers().add(cnotLayer);
				final Layer rzLayer = QuCircuitFactory.eINSTANCE.createLayer();
				var quOpeRz = QuCircuitFactory.eINSTANCE.createElementaryQuantumGate();
				quOpeRz.setOperation(rz);
				quOpeRz.getTargetQubits().add(quBits.get(j));
				//Set angle
				var parameterRZ =  QuCircuitFactory.eINSTANCE.createAngleParameter();
				parameterRZ.setTheta(2*gamma*qubo.getMatrix().getRows().get(i).getColumns().get(j).getValue());
				//Set Parameter
				quOpeRz.setAngleParameter(parameterRZ);
				rzLayer.getQuantumOperations().add(quOpeRz);
				quCircuit.getLayers().add(rzLayer);
				quCircuit.getLayers().add(EcoreUtil.copy(cnotLayer));
			}			
		}
		quCircuit.getLayers().add(diagonalRzLayer);
		return quCircuit;		
	}
}
