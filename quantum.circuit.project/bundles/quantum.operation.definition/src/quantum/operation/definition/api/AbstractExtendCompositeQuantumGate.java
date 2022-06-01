package quantum.operation.definition.api;

import java.util.Collection;

import org.eclipse.emf.ecore.EClass;

import qucircuit.CompositeQuantumGate;
import qucircuit.QuCircuitPackage;
import qucircuit.QuantumOperation;
import qucircuit.Qubit;

public abstract class AbstractExtendCompositeQuantumGate extends LibraryQuantumGate {
	
	public abstract CompositeQuantumGate getCustomBlock(Collection<Qubit> qubits, QuantumOperation quOperation);
	
	protected boolean reversible() {
		return true;
	}
	
	@Override
	public EClass getAbstractQuantumGate() {
		return QuCircuitPackage.eINSTANCE.getCompositeQuantumGate();
	}
}
