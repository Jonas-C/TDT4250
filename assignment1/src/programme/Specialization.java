/**
 */
package programme;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specialization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link programme.Specialization#getName <em>Name</em>}</li>
 *   <li>{@link programme.Specialization#getAvailableSpecializations <em>Available Specializations</em>}</li>
 *   <li>{@link programme.Specialization#getStudyYears <em>Study Years</em>}</li>
 * </ul>
 *
 * @see programme.ProgrammePackage#getSpecialization()
 * @model
 * @generated
 */
public interface Specialization extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see programme.ProgrammePackage#getSpecialization_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link programme.Specialization#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Available Specializations</b></em>' reference list.
	 * The list contents are of type {@link programme.Specialization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available Specializations</em>' reference list.
	 * @see programme.ProgrammePackage#getSpecialization_AvailableSpecializations()
	 * @model
	 * @generated
	 */
	EList<Specialization> getAvailableSpecializations();

	/**
	 * Returns the value of the '<em><b>Study Years</b></em>' containment reference list.
	 * The list contents are of type {@link programme.StudyYear}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Study Years</em>' containment reference list.
	 * @see programme.ProgrammePackage#getSpecialization_StudyYears()
	 * @model containment="true"
	 * @generated
	 */
	EList<StudyYear> getStudyYears();

} // Specialization
