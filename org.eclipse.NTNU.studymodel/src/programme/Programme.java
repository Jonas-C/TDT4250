/**
 */
package programme;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Programme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link programme.Programme#getName <em>Name</em>}</li>
 *   <li>{@link programme.Programme#getAvailableSpecializations <em>Available Specializations</em>}</li>
 *   <li>{@link programme.Programme#getProgrammeType <em>Programme Type</em>}</li>
 *   <li>{@link programme.Programme#getStudyYears <em>Study Years</em>}</li>
 *   <li>{@link programme.Programme#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @see programme.ProgrammePackage#getProgramme()
 * @model
 * @generated
 */
public interface Programme extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see programme.ProgrammePackage#getProgramme_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link programme.Programme#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Available Specializations</b></em>' containment reference list.
	 * The list contents are of type {@link programme.Specialization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available Specializations</em>' containment reference list.
	 * @see programme.ProgrammePackage#getProgramme_AvailableSpecializations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Specialization> getAvailableSpecializations();

	/**
	 * Returns the value of the '<em><b>Programme Type</b></em>' attribute.
	 * The literals are from the enumeration {@link programme.ProgrammeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programme Type</em>' attribute.
	 * @see programme.ProgrammeType
	 * @see #setProgrammeType(ProgrammeType)
	 * @see programme.ProgrammePackage#getProgramme_ProgrammeType()
	 * @model required="true"
	 * @generated
	 */
	ProgrammeType getProgrammeType();

	/**
	 * Sets the value of the '{@link programme.Programme#getProgrammeType <em>Programme Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Programme Type</em>' attribute.
	 * @see programme.ProgrammeType
	 * @see #getProgrammeType()
	 * @generated
	 */
	void setProgrammeType(ProgrammeType value);

	/**
	 * Returns the value of the '<em><b>Study Years</b></em>' containment reference list.
	 * The list contents are of type {@link programme.StudyYear}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Study Years</em>' containment reference list.
	 * @see programme.ProgrammePackage#getProgramme_StudyYears()
	 * @model containment="true"
	 * @generated
	 */
	EList<StudyYear> getStudyYears();

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see programme.ProgrammePackage#getProgramme_Code()
	 * @model required="true"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link programme.Programme#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

} // Programme
