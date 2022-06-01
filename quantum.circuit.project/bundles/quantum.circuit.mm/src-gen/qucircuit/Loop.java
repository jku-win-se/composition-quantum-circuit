/**
 */
package qucircuit;

import org.eclipse.emf.common.util.EList;

import quope.LoopOperation;

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
 *   <li>{@link qucircuit.Loop#getFixedControlQubits <em>Fixed Control Qubits</em>}</li>
 *   <li>{@link qucircuit.Loop#getFixedTargetQubits <em>Fixed Target Qubits</em>}</li>
 *   <li>{@link qucircuit.Loop#getLoop <em>Loop</em>}</li>
 *   <li>{@link qucircuit.Loop#getIncrementControlQubits <em>Increment Control Qubits</em>}</li>
 *   <li>{@link qucircuit.Loop#getIncrementTargetQubits <em>Increment Target Qubits</em>}</li>
 *   <li>{@link qucircuit.Loop#getLoopTargetQubits <em>Loop Target Qubits</em>}</li>
 *   <li>{@link qucircuit.Loop#getLoopControlQubits <em>Loop Control Qubits</em>}</li>
 *   <li>{@link qucircuit.Loop#getTargetQubitsBlockSize <em>Target Qubits Block Size</em>}</li>
 *   <li>{@link qucircuit.Loop#getControlQubitsBlockSize <em>Control Qubits Block Size</em>}</li>
 *   <li>{@link qucircuit.Loop#getControlQubitsIterationType <em>Control Qubits Iteration Type</em>}</li>
 *   <li>{@link qucircuit.Loop#getTargetQubitsIterationType <em>Target Qubits Iteration Type</em>}</li>
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
	 * Returns the value of the '<em><b>Fixed Control Qubits</b></em>' reference list.
	 * The list contents are of type {@link qucircuit.Qubit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Control Qubits</em>' reference list.
	 * @see qucircuit.QuCircuitPackage#getLoop_FixedControlQubits()
	 * @model
	 * @generated
	 */
	EList<Qubit> getFixedControlQubits();

	/**
	 * Returns the value of the '<em><b>Fixed Target Qubits</b></em>' reference list.
	 * The list contents are of type {@link qucircuit.Qubit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Target Qubits</em>' reference list.
	 * @see qucircuit.QuCircuitPackage#getLoop_FixedTargetQubits()
	 * @model
	 * @generated
	 */
	EList<Qubit> getFixedTargetQubits();

	/**
	 * Returns the value of the '<em><b>Loop</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop</em>' reference.
	 * @see #setLoop(LoopOperation)
	 * @see qucircuit.QuCircuitPackage#getLoop_Loop()
	 * @model
	 * @generated
	 */
	LoopOperation getLoop();

	/**
	 * Sets the value of the '{@link qucircuit.Loop#getLoop <em>Loop</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loop</em>' reference.
	 * @see #getLoop()
	 * @generated
	 */
	void setLoop(LoopOperation value);

	/**
	 * Returns the value of the '<em><b>Increment Control Qubits</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Increment Control Qubits</em>' attribute.
	 * @see #setIncrementControlQubits(Boolean)
	 * @see qucircuit.QuCircuitPackage#getLoop_IncrementControlQubits()
	 * @model default="true"
	 * @generated
	 */
	Boolean getIncrementControlQubits();

	/**
	 * Sets the value of the '{@link qucircuit.Loop#getIncrementControlQubits <em>Increment Control Qubits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Increment Control Qubits</em>' attribute.
	 * @see #getIncrementControlQubits()
	 * @generated
	 */
	void setIncrementControlQubits(Boolean value);

	/**
	 * Returns the value of the '<em><b>Increment Target Qubits</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Increment Target Qubits</em>' attribute.
	 * @see #setIncrementTargetQubits(Boolean)
	 * @see qucircuit.QuCircuitPackage#getLoop_IncrementTargetQubits()
	 * @model default="true"
	 * @generated
	 */
	Boolean getIncrementTargetQubits();

	/**
	 * Sets the value of the '{@link qucircuit.Loop#getIncrementTargetQubits <em>Increment Target Qubits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Increment Target Qubits</em>' attribute.
	 * @see #getIncrementTargetQubits()
	 * @generated
	 */
	void setIncrementTargetQubits(Boolean value);

	/**
	 * Returns the value of the '<em><b>Loop Target Qubits</b></em>' reference list.
	 * The list contents are of type {@link qucircuit.Qubit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop Target Qubits</em>' reference list.
	 * @see qucircuit.QuCircuitPackage#getLoop_LoopTargetQubits()
	 * @model required="true"
	 * @generated
	 */
	EList<Qubit> getLoopTargetQubits();

	/**
	 * Returns the value of the '<em><b>Loop Control Qubits</b></em>' reference list.
	 * The list contents are of type {@link qucircuit.Qubit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop Control Qubits</em>' reference list.
	 * @see qucircuit.QuCircuitPackage#getLoop_LoopControlQubits()
	 * @model
	 * @generated
	 */
	EList<Qubit> getLoopControlQubits();

	/**
	 * Returns the value of the '<em><b>Target Qubits Block Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Qubits Block Size</em>' attribute.
	 * @see #setTargetQubitsBlockSize(Integer)
	 * @see qucircuit.QuCircuitPackage#getLoop_TargetQubitsBlockSize()
	 * @model
	 * @generated
	 */
	Integer getTargetQubitsBlockSize();

	/**
	 * Sets the value of the '{@link qucircuit.Loop#getTargetQubitsBlockSize <em>Target Qubits Block Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Qubits Block Size</em>' attribute.
	 * @see #getTargetQubitsBlockSize()
	 * @generated
	 */
	void setTargetQubitsBlockSize(Integer value);

	/**
	 * Returns the value of the '<em><b>Control Qubits Block Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Qubits Block Size</em>' attribute.
	 * @see #setControlQubitsBlockSize(Integer)
	 * @see qucircuit.QuCircuitPackage#getLoop_ControlQubitsBlockSize()
	 * @model
	 * @generated
	 */
	Integer getControlQubitsBlockSize();

	/**
	 * Sets the value of the '{@link qucircuit.Loop#getControlQubitsBlockSize <em>Control Qubits Block Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Qubits Block Size</em>' attribute.
	 * @see #getControlQubitsBlockSize()
	 * @generated
	 */
	void setControlQubitsBlockSize(Integer value);

	/**
	 * Returns the value of the '<em><b>Control Qubits Iteration Type</b></em>' attribute.
	 * The literals are from the enumeration {@link qucircuit.ITERATION_TYPE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Qubits Iteration Type</em>' attribute.
	 * @see qucircuit.ITERATION_TYPE
	 * @see #setControlQubitsIterationType(ITERATION_TYPE)
	 * @see qucircuit.QuCircuitPackage#getLoop_ControlQubitsIterationType()
	 * @model
	 * @generated
	 */
	ITERATION_TYPE getControlQubitsIterationType();

	/**
	 * Sets the value of the '{@link qucircuit.Loop#getControlQubitsIterationType <em>Control Qubits Iteration Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Qubits Iteration Type</em>' attribute.
	 * @see qucircuit.ITERATION_TYPE
	 * @see #getControlQubitsIterationType()
	 * @generated
	 */
	void setControlQubitsIterationType(ITERATION_TYPE value);

	/**
	 * Returns the value of the '<em><b>Target Qubits Iteration Type</b></em>' attribute.
	 * The literals are from the enumeration {@link qucircuit.ITERATION_TYPE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Qubits Iteration Type</em>' attribute.
	 * @see qucircuit.ITERATION_TYPE
	 * @see #setTargetQubitsIterationType(ITERATION_TYPE)
	 * @see qucircuit.QuCircuitPackage#getLoop_TargetQubitsIterationType()
	 * @model
	 * @generated
	 */
	ITERATION_TYPE getTargetQubitsIterationType();

	/**
	 * Sets the value of the '{@link qucircuit.Loop#getTargetQubitsIterationType <em>Target Qubits Iteration Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Qubits Iteration Type</em>' attribute.
	 * @see qucircuit.ITERATION_TYPE
	 * @see #getTargetQubitsIterationType()
	 * @generated
	 */
	void setTargetQubitsIterationType(ITERATION_TYPE value);

} // Loop
