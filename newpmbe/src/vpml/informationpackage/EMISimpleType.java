/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package vpml.informationpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>EMI Simple Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see vpml.informationpackage.InformationpackagePackage#getEMISimpleType()
 * @model
 * @generated
 */
public final class EMISimpleType extends AbstractEnumerator {
	/**
	 * The '<em><b>String</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>String</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STRING_LITERAL
	 * @model name="String" literal="字符串"
	 * @generated
	 * @ordered
	 */
	public static final int STRING = 0;

	/**
	 * The '<em><b>Integer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Integer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTEGER_LITERAL
	 * @model name="Integer" literal="整数"
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER = 1;

	/**
	 * The '<em><b>Double</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Double</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_LITERAL
	 * @model name="Double" literal="小数"
	 * @generated
	 * @ordered
	 */
	public static final int DOUBLE = 2;

	/**
	 * The '<em><b>Boolean</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Boolean</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN_LITERAL
	 * @model name="Boolean" literal="布尔值"
	 * @generated
	 * @ordered
	 */
	public static final int BOOLEAN = 3;

	/**
	 * The '<em><b>Date</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Date</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATE_LITERAL
	 * @model name="Date" literal="日期"
	 * @generated
	 * @ordered
	 */
	public static final int DATE = 4;

	/**
	 * The '<em><b>Date Time</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Date Time</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATE_TIME_LITERAL
	 * @model name="DateTime" literal="日期时间"
	 * @generated
	 * @ordered
	 */
	public static final int DATE_TIME = 5;

	/**
	 * The '<em><b>Time</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Time</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIME_LITERAL
	 * @model name="Time" literal="时间"
	 * @generated
	 * @ordered
	 */
	public static final int TIME = 6;

	/**
	 * The '<em><b>String</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING
	 * @generated
	 * @ordered
	 */
	public static final EMISimpleType STRING_LITERAL = new EMISimpleType(STRING, "String", "字符串");

	/**
	 * The '<em><b>Integer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER
	 * @generated
	 * @ordered
	 */
	public static final EMISimpleType INTEGER_LITERAL = new EMISimpleType(INTEGER, "Integer", "整数");

	/**
	 * The '<em><b>Double</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE
	 * @generated
	 * @ordered
	 */
	public static final EMISimpleType DOUBLE_LITERAL = new EMISimpleType(DOUBLE, "Double", "小数");

	/**
	 * The '<em><b>Boolean</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN
	 * @generated
	 * @ordered
	 */
	public static final EMISimpleType BOOLEAN_LITERAL = new EMISimpleType(BOOLEAN, "Boolean", "布尔值");

	/**
	 * The '<em><b>Date</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE
	 * @generated
	 * @ordered
	 */
	public static final EMISimpleType DATE_LITERAL = new EMISimpleType(DATE, "Date", "日期");

	/**
	 * The '<em><b>Date Time</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_TIME
	 * @generated
	 * @ordered
	 */
	public static final EMISimpleType DATE_TIME_LITERAL = new EMISimpleType(DATE_TIME, "DateTime", "日期时间");

	/**
	 * The '<em><b>Time</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME
	 * @generated
	 * @ordered
	 */
	public static final EMISimpleType TIME_LITERAL = new EMISimpleType(TIME, "Time", "时间");

	/**
	 * An array of all the '<em><b>EMI Simple Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EMISimpleType[] VALUES_ARRAY =
		new EMISimpleType[] {
			STRING_LITERAL,
			INTEGER_LITERAL,
			DOUBLE_LITERAL,
			BOOLEAN_LITERAL,
			DATE_LITERAL,
			DATE_TIME_LITERAL,
			TIME_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>EMI Simple Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>EMI Simple Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EMISimpleType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EMISimpleType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EMI Simple Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EMISimpleType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EMISimpleType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EMI Simple Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EMISimpleType get(int value) {
		switch (value) {
			case STRING: return STRING_LITERAL;
			case INTEGER: return INTEGER_LITERAL;
			case DOUBLE: return DOUBLE_LITERAL;
			case BOOLEAN: return BOOLEAN_LITERAL;
			case DATE: return DATE_LITERAL;
			case DATE_TIME: return DATE_TIME_LITERAL;
			case TIME: return TIME_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMISimpleType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //EMISimpleType
