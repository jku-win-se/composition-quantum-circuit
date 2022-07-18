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

import qucircuit.ClassicRegister;
import qucircuit.Layer;
import qucircuit.QuantumCircuit;
import qucircuit.QuantumRegister;
import qucircuit.QucircuitPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quantum Circuit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qucircuit.impl.QuantumCircuitImpl#getQuantumRegisters <em>Quantum Registers</em>}</li>
 *   <li>{@link qucircuit.impl.QuantumCircuitImpl#getClassicRegisters <em>Classic Registers</em>}</li>
 *   <li>{@link qucircuit.impl.QuantumCircuitImpl#getLayers <em>Layers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuantumCircuitImpl extends NamedElementImpl implements QuantumCircuit {
	/**
	 * The cached value of the '{@link #getQuantumRegisters() <em>Quantum Registers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantumRegisters()
	 * @generated
	 * @ordered
	 */
	protected EList<QuantumRegister> quantumRegisters;

	/**
	 * The cached value of the '{@link #getClassicRegisters() <em>Classic Registers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassicRegisters()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassicRegister> classicRegisters;

	/**
	 * The cached value of the '{@link #getLayers() <em>Layers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayers()
	 * @generated
	 * @ordered
	 */
	protected EList<Layer> layers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuantumCircuitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QucircuitPackage.Literals.QUANTUM_CIRCUIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QuantumRegister> getQuantumRegisters() {
		if (quantumRegisters == null) {
			quantumRegisters = new EObjectContainmentEList<QuantumRegister>(QuantumRegister.class, this, QucircuitPackage.QUANTUM_CIRCUIT__QUANTUM_REGISTERS);
		}
		return quantumRegisters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassicRegister> getClassicRegisters() {
		if (classicRegisters == null) {
			classicRegisters = new EObjectContainmentEList<ClassicRegister>(ClassicRegister.class, this, QucircuitPackage.QUANTUM_CIRCUIT__CLASSIC_REGISTERS);
		}
		return classicRegisters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Layer> getLayers() {
		if (layers == null) {
			layers = new EObjectContainmentEList<Layer>(Layer.class, this, QucircuitPackage.QUANTUM_CIRCUIT__LAYERS);
		}
		return layers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QucircuitPackage.QUANTUM_CIRCUIT__QUANTUM_REGISTERS:
				return ((InternalEList<?>)getQuantumRegisters()).basicRemove(otherEnd, msgs);
			case QucircuitPackage.QUANTUM_CIRCUIT__CLASSIC_REGISTERS:
				return ((InternalEList<?>)getClassicRegisters()).basicRemove(otherEnd, msgs);
			case QucircuitPackage.QUANTUM_CIRCUIT__LAYERS:
				return ((InternalEList<?>)getLayers()).basicRemove(otherEnd, msgs);
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
			case QucircuitPackage.QUANTUM_CIRCUIT__QUANTUM_REGISTERS:
				return getQuantumRegisters();
			case QucircuitPackage.QUANTUM_CIRCUIT__CLASSIC_REGISTERS:
				return getClassicRegisters();
			case QucircuitPackage.QUANTUM_CIRCUIT__LAYERS:
				return getLayers();
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
			case QucircuitPackage.QUANTUM_CIRCUIT__QUANTUM_REGISTERS:
				getQuantumRegisters().clear();
				getQuantumRegisters().addAll((Collection<? extends QuantumRegister>)newValue);
				return;
			case QucircuitPackage.QUANTUM_CIRCUIT__CLASSIC_REGISTERS:
				getClassicRegisters().clear();
				getClassicRegisters().addAll((Collection<? extends ClassicRegister>)newValue);
				return;
			case QucircuitPackage.QUANTUM_CIRCUIT__LAYERS:
				getLayers().clear();
				getLayers().addAll((Collection<? extends Layer>)newValue);
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
			case QucircuitPackage.QUANTUM_CIRCUIT__QUANTUM_REGISTERS:
				getQuantumRegisters().clear();
				return;
			case QucircuitPackage.QUANTUM_CIRCUIT__CLASSIC_REGISTERS:
				getClassicRegisters().clear();
				return;
			case QucircuitPackage.QUANTUM_CIRCUIT__LAYERS:
				getLayers().clear();
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
			case QucircuitPackage.QUANTUM_CIRCUIT__QUANTUM_REGISTERS:
				return quantumRegisters != null && !quantumRegisters.isEmpty();
			case QucircuitPackage.QUANTUM_CIRCUIT__CLASSIC_REGISTERS:
				return classicRegisters != null && !classicRegisters.isEmpty();
			case QucircuitPackage.QUANTUM_CIRCUIT__LAYERS:
				return layers != null && !layers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QuantumCircuitImpl
