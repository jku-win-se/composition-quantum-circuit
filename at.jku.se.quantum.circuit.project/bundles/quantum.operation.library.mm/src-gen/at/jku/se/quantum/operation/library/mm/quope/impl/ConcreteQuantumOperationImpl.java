/**
 */
package at.jku.se.quantum.operation.library.mm.quope.impl;

import at.jku.se.quantum.operation.library.mm.quope.ConcreteQuantumOperation;
import at.jku.se.quantum.operation.library.mm.quope.FixedQuantumOperation;
import at.jku.se.quantum.operation.library.mm.quope.Parameter;
import at.jku.se.quantum.operation.library.mm.quope.QuantumOpePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concrete Quantum Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.jku.se.quantum.operation.library.mm.quope.impl.ConcreteQuantumOperationImpl#getType <em>Type</em>}</li>
 *   <li>{@link at.jku.se.quantum.operation.library.mm.quope.impl.ConcreteQuantumOperationImpl#getReverseConcreteQuantumOperation <em>Reverse Concrete Quantum Operation</em>}</li>
 *   <li>{@link at.jku.se.quantum.operation.library.mm.quope.impl.ConcreteQuantumOperationImpl#getAbbreviation <em>Abbreviation</em>}</li>
 *   <li>{@link at.jku.se.quantum.operation.library.mm.quope.impl.ConcreteQuantumOperationImpl#getPaletteIconPath <em>Palette Icon Path</em>}</li>
 *   <li>{@link at.jku.se.quantum.operation.library.mm.quope.impl.ConcreteQuantumOperationImpl#getStyleIconPath <em>Style Icon Path</em>}</li>
 *   <li>{@link at.jku.se.quantum.operation.library.mm.quope.impl.ConcreteQuantumOperationImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link at.jku.se.quantum.operation.library.mm.quope.impl.ConcreteQuantumOperationImpl#getFixedQuantumOperation <em>Fixed Quantum Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConcreteQuantumOperationImpl extends NamedElementImpl implements ConcreteQuantumOperation {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EClass type;

	/**
	 * The cached value of the '{@link #getReverseConcreteQuantumOperation() <em>Reverse Concrete Quantum Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReverseConcreteQuantumOperation()
	 * @generated
	 * @ordered
	 */
	protected ConcreteQuantumOperation reverseConcreteQuantumOperation;

	/**
	 * The default value of the '{@link #getAbbreviation() <em>Abbreviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbbreviation()
	 * @generated
	 * @ordered
	 */
	protected static final String ABBREVIATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbbreviation() <em>Abbreviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbbreviation()
	 * @generated
	 * @ordered
	 */
	protected String abbreviation = ABBREVIATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPaletteIconPath() <em>Palette Icon Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaletteIconPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PALETTE_ICON_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPaletteIconPath() <em>Palette Icon Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaletteIconPath()
	 * @generated
	 * @ordered
	 */
	protected String paletteIconPath = PALETTE_ICON_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getStyleIconPath() <em>Style Icon Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleIconPath()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_ICON_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStyleIconPath() <em>Style Icon Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleIconPath()
	 * @generated
	 * @ordered
	 */
	protected String styleIconPath = STYLE_ICON_PATH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected Parameter parameter;

	/**
	 * The cached value of the '{@link #getFixedQuantumOperation() <em>Fixed Quantum Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedQuantumOperation()
	 * @generated
	 * @ordered
	 */
	protected FixedQuantumOperation fixedQuantumOperation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcreteQuantumOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuantumOpePackage.Literals.CONCRETE_QUANTUM_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject) type;
			type = (EClass) eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							QuantumOpePackage.CONCRETE_QUANTUM_OPERATION__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(EClass newType) {
		EClass oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuantumOpePackage.CONCRETE_QUANTUM_OPERATION__TYPE,
					oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteQuantumOperation getReverseConcreteQuantumOperation() {
		if (reverseConcreteQuantumOperation != null && reverseConcreteQuantumOperation.eIsProxy()) {
			InternalEObject oldReverseConcreteQuantumOperation = (InternalEObject) reverseConcreteQuantumOperation;
			reverseConcreteQuantumOperation = (ConcreteQuantumOperation) eResolveProxy(
					oldReverseConcreteQuantumOperation);
			if (reverseConcreteQuantumOperation != oldReverseConcreteQuantumOperation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							QuantumOpePackage.CONCRETE_QUANTUM_OPERATION__REVERSE_CONCRETE_QUANTUM_OPERATION,
							oldReverseConcreteQuantumOperation, reverseConcreteQuantumOperation));
			}
		}
		return reverseConcreteQuantumOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteQuantumOperation basicGetReverseConcreteQuantumOperation() {
		return reverseConcreteQuantumOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReverseConcreteQuantumOperation(ConcreteQuantumOperation newReverseConcreteQuantumOperation) {
		ConcreteQuantumOperation oldReverseConcreteQuantumOperation = reverseConcreteQuantumOperation;
		reverseConcreteQuantumOperation = newReverseConcreteQuantumOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					QuantumOpePackage.CONCRETE_QUANTUM_OPERATION__REVERSE_CONCRETE_QUANTUM_OPERATION,
					oldReverseConcreteQuantumOperation, reverseConcreteQuantumOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAbbreviation() {
		return abbreviation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbbreviation(String newAbbreviation) {
		String oldAbbreviation = abbreviation;
		abbreviation = newAbbreviation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					QuantumOpePackage.CONCRETE_QUANTUM_OPERATION__ABBREVIATION, oldAbbreviation, abbreviation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPaletteIconPath() {
		return paletteIconPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaletteIconPath(String newPaletteIconPath) {
		String oldPaletteIconPath = paletteIconPath;
		paletteIconPath = newPaletteIconPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					QuantumOpePackage.CONCRETE_QUANTUM_OPERATION__PALETTE_ICON_PATH, oldPaletteIconPath,
					paletteIconPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStyleIconPath() {
		return styleIconPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyleIconPath(String newStyleIconPath) {
		String oldStyleIconPath = styleIconPath;
		styleIconPath = newStyleIconPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					QuantumOpePackage.CONCRETE_QUANTUM_OPERATION__STYLE_ICON_PATH, oldStyleIconPath, styleIconPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getParameter() {
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameter(Parameter newParameter, NotificationChain msgs) {
		Parameter oldParameter = parameter;
		parameter = newParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					QuantumOpePackage.CONCRETE_QUANTUM_OPERATION__PARAMETER, oldParameter, newParameter);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter(Parameter newParameter) {
		if (newParameter != parameter) {
			NotificationChain msgs = null;
			if (parameter != null)
				msgs = ((InternalEObject) parameter).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - QuantumOpePackage.CONCRETE_QUANTUM_OPERATION__PARAMETER, null, msgs);
			if (newParameter != null)
				msgs = ((InternalEObject) newParameter).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - QuantumOpePackage.CONCRETE_QUANTUM_OPERATION__PARAMETER, null, msgs);
			msgs = basicSetParameter(newParameter, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					QuantumOpePackage.CONCRETE_QUANTUM_OPERATION__PARAMETER, newParameter, newParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedQuantumOperation getFixedQuantumOperation() {
		return fixedQuantumOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedQuantumOperation(FixedQuantumOperation newFixedQuantumOperation,
			NotificationChain msgs) {
		FixedQuantumOperation oldFixedQuantumOperation = fixedQuantumOperation;
		fixedQuantumOperation = newFixedQuantumOperation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					QuantumOpePackage.CONCRETE_QUANTUM_OPERATION__FIXED_QUANTUM_OPERATION, oldFixedQuantumOperation,
					newFixedQuantumOperation);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixedQuantumOperation(FixedQuantumOperation newFixedQuantumOperation) {
		if (newFixedQuantumOperation != fixedQuantumOperation) {
			NotificationChain msgs = null;
			if (fixedQuantumOperation != null)
				msgs = ((InternalEObject) fixedQuantumOperation).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - QuantumOpePackage.CONCRETE_QUANTUM_OPERATION__FIXED_QUANTUM_OPERATION,
						null, msgs);
			if (newFixedQuantumOperation != null)
				msgs = ((InternalEObject) newFixedQuantumOperation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - QuantumOpePackage.CONCRETE_QUANTUM_OPERATION__FIXED_QUANTUM_OPERATION,
						null, msgs);
			msgs = basicSetFixedQuantumOperation(newFixedQuantumOperation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					QuantumOpePackage.CONCRETE_QUANTUM_OPERATION__FIXED_QUANTUM_OPERATION, newFixedQuantumOperation,
					newFixedQuantumOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case QuantumOpePackage.CONCRETE_QUANTUM_OPERATION__PARAMETER:
			return basicSetParameter(null, msgs);
		case QuantumOpePackage.CONCRETE_QUANTUM_OPERATION__FIXED_QUANTUM_OPERATION:
			return basicSetFixedQuantumOperation(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case QuantumOpePackage.CONCRETE_QUANTUM_OPERATION__TYPE:
			if (resolve)
				return getType();
			return basicGetType();
		case QuantumOpePackage.CONCRETE_QUANTUM_OPERATION__REVERSE_CONCRETE_QUANTUM_OPERATION:
			if (resolve)
				return getReverseConcreteQuantumOperation();
			return basicGetReverseConcreteQuantumOperation();
		case QuantumOpePackage.CONCRETE_QUANTUM_OPERATION__ABBREVIATION:
			return getAbbreviation();
		case QuantumOpePackage.CONCRETE_QUANTUM_OPERATION__PALETTE_ICON_PATH:
			return getPaletteIconPath();
		case QuantumOpePackage.CONCRETE_QUANTUM_OPERATION__STYLE_ICON_PATH:
			return getStyleIconPath();
		case QuantumOpePackage.CONCRETE_QUANTUM_OPERATION__PARAMETER:
			return getParameter();
		case QuantumOpePackage.CONCRETE_QUANTUM_OPERATION__FIXED_QUANTUM_OPERATION:
			return getFixedQuantumOperation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case QuantumOpePackage.CONCRETE_QUANTUM_OPERATION__TYPE:
			setType((EClass) newValue);
			return;
		case QuantumOpePackage.CONCRETE_QUANTUM_OPERATION__REVERSE_CONCRETE_QUANTUM_OPERATION:
			setReverseConcreteQuantumOperation((ConcreteQuantumOperation) newValue);
			return;
		case QuantumOpePackage.CONCRETE_QUANTUM_OPERATION__ABBREVIATION:
			setAbbreviation((String) newValue);
			return;
		case QuantumOpePackage.CONCRETE_QUANTUM_OPERATION__PALETTE_ICON_PATH:
			setPaletteIconPath((String) newValue);
			return;
		case QuantumOpePackage.CONCRETE_QUANTUM_OPERATION__STYLE_ICON_PATH:
			setStyleIconPath((String) newValue);
			return;
		case QuantumOpePackage.CONCRETE_QUANTUM_OPERATION__PARAMETER:
			setParameter((Parameter) newValue);
			return;
		case QuantumOpePackage.CONCRETE_QUANTUM_OPERATION__FIXED_QUANTUM_OPERATION:
			setFixedQuantumOperation((FixedQuantumOperation) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case QuantumOpePackage.CONCRETE_QUANTUM_OPERATION__TYPE:
			setType((EClass) null);
			return;
		case QuantumOpePackage.CONCRETE_QUANTUM_OPERATION__REVERSE_CONCRETE_QUANTUM_OPERATION:
			setReverseConcreteQuantumOperation((ConcreteQuantumOperation) null);
			return;
		case QuantumOpePackage.CONCRETE_QUANTUM_OPERATION__ABBREVIATION:
			setAbbreviation(ABBREVIATION_EDEFAULT);
			return;
		case QuantumOpePackage.CONCRETE_QUANTUM_OPERATION__PALETTE_ICON_PATH:
			setPaletteIconPath(PALETTE_ICON_PATH_EDEFAULT);
			return;
		case QuantumOpePackage.CONCRETE_QUANTUM_OPERATION__STYLE_ICON_PATH:
			setStyleIconPath(STYLE_ICON_PATH_EDEFAULT);
			return;
		case QuantumOpePackage.CONCRETE_QUANTUM_OPERATION__PARAMETER:
			setParameter((Parameter) null);
			return;
		case QuantumOpePackage.CONCRETE_QUANTUM_OPERATION__FIXED_QUANTUM_OPERATION:
			setFixedQuantumOperation((FixedQuantumOperation) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case QuantumOpePackage.CONCRETE_QUANTUM_OPERATION__TYPE:
			return type != null;
		case QuantumOpePackage.CONCRETE_QUANTUM_OPERATION__REVERSE_CONCRETE_QUANTUM_OPERATION:
			return reverseConcreteQuantumOperation != null;
		case QuantumOpePackage.CONCRETE_QUANTUM_OPERATION__ABBREVIATION:
			return ABBREVIATION_EDEFAULT == null ? abbreviation != null : !ABBREVIATION_EDEFAULT.equals(abbreviation);
		case QuantumOpePackage.CONCRETE_QUANTUM_OPERATION__PALETTE_ICON_PATH:
			return PALETTE_ICON_PATH_EDEFAULT == null ? paletteIconPath != null
					: !PALETTE_ICON_PATH_EDEFAULT.equals(paletteIconPath);
		case QuantumOpePackage.CONCRETE_QUANTUM_OPERATION__STYLE_ICON_PATH:
			return STYLE_ICON_PATH_EDEFAULT == null ? styleIconPath != null
					: !STYLE_ICON_PATH_EDEFAULT.equals(styleIconPath);
		case QuantumOpePackage.CONCRETE_QUANTUM_OPERATION__PARAMETER:
			return parameter != null;
		case QuantumOpePackage.CONCRETE_QUANTUM_OPERATION__FIXED_QUANTUM_OPERATION:
			return fixedQuantumOperation != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (abbreviation: ");
		result.append(abbreviation);
		result.append(", paletteIconPath: ");
		result.append(paletteIconPath);
		result.append(", styleIconPath: ");
		result.append(styleIconPath);
		result.append(')');
		return result.toString();
	}

} //ConcreteQuantumOperationImpl
