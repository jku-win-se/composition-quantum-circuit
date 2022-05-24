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
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalQUBOParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'Qubo'", "'{'", "'}'", "'matrix'", "'['", "']'", "','", "'-'", "'.'"
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
    // InternalQUBO.g:54:1: entryRuleQubo : ruleQubo EOF ;
    public final void entryRuleQubo() throws RecognitionException {
        try {
            // InternalQUBO.g:55:1: ( ruleQubo EOF )
            // InternalQUBO.g:56:1: ruleQubo EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuboRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleQubo();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuboRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalQUBO.g:63:1: ruleQubo : ( ( rule__Qubo__Group__0 ) ) ;
    public final void ruleQubo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:67:2: ( ( ( rule__Qubo__Group__0 ) ) )
            // InternalQUBO.g:68:2: ( ( rule__Qubo__Group__0 ) )
            {
            // InternalQUBO.g:68:2: ( ( rule__Qubo__Group__0 ) )
            // InternalQUBO.g:69:3: ( rule__Qubo__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuboAccess().getGroup()); 
            }
            // InternalQUBO.g:70:3: ( rule__Qubo__Group__0 )
            // InternalQUBO.g:70:4: rule__Qubo__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Qubo__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuboAccess().getGroup()); 
            }

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
    // InternalQUBO.g:79:1: entryRuleMatrix : ruleMatrix EOF ;
    public final void entryRuleMatrix() throws RecognitionException {
        try {
            // InternalQUBO.g:80:1: ( ruleMatrix EOF )
            // InternalQUBO.g:81:1: ruleMatrix EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatrixRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMatrix();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatrixRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalQUBO.g:88:1: ruleMatrix : ( ( rule__Matrix__Group__0 ) ) ;
    public final void ruleMatrix() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:92:2: ( ( ( rule__Matrix__Group__0 ) ) )
            // InternalQUBO.g:93:2: ( ( rule__Matrix__Group__0 ) )
            {
            // InternalQUBO.g:93:2: ( ( rule__Matrix__Group__0 ) )
            // InternalQUBO.g:94:3: ( rule__Matrix__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatrixAccess().getGroup()); 
            }
            // InternalQUBO.g:95:3: ( rule__Matrix__Group__0 )
            // InternalQUBO.g:95:4: rule__Matrix__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Matrix__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatrixAccess().getGroup()); 
            }

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
    // InternalQUBO.g:104:1: entryRuleRow : ruleRow EOF ;
    public final void entryRuleRow() throws RecognitionException {
        try {
            // InternalQUBO.g:105:1: ( ruleRow EOF )
            // InternalQUBO.g:106:1: ruleRow EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRow();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRowRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalQUBO.g:113:1: ruleRow : ( ( rule__Row__Group__0 ) ) ;
    public final void ruleRow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:117:2: ( ( ( rule__Row__Group__0 ) ) )
            // InternalQUBO.g:118:2: ( ( rule__Row__Group__0 ) )
            {
            // InternalQUBO.g:118:2: ( ( rule__Row__Group__0 ) )
            // InternalQUBO.g:119:3: ( rule__Row__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getGroup()); 
            }
            // InternalQUBO.g:120:3: ( rule__Row__Group__0 )
            // InternalQUBO.g:120:4: rule__Row__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Row__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRowAccess().getGroup()); 
            }

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
    // InternalQUBO.g:129:1: entryRuleColumn : ruleColumn EOF ;
    public final void entryRuleColumn() throws RecognitionException {
        try {
            // InternalQUBO.g:130:1: ( ruleColumn EOF )
            // InternalQUBO.g:131:1: ruleColumn EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColumnRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleColumn();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getColumnRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalQUBO.g:138:1: ruleColumn : ( ( rule__Column__Group__0 ) ) ;
    public final void ruleColumn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:142:2: ( ( ( rule__Column__Group__0 ) ) )
            // InternalQUBO.g:143:2: ( ( rule__Column__Group__0 ) )
            {
            // InternalQUBO.g:143:2: ( ( rule__Column__Group__0 ) )
            // InternalQUBO.g:144:3: ( rule__Column__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColumnAccess().getGroup()); 
            }
            // InternalQUBO.g:145:3: ( rule__Column__Group__0 )
            // InternalQUBO.g:145:4: rule__Column__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Column__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getColumnAccess().getGroup()); 
            }

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


    // $ANTLR start "entryRuleEDoubleDefinition"
    // InternalQUBO.g:154:1: entryRuleEDoubleDefinition : ruleEDoubleDefinition EOF ;
    public final void entryRuleEDoubleDefinition() throws RecognitionException {
        try {
            // InternalQUBO.g:155:1: ( ruleEDoubleDefinition EOF )
            // InternalQUBO.g:156:1: ruleEDoubleDefinition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEDoubleDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDoubleDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEDoubleDefinition"


    // $ANTLR start "ruleEDoubleDefinition"
    // InternalQUBO.g:163:1: ruleEDoubleDefinition : ( ( rule__EDoubleDefinition__Alternatives ) ) ;
    public final void ruleEDoubleDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:167:2: ( ( ( rule__EDoubleDefinition__Alternatives ) ) )
            // InternalQUBO.g:168:2: ( ( rule__EDoubleDefinition__Alternatives ) )
            {
            // InternalQUBO.g:168:2: ( ( rule__EDoubleDefinition__Alternatives ) )
            // InternalQUBO.g:169:3: ( rule__EDoubleDefinition__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleDefinitionAccess().getAlternatives()); 
            }
            // InternalQUBO.g:170:3: ( rule__EDoubleDefinition__Alternatives )
            // InternalQUBO.g:170:4: rule__EDoubleDefinition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EDoubleDefinition__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDoubleDefinitionAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleEDoubleDefinition"


    // $ANTLR start "entryRuleEInt"
    // InternalQUBO.g:179:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalQUBO.g:180:1: ( ruleEInt EOF )
            // InternalQUBO.g:181:1: ruleEInt EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEIntRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEIntRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalQUBO.g:188:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:192:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalQUBO.g:193:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalQUBO.g:193:2: ( ( rule__EInt__Group__0 ) )
            // InternalQUBO.g:194:3: ( rule__EInt__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEIntAccess().getGroup()); 
            }
            // InternalQUBO.g:195:3: ( rule__EInt__Group__0 )
            // InternalQUBO.g:195:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEIntAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEDouble"
    // InternalQUBO.g:204:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalQUBO.g:205:1: ( ruleEDouble EOF )
            // InternalQUBO.g:206:1: ruleEDouble EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEDouble();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDoubleRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalQUBO.g:213:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:217:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalQUBO.g:218:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalQUBO.g:218:2: ( ( rule__EDouble__Group__0 ) )
            // InternalQUBO.g:219:3: ( rule__EDouble__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleAccess().getGroup()); 
            }
            // InternalQUBO.g:220:3: ( rule__EDouble__Group__0 )
            // InternalQUBO.g:220:4: rule__EDouble__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDoubleAccess().getGroup()); 
            }

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


    // $ANTLR start "rule__EDoubleDefinition__Alternatives"
    // InternalQUBO.g:228:1: rule__EDoubleDefinition__Alternatives : ( ( ruleEInt ) | ( ruleEDouble ) );
    public final void rule__EDoubleDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:232:1: ( ( ruleEInt ) | ( ruleEDouble ) )
            int alt1=2;
            switch ( input.LA(1) ) {
            case 20:
                {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==RULE_INT) ) {
                    int LA1_2 = input.LA(3);

                    if ( (LA1_2==EOF||(LA1_2>=18 && LA1_2<=19)) ) {
                        alt1=1;
                    }
                    else if ( (LA1_2==21) ) {
                        alt1=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA1_1==21) ) {
                    alt1=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA1_2 = input.LA(2);

                if ( (LA1_2==EOF||(LA1_2>=18 && LA1_2<=19)) ) {
                    alt1=1;
                }
                else if ( (LA1_2==21) ) {
                    alt1=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;
                }
                }
                break;
            case 21:
                {
                alt1=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalQUBO.g:233:2: ( ruleEInt )
                    {
                    // InternalQUBO.g:233:2: ( ruleEInt )
                    // InternalQUBO.g:234:3: ruleEInt
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEDoubleDefinitionAccess().getEIntParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleEInt();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEDoubleDefinitionAccess().getEIntParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalQUBO.g:239:2: ( ruleEDouble )
                    {
                    // InternalQUBO.g:239:2: ( ruleEDouble )
                    // InternalQUBO.g:240:3: ruleEDouble
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEDoubleDefinitionAccess().getEDoubleParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleEDouble();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEDoubleDefinitionAccess().getEDoubleParserRuleCall_1()); 
                    }

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
    // $ANTLR end "rule__EDoubleDefinition__Alternatives"


    // $ANTLR start "rule__EDouble__Alternatives_4_0"
    // InternalQUBO.g:249:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:253:1: ( ( 'E' ) | ( 'e' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalQUBO.g:254:2: ( 'E' )
                    {
                    // InternalQUBO.g:254:2: ( 'E' )
                    // InternalQUBO.g:255:3: 'E'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    }
                    match(input,11,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalQUBO.g:260:2: ( 'e' )
                    {
                    // InternalQUBO.g:260:2: ( 'e' )
                    // InternalQUBO.g:261:3: 'e'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                    }
                    match(input,12,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                    }

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
    // $ANTLR end "rule__EDouble__Alternatives_4_0"


    // $ANTLR start "rule__Qubo__Group__0"
    // InternalQUBO.g:270:1: rule__Qubo__Group__0 : rule__Qubo__Group__0__Impl rule__Qubo__Group__1 ;
    public final void rule__Qubo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:274:1: ( rule__Qubo__Group__0__Impl rule__Qubo__Group__1 )
            // InternalQUBO.g:275:2: rule__Qubo__Group__0__Impl rule__Qubo__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Qubo__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Qubo__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalQUBO.g:282:1: rule__Qubo__Group__0__Impl : ( () ) ;
    public final void rule__Qubo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:286:1: ( ( () ) )
            // InternalQUBO.g:287:1: ( () )
            {
            // InternalQUBO.g:287:1: ( () )
            // InternalQUBO.g:288:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuboAccess().getQuboAction_0()); 
            }
            // InternalQUBO.g:289:2: ()
            // InternalQUBO.g:289:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuboAccess().getQuboAction_0()); 
            }

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
    // InternalQUBO.g:297:1: rule__Qubo__Group__1 : rule__Qubo__Group__1__Impl rule__Qubo__Group__2 ;
    public final void rule__Qubo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:301:1: ( rule__Qubo__Group__1__Impl rule__Qubo__Group__2 )
            // InternalQUBO.g:302:2: rule__Qubo__Group__1__Impl rule__Qubo__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Qubo__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Qubo__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalQUBO.g:309:1: rule__Qubo__Group__1__Impl : ( 'Qubo' ) ;
    public final void rule__Qubo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:313:1: ( ( 'Qubo' ) )
            // InternalQUBO.g:314:1: ( 'Qubo' )
            {
            // InternalQUBO.g:314:1: ( 'Qubo' )
            // InternalQUBO.g:315:2: 'Qubo'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuboAccess().getQuboKeyword_1()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuboAccess().getQuboKeyword_1()); 
            }

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
    // InternalQUBO.g:324:1: rule__Qubo__Group__2 : rule__Qubo__Group__2__Impl rule__Qubo__Group__3 ;
    public final void rule__Qubo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:328:1: ( rule__Qubo__Group__2__Impl rule__Qubo__Group__3 )
            // InternalQUBO.g:329:2: rule__Qubo__Group__2__Impl rule__Qubo__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Qubo__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Qubo__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalQUBO.g:336:1: rule__Qubo__Group__2__Impl : ( '{' ) ;
    public final void rule__Qubo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:340:1: ( ( '{' ) )
            // InternalQUBO.g:341:1: ( '{' )
            {
            // InternalQUBO.g:341:1: ( '{' )
            // InternalQUBO.g:342:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuboAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuboAccess().getLeftCurlyBracketKeyword_2()); 
            }

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
    // InternalQUBO.g:351:1: rule__Qubo__Group__3 : rule__Qubo__Group__3__Impl rule__Qubo__Group__4 ;
    public final void rule__Qubo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:355:1: ( rule__Qubo__Group__3__Impl rule__Qubo__Group__4 )
            // InternalQUBO.g:356:2: rule__Qubo__Group__3__Impl rule__Qubo__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Qubo__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Qubo__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalQUBO.g:363:1: rule__Qubo__Group__3__Impl : ( ( rule__Qubo__Group_3__0 )? ) ;
    public final void rule__Qubo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:367:1: ( ( ( rule__Qubo__Group_3__0 )? ) )
            // InternalQUBO.g:368:1: ( ( rule__Qubo__Group_3__0 )? )
            {
            // InternalQUBO.g:368:1: ( ( rule__Qubo__Group_3__0 )? )
            // InternalQUBO.g:369:2: ( rule__Qubo__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuboAccess().getGroup_3()); 
            }
            // InternalQUBO.g:370:2: ( rule__Qubo__Group_3__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalQUBO.g:370:3: rule__Qubo__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Qubo__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuboAccess().getGroup_3()); 
            }

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
    // InternalQUBO.g:378:1: rule__Qubo__Group__4 : rule__Qubo__Group__4__Impl ;
    public final void rule__Qubo__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:382:1: ( rule__Qubo__Group__4__Impl )
            // InternalQUBO.g:383:2: rule__Qubo__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Qubo__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalQUBO.g:389:1: rule__Qubo__Group__4__Impl : ( '}' ) ;
    public final void rule__Qubo__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:393:1: ( ( '}' ) )
            // InternalQUBO.g:394:1: ( '}' )
            {
            // InternalQUBO.g:394:1: ( '}' )
            // InternalQUBO.g:395:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuboAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuboAccess().getRightCurlyBracketKeyword_4()); 
            }

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
    // InternalQUBO.g:405:1: rule__Qubo__Group_3__0 : rule__Qubo__Group_3__0__Impl rule__Qubo__Group_3__1 ;
    public final void rule__Qubo__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:409:1: ( rule__Qubo__Group_3__0__Impl rule__Qubo__Group_3__1 )
            // InternalQUBO.g:410:2: rule__Qubo__Group_3__0__Impl rule__Qubo__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__Qubo__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Qubo__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalQUBO.g:417:1: rule__Qubo__Group_3__0__Impl : ( 'matrix' ) ;
    public final void rule__Qubo__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:421:1: ( ( 'matrix' ) )
            // InternalQUBO.g:422:1: ( 'matrix' )
            {
            // InternalQUBO.g:422:1: ( 'matrix' )
            // InternalQUBO.g:423:2: 'matrix'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuboAccess().getMatrixKeyword_3_0()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuboAccess().getMatrixKeyword_3_0()); 
            }

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
    // InternalQUBO.g:432:1: rule__Qubo__Group_3__1 : rule__Qubo__Group_3__1__Impl ;
    public final void rule__Qubo__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:436:1: ( rule__Qubo__Group_3__1__Impl )
            // InternalQUBO.g:437:2: rule__Qubo__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Qubo__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalQUBO.g:443:1: rule__Qubo__Group_3__1__Impl : ( ( rule__Qubo__MatrixAssignment_3_1 ) ) ;
    public final void rule__Qubo__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:447:1: ( ( ( rule__Qubo__MatrixAssignment_3_1 ) ) )
            // InternalQUBO.g:448:1: ( ( rule__Qubo__MatrixAssignment_3_1 ) )
            {
            // InternalQUBO.g:448:1: ( ( rule__Qubo__MatrixAssignment_3_1 ) )
            // InternalQUBO.g:449:2: ( rule__Qubo__MatrixAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuboAccess().getMatrixAssignment_3_1()); 
            }
            // InternalQUBO.g:450:2: ( rule__Qubo__MatrixAssignment_3_1 )
            // InternalQUBO.g:450:3: rule__Qubo__MatrixAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Qubo__MatrixAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuboAccess().getMatrixAssignment_3_1()); 
            }

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
    // InternalQUBO.g:459:1: rule__Matrix__Group__0 : rule__Matrix__Group__0__Impl rule__Matrix__Group__1 ;
    public final void rule__Matrix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:463:1: ( rule__Matrix__Group__0__Impl rule__Matrix__Group__1 )
            // InternalQUBO.g:464:2: rule__Matrix__Group__0__Impl rule__Matrix__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Matrix__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Matrix__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalQUBO.g:471:1: rule__Matrix__Group__0__Impl : ( () ) ;
    public final void rule__Matrix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:475:1: ( ( () ) )
            // InternalQUBO.g:476:1: ( () )
            {
            // InternalQUBO.g:476:1: ( () )
            // InternalQUBO.g:477:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatrixAccess().getMatrixAction_0()); 
            }
            // InternalQUBO.g:478:2: ()
            // InternalQUBO.g:478:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatrixAccess().getMatrixAction_0()); 
            }

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
    // InternalQUBO.g:486:1: rule__Matrix__Group__1 : rule__Matrix__Group__1__Impl rule__Matrix__Group__2 ;
    public final void rule__Matrix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:490:1: ( rule__Matrix__Group__1__Impl rule__Matrix__Group__2 )
            // InternalQUBO.g:491:2: rule__Matrix__Group__1__Impl rule__Matrix__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Matrix__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Matrix__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalQUBO.g:498:1: rule__Matrix__Group__1__Impl : ( '[' ) ;
    public final void rule__Matrix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:502:1: ( ( '[' ) )
            // InternalQUBO.g:503:1: ( '[' )
            {
            // InternalQUBO.g:503:1: ( '[' )
            // InternalQUBO.g:504:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatrixAccess().getLeftSquareBracketKeyword_1()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatrixAccess().getLeftSquareBracketKeyword_1()); 
            }

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
    // InternalQUBO.g:513:1: rule__Matrix__Group__2 : rule__Matrix__Group__2__Impl rule__Matrix__Group__3 ;
    public final void rule__Matrix__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:517:1: ( rule__Matrix__Group__2__Impl rule__Matrix__Group__3 )
            // InternalQUBO.g:518:2: rule__Matrix__Group__2__Impl rule__Matrix__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Matrix__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Matrix__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalQUBO.g:525:1: rule__Matrix__Group__2__Impl : ( ( rule__Matrix__Group_2__0 )? ) ;
    public final void rule__Matrix__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:529:1: ( ( ( rule__Matrix__Group_2__0 )? ) )
            // InternalQUBO.g:530:1: ( ( rule__Matrix__Group_2__0 )? )
            {
            // InternalQUBO.g:530:1: ( ( rule__Matrix__Group_2__0 )? )
            // InternalQUBO.g:531:2: ( rule__Matrix__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatrixAccess().getGroup_2()); 
            }
            // InternalQUBO.g:532:2: ( rule__Matrix__Group_2__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalQUBO.g:532:3: rule__Matrix__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Matrix__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatrixAccess().getGroup_2()); 
            }

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
    // InternalQUBO.g:540:1: rule__Matrix__Group__3 : rule__Matrix__Group__3__Impl ;
    public final void rule__Matrix__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:544:1: ( rule__Matrix__Group__3__Impl )
            // InternalQUBO.g:545:2: rule__Matrix__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Matrix__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalQUBO.g:551:1: rule__Matrix__Group__3__Impl : ( ']' ) ;
    public final void rule__Matrix__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:555:1: ( ( ']' ) )
            // InternalQUBO.g:556:1: ( ']' )
            {
            // InternalQUBO.g:556:1: ( ']' )
            // InternalQUBO.g:557:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatrixAccess().getRightSquareBracketKeyword_3()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatrixAccess().getRightSquareBracketKeyword_3()); 
            }

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
    // InternalQUBO.g:567:1: rule__Matrix__Group_2__0 : rule__Matrix__Group_2__0__Impl rule__Matrix__Group_2__1 ;
    public final void rule__Matrix__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:571:1: ( rule__Matrix__Group_2__0__Impl rule__Matrix__Group_2__1 )
            // InternalQUBO.g:572:2: rule__Matrix__Group_2__0__Impl rule__Matrix__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__Matrix__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Matrix__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalQUBO.g:579:1: rule__Matrix__Group_2__0__Impl : ( ( rule__Matrix__RowsAssignment_2_0 ) ) ;
    public final void rule__Matrix__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:583:1: ( ( ( rule__Matrix__RowsAssignment_2_0 ) ) )
            // InternalQUBO.g:584:1: ( ( rule__Matrix__RowsAssignment_2_0 ) )
            {
            // InternalQUBO.g:584:1: ( ( rule__Matrix__RowsAssignment_2_0 ) )
            // InternalQUBO.g:585:2: ( rule__Matrix__RowsAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatrixAccess().getRowsAssignment_2_0()); 
            }
            // InternalQUBO.g:586:2: ( rule__Matrix__RowsAssignment_2_0 )
            // InternalQUBO.g:586:3: rule__Matrix__RowsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Matrix__RowsAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatrixAccess().getRowsAssignment_2_0()); 
            }

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
    // InternalQUBO.g:594:1: rule__Matrix__Group_2__1 : rule__Matrix__Group_2__1__Impl ;
    public final void rule__Matrix__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:598:1: ( rule__Matrix__Group_2__1__Impl )
            // InternalQUBO.g:599:2: rule__Matrix__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Matrix__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalQUBO.g:605:1: rule__Matrix__Group_2__1__Impl : ( ( rule__Matrix__Group_2_1__0 )* ) ;
    public final void rule__Matrix__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:609:1: ( ( ( rule__Matrix__Group_2_1__0 )* ) )
            // InternalQUBO.g:610:1: ( ( rule__Matrix__Group_2_1__0 )* )
            {
            // InternalQUBO.g:610:1: ( ( rule__Matrix__Group_2_1__0 )* )
            // InternalQUBO.g:611:2: ( rule__Matrix__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatrixAccess().getGroup_2_1()); 
            }
            // InternalQUBO.g:612:2: ( rule__Matrix__Group_2_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalQUBO.g:612:3: rule__Matrix__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Matrix__Group_2_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatrixAccess().getGroup_2_1()); 
            }

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
    // InternalQUBO.g:621:1: rule__Matrix__Group_2_1__0 : rule__Matrix__Group_2_1__0__Impl rule__Matrix__Group_2_1__1 ;
    public final void rule__Matrix__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:625:1: ( rule__Matrix__Group_2_1__0__Impl rule__Matrix__Group_2_1__1 )
            // InternalQUBO.g:626:2: rule__Matrix__Group_2_1__0__Impl rule__Matrix__Group_2_1__1
            {
            pushFollow(FOLLOW_6);
            rule__Matrix__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Matrix__Group_2_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalQUBO.g:633:1: rule__Matrix__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__Matrix__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:637:1: ( ( ',' ) )
            // InternalQUBO.g:638:1: ( ',' )
            {
            // InternalQUBO.g:638:1: ( ',' )
            // InternalQUBO.g:639:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatrixAccess().getCommaKeyword_2_1_0()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatrixAccess().getCommaKeyword_2_1_0()); 
            }

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
    // InternalQUBO.g:648:1: rule__Matrix__Group_2_1__1 : rule__Matrix__Group_2_1__1__Impl ;
    public final void rule__Matrix__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:652:1: ( rule__Matrix__Group_2_1__1__Impl )
            // InternalQUBO.g:653:2: rule__Matrix__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Matrix__Group_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalQUBO.g:659:1: rule__Matrix__Group_2_1__1__Impl : ( ( rule__Matrix__RowsAssignment_2_1_1 ) ) ;
    public final void rule__Matrix__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:663:1: ( ( ( rule__Matrix__RowsAssignment_2_1_1 ) ) )
            // InternalQUBO.g:664:1: ( ( rule__Matrix__RowsAssignment_2_1_1 ) )
            {
            // InternalQUBO.g:664:1: ( ( rule__Matrix__RowsAssignment_2_1_1 ) )
            // InternalQUBO.g:665:2: ( rule__Matrix__RowsAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatrixAccess().getRowsAssignment_2_1_1()); 
            }
            // InternalQUBO.g:666:2: ( rule__Matrix__RowsAssignment_2_1_1 )
            // InternalQUBO.g:666:3: rule__Matrix__RowsAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Matrix__RowsAssignment_2_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatrixAccess().getRowsAssignment_2_1_1()); 
            }

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
    // InternalQUBO.g:675:1: rule__Row__Group__0 : rule__Row__Group__0__Impl rule__Row__Group__1 ;
    public final void rule__Row__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:679:1: ( rule__Row__Group__0__Impl rule__Row__Group__1 )
            // InternalQUBO.g:680:2: rule__Row__Group__0__Impl rule__Row__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Row__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Row__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalQUBO.g:687:1: rule__Row__Group__0__Impl : ( () ) ;
    public final void rule__Row__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:691:1: ( ( () ) )
            // InternalQUBO.g:692:1: ( () )
            {
            // InternalQUBO.g:692:1: ( () )
            // InternalQUBO.g:693:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getRowAction_0()); 
            }
            // InternalQUBO.g:694:2: ()
            // InternalQUBO.g:694:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRowAccess().getRowAction_0()); 
            }

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
    // InternalQUBO.g:702:1: rule__Row__Group__1 : rule__Row__Group__1__Impl rule__Row__Group__2 ;
    public final void rule__Row__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:706:1: ( rule__Row__Group__1__Impl rule__Row__Group__2 )
            // InternalQUBO.g:707:2: rule__Row__Group__1__Impl rule__Row__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Row__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Row__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalQUBO.g:714:1: rule__Row__Group__1__Impl : ( '[' ) ;
    public final void rule__Row__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:718:1: ( ( '[' ) )
            // InternalQUBO.g:719:1: ( '[' )
            {
            // InternalQUBO.g:719:1: ( '[' )
            // InternalQUBO.g:720:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getLeftSquareBracketKeyword_1()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRowAccess().getLeftSquareBracketKeyword_1()); 
            }

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
    // InternalQUBO.g:729:1: rule__Row__Group__2 : rule__Row__Group__2__Impl rule__Row__Group__3 ;
    public final void rule__Row__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:733:1: ( rule__Row__Group__2__Impl rule__Row__Group__3 )
            // InternalQUBO.g:734:2: rule__Row__Group__2__Impl rule__Row__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Row__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Row__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalQUBO.g:741:1: rule__Row__Group__2__Impl : ( ( rule__Row__Group_2__0 )? ) ;
    public final void rule__Row__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:745:1: ( ( ( rule__Row__Group_2__0 )? ) )
            // InternalQUBO.g:746:1: ( ( rule__Row__Group_2__0 )? )
            {
            // InternalQUBO.g:746:1: ( ( rule__Row__Group_2__0 )? )
            // InternalQUBO.g:747:2: ( rule__Row__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getGroup_2()); 
            }
            // InternalQUBO.g:748:2: ( rule__Row__Group_2__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT||(LA6_0>=19 && LA6_0<=21)) ) {
                alt6=1;
            }
            else if ( (LA6_0==18) ) {
                int LA6_2 = input.LA(2);

                if ( (synpred6_InternalQUBO()) ) {
                    alt6=1;
                }
            }
            switch (alt6) {
                case 1 :
                    // InternalQUBO.g:748:3: rule__Row__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Row__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRowAccess().getGroup_2()); 
            }

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
    // InternalQUBO.g:756:1: rule__Row__Group__3 : rule__Row__Group__3__Impl ;
    public final void rule__Row__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:760:1: ( rule__Row__Group__3__Impl )
            // InternalQUBO.g:761:2: rule__Row__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Row__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalQUBO.g:767:1: rule__Row__Group__3__Impl : ( ( ']' ) ) ;
    public final void rule__Row__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:771:1: ( ( ( ']' ) ) )
            // InternalQUBO.g:772:1: ( ( ']' ) )
            {
            // InternalQUBO.g:772:1: ( ( ']' ) )
            // InternalQUBO.g:773:2: ( ']' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getRightSquareBracketKeyword_3()); 
            }
            // InternalQUBO.g:774:2: ( ']' )
            // InternalQUBO.g:774:3: ']'
            {
            match(input,18,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRowAccess().getRightSquareBracketKeyword_3()); 
            }

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
    // InternalQUBO.g:783:1: rule__Row__Group_2__0 : rule__Row__Group_2__0__Impl rule__Row__Group_2__1 ;
    public final void rule__Row__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:787:1: ( rule__Row__Group_2__0__Impl rule__Row__Group_2__1 )
            // InternalQUBO.g:788:2: rule__Row__Group_2__0__Impl rule__Row__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__Row__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Row__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalQUBO.g:795:1: rule__Row__Group_2__0__Impl : ( ( rule__Row__ColumnsAssignment_2_0 ) ) ;
    public final void rule__Row__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:799:1: ( ( ( rule__Row__ColumnsAssignment_2_0 ) ) )
            // InternalQUBO.g:800:1: ( ( rule__Row__ColumnsAssignment_2_0 ) )
            {
            // InternalQUBO.g:800:1: ( ( rule__Row__ColumnsAssignment_2_0 ) )
            // InternalQUBO.g:801:2: ( rule__Row__ColumnsAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getColumnsAssignment_2_0()); 
            }
            // InternalQUBO.g:802:2: ( rule__Row__ColumnsAssignment_2_0 )
            // InternalQUBO.g:802:3: rule__Row__ColumnsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Row__ColumnsAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRowAccess().getColumnsAssignment_2_0()); 
            }

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
    // InternalQUBO.g:810:1: rule__Row__Group_2__1 : rule__Row__Group_2__1__Impl ;
    public final void rule__Row__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:814:1: ( rule__Row__Group_2__1__Impl )
            // InternalQUBO.g:815:2: rule__Row__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Row__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalQUBO.g:821:1: rule__Row__Group_2__1__Impl : ( ( rule__Row__Group_2_1__0 )* ) ;
    public final void rule__Row__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:825:1: ( ( ( rule__Row__Group_2_1__0 )* ) )
            // InternalQUBO.g:826:1: ( ( rule__Row__Group_2_1__0 )* )
            {
            // InternalQUBO.g:826:1: ( ( rule__Row__Group_2_1__0 )* )
            // InternalQUBO.g:827:2: ( rule__Row__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getGroup_2_1()); 
            }
            // InternalQUBO.g:828:2: ( rule__Row__Group_2_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalQUBO.g:828:3: rule__Row__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Row__Group_2_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRowAccess().getGroup_2_1()); 
            }

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
    // InternalQUBO.g:837:1: rule__Row__Group_2_1__0 : rule__Row__Group_2_1__0__Impl rule__Row__Group_2_1__1 ;
    public final void rule__Row__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:841:1: ( rule__Row__Group_2_1__0__Impl rule__Row__Group_2_1__1 )
            // InternalQUBO.g:842:2: rule__Row__Group_2_1__0__Impl rule__Row__Group_2_1__1
            {
            pushFollow(FOLLOW_11);
            rule__Row__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Row__Group_2_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalQUBO.g:849:1: rule__Row__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__Row__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:853:1: ( ( ',' ) )
            // InternalQUBO.g:854:1: ( ',' )
            {
            // InternalQUBO.g:854:1: ( ',' )
            // InternalQUBO.g:855:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getCommaKeyword_2_1_0()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRowAccess().getCommaKeyword_2_1_0()); 
            }

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
    // InternalQUBO.g:864:1: rule__Row__Group_2_1__1 : rule__Row__Group_2_1__1__Impl ;
    public final void rule__Row__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:868:1: ( rule__Row__Group_2_1__1__Impl )
            // InternalQUBO.g:869:2: rule__Row__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Row__Group_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalQUBO.g:875:1: rule__Row__Group_2_1__1__Impl : ( ( rule__Row__ColumnsAssignment_2_1_1 ) ) ;
    public final void rule__Row__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:879:1: ( ( ( rule__Row__ColumnsAssignment_2_1_1 ) ) )
            // InternalQUBO.g:880:1: ( ( rule__Row__ColumnsAssignment_2_1_1 ) )
            {
            // InternalQUBO.g:880:1: ( ( rule__Row__ColumnsAssignment_2_1_1 ) )
            // InternalQUBO.g:881:2: ( rule__Row__ColumnsAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getColumnsAssignment_2_1_1()); 
            }
            // InternalQUBO.g:882:2: ( rule__Row__ColumnsAssignment_2_1_1 )
            // InternalQUBO.g:882:3: rule__Row__ColumnsAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Row__ColumnsAssignment_2_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRowAccess().getColumnsAssignment_2_1_1()); 
            }

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
    // InternalQUBO.g:891:1: rule__Column__Group__0 : rule__Column__Group__0__Impl rule__Column__Group__1 ;
    public final void rule__Column__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:895:1: ( rule__Column__Group__0__Impl rule__Column__Group__1 )
            // InternalQUBO.g:896:2: rule__Column__Group__0__Impl rule__Column__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Column__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Column__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalQUBO.g:903:1: rule__Column__Group__0__Impl : ( () ) ;
    public final void rule__Column__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:907:1: ( ( () ) )
            // InternalQUBO.g:908:1: ( () )
            {
            // InternalQUBO.g:908:1: ( () )
            // InternalQUBO.g:909:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColumnAccess().getColumnAction_0()); 
            }
            // InternalQUBO.g:910:2: ()
            // InternalQUBO.g:910:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getColumnAccess().getColumnAction_0()); 
            }

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
    // InternalQUBO.g:918:1: rule__Column__Group__1 : rule__Column__Group__1__Impl ;
    public final void rule__Column__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:922:1: ( rule__Column__Group__1__Impl )
            // InternalQUBO.g:923:2: rule__Column__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Column__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // InternalQUBO.g:929:1: rule__Column__Group__1__Impl : ( ( rule__Column__ValueAssignment_1 )? ) ;
    public final void rule__Column__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:933:1: ( ( ( rule__Column__ValueAssignment_1 )? ) )
            // InternalQUBO.g:934:1: ( ( rule__Column__ValueAssignment_1 )? )
            {
            // InternalQUBO.g:934:1: ( ( rule__Column__ValueAssignment_1 )? )
            // InternalQUBO.g:935:2: ( rule__Column__ValueAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColumnAccess().getValueAssignment_1()); 
            }
            // InternalQUBO.g:936:2: ( rule__Column__ValueAssignment_1 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT||(LA8_0>=20 && LA8_0<=21)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalQUBO.g:936:3: rule__Column__ValueAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Column__ValueAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getColumnAccess().getValueAssignment_1()); 
            }

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


    // $ANTLR start "rule__EInt__Group__0"
    // InternalQUBO.g:945:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:949:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalQUBO.g:950:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__EInt__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalQUBO.g:957:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:961:1: ( ( ( '-' )? ) )
            // InternalQUBO.g:962:1: ( ( '-' )? )
            {
            // InternalQUBO.g:962:1: ( ( '-' )? )
            // InternalQUBO.g:963:2: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            }
            // InternalQUBO.g:964:2: ( '-' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalQUBO.g:964:3: '-'
                    {
                    match(input,20,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            }

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
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalQUBO.g:972:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:976:1: ( rule__EInt__Group__1__Impl )
            // InternalQUBO.g:977:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalQUBO.g:983:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:987:1: ( ( RULE_INT ) )
            // InternalQUBO.g:988:1: ( RULE_INT )
            {
            // InternalQUBO.g:988:1: ( RULE_INT )
            // InternalQUBO.g:989:2: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            }

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
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__EDouble__Group__0"
    // InternalQUBO.g:999:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:1003:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalQUBO.g:1004:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__EDouble__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__EDouble__Group__0"


    // $ANTLR start "rule__EDouble__Group__0__Impl"
    // InternalQUBO.g:1011:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:1015:1: ( ( ( '-' )? ) )
            // InternalQUBO.g:1016:1: ( ( '-' )? )
            {
            // InternalQUBO.g:1016:1: ( ( '-' )? )
            // InternalQUBO.g:1017:2: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            }
            // InternalQUBO.g:1018:2: ( '-' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalQUBO.g:1018:3: '-'
                    {
                    match(input,20,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            }

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
    // $ANTLR end "rule__EDouble__Group__0__Impl"


    // $ANTLR start "rule__EDouble__Group__1"
    // InternalQUBO.g:1026:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:1030:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalQUBO.g:1031:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__EDouble__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__EDouble__Group__1"


    // $ANTLR start "rule__EDouble__Group__1__Impl"
    // InternalQUBO.g:1038:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:1042:1: ( ( ( RULE_INT )? ) )
            // InternalQUBO.g:1043:1: ( ( RULE_INT )? )
            {
            // InternalQUBO.g:1043:1: ( ( RULE_INT )? )
            // InternalQUBO.g:1044:2: ( RULE_INT )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            }
            // InternalQUBO.g:1045:2: ( RULE_INT )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_INT) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalQUBO.g:1045:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            }

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
    // $ANTLR end "rule__EDouble__Group__1__Impl"


    // $ANTLR start "rule__EDouble__Group__2"
    // InternalQUBO.g:1053:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:1057:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalQUBO.g:1058:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__EDouble__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__EDouble__Group__2"


    // $ANTLR start "rule__EDouble__Group__2__Impl"
    // InternalQUBO.g:1065:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:1069:1: ( ( '.' ) )
            // InternalQUBO.g:1070:1: ( '.' )
            {
            // InternalQUBO.g:1070:1: ( '.' )
            // InternalQUBO.g:1071:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            }

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
    // $ANTLR end "rule__EDouble__Group__2__Impl"


    // $ANTLR start "rule__EDouble__Group__3"
    // InternalQUBO.g:1080:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:1084:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // InternalQUBO.g:1085:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__EDouble__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__EDouble__Group__3"


    // $ANTLR start "rule__EDouble__Group__3__Impl"
    // InternalQUBO.g:1092:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:1096:1: ( ( RULE_INT ) )
            // InternalQUBO.g:1097:1: ( RULE_INT )
            {
            // InternalQUBO.g:1097:1: ( RULE_INT )
            // InternalQUBO.g:1098:2: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
            }

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
    // $ANTLR end "rule__EDouble__Group__3__Impl"


    // $ANTLR start "rule__EDouble__Group__4"
    // InternalQUBO.g:1107:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:1111:1: ( rule__EDouble__Group__4__Impl )
            // InternalQUBO.g:1112:2: rule__EDouble__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__EDouble__Group__4"


    // $ANTLR start "rule__EDouble__Group__4__Impl"
    // InternalQUBO.g:1118:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:1122:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // InternalQUBO.g:1123:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // InternalQUBO.g:1123:1: ( ( rule__EDouble__Group_4__0 )? )
            // InternalQUBO.g:1124:2: ( rule__EDouble__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            }
            // InternalQUBO.g:1125:2: ( rule__EDouble__Group_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=11 && LA12_0<=12)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalQUBO.g:1125:3: rule__EDouble__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EDouble__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDoubleAccess().getGroup_4()); 
            }

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
    // $ANTLR end "rule__EDouble__Group__4__Impl"


    // $ANTLR start "rule__EDouble__Group_4__0"
    // InternalQUBO.g:1134:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:1138:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // InternalQUBO.g:1139:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
            {
            pushFollow(FOLLOW_12);
            rule__EDouble__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__EDouble__Group_4__0"


    // $ANTLR start "rule__EDouble__Group_4__0__Impl"
    // InternalQUBO.g:1146:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:1150:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // InternalQUBO.g:1151:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // InternalQUBO.g:1151:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // InternalQUBO.g:1152:2: ( rule__EDouble__Alternatives_4_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            }
            // InternalQUBO.g:1153:2: ( rule__EDouble__Alternatives_4_0 )
            // InternalQUBO.g:1153:3: rule__EDouble__Alternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Alternatives_4_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            }

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
    // $ANTLR end "rule__EDouble__Group_4__0__Impl"


    // $ANTLR start "rule__EDouble__Group_4__1"
    // InternalQUBO.g:1161:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:1165:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // InternalQUBO.g:1166:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
            {
            pushFollow(FOLLOW_12);
            rule__EDouble__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__EDouble__Group_4__1"


    // $ANTLR start "rule__EDouble__Group_4__1__Impl"
    // InternalQUBO.g:1173:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:1177:1: ( ( ( '-' )? ) )
            // InternalQUBO.g:1178:1: ( ( '-' )? )
            {
            // InternalQUBO.g:1178:1: ( ( '-' )? )
            // InternalQUBO.g:1179:2: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            }
            // InternalQUBO.g:1180:2: ( '-' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==20) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalQUBO.g:1180:3: '-'
                    {
                    match(input,20,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            }

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
    // $ANTLR end "rule__EDouble__Group_4__1__Impl"


    // $ANTLR start "rule__EDouble__Group_4__2"
    // InternalQUBO.g:1188:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:1192:1: ( rule__EDouble__Group_4__2__Impl )
            // InternalQUBO.g:1193:2: rule__EDouble__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__EDouble__Group_4__2"


    // $ANTLR start "rule__EDouble__Group_4__2__Impl"
    // InternalQUBO.g:1199:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:1203:1: ( ( RULE_INT ) )
            // InternalQUBO.g:1204:1: ( RULE_INT )
            {
            // InternalQUBO.g:1204:1: ( RULE_INT )
            // InternalQUBO.g:1205:2: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 
            }

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
    // $ANTLR end "rule__EDouble__Group_4__2__Impl"


    // $ANTLR start "rule__Qubo__MatrixAssignment_3_1"
    // InternalQUBO.g:1215:1: rule__Qubo__MatrixAssignment_3_1 : ( ruleMatrix ) ;
    public final void rule__Qubo__MatrixAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:1219:1: ( ( ruleMatrix ) )
            // InternalQUBO.g:1220:2: ( ruleMatrix )
            {
            // InternalQUBO.g:1220:2: ( ruleMatrix )
            // InternalQUBO.g:1221:3: ruleMatrix
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQuboAccess().getMatrixMatrixParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMatrix();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQuboAccess().getMatrixMatrixParserRuleCall_3_1_0()); 
            }

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
    // InternalQUBO.g:1230:1: rule__Matrix__RowsAssignment_2_0 : ( ruleRow ) ;
    public final void rule__Matrix__RowsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:1234:1: ( ( ruleRow ) )
            // InternalQUBO.g:1235:2: ( ruleRow )
            {
            // InternalQUBO.g:1235:2: ( ruleRow )
            // InternalQUBO.g:1236:3: ruleRow
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatrixAccess().getRowsRowParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRow();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatrixAccess().getRowsRowParserRuleCall_2_0_0()); 
            }

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
    // InternalQUBO.g:1245:1: rule__Matrix__RowsAssignment_2_1_1 : ( ruleRow ) ;
    public final void rule__Matrix__RowsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:1249:1: ( ( ruleRow ) )
            // InternalQUBO.g:1250:2: ( ruleRow )
            {
            // InternalQUBO.g:1250:2: ( ruleRow )
            // InternalQUBO.g:1251:3: ruleRow
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMatrixAccess().getRowsRowParserRuleCall_2_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRow();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMatrixAccess().getRowsRowParserRuleCall_2_1_1_0()); 
            }

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
    // InternalQUBO.g:1260:1: rule__Row__ColumnsAssignment_2_0 : ( ruleColumn ) ;
    public final void rule__Row__ColumnsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:1264:1: ( ( ruleColumn ) )
            // InternalQUBO.g:1265:2: ( ruleColumn )
            {
            // InternalQUBO.g:1265:2: ( ruleColumn )
            // InternalQUBO.g:1266:3: ruleColumn
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getColumnsColumnParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleColumn();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRowAccess().getColumnsColumnParserRuleCall_2_0_0()); 
            }

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
    // InternalQUBO.g:1275:1: rule__Row__ColumnsAssignment_2_1_1 : ( ruleColumn ) ;
    public final void rule__Row__ColumnsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:1279:1: ( ( ruleColumn ) )
            // InternalQUBO.g:1280:2: ( ruleColumn )
            {
            // InternalQUBO.g:1280:2: ( ruleColumn )
            // InternalQUBO.g:1281:3: ruleColumn
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRowAccess().getColumnsColumnParserRuleCall_2_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleColumn();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRowAccess().getColumnsColumnParserRuleCall_2_1_1_0()); 
            }

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
    // InternalQUBO.g:1290:1: rule__Column__ValueAssignment_1 : ( ruleEDoubleDefinition ) ;
    public final void rule__Column__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQUBO.g:1294:1: ( ( ruleEDoubleDefinition ) )
            // InternalQUBO.g:1295:2: ( ruleEDoubleDefinition )
            {
            // InternalQUBO.g:1295:2: ( ruleEDoubleDefinition )
            // InternalQUBO.g:1296:3: ruleEDoubleDefinition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColumnAccess().getValueEDoubleDefinitionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEDoubleDefinition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getColumnAccess().getValueEDoubleDefinitionParserRuleCall_1_0()); 
            }

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

    // $ANTLR start synpred6_InternalQUBO
    public final void synpred6_InternalQUBO_fragment() throws RecognitionException {   
        // InternalQUBO.g:748:3: ( rule__Row__Group_2__0 )
        // InternalQUBO.g:748:3: rule__Row__Group_2__0
        {
        pushFollow(FOLLOW_2);
        rule__Row__Group_2__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_InternalQUBO

    // Delegated rules

    public final boolean synpred6_InternalQUBO() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalQUBO_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000340010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000300010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000001800L});

}