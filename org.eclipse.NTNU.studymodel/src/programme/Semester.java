/**
 */
package programme;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link programme.Semester#getSemesterType <em>Semester Type</em>}</li>
 *   <li>{@link programme.Semester#getCourses <em>Courses</em>}</li>
 * </ul>
 *
 * @see programme.ProgrammePackage#getSemester()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='semesterTypesMustMatch'"
 * @generated
 */
public interface Semester extends EObject {
	/**
	 * Returns the value of the '<em><b>Semester Type</b></em>' attribute.
	 * The literals are from the enumeration {@link programme.SemesterType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester Type</em>' attribute.
	 * @see programme.SemesterType
	 * @see #setSemesterType(SemesterType)
	 * @see programme.ProgrammePackage#getSemester_SemesterType()
	 * @model required="true"
	 * @generated
	 */
	SemesterType getSemesterType();

	/**
	 * Sets the value of the '{@link programme.Semester#getSemesterType <em>Semester Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester Type</em>' attribute.
	 * @see programme.SemesterType
	 * @see #getSemesterType()
	 * @generated
	 */
	void setSemesterType(SemesterType value);

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' containment reference list.
	 * The list contents are of type {@link programme.SemesterCourse}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' containment reference list.
	 * @see programme.ProgrammePackage#getSemester_Courses()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SemesterCourse> getCourses();

} // Semester
