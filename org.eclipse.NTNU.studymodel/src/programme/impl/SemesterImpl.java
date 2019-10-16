/**
 */
package programme.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import programme.Course;
import programme.ProgrammePackage;
import programme.Semester;
import programme.SemesterType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link programme.impl.SemesterImpl#getSemesterType <em>Semester Type</em>}</li>
 *   <li>{@link programme.impl.SemesterImpl#getElectives <em>Electives</em>}</li>
 *   <li>{@link programme.impl.SemesterImpl#getMandatoryCourses <em>Mandatory Courses</em>}</li>
 *   <li>{@link programme.impl.SemesterImpl#getM2aCourses <em>M2a Courses</em>}</li>
 *   <li>{@link programme.impl.SemesterImpl#getM1aCourses <em>M1a Courses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemesterImpl extends MinimalEObjectImpl.Container implements Semester {
	/**
	 * The default value of the '{@link #getSemesterType() <em>Semester Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesterType()
	 * @generated
	 * @ordered
	 */
	protected static final SemesterType SEMESTER_TYPE_EDEFAULT = SemesterType.FALL;

	/**
	 * The cached value of the '{@link #getSemesterType() <em>Semester Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesterType()
	 * @generated
	 * @ordered
	 */
	protected SemesterType semesterType = SEMESTER_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElectives() <em>Electives</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElectives()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> electives;

	/**
	 * The cached value of the '{@link #getMandatoryCourses() <em>Mandatory Courses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMandatoryCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> mandatoryCourses;

	/**
	 * The cached value of the '{@link #getM2aCourses() <em>M2a Courses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM2aCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> m2aCourses;

	/**
	 * The cached value of the '{@link #getM1aCourses() <em>M1a Courses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM1aCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> m1aCourses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemesterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProgrammePackage.Literals.SEMESTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SemesterType getSemesterType() {
		return semesterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSemesterType(SemesterType newSemesterType) {
		SemesterType oldSemesterType = semesterType;
		semesterType = newSemesterType == null ? SEMESTER_TYPE_EDEFAULT : newSemesterType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProgrammePackage.SEMESTER__SEMESTER_TYPE, oldSemesterType, semesterType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Course> getElectives() {
		if (electives == null) {
			electives = new EObjectResolvingEList<Course>(Course.class, this, ProgrammePackage.SEMESTER__ELECTIVES);
		}
		return electives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Course> getMandatoryCourses() {
		if (mandatoryCourses == null) {
			mandatoryCourses = new EObjectResolvingEList<Course>(Course.class, this, ProgrammePackage.SEMESTER__MANDATORY_COURSES);
		}
		return mandatoryCourses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Course> getM2aCourses() {
		if (m2aCourses == null) {
			m2aCourses = new EObjectResolvingEList<Course>(Course.class, this, ProgrammePackage.SEMESTER__M2A_COURSES);
		}
		return m2aCourses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Course> getM1aCourses() {
		if (m1aCourses == null) {
			m1aCourses = new EObjectResolvingEList<Course>(Course.class, this, ProgrammePackage.SEMESTER__M1A_COURSES);
		}
		return m1aCourses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProgrammePackage.SEMESTER__SEMESTER_TYPE:
				return getSemesterType();
			case ProgrammePackage.SEMESTER__ELECTIVES:
				return getElectives();
			case ProgrammePackage.SEMESTER__MANDATORY_COURSES:
				return getMandatoryCourses();
			case ProgrammePackage.SEMESTER__M2A_COURSES:
				return getM2aCourses();
			case ProgrammePackage.SEMESTER__M1A_COURSES:
				return getM1aCourses();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProgrammePackage.SEMESTER__SEMESTER_TYPE:
				setSemesterType((SemesterType)newValue);
				return;
			case ProgrammePackage.SEMESTER__ELECTIVES:
				getElectives().clear();
				getElectives().addAll((Collection<? extends Course>)newValue);
				return;
			case ProgrammePackage.SEMESTER__MANDATORY_COURSES:
				getMandatoryCourses().clear();
				getMandatoryCourses().addAll((Collection<? extends Course>)newValue);
				return;
			case ProgrammePackage.SEMESTER__M2A_COURSES:
				getM2aCourses().clear();
				getM2aCourses().addAll((Collection<? extends Course>)newValue);
				return;
			case ProgrammePackage.SEMESTER__M1A_COURSES:
				getM1aCourses().clear();
				getM1aCourses().addAll((Collection<? extends Course>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ProgrammePackage.SEMESTER__SEMESTER_TYPE:
				setSemesterType(SEMESTER_TYPE_EDEFAULT);
				return;
			case ProgrammePackage.SEMESTER__ELECTIVES:
				getElectives().clear();
				return;
			case ProgrammePackage.SEMESTER__MANDATORY_COURSES:
				getMandatoryCourses().clear();
				return;
			case ProgrammePackage.SEMESTER__M2A_COURSES:
				getM2aCourses().clear();
				return;
			case ProgrammePackage.SEMESTER__M1A_COURSES:
				getM1aCourses().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ProgrammePackage.SEMESTER__SEMESTER_TYPE:
				return semesterType != SEMESTER_TYPE_EDEFAULT;
			case ProgrammePackage.SEMESTER__ELECTIVES:
				return electives != null && !electives.isEmpty();
			case ProgrammePackage.SEMESTER__MANDATORY_COURSES:
				return mandatoryCourses != null && !mandatoryCourses.isEmpty();
			case ProgrammePackage.SEMESTER__M2A_COURSES:
				return m2aCourses != null && !m2aCourses.isEmpty();
			case ProgrammePackage.SEMESTER__M1A_COURSES:
				return m1aCourses != null && !m1aCourses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (semesterType: ");
		result.append(semesterType);
		result.append(')');
		return result.toString();
	}

} //SemesterImpl
