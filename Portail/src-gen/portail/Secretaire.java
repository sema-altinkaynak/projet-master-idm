/**
 */
package portail;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Secretaire</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link portail.Secretaire#getFormation <em>Formation</em>}</li>
 * </ul>
 *
 * @see portail.PortailPackage#getSecretaire()
 * @model
 * @generated
 */
public interface Secretaire extends Employe {
	/**
	 * Returns the value of the '<em><b>Formation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link portail.Formation#getSecretaires <em>Secretaires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formation</em>' reference.
	 * @see #setFormation(Formation)
	 * @see portail.PortailPackage#getSecretaire_Formation()
	 * @see portail.Formation#getSecretaires
	 * @model opposite="secretaires" required="true"
	 * @generated
	 */
	Formation getFormation();

	/**
	 * Sets the value of the '{@link portail.Secretaire#getFormation <em>Formation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formation</em>' reference.
	 * @see #getFormation()
	 * @generated
	 */
	void setFormation(Formation value);

} // Secretaire
