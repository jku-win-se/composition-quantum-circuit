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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalQUBOParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Qubo'", "'{'", "'matrix'", "'}'", "'['", "','", "']'", "'-'", "'.'", "'E'", "'e'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=4;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

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
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQuboRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQubo=ruleQubo();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQubo; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getQuboAccess().getQuboAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getQuboAccess().getQuboKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,12,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getQuboAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalQUBO.g:94:3: (otherlv_3= 'matrix' ( (lv_matrix_4_0= ruleMatrix ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalQUBO.g:95:4: otherlv_3= 'matrix' ( (lv_matrix_4_0= ruleMatrix ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getQuboAccess().getMatrixKeyword_3_0());
                      			
                    }
                    // InternalQUBO.g:99:4: ( (lv_matrix_4_0= ruleMatrix ) )
                    // InternalQUBO.g:100:5: (lv_matrix_4_0= ruleMatrix )
                    {
                    // InternalQUBO.g:100:5: (lv_matrix_4_0= ruleMatrix )
                    // InternalQUBO.g:101:6: lv_matrix_4_0= ruleMatrix
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getQuboAccess().getMatrixMatrixParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_6);
                    lv_matrix_4_0=ruleMatrix();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getQuboRule());
                      						}
                      						set(
                      							current,
                      							"matrix",
                      							lv_matrix_4_0,
                      							"at.jku.se.qubo.lang.QUBO.Matrix");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getQuboAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMatrixRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMatrix=ruleMatrix();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMatrix; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getMatrixAccess().getMatrixAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,15,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMatrixAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalQUBO.g:153:3: ( ( (lv_rows_2_0= ruleRow ) ) (otherlv_3= ',' ( (lv_rows_4_0= ruleRow ) ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
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
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMatrixAccess().getRowsRowParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_8);
                    lv_rows_2_0=ruleRow();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMatrixRule());
                      						}
                      						add(
                      							current,
                      							"rows",
                      							lv_rows_2_0,
                      							"at.jku.se.qubo.lang.QUBO.Row");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalQUBO.g:173:4: (otherlv_3= ',' ( (lv_rows_4_0= ruleRow ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==16) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalQUBO.g:174:5: otherlv_3= ',' ( (lv_rows_4_0= ruleRow ) )
                    	    {
                    	    otherlv_3=(Token)match(input,16,FOLLOW_5); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getMatrixAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalQUBO.g:178:5: ( (lv_rows_4_0= ruleRow ) )
                    	    // InternalQUBO.g:179:6: (lv_rows_4_0= ruleRow )
                    	    {
                    	    // InternalQUBO.g:179:6: (lv_rows_4_0= ruleRow )
                    	    // InternalQUBO.g:180:7: lv_rows_4_0= ruleRow
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getMatrixAccess().getRowsRowParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_8);
                    	    lv_rows_4_0=ruleRow();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getMatrixRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"rows",
                    	      								lv_rows_4_0,
                    	      								"at.jku.se.qubo.lang.QUBO.Row");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

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

            otherlv_5=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getMatrixAccess().getRightSquareBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRowRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRow=ruleRow();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRow; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalQUBO.g:214:1: ruleRow returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_columns_2_0= ruleColumn ) ) (otherlv_3= ',' ( (lv_columns_4_0= ruleColumn ) ) )* )? ( ( ']' )=>otherlv_5= ']' ) ) ;
    public final EObject ruleRow() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_columns_2_0 = null;

        EObject lv_columns_4_0 = null;



        	enterRule();

        try {
            // InternalQUBO.g:220:2: ( ( () otherlv_1= '[' ( ( (lv_columns_2_0= ruleColumn ) ) (otherlv_3= ',' ( (lv_columns_4_0= ruleColumn ) ) )* )? ( ( ']' )=>otherlv_5= ']' ) ) )
            // InternalQUBO.g:221:2: ( () otherlv_1= '[' ( ( (lv_columns_2_0= ruleColumn ) ) (otherlv_3= ',' ( (lv_columns_4_0= ruleColumn ) ) )* )? ( ( ']' )=>otherlv_5= ']' ) )
            {
            // InternalQUBO.g:221:2: ( () otherlv_1= '[' ( ( (lv_columns_2_0= ruleColumn ) ) (otherlv_3= ',' ( (lv_columns_4_0= ruleColumn ) ) )* )? ( ( ']' )=>otherlv_5= ']' ) )
            // InternalQUBO.g:222:3: () otherlv_1= '[' ( ( (lv_columns_2_0= ruleColumn ) ) (otherlv_3= ',' ( (lv_columns_4_0= ruleColumn ) ) )* )? ( ( ']' )=>otherlv_5= ']' )
            {
            // InternalQUBO.g:222:3: ()
            // InternalQUBO.g:223:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getRowAccess().getRowAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,15,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRowAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalQUBO.g:233:3: ( ( (lv_columns_2_0= ruleColumn ) ) (otherlv_3= ',' ( (lv_columns_4_0= ruleColumn ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT||LA5_0==16||(LA5_0>=18 && LA5_0<=19)) ) {
                alt5=1;
            }
            else if ( (LA5_0==17) ) {
                int LA5_2 = input.LA(2);

                if ( (true) ) {
                    alt5=1;
                }
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
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRowAccess().getColumnsColumnParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_8);
                    lv_columns_2_0=ruleColumn();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getRowRule());
                      						}
                      						add(
                      							current,
                      							"columns",
                      							lv_columns_2_0,
                      							"at.jku.se.qubo.lang.QUBO.Column");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalQUBO.g:253:4: (otherlv_3= ',' ( (lv_columns_4_0= ruleColumn ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==16) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalQUBO.g:254:5: otherlv_3= ',' ( (lv_columns_4_0= ruleColumn ) )
                    	    {
                    	    otherlv_3=(Token)match(input,16,FOLLOW_9); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getRowAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalQUBO.g:258:5: ( (lv_columns_4_0= ruleColumn ) )
                    	    // InternalQUBO.g:259:6: (lv_columns_4_0= ruleColumn )
                    	    {
                    	    // InternalQUBO.g:259:6: (lv_columns_4_0= ruleColumn )
                    	    // InternalQUBO.g:260:7: lv_columns_4_0= ruleColumn
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getRowAccess().getColumnsColumnParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_8);
                    	    lv_columns_4_0=ruleColumn();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getRowRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"columns",
                    	      								lv_columns_4_0,
                    	      								"at.jku.se.qubo.lang.QUBO.Column");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

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

            // InternalQUBO.g:279:3: ( ( ']' )=>otherlv_5= ']' )
            // InternalQUBO.g:280:4: ( ']' )=>otherlv_5= ']'
            {
            otherlv_5=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_5, grammarAccess.getRowAccess().getRightSquareBracketKeyword_3());
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRow"


    // $ANTLR start "entryRuleColumn"
    // InternalQUBO.g:290:1: entryRuleColumn returns [EObject current=null] : iv_ruleColumn= ruleColumn EOF ;
    public final EObject entryRuleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumn = null;


        try {
            // InternalQUBO.g:290:47: (iv_ruleColumn= ruleColumn EOF )
            // InternalQUBO.g:291:2: iv_ruleColumn= ruleColumn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getColumnRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleColumn=ruleColumn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleColumn; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalQUBO.g:297:1: ruleColumn returns [EObject current=null] : ( () ( (lv_value_1_0= ruleEDoubleDefinition ) )? ) ;
    public final EObject ruleColumn() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalQUBO.g:303:2: ( ( () ( (lv_value_1_0= ruleEDoubleDefinition ) )? ) )
            // InternalQUBO.g:304:2: ( () ( (lv_value_1_0= ruleEDoubleDefinition ) )? )
            {
            // InternalQUBO.g:304:2: ( () ( (lv_value_1_0= ruleEDoubleDefinition ) )? )
            // InternalQUBO.g:305:3: () ( (lv_value_1_0= ruleEDoubleDefinition ) )?
            {
            // InternalQUBO.g:305:3: ()
            // InternalQUBO.g:306:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getColumnAccess().getColumnAction_0(),
              					current);
              			
            }

            }

            // InternalQUBO.g:312:3: ( (lv_value_1_0= ruleEDoubleDefinition ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT||(LA6_0>=18 && LA6_0<=19)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalQUBO.g:313:4: (lv_value_1_0= ruleEDoubleDefinition )
                    {
                    // InternalQUBO.g:313:4: (lv_value_1_0= ruleEDoubleDefinition )
                    // InternalQUBO.g:314:5: lv_value_1_0= ruleEDoubleDefinition
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getColumnAccess().getValueEDoubleDefinitionParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_value_1_0=ruleEDoubleDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getColumnRule());
                      					}
                      					set(
                      						current,
                      						"value",
                      						lv_value_1_0,
                      						"at.jku.se.qubo.lang.QUBO.EDoubleDefinition");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleColumn"


    // $ANTLR start "entryRuleEDoubleDefinition"
    // InternalQUBO.g:335:1: entryRuleEDoubleDefinition returns [String current=null] : iv_ruleEDoubleDefinition= ruleEDoubleDefinition EOF ;
    public final String entryRuleEDoubleDefinition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDoubleDefinition = null;


        try {
            // InternalQUBO.g:335:57: (iv_ruleEDoubleDefinition= ruleEDoubleDefinition EOF )
            // InternalQUBO.g:336:2: iv_ruleEDoubleDefinition= ruleEDoubleDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEDoubleDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEDoubleDefinition=ruleEDoubleDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEDoubleDefinition.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEDoubleDefinition"


    // $ANTLR start "ruleEDoubleDefinition"
    // InternalQUBO.g:342:1: ruleEDoubleDefinition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EInt_0= ruleEInt | this_EDouble_1= ruleEDouble ) ;
    public final AntlrDatatypeRuleToken ruleEDoubleDefinition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_EInt_0 = null;

        AntlrDatatypeRuleToken this_EDouble_1 = null;



        	enterRule();

        try {
            // InternalQUBO.g:348:2: ( (this_EInt_0= ruleEInt | this_EDouble_1= ruleEDouble ) )
            // InternalQUBO.g:349:2: (this_EInt_0= ruleEInt | this_EDouble_1= ruleEDouble )
            {
            // InternalQUBO.g:349:2: (this_EInt_0= ruleEInt | this_EDouble_1= ruleEDouble )
            int alt7=2;
            switch ( input.LA(1) ) {
            case 18:
                {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==RULE_INT) ) {
                    int LA7_2 = input.LA(3);

                    if ( (LA7_2==19) ) {
                        alt7=2;
                    }
                    else if ( (LA7_2==EOF||(LA7_2>=16 && LA7_2<=17)) ) {
                        alt7=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA7_1==19) ) {
                    alt7=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA7_2 = input.LA(2);

                if ( (LA7_2==19) ) {
                    alt7=2;
                }
                else if ( (LA7_2==EOF||(LA7_2>=16 && LA7_2<=17)) ) {
                    alt7=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 2, input);

                    throw nvae;
                }
                }
                break;
            case 19:
                {
                alt7=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalQUBO.g:350:3: this_EInt_0= ruleEInt
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEDoubleDefinitionAccess().getEIntParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EInt_0=ruleEInt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_EInt_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalQUBO.g:361:3: this_EDouble_1= ruleEDouble
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEDoubleDefinitionAccess().getEDoubleParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EDouble_1=ruleEDouble();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_EDouble_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEDoubleDefinition"


    // $ANTLR start "entryRuleEInt"
    // InternalQUBO.g:375:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalQUBO.g:375:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalQUBO.g:376:2: iv_ruleEInt= ruleEInt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEIntRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEInt.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalQUBO.g:382:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalQUBO.g:388:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalQUBO.g:389:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalQUBO.g:389:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalQUBO.g:390:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalQUBO.g:390:3: (kw= '-' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalQUBO.g:391:4: kw= '-'
                    {
                    kw=(Token)match(input,18,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                      			
                    }

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_1);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEDouble"
    // InternalQUBO.g:408:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalQUBO.g:408:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalQUBO.g:409:2: iv_ruleEDouble= ruleEDouble EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEDoubleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEDouble.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalQUBO.g:415:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalQUBO.g:421:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalQUBO.g:422:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalQUBO.g:422:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalQUBO.g:423:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalQUBO.g:423:3: (kw= '-' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalQUBO.g:424:4: kw= '-'
                    {
                    kw=(Token)match(input,18,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                      			
                    }

                    }
                    break;

            }

            // InternalQUBO.g:430:3: (this_INT_1= RULE_INT )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalQUBO.g:431:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_INT_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                      			
                    }

                    }
                    break;

            }

            kw=(Token)match(input,19,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
              		
            }
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_3);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
              		
            }
            // InternalQUBO.g:451:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=20 && LA13_0<=21)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalQUBO.g:452:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalQUBO.g:452:4: (kw= 'E' | kw= 'e' )
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==20) ) {
                        alt11=1;
                    }
                    else if ( (LA11_0==21) ) {
                        alt11=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 0, input);

                        throw nvae;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalQUBO.g:453:5: kw= 'E'
                            {
                            kw=(Token)match(input,20,FOLLOW_14); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalQUBO.g:459:5: kw= 'e'
                            {
                            kw=(Token)match(input,21,FOLLOW_14); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalQUBO.g:465:4: (kw= '-' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==18) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalQUBO.g:466:5: kw= '-'
                            {
                            kw=(Token)match(input,18,FOLLOW_10); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					current.merge(kw);
                              					newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1());
                              				
                            }

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_INT_7);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEDouble"

    // $ANTLR start synpred1_InternalQUBO
    public final void synpred1_InternalQUBO_fragment() throws RecognitionException {   
        // InternalQUBO.g:280:4: ( ']' )
        // InternalQUBO.g:280:5: ']'
        {
        match(input,17,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalQUBO

    // Delegated rules

    public final boolean synpred1_InternalQUBO() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalQUBO_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000F0010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040010L});

}