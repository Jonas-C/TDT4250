/**
 */
package programme;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Study Year</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link programme.StudyYear#getYear <em>Year</em>}</li>
 *   <li>{@link programme.StudyYear#getSemesters <em>Semesters</em>}</li>
 * </ul>
 *
 * @see programme.ProgrammePackage#getStudyYear()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='mustContainFallAndSpringSemesters'"
 * @generated
 */
public interface StudyYear extends EObject {
	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(int)
	 * @see programme.ProgrammePackage#getStudyYear_Year()
	 * @model required="true"
	 * @generated
	 */
	int getYear();

	/**
	 * Sets the value of the '{@link programme.StudyYear#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(int value);

	/**
	 * Returns the value of the '<em><b>Semesters</b></em>' containment reference list.
	 * The list contents are of type {@link programme.Semester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesters</em>' containment reference list.
	 * @see programme.ProgrammePackage#getStudyYear_Semesters()
	 * @model containment="true" lower="2" upper="2"
	 * @generated
	 */
	EList<Semester> getSemesters();

} // StudyYear
