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
import portail.Employe;
import portail.PortailPackage;
import portail.Universite;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Universite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link portail.impl.UniversiteImpl#getName <em>Name</em>}</li>
 *   <li>{@link portail.impl.UniversiteImpl#getEmployes <em>Employes</em>}</li>
 *   <li>{@link portail.impl.UniversiteImpl#getDepartements <em>Departements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UniversiteImpl extends MinimalEObjectImpl.Container implements Universite {
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
	 * The cached value of the '{@link #getEmployes() <em>Employes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployes()
	 * @generated
	 * @ordered
	 */
	protected EList<Employe> employes;

	/**
	 * The cached value of the '{@link #getDepartements() <em>Departements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartements()
	 * @generated
	 * @ordered
	 */
	protected EList<Departement> departements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UniversiteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PortailPackage.Literals.UNIVERSITE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PortailPackage.UNIVERSITE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Employe> getEmployes() {
		if (employes == null) {
			employes = new EObjectContainmentEList<Employe>(Employe.class, this, PortailPackage.UNIVERSITE__EMPLOYES);
		}
		return employes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Departement> getDepartements() {
		if (departements == null) {
			departements = new EObjectContainmentEList<Departement>(Departement.class, this, PortailPackage.UNIVERSITE__DEPARTEMENTS);
		}
		return departements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PortailPackage.UNIVERSITE__EMPLOYES:
				return ((InternalEList<?>)getEmployes()).basicRemove(otherEnd, msgs);
			case PortailPackage.UNIVERSITE__DEPARTEMENTS:
				return ((InternalEList<?>)getDepartements()).basicRemove(otherEnd, msgs);
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
			case PortailPackage.UNIVERSITE__NAME:
				return getName();
			case PortailPackage.UNIVERSITE__EMPLOYES:
				return getEmployes();
			case PortailPackage.UNIVERSITE__DEPARTEMENTS:
				return getDepartements();
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
			case PortailPackage.UNIVERSITE__NAME:
				setName((String)newValue);
				return;
			case PortailPackage.UNIVERSITE__EMPLOYES:
				getEmployes().clear();
				getEmployes().addAll((Collection<? extends Employe>)newValue);
				return;
			case PortailPackage.UNIVERSITE__DEPARTEMENTS:
				getDepartements().clear();
				getDepartements().addAll((Collection<? extends Departement>)newValue);
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
			case PortailPackage.UNIVERSITE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PortailPackage.UNIVERSITE__EMPLOYES:
				getEmployes().clear();
				return;
			case PortailPackage.UNIVERSITE__DEPARTEMENTS:
				getDepartements().clear();
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
			case PortailPackage.UNIVERSITE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PortailPackage.UNIVERSITE__EMPLOYES:
				return employes != null && !employes.isEmpty();
			case PortailPackage.UNIVERSITE__DEPARTEMENTS:
				return departements != null && !departements.isEmpty();
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

} //UniversiteImpl
