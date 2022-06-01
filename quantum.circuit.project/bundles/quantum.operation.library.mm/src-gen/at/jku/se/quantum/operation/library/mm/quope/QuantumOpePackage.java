/**
 */
package at.jku.se.quantum.operation.library.mm.quope;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see at.jku.se.quantum.operation.library.mm.quope.QuantumOpeFactory
 * @model kind="package"
 * @generated
 */
public interface QuantumOpePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "quope";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.se.jku.at/QuantumOpe";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "quope";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QuantumOpePackage eINSTANCE = at.jku.se.quantum.operation.library.mm.quope.impl.QuantumOpePackageImpl.init();

	/**
	 * The meta object id for the '{@link at.jku.se.quantum.operation.library.mm.quope.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.se.quantum.operation.library.mm.quope.impl.NamedElementImpl
	 * @see at.jku.se.quantum.operation.library.mm.quope.impl.QuantumOpePackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.jku.se.quantum.operation.library.mm.quope.impl.QuantumOperationLibraryImpl <em>Quantum Operation Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.se.quantum.operation.library.mm.quope.impl.QuantumOperationLibraryImpl
	 * @see at.jku.se.quantum.operation.library.mm.quope.impl.QuantumOpePackageImpl#getQuantumOperationLibrary()
	 * @generated
	 */
	int QUANTUM_OPERATION_LIBRARY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTUM_OPERATION_LIBRARY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTUM_OPERATION_LIBRARY__OPERATIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Quantum Operation Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTUM_OPERATION_LIBRARY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Quantum Operation Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTUM_OPERATION_LIBRARY_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.jku.se.quantum.operation.library.mm.quope.impl.ConcreteQuantumOperationImpl <em>Concrete Quantum Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.se.quantum.operation.library.mm.quope.impl.ConcreteQuantumOperationImpl
	 * @see at.jku.se.quantum.operation.library.mm.quope.impl.QuantumOpePackageImpl#getConcreteQuantumOperation()
	 * @generated
	 */
	int CONCRETE_QUANTUM_OPERATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_QUANTUM_OPERATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_QUANTUM_OPERATION__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reverse Concrete Quantum Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_QUANTUM_OPERATION__REVERSE_CONCRETE_QUANTUM_OPERATION = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Abbreviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_QUANTUM_OPERATION__ABBREVIATION = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Palette Icon Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_QUANTUM_OPERATION__PALETTE_ICON_PATH = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Style Icon Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_QUANTUM_OPERATION__STYLE_ICON_PATH = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_QUANTUM_OPERATION__PARAMETER = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Fixed Quantum Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_QUANTUM_OPERATION__FIXED_QUANTUM_OPERATION = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Concrete Quantum Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_QUANTUM_OPERATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Concrete Quantum Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCRETE_QUANTUM_OPERATION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link at.jku.se.quantum.operation.library.mm.quope.impl.FixedQuantumOperationImpl <em>Fixed Quantum Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.se.quantum.operation.library.mm.quope.impl.FixedQuantumOperationImpl
	 * @see at.jku.se.quantum.operation.library.mm.quope.impl.QuantumOpePackageImpl#getFixedQuantumOperation()
	 * @generated
	 */
	int FIXED_QUANTUM_OPERATION = 3;

	/**
	 * The feature id for the '<em><b>Number Of Target Qubits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_QUANTUM_OPERATION__NUMBER_OF_TARGET_QUBITS = 0;

	/**
	 * The feature id for the '<em><b>Number Of Control Qubits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_QUANTUM_OPERATION__NUMBER_OF_CONTROL_QUBITS = 1;

	/**
	 * The number of structural features of the '<em>Fixed Quantum Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_QUANTUM_OPERATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Fixed Quantum Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_QUANTUM_OPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link at.jku.se.quantum.operation.library.mm.quope.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.jku.se.quantum.operation.library.mm.quope.impl.ParameterImpl
	 * @see at.jku.se.quantum.operation.library.mm.quope.impl.QuantumOpePackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 4;

	/**
	 * The feature id for the '<em><b>Theta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__THETA = 0;

	/**
	 * The feature id for the '<em><b>Phi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__PHI = 1;

	/**
	 * The feature id for the '<em><b>Lambda</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__LAMBDA = 2;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link at.jku.se.quantum.operation.library.mm.quope.QuantumOperationLibrary <em>Quantum Operation Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantum Operation Library</em>'.
	 * @see at.jku.se.quantum.operation.library.mm.quope.QuantumOperationLibrary
	 * @generated
	 */
	EClass getQuantumOperationLibrary();

	/**
	 * Returns the meta object for the containment reference list '{@link at.jku.se.quantum.operation.library.mm.quope.QuantumOperationLibrary#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see at.jku.se.quantum.operation.library.mm.quope.QuantumOperationLibrary#getOperations()
	 * @see #getQuantumOperationLibrary()
	 * @generated
	 */
	EReference getQuantumOperationLibrary_Operations();

	/**
	 * Returns the meta object for class '{@link at.jku.se.quantum.operation.library.mm.quope.ConcreteQuantumOperation <em>Concrete Quantum Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concrete Quantum Operation</em>'.
	 * @see at.jku.se.quantum.operation.library.mm.quope.ConcreteQuantumOperation
	 * @generated
	 */
	EClass getConcreteQuantumOperation();

	/**
	 * Returns the meta object for the reference '{@link at.jku.se.quantum.operation.library.mm.quope.ConcreteQuantumOperation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see at.jku.se.quantum.operation.library.mm.quope.ConcreteQuantumOperation#getType()
	 * @see #getConcreteQuantumOperation()
	 * @generated
	 */
	EReference getConcreteQuantumOperation_Type();

	/**
	 * Returns the meta object for the reference '{@link at.jku.se.quantum.operation.library.mm.quope.ConcreteQuantumOperation#getReverseConcreteQuantumOperation <em>Reverse Concrete Quantum Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reverse Concrete Quantum Operation</em>'.
	 * @see at.jku.se.quantum.operation.library.mm.quope.ConcreteQuantumOperation#getReverseConcreteQuantumOperation()
	 * @see #getConcreteQuantumOperation()
	 * @generated
	 */
	EReference getConcreteQuantumOperation_ReverseConcreteQuantumOperation();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.se.quantum.operation.library.mm.quope.ConcreteQuantumOperation#getAbbreviation <em>Abbreviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abbreviation</em>'.
	 * @see at.jku.se.quantum.operation.library.mm.quope.ConcreteQuantumOperation#getAbbreviation()
	 * @see #getConcreteQuantumOperation()
	 * @generated
	 */
	EAttribute getConcreteQuantumOperation_Abbreviation();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.se.quantum.operation.library.mm.quope.ConcreteQuantumOperation#getPaletteIconPath <em>Palette Icon Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Palette Icon Path</em>'.
	 * @see at.jku.se.quantum.operation.library.mm.quope.ConcreteQuantumOperation#getPaletteIconPath()
	 * @see #getConcreteQuantumOperation()
	 * @generated
	 */
	EAttribute getConcreteQuantumOperation_PaletteIconPath();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.se.quantum.operation.library.mm.quope.ConcreteQuantumOperation#getStyleIconPath <em>Style Icon Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Icon Path</em>'.
	 * @see at.jku.se.quantum.operation.library.mm.quope.ConcreteQuantumOperation#getStyleIconPath()
	 * @see #getConcreteQuantumOperation()
	 * @generated
	 */
	EAttribute getConcreteQuantumOperation_StyleIconPath();

	/**
	 * Returns the meta object for the containment reference '{@link at.jku.se.quantum.operation.library.mm.quope.ConcreteQuantumOperation#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter</em>'.
	 * @see at.jku.se.quantum.operation.library.mm.quope.ConcreteQuantumOperation#getParameter()
	 * @see #getConcreteQuantumOperation()
	 * @generated
	 */
	EReference getConcreteQuantumOperation_Parameter();

	/**
	 * Returns the meta object for the containment reference '{@link at.jku.se.quantum.operation.library.mm.quope.ConcreteQuantumOperation#getFixedQuantumOperation <em>Fixed Quantum Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fixed Quantum Operation</em>'.
	 * @see at.jku.se.quantum.operation.library.mm.quope.ConcreteQuantumOperation#getFixedQuantumOperation()
	 * @see #getConcreteQuantumOperation()
	 * @generated
	 */
	EReference getConcreteQuantumOperation_FixedQuantumOperation();

	/**
	 * Returns the meta object for class '{@link at.jku.se.quantum.operation.library.mm.quope.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see at.jku.se.quantum.operation.library.mm.quope.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.se.quantum.operation.library.mm.quope.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see at.jku.se.quantum.operation.library.mm.quope.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link at.jku.se.quantum.operation.library.mm.quope.FixedQuantumOperation <em>Fixed Quantum Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixed Quantum Operation</em>'.
	 * @see at.jku.se.quantum.operation.library.mm.quope.FixedQuantumOperation
	 * @generated
	 */
	EClass getFixedQuantumOperation();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.se.quantum.operation.library.mm.quope.FixedQuantumOperation#getNumberOfTargetQubits <em>Number Of Target Qubits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Target Qubits</em>'.
	 * @see at.jku.se.quantum.operation.library.mm.quope.FixedQuantumOperation#getNumberOfTargetQubits()
	 * @see #getFixedQuantumOperation()
	 * @generated
	 */
	EAttribute getFixedQuantumOperation_NumberOfTargetQubits();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.se.quantum.operation.library.mm.quope.FixedQuantumOperation#getNumberOfControlQubits <em>Number Of Control Qubits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Control Qubits</em>'.
	 * @see at.jku.se.quantum.operation.library.mm.quope.FixedQuantumOperation#getNumberOfControlQubits()
	 * @see #getFixedQuantumOperation()
	 * @generated
	 */
	EAttribute getFixedQuantumOperation_NumberOfControlQubits();

	/**
	 * Returns the meta object for class '{@link at.jku.se.quantum.operation.library.mm.quope.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see at.jku.se.quantum.operation.library.mm.quope.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.se.quantum.operation.library.mm.quope.Parameter#getTheta <em>Theta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Theta</em>'.
	 * @see at.jku.se.quantum.operation.library.mm.quope.Parameter#getTheta()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Theta();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.se.quantum.operation.library.mm.quope.Parameter#getPhi <em>Phi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phi</em>'.
	 * @see at.jku.se.quantum.operation.library.mm.quope.Parameter#getPhi()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Phi();

	/**
	 * Returns the meta object for the attribute '{@link at.jku.se.quantum.operation.library.mm.quope.Parameter#getLambda <em>Lambda</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lambda</em>'.
	 * @see at.jku.se.quantum.operation.library.mm.quope.Parameter#getLambda()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Lambda();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QuantumOpeFactory getQuantumOpeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link at.jku.se.quantum.operation.library.mm.quope.impl.QuantumOperationLibraryImpl <em>Quantum Operation Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.se.quantum.operation.library.mm.quope.impl.QuantumOperationLibraryImpl
		 * @see at.jku.se.quantum.operation.library.mm.quope.impl.QuantumOpePackageImpl#getQuantumOperationLibrary()
		 * @generated
		 */
		EClass QUANTUM_OPERATION_LIBRARY = eINSTANCE.getQuantumOperationLibrary();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTUM_OPERATION_LIBRARY__OPERATIONS = eINSTANCE.getQuantumOperationLibrary_Operations();

		/**
		 * The meta object literal for the '{@link at.jku.se.quantum.operation.library.mm.quope.impl.ConcreteQuantumOperationImpl <em>Concrete Quantum Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.se.quantum.operation.library.mm.quope.impl.ConcreteQuantumOperationImpl
		 * @see at.jku.se.quantum.operation.library.mm.quope.impl.QuantumOpePackageImpl#getConcreteQuantumOperation()
		 * @generated
		 */
		EClass CONCRETE_QUANTUM_OPERATION = eINSTANCE.getConcreteQuantumOperation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCRETE_QUANTUM_OPERATION__TYPE = eINSTANCE.getConcreteQuantumOperation_Type();

		/**
		 * The meta object literal for the '<em><b>Reverse Concrete Quantum Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCRETE_QUANTUM_OPERATION__REVERSE_CONCRETE_QUANTUM_OPERATION = eINSTANCE
				.getConcreteQuantumOperation_ReverseConcreteQuantumOperation();

		/**
		 * The meta object literal for the '<em><b>Abbreviation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCRETE_QUANTUM_OPERATION__ABBREVIATION = eINSTANCE.getConcreteQuantumOperation_Abbreviation();

		/**
		 * The meta object literal for the '<em><b>Palette Icon Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCRETE_QUANTUM_OPERATION__PALETTE_ICON_PATH = eINSTANCE
				.getConcreteQuantumOperation_PaletteIconPath();

		/**
		 * The meta object literal for the '<em><b>Style Icon Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCRETE_QUANTUM_OPERATION__STYLE_ICON_PATH = eINSTANCE.getConcreteQuantumOperation_StyleIconPath();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCRETE_QUANTUM_OPERATION__PARAMETER = eINSTANCE.getConcreteQuantumOperation_Parameter();

		/**
		 * The meta object literal for the '<em><b>Fixed Quantum Operation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCRETE_QUANTUM_OPERATION__FIXED_QUANTUM_OPERATION = eINSTANCE
				.getConcreteQuantumOperation_FixedQuantumOperation();

		/**
		 * The meta object literal for the '{@link at.jku.se.quantum.operation.library.mm.quope.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.se.quantum.operation.library.mm.quope.impl.NamedElementImpl
		 * @see at.jku.se.quantum.operation.library.mm.quope.impl.QuantumOpePackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link at.jku.se.quantum.operation.library.mm.quope.impl.FixedQuantumOperationImpl <em>Fixed Quantum Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.se.quantum.operation.library.mm.quope.impl.FixedQuantumOperationImpl
		 * @see at.jku.se.quantum.operation.library.mm.quope.impl.QuantumOpePackageImpl#getFixedQuantumOperation()
		 * @generated
		 */
		EClass FIXED_QUANTUM_OPERATION = eINSTANCE.getFixedQuantumOperation();

		/**
		 * The meta object literal for the '<em><b>Number Of Target Qubits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_QUANTUM_OPERATION__NUMBER_OF_TARGET_QUBITS = eINSTANCE
				.getFixedQuantumOperation_NumberOfTargetQubits();

		/**
		 * The meta object literal for the '<em><b>Number Of Control Qubits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_QUANTUM_OPERATION__NUMBER_OF_CONTROL_QUBITS = eINSTANCE
				.getFixedQuantumOperation_NumberOfControlQubits();

		/**
		 * The meta object literal for the '{@link at.jku.se.quantum.operation.library.mm.quope.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.jku.se.quantum.operation.library.mm.quope.impl.ParameterImpl
		 * @see at.jku.se.quantum.operation.library.mm.quope.impl.QuantumOpePackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Theta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__THETA = eINSTANCE.getParameter_Theta();

		/**
		 * The meta object literal for the '<em><b>Phi</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__PHI = eINSTANCE.getParameter_Phi();

		/**
		 * The meta object literal for the '<em><b>Lambda</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__LAMBDA = eINSTANCE.getParameter_Lambda();

	}

} //QuantumOpePackage
