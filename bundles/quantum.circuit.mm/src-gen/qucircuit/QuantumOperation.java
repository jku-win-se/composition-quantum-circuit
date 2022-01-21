/**
 */
package qucircuit;

import org.eclipse.emf.common.util.EList;

import quantum.operation.library.mm.quope.ConcreteQuantumOperation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantum Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qucircuit.QuantumOperation#getClassicControl <em>Classic Control</em>}</li>
 *   <li>{@link qucircuit.QuantumOperation#getOperation <em>Operation</em>}</li>
 *   <li>{@link qucircuit.QuantumOperation#getTargetQubits <em>Target Qubits</em>}</li>
 * </ul>
 *
 * @see qucircuit.QuCircuitPackage#getQuantumOperation()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel"
 * @generated
 */
public interface QuantumOperation extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Classic Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classic Control</em>' containment reference.
	 * @see #setClassicControl(ClassicControl)
	 * @see qucircuit.QuCircuitPackage#getQuantumOperation_ClassicControl()
	 * @model containment="true"
	 * @generated
	 */
	ClassicControl getClassicControl();

	/**
	 * Sets the value of the '{@link qucircuit.QuantumOperation#getClassicControl <em>Classic Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classic Control</em>' containment reference.
	 * @see #getClassicControl()
	 * @generated
	 */
	void setClassicControl(ClassicControl value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' reference.
	 * @see #setOperation(ConcreteQuantumOperation)
	 * @see qucircuit.QuCircuitPackage#getQuantumOperation_Operation()
	 * @model
	 * @generated
	 */
	ConcreteQuantumOperation getOperation();

	/**
	 * Sets the value of the '{@link qucircuit.QuantumOperation#getOperation <em>Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(ConcreteQuantumOperation value);

	/**
	 * Returns the value of the '<em><b>Target Qubits</b></em>' reference list.
	 * The list contents are of type {@link qucircuit.Qubit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Qubits</em>' reference list.
	 * @see qucircuit.QuCircuitPackage#getQuantumOperation_TargetQubits()
	 * @model required="true"
	 * @generated
	 */
	EList<Qubit> getTargetQubits();

} // QuantumOperation
