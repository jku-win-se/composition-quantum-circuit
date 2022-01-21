/**
 */
package quantum.operation.library.mm.quope.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import quantum.operation.library.mm.quope.FixedQuantumOperation;
import quantum.operation.library.mm.quope.QuantumOpePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fixed Quantum Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link quantum.operation.library.mm.quope.impl.FixedQuantumOperationImpl#getNumberOfTargetQubits <em>Number Of Target Qubits</em>}</li>
 *   <li>{@link quantum.operation.library.mm.quope.impl.FixedQuantumOperationImpl#getNumberOfControlQubits <em>Number Of Control Qubits</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FixedQuantumOperationImpl extends MinimalEObjectImpl.Container implements FixedQuantumOperation {
	/**
	 * The default value of the '{@link #getNumberOfTargetQubits() <em>Number Of Target Qubits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfTargetQubits()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NUMBER_OF_TARGET_QUBITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberOfTargetQubits() <em>Number Of Target Qubits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfTargetQubits()
	 * @generated
	 * @ordered
	 */
	protected Integer numberOfTargetQubits = NUMBER_OF_TARGET_QUBITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfControlQubits() <em>Number Of Control Qubits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfControlQubits()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NUMBER_OF_CONTROL_QUBITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberOfControlQubits() <em>Number Of Control Qubits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfControlQubits()
	 * @generated
	 * @ordered
	 */
	protected Integer numberOfControlQubits = NUMBER_OF_CONTROL_QUBITS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FixedQuantumOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuantumOpePackage.Literals.FIXED_QUANTUM_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getNumberOfTargetQubits() {
		return numberOfTargetQubits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfTargetQubits(Integer newNumberOfTargetQubits) {
		Integer oldNumberOfTargetQubits = numberOfTargetQubits;
		numberOfTargetQubits = newNumberOfTargetQubits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					QuantumOpePackage.FIXED_QUANTUM_OPERATION__NUMBER_OF_TARGET_QUBITS, oldNumberOfTargetQubits,
					numberOfTargetQubits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getNumberOfControlQubits() {
		return numberOfControlQubits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfControlQubits(Integer newNumberOfControlQubits) {
		Integer oldNumberOfControlQubits = numberOfControlQubits;
		numberOfControlQubits = newNumberOfControlQubits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					QuantumOpePackage.FIXED_QUANTUM_OPERATION__NUMBER_OF_CONTROL_QUBITS, oldNumberOfControlQubits,
					numberOfControlQubits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case QuantumOpePackage.FIXED_QUANTUM_OPERATION__NUMBER_OF_TARGET_QUBITS:
			return getNumberOfTargetQubits();
		case QuantumOpePackage.FIXED_QUANTUM_OPERATION__NUMBER_OF_CONTROL_QUBITS:
			return getNumberOfControlQubits();
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
		case QuantumOpePackage.FIXED_QUANTUM_OPERATION__NUMBER_OF_TARGET_QUBITS:
			setNumberOfTargetQubits((Integer) newValue);
			return;
		case QuantumOpePackage.FIXED_QUANTUM_OPERATION__NUMBER_OF_CONTROL_QUBITS:
			setNumberOfControlQubits((Integer) newValue);
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
		case QuantumOpePackage.FIXED_QUANTUM_OPERATION__NUMBER_OF_TARGET_QUBITS:
			setNumberOfTargetQubits(NUMBER_OF_TARGET_QUBITS_EDEFAULT);
			return;
		case QuantumOpePackage.FIXED_QUANTUM_OPERATION__NUMBER_OF_CONTROL_QUBITS:
			setNumberOfControlQubits(NUMBER_OF_CONTROL_QUBITS_EDEFAULT);
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
		case QuantumOpePackage.FIXED_QUANTUM_OPERATION__NUMBER_OF_TARGET_QUBITS:
			return NUMBER_OF_TARGET_QUBITS_EDEFAULT == null ? numberOfTargetQubits != null
					: !NUMBER_OF_TARGET_QUBITS_EDEFAULT.equals(numberOfTargetQubits);
		case QuantumOpePackage.FIXED_QUANTUM_OPERATION__NUMBER_OF_CONTROL_QUBITS:
			return NUMBER_OF_CONTROL_QUBITS_EDEFAULT == null ? numberOfControlQubits != null
					: !NUMBER_OF_CONTROL_QUBITS_EDEFAULT.equals(numberOfControlQubits);
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
		result.append(" (numberOfTargetQubits: ");
		result.append(numberOfTargetQubits);
		result.append(", numberOfControlQubits: ");
		result.append(numberOfControlQubits);
		result.append(')');
		return result.toString();
	}

} //FixedQuantumOperationImpl
