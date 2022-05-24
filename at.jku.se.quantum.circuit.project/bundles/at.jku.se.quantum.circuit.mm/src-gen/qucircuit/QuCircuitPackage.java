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
 * @see qucircuit.QuCircuitFactory
 * @model kind="package"
 * @generated
 */
public interface QuCircuitPackage extends EPackage {
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
	String eNS_URI = "http://www.se.jku.at/QuCircuit";

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
	QuCircuitPackage eINSTANCE = qucircuit.impl.QuCircuitPackageImpl.init();

	/**
	 * The meta object id for the '{@link qucircuit.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qucircuit.impl.NamedElementImpl
	 * @see qucircuit.impl.QuCircuitPackageImpl#getNamedElement()
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
	 * @see qucircuit.impl.QuCircuitPackageImpl#getQuantumCircuit()
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
	 * @see qucircuit.impl.QuCircuitPackageImpl#getQuantumRegister()
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
	 * The feature id for the '<em><b>Qubits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTUM_REGISTER__QUBITS = NAMED_ELEMENT_FEATURE_COUNT + 0;

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
	 * @see qucircuit.impl.QuCircuitPackageImpl#getClassicRegister()
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
	 * The feature id for the '<em><b>Classic Bits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIC_REGISTER__CLASSIC_BITS = NAMED_ELEMENT_FEATURE_COUNT + 0;

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
	 * The meta object id for the '{@link qucircuit.impl.BitImpl <em>Bit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qucircuit.impl.BitImpl
	 * @see qucircuit.impl.QuCircuitPackageImpl#getBit()
	 * @generated
	 */
	int BIT = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT__ID = 0;

	/**
	 * The number of structural features of the '<em>Bit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Bit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link qucircuit.impl.QubitImpl <em>Qubit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qucircuit.impl.QubitImpl
	 * @see qucircuit.impl.QuCircuitPackageImpl#getQubit()
	 * @generated
	 */
	int QUBIT = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUBIT__ID = BIT__ID;

	/**
	 * The number of structural features of the '<em>Qubit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUBIT_FEATURE_COUNT = BIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Qubit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUBIT_OPERATION_COUNT = BIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qucircuit.impl.ClassicBitImpl <em>Classic Bit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qucircuit.impl.ClassicBitImpl
	 * @see qucircuit.impl.QuCircuitPackageImpl#getClassicBit()
	 * @generated
	 */
	int CLASSIC_BIT = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIC_BIT__ID = BIT__ID;

	/**
	 * The number of structural features of the '<em>Classic Bit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIC_BIT_FEATURE_COUNT = BIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Classic Bit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIC_BIT_OPERATION_COUNT = BIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qucircuit.impl.LayerImpl <em>Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qucircuit.impl.LayerImpl
	 * @see qucircuit.impl.QuCircuitPackageImpl#getLayer()
	 * @generated
	 */
	int LAYER = 6;

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
	 * @see qucircuit.impl.QuCircuitPackageImpl#getClassicControl()
	 * @generated
	 */
	int CLASSIC_CONTROL = 7;

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
	 * @see qucircuit.impl.QuCircuitPackageImpl#getQuantumOperation()
	 * @generated
	 */
	int QUANTUM_OPERATION = 8;

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
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTUM_OPERATION__OPERATION = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Qubits</b></em>' reference list.
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
	 * @see qucircuit.impl.QuCircuitPackageImpl#getAbstractQuantumGate()
	 * @generated
	 */
	int ABSTRACT_QUANTUM_GATE = 9;

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
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_QUANTUM_GATE__OPERATION = QUANTUM_OPERATION__OPERATION;

