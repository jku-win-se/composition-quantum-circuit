/**
 * generated by Xtext 2.26.0
 */
package qubo.lang.formatting2;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import qubo.Matrix;
import qubo.Qubo;
import qubo.Row;
import qubo.lang.services.QUBOGrammarAccess;

@SuppressWarnings("all")
public class QUBOFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private QUBOGrammarAccess _qUBOGrammarAccess;

  protected void _format(final Qubo qubo, @Extension final IFormattableDocument document) {
    document.<Matrix>format(qubo.getMatrix());
  }

  protected void _format(final Matrix matrix, @Extension final IFormattableDocument document) {
    EList<Row> _rows = matrix.getRows();
    for (final Row row : _rows) {
      document.<Row>format(row);
    }
  }

  public void format(final Object qubo, final IFormattableDocument document) {
    if (qubo instanceof XtextResource) {
      _format((XtextResource)qubo, document);
      return;
    } else if (qubo instanceof Qubo) {
      _format((Qubo)qubo, document);
      return;
    } else if (qubo instanceof Matrix) {
      _format((Matrix)qubo, document);
      return;
    } else if (qubo instanceof EObject) {
      _format((EObject)qubo, document);
      return;
    } else if (qubo == null) {
      _format((Void)null, document);
      return;
    } else if (qubo != null) {
      _format(qubo, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(qubo, document).toString());
    }
  }
}
