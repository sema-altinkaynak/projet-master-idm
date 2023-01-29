/**
 */
package htmlProject.impl;

import htmlProject.HtmlProjectPackage;
import htmlProject.Lien;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lien</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link htmlProject.impl.LienImpl#getAdresse <em>Adresse</em>}</li>
 *   <li>{@link htmlProject.impl.LienImpl#getType <em>Type</em>}</li>
 *   <li>{@link htmlProject.impl.LienImpl#getCouleur <em>Couleur</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LienImpl extends ElementImpl implements Lien {
	/**
	 * The default value of the '{@link #getAdresse() <em>Adresse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdresse()
	 * @generated
	 * @ordered
	 */
	protected static final String ADRESSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdresse() <em>Adresse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdresse()
	 * @generated
	 * @ordered
	 */
	protected String adresse = ADRESSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCouleur() <em>Couleur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCouleur()
	 * @generated
	 * @ordered
	 */
	protected static final String COULEUR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCouleur() <em>Couleur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCouleur()
	 * @generated
	 * @ordered
	 */
	protected String couleur = COULEUR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LienImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HtmlProjectPackage.Literals.LIEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdresse(String newAdresse) {
		String oldAdresse = adresse;
		adresse = newAdresse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlProjectPackage.LIEN__ADRESSE, oldAdresse,
					adresse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlProjectPackage.LIEN__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCouleur() {
		return couleur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCouleur(String newCouleur) {
		String oldCouleur = couleur;
		couleur = newCouleur;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HtmlProjectPackage.LIEN__COULEUR, oldCouleur,
					couleur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case HtmlProjectPackage.LIEN__ADRESSE:
			return getAdresse();
		case HtmlProjectPackage.LIEN__TYPE:
			return getType();
		case HtmlProjectPackage.LIEN__COULEUR:
			return getCouleur();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case HtmlProjectPackage.LIEN__ADRESSE:
			setAdresse((String) newValue);
			return;
		case HtmlProjectPackage.LIEN__TYPE:
			setType((String) newValue);
			return;
		case HtmlProjectPackage.LIEN__COULEUR:
			setCouleur((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case HtmlProjectPackage.LIEN__ADRESSE:
			setAdresse(ADRESSE_EDEFAULT);
			return;
		case HtmlProjectPackage.LIEN__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case HtmlProjectPackage.LIEN__COULEUR:
			setCouleur(COULEUR_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case HtmlProjectPackage.LIEN__ADRESSE:
			return ADRESSE_EDEFAULT == null ? adresse != null : !ADRESSE_EDEFAULT.equals(adresse);
		case HtmlProjectPackage.LIEN__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
		case HtmlProjectPackage.LIEN__COULEUR:
			return COULEUR_EDEFAULT == null ? couleur != null : !COULEUR_EDEFAULT.equals(couleur);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (adresse: ");
		result.append(adresse);
		result.append(", type: ");
		result.append(type);
		result.append(", couleur: ");
		result.append(couleur);
		result.append(')');
		return result.toString();
	}

} //LienImpl
