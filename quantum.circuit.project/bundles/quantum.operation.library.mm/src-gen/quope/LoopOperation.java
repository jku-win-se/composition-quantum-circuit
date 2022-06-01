/**
 */
package quope;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link quope.LoopOperation#getAllowsFixedControlQubits <em>Allows Fixed Control Qubits</em>}</li>
 *   <li>{@link quope.LoopOperation#getAllowsFixedTargetQubits <em>Allows Fixed Target Qubits</em>}</li>
 *   <li>{@link quope.LoopOperation#getAllowsControlQubitsIterationType <em>Allows Control Qubits Iteration Type</em>}</li>
 *   <li>{@link quope.LoopOperation#getAllowsTargetQubitsIterationType <em>Allows Target Qubits Iteration Type</em>}</li>
 *   <li>{@link quope.LoopOperation#getAllowsControlQubitsBlockSize <em>Allows Control Qubits Block Size</em>}</li>
 *   <li>{@link quope.LoopOperation#getAllowsTargetQubitsBlockSize <em>Allows Target Qubits Block Size</em>}</li>
 *   <li>{@link quope.LoopOperation#getAllowsIncrementControlQubits <em>Allows Increment Control Qubits</em>}</li>
 *   <li>{@link quope.LoopOperation#getAllowsIncrementTargetQubits <em>Allows Increment Target Qubits</em>}</li>
 *   <li>{@link quope.LoopOperation#getAllowsIterations <em>Allows Iterations</em>}</li>
 * </ul>
 *
 * @see quope.QuopePackage#getLoopOperation()
 * @model
 * @generated
 */
public interface LoopOperation extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Allows Fixed Control Qubits</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allows Fixed Control Qubits</em>' attribute.
	 * @see #setAllowsFixedControlQubits(Boolean)
	 * @see quope.QuopePackage#getLoopOperation_AllowsFixedControlQubits()
	 * @model default="true"
	 * @generated
	 */
	Boolean getAllowsFixedControlQubits();

	/**
	 * Sets the value of the '{@link quope.LoopOperation#getAllowsFixedControlQubits <em>Allows Fixed Control Qubits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allows Fixed Control Qubits</em>' attribute.
	 * @see #getAllowsFixedControlQubits()
	 * @generated
	 */
	void setAllowsFixedControlQubits(Boolean value);

	/**
	 * Returns the value of the '<em><b>Allows Fixed Target Qubits</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allows Fixed Target Qubits</em>' attribute.
	 * @see #setAllowsFixedTargetQubits(Boolean)
	 * @see quope.QuopePackage#getLoopOperation_AllowsFixedTargetQubits()
	 * @model default="true"
	 * @generated
	 */
	Boolean getAllowsFixedTargetQubits();

	/**
	 * Sets the value of the '{@link quope.LoopOperation#getAllowsFixedTargetQubits <em>Allows Fixed Target Qubits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allows Fixed Target Qubits</em>' attribute.
	 * @see #getAllowsFixedTargetQubits()
	 * @generated
	 */
	void setAllowsFixedTargetQubits(Boolean value);

	/**
	 * Returns the value of the '<em><b>Allows Control Qubits Iteration Type</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allows Control Qubits Iteration Type</em>' attribute.
	 * @see #setAllowsControlQubitsIterationType(Boolean)
	 * @see quope.QuopePackage#getLoopOperation_AllowsControlQubitsIterationType()
	 * @model default="true"
	 * @generated
	 */
	Boolean getAllowsControlQubitsIterationType();

	/**
	 * Sets the value of the '{@link quope.LoopOperation#getAllowsControlQubitsIterationType <em>Allows Control Qubits Iteration Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allows Control Qubits Iteration Type</em>' attribute.
	 * @see #getAllowsControlQubitsIterationType()
	 * @generated
	 */
	void setAllowsControlQubitsIterationType(Boolean value);

	/**
	 * Returns the value of the '<em><b>Allows Target Qubits Iteration Type</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allows Target Qubits Iteration Type</em>' attribute.
	 * @see #setAllowsTargetQubitsIterationType(Boolean)
	 * @see quope.QuopePackage#getLoopOperation_AllowsTargetQubitsIterationType()
	 * @model default="true"
	 * @generated
	 */
	Boolean getAllowsTargetQubitsIterationType();

	/**
	 * Sets the value of the '{@link quope.LoopOperation#getAllowsTargetQubitsIterationType <em>Allows Target Qubits Iteration Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allows Target Qubits Iteration Type</em>' attribute.
	 * @see #getAllowsTargetQubitsIterationType()
	 * @generated
	 */
	void setAllowsTargetQubitsIterationType(Boolean value);

	/**
	 * Returns the value of the '<em><b>Allows Control Qubits Block Size</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allows Control Qubits Block Size</em>' attribute.
	 * @see #setAllowsControlQubitsBlockSize(Boolean)
	 * @see quope.QuopePackage#getLoopOperation_AllowsControlQubitsBlockSize()
	 * @model default="true"
	 * @generated
	 */
	Boolean getAllowsControlQubitsBlockSize();

	/**
	 * Sets the value of the '{@link quope.LoopOperation#getAllowsControlQubitsBlockSize <em>Allows Control Qubits Block Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allows Control Qubits Block Size</em>' attribute.
	 * @see #getAllowsControlQubitsBlockSize()
	 * @generated
	 */
	void setAllowsControlQubitsBlockSize(Boolean value);

	/**
	 * Returns the value of the '<em><b>Allows Target Qubits Block Size</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allows Target Qubits Block Size</em>' attribute.
	 * @see #setAllowsTargetQubitsBlockSize(Boolean)
	 * @see quope.QuopePackage#getLoopOperation_AllowsTargetQubitsBlockSize()
	 * @model default="true"
	 * @generated
	 */
	Boolean getAllowsTargetQubitsBlockSize();

	/**
	 * Sets the value of the '{@link quope.LoopOperation#getAllowsTargetQubitsBlockSize <em>Allows Target Qubits Block Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allows Target Qubits Block Size</em>' attribute.
	 * @see #getAllowsTargetQubitsBlockSize()
	 * @generated
	 */
	void setAllowsTargetQubitsBlockSize(Boolean value);

	/**
	 * Returns the value of the '<em><b>Allows Increment Control Qubits</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allows Increment Control Qubits</em>' attribute.
	 * @see #setAllowsIncrementControlQubits(Boolean)
	 * @see quope.QuopePackage#getLoopOperation_AllowsIncrementControlQubits()
	 * @model default="true"
	 * @generated
	 */
	Boolean getAllowsIncrementControlQubits();

	/**
	 * Sets the value of the '{@link quope.LoopOperation#getAllowsIncrementControlQubits <em>Allows Increment Control Qubits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allows Increment Control Qubits</em>' attribute.
	 * @see #getAllowsIncrementControlQubits()
	 * @generated
	 */
	void setAllowsIncrementControlQubits(Boolean value);

	/**
	 * Returns the value of the '<em><b>Allows Increment Target Qubits</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allows Increment Target Qubits</em>' attribute.
	 * @see #setAllowsIncrementTargetQubits(Boolean)
	 * @see quope.QuopePackage#getLoopOperation_AllowsIncrementTargetQubits()
	 * @model default="true"
	 * @generated
	 */
	Boolean getAllowsIncrementTargetQubits();

	/**
	 * Sets the value of the '{@link quope.LoopOperation#getAllowsIncrementTargetQubits <em>Allows Increment Target Qubits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allows Increment Target Qubits</em>' attribute.
	 * @see #getAllowsIncrementTargetQubits()
	 * @generated
	 */
	void setAllowsIncrementTargetQubits(Boolean value);

	/**
	 * Returns the value of the '<em><b>Allows Iterations</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allows Iterations</em>' attribute.
	 * @see #setAllowsIterations(Boolean)
	 * @see quope.QuopePackage#getLoopOperation_AllowsIterations()
	 * @model default="true"
	 * @generated
	 */
	Boolean getAllowsIterations();

	/**
	 * Sets the value of the '{@link quope.LoopOperation#getAllowsIterations <em>Allows Iterations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allows Iterations</em>' attribute.
	 * @see #getAllowsIterations()
	 * @generated
	 */
	void setAllowsIterations(Boolean value);

} // LoopOperation
