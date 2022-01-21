/**
 */
package quantum.operation.library.mm.quope.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import quantum.operation.library.mm.quope.ConcreteQuantumOperation;
import quantum.operation.library.mm.quope.QuantumOpePackage;
import quantum.operation.library.mm.quope.QuantumOperationLibrary;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quantum Operation Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link quantum.operation.library.mm.quope.impl.QuantumOperationLibraryImpl#getOperations <em>Operations</em>}</li>
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case QuantumOpePackage.QUANTUM_OPERATION_LIBRARY__OPERATIONS:
			return ((InternalEList<?>) getOperations()).basicRemove(otherEnd, msgs);
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
		}
		return super.eIsSet(featureID);
	}

} //QuantumOperationLibraryImpl
