/**
 */
package programme;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link programme.Course#getName <em>Name</em>}</li>
 *   <li>{@link programme.Course#getCode <em>Code</em>}</li>
 *   <li>{@link programme.Course#getTaugtIn <em>Taugt In</em>}</li>
 *   <li>{@link programme.Course#getLevel <em>Level</em>}</li>
 *   <li>{@link programme.Course#getCredits <em>Credits</em>}</li>
 * </ul>
 *
 * @see programme.ProgrammePackage#getCourse()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='courseCreditsShouldBeOver5'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 courseCreditsShouldBeOver5='self.credits -&gt; sum() &gt;= 5.0'"
 * @generated
 */
public interface Course extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see programme.ProgrammePackage#getCourse_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link programme.Course#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see programme.ProgrammePackage#getCourse_Code()
	 * @model required="true"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link programme.Course#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Taugt In</b></em>' attribute.
	 * The literals are from the enumeration {@link programme.SemesterType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Taugt In</em>' attribute.
	 * @see programme.SemesterType
	 * @see #setTaugtIn(SemesterType)
	 * @see programme.ProgrammePackage#getCourse_TaugtIn()
	 * @model required="true"
	 * @generated
	 */
	SemesterType getTaugtIn();

	/**
	 * Sets the value of the '{@link programme.Course#getTaugtIn <em>Taugt In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Taugt In</em>' attribute.
	 * @see programme.SemesterType
	 * @see #getTaugtIn()
	 * @generated
	 */
	void setTaugtIn(SemesterType value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * The literals are from the enumeration {@link programme.CourseLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see programme.CourseLevel
	 * @see #setLevel(CourseLevel)
	 * @see programme.ProgrammePackage#getCourse_Level()
	 * @model required="true"
	 * @generated
	 */
	CourseLevel getLevel();

	/**
	 * Sets the value of the '{@link programme.Course#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see programme.CourseLevel
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(CourseLevel value);

	/**
	 * Returns the value of the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credits</em>' attribute.
	 * @see #setCredits(float)
	 * @see programme.ProgrammePackage#getCourse_Credits()
	 * @model required="true"
	 * @generated
	 */
	float getCredits();

	/**
	 * Sets the value of the '{@link programme.Course#getCredits <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credits</em>' attribute.
	 * @see #getCredits()
	 * @generated
	 */
	void setCredits(float value);

} // Course
