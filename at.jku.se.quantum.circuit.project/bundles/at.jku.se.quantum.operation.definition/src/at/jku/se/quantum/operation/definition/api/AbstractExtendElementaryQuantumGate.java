package at.jku.se.quantum.operation.definition.api;

import org.eclipse.emf.ecore.EClass;

import at.jku.se.quantum.operation.library.mm.quope.Parameter;
import qucircuit.QuCircuitPackage;

public abstract class AbstractExtendElementaryQuantumGate extends LibraryQuantumGate {
	
	protected boolean hasParameters() {
		return false;
	}
	
	protected Parameter getParameterConfiguration() {
		return null;
	}
	
	@Override
	public EClass getAbstractQuantumGate() {
		return QuCircuitPackage.eINSTANCE.getElementaryQuantumGate();
	}	
}
