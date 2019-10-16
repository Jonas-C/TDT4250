/**
 */
package programme;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see programme.ProgrammePackage#getProgrammeType()
 * @model
 * @generated
 */
public enum ProgrammeType implements Enumerator {
	/**
	 * The '<em><b>BACHELOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BACHELOR_VALUE
	 * @generated
	 * @ordered
	 */
	BACHELOR(180, "BACHELOR", "BACHELOR"),

	/**
	 * The '<em><b>MASTER 2YEARS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MASTER_2YEARS_VALUE
	 * @generated
	 * @ordered
	 */
	MASTER_2YEARS(120, "MASTER_2_YEARS", "MASTER_2_YEARS"),

	/**
	 * The '<em><b>INTEGRATED MASTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGRATED_MASTER_VALUE
	 * @generated
	 * @ordered
	 */
	INTEGRATED_MASTER(300, "INTEGRATED_MASTER", "INTEGRATED_MASTER"),

	/**
	 * The '<em><b>YEAR STUDY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YEAR_STUDY_VALUE
	 * @generated
	 * @ordered
	 */
	YEAR_STUDY(60, "YEAR_STUDY", "YEAR_STUDY");

	/**
	 * The '<em><b>BACHELOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BACHELOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BACHELOR_VALUE = 180;

	/**
	 * The '<em><b>MASTER 2YEARS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MASTER_2YEARS
	 * @model name="MASTER_2_YEARS"
	 * @generated
	 * @ordered
	 */
	public static final int MASTER_2YEARS_VALUE = 120;

	/**
	 * The '<em><b>INTEGRATED MASTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGRATED_MASTER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INTEGRATED_MASTER_VALUE = 300;

	/**
	 * The '<em><b>YEAR STUDY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YEAR_STUDY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int YEAR_STUDY_VALUE = 60;

	/**
	 * An array of all the '<em><b>Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ProgrammeType[] VALUES_ARRAY =
		new ProgrammeType[] {
			BACHELOR,
			MASTER_2YEARS,
			INTEGRATED_MASTER,
			YEAR_STUDY,
		};

	/**
	 * A public read-only list of all the '<em><b>Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ProgrammeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProgrammeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProgrammeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProgrammeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProgrammeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProgrammeType get(int value) {
		switch (value) {
			case BACHELOR_VALUE: return BACHELOR;
			case MASTER_2YEARS_VALUE: return MASTER_2YEARS;
			case INTEGRATED_MASTER_VALUE: return INTEGRATED_MASTER;
			case YEAR_STUDY_VALUE: return YEAR_STUDY;
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
	private ProgrammeType(int value, String name, String literal) {
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
	
} //ProgrammeType
