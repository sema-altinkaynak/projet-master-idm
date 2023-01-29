/**
 */
package portail;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link portail.Formation#getName <em>Name</em>}</li>
 *   <li>{@link portail.Formation#getDescription <em>Description</em>}</li>
 *   <li>{@link portail.Formation#getCredit <em>Credit</em>}</li>
 *   <li>{@link portail.Formation#getParcours <em>Parcours</em>}</li>
 *   <li>{@link portail.Formation#getSecretaires <em>Secretaires</em>}</li>
 *   <li>{@link portail.Formation#getResponsablesFormation <em>Responsables Formation</em>}</li>
 *   <li>{@link portail.Formation#getUes <em>Ues</em>}</li>
 * </ul>
 *
 * @see portail.PortailPackage#getFormation()
 * @model
 * @generated
 */
public interface Formation extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see portail.PortailPackage#getFormation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link portail.Formation#getName <em>Name</em>}' attribute.
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
	 * @see portail.PortailPackage#getFormation_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link portail.Formation#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Credit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credit</em>' attribute.
	 * @see #setCredit(int)
	 * @see portail.PortailPackage#getFormation_Credit()
	 * @model
	 * @generated
	 */
	int getCredit();

	/**
	 * Sets the value of the '{@link portail.Formation#getCredit <em>Credit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credit</em>' attribute.
	 * @see #getCredit()
	 * @generated
	 */
	void setCredit(int value);

	/**
	 * Returns the value of the '<em><b>Parcours</b></em>' containment reference list.
	 * The list contents are of type {@link portail.Parcours}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parcours</em>' containment reference list.
	 * @see portail.PortailPackage#getFormation_Parcours()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Parcours> getParcours();

	/**
	 * Returns the value of the '<em><b>Secretaires</b></em>' reference list.
	 * The list contents are of type {@link portail.Secretaire}.
	 * It is bidirectional and its opposite is '{@link portail.Secretaire#getFormation <em>Formation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secretaires</em>' reference list.
	 * @see portail.PortailPackage#getFormation_Secretaires()
	 * @see portail.Secretaire#getFormation
	 * @model opposite="formation" required="true"
	 * @generated
	 */
	EList<Secretaire> getSecretaires();

	/**
	 * Returns the value of the '<em><b>Responsables Formation</b></em>' reference list.
	 * The list contents are of type {@link portail.Intervenant}.
	 * It is bidirectional and its opposite is '{@link portail.Intervenant#getResponsableFormation <em>Responsable Formation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsables Formation</em>' reference list.
	 * @see portail.PortailPackage#getFormation_ResponsablesFormation()
	 * @see portail.Intervenant#getResponsableFormation
	 * @model opposite="responsableFormation" required="true"
	 * @generated
	 */
	EList<Intervenant> getResponsablesFormation();

	/**
	 * Returns the value of the '<em><b>Ues</b></em>' containment reference list.
	 * The list contents are of type {@link portail.UE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ues</em>' containment reference list.
	 * @see portail.PortailPackage#getFormation_Ues()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<UE> getUes();

} // Formation
