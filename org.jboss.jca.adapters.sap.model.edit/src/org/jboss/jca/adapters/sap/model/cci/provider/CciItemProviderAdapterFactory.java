/**
 */
package org.jboss.jca.adapters.sap.model.cci.provider;

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

import org.jboss.jca.adapters.sap.model.cci.util.CciAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CciItemProviderAdapterFactory extends CciAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public CciItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.jboss.jca.adapters.sap.model.cci.ConnectionFactory} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionFactoryItemProvider connectionFactoryItemProvider;

	/**
	 * This creates an adapter for a {@link org.jboss.jca.adapters.sap.model.cci.ConnectionFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConnectionFactoryAdapter() {
		if (connectionFactoryItemProvider == null) {
			connectionFactoryItemProvider = new ConnectionFactoryItemProvider(this);
		}

		return connectionFactoryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.jboss.jca.adapters.sap.model.cci.Connection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionItemProvider connectionItemProvider;

	/**
	 * This creates an adapter for a {@link org.jboss.jca.adapters.sap.model.cci.Connection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConnectionAdapter() {
		if (connectionItemProvider == null) {
			connectionItemProvider = new ConnectionItemProvider(this);
		}

		return connectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.jboss.jca.adapters.sap.model.cci.ConnectionSpec} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionSpecItemProvider connectionSpecItemProvider;

	/**
	 * This creates an adapter for a {@link org.jboss.jca.adapters.sap.model.cci.ConnectionSpec}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConnectionSpecAdapter() {
		if (connectionSpecItemProvider == null) {
			connectionSpecItemProvider = new ConnectionSpecItemProvider(this);
		}

		return connectionSpecItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.jboss.jca.adapters.sap.model.cci.Interaction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionItemProvider interactionItemProvider;

	/**
	 * This creates an adapter for a {@link org.jboss.jca.adapters.sap.model.cci.Interaction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInteractionAdapter() {
		if (interactionItemProvider == null) {
			interactionItemProvider = new InteractionItemProvider(this);
		}

		return interactionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.jboss.jca.adapters.sap.model.cci.InteractionSpec} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionSpecItemProvider interactionSpecItemProvider;

	/**
	 * This creates an adapter for a {@link org.jboss.jca.adapters.sap.model.cci.InteractionSpec}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInteractionSpecAdapter() {
		if (interactionSpecItemProvider == null) {
			interactionSpecItemProvider = new InteractionSpecItemProvider(this);
		}

		return interactionSpecItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.jboss.jca.adapters.sap.model.cci.RecordFactory} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecordFactoryItemProvider recordFactoryItemProvider;

	/**
	 * This creates an adapter for a {@link org.jboss.jca.adapters.sap.model.cci.RecordFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRecordFactoryAdapter() {
		if (recordFactoryItemProvider == null) {
			recordFactoryItemProvider = new RecordFactoryItemProvider(this);
		}

		return recordFactoryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.jboss.jca.adapters.sap.model.cci.MappedRecord} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappedRecordItemProvider mappedRecordItemProvider;

	/**
	 * This creates an adapter for a {@link org.jboss.jca.adapters.sap.model.cci.MappedRecord}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMappedRecordAdapter() {
		if (mappedRecordItemProvider == null) {
			mappedRecordItemProvider = new MappedRecordItemProvider(this);
		}

		return mappedRecordItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.jboss.jca.adapters.sap.model.cci.IndexedRecord} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndexedRecordItemProvider indexedRecordItemProvider;

	/**
	 * This creates an adapter for a {@link org.jboss.jca.adapters.sap.model.cci.IndexedRecord}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIndexedRecordAdapter() {
		if (indexedRecordItemProvider == null) {
			indexedRecordItemProvider = new IndexedRecordItemProvider(this);
		}

		return indexedRecordItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.jboss.jca.adapters.sap.model.cci.Execution} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutionItemProvider executionItemProvider;

	/**
	 * This creates an adapter for a {@link org.jboss.jca.adapters.sap.model.cci.Execution}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExecutionAdapter() {
		if (executionItemProvider == null) {
			executionItemProvider = new ExecutionItemProvider(this);
		}

		return executionItemProvider;
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
		if (connectionFactoryItemProvider != null) connectionFactoryItemProvider.dispose();
		if (connectionItemProvider != null) connectionItemProvider.dispose();
		if (connectionSpecItemProvider != null) connectionSpecItemProvider.dispose();
		if (interactionItemProvider != null) interactionItemProvider.dispose();
		if (executionItemProvider != null) executionItemProvider.dispose();
		if (interactionSpecItemProvider != null) interactionSpecItemProvider.dispose();
		if (recordFactoryItemProvider != null) recordFactoryItemProvider.dispose();
		if (mappedRecordItemProvider != null) mappedRecordItemProvider.dispose();
		if (indexedRecordItemProvider != null) indexedRecordItemProvider.dispose();
	}

}
