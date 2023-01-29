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

import portail.Intervenant;
import portail.Parcours;
import portail.PortailPackage;
import portail.Semestre;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parcours</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link portail.impl.ParcoursImpl#getName <em>Name</em>}</li>
 *   <li>{@link portail.impl.ParcoursImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link portail.impl.ParcoursImpl#getSemestres <em>Semestres</em>}</li>
 *   <li>{@link portail.impl.ParcoursImpl#getResponsableParcours <em>Responsable Parcours</em>}</li>
 *   <li>{@link portail.impl.ParcoursImpl#getCompetence <em>Competence</em>}</li>
 *   <li>{@link portail.impl.ParcoursImpl#getDebouche <em>Debouche</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParcoursImpl extends MinimalEObjectImpl.Container implements Parcours {
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
	 * The cached value of the '{@link #getSemestres() <em>Semestres</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemestres()
	 * @generated
	 * @ordered
	 */
	protected EList<Semestre> semestres;

	/**
	 * The cached value of the '{@link #getResponsableParcours() <em>Responsable Parcours</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsableParcours()
	 * @generated
	 * @ordered
	 */
	protected EList<Intervenant> responsableParcours;

	/**
	 * The default value of the '{@link #getCompetence() <em>Competence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompetence()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPETENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompetence() <em>Competence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompetence()
	 * @generated
	 * @ordered
	 */
	protected String competence = COMPETENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDebouche() <em>Debouche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebouche()
	 * @generated
	 * @ordered
	 */
	protected static final String DEBOUCHE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDebouche() <em>Debouche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebouche()
	 * @generated
	 * @ordered
	 */
	protected String debouche = DEBOUCHE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParcoursImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PortailPackage.Literals.PARCOURS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PortailPackage.PARCOURS__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PortailPackage.PARCOURS__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Semestre> getSemestres() {
		if (semestres == null) {
			semestres = new EObjectContainmentEList<Semestre>(Semestre.class, this, PortailPackage.PARCOURS__SEMESTRES);
		}
		return semestres;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Intervenant> getResponsableParcours() {
		if (responsableParcours == null) {
			responsableParcours = new EObjectWithInverseResolvingEList<Intervenant>(Intervenant.class, this, PortailPackage.PARCOURS__RESPONSABLE_PARCOURS, PortailPackage.INTERVENANT__RESPONSABLE_PARCOURS);
		}
		return responsableParcours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCompetence() {
		return competence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompetence(String newCompetence) {
		String oldCompetence = competence;
		competence = newCompetence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PortailPackage.PARCOURS__COMPETENCE, oldCompetence, competence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDebouche() {
		return debouche;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDebouche(String newDebouche) {
		String oldDebouche = debouche;
		debouche = newDebouche;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PortailPackage.PARCOURS__DEBOUCHE, oldDebouche, debouche));
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
			case PortailPackage.PARCOURS__RESPONSABLE_PARCOURS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResponsableParcours()).basicAdd(otherEnd, msgs);
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
			case PortailPackage.PARCOURS__SEMESTRES:
				return ((InternalEList<?>)getSemestres()).basicRemove(otherEnd, msgs);
			case PortailPackage.PARCOURS__RESPONSABLE_PARCOURS:
				return ((InternalEList<?>)getResponsableParcours()).basicRemove(otherEnd, msgs);
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
			case PortailPackage.PARCOURS__NAME:
				return getName();
			case PortailPackage.PARCOURS__DESCRIPTION:
				return getDescription();
			case PortailPackage.PARCOURS__SEMESTRES:
				return getSemestres();
			case PortailPackage.PARCOURS__RESPONSABLE_PARCOURS:
				return getResponsableParcours();
			case PortailPackage.PARCOURS__COMPETENCE:
				return getCompetence();
			case PortailPackage.PARCOURS__DEBOUCHE:
				return getDebouche();
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
			case PortailPackage.PARCOURS__NAME:
				setName((String)newValue);
				return;
			case PortailPackage.PARCOURS__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case PortailPackage.PARCOURS__SEMESTRES:
				getSemestres().clear();
				getSemestres().addAll((Collection<? extends Semestre>)newValue);
				return;
			case PortailPackage.PARCOURS__RESPONSABLE_PARCOURS:
				getResponsableParcours().clear();
				getResponsableParcours().addAll((Collection<? extends Intervenant>)newValue);
				return;
			case PortailPackage.PARCOURS__COMPETENCE:
				setCompetence((String)newValue);
				return;
			case PortailPackage.PARCOURS__DEBOUCHE:
				setDebouche((String)newValue);
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
			case PortailPackage.PARCOURS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PortailPackage.PARCOURS__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case PortailPackage.PARCOURS__SEMESTRES:
				getSemestres().clear();
				return;
			case PortailPackage.PARCOURS__RESPONSABLE_PARCOURS:
				getResponsableParcours().clear();
				return;
			case PortailPackage.PARCOURS__COMPETENCE:
				setCompetence(COMPETENCE_EDEFAULT);
				return;
			case PortailPackage.PARCOURS__DEBOUCHE:
				setDebouche(DEBOUCHE_EDEFAULT);
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
			case PortailPackage.PARCOURS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PortailPackage.PARCOURS__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case PortailPackage.PARCOURS__SEMESTRES:
				return semestres != null && !semestres.isEmpty();
			case PortailPackage.PARCOURS__RESPONSABLE_PARCOURS:
				return responsableParcours != null && !responsableParcours.isEmpty();
			case PortailPackage.PARCOURS__COMPETENCE:
				return COMPETENCE_EDEFAULT == null ? competence != null : !COMPETENCE_EDEFAULT.equals(competence);
			case PortailPackage.PARCOURS__DEBOUCHE:
				return DEBOUCHE_EDEFAULT == null ? debouche != null : !DEBOUCHE_EDEFAULT.equals(debouche);
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
		result.append(", competence: ");
		result.append(competence);
		result.append(", debouche: ");
		result.append(debouche);
		result.append(')');
		return result.toString();
	}

} //ParcoursImpl
