/**
 */
package qucircuit.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import quantum.operation.library.mm.quope.ConcreteQuantumOperation;

import qucircuit.ClassicControl;
import qucircuit.QuCircuitPackage;
import qucircuit.QuantumOperation;
import qucircuit.Qubit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quantum Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qucircuit.impl.QuantumOperationImpl#getClassicControl <em>Classic Control</em>}</li>
 *   <li>{@link qucircuit.impl.QuantumOperationImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link qucircuit.impl.QuantumOperationImpl#getTargetQubits <em>Target Qubits</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class QuantumOperationImpl extends NamedElementImpl implements QuantumOperation {
	/**
	 * The cached value of the '{@link #getClassicControl() <em>Classic Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassicControl()
	 * @generated
	 * @ordered
	 */
	protected ClassicControl classicControl;

	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected ConcreteQuantumOperation operation;

	/**
	 * The cached value of the '{@link #getTargetQubits() <em>Target Qubits</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetQubits()
	 * @generated
	 * @ordered
	 */
	protected EList<Qubit> targetQubits;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuantumOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuCircuitPackage.Literals.QUANTUM_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassicControl getClassicControl() {
		return classicControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassicControl(ClassicControl newClassicControl, NotificationChain msgs) {
		ClassicControl oldClassicControl = classicControl;
		classicControl = newClassicControl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					QuCircuitPackage.QUANTUM_OPERATION__CLASSIC_CONTROL, oldClassicControl, newClassicControl);
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
	public void setClassicControl(ClassicControl newClassicControl) {
		if (newClassicControl != classicControl) {
			NotificationChain msgs = null;
			if (classicControl != null)
				msgs = ((InternalEObject) classicControl).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - QuCircuitPackage.QUANTUM_OPERATION__CLASSIC_CONTROL, null, msgs);
			if (newClassicControl != null)
				msgs = ((InternalEObject) newClassicControl).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - QuCircuitPackage.QUANTUM_OPERATION__CLASSIC_CONTROL, null, msgs);
			msgs = basicSetClassicControl(newClassicControl, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuCircuitPackage.QUANTUM_OPERATION__CLASSIC_CONTROL,
					newClassicControl, newClassicControl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteQuantumOperation getOperation() {
		if (operation != null && operation.eIsProxy()) {
			InternalEObject oldOperation = (InternalEObject) operation;
			operation = (ConcreteQuantumOperation) eResolveProxy(oldOperation);
			if (operation != oldOperation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							QuCircuitPackage.QUANTUM_OPERATION__OPERATION, oldOperation, operation));
			}
		}
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteQuantumOperation basicGetOperation() {
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperation(ConcreteQuantumOperation newOperation) {
		ConcreteQuantumOperation oldOperation = operation;
		operation = newOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuCircuitPackage.QUANTUM_OPERATION__OPERATION,
					oldOperation, operation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Qubit> getTargetQubits() {
		if (targetQubits == null) {
			targetQubits = new EObjectResolvingEList<Qubit>(Qubit.class, this,
					QuCircuitPackage.QUANTUM_OPERATION__TARGET_QUBITS);
		}
		return targetQubits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case QuCircuitPackage.QUANTUM_OPERATION__CLASSIC_CONTROL:
			return basicSetClassicControl(null, msgs);
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
		case QuCircuitPackage.QUANTUM_OPERATION__CLASSIC_CONTROL:
			return getClassicControl();
		case QuCircuitPackage.QUANTUM_OPERATION__OPERATION:
			if (resolve)
				return getOperation();
			return basicGetOperation();
		case QuCircuitPackage.QUANTUM_OPERATION__TARGET_QUBITS:
			return getTargetQubits();
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
		case QuCircuitPackage.QUANTUM_OPERATION__CLASSIC_CONTROL:
			setClassicControl((ClassicControl) newValue);
			return;
		case QuCircuitPackage.QUANTUM_OPERATION__OPERATION:
			setOperation((ConcreteQuantumOperation) newValue);
			return;
		case QuCircuitPackage.QUANTUM_OPERATION__TARGET_QUBITS:
			getTargetQubits().clear();
			getTargetQubits().addAll((Collection<? extends Qubit>) newValue);
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
		case QuCircuitPackage.QUANTUM_OPERATION__CLASSIC_CONTROL:
			setClassicControl((ClassicControl) null);
			return;
		case QuCircuitPackage.QUANTUM_OPERATION__OPERATION:
			setOperation((ConcreteQuantumOperation) null);
			return;
		case QuCircuitPackage.QUANTUM_OPERATION__TARGET_QUBITS:
			getTargetQubits().clear();
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
		case QuCircuitPackage.QUANTUM_OPERATION__CLASSIC_CONTROL:
			return classicControl != null;
		case QuCircuitPackage.QUANTUM_OPERATION__OPERATION:
			return operation != null;
		case QuCircuitPackage.QUANTUM_OPERATION__TARGET_QUBITS:
			return targetQubits != null && !targetQubits.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QuantumOperationImpl
