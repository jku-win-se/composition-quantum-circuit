package quantum.operation.definition.api.utils;

import java.util.Collection;

import org.eclipse.core.runtime.Platform;

import quope.AbstractQuantumOperation;
import quope.ConcreteQuantumOperation;
import quope.QuantumOperationLibrary;
import quantum.operation.definition.EvaluateQuantumOperationsContributions;

public class QuantumOperationUtils {
	
	//Suppress default constructor for noninstantiability
	private QuantumOperationUtils() {
		throw new AssertionError();
	}
	
	public static String QUANTUM_OPERATION_NAME = "QuantumLibrary";
	
	public static QuantumOperationLibrary getAllQuantumOperations() {
		return new EvaluateQuantumOperationsContributions().execute(Platform.getExtensionRegistry());	
	}
	
	public static ConcreteQuantumOperation getConcreteQuantumOperationByName(Collection<AbstractQuantumOperation> quantumOperations, String name) {
		var qOpe = quantumOperations.stream()
						.filter(ope -> ope.getName().equals(name) && ope instanceof ConcreteQuantumOperation)
						.map(ope -> (ConcreteQuantumOperation) ope)
						.findAny();
		if (qOpe.isPresent()) {
			return qOpe.get();
		}
		else
			return null;
	}	
}
