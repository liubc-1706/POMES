/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.utilpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Enum IO Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see vpml.utilpackage.UtilpackagePackage#getEnumIOType()
 * @model
 * @generated
 */
public final class EnumIOType extends AbstractEnumerator {
	/**
	 * The '<em><b>NON SOURCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NON SOURCE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NON_SOURCE_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NON_SOURCE = 0;

	/**
	 * The '<em><b>SINGLE SOURCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SINGLE SOURCE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SINGLE_SOURCE_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SINGLE_SOURCE = 1;

	/**
	 * The '<em><b>SEQUENCE SOURCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SEQUENCE SOURCE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEQUENCE_SOURCE_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SEQUENCE_SOURCE = 2;

	/**
	 * The '<em><b>NON SOURCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NON_SOURCE
	 * @generated
	 * @ordered
	 */
	public static final EnumIOType NON_SOURCE_LITERAL = new EnumIOType(NON_SOURCE, "NON_SOURCE", "NON_SOURCE");

	/**
	 * The '<em><b>SINGLE SOURCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SINGLE_SOURCE
	 * @generated
	 * @ordered
	 */
	public static final EnumIOType SINGLE_SOURCE_LITERAL = new EnumIOType(SINGLE_SOURCE, "SINGLE_SOURCE", "SINGLE_SOURCE");

	/**
	 * The '<em><b>SEQUENCE SOURCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEQUENCE_SOURCE
	 * @generated
	 * @ordered
	 */
	public static final EnumIOType SEQUENCE_SOURCE_LITERAL = new EnumIOType(SEQUENCE_SOURCE, "SEQUENCE_SOURCE", "SEQUENCE_SOURCE");

	/**
	 * An array of all the '<em><b>Enum IO Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EnumIOType[] VALUES_ARRAY =
		new EnumIOType[] {
			NON_SOURCE_LITERAL,
			SINGLE_SOURCE_LITERAL,
			SEQUENCE_SOURCE_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Enum IO Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Enum IO Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumIOType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumIOType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum IO Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumIOType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumIOType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum IO Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumIOType get(int value) {
		switch (value) {
			case NON_SOURCE: return NON_SOURCE_LITERAL;
			case SINGLE_SOURCE: return SINGLE_SOURCE_LITERAL;
			case SEQUENCE_SOURCE: return SEQUENCE_SOURCE_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EnumIOType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //EnumIOType
