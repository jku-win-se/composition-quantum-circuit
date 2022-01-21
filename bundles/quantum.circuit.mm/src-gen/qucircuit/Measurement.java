/**
 */
package qucircuit;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measurement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qucircuit.Measurement#getClassicBits <em>Classic Bits</em>}</li>
 * </ul>
 *
 * @see qucircuit.QuCircuitPackage#getMeasurement()
 * @model
 * @generated
 */
public interface Measurement extends IrreversibleQuantumGate {
	/**
	 * Returns the value of the '<em><b>Classic Bits</b></em>' reference list.
	 * The list contents are of type {@link qucircuit.ClassicBit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classic Bits</em>' reference list.
	 * @see qucircuit.QuCircuitPackage#getMeasurement_ClassicBits()
	 * @model required="true"
	 * @generated
	 */
	EList<ClassicBit> getClassicBits();

} // Measurement
