/**
 */
package htmlProject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lien</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link htmlProject.Lien#getAdresse <em>Adresse</em>}</li>
 *   <li>{@link htmlProject.Lien#getType <em>Type</em>}</li>
 *   <li>{@link htmlProject.Lien#getCouleur <em>Couleur</em>}</li>
 * </ul>
 *
 * @see htmlProject.HtmlProjectPackage#getLien()
 * @model
 * @generated
 */
public interface Lien extends Element {
	/**
	 * Returns the value of the '<em><b>Adresse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adresse</em>' attribute.
	 * @see #setAdresse(String)
	 * @see htmlProject.HtmlProjectPackage#getLien_Adresse()
	 * @model
	 * @generated
	 */
	String getAdresse();

	/**
	 * Sets the value of the '{@link htmlProject.Lien#getAdresse <em>Adresse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adresse</em>' attribute.
	 * @see #getAdresse()
	 * @generated
	 */
	void setAdresse(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see htmlProject.HtmlProjectPackage#getLien_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link htmlProject.Lien#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Couleur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Couleur</em>' attribute.
	 * @see #setCouleur(String)
	 * @see htmlProject.HtmlProjectPackage#getLien_Couleur()
	 * @model
	 * @generated
	 */
	String getCouleur();

	/**
	 * Sets the value of the '{@link htmlProject.Lien#getCouleur <em>Couleur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Couleur</em>' attribute.
	 * @see #getCouleur()
	 * @generated
	 */
	void setCouleur(String value);

} // Lien
