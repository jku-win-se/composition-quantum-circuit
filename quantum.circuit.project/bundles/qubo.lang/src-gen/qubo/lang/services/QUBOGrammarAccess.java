/*
 * generated by Xtext 2.26.0
 */
package qubo.lang.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class QUBOGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class QuboElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "qubo.lang.QUBO.Qubo");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cQuboAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cQuboKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cMatrixKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cMatrixAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cMatrixMatrixParserRuleCall_3_1_0 = (RuleCall)cMatrixAssignment_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Qubo returns Qubo:
		//    {Qubo}
		//    'Qubo'
		//    '{'
		//        ('matrix' matrix=Matrix)?
		//    '}';
		@Override public ParserRule getRule() { return rule; }
		
		//{Qubo}
		//'Qubo'
		//'{'
		//    ('matrix' matrix=Matrix)?
		//'}'
		public Group getGroup() { return cGroup; }
		
		//{Qubo}
		public Action getQuboAction_0() { return cQuboAction_0; }
		
		//'Qubo'
		public Keyword getQuboKeyword_1() { return cQuboKeyword_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//('matrix' matrix=Matrix)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'matrix'
		public Keyword getMatrixKeyword_3_0() { return cMatrixKeyword_3_0; }
		
		//matrix=Matrix
		public Assignment getMatrixAssignment_3_1() { return cMatrixAssignment_3_1; }
		
		//Matrix
		public RuleCall getMatrixMatrixParserRuleCall_3_1_0() { return cMatrixMatrixParserRuleCall_3_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class MatrixElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "qubo.lang.QUBO.Matrix");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMatrixAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLeftSquareBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Assignment cRowsAssignment_2_0 = (Assignment)cGroup_2.eContents().get(0);
		private final RuleCall cRowsRowParserRuleCall_2_0_0 = (RuleCall)cRowsAssignment_2_0.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cGroup_2.eContents().get(1);
		private final Keyword cCommaKeyword_2_1_0 = (Keyword)cGroup_2_1.eContents().get(0);
		private final Assignment cRowsAssignment_2_1_1 = (Assignment)cGroup_2_1.eContents().get(1);
		private final RuleCall cRowsRowParserRuleCall_2_1_1_0 = (RuleCall)cRowsAssignment_2_1_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Matrix returns Matrix:
		//    {Matrix}
		//    '['
		//        (rows+=Row ( "," rows+=Row)*)?
		//    ']';
		@Override public ParserRule getRule() { return rule; }
		
		//{Matrix}
		//'['
		//    (rows+=Row ( "," rows+=Row)*)?
		//']'
		public Group getGroup() { return cGroup; }
		
		//{Matrix}
		public Action getMatrixAction_0() { return cMatrixAction_0; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_1() { return cLeftSquareBracketKeyword_1; }
		
		//(rows+=Row ( "," rows+=Row)*)?
		public Group getGroup_2() { return cGroup_2; }
		
		//rows+=Row
		public Assignment getRowsAssignment_2_0() { return cRowsAssignment_2_0; }
		
		//Row
		public RuleCall getRowsRowParserRuleCall_2_0_0() { return cRowsRowParserRuleCall_2_0_0; }
		
		//( "," rows+=Row)*
		public Group getGroup_2_1() { return cGroup_2_1; }
		
		//","
		public Keyword getCommaKeyword_2_1_0() { return cCommaKeyword_2_1_0; }
		
		//rows+=Row
		public Assignment getRowsAssignment_2_1_1() { return cRowsAssignment_2_1_1; }
		
		//Row
		public RuleCall getRowsRowParserRuleCall_2_1_1_0() { return cRowsRowParserRuleCall_2_1_1_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_3() { return cRightSquareBracketKeyword_3; }
	}
	public class RowElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "qubo.lang.QUBO.Row");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cRowAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLeftSquareBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Assignment cColumnsAssignment_2_0 = (Assignment)cGroup_2.eContents().get(0);
		private final RuleCall cColumnsColumnParserRuleCall_2_0_0 = (RuleCall)cColumnsAssignment_2_0.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cGroup_2.eContents().get(1);
		private final Keyword cCommaKeyword_2_1_0 = (Keyword)cGroup_2_1.eContents().get(0);
		private final Assignment cColumnsAssignment_2_1_1 = (Assignment)cGroup_2_1.eContents().get(1);
		private final RuleCall cColumnsColumnParserRuleCall_2_1_1_0 = (RuleCall)cColumnsAssignment_2_1_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Row returns Row:
		//    {Row}
		//    '['
		//        (columns+=Column ( "," columns+=Column)* )?
		//    ']';
		@Override public ParserRule getRule() { return rule; }
		
		//{Row}
		//'['
		//    (columns+=Column ( "," columns+=Column)* )?
		//']'
		public Group getGroup() { return cGroup; }
		
		//{Row}
		public Action getRowAction_0() { return cRowAction_0; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_1() { return cLeftSquareBracketKeyword_1; }
		
		//(columns+=Column ( "," columns+=Column)* )?
		public Group getGroup_2() { return cGroup_2; }
		
		//columns+=Column
		public Assignment getColumnsAssignment_2_0() { return cColumnsAssignment_2_0; }
		
		//Column
		public RuleCall getColumnsColumnParserRuleCall_2_0_0() { return cColumnsColumnParserRuleCall_2_0_0; }
		
		//( "," columns+=Column)*
		public Group getGroup_2_1() { return cGroup_2_1; }
		
		//","
		public Keyword getCommaKeyword_2_1_0() { return cCommaKeyword_2_1_0; }
		
		//columns+=Column
		public Assignment getColumnsAssignment_2_1_1() { return cColumnsAssignment_2_1_1; }
		
		//Column
		public RuleCall getColumnsColumnParserRuleCall_2_1_1_0() { return cColumnsColumnParserRuleCall_2_1_1_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_3() { return cRightSquareBracketKeyword_3; }
	}
	public class ColumnElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "qubo.lang.QUBO.Column");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cColumnAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueEDoubleParserRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		
		//Column returns Column:
		//    {Column}
		//    (value=EDouble)
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//{Column}
		//(value=EDouble)
		public Group getGroup() { return cGroup; }
		
		//{Column}
		public Action getColumnAction_0() { return cColumnAction_0; }
		
		//(value=EDouble)
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }
		
		//EDouble
		public RuleCall getValueEDoubleParserRuleCall_1_0() { return cValueEDoubleParserRuleCall_1_0; }
	}
	public class EDoubleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "qubo.lang.QUBO.EDouble");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cE_INTTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cE_DOUBLETerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EDouble returns ecore::EDouble:
		//    E_INT | E_DOUBLE
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//E_INT | E_DOUBLE
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//E_INT
		public RuleCall getE_INTTerminalRuleCall_0() { return cE_INTTerminalRuleCall_0; }
		
		//E_DOUBLE
		public RuleCall getE_DOUBLETerminalRuleCall_1() { return cE_DOUBLETerminalRuleCall_1; }
	}
	
	
	private final QuboElements pQubo;
	private final MatrixElements pMatrix;
	private final RowElements pRow;
	private final ColumnElements pColumn;
	private final EDoubleElements pEDouble;
	private final TerminalRule tE_INT;
	private final TerminalRule tE_DOUBLE;
	private final TerminalRule tINT;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public QUBOGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pQubo = new QuboElements();
		this.pMatrix = new MatrixElements();
		this.pRow = new RowElements();
		this.pColumn = new ColumnElements();
		this.pEDouble = new EDoubleElements();
		this.tE_INT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "qubo.lang.QUBO.E_INT");
		this.tE_DOUBLE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "qubo.lang.QUBO.E_DOUBLE");
		this.tINT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "qubo.lang.QUBO.INT");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("qubo.lang.QUBO".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Qubo returns Qubo:
	//    {Qubo}
	//    'Qubo'
	//    '{'
	//        ('matrix' matrix=Matrix)?
	//    '}';
	public QuboElements getQuboAccess() {
		return pQubo;
	}
	
	public ParserRule getQuboRule() {
		return getQuboAccess().getRule();
	}
	
	//Matrix returns Matrix:
	//    {Matrix}
	//    '['
	//        (rows+=Row ( "," rows+=Row)*)?
	//    ']';
	public MatrixElements getMatrixAccess() {
		return pMatrix;
	}
	
	public ParserRule getMatrixRule() {
		return getMatrixAccess().getRule();
	}
	
	//Row returns Row:
	//    {Row}
	//    '['
	//        (columns+=Column ( "," columns+=Column)* )?
	//    ']';
	public RowElements getRowAccess() {
		return pRow;
	}
	
	public ParserRule getRowRule() {
		return getRowAccess().getRule();
	}
	
	//Column returns Column:
	//    {Column}
	//    (value=EDouble)
	//    ;
	public ColumnElements getColumnAccess() {
		return pColumn;
	}
	
	public ParserRule getColumnRule() {
		return getColumnAccess().getRule();
	}
	
	//EDouble returns ecore::EDouble:
	//    E_INT | E_DOUBLE
	//    ;
	public EDoubleElements getEDoubleAccess() {
		return pEDouble;
	}
	
	public ParserRule getEDoubleRule() {
		return getEDoubleAccess().getRule();
	}
	
	//terminal E_INT:
	//    '-'? INT
	//    ;
	public TerminalRule getE_INTRule() {
		return tE_INT;
	}
	
	//terminal E_DOUBLE:
	//    '-'? INT ('.' INT+)? (('E'|'e') ('+'|'-')? INT)?
	//    ;
	public TerminalRule getE_DOUBLERule() {
		return tE_DOUBLE;
	}
	
	///**
	// * The digit of an integer can not be 0, unless it is 0 itself.
	// */
	// @Override
	//terminal INT returns ecore::EInt:
	//    ('0' |  (('1'..'9') ('0'..'9')*))
	//;
	public TerminalRule getINTRule() {
		return tINT;
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}