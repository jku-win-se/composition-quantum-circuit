package quantum.operation.definition;

import static quantum.operation.definition.api.utils.QuantumOperationUtils.getConcreteQuantumOperationByName;

import java.util.Collection;
import java.util.HashMap;
import java.util.logging.Logger;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.ISafeRunnable;
import org.eclipse.core.runtime.SafeRunner;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import quope.ConcreteQuantumOperation;
import quope.impl.QuopeFactoryImpl;
import quantum.operation.definition.api.IGeneralOperationType;
import quantum.operation.definition.api.LibraryQuantumGate;

public class EvaluateQuantumOperationsContributions {
	
	private static final String QUANTUM_OPERATION = "at.jku.se.quantum.operation";
	private static final String QUANTUM_OPERATION_NAME_ATTRIBUTE = "Name";
	
	private static final Logger LOGGER = Logger.getLogger(EvaluateQuantumOperationsContributions.class.getName());
	
	public EvaluateQuantumOperationsContributions() {
		// Do nothing
	}
	
	public Collection<ConcreteQuantumOperation> execute(IExtensionRegistry registry) {
		IConfigurationElement[] config = registry.getConfigurationElementsFor(QUANTUM_OPERATION);
		//All the operations
		EList<ConcreteQuantumOperation> operations = ECollections.newBasicEListWithCapacity(config.length);
		//HashMap source the Operation and the value is the reversible quantum gate (Name) 
		var reverseGate = new HashMap<ConcreteQuantumOperation, String>();
		try {
			LOGGER.info("Evaluating extensions");
			for (IConfigurationElement configElement : config) {				
                final Object o = configElement.createExecutableExtension("class");
                if (o instanceof IGeneralOperationType) {
                   executeExtension(operations, reverseGate, o, configElement);                   
                }
            }
			LOGGER.info("Evaluating Reverse Quantum Gates");
			reverseGate.entrySet().stream()
				.forEach(e -> e.getKey().setReverse(getConcreteQuantumOperationByName(operations,e.getValue())));			
		} catch (CoreException ex) {
			LOGGER.severe(ex.getMessage());            
        }	
		return operations;	
	}

	private void executeExtension(EList<ConcreteQuantumOperation> operations, HashMap<ConcreteQuantumOperation, String> reverseGate, 
			Object extensionPoint, IConfigurationElement configElement) {
		ISafeRunnable runnable = new ISafeRunnable() {
            @Override
            public void handleException(Throwable e) {
            	LOGGER.severe("Exception in client: " + e.getMessage());                
            }

            @Override
            public void run() throws Exception {
            	ConcreteQuantumOperation ope = QuopeFactoryImpl.init().createConcreteQuantumOperation();
            	ope.setName(configElement.getAttribute(QUANTUM_OPERATION_NAME_ATTRIBUTE));           	
                ope.setType(((IGeneralOperationType) extensionPoint).getAbstractQuantumGate());
                ope.setAbbreviation(((IGeneralOperationType) extensionPoint).getAbbreviation());
                ope.setStyleIconPath(((IGeneralOperationType) extensionPoint).getStyleIconPath());
                ope.setPaletteIconPath(((IGeneralOperationType) extensionPoint).getPaletteIconPath());
                if (ope instanceof LibraryQuantumGate libraryQuantumGate) {
                	ope.setParameter(libraryQuantumGate.getParameter());
                	ope.setFixedQuantumOperation(libraryQuantumGate.getFixedQuantumOperators());
                }
                String reverseGateId = ((IGeneralOperationType) extensionPoint).getReverseConcreteQuantumOperation();
                if (reverseGate != null && reverseGate.isEmpty())
                	reverseGate.put(ope, reverseGateId);
                operations.add(ope);
            }
        };
        SafeRunner.run(runnable);        
	}
}
