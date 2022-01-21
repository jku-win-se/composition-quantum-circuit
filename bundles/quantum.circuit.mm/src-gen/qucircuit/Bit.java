/**
 */
package qucircuit;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qucircuit.Bit#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see qucircuit.QuCircuitPackage#getBit()
 * @model abstract="true"
 * @generated
 */
public interface Bit extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(Integer)
	 * @see qucircuit.QuCircuitPackage#getBit_Id()
	 * @model id="true"
	 * @generated
	 */
	Integer getId();

	/**
	 * Sets the value of the '{@link qucircuit.Bit#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(Integer value);

} // Bit
