package quantum.operation.definition.api.utils;

import java.util.Collection;

import org.eclipse.core.runtime.Platform;

import quope.ConcreteQuantumOperation;
import quope.QuantumOperationLibrary;
import quope.impl.QuopeFactoryImpl;
import quantum.operation.definition.EvaluateQuantumOperationsContributions;

public class QuantumOperationUtils {
	
	//Suppress default constructor for noninstantiability
	private QuantumOperationUtils() {
		throw new AssertionError();
	}
	
	public static QuantumOperationLibrary getAllQuantumOperations() {
		var quantumOpe = QuopeFactoryImpl.init().createQuantumOperationLibrary();
		var operations = new EvaluateQuantumOperationsContributions().execute(Platform.getExtensionRegistry());
		quantumOpe.getOperations().addAll(operations);
		return quantumOpe;
	}
	
	public static ConcreteQuantumOperation getConcreteQuantumOperationByName(Collection<ConcreteQuantumOperation> quantumOperations, String name) {
		var qOpe = quantumOperations.stream()
						.filter(ope -> ope.getName().equals(name))
						.findAny();
		if (qOpe.isPresent())
			return qOpe.get();
		else
			return null;
	}	
}
