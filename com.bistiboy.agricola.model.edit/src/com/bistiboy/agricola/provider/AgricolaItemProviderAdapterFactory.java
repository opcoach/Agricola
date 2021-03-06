/**
 */
package com.bistiboy.agricola.provider;

import com.bistiboy.agricola.util.AgricolaAdapterFactory;

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

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AgricolaItemProviderAdapterFactory extends AgricolaAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public AgricolaItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.bistiboy.agricola.MGamerBoard} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GamerBoardItemProvider gamerBoardItemProvider;

	/**
	 * This creates an adapter for a {@link com.bistiboy.agricola.MGamerBoard}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGamerBoardAdapter() {
		if (gamerBoardItemProvider == null) {
			gamerBoardItemProvider = new GamerBoardItemProvider(this);
		}

		return gamerBoardItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.bistiboy.agricola.MParcel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParcelItemProvider parcelItemProvider;

	/**
	 * This creates an adapter for a {@link com.bistiboy.agricola.MParcel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createParcelAdapter() {
		if (parcelItemProvider == null) {
			parcelItemProvider = new ParcelItemProvider(this);
		}

		return parcelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.bistiboy.agricola.MGamer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GamerItemProvider gamerItemProvider;

	/**
	 * This creates an adapter for a {@link com.bistiboy.agricola.MGamer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGamerAdapter() {
		if (gamerItemProvider == null) {
			gamerItemProvider = new GamerItemProvider(this);
		}

		return gamerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.bistiboy.agricola.MAgricola} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgricolaItemProvider agricolaItemProvider;

	/**
	 * This creates an adapter for a {@link com.bistiboy.agricola.MAgricola}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAgricolaAdapter() {
		if (agricolaItemProvider == null) {
			agricolaItemProvider = new AgricolaItemProvider(this);
		}

		return agricolaItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.bistiboy.agricola.MSupplierCard} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupplierCardItemProvider supplierCardItemProvider;

	/**
	 * This creates an adapter for a {@link com.bistiboy.agricola.MSupplierCard}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSupplierCardAdapter() {
		if (supplierCardItemProvider == null) {
			supplierCardItemProvider = new SupplierCardItemProvider(this);
		}

		return supplierCardItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.bistiboy.agricola.MCreationCard} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreationCardItemProvider creationCardItemProvider;

	/**
	 * This creates an adapter for a {@link com.bistiboy.agricola.MCreationCard}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCreationCardAdapter() {
		if (creationCardItemProvider == null) {
			creationCardItemProvider = new CreationCardItemProvider(this);
		}

		return creationCardItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.bistiboy.agricola.MSupply} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupplyItemProvider supplyItemProvider;

	/**
	 * This creates an adapter for a {@link com.bistiboy.agricola.MSupply}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSupplyAdapter() {
		if (supplyItemProvider == null) {
			supplyItemProvider = new SupplyItemProvider(this);
		}

		return supplyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.bistiboy.agricola.MCreation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreationItemProvider creationItemProvider;

	/**
	 * This creates an adapter for a {@link com.bistiboy.agricola.MCreation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCreationAdapter() {
		if (creationItemProvider == null) {
			creationItemProvider = new CreationItemProvider(this);
		}

		return creationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.bistiboy.agricola.MMainBoard} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MainBoardItemProvider mainBoardItemProvider;

	/**
	 * This creates an adapter for a {@link com.bistiboy.agricola.MMainBoard}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMainBoardAdapter() {
		if (mainBoardItemProvider == null) {
			mainBoardItemProvider = new MainBoardItemProvider(this);
		}

		return mainBoardItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.bistiboy.agricola.MRound} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoundItemProvider roundItemProvider;

	/**
	 * This creates an adapter for a {@link com.bistiboy.agricola.MRound}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRoundAdapter() {
		if (roundItemProvider == null) {
			roundItemProvider = new RoundItemProvider(this);
		}

		return roundItemProvider;
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
		if (gamerBoardItemProvider != null) gamerBoardItemProvider.dispose();
		if (parcelItemProvider != null) parcelItemProvider.dispose();
		if (gamerItemProvider != null) gamerItemProvider.dispose();
		if (agricolaItemProvider != null) agricolaItemProvider.dispose();
		if (supplierCardItemProvider != null) supplierCardItemProvider.dispose();
		if (creationCardItemProvider != null) creationCardItemProvider.dispose();
		if (supplyItemProvider != null) supplyItemProvider.dispose();
		if (creationItemProvider != null) creationItemProvider.dispose();
		if (mainBoardItemProvider != null) mainBoardItemProvider.dispose();
		if (roundItemProvider != null) roundItemProvider.dispose();
	}

}
