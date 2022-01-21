/**
 */
package qucircuit;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classic Register</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qucircuit.ClassicRegister#getClassicBits <em>Classic Bits</em>}</li>
 * </ul>
 *
 * @see qucircuit.QuCircuitPackage#getClassicRegister()
 * @model
 * @generated
 */
public interface ClassicRegister extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Classic Bits</b></em>' containment reference list.
	 * The list contents are of type {@link qucircuit.ClassicBit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classic Bits</em>' containment reference list.
	 * @see qucircuit.QuCircuitPackage#getClassicRegister_ClassicBits()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClassicBit> getClassicBits();

} // ClassicRegister
