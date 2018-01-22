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
 * A representation of the literals of the enumeration '<em><b>Sex</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see vpml.utilpackage.UtilpackagePackage#getSex()
 * @model
 * @generated
 */
public final class Sex extends AbstractEnumerator {
	/**
	 * The '<em><b>Man</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Man</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAN_LITERAL
	 * @model name="man"
	 * @generated
	 * @ordered
	 */
	public static final int MAN = 0;

	/**
	 * The '<em><b>Woman</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Woman</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WOMAN_LITERAL
	 * @model name="woman"
	 * @generated
	 * @ordered
	 */
	public static final int WOMAN = 1;

	/**
	 * The '<em><b>Man</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAN
	 * @generated
	 * @ordered
	 */
	public static final Sex MAN_LITERAL = new Sex(MAN, "man", "man");

	/**
	 * The '<em><b>Woman</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WOMAN
	 * @generated
	 * @ordered
	 */
	public static final Sex WOMAN_LITERAL = new Sex(WOMAN, "woman", "woman");

	/**
	 * An array of all the '<em><b>Sex</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Sex[] VALUES_ARRAY =
		new Sex[] {
			MAN_LITERAL,
			WOMAN_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Sex</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Sex</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Sex get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Sex result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sex</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Sex getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Sex result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sex</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Sex get(int value) {
		switch (value) {
			case MAN: return MAN_LITERAL;
			case WOMAN: return WOMAN_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Sex(int value, String name, String literal) {
		super(value, name, literal);
	}

} //Sex
