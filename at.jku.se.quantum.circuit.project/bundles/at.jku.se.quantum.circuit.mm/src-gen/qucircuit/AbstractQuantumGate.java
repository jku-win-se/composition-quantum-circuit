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
 *   <li>{@link qucircuit.AbstractQuantumGate#getLayers <em>Layers</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Layers</b></em>' containment reference list.
	 * The list contents are of type {@link qucircuit.Layer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layers</em>' containment reference list.
	 * @see qucircuit.QuCircuitPackage#getAbstractQuantumGate_Layers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Layer> getLayers();

} // AbstractQuantumGate
