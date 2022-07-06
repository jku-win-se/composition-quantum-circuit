package quantum.operation.contribution.compositequantumgate;

import java.util.Collection;

import quantum.operation.contribution.utils.QuantumOperationContributionUtils;
import quantum.operation.definition.api.AbstractExtendCompositeQuantumGate;
import qucircuit.CompositeQuantumGate;
import qucircuit.Index;
import qucircuit.QuantumOperation;

public class Grover extends AbstractExtendCompositeQuantumGate {

	public static final String PALETTE_ICON = "cgrover-block-gate.png";
	
	public Grover() {
		// Do nothing
	}
	
	@Override
	public String getPaletteIconPath() {
		return QuantumOperationContributionUtils.getIconURI(PALETTE_ICON).toString();
	}

	@Override
	public CompositeQuantumGate getCustomBlock(Collection<Index> qubits, QuantumOperation quOperation) {
		// TODO Auto-generated method stub
		return null;
	}

}
