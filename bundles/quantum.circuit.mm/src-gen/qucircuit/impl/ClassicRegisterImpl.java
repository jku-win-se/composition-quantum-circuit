/**
 */
package qucircuit.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import qucircuit.ClassicBit;
import qucircuit.ClassicRegister;
import qucircuit.QuCircuitPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classic Register</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qucircuit.impl.ClassicRegisterImpl#getClassicBits <em>Classic Bits</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassicRegisterImpl extends NamedElementImpl implements ClassicRegister {
	/**
	 * The cached value of the '{@link #getClassicBits() <em>Classic Bits</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassicBits()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassicBit> classicBits;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassicRegisterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuCircuitPackage.Literals.CLASSIC_REGISTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassicBit> getClassicBits() {
		if (classicBits == null) {
			classicBits = new EObjectContainmentEList<ClassicBit>(ClassicBit.class, this,
					QuCircuitPackage.CLASSIC_REGISTER__CLASSIC_BITS);
		}
		return classicBits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case QuCircuitPackage.CLASSIC_REGISTER__CLASSIC_BITS:
			return ((InternalEList<?>) getClassicBits()).basicRemove(otherEnd, msgs);
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
		case QuCircuitPackage.CLASSIC_REGISTER__CLASSIC_BITS:
			return getClassicBits();
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
		case QuCircuitPackage.CLASSIC_REGISTER__CLASSIC_BITS:
			getClassicBits().clear();
			getClassicBits().addAll((Collection<? extends ClassicBit>) newValue);
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
		case QuCircuitPackage.CLASSIC_REGISTER__CLASSIC_BITS:
			getClassicBits().clear();
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
		case QuCircuitPackage.CLASSIC_REGISTER__CLASSIC_BITS:
			return classicBits != null && !classicBits.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClassicRegisterImpl
