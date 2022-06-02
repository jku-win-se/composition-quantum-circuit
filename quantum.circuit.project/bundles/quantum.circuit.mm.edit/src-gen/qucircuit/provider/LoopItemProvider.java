/**
 */
package qucircuit.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import qucircuit.Loop;
import qucircuit.QuCircuitPackage;

/**
 * This is the item provider adapter for a {@link qucircuit.Loop} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LoopItemProvider extends AbstractCompositeGateItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addIterationsPropertyDescriptor(object);
			addFixedControlQubitsPropertyDescriptor(object);
			addFixedTargetQubitsPropertyDescriptor(object);
			addLoopPropertyDescriptor(object);
			addIncrementControlQubitsPropertyDescriptor(object);
			addIncrementTargetQubitsPropertyDescriptor(object);
			addLoopTargetQubitsPropertyDescriptor(object);
			addLoopControlQubitsPropertyDescriptor(object);
			addTargetQubitsBlockSizePropertyDescriptor(object);
			addControlQubitsBlockSizePropertyDescriptor(object);
			addControlQubitsIterationTypePropertyDescriptor(object);
			addTargetQubitsIterationTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Iterations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIterationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Loop_iterations_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Loop_iterations_feature", "_UI_Loop_type"),
						QuCircuitPackage.Literals.LOOP__ITERATIONS, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Fixed Control Qubits feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFixedControlQubitsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Loop_fixedControlQubits_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Loop_fixedControlQubits_feature",
								"_UI_Loop_type"),
						QuCircuitPackage.Literals.LOOP__FIXED_CONTROL_QUBITS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Fixed Target Qubits feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFixedTargetQubitsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Loop_fixedTargetQubits_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Loop_fixedTargetQubits_feature",
								"_UI_Loop_type"),
						QuCircuitPackage.Literals.LOOP__FIXED_TARGET_QUBITS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Loop feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLoopPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Loop_loop_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Loop_loop_feature", "_UI_Loop_type"),
						QuCircuitPackage.Literals.LOOP__LOOP, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Increment Control Qubits feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncrementControlQubitsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Loop_incrementControlQubits_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Loop_incrementControlQubits_feature",
								"_UI_Loop_type"),
						QuCircuitPackage.Literals.LOOP__INCREMENT_CONTROL_QUBITS, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Increment Target Qubits feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncrementTargetQubitsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Loop_incrementTargetQubits_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Loop_incrementTargetQubits_feature",
								"_UI_Loop_type"),
						QuCircuitPackage.Literals.LOOP__INCREMENT_TARGET_QUBITS, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Loop Target Qubits feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLoopTargetQubitsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Loop_loopTargetQubits_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Loop_loopTargetQubits_feature",
								"_UI_Loop_type"),
						QuCircuitPackage.Literals.LOOP__LOOP_TARGET_QUBITS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Loop Control Qubits feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLoopControlQubitsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Loop_loopControlQubits_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Loop_loopControlQubits_feature",
								"_UI_Loop_type"),
						QuCircuitPackage.Literals.LOOP__LOOP_CONTROL_QUBITS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Target Qubits Block Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetQubitsBlockSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Loop_targetQubitsBlockSize_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Loop_targetQubitsBlockSize_feature",
								"_UI_Loop_type"),
						QuCircuitPackage.Literals.LOOP__TARGET_QUBITS_BLOCK_SIZE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Control Qubits Block Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addControlQubitsBlockSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Loop_controlQubitsBlockSize_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Loop_controlQubitsBlockSize_feature",
								"_UI_Loop_type"),
						QuCircuitPackage.Literals.LOOP__CONTROL_QUBITS_BLOCK_SIZE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Control Qubits Iteration Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addControlQubitsIterationTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Loop_controlQubitsIterationType_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Loop_controlQubitsIterationType_feature",
								"_UI_Loop_type"),
						QuCircuitPackage.Literals.LOOP__CONTROL_QUBITS_ITERATION_TYPE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Target Qubits Iteration Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetQubitsIterationTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Loop_targetQubitsIterationType_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Loop_targetQubitsIterationType_feature",
								"_UI_Loop_type"),
						QuCircuitPackage.Literals.LOOP__TARGET_QUBITS_ITERATION_TYPE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns Loop.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Loop"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Loop) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Loop_type")
				: getString("_UI_Loop_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Loop.class)) {
		case QuCircuitPackage.LOOP__ITERATIONS:
		case QuCircuitPackage.LOOP__INCREMENT_CONTROL_QUBITS:
		case QuCircuitPackage.LOOP__INCREMENT_TARGET_QUBITS:
		case QuCircuitPackage.LOOP__TARGET_QUBITS_BLOCK_SIZE:
		case QuCircuitPackage.LOOP__CONTROL_QUBITS_BLOCK_SIZE:
		case QuCircuitPackage.LOOP__CONTROL_QUBITS_ITERATION_TYPE:
		case QuCircuitPackage.LOOP__TARGET_QUBITS_ITERATION_TYPE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
