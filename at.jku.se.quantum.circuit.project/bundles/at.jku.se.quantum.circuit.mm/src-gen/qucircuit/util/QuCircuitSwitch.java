/**
 */
package qucircuit.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import qucircuit.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see qucircuit.QuCircuitPackage
 * @generated
 */
public class QuCircuitSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static QuCircuitPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuCircuitSwitch() {
		if (modelPackage == null) {
			modelPackage = QuCircuitPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case QuCircuitPackage.QUANTUM_CIRCUIT: {
			QuantumCircuit quantumCircuit = (QuantumCircuit) theEObject;
			T result = caseQuantumCircuit(quantumCircuit);
			if (result == null)
				result = caseNamedElement(quantumCircuit);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QuCircuitPackage.NAMED_ELEMENT: {
			NamedElement namedElement = (NamedElement) theEObject;
			T result = caseNamedElement(namedElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QuCircuitPackage.QUANTUM_REGISTER: {
			QuantumRegister quantumRegister = (QuantumRegister) theEObject;
			T result = caseQuantumRegister(quantumRegister);
			if (result == null)
				result = caseNamedElement(quantumRegister);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QuCircuitPackage.CLASSIC_REGISTER: {
			ClassicRegister classicRegister = (ClassicRegister) theEObject;
			T result = caseClassicRegister(classicRegister);
			if (result == null)
				result = caseNamedElement(classicRegister);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QuCircuitPackage.QUBIT: {
			Qubit qubit = (Qubit) theEObject;
			T result = caseQubit(qubit);
			if (result == null)
				result = caseBit(qubit);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QuCircuitPackage.CLASSIC_BIT: {
			ClassicBit classicBit = (ClassicBit) theEObject;
			T result = caseClassicBit(classicBit);
			if (result == null)
				result = caseBit(classicBit);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QuCircuitPackage.LAYER: {
			Layer layer = (Layer) theEObject;
			T result = caseLayer(layer);
			if (result == null)
				result = caseNamedElement(layer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QuCircuitPackage.CLASSIC_CONTROL: {
			ClassicControl classicControl = (ClassicControl) theEObject;
			T result = caseClassicControl(classicControl);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QuCircuitPackage.QUANTUM_OPERATION: {
			QuantumOperation quantumOperation = (QuantumOperation) theEObject;
			T result = caseQuantumOperation(quantumOperation);
			if (result == null)
				result = caseNamedElement(quantumOperation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QuCircuitPackage.ABSTRACT_QUANTUM_GATE: {
			AbstractQuantumGate abstractQuantumGate = (AbstractQuantumGate) theEObject;
			T result = caseAbstractQuantumGate(abstractQuantumGate);
			if (result == null)
				result = caseQuantumOperation(abstractQuantumGate);
			if (result == null)
				result = caseNamedElement(abstractQuantumGate);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QuCircuitPackage.STATE_PREPARATION: {
			StatePreparation statePreparation = (StatePreparation) theEObject;
			T result = caseStatePreparation(statePreparation);
			if (result == null)
				result = caseQuantumOperation(statePreparation);
			if (result == null)
				result = caseNamedElement(statePreparation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QuCircuitPackage.MEASUREMENT: {
			Measurement measurement = (Measurement) theEObject;
			T result = caseMeasurement(measurement);
			if (result == null)
				result = caseQuantumOperation(measurement);
			if (result == null)
				result = caseNamedElement(measurement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QuCircuitPackage.ELEMENTARY_QUANTUM_GATE: {
			ElementaryQuantumGate elementaryQuantumGate = (ElementaryQuantumGate) theEObject;
			T result = caseElementaryQuantumGate(elementaryQuantumGate);
			if (result == null)
				result = caseAbstractQuantumGate(elementaryQuantumGate);
			if (result == null)
				result = caseQuantumOperation(elementaryQuantumGate);
			if (result == null)
				result = caseNamedElement(elementaryQuantumGate);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QuCircuitPackage.COMPOSITE_QUANTUM_GATE: {
			CompositeQuantumGate compositeQuantumGate = (CompositeQuantumGate) theEObject;
			T result = caseCompositeQuantumGate(compositeQuantumGate);
			if (result == null)
				result = caseAbstractCompositeGate(compositeQuantumGate);
			if (result == null)
				result = caseAbstractQuantumGate(compositeQuantumGate);
			if (result == null)
				result = caseQuantumOperation(compositeQuantumGate);
			if (result == null)
				result = caseNamedElement(compositeQuantumGate);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QuCircuitPackage.ANGLE_PARAMETER: {
			AngleParameter angleParameter = (AngleParameter) theEObject;
			T result = caseAngleParameter(angleParameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QuCircuitPackage.BIT: {
			Bit bit = (Bit) theEObject;
			T result = caseBit(bit);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QuCircuitPackage.ABSTRACT_COMPOSITE_GATE: {
			AbstractCompositeGate abstractCompositeGate = (AbstractCompositeGate) theEObject;
			T result = caseAbstractCompositeGate(abstractCompositeGate);
			if (result == null)
				result = caseAbstractQuantumGate(abstractCompositeGate);
			if (result == null)
				result = caseQuantumOperation(abstractCompositeGate);
			if (result == null)
				result = caseNamedElement(abstractCompositeGate);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case QuCircuitPackage.LOOP: {
			Loop loop = (Loop) theEObject;
			T result = caseLoop(loop);
			if (result == null)
				result = caseAbstractCompositeGate(loop);
			if (result == null)
				result = caseAbstractQuantumGate(loop);
			if (result == null)
				result = caseQuantumOperation(loop);
			if (result == null)
				result = caseNamedElement(loop);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantum Circuit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantum Circuit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantumCircuit(QuantumCircuit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantum Register</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantum Register</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantumRegister(QuantumRegister object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classic Register</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classic Register</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassicRegister(ClassicRegister object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qubit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qubit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQubit(Qubit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classic Bit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classic Bit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassicBit(ClassicBit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLayer(Layer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classic Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classic Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassicControl(ClassicControl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantum Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantum Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantumOperation(QuantumOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Quantum Gate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Quantum Gate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractQuantumGate(AbstractQuantumGate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Preparation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Preparation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatePreparation(StatePreparation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measurement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measurement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasurement(Measurement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elementary Quantum Gate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elementary Quantum Gate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementaryQuantumGate(ElementaryQuantumGate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Quantum Gate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Quantum Gate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeQuantumGate(CompositeQuantumGate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Angle Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Angle Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAngleParameter(AngleParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBit(Bit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Composite Gate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Composite Gate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractCompositeGate(AbstractCompositeGate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoop(Loop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //QuCircuitSwitch