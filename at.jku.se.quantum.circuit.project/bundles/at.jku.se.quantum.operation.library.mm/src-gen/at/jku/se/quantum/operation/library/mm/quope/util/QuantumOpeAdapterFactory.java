/**
 */
package at.jku.se.quantum.operation.library.mm.quope.util;

import at.jku.se.quantum.operation.library.mm.quope.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see at.jku.se.quantum.operation.library.mm.quope.QuantumOpePackage
 * @generated
 */
public class QuantumOpeAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static QuantumOpePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantumOpeAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = QuantumOpePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuantumOpeSwitch<Adapter> modelSwitch = new QuantumOpeSwitch<Adapter>() {
		@Override
		public Adapter caseQuantumOperationLibrary(QuantumOperationLibrary object) {
			return createQuantumOperationLibraryAdapter();
		}

		@Override
		public Adapter caseConcreteQuantumOperation(ConcreteQuantumOperation object) {
			return createConcreteQuantumOperationAdapter();
		}

		@Override
		public Adapter caseNamedElement(NamedElement object) {
			return createNamedElementAdapter();
		}

		@Override
		public Adapter caseFixedQuantumOperation(FixedQuantumOperation object) {
			return createFixedQuantumOperationAdapter();
		}

		@Override
		public Adapter caseParameter(Parameter object) {
			return createParameterAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.jku.se.quantum.operation.library.mm.quope.QuantumOperationLibrary <em>Quantum Operation Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.jku.se.quantum.operation.library.mm.quope.QuantumOperationLibrary
	 * @generated
	 */
	public Adapter createQuantumOperationLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.jku.se.quantum.operation.library.mm.quope.ConcreteQuantumOperation <em>Concrete Quantum Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.jku.se.quantum.operation.library.mm.quope.ConcreteQuantumOperation
	 * @generated
	 */
	public Adapter createConcreteQuantumOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.jku.se.quantum.operation.library.mm.quope.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.jku.se.quantum.operation.library.mm.quope.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.jku.se.quantum.operation.library.mm.quope.FixedQuantumOperation <em>Fixed Quantum Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.jku.se.quantum.operation.library.mm.quope.FixedQuantumOperation
	 * @generated
	 */
	public Adapter createFixedQuantumOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.jku.se.quantum.operation.library.mm.quope.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.jku.se.quantum.operation.library.mm.quope.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //QuantumOpeAdapterFactory