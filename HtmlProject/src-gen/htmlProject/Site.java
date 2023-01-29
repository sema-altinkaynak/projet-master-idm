/**
 */
package htmlProject;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Site</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link htmlProject.Site#getName <em>Name</em>}</li>
 *   <li>{@link htmlProject.Site#getPages <em>Pages</em>}</li>
 *   <li>{@link htmlProject.Site#getAuteur <em>Auteur</em>}</li>
 * </ul>
 *
 * @see htmlProject.HtmlProjectPackage#getSite()
 * @model
 * @generated
 */
public interface Site extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see htmlProject.HtmlProjectPackage#getSite_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link htmlProject.Site#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Pages</b></em>' containment reference list.
	 * The list contents are of type {@link htmlProject.Page}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pages</em>' containment reference list.
	 * @see htmlProject.HtmlProjectPackage#getSite_Pages()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Page> getPages();

	/**
	 * Returns the value of the '<em><b>Auteur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auteur</em>' attribute.
	 * @see #setAuteur(String)
	 * @see htmlProject.HtmlProjectPackage#getSite_Auteur()
	 * @model
	 * @generated
	 */
	String getAuteur();

	/**
	 * Sets the value of the '{@link htmlProject.Site#getAuteur <em>Auteur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auteur</em>' attribute.
	 * @see #getAuteur()
	 * @generated
	 */
	void setAuteur(String value);

} // Site
