/**
 */
package qucircuit.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import qucircuit.AbstractCompositeGate;
import qucircuit.AbstractQuantumGate;
import qucircuit.AngleParameter;
import qucircuit.Bit;
import qucircuit.ClassicBit;
import qucircuit.ClassicControl;
import qucircuit.ClassicRegister;
import qucircuit.CompositeQuantumGate;
import qucircuit.ElementaryQuantumGate;
import qucircuit.Layer;
import qucircuit.Loop;
import qucircuit.Measurement;
import qucircuit.NamedElement;
import qucircuit.QuCircuitFactory;
import qucircuit.QuCircuitPackage;
import qucircuit.QuantumCircuit;
import qucircuit.QuantumOperation;
import qucircuit.QuantumRegister;
import qucircuit.Qubit;
import qucircuit.StatePreparation;

import quope.QuopePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QuCircuitPackageImpl extends EPackageImpl implements QuCircuitPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantumCircuitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantumRegisterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classicRegisterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qubitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classicBitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classicControlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantumOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractQuantumGateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statePreparationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measurementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementaryQuantumGateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeQuantumGateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass angleParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractCompositeGateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum iteratioN_TYPEEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see qucircuit.QuCircuitPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private QuCircuitPackageImpl() {
		super(eNS_URI, QuCircuitFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link QuCircuitPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QuCircuitPackage init() {
		if (isInited)
			return (QuCircuitPackage) EPackage.Registry.INSTANCE.getEPackage(QuCircuitPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredQuCircuitPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		QuCircuitPackageImpl theQuCircuitPackage = registeredQuCircuitPackage instanceof QuCircuitPackageImpl
				? (QuCircuitPackageImpl) registeredQuCircuitPackage
				: new QuCircuitPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		QuopePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theQuCircuitPackage.createPackageContents();

		// Initialize created meta-data
		theQuCircuitPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theQuCircuitPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QuCircuitPackage.eNS_URI, theQuCircuitPackage);
		return theQuCircuitPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuantumCircuit() {
		return quantumCircuitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantumCircuit_QuantumRegisters() {
		return (EReference) quantumCircuitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantumCircuit_ClassicRegisters() {
		return (EReference) quantumCircuitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantumCircuit_Layers() {
		return (EReference) quantumCircuitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute) namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuantumRegister() {
		return quantumRegisterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantumRegister_Qubits() {
		return (EReference) quantumRegisterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassicRegister() {
		return classicRegisterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassicRegister_ClassicBits() {
		return (EReference) classicRegisterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQubit() {
		return qubitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassicBit() {
		return classicBitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLayer() {
		return layerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayer_QuantumOperations() {
		return (EReference) layerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassicControl() {
		return classicControlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassicControl_Value() {
		return (EAttribute) classicControlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassicControl_ClassicRegister() {
		return (EReference) classicControlEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuantumOperation() {
		return quantumOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantumOperation_ClassicControl() {
		return (EReference) quantumOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantumOperation_Operation() {
		return (EReference) quantumOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantumOperation_TargetQubits() {
		return (EReference) quantumOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractQuantumGate() {
		return abstractQuantumGateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractQuantumGate_ControlQubits() {
		return (EReference) abstractQuantumGateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractQuantumGate_InverseForm() {
		return (EAttribute) abstractQuantumGateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatePreparation() {
		return statePreparationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasurement() {
		return measurementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMeasurement_ClassicBits() {
		return (EReference) measurementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementaryQuantumGate() {
		return elementaryQuantumGateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementaryQuantumGate_AngleParameter() {
		return (EReference) elementaryQuantumGateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeQuantumGate() {
		return compositeQuantumGateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAngleParameter() {
		return angleParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAngleParameter_Theta() {
		return (EAttribute) angleParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAngleParameter_Phi() {
		return (EAttribute) angleParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAngleParameter_Lambda() {
		return (EAttribute) angleParameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBit() {
		return bitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBit_Id() {
		return (EAttribute) bitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractCompositeGate() {
		return abstractCompositeGateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractCompositeGate_Layers() {
		return (EReference) abstractCompositeGateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoop() {
		return loopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoop_Iterations() {
		return (EAttribute) loopEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoop_FixedControlQubits() {
		return (EReference) loopEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoop_FixedTargetQubits() {
		return (EReference) loopEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoop_Loop() {
		return (EReference) loopEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoop_IncrementControlQubits() {
		return (EAttribute) loopEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoop_IncrementTargetQubits() {
		return (EAttribute) loopEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoop_LoopTargetQubits() {
		return (EReference) loopEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoop_LoopControlQubits() {
		return (EReference) loopEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoop_TargetQubitsBlockSize() {
		return (EAttribute) loopEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoop_ControlQubitsBlockSize() {
		return (EAttribute) loopEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoop_ControlQubitsIterationType() {
		return (EAttribute) loopEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoop_TargetQubitsIterationType() {
		return (EAttribute) loopEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getITERATION_TYPE() {
		return iteratioN_TYPEEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuCircuitFactory getQuCircuitFactory() {
		return (QuCircuitFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		quantumCircuitEClass = createEClass(QUANTUM_CIRCUIT);
		createEReference(quantumCircuitEClass, QUANTUM_CIRCUIT__QUANTUM_REGISTERS);
		createEReference(quantumCircuitEClass, QUANTUM_CIRCUIT__CLASSIC_REGISTERS);
		createEReference(quantumCircuitEClass, QUANTUM_CIRCUIT__LAYERS);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		quantumRegisterEClass = createEClass(QUANTUM_REGISTER);
		createEReference(quantumRegisterEClass, QUANTUM_REGISTER__QUBITS);

		classicRegisterEClass = createEClass(CLASSIC_REGISTER);
		createEReference(classicRegisterEClass, CLASSIC_REGISTER__CLASSIC_BITS);

		qubitEClass = createEClass(QUBIT);

		classicBitEClass = createEClass(CLASSIC_BIT);

		layerEClass = createEClass(LAYER);
		createEReference(layerEClass, LAYER__QUANTUM_OPERATIONS);

		classicControlEClass = createEClass(CLASSIC_CONTROL);
		createEAttribute(classicControlEClass, CLASSIC_CONTROL__VALUE);
		createEReference(classicControlEClass, CLASSIC_CONTROL__CLASSIC_REGISTER);

		quantumOperationEClass = createEClass(QUANTUM_OPERATION);
		createEReference(quantumOperationEClass, QUANTUM_OPERATION__CLASSIC_CONTROL);
		createEReference(quantumOperationEClass, QUANTUM_OPERATION__OPERATION);
		createEReference(quantumOperationEClass, QUANTUM_OPERATION__TARGET_QUBITS);

		abstractQuantumGateEClass = createEClass(ABSTRACT_QUANTUM_GATE);
		createEReference(abstractQuantumGateEClass, ABSTRACT_QUANTUM_GATE__CONTROL_QUBITS);
		createEAttribute(abstractQuantumGateEClass, ABSTRACT_QUANTUM_GATE__INVERSE_FORM);

		statePreparationEClass = createEClass(STATE_PREPARATION);

		measurementEClass = createEClass(MEASUREMENT);
		createEReference(measurementEClass, MEASUREMENT__CLASSIC_BITS);

		elementaryQuantumGateEClass = createEClass(ELEMENTARY_QUANTUM_GATE);
		createEReference(elementaryQuantumGateEClass, ELEMENTARY_QUANTUM_GATE__ANGLE_PARAMETER);

		compositeQuantumGateEClass = createEClass(COMPOSITE_QUANTUM_GATE);

		angleParameterEClass = createEClass(ANGLE_PARAMETER);
		createEAttribute(angleParameterEClass, ANGLE_PARAMETER__THETA);
		createEAttribute(angleParameterEClass, ANGLE_PARAMETER__PHI);
		createEAttribute(angleParameterEClass, ANGLE_PARAMETER__LAMBDA);

		bitEClass = createEClass(BIT);
		createEAttribute(bitEClass, BIT__ID);

		abstractCompositeGateEClass = createEClass(ABSTRACT_COMPOSITE_GATE);
		createEReference(abstractCompositeGateEClass, ABSTRACT_COMPOSITE_GATE__LAYERS);

		loopEClass = createEClass(LOOP);
		createEAttribute(loopEClass, LOOP__ITERATIONS);
		createEReference(loopEClass, LOOP__FIXED_CONTROL_QUBITS);
		createEReference(loopEClass, LOOP__FIXED_TARGET_QUBITS);
		createEReference(loopEClass, LOOP__LOOP);
		createEAttribute(loopEClass, LOOP__INCREMENT_CONTROL_QUBITS);
		createEAttribute(loopEClass, LOOP__INCREMENT_TARGET_QUBITS);
		createEReference(loopEClass, LOOP__LOOP_TARGET_QUBITS);
		createEReference(loopEClass, LOOP__LOOP_CONTROL_QUBITS);
		createEAttribute(loopEClass, LOOP__TARGET_QUBITS_BLOCK_SIZE);
		createEAttribute(loopEClass, LOOP__CONTROL_QUBITS_BLOCK_SIZE);
		createEAttribute(loopEClass, LOOP__CONTROL_QUBITS_ITERATION_TYPE);
		createEAttribute(loopEClass, LOOP__TARGET_QUBITS_ITERATION_TYPE);

		// Create enums
		iteratioN_TYPEEEnum = createEEnum(ITERATION_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		QuopePackage theQuopePackage = (QuopePackage) EPackage.Registry.INSTANCE.getEPackage(QuopePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		quantumCircuitEClass.getESuperTypes().add(this.getNamedElement());
		quantumRegisterEClass.getESuperTypes().add(this.getNamedElement());
		classicRegisterEClass.getESuperTypes().add(this.getNamedElement());
		qubitEClass.getESuperTypes().add(this.getBit());
		classicBitEClass.getESuperTypes().add(this.getBit());
		layerEClass.getESuperTypes().add(this.getNamedElement());
		quantumOperationEClass.getESuperTypes().add(this.getNamedElement());
		abstractQuantumGateEClass.getESuperTypes().add(this.getQuantumOperation());
		statePreparationEClass.getESuperTypes().add(this.getQuantumOperation());
		measurementEClass.getESuperTypes().add(this.getQuantumOperation());
		elementaryQuantumGateEClass.getESuperTypes().add(this.getAbstractQuantumGate());
		compositeQuantumGateEClass.getESuperTypes().add(this.getAbstractCompositeGate());
		abstractCompositeGateEClass.getESuperTypes().add(this.getAbstractQuantumGate());
		loopEClass.getESuperTypes().add(this.getAbstractCompositeGate());

		// Initialize classes, features, and operations; add parameters
		initEClass(quantumCircuitEClass, QuantumCircuit.class, "QuantumCircuit", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuantumCircuit_QuantumRegisters(), this.getQuantumRegister(), null, "quantumRegisters", null,
				1, -1, QuantumCircuit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuantumCircuit_ClassicRegisters(), this.getClassicRegister(), null, "classicRegisters", null,
				0, -1, QuantumCircuit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuantumCircuit_Layers(), this.getLayer(), null, "layers", null, 0, -1, QuantumCircuit.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(quantumRegisterEClass, QuantumRegister.class, "QuantumRegister", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuantumRegister_Qubits(), this.getQubit(), null, "qubits", null, 0, -1, QuantumRegister.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classicRegisterEClass, ClassicRegister.class, "ClassicRegister", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassicRegister_ClassicBits(), this.getClassicBit(), null, "classicBits", null, 0, -1,
				ClassicRegister.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qubitEClass, Qubit.class, "Qubit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(classicBitEClass, ClassicBit.class, "ClassicBit", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(layerEClass, Layer.class, "Layer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLayer_QuantumOperations(), this.getQuantumOperation(), null, "quantumOperations", null, 0, -1,
				Layer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classicControlEClass, ClassicControl.class, "ClassicControl", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClassicControl_Value(), ecorePackage.getEDoubleObject(), "value", null, 0, 1,
				ClassicControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getClassicControl_ClassicRegister(), this.getClassicRegister(), null, "classicRegister", null, 1,
				1, ClassicControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(quantumOperationEClass, QuantumOperation.class, "QuantumOperation", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuantumOperation_ClassicControl(), this.getClassicControl(), null, "classicControl", null, 0,
				1, QuantumOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuantumOperation_Operation(), theQuopePackage.getConcreteQuantumOperation(), null,
				"operation", null, 0, 1, QuantumOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuantumOperation_TargetQubits(), this.getQubit(), null, "targetQubits", null, 1, -1,
				QuantumOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractQuantumGateEClass, AbstractQuantumGate.class, "AbstractQuantumGate", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractQuantumGate_ControlQubits(), this.getQubit(), null, "controlQubits", null, 0, -1,
				AbstractQuantumGate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractQuantumGate_InverseForm(), ecorePackage.getEBooleanObject(), "inverseForm", "false",
				0, 1, AbstractQuantumGate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statePreparationEClass, StatePreparation.class, "StatePreparation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(measurementEClass, Measurement.class, "Measurement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeasurement_ClassicBits(), this.getClassicBit(), null, "classicBits", null, 1, -1,
				Measurement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementaryQuantumGateEClass, ElementaryQuantumGate.class, "ElementaryQuantumGate", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElementaryQuantumGate_AngleParameter(), this.getAngleParameter(), null, "angleParameter",
				null, 0, 1, ElementaryQuantumGate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositeQuantumGateEClass, CompositeQuantumGate.class, "CompositeQuantumGate", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(angleParameterEClass, AngleParameter.class, "AngleParameter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAngleParameter_Theta(), ecorePackage.getEDoubleObject(), "theta", null, 0, 1,
				AngleParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAngleParameter_Phi(), ecorePackage.getEDoubleObject(), "phi", null, 0, 1,
				AngleParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAngleParameter_Lambda(), ecorePackage.getEDoubleObject(), "lambda", null, 0, 1,
				AngleParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(bitEClass, Bit.class, "Bit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBit_Id(), ecorePackage.getEIntegerObject(), "id", null, 0, 1, Bit.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractCompositeGateEClass, AbstractCompositeGate.class, "AbstractCompositeGate", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractCompositeGate_Layers(), this.getLayer(), null, "layers", null, 0, -1,
				AbstractCompositeGate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(loopEClass, Loop.class, "Loop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLoop_Iterations(), ecorePackage.getEInt(), "iterations", null, 0, 1, Loop.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLoop_FixedControlQubits(), this.getQubit(), null, "fixedControlQubits", null, 0, -1,
				Loop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLoop_FixedTargetQubits(), this.getQubit(), null, "fixedTargetQubits", null, 0, -1, Loop.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLoop_Loop(), theQuopePackage.getLoopOperation(), null, "loop", null, 0, 1, Loop.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoop_IncrementControlQubits(), ecorePackage.getEBooleanObject(), "incrementControlQubits",
				"true", 0, 1, Loop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoop_IncrementTargetQubits(), ecorePackage.getEBooleanObject(), "incrementTargetQubits",
				"true", 0, 1, Loop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getLoop_LoopTargetQubits(), this.getQubit(), null, "loopTargetQubits", null, 1, -1, Loop.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLoop_LoopControlQubits(), this.getQubit(), null, "loopControlQubits", null, 0, -1, Loop.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoop_TargetQubitsBlockSize(), ecorePackage.getEIntegerObject(), "targetQubitsBlockSize", null,
				0, 1, Loop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoop_ControlQubitsBlockSize(), ecorePackage.getEIntegerObject(), "controlQubitsBlockSize",
				null, 0, 1, Loop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoop_ControlQubitsIterationType(), this.getITERATION_TYPE(), "controlQubitsIterationType",
				null, 0, 1, Loop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoop_TargetQubitsIterationType(), this.getITERATION_TYPE(), "targetQubitsIterationType", null,
				0, 1, Loop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(iteratioN_TYPEEEnum, qucircuit.ITERATION_TYPE.class, "ITERATION_TYPE");
		addEEnumLiteral(iteratioN_TYPEEEnum, qucircuit.ITERATION_TYPE.NONE);
		addEEnumLiteral(iteratioN_TYPEEEnum, qucircuit.ITERATION_TYPE.SHIFT);
		addEEnumLiteral(iteratioN_TYPEEEnum, qucircuit.ITERATION_TYPE.CHANGE_BLOCK);

		// Create resource
		createResource(eNS_URI);
	}

} //QuCircuitPackageImpl
