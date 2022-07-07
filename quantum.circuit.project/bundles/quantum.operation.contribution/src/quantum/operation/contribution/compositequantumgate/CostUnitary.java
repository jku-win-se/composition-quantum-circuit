package quantum.operation.contribution.compositequantumgate;

import java.util.Collection;

import quantum.operation.definition.api.AbstractExtendCompositeQuantumGate;
import qubo.Qubo;
import qucircuit.CompositeQuantumGate;
import qucircuit.Index;
import qucircuit.QuantumOperation;

public class CostUnitary extends AbstractExtendCompositeQuantumGate {

	public CostUnitary() {
		// Do nothing
	}
	
	public boolean qiskitCode() {
		return false;
	}
	
	@Override
	public CompositeQuantumGate getCustomBlock(Collection<Index> qubits, QuantumOperation quOperation) {
		// TODO Auto-generated method stub
		
		return null;
	}
	
}
