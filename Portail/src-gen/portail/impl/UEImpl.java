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
import portail.PortailPackage;
import portail.Seance;
import portail.UE;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link portail.impl.UEImpl#getName <em>Name</em>}</li>
 *   <li>{@link portail.impl.UEImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link portail.impl.UEImpl#getObjectif <em>Objectif</em>}</li>
 *   <li>{@link portail.impl.UEImpl#getCompetence <em>Competence</em>}</li>
 *   <li>{@link portail.impl.UEImpl#getEvaluation <em>Evaluation</em>}</li>
 *   <li>{@link portail.impl.UEImpl#getProgramme <em>Programme</em>}</li>
 *   <li>{@link portail.impl.UEImpl#getTypeEnseignement <em>Type Enseignement</em>}</li>
 *   <li>{@link portail.impl.UEImpl#getSeances <em>Seances</em>}</li>
 *   <li>{@link portail.impl.UEImpl#getIntervenants <em>Intervenants</em>}</li>
 *   <li>{@link portail.impl.UEImpl#getResponsables <em>Responsables</em>}</li>
 *   <li>{@link portail.impl.UEImpl#getCredit <em>Credit</em>}</li>
 *   <li>{@link portail.impl.UEImpl#getHeureCM <em>Heure CM</em>}</li>
 *   <li>{@link portail.impl.UEImpl#getHeureTD <em>Heure TD</em>}</li>
 *   <li>{@link portail.impl.UEImpl#getHeureTP <em>Heure TP</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UEImpl extends MinimalEObjectImpl.Container implements UE {
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
	 * The default value of the '{@link #getObjectif() <em>Objectif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectif()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJECTIF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObjectif() <em>Objectif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectif()
	 * @generated
	 * @ordered
	 */
	protected String objectif = OBJECTIF_EDEFAULT;

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
	 * The default value of the '{@link #getEvaluation() <em>Evaluation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluation()
	 * @generated
	 * @ordered
	 */
	protected static final String EVALUATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEvaluation() <em>Evaluation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluation()
	 * @generated
	 * @ordered
	 */
	protected String evaluation = EVALUATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getProgramme() <em>Programme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramme()
	 * @generated
	 * @ordered
	 */
	protected static final String PROGRAMME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProgramme() <em>Programme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramme()
	 * @generated
	 * @ordered
	 */
	protected String programme = PROGRAMME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeEnseignement() <em>Type Enseignement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeEnseignement()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_ENSEIGNEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeEnseignement() <em>Type Enseignement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeEnseignement()
	 * @generated
	 * @ordered
	 */
	protected String typeEnseignement = TYPE_ENSEIGNEMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSeances() <em>Seances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeances()
	 * @generated
	 * @ordered
	 */
	protected EList<Seance> seances;

	/**
	 * The cached value of the '{@link #getIntervenants() <em>Intervenants</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervenants()
	 * @generated
	 * @ordered
	 */
	protected EList<Intervenant> intervenants;

	/**
	 * The cached value of the '{@link #getResponsables() <em>Responsables</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsables()
	 * @generated
	 * @ordered
	 */
	protected EList<Intervenant> responsables;

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
	 * The default value of the '{@link #getHeureCM() <em>Heure CM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeureCM()
	 * @generated
	 * @ordered
	 */
	protected static final int HEURE_CM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHeureCM() <em>Heure CM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeureCM()
	 * @generated
	 * @ordered
	 */
	protected int heureCM = HEURE_CM_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeureTD() <em>Heure TD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeureTD()
	 * @generated
	 * @ordered
	 */
	protected static final int HEURE_TD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHeureTD() <em>Heure TD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeureTD()
	 * @generated
	 * @ordered
	 */
	protected int heureTD = HEURE_TD_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeureTP() <em>Heure TP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeureTP()
	 * @generated
	 * @ordered
	 */
	protected static final int HEURE_TP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHeureTP() <em>Heure TP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeureTP()
	 * @generated
	 * @ordered
	 */
	protected int heureTP = HEURE_TP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UEImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PortailPackage.Literals.UE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PortailPackage.UE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PortailPackage.UE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getObjectif() {
		return objectif;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectif(String newObjectif) {
		String oldObjectif = objectif;
		objectif = newObjectif;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PortailPackage.UE__OBJECTIF, oldObjectif, objectif));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PortailPackage.UE__COMPETENCE, oldCompetence, competence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEvaluation() {
		return evaluation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvaluation(String newEvaluation) {
		String oldEvaluation = evaluation;
		evaluation = newEvaluation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PortailPackage.UE__EVALUATION, oldEvaluation, evaluation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProgramme() {
		return programme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgramme(String newProgramme) {
		String oldProgramme = programme;
		programme = newProgramme;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PortailPackage.UE__PROGRAMME, oldProgramme, programme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeEnseignement() {
		return typeEnseignement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeEnseignement(String newTypeEnseignement) {
		String oldTypeEnseignement = typeEnseignement;
		typeEnseignement = newTypeEnseignement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PortailPackage.UE__TYPE_ENSEIGNEMENT, oldTypeEnseignement, typeEnseignement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Seance> getSeances() {
		if (seances == null) {
			seances = new EObjectContainmentEList<Seance>(Seance.class, this, PortailPackage.UE__SEANCES);
		}
		return seances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Intervenant> getIntervenants() {
		if (intervenants == null) {
			intervenants = new EObjectWithInverseResolvingEList.ManyInverse<Intervenant>(Intervenant.class, this, PortailPackage.UE__INTERVENANTS, PortailPackage.INTERVENANT__UES_INTERVENANT);
		}
		return intervenants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Intervenant> getResponsables() {
		if (responsables == null) {
			responsables = new EObjectWithInverseResolvingEList.ManyInverse<Intervenant>(Intervenant.class, this, PortailPackage.UE__RESPONSABLES, PortailPackage.INTERVENANT__UES_RESPONSABLE);
		}
		return responsables;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PortailPackage.UE__CREDIT, oldCredit, credit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHeureCM() {
		return heureCM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeureCM(int newHeureCM) {
		int oldHeureCM = heureCM;
		heureCM = newHeureCM;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PortailPackage.UE__HEURE_CM, oldHeureCM, heureCM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHeureTD() {
		return heureTD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeureTD(int newHeureTD) {
		int oldHeureTD = heureTD;
		heureTD = newHeureTD;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PortailPackage.UE__HEURE_TD, oldHeureTD, heureTD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHeureTP() {
		return heureTP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeureTP(int newHeureTP) {
		int oldHeureTP = heureTP;
		heureTP = newHeureTP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PortailPackage.UE__HEURE_TP, oldHeureTP, heureTP));
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
			case PortailPackage.UE__INTERVENANTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIntervenants()).basicAdd(otherEnd, msgs);
			case PortailPackage.UE__RESPONSABLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResponsables()).basicAdd(otherEnd, msgs);
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
			case PortailPackage.UE__SEANCES:
				return ((InternalEList<?>)getSeances()).basicRemove(otherEnd, msgs);
			case PortailPackage.UE__INTERVENANTS:
				return ((InternalEList<?>)getIntervenants()).basicRemove(otherEnd, msgs);
			case PortailPackage.UE__RESPONSABLES:
				return ((InternalEList<?>)getResponsables()).basicRemove(otherEnd, msgs);
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
			case PortailPackage.UE__NAME:
				return getName();
			case PortailPackage.UE__DESCRIPTION:
				return getDescription();
			case PortailPackage.UE__OBJECTIF:
				return getObjectif();
			case PortailPackage.UE__COMPETENCE:
				return getCompetence();
			case PortailPackage.UE__EVALUATION:
				return getEvaluation();
			case PortailPackage.UE__PROGRAMME:
				return getProgramme();
			case PortailPackage.UE__TYPE_ENSEIGNEMENT:
				return getTypeEnseignement();
			case PortailPackage.UE__SEANCES:
				return getSeances();
			case PortailPackage.UE__INTERVENANTS:
				return getIntervenants();
			case PortailPackage.UE__RESPONSABLES:
				return getResponsables();
			case PortailPackage.UE__CREDIT:
				return getCredit();
			case PortailPackage.UE__HEURE_CM:
				return getHeureCM();
			case PortailPackage.UE__HEURE_TD:
				return getHeureTD();
			case PortailPackage.UE__HEURE_TP:
				return getHeureTP();
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
			case PortailPackage.UE__NAME:
				setName((String)newValue);
				return;
			case PortailPackage.UE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case PortailPackage.UE__OBJECTIF:
				setObjectif((String)newValue);
				return;
			case PortailPackage.UE__COMPETENCE:
				setCompetence((String)newValue);
				return;
			case PortailPackage.UE__EVALUATION:
				setEvaluation((String)newValue);
				return;
			case PortailPackage.UE__PROGRAMME:
				setProgramme((String)newValue);
				return;
			case PortailPackage.UE__TYPE_ENSEIGNEMENT:
				setTypeEnseignement((String)newValue);
				return;
			case PortailPackage.UE__SEANCES:
				getSeances().clear();
				getSeances().addAll((Collection<? extends Seance>)newValue);
				return;
			case PortailPackage.UE__INTERVENANTS:
				getIntervenants().clear();
				getIntervenants().addAll((Collection<? extends Intervenant>)newValue);
				return;
			case PortailPackage.UE__RESPONSABLES:
				getResponsables().clear();
				getResponsables().addAll((Collection<? extends Intervenant>)newValue);
				return;
			case PortailPackage.UE__CREDIT:
				setCredit((Integer)newValue);
				return;
			case PortailPackage.UE__HEURE_CM:
				setHeureCM((Integer)newValue);
				return;
			case PortailPackage.UE__HEURE_TD:
				setHeureTD((Integer)newValue);
				return;
			case PortailPackage.UE__HEURE_TP:
				setHeureTP((Integer)newValue);
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
			case PortailPackage.UE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PortailPackage.UE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case PortailPackage.UE__OBJECTIF:
				setObjectif(OBJECTIF_EDEFAULT);
				return;
			case PortailPackage.UE__COMPETENCE:
				setCompetence(COMPETENCE_EDEFAULT);
				return;
			case PortailPackage.UE__EVALUATION:
				setEvaluation(EVALUATION_EDEFAULT);
				return;
			case PortailPackage.UE__PROGRAMME:
				setProgramme(PROGRAMME_EDEFAULT);
				return;
			case PortailPackage.UE__TYPE_ENSEIGNEMENT:
				setTypeEnseignement(TYPE_ENSEIGNEMENT_EDEFAULT);
				return;
			case PortailPackage.UE__SEANCES:
				getSeances().clear();
				return;
			case PortailPackage.UE__INTERVENANTS:
				getIntervenants().clear();
				return;
			case PortailPackage.UE__RESPONSABLES:
				getResponsables().clear();
				return;
			case PortailPackage.UE__CREDIT:
				setCredit(CREDIT_EDEFAULT);
				return;
			case PortailPackage.UE__HEURE_CM:
				setHeureCM(HEURE_CM_EDEFAULT);
				return;
			case PortailPackage.UE__HEURE_TD:
				setHeureTD(HEURE_TD_EDEFAULT);
				return;
			case PortailPackage.UE__HEURE_TP:
				setHeureTP(HEURE_TP_EDEFAULT);
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
			case PortailPackage.UE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PortailPackage.UE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case PortailPackage.UE__OBJECTIF:
				return OBJECTIF_EDEFAULT == null ? objectif != null : !OBJECTIF_EDEFAULT.equals(objectif);
			case PortailPackage.UE__COMPETENCE:
				return COMPETENCE_EDEFAULT == null ? competence != null : !COMPETENCE_EDEFAULT.equals(competence);
			case PortailPackage.UE__EVALUATION:
				return EVALUATION_EDEFAULT == null ? evaluation != null : !EVALUATION_EDEFAULT.equals(evaluation);
			case PortailPackage.UE__PROGRAMME:
				return PROGRAMME_EDEFAULT == null ? programme != null : !PROGRAMME_EDEFAULT.equals(programme);
			case PortailPackage.UE__TYPE_ENSEIGNEMENT:
				return TYPE_ENSEIGNEMENT_EDEFAULT == null ? typeEnseignement != null : !TYPE_ENSEIGNEMENT_EDEFAULT.equals(typeEnseignement);
			case PortailPackage.UE__SEANCES:
				return seances != null && !seances.isEmpty();
			case PortailPackage.UE__INTERVENANTS:
				return intervenants != null && !intervenants.isEmpty();
			case PortailPackage.UE__RESPONSABLES:
				return responsables != null && !responsables.isEmpty();
			case PortailPackage.UE__CREDIT:
				return credit != CREDIT_EDEFAULT;
			case PortailPackage.UE__HEURE_CM:
				return heureCM != HEURE_CM_EDEFAULT;
			case PortailPackage.UE__HEURE_TD:
				return heureTD != HEURE_TD_EDEFAULT;
			case PortailPackage.UE__HEURE_TP:
				return heureTP != HEURE_TP_EDEFAULT;
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
		result.append(", objectif: ");
		result.append(objectif);
		result.append(", competence: ");
		result.append(competence);
		result.append(", evaluation: ");
		result.append(evaluation);
		result.append(", programme: ");
		result.append(programme);
		result.append(", typeEnseignement: ");
		result.append(typeEnseignement);
		result.append(", Credit: ");
		result.append(credit);
		result.append(", heureCM: ");
		result.append(heureCM);
		result.append(", heureTD: ");
		result.append(heureTD);
		result.append(", heureTP: ");
		result.append(heureTP);
		result.append(')');
		return result.toString();
	}

} //UEImpl
