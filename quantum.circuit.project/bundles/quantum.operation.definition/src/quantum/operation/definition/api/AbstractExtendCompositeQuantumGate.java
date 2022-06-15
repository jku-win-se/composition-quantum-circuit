package quantum.operation.definition.api;

import java.util.Collection;

import org.eclipse.emf.ecore.EClass;

import qucircuit.CompositeQuantumGate;
import qucircuit.Index;
import qucircuit.QucircuitPackage;
import qucircuit.QuantumOperation;

public abstract class AbstractExtendCompositeQuantumGate extends LibraryQuantumGate {
	
	public abstract CompositeQuantumGate getCustomBlock(Collection<Index> qubits, QuantumOperation quOperation);
	
	protected boolean reversible() {
		return true;
	}
	
	@Override
	public EClass getAbstractQuantumGate() {
		return QucircuitPackage.eINSTANCE.getCompositeQuantumGate();
	}
}
