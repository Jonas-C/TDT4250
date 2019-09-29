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
 *   <li>{@link programme.Semester#getElectives <em>Electives</em>}</li>
 *   <li>{@link programme.Semester#getMandatoryCourses <em>Mandatory Courses</em>}</li>
 *   <li>{@link programme.Semester#getM2aCourses <em>M2a Courses</em>}</li>
 *   <li>{@link programme.Semester#getM1aCourses <em>M1a Courses</em>}</li>
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
	 * Returns the value of the '<em><b>Electives</b></em>' reference list.
	 * The list contents are of type {@link programme.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Electives</em>' reference list.
	 * @see programme.ProgrammePackage#getSemester_Electives()
	 * @model
	 * @generated
	 */
	EList<Course> getElectives();

	/**
	 * Returns the value of the '<em><b>Mandatory Courses</b></em>' reference list.
	 * The list contents are of type {@link programme.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory Courses</em>' reference list.
	 * @see programme.ProgrammePackage#getSemester_MandatoryCourses()
	 * @model
	 * @generated
	 */
	EList<Course> getMandatoryCourses();

	/**
	 * Returns the value of the '<em><b>M2a Courses</b></em>' reference list.
	 * The list contents are of type {@link programme.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>M2a Courses</em>' reference list.
	 * @see programme.ProgrammePackage#getSemester_M2aCourses()
	 * @model
	 * @generated
	 */
	EList<Course> getM2aCourses();

	/**
	 * Returns the value of the '<em><b>M1a Courses</b></em>' reference list.
	 * The list contents are of type {@link programme.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>M1a Courses</em>' reference list.
	 * @see programme.ProgrammePackage#getSemester_M1aCourses()
	 * @model
	 * @generated
	 */
	EList<Course> getM1aCourses();

} // Semester
