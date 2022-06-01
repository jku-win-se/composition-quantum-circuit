/**
 */
package at.jku.se.quantum.operation.library.mm.quope;

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
 *   <li>{@link at.jku.se.quantum.operation.library.mm.quope.QuantumOperationLibrary#getOperations <em>Operations</em>}</li>
 *   <li>{@link at.jku.se.quantum.operation.library.mm.quope.QuantumOperationLibrary#getLoopOperations <em>Loop Operations</em>}</li>
 * </ul>
 *
 * @see at.jku.se.quantum.operation.library.mm.quope.QuantumOpePackage#getQuantumOperationLibrary()
 * @model
 * @generated
 */
public interface QuantumOperationLibrary extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link at.jku.se.quantum.operation.library.mm.quope.ConcreteQuantumOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see at.jku.se.quantum.operation.library.mm.quope.QuantumOpePackage#getQuantumOperationLibrary_Operations()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConcreteQuantumOperation> getOperations();

	/**
	 * Returns the value of the '<em><b>Loop Operations</b></em>' containment reference list.
	 * The list contents are of type {@link at.jku.se.quantum.operation.library.mm.quope.LoopOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop Operations</em>' containment reference list.
	 * @see at.jku.se.quantum.operation.library.mm.quope.QuantumOpePackage#getQuantumOperationLibrary_LoopOperations()
	 * @model containment="true"
	 * @generated
	 */
	EList<LoopOperation> getLoopOperations();

} // QuantumOperationLibrary
