/**
 */
package qucircuit;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link qucircuit.Loop#getIterations <em>Iterations</em>}</li>
 *   <li>{@link qucircuit.Loop#getLoopKind <em>Loop Kind</em>}</li>
 *   <li>{@link qucircuit.Loop#isIncrement <em>Increment</em>}</li>
 * </ul>
 *
 * @see qucircuit.QuCircuitPackage#getLoop()
 * @model
 * @generated
 */
public interface Loop extends AbstractCompositeGate {
	/**
	 * Returns the value of the '<em><b>Iterations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iterations</em>' attribute.
	 * @see #setIterations(int)
	 * @see qucircuit.QuCircuitPackage#getLoop_Iterations()
	 * @model
	 * @generated
	 */
	int getIterations();

	/**
	 * Sets the value of the '{@link qucircuit.Loop#getIterations <em>Iterations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iterations</em>' attribute.
	 * @see #getIterations()
	 * @generated
	 */
	void setIterations(int value);

	/**
	 * Returns the value of the '<em><b>Loop Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link qucircuit.LOOP_KIND}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop Kind</em>' attribute.
	 * @see qucircuit.LOOP_KIND
	 * @see #setLoopKind(LOOP_KIND)
	 * @see qucircuit.QuCircuitPackage#getLoop_LoopKind()
	 * @model
	 * @generated
	 */
	LOOP_KIND getLoopKind();

	/**
	 * Sets the value of the '{@link qucircuit.Loop#getLoopKind <em>Loop Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loop Kind</em>' attribute.
	 * @see qucircuit.LOOP_KIND
	 * @see #getLoopKind()
	 * @generated
	 */
	void setLoopKind(LOOP_KIND value);

	/**
	 * Returns the value of the '<em><b>Increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Increment</em>' attribute.
	 * @see #setIncrement(boolean)
	 * @see qucircuit.QuCircuitPackage#getLoop_Increment()
	 * @model
	 * @generated
	 */
	boolean isIncrement();

	/**
	 * Sets the value of the '{@link qucircuit.Loop#isIncrement <em>Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Increment</em>' attribute.
	 * @see #isIncrement()
	 * @generated
	 */
	void setIncrement(boolean value);

} // Loop
