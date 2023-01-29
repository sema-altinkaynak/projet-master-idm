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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import portail.Formation;
import portail.Intervenant;
import portail.Parcours;
import portail.PortailPackage;
import portail.Secretaire;
import portail.UE;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Formation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link portail.impl.FormationImpl#getName <em>Name</em>}</li>
 *   <li>{@link portail.impl.FormationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link portail.impl.FormationImpl#getCredit <em>Credit</em>}</li>
 *   <li>{@link portail.impl.FormationImpl#getParcours <em>Parcours</em>}</li>
 *   <li>{@link portail.impl.FormationImpl#getSecretaires <em>Secretaires</em>}</li>
 *   <li>{@link portail.impl.FormationImpl#getResponsablesFormation <em>Responsables Formation</em>}</li>
 *   <li>{@link portail.impl.FormationImpl#getUes <em>Ues</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormationImpl extends MinimalEObjectImpl.Container implements Formation {
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
	 * The default value of the '{@link #getCredit() <em>Credit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredit()
	 * @generated
	 * @ordered
	 */
	protected static final int CREDIT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCredit() <em>Credit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredit()
	 * @generated
	 * @ordered
	 */
	protected int credit = CREDIT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParcours() <em>Parcours</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParcours()
	 * @generated
	 * @ordered
	 */
	protected EList<Parcours> parcours;

	/**
	 * The cached value of the '{@link #getSecretaires() <em>Secretaires</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecretaires()
	 * @generated
	 * @ordered
	 */
	protected EList<Secretaire> secretaires;

	/**
	 * The cached value of the '{@link #getResponsablesFormation() <em>Responsables Formation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsablesFormation()
	 * @generated
	 * @ordered
	 */
	protected EList<Intervenant> responsablesFormation;

	/**
	 * The cached value of the '{@link #getUes() <em>Ues</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUes()
	 * @generated
	 * @ordered
	 */
	protected EList<UE> ues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PortailPackage.Literals.FORMATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PortailPackage.FORMATION__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PortailPackage.FORMATION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCredit() {
		return credit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCredit(int newCredit) {
		int oldCredit = credit;
		credit = newCredit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PortailPackage.FORMATION__CREDIT, oldCredit, credit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parcours> getParcours() {
		if (parcours == null) {
			parcours = new EObjectContainmentEList<Parcours>(Parcours.class, this, PortailPackage.FORMATION__PARCOURS);
		}
		return parcours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Secretaire> getSecretaires() {
		if (secretaires == null) {
			secretaires = new EObjectWithInverseResolvingEList<Secretaire>(Secretaire.class, this, PortailPackage.FORMATION__SECRETAIRES, PortailPackage.SECRETAIRE__FORMATION);
		}
		return secretaires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Intervenant> getResponsablesFormation() {
		if (responsablesFormation == null) {
			responsablesFormation = new EObjectWithInverseResolvingEList<Intervenant>(Intervenant.class, this, PortailPackage.FORMATION__RESPONSABLES_FORMATION, PortailPackage.INTERVENANT__RESPONSABLE_FORMATION);
		}
		return responsablesFormation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UE> getUes() {
		if (ues == null) {
			ues = new EObjectContainmentEList<UE>(UE.class, this, PortailPackage.FORMATION__UES);
		}
		return ues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PortailPackage.FORMATION__SECRETAIRES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSecretaires()).basicAdd(otherEnd, msgs);
			case PortailPackage.FORMATION__RESPONSABLES_FORMATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResponsablesFormation()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PortailPackage.FORMATION__PARCOURS:
				return ((InternalEList<?>)getParcours()).basicRemove(otherEnd, msgs);
			case PortailPackage.FORMATION__SECRETAIRES:
				return ((InternalEList<?>)getSecretaires()).basicRemove(otherEnd, msgs);
			case PortailPackage.FORMATION__RESPONSABLES_FORMATION:
				return ((InternalEList<?>)getResponsablesFormation()).basicRemove(otherEnd, msgs);
			case PortailPackage.FORMATION__UES:
				return ((InternalEList<?>)getUes()).basicRemove(otherEnd, msgs);
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
			case PortailPackage.FORMATION__NAME:
				return getName();
			case PortailPackage.FORMATION__DESCRIPTION:
				return getDescription();
			case PortailPackage.FORMATION__CREDIT:
				return getCredit();
			case PortailPackage.FORMATION__PARCOURS:
				return getParcours();
			case PortailPackage.FORMATION__SECRETAIRES:
				return getSecretaires();
			case PortailPackage.FORMATION__RESPONSABLES_FORMATION:
				return getResponsablesFormation();
			case PortailPackage.FORMATION__UES:
				return getUes();
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
			case PortailPackage.FORMATION__NAME:
				setName((String)newValue);
				return;
			case PortailPackage.FORMATION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case PortailPackage.FORMATION__CREDIT:
				setCredit((Integer)newValue);
				return;
			case PortailPackage.FORMATION__PARCOURS:
				getParcours().clear();
				getParcours().addAll((Collection<? extends Parcours>)newValue);
				return;
			case PortailPackage.FORMATION__SECRETAIRES:
				getSecretaires().clear();
				getSecretaires().addAll((Collection<? extends Secretaire>)newValue);
				return;
			case PortailPackage.FORMATION__RESPONSABLES_FORMATION:
				getResponsablesFormation().clear();
				getResponsablesFormation().addAll((Collection<? extends Intervenant>)newValue);
				return;
			case PortailPackage.FORMATION__UES:
				getUes().clear();
				getUes().addAll((Collection<? extends UE>)newValue);
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
			case PortailPackage.FORMATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PortailPackage.FORMATION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case PortailPackage.FORMATION__CREDIT:
				setCredit(CREDIT_EDEFAULT);
				return;
			case PortailPackage.FORMATION__PARCOURS:
				getParcours().clear();
				return;
			case PortailPackage.FORMATION__SECRETAIRES:
				getSecretaires().clear();
				return;
			case PortailPackage.FORMATION__RESPONSABLES_FORMATION:
				getResponsablesFormation().clear();
				return;
			case PortailPackage.FORMATION__UES:
				getUes().clear();
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
			case PortailPackage.FORMATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PortailPackage.FORMATION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case PortailPackage.FORMATION__CREDIT:
				return credit != CREDIT_EDEFAULT;
			case PortailPackage.FORMATION__PARCOURS:
				return parcours != null && !parcours.isEmpty();
			case PortailPackage.FORMATION__SECRETAIRES:
				return secretaires != null && !secretaires.isEmpty();
			case PortailPackage.FORMATION__RESPONSABLES_FORMATION:
				return responsablesFormation != null && !responsablesFormation.isEmpty();
			case PortailPackage.FORMATION__UES:
				return ues != null && !ues.isEmpty();
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
		result.append(", description: ");
		result.append(description);
		result.append(", credit: ");
		result.append(credit);
		result.append(')');
		return result.toString();
	}

} //FormationImpl
