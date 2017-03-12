/**
 */
package com.bistiboy.agricola;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.bistiboy.agricola.MAgricolaPackage
 * @generated
 */
public interface MAgricolaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MAgricolaFactory eINSTANCE = com.bistiboy.agricola.impl.MAgricolaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Gamer Board</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gamer Board</em>'.
	 * @generated
	 */
	MGamerBoard createGamerBoard();

	/**
	 * Returns a new object of class '<em>Parcel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parcel</em>'.
	 * @generated
	 */
	MParcel createParcel();

	/**
	 * Returns a new object of class '<em>Gamer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gamer</em>'.
	 * @generated
	 */
	MGamer createGamer();

	/**
	 * Returns a new object of class '<em>Agricola</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Agricola</em>'.
	 * @generated
	 */
	MAgricola createAgricola();

	/**
	 * Returns a new object of class '<em>Supplier Card</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Supplier Card</em>'.
	 * @generated
	 */
	MSupplierCard createSupplierCard();

	/**
	 * Returns a new object of class '<em>Creation Card</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Creation Card</em>'.
	 * @generated
	 */
	MCreationCard createCreationCard();

	/**
	 * Returns a new object of class '<em>Supply</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Supply</em>'.
	 * @generated
	 */
	MSupply createSupply();

	/**
	 * Returns a new object of class '<em>Creation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Creation</em>'.
	 * @generated
	 */
	MCreation createCreation();

	/**
	 * Returns a new object of class '<em>Main Board</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Main Board</em>'.
	 * @generated
	 */
	MMainBoard createMainBoard();

	/**
	 * Returns a new object of class '<em>Round</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Round</em>'.
	 * @generated
	 */
	MRound createRound();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MAgricolaPackage getAgricolaPackage();

} //MAgricolaFactory
