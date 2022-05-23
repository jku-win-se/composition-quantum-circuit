package at.jku.se.quantum.operation.contribution.elementaryquantumgate;

import at.jku.se.quantum.operation.contribution.utils.ContributionUtils;
import at.jku.se.quantum.operation.definition.api.AbstractExtendElementaryQuantumGate;

public class PauliZ extends AbstractExtendElementaryQuantumGate {

	public static final String PALETTE_ICON = "multicontrolledz-gate.png";//TODO only Z..
	
	@Override
	public String getAbbreviation() {
		return "Z";
	}

	@Override
	public String getPaletteIconPath() {
		return ContributionUtils.getIconURI(PALETTE_ICON).toString();
	}
}
