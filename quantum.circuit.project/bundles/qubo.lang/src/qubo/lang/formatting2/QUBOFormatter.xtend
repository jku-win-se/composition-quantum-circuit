/*
 * generated by Xtext 2.26.0
 */
package qubo.lang.formatting2

import qubo.lang.services.QUBOGrammarAccess
import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import qubo.Qubo
import qubo.Matrix

class QUBOFormatter extends AbstractFormatter2 {
	
	@Inject extension QUBOGrammarAccess

	def dispatch void format(Qubo qubo, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		qubo.matrix.format
	}

	def dispatch void format(Matrix matrix, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (row : matrix.rows) {
			row.format
		}
	}
	
	// TODO: implement for Row
}