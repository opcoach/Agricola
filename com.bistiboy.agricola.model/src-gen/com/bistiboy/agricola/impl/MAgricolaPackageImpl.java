/**
 */
package com.bistiboy.agricola.impl;

import com.bistiboy.agricola.MAgricolaFactory;
import com.bistiboy.agricola.MAgricolaPackage;
import com.bistiboy.agricola.MGamerBoard;
import com.bistiboy.agricola.MParcel;
import com.bistiboy.agricola.ParcelType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MAgricolaPackageImpl extends EPackageImpl implements MAgricolaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gamerBoardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parcelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum parcelTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.bistiboy.agricola.MAgricolaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MAgricolaPackageImpl() {
		super(eNS_URI, MAgricolaFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link MAgricolaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MAgricolaPackage init() {
		if (isInited) return (MAgricolaPackage)EPackage.Registry.INSTANCE.getEPackage(MAgricolaPackage.eNS_URI);

		// Obtain or create and register package
		MAgricolaPackageImpl theAgricolaPackage = (MAgricolaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MAgricolaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MAgricolaPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAgricolaPackage.createPackageContents();

		// Initialize created meta-data
		theAgricolaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAgricolaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MAgricolaPackage.eNS_URI, theAgricolaPackage);
		return theAgricolaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGamerBoard() {
		return gamerBoardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGamerBoard_Parcels() {
		return (EReference)gamerBoardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGamerBoard__ComputeScore() {
		return gamerBoardEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParcel() {
		return parcelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParcel_Type() {
		return (EAttribute)parcelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParcel_X() {
		return (EAttribute)parcelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParcel_Y() {
		return (EAttribute)parcelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getParcelType() {
		return parcelTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MAgricolaFactory getAgricolaFactory() {
		return (MAgricolaFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		gamerBoardEClass = createEClass(GAMER_BOARD);
		createEReference(gamerBoardEClass, GAMER_BOARD__PARCELS);
		createEOperation(gamerBoardEClass, GAMER_BOARD___COMPUTE_SCORE);

		parcelEClass = createEClass(PARCEL);
		createEAttribute(parcelEClass, PARCEL__TYPE);
		createEAttribute(parcelEClass, PARCEL__X);
		createEAttribute(parcelEClass, PARCEL__Y);

		// Create enums
		parcelTypeEEnum = createEEnum(PARCEL_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(gamerBoardEClass, MGamerBoard.class, "GamerBoard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGamerBoard_Parcels(), this.getParcel(), null, "parcels", null, 0, -1, MGamerBoard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getGamerBoard__ComputeScore(), theXMLTypePackage.getInt(), "computeScore", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(parcelEClass, MParcel.class, "Parcel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParcel_Type(), this.getParcelType(), "type", null, 0, 1, MParcel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParcel_X(), theXMLTypePackage.getInt(), "x", null, 0, 1, MParcel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParcel_Y(), theXMLTypePackage.getInt(), "y", null, 0, 1, MParcel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(parcelTypeEEnum, ParcelType.class, "ParcelType");
		addEEnumLiteral(parcelTypeEEnum, ParcelType.UNDEFINED);
		addEEnumLiteral(parcelTypeEEnum, ParcelType.FIELD);
		addEEnumLiteral(parcelTypeEEnum, ParcelType.ENCLOSURE);
		addEEnumLiteral(parcelTypeEEnum, ParcelType.SHED);
		addEEnumLiteral(parcelTypeEEnum, ParcelType.HOUSE);

		// Create resource
		createResource(eNS_URI);
	}

} //MAgricolaPackageImpl
