/**
 */
package programme.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import programme.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see programme.ProgrammePackage
 * @generated
 */
public class ProgrammeValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ProgrammeValidator INSTANCE = new ProgrammeValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "programme";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgrammeValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return ProgrammePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case ProgrammePackage.DEPARTMENT:
				return validateDepartment((Department)value, diagnostics, context);
			case ProgrammePackage.PROGRAMME:
				return validateProgramme((Programme)value, diagnostics, context);
			case ProgrammePackage.SPECIALIZATION:
				return validateSpecialization((Specialization)value, diagnostics, context);
			case ProgrammePackage.COURSE:
				return validateCourse((Course)value, diagnostics, context);
			case ProgrammePackage.STUDY_YEAR:
				return validateStudyYear((StudyYear)value, diagnostics, context);
			case ProgrammePackage.SEMESTER:
				return validateSemester((Semester)value, diagnostics, context);
			case ProgrammePackage.SEMESTER_COURSE:
				return validateSemesterCourse((SemesterCourse)value, diagnostics, context);
			case ProgrammePackage.SEMESTER_TYPE:
				return validateSemesterType((SemesterType)value, diagnostics, context);
			case ProgrammePackage.PROGRAMME_TYPE:
				return validateProgrammeType((ProgrammeType)value, diagnostics, context);
			case ProgrammePackage.COURSE_LEVEL:
				return validateCourseLevel((CourseLevel)value, diagnostics, context);
			case ProgrammePackage.COURSE_TYPE:
				return validateCourseType((CourseType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDepartment(Department department, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(department, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgramme(Programme programme, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(programme, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecialization(Specialization specialization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(specialization, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourse(Course course, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(course, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(course, diagnostics, context);
		if (result || diagnostics != null) result &= validateCourse_courseCreditsShouldBeOver5(course, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the courseCreditsShouldBeOver5 constraint of '<em>Course</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COURSE__COURSE_CREDITS_SHOULD_BE_OVER5__EEXPRESSION = "self.credits -> sum() >= 5.0";

	/**
	 * Validates the courseCreditsShouldBeOver5 constraint of '<em>Course</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourse_courseCreditsShouldBeOver5(Course course, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(ProgrammePackage.Literals.COURSE,
				 course,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "courseCreditsShouldBeOver5",
				 COURSE__COURSE_CREDITS_SHOULD_BE_OVER5__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudyYear(StudyYear studyYear, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(studyYear, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(studyYear, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(studyYear, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(studyYear, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(studyYear, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(studyYear, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(studyYear, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(studyYear, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(studyYear, diagnostics, context);
		if (result || diagnostics != null) result &= validateStudyYear_mustContainFallAndSpringSemesters(studyYear, diagnostics, context);
		return result;
	}

	/**
	 * Validates the mustContainFallAndSpringSemesters constraint of '<em>Study Year</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @NOT generated
	 */
	public boolean validateStudyYear_mustContainFallAndSpringSemesters(StudyYear studyYear, DiagnosticChain diagnostics, Map<Object, Object> context) {
		EList<Semester> s = studyYear.getSemesters();
		boolean semestersOK;
		if(s.size() != 2) semestersOK = false;
		else semestersOK = s.get(0).getSemesterType() == SemesterType.FALL && s.get(1).getSemesterType() == SemesterType.SPRING ||
				s.get(0).getSemesterType() == SemesterType.SPRING && s.get(1).getSemesterType() == SemesterType.FALL;
		if (!semestersOK) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "mustContainFallAndSpringSemesters", getObjectLabel(studyYear, context) },
						 new Object[] { studyYear },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemester(Semester semester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(semester, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validateSemester_semesterTypesMustMatch(semester, diagnostics, context);
		return result;
	}

	
	/**
	 * Checks if all courses contained in a semester are taught in the semesterType in question.
	 * @param courses list of courses
	 * @param semesterType semesterType in question
	 * @param diagnostics
	 * @param context
	 * @return boolean
	 * @NOT generated
	 */
	private boolean helper_validateSemester_semesterTypesMustMatch(EList<SemesterCourse> courses, SemesterType semesterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		for(SemesterCourse c : courses) {
			if(c.getSemesterCourse().getTaugtIn() != semesterType) return false;
		}
		return true;
		
	}
	
	/**
	 * Validates the semesterTypesMustMatch constraint of '<em>Semester</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @NOT generated
	 */
	public boolean validateSemester_semesterTypesMustMatch(Semester semester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean semesterOK = helper_validateSemester_semesterTypesMustMatch(semester.getCourses(), semester.getSemesterType(), diagnostics, context);
		if (!semesterOK) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "semesterTypesMustMatch", getObjectLabel(semester, context) },
						 new Object[] { semester },
						 context));
			}
			return false;
		}
		return true;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemesterCourse(SemesterCourse semesterCourse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(semesterCourse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemesterType(SemesterType semesterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgrammeType(ProgrammeType programmeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseLevel(CourseLevel courseLevel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseType(CourseType courseType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //ProgrammeValidator
