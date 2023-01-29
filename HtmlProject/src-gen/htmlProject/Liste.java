/**
 */
package htmlProject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Liste</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link htmlProject.Liste#getDescriptions <em>Descriptions</em>}</li>
 * </ul>
 *
 * @see htmlProject.HtmlProjectPackage#getListe()
 * @model
 * @generated
 */
public interface Liste extends Conteneur {
	/**
	 * Returns the value of the '<em><b>Descriptions</b></em>' containment reference list.
	 * The list contents are of type {@link htmlProject.Description}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descriptions</em>' containment reference list.
	 * @see htmlProject.HtmlProjectPackage#getListe_Descriptions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Description> getDescriptions();

} // Liste
