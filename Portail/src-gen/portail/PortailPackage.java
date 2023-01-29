/**
 */
package portail;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see portail.PortailFactory
 * @model kind="package"
 * @generated
 */
public interface PortailPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "portail";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/portail";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "portail";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PortailPackage eINSTANCE = portail.impl.PortailPackageImpl.init();

	/**
	 * The meta object id for the '{@link portail.impl.FormationImpl <em>Formation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see portail.impl.FormationImpl
	 * @see portail.impl.PortailPackageImpl#getFormation()
	 * @generated
	 */
	int FORMATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Credit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION__CREDIT = 2;

	/**
	 * The feature id for the '<em><b>Parcours</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION__PARCOURS = 3;

	/**
	 * The feature id for the '<em><b>Secretaires</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION__SECRETAIRES = 4;

	/**
	 * The feature id for the '<em><b>Responsables Formation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION__RESPONSABLES_FORMATION = 5;

	/**
	 * The feature id for the '<em><b>Ues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION__UES = 6;

	/**
	 * The number of structural features of the '<em>Formation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Formation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link portail.impl.UniversiteImpl <em>Universite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see portail.impl.UniversiteImpl
	 * @see portail.impl.PortailPackageImpl#getUniversite()
	 * @generated
	 */
	int UNIVERSITE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Employes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITE__EMPLOYES = 1;

	/**
	 * The feature id for the '<em><b>Departements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITE__DEPARTEMENTS = 2;

	/**
	 * The number of structural features of the '<em>Universite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Universite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSITE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link portail.impl.EmployeImpl <em>Employe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see portail.impl.EmployeImpl
	 * @see portail.impl.PortailPackageImpl#getEmploye()
	 * @generated
	 */
	int EMPLOYE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Telephone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYE__TELEPHONE = 1;

	/**
	 * The feature id for the '<em><b>Bureau</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYE__BUREAU = 2;

	/**
	 * The feature id for the '<em><b>Mail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYE__MAIL = 3;

	/**
	 * The number of structural features of the '<em>Employe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Employe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link portail.impl.UEImpl <em>UE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see portail.impl.UEImpl
	 * @see portail.impl.PortailPackageImpl#getUE()
	 * @generated
	 */
	int UE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Objectif</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE__OBJECTIF = 2;

	/**
	 * The feature id for the '<em><b>Competence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE__COMPETENCE = 3;

	/**
	 * The feature id for the '<em><b>Evaluation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE__EVALUATION = 4;

	/**
	 * The feature id for the '<em><b>Programme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE__PROGRAMME = 5;

	/**
	 * The feature id for the '<em><b>Type Enseignement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE__TYPE_ENSEIGNEMENT = 6;

	/**
	 * The feature id for the '<em><b>Seances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE__SEANCES = 7;

	/**
	 * The feature id for the '<em><b>Intervenants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE__INTERVENANTS = 8;

	/**
	 * The feature id for the '<em><b>Responsables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE__RESPONSABLES = 9;

	/**
	 * The feature id for the '<em><b>Credit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE__CREDIT = 10;

	/**
	 * The feature id for the '<em><b>Heure CM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE__HEURE_CM = 11;

	/**
	 * The feature id for the '<em><b>Heure TD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE__HEURE_TD = 12;

	/**
	 * The feature id for the '<em><b>Heure TP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE__HEURE_TP = 13;

	/**
	 * The number of structural features of the '<em>UE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>UE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link portail.impl.ParcoursImpl <em>Parcours</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see portail.impl.ParcoursImpl
	 * @see portail.impl.PortailPackageImpl#getParcours()
	 * @generated
	 */
	int PARCOURS = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARCOURS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARCOURS__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Semestres</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARCOURS__SEMESTRES = 2;

	/**
	 * The feature id for the '<em><b>Responsable Parcours</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARCOURS__RESPONSABLE_PARCOURS = 3;

	/**
	 * The feature id for the '<em><b>Competence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARCOURS__COMPETENCE = 4;

	/**
	 * The feature id for the '<em><b>Debouche</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARCOURS__DEBOUCHE = 5;

	/**
	 * The number of structural features of the '<em>Parcours</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARCOURS_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Parcours</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARCOURS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link portail.impl.SemestreImpl <em>Semestre</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see portail.impl.SemestreImpl
	 * @see portail.impl.PortailPackageImpl#getSemestre()
	 * @generated
	 */
	int SEMESTRE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTRE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Date Debut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTRE__DATE_DEBUT = 1;

	/**
	 * The feature id for the '<em><b>Date Fin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTRE__DATE_FIN = 2;

	/**
	 * The feature id for the '<em><b>Ue Facultatives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTRE__UE_FACULTATIVES = 3;

	/**
	 * The feature id for the '<em><b>Ue Obligatoires</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTRE__UE_OBLIGATOIRES = 4;

	/**
	 * The number of structural features of the '<em>Semestre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTRE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Semestre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTRE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link portail.impl.SeanceImpl <em>Seance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see portail.impl.SeanceImpl
	 * @see portail.impl.PortailPackageImpl#getSeance()
	 * @generated
	 */
	int SEANCE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEANCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEANCE__DATE = 1;

	/**
	 * The feature id for the '<em><b>Heure Debut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEANCE__HEURE_DEBUT = 2;

	/**
	 * The feature id for the '<em><b>Heure Fin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEANCE__HEURE_FIN = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEANCE__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEANCE__KIND = 5;

	/**
	 * The feature id for the '<em><b>Ressources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEANCE__RESSOURCES = 6;

	/**
	 * The number of structural features of the '<em>Seance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEANCE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Seance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link portail.impl.RessourceImpl <em>Ressource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see portail.impl.RessourceImpl
	 * @see portail.impl.PortailPackageImpl#getRessource()
	 * @generated
	 */
	int RESSOURCE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Lien</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE__LIEN = 1;

	/**
	 * The number of structural features of the '<em>Ressource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Ressource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESSOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link portail.impl.IntervenantImpl <em>Intervenant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see portail.impl.IntervenantImpl
	 * @see portail.impl.PortailPackageImpl#getIntervenant()
	 * @generated
	 */
	int INTERVENANT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVENANT__NAME = EMPLOYE__NAME;

	/**
	 * The feature id for the '<em><b>Telephone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVENANT__TELEPHONE = EMPLOYE__TELEPHONE;

	/**
	 * The feature id for the '<em><b>Bureau</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVENANT__BUREAU = EMPLOYE__BUREAU;

	/**
	 * The feature id for the '<em><b>Mail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVENANT__MAIL = EMPLOYE__MAIL;

	/**
	 * The feature id for the '<em><b>Ues Intervenant</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVENANT__UES_INTERVENANT = EMPLOYE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Specialite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVENANT__SPECIALITE = EMPLOYE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ues Responsable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVENANT__UES_RESPONSABLE = EMPLOYE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Responsable Formation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVENANT__RESPONSABLE_FORMATION = EMPLOYE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Responsable Parcours</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVENANT__RESPONSABLE_PARCOURS = EMPLOYE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Responsable Departement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVENANT__RESPONSABLE_DEPARTEMENT = EMPLOYE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Intervenant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVENANT_FEATURE_COUNT = EMPLOYE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Intervenant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVENANT_OPERATION_COUNT = EMPLOYE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link portail.impl.SecretaireImpl <em>Secretaire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see portail.impl.SecretaireImpl
	 * @see portail.impl.PortailPackageImpl#getSecretaire()
	 * @generated
	 */
	int SECRETAIRE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRETAIRE__NAME = EMPLOYE__NAME;

	/**
	 * The feature id for the '<em><b>Telephone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRETAIRE__TELEPHONE = EMPLOYE__TELEPHONE;

	/**
	 * The feature id for the '<em><b>Bureau</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRETAIRE__BUREAU = EMPLOYE__BUREAU;

	/**
	 * The feature id for the '<em><b>Mail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRETAIRE__MAIL = EMPLOYE__MAIL;

	/**
	 * The feature id for the '<em><b>Formation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRETAIRE__FORMATION = EMPLOYE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Secretaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRETAIRE_FEATURE_COUNT = EMPLOYE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Secretaire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRETAIRE_OPERATION_COUNT = EMPLOYE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link portail.impl.DepartementImpl <em>Departement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see portail.impl.DepartementImpl
	 * @see portail.impl.PortailPackageImpl#getDepartement()
	 * @generated
	 */
	int DEPARTEMENT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTEMENT__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Formations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTEMENT__FORMATIONS = 2;

	/**
	 * The feature id for the '<em><b>Responsable Departement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTEMENT__RESPONSABLE_DEPARTEMENT = 3;

	/**
	 * The number of structural features of the '<em>Departement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTEMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Departement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link portail.SeanceKind <em>Seance Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see portail.SeanceKind
	 * @see portail.impl.PortailPackageImpl#getSeanceKind()
	 * @generated
	 */
	int SEANCE_KIND = 11;

	/**
	 * Returns the meta object for class '{@link portail.Formation <em>Formation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formation</em>'.
	 * @see portail.Formation
	 * @generated
	 */
	EClass getFormation();

	/**
	 * Returns the meta object for the attribute '{@link portail.Formation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see portail.Formation#getName()
	 * @see #getFormation()
	 * @generated
	 */
	EAttribute getFormation_Name();

	/**
	 * Returns the meta object for the attribute '{@link portail.Formation#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see portail.Formation#getDescription()
	 * @see #getFormation()
	 * @generated
	 */
	EAttribute getFormation_Description();

	/**
	 * Returns the meta object for the attribute '{@link portail.Formation#getCredit <em>Credit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credit</em>'.
	 * @see portail.Formation#getCredit()
	 * @see #getFormation()
	 * @generated
	 */
	EAttribute getFormation_Credit();

	/**
	 * Returns the meta object for the containment reference list '{@link portail.Formation#getParcours <em>Parcours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parcours</em>'.
	 * @see portail.Formation#getParcours()
	 * @see #getFormation()
	 * @generated
	 */
	EReference getFormation_Parcours();

	/**
	 * Returns the meta object for the reference list '{@link portail.Formation#getSecretaires <em>Secretaires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Secretaires</em>'.
	 * @see portail.Formation#getSecretaires()
	 * @see #getFormation()
	 * @generated
	 */
	EReference getFormation_Secretaires();

	/**
	 * Returns the meta object for the reference list '{@link portail.Formation#getResponsablesFormation <em>Responsables Formation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Responsables Formation</em>'.
	 * @see portail.Formation#getResponsablesFormation()
	 * @see #getFormation()
	 * @generated
	 */
	EReference getFormation_ResponsablesFormation();

	/**
	 * Returns the meta object for the containment reference list '{@link portail.Formation#getUes <em>Ues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ues</em>'.
	 * @see portail.Formation#getUes()
	 * @see #getFormation()
	 * @generated
	 */
	EReference getFormation_Ues();

	/**
	 * Returns the meta object for class '{@link portail.Universite <em>Universite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Universite</em>'.
	 * @see portail.Universite
	 * @generated
	 */
	EClass getUniversite();

	/**
	 * Returns the meta object for the attribute '{@link portail.Universite#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see portail.Universite#getName()
	 * @see #getUniversite()
	 * @generated
	 */
	EAttribute getUniversite_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link portail.Universite#getEmployes <em>Employes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Employes</em>'.
	 * @see portail.Universite#getEmployes()
	 * @see #getUniversite()
	 * @generated
	 */
	EReference getUniversite_Employes();

	/**
	 * Returns the meta object for the containment reference list '{@link portail.Universite#getDepartements <em>Departements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Departements</em>'.
	 * @see portail.Universite#getDepartements()
	 * @see #getUniversite()
	 * @generated
	 */
	EReference getUniversite_Departements();

	/**
	 * Returns the meta object for class '{@link portail.Employe <em>Employe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Employe</em>'.
	 * @see portail.Employe
	 * @generated
	 */
	EClass getEmploye();

	/**
	 * Returns the meta object for the attribute '{@link portail.Employe#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see portail.Employe#getName()
	 * @see #getEmploye()
	 * @generated
	 */
	EAttribute getEmploye_Name();

	/**
	 * Returns the meta object for the attribute '{@link portail.Employe#getTelephone <em>Telephone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Telephone</em>'.
	 * @see portail.Employe#getTelephone()
	 * @see #getEmploye()
	 * @generated
	 */
	EAttribute getEmploye_Telephone();

	/**
	 * Returns the meta object for the attribute '{@link portail.Employe#getBureau <em>Bureau</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bureau</em>'.
	 * @see portail.Employe#getBureau()
	 * @see #getEmploye()
	 * @generated
	 */
	EAttribute getEmploye_Bureau();

	/**
	 * Returns the meta object for the attribute '{@link portail.Employe#getMail <em>Mail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mail</em>'.
	 * @see portail.Employe#getMail()
	 * @see #getEmploye()
	 * @generated
	 */
	EAttribute getEmploye_Mail();

	/**
	 * Returns the meta object for class '{@link portail.UE <em>UE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UE</em>'.
	 * @see portail.UE
	 * @generated
	 */
	EClass getUE();

	/**
	 * Returns the meta object for the attribute '{@link portail.UE#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see portail.UE#getName()
	 * @see #getUE()
	 * @generated
	 */
	EAttribute getUE_Name();

	/**
	 * Returns the meta object for the attribute '{@link portail.UE#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see portail.UE#getDescription()
	 * @see #getUE()
	 * @generated
	 */
	EAttribute getUE_Description();

	/**
	 * Returns the meta object for the attribute '{@link portail.UE#getObjectif <em>Objectif</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Objectif</em>'.
	 * @see portail.UE#getObjectif()
	 * @see #getUE()
	 * @generated
	 */
	EAttribute getUE_Objectif();

	/**
	 * Returns the meta object for the attribute '{@link portail.UE#getCompetence <em>Competence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Competence</em>'.
	 * @see portail.UE#getCompetence()
	 * @see #getUE()
	 * @generated
	 */
	EAttribute getUE_Competence();

	/**
	 * Returns the meta object for the attribute '{@link portail.UE#getEvaluation <em>Evaluation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Evaluation</em>'.
	 * @see portail.UE#getEvaluation()
	 * @see #getUE()
	 * @generated
	 */
	EAttribute getUE_Evaluation();

	/**
	 * Returns the meta object for the attribute '{@link portail.UE#getProgramme <em>Programme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Programme</em>'.
	 * @see portail.UE#getProgramme()
	 * @see #getUE()
	 * @generated
	 */
	EAttribute getUE_Programme();

	/**
	 * Returns the meta object for the attribute '{@link portail.UE#getTypeEnseignement <em>Type Enseignement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Enseignement</em>'.
	 * @see portail.UE#getTypeEnseignement()
	 * @see #getUE()
	 * @generated
	 */
	EAttribute getUE_TypeEnseignement();

	/**
	 * Returns the meta object for the containment reference list '{@link portail.UE#getSeances <em>Seances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Seances</em>'.
	 * @see portail.UE#getSeances()
	 * @see #getUE()
	 * @generated
	 */
	EReference getUE_Seances();

	/**
	 * Returns the meta object for the reference list '{@link portail.UE#getIntervenants <em>Intervenants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Intervenants</em>'.
	 * @see portail.UE#getIntervenants()
	 * @see #getUE()
	 * @generated
	 */
	EReference getUE_Intervenants();

	/**
	 * Returns the meta object for the reference list '{@link portail.UE#getResponsables <em>Responsables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Responsables</em>'.
	 * @see portail.UE#getResponsables()
	 * @see #getUE()
	 * @generated
	 */
	EReference getUE_Responsables();

	/**
	 * Returns the meta object for the attribute '{@link portail.UE#getCredit <em>Credit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credit</em>'.
	 * @see portail.UE#getCredit()
	 * @see #getUE()
	 * @generated
	 */
	EAttribute getUE_Credit();

	/**
	 * Returns the meta object for the attribute '{@link portail.UE#getHeureCM <em>Heure CM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heure CM</em>'.
	 * @see portail.UE#getHeureCM()
	 * @see #getUE()
	 * @generated
	 */
	EAttribute getUE_HeureCM();

	/**
	 * Returns the meta object for the attribute '{@link portail.UE#getHeureTD <em>Heure TD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heure TD</em>'.
	 * @see portail.UE#getHeureTD()
	 * @see #getUE()
	 * @generated
	 */
	EAttribute getUE_HeureTD();

	/**
	 * Returns the meta object for the attribute '{@link portail.UE#getHeureTP <em>Heure TP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heure TP</em>'.
	 * @see portail.UE#getHeureTP()
	 * @see #getUE()
	 * @generated
	 */
	EAttribute getUE_HeureTP();

	/**
	 * Returns the meta object for class '{@link portail.Parcours <em>Parcours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parcours</em>'.
	 * @see portail.Parcours
	 * @generated
	 */
	EClass getParcours();

	/**
	 * Returns the meta object for the attribute '{@link portail.Parcours#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see portail.Parcours#getName()
	 * @see #getParcours()
	 * @generated
	 */
	EAttribute getParcours_Name();

	/**
	 * Returns the meta object for the attribute '{@link portail.Parcours#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see portail.Parcours#getDescription()
	 * @see #getParcours()
	 * @generated
	 */
	EAttribute getParcours_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link portail.Parcours#getSemestres <em>Semestres</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Semestres</em>'.
	 * @see portail.Parcours#getSemestres()
	 * @see #getParcours()
	 * @generated
	 */
	EReference getParcours_Semestres();

	/**
	 * Returns the meta object for the reference list '{@link portail.Parcours#getResponsableParcours <em>Responsable Parcours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Responsable Parcours</em>'.
	 * @see portail.Parcours#getResponsableParcours()
	 * @see #getParcours()
	 * @generated
	 */
	EReference getParcours_ResponsableParcours();

	/**
	 * Returns the meta object for the attribute '{@link portail.Parcours#getCompetence <em>Competence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Competence</em>'.
	 * @see portail.Parcours#getCompetence()
	 * @see #getParcours()
	 * @generated
	 */
	EAttribute getParcours_Competence();

	/**
	 * Returns the meta object for the attribute '{@link portail.Parcours#getDebouche <em>Debouche</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Debouche</em>'.
	 * @see portail.Parcours#getDebouche()
	 * @see #getParcours()
	 * @generated
	 */
	EAttribute getParcours_Debouche();

	/**
	 * Returns the meta object for class '{@link portail.Semestre <em>Semestre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semestre</em>'.
	 * @see portail.Semestre
	 * @generated
	 */
	EClass getSemestre();

	/**
	 * Returns the meta object for the attribute '{@link portail.Semestre#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see portail.Semestre#getName()
	 * @see #getSemestre()
	 * @generated
	 */
	EAttribute getSemestre_Name();

	/**
	 * Returns the meta object for the attribute '{@link portail.Semestre#getDateDebut <em>Date Debut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Debut</em>'.
	 * @see portail.Semestre#getDateDebut()
	 * @see #getSemestre()
	 * @generated
	 */
	EAttribute getSemestre_DateDebut();

	/**
	 * Returns the meta object for the attribute '{@link portail.Semestre#getDateFin <em>Date Fin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Fin</em>'.
	 * @see portail.Semestre#getDateFin()
	 * @see #getSemestre()
	 * @generated
	 */
	EAttribute getSemestre_DateFin();

	/**
	 * Returns the meta object for the reference list '{@link portail.Semestre#getUeFacultatives <em>Ue Facultatives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ue Facultatives</em>'.
	 * @see portail.Semestre#getUeFacultatives()
	 * @see #getSemestre()
	 * @generated
	 */
	EReference getSemestre_UeFacultatives();

	/**
	 * Returns the meta object for the reference list '{@link portail.Semestre#getUeObligatoires <em>Ue Obligatoires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ue Obligatoires</em>'.
	 * @see portail.Semestre#getUeObligatoires()
	 * @see #getSemestre()
	 * @generated
	 */
	EReference getSemestre_UeObligatoires();

	/**
	 * Returns the meta object for class '{@link portail.Seance <em>Seance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Seance</em>'.
	 * @see portail.Seance
	 * @generated
	 */
	EClass getSeance();

	/**
	 * Returns the meta object for the attribute '{@link portail.Seance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see portail.Seance#getName()
	 * @see #getSeance()
	 * @generated
	 */
	EAttribute getSeance_Name();

	/**
	 * Returns the meta object for the attribute '{@link portail.Seance#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see portail.Seance#getDate()
	 * @see #getSeance()
	 * @generated
	 */
	EAttribute getSeance_Date();

	/**
	 * Returns the meta object for the attribute '{@link portail.Seance#getHeureDebut <em>Heure Debut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heure Debut</em>'.
	 * @see portail.Seance#getHeureDebut()
	 * @see #getSeance()
	 * @generated
	 */
	EAttribute getSeance_HeureDebut();

	/**
	 * Returns the meta object for the attribute '{@link portail.Seance#getHeureFin <em>Heure Fin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heure Fin</em>'.
	 * @see portail.Seance#getHeureFin()
	 * @see #getSeance()
	 * @generated
	 */
	EAttribute getSeance_HeureFin();

	/**
	 * Returns the meta object for the attribute '{@link portail.Seance#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see portail.Seance#getDescription()
	 * @see #getSeance()
	 * @generated
	 */
	EAttribute getSeance_Description();

	/**
	 * Returns the meta object for the attribute '{@link portail.Seance#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see portail.Seance#getKind()
	 * @see #getSeance()
	 * @generated
	 */
	EAttribute getSeance_Kind();

	/**
	 * Returns the meta object for the containment reference list '{@link portail.Seance#getRessources <em>Ressources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ressources</em>'.
	 * @see portail.Seance#getRessources()
	 * @see #getSeance()
	 * @generated
	 */
	EReference getSeance_Ressources();

	/**
	 * Returns the meta object for class '{@link portail.Ressource <em>Ressource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ressource</em>'.
	 * @see portail.Ressource
	 * @generated
	 */
	EClass getRessource();

	/**
	 * Returns the meta object for the attribute '{@link portail.Ressource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see portail.Ressource#getName()
	 * @see #getRessource()
	 * @generated
	 */
	EAttribute getRessource_Name();

	/**
	 * Returns the meta object for the attribute '{@link portail.Ressource#getLien <em>Lien</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lien</em>'.
	 * @see portail.Ressource#getLien()
	 * @see #getRessource()
	 * @generated
	 */
	EAttribute getRessource_Lien();

	/**
	 * Returns the meta object for class '{@link portail.Intervenant <em>Intervenant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intervenant</em>'.
	 * @see portail.Intervenant
	 * @generated
	 */
	EClass getIntervenant();

	/**
	 * Returns the meta object for the reference list '{@link portail.Intervenant#getUesIntervenant <em>Ues Intervenant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ues Intervenant</em>'.
	 * @see portail.Intervenant#getUesIntervenant()
	 * @see #getIntervenant()
	 * @generated
	 */
	EReference getIntervenant_UesIntervenant();

	/**
	 * Returns the meta object for the attribute '{@link portail.Intervenant#getSpecialite <em>Specialite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Specialite</em>'.
	 * @see portail.Intervenant#getSpecialite()
	 * @see #getIntervenant()
	 * @generated
	 */
	EAttribute getIntervenant_Specialite();

	/**
	 * Returns the meta object for the reference list '{@link portail.Intervenant#getUesResponsable <em>Ues Responsable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ues Responsable</em>'.
	 * @see portail.Intervenant#getUesResponsable()
	 * @see #getIntervenant()
	 * @generated
	 */
	EReference getIntervenant_UesResponsable();

	/**
	 * Returns the meta object for the reference '{@link portail.Intervenant#getResponsableFormation <em>Responsable Formation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Responsable Formation</em>'.
	 * @see portail.Intervenant#getResponsableFormation()
	 * @see #getIntervenant()
	 * @generated
	 */
	EReference getIntervenant_ResponsableFormation();

	/**
	 * Returns the meta object for the reference '{@link portail.Intervenant#getResponsableParcours <em>Responsable Parcours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Responsable Parcours</em>'.
	 * @see portail.Intervenant#getResponsableParcours()
	 * @see #getIntervenant()
	 * @generated
	 */
	EReference getIntervenant_ResponsableParcours();

	/**
	 * Returns the meta object for the reference '{@link portail.Intervenant#getResponsableDepartement <em>Responsable Departement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Responsable Departement</em>'.
	 * @see portail.Intervenant#getResponsableDepartement()
	 * @see #getIntervenant()
	 * @generated
	 */
	EReference getIntervenant_ResponsableDepartement();

	/**
	 * Returns the meta object for class '{@link portail.Secretaire <em>Secretaire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Secretaire</em>'.
	 * @see portail.Secretaire
	 * @generated
	 */
	EClass getSecretaire();

	/**
	 * Returns the meta object for the reference '{@link portail.Secretaire#getFormation <em>Formation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Formation</em>'.
	 * @see portail.Secretaire#getFormation()
	 * @see #getSecretaire()
	 * @generated
	 */
	EReference getSecretaire_Formation();

	/**
	 * Returns the meta object for class '{@link portail.Departement <em>Departement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Departement</em>'.
	 * @see portail.Departement
	 * @generated
	 */
	EClass getDepartement();

	/**
	 * Returns the meta object for the attribute '{@link portail.Departement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see portail.Departement#getName()
	 * @see #getDepartement()
	 * @generated
	 */
	EAttribute getDepartement_Name();

	/**
	 * Returns the meta object for the attribute '{@link portail.Departement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see portail.Departement#getDescription()
	 * @see #getDepartement()
	 * @generated
	 */
	EAttribute getDepartement_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link portail.Departement#getFormations <em>Formations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Formations</em>'.
	 * @see portail.Departement#getFormations()
	 * @see #getDepartement()
	 * @generated
	 */
	EReference getDepartement_Formations();

	/**
	 * Returns the meta object for the reference '{@link portail.Departement#getResponsableDepartement <em>Responsable Departement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Responsable Departement</em>'.
	 * @see portail.Departement#getResponsableDepartement()
	 * @see #getDepartement()
	 * @generated
	 */
	EReference getDepartement_ResponsableDepartement();

	/**
	 * Returns the meta object for enum '{@link portail.SeanceKind <em>Seance Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Seance Kind</em>'.
	 * @see portail.SeanceKind
	 * @generated
	 */
	EEnum getSeanceKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PortailFactory getPortailFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link portail.impl.FormationImpl <em>Formation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see portail.impl.FormationImpl
		 * @see portail.impl.PortailPackageImpl#getFormation()
		 * @generated
		 */
		EClass FORMATION = eINSTANCE.getFormation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMATION__NAME = eINSTANCE.getFormation_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMATION__DESCRIPTION = eINSTANCE.getFormation_Description();

		/**
		 * The meta object literal for the '<em><b>Credit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMATION__CREDIT = eINSTANCE.getFormation_Credit();

		/**
		 * The meta object literal for the '<em><b>Parcours</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMATION__PARCOURS = eINSTANCE.getFormation_Parcours();

		/**
		 * The meta object literal for the '<em><b>Secretaires</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMATION__SECRETAIRES = eINSTANCE.getFormation_Secretaires();

		/**
		 * The meta object literal for the '<em><b>Responsables Formation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMATION__RESPONSABLES_FORMATION = eINSTANCE.getFormation_ResponsablesFormation();

		/**
		 * The meta object literal for the '<em><b>Ues</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMATION__UES = eINSTANCE.getFormation_Ues();

		/**
		 * The meta object literal for the '{@link portail.impl.UniversiteImpl <em>Universite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see portail.impl.UniversiteImpl
		 * @see portail.impl.PortailPackageImpl#getUniversite()
		 * @generated
		 */
		EClass UNIVERSITE = eINSTANCE.getUniversite();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIVERSITE__NAME = eINSTANCE.getUniversite_Name();

		/**
		 * The meta object literal for the '<em><b>Employes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSITE__EMPLOYES = eINSTANCE.getUniversite_Employes();

		/**
		 * The meta object literal for the '<em><b>Departements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSITE__DEPARTEMENTS = eINSTANCE.getUniversite_Departements();

		/**
		 * The meta object literal for the '{@link portail.impl.EmployeImpl <em>Employe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see portail.impl.EmployeImpl
		 * @see portail.impl.PortailPackageImpl#getEmploye()
		 * @generated
		 */
		EClass EMPLOYE = eINSTANCE.getEmploye();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYE__NAME = eINSTANCE.getEmploye_Name();

		/**
		 * The meta object literal for the '<em><b>Telephone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYE__TELEPHONE = eINSTANCE.getEmploye_Telephone();

		/**
		 * The meta object literal for the '<em><b>Bureau</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYE__BUREAU = eINSTANCE.getEmploye_Bureau();

		/**
		 * The meta object literal for the '<em><b>Mail</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYE__MAIL = eINSTANCE.getEmploye_Mail();

		/**
		 * The meta object literal for the '{@link portail.impl.UEImpl <em>UE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see portail.impl.UEImpl
		 * @see portail.impl.PortailPackageImpl#getUE()
		 * @generated
		 */
		EClass UE = eINSTANCE.getUE();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UE__NAME = eINSTANCE.getUE_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UE__DESCRIPTION = eINSTANCE.getUE_Description();

		/**
		 * The meta object literal for the '<em><b>Objectif</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UE__OBJECTIF = eINSTANCE.getUE_Objectif();

		/**
		 * The meta object literal for the '<em><b>Competence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UE__COMPETENCE = eINSTANCE.getUE_Competence();

		/**
		 * The meta object literal for the '<em><b>Evaluation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UE__EVALUATION = eINSTANCE.getUE_Evaluation();

		/**
		 * The meta object literal for the '<em><b>Programme</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UE__PROGRAMME = eINSTANCE.getUE_Programme();

		/**
		 * The meta object literal for the '<em><b>Type Enseignement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UE__TYPE_ENSEIGNEMENT = eINSTANCE.getUE_TypeEnseignement();

		/**
		 * The meta object literal for the '<em><b>Seances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UE__SEANCES = eINSTANCE.getUE_Seances();

		/**
		 * The meta object literal for the '<em><b>Intervenants</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UE__INTERVENANTS = eINSTANCE.getUE_Intervenants();

		/**
		 * The meta object literal for the '<em><b>Responsables</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UE__RESPONSABLES = eINSTANCE.getUE_Responsables();

		/**
		 * The meta object literal for the '<em><b>Credit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UE__CREDIT = eINSTANCE.getUE_Credit();

		/**
		 * The meta object literal for the '<em><b>Heure CM</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UE__HEURE_CM = eINSTANCE.getUE_HeureCM();

		/**
		 * The meta object literal for the '<em><b>Heure TD</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UE__HEURE_TD = eINSTANCE.getUE_HeureTD();

		/**
		 * The meta object literal for the '<em><b>Heure TP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UE__HEURE_TP = eINSTANCE.getUE_HeureTP();

		/**
		 * The meta object literal for the '{@link portail.impl.ParcoursImpl <em>Parcours</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see portail.impl.ParcoursImpl
		 * @see portail.impl.PortailPackageImpl#getParcours()
		 * @generated
		 */
		EClass PARCOURS = eINSTANCE.getParcours();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARCOURS__NAME = eINSTANCE.getParcours_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARCOURS__DESCRIPTION = eINSTANCE.getParcours_Description();

		/**
		 * The meta object literal for the '<em><b>Semestres</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARCOURS__SEMESTRES = eINSTANCE.getParcours_Semestres();

		/**
		 * The meta object literal for the '<em><b>Responsable Parcours</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARCOURS__RESPONSABLE_PARCOURS = eINSTANCE.getParcours_ResponsableParcours();

		/**
		 * The meta object literal for the '<em><b>Competence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARCOURS__COMPETENCE = eINSTANCE.getParcours_Competence();

		/**
		 * The meta object literal for the '<em><b>Debouche</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARCOURS__DEBOUCHE = eINSTANCE.getParcours_Debouche();

		/**
		 * The meta object literal for the '{@link portail.impl.SemestreImpl <em>Semestre</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see portail.impl.SemestreImpl
		 * @see portail.impl.PortailPackageImpl#getSemestre()
		 * @generated
		 */
		EClass SEMESTRE = eINSTANCE.getSemestre();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTRE__NAME = eINSTANCE.getSemestre_Name();

		/**
		 * The meta object literal for the '<em><b>Date Debut</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTRE__DATE_DEBUT = eINSTANCE.getSemestre_DateDebut();

		/**
		 * The meta object literal for the '<em><b>Date Fin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTRE__DATE_FIN = eINSTANCE.getSemestre_DateFin();

		/**
		 * The meta object literal for the '<em><b>Ue Facultatives</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTRE__UE_FACULTATIVES = eINSTANCE.getSemestre_UeFacultatives();

		/**
		 * The meta object literal for the '<em><b>Ue Obligatoires</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTRE__UE_OBLIGATOIRES = eINSTANCE.getSemestre_UeObligatoires();

		/**
		 * The meta object literal for the '{@link portail.impl.SeanceImpl <em>Seance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see portail.impl.SeanceImpl
		 * @see portail.impl.PortailPackageImpl#getSeance()
		 * @generated
		 */
		EClass SEANCE = eINSTANCE.getSeance();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEANCE__NAME = eINSTANCE.getSeance_Name();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEANCE__DATE = eINSTANCE.getSeance_Date();

		/**
		 * The meta object literal for the '<em><b>Heure Debut</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEANCE__HEURE_DEBUT = eINSTANCE.getSeance_HeureDebut();

		/**
		 * The meta object literal for the '<em><b>Heure Fin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEANCE__HEURE_FIN = eINSTANCE.getSeance_HeureFin();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEANCE__DESCRIPTION = eINSTANCE.getSeance_Description();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEANCE__KIND = eINSTANCE.getSeance_Kind();

		/**
		 * The meta object literal for the '<em><b>Ressources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEANCE__RESSOURCES = eINSTANCE.getSeance_Ressources();

		/**
		 * The meta object literal for the '{@link portail.impl.RessourceImpl <em>Ressource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see portail.impl.RessourceImpl
		 * @see portail.impl.PortailPackageImpl#getRessource()
		 * @generated
		 */
		EClass RESSOURCE = eINSTANCE.getRessource();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESSOURCE__NAME = eINSTANCE.getRessource_Name();

		/**
		 * The meta object literal for the '<em><b>Lien</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESSOURCE__LIEN = eINSTANCE.getRessource_Lien();

		/**
		 * The meta object literal for the '{@link portail.impl.IntervenantImpl <em>Intervenant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see portail.impl.IntervenantImpl
		 * @see portail.impl.PortailPackageImpl#getIntervenant()
		 * @generated
		 */
		EClass INTERVENANT = eINSTANCE.getIntervenant();

		/**
		 * The meta object literal for the '<em><b>Ues Intervenant</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERVENANT__UES_INTERVENANT = eINSTANCE.getIntervenant_UesIntervenant();

		/**
		 * The meta object literal for the '<em><b>Specialite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERVENANT__SPECIALITE = eINSTANCE.getIntervenant_Specialite();

		/**
		 * The meta object literal for the '<em><b>Ues Responsable</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERVENANT__UES_RESPONSABLE = eINSTANCE.getIntervenant_UesResponsable();

		/**
		 * The meta object literal for the '<em><b>Responsable Formation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERVENANT__RESPONSABLE_FORMATION = eINSTANCE.getIntervenant_ResponsableFormation();

		/**
		 * The meta object literal for the '<em><b>Responsable Parcours</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERVENANT__RESPONSABLE_PARCOURS = eINSTANCE.getIntervenant_ResponsableParcours();

		/**
		 * The meta object literal for the '<em><b>Responsable Departement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERVENANT__RESPONSABLE_DEPARTEMENT = eINSTANCE.getIntervenant_ResponsableDepartement();

		/**
		 * The meta object literal for the '{@link portail.impl.SecretaireImpl <em>Secretaire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see portail.impl.SecretaireImpl
		 * @see portail.impl.PortailPackageImpl#getSecretaire()
		 * @generated
		 */
		EClass SECRETAIRE = eINSTANCE.getSecretaire();

		/**
		 * The meta object literal for the '<em><b>Formation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECRETAIRE__FORMATION = eINSTANCE.getSecretaire_Formation();

		/**
		 * The meta object literal for the '{@link portail.impl.DepartementImpl <em>Departement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see portail.impl.DepartementImpl
		 * @see portail.impl.PortailPackageImpl#getDepartement()
		 * @generated
		 */
		EClass DEPARTEMENT = eINSTANCE.getDepartement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPARTEMENT__NAME = eINSTANCE.getDepartement_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPARTEMENT__DESCRIPTION = eINSTANCE.getDepartement_Description();

		/**
		 * The meta object literal for the '<em><b>Formations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTEMENT__FORMATIONS = eINSTANCE.getDepartement_Formations();

		/**
		 * The meta object literal for the '<em><b>Responsable Departement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTEMENT__RESPONSABLE_DEPARTEMENT = eINSTANCE.getDepartement_ResponsableDepartement();

		/**
		 * The meta object literal for the '{@link portail.SeanceKind <em>Seance Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see portail.SeanceKind
		 * @see portail.impl.PortailPackageImpl#getSeanceKind()
		 * @generated
		 */
		EEnum SEANCE_KIND = eINSTANCE.getSeanceKind();

	}

} //PortailPackage
