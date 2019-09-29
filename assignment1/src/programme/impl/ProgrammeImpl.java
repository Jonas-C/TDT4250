/**
 */
package programme.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import programme.Programme;
import programme.ProgrammePackage;
import programme.ProgrammeType;
import programme.Specialization;
import programme.StudyYear;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Programme</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link programme.impl.ProgrammeImpl#getName <em>Name</em>}</li>
 *   <li>{@link programme.impl.ProgrammeImpl#getAvailableSpecializations <em>Available Specializations</em>}</li>
 *   <li>{@link programme.impl.ProgrammeImpl#getProgrammeType <em>Programme Type</em>}</li>
 *   <li>{@link programme.impl.ProgrammeImpl#getStudyYears <em>Study Years</em>}</li>
 *   <li>{@link programme.impl.ProgrammeImpl#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgrammeImpl extends MinimalEObjectImpl.Container implements Programme {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAvailableSpecializations() <em>Available Specializations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableSpecializations()
	 * @generated
	 * @ordered
	 */
	protected EList<Specialization> availableSpecializations;

	/**
	 * The default value of the '{@link #getProgrammeType() <em>Programme Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgrammeType()
	 * @generated
	 * @ordered
	 */
	protected static final ProgrammeType PROGRAMME_TYPE_EDEFAULT = ProgrammeType.BACHELOR;

	/**
	 * The cached value of the '{@link #getProgrammeType() <em>Programme Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgrammeType()
	 * @generated
	 * @ordered
	 */
	protected ProgrammeType programmeType = PROGRAMME_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStudyYears() <em>Study Years</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyYears()
	 * @generated
	 * @ordered
	 */
	protected EList<StudyYear> studyYears;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgrammeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProgrammePackage.Literals.PROGRAMME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProgrammePackage.PROGRAMME__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Specialization> getAvailableSpecializations() {
		if (availableSpecializations == null) {
			availableSpecializations = new EObjectContainmentEList<Specialization>(Specialization.class, this, ProgrammePackage.PROGRAMME__AVAILABLE_SPECIALIZATIONS);
		}
		return availableSpecializations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProgrammeType getProgrammeType() {
		return programmeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProgrammeType(ProgrammeType newProgrammeType) {
		ProgrammeType oldProgrammeType = programmeType;
		programmeType = newProgrammeType == null ? PROGRAMME_TYPE_EDEFAULT : newProgrammeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProgrammePackage.PROGRAMME__PROGRAMME_TYPE, oldProgrammeType, programmeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StudyYear> getStudyYears() {
		if (studyYears == null) {
			studyYears = new EObjectContainmentEList<StudyYear>(StudyYear.class, this, ProgrammePackage.PROGRAMME__STUDY_YEARS);
		}
		return studyYears;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProgrammePackage.PROGRAMME__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProgrammePackage.PROGRAMME__AVAILABLE_SPECIALIZATIONS:
				return ((InternalEList<?>)getAvailableSpecializations()).basicRemove(otherEnd, msgs);
			case ProgrammePackage.PROGRAMME__STUDY_YEARS:
				return ((InternalEList<?>)getStudyYears()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProgrammePackage.PROGRAMME__NAME:
				return getName();
			case ProgrammePackage.PROGRAMME__AVAILABLE_SPECIALIZATIONS:
				return getAvailableSpecializations();
			case ProgrammePackage.PROGRAMME__PROGRAMME_TYPE:
				return getProgrammeType();
			case ProgrammePackage.PROGRAMME__STUDY_YEARS:
				return getStudyYears();
			case ProgrammePackage.PROGRAMME__CODE:
				return getCode();
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
			case ProgrammePackage.PROGRAMME__NAME:
				setName((String)newValue);
				return;
			case ProgrammePackage.PROGRAMME__AVAILABLE_SPECIALIZATIONS:
				getAvailableSpecializations().clear();
				getAvailableSpecializations().addAll((Collection<? extends Specialization>)newValue);
				return;
			case ProgrammePackage.PROGRAMME__PROGRAMME_TYPE:
				setProgrammeType((ProgrammeType)newValue);
				return;
			case ProgrammePackage.PROGRAMME__STUDY_YEARS:
				getStudyYears().clear();
				getStudyYears().addAll((Collection<? extends StudyYear>)newValue);
				return;
			case ProgrammePackage.PROGRAMME__CODE:
				setCode((String)newValue);
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
			case ProgrammePackage.PROGRAMME__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ProgrammePackage.PROGRAMME__AVAILABLE_SPECIALIZATIONS:
				getAvailableSpecializations().clear();
				return;
			case ProgrammePackage.PROGRAMME__PROGRAMME_TYPE:
				setProgrammeType(PROGRAMME_TYPE_EDEFAULT);
				return;
			case ProgrammePackage.PROGRAMME__STUDY_YEARS:
				getStudyYears().clear();
				return;
			case ProgrammePackage.PROGRAMME__CODE:
				setCode(CODE_EDEFAULT);
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
			case ProgrammePackage.PROGRAMME__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ProgrammePackage.PROGRAMME__AVAILABLE_SPECIALIZATIONS:
				return availableSpecializations != null && !availableSpecializations.isEmpty();
			case ProgrammePackage.PROGRAMME__PROGRAMME_TYPE:
				return programmeType != PROGRAMME_TYPE_EDEFAULT;
			case ProgrammePackage.PROGRAMME__STUDY_YEARS:
				return studyYears != null && !studyYears.isEmpty();
			case ProgrammePackage.PROGRAMME__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", programmeType: ");
		result.append(programmeType);
		result.append(", code: ");
		result.append(code);
		result.append(')');
		return result.toString();
	}

} //ProgrammeImpl
