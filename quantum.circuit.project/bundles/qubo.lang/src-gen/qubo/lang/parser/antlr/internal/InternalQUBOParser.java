package qubo.lang.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import qubo.lang.services.QUBOGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQUBOParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_E_INT", "RULE_E_DOUBLE", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Qubo'", "'{'", "'matrix'", "'}'", "'['", "','", "']'"
    };
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_E_DOUBLE=5;
    public static final int EOF=-1;
    public static final int RULE_ID=7;
    public static final int RULE_WS=11;
    public static final int RULE_E_INT=4;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=9;

    // delegates
    // delegators


        public InternalQUBOParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalQUBOParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalQUBOParser.tokenNames; }
    public String getGrammarFileName() { return "InternalQUBO.g"; }



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




    // $ANTLR start "entryRuleQubo"
    // InternalQUBO.g:64:1: entryRuleQubo returns [EObject current=null] : iv_ruleQubo= ruleQubo EOF ;
    public final EObject entryRuleQubo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQubo = null;


        try {
            // InternalQUBO.g:64:45: (iv_ruleQubo= ruleQubo EOF )
            // InternalQUBO.g:65:2: iv_ruleQubo= ruleQubo EOF
            {
             newCompositeNode(grammarAccess.getQuboRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQubo=ruleQubo();

            state._fsp--;

             current =iv_ruleQubo; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQubo"


    // $ANTLR start "ruleQubo"
    // InternalQUBO.g:71:1: ruleQubo returns [EObject current=null] : ( () otherlv_1= 'Qubo' otherlv_2= '{' (otherlv_3= 'matrix' ( (lv_matrix_4_0= ruleMatrix ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleQubo() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_matrix_4_0 = null;



        	enterRule();

        try {
            // InternalQUBO.g:77:2: ( ( () otherlv_1= 'Qubo' otherlv_2= '{' (otherlv_3= 'matrix' ( (lv_matrix_4_0= ruleMatrix ) ) )? otherlv_5= '}' ) )
            // InternalQUBO.g:78:2: ( () otherlv_1= 'Qubo' otherlv_2= '{' (otherlv_3= 'matrix' ( (lv_matrix_4_0= ruleMatrix ) ) )? otherlv_5= '}' )
            {
            // InternalQUBO.g:78:2: ( () otherlv_1= 'Qubo' otherlv_2= '{' (otherlv_3= 'matrix' ( (lv_matrix_4_0= ruleMatrix ) ) )? otherlv_5= '}' )
            // InternalQUBO.g:79:3: () otherlv_1= 'Qubo' otherlv_2= '{' (otherlv_3= 'matrix' ( (lv_matrix_4_0= ruleMatrix ) ) )? otherlv_5= '}'
            {
            // InternalQUBO.g:79:3: ()
            // InternalQUBO.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getQuboAccess().getQuboAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getQuboAccess().getQuboKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getQuboAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQUBO.g:94:3: (otherlv_3= 'matrix' ( (lv_matrix_4_0= ruleMatrix ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==15) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalQUBO.g:95:4: otherlv_3= 'matrix' ( (lv_matrix_4_0= ruleMatrix ) )
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getQuboAccess().getMatrixKeyword_3_0());
                    			
                    // InternalQUBO.g:99:4: ( (lv_matrix_4_0= ruleMatrix ) )
                    // InternalQUBO.g:100:5: (lv_matrix_4_0= ruleMatrix )
                    {
                    // InternalQUBO.g:100:5: (lv_matrix_4_0= ruleMatrix )
                    // InternalQUBO.g:101:6: lv_matrix_4_0= ruleMatrix
                    {

                    						newCompositeNode(grammarAccess.getQuboAccess().getMatrixMatrixParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_matrix_4_0=ruleMatrix();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getQuboRule());
                    						}
                    						set(
                    							current,
                    							"matrix",
                    							lv_matrix_4_0,
                    							"qubo.lang.QUBO.Matrix");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getQuboAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQubo"


    // $ANTLR start "entryRuleMatrix"
    // InternalQUBO.g:127:1: entryRuleMatrix returns [EObject current=null] : iv_ruleMatrix= ruleMatrix EOF ;
    public final EObject entryRuleMatrix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatrix = null;


        try {
            // InternalQUBO.g:127:47: (iv_ruleMatrix= ruleMatrix EOF )
            // InternalQUBO.g:128:2: iv_ruleMatrix= ruleMatrix EOF
            {
             newCompositeNode(grammarAccess.getMatrixRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMatrix=ruleMatrix();

            state._fsp--;

             current =iv_ruleMatrix; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMatrix"


    // $ANTLR start "ruleMatrix"
    // InternalQUBO.g:134:1: ruleMatrix returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_rows_2_0= ruleRow ) ) (otherlv_3= ',' ( (lv_rows_4_0= ruleRow ) ) )* )? otherlv_5= ']' ) ;
    public final EObject ruleMatrix() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_rows_2_0 = null;

        EObject lv_rows_4_0 = null;



        	enterRule();

        try {
            // InternalQUBO.g:140:2: ( ( () otherlv_1= '[' ( ( (lv_rows_2_0= ruleRow ) ) (otherlv_3= ',' ( (lv_rows_4_0= ruleRow ) ) )* )? otherlv_5= ']' ) )
            // InternalQUBO.g:141:2: ( () otherlv_1= '[' ( ( (lv_rows_2_0= ruleRow ) ) (otherlv_3= ',' ( (lv_rows_4_0= ruleRow ) ) )* )? otherlv_5= ']' )
            {
            // InternalQUBO.g:141:2: ( () otherlv_1= '[' ( ( (lv_rows_2_0= ruleRow ) ) (otherlv_3= ',' ( (lv_rows_4_0= ruleRow ) ) )* )? otherlv_5= ']' )
            // InternalQUBO.g:142:3: () otherlv_1= '[' ( ( (lv_rows_2_0= ruleRow ) ) (otherlv_3= ',' ( (lv_rows_4_0= ruleRow ) ) )* )? otherlv_5= ']'
            {
            // InternalQUBO.g:142:3: ()
            // InternalQUBO.g:143:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMatrixAccess().getMatrixAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getMatrixAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalQUBO.g:153:3: ( ( (lv_rows_2_0= ruleRow ) ) (otherlv_3= ',' ( (lv_rows_4_0= ruleRow ) ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalQUBO.g:154:4: ( (lv_rows_2_0= ruleRow ) ) (otherlv_3= ',' ( (lv_rows_4_0= ruleRow ) ) )*
                    {
                    // InternalQUBO.g:154:4: ( (lv_rows_2_0= ruleRow ) )
                    // InternalQUBO.g:155:5: (lv_rows_2_0= ruleRow )
                    {
                    // InternalQUBO.g:155:5: (lv_rows_2_0= ruleRow )
                    // InternalQUBO.g:156:6: lv_rows_2_0= ruleRow
                    {

                    						newCompositeNode(grammarAccess.getMatrixAccess().getRowsRowParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_rows_2_0=ruleRow();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMatrixRule());
                    						}
                    						add(
                    							current,
                    							"rows",
                    							lv_rows_2_0,
                    							"qubo.lang.QUBO.Row");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQUBO.g:173:4: (otherlv_3= ',' ( (lv_rows_4_0= ruleRow ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==18) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalQUBO.g:174:5: otherlv_3= ',' ( (lv_rows_4_0= ruleRow ) )
                    	    {
                    	    otherlv_3=(Token)match(input,18,FOLLOW_5); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getMatrixAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalQUBO.g:178:5: ( (lv_rows_4_0= ruleRow ) )
                    	    // InternalQUBO.g:179:6: (lv_rows_4_0= ruleRow )
                    	    {
                    	    // InternalQUBO.g:179:6: (lv_rows_4_0= ruleRow )
                    	    // InternalQUBO.g:180:7: lv_rows_4_0= ruleRow
                    	    {

                    	    							newCompositeNode(grammarAccess.getMatrixAccess().getRowsRowParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_rows_4_0=ruleRow();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMatrixRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"rows",
                    	    								lv_rows_4_0,
                    	    								"qubo.lang.QUBO.Row");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getMatrixAccess().getRightSquareBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMatrix"


    // $ANTLR start "entryRuleRow"
    // InternalQUBO.g:207:1: entryRuleRow returns [EObject current=null] : iv_ruleRow= ruleRow EOF ;
    public final EObject entryRuleRow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRow = null;


        try {
            // InternalQUBO.g:207:44: (iv_ruleRow= ruleRow EOF )
            // InternalQUBO.g:208:2: iv_ruleRow= ruleRow EOF
            {
             newCompositeNode(grammarAccess.getRowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRow=ruleRow();

            state._fsp--;

             current =iv_ruleRow; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRow"


    // $ANTLR start "ruleRow"
    // InternalQUBO.g:214:1: ruleRow returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_columns_2_0= ruleColumn ) ) (otherlv_3= ',' ( (lv_columns_4_0= ruleColumn ) ) )* )? otherlv_5= ']' ) ;
    public final EObject ruleRow() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_columns_2_0 = null;

        EObject lv_columns_4_0 = null;



        	enterRule();

        try {
            // InternalQUBO.g:220:2: ( ( () otherlv_1= '[' ( ( (lv_columns_2_0= ruleColumn ) ) (otherlv_3= ',' ( (lv_columns_4_0= ruleColumn ) ) )* )? otherlv_5= ']' ) )
            // InternalQUBO.g:221:2: ( () otherlv_1= '[' ( ( (lv_columns_2_0= ruleColumn ) ) (otherlv_3= ',' ( (lv_columns_4_0= ruleColumn ) ) )* )? otherlv_5= ']' )
            {
            // InternalQUBO.g:221:2: ( () otherlv_1= '[' ( ( (lv_columns_2_0= ruleColumn ) ) (otherlv_3= ',' ( (lv_columns_4_0= ruleColumn ) ) )* )? otherlv_5= ']' )
            // InternalQUBO.g:222:3: () otherlv_1= '[' ( ( (lv_columns_2_0= ruleColumn ) ) (otherlv_3= ',' ( (lv_columns_4_0= ruleColumn ) ) )* )? otherlv_5= ']'
            {
            // InternalQUBO.g:222:3: ()
            // InternalQUBO.g:223:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRowAccess().getRowAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getRowAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalQUBO.g:233:3: ( ( (lv_columns_2_0= ruleColumn ) ) (otherlv_3= ',' ( (lv_columns_4_0= ruleColumn ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_E_INT && LA5_0<=RULE_E_DOUBLE)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalQUBO.g:234:4: ( (lv_columns_2_0= ruleColumn ) ) (otherlv_3= ',' ( (lv_columns_4_0= ruleColumn ) ) )*
                    {
                    // InternalQUBO.g:234:4: ( (lv_columns_2_0= ruleColumn ) )
                    // InternalQUBO.g:235:5: (lv_columns_2_0= ruleColumn )
                    {
                    // InternalQUBO.g:235:5: (lv_columns_2_0= ruleColumn )
                    // InternalQUBO.g:236:6: lv_columns_2_0= ruleColumn
                    {

                    						newCompositeNode(grammarAccess.getRowAccess().getColumnsColumnParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_columns_2_0=ruleColumn();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRowRule());
                    						}
                    						add(
                    							current,
                    							"columns",
                    							lv_columns_2_0,
                    							"qubo.lang.QUBO.Column");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQUBO.g:253:4: (otherlv_3= ',' ( (lv_columns_4_0= ruleColumn ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==18) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalQUBO.g:254:5: otherlv_3= ',' ( (lv_columns_4_0= ruleColumn ) )
                    	    {
                    	    otherlv_3=(Token)match(input,18,FOLLOW_10); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getRowAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalQUBO.g:258:5: ( (lv_columns_4_0= ruleColumn ) )
                    	    // InternalQUBO.g:259:6: (lv_columns_4_0= ruleColumn )
                    	    {
                    	    // InternalQUBO.g:259:6: (lv_columns_4_0= ruleColumn )
                    	    // InternalQUBO.g:260:7: lv_columns_4_0= ruleColumn
                    	    {

                    	    							newCompositeNode(grammarAccess.getRowAccess().getColumnsColumnParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_columns_4_0=ruleColumn();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRowRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"columns",
                    	    								lv_columns_4_0,
                    	    								"qubo.lang.QUBO.Column");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getRowAccess().getRightSquareBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRow"


    // $ANTLR start "entryRuleColumn"
    // InternalQUBO.g:287:1: entryRuleColumn returns [EObject current=null] : iv_ruleColumn= ruleColumn EOF ;
    public final EObject entryRuleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumn = null;


        try {
            // InternalQUBO.g:287:47: (iv_ruleColumn= ruleColumn EOF )
            // InternalQUBO.g:288:2: iv_ruleColumn= ruleColumn EOF
            {
             newCompositeNode(grammarAccess.getColumnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColumn=ruleColumn();

            state._fsp--;

             current =iv_ruleColumn; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColumn"


    // $ANTLR start "ruleColumn"
    // InternalQUBO.g:294:1: ruleColumn returns [EObject current=null] : ( () ( (lv_value_1_0= ruleEDouble ) ) ) ;
    public final EObject ruleColumn() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalQUBO.g:300:2: ( ( () ( (lv_value_1_0= ruleEDouble ) ) ) )
            // InternalQUBO.g:301:2: ( () ( (lv_value_1_0= ruleEDouble ) ) )
            {
            // InternalQUBO.g:301:2: ( () ( (lv_value_1_0= ruleEDouble ) ) )
            // InternalQUBO.g:302:3: () ( (lv_value_1_0= ruleEDouble ) )
            {
            // InternalQUBO.g:302:3: ()
            // InternalQUBO.g:303:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getColumnAccess().getColumnAction_0(),
            					current);
            			

            }

            // InternalQUBO.g:309:3: ( (lv_value_1_0= ruleEDouble ) )
            // InternalQUBO.g:310:4: (lv_value_1_0= ruleEDouble )
            {
            // InternalQUBO.g:310:4: (lv_value_1_0= ruleEDouble )
            // InternalQUBO.g:311:5: lv_value_1_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getColumnAccess().getValueEDoubleParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColumnRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"qubo.lang.QUBO.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColumn"


    // $ANTLR start "entryRuleEDouble"
    // InternalQUBO.g:332:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalQUBO.g:332:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalQUBO.g:333:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalQUBO.g:339:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_E_INT_0=null;
        Token this_E_DOUBLE_1=null;


        	enterRule();

        try {
            // InternalQUBO.g:345:2: ( (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE ) )
            // InternalQUBO.g:346:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
            {
            // InternalQUBO.g:346:2: (this_E_INT_0= RULE_E_INT | this_E_DOUBLE_1= RULE_E_DOUBLE )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_E_INT) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_E_DOUBLE) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalQUBO.g:347:3: this_E_INT_0= RULE_E_INT
                    {
                    this_E_INT_0=(Token)match(input,RULE_E_INT,FOLLOW_2); 

                    			current.merge(this_E_INT_0);
                    		

                    			newLeafNode(this_E_INT_0, grammarAccess.getEDoubleAccess().getE_INTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalQUBO.g:355:3: this_E_DOUBLE_1= RULE_E_DOUBLE
                    {
                    this_E_DOUBLE_1=(Token)match(input,RULE_E_DOUBLE,FOLLOW_2); 

                    			current.merge(this_E_DOUBLE_1);
                    		

                    			newLeafNode(this_E_DOUBLE_1, grammarAccess.getEDoubleAccess().getE_DOUBLETerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEDouble"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000030L});

}