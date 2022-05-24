/*
 * generated by Xtext 2.26.0
 */
grammar InternalQUBO;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package at.jku.se.qubo.lang.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package at.jku.se.qubo.lang.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import at.jku.se.qubo.lang.services.QUBOGrammarAccess;

}

@parser::members {

 	private QUBOGrammarAccess grammarAccess;

    public InternalQUBOParser(TokenStream input, QUBOGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Qubo";
   	}

   	@Override
   	protected QUBOGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleQubo
entryRuleQubo returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getQuboRule()); }
	iv_ruleQubo=ruleQubo
	{ $current=$iv_ruleQubo.current; }
	EOF;

// Rule Qubo
ruleQubo returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getQuboAccess().getQuboAction_0(),
					$current);
			}
		)
		otherlv_1='Qubo'
		{
			newLeafNode(otherlv_1, grammarAccess.getQuboAccess().getQuboKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getQuboAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			otherlv_3='matrix'
			{
				newLeafNode(otherlv_3, grammarAccess.getQuboAccess().getMatrixKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getQuboAccess().getMatrixMatrixParserRuleCall_3_1_0());
					}
					lv_matrix_4_0=ruleMatrix
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getQuboRule());
						}
						set(
							$current,
							"matrix",
							lv_matrix_4_0,
							"at.jku.se.qubo.lang.QUBO.Matrix");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getQuboAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleMatrix
entryRuleMatrix returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMatrixRule()); }
	iv_ruleMatrix=ruleMatrix
	{ $current=$iv_ruleMatrix.current; }
	EOF;

// Rule Matrix
ruleMatrix returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getMatrixAccess().getMatrixAction_0(),
					$current);
			}
		)
		otherlv_1='['
		{
			newLeafNode(otherlv_1, grammarAccess.getMatrixAccess().getLeftSquareBracketKeyword_1());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getMatrixAccess().getRowsRowParserRuleCall_2_0_0());
					}
					lv_rows_2_0=ruleRow
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMatrixRule());
						}
						add(
							$current,
							"rows",
							lv_rows_2_0,
							"at.jku.se.qubo.lang.QUBO.Row");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_3=','
				{
					newLeafNode(otherlv_3, grammarAccess.getMatrixAccess().getCommaKeyword_2_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getMatrixAccess().getRowsRowParserRuleCall_2_1_1_0());
						}
						lv_rows_4_0=ruleRow
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getMatrixRule());
							}
							add(
								$current,
								"rows",
								lv_rows_4_0,
								"at.jku.se.qubo.lang.QUBO.Row");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		otherlv_5=']'
		{
			newLeafNode(otherlv_5, grammarAccess.getMatrixAccess().getRightSquareBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleRow
entryRuleRow returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRowRule()); }
	iv_ruleRow=ruleRow
	{ $current=$iv_ruleRow.current; }
	EOF;

// Rule Row
ruleRow returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getRowAccess().getRowAction_0(),
					$current);
			}
		)
		otherlv_1='['
		{
			newLeafNode(otherlv_1, grammarAccess.getRowAccess().getLeftSquareBracketKeyword_1());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getRowAccess().getColumnsColumnParserRuleCall_2_0_0());
					}
					lv_columns_2_0=ruleColumn
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRowRule());
						}
						add(
							$current,
							"columns",
							lv_columns_2_0,
							"at.jku.se.qubo.lang.QUBO.Column");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_3=','
				{
					newLeafNode(otherlv_3, grammarAccess.getRowAccess().getCommaKeyword_2_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getRowAccess().getColumnsColumnParserRuleCall_2_1_1_0());
						}
						lv_columns_4_0=ruleColumn
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getRowRule());
							}
							add(
								$current,
								"columns",
								lv_columns_4_0,
								"at.jku.se.qubo.lang.QUBO.Column");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		(
			(']')=>
			otherlv_5=']'
			{
				newLeafNode(otherlv_5, grammarAccess.getRowAccess().getRightSquareBracketKeyword_3());
			}
		)
	)
;

// Entry rule entryRuleColumn
entryRuleColumn returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getColumnRule()); }
	iv_ruleColumn=ruleColumn
	{ $current=$iv_ruleColumn.current; }
	EOF;

// Rule Column
ruleColumn returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getColumnAccess().getColumnAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getColumnAccess().getValueEDoubleDefinitionParserRuleCall_1_0());
				}
				lv_value_1_0=ruleEDoubleDefinition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getColumnRule());
					}
					set(
						$current,
						"value",
						lv_value_1_0,
						"at.jku.se.qubo.lang.QUBO.EDoubleDefinition");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;

// Entry rule entryRuleEDoubleDefinition
entryRuleEDoubleDefinition returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEDoubleDefinitionRule()); }
	iv_ruleEDoubleDefinition=ruleEDoubleDefinition
	{ $current=$iv_ruleEDoubleDefinition.current.getText(); }
	EOF;

// Rule EDoubleDefinition
ruleEDoubleDefinition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getEDoubleDefinitionAccess().getEIntParserRuleCall_0());
		}
		this_EInt_0=ruleEInt
		{
			$current.merge(this_EInt_0);
		}
		{
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getEDoubleDefinitionAccess().getEDoubleParserRuleCall_1());
		}
		this_EDouble_1=ruleEDouble
		{
			$current.merge(this_EDouble_1);
		}
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleEInt
entryRuleEInt returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEIntRule()); }
	iv_ruleEInt=ruleEInt
	{ $current=$iv_ruleEInt.current.getText(); }
	EOF;

// Rule EInt
ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			kw='-'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
			}
		)?
		this_INT_1=RULE_INT
		{
			$current.merge(this_INT_1);
		}
		{
			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleEDouble
entryRuleEDouble returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEDoubleRule()); }
	iv_ruleEDouble=ruleEDouble
	{ $current=$iv_ruleEDouble.current.getText(); }
	EOF;

// Rule EDouble
ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			kw='-'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
			}
		)?
		(
			this_INT_1=RULE_INT
			{
				$current.merge(this_INT_1);
			}
			{
				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
			}
		)?
		kw='.'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
		}
		this_INT_3=RULE_INT
		{
			$current.merge(this_INT_3);
		}
		{
			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
		}
		(
			(
				kw='E'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
				}
				    |
				kw='e'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
				}
			)
			(
				kw='-'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1());
				}
			)?
			this_INT_7=RULE_INT
			{
				$current.merge(this_INT_7);
			}
			{
				newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2());
			}
		)?
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;