/**
 */
package portail;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Departement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link portail.Departement#getName <em>Name</em>}</li>
 *   <li>{@link portail.Departement#getDescription <em>Description</em>}</li>
 *   <li>{@link portail.Departement#getFormations <em>Formations</em>}</li>
 *   <li>{@link portail.Departement#getResponsableDepartement <em>Responsable Departement</em>}</li>
 * </ul>
 *
 * @see portail.PortailPackage#getDepartement()
 * @model
 * @generated
 */
public interface Departement extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see portail.PortailPackage#getDepartement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link portail.Departement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see portail.PortailPackage#getDepartement_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link portail.Departement#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Formations</b></em>' containment reference list.
	 * The list contents are of type {@link portail.Formation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formations</em>' containment reference list.
	 * @see portail.PortailPackage#getDepartement_Formations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Formation> getFormations();

	/**
	 * Returns the value of the '<em><b>Responsable Departement</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link portail.Intervenant#getResponsableDepartement <em>Responsable Departement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsable Departement</em>' reference.
	 * @see #setResponsableDepartement(Intervenant)
	 * @see portail.PortailPackage#getDepartement_ResponsableDepartement()
	 * @see portail.Intervenant#getResponsableDepartement
	 * @model opposite="responsableDepartement" required="true"
	 * @generated
	 */
	Intervenant getResponsableDepartement();

	/**
	 * Sets the value of the '{@link portail.Departement#getResponsableDepartement <em>Responsable Departement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsable Departement</em>' reference.
	 * @see #getResponsableDepartement()
	 * @generated
	 */
	void setResponsableDepartement(Intervenant value);

} // Departement