	/**
	 * The feature id for the '<em><b>Target Qubits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_QUANTUM_GATE__TARGET_QUBITS = QUANTUM_OPERATION__TARGET_QUBITS;

	/**
	 * The feature id for the '<em><b>Control Qubits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_QUANTUM_GATE__CONTROL_QUBITS = QUANTUM_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Quantum Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_QUANTUM_GATE_FEATURE_COUNT = QUANTUM_OPERATION_FEATURE_COUNT + 1;

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
	 * @see qucircuit.impl.QuCircuitPackageImpl#getStatePreparation()
	 * @generated
	 */
	int STATE_PREPARATION = 10;

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
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_PREPARATION__OPERATION = QUANTUM_OPERATION__OPERATION;

	/**
	 * The feature id for the '<em><b>Target Qubits</b></em>' reference list.
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
	 * @see qucircuit.impl.QuCircuitPackageImpl#getMeasurement()
	 * @generated
	 */
	int MEASUREMENT = 11;

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
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__OPERATION = QUANTUM_OPERATION__OPERATION;

	/**
	 * The feature id for the '<em><b>Target Qubits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASUREMENT__TARGET_QUBITS = QUANTUM_OPERATION__TARGET_QUBITS;

	/**
	 * The feature id for the '<em><b>Classic Bits</b></em>' reference list.
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
	 * @see qucircuit.impl.QuCircuitPackageImpl#getElementaryQuantumGate()
	 * @generated
	 */
	int ELEMENTARY_QUANTUM_GATE = 12;

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
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_QUANTUM_GATE__OPERATION = ABSTRACT_QUANTUM_GATE__OPERATION;

	/**
	 * The feature id for the '<em><b>Target Qubits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_QUANTUM_GATE__TARGET_QUBITS = ABSTRACT_QUANTUM_GATE__TARGET_QUBITS;

	/**
	 * The feature id for the '<em><b>Control Qubits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTARY_QUANTUM_GATE__CONTROL_QUBITS = ABSTRACT_QUANTUM_GATE__CONTROL_QUBITS;

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
	 * @see qucircuit.impl.QuCircuitPackageImpl#getAbstractCompositeGate()
	 * @generated
	 */
	int ABSTRACT_COMPOSITE_GATE = 16;

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
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPOSITE_GATE__OPERATION = ABSTRACT_QUANTUM_GATE__OPERATION;

	/**
	 * The feature id for the '<em><b>Target Qubits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPOSITE_GATE__TARGET_QUBITS = ABSTRACT_QUANTUM_GATE__TARGET_QUBITS;

	/**
	 * The feature id for the '<em><b>Control Qubits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPOSITE_GATE__CONTROL_QUBITS = ABSTRACT_QUANTUM_GATE__CONTROL_QUBITS;

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
	 * @see qucircuit.impl.QuCircuitPackageImpl#getCompositeQuantumGate()
	 * @generated
	 */
	int COMPOSITE_QUANTUM_GATE = 13;

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
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_QUANTUM_GATE__OPERATION = ABSTRACT_COMPOSITE_GATE__OPERATION;

	/**
	 * The feature id for the '<em><b>Target Qubits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_QUANTUM_GATE__TARGET_QUBITS = ABSTRACT_COMPOSITE_GATE__TARGET_QUBITS;

	/**
	 * The feature id for the '<em><b>Control Qubits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_QUANTUM_GATE__CONTROL_QUBITS = ABSTRACT_COMPOSITE_GATE__CONTROL_QUBITS;

	/**
	 * The feature id for the '<em><b>Layers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_QUANTUM_GATE__LAYERS = ABSTRACT_COMPOSITE_GATE__LAYERS;

	/**
	 * The number of structural features of the '<em>Composite Quantum Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_QUANTUM_GATE_FEATURE_COUNT = ABSTRACT_COMPOSITE_GATE_FEATURE_COUNT + 0;

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
	 * @see qucircuit.impl.QuCircuitPackageImpl#getAngleParameter()
	 * @generated
	 */
	int ANGLE_PARAMETER = 14;

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
	 * The meta object id for the '{@link qucircuit.impl.LoopImpl <em>Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qucircuit.impl.LoopImpl
	 * @see qucircuit.impl.QuCircuitPackageImpl#getLoop()
	 * @generated
	 */
	int LOOP = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__NAME = ABSTRACT_COMPOSITE_GATE__NAME;

