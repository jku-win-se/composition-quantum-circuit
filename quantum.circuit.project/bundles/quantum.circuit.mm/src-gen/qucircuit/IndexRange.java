/**
 */
package qucircuit;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Index Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qucircuit.IndexRange#getBegin <em>Begin</em>}</li>
 *   <li>{@link qucircuit.IndexRange#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @see qucircuit.QucircuitPackage#getIndexRange()
 * @model
 * @generated
 */
public interface IndexRange extends Index {
	/**
	 * Returns the value of the '<em><b>Begin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Begin</em>' attribute.
	 * @see #setBegin(Integer)
	 * @see qucircuit.QucircuitPackage#getIndexRange_Begin()
	 * @model
	 * @generated
	 */
	Integer getBegin();

	/**
	 * Sets the value of the '{@link qucircuit.IndexRange#getBegin <em>Begin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Begin</em>' attribute.
	 * @see #getBegin()
	 * @generated
	 */
	void setBegin(Integer value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(Integer)
	 * @see qucircuit.QucircuitPackage#getIndexRange_End()
	 * @model
	 * @generated
	 */
	Integer getEnd();

	/**
	 * Sets the value of the '{@link qucircuit.IndexRange#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Integer value);

} // IndexRange
