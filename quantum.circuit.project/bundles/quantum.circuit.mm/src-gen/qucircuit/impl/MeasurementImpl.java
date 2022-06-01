/**
 */
package qucircuit.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import qucircuit.ClassicBit;
import qucircuit.Measurement;
import qucircuit.QuCircuitPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measurement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qucircuit.impl.MeasurementImpl#getClassicBits <em>Classic Bits</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasurementImpl extends QuantumOperationImpl implements Measurement {
	/**
	 * The cached value of the '{@link #getClassicBits() <em>Classic Bits</em>}' reference list.
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
	protected MeasurementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuCircuitPackage.Literals.MEASUREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassicBit> getClassicBits() {
		if (classicBits == null) {
			classicBits = new EObjectResolvingEList<ClassicBit>(ClassicBit.class, this,
					QuCircuitPackage.MEASUREMENT__CLASSIC_BITS);
		}
		return classicBits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case QuCircuitPackage.MEASUREMENT__CLASSIC_BITS:
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
		case QuCircuitPackage.MEASUREMENT__CLASSIC_BITS:
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
		case QuCircuitPackage.MEASUREMENT__CLASSIC_BITS:
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
		case QuCircuitPackage.MEASUREMENT__CLASSIC_BITS:
			return classicBits != null && !classicBits.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MeasurementImpl
