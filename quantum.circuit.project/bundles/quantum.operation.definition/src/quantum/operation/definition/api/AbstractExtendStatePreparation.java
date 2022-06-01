package quantum.operation.definition.api;

import org.eclipse.emf.ecore.EClass;

import qucircuit.QuCircuitPackage;

public abstract class AbstractExtendStatePreparation implements IGeneralOperationType {
	
	@Override
	public EClass getAbstractQuantumGate() {
		return QuCircuitPackage.eINSTANCE.getStatePreparation();
	}
}
