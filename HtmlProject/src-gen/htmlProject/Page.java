/**
 */
package htmlProject;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link htmlProject.Page#getName <em>Name</em>}</li>
 *   <li>{@link htmlProject.Page#getConteneurs <em>Conteneurs</em>}</li>
 * </ul>
 *
 * @see htmlProject.HtmlProjectPackage#getPage()
 * @model
 * @generated
 */
public interface Page extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see htmlProject.HtmlProjectPackage#getPage_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link htmlProject.Page#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Conteneurs</b></em>' containment reference list.
	 * The list contents are of type {@link htmlProject.Conteneur}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conteneurs</em>' containment reference list.
	 * @see htmlProject.HtmlProjectPackage#getPage_Conteneurs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Conteneur> getConteneurs();

} // Page
