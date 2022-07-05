/**
 */
package qucircuit;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see qucircuit.QucircuitFactory
 * @model kind="package"
 * @generated
 */
public interface QucircuitPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "qucircuit";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/QuCircuit";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "qucircuit";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QucircuitPackage eINSTANCE = qucircuit.impl.QucircuitPackageImpl.init();

	/**
	 * The meta object id for the '{@link qucircuit.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qucircuit.impl.NamedElementImpl
	 * @see qucircuit.impl.QucircuitPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 1;

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
	 * The meta object id for the '{@link qucircuit.impl.QuantumCircuitImpl <em>Quantum Circuit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qucircuit.impl.QuantumCircuitImpl
	 * @see qucircuit.impl.QucircuitPackageImpl#getQuantumCircuit()
	 * @generated
	 */
	int QUANTUM_CIRCUIT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTUM_CIRCUIT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Quantum Registers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTUM_CIRCUIT__QUANTUM_REGISTERS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Classic Registers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTUM_CIRCUIT__CLASSIC_REGISTERS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Layers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTUM_CIRCUIT__LAYERS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Quantum Circuit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTUM_CIRCUIT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Quantum Circuit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTUM_CIRCUIT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qucircuit.impl.QuantumRegisterImpl <em>Quantum Register</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qucircuit.impl.QuantumRegisterImpl
	 * @see qucircuit.impl.QucircuitPackageImpl#getQuantumRegister()
	 * @generated
	 */
	int QUANTUM_REGISTER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTUM_REGISTER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Number Of Qubits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTUM_REGISTER__NUMBER_OF_QUBITS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Quantum Register</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTUM_REGISTER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Quantum Register</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTUM_REGISTER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qucircuit.impl.ClassicRegisterImpl <em>Classic Register</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qucircuit.impl.ClassicRegisterImpl
	 * @see qucircuit.impl.QucircuitPackageImpl#getClassicRegister()
	 * @generated
	 */
	int CLASSIC_REGISTER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIC_REGISTER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Number Of Bits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIC_REGISTER__NUMBER_OF_BITS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Classic Register</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIC_REGISTER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Classic Register</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIC_REGISTER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qucircuit.impl.LayerImpl <em>Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qucircuit.impl.LayerImpl
	 * @see qucircuit.impl.QucircuitPackageImpl#getLayer()
	 * @generated
	 */
	int LAYER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Quantum Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__QUANTUM_OPERATIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qucircuit.impl.ClassicControlImpl <em>Classic Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qucircuit.impl.ClassicControlImpl
	 * @see qucircuit.impl.QucircuitPackageImpl#getClassicControl()
	 * @generated
	 */
	int CLASSIC_CONTROL = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIC_CONTROL__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Classic Register</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIC_CONTROL__CLASSIC_REGISTER = 1;

	/**
	 * The number of structural features of the '<em>Classic Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIC_CONTROL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Classic Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIC_CONTROL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qucircuit.impl.QuantumOperationImpl <em>Quantum Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qucircuit.impl.QuantumOperationImpl
	 * @see qucircuit.impl.QucircuitPackageImpl#getQuantumOperation()
	 * @generated
	 */
	int QUANTUM_OPERATION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTUM_OPERATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Classic Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTUM_OPERATION__CLASSIC_CONTROL = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTUM_OPERATION__OPERATIONS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Qubits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTUM_OPERATION__TARGET_QUBITS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Quantum Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTUM_OPERATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Quantum Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTUM_OPERATION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qucircuit.impl.AbstractQuantumGateImpl <em>Abstract Quantum Gate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qucircuit.impl.AbstractQuantumGateImpl
	 * @see qucircuit.impl.QucircuitPackageImpl#getAbstractQuantumGate()
	 * @generated
	 */
	int ABSTRACT_QUANTUM_GATE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_QUANTUM_GATE__NAME = QUANTUM_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Classic Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_QUANTUM_GATE__CLASSIC_CONTROL = QUANTUM_OPERATION__CLASSIC_CONTROL;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_QUANTUM_GATE__OPERATIONS = QUANTUM_OPERATION__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Target Qubits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_QUANTUM_GATE__TARGET_QUBITS = QUANTUM_OPERATION__TARGET_QUBITS;

	/**
	 * The feature id for the '<em><b>Control Qubits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_QUANTUM_GATE__CONTROL_QUBITS = QUANTUM_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inverse Form</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_QUANTUM_GATE__INVERSE_FORM = QUANTUM_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Quantum Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_QUANTUM_GATE_FEATURE_COUNT = QUANTUM_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Abstract Quantum Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_QUANTUM_GATE_OPERATION_COUNT = QUANTUM_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qucircuit.impl.StatePreparationImpl <em>State Preparation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qucircuit.impl.StatePreparationImpl
	 * @see qucircuit.impl.QucircuitPackageImpl#getStatePreparation()
	 * @generated
	 */
	int STATE_PREPARATION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_PREPARATION__NAME = QUANTUM_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Classic Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_PREPARATION__CLASSIC_CONTROL = QUANTUM_OPERATION__CLASSIC_CONTROL;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_PREPARATION__OPERATIONS = QUANTUM_OPERATION__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Target Qubits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_PREPARATION__TARGET_QUBITS = QUANTUM_OPERATION__TARGET_QUBITS;

	/**
	 * The number of structural features of the '<em>State Preparation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_PREPARATION_FEATURE_COUNT = QUANTUM_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>State Preparation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_PREPARATION_OPERATION_COUNT = QUANTUM_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qucircuit.impl.MeasurementImpl <em>Measurement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qucircuit.impl.MeasurementImpl
	 * @see qucircuit.impl.QucircuitPackageImpl#getMeasurement()
	 * @generated
	 */
	int MEASUREMENT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__NAME = QUANTUM_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Classic Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__CLASSIC_CONTROL = QUANTUM_OPERATION__CLASSIC_CONTROL;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__OPERATIONS = QUANTUM_OPERATION__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Target Qubits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__TARGET_QUBITS = QUANTUM_OPERATION__TARGET_QUBITS;

	/**
	 * The feature id for the '<em><b>Classic Bits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__CLASSIC_BITS = QUANTUM_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_FEATURE_COUNT = QUANTUM_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Measurement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT_OPERATION_COUNT = QUANTUM_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qucircuit.impl.ElementaryQuantumGateImpl <em>Elementary Quantum Gate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qucircuit.impl.ElementaryQuantumGateImpl
	 * @see qucircuit.impl.QucircuitPackageImpl#getElementaryQuantumGate()
	 * @generated
	 */
	int ELEMENTARY_QUANTUM_GATE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_QUANTUM_GATE__NAME = ABSTRACT_QUANTUM_GATE__NAME;

	/**
	 * The feature id for the '<em><b>Classic Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_QUANTUM_GATE__CLASSIC_CONTROL = ABSTRACT_QUANTUM_GATE__CLASSIC_CONTROL;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_QUANTUM_GATE__OPERATIONS = ABSTRACT_QUANTUM_GATE__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Target Qubits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_QUANTUM_GATE__TARGET_QUBITS = ABSTRACT_QUANTUM_GATE__TARGET_QUBITS;

	/**
	 * The feature id for the '<em><b>Control Qubits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_QUANTUM_GATE__CONTROL_QUBITS = ABSTRACT_QUANTUM_GATE__CONTROL_QUBITS;

	/**
	 * The feature id for the '<em><b>Inverse Form</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_QUANTUM_GATE__INVERSE_FORM = ABSTRACT_QUANTUM_GATE__INVERSE_FORM;

	/**
	 * The feature id for the '<em><b>Angle Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_QUANTUM_GATE__ANGLE_PARAMETER = ABSTRACT_QUANTUM_GATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Elementary Quantum Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_QUANTUM_GATE_FEATURE_COUNT = ABSTRACT_QUANTUM_GATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Elementary Quantum Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_QUANTUM_GATE_OPERATION_COUNT = ABSTRACT_QUANTUM_GATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qucircuit.impl.AbstractCompositeGateImpl <em>Abstract Composite Gate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qucircuit.impl.AbstractCompositeGateImpl
	 * @see qucircuit.impl.QucircuitPackageImpl#getAbstractCompositeGate()
	 * @generated
	 */
	int ABSTRACT_COMPOSITE_GATE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPOSITE_GATE__NAME = ABSTRACT_QUANTUM_GATE__NAME;

	/**
	 * The feature id for the '<em><b>Classic Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPOSITE_GATE__CLASSIC_CONTROL = ABSTRACT_QUANTUM_GATE__CLASSIC_CONTROL;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPOSITE_GATE__OPERATIONS = ABSTRACT_QUANTUM_GATE__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Target Qubits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPOSITE_GATE__TARGET_QUBITS = ABSTRACT_QUANTUM_GATE__TARGET_QUBITS;

	/**
	 * The feature id for the '<em><b>Control Qubits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPOSITE_GATE__CONTROL_QUBITS = ABSTRACT_QUANTUM_GATE__CONTROL_QUBITS;

	/**
	 * The feature id for the '<em><b>Inverse Form</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPOSITE_GATE__INVERSE_FORM = ABSTRACT_QUANTUM_GATE__INVERSE_FORM;

	/**
	 * The feature id for the '<em><b>Layers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPOSITE_GATE__LAYERS = ABSTRACT_QUANTUM_GATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Composite Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPOSITE_GATE_FEATURE_COUNT = ABSTRACT_QUANTUM_GATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Abstract Composite Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPOSITE_GATE_OPERATION_COUNT = ABSTRACT_QUANTUM_GATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qucircuit.impl.CompositeQuantumGateImpl <em>Composite Quantum Gate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qucircuit.impl.CompositeQuantumGateImpl
	 * @see qucircuit.impl.QucircuitPackageImpl#getCompositeQuantumGate()
	 * @generated
	 */
	int COMPOSITE_QUANTUM_GATE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_QUANTUM_GATE__NAME = ABSTRACT_COMPOSITE_GATE__NAME;

	/**
	 * The feature id for the '<em><b>Classic Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_QUANTUM_GATE__CLASSIC_CONTROL = ABSTRACT_COMPOSITE_GATE__CLASSIC_CONTROL;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_QUANTUM_GATE__OPERATIONS = ABSTRACT_COMPOSITE_GATE__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Target Qubits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_QUANTUM_GATE__TARGET_QUBITS = ABSTRACT_COMPOSITE_GATE__TARGET_QUBITS;

	/**
	 * The feature id for the '<em><b>Control Qubits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_QUANTUM_GATE__CONTROL_QUBITS = ABSTRACT_COMPOSITE_GATE__CONTROL_QUBITS;

	/**
	 * The feature id for the '<em><b>Inverse Form</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_QUANTUM_GATE__INVERSE_FORM = ABSTRACT_COMPOSITE_GATE__INVERSE_FORM;

	/**
	 * The feature id for the '<em><b>Layers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_QUANTUM_GATE__LAYERS = ABSTRACT_COMPOSITE_GATE__LAYERS;

	/**
	 * The feature id for the '<em><b>Qubo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_QUANTUM_GATE__QUBO = ABSTRACT_COMPOSITE_GATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Quantum Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_QUANTUM_GATE_FEATURE_COUNT = ABSTRACT_COMPOSITE_GATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Composite Quantum Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_QUANTUM_GATE_OPERATION_COUNT = ABSTRACT_COMPOSITE_GATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qucircuit.impl.AngleParameterImpl <em>Angle Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qucircuit.impl.AngleParameterImpl
	 * @see qucircuit.impl.QucircuitPackageImpl#getAngleParameter()
	 * @generated
	 */
	int ANGLE_PARAMETER = 12;

	/**
	 * The feature id for the '<em><b>Theta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_PARAMETER__THETA = 0;

	/**
	 * The feature id for the '<em><b>Phi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_PARAMETER__PHI = 1;

	/**
	 * The feature id for the '<em><b>Lambda</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_PARAMETER__LAMBDA = 2;

	/**
	 * The number of structural features of the '<em>Angle Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_PARAMETER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Angle Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qucircuit.impl.LoopOperationImpl <em>Loop Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qucircuit.impl.LoopOperationImpl
	 * @see qucircuit.impl.QucircuitPackageImpl#getLoopOperation()
	 * @generated
	 */
	int LOOP_OPERATION = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_OPERATION__NAME = ABSTRACT_COMPOSITE_GATE__NAME;

	/**
	 * The feature id for the '<em><b>Classic Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_OPERATION__CLASSIC_CONTROL = ABSTRACT_COMPOSITE_GATE__CLASSIC_CONTROL;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_OPERATION__OPERATIONS = ABSTRACT_COMPOSITE_GATE__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Target Qubits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_OPERATION__TARGET_QUBITS = ABSTRACT_COMPOSITE_GATE__TARGET_QUBITS;

	/**
	 * The feature id for the '<em><b>Control Qubits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_OPERATION__CONTROL_QUBITS = ABSTRACT_COMPOSITE_GATE__CONTROL_QUBITS;

	/**
	 * The feature id for the '<em><b>Inverse Form</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_OPERATION__INVERSE_FORM = ABSTRACT_COMPOSITE_GATE__INVERSE_FORM;

	/**
	 * The feature id for the '<em><b>Layers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_OPERATION__LAYERS = ABSTRACT_COMPOSITE_GATE__LAYERS;

	/**
	 * The feature id for the '<em><b>Iterations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_OPERATION__ITERATIONS = ABSTRACT_COMPOSITE_GATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fixed Control Qubits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_OPERATION__FIXED_CONTROL_QUBITS = ABSTRACT_COMPOSITE_GATE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fixed Target Qubits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_OPERATION__FIXED_TARGET_QUBITS = ABSTRACT_COMPOSITE_GATE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Loop</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_OPERATION__LOOP = ABSTRACT_COMPOSITE_GATE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Increment Control Qubits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_OPERATION__INCREMENT_CONTROL_QUBITS = ABSTRACT_COMPOSITE_GATE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Increment Target Qubits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_OPERATION__INCREMENT_TARGET_QUBITS = ABSTRACT_COMPOSITE_GATE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Loop Target Qubits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_OPERATION__LOOP_TARGET_QUBITS = ABSTRACT_COMPOSITE_GATE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Loop Control Qubits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_OPERATION__LOOP_CONTROL_QUBITS = ABSTRACT_COMPOSITE_GATE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Target Qubits Block Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_OPERATION__TARGET_QUBITS_BLOCK_SIZE = ABSTRACT_COMPOSITE_GATE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Control Qubits Block Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_OPERATION__CONTROL_QUBITS_BLOCK_SIZE = ABSTRACT_COMPOSITE_GATE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Control Qubits Iteration Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_OPERATION__CONTROL_QUBITS_ITERATION_TYPE = ABSTRACT_COMPOSITE_GATE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Target Qubits Iteration Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_OPERATION__TARGET_QUBITS_ITERATION_TYPE = ABSTRACT_COMPOSITE_GATE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Increment Block Target Qubits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_OPERATION__INCREMENT_BLOCK_TARGET_QUBITS = ABSTRACT_COMPOSITE_GATE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Increment Block Control Qubits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_OPERATION__INCREMENT_BLOCK_CONTROL_QUBITS = ABSTRACT_COMPOSITE_GATE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Increment By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_OPERATION__INCREMENT_BY = ABSTRACT_COMPOSITE_GATE_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Loop Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_OPERATION_FEATURE_COUNT = ABSTRACT_COMPOSITE_GATE_FEATURE_COUNT + 15;

	/**
	 * The number of operations of the '<em>Loop Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_OPERATION_OPERATION_COUNT = ABSTRACT_COMPOSITE_GATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qucircuit.impl.IndexImpl <em>Index</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qucircuit.impl.IndexImpl
	 * @see qucircuit.impl.QucircuitPackageImpl#getIndex()
	 * @generated
	 */
	int INDEX = 15;

	/**
	 * The number of structural features of the '<em>Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qucircuit.impl.IndexIntImpl <em>Index Int</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qucircuit.impl.IndexIntImpl
	 * @see qucircuit.impl.QucircuitPackageImpl#getIndexInt()
	 * @generated
	 */
	int INDEX_INT = 16;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_INT__INDEX = INDEX_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Index Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_INT_FEATURE_COUNT = INDEX_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Index Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_INT_OPERATION_COUNT = INDEX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qucircuit.impl.IndexRangeImpl <em>Index Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qucircuit.impl.IndexRangeImpl
	 * @see qucircuit.impl.QucircuitPackageImpl#getIndexRange()
	 * @generated
	 */
	int INDEX_RANGE = 17;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_RANGE__BEGIN = INDEX_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_RANGE__END = INDEX_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Index Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_RANGE_FEATURE_COUNT = INDEX_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Index Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_RANGE_OPERATION_COUNT = INDEX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qucircuit.ITERATION_TYPE <em>ITERATION TYPE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qucircuit.ITERATION_TYPE
	 * @see qucircuit.impl.QucircuitPackageImpl#getITERATION_TYPE()
	 * @generated
	 */
	int ITERATION_TYPE = 18;


	/**
	 * Returns the meta object for class '{@link qucircuit.QuantumCircuit <em>Quantum Circuit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantum Circuit</em>'.
	 * @see qucircuit.QuantumCircuit
	 * @generated
	 */
	EClass getQuantumCircuit();

	/**
	 * Returns the meta object for the containment reference list '{@link qucircuit.QuantumCircuit#getQuantumRegisters <em>Quantum Registers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Quantum Registers</em>'.
	 * @see qucircuit.QuantumCircuit#getQuantumRegisters()
	 * @see #getQuantumCircuit()
	 * @generated
	 */
	EReference getQuantumCircuit_QuantumRegisters();

	/**
	 * Returns the meta object for the containment reference list '{@link qucircuit.QuantumCircuit#getClassicRegisters <em>Classic Registers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classic Registers</em>'.
	 * @see qucircuit.QuantumCircuit#getClassicRegisters()
	 * @see #getQuantumCircuit()
	 * @generated
	 */
	EReference getQuantumCircuit_ClassicRegisters();

	/**
	 * Returns the meta object for the containment reference list '{@link qucircuit.QuantumCircuit#getLayers <em>Layers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Layers</em>'.
	 * @see qucircuit.QuantumCircuit#getLayers()
	 * @see #getQuantumCircuit()
	 * @generated
	 */
	EReference getQuantumCircuit_Layers();

	/**
	 * Returns the meta object for class '{@link qucircuit.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see qucircuit.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link qucircuit.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see qucircuit.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link qucircuit.QuantumRegister <em>Quantum Register</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantum Register</em>'.
	 * @see qucircuit.QuantumRegister
	 * @generated
	 */
	EClass getQuantumRegister();

	/**
	 * Returns the meta object for the attribute '{@link qucircuit.QuantumRegister#getNumberOfQubits <em>Number Of Qubits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Qubits</em>'.
	 * @see qucircuit.QuantumRegister#getNumberOfQubits()
	 * @see #getQuantumRegister()
	 * @generated
	 */
	EAttribute getQuantumRegister_NumberOfQubits();

	/**
	 * Returns the meta object for class '{@link qucircuit.ClassicRegister <em>Classic Register</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classic Register</em>'.
	 * @see qucircuit.ClassicRegister
	 * @generated
	 */
	EClass getClassicRegister();

	/**
	 * Returns the meta object for the attribute '{@link qucircuit.ClassicRegister#getNumberOfBits <em>Number Of Bits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Bits</em>'.
	 * @see qucircuit.ClassicRegister#getNumberOfBits()
	 * @see #getClassicRegister()
	 * @generated
	 */
	EAttribute getClassicRegister_NumberOfBits();

	/**
	 * Returns the meta object for class '{@link qucircuit.Layer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layer</em>'.
	 * @see qucircuit.Layer
	 * @generated
	 */
	EClass getLayer();

	/**
	 * Returns the meta object for the containment reference list '{@link qucircuit.Layer#getQuantumOperations <em>Quantum Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Quantum Operations</em>'.
	 * @see qucircuit.Layer#getQuantumOperations()
	 * @see #getLayer()
	 * @generated
	 */
	EReference getLayer_QuantumOperations();

	/**
	 * Returns the meta object for class '{@link qucircuit.ClassicControl <em>Classic Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classic Control</em>'.
	 * @see qucircuit.ClassicControl
	 * @generated
	 */
	EClass getClassicControl();

	/**
	 * Returns the meta object for the attribute '{@link qucircuit.ClassicControl#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see qucircuit.ClassicControl#getValue()
	 * @see #getClassicControl()
	 * @generated
	 */
	EAttribute getClassicControl_Value();

	/**
	 * Returns the meta object for the reference '{@link qucircuit.ClassicControl#getClassicRegister <em>Classic Register</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Classic Register</em>'.
	 * @see qucircuit.ClassicControl#getClassicRegister()
	 * @see #getClassicControl()
	 * @generated
	 */
	EReference getClassicControl_ClassicRegister();

	/**
	 * Returns the meta object for class '{@link qucircuit.QuantumOperation <em>Quantum Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantum Operation</em>'.
	 * @see qucircuit.QuantumOperation
	 * @generated
	 */
	EClass getQuantumOperation();

	/**
	 * Returns the meta object for the containment reference '{@link qucircuit.QuantumOperation#getClassicControl <em>Classic Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Classic Control</em>'.
	 * @see qucircuit.QuantumOperation#getClassicControl()
	 * @see #getQuantumOperation()
	 * @generated
	 */
	EReference getQuantumOperation_ClassicControl();

	/**
	 * Returns the meta object for the reference list '{@link qucircuit.QuantumOperation#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Operations</em>'.
	 * @see qucircuit.QuantumOperation#getOperations()
	 * @see #getQuantumOperation()
	 * @generated
	 */
	EReference getQuantumOperation_Operations();

	/**
	 * Returns the meta object for the containment reference list '{@link qucircuit.QuantumOperation#getTargetQubits <em>Target Qubits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target Qubits</em>'.
	 * @see qucircuit.QuantumOperation#getTargetQubits()
	 * @see #getQuantumOperation()
	 * @generated
	 */
	EReference getQuantumOperation_TargetQubits();

	/**
	 * Returns the meta object for class '{@link qucircuit.AbstractQuantumGate <em>Abstract Quantum Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Quantum Gate</em>'.
	 * @see qucircuit.AbstractQuantumGate
	 * @generated
	 */
	EClass getAbstractQuantumGate();

	/**
	 * Returns the meta object for the containment reference list '{@link qucircuit.AbstractQuantumGate#getControlQubits <em>Control Qubits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Control Qubits</em>'.
	 * @see qucircuit.AbstractQuantumGate#getControlQubits()
	 * @see #getAbstractQuantumGate()
	 * @generated
	 */
	EReference getAbstractQuantumGate_ControlQubits();

	/**
	 * Returns the meta object for the attribute '{@link qucircuit.AbstractQuantumGate#getInverseForm <em>Inverse Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inverse Form</em>'.
	 * @see qucircuit.AbstractQuantumGate#getInverseForm()
	 * @see #getAbstractQuantumGate()
	 * @generated
	 */
	EAttribute getAbstractQuantumGate_InverseForm();

	/**
	 * Returns the meta object for class '{@link qucircuit.StatePreparation <em>State Preparation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Preparation</em>'.
	 * @see qucircuit.StatePreparation
	 * @generated
	 */
	EClass getStatePreparation();

	/**
	 * Returns the meta object for class '{@link qucircuit.Measurement <em>Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measurement</em>'.
	 * @see qucircuit.Measurement
	 * @generated
	 */
	EClass getMeasurement();

	/**
	 * Returns the meta object for the containment reference list '{@link qucircuit.Measurement#getClassicBits <em>Classic Bits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classic Bits</em>'.
	 * @see qucircuit.Measurement#getClassicBits()
	 * @see #getMeasurement()
	 * @generated
	 */
	EReference getMeasurement_ClassicBits();

	/**
	 * Returns the meta object for class '{@link qucircuit.ElementaryQuantumGate <em>Elementary Quantum Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elementary Quantum Gate</em>'.
	 * @see qucircuit.ElementaryQuantumGate
	 * @generated
	 */
	EClass getElementaryQuantumGate();

	/**
	 * Returns the meta object for the containment reference '{@link qucircuit.ElementaryQuantumGate#getAngleParameter <em>Angle Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Angle Parameter</em>'.
	 * @see qucircuit.ElementaryQuantumGate#getAngleParameter()
	 * @see #getElementaryQuantumGate()
	 * @generated
	 */
	EReference getElementaryQuantumGate_AngleParameter();

	/**
	 * Returns the meta object for class '{@link qucircuit.CompositeQuantumGate <em>Composite Quantum Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Quantum Gate</em>'.
	 * @see qucircuit.CompositeQuantumGate
	 * @generated
	 */
	EClass getCompositeQuantumGate();

	/**
	 * Returns the meta object for the reference '{@link qucircuit.CompositeQuantumGate#getQubo <em>Qubo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Qubo</em>'.
	 * @see qucircuit.CompositeQuantumGate#getQubo()
	 * @see #getCompositeQuantumGate()
	 * @generated
	 */
	EReference getCompositeQuantumGate_Qubo();

	/**
	 * Returns the meta object for class '{@link qucircuit.AngleParameter <em>Angle Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Angle Parameter</em>'.
	 * @see qucircuit.AngleParameter
	 * @generated
	 */
	EClass getAngleParameter();

	/**
	 * Returns the meta object for the attribute '{@link qucircuit.AngleParameter#getTheta <em>Theta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Theta</em>'.
	 * @see qucircuit.AngleParameter#getTheta()
	 * @see #getAngleParameter()
	 * @generated
	 */
	EAttribute getAngleParameter_Theta();

	/**
	 * Returns the meta object for the attribute '{@link qucircuit.AngleParameter#getPhi <em>Phi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phi</em>'.
	 * @see qucircuit.AngleParameter#getPhi()
	 * @see #getAngleParameter()
	 * @generated
	 */
	EAttribute getAngleParameter_Phi();

	/**
	 * Returns the meta object for the attribute '{@link qucircuit.AngleParameter#getLambda <em>Lambda</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lambda</em>'.
	 * @see qucircuit.AngleParameter#getLambda()
	 * @see #getAngleParameter()
	 * @generated
	 */
	EAttribute getAngleParameter_Lambda();

	/**
	 * Returns the meta object for class '{@link qucircuit.AbstractCompositeGate <em>Abstract Composite Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Composite Gate</em>'.
	 * @see qucircuit.AbstractCompositeGate
	 * @generated
	 */
	EClass getAbstractCompositeGate();

	/**
	 * Returns the meta object for the containment reference list '{@link qucircuit.AbstractCompositeGate#getLayers <em>Layers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Layers</em>'.
	 * @see qucircuit.AbstractCompositeGate#getLayers()
	 * @see #getAbstractCompositeGate()
	 * @generated
	 */
	EReference getAbstractCompositeGate_Layers();

	/**
	 * Returns the meta object for class '{@link qucircuit.LoopOperation <em>Loop Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop Operation</em>'.
	 * @see qucircuit.LoopOperation
	 * @generated
	 */
	EClass getLoopOperation();

	/**
	 * Returns the meta object for the attribute '{@link qucircuit.LoopOperation#getIterations <em>Iterations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iterations</em>'.
	 * @see qucircuit.LoopOperation#getIterations()
	 * @see #getLoopOperation()
	 * @generated
	 */
	EAttribute getLoopOperation_Iterations();

	/**
	 * Returns the meta object for the containment reference list '{@link qucircuit.LoopOperation#getFixedControlQubits <em>Fixed Control Qubits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fixed Control Qubits</em>'.
	 * @see qucircuit.LoopOperation#getFixedControlQubits()
	 * @see #getLoopOperation()
	 * @generated
	 */
	EReference getLoopOperation_FixedControlQubits();

	/**
	 * Returns the meta object for the containment reference list '{@link qucircuit.LoopOperation#getFixedTargetQubits <em>Fixed Target Qubits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fixed Target Qubits</em>'.
	 * @see qucircuit.LoopOperation#getFixedTargetQubits()
	 * @see #getLoopOperation()
	 * @generated
	 */
	EReference getLoopOperation_FixedTargetQubits();

	/**
	 * Returns the meta object for the reference '{@link qucircuit.LoopOperation#getLoop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Loop</em>'.
	 * @see qucircuit.LoopOperation#getLoop()
	 * @see #getLoopOperation()
	 * @generated
	 */
	EReference getLoopOperation_Loop();

	/**
	 * Returns the meta object for the attribute '{@link qucircuit.LoopOperation#getIncrementControlQubits <em>Increment Control Qubits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Increment Control Qubits</em>'.
	 * @see qucircuit.LoopOperation#getIncrementControlQubits()
	 * @see #getLoopOperation()
	 * @generated
	 */
	EAttribute getLoopOperation_IncrementControlQubits();

	/**
	 * Returns the meta object for the attribute '{@link qucircuit.LoopOperation#getIncrementTargetQubits <em>Increment Target Qubits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Increment Target Qubits</em>'.
	 * @see qucircuit.LoopOperation#getIncrementTargetQubits()
	 * @see #getLoopOperation()
	 * @generated
	 */
	EAttribute getLoopOperation_IncrementTargetQubits();

	/**
	 * Returns the meta object for the containment reference list '{@link qucircuit.LoopOperation#getLoopTargetQubits <em>Loop Target Qubits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Loop Target Qubits</em>'.
	 * @see qucircuit.LoopOperation#getLoopTargetQubits()
	 * @see #getLoopOperation()
	 * @generated
	 */
	EReference getLoopOperation_LoopTargetQubits();

	/**
	 * Returns the meta object for the containment reference list '{@link qucircuit.LoopOperation#getLoopControlQubits <em>Loop Control Qubits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Loop Control Qubits</em>'.
	 * @see qucircuit.LoopOperation#getLoopControlQubits()
	 * @see #getLoopOperation()
	 * @generated
	 */
	EReference getLoopOperation_LoopControlQubits();

	/**
	 * Returns the meta object for the attribute '{@link qucircuit.LoopOperation#getTargetQubitsBlockSize <em>Target Qubits Block Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Qubits Block Size</em>'.
	 * @see qucircuit.LoopOperation#getTargetQubitsBlockSize()
	 * @see #getLoopOperation()
	 * @generated
	 */
	EAttribute getLoopOperation_TargetQubitsBlockSize();

	/**
	 * Returns the meta object for the attribute '{@link qucircuit.LoopOperation#getControlQubitsBlockSize <em>Control Qubits Block Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control Qubits Block Size</em>'.
	 * @see qucircuit.LoopOperation#getControlQubitsBlockSize()
	 * @see #getLoopOperation()
	 * @generated
	 */
	EAttribute getLoopOperation_ControlQubitsBlockSize();

	/**
	 * Returns the meta object for the attribute '{@link qucircuit.LoopOperation#getControlQubitsIterationType <em>Control Qubits Iteration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Control Qubits Iteration Type</em>'.
	 * @see qucircuit.LoopOperation#getControlQubitsIterationType()
	 * @see #getLoopOperation()
	 * @generated
	 */
	EAttribute getLoopOperation_ControlQubitsIterationType();

	/**
	 * Returns the meta object for the attribute '{@link qucircuit.LoopOperation#getTargetQubitsIterationType <em>Target Qubits Iteration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Qubits Iteration Type</em>'.
	 * @see qucircuit.LoopOperation#getTargetQubitsIterationType()
	 * @see #getLoopOperation()
	 * @generated
	 */
	EAttribute getLoopOperation_TargetQubitsIterationType();

	/**
	 * Returns the meta object for the attribute '{@link qucircuit.LoopOperation#getIncrementBlockTargetQubits <em>Increment Block Target Qubits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Increment Block Target Qubits</em>'.
	 * @see qucircuit.LoopOperation#getIncrementBlockTargetQubits()
	 * @see #getLoopOperation()
	 * @generated
	 */
	EAttribute getLoopOperation_IncrementBlockTargetQubits();

	/**
	 * Returns the meta object for the attribute '{@link qucircuit.LoopOperation#getIncrementBlockControlQubits <em>Increment Block Control Qubits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Increment Block Control Qubits</em>'.
	 * @see qucircuit.LoopOperation#getIncrementBlockControlQubits()
	 * @see #getLoopOperation()
	 * @generated
	 */
	EAttribute getLoopOperation_IncrementBlockControlQubits();

	/**
	 * Returns the meta object for the attribute '{@link qucircuit.LoopOperation#getIncrementBy <em>Increment By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Increment By</em>'.
	 * @see qucircuit.LoopOperation#getIncrementBy()
	 * @see #getLoopOperation()
	 * @generated
	 */
	EAttribute getLoopOperation_IncrementBy();

	/**
	 * Returns the meta object for class '{@link qucircuit.Index <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index</em>'.
	 * @see qucircuit.Index
	 * @generated
	 */
	EClass getIndex();

	/**
	 * Returns the meta object for class '{@link qucircuit.IndexInt <em>Index Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index Int</em>'.
	 * @see qucircuit.IndexInt
	 * @generated
	 */
	EClass getIndexInt();

	/**
	 * Returns the meta object for the attribute '{@link qucircuit.IndexInt#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see qucircuit.IndexInt#getIndex()
	 * @see #getIndexInt()
	 * @generated
	 */
	EAttribute getIndexInt_Index();

	/**
	 * Returns the meta object for class '{@link qucircuit.IndexRange <em>Index Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index Range</em>'.
	 * @see qucircuit.IndexRange
	 * @generated
	 */
	EClass getIndexRange();

	/**
	 * Returns the meta object for the attribute '{@link qucircuit.IndexRange#getBegin <em>Begin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Begin</em>'.
	 * @see qucircuit.IndexRange#getBegin()
	 * @see #getIndexRange()
	 * @generated
	 */
	EAttribute getIndexRange_Begin();

	/**
	 * Returns the meta object for the attribute '{@link qucircuit.IndexRange#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see qucircuit.IndexRange#getEnd()
	 * @see #getIndexRange()
	 * @generated
	 */
	EAttribute getIndexRange_End();

	/**
	 * Returns the meta object for enum '{@link qucircuit.ITERATION_TYPE <em>ITERATION TYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ITERATION TYPE</em>'.
	 * @see qucircuit.ITERATION_TYPE
	 * @generated
	 */
	EEnum getITERATION_TYPE();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QucircuitFactory getQucircuitFactory();

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
		 * The meta object literal for the '{@link qucircuit.impl.QuantumCircuitImpl <em>Quantum Circuit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qucircuit.impl.QuantumCircuitImpl
		 * @see qucircuit.impl.QucircuitPackageImpl#getQuantumCircuit()
		 * @generated
		 */
		EClass QUANTUM_CIRCUIT = eINSTANCE.getQuantumCircuit();

		/**
		 * The meta object literal for the '<em><b>Quantum Registers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTUM_CIRCUIT__QUANTUM_REGISTERS = eINSTANCE.getQuantumCircuit_QuantumRegisters();

		/**
		 * The meta object literal for the '<em><b>Classic Registers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTUM_CIRCUIT__CLASSIC_REGISTERS = eINSTANCE.getQuantumCircuit_ClassicRegisters();

		/**
		 * The meta object literal for the '<em><b>Layers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTUM_CIRCUIT__LAYERS = eINSTANCE.getQuantumCircuit_Layers();

		/**
		 * The meta object literal for the '{@link qucircuit.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qucircuit.impl.NamedElementImpl
		 * @see qucircuit.impl.QucircuitPackageImpl#getNamedElement()
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
		 * The meta object literal for the '{@link qucircuit.impl.QuantumRegisterImpl <em>Quantum Register</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qucircuit.impl.QuantumRegisterImpl
		 * @see qucircuit.impl.QucircuitPackageImpl#getQuantumRegister()
		 * @generated
		 */
		EClass QUANTUM_REGISTER = eINSTANCE.getQuantumRegister();

		/**
		 * The meta object literal for the '<em><b>Number Of Qubits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTUM_REGISTER__NUMBER_OF_QUBITS = eINSTANCE.getQuantumRegister_NumberOfQubits();

		/**
		 * The meta object literal for the '{@link qucircuit.impl.ClassicRegisterImpl <em>Classic Register</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qucircuit.impl.ClassicRegisterImpl
		 * @see qucircuit.impl.QucircuitPackageImpl#getClassicRegister()
		 * @generated
		 */
		EClass CLASSIC_REGISTER = eINSTANCE.getClassicRegister();

		/**
		 * The meta object literal for the '<em><b>Number Of Bits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIC_REGISTER__NUMBER_OF_BITS = eINSTANCE.getClassicRegister_NumberOfBits();

		/**
		 * The meta object literal for the '{@link qucircuit.impl.LayerImpl <em>Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qucircuit.impl.LayerImpl
		 * @see qucircuit.impl.QucircuitPackageImpl#getLayer()
		 * @generated
		 */
		EClass LAYER = eINSTANCE.getLayer();

		/**
		 * The meta object literal for the '<em><b>Quantum Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYER__QUANTUM_OPERATIONS = eINSTANCE.getLayer_QuantumOperations();

		/**
		 * The meta object literal for the '{@link qucircuit.impl.ClassicControlImpl <em>Classic Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qucircuit.impl.ClassicControlImpl
		 * @see qucircuit.impl.QucircuitPackageImpl#getClassicControl()
		 * @generated
		 */
		EClass CLASSIC_CONTROL = eINSTANCE.getClassicControl();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIC_CONTROL__VALUE = eINSTANCE.getClassicControl_Value();

		/**
		 * The meta object literal for the '<em><b>Classic Register</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIC_CONTROL__CLASSIC_REGISTER = eINSTANCE.getClassicControl_ClassicRegister();

		/**
		 * The meta object literal for the '{@link qucircuit.impl.QuantumOperationImpl <em>Quantum Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qucircuit.impl.QuantumOperationImpl
		 * @see qucircuit.impl.QucircuitPackageImpl#getQuantumOperation()
		 * @generated
		 */
		EClass QUANTUM_OPERATION = eINSTANCE.getQuantumOperation();

		/**
		 * The meta object literal for the '<em><b>Classic Control</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTUM_OPERATION__CLASSIC_CONTROL = eINSTANCE.getQuantumOperation_ClassicControl();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTUM_OPERATION__OPERATIONS = eINSTANCE.getQuantumOperation_Operations();

		/**
		 * The meta object literal for the '<em><b>Target Qubits</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTUM_OPERATION__TARGET_QUBITS = eINSTANCE.getQuantumOperation_TargetQubits();

		/**
		 * The meta object literal for the '{@link qucircuit.impl.AbstractQuantumGateImpl <em>Abstract Quantum Gate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qucircuit.impl.AbstractQuantumGateImpl
		 * @see qucircuit.impl.QucircuitPackageImpl#getAbstractQuantumGate()
		 * @generated
		 */
		EClass ABSTRACT_QUANTUM_GATE = eINSTANCE.getAbstractQuantumGate();

		/**
		 * The meta object literal for the '<em><b>Control Qubits</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_QUANTUM_GATE__CONTROL_QUBITS = eINSTANCE.getAbstractQuantumGate_ControlQubits();

		/**
		 * The meta object literal for the '<em><b>Inverse Form</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_QUANTUM_GATE__INVERSE_FORM = eINSTANCE.getAbstractQuantumGate_InverseForm();

		/**
		 * The meta object literal for the '{@link qucircuit.impl.StatePreparationImpl <em>State Preparation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qucircuit.impl.StatePreparationImpl
		 * @see qucircuit.impl.QucircuitPackageImpl#getStatePreparation()
		 * @generated
		 */
		EClass STATE_PREPARATION = eINSTANCE.getStatePreparation();

		/**
		 * The meta object literal for the '{@link qucircuit.impl.MeasurementImpl <em>Measurement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qucircuit.impl.MeasurementImpl
		 * @see qucircuit.impl.QucircuitPackageImpl#getMeasurement()
		 * @generated
		 */
		EClass MEASUREMENT = eINSTANCE.getMeasurement();

		/**
		 * The meta object literal for the '<em><b>Classic Bits</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASUREMENT__CLASSIC_BITS = eINSTANCE.getMeasurement_ClassicBits();

		/**
		 * The meta object literal for the '{@link qucircuit.impl.ElementaryQuantumGateImpl <em>Elementary Quantum Gate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qucircuit.impl.ElementaryQuantumGateImpl
		 * @see qucircuit.impl.QucircuitPackageImpl#getElementaryQuantumGate()
		 * @generated
		 */
		EClass ELEMENTARY_QUANTUM_GATE = eINSTANCE.getElementaryQuantumGate();

		/**
		 * The meta object literal for the '<em><b>Angle Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENTARY_QUANTUM_GATE__ANGLE_PARAMETER = eINSTANCE.getElementaryQuantumGate_AngleParameter();

		/**
		 * The meta object literal for the '{@link qucircuit.impl.CompositeQuantumGateImpl <em>Composite Quantum Gate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qucircuit.impl.CompositeQuantumGateImpl
		 * @see qucircuit.impl.QucircuitPackageImpl#getCompositeQuantumGate()
		 * @generated
		 */
		EClass COMPOSITE_QUANTUM_GATE = eINSTANCE.getCompositeQuantumGate();

		/**
		 * The meta object literal for the '<em><b>Qubo</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_QUANTUM_GATE__QUBO = eINSTANCE.getCompositeQuantumGate_Qubo();

		/**
		 * The meta object literal for the '{@link qucircuit.impl.AngleParameterImpl <em>Angle Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qucircuit.impl.AngleParameterImpl
		 * @see qucircuit.impl.QucircuitPackageImpl#getAngleParameter()
		 * @generated
		 */
		EClass ANGLE_PARAMETER = eINSTANCE.getAngleParameter();

		/**
		 * The meta object literal for the '<em><b>Theta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGLE_PARAMETER__THETA = eINSTANCE.getAngleParameter_Theta();

		/**
		 * The meta object literal for the '<em><b>Phi</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGLE_PARAMETER__PHI = eINSTANCE.getAngleParameter_Phi();

		/**
		 * The meta object literal for the '<em><b>Lambda</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGLE_PARAMETER__LAMBDA = eINSTANCE.getAngleParameter_Lambda();

		/**
		 * The meta object literal for the '{@link qucircuit.impl.AbstractCompositeGateImpl <em>Abstract Composite Gate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qucircuit.impl.AbstractCompositeGateImpl
		 * @see qucircuit.impl.QucircuitPackageImpl#getAbstractCompositeGate()
		 * @generated
		 */
		EClass ABSTRACT_COMPOSITE_GATE = eINSTANCE.getAbstractCompositeGate();

		/**
		 * The meta object literal for the '<em><b>Layers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_COMPOSITE_GATE__LAYERS = eINSTANCE.getAbstractCompositeGate_Layers();

		/**
		 * The meta object literal for the '{@link qucircuit.impl.LoopOperationImpl <em>Loop Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qucircuit.impl.LoopOperationImpl
		 * @see qucircuit.impl.QucircuitPackageImpl#getLoopOperation()
		 * @generated
		 */
		EClass LOOP_OPERATION = eINSTANCE.getLoopOperation();

		/**
		 * The meta object literal for the '<em><b>Iterations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOP_OPERATION__ITERATIONS = eINSTANCE.getLoopOperation_Iterations();

		/**
		 * The meta object literal for the '<em><b>Fixed Control Qubits</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP_OPERATION__FIXED_CONTROL_QUBITS = eINSTANCE.getLoopOperation_FixedControlQubits();

		/**
		 * The meta object literal for the '<em><b>Fixed Target Qubits</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP_OPERATION__FIXED_TARGET_QUBITS = eINSTANCE.getLoopOperation_FixedTargetQubits();

		/**
		 * The meta object literal for the '<em><b>Loop</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP_OPERATION__LOOP = eINSTANCE.getLoopOperation_Loop();

		/**
		 * The meta object literal for the '<em><b>Increment Control Qubits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOP_OPERATION__INCREMENT_CONTROL_QUBITS = eINSTANCE.getLoopOperation_IncrementControlQubits();

		/**
		 * The meta object literal for the '<em><b>Increment Target Qubits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOP_OPERATION__INCREMENT_TARGET_QUBITS = eINSTANCE.getLoopOperation_IncrementTargetQubits();

		/**
		 * The meta object literal for the '<em><b>Loop Target Qubits</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP_OPERATION__LOOP_TARGET_QUBITS = eINSTANCE.getLoopOperation_LoopTargetQubits();

		/**
		 * The meta object literal for the '<em><b>Loop Control Qubits</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP_OPERATION__LOOP_CONTROL_QUBITS = eINSTANCE.getLoopOperation_LoopControlQubits();

		/**
		 * The meta object literal for the '<em><b>Target Qubits Block Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOP_OPERATION__TARGET_QUBITS_BLOCK_SIZE = eINSTANCE.getLoopOperation_TargetQubitsBlockSize();

		/**
		 * The meta object literal for the '<em><b>Control Qubits Block Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOP_OPERATION__CONTROL_QUBITS_BLOCK_SIZE = eINSTANCE.getLoopOperation_ControlQubitsBlockSize();

		/**
		 * The meta object literal for the '<em><b>Control Qubits Iteration Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOP_OPERATION__CONTROL_QUBITS_ITERATION_TYPE = eINSTANCE.getLoopOperation_ControlQubitsIterationType();

		/**
		 * The meta object literal for the '<em><b>Target Qubits Iteration Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOP_OPERATION__TARGET_QUBITS_ITERATION_TYPE = eINSTANCE.getLoopOperation_TargetQubitsIterationType();

		/**
		 * The meta object literal for the '<em><b>Increment Block Target Qubits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOP_OPERATION__INCREMENT_BLOCK_TARGET_QUBITS = eINSTANCE.getLoopOperation_IncrementBlockTargetQubits();

		/**
		 * The meta object literal for the '<em><b>Increment Block Control Qubits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOP_OPERATION__INCREMENT_BLOCK_CONTROL_QUBITS = eINSTANCE.getLoopOperation_IncrementBlockControlQubits();

		/**
		 * The meta object literal for the '<em><b>Increment By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOP_OPERATION__INCREMENT_BY = eINSTANCE.getLoopOperation_IncrementBy();

		/**
		 * The meta object literal for the '{@link qucircuit.impl.IndexImpl <em>Index</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qucircuit.impl.IndexImpl
		 * @see qucircuit.impl.QucircuitPackageImpl#getIndex()
		 * @generated
		 */
		EClass INDEX = eINSTANCE.getIndex();

		/**
		 * The meta object literal for the '{@link qucircuit.impl.IndexIntImpl <em>Index Int</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qucircuit.impl.IndexIntImpl
		 * @see qucircuit.impl.QucircuitPackageImpl#getIndexInt()
		 * @generated
		 */
		EClass INDEX_INT = eINSTANCE.getIndexInt();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_INT__INDEX = eINSTANCE.getIndexInt_Index();

		/**
		 * The meta object literal for the '{@link qucircuit.impl.IndexRangeImpl <em>Index Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qucircuit.impl.IndexRangeImpl
		 * @see qucircuit.impl.QucircuitPackageImpl#getIndexRange()
		 * @generated
		 */
		EClass INDEX_RANGE = eINSTANCE.getIndexRange();

		/**
		 * The meta object literal for the '<em><b>Begin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_RANGE__BEGIN = eINSTANCE.getIndexRange_Begin();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX_RANGE__END = eINSTANCE.getIndexRange_End();

		/**
		 * The meta object literal for the '{@link qucircuit.ITERATION_TYPE <em>ITERATION TYPE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qucircuit.ITERATION_TYPE
		 * @see qucircuit.impl.QucircuitPackageImpl#getITERATION_TYPE()
		 * @generated
		 */
		EEnum ITERATION_TYPE = eINSTANCE.getITERATION_TYPE();

	}

} //QucircuitPackage
