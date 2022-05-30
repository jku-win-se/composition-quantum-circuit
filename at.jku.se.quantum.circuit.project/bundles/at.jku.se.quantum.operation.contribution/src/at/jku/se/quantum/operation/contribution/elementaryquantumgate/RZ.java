package at.jku.se.quantum.operation.contribution.elementaryquantumgate;

import at.jku.se.quantum.operation.contribution.utils.QuantumOperationContributionUtils;
import at.jku.se.quantum.operation.definition.api.AbstractExtendElementaryQuantumGate;

public class RZ extends AbstractExtendElementaryQuantumGate {
	
	public static final String PALETTE_ICON = "rz-gate.png";
	
	@Override
	public String getAbbreviation() {
		return "RZ";
	}
	
	@Override
	public String getPaletteIconPath() {
		return QuantumOperationContributionUtils.getIconURI(PALETTE_ICON).toString();
	}
}
