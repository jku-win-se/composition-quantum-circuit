package at.jku.se.quantum.operation.contribution.compositequantumgate;

import java.util.Collection;

import at.jku.se.quantum.operation.contribution.utils.QuantumOperationContributionUtils;
import at.jku.se.quantum.operation.definition.api.AbstractExtendCompositeQuantumGate;
import qucircuit.CompositeQuantumGate;
import qucircuit.QuantumOperation;
import qucircuit.Qubit;

public class Amplification extends AbstractExtendCompositeQuantumGate {
	
	public static final String PALETTE_ICON = "amplification-block-gate.png";
	
	public Amplification() {
		// Do nothing
	}
	
	@Override
	public String getAbbreviation() {
		return "Amplification";
	}

	@Override
	public CompositeQuantumGate getCustomBlock(Collection<Qubit> qubits, QuantumOperation quOperation) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String getPaletteIconPath() {
		return QuantumOperationContributionUtils.getIconURI(PALETTE_ICON).toString();
	}

}
