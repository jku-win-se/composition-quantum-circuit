/**
 */
package quantum.operation.library.mm.quope;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link quantum.operation.library.mm.quope.Parameter#getTheta <em>Theta</em>}</li>
 *   <li>{@link quantum.operation.library.mm.quope.Parameter#getPhi <em>Phi</em>}</li>
 *   <li>{@link quantum.operation.library.mm.quope.Parameter#getLambda <em>Lambda</em>}</li>
 * </ul>
 *
 * @see quantum.operation.library.mm.quope.QuantumOpePackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Theta</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Theta</em>' attribute.
	 * @see #setTheta(Boolean)
	 * @see quantum.operation.library.mm.quope.QuantumOpePackage#getParameter_Theta()
	 * @model default="false"
	 * @generated
	 */
	Boolean getTheta();

	/**
	 * Sets the value of the '{@link quantum.operation.library.mm.quope.Parameter#getTheta <em>Theta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Theta</em>' attribute.
	 * @see #getTheta()
	 * @generated
	 */
	void setTheta(Boolean value);

	/**
	 * Returns the value of the '<em><b>Phi</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phi</em>' attribute.
	 * @see #setPhi(Boolean)
	 * @see quantum.operation.library.mm.quope.QuantumOpePackage#getParameter_Phi()
	 * @model default="false"
	 * @generated
	 */
	Boolean getPhi();

	/**
	 * Sets the value of the '{@link quantum.operation.library.mm.quope.Parameter#getPhi <em>Phi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phi</em>' attribute.
	 * @see #getPhi()
	 * @generated
	 */
	void setPhi(Boolean value);

	/**
	 * Returns the value of the '<em><b>Lambda</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lambda</em>' attribute.
	 * @see #setLambda(Boolean)
	 * @see quantum.operation.library.mm.quope.QuantumOpePackage#getParameter_Lambda()
	 * @model default="false"
	 * @generated
	 */
	Boolean getLambda();

	/**
	 * Sets the value of the '{@link quantum.operation.library.mm.quope.Parameter#getLambda <em>Lambda</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lambda</em>' attribute.
	 * @see #getLambda()
	 * @generated
	 */
	void setLambda(Boolean value);

} // Parameter
