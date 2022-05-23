package at.jku.se.quantum.operation.definition.api;

import org.eclipse.emf.ecore.EClass;

import qucircuit.QuCircuitPackage;

public abstract class AbstractExtendMeasurement implements IGeneralOperationType {
	
	@Override
	public EClass getAbstractQuantumGate() {
		return QuCircuitPackage.eINSTANCE.getMeasurement();
	}
}
