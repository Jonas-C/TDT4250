/**
 */
package programme.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import programme.Course;
import programme.CourseType;
import programme.ProgrammePackage;
import programme.SemesterCourse;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semester Course</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link programme.impl.SemesterCourseImpl#getSemesterCourse <em>Semester Course</em>}</li>
 *   <li>{@link programme.impl.SemesterCourseImpl#getCourseType <em>Course Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemesterCourseImpl extends MinimalEObjectImpl.Container implements SemesterCourse {
	/**
	 * The cached value of the '{@link #getSemesterCourse() <em>Semester Course</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesterCourse()
	 * @generated
	 * @ordered
	 */
	protected Course semesterCourse;

	/**
	 * The default value of the '{@link #getCourseType() <em>Course Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseType()
	 * @generated
	 * @ordered
	 */
	protected static final CourseType COURSE_TYPE_EDEFAULT = CourseType.OBLIGATORY;

	/**
	 * The cached value of the '{@link #getCourseType() <em>Course Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseType()
	 * @generated
	 * @ordered
	 */
	protected CourseType courseType = COURSE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemesterCourseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProgrammePackage.Literals.SEMESTER_COURSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Course getSemesterCourse() {
		if (semesterCourse != null && semesterCourse.eIsProxy()) {
			InternalEObject oldSemesterCourse = (InternalEObject)semesterCourse;
			semesterCourse = (Course)eResolveProxy(oldSemesterCourse);
			if (semesterCourse != oldSemesterCourse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProgrammePackage.SEMESTER_COURSE__SEMESTER_COURSE, oldSemesterCourse, semesterCourse));
			}
		}
		return semesterCourse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Course basicGetSemesterCourse() {
		return semesterCourse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSemesterCourse(Course newSemesterCourse) {
		Course oldSemesterCourse = semesterCourse;
		semesterCourse = newSemesterCourse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProgrammePackage.SEMESTER_COURSE__SEMESTER_COURSE, oldSemesterCourse, semesterCourse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CourseType getCourseType() {
		return courseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCourseType(CourseType newCourseType) {
		CourseType oldCourseType = courseType;
		courseType = newCourseType == null ? COURSE_TYPE_EDEFAULT : newCourseType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProgrammePackage.SEMESTER_COURSE__COURSE_TYPE, oldCourseType, courseType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProgrammePackage.SEMESTER_COURSE__SEMESTER_COURSE:
				if (resolve) return getSemesterCourse();
				return basicGetSemesterCourse();
			case ProgrammePackage.SEMESTER_COURSE__COURSE_TYPE:
				return getCourseType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProgrammePackage.SEMESTER_COURSE__SEMESTER_COURSE:
				setSemesterCourse((Course)newValue);
				return;
			case ProgrammePackage.SEMESTER_COURSE__COURSE_TYPE:
				setCourseType((CourseType)newValue);
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
			case ProgrammePackage.SEMESTER_COURSE__SEMESTER_COURSE:
				setSemesterCourse((Course)null);
				return;
			case ProgrammePackage.SEMESTER_COURSE__COURSE_TYPE:
				setCourseType(COURSE_TYPE_EDEFAULT);
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
			case ProgrammePackage.SEMESTER_COURSE__SEMESTER_COURSE:
				return semesterCourse != null;
			case ProgrammePackage.SEMESTER_COURSE__COURSE_TYPE:
				return courseType != COURSE_TYPE_EDEFAULT;
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
		result.append(" (courseType: ");
		result.append(courseType);
		result.append(')');
		return result.toString();
	}

} //SemesterCourseImpl
