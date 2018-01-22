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
 * A representation of the literals of the enumeration '<em><b>Enum Batch Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see vpml.utilpackage.UtilpackagePackage#getEnumBatchType()
 * @model
 * @generated
 */
public final class EnumBatchType extends AbstractEnumerator {
	/**
	 * The '<em><b>AMOUNT ONLY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AMOUNT ONLY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AMOUNT_ONLY_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AMOUNT_ONLY = 0;

	/**
	 * The '<em><b>TIME ONLY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TIME ONLY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIME_ONLY_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TIME_ONLY = 1;

	/**
	 * The '<em><b>TIME OR AMOUNT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TIME OR AMOUNT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIME_OR_AMOUNT_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TIME_OR_AMOUNT = 2;

	/**
	 * The '<em><b>TIME AND AMOUNT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TIME AND AMOUNT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIME_AND_AMOUNT_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TIME_AND_AMOUNT = 3;

	/**
	 * The '<em><b>AMOUNT ONLY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AMOUNT_ONLY
	 * @generated
	 * @ordered
	 */
	public static final EnumBatchType AMOUNT_ONLY_LITERAL = new EnumBatchType(AMOUNT_ONLY, "AMOUNT_ONLY", "AMOUNT_ONLY");

	/**
	 * The '<em><b>TIME ONLY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_ONLY
	 * @generated
	 * @ordered
	 */
	public static final EnumBatchType TIME_ONLY_LITERAL = new EnumBatchType(TIME_ONLY, "TIME_ONLY", "TIME_ONLY");

	/**
	 * The '<em><b>TIME OR AMOUNT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_OR_AMOUNT
	 * @generated
	 * @ordered
	 */
	public static final EnumBatchType TIME_OR_AMOUNT_LITERAL = new EnumBatchType(TIME_OR_AMOUNT, "TIME_OR_AMOUNT", "TIME_OR_AMOUNT");

	/**
	 * The '<em><b>TIME AND AMOUNT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_AND_AMOUNT
	 * @generated
	 * @ordered
	 */
	public static final EnumBatchType TIME_AND_AMOUNT_LITERAL = new EnumBatchType(TIME_AND_AMOUNT, "TIME_AND_AMOUNT", "TIME_AND_AMOUNT");

	/**
	 * An array of all the '<em><b>Enum Batch Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EnumBatchType[] VALUES_ARRAY =
		new EnumBatchType[] {
			AMOUNT_ONLY_LITERAL,
			TIME_ONLY_LITERAL,
			TIME_OR_AMOUNT_LITERAL,
			TIME_AND_AMOUNT_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Enum Batch Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Enum Batch Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumBatchType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumBatchType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Batch Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumBatchType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumBatchType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Batch Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumBatchType get(int value) {
		switch (value) {
			case AMOUNT_ONLY: return AMOUNT_ONLY_LITERAL;
			case TIME_ONLY: return TIME_ONLY_LITERAL;
			case TIME_OR_AMOUNT: return TIME_OR_AMOUNT_LITERAL;
			case TIME_AND_AMOUNT: return TIME_AND_AMOUNT_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EnumBatchType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //EnumBatchType
