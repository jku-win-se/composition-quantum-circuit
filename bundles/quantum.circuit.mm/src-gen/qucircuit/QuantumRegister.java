/**
 */
package qucircuit;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantum Register</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qucircuit.QuantumRegister#getQubits <em>Qubits</em>}</li>
 * </ul>
 *
 * @see qucircuit.QuCircuitPackage#getQuantumRegister()
 * @model
 * @generated
 */
public interface QuantumRegister extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Qubits</b></em>' containment reference list.
	 * The list contents are of type {@link qucircuit.Qubit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qubits</em>' containment reference list.
	 * @see qucircuit.QuCircuitPackage#getQuantumRegister_Qubits()
	 * @model containment="true"
	 * @generated
	 */
	EList<Qubit> getQubits();

} // QuantumRegister
