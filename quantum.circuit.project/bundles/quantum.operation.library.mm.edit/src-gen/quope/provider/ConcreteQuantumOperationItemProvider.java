/**
 */
package quope.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import quope.ConcreteQuantumOperation;
import quope.QuopeFactory;
import quope.QuopePackage;

/**
 * This is the item provider adapter for a {@link quope.ConcreteQuantumOperation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConcreteQuantumOperationItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteQuantumOperationItemProvider(AdapterFactory adapterFactory) {
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

			addTypePropertyDescriptor(object);
			addAbbreviationPropertyDescriptor(object);
			addPaletteIconPathPropertyDescriptor(object);
			addStyleIconPathPropertyDescriptor(object);
			addReversePropertyDescriptor(object);
			addReversiblePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ConcreteQuantumOperation_type_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ConcreteQuantumOperation_type_feature",
								"_UI_ConcreteQuantumOperation_type"),
						QuopePackage.Literals.CONCRETE_QUANTUM_OPERATION__TYPE, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Abbreviation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAbbreviationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ConcreteQuantumOperation_abbreviation_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ConcreteQuantumOperation_abbreviation_feature",
						"_UI_ConcreteQuantumOperation_type"),
				QuopePackage.Literals.CONCRETE_QUANTUM_OPERATION__ABBREVIATION, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Palette Icon Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPaletteIconPathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ConcreteQuantumOperation_paletteIconPath_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ConcreteQuantumOperation_paletteIconPath_feature",
						"_UI_ConcreteQuantumOperation_type"),
				QuopePackage.Literals.CONCRETE_QUANTUM_OPERATION__PALETTE_ICON_PATH, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Style Icon Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStyleIconPathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ConcreteQuantumOperation_styleIconPath_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ConcreteQuantumOperation_styleIconPath_feature",
						"_UI_ConcreteQuantumOperation_type"),
				QuopePackage.Literals.CONCRETE_QUANTUM_OPERATION__STYLE_ICON_PATH, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Reverse feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReversePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ConcreteQuantumOperation_reverse_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ConcreteQuantumOperation_reverse_feature",
						"_UI_ConcreteQuantumOperation_type"),
				QuopePackage.Literals.CONCRETE_QUANTUM_OPERATION__REVERSE, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Reversible feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReversiblePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ConcreteQuantumOperation_reversible_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_ConcreteQuantumOperation_reversible_feature", "_UI_ConcreteQuantumOperation_type"),
						QuopePackage.Literals.CONCRETE_QUANTUM_OPERATION__REVERSIBLE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(QuopePackage.Literals.CONCRETE_QUANTUM_OPERATION__PARAMETER);
			childrenFeatures.add(QuopePackage.Literals.CONCRETE_QUANTUM_OPERATION__FIXED_QUANTUM_OPERATION);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ConcreteQuantumOperation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ConcreteQuantumOperation"));
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
		String label = ((ConcreteQuantumOperation) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_ConcreteQuantumOperation_type")
				: getString("_UI_ConcreteQuantumOperation_type") + " " + label;
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

		switch (notification.getFeatureID(ConcreteQuantumOperation.class)) {
		case QuopePackage.CONCRETE_QUANTUM_OPERATION__ABBREVIATION:
		case QuopePackage.CONCRETE_QUANTUM_OPERATION__PALETTE_ICON_PATH:
		case QuopePackage.CONCRETE_QUANTUM_OPERATION__STYLE_ICON_PATH:
		case QuopePackage.CONCRETE_QUANTUM_OPERATION__REVERSIBLE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case QuopePackage.CONCRETE_QUANTUM_OPERATION__PARAMETER:
		case QuopePackage.CONCRETE_QUANTUM_OPERATION__FIXED_QUANTUM_OPERATION:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add(createChildParameter(QuopePackage.Literals.CONCRETE_QUANTUM_OPERATION__PARAMETER,
				QuopeFactory.eINSTANCE.createParameter()));

		newChildDescriptors
				.add(createChildParameter(QuopePackage.Literals.CONCRETE_QUANTUM_OPERATION__FIXED_QUANTUM_OPERATION,
						QuopeFactory.eINSTANCE.createFixedQuantumOperation()));
	}

}
