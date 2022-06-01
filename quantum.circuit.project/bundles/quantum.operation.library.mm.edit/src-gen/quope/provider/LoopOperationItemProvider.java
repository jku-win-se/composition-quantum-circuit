/**
 */
package quope.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import quope.LoopOperation;
import quope.QuopePackage;

/**
 * This is the item provider adapter for a {@link quope.LoopOperation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LoopOperationItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopOperationItemProvider(AdapterFactory adapterFactory) {
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

			addAllowsFixedControlQubitsPropertyDescriptor(object);
			addAllowsFixedTargetQubitsPropertyDescriptor(object);
			addAllowsControlQubitsIterationTypePropertyDescriptor(object);
			addAllowsTargetQubitsIterationTypePropertyDescriptor(object);
			addAllowsControlQubitsBlockSizePropertyDescriptor(object);
			addAllowsTargetQubitsBlockSizePropertyDescriptor(object);
			addAllowsIncrementControlQubitsPropertyDescriptor(object);
			addAllowsIncrementTargetQubitsPropertyDescriptor(object);
			addAllowsIterationsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Allows Fixed Control Qubits feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllowsFixedControlQubitsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_LoopOperation_allowsFixedControlQubits_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_LoopOperation_allowsFixedControlQubits_feature",
						"_UI_LoopOperation_type"),
				QuopePackage.Literals.LOOP_OPERATION__ALLOWS_FIXED_CONTROL_QUBITS, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Allows Fixed Target Qubits feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllowsFixedTargetQubitsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_LoopOperation_allowsFixedTargetQubits_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_LoopOperation_allowsFixedTargetQubits_feature",
						"_UI_LoopOperation_type"),
				QuopePackage.Literals.LOOP_OPERATION__ALLOWS_FIXED_TARGET_QUBITS, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Allows Control Qubits Iteration Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllowsControlQubitsIterationTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_LoopOperation_allowsControlQubitsIterationType_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_LoopOperation_allowsControlQubitsIterationType_feature", "_UI_LoopOperation_type"),
						QuopePackage.Literals.LOOP_OPERATION__ALLOWS_CONTROL_QUBITS_ITERATION_TYPE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Allows Target Qubits Iteration Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllowsTargetQubitsIterationTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_LoopOperation_allowsTargetQubitsIterationType_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_LoopOperation_allowsTargetQubitsIterationType_feature", "_UI_LoopOperation_type"),
						QuopePackage.Literals.LOOP_OPERATION__ALLOWS_TARGET_QUBITS_ITERATION_TYPE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Allows Control Qubits Block Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllowsControlQubitsBlockSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_LoopOperation_allowsControlQubitsBlockSize_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_LoopOperation_allowsControlQubitsBlockSize_feature", "_UI_LoopOperation_type"),
						QuopePackage.Literals.LOOP_OPERATION__ALLOWS_CONTROL_QUBITS_BLOCK_SIZE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Allows Target Qubits Block Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllowsTargetQubitsBlockSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_LoopOperation_allowsTargetQubitsBlockSize_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_LoopOperation_allowsTargetQubitsBlockSize_feature", "_UI_LoopOperation_type"),
						QuopePackage.Literals.LOOP_OPERATION__ALLOWS_TARGET_QUBITS_BLOCK_SIZE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Allows Increment Control Qubits feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllowsIncrementControlQubitsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_LoopOperation_allowsIncrementControlQubits_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_LoopOperation_allowsIncrementControlQubits_feature", "_UI_LoopOperation_type"),
						QuopePackage.Literals.LOOP_OPERATION__ALLOWS_INCREMENT_CONTROL_QUBITS, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Allows Increment Target Qubits feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllowsIncrementTargetQubitsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_LoopOperation_allowsIncrementTargetQubits_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_LoopOperation_allowsIncrementTargetQubits_feature",
						"_UI_LoopOperation_type"),
				QuopePackage.Literals.LOOP_OPERATION__ALLOWS_INCREMENT_TARGET_QUBITS, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Allows Iterations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllowsIterationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_LoopOperation_allowsIterations_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_LoopOperation_allowsIterations_feature",
								"_UI_LoopOperation_type"),
						QuopePackage.Literals.LOOP_OPERATION__ALLOWS_ITERATIONS, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns LoopOperation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LoopOperation"));
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
		String label = ((LoopOperation) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_LoopOperation_type")
				: getString("_UI_LoopOperation_type") + " " + label;
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

		switch (notification.getFeatureID(LoopOperation.class)) {
		case QuopePackage.LOOP_OPERATION__ALLOWS_FIXED_CONTROL_QUBITS:
		case QuopePackage.LOOP_OPERATION__ALLOWS_FIXED_TARGET_QUBITS:
		case QuopePackage.LOOP_OPERATION__ALLOWS_CONTROL_QUBITS_ITERATION_TYPE:
		case QuopePackage.LOOP_OPERATION__ALLOWS_TARGET_QUBITS_ITERATION_TYPE:
		case QuopePackage.LOOP_OPERATION__ALLOWS_CONTROL_QUBITS_BLOCK_SIZE:
		case QuopePackage.LOOP_OPERATION__ALLOWS_TARGET_QUBITS_BLOCK_SIZE:
		case QuopePackage.LOOP_OPERATION__ALLOWS_INCREMENT_CONTROL_QUBITS:
		case QuopePackage.LOOP_OPERATION__ALLOWS_INCREMENT_TARGET_QUBITS:
		case QuopePackage.LOOP_OPERATION__ALLOWS_ITERATIONS:
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
