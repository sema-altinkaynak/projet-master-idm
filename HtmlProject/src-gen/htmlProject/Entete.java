/**
 */
package htmlProject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entete</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link htmlProject.Entete#getNiveau <em>Niveau</em>}</li>
 *   <li>{@link htmlProject.Entete#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see htmlProject.HtmlProjectPackage#getEntete()
 * @model
 * @generated
 */
public interface Entete extends Conteneur {
	/**
	 * Returns the value of the '<em><b>Niveau</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Niveau</em>' attribute.
	 * @see #setNiveau(int)
	 * @see htmlProject.HtmlProjectPackage#getEntete_Niveau()
	 * @model
	 * @generated
	 */
	int getNiveau();

	/**
	 * Sets the value of the '{@link htmlProject.Entete#getNiveau <em>Niveau</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Niveau</em>' attribute.
	 * @see #getNiveau()
	 * @generated
	 */
	void setNiveau(int value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see htmlProject.HtmlProjectPackage#getEntete_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link htmlProject.Entete#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Entete
