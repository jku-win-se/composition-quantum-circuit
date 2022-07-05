/**
 */
package qucircuit.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import qubo.Qubo;
import qucircuit.CompositeQuantumGate;
import qucircuit.QucircuitPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Quantum Gate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qucircuit.impl.CompositeQuantumGateImpl#getQubo <em>Qubo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeQuantumGateImpl extends AbstractCompositeGateImpl implements CompositeQuantumGate {
	/**
	 * The cached value of the '{@link #getQubo() <em>Qubo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQubo()
	 * @generated
	 * @ordered
	 */
	protected Qubo qubo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeQuantumGateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QucircuitPackage.Literals.COMPOSITE_QUANTUM_GATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Qubo getQubo() {
		if (qubo != null && qubo.eIsProxy()) {
			InternalEObject oldQubo = (InternalEObject)qubo;
			qubo = (Qubo)eResolveProxy(oldQubo);
			if (qubo != oldQubo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QucircuitPackage.COMPOSITE_QUANTUM_GATE__QUBO, oldQubo, qubo));
			}
		}
		return qubo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Qubo basicGetQubo() {
		return qubo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQubo(Qubo newQubo) {
		Qubo oldQubo = qubo;
		qubo = newQubo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QucircuitPackage.COMPOSITE_QUANTUM_GATE__QUBO, oldQubo, qubo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QucircuitPackage.COMPOSITE_QUANTUM_GATE__QUBO:
				if (resolve) return getQubo();
				return basicGetQubo();
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
			case QucircuitPackage.COMPOSITE_QUANTUM_GATE__QUBO:
				setQubo((Qubo)newValue);
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
			case QucircuitPackage.COMPOSITE_QUANTUM_GATE__QUBO:
				setQubo((Qubo)null);
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
			case QucircuitPackage.COMPOSITE_QUANTUM_GATE__QUBO:
				return qubo != null;
		}
		return super.eIsSet(featureID);
	}

} //CompositeQuantumGateImpl
