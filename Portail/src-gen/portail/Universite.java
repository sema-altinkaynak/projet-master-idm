/**
 */
package portail;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Universite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link portail.Universite#getName <em>Name</em>}</li>
 *   <li>{@link portail.Universite#getEmployes <em>Employes</em>}</li>
 *   <li>{@link portail.Universite#getDepartements <em>Departements</em>}</li>
 * </ul>
 *
 * @see portail.PortailPackage#getUniversite()
 * @model
 * @generated
 */
public interface Universite extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see portail.PortailPackage#getUniversite_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link portail.Universite#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Employes</b></em>' containment reference list.
	 * The list contents are of type {@link portail.Employe}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employes</em>' containment reference list.
	 * @see portail.PortailPackage#getUniversite_Employes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Employe> getEmployes();

	/**
	 * Returns the value of the '<em><b>Departements</b></em>' containment reference list.
	 * The list contents are of type {@link portail.Departement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Departements</em>' containment reference list.
	 * @see portail.PortailPackage#getUniversite_Departements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Departement> getDepartements();

} // Universite
