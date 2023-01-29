/**
 */
package portail.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import portail.Formation;
import portail.PortailPackage;
import portail.Secretaire;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Secretaire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link portail.impl.SecretaireImpl#getFormation <em>Formation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecretaireImpl extends EmployeImpl implements Secretaire {
	/**
	 * The cached value of the '{@link #getFormation() <em>Formation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormation()
	 * @generated
	 * @ordered
	 */
	protected Formation formation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecretaireImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PortailPackage.Literals.SECRETAIRE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Formation getFormation() {
		if (formation != null && formation.eIsProxy()) {
			InternalEObject oldFormation = (InternalEObject)formation;
			formation = (Formation)eResolveProxy(oldFormation);
			if (formation != oldFormation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PortailPackage.SECRETAIRE__FORMATION, oldFormation, formation));
			}
		}
		return formation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Formation basicGetFormation() {
		return formation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFormation(Formation newFormation, NotificationChain msgs) {
		Formation oldFormation = formation;
		formation = newFormation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PortailPackage.SECRETAIRE__FORMATION, oldFormation, newFormation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormation(Formation newFormation) {
		if (newFormation != formation) {
			NotificationChain msgs = null;
			if (formation != null)
				msgs = ((InternalEObject)formation).eInverseRemove(this, PortailPackage.FORMATION__SECRETAIRES, Formation.class, msgs);
			if (newFormation != null)
				msgs = ((InternalEObject)newFormation).eInverseAdd(this, PortailPackage.FORMATION__SECRETAIRES, Formation.class, msgs);
			msgs = basicSetFormation(newFormation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PortailPackage.SECRETAIRE__FORMATION, newFormation, newFormation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PortailPackage.SECRETAIRE__FORMATION:
				if (formation != null)
					msgs = ((InternalEObject)formation).eInverseRemove(this, PortailPackage.FORMATION__SECRETAIRES, Formation.class, msgs);
				return basicSetFormation((Formation)otherEnd, msgs);
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
			case PortailPackage.SECRETAIRE__FORMATION:
				return basicSetFormation(null, msgs);
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
			case PortailPackage.SECRETAIRE__FORMATION:
				if (resolve) return getFormation();
				return basicGetFormation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PortailPackage.SECRETAIRE__FORMATION:
				setFormation((Formation)newValue);
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
			case PortailPackage.SECRETAIRE__FORMATION:
				setFormation((Formation)null);
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
			case PortailPackage.SECRETAIRE__FORMATION:
				return formation != null;
		}
		return super.eIsSet(featureID);
	}

} //SecretaireImpl
