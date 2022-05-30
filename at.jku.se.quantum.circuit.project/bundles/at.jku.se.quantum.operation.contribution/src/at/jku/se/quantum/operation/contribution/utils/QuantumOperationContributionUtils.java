package at.jku.se.quantum.operation.contribution.utils;

import org.eclipse.emf.common.util.URI;

import at.jku.se.quantum.operation.contribution.elementaryquantumgate.CNOT;
import at.jku.se.quantum.operation.contribution.elementaryquantumgate.Hadamard;
import at.jku.se.quantum.operation.contribution.elementaryquantumgate.RZ;
import at.jku.se.quantum.operation.definition.api.utils.QuantumOperationUtils;
import at.jku.se.quantum.operation.library.mm.quope.ConcreteQuantumOperation;
import at.jku.se.quantum.operation.library.mm.quope.QuantumOperationLibrary;

public class QuantumOperationContributionUtils {
	
	public static final String ICONS_FOLDER = "icons";
	
	public static String PLUGIN_NAME = "at.jku.se.quantum.operation.contribution";
	
	//Suppress default constructor for noninstantiability
	private QuantumOperationContributionUtils() {
		throw new AssertionError();
	}
	
	public static URI getIconURI(String iconFileName) {
		return URI.createPlatformPluginURI(PLUGIN_NAME + "/" + ICONS_FOLDER + "/" + iconFileName, false);
	}
	
	public static ConcreteQuantumOperation getHadamardOperation(QuantumOperationLibrary quantumOpLib) {
		return QuantumOperationUtils.getConcreteQuantumOperationByName(quantumOpLib.getOperations(), Hadamard.class.getSimpleName());
	}

	public static ConcreteQuantumOperation getCNOTOperation(QuantumOperationLibrary quantumOpLib) {
		return QuantumOperationUtils.getConcreteQuantumOperationByName(quantumOpLib.getOperations(), CNOT.class.getSimpleName());
	}
	
	public static ConcreteQuantumOperation getRZOperation(QuantumOperationLibrary quantumOpLib) {
		return QuantumOperationUtils.getConcreteQuantumOperationByName(quantumOpLib.getOperations(), RZ.class.getSimpleName());
	}
}
