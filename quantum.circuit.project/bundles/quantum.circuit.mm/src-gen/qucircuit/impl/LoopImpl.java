/**
 */
package qucircuit.impl;

import at.jku.se.quantum.operation.library.mm.quope.LoopOperation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import qucircuit.ITERATION_TYPE;
import qucircuit.Loop;
import qucircuit.QuCircuitPackage;
import qucircuit.Qubit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Loop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qucircuit.impl.LoopImpl#getIterations <em>Iterations</em>}</li>
 *   <li>{@link qucircuit.impl.LoopImpl#getFixedControlQubits <em>Fixed Control Qubits</em>}</li>
 *   <li>{@link qucircuit.impl.LoopImpl#getFixedTargetQubits <em>Fixed Target Qubits</em>}</li>
 *   <li>{@link qucircuit.impl.LoopImpl#getLoop <em>Loop</em>}</li>
 *   <li>{@link qucircuit.impl.LoopImpl#getIncrementControlQubits <em>Increment Control Qubits</em>}</li>
 *   <li>{@link qucircuit.impl.LoopImpl#getIncrementTargetQubits <em>Increment Target Qubits</em>}</li>
 *   <li>{@link qucircuit.impl.LoopImpl#getLoopTargetQubits <em>Loop Target Qubits</em>}</li>
 *   <li>{@link qucircuit.impl.LoopImpl#getLoopControlQubits <em>Loop Control Qubits</em>}</li>
 *   <li>{@link qucircuit.impl.LoopImpl#getTargetQubitsBlockSize <em>Target Qubits Block Size</em>}</li>
 *   <li>{@link qucircuit.impl.LoopImpl#getControlQubitsBlockSize <em>Control Qubits Block Size</em>}</li>
 *   <li>{@link qucircuit.impl.LoopImpl#getControlQubitsIterationType <em>Control Qubits Iteration Type</em>}</li>
 *   <li>{@link qucircuit.impl.LoopImpl#getTargetQubitsIterationType <em>Target Qubits Iteration Type</em>}</li>
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
	 * The cached value of the '{@link #getFixedControlQubits() <em>Fixed Control Qubits</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedControlQubits()
	 * @generated
	 * @ordered
	 */
	protected EList<Qubit> fixedControlQubits;

	/**
	 * The cached value of the '{@link #getFixedTargetQubits() <em>Fixed Target Qubits</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedTargetQubits()
	 * @generated
	 * @ordered
	 */
	protected EList<Qubit> fixedTargetQubits;

	/**
	 * The cached value of the '{@link #getLoop() <em>Loop</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoop()
	 * @generated
	 * @ordered
	 */
	protected LoopOperation loop;

	/**
	 * The default value of the '{@link #getIncrementControlQubits() <em>Increment Control Qubits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncrementControlQubits()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCREMENT_CONTROL_QUBITS_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getIncrementControlQubits() <em>Increment Control Qubits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncrementControlQubits()
	 * @generated
	 * @ordered
	 */
	protected Boolean incrementControlQubits = INCREMENT_CONTROL_QUBITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncrementTargetQubits() <em>Increment Target Qubits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncrementTargetQubits()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INCREMENT_TARGET_QUBITS_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getIncrementTargetQubits() <em>Increment Target Qubits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncrementTargetQubits()
	 * @generated
	 * @ordered
	 */
	protected Boolean incrementTargetQubits = INCREMENT_TARGET_QUBITS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLoopTargetQubits() <em>Loop Target Qubits</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopTargetQubits()
	 * @generated
	 * @ordered
	 */
	protected EList<Qubit> loopTargetQubits;

	/**
	 * The cached value of the '{@link #getLoopControlQubits() <em>Loop Control Qubits</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopControlQubits()
	 * @generated
	 * @ordered
	 */
	protected EList<Qubit> loopControlQubits;

	/**
	 * The default value of the '{@link #getTargetQubitsBlockSize() <em>Target Qubits Block Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetQubitsBlockSize()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TARGET_QUBITS_BLOCK_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetQubitsBlockSize() <em>Target Qubits Block Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetQubitsBlockSize()
	 * @generated
	 * @ordered
	 */
	protected Integer targetQubitsBlockSize = TARGET_QUBITS_BLOCK_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getControlQubitsBlockSize() <em>Control Qubits Block Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlQubitsBlockSize()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CONTROL_QUBITS_BLOCK_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getControlQubitsBlockSize() <em>Control Qubits Block Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlQubitsBlockSize()
	 * @generated
	 * @ordered
	 */
	protected Integer controlQubitsBlockSize = CONTROL_QUBITS_BLOCK_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getControlQubitsIterationType() <em>Control Qubits Iteration Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlQubitsIterationType()
	 * @generated
	 * @ordered
	 */
	protected static final ITERATION_TYPE CONTROL_QUBITS_ITERATION_TYPE_EDEFAULT = ITERATION_TYPE.NONE;

	/**
	 * The cached value of the '{@link #getControlQubitsIterationType() <em>Control Qubits Iteration Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlQubitsIterationType()
	 * @generated
	 * @ordered
	 */
	protected ITERATION_TYPE controlQubitsIterationType = CONTROL_QUBITS_ITERATION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetQubitsIterationType() <em>Target Qubits Iteration Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetQubitsIterationType()
	 * @generated
	 * @ordered
	 */
	protected static final ITERATION_TYPE TARGET_QUBITS_ITERATION_TYPE_EDEFAULT = ITERATION_TYPE.NONE;

	/**
	 * The cached value of the '{@link #getTargetQubitsIterationType() <em>Target Qubits Iteration Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetQubitsIterationType()
	 * @generated
	 * @ordered
	 */
	protected ITERATION_TYPE targetQubitsIterationType = TARGET_QUBITS_ITERATION_TYPE_EDEFAULT;

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
	public EList<Qubit> getFixedControlQubits() {
		if (fixedControlQubits == null) {
			fixedControlQubits = new EObjectResolvingEList<Qubit>(Qubit.class, this,
					QuCircuitPackage.LOOP__FIXED_CONTROL_QUBITS);
		}
		return fixedControlQubits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Qubit> getFixedTargetQubits() {
		if (fixedTargetQubits == null) {
			fixedTargetQubits = new EObjectResolvingEList<Qubit>(Qubit.class, this,
					QuCircuitPackage.LOOP__FIXED_TARGET_QUBITS);
		}
		return fixedTargetQubits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopOperation getLoop() {
		if (loop != null && loop.eIsProxy()) {
			InternalEObject oldLoop = (InternalEObject) loop;
			loop = (LoopOperation) eResolveProxy(oldLoop);
			if (loop != oldLoop) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QuCircuitPackage.LOOP__LOOP, oldLoop,
							loop));
			}
		}
		return loop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopOperation basicGetLoop() {
		return loop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoop(LoopOperation newLoop) {
		LoopOperation oldLoop = loop;
		loop = newLoop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuCircuitPackage.LOOP__LOOP, oldLoop, loop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIncrementControlQubits() {
		return incrementControlQubits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncrementControlQubits(Boolean newIncrementControlQubits) {
		Boolean oldIncrementControlQubits = incrementControlQubits;
		incrementControlQubits = newIncrementControlQubits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuCircuitPackage.LOOP__INCREMENT_CONTROL_QUBITS,
					oldIncrementControlQubits, incrementControlQubits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIncrementTargetQubits() {
		return incrementTargetQubits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncrementTargetQubits(Boolean newIncrementTargetQubits) {
		Boolean oldIncrementTargetQubits = incrementTargetQubits;
		incrementTargetQubits = newIncrementTargetQubits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuCircuitPackage.LOOP__INCREMENT_TARGET_QUBITS,
					oldIncrementTargetQubits, incrementTargetQubits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Qubit> getLoopTargetQubits() {
		if (loopTargetQubits == null) {
			loopTargetQubits = new EObjectResolvingEList<Qubit>(Qubit.class, this,
					QuCircuitPackage.LOOP__LOOP_TARGET_QUBITS);
		}
		return loopTargetQubits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Qubit> getLoopControlQubits() {
		if (loopControlQubits == null) {
			loopControlQubits = new EObjectResolvingEList<Qubit>(Qubit.class, this,
					QuCircuitPackage.LOOP__LOOP_CONTROL_QUBITS);
		}
		return loopControlQubits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getTargetQubitsBlockSize() {
		return targetQubitsBlockSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetQubitsBlockSize(Integer newTargetQubitsBlockSize) {
		Integer oldTargetQubitsBlockSize = targetQubitsBlockSize;
		targetQubitsBlockSize = newTargetQubitsBlockSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuCircuitPackage.LOOP__TARGET_QUBITS_BLOCK_SIZE,
					oldTargetQubitsBlockSize, targetQubitsBlockSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getControlQubitsBlockSize() {
		return controlQubitsBlockSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlQubitsBlockSize(Integer newControlQubitsBlockSize) {
		Integer oldControlQubitsBlockSize = controlQubitsBlockSize;
		controlQubitsBlockSize = newControlQubitsBlockSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuCircuitPackage.LOOP__CONTROL_QUBITS_BLOCK_SIZE,
					oldControlQubitsBlockSize, controlQubitsBlockSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ITERATION_TYPE getControlQubitsIterationType() {
		return controlQubitsIterationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlQubitsIterationType(ITERATION_TYPE newControlQubitsIterationType) {
		ITERATION_TYPE oldControlQubitsIterationType = controlQubitsIterationType;
		controlQubitsIterationType = newControlQubitsIterationType == null ? CONTROL_QUBITS_ITERATION_TYPE_EDEFAULT
				: newControlQubitsIterationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuCircuitPackage.LOOP__CONTROL_QUBITS_ITERATION_TYPE,
					oldControlQubitsIterationType, controlQubitsIterationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ITERATION_TYPE getTargetQubitsIterationType() {
		return targetQubitsIterationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetQubitsIterationType(ITERATION_TYPE newTargetQubitsIterationType) {
		ITERATION_TYPE oldTargetQubitsIterationType = targetQubitsIterationType;
		targetQubitsIterationType = newTargetQubitsIterationType == null ? TARGET_QUBITS_ITERATION_TYPE_EDEFAULT
				: newTargetQubitsIterationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuCircuitPackage.LOOP__TARGET_QUBITS_ITERATION_TYPE,
					oldTargetQubitsIterationType, targetQubitsIterationType));
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
		case QuCircuitPackage.LOOP__FIXED_CONTROL_QUBITS:
			return getFixedControlQubits();
		case QuCircuitPackage.LOOP__FIXED_TARGET_QUBITS:
			return getFixedTargetQubits();
		case QuCircuitPackage.LOOP__LOOP:
			if (resolve)
				return getLoop();
			return basicGetLoop();
		case QuCircuitPackage.LOOP__INCREMENT_CONTROL_QUBITS:
			return getIncrementControlQubits();
		case QuCircuitPackage.LOOP__INCREMENT_TARGET_QUBITS:
			return getIncrementTargetQubits();
		case QuCircuitPackage.LOOP__LOOP_TARGET_QUBITS:
			return getLoopTargetQubits();
		case QuCircuitPackage.LOOP__LOOP_CONTROL_QUBITS:
			return getLoopControlQubits();
		case QuCircuitPackage.LOOP__TARGET_QUBITS_BLOCK_SIZE:
			return getTargetQubitsBlockSize();
		case QuCircuitPackage.LOOP__CONTROL_QUBITS_BLOCK_SIZE:
			return getControlQubitsBlockSize();
		case QuCircuitPackage.LOOP__CONTROL_QUBITS_ITERATION_TYPE:
			return getControlQubitsIterationType();
		case QuCircuitPackage.LOOP__TARGET_QUBITS_ITERATION_TYPE:
			return getTargetQubitsIterationType();
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
		case QuCircuitPackage.LOOP__ITERATIONS:
			setIterations((Integer) newValue);
			return;
		case QuCircuitPackage.LOOP__FIXED_CONTROL_QUBITS:
			getFixedControlQubits().clear();
			getFixedControlQubits().addAll((Collection<? extends Qubit>) newValue);
			return;
		case QuCircuitPackage.LOOP__FIXED_TARGET_QUBITS:
			getFixedTargetQubits().clear();
			getFixedTargetQubits().addAll((Collection<? extends Qubit>) newValue);
			return;
		case QuCircuitPackage.LOOP__LOOP:
			setLoop((LoopOperation) newValue);
			return;
		case QuCircuitPackage.LOOP__INCREMENT_CONTROL_QUBITS:
			setIncrementControlQubits((Boolean) newValue);
			return;
		case QuCircuitPackage.LOOP__INCREMENT_TARGET_QUBITS:
			setIncrementTargetQubits((Boolean) newValue);
			return;
		case QuCircuitPackage.LOOP__LOOP_TARGET_QUBITS:
			getLoopTargetQubits().clear();
			getLoopTargetQubits().addAll((Collection<? extends Qubit>) newValue);
			return;
		case QuCircuitPackage.LOOP__LOOP_CONTROL_QUBITS:
			getLoopControlQubits().clear();
			getLoopControlQubits().addAll((Collection<? extends Qubit>) newValue);
			return;
		case QuCircuitPackage.LOOP__TARGET_QUBITS_BLOCK_SIZE:
			setTargetQubitsBlockSize((Integer) newValue);
			return;
		case QuCircuitPackage.LOOP__CONTROL_QUBITS_BLOCK_SIZE:
			setControlQubitsBlockSize((Integer) newValue);
			return;
		case QuCircuitPackage.LOOP__CONTROL_QUBITS_ITERATION_TYPE:
			setControlQubitsIterationType((ITERATION_TYPE) newValue);
			return;
		case QuCircuitPackage.LOOP__TARGET_QUBITS_ITERATION_TYPE:
			setTargetQubitsIterationType((ITERATION_TYPE) newValue);
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
		case QuCircuitPackage.LOOP__FIXED_CONTROL_QUBITS:
			getFixedControlQubits().clear();
			return;
		case QuCircuitPackage.LOOP__FIXED_TARGET_QUBITS:
			getFixedTargetQubits().clear();
			return;
		case QuCircuitPackage.LOOP__LOOP:
			setLoop((LoopOperation) null);
			return;
		case QuCircuitPackage.LOOP__INCREMENT_CONTROL_QUBITS:
			setIncrementControlQubits(INCREMENT_CONTROL_QUBITS_EDEFAULT);
			return;
		case QuCircuitPackage.LOOP__INCREMENT_TARGET_QUBITS:
			setIncrementTargetQubits(INCREMENT_TARGET_QUBITS_EDEFAULT);
			return;
		case QuCircuitPackage.LOOP__LOOP_TARGET_QUBITS:
			getLoopTargetQubits().clear();
			return;
		case QuCircuitPackage.LOOP__LOOP_CONTROL_QUBITS:
			getLoopControlQubits().clear();
			return;
		case QuCircuitPackage.LOOP__TARGET_QUBITS_BLOCK_SIZE:
			setTargetQubitsBlockSize(TARGET_QUBITS_BLOCK_SIZE_EDEFAULT);
			return;
		case QuCircuitPackage.LOOP__CONTROL_QUBITS_BLOCK_SIZE:
			setControlQubitsBlockSize(CONTROL_QUBITS_BLOCK_SIZE_EDEFAULT);
			return;
		case QuCircuitPackage.LOOP__CONTROL_QUBITS_ITERATION_TYPE:
			setControlQubitsIterationType(CONTROL_QUBITS_ITERATION_TYPE_EDEFAULT);
			return;
		case QuCircuitPackage.LOOP__TARGET_QUBITS_ITERATION_TYPE:
			setTargetQubitsIterationType(TARGET_QUBITS_ITERATION_TYPE_EDEFAULT);
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
		case QuCircuitPackage.LOOP__FIXED_CONTROL_QUBITS:
			return fixedControlQubits != null && !fixedControlQubits.isEmpty();
		case QuCircuitPackage.LOOP__FIXED_TARGET_QUBITS:
			return fixedTargetQubits != null && !fixedTargetQubits.isEmpty();
		case QuCircuitPackage.LOOP__LOOP:
			return loop != null;
		case QuCircuitPackage.LOOP__INCREMENT_CONTROL_QUBITS:
			return INCREMENT_CONTROL_QUBITS_EDEFAULT == null ? incrementControlQubits != null
					: !INCREMENT_CONTROL_QUBITS_EDEFAULT.equals(incrementControlQubits);
		case QuCircuitPackage.LOOP__INCREMENT_TARGET_QUBITS:
			return INCREMENT_TARGET_QUBITS_EDEFAULT == null ? incrementTargetQubits != null
					: !INCREMENT_TARGET_QUBITS_EDEFAULT.equals(incrementTargetQubits);
		case QuCircuitPackage.LOOP__LOOP_TARGET_QUBITS:
			return loopTargetQubits != null && !loopTargetQubits.isEmpty();
		case QuCircuitPackage.LOOP__LOOP_CONTROL_QUBITS:
			return loopControlQubits != null && !loopControlQubits.isEmpty();
		case QuCircuitPackage.LOOP__TARGET_QUBITS_BLOCK_SIZE:
			return TARGET_QUBITS_BLOCK_SIZE_EDEFAULT == null ? targetQubitsBlockSize != null
					: !TARGET_QUBITS_BLOCK_SIZE_EDEFAULT.equals(targetQubitsBlockSize);
		case QuCircuitPackage.LOOP__CONTROL_QUBITS_BLOCK_SIZE:
			return CONTROL_QUBITS_BLOCK_SIZE_EDEFAULT == null ? controlQubitsBlockSize != null
					: !CONTROL_QUBITS_BLOCK_SIZE_EDEFAULT.equals(controlQubitsBlockSize);
		case QuCircuitPackage.LOOP__CONTROL_QUBITS_ITERATION_TYPE:
			return controlQubitsIterationType != CONTROL_QUBITS_ITERATION_TYPE_EDEFAULT;
		case QuCircuitPackage.LOOP__TARGET_QUBITS_ITERATION_TYPE:
			return targetQubitsIterationType != TARGET_QUBITS_ITERATION_TYPE_EDEFAULT;
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
		result.append(", incrementControlQubits: ");
		result.append(incrementControlQubits);
		result.append(", incrementTargetQubits: ");
		result.append(incrementTargetQubits);
		result.append(", targetQubitsBlockSize: ");
		result.append(targetQubitsBlockSize);
		result.append(", controlQubitsBlockSize: ");
		result.append(controlQubitsBlockSize);
		result.append(", controlQubitsIterationType: ");
		result.append(controlQubitsIterationType);
		result.append(", targetQubitsIterationType: ");
		result.append(targetQubitsIterationType);
		result.append(')');
		return result.toString();
	}

} //LoopImpl
