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

import portail.Departement;
import portail.Formation;
import portail.Intervenant;
import portail.PortailPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Departement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link portail.impl.DepartementImpl#getName <em>Name</em>}</li>
 *   <li>{@link portail.impl.DepartementImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link portail.impl.DepartementImpl#getFormations <em>Formations</em>}</li>
 *   <li>{@link portail.impl.DepartementImpl#getResponsableDepartement <em>Responsable Departement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DepartementImpl extends MinimalEObjectImpl.Container implements Departement {
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
	 * The cached value of the '{@link #getFormations() <em>Formations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormations()
	 * @generated
	 * @ordered
	 */
	protected EList<Formation> formations;

	/**
	 * The cached value of the '{@link #getResponsableDepartement() <em>Responsable Departement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsableDepartement()
	 * @generated
	 * @ordered
	 */
	protected Intervenant responsableDepartement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DepartementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PortailPackage.Literals.DEPARTEMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PortailPackage.DEPARTEMENT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PortailPackage.DEPARTEMENT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Formation> getFormations() {
		if (formations == null) {
			formations = new EObjectContainmentEList<Formation>(Formation.class, this, PortailPackage.DEPARTEMENT__FORMATIONS);
		}
		return formations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Intervenant getResponsableDepartement() {
		if (responsableDepartement != null && responsableDepartement.eIsProxy()) {
			InternalEObject oldResponsableDepartement = (InternalEObject)responsableDepartement;
			responsableDepartement = (Intervenant)eResolveProxy(oldResponsableDepartement);
			if (responsableDepartement != oldResponsableDepartement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PortailPackage.DEPARTEMENT__RESPONSABLE_DEPARTEMENT, oldResponsableDepartement, responsableDepartement));
			}
		}
		return responsableDepartement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Intervenant basicGetResponsableDepartement() {
		return responsableDepartement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponsableDepartement(Intervenant newResponsableDepartement,
			NotificationChain msgs) {
		Intervenant oldResponsableDepartement = responsableDepartement;
		responsableDepartement = newResponsableDepartement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PortailPackage.DEPARTEMENT__RESPONSABLE_DEPARTEMENT, oldResponsableDepartement, newResponsableDepartement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponsableDepartement(Intervenant newResponsableDepartement) {
		if (newResponsableDepartement != responsableDepartement) {
			NotificationChain msgs = null;
			if (responsableDepartement != null)
				msgs = ((InternalEObject)responsableDepartement).eInverseRemove(this, PortailPackage.INTERVENANT__RESPONSABLE_DEPARTEMENT, Intervenant.class, msgs);
			if (newResponsableDepartement != null)
				msgs = ((InternalEObject)newResponsableDepartement).eInverseAdd(this, PortailPackage.INTERVENANT__RESPONSABLE_DEPARTEMENT, Intervenant.class, msgs);
			msgs = basicSetResponsableDepartement(newResponsableDepartement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PortailPackage.DEPARTEMENT__RESPONSABLE_DEPARTEMENT, newResponsableDepartement, newResponsableDepartement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PortailPackage.DEPARTEMENT__RESPONSABLE_DEPARTEMENT:
				if (responsableDepartement != null)
					msgs = ((InternalEObject)responsableDepartement).eInverseRemove(this, PortailPackage.INTERVENANT__RESPONSABLE_DEPARTEMENT, Intervenant.class, msgs);
				return basicSetResponsableDepartement((Intervenant)otherEnd, msgs);
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
			case PortailPackage.DEPARTEMENT__FORMATIONS:
				return ((InternalEList<?>)getFormations()).basicRemove(otherEnd, msgs);
			case PortailPackage.DEPARTEMENT__RESPONSABLE_DEPARTEMENT:
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
			case PortailPackage.DEPARTEMENT__NAME:
				return getName();
			case PortailPackage.DEPARTEMENT__DESCRIPTION:
				return getDescription();
			case PortailPackage.DEPARTEMENT__FORMATIONS:
				return getFormations();
			case PortailPackage.DEPARTEMENT__RESPONSABLE_DEPARTEMENT:
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
			case PortailPackage.DEPARTEMENT__NAME:
				setName((String)newValue);
				return;
			case PortailPackage.DEPARTEMENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case PortailPackage.DEPARTEMENT__FORMATIONS:
				getFormations().clear();
				getFormations().addAll((Collection<? extends Formation>)newValue);
				return;
			case PortailPackage.DEPARTEMENT__RESPONSABLE_DEPARTEMENT:
				setResponsableDepartement((Intervenant)newValue);
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
			case PortailPackage.DEPARTEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PortailPackage.DEPARTEMENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case PortailPackage.DEPARTEMENT__FORMATIONS:
				getFormations().clear();
				return;
			case PortailPackage.DEPARTEMENT__RESPONSABLE_DEPARTEMENT:
				setResponsableDepartement((Intervenant)null);
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
			case PortailPackage.DEPARTEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PortailPackage.DEPARTEMENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case PortailPackage.DEPARTEMENT__FORMATIONS:
				return formations != null && !formations.isEmpty();
			case PortailPackage.DEPARTEMENT__RESPONSABLE_DEPARTEMENT:
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
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //DepartementImpl
