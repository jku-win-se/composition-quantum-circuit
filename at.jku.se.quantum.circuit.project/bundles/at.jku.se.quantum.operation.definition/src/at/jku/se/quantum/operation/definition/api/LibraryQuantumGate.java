package at.jku.se.quantum.operation.definition.api;

import at.jku.se.quantum.operation.library.mm.quope.FixedQuantumOperation;
import at.jku.se.quantum.operation.library.mm.quope.Parameter;

public abstract class LibraryQuantumGate implements IGeneralOperationType {

	public FixedQuantumOperation getFixedQuantumOperators() {
		return null;
	}
	
	public Parameter getParameter() {
		return null;
	}
	
	@Override
	public String getPaletteIconPath() {
		return "";
	}

	@Override
	public String getStyleIconPath() {
		return "";
	}

	@Override
	public String getReverseConcreteQuantumOperation() {
		return "";
	}	
}
