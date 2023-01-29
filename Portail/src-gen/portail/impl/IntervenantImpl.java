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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import portail.Departement;
import portail.Formation;
import portail.Intervenant;
import portail.Parcours;
import portail.PortailPackage;
import portail.UE;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intervenant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link portail.impl.IntervenantImpl#getUesIntervenant <em>Ues Intervenant</em>}</li>
 *   <li>{@link portail.impl.IntervenantImpl#getSpecialite <em>Specialite</em>}</li>
 *   <li>{@link portail.impl.IntervenantImpl#getUesResponsable <em>Ues Responsable</em>}</li>
 *   <li>{@link portail.impl.IntervenantImpl#getResponsableFormation <em>Responsable Formation</em>}</li>
 *   <li>{@link portail.impl.IntervenantImpl#getResponsableParcours <em>Responsable Parcours</em>}</li>
 *   <li>{@link portail.impl.IntervenantImpl#getResponsableDepartement <em>Responsable Departement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntervenantImpl extends EmployeImpl implements Intervenant {
	/**
	 * The cached value of the '{@link #getUesIntervenant() <em>Ues Intervenant</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUesIntervenant()
	 * @generated
	 * @ordered
	 */
	protected EList<UE> uesIntervenant;

	/**
	 * The default value of the '{@link #getSpecialite() <em>Specialite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialite()
	 * @generated
	 * @ordered
	 */
	protected static final String SPECIALITE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpecialite() <em>Specialite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialite()
	 * @generated
	 * @ordered
	 */
	protected String specialite = SPECIALITE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUesResponsable() <em>Ues Responsable</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUesResponsable()
	 * @generated
	 * @ordered
	 */
	protected EList<UE> uesResponsable;

	/**
	 * The cached value of the '{@link #getResponsableFormation() <em>Responsable Formation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsableFormation()
	 * @generated
	 * @ordered
	 */
	protected Formation responsableFormation;

	/**
	 * The cached value of the '{@link #getResponsableParcours() <em>Responsable Parcours</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsableParcours()
	 * @generated
	 * @ordered
	 */
	protected Parcours responsableParcours;

	/**
	 * The cached value of the '{@link #getResponsableDepartement() <em>Responsable Departement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsableDepartement()
	 * @generated
	 * @ordered
	 */
	protected Departement responsableDepartement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntervenantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PortailPackage.Literals.INTERVENANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UE> getUesIntervenant() {
		if (uesIntervenant == null) {
			uesIntervenant = new EObjectWithInverseResolvingEList.ManyInverse<UE>(UE.class, this, PortailPackage.INTERVENANT__UES_INTERVENANT, PortailPackage.UE__INTERVENANTS);
		}
		return uesIntervenant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpecialite() {
		return specialite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecialite(String newSpecialite) {
		String oldSpecialite = specialite;
		specialite = newSpecialite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PortailPackage.INTERVENANT__SPECIALITE, oldSpecialite, specialite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UE> getUesResponsable() {
		if (uesResponsable == null) {
			uesResponsable = new EObjectWithInverseResolvingEList.ManyInverse<UE>(UE.class, this, PortailPackage.INTERVENANT__UES_RESPONSABLE, PortailPackage.UE__RESPONSABLES);
		}
		return uesResponsable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Formation getResponsableFormation() {
		if (responsableFormation != null && responsableFormation.eIsProxy()) {
			InternalEObject oldResponsableFormation = (InternalEObject)responsableFormation;
			responsableFormation = (Formation)eResolveProxy(oldResponsableFormation);
			if (responsableFormation != oldResponsableFormation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PortailPackage.INTERVENANT__RESPONSABLE_FORMATION, oldResponsableFormation, responsableFormation));
			}
		}
		return responsableFormation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Formation basicGetResponsableFormation() {
		return responsableFormation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponsableFormation(Formation newResponsableFormation, NotificationChain msgs) {
		Formation oldResponsableFormation = responsableFormation;
		responsableFormation = newResponsableFormation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PortailPackage.INTERVENANT__RESPONSABLE_FORMATION, oldResponsableFormation, newResponsableFormation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponsableFormation(Formation newResponsableFormation) {
		if (newResponsableFormation != responsableFormation) {
			NotificationChain msgs = null;
			if (responsableFormation != null)
				msgs = ((InternalEObject)responsableFormation).eInverseRemove(this, PortailPackage.FORMATION__RESPONSABLES_FORMATION, Formation.class, msgs);
			if (newResponsableFormation != null)
				msgs = ((InternalEObject)newResponsableFormation).eInverseAdd(this, PortailPackage.FORMATION__RESPONSABLES_FORMATION, Formation.class, msgs);
			msgs = basicSetResponsableFormation(newResponsableFormation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PortailPackage.INTERVENANT__RESPONSABLE_FORMATION, newResponsableFormation, newResponsableFormation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parcours getResponsableParcours() {
		if (responsableParcours != null && responsableParcours.eIsProxy()) {
			InternalEObject oldResponsableParcours = (InternalEObject)responsableParcours;
			responsableParcours = (Parcours)eResolveProxy(oldResponsableParcours);
			if (responsableParcours != oldResponsableParcours) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PortailPackage.INTERVENANT__RESPONSABLE_PARCOURS, oldResponsableParcours, responsableParcours));
			}
		}
		return responsableParcours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parcours basicGetResponsableParcours() {
		return responsableParcours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponsableParcours(Parcours newResponsableParcours, NotificationChain msgs) {
		Parcours oldResponsableParcours = responsableParcours;
		responsableParcours = newResponsableParcours;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PortailPackage.INTERVENANT__RESPONSABLE_PARCOURS, oldResponsableParcours, newResponsableParcours);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponsableParcours(Parcours newResponsableParcours) {
		if (newResponsableParcours != responsableParcours) {
			NotificationChain msgs = null;
			if (responsableParcours != null)
				msgs = ((InternalEObject)responsableParcours).eInverseRemove(this, PortailPackage.PARCOURS__RESPONSABLE_PARCOURS, Parcours.class, msgs);
			if (newResponsableParcours != null)
				msgs = ((InternalEObject)newResponsableParcours).eInverseAdd(this, PortailPackage.PARCOURS__RESPONSABLE_PARCOURS, Parcours.class, msgs);
			msgs = basicSetResponsableParcours(newResponsableParcours, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PortailPackage.INTERVENANT__RESPONSABLE_PARCOURS, newResponsableParcours, newResponsableParcours));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Departement getResponsableDepartement() {
		if (responsableDepartement != null && responsableDepartement.eIsProxy()) {
			InternalEObject oldResponsableDepartement = (InternalEObject)responsableDepartement;
			responsableDepartement = (Departement)eResolveProxy(oldResponsableDepartement);
			if (responsableDepartement != oldResponsableDepartement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PortailPackage.INTERVENANT__RESPONSABLE_DEPARTEMENT, oldResponsableDepartement, responsableDepartement));
			}
		}
		return responsableDepartement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Departement basicGetResponsableDepartement() {
		return responsableDepartement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponsableDepartement(Departement newResponsableDepartement,
			NotificationChain msgs) {
		Departement oldResponsableDepartement = responsableDepartement;
		responsableDepartement = newResponsableDepartement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PortailPackage.INTERVENANT__RESPONSABLE_DEPARTEMENT, oldResponsableDepartement, newResponsableDepartement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponsableDepartement(Departement newResponsableDepartement) {
		if (newResponsableDepartement != responsableDepartement) {
			NotificationChain msgs = null;
			if (responsableDepartement != null)
				msgs = ((InternalEObject)responsableDepartement).eInverseRemove(this, PortailPackage.DEPARTEMENT__RESPONSABLE_DEPARTEMENT, Departement.class, msgs);
			if (newResponsableDepartement != null)
				msgs = ((InternalEObject)newResponsableDepartement).eInverseAdd(this, PortailPackage.DEPARTEMENT__RESPONSABLE_DEPARTEMENT, Departement.class, msgs);
			msgs = basicSetResponsableDepartement(newResponsableDepartement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PortailPackage.INTERVENANT__RESPONSABLE_DEPARTEMENT, newResponsableDepartement, newResponsableDepartement));
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
			case PortailPackage.INTERVENANT__UES_INTERVENANT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUesIntervenant()).basicAdd(otherEnd, msgs);
			case PortailPackage.INTERVENANT__UES_RESPONSABLE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUesResponsable()).basicAdd(otherEnd, msgs);
			case PortailPackage.INTERVENANT__RESPONSABLE_FORMATION:
				if (responsableFormation != null)
					msgs = ((InternalEObject)responsableFormation).eInverseRemove(this, PortailPackage.FORMATION__RESPONSABLES_FORMATION, Formation.class, msgs);
				return basicSetResponsableFormation((Formation)otherEnd, msgs);
			case PortailPackage.INTERVENANT__RESPONSABLE_PARCOURS:
				if (responsableParcours != null)
					msgs = ((InternalEObject)responsableParcours).eInverseRemove(this, PortailPackage.PARCOURS__RESPONSABLE_PARCOURS, Parcours.class, msgs);
				return basicSetResponsableParcours((Parcours)otherEnd, msgs);
			case PortailPackage.INTERVENANT__RESPONSABLE_DEPARTEMENT:
				if (responsableDepartement != null)
					msgs = ((InternalEObject)responsableDepartement).eInverseRemove(this, PortailPackage.DEPARTEMENT__RESPONSABLE_DEPARTEMENT, Departement.class, msgs);
				return basicSetResponsableDepartement((Departement)otherEnd, msgs);
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
			case PortailPackage.INTERVENANT__UES_INTERVENANT:
				return ((InternalEList<?>)getUesIntervenant()).basicRemove(otherEnd, msgs);
			case PortailPackage.INTERVENANT__UES_RESPONSABLE:
				return ((InternalEList<?>)getUesResponsable()).basicRemove(otherEnd, msgs);
			case PortailPackage.INTERVENANT__RESPONSABLE_FORMATION:
				return basicSetResponsableFormation(null, msgs);
			case PortailPackage.INTERVENANT__RESPONSABLE_PARCOURS:
				return basicSetResponsableParcours(null, msgs);
			case PortailPackage.INTERVENANT__RESPONSABLE_DEPARTEMENT:
				return basicSetResponsableDepartement(null, msgs);
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
			case PortailPackage.INTERVENANT__UES_INTERVENANT:
				return getUesIntervenant();
			case PortailPackage.INTERVENANT__SPECIALITE:
				return getSpecialite();
			case PortailPackage.INTERVENANT__UES_RESPONSABLE:
				return getUesResponsable();
			case PortailPackage.INTERVENANT__RESPONSABLE_FORMATION:
				if (resolve) return getResponsableFormation();
				return basicGetResponsableFormation();
			case PortailPackage.INTERVENANT__RESPONSABLE_PARCOURS:
				if (resolve) return getResponsableParcours();
				return basicGetResponsableParcours();
			case PortailPackage.INTERVENANT__RESPONSABLE_DEPARTEMENT:
				if (resolve) return getResponsableDepartement();
				return basicGetResponsableDepartement();
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
			case PortailPackage.INTERVENANT__UES_INTERVENANT:
				getUesIntervenant().clear();
				getUesIntervenant().addAll((Collection<? extends UE>)newValue);
				return;
			case PortailPackage.INTERVENANT__SPECIALITE:
				setSpecialite((String)newValue);
				return;
			case PortailPackage.INTERVENANT__UES_RESPONSABLE:
				getUesResponsable().clear();
				getUesResponsable().addAll((Collection<? extends UE>)newValue);
				return;
			case PortailPackage.INTERVENANT__RESPONSABLE_FORMATION:
				setResponsableFormation((Formation)newValue);
				return;
			case PortailPackage.INTERVENANT__RESPONSABLE_PARCOURS:
				setResponsableParcours((Parcours)newValue);
				return;
			case PortailPackage.INTERVENANT__RESPONSABLE_DEPARTEMENT:
				setResponsableDepartement((Departement)newValue);
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
			case PortailPackage.INTERVENANT__UES_INTERVENANT:
				getUesIntervenant().clear();
				return;
			case PortailPackage.INTERVENANT__SPECIALITE:
				setSpecialite(SPECIALITE_EDEFAULT);
				return;
			case PortailPackage.INTERVENANT__UES_RESPONSABLE:
				getUesResponsable().clear();
				return;
			case PortailPackage.INTERVENANT__RESPONSABLE_FORMATION:
				setResponsableFormation((Formation)null);
				return;
			case PortailPackage.INTERVENANT__RESPONSABLE_PARCOURS:
				setResponsableParcours((Parcours)null);
				return;
			case PortailPackage.INTERVENANT__RESPONSABLE_DEPARTEMENT:
				setResponsableDepartement((Departement)null);
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
			case PortailPackage.INTERVENANT__UES_INTERVENANT:
				return uesIntervenant != null && !uesIntervenant.isEmpty();
			case PortailPackage.INTERVENANT__SPECIALITE:
				return SPECIALITE_EDEFAULT == null ? specialite != null : !SPECIALITE_EDEFAULT.equals(specialite);
			case PortailPackage.INTERVENANT__UES_RESPONSABLE:
				return uesResponsable != null && !uesResponsable.isEmpty();
			case PortailPackage.INTERVENANT__RESPONSABLE_FORMATION:
				return responsableFormation != null;
			case PortailPackage.INTERVENANT__RESPONSABLE_PARCOURS:
				return responsableParcours != null;
			case PortailPackage.INTERVENANT__RESPONSABLE_DEPARTEMENT:
				return responsableDepartement != null;
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
		result.append(" (specialite: ");
		result.append(specialite);
		result.append(')');
		return result.toString();
	}

} //IntervenantImpl
