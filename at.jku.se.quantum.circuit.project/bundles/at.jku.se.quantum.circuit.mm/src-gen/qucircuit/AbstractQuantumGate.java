/**
 */
package qucircuit;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Quantum Gate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qucircuit.AbstractQuantumGate#getControlQubits <em>Control Qubits</em>}</li>
 * </ul>
 *
 * @see qucircuit.QuCircuitPackage#getAbstractQuantumGate()
 * @model abstract="true"
 * @generated
 */
public interface AbstractQuantumGate extends QuantumOperation {
	/**
	 * Returns the value of the '<em><b>Control Qubits</b></em>' reference list.
	 * The list contents are of type {@link qucircuit.Qubit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Qubits</em>' reference list.
	 * @see qucircuit.QuCircuitPackage#getAbstractQuantumGate_ControlQubits()
	 * @model
	 * @generated
	 */
	EList<Qubit> getControlQubits();

} // AbstractQuantumGate
