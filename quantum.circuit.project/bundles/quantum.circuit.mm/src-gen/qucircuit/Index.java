/**
 */
package qucircuit;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Index</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qucircuit.Index#getRegister <em>Register</em>}</li>
 * </ul>
 *
 * @see qucircuit.QucircuitPackage#getIndex()
 * @model abstract="true"
 * @generated
 */
public interface Index extends EObject {
	/**
	 * Returns the value of the '<em><b>Register</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Register</em>' reference.
	 * @see #setRegister(Register)
	 * @see qucircuit.QucircuitPackage#getIndex_Register()
	 * @model
	 * @generated
	 */
	Register getRegister();

	/**
	 * Sets the value of the '{@link qucircuit.Index#getRegister <em>Register</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Register</em>' reference.
	 * @see #getRegister()
	 * @generated
	 */
	void setRegister(Register value);

} // Index
