package at.jku.se.quantum.operation.contribution.elementaryquantumgate;

import at.jku.se.quantum.operation.contribution.utils.QuantumOperationContributionUtils;
import at.jku.se.quantum.operation.definition.api.AbstractExtendElementaryQuantumGate;

public class PauliX extends AbstractExtendElementaryQuantumGate {

public static final String PALETTE_ICON = "x-gate.png";
	
	@Override
	public String getAbbreviation() {
		return "X";
	}
	
	@Override
	public String getPaletteIconPath() {
		return QuantumOperationContributionUtils.getIconURI(PALETTE_ICON).toString();
	}
}
