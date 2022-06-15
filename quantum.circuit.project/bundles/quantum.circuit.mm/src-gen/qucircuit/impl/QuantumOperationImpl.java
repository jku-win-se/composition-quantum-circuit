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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import qucircuit.ClassicControl;
import qucircuit.Index;
import qucircuit.QuantumOperation;
import qucircuit.QucircuitPackage;

import quope.ConcreteQuantumOperation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quantum Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qucircuit.impl.QuantumOperationImpl#getClassicControl <em>Classic Control</em>}</li>
 *   <li>{@link qucircuit.impl.QuantumOperationImpl#getOperations <em>Operations</em>}</li>
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
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<ConcreteQuantumOperation> operations;

	/**
	 * The cached value of the '{@link #getTargetQubits() <em>Target Qubits</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetQubits()
	 * @generated
	 * @ordered
	 */
	protected EList<Index> targetQubits;

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
		return QucircuitPackage.Literals.QUANTUM_OPERATION;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QucircuitPackage.QUANTUM_OPERATION__CLASSIC_CONTROL, oldClassicControl, newClassicControl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
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
				msgs = ((InternalEObject)classicControl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QucircuitPackage.QUANTUM_OPERATION__CLASSIC_CONTROL, null, msgs);
			if (newClassicControl != null)
				msgs = ((InternalEObject)newClassicControl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QucircuitPackage.QUANTUM_OPERATION__CLASSIC_CONTROL, null, msgs);
			msgs = basicSetClassicControl(newClassicControl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QucircuitPackage.QUANTUM_OPERATION__CLASSIC_CONTROL, newClassicControl, newClassicControl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConcreteQuantumOperation> getOperations() {
		if (operations == null) {
			operations = new EObjectResolvingEList<ConcreteQuantumOperation>(ConcreteQuantumOperation.class, this, QucircuitPackage.QUANTUM_OPERATION__OPERATIONS);
		}
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Index> getTargetQubits() {
		if (targetQubits == null) {
			targetQubits = new EObjectContainmentEList<Index>(Index.class, this, QucircuitPackage.QUANTUM_OPERATION__TARGET_QUBITS);
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
			case QucircuitPackage.QUANTUM_OPERATION__CLASSIC_CONTROL:
				return basicSetClassicControl(null, msgs);
			case QucircuitPackage.QUANTUM_OPERATION__TARGET_QUBITS:
				return ((InternalEList<?>)getTargetQubits()).basicRemove(otherEnd, msgs);
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
			case QucircuitPackage.QUANTUM_OPERATION__CLASSIC_CONTROL:
				return getClassicControl();
			case QucircuitPackage.QUANTUM_OPERATION__OPERATIONS:
				return getOperations();
			case QucircuitPackage.QUANTUM_OPERATION__TARGET_QUBITS:
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
			case QucircuitPackage.QUANTUM_OPERATION__CLASSIC_CONTROL:
				setClassicControl((ClassicControl)newValue);
				return;
			case QucircuitPackage.QUANTUM_OPERATION__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection<? extends ConcreteQuantumOperation>)newValue);
				return;
			case QucircuitPackage.QUANTUM_OPERATION__TARGET_QUBITS:
				getTargetQubits().clear();
				getTargetQubits().addAll((Collection<? extends Index>)newValue);
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
			case QucircuitPackage.QUANTUM_OPERATION__CLASSIC_CONTROL:
				setClassicControl((ClassicControl)null);
				return;
			case QucircuitPackage.QUANTUM_OPERATION__OPERATIONS:
				getOperations().clear();
				return;
			case QucircuitPackage.QUANTUM_OPERATION__TARGET_QUBITS:
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
			case QucircuitPackage.QUANTUM_OPERATION__CLASSIC_CONTROL:
				return classicControl != null;
			case QucircuitPackage.QUANTUM_OPERATION__OPERATIONS:
				return operations != null && !operations.isEmpty();
			case QucircuitPackage.QUANTUM_OPERATION__TARGET_QUBITS:
				return targetQubits != null && !targetQubits.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QuantumOperationImpl
