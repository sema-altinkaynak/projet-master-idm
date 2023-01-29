/**
 */
package portail.impl;

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

import portail.PortailPackage;
import portail.Ressource;
import portail.Seance;
import portail.SeanceKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Seance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link portail.impl.SeanceImpl#getName <em>Name</em>}</li>
 *   <li>{@link portail.impl.SeanceImpl#getDate <em>Date</em>}</li>
 *   <li>{@link portail.impl.SeanceImpl#getHeureDebut <em>Heure Debut</em>}</li>
 *   <li>{@link portail.impl.SeanceImpl#getHeureFin <em>Heure Fin</em>}</li>
 *   <li>{@link portail.impl.SeanceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link portail.impl.SeanceImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link portail.impl.SeanceImpl#getRessources <em>Ressources</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SeanceImpl extends MinimalEObjectImpl.Container implements Seance {
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
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected String date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeureDebut() <em>Heure Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeureDebut()
	 * @generated
	 * @ordered
	 */
	protected static final String HEURE_DEBUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeureDebut() <em>Heure Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeureDebut()
	 * @generated
	 * @ordered
	 */
	protected String heureDebut = HEURE_DEBUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeureFin() <em>Heure Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeureFin()
	 * @generated
	 * @ordered
	 */
	protected static final String HEURE_FIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeureFin() <em>Heure Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeureFin()
	 * @generated
	 * @ordered
	 */
	protected String heureFin = HEURE_FIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final SeanceKind KIND_EDEFAULT = SeanceKind.CM;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected SeanceKind kind = KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRessources() <em>Ressources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRessources()
	 * @generated
	 * @ordered
	 */
	protected EList<Ressource> ressources;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SeanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PortailPackage.Literals.SEANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PortailPackage.SEANCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(String newDate) {
		String oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PortailPackage.SEANCE__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeureDebut() {
		return heureDebut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeureDebut(String newHeureDebut) {
		String oldHeureDebut = heureDebut;
		heureDebut = newHeureDebut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PortailPackage.SEANCE__HEURE_DEBUT, oldHeureDebut, heureDebut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeureFin() {
		return heureFin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeureFin(String newHeureFin) {
		String oldHeureFin = heureFin;
		heureFin = newHeureFin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PortailPackage.SEANCE__HEURE_FIN, oldHeureFin, heureFin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PortailPackage.SEANCE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeanceKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(SeanceKind newKind) {
		SeanceKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PortailPackage.SEANCE__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ressource> getRessources() {
		if (ressources == null) {
			ressources = new EObjectContainmentEList<Ressource>(Ressource.class, this, PortailPackage.SEANCE__RESSOURCES);
		}
		return ressources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PortailPackage.SEANCE__RESSOURCES:
				return ((InternalEList<?>)getRessources()).basicRemove(otherEnd, msgs);
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
			case PortailPackage.SEANCE__NAME:
				return getName();
			case PortailPackage.SEANCE__DATE:
				return getDate();
			case PortailPackage.SEANCE__HEURE_DEBUT:
				return getHeureDebut();
			case PortailPackage.SEANCE__HEURE_FIN:
				return getHeureFin();
			case PortailPackage.SEANCE__DESCRIPTION:
				return getDescription();
			case PortailPackage.SEANCE__KIND:
				return getKind();
			case PortailPackage.SEANCE__RESSOURCES:
				return getRessources();
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
			case PortailPackage.SEANCE__NAME:
				setName((String)newValue);
				return;
			case PortailPackage.SEANCE__DATE:
				setDate((String)newValue);
				return;
			case PortailPackage.SEANCE__HEURE_DEBUT:
				setHeureDebut((String)newValue);
				return;
			case PortailPackage.SEANCE__HEURE_FIN:
				setHeureFin((String)newValue);
				return;
			case PortailPackage.SEANCE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case PortailPackage.SEANCE__KIND:
				setKind((SeanceKind)newValue);
				return;
			case PortailPackage.SEANCE__RESSOURCES:
				getRessources().clear();
				getRessources().addAll((Collection<? extends Ressource>)newValue);
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
			case PortailPackage.SEANCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PortailPackage.SEANCE__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case PortailPackage.SEANCE__HEURE_DEBUT:
				setHeureDebut(HEURE_DEBUT_EDEFAULT);
				return;
			case PortailPackage.SEANCE__HEURE_FIN:
				setHeureFin(HEURE_FIN_EDEFAULT);
				return;
			case PortailPackage.SEANCE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case PortailPackage.SEANCE__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case PortailPackage.SEANCE__RESSOURCES:
				getRessources().clear();
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
			case PortailPackage.SEANCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PortailPackage.SEANCE__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case PortailPackage.SEANCE__HEURE_DEBUT:
				return HEURE_DEBUT_EDEFAULT == null ? heureDebut != null : !HEURE_DEBUT_EDEFAULT.equals(heureDebut);
			case PortailPackage.SEANCE__HEURE_FIN:
				return HEURE_FIN_EDEFAULT == null ? heureFin != null : !HEURE_FIN_EDEFAULT.equals(heureFin);
			case PortailPackage.SEANCE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case PortailPackage.SEANCE__KIND:
				return kind != KIND_EDEFAULT;
			case PortailPackage.SEANCE__RESSOURCES:
				return ressources != null && !ressources.isEmpty();
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
		result.append(", date: ");
		result.append(date);
		result.append(", heureDebut: ");
		result.append(heureDebut);
		result.append(", heureFin: ");
		result.append(heureFin);
		result.append(", description: ");
		result.append(description);
		result.append(", kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //SeanceImpl
