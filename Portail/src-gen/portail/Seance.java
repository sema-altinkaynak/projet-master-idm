/**
 */
package portail;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Seance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link portail.Seance#getName <em>Name</em>}</li>
 *   <li>{@link portail.Seance#getDate <em>Date</em>}</li>
 *   <li>{@link portail.Seance#getHeureDebut <em>Heure Debut</em>}</li>
 *   <li>{@link portail.Seance#getHeureFin <em>Heure Fin</em>}</li>
 *   <li>{@link portail.Seance#getDescription <em>Description</em>}</li>
 *   <li>{@link portail.Seance#getKind <em>Kind</em>}</li>
 *   <li>{@link portail.Seance#getRessources <em>Ressources</em>}</li>
 * </ul>
 *
 * @see portail.PortailPackage#getSeance()
 * @model
 * @generated
 */
public interface Seance extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see portail.PortailPackage#getSeance_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link portail.Seance#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(String)
	 * @see portail.PortailPackage#getSeance_Date()
	 * @model
	 * @generated
	 */
	String getDate();

	/**
	 * Sets the value of the '{@link portail.Seance#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(String value);

	/**
	 * Returns the value of the '<em><b>Heure Debut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heure Debut</em>' attribute.
	 * @see #setHeureDebut(String)
	 * @see portail.PortailPackage#getSeance_HeureDebut()
	 * @model
	 * @generated
	 */
	String getHeureDebut();

	/**
	 * Sets the value of the '{@link portail.Seance#getHeureDebut <em>Heure Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heure Debut</em>' attribute.
	 * @see #getHeureDebut()
	 * @generated
	 */
	void setHeureDebut(String value);

	/**
	 * Returns the value of the '<em><b>Heure Fin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heure Fin</em>' attribute.
	 * @see #setHeureFin(String)
	 * @see portail.PortailPackage#getSeance_HeureFin()
	 * @model
	 * @generated
	 */
	String getHeureFin();

	/**
	 * Sets the value of the '{@link portail.Seance#getHeureFin <em>Heure Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heure Fin</em>' attribute.
	 * @see #getHeureFin()
	 * @generated
	 */
	void setHeureFin(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see portail.PortailPackage#getSeance_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link portail.Seance#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link portail.SeanceKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see portail.SeanceKind
	 * @see #setKind(SeanceKind)
	 * @see portail.PortailPackage#getSeance_Kind()
	 * @model
	 * @generated
	 */
	SeanceKind getKind();

	/**
	 * Sets the value of the '{@link portail.Seance#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see portail.SeanceKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(SeanceKind value);

	/**
	 * Returns the value of the '<em><b>Ressources</b></em>' containment reference list.
	 * The list contents are of type {@link portail.Ressource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ressources</em>' containment reference list.
	 * @see portail.PortailPackage#getSeance_Ressources()
	 * @model containment="true"
	 * @generated
	 */
	EList<Ressource> getRessources();

} // Seance
