package at.jku.se.qubo.lang.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import at.jku.se.qubo.lang.services.QUBOGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQUBOParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_E_INT", "RULE_E_DOUBLE", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Qubo'", "'{'", "'}'", "'matrix'", "'['", "']'", "','"
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

    	public void setGrammarAccess(QUBOGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleQubo"
    // InternalQUBO.g:53:1: entryRuleQubo : ruleQubo EOF ;
    public final void entryRuleQubo() throws RecognitionException {
        try {
            // InternalQUBO.g:54:1: ( ruleQubo EOF )
            // InternalQUBO.g:55:1: ruleQubo EOF
            {
             before(grammarAccess.getQuboRule()); 
            pushFollow(FOLLOW_1);
            ruleQubo();

            state._fsp--;

             after(grammarAccess.getQuboRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQubo"


    // $ANTLR start "ruleQubo"
    // InternalQUBO.g:62:1: ruleQubo : ( ( rule__Qubo__Group__0 ) ) ;
    public final void ruleQubo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:66:2: ( ( ( rule__Qubo__Group__0 ) ) )
            // InternalQUBO.g:67:2: ( ( rule__Qubo__Group__0 ) )
            {
            // InternalQUBO.g:67:2: ( ( rule__Qubo__Group__0 ) )
            // InternalQUBO.g:68:3: ( rule__Qubo__Group__0 )
            {
             before(grammarAccess.getQuboAccess().getGroup()); 
            // InternalQUBO.g:69:3: ( rule__Qubo__Group__0 )
            // InternalQUBO.g:69:4: rule__Qubo__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Qubo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuboAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQubo"


    // $ANTLR start "entryRuleMatrix"
    // InternalQUBO.g:78:1: entryRuleMatrix : ruleMatrix EOF ;
    public final void entryRuleMatrix() throws RecognitionException {
        try {
            // InternalQUBO.g:79:1: ( ruleMatrix EOF )
            // InternalQUBO.g:80:1: ruleMatrix EOF
            {
             before(grammarAccess.getMatrixRule()); 
            pushFollow(FOLLOW_1);
            ruleMatrix();

            state._fsp--;

             after(grammarAccess.getMatrixRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMatrix"


    // $ANTLR start "ruleMatrix"
    // InternalQUBO.g:87:1: ruleMatrix : ( ( rule__Matrix__Group__0 ) ) ;
    public final void ruleMatrix() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:91:2: ( ( ( rule__Matrix__Group__0 ) ) )
            // InternalQUBO.g:92:2: ( ( rule__Matrix__Group__0 ) )
            {
            // InternalQUBO.g:92:2: ( ( rule__Matrix__Group__0 ) )
            // InternalQUBO.g:93:3: ( rule__Matrix__Group__0 )
            {
             before(grammarAccess.getMatrixAccess().getGroup()); 
            // InternalQUBO.g:94:3: ( rule__Matrix__Group__0 )
            // InternalQUBO.g:94:4: rule__Matrix__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Matrix__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMatrixAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMatrix"


    // $ANTLR start "entryRuleRow"
    // InternalQUBO.g:103:1: entryRuleRow : ruleRow EOF ;
    public final void entryRuleRow() throws RecognitionException {
        try {
            // InternalQUBO.g:104:1: ( ruleRow EOF )
            // InternalQUBO.g:105:1: ruleRow EOF
            {
             before(grammarAccess.getRowRule()); 
            pushFollow(FOLLOW_1);
            ruleRow();

            state._fsp--;

             after(grammarAccess.getRowRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRow"


    // $ANTLR start "ruleRow"
    // InternalQUBO.g:112:1: ruleRow : ( ( rule__Row__Group__0 ) ) ;
    public final void ruleRow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:116:2: ( ( ( rule__Row__Group__0 ) ) )
            // InternalQUBO.g:117:2: ( ( rule__Row__Group__0 ) )
            {
            // InternalQUBO.g:117:2: ( ( rule__Row__Group__0 ) )
            // InternalQUBO.g:118:3: ( rule__Row__Group__0 )
            {
             before(grammarAccess.getRowAccess().getGroup()); 
            // InternalQUBO.g:119:3: ( rule__Row__Group__0 )
            // InternalQUBO.g:119:4: rule__Row__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Row__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRowAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRow"


    // $ANTLR start "entryRuleColumn"
    // InternalQUBO.g:128:1: entryRuleColumn : ruleColumn EOF ;
    public final void entryRuleColumn() throws RecognitionException {
        try {
            // InternalQUBO.g:129:1: ( ruleColumn EOF )
            // InternalQUBO.g:130:1: ruleColumn EOF
            {
             before(grammarAccess.getColumnRule()); 
            pushFollow(FOLLOW_1);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getColumnRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleColumn"


    // $ANTLR start "ruleColumn"
    // InternalQUBO.g:137:1: ruleColumn : ( ( rule__Column__Group__0 ) ) ;
    public final void ruleColumn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:141:2: ( ( ( rule__Column__Group__0 ) ) )
            // InternalQUBO.g:142:2: ( ( rule__Column__Group__0 ) )
            {
            // InternalQUBO.g:142:2: ( ( rule__Column__Group__0 ) )
            // InternalQUBO.g:143:3: ( rule__Column__Group__0 )
            {
             before(grammarAccess.getColumnAccess().getGroup()); 
            // InternalQUBO.g:144:3: ( rule__Column__Group__0 )
            // InternalQUBO.g:144:4: rule__Column__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Column__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColumn"


    // $ANTLR start "entryRuleEDouble"
    // InternalQUBO.g:153:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalQUBO.g:154:1: ( ruleEDouble EOF )
            // InternalQUBO.g:155:1: ruleEDouble EOF
            {
             before(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getEDoubleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalQUBO.g:162:1: ruleEDouble : ( ( rule__EDouble__Alternatives ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:166:2: ( ( ( rule__EDouble__Alternatives ) ) )
            // InternalQUBO.g:167:2: ( ( rule__EDouble__Alternatives ) )
            {
            // InternalQUBO.g:167:2: ( ( rule__EDouble__Alternatives ) )
            // InternalQUBO.g:168:3: ( rule__EDouble__Alternatives )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives()); 
            // InternalQUBO.g:169:3: ( rule__EDouble__Alternatives )
            // InternalQUBO.g:169:4: rule__EDouble__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "rule__EDouble__Alternatives"
    // InternalQUBO.g:177:1: rule__EDouble__Alternatives : ( ( RULE_E_INT ) | ( RULE_E_DOUBLE ) );
    public final void rule__EDouble__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:181:1: ( ( RULE_E_INT ) | ( RULE_E_DOUBLE ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_E_INT) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_E_DOUBLE) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalQUBO.g:182:2: ( RULE_E_INT )
                    {
                    // InternalQUBO.g:182:2: ( RULE_E_INT )
                    // InternalQUBO.g:183:3: RULE_E_INT
                    {
                     before(grammarAccess.getEDoubleAccess().getE_INTTerminalRuleCall_0()); 
                    match(input,RULE_E_INT,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getE_INTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQUBO.g:188:2: ( RULE_E_DOUBLE )
                    {
                    // InternalQUBO.g:188:2: ( RULE_E_DOUBLE )
                    // InternalQUBO.g:189:3: RULE_E_DOUBLE
                    {
                     before(grammarAccess.getEDoubleAccess().getE_DOUBLETerminalRuleCall_1()); 
                    match(input,RULE_E_DOUBLE,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getE_DOUBLETerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Alternatives"


    // $ANTLR start "rule__Qubo__Group__0"
    // InternalQUBO.g:198:1: rule__Qubo__Group__0 : rule__Qubo__Group__0__Impl rule__Qubo__Group__1 ;
    public final void rule__Qubo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:202:1: ( rule__Qubo__Group__0__Impl rule__Qubo__Group__1 )
            // InternalQUBO.g:203:2: rule__Qubo__Group__0__Impl rule__Qubo__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Qubo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Qubo__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qubo__Group__0"


    // $ANTLR start "rule__Qubo__Group__0__Impl"
    // InternalQUBO.g:210:1: rule__Qubo__Group__0__Impl : ( () ) ;
    public final void rule__Qubo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:214:1: ( ( () ) )
            // InternalQUBO.g:215:1: ( () )
            {
            // InternalQUBO.g:215:1: ( () )
            // InternalQUBO.g:216:2: ()
            {
             before(grammarAccess.getQuboAccess().getQuboAction_0()); 
            // InternalQUBO.g:217:2: ()
            // InternalQUBO.g:217:3: 
            {
            }

             after(grammarAccess.getQuboAccess().getQuboAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qubo__Group__0__Impl"


    // $ANTLR start "rule__Qubo__Group__1"
    // InternalQUBO.g:225:1: rule__Qubo__Group__1 : rule__Qubo__Group__1__Impl rule__Qubo__Group__2 ;
    public final void rule__Qubo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:229:1: ( rule__Qubo__Group__1__Impl rule__Qubo__Group__2 )
            // InternalQUBO.g:230:2: rule__Qubo__Group__1__Impl rule__Qubo__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Qubo__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Qubo__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qubo__Group__1"


    // $ANTLR start "rule__Qubo__Group__1__Impl"
    // InternalQUBO.g:237:1: rule__Qubo__Group__1__Impl : ( 'Qubo' ) ;
    public final void rule__Qubo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:241:1: ( ( 'Qubo' ) )
            // InternalQUBO.g:242:1: ( 'Qubo' )
            {
            // InternalQUBO.g:242:1: ( 'Qubo' )
            // InternalQUBO.g:243:2: 'Qubo'
            {
             before(grammarAccess.getQuboAccess().getQuboKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getQuboAccess().getQuboKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qubo__Group__1__Impl"


    // $ANTLR start "rule__Qubo__Group__2"
    // InternalQUBO.g:252:1: rule__Qubo__Group__2 : rule__Qubo__Group__2__Impl rule__Qubo__Group__3 ;
    public final void rule__Qubo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:256:1: ( rule__Qubo__Group__2__Impl rule__Qubo__Group__3 )
            // InternalQUBO.g:257:2: rule__Qubo__Group__2__Impl rule__Qubo__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Qubo__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Qubo__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qubo__Group__2"


    // $ANTLR start "rule__Qubo__Group__2__Impl"
    // InternalQUBO.g:264:1: rule__Qubo__Group__2__Impl : ( '{' ) ;
    public final void rule__Qubo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:268:1: ( ( '{' ) )
            // InternalQUBO.g:269:1: ( '{' )
            {
            // InternalQUBO.g:269:1: ( '{' )
            // InternalQUBO.g:270:2: '{'
            {
             before(grammarAccess.getQuboAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getQuboAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qubo__Group__2__Impl"


    // $ANTLR start "rule__Qubo__Group__3"
    // InternalQUBO.g:279:1: rule__Qubo__Group__3 : rule__Qubo__Group__3__Impl rule__Qubo__Group__4 ;
    public final void rule__Qubo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:283:1: ( rule__Qubo__Group__3__Impl rule__Qubo__Group__4 )
            // InternalQUBO.g:284:2: rule__Qubo__Group__3__Impl rule__Qubo__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Qubo__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Qubo__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qubo__Group__3"


    // $ANTLR start "rule__Qubo__Group__3__Impl"
    // InternalQUBO.g:291:1: rule__Qubo__Group__3__Impl : ( ( rule__Qubo__Group_3__0 )? ) ;
    public final void rule__Qubo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:295:1: ( ( ( rule__Qubo__Group_3__0 )? ) )
            // InternalQUBO.g:296:1: ( ( rule__Qubo__Group_3__0 )? )
            {
            // InternalQUBO.g:296:1: ( ( rule__Qubo__Group_3__0 )? )
            // InternalQUBO.g:297:2: ( rule__Qubo__Group_3__0 )?
            {
             before(grammarAccess.getQuboAccess().getGroup_3()); 
            // InternalQUBO.g:298:2: ( rule__Qubo__Group_3__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalQUBO.g:298:3: rule__Qubo__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Qubo__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuboAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qubo__Group__3__Impl"


    // $ANTLR start "rule__Qubo__Group__4"
    // InternalQUBO.g:306:1: rule__Qubo__Group__4 : rule__Qubo__Group__4__Impl ;
    public final void rule__Qubo__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:310:1: ( rule__Qubo__Group__4__Impl )
            // InternalQUBO.g:311:2: rule__Qubo__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Qubo__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qubo__Group__4"


    // $ANTLR start "rule__Qubo__Group__4__Impl"
    // InternalQUBO.g:317:1: rule__Qubo__Group__4__Impl : ( '}' ) ;
    public final void rule__Qubo__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:321:1: ( ( '}' ) )
            // InternalQUBO.g:322:1: ( '}' )
            {
            // InternalQUBO.g:322:1: ( '}' )
            // InternalQUBO.g:323:2: '}'
            {
             before(grammarAccess.getQuboAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getQuboAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qubo__Group__4__Impl"


    // $ANTLR start "rule__Qubo__Group_3__0"
    // InternalQUBO.g:333:1: rule__Qubo__Group_3__0 : rule__Qubo__Group_3__0__Impl rule__Qubo__Group_3__1 ;
    public final void rule__Qubo__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:337:1: ( rule__Qubo__Group_3__0__Impl rule__Qubo__Group_3__1 )
            // InternalQUBO.g:338:2: rule__Qubo__Group_3__0__Impl rule__Qubo__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__Qubo__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Qubo__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qubo__Group_3__0"


    // $ANTLR start "rule__Qubo__Group_3__0__Impl"
    // InternalQUBO.g:345:1: rule__Qubo__Group_3__0__Impl : ( 'matrix' ) ;
    public final void rule__Qubo__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:349:1: ( ( 'matrix' ) )
            // InternalQUBO.g:350:1: ( 'matrix' )
            {
            // InternalQUBO.g:350:1: ( 'matrix' )
            // InternalQUBO.g:351:2: 'matrix'
            {
             before(grammarAccess.getQuboAccess().getMatrixKeyword_3_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getQuboAccess().getMatrixKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qubo__Group_3__0__Impl"


    // $ANTLR start "rule__Qubo__Group_3__1"
    // InternalQUBO.g:360:1: rule__Qubo__Group_3__1 : rule__Qubo__Group_3__1__Impl ;
    public final void rule__Qubo__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:364:1: ( rule__Qubo__Group_3__1__Impl )
            // InternalQUBO.g:365:2: rule__Qubo__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Qubo__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qubo__Group_3__1"


    // $ANTLR start "rule__Qubo__Group_3__1__Impl"
    // InternalQUBO.g:371:1: rule__Qubo__Group_3__1__Impl : ( ( rule__Qubo__MatrixAssignment_3_1 ) ) ;
    public final void rule__Qubo__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:375:1: ( ( ( rule__Qubo__MatrixAssignment_3_1 ) ) )
            // InternalQUBO.g:376:1: ( ( rule__Qubo__MatrixAssignment_3_1 ) )
            {
            // InternalQUBO.g:376:1: ( ( rule__Qubo__MatrixAssignment_3_1 ) )
            // InternalQUBO.g:377:2: ( rule__Qubo__MatrixAssignment_3_1 )
            {
             before(grammarAccess.getQuboAccess().getMatrixAssignment_3_1()); 
            // InternalQUBO.g:378:2: ( rule__Qubo__MatrixAssignment_3_1 )
            // InternalQUBO.g:378:3: rule__Qubo__MatrixAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Qubo__MatrixAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getQuboAccess().getMatrixAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qubo__Group_3__1__Impl"


    // $ANTLR start "rule__Matrix__Group__0"
    // InternalQUBO.g:387:1: rule__Matrix__Group__0 : rule__Matrix__Group__0__Impl rule__Matrix__Group__1 ;
    public final void rule__Matrix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:391:1: ( rule__Matrix__Group__0__Impl rule__Matrix__Group__1 )
            // InternalQUBO.g:392:2: rule__Matrix__Group__0__Impl rule__Matrix__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Matrix__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Matrix__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matrix__Group__0"


    // $ANTLR start "rule__Matrix__Group__0__Impl"
    // InternalQUBO.g:399:1: rule__Matrix__Group__0__Impl : ( () ) ;
    public final void rule__Matrix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:403:1: ( ( () ) )
            // InternalQUBO.g:404:1: ( () )
            {
            // InternalQUBO.g:404:1: ( () )
            // InternalQUBO.g:405:2: ()
            {
             before(grammarAccess.getMatrixAccess().getMatrixAction_0()); 
            // InternalQUBO.g:406:2: ()
            // InternalQUBO.g:406:3: 
            {
            }

             after(grammarAccess.getMatrixAccess().getMatrixAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matrix__Group__0__Impl"


    // $ANTLR start "rule__Matrix__Group__1"
    // InternalQUBO.g:414:1: rule__Matrix__Group__1 : rule__Matrix__Group__1__Impl rule__Matrix__Group__2 ;
    public final void rule__Matrix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:418:1: ( rule__Matrix__Group__1__Impl rule__Matrix__Group__2 )
            // InternalQUBO.g:419:2: rule__Matrix__Group__1__Impl rule__Matrix__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Matrix__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Matrix__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matrix__Group__1"


    // $ANTLR start "rule__Matrix__Group__1__Impl"
    // InternalQUBO.g:426:1: rule__Matrix__Group__1__Impl : ( '[' ) ;
    public final void rule__Matrix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:430:1: ( ( '[' ) )
            // InternalQUBO.g:431:1: ( '[' )
            {
            // InternalQUBO.g:431:1: ( '[' )
            // InternalQUBO.g:432:2: '['
            {
             before(grammarAccess.getMatrixAccess().getLeftSquareBracketKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMatrixAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matrix__Group__1__Impl"


    // $ANTLR start "rule__Matrix__Group__2"
    // InternalQUBO.g:441:1: rule__Matrix__Group__2 : rule__Matrix__Group__2__Impl rule__Matrix__Group__3 ;
    public final void rule__Matrix__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:445:1: ( rule__Matrix__Group__2__Impl rule__Matrix__Group__3 )
            // InternalQUBO.g:446:2: rule__Matrix__Group__2__Impl rule__Matrix__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Matrix__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Matrix__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matrix__Group__2"


    // $ANTLR start "rule__Matrix__Group__2__Impl"
    // InternalQUBO.g:453:1: rule__Matrix__Group__2__Impl : ( ( rule__Matrix__Group_2__0 )? ) ;
    public final void rule__Matrix__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:457:1: ( ( ( rule__Matrix__Group_2__0 )? ) )
            // InternalQUBO.g:458:1: ( ( rule__Matrix__Group_2__0 )? )
            {
            // InternalQUBO.g:458:1: ( ( rule__Matrix__Group_2__0 )? )
            // InternalQUBO.g:459:2: ( rule__Matrix__Group_2__0 )?
            {
             before(grammarAccess.getMatrixAccess().getGroup_2()); 
            // InternalQUBO.g:460:2: ( rule__Matrix__Group_2__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalQUBO.g:460:3: rule__Matrix__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Matrix__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMatrixAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matrix__Group__2__Impl"


    // $ANTLR start "rule__Matrix__Group__3"
    // InternalQUBO.g:468:1: rule__Matrix__Group__3 : rule__Matrix__Group__3__Impl ;
    public final void rule__Matrix__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:472:1: ( rule__Matrix__Group__3__Impl )
            // InternalQUBO.g:473:2: rule__Matrix__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Matrix__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matrix__Group__3"


    // $ANTLR start "rule__Matrix__Group__3__Impl"
    // InternalQUBO.g:479:1: rule__Matrix__Group__3__Impl : ( ']' ) ;
    public final void rule__Matrix__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:483:1: ( ( ']' ) )
            // InternalQUBO.g:484:1: ( ']' )
            {
            // InternalQUBO.g:484:1: ( ']' )
            // InternalQUBO.g:485:2: ']'
            {
             before(grammarAccess.getMatrixAccess().getRightSquareBracketKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMatrixAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matrix__Group__3__Impl"


    // $ANTLR start "rule__Matrix__Group_2__0"
    // InternalQUBO.g:495:1: rule__Matrix__Group_2__0 : rule__Matrix__Group_2__0__Impl rule__Matrix__Group_2__1 ;
    public final void rule__Matrix__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:499:1: ( rule__Matrix__Group_2__0__Impl rule__Matrix__Group_2__1 )
            // InternalQUBO.g:500:2: rule__Matrix__Group_2__0__Impl rule__Matrix__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__Matrix__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Matrix__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matrix__Group_2__0"


    // $ANTLR start "rule__Matrix__Group_2__0__Impl"
    // InternalQUBO.g:507:1: rule__Matrix__Group_2__0__Impl : ( ( rule__Matrix__RowsAssignment_2_0 ) ) ;
    public final void rule__Matrix__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:511:1: ( ( ( rule__Matrix__RowsAssignment_2_0 ) ) )
            // InternalQUBO.g:512:1: ( ( rule__Matrix__RowsAssignment_2_0 ) )
            {
            // InternalQUBO.g:512:1: ( ( rule__Matrix__RowsAssignment_2_0 ) )
            // InternalQUBO.g:513:2: ( rule__Matrix__RowsAssignment_2_0 )
            {
             before(grammarAccess.getMatrixAccess().getRowsAssignment_2_0()); 
            // InternalQUBO.g:514:2: ( rule__Matrix__RowsAssignment_2_0 )
            // InternalQUBO.g:514:3: rule__Matrix__RowsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Matrix__RowsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getMatrixAccess().getRowsAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matrix__Group_2__0__Impl"


    // $ANTLR start "rule__Matrix__Group_2__1"
    // InternalQUBO.g:522:1: rule__Matrix__Group_2__1 : rule__Matrix__Group_2__1__Impl ;
    public final void rule__Matrix__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:526:1: ( rule__Matrix__Group_2__1__Impl )
            // InternalQUBO.g:527:2: rule__Matrix__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Matrix__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matrix__Group_2__1"


    // $ANTLR start "rule__Matrix__Group_2__1__Impl"
    // InternalQUBO.g:533:1: rule__Matrix__Group_2__1__Impl : ( ( rule__Matrix__Group_2_1__0 )* ) ;
    public final void rule__Matrix__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:537:1: ( ( ( rule__Matrix__Group_2_1__0 )* ) )
            // InternalQUBO.g:538:1: ( ( rule__Matrix__Group_2_1__0 )* )
            {
            // InternalQUBO.g:538:1: ( ( rule__Matrix__Group_2_1__0 )* )
            // InternalQUBO.g:539:2: ( rule__Matrix__Group_2_1__0 )*
            {
             before(grammarAccess.getMatrixAccess().getGroup_2_1()); 
            // InternalQUBO.g:540:2: ( rule__Matrix__Group_2_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalQUBO.g:540:3: rule__Matrix__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Matrix__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getMatrixAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matrix__Group_2__1__Impl"


    // $ANTLR start "rule__Matrix__Group_2_1__0"
    // InternalQUBO.g:549:1: rule__Matrix__Group_2_1__0 : rule__Matrix__Group_2_1__0__Impl rule__Matrix__Group_2_1__1 ;
    public final void rule__Matrix__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:553:1: ( rule__Matrix__Group_2_1__0__Impl rule__Matrix__Group_2_1__1 )
            // InternalQUBO.g:554:2: rule__Matrix__Group_2_1__0__Impl rule__Matrix__Group_2_1__1
            {
            pushFollow(FOLLOW_6);
            rule__Matrix__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Matrix__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matrix__Group_2_1__0"


    // $ANTLR start "rule__Matrix__Group_2_1__0__Impl"
    // InternalQUBO.g:561:1: rule__Matrix__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__Matrix__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:565:1: ( ( ',' ) )
            // InternalQUBO.g:566:1: ( ',' )
            {
            // InternalQUBO.g:566:1: ( ',' )
            // InternalQUBO.g:567:2: ','
            {
             before(grammarAccess.getMatrixAccess().getCommaKeyword_2_1_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMatrixAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matrix__Group_2_1__0__Impl"


    // $ANTLR start "rule__Matrix__Group_2_1__1"
    // InternalQUBO.g:576:1: rule__Matrix__Group_2_1__1 : rule__Matrix__Group_2_1__1__Impl ;
    public final void rule__Matrix__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:580:1: ( rule__Matrix__Group_2_1__1__Impl )
            // InternalQUBO.g:581:2: rule__Matrix__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Matrix__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matrix__Group_2_1__1"


    // $ANTLR start "rule__Matrix__Group_2_1__1__Impl"
    // InternalQUBO.g:587:1: rule__Matrix__Group_2_1__1__Impl : ( ( rule__Matrix__RowsAssignment_2_1_1 ) ) ;
    public final void rule__Matrix__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:591:1: ( ( ( rule__Matrix__RowsAssignment_2_1_1 ) ) )
            // InternalQUBO.g:592:1: ( ( rule__Matrix__RowsAssignment_2_1_1 ) )
            {
            // InternalQUBO.g:592:1: ( ( rule__Matrix__RowsAssignment_2_1_1 ) )
            // InternalQUBO.g:593:2: ( rule__Matrix__RowsAssignment_2_1_1 )
            {
             before(grammarAccess.getMatrixAccess().getRowsAssignment_2_1_1()); 
            // InternalQUBO.g:594:2: ( rule__Matrix__RowsAssignment_2_1_1 )
            // InternalQUBO.g:594:3: rule__Matrix__RowsAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Matrix__RowsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMatrixAccess().getRowsAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matrix__Group_2_1__1__Impl"


    // $ANTLR start "rule__Row__Group__0"
    // InternalQUBO.g:603:1: rule__Row__Group__0 : rule__Row__Group__0__Impl rule__Row__Group__1 ;
    public final void rule__Row__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:607:1: ( rule__Row__Group__0__Impl rule__Row__Group__1 )
            // InternalQUBO.g:608:2: rule__Row__Group__0__Impl rule__Row__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Row__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Row__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__0"


    // $ANTLR start "rule__Row__Group__0__Impl"
    // InternalQUBO.g:615:1: rule__Row__Group__0__Impl : ( () ) ;
    public final void rule__Row__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:619:1: ( ( () ) )
            // InternalQUBO.g:620:1: ( () )
            {
            // InternalQUBO.g:620:1: ( () )
            // InternalQUBO.g:621:2: ()
            {
             before(grammarAccess.getRowAccess().getRowAction_0()); 
            // InternalQUBO.g:622:2: ()
            // InternalQUBO.g:622:3: 
            {
            }

             after(grammarAccess.getRowAccess().getRowAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__0__Impl"


    // $ANTLR start "rule__Row__Group__1"
    // InternalQUBO.g:630:1: rule__Row__Group__1 : rule__Row__Group__1__Impl rule__Row__Group__2 ;
    public final void rule__Row__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:634:1: ( rule__Row__Group__1__Impl rule__Row__Group__2 )
            // InternalQUBO.g:635:2: rule__Row__Group__1__Impl rule__Row__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Row__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Row__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__1"


    // $ANTLR start "rule__Row__Group__1__Impl"
    // InternalQUBO.g:642:1: rule__Row__Group__1__Impl : ( '[' ) ;
    public final void rule__Row__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:646:1: ( ( '[' ) )
            // InternalQUBO.g:647:1: ( '[' )
            {
            // InternalQUBO.g:647:1: ( '[' )
            // InternalQUBO.g:648:2: '['
            {
             before(grammarAccess.getRowAccess().getLeftSquareBracketKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRowAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__1__Impl"


    // $ANTLR start "rule__Row__Group__2"
    // InternalQUBO.g:657:1: rule__Row__Group__2 : rule__Row__Group__2__Impl rule__Row__Group__3 ;
    public final void rule__Row__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:661:1: ( rule__Row__Group__2__Impl rule__Row__Group__3 )
            // InternalQUBO.g:662:2: rule__Row__Group__2__Impl rule__Row__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Row__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Row__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__2"


    // $ANTLR start "rule__Row__Group__2__Impl"
    // InternalQUBO.g:669:1: rule__Row__Group__2__Impl : ( ( rule__Row__Group_2__0 )? ) ;
    public final void rule__Row__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:673:1: ( ( ( rule__Row__Group_2__0 )? ) )
            // InternalQUBO.g:674:1: ( ( rule__Row__Group_2__0 )? )
            {
            // InternalQUBO.g:674:1: ( ( rule__Row__Group_2__0 )? )
            // InternalQUBO.g:675:2: ( rule__Row__Group_2__0 )?
            {
             before(grammarAccess.getRowAccess().getGroup_2()); 
            // InternalQUBO.g:676:2: ( rule__Row__Group_2__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_E_INT && LA5_0<=RULE_E_DOUBLE)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalQUBO.g:676:3: rule__Row__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Row__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRowAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__2__Impl"


    // $ANTLR start "rule__Row__Group__3"
    // InternalQUBO.g:684:1: rule__Row__Group__3 : rule__Row__Group__3__Impl ;
    public final void rule__Row__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:688:1: ( rule__Row__Group__3__Impl )
            // InternalQUBO.g:689:2: rule__Row__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Row__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__3"


    // $ANTLR start "rule__Row__Group__3__Impl"
    // InternalQUBO.g:695:1: rule__Row__Group__3__Impl : ( ']' ) ;
    public final void rule__Row__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:699:1: ( ( ']' ) )
            // InternalQUBO.g:700:1: ( ']' )
            {
            // InternalQUBO.g:700:1: ( ']' )
            // InternalQUBO.g:701:2: ']'
            {
             before(grammarAccess.getRowAccess().getRightSquareBracketKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRowAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__3__Impl"


    // $ANTLR start "rule__Row__Group_2__0"
    // InternalQUBO.g:711:1: rule__Row__Group_2__0 : rule__Row__Group_2__0__Impl rule__Row__Group_2__1 ;
    public final void rule__Row__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:715:1: ( rule__Row__Group_2__0__Impl rule__Row__Group_2__1 )
            // InternalQUBO.g:716:2: rule__Row__Group_2__0__Impl rule__Row__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__Row__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Row__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_2__0"


    // $ANTLR start "rule__Row__Group_2__0__Impl"
    // InternalQUBO.g:723:1: rule__Row__Group_2__0__Impl : ( ( rule__Row__ColumnsAssignment_2_0 ) ) ;
    public final void rule__Row__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:727:1: ( ( ( rule__Row__ColumnsAssignment_2_0 ) ) )
            // InternalQUBO.g:728:1: ( ( rule__Row__ColumnsAssignment_2_0 ) )
            {
            // InternalQUBO.g:728:1: ( ( rule__Row__ColumnsAssignment_2_0 ) )
            // InternalQUBO.g:729:2: ( rule__Row__ColumnsAssignment_2_0 )
            {
             before(grammarAccess.getRowAccess().getColumnsAssignment_2_0()); 
            // InternalQUBO.g:730:2: ( rule__Row__ColumnsAssignment_2_0 )
            // InternalQUBO.g:730:3: rule__Row__ColumnsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Row__ColumnsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getRowAccess().getColumnsAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_2__0__Impl"


    // $ANTLR start "rule__Row__Group_2__1"
    // InternalQUBO.g:738:1: rule__Row__Group_2__1 : rule__Row__Group_2__1__Impl ;
    public final void rule__Row__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:742:1: ( rule__Row__Group_2__1__Impl )
            // InternalQUBO.g:743:2: rule__Row__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Row__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_2__1"


    // $ANTLR start "rule__Row__Group_2__1__Impl"
    // InternalQUBO.g:749:1: rule__Row__Group_2__1__Impl : ( ( rule__Row__Group_2_1__0 )* ) ;
    public final void rule__Row__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:753:1: ( ( ( rule__Row__Group_2_1__0 )* ) )
            // InternalQUBO.g:754:1: ( ( rule__Row__Group_2_1__0 )* )
            {
            // InternalQUBO.g:754:1: ( ( rule__Row__Group_2_1__0 )* )
            // InternalQUBO.g:755:2: ( rule__Row__Group_2_1__0 )*
            {
             before(grammarAccess.getRowAccess().getGroup_2_1()); 
            // InternalQUBO.g:756:2: ( rule__Row__Group_2_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalQUBO.g:756:3: rule__Row__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Row__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getRowAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_2__1__Impl"


    // $ANTLR start "rule__Row__Group_2_1__0"
    // InternalQUBO.g:765:1: rule__Row__Group_2_1__0 : rule__Row__Group_2_1__0__Impl rule__Row__Group_2_1__1 ;
    public final void rule__Row__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:769:1: ( rule__Row__Group_2_1__0__Impl rule__Row__Group_2_1__1 )
            // InternalQUBO.g:770:2: rule__Row__Group_2_1__0__Impl rule__Row__Group_2_1__1
            {
            pushFollow(FOLLOW_11);
            rule__Row__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Row__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_2_1__0"


    // $ANTLR start "rule__Row__Group_2_1__0__Impl"
    // InternalQUBO.g:777:1: rule__Row__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__Row__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:781:1: ( ( ',' ) )
            // InternalQUBO.g:782:1: ( ',' )
            {
            // InternalQUBO.g:782:1: ( ',' )
            // InternalQUBO.g:783:2: ','
            {
             before(grammarAccess.getRowAccess().getCommaKeyword_2_1_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getRowAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_2_1__0__Impl"


    // $ANTLR start "rule__Row__Group_2_1__1"
    // InternalQUBO.g:792:1: rule__Row__Group_2_1__1 : rule__Row__Group_2_1__1__Impl ;
    public final void rule__Row__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:796:1: ( rule__Row__Group_2_1__1__Impl )
            // InternalQUBO.g:797:2: rule__Row__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Row__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_2_1__1"


    // $ANTLR start "rule__Row__Group_2_1__1__Impl"
    // InternalQUBO.g:803:1: rule__Row__Group_2_1__1__Impl : ( ( rule__Row__ColumnsAssignment_2_1_1 ) ) ;
    public final void rule__Row__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:807:1: ( ( ( rule__Row__ColumnsAssignment_2_1_1 ) ) )
            // InternalQUBO.g:808:1: ( ( rule__Row__ColumnsAssignment_2_1_1 ) )
            {
            // InternalQUBO.g:808:1: ( ( rule__Row__ColumnsAssignment_2_1_1 ) )
            // InternalQUBO.g:809:2: ( rule__Row__ColumnsAssignment_2_1_1 )
            {
             before(grammarAccess.getRowAccess().getColumnsAssignment_2_1_1()); 
            // InternalQUBO.g:810:2: ( rule__Row__ColumnsAssignment_2_1_1 )
            // InternalQUBO.g:810:3: rule__Row__ColumnsAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Row__ColumnsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRowAccess().getColumnsAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group_2_1__1__Impl"


    // $ANTLR start "rule__Column__Group__0"
    // InternalQUBO.g:819:1: rule__Column__Group__0 : rule__Column__Group__0__Impl rule__Column__Group__1 ;
    public final void rule__Column__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:823:1: ( rule__Column__Group__0__Impl rule__Column__Group__1 )
            // InternalQUBO.g:824:2: rule__Column__Group__0__Impl rule__Column__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Column__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__0"


    // $ANTLR start "rule__Column__Group__0__Impl"
    // InternalQUBO.g:831:1: rule__Column__Group__0__Impl : ( () ) ;
    public final void rule__Column__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:835:1: ( ( () ) )
            // InternalQUBO.g:836:1: ( () )
            {
            // InternalQUBO.g:836:1: ( () )
            // InternalQUBO.g:837:2: ()
            {
             before(grammarAccess.getColumnAccess().getColumnAction_0()); 
            // InternalQUBO.g:838:2: ()
            // InternalQUBO.g:838:3: 
            {
            }

             after(grammarAccess.getColumnAccess().getColumnAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__0__Impl"


    // $ANTLR start "rule__Column__Group__1"
    // InternalQUBO.g:846:1: rule__Column__Group__1 : rule__Column__Group__1__Impl ;
    public final void rule__Column__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:850:1: ( rule__Column__Group__1__Impl )
            // InternalQUBO.g:851:2: rule__Column__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Column__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__1"


    // $ANTLR start "rule__Column__Group__1__Impl"
    // InternalQUBO.g:857:1: rule__Column__Group__1__Impl : ( ( rule__Column__ValueAssignment_1 ) ) ;
    public final void rule__Column__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:861:1: ( ( ( rule__Column__ValueAssignment_1 ) ) )
            // InternalQUBO.g:862:1: ( ( rule__Column__ValueAssignment_1 ) )
            {
            // InternalQUBO.g:862:1: ( ( rule__Column__ValueAssignment_1 ) )
            // InternalQUBO.g:863:2: ( rule__Column__ValueAssignment_1 )
            {
             before(grammarAccess.getColumnAccess().getValueAssignment_1()); 
            // InternalQUBO.g:864:2: ( rule__Column__ValueAssignment_1 )
            // InternalQUBO.g:864:3: rule__Column__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Column__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__1__Impl"


    // $ANTLR start "rule__Qubo__MatrixAssignment_3_1"
    // InternalQUBO.g:873:1: rule__Qubo__MatrixAssignment_3_1 : ( ruleMatrix ) ;
    public final void rule__Qubo__MatrixAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:877:1: ( ( ruleMatrix ) )
            // InternalQUBO.g:878:2: ( ruleMatrix )
            {
            // InternalQUBO.g:878:2: ( ruleMatrix )
            // InternalQUBO.g:879:3: ruleMatrix
            {
             before(grammarAccess.getQuboAccess().getMatrixMatrixParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMatrix();

            state._fsp--;

             after(grammarAccess.getQuboAccess().getMatrixMatrixParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Qubo__MatrixAssignment_3_1"


    // $ANTLR start "rule__Matrix__RowsAssignment_2_0"
    // InternalQUBO.g:888:1: rule__Matrix__RowsAssignment_2_0 : ( ruleRow ) ;
    public final void rule__Matrix__RowsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:892:1: ( ( ruleRow ) )
            // InternalQUBO.g:893:2: ( ruleRow )
            {
            // InternalQUBO.g:893:2: ( ruleRow )
            // InternalQUBO.g:894:3: ruleRow
            {
             before(grammarAccess.getMatrixAccess().getRowsRowParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleRow();

            state._fsp--;

             after(grammarAccess.getMatrixAccess().getRowsRowParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matrix__RowsAssignment_2_0"


    // $ANTLR start "rule__Matrix__RowsAssignment_2_1_1"
    // InternalQUBO.g:903:1: rule__Matrix__RowsAssignment_2_1_1 : ( ruleRow ) ;
    public final void rule__Matrix__RowsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:907:1: ( ( ruleRow ) )
            // InternalQUBO.g:908:2: ( ruleRow )
            {
            // InternalQUBO.g:908:2: ( ruleRow )
            // InternalQUBO.g:909:3: ruleRow
            {
             before(grammarAccess.getMatrixAccess().getRowsRowParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRow();

            state._fsp--;

             after(grammarAccess.getMatrixAccess().getRowsRowParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Matrix__RowsAssignment_2_1_1"


    // $ANTLR start "rule__Row__ColumnsAssignment_2_0"
    // InternalQUBO.g:918:1: rule__Row__ColumnsAssignment_2_0 : ( ruleColumn ) ;
    public final void rule__Row__ColumnsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:922:1: ( ( ruleColumn ) )
            // InternalQUBO.g:923:2: ( ruleColumn )
            {
            // InternalQUBO.g:923:2: ( ruleColumn )
            // InternalQUBO.g:924:3: ruleColumn
            {
             before(grammarAccess.getRowAccess().getColumnsColumnParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getRowAccess().getColumnsColumnParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__ColumnsAssignment_2_0"


    // $ANTLR start "rule__Row__ColumnsAssignment_2_1_1"
    // InternalQUBO.g:933:1: rule__Row__ColumnsAssignment_2_1_1 : ( ruleColumn ) ;
    public final void rule__Row__ColumnsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:937:1: ( ( ruleColumn ) )
            // InternalQUBO.g:938:2: ( ruleColumn )
            {
            // InternalQUBO.g:938:2: ( ruleColumn )
            // InternalQUBO.g:939:3: ruleColumn
            {
             before(grammarAccess.getRowAccess().getColumnsColumnParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getRowAccess().getColumnsColumnParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__ColumnsAssignment_2_1_1"


    // $ANTLR start "rule__Column__ValueAssignment_1"
    // InternalQUBO.g:948:1: rule__Column__ValueAssignment_1 : ( ruleEDouble ) ;
    public final void rule__Column__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:952:1: ( ( ruleEDouble ) )
            // InternalQUBO.g:953:2: ( ruleEDouble )
            {
            // InternalQUBO.g:953:2: ( ruleEDouble )
            // InternalQUBO.g:954:3: ruleEDouble
            {
             before(grammarAccess.getColumnAccess().getValueEDoubleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getColumnAccess().getValueEDoubleParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__ValueAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000030L});

}