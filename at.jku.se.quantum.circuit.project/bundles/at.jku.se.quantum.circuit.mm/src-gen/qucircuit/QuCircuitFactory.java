/**
 */
package qucircuit;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see qucircuit.QuCircuitPackage
 * @generated
 */
public interface QuCircuitFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QuCircuitFactory eINSTANCE = qucircuit.impl.QuCircuitFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Quantum Circuit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quantum Circuit</em>'.
	 * @generated
	 */
	QuantumCircuit createQuantumCircuit();

	/**
	 * Returns a new object of class '<em>Quantum Register</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quantum Register</em>'.
	 * @generated
	 */
	QuantumRegister createQuantumRegister();

	/**
	 * Returns a new object of class '<em>Classic Register</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Classic Register</em>'.
	 * @generated
	 */
	ClassicRegister createClassicRegister();

	/**
	 * Returns a new object of class '<em>Qubit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Qubit</em>'.
	 * @generated
	 */
	Qubit createQubit();

	/**
	 * Returns a new object of class '<em>Classic Bit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Classic Bit</em>'.
	 * @generated
	 */
	ClassicBit createClassicBit();

	/**
	 * Returns a new object of class '<em>Layer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Layer</em>'.
	 * @generated
	 */
	Layer createLayer();

	/**
	 * Returns a new object of class '<em>Classic Control</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Classic Control</em>'.
	 * @generated
	 */
	ClassicControl createClassicControl();

	/**
	 * Returns a new object of class '<em>State Preparation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State Preparation</em>'.
	 * @generated
	 */
	StatePreparation createStatePreparation();

	/**
	 * Returns a new object of class '<em>Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measurement</em>'.
	 * @generated
	 */
	Measurement createMeasurement();

	/**
	 * Returns a new object of class '<em>Elementary Quantum Gate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Elementary Quantum Gate</em>'.
	 * @generated
	 */
	ElementaryQuantumGate createElementaryQuantumGate();

	/**
	 * Returns a new object of class '<em>Composite Quantum Gate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Quantum Gate</em>'.
	 * @generated
	 */
	CompositeQuantumGate createCompositeQuantumGate();

	/**
	 * Returns a new object of class '<em>Angle Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Angle Parameter</em>'.
	 * @generated
	 */
	AngleParameter createAngleParameter();

	/**
	 * Returns a new object of class '<em>Loop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Loop</em>'.
	 * @generated
	 */
	Loop createLoop();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QuCircuitPackage getQuCircuitPackage();

} //QuCircuitFactory
