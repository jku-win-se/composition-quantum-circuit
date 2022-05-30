package at.jku.se.quantum.operation.contribution.compositequantumgate;

import java.util.Collection;

import at.jku.se.quantum.operation.contribution.utils.QuantumOperationContributionUtils;
import at.jku.se.quantum.operation.definition.api.AbstractExtendCompositeQuantumGate;
import qucircuit.CompositeQuantumGate;

public class Grover extends AbstractExtendCompositeQuantumGate {

	public static final String PALETTE_ICON = "cgrover-block-gate.png";
	
	public Grover() {
		// Do nothing
	}
	
	@Override
	public String getAbbreviation() {
		return "Grover";
	}

	@Override
	public String getPaletteIconPath() {
		return QuantumOperationContributionUtils.getIconURI(PALETTE_ICON).toString();
	}

	@Override
	public CompositeQuantumGate getCustomBlock(Collection<qucircuit.Qubit> qubits,
			qucircuit.QuantumOperation quOperation) {
		// TODO Auto-generated method stub
		return null;
	}

}
