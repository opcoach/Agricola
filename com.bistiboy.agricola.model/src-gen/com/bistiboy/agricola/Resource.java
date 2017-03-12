/**
 */
package com.bistiboy.agricola;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Resource</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.bistiboy.agricola.MAgricolaPackage#getResource()
 * @model
 * @generated
 */
public enum Resource implements Enumerator {
	/**
	 * The '<em><b>Undefined</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	UNDEFINED(0, "Undefined", "Undefined"),

	/**
	 * The '<em><b>Clay</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLAY_VALUE
	 * @generated
	 * @ordered
	 */
	CLAY(1, "Clay", "Clay"),

	/**
	 * The '<em><b>Reed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REED_VALUE
	 * @generated
	 * @ordered
	 */
	REED(2, "Reed", "Reed"),

	/**
	 * The '<em><b>Wood</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WOOD_VALUE
	 * @generated
	 * @ordered
	 */
	WOOD(3, "Wood", "Wood"),

	/**
	 * The '<em><b>Stone</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STONE_VALUE
	 * @generated
	 * @ordered
	 */
	STONE(4, "Stone", "Stone"),

	/**
	 * The '<em><b>Cereal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CEREAL_VALUE
	 * @generated
	 * @ordered
	 */
	CEREAL(5, "Cereal", "Cereal"),

	/**
	 * The '<em><b>Carrot</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CARROT_VALUE
	 * @generated
	 * @ordered
	 */
	CARROT(6, "Carrot", "Carrot"),

	/**
	 * The '<em><b>Coin</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COIN_VALUE
	 * @generated
	 * @ordered
	 */
	COIN(7, "Coin", "Coin");

	/**
	 * The '<em><b>Undefined</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Undefined</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNDEFINED
	 * @model name="Undefined"
	 * @generated
	 * @ordered
	 */
	public static final int UNDEFINED_VALUE = 0;

	/**
	 * The '<em><b>Clay</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Clay</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLAY
	 * @model name="Clay"
	 * @generated
	 * @ordered
	 */
	public static final int CLAY_VALUE = 1;

	/**
	 * The '<em><b>Reed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Reed</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REED
	 * @model name="Reed"
	 * @generated
	 * @ordered
	 */
	public static final int REED_VALUE = 2;

	/**
	 * The '<em><b>Wood</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Wood</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WOOD
	 * @model name="Wood"
	 * @generated
	 * @ordered
	 */
	public static final int WOOD_VALUE = 3;

	/**
	 * The '<em><b>Stone</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Stone</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STONE
	 * @model name="Stone"
	 * @generated
	 * @ordered
	 */
	public static final int STONE_VALUE = 4;

	/**
	 * The '<em><b>Cereal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cereal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CEREAL
	 * @model name="Cereal"
	 * @generated
	 * @ordered
	 */
	public static final int CEREAL_VALUE = 5;

	/**
	 * The '<em><b>Carrot</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Carrot</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CARROT
	 * @model name="Carrot"
	 * @generated
	 * @ordered
	 */
	public static final int CARROT_VALUE = 6;

	/**
	 * The '<em><b>Coin</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Coin</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COIN
	 * @model name="Coin"
	 * @generated
	 * @ordered
	 */
	public static final int COIN_VALUE = 7;

	/**
	 * An array of all the '<em><b>Resource</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Resource[] VALUES_ARRAY =
		new Resource[] {
			UNDEFINED,
			CLAY,
			REED,
			WOOD,
			STONE,
			CEREAL,
			CARROT,
			COIN,
		};

	/**
	 * A public read-only list of all the '<em><b>Resource</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Resource> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Resource</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Resource get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Resource result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Resource</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Resource getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Resource result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Resource</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Resource get(int value) {
		switch (value) {
			case UNDEFINED_VALUE: return UNDEFINED;
			case CLAY_VALUE: return CLAY;
			case REED_VALUE: return REED;
			case WOOD_VALUE: return WOOD;
			case STONE_VALUE: return STONE;
			case CEREAL_VALUE: return CEREAL;
			case CARROT_VALUE: return CARROT;
			case COIN_VALUE: return COIN;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Resource(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Resource
