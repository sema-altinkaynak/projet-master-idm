/**
 */
package portail;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semestre</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link portail.Semestre#getName <em>Name</em>}</li>
 *   <li>{@link portail.Semestre#getDateDebut <em>Date Debut</em>}</li>
 *   <li>{@link portail.Semestre#getDateFin <em>Date Fin</em>}</li>
 *   <li>{@link portail.Semestre#getUeFacultatives <em>Ue Facultatives</em>}</li>
 *   <li>{@link portail.Semestre#getUeObligatoires <em>Ue Obligatoires</em>}</li>
 * </ul>
 *
 * @see portail.PortailPackage#getSemestre()
 * @model
 * @generated
 */
public interface Semestre extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(int)
	 * @see portail.PortailPackage#getSemestre_Name()
	 * @model
	 * @generated
	 */
	int getName();

	/**
	 * Sets the value of the '{@link portail.Semestre#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(int value);

	/**
	 * Returns the value of the '<em><b>Date Debut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Debut</em>' attribute.
	 * @see #setDateDebut(String)
	 * @see portail.PortailPackage#getSemestre_DateDebut()
	 * @model
	 * @generated
	 */
	String getDateDebut();

	/**
	 * Sets the value of the '{@link portail.Semestre#getDateDebut <em>Date Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Debut</em>' attribute.
	 * @see #getDateDebut()
	 * @generated
	 */
	void setDateDebut(String value);

	/**
	 * Returns the value of the '<em><b>Date Fin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Fin</em>' attribute.
	 * @see #setDateFin(String)
	 * @see portail.PortailPackage#getSemestre_DateFin()
	 * @model
	 * @generated
	 */
	String getDateFin();

	/**
	 * Sets the value of the '{@link portail.Semestre#getDateFin <em>Date Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Fin</em>' attribute.
	 * @see #getDateFin()
	 * @generated
	 */
	void setDateFin(String value);

	/**
	 * Returns the value of the '<em><b>Ue Facultatives</b></em>' reference list.
	 * The list contents are of type {@link portail.UE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ue Facultatives</em>' reference list.
	 * @see portail.PortailPackage#getSemestre_UeFacultatives()
	 * @model
	 * @generated
	 */
	EList<UE> getUeFacultatives();

	/**
	 * Returns the value of the '<em><b>Ue Obligatoires</b></em>' reference list.
	 * The list contents are of type {@link portail.UE}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ue Obligatoires</em>' reference list.
	 * @see portail.PortailPackage#getSemestre_UeObligatoires()
	 * @model required="true"
	 * @generated
	 */
	EList<UE> getUeObligatoires();

} // Semestre
