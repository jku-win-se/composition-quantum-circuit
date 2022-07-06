/**
 */
package qucircuit.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import qucircuit.util.QucircuitAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class QucircuitItemProviderAdapterFactory extends QucircuitAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QucircuitItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link qucircuit.QuantumCircuit} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuantumCircuitItemProvider quantumCircuitItemProvider;

	/**
	 * This creates an adapter for a {@link qucircuit.QuantumCircuit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createQuantumCircuitAdapter() {
		if (quantumCircuitItemProvider == null) {
			quantumCircuitItemProvider = new QuantumCircuitItemProvider(this);
		}

		return quantumCircuitItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link qucircuit.QuantumRegister} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuantumRegisterItemProvider quantumRegisterItemProvider;

	/**
	 * This creates an adapter for a {@link qucircuit.QuantumRegister}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createQuantumRegisterAdapter() {
		if (quantumRegisterItemProvider == null) {
			quantumRegisterItemProvider = new QuantumRegisterItemProvider(this);
		}

		return quantumRegisterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link qucircuit.ClassicRegister} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassicRegisterItemProvider classicRegisterItemProvider;

	/**
	 * This creates an adapter for a {@link qucircuit.ClassicRegister}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClassicRegisterAdapter() {
		if (classicRegisterItemProvider == null) {
			classicRegisterItemProvider = new ClassicRegisterItemProvider(this);
		}

		return classicRegisterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link qucircuit.Layer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LayerItemProvider layerItemProvider;

	/**
	 * This creates an adapter for a {@link qucircuit.Layer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLayerAdapter() {
		if (layerItemProvider == null) {
			layerItemProvider = new LayerItemProvider(this);
		}

		return layerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link qucircuit.ClassicControl} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassicControlItemProvider classicControlItemProvider;

	/**
	 * This creates an adapter for a {@link qucircuit.ClassicControl}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClassicControlAdapter() {
		if (classicControlItemProvider == null) {
			classicControlItemProvider = new ClassicControlItemProvider(this);
		}

		return classicControlItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link qucircuit.StatePreparation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatePreparationItemProvider statePreparationItemProvider;

	/**
	 * This creates an adapter for a {@link qucircuit.StatePreparation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStatePreparationAdapter() {
		if (statePreparationItemProvider == null) {
			statePreparationItemProvider = new StatePreparationItemProvider(this);
		}

		return statePreparationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link qucircuit.Measurement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasurementItemProvider measurementItemProvider;

	/**
	 * This creates an adapter for a {@link qucircuit.Measurement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMeasurementAdapter() {
		if (measurementItemProvider == null) {
			measurementItemProvider = new MeasurementItemProvider(this);
		}

		return measurementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link qucircuit.ElementaryQuantumGate} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementaryQuantumGateItemProvider elementaryQuantumGateItemProvider;

	/**
	 * This creates an adapter for a {@link qucircuit.ElementaryQuantumGate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createElementaryQuantumGateAdapter() {
		if (elementaryQuantumGateItemProvider == null) {
			elementaryQuantumGateItemProvider = new ElementaryQuantumGateItemProvider(this);
		}

		return elementaryQuantumGateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link qucircuit.CompositeQuantumGate} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeQuantumGateItemProvider compositeQuantumGateItemProvider;

	/**
	 * This creates an adapter for a {@link qucircuit.CompositeQuantumGate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCompositeQuantumGateAdapter() {
		if (compositeQuantumGateItemProvider == null) {
			compositeQuantumGateItemProvider = new CompositeQuantumGateItemProvider(this);
		}

		return compositeQuantumGateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link qucircuit.AngleParameter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AngleParameterItemProvider angleParameterItemProvider;

	/**
	 * This creates an adapter for a {@link qucircuit.AngleParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAngleParameterAdapter() {
		if (angleParameterItemProvider == null) {
			angleParameterItemProvider = new AngleParameterItemProvider(this);
		}

		return angleParameterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link qucircuit.LoopOperation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoopOperationItemProvider loopOperationItemProvider;

	/**
	 * This creates an adapter for a {@link qucircuit.LoopOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLoopOperationAdapter() {
		if (loopOperationItemProvider == null) {
			loopOperationItemProvider = new LoopOperationItemProvider(this);
		}

		return loopOperationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link qucircuit.IndexInt} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndexIntItemProvider indexIntItemProvider;

	/**
	 * This creates an adapter for a {@link qucircuit.IndexInt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIndexIntAdapter() {
		if (indexIntItemProvider == null) {
			indexIntItemProvider = new IndexIntItemProvider(this);
		}

		return indexIntItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link qucircuit.IndexRange} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndexRangeItemProvider indexRangeItemProvider;

	/**
	 * This creates an adapter for a {@link qucircuit.IndexRange}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIndexRangeAdapter() {
		if (indexRangeItemProvider == null) {
			indexRangeItemProvider = new IndexRangeItemProvider(this);
		}

		return indexRangeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link qucircuit.Operation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationItemProvider operationItemProvider;

	/**
	 * This creates an adapter for a {@link qucircuit.Operation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOperationAdapter() {
		if (operationItemProvider == null) {
			operationItemProvider = new OperationItemProvider(this);
		}

		return operationItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (quantumCircuitItemProvider != null) quantumCircuitItemProvider.dispose();
		if (quantumRegisterItemProvider != null) quantumRegisterItemProvider.dispose();
		if (classicRegisterItemProvider != null) classicRegisterItemProvider.dispose();
		if (layerItemProvider != null) layerItemProvider.dispose();
		if (classicControlItemProvider != null) classicControlItemProvider.dispose();
		if (statePreparationItemProvider != null) statePreparationItemProvider.dispose();
		if (measurementItemProvider != null) measurementItemProvider.dispose();
		if (elementaryQuantumGateItemProvider != null) elementaryQuantumGateItemProvider.dispose();
		if (compositeQuantumGateItemProvider != null) compositeQuantumGateItemProvider.dispose();
		if (angleParameterItemProvider != null) angleParameterItemProvider.dispose();
		if (loopOperationItemProvider != null) loopOperationItemProvider.dispose();
		if (indexIntItemProvider != null) indexIntItemProvider.dispose();
		if (indexRangeItemProvider != null) indexRangeItemProvider.dispose();
		if (operationItemProvider != null) operationItemProvider.dispose();
	}

}
