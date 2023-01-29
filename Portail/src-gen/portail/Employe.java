/**
 */
package portail;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Employe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link portail.Employe#getName <em>Name</em>}</li>
 *   <li>{@link portail.Employe#getTelephone <em>Telephone</em>}</li>
 *   <li>{@link portail.Employe#getBureau <em>Bureau</em>}</li>
 *   <li>{@link portail.Employe#getMail <em>Mail</em>}</li>
 * </ul>
 *
 * @see portail.PortailPackage#getEmploye()
 * @model abstract="true"
 * @generated
 */
public interface Employe extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see portail.PortailPackage#getEmploye_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link portail.Employe#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Telephone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Telephone</em>' attribute.
	 * @see #setTelephone(String)
	 * @see portail.PortailPackage#getEmploye_Telephone()
	 * @model
	 * @generated
	 */
	String getTelephone();

	/**
	 * Sets the value of the '{@link portail.Employe#getTelephone <em>Telephone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Telephone</em>' attribute.
	 * @see #getTelephone()
	 * @generated
	 */
	void setTelephone(String value);

	/**
	 * Returns the value of the '<em><b>Bureau</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bureau</em>' attribute.
	 * @see #setBureau(String)
	 * @see portail.PortailPackage#getEmploye_Bureau()
	 * @model
	 * @generated
	 */
	String getBureau();

	/**
	 * Sets the value of the '{@link portail.Employe#getBureau <em>Bureau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bureau</em>' attribute.
	 * @see #getBureau()
	 * @generated
	 */
	void setBureau(String value);

	/**
	 * Returns the value of the '<em><b>Mail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mail</em>' attribute.
	 * @see #setMail(String)
	 * @see portail.PortailPackage#getEmploye_Mail()
	 * @model
	 * @generated
	 */
	String getMail();

	/**
	 * Sets the value of the '{@link portail.Employe#getMail <em>Mail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mail</em>' attribute.
	 * @see #getMail()
	 * @generated
	 */
	void setMail(String value);

} // Employe
