package at.jku.se.quantum.operation.contribution.elementaryquantumgate;

import at.jku.se.quantum.operation.contribution.utils.ContributionUtils;
import at.jku.se.quantum.operation.definition.api.AbstractExtendElementaryQuantumGate;

public class Hadamard extends AbstractExtendElementaryQuantumGate {
	
	public static final String PALETTE_ICON = "hadamard-gate.png";
	
	@Override
	public String getAbbreviation() {
		return "H";
	}

	@Override
	public String getPaletteIconPath() {
		return ContributionUtils.getIconURI(PALETTE_ICON).toString();
	}	
}
