/**
 */
package qucircuit;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantum Circuit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qucircuit.QuantumCircuit#getQuantumRegisters <em>Quantum Registers</em>}</li>
 *   <li>{@link qucircuit.QuantumCircuit#getClassicRegisters <em>Classic Registers</em>}</li>
 *   <li>{@link qucircuit.QuantumCircuit#getLayers <em>Layers</em>}</li>
 * </ul>
 *
 * @see qucircuit.QuCircuitPackage#getQuantumCircuit()
 * @model
 * @generated
 */
public interface QuantumCircuit extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Quantum Registers</b></em>' containment reference list.
	 * The list contents are of type {@link qucircuit.QuantumRegister}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantum Registers</em>' containment reference list.
	 * @see qucircuit.QuCircuitPackage#getQuantumCircuit_QuantumRegisters()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<QuantumRegister> getQuantumRegisters();

	/**
	 * Returns the value of the '<em><b>Classic Registers</b></em>' containment reference list.
	 * The list contents are of type {@link qucircuit.ClassicRegister}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classic Registers</em>' containment reference list.
	 * @see qucircuit.QuCircuitPackage#getQuantumCircuit_ClassicRegisters()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClassicRegister> getClassicRegisters();

	/**
	 * Returns the value of the '<em><b>Layers</b></em>' containment reference list.
	 * The list contents are of type {@link qucircuit.Layer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layers</em>' containment reference list.
	 * @see qucircuit.QuCircuitPackage#getQuantumCircuit_Layers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Layer> getLayers();

} // QuantumCircuit
