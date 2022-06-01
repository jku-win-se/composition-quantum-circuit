/**
 */
package at.jku.se.quantum.operation.library.mm.quope.impl;

import at.jku.se.quantum.operation.library.mm.quope.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QuantumOpeFactoryImpl extends EFactoryImpl implements QuantumOpeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QuantumOpeFactory init() {
		try {
			QuantumOpeFactory theQuantumOpeFactory = (QuantumOpeFactory) EPackage.Registry.INSTANCE
					.getEFactory(QuantumOpePackage.eNS_URI);
			if (theQuantumOpeFactory != null) {
				return theQuantumOpeFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new QuantumOpeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantumOpeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case QuantumOpePackage.QUANTUM_OPERATION_LIBRARY:
			return createQuantumOperationLibrary();
		case QuantumOpePackage.CONCRETE_QUANTUM_OPERATION:
			return createConcreteQuantumOperation();
		case QuantumOpePackage.FIXED_QUANTUM_OPERATION:
			return createFixedQuantumOperation();
		case QuantumOpePackage.PARAMETER:
			return createParameter();
		case QuantumOpePackage.LOOP_OPERATION:
			return createLoopOperation();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantumOperationLibrary createQuantumOperationLibrary() {
		QuantumOperationLibraryImpl quantumOperationLibrary = new QuantumOperationLibraryImpl();
		return quantumOperationLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteQuantumOperation createConcreteQuantumOperation() {
		ConcreteQuantumOperationImpl concreteQuantumOperation = new ConcreteQuantumOperationImpl();
		return concreteQuantumOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedQuantumOperation createFixedQuantumOperation() {
		FixedQuantumOperationImpl fixedQuantumOperation = new FixedQuantumOperationImpl();
		return fixedQuantumOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopOperation createLoopOperation() {
		LoopOperationImpl loopOperation = new LoopOperationImpl();
		return loopOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantumOpePackage getQuantumOpePackage() {
		return (QuantumOpePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QuantumOpePackage getPackage() {
		return QuantumOpePackage.eINSTANCE;
	}

} //QuantumOpeFactoryImpl
