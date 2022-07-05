/**
 */
package qucircuit;

import qubo.Qubo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Quantum Gate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qucircuit.CompositeQuantumGate#getQubo <em>Qubo</em>}</li>
 * </ul>
 *
 * @see qucircuit.QucircuitPackage#getCompositeQuantumGate()
 * @model
 * @generated
 */
public interface CompositeQuantumGate extends AbstractCompositeGate {

	/**
	 * Returns the value of the '<em><b>Qubo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qubo</em>' reference.
	 * @see #setQubo(Qubo)
	 * @see qucircuit.QucircuitPackage#getCompositeQuantumGate_Qubo()
	 * @model
	 * @generated
	 */
	Qubo getQubo();

	/**
	 * Sets the value of the '{@link qucircuit.CompositeQuantumGate#getQubo <em>Qubo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qubo</em>' reference.
	 * @see #getQubo()
	 * @generated
	 */
	void setQubo(Qubo value);
} // CompositeQuantumGate
