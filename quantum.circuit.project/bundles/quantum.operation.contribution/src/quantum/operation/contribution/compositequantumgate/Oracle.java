package quantum.operation.contribution.compositequantumgate;

import java.util.Collection;

import quope.FixedQuantumOperation;
import quope.impl.QuopeFactoryImpl;
import quantum.operation.contribution.utils.QuantumOperationContributionUtils;
import quantum.operation.definition.api.AbstractExtendCompositeQuantumGate;
import qucircuit.CompositeQuantumGate;
import qucircuit.Index;
import qucircuit.QuantumOperation;

public class Oracle extends AbstractExtendCompositeQuantumGate {
	
	public static final String PALETTE_ICON = "oracle-block-gate.png";
	
	public Oracle() {
		// Do nothing
	}
	
	@Override
	public String getAbbreviation() {
		return "Oracle";
	}	

	@Override
	public String getPaletteIconPath() {
		return QuantumOperationContributionUtils.getIconURI(PALETTE_ICON).toString();
	}
		
	@Override
	public FixedQuantumOperation getFixedQuantumOperators() {
		FixedQuantumOperation fixedOperation = QuopeFactoryImpl.eINSTANCE.createFixedQuantumOperation();
		fixedOperation.setNumberOfControlQubits(0);
		fixedOperation.setNumberOfTargetQubits(3);
		return fixedOperation;
	}

	@Override
	public CompositeQuantumGate getCustomBlock(Collection<Index> qubits, QuantumOperation quOperation) {
		// TODO Auto-generated method stub
		return null;
	}

}
