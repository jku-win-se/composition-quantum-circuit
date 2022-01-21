/**
 */
package qucircuit.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import qucircuit.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QuCircuitFactoryImpl extends EFactoryImpl implements QuCircuitFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QuCircuitFactory init() {
		try {
			QuCircuitFactory theQuCircuitFactory = (QuCircuitFactory) EPackage.Registry.INSTANCE
					.getEFactory(QuCircuitPackage.eNS_URI);
			if (theQuCircuitFactory != null) {
				return theQuCircuitFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new QuCircuitFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuCircuitFactoryImpl() {
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
		case QuCircuitPackage.QUANTUM_CIRCUIT:
			return createQuantumCircuit();
		case QuCircuitPackage.QUANTUM_REGISTER:
			return createQuantumRegister();
		case QuCircuitPackage.CLASSIC_REGISTER:
			return createClassicRegister();
		case QuCircuitPackage.QUBIT:
			return createQubit();
		case QuCircuitPackage.CLASSIC_BIT:
			return createClassicBit();
		case QuCircuitPackage.LAYER:
			return createLayer();
		case QuCircuitPackage.CLASSIC_CONTROL:
			return createClassicControl();
		case QuCircuitPackage.STATE_PREPARATION:
			return createStatePreparation();
		case QuCircuitPackage.MEASUREMENT:
			return createMeasurement();
		case QuCircuitPackage.ELEMENTARY_QUANTUM_GATE:
			return createElementaryQuantumGate();
		case QuCircuitPackage.COMPOSITE_QUANTUM_GATE:
			return createCompositeQuantumGate();
		case QuCircuitPackage.ANGLE_PARAMETER:
			return createAngleParameter();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantumCircuit createQuantumCircuit() {
		QuantumCircuitImpl quantumCircuit = new QuantumCircuitImpl();
		return quantumCircuit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantumRegister createQuantumRegister() {
		QuantumRegisterImpl quantumRegister = new QuantumRegisterImpl();
		return quantumRegister;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassicRegister createClassicRegister() {
		ClassicRegisterImpl classicRegister = new ClassicRegisterImpl();
		return classicRegister;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Qubit createQubit() {
		QubitImpl qubit = new QubitImpl();
		return qubit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassicBit createClassicBit() {
		ClassicBitImpl classicBit = new ClassicBitImpl();
		return classicBit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layer createLayer() {
		LayerImpl layer = new LayerImpl();
		return layer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassicControl createClassicControl() {
		ClassicControlImpl classicControl = new ClassicControlImpl();
		return classicControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatePreparation createStatePreparation() {
		StatePreparationImpl statePreparation = new StatePreparationImpl();
		return statePreparation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Measurement createMeasurement() {
		MeasurementImpl measurement = new MeasurementImpl();
		return measurement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementaryQuantumGate createElementaryQuantumGate() {
		ElementaryQuantumGateImpl elementaryQuantumGate = new ElementaryQuantumGateImpl();
		return elementaryQuantumGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeQuantumGate createCompositeQuantumGate() {
		CompositeQuantumGateImpl compositeQuantumGate = new CompositeQuantumGateImpl();
		return compositeQuantumGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AngleParameter createAngleParameter() {
		AngleParameterImpl angleParameter = new AngleParameterImpl();
		return angleParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuCircuitPackage getQuCircuitPackage() {
		return (QuCircuitPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QuCircuitPackage getPackage() {
		return QuCircuitPackage.eINSTANCE;
	}

} //QuCircuitFactoryImpl
