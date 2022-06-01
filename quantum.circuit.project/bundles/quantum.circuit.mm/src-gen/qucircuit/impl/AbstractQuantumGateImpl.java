/**
 */
package qucircuit.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import qucircuit.AbstractQuantumGate;
import qucircuit.QuCircuitPackage;
import qucircuit.Qubit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Quantum Gate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qucircuit.impl.AbstractQuantumGateImpl#getControlQubits <em>Control Qubits</em>}</li>
 *   <li>{@link qucircuit.impl.AbstractQuantumGateImpl#getInverseForm <em>Inverse Form</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractQuantumGateImpl extends QuantumOperationImpl implements AbstractQuantumGate {
	/**
	 * The cached value of the '{@link #getControlQubits() <em>Control Qubits</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlQubits()
	 * @generated
	 * @ordered
	 */
	protected EList<Qubit> controlQubits;

	/**
	 * The default value of the '{@link #getInverseForm() <em>Inverse Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInverseForm()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INVERSE_FORM_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getInverseForm() <em>Inverse Form</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInverseForm()
	 * @generated
	 * @ordered
	 */
	protected Boolean inverseForm = INVERSE_FORM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractQuantumGateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuCircuitPackage.Literals.ABSTRACT_QUANTUM_GATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Qubit> getControlQubits() {
		if (controlQubits == null) {
			controlQubits = new EObjectResolvingEList<Qubit>(Qubit.class, this,
					QuCircuitPackage.ABSTRACT_QUANTUM_GATE__CONTROL_QUBITS);
		}
		return controlQubits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getInverseForm() {
		return inverseForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInverseForm(Boolean newInverseForm) {
		Boolean oldInverseForm = inverseForm;
		inverseForm = newInverseForm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuCircuitPackage.ABSTRACT_QUANTUM_GATE__INVERSE_FORM,
					oldInverseForm, inverseForm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case QuCircuitPackage.ABSTRACT_QUANTUM_GATE__CONTROL_QUBITS:
			return getControlQubits();
		case QuCircuitPackage.ABSTRACT_QUANTUM_GATE__INVERSE_FORM:
			return getInverseForm();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case QuCircuitPackage.ABSTRACT_QUANTUM_GATE__CONTROL_QUBITS:
			getControlQubits().clear();
			getControlQubits().addAll((Collection<? extends Qubit>) newValue);
			return;
		case QuCircuitPackage.ABSTRACT_QUANTUM_GATE__INVERSE_FORM:
			setInverseForm((Boolean) newValue);
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
		case QuCircuitPackage.ABSTRACT_QUANTUM_GATE__CONTROL_QUBITS:
			getControlQubits().clear();
			return;
		case QuCircuitPackage.ABSTRACT_QUANTUM_GATE__INVERSE_FORM:
			setInverseForm(INVERSE_FORM_EDEFAULT);
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
		case QuCircuitPackage.ABSTRACT_QUANTUM_GATE__CONTROL_QUBITS:
			return controlQubits != null && !controlQubits.isEmpty();
		case QuCircuitPackage.ABSTRACT_QUANTUM_GATE__INVERSE_FORM:
			return INVERSE_FORM_EDEFAULT == null ? inverseForm != null : !INVERSE_FORM_EDEFAULT.equals(inverseForm);
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
		result.append(" (inverseForm: ");
		result.append(inverseForm);
		result.append(')');
		return result.toString();
	}

} //AbstractQuantumGateImpl
