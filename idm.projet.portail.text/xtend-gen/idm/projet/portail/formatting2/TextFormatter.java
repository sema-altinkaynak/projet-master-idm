/**
 * generated by Xtext 2.25.0
 */
package idm.projet.portail.formatting2;

import com.google.inject.Inject;
import idm.projet.portail.services.TextGrammarAccess;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import portail.Departement;
import portail.Employe;
import portail.Formation;
import portail.Universite;

@SuppressWarnings("all")
public class TextFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private TextGrammarAccess _textGrammarAccess;
  
  protected void _format(final Universite universite, @Extension final IFormattableDocument document) {
    EList<Departement> _departements = universite.getDepartements();
    for (final Departement departement : _departements) {
      document.<Departement>format(departement);
    }
    EList<Employe> _employes = universite.getEmployes();
    for (final Employe employe : _employes) {
      document.<Employe>format(employe);
    }
  }
  
  protected void _format(final Departement departement, @Extension final IFormattableDocument document) {
    EList<Formation> _formations = departement.getFormations();
    for (final Formation formation : _formations) {
      document.<Formation>format(formation);
    }
  }
  
  public void format(final Object departement, final IFormattableDocument document) {
    if (departement instanceof XtextResource) {
      _format((XtextResource)departement, document);
      return;
    } else if (departement instanceof Departement) {
      _format((Departement)departement, document);
      return;
    } else if (departement instanceof Universite) {
      _format((Universite)departement, document);
      return;
    } else if (departement instanceof EObject) {
      _format((EObject)departement, document);
      return;
    } else if (departement == null) {
      _format((Void)null, document);
      return;
    } else if (departement != null) {
      _format(departement, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(departement, document).toString());
    }
  }
}