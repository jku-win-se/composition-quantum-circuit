/**
 */
package qucircuit.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import qucircuit.LOOP_KIND;
import qucircuit.Loop;
import qucircuit.QuCircuitPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Loop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qucircuit.impl.LoopImpl#getIterations <em>Iterations</em>}</li>
 *   <li>{@link qucircuit.impl.LoopImpl#getLoopKind <em>Loop Kind</em>}</li>
 *   <li>{@link qucircuit.impl.LoopImpl#isIncrement <em>Increment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoopImpl extends AbstractCompositeGateImpl implements Loop {
	/**
	 * The default value of the '{@link #getIterations() <em>Iterations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIterations()
	 * @generated
	 * @ordered
	 */
	protected static final int ITERATIONS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIterations() <em>Iterations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIterations()
	 * @generated
	 * @ordered
	 */
	protected int iterations = ITERATIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLoopKind() <em>Loop Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopKind()
	 * @generated
	 * @ordered
	 */
	protected static final LOOP_KIND LOOP_KIND_EDEFAULT = LOOP_KIND.CONTROL_QUBITS_LOOP;

	/**
	 * The cached value of the '{@link #getLoopKind() <em>Loop Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopKind()
	 * @generated
	 * @ordered
	 */
	protected LOOP_KIND loopKind = LOOP_KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #isIncrement() <em>Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncrement()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INCREMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIncrement() <em>Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncrement()
	 * @generated
	 * @ordered
	 */
	protected boolean increment = INCREMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoopImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuCircuitPackage.Literals.LOOP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIterations() {
		return iterations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIterations(int newIterations) {
		int oldIterations = iterations;
		iterations = newIterations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuCircuitPackage.LOOP__ITERATIONS, oldIterations,
					iterations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LOOP_KIND getLoopKind() {
		return loopKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoopKind(LOOP_KIND newLoopKind) {
		LOOP_KIND oldLoopKind = loopKind;
		loopKind = newLoopKind == null ? LOOP_KIND_EDEFAULT : newLoopKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuCircuitPackage.LOOP__LOOP_KIND, oldLoopKind,
					loopKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIncrement() {
		return increment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncrement(boolean newIncrement) {
		boolean oldIncrement = increment;
		increment = newIncrement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuCircuitPackage.LOOP__INCREMENT, oldIncrement,
					increment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case QuCircuitPackage.LOOP__ITERATIONS:
			return getIterations();
		case QuCircuitPackage.LOOP__LOOP_KIND:
			return getLoopKind();
		case QuCircuitPackage.LOOP__INCREMENT:
			return isIncrement();
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
		case QuCircuitPackage.LOOP__ITERATIONS:
			setIterations((Integer) newValue);
			return;
		case QuCircuitPackage.LOOP__LOOP_KIND:
			setLoopKind((LOOP_KIND) newValue);
			return;
		case QuCircuitPackage.LOOP__INCREMENT:
			setIncrement((Boolean) newValue);
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
		case QuCircuitPackage.LOOP__ITERATIONS:
			setIterations(ITERATIONS_EDEFAULT);
			return;
		case QuCircuitPackage.LOOP__LOOP_KIND:
			setLoopKind(LOOP_KIND_EDEFAULT);
			return;
		case QuCircuitPackage.LOOP__INCREMENT:
			setIncrement(INCREMENT_EDEFAULT);
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
		case QuCircuitPackage.LOOP__ITERATIONS:
			return iterations != ITERATIONS_EDEFAULT;
		case QuCircuitPackage.LOOP__LOOP_KIND:
			return loopKind != LOOP_KIND_EDEFAULT;
		case QuCircuitPackage.LOOP__INCREMENT:
			return increment != INCREMENT_EDEFAULT;
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
		result.append(" (iterations: ");
		result.append(iterations);
		result.append(", loopKind: ");
		result.append(loopKind);
		result.append(", increment: ");
		result.append(increment);
		result.append(')');
		return result.toString();
	}

} //LoopImpl
