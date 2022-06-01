/**
 */
package at.jku.se.quantum.operation.library.mm.quope.impl;

import at.jku.se.quantum.operation.library.mm.quope.ConcreteQuantumOperation;
import at.jku.se.quantum.operation.library.mm.quope.LoopOperation;
import at.jku.se.quantum.operation.library.mm.quope.QuantumOpePackage;
import at.jku.se.quantum.operation.library.mm.quope.QuantumOperationLibrary;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quantum Operation Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link at.jku.se.quantum.operation.library.mm.quope.impl.QuantumOperationLibraryImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link at.jku.se.quantum.operation.library.mm.quope.impl.QuantumOperationLibraryImpl#getLoopOperations <em>Loop Operations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuantumOperationLibraryImpl extends NamedElementImpl implements QuantumOperationLibrary {
	/**
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<ConcreteQuantumOperation> operations;

	/**
	 * The cached value of the '{@link #getLoopOperations() <em>Loop Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<LoopOperation> loopOperations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuantumOperationLibraryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuantumOpePackage.Literals.QUANTUM_OPERATION_LIBRARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConcreteQuantumOperation> getOperations() {
		if (operations == null) {
			operations = new EObjectContainmentEList<ConcreteQuantumOperation>(ConcreteQuantumOperation.class, this,
					QuantumOpePackage.QUANTUM_OPERATION_LIBRARY__OPERATIONS);
		}
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LoopOperation> getLoopOperations() {
		if (loopOperations == null) {
			loopOperations = new EObjectContainmentEList<LoopOperation>(LoopOperation.class, this,
					QuantumOpePackage.QUANTUM_OPERATION_LIBRARY__LOOP_OPERATIONS);
		}
		return loopOperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case QuantumOpePackage.QUANTUM_OPERATION_LIBRARY__OPERATIONS:
			return ((InternalEList<?>) getOperations()).basicRemove(otherEnd, msgs);
		case QuantumOpePackage.QUANTUM_OPERATION_LIBRARY__LOOP_OPERATIONS:
			return ((InternalEList<?>) getLoopOperations()).basicRemove(otherEnd, msgs);
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
		case QuantumOpePackage.QUANTUM_OPERATION_LIBRARY__OPERATIONS:
			return getOperations();
		case QuantumOpePackage.QUANTUM_OPERATION_LIBRARY__LOOP_OPERATIONS:
			return getLoopOperations();
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
		case QuantumOpePackage.QUANTUM_OPERATION_LIBRARY__OPERATIONS:
			getOperations().clear();
			getOperations().addAll((Collection<? extends ConcreteQuantumOperation>) newValue);
			return;
		case QuantumOpePackage.QUANTUM_OPERATION_LIBRARY__LOOP_OPERATIONS:
			getLoopOperations().clear();
			getLoopOperations().addAll((Collection<? extends LoopOperation>) newValue);
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
		case QuantumOpePackage.QUANTUM_OPERATION_LIBRARY__OPERATIONS:
			getOperations().clear();
			return;
		case QuantumOpePackage.QUANTUM_OPERATION_LIBRARY__LOOP_OPERATIONS:
			getLoopOperations().clear();
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
		case QuantumOpePackage.QUANTUM_OPERATION_LIBRARY__OPERATIONS:
			return operations != null && !operations.isEmpty();
		case QuantumOpePackage.QUANTUM_OPERATION_LIBRARY__LOOP_OPERATIONS:
			return loopOperations != null && !loopOperations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QuantumOperationLibraryImpl