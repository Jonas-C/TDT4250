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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import programme.ProgrammePackage;
import programme.Specialization;
import programme.StudyYear;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specialization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link programme.impl.SpecializationImpl#getName <em>Name</em>}</li>
 *   <li>{@link programme.impl.SpecializationImpl#getAvailableSpecializations <em>Available Specializations</em>}</li>
 *   <li>{@link programme.impl.SpecializationImpl#getStudyYears <em>Study Years</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecializationImpl extends MinimalEObjectImpl.Container implements Specialization {
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
	 * The cached value of the '{@link #getAvailableSpecializations() <em>Available Specializations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableSpecializations()
	 * @generated
	 * @ordered
	 */
	protected EList<Specialization> availableSpecializations;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecializationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProgrammePackage.Literals.SPECIALIZATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProgrammePackage.SPECIALIZATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Specialization> getAvailableSpecializations() {
		if (availableSpecializations == null) {
			availableSpecializations = new EObjectResolvingEList<Specialization>(Specialization.class, this, ProgrammePackage.SPECIALIZATION__AVAILABLE_SPECIALIZATIONS);
		}
		return availableSpecializations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StudyYear> getStudyYears() {
		if (studyYears == null) {
			studyYears = new EObjectContainmentEList<StudyYear>(StudyYear.class, this, ProgrammePackage.SPECIALIZATION__STUDY_YEARS);
		}
		return studyYears;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProgrammePackage.SPECIALIZATION__STUDY_YEARS:
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
			case ProgrammePackage.SPECIALIZATION__NAME:
				return getName();
			case ProgrammePackage.SPECIALIZATION__AVAILABLE_SPECIALIZATIONS:
				return getAvailableSpecializations();
			case ProgrammePackage.SPECIALIZATION__STUDY_YEARS:
				return getStudyYears();
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
			case ProgrammePackage.SPECIALIZATION__NAME:
				setName((String)newValue);
				return;
			case ProgrammePackage.SPECIALIZATION__AVAILABLE_SPECIALIZATIONS:
				getAvailableSpecializations().clear();
				getAvailableSpecializations().addAll((Collection<? extends Specialization>)newValue);
				return;
			case ProgrammePackage.SPECIALIZATION__STUDY_YEARS:
				getStudyYears().clear();
				getStudyYears().addAll((Collection<? extends StudyYear>)newValue);
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
			case ProgrammePackage.SPECIALIZATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ProgrammePackage.SPECIALIZATION__AVAILABLE_SPECIALIZATIONS:
				getAvailableSpecializations().clear();
				return;
			case ProgrammePackage.SPECIALIZATION__STUDY_YEARS:
				getStudyYears().clear();
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
			case ProgrammePackage.SPECIALIZATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ProgrammePackage.SPECIALIZATION__AVAILABLE_SPECIALIZATIONS:
				return availableSpecializations != null && !availableSpecializations.isEmpty();
			case ProgrammePackage.SPECIALIZATION__STUDY_YEARS:
				return studyYears != null && !studyYears.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //SpecializationImpl
