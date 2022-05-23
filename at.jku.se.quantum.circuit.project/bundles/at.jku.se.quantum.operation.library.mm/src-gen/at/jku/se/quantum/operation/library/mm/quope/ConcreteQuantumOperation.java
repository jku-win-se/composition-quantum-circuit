/**
 */
package at.jku.se.quantum.operation.library.mm.quope;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concrete Quantum Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link at.jku.se.quantum.operation.library.mm.quope.ConcreteQuantumOperation#getType <em>Type</em>}</li>
 *   <li>{@link at.jku.se.quantum.operation.library.mm.quope.ConcreteQuantumOperation#getReverseConcreteQuantumOperation <em>Reverse Concrete Quantum Operation</em>}</li>
 *   <li>{@link at.jku.se.quantum.operation.library.mm.quope.ConcreteQuantumOperation#getAbbreviation <em>Abbreviation</em>}</li>
 *   <li>{@link at.jku.se.quantum.operation.library.mm.quope.ConcreteQuantumOperation#getPaletteIconPath <em>Palette Icon Path</em>}</li>
 *   <li>{@link at.jku.se.quantum.operation.library.mm.quope.ConcreteQuantumOperation#getStyleIconPath <em>Style Icon Path</em>}</li>
 *   <li>{@link at.jku.se.quantum.operation.library.mm.quope.ConcreteQuantumOperation#getParameter <em>Parameter</em>}</li>
 *   <li>{@link at.jku.se.quantum.operation.library.mm.quope.ConcreteQuantumOperation#getFixedQuantumOperation <em>Fixed Quantum Operation</em>}</li>
 * </ul>
 *
 * @see at.jku.se.quantum.operation.library.mm.quope.QuantumOpePackage#getConcreteQuantumOperation()
 * @model
 * @generated
 */
public interface ConcreteQuantumOperation extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(EClass)
	 * @see at.jku.se.quantum.operation.library.mm.quope.QuantumOpePackage#getConcreteQuantumOperation_Type()
	 * @model required="true"
	 * @generated
	 */
	EClass getType();

	/**
	 * Sets the value of the '{@link at.jku.se.quantum.operation.library.mm.quope.ConcreteQuantumOperation#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(EClass value);

	/**
	 * Returns the value of the '<em><b>Reverse Concrete Quantum Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reverse Concrete Quantum Operation</em>' reference.
	 * @see #setReverseConcreteQuantumOperation(ConcreteQuantumOperation)
	 * @see at.jku.se.quantum.operation.library.mm.quope.QuantumOpePackage#getConcreteQuantumOperation_ReverseConcreteQuantumOperation()
	 * @model
	 * @generated
	 */
	ConcreteQuantumOperation getReverseConcreteQuantumOperation();

	/**
	 * Sets the value of the '{@link at.jku.se.quantum.operation.library.mm.quope.ConcreteQuantumOperation#getReverseConcreteQuantumOperation <em>Reverse Concrete Quantum Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reverse Concrete Quantum Operation</em>' reference.
	 * @see #getReverseConcreteQuantumOperation()
	 * @generated
	 */
	void setReverseConcreteQuantumOperation(ConcreteQuantumOperation value);

	/**
	 * Returns the value of the '<em><b>Abbreviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abbreviation</em>' attribute.
	 * @see #setAbbreviation(String)
	 * @see at.jku.se.quantum.operation.library.mm.quope.QuantumOpePackage#getConcreteQuantumOperation_Abbreviation()
	 * @model
	 * @generated
	 */
	String getAbbreviation();

	/**
	 * Sets the value of the '{@link at.jku.se.quantum.operation.library.mm.quope.ConcreteQuantumOperation#getAbbreviation <em>Abbreviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abbreviation</em>' attribute.
	 * @see #getAbbreviation()
	 * @generated
	 */
	void setAbbreviation(String value);

	/**
	 * Returns the value of the '<em><b>Palette Icon Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Palette Icon Path</em>' attribute.
	 * @see #setPaletteIconPath(String)
	 * @see at.jku.se.quantum.operation.library.mm.quope.QuantumOpePackage#getConcreteQuantumOperation_PaletteIconPath()
	 * @model
	 * @generated
	 */
	String getPaletteIconPath();

	/**
	 * Sets the value of the '{@link at.jku.se.quantum.operation.library.mm.quope.ConcreteQuantumOperation#getPaletteIconPath <em>Palette Icon Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Palette Icon Path</em>' attribute.
	 * @see #getPaletteIconPath()
	 * @generated
	 */
	void setPaletteIconPath(String value);

	/**
	 * Returns the value of the '<em><b>Style Icon Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Icon Path</em>' attribute.
	 * @see #setStyleIconPath(String)
	 * @see at.jku.se.quantum.operation.library.mm.quope.QuantumOpePackage#getConcreteQuantumOperation_StyleIconPath()
	 * @model
	 * @generated
	 */
	String getStyleIconPath();

	/**
	 * Sets the value of the '{@link at.jku.se.quantum.operation.library.mm.quope.ConcreteQuantumOperation#getStyleIconPath <em>Style Icon Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Icon Path</em>' attribute.
	 * @see #getStyleIconPath()
	 * @generated
	 */
	void setStyleIconPath(String value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference.
	 * @see #setParameter(Parameter)
	 * @see at.jku.se.quantum.operation.library.mm.quope.QuantumOpePackage#getConcreteQuantumOperation_Parameter()
	 * @model containment="true"
	 * @generated
	 */
	Parameter getParameter();

	/**
	 * Sets the value of the '{@link at.jku.se.quantum.operation.library.mm.quope.ConcreteQuantumOperation#getParameter <em>Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' containment reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(Parameter value);

	/**
	 * Returns the value of the '<em><b>Fixed Quantum Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Quantum Operation</em>' containment reference.
	 * @see #setFixedQuantumOperation(FixedQuantumOperation)
	 * @see at.jku.se.quantum.operation.library.mm.quope.QuantumOpePackage#getConcreteQuantumOperation_FixedQuantumOperation()
	 * @model containment="true"
	 * @generated
	 */
	FixedQuantumOperation getFixedQuantumOperation();

	/**
	 * Sets the value of the '{@link at.jku.se.quantum.operation.library.mm.quope.ConcreteQuantumOperation#getFixedQuantumOperation <em>Fixed Quantum Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Quantum Operation</em>' containment reference.
	 * @see #getFixedQuantumOperation()
	 * @generated
	 */
	void setFixedQuantumOperation(FixedQuantumOperation value);

} // ConcreteQuantumOperation