	/**
	 * The feature id for the '<em><b>Classic Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__CLASSIC_CONTROL = ABSTRACT_COMPOSITE_GATE__CLASSIC_CONTROL;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__OPERATION = ABSTRACT_COMPOSITE_GATE__OPERATION;

	/**
	 * The feature id for the '<em><b>Target Qubits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__TARGET_QUBITS = ABSTRACT_COMPOSITE_GATE__TARGET_QUBITS;

	/**
	 * The feature id for the '<em><b>Control Qubits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__CONTROL_QUBITS = ABSTRACT_COMPOSITE_GATE__CONTROL_QUBITS;

	/**
	 * The feature id for the '<em><b>Layers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__LAYERS = ABSTRACT_COMPOSITE_GATE__LAYERS;

	/**
	 * The feature id for the '<em><b>Iterations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__ITERATIONS = ABSTRACT_COMPOSITE_GATE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Loop Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__LOOP_KIND = ABSTRACT_COMPOSITE_GATE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__INCREMENT = ABSTRACT_COMPOSITE_GATE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_FEATURE_COUNT = ABSTRACT_COMPOSITE_GATE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_OPERATION_COUNT = ABSTRACT_COMPOSITE_GATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link qucircuit.LOOP_KIND <em>LOOP KIND</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see qucircuit.LOOP_KIND
	 * @see qucircuit.impl.QuCircuitPackageImpl#getLOOP_KIND()
	 * @generated
	 */
	int LOOP_KIND = 18;

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
	 * Returns the meta object for the containment reference list '{@link qucircuit.QuantumRegister#getQubits <em>Qubits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Qubits</em>'.
	 * @see qucircuit.QuantumRegister#getQubits()
	 * @see #getQuantumRegister()
	 * @generated
	 */
	EReference getQuantumRegister_Qubits();

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
	 * Returns the meta object for the containment reference list '{@link qucircuit.ClassicRegister#getClassicBits <em>Classic Bits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classic Bits</em>'.
	 * @see qucircuit.ClassicRegister#getClassicBits()
	 * @see #getClassicRegister()
	 * @generated
	 */
	EReference getClassicRegister_ClassicBits();

	/**
	 * Returns the meta object for class '{@link qucircuit.Qubit <em>Qubit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qubit</em>'.
	 * @see qucircuit.Qubit
	 * @generated
	 */
	EClass getQubit();

	/**
	 * Returns the meta object for class '{@link qucircuit.ClassicBit <em>Classic Bit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classic Bit</em>'.
	 * @see qucircuit.ClassicBit
	 * @generated
	 */
	EClass getClassicBit();

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
	 * Returns the meta object for the reference '{@link qucircuit.QuantumOperation#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation</em>'.
	 * @see qucircuit.QuantumOperation#getOperation()
	 * @see #getQuantumOperation()
	 * @generated
	 */
	EReference getQuantumOperation_Operation();

	/**
	 * Returns the meta object for the reference list '{@link qucircuit.QuantumOperation#getTargetQubits <em>Target Qubits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target Qubits</em>'.
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
	 * Returns the meta object for the reference list '{@link qucircuit.AbstractQuantumGate#getControlQubits <em>Control Qubits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Control Qubits</em>'.
	 * @see qucircuit.AbstractQuantumGate#getControlQubits()
	 * @see #getAbstractQuantumGate()
	 * @generated
	 */
	EReference getAbstractQuantumGate_ControlQubits();

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
	 * Returns the meta object for the reference list '{@link qucircuit.Measurement#getClassicBits <em>Classic Bits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Classic Bits</em>'.
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
	 * Returns the meta object for class '{@link qucircuit.Bit <em>Bit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bit</em>'.
	 * @see qucircuit.Bit
	 * @generated
	 */
	EClass getBit();

