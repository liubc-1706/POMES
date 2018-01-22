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
 * A representation of the literals of the enumeration '<em><b>Enum Distribution</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 分布概率类型
 * public final static int DEFAULT = 0;
 * public final static int CONSTANT = 1;
 * public final static int UNIFORM = 2;
 * public final static int NORMAL = 3;
 * public final static int POISSION = 4;
 * public final static int EXPONENTIAL = 5;
 * public final static int GAMMA = 6;
 * 
 * public final static String[] FunctionName ={"缺省分布","常量分布","均匀分布","正态分布","泊松分布","指数分布","Gamma分布"};
 * 	
 * <!-- end-model-doc -->
 * @see vpml.utilpackage.UtilpackagePackage#getEnumDistribution()
 * @model
 * @generated
 */
public final class EnumDistribution extends AbstractEnumerator {
	/**
	 * The '<em><b>DEFAULT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DEFAULT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEFAULT_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DEFAULT = 0;

	/**
	 * The '<em><b>CONSTANT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONSTANT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONSTANT_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONSTANT = 1;

	/**
	 * The '<em><b>UNIFORM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNIFORM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNIFORM_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNIFORM = 2;

	/**
	 * The '<em><b>NORMAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NORMAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NORMAL_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL = 3;

	/**
	 * The '<em><b>POISSION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>POISSION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POISSION_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int POISSION = 4;

	/**
	 * The '<em><b>EXPONENTIAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EXPONENTIAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXPONENTIAL_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXPONENTIAL = 5;

	/**
	 * The '<em><b>GAMMA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GAMMA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GAMMA_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GAMMA = 6;

	/**
	 * The '<em><b>DEFAULT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFAULT
	 * @generated
	 * @ordered
	 */
	public static final EnumDistribution DEFAULT_LITERAL = new EnumDistribution(DEFAULT, "DEFAULT", "DEFAULT");

	/**
	 * The '<em><b>CONSTANT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSTANT
	 * @generated
	 * @ordered
	 */
	public static final EnumDistribution CONSTANT_LITERAL = new EnumDistribution(CONSTANT, "CONSTANT", "CONSTANT");

	/**
	 * The '<em><b>UNIFORM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIFORM
	 * @generated
	 * @ordered
	 */
	public static final EnumDistribution UNIFORM_LITERAL = new EnumDistribution(UNIFORM, "UNIFORM", "UNIFORM");

	/**
	 * The '<em><b>NORMAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORMAL
	 * @generated
	 * @ordered
	 */
	public static final EnumDistribution NORMAL_LITERAL = new EnumDistribution(NORMAL, "NORMAL", "NORMAL");

	/**
	 * The '<em><b>POISSION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POISSION
	 * @generated
	 * @ordered
	 */
	public static final EnumDistribution POISSION_LITERAL = new EnumDistribution(POISSION, "POISSION", "POISSION");

	/**
	 * The '<em><b>EXPONENTIAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPONENTIAL
	 * @generated
	 * @ordered
	 */
	public static final EnumDistribution EXPONENTIAL_LITERAL = new EnumDistribution(EXPONENTIAL, "EXPONENTIAL", "EXPONENTIAL");

	/**
	 * The '<em><b>GAMMA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GAMMA
	 * @generated
	 * @ordered
	 */
	public static final EnumDistribution GAMMA_LITERAL = new EnumDistribution(GAMMA, "GAMMA", "GAMMA");

	/**
	 * An array of all the '<em><b>Enum Distribution</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EnumDistribution[] VALUES_ARRAY =
		new EnumDistribution[] {
			DEFAULT_LITERAL,
			CONSTANT_LITERAL,
			UNIFORM_LITERAL,
			NORMAL_LITERAL,
			POISSION_LITERAL,
			EXPONENTIAL_LITERAL,
			GAMMA_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Enum Distribution</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Enum Distribution</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumDistribution get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumDistribution result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Distribution</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumDistribution getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnumDistribution result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Enum Distribution</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumDistribution get(int value) {
		switch (value) {
			case DEFAULT: return DEFAULT_LITERAL;
			case CONSTANT: return CONSTANT_LITERAL;
			case UNIFORM: return UNIFORM_LITERAL;
			case NORMAL: return NORMAL_LITERAL;
			case POISSION: return POISSION_LITERAL;
			case EXPONENTIAL: return EXPONENTIAL_LITERAL;
			case GAMMA: return GAMMA_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EnumDistribution(int value, String name, String literal) {
		super(value, name, literal);
	}

} //EnumDistribution
