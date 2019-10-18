/**
 */
package programme;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Course Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see programme.ProgrammePackage#getCourseType()
 * @model
 * @generated
 */
public enum CourseType implements Enumerator {
	/**
	 * The '<em><b>Obligatory</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBLIGATORY_VALUE
	 * @generated
	 * @ordered
	 */
	OBLIGATORY(0, "Obligatory", "Obligatory"),

	/**
	 * The '<em><b>Elective</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELECTIVE_VALUE
	 * @generated
	 * @ordered
	 */
	ELECTIVE(1, "Elective", "Elective"),

	/**
	 * The '<em><b>M2A</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #M2A_VALUE
	 * @generated
	 * @ordered
	 */
	M2A(2, "M2A", "M2A"),

	/**
	 * The '<em><b>M1A</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #M1A_VALUE
	 * @generated
	 * @ordered
	 */
	M1A(3, "M1A", "M1A");

	/**
	 * The '<em><b>Obligatory</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBLIGATORY
	 * @model name="Obligatory"
	 * @generated
	 * @ordered
	 */
	public static final int OBLIGATORY_VALUE = 0;

	/**
	 * The '<em><b>Elective</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELECTIVE
	 * @model name="Elective"
	 * @generated
	 * @ordered
	 */
	public static final int ELECTIVE_VALUE = 1;

	/**
	 * The '<em><b>M2A</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #M2A
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int M2A_VALUE = 2;

	/**
	 * The '<em><b>M1A</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #M1A
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int M1A_VALUE = 3;

	/**
	 * An array of all the '<em><b>Course Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CourseType[] VALUES_ARRAY =
		new CourseType[] {
			OBLIGATORY,
			ELECTIVE,
			M2A,
			M1A,
		};

	/**
	 * A public read-only list of all the '<em><b>Course Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CourseType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Course Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CourseType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CourseType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Course Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CourseType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CourseType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Course Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CourseType get(int value) {
		switch (value) {
			case OBLIGATORY_VALUE: return OBLIGATORY;
			case ELECTIVE_VALUE: return ELECTIVE;
			case M2A_VALUE: return M2A;
			case M1A_VALUE: return M1A;
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
	private CourseType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	
} //CourseType
