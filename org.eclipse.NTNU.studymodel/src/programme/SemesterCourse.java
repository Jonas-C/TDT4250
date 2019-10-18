/**
 */
package programme;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semester Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link programme.SemesterCourse#getSemesterCourse <em>Semester Course</em>}</li>
 *   <li>{@link programme.SemesterCourse#getCourseType <em>Course Type</em>}</li>
 * </ul>
 *
 * @see programme.ProgrammePackage#getSemesterCourse()
 * @model
 * @generated
 */
public interface SemesterCourse extends EObject {
	/**
	 * Returns the value of the '<em><b>Semester Course</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester Course</em>' reference.
	 * @see #setSemesterCourse(Course)
	 * @see programme.ProgrammePackage#getSemesterCourse_SemesterCourse()
	 * @model required="true"
	 * @generated
	 */
	Course getSemesterCourse();

	/**
	 * Sets the value of the '{@link programme.SemesterCourse#getSemesterCourse <em>Semester Course</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester Course</em>' reference.
	 * @see #getSemesterCourse()
	 * @generated
	 */
	void setSemesterCourse(Course value);

	/**
	 * Returns the value of the '<em><b>Course Type</b></em>' attribute.
	 * The literals are from the enumeration {@link programme.CourseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Type</em>' attribute.
	 * @see programme.CourseType
	 * @see #setCourseType(CourseType)
	 * @see programme.ProgrammePackage#getSemesterCourse_CourseType()
	 * @model required="true"
	 * @generated
	 */
	CourseType getCourseType();

	/**
	 * Sets the value of the '{@link programme.SemesterCourse#getCourseType <em>Course Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course Type</em>' attribute.
	 * @see programme.CourseType
	 * @see #getCourseType()
	 * @generated
	 */
	void setCourseType(CourseType value);

} // SemesterCourse
