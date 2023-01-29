/**
 */
package portail.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import portail.PortailPackage;
import portail.Semestre;
import portail.UE;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semestre</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link portail.impl.SemestreImpl#getName <em>Name</em>}</li>
 *   <li>{@link portail.impl.SemestreImpl#getDateDebut <em>Date Debut</em>}</li>
 *   <li>{@link portail.impl.SemestreImpl#getDateFin <em>Date Fin</em>}</li>
 *   <li>{@link portail.impl.SemestreImpl#getUeFacultatives <em>Ue Facultatives</em>}</li>
 *   <li>{@link portail.impl.SemestreImpl#getUeObligatoires <em>Ue Obligatoires</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemestreImpl extends MinimalEObjectImpl.Container implements Semestre {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final int NAME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected int name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateDebut() <em>Date Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDebut()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_DEBUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateDebut() <em>Date Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDebut()
	 * @generated
	 * @ordered
	 */
	protected String dateDebut = DATE_DEBUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateFin() <em>Date Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFin()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_FIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateFin() <em>Date Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFin()
	 * @generated
	 * @ordered
	 */
	protected String dateFin = DATE_FIN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUeFacultatives() <em>Ue Facultatives</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUeFacultatives()
	 * @generated
	 * @ordered
	 */
	protected EList<UE> ueFacultatives;

	/**
	 * The cached value of the '{@link #getUeObligatoires() <em>Ue Obligatoires</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUeObligatoires()
	 * @generated
	 * @ordered
	 */
	protected EList<UE> ueObligatoires;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemestreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PortailPackage.Literals.SEMESTRE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(int newName) {
		int oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PortailPackage.SEMESTRE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDateDebut() {
		return dateDebut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateDebut(String newDateDebut) {
		String oldDateDebut = dateDebut;
		dateDebut = newDateDebut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PortailPackage.SEMESTRE__DATE_DEBUT, oldDateDebut, dateDebut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDateFin() {
		return dateFin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateFin(String newDateFin) {
		String oldDateFin = dateFin;
		dateFin = newDateFin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PortailPackage.SEMESTRE__DATE_FIN, oldDateFin, dateFin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UE> getUeFacultatives() {
		if (ueFacultatives == null) {
			ueFacultatives = new EObjectResolvingEList<UE>(UE.class, this, PortailPackage.SEMESTRE__UE_FACULTATIVES);
		}
		return ueFacultatives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UE> getUeObligatoires() {
		if (ueObligatoires == null) {
			ueObligatoires = new EObjectResolvingEList<UE>(UE.class, this, PortailPackage.SEMESTRE__UE_OBLIGATOIRES);
		}
		return ueObligatoires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PortailPackage.SEMESTRE__NAME:
				return getName();
			case PortailPackage.SEMESTRE__DATE_DEBUT:
				return getDateDebut();
			case PortailPackage.SEMESTRE__DATE_FIN:
				return getDateFin();
			case PortailPackage.SEMESTRE__UE_FACULTATIVES:
				return getUeFacultatives();
			case PortailPackage.SEMESTRE__UE_OBLIGATOIRES:
				return getUeObligatoires();
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
			case PortailPackage.SEMESTRE__NAME:
				setName((Integer)newValue);
				return;
			case PortailPackage.SEMESTRE__DATE_DEBUT:
				setDateDebut((String)newValue);
				return;
			case PortailPackage.SEMESTRE__DATE_FIN:
				setDateFin((String)newValue);
				return;
			case PortailPackage.SEMESTRE__UE_FACULTATIVES:
				getUeFacultatives().clear();
				getUeFacultatives().addAll((Collection<? extends UE>)newValue);
				return;
			case PortailPackage.SEMESTRE__UE_OBLIGATOIRES:
				getUeObligatoires().clear();
				getUeObligatoires().addAll((Collection<? extends UE>)newValue);
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
			case PortailPackage.SEMESTRE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PortailPackage.SEMESTRE__DATE_DEBUT:
				setDateDebut(DATE_DEBUT_EDEFAULT);
				return;
			case PortailPackage.SEMESTRE__DATE_FIN:
				setDateFin(DATE_FIN_EDEFAULT);
				return;
			case PortailPackage.SEMESTRE__UE_FACULTATIVES:
				getUeFacultatives().clear();
				return;
			case PortailPackage.SEMESTRE__UE_OBLIGATOIRES:
				getUeObligatoires().clear();
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
			case PortailPackage.SEMESTRE__NAME:
				return name != NAME_EDEFAULT;
			case PortailPackage.SEMESTRE__DATE_DEBUT:
				return DATE_DEBUT_EDEFAULT == null ? dateDebut != null : !DATE_DEBUT_EDEFAULT.equals(dateDebut);
			case PortailPackage.SEMESTRE__DATE_FIN:
				return DATE_FIN_EDEFAULT == null ? dateFin != null : !DATE_FIN_EDEFAULT.equals(dateFin);
			case PortailPackage.SEMESTRE__UE_FACULTATIVES:
				return ueFacultatives != null && !ueFacultatives.isEmpty();
			case PortailPackage.SEMESTRE__UE_OBLIGATOIRES:
				return ueObligatoires != null && !ueObligatoires.isEmpty();
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
		result.append(", dateDebut: ");
		result.append(dateDebut);
		result.append(", dateFin: ");
		result.append(dateFin);
		result.append(')');
		return result.toString();
	}

} //SemestreImpl
