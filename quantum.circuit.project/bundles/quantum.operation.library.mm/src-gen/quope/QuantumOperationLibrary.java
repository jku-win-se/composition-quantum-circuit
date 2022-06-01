/**
 */
package quope;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantum Operation Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link quope.QuantumOperationLibrary#getOperations <em>Operations</em>}</li>
 *   <li>{@link quope.QuantumOperationLibrary#getLoopOperations <em>Loop Operations</em>}</li>
 * </ul>
 *
 * @see quope.QuopePackage#getQuantumOperationLibrary()
 * @model
 * @generated
 */
public interface QuantumOperationLibrary extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link quope.ConcreteQuantumOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see quope.QuopePackage#getQuantumOperationLibrary_Operations()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConcreteQuantumOperation> getOperations();

	/**
	 * Returns the value of the '<em><b>Loop Operations</b></em>' containment reference list.
	 * The list contents are of type {@link quope.LoopOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop Operations</em>' containment reference list.
	 * @see quope.QuopePackage#getQuantumOperationLibrary_LoopOperations()
	 * @model containment="true"
	 * @generated
	 */
	EList<LoopOperation> getLoopOperations();

} // QuantumOperationLibrary