	/**
	 * Returns the meta object for the attribute '{@link qucircuit.Bit#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see qucircuit.Bit#getId()
	 * @see #getBit()
	 * @generated
	 */
	EAttribute getBit_Id();

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
	 * Returns the meta object for class '{@link qucircuit.Loop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop</em>'.
	 * @see qucircuit.Loop
	 * @generated
	 */
	EClass getLoop();

	/**
	 * Returns the meta object for the attribute '{@link qucircuit.Loop#getIterations <em>Iterations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iterations</em>'.
	 * @see qucircuit.Loop#getIterations()
	 * @see #getLoop()
	 * @generated
	 */
	EAttribute getLoop_Iterations();

	/**
	 * Returns the meta object for the attribute '{@link qucircuit.Loop#getLoopKind <em>Loop Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loop Kind</em>'.
	 * @see qucircuit.Loop#getLoopKind()
	 * @see #getLoop()
	 * @generated
	 */
	EAttribute getLoop_LoopKind();

	/**
	 * Returns the meta object for the attribute '{@link qucircuit.Loop#isIncrement <em>Increment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Increment</em>'.
	 * @see qucircuit.Loop#isIncrement()
	 * @see #getLoop()
	 * @generated
	 */
	EAttribute getLoop_Increment();

	/**
	 * Returns the meta object for enum '{@link qucircuit.LOOP_KIND <em>LOOP KIND</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>LOOP KIND</em>'.
	 * @see qucircuit.LOOP_KIND
	 * @generated
	 */
	EEnum getLOOP_KIND();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QuCircuitFactory getQuCircuitFactory();

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
		 * @see qucircuit.impl.QuCircuitPackageImpl#getQuantumCircuit()
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
		 * @see qucircuit.impl.QuCircuitPackageImpl#getNamedElement()
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
		 * @see qucircuit.impl.QuCircuitPackageImpl#getQuantumRegister()
		 * @generated
		 */
		EClass QUANTUM_REGISTER = eINSTANCE.getQuantumRegister();

		/**
		 * The meta object literal for the '<em><b>Qubits</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTUM_REGISTER__QUBITS = eINSTANCE.getQuantumRegister_Qubits();

		/**
		 * The meta object literal for the '{@link qucircuit.impl.ClassicRegisterImpl <em>Classic Register</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qucircuit.impl.ClassicRegisterImpl
		 * @see qucircuit.impl.QuCircuitPackageImpl#getClassicRegister()
		 * @generated
		 */
		EClass CLASSIC_REGISTER = eINSTANCE.getClassicRegister();

		/**
		 * The meta object literal for the '<em><b>Classic Bits</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIC_REGISTER__CLASSIC_BITS = eINSTANCE.getClassicRegister_ClassicBits();

		/**
		 * The meta object literal for the '{@link qucircuit.impl.QubitImpl <em>Qubit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qucircuit.impl.QubitImpl
		 * @see qucircuit.impl.QuCircuitPackageImpl#getQubit()
		 * @generated
		 */
		EClass QUBIT = eINSTANCE.getQubit();

		/**
		 * The meta object literal for the '{@link qucircuit.impl.ClassicBitImpl <em>Classic Bit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qucircuit.impl.ClassicBitImpl
		 * @see qucircuit.impl.QuCircuitPackageImpl#getClassicBit()
		 * @generated
		 */
		EClass CLASSIC_BIT = eINSTANCE.getClassicBit();

