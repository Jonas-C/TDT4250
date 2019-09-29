/**
 */
package programme;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see programme.ProgrammeFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore validationDelegates='http://www.eclipse.org/acceleo/query/1.0'"
 * @generated
 */
public interface ProgrammePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "programme";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.eclipse.NTNU.studymodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.NTNU.studymodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProgrammePackage eINSTANCE = programme.impl.ProgrammePackageImpl.init();

	/**
	 * The meta object id for the '{@link programme.impl.DepartmentImpl <em>Department</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see programme.impl.DepartmentImpl
	 * @see programme.impl.ProgrammePackageImpl#getDepartment()
	 * @generated
	 */
	int DEPARTMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Programmes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__PROGRAMMES = 1;

	/**
	 * The feature id for the '<em><b>Courses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__COURSES = 2;

	/**
	 * The number of structural features of the '<em>Department</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Department</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link programme.impl.ProgrammeImpl <em>Programme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see programme.impl.ProgrammeImpl
	 * @see programme.impl.ProgrammePackageImpl#getProgramme()
	 * @generated
	 */
	int PROGRAMME = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__NAME = 0;

	/**
	 * The feature id for the '<em><b>Available Specializations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__AVAILABLE_SPECIALIZATIONS = 1;

	/**
	 * The feature id for the '<em><b>Programme Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__PROGRAMME_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Study Years</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__STUDY_YEARS = 3;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__CODE = 4;

	/**
	 * The number of structural features of the '<em>Programme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Programme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link programme.impl.SpecializationImpl <em>Specialization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see programme.impl.SpecializationImpl
	 * @see programme.impl.ProgrammePackageImpl#getSpecialization()
	 * @generated
	 */
	int SPECIALIZATION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Available Specializations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION__AVAILABLE_SPECIALIZATIONS = 1;

	/**
	 * The feature id for the '<em><b>Study Years</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION__STUDY_YEARS = 2;

	/**
	 * The number of structural features of the '<em>Specialization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Specialization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link programme.impl.CourseImpl <em>Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see programme.impl.CourseImpl
	 * @see programme.impl.ProgrammePackageImpl#getCourse()
	 * @generated
	 */
	int COURSE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Taugt In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__TAUGT_IN = 2;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__LEVEL = 3;

	/**
	 * The feature id for the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CREDITS = 4;

	/**
	 * The number of structural features of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link programme.impl.StudyYearImpl <em>Study Year</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see programme.impl.StudyYearImpl
	 * @see programme.impl.ProgrammePackageImpl#getStudyYear()
	 * @generated
	 */
	int STUDY_YEAR = 4;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_YEAR__YEAR = 0;

	/**
	 * The feature id for the '<em><b>Semesters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_YEAR__SEMESTERS = 1;

	/**
	 * The number of structural features of the '<em>Study Year</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_YEAR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Study Year</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_YEAR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link programme.impl.SemesterImpl <em>Semester</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see programme.impl.SemesterImpl
	 * @see programme.impl.ProgrammePackageImpl#getSemester()
	 * @generated
	 */
	int SEMESTER = 5;

	/**
	 * The feature id for the '<em><b>Semester Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__SEMESTER_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Electives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__ELECTIVES = 1;

	/**
	 * The feature id for the '<em><b>Mandatory Courses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__MANDATORY_COURSES = 2;

	/**
	 * The feature id for the '<em><b>M2a Courses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__M2A_COURSES = 3;

	/**
	 * The feature id for the '<em><b>M1a Courses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__M1A_COURSES = 4;

	/**
	 * The number of structural features of the '<em>Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link programme.SemesterType <em>Semester Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see programme.SemesterType
	 * @see programme.impl.ProgrammePackageImpl#getSemesterType()
	 * @generated
	 */
	int SEMESTER_TYPE = 6;

	/**
	 * The meta object id for the '{@link programme.ProgrammeType <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see programme.ProgrammeType
	 * @see programme.impl.ProgrammePackageImpl#getProgrammeType()
	 * @generated
	 */
	int PROGRAMME_TYPE = 7;

	/**
	 * The meta object id for the '{@link programme.CourseLevel <em>Course Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see programme.CourseLevel
	 * @see programme.impl.ProgrammePackageImpl#getCourseLevel()
	 * @generated
	 */
	int COURSE_LEVEL = 8;


	/**
	 * Returns the meta object for class '{@link programme.Department <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Department</em>'.
	 * @see programme.Department
	 * @generated
	 */
	EClass getDepartment();

	/**
	 * Returns the meta object for the attribute '{@link programme.Department#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see programme.Department#getName()
	 * @see #getDepartment()
	 * @generated
	 */
	EAttribute getDepartment_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link programme.Department#getProgrammes <em>Programmes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Programmes</em>'.
	 * @see programme.Department#getProgrammes()
	 * @see #getDepartment()
	 * @generated
	 */
	EReference getDepartment_Programmes();

	/**
	 * Returns the meta object for the containment reference list '{@link programme.Department#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Courses</em>'.
	 * @see programme.Department#getCourses()
	 * @see #getDepartment()
	 * @generated
	 */
	EReference getDepartment_Courses();

	/**
	 * Returns the meta object for class '{@link programme.Programme <em>Programme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Programme</em>'.
	 * @see programme.Programme
	 * @generated
	 */
	EClass getProgramme();

	/**
	 * Returns the meta object for the attribute '{@link programme.Programme#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see programme.Programme#getName()
	 * @see #getProgramme()
	 * @generated
	 */
	EAttribute getProgramme_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link programme.Programme#getAvailableSpecializations <em>Available Specializations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Available Specializations</em>'.
	 * @see programme.Programme#getAvailableSpecializations()
	 * @see #getProgramme()
	 * @generated
	 */
	EReference getProgramme_AvailableSpecializations();

	/**
	 * Returns the meta object for the attribute '{@link programme.Programme#getProgrammeType <em>Programme Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Programme Type</em>'.
	 * @see programme.Programme#getProgrammeType()
	 * @see #getProgramme()
	 * @generated
	 */
	EAttribute getProgramme_ProgrammeType();

	/**
	 * Returns the meta object for the containment reference list '{@link programme.Programme#getStudyYears <em>Study Years</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Study Years</em>'.
	 * @see programme.Programme#getStudyYears()
	 * @see #getProgramme()
	 * @generated
	 */
	EReference getProgramme_StudyYears();

	/**
	 * Returns the meta object for the attribute '{@link programme.Programme#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see programme.Programme#getCode()
	 * @see #getProgramme()
	 * @generated
	 */
	EAttribute getProgramme_Code();

	/**
	 * Returns the meta object for class '{@link programme.Specialization <em>Specialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specialization</em>'.
	 * @see programme.Specialization
	 * @generated
	 */
	EClass getSpecialization();

	/**
	 * Returns the meta object for the attribute '{@link programme.Specialization#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see programme.Specialization#getName()
	 * @see #getSpecialization()
	 * @generated
	 */
	EAttribute getSpecialization_Name();

	/**
	 * Returns the meta object for the reference list '{@link programme.Specialization#getAvailableSpecializations <em>Available Specializations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Available Specializations</em>'.
	 * @see programme.Specialization#getAvailableSpecializations()
	 * @see #getSpecialization()
	 * @generated
	 */
	EReference getSpecialization_AvailableSpecializations();

	/**
	 * Returns the meta object for the containment reference list '{@link programme.Specialization#getStudyYears <em>Study Years</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Study Years</em>'.
	 * @see programme.Specialization#getStudyYears()
	 * @see #getSpecialization()
	 * @generated
	 */
	EReference getSpecialization_StudyYears();

	/**
	 * Returns the meta object for class '{@link programme.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course</em>'.
	 * @see programme.Course
	 * @generated
	 */
	EClass getCourse();

	/**
	 * Returns the meta object for the attribute '{@link programme.Course#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see programme.Course#getName()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Name();

	/**
	 * Returns the meta object for the attribute '{@link programme.Course#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see programme.Course#getCode()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Code();

	/**
	 * Returns the meta object for the attribute '{@link programme.Course#getTaugtIn <em>Taugt In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Taugt In</em>'.
	 * @see programme.Course#getTaugtIn()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_TaugtIn();

	/**
	 * Returns the meta object for the attribute '{@link programme.Course#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see programme.Course#getLevel()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Level();

	/**
	 * Returns the meta object for the attribute '{@link programme.Course#getCredits <em>Credits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credits</em>'.
	 * @see programme.Course#getCredits()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Credits();

	/**
	 * Returns the meta object for class '{@link programme.StudyYear <em>Study Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Study Year</em>'.
	 * @see programme.StudyYear
	 * @generated
	 */
	EClass getStudyYear();

	/**
	 * Returns the meta object for the attribute '{@link programme.StudyYear#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see programme.StudyYear#getYear()
	 * @see #getStudyYear()
	 * @generated
	 */
	EAttribute getStudyYear_Year();

	/**
	 * Returns the meta object for the containment reference list '{@link programme.StudyYear#getSemesters <em>Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Semesters</em>'.
	 * @see programme.StudyYear#getSemesters()
	 * @see #getStudyYear()
	 * @generated
	 */
	EReference getStudyYear_Semesters();

	/**
	 * Returns the meta object for class '{@link programme.Semester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semester</em>'.
	 * @see programme.Semester
	 * @generated
	 */
	EClass getSemester();

	/**
	 * Returns the meta object for the attribute '{@link programme.Semester#getSemesterType <em>Semester Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semester Type</em>'.
	 * @see programme.Semester#getSemesterType()
	 * @see #getSemester()
	 * @generated
	 */
	EAttribute getSemester_SemesterType();

	/**
	 * Returns the meta object for the reference list '{@link programme.Semester#getElectives <em>Electives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Electives</em>'.
	 * @see programme.Semester#getElectives()
	 * @see #getSemester()
	 * @generated
	 */
	EReference getSemester_Electives();

	/**
	 * Returns the meta object for the reference list '{@link programme.Semester#getMandatoryCourses <em>Mandatory Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mandatory Courses</em>'.
	 * @see programme.Semester#getMandatoryCourses()
	 * @see #getSemester()
	 * @generated
	 */
	EReference getSemester_MandatoryCourses();

	/**
	 * Returns the meta object for the reference list '{@link programme.Semester#getM2aCourses <em>M2a Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>M2a Courses</em>'.
	 * @see programme.Semester#getM2aCourses()
	 * @see #getSemester()
	 * @generated
	 */
	EReference getSemester_M2aCourses();

	/**
	 * Returns the meta object for the reference list '{@link programme.Semester#getM1aCourses <em>M1a Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>M1a Courses</em>'.
	 * @see programme.Semester#getM1aCourses()
	 * @see #getSemester()
	 * @generated
	 */
	EReference getSemester_M1aCourses();

	/**
	 * Returns the meta object for enum '{@link programme.SemesterType <em>Semester Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Semester Type</em>'.
	 * @see programme.SemesterType
	 * @generated
	 */
	EEnum getSemesterType();

	/**
	 * Returns the meta object for enum '{@link programme.ProgrammeType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see programme.ProgrammeType
	 * @generated
	 */
	EEnum getProgrammeType();

	/**
	 * Returns the meta object for enum '{@link programme.CourseLevel <em>Course Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Course Level</em>'.
	 * @see programme.CourseLevel
	 * @generated
	 */
	EEnum getCourseLevel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProgrammeFactory getProgrammeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link programme.impl.DepartmentImpl <em>Department</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see programme.impl.DepartmentImpl
		 * @see programme.impl.ProgrammePackageImpl#getDepartment()
		 * @generated
		 */
		EClass DEPARTMENT = eINSTANCE.getDepartment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPARTMENT__NAME = eINSTANCE.getDepartment_Name();

		/**
		 * The meta object literal for the '<em><b>Programmes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTMENT__PROGRAMMES = eINSTANCE.getDepartment_Programmes();

		/**
		 * The meta object literal for the '<em><b>Courses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTMENT__COURSES = eINSTANCE.getDepartment_Courses();

		/**
		 * The meta object literal for the '{@link programme.impl.ProgrammeImpl <em>Programme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see programme.impl.ProgrammeImpl
		 * @see programme.impl.ProgrammePackageImpl#getProgramme()
		 * @generated
		 */
		EClass PROGRAMME = eINSTANCE.getProgramme();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMME__NAME = eINSTANCE.getProgramme_Name();

		/**
		 * The meta object literal for the '<em><b>Available Specializations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMME__AVAILABLE_SPECIALIZATIONS = eINSTANCE.getProgramme_AvailableSpecializations();

		/**
		 * The meta object literal for the '<em><b>Programme Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMME__PROGRAMME_TYPE = eINSTANCE.getProgramme_ProgrammeType();

		/**
		 * The meta object literal for the '<em><b>Study Years</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMME__STUDY_YEARS = eINSTANCE.getProgramme_StudyYears();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMME__CODE = eINSTANCE.getProgramme_Code();

		/**
		 * The meta object literal for the '{@link programme.impl.SpecializationImpl <em>Specialization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see programme.impl.SpecializationImpl
		 * @see programme.impl.ProgrammePackageImpl#getSpecialization()
		 * @generated
		 */
		EClass SPECIALIZATION = eINSTANCE.getSpecialization();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIALIZATION__NAME = eINSTANCE.getSpecialization_Name();

		/**
		 * The meta object literal for the '<em><b>Available Specializations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALIZATION__AVAILABLE_SPECIALIZATIONS = eINSTANCE.getSpecialization_AvailableSpecializations();

		/**
		 * The meta object literal for the '<em><b>Study Years</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALIZATION__STUDY_YEARS = eINSTANCE.getSpecialization_StudyYears();

		/**
		 * The meta object literal for the '{@link programme.impl.CourseImpl <em>Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see programme.impl.CourseImpl
		 * @see programme.impl.ProgrammePackageImpl#getCourse()
		 * @generated
		 */
		EClass COURSE = eINSTANCE.getCourse();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__NAME = eINSTANCE.getCourse_Name();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CODE = eINSTANCE.getCourse_Code();

		/**
		 * The meta object literal for the '<em><b>Taugt In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__TAUGT_IN = eINSTANCE.getCourse_TaugtIn();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__LEVEL = eINSTANCE.getCourse_Level();

		/**
		 * The meta object literal for the '<em><b>Credits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CREDITS = eINSTANCE.getCourse_Credits();

		/**
		 * The meta object literal for the '{@link programme.impl.StudyYearImpl <em>Study Year</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see programme.impl.StudyYearImpl
		 * @see programme.impl.ProgrammePackageImpl#getStudyYear()
		 * @generated
		 */
		EClass STUDY_YEAR = eINSTANCE.getStudyYear();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDY_YEAR__YEAR = eINSTANCE.getStudyYear_Year();

		/**
		 * The meta object literal for the '<em><b>Semesters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDY_YEAR__SEMESTERS = eINSTANCE.getStudyYear_Semesters();

		/**
		 * The meta object literal for the '{@link programme.impl.SemesterImpl <em>Semester</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see programme.impl.SemesterImpl
		 * @see programme.impl.ProgrammePackageImpl#getSemester()
		 * @generated
		 */
		EClass SEMESTER = eINSTANCE.getSemester();

		/**
		 * The meta object literal for the '<em><b>Semester Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTER__SEMESTER_TYPE = eINSTANCE.getSemester_SemesterType();

		/**
		 * The meta object literal for the '<em><b>Electives</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER__ELECTIVES = eINSTANCE.getSemester_Electives();

		/**
		 * The meta object literal for the '<em><b>Mandatory Courses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER__MANDATORY_COURSES = eINSTANCE.getSemester_MandatoryCourses();

		/**
		 * The meta object literal for the '<em><b>M2a Courses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER__M2A_COURSES = eINSTANCE.getSemester_M2aCourses();

		/**
		 * The meta object literal for the '<em><b>M1a Courses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER__M1A_COURSES = eINSTANCE.getSemester_M1aCourses();

		/**
		 * The meta object literal for the '{@link programme.SemesterType <em>Semester Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see programme.SemesterType
		 * @see programme.impl.ProgrammePackageImpl#getSemesterType()
		 * @generated
		 */
		EEnum SEMESTER_TYPE = eINSTANCE.getSemesterType();

		/**
		 * The meta object literal for the '{@link programme.ProgrammeType <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see programme.ProgrammeType
		 * @see programme.impl.ProgrammePackageImpl#getProgrammeType()
		 * @generated
		 */
		EEnum PROGRAMME_TYPE = eINSTANCE.getProgrammeType();

		/**
		 * The meta object literal for the '{@link programme.CourseLevel <em>Course Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see programme.CourseLevel
		 * @see programme.impl.ProgrammePackageImpl#getCourseLevel()
		 * @generated
		 */
		EEnum COURSE_LEVEL = eINSTANCE.getCourseLevel();

	}

} //ProgrammePackage
