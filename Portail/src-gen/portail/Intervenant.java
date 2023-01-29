/**
 */
package portail;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intervenant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link portail.Intervenant#getUesIntervenant <em>Ues Intervenant</em>}</li>
 *   <li>{@link portail.Intervenant#getSpecialite <em>Specialite</em>}</li>
 *   <li>{@link portail.Intervenant#getUesResponsable <em>Ues Responsable</em>}</li>
 *   <li>{@link portail.Intervenant#getResponsableFormation <em>Responsable Formation</em>}</li>
 *   <li>{@link portail.Intervenant#getResponsableParcours <em>Responsable Parcours</em>}</li>
 *   <li>{@link portail.Intervenant#getResponsableDepartement <em>Responsable Departement</em>}</li>
 * </ul>
 *
 * @see portail.PortailPackage#getIntervenant()
 * @model
 * @generated
 */
public interface Intervenant extends Employe {
	/**
	 * Returns the value of the '<em><b>Ues Intervenant</b></em>' reference list.
	 * The list contents are of type {@link portail.UE}.
	 * It is bidirectional and its opposite is '{@link portail.UE#getIntervenants <em>Intervenants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ues Intervenant</em>' reference list.
	 * @see portail.PortailPackage#getIntervenant_UesIntervenant()
	 * @see portail.UE#getIntervenants
	 * @model opposite="intervenants"
	 * @generated
	 */
	EList<UE> getUesIntervenant();

	/**
	 * Returns the value of the '<em><b>Specialite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialite</em>' attribute.
	 * @see #setSpecialite(String)
	 * @see portail.PortailPackage#getIntervenant_Specialite()
	 * @model
	 * @generated
	 */
	String getSpecialite();

	/**
	 * Sets the value of the '{@link portail.Intervenant#getSpecialite <em>Specialite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specialite</em>' attribute.
	 * @see #getSpecialite()
	 * @generated
	 */
	void setSpecialite(String value);

	/**
	 * Returns the value of the '<em><b>Ues Responsable</b></em>' reference list.
	 * The list contents are of type {@link portail.UE}.
	 * It is bidirectional and its opposite is '{@link portail.UE#getResponsables <em>Responsables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ues Responsable</em>' reference list.
	 * @see portail.PortailPackage#getIntervenant_UesResponsable()
	 * @see portail.UE#getResponsables
	 * @model opposite="responsables"
	 * @generated
	 */
	EList<UE> getUesResponsable();

	/**
	 * Returns the value of the '<em><b>Responsable Formation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link portail.Formation#getResponsablesFormation <em>Responsables Formation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsable Formation</em>' reference.
	 * @see #setResponsableFormation(Formation)
	 * @see portail.PortailPackage#getIntervenant_ResponsableFormation()
	 * @see portail.Formation#getResponsablesFormation
	 * @model opposite="responsablesFormation"
	 * @generated
	 */
	Formation getResponsableFormation();

	/**
	 * Sets the value of the '{@link portail.Intervenant#getResponsableFormation <em>Responsable Formation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsable Formation</em>' reference.
	 * @see #getResponsableFormation()
	 * @generated
	 */
	void setResponsableFormation(Formation value);

	/**
	 * Returns the value of the '<em><b>Responsable Parcours</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link portail.Parcours#getResponsableParcours <em>Responsable Parcours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsable Parcours</em>' reference.
	 * @see #setResponsableParcours(Parcours)
	 * @see portail.PortailPackage#getIntervenant_ResponsableParcours()
	 * @see portail.Parcours#getResponsableParcours
	 * @model opposite="responsableParcours"
	 * @generated
	 */
	Parcours getResponsableParcours();

	/**
	 * Sets the value of the '{@link portail.Intervenant#getResponsableParcours <em>Responsable Parcours</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsable Parcours</em>' reference.
	 * @see #getResponsableParcours()
	 * @generated
	 */
	void setResponsableParcours(Parcours value);

	/**
	 * Returns the value of the '<em><b>Responsable Departement</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link portail.Departement#getResponsableDepartement <em>Responsable Departement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsable Departement</em>' reference.
	 * @see #setResponsableDepartement(Departement)
	 * @see portail.PortailPackage#getIntervenant_ResponsableDepartement()
	 * @see portail.Departement#getResponsableDepartement
	 * @model opposite="responsableDepartement"
	 * @generated
	 */
	Departement getResponsableDepartement();

	/**
	 * Sets the value of the '{@link portail.Intervenant#getResponsableDepartement <em>Responsable Departement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsable Departement</em>' reference.
	 * @see #getResponsableDepartement()
	 * @generated
	 */
	void setResponsableDepartement(Departement value);

} // Intervenant
