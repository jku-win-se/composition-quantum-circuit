/**
 */
package qucircuit.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import qucircuit.Index;
import qucircuit.QucircuitPackage;
import qucircuit.Register;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Index</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qucircuit.impl.IndexImpl#getRegister <em>Register</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class IndexImpl extends MinimalEObjectImpl.Container implements Index {
	/**
	 * The cached value of the '{@link #getRegister() <em>Register</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegister()
	 * @generated
	 * @ordered
	 */
	protected Register register;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndexImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QucircuitPackage.Literals.INDEX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Register getRegister() {
		if (register != null && register.eIsProxy()) {
			InternalEObject oldRegister = (InternalEObject)register;
			register = (Register)eResolveProxy(oldRegister);
			if (register != oldRegister) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QucircuitPackage.INDEX__REGISTER, oldRegister, register));
			}
		}
		return register;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Register basicGetRegister() {
		return register;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegister(Register newRegister) {
		Register oldRegister = register;
		register = newRegister;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QucircuitPackage.INDEX__REGISTER, oldRegister, register));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QucircuitPackage.INDEX__REGISTER:
				if (resolve) return getRegister();
				return basicGetRegister();
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
			case QucircuitPackage.INDEX__REGISTER:
				setRegister((Register)newValue);
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
			case QucircuitPackage.INDEX__REGISTER:
				setRegister((Register)null);
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
			case QucircuitPackage.INDEX__REGISTER:
				return register != null;
		}
		return super.eIsSet(featureID);
	}

} //IndexImpl
