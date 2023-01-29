/**
 */
package portail.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import portail.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see portail.PortailPackage
 * @generated
 */
public class PortailSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PortailPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortailSwitch() {
		if (modelPackage == null) {
			modelPackage = PortailPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case PortailPackage.FORMATION: {
				Formation formation = (Formation)theEObject;
				T result = caseFormation(formation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PortailPackage.UNIVERSITE: {
				Universite universite = (Universite)theEObject;
				T result = caseUniversite(universite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PortailPackage.EMPLOYE: {
				Employe employe = (Employe)theEObject;
				T result = caseEmploye(employe);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PortailPackage.UE: {
				UE ue = (UE)theEObject;
				T result = caseUE(ue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PortailPackage.PARCOURS: {
				Parcours parcours = (Parcours)theEObject;
				T result = caseParcours(parcours);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PortailPackage.SEMESTRE: {
				Semestre semestre = (Semestre)theEObject;
				T result = caseSemestre(semestre);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PortailPackage.SEANCE: {
				Seance seance = (Seance)theEObject;
				T result = caseSeance(seance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PortailPackage.RESSOURCE: {
				Ressource ressource = (Ressource)theEObject;
				T result = caseRessource(ressource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PortailPackage.INTERVENANT: {
				Intervenant intervenant = (Intervenant)theEObject;
				T result = caseIntervenant(intervenant);
				if (result == null) result = caseEmploye(intervenant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PortailPackage.SECRETAIRE: {
				Secretaire secretaire = (Secretaire)theEObject;
				T result = caseSecretaire(secretaire);
				if (result == null) result = caseEmploye(secretaire);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PortailPackage.DEPARTEMENT: {
				Departement departement = (Departement)theEObject;
				T result = caseDepartement(departement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Formation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Formation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormation(Formation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Universite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Universite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUniversite(Universite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Employe</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Employe</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmploye(Employe object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUE(UE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parcours</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parcours</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParcours(Parcours object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Semestre</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Semestre</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSemestre(Semestre object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Seance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Seance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSeance(Seance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ressource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ressource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRessource(Ressource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intervenant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intervenant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntervenant(Intervenant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Secretaire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Secretaire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecretaire(Secretaire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Departement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Departement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDepartement(Departement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //PortailSwitch
