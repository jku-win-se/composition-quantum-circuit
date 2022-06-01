/**
 */
package at.jku.se.qubo.mm.qubo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Matrix</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.jku.se.qubo.mm.qubo.Matrix#getRows <em>Rows</em>}</li>
 * </ul>
 *
 * @see at.jku.se.qubo.mm.qubo.QuboPackage#getMatrix()
 * @model
 * @generated
 */
public interface Matrix extends EObject {
	/**
	 * Returns the value of the '<em><b>Rows</b></em>' containment reference list.
	 * The list contents are of type {@link at.jku.se.qubo.mm.qubo.Row}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rows</em>' containment reference list.
	 * @see at.jku.se.qubo.mm.qubo.QuboPackage#getMatrix_Rows()
	 * @model containment="true"
	 * @generated
	 */
	EList<Row> getRows();

} // Matrix
