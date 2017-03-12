/**
 */
package com.bistiboy.agricola.impl;

import com.bistiboy.agricola.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MAgricolaFactoryImpl extends EFactoryImpl implements MAgricolaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MAgricolaFactory init() {
		try {
			MAgricolaFactory theAgricolaFactory = (MAgricolaFactory)EPackage.Registry.INSTANCE.getEFactory(MAgricolaPackage.eNS_URI);
			if (theAgricolaFactory != null) {
				return theAgricolaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MAgricolaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MAgricolaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MAgricolaPackage.GAMER_BOARD: return createGamerBoard();
			case MAgricolaPackage.PARCEL: return createParcel();
			case MAgricolaPackage.GAMER: return createGamer();
			case MAgricolaPackage.AGRICOLA: return createAgricola();
			case MAgricolaPackage.SUPPLIER_CARD: return createSupplierCard();
			case MAgricolaPackage.CREATION_CARD: return createCreationCard();
			case MAgricolaPackage.SUPPLY: return createSupply();
			case MAgricolaPackage.CREATION: return createCreation();
			case MAgricolaPackage.MAIN_BOARD: return createMainBoard();
			case MAgricolaPackage.ROUND: return createRound();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case MAgricolaPackage.PARCEL_TYPE:
				return createParcelTypeFromString(eDataType, initialValue);
			case MAgricolaPackage.RESOURCE:
				return createResourceFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case MAgricolaPackage.PARCEL_TYPE:
				return convertParcelTypeToString(eDataType, instanceValue);
			case MAgricolaPackage.RESOURCE:
				return convertResourceToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MGamerBoard createGamerBoard() {
		MGamerBoardImpl gamerBoard = new MGamerBoardImpl();
		return gamerBoard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MParcel createParcel() {
		MParcelImpl parcel = new MParcelImpl();
		return parcel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MGamer createGamer() {
		MGamerImpl gamer = new MGamerImpl();
		return gamer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MAgricola createAgricola() {
		MAgricolaImpl agricola = new MAgricolaImpl();
		return agricola;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSupplierCard createSupplierCard() {
		MSupplierCardImpl supplierCard = new MSupplierCardImpl();
		return supplierCard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MCreationCard createCreationCard() {
		MCreationCardImpl creationCard = new MCreationCardImpl();
		return creationCard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSupply createSupply() {
		MSupplyImpl supply = new MSupplyImpl();
		return supply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MCreation createCreation() {
		MCreationImpl creation = new MCreationImpl();
		return creation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MMainBoard createMainBoard() {
		MMainBoardImpl mainBoard = new MMainBoardImpl();
		return mainBoard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MRound createRound() {
		MRoundImpl round = new MRoundImpl();
		return round;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParcelType createParcelTypeFromString(EDataType eDataType, String initialValue) {
		ParcelType result = ParcelType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParcelTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource createResourceFromString(EDataType eDataType, String initialValue) {
		Resource result = Resource.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResourceToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MAgricolaPackage getAgricolaPackage() {
		return (MAgricolaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MAgricolaPackage getPackage() {
		return MAgricolaPackage.eINSTANCE;
	}

} //MAgricolaFactoryImpl
