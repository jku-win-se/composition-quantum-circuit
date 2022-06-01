package quantum.operation.contribution.utils;

import org.eclipse.emf.common.util.URI;

import quope.ConcreteQuantumOperation;
import quope.QuantumOperationLibrary;
import quantum.operation.contribution.elementaryquantumgate.CNOT;
import quantum.operation.contribution.elementaryquantumgate.Hadamard;
import quantum.operation.contribution.elementaryquantumgate.RZ;
import quantum.operation.definition.api.utils.QuantumOperationUtils;

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
