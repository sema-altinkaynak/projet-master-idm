/**
 */
package portail;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parcours</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link portail.Parcours#getName <em>Name</em>}</li>
 *   <li>{@link portail.Parcours#getDescription <em>Description</em>}</li>
 *   <li>{@link portail.Parcours#getSemestres <em>Semestres</em>}</li>
 *   <li>{@link portail.Parcours#getResponsableParcours <em>Responsable Parcours</em>}</li>
 *   <li>{@link portail.Parcours#getCompetence <em>Competence</em>}</li>
 *   <li>{@link portail.Parcours#getDebouche <em>Debouche</em>}</li>
 * </ul>
 *
 * @see portail.PortailPackage#getParcours()
 * @model
 * @generated
 */
public interface Parcours extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see portail.PortailPackage#getParcours_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link portail.Parcours#getName <em>Name</em>}' attribute.
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
	 * @see portail.PortailPackage#getParcours_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link portail.Parcours#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Semestres</b></em>' containment reference list.
	 * The list contents are of type {@link portail.Semestre}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semestres</em>' containment reference list.
	 * @see portail.PortailPackage#getParcours_Semestres()
	 * @model containment="true" required="true" upper="6"
	 * @generated
	 */
	EList<Semestre> getSemestres();

	/**
	 * Returns the value of the '<em><b>Responsable Parcours</b></em>' reference list.
	 * The list contents are of type {@link portail.Intervenant}.
	 * It is bidirectional and its opposite is '{@link portail.Intervenant#getResponsableParcours <em>Responsable Parcours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsable Parcours</em>' reference list.
	 * @see portail.PortailPackage#getParcours_ResponsableParcours()
	 * @see portail.Intervenant#getResponsableParcours
	 * @model opposite="responsableParcours" required="true"
	 * @generated
	 */
	EList<Intervenant> getResponsableParcours();

	/**
	 * Returns the value of the '<em><b>Competence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Competence</em>' attribute.
	 * @see #setCompetence(String)
	 * @see portail.PortailPackage#getParcours_Competence()
	 * @model
	 * @generated
	 */
	String getCompetence();

	/**
	 * Sets the value of the '{@link portail.Parcours#getCompetence <em>Competence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Competence</em>' attribute.
	 * @see #getCompetence()
	 * @generated
	 */
	void setCompetence(String value);

	/**
	 * Returns the value of the '<em><b>Debouche</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Debouche</em>' attribute.
	 * @see #setDebouche(String)
	 * @see portail.PortailPackage#getParcours_Debouche()
	 * @model
	 * @generated
	 */
	String getDebouche();

	/**
	 * Sets the value of the '{@link portail.Parcours#getDebouche <em>Debouche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Debouche</em>' attribute.
	 * @see #getDebouche()
	 * @generated
	 */
	void setDebouche(String value);

} // Parcours