		/**
		 * The meta object literal for the '{@link qucircuit.impl.LayerImpl <em>Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qucircuit.impl.LayerImpl
		 * @see qucircuit.impl.QuCircuitPackageImpl#getLayer()
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
		 * @see qucircuit.impl.QuCircuitPackageImpl#getClassicControl()
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
		 * @see qucircuit.impl.QuCircuitPackageImpl#getQuantumOperation()
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
		 * The meta object literal for the '<em><b>Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTUM_OPERATION__OPERATION = eINSTANCE.getQuantumOperation_Operation();

		/**
		 * The meta object literal for the '<em><b>Target Qubits</b></em>' reference list feature.
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
		 * @see qucircuit.impl.QuCircuitPackageImpl#getAbstractQuantumGate()
		 * @generated
		 */
		EClass ABSTRACT_QUANTUM_GATE = eINSTANCE.getAbstractQuantumGate();

		/**
		 * The meta object literal for the '<em><b>Control Qubits</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_QUANTUM_GATE__CONTROL_QUBITS = eINSTANCE.getAbstractQuantumGate_ControlQubits();

		/**
		 * The meta object literal for the '{@link qucircuit.impl.StatePreparationImpl <em>State Preparation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qucircuit.impl.StatePreparationImpl
		 * @see qucircuit.impl.QuCircuitPackageImpl#getStatePreparation()
		 * @generated
		 */
		EClass STATE_PREPARATION = eINSTANCE.getStatePreparation();

		/**
		 * The meta object literal for the '{@link qucircuit.impl.MeasurementImpl <em>Measurement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qucircuit.impl.MeasurementImpl
		 * @see qucircuit.impl.QuCircuitPackageImpl#getMeasurement()
		 * @generated
		 */
		EClass MEASUREMENT = eINSTANCE.getMeasurement();

		/**
		 * The meta object literal for the '<em><b>Classic Bits</b></em>' reference list feature.
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
		 * @see qucircuit.impl.QuCircuitPackageImpl#getElementaryQuantumGate()
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
		 * @see qucircuit.impl.QuCircuitPackageImpl#getCompositeQuantumGate()
		 * @generated
		 */
		EClass COMPOSITE_QUANTUM_GATE = eINSTANCE.getCompositeQuantumGate();

		/**
		 * The meta object literal for the '{@link qucircuit.impl.AngleParameterImpl <em>Angle Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qucircuit.impl.AngleParameterImpl
		 * @see qucircuit.impl.QuCircuitPackageImpl#getAngleParameter()
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
		 * The meta object literal for the '{@link qucircuit.impl.BitImpl <em>Bit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qucircuit.impl.BitImpl
		 * @see qucircuit.impl.QuCircuitPackageImpl#getBit()
		 * @generated
		 */
		EClass BIT = eINSTANCE.getBit();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIT__ID = eINSTANCE.getBit_Id();

		/**
		 * The meta object literal for the '{@link qucircuit.impl.AbstractCompositeGateImpl <em>Abstract Composite Gate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qucircuit.impl.AbstractCompositeGateImpl
		 * @see qucircuit.impl.QuCircuitPackageImpl#getAbstractCompositeGate()
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
		 * The meta object literal for the '{@link qucircuit.impl.LoopImpl <em>Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qucircuit.impl.LoopImpl
		 * @see qucircuit.impl.QuCircuitPackageImpl#getLoop()
		 * @generated
		 */
		EClass LOOP = eINSTANCE.getLoop();

		/**
		 * The meta object literal for the '<em><b>Iterations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOP__ITERATIONS = eINSTANCE.getLoop_Iterations();

		/**
		 * The meta object literal for the '<em><b>Loop Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOP__LOOP_KIND = eINSTANCE.getLoop_LoopKind();

		/**
		 * The meta object literal for the '<em><b>Increment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOP__INCREMENT = eINSTANCE.getLoop_Increment();

		/**
		 * The meta object literal for the '{@link qucircuit.LOOP_KIND <em>LOOP KIND</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see qucircuit.LOOP_KIND
		 * @see qucircuit.impl.QuCircuitPackageImpl#getLOOP_KIND()
		 * @generated
		 */
		EEnum LOOP_KIND = eINSTANCE.getLOOP_KIND();

	}

} //QuCircuitPackage
