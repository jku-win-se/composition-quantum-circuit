/*
 * generated by Xtext 2.26.0
 */
package qubo.lang.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import qubo.lang.parser.antlr.internal.InternalQUBOParser;
import qubo.lang.services.QUBOGrammarAccess;

public class QUBOParser extends AbstractAntlrParser {

	@Inject
	private QUBOGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalQUBOParser createParser(XtextTokenStream stream) {
		return new InternalQUBOParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Qubo";
	}

	public QUBOGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(QUBOGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}