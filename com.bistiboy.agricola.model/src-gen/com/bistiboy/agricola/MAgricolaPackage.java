/**
 */
package com.bistiboy.agricola;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.bistiboy.agricola.MAgricolaFactory
 * @model kind="package"
 * @generated
 */
public interface MAgricolaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "agricola";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://com.bistiboy.agricola/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "agricola";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MAgricolaPackage eINSTANCE = com.bistiboy.agricola.impl.MAgricolaPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.bistiboy.agricola.impl.MGamerBoardImpl <em>Gamer Board</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.bistiboy.agricola.impl.MGamerBoardImpl
	 * @see com.bistiboy.agricola.impl.MAgricolaPackageImpl#getGamerBoard()
	 * @generated
	 */
	int GAMER_BOARD = 0;

	/**
	 * The feature id for the '<em><b>Parcels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMER_BOARD__PARCELS = 0;

	/**
	 * The number of structural features of the '<em>Gamer Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMER_BOARD_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Compute Score</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMER_BOARD___COMPUTE_SCORE = 0;

	/**
	 * The number of operations of the '<em>Gamer Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAMER_BOARD_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.bistiboy.agricola.impl.MParcelImpl <em>Parcel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.bistiboy.agricola.impl.MParcelImpl
	 * @see com.bistiboy.agricola.impl.MAgricolaPackageImpl#getParcel()
	 * @generated
	 */
	int PARCEL = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARCEL__TYPE = 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARCEL__X = 1;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARCEL__Y = 2;

	/**
	 * The number of structural features of the '<em>Parcel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARCEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Parcel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARCEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.bistiboy.agricola.ParcelType <em>Parcel Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.bistiboy.agricola.ParcelType
	 * @see com.bistiboy.agricola.impl.MAgricolaPackageImpl#getParcelType()
	 * @generated
	 */
	int PARCEL_TYPE = 2;


	/**
	 * Returns the meta object for class '{@link com.bistiboy.agricola.MGamerBoard <em>Gamer Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gamer Board</em>'.
	 * @see com.bistiboy.agricola.MGamerBoard
	 * @generated
	 */
	EClass getGamerBoard();

	/**
	 * Returns the meta object for the containment reference list '{@link com.bistiboy.agricola.MGamerBoard#getParcels <em>Parcels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parcels</em>'.
	 * @see com.bistiboy.agricola.MGamerBoard#getParcels()
	 * @see #getGamerBoard()
	 * @generated
	 */
	EReference getGamerBoard_Parcels();

	/**
	 * Returns the meta object for the '{@link com.bistiboy.agricola.MGamerBoard#computeScore() <em>Compute Score</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compute Score</em>' operation.
	 * @see com.bistiboy.agricola.MGamerBoard#computeScore()
	 * @generated
	 */
	EOperation getGamerBoard__ComputeScore();

	/**
	 * Returns the meta object for class '{@link com.bistiboy.agricola.MParcel <em>Parcel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parcel</em>'.
	 * @see com.bistiboy.agricola.MParcel
	 * @generated
	 */
	EClass getParcel();

	/**
	 * Returns the meta object for the attribute '{@link com.bistiboy.agricola.MParcel#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.bistiboy.agricola.MParcel#getType()
	 * @see #getParcel()
	 * @generated
	 */
	EAttribute getParcel_Type();

	/**
	 * Returns the meta object for the attribute '{@link com.bistiboy.agricola.MParcel#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see com.bistiboy.agricola.MParcel#getX()
	 * @see #getParcel()
	 * @generated
	 */
	EAttribute getParcel_X();

	/**
	 * Returns the meta object for the attribute '{@link com.bistiboy.agricola.MParcel#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see com.bistiboy.agricola.MParcel#getY()
	 * @see #getParcel()
	 * @generated
	 */
	EAttribute getParcel_Y();

	/**
	 * Returns the meta object for enum '{@link com.bistiboy.agricola.ParcelType <em>Parcel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parcel Type</em>'.
	 * @see com.bistiboy.agricola.ParcelType
	 * @generated
	 */
	EEnum getParcelType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MAgricolaFactory getAgricolaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.bistiboy.agricola.impl.MGamerBoardImpl <em>Gamer Board</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.bistiboy.agricola.impl.MGamerBoardImpl
		 * @see com.bistiboy.agricola.impl.MAgricolaPackageImpl#getGamerBoard()
		 * @generated
		 */
		EClass GAMER_BOARD = eINSTANCE.getGamerBoard();

		/**
		 * The meta object literal for the '<em><b>Parcels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAMER_BOARD__PARCELS = eINSTANCE.getGamerBoard_Parcels();

		/**
		 * The meta object literal for the '<em><b>Compute Score</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GAMER_BOARD___COMPUTE_SCORE = eINSTANCE.getGamerBoard__ComputeScore();

		/**
		 * The meta object literal for the '{@link com.bistiboy.agricola.impl.MParcelImpl <em>Parcel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.bistiboy.agricola.impl.MParcelImpl
		 * @see com.bistiboy.agricola.impl.MAgricolaPackageImpl#getParcel()
		 * @generated
		 */
		EClass PARCEL = eINSTANCE.getParcel();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARCEL__TYPE = eINSTANCE.getParcel_Type();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARCEL__X = eINSTANCE.getParcel_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARCEL__Y = eINSTANCE.getParcel_Y();

		/**
		 * The meta object literal for the '{@link com.bistiboy.agricola.ParcelType <em>Parcel Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.bistiboy.agricola.ParcelType
		 * @see com.bistiboy.agricola.impl.MAgricolaPackageImpl#getParcelType()
		 * @generated
		 */
		EEnum PARCEL_TYPE = eINSTANCE.getParcelType();

	}

} //MAgricolaPackage
