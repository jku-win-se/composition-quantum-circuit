package quantum.circuit.lang.ide.contentassist.antlr.internal;

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
import quantum.circuit.lang.services.QuCircuitGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQuCircuitParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'NONE'", "'SHIFT'", "'CHANGE_BLOCK'", "'QuantumCircuit'", "'{'", "'}'", "'QuantumRegister'", "'NumberOfQubits'", "'('", "')'", "'ClassicRegister'", "'NumberOfBits'", "'Layer'", "','", "'StatePreparation'", "'operation'", "'targetQubits'", "'['", "']'", "'ElementaryQuantumGate'", "'controlQubits'", "'angleParameter'", "'theta'", "'phi'", "'lambda'", "'Measurement'", "'classicBits'", "'CompositeQuantumGate'", "'Loop'", "'loop'", "'loopTargetQubits'", "'iterations'", "'targetQubitsBlockSize'", "'controlQubitsBlockSize'", "'controlQubitsIterationType'", "'targetQubitsIterationType'", "'incrementBy'", "'operations'", "'fixedControlQubits'", "'fixedTargetQubits'", "'loopControlQubits'", "'-'", "'.'", "'inverseForm'", "'incrementBlockTargetQubits'", "'incrementBlockControlQubits'", "'incrementTargetQubits'", "'incrementControlQubits'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalQuCircuitParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalQuCircuitParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalQuCircuitParser.tokenNames; }
    public String getGrammarFileName() { return "InternalQuCircuit.g"; }


    	private QuCircuitGrammarAccess grammarAccess;

    	public void setGrammarAccess(QuCircuitGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleQuantumCircuit"
    // InternalQuCircuit.g:53:1: entryRuleQuantumCircuit : ruleQuantumCircuit EOF ;
    public final void entryRuleQuantumCircuit() throws RecognitionException {
        try {
            // InternalQuCircuit.g:54:1: ( ruleQuantumCircuit EOF )
            // InternalQuCircuit.g:55:1: ruleQuantumCircuit EOF
            {
             before(grammarAccess.getQuantumCircuitRule()); 
            pushFollow(FOLLOW_1);
            ruleQuantumCircuit();

            state._fsp--;

             after(grammarAccess.getQuantumCircuitRule()); 
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
    // $ANTLR end "entryRuleQuantumCircuit"


    // $ANTLR start "ruleQuantumCircuit"
    // InternalQuCircuit.g:62:1: ruleQuantumCircuit : ( ( rule__QuantumCircuit__Group__0 ) ) ;
    public final void ruleQuantumCircuit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:66:2: ( ( ( rule__QuantumCircuit__Group__0 ) ) )
            // InternalQuCircuit.g:67:2: ( ( rule__QuantumCircuit__Group__0 ) )
            {
            // InternalQuCircuit.g:67:2: ( ( rule__QuantumCircuit__Group__0 ) )
            // InternalQuCircuit.g:68:3: ( rule__QuantumCircuit__Group__0 )
            {
             before(grammarAccess.getQuantumCircuitAccess().getGroup()); 
            // InternalQuCircuit.g:69:3: ( rule__QuantumCircuit__Group__0 )
            // InternalQuCircuit.g:69:4: rule__QuantumCircuit__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QuantumCircuit__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuantumCircuitAccess().getGroup()); 

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
    // $ANTLR end "ruleQuantumCircuit"


    // $ANTLR start "entryRuleQuantumRegister"
    // InternalQuCircuit.g:78:1: entryRuleQuantumRegister : ruleQuantumRegister EOF ;
    public final void entryRuleQuantumRegister() throws RecognitionException {
        try {
            // InternalQuCircuit.g:79:1: ( ruleQuantumRegister EOF )
            // InternalQuCircuit.g:80:1: ruleQuantumRegister EOF
            {
             before(grammarAccess.getQuantumRegisterRule()); 
            pushFollow(FOLLOW_1);
            ruleQuantumRegister();

            state._fsp--;

             after(grammarAccess.getQuantumRegisterRule()); 
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
    // $ANTLR end "entryRuleQuantumRegister"


    // $ANTLR start "ruleQuantumRegister"
    // InternalQuCircuit.g:87:1: ruleQuantumRegister : ( ( rule__QuantumRegister__Group__0 ) ) ;
    public final void ruleQuantumRegister() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:91:2: ( ( ( rule__QuantumRegister__Group__0 ) ) )
            // InternalQuCircuit.g:92:2: ( ( rule__QuantumRegister__Group__0 ) )
            {
            // InternalQuCircuit.g:92:2: ( ( rule__QuantumRegister__Group__0 ) )
            // InternalQuCircuit.g:93:3: ( rule__QuantumRegister__Group__0 )
            {
             before(grammarAccess.getQuantumRegisterAccess().getGroup()); 
            // InternalQuCircuit.g:94:3: ( rule__QuantumRegister__Group__0 )
            // InternalQuCircuit.g:94:4: rule__QuantumRegister__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QuantumRegister__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuantumRegisterAccess().getGroup()); 

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
    // $ANTLR end "ruleQuantumRegister"


    // $ANTLR start "entryRuleSimplifiedQuantumRegister"
    // InternalQuCircuit.g:103:1: entryRuleSimplifiedQuantumRegister : ruleSimplifiedQuantumRegister EOF ;
    public final void entryRuleSimplifiedQuantumRegister() throws RecognitionException {
        try {
            // InternalQuCircuit.g:104:1: ( ruleSimplifiedQuantumRegister EOF )
            // InternalQuCircuit.g:105:1: ruleSimplifiedQuantumRegister EOF
            {
             before(grammarAccess.getSimplifiedQuantumRegisterRule()); 
            pushFollow(FOLLOW_1);
            ruleSimplifiedQuantumRegister();

            state._fsp--;

             after(grammarAccess.getSimplifiedQuantumRegisterRule()); 
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
    // $ANTLR end "entryRuleSimplifiedQuantumRegister"


    // $ANTLR start "ruleSimplifiedQuantumRegister"
    // InternalQuCircuit.g:112:1: ruleSimplifiedQuantumRegister : ( ( rule__SimplifiedQuantumRegister__Group__0 ) ) ;
    public final void ruleSimplifiedQuantumRegister() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:116:2: ( ( ( rule__SimplifiedQuantumRegister__Group__0 ) ) )
            // InternalQuCircuit.g:117:2: ( ( rule__SimplifiedQuantumRegister__Group__0 ) )
            {
            // InternalQuCircuit.g:117:2: ( ( rule__SimplifiedQuantumRegister__Group__0 ) )
            // InternalQuCircuit.g:118:3: ( rule__SimplifiedQuantumRegister__Group__0 )
            {
             before(grammarAccess.getSimplifiedQuantumRegisterAccess().getGroup()); 
            // InternalQuCircuit.g:119:3: ( rule__SimplifiedQuantumRegister__Group__0 )
            // InternalQuCircuit.g:119:4: rule__SimplifiedQuantumRegister__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SimplifiedQuantumRegister__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimplifiedQuantumRegisterAccess().getGroup()); 

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
    // $ANTLR end "ruleSimplifiedQuantumRegister"


    // $ANTLR start "entryRuleClassicRegister"
    // InternalQuCircuit.g:128:1: entryRuleClassicRegister : ruleClassicRegister EOF ;
    public final void entryRuleClassicRegister() throws RecognitionException {
        try {
            // InternalQuCircuit.g:129:1: ( ruleClassicRegister EOF )
            // InternalQuCircuit.g:130:1: ruleClassicRegister EOF
            {
             before(grammarAccess.getClassicRegisterRule()); 
            pushFollow(FOLLOW_1);
            ruleClassicRegister();

            state._fsp--;

             after(grammarAccess.getClassicRegisterRule()); 
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
    // $ANTLR end "entryRuleClassicRegister"


    // $ANTLR start "ruleClassicRegister"
    // InternalQuCircuit.g:137:1: ruleClassicRegister : ( ( rule__ClassicRegister__Group__0 ) ) ;
    public final void ruleClassicRegister() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:141:2: ( ( ( rule__ClassicRegister__Group__0 ) ) )
            // InternalQuCircuit.g:142:2: ( ( rule__ClassicRegister__Group__0 ) )
            {
            // InternalQuCircuit.g:142:2: ( ( rule__ClassicRegister__Group__0 ) )
            // InternalQuCircuit.g:143:3: ( rule__ClassicRegister__Group__0 )
            {
             before(grammarAccess.getClassicRegisterAccess().getGroup()); 
            // InternalQuCircuit.g:144:3: ( rule__ClassicRegister__Group__0 )
            // InternalQuCircuit.g:144:4: rule__ClassicRegister__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ClassicRegister__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassicRegisterAccess().getGroup()); 

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
    // $ANTLR end "ruleClassicRegister"


    // $ANTLR start "entryRuleLayer"
    // InternalQuCircuit.g:153:1: entryRuleLayer : ruleLayer EOF ;
    public final void entryRuleLayer() throws RecognitionException {
        try {
            // InternalQuCircuit.g:154:1: ( ruleLayer EOF )
            // InternalQuCircuit.g:155:1: ruleLayer EOF
            {
             before(grammarAccess.getLayerRule()); 
            pushFollow(FOLLOW_1);
            ruleLayer();

            state._fsp--;

             after(grammarAccess.getLayerRule()); 
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
    // $ANTLR end "entryRuleLayer"


    // $ANTLR start "ruleLayer"
    // InternalQuCircuit.g:162:1: ruleLayer : ( ( rule__Layer__Group__0 ) ) ;
    public final void ruleLayer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:166:2: ( ( ( rule__Layer__Group__0 ) ) )
            // InternalQuCircuit.g:167:2: ( ( rule__Layer__Group__0 ) )
            {
            // InternalQuCircuit.g:167:2: ( ( rule__Layer__Group__0 ) )
            // InternalQuCircuit.g:168:3: ( rule__Layer__Group__0 )
            {
             before(grammarAccess.getLayerAccess().getGroup()); 
            // InternalQuCircuit.g:169:3: ( rule__Layer__Group__0 )
            // InternalQuCircuit.g:169:4: rule__Layer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Layer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLayerAccess().getGroup()); 

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
    // $ANTLR end "ruleLayer"


    // $ANTLR start "entryRuleQuantumOperation"
    // InternalQuCircuit.g:178:1: entryRuleQuantumOperation : ruleQuantumOperation EOF ;
    public final void entryRuleQuantumOperation() throws RecognitionException {
        try {
            // InternalQuCircuit.g:179:1: ( ruleQuantumOperation EOF )
            // InternalQuCircuit.g:180:1: ruleQuantumOperation EOF
            {
             before(grammarAccess.getQuantumOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleQuantumOperation();

            state._fsp--;

             after(grammarAccess.getQuantumOperationRule()); 
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
    // $ANTLR end "entryRuleQuantumOperation"


    // $ANTLR start "ruleQuantumOperation"
    // InternalQuCircuit.g:187:1: ruleQuantumOperation : ( ( rule__QuantumOperation__Alternatives ) ) ;
    public final void ruleQuantumOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:191:2: ( ( ( rule__QuantumOperation__Alternatives ) ) )
            // InternalQuCircuit.g:192:2: ( ( rule__QuantumOperation__Alternatives ) )
            {
            // InternalQuCircuit.g:192:2: ( ( rule__QuantumOperation__Alternatives ) )
            // InternalQuCircuit.g:193:3: ( rule__QuantumOperation__Alternatives )
            {
             before(grammarAccess.getQuantumOperationAccess().getAlternatives()); 
            // InternalQuCircuit.g:194:3: ( rule__QuantumOperation__Alternatives )
            // InternalQuCircuit.g:194:4: rule__QuantumOperation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__QuantumOperation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getQuantumOperationAccess().getAlternatives()); 

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
    // $ANTLR end "ruleQuantumOperation"


    // $ANTLR start "entryRuleStatePreparation"
    // InternalQuCircuit.g:203:1: entryRuleStatePreparation : ruleStatePreparation EOF ;
    public final void entryRuleStatePreparation() throws RecognitionException {
        try {
            // InternalQuCircuit.g:204:1: ( ruleStatePreparation EOF )
            // InternalQuCircuit.g:205:1: ruleStatePreparation EOF
            {
             before(grammarAccess.getStatePreparationRule()); 
            pushFollow(FOLLOW_1);
            ruleStatePreparation();

            state._fsp--;

             after(grammarAccess.getStatePreparationRule()); 
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
    // $ANTLR end "entryRuleStatePreparation"


    // $ANTLR start "ruleStatePreparation"
    // InternalQuCircuit.g:212:1: ruleStatePreparation : ( ( rule__StatePreparation__Group__0 ) ) ;
    public final void ruleStatePreparation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:216:2: ( ( ( rule__StatePreparation__Group__0 ) ) )
            // InternalQuCircuit.g:217:2: ( ( rule__StatePreparation__Group__0 ) )
            {
            // InternalQuCircuit.g:217:2: ( ( rule__StatePreparation__Group__0 ) )
            // InternalQuCircuit.g:218:3: ( rule__StatePreparation__Group__0 )
            {
             before(grammarAccess.getStatePreparationAccess().getGroup()); 
            // InternalQuCircuit.g:219:3: ( rule__StatePreparation__Group__0 )
            // InternalQuCircuit.g:219:4: rule__StatePreparation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StatePreparation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStatePreparationAccess().getGroup()); 

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
    // $ANTLR end "ruleStatePreparation"


    // $ANTLR start "entryRuleElementaryQuantumGate"
    // InternalQuCircuit.g:228:1: entryRuleElementaryQuantumGate : ruleElementaryQuantumGate EOF ;
    public final void entryRuleElementaryQuantumGate() throws RecognitionException {
        try {
            // InternalQuCircuit.g:229:1: ( ruleElementaryQuantumGate EOF )
            // InternalQuCircuit.g:230:1: ruleElementaryQuantumGate EOF
            {
             before(grammarAccess.getElementaryQuantumGateRule()); 
            pushFollow(FOLLOW_1);
            ruleElementaryQuantumGate();

            state._fsp--;

             after(grammarAccess.getElementaryQuantumGateRule()); 
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
    // $ANTLR end "entryRuleElementaryQuantumGate"


    // $ANTLR start "ruleElementaryQuantumGate"
    // InternalQuCircuit.g:237:1: ruleElementaryQuantumGate : ( ( rule__ElementaryQuantumGate__Group__0 ) ) ;
    public final void ruleElementaryQuantumGate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:241:2: ( ( ( rule__ElementaryQuantumGate__Group__0 ) ) )
            // InternalQuCircuit.g:242:2: ( ( rule__ElementaryQuantumGate__Group__0 ) )
            {
            // InternalQuCircuit.g:242:2: ( ( rule__ElementaryQuantumGate__Group__0 ) )
            // InternalQuCircuit.g:243:3: ( rule__ElementaryQuantumGate__Group__0 )
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getGroup()); 
            // InternalQuCircuit.g:244:3: ( rule__ElementaryQuantumGate__Group__0 )
            // InternalQuCircuit.g:244:4: rule__ElementaryQuantumGate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ElementaryQuantumGate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getElementaryQuantumGateAccess().getGroup()); 

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
    // $ANTLR end "ruleElementaryQuantumGate"


    // $ANTLR start "entryRuleAngleParameter"
    // InternalQuCircuit.g:253:1: entryRuleAngleParameter : ruleAngleParameter EOF ;
    public final void entryRuleAngleParameter() throws RecognitionException {
        try {
            // InternalQuCircuit.g:254:1: ( ruleAngleParameter EOF )
            // InternalQuCircuit.g:255:1: ruleAngleParameter EOF
            {
             before(grammarAccess.getAngleParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleAngleParameter();

            state._fsp--;

             after(grammarAccess.getAngleParameterRule()); 
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
    // $ANTLR end "entryRuleAngleParameter"


    // $ANTLR start "ruleAngleParameter"
    // InternalQuCircuit.g:262:1: ruleAngleParameter : ( ( rule__AngleParameter__Group__0 ) ) ;
    public final void ruleAngleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:266:2: ( ( ( rule__AngleParameter__Group__0 ) ) )
            // InternalQuCircuit.g:267:2: ( ( rule__AngleParameter__Group__0 ) )
            {
            // InternalQuCircuit.g:267:2: ( ( rule__AngleParameter__Group__0 ) )
            // InternalQuCircuit.g:268:3: ( rule__AngleParameter__Group__0 )
            {
             before(grammarAccess.getAngleParameterAccess().getGroup()); 
            // InternalQuCircuit.g:269:3: ( rule__AngleParameter__Group__0 )
            // InternalQuCircuit.g:269:4: rule__AngleParameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AngleParameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAngleParameterAccess().getGroup()); 

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
    // $ANTLR end "ruleAngleParameter"


    // $ANTLR start "entryRuleMeasurement"
    // InternalQuCircuit.g:278:1: entryRuleMeasurement : ruleMeasurement EOF ;
    public final void entryRuleMeasurement() throws RecognitionException {
        try {
            // InternalQuCircuit.g:279:1: ( ruleMeasurement EOF )
            // InternalQuCircuit.g:280:1: ruleMeasurement EOF
            {
             before(grammarAccess.getMeasurementRule()); 
            pushFollow(FOLLOW_1);
            ruleMeasurement();

            state._fsp--;

             after(grammarAccess.getMeasurementRule()); 
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
    // $ANTLR end "entryRuleMeasurement"


    // $ANTLR start "ruleMeasurement"
    // InternalQuCircuit.g:287:1: ruleMeasurement : ( ( rule__Measurement__Group__0 ) ) ;
    public final void ruleMeasurement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:291:2: ( ( ( rule__Measurement__Group__0 ) ) )
            // InternalQuCircuit.g:292:2: ( ( rule__Measurement__Group__0 ) )
            {
            // InternalQuCircuit.g:292:2: ( ( rule__Measurement__Group__0 ) )
            // InternalQuCircuit.g:293:3: ( rule__Measurement__Group__0 )
            {
             before(grammarAccess.getMeasurementAccess().getGroup()); 
            // InternalQuCircuit.g:294:3: ( rule__Measurement__Group__0 )
            // InternalQuCircuit.g:294:4: rule__Measurement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Measurement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMeasurementAccess().getGroup()); 

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
    // $ANTLR end "ruleMeasurement"


    // $ANTLR start "entryRuleCompositeQuantumGate"
    // InternalQuCircuit.g:303:1: entryRuleCompositeQuantumGate : ruleCompositeQuantumGate EOF ;
    public final void entryRuleCompositeQuantumGate() throws RecognitionException {
        try {
            // InternalQuCircuit.g:304:1: ( ruleCompositeQuantumGate EOF )
            // InternalQuCircuit.g:305:1: ruleCompositeQuantumGate EOF
            {
             before(grammarAccess.getCompositeQuantumGateRule()); 
            pushFollow(FOLLOW_1);
            ruleCompositeQuantumGate();

            state._fsp--;

             after(grammarAccess.getCompositeQuantumGateRule()); 
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
    // $ANTLR end "entryRuleCompositeQuantumGate"


    // $ANTLR start "ruleCompositeQuantumGate"
    // InternalQuCircuit.g:312:1: ruleCompositeQuantumGate : ( ( rule__CompositeQuantumGate__Group__0 ) ) ;
    public final void ruleCompositeQuantumGate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:316:2: ( ( ( rule__CompositeQuantumGate__Group__0 ) ) )
            // InternalQuCircuit.g:317:2: ( ( rule__CompositeQuantumGate__Group__0 ) )
            {
            // InternalQuCircuit.g:317:2: ( ( rule__CompositeQuantumGate__Group__0 ) )
            // InternalQuCircuit.g:318:3: ( rule__CompositeQuantumGate__Group__0 )
            {
             before(grammarAccess.getCompositeQuantumGateAccess().getGroup()); 
            // InternalQuCircuit.g:319:3: ( rule__CompositeQuantumGate__Group__0 )
            // InternalQuCircuit.g:319:4: rule__CompositeQuantumGate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CompositeQuantumGate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompositeQuantumGateAccess().getGroup()); 

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
    // $ANTLR end "ruleCompositeQuantumGate"


    // $ANTLR start "entryRuleLoop"
    // InternalQuCircuit.g:328:1: entryRuleLoop : ruleLoop EOF ;
    public final void entryRuleLoop() throws RecognitionException {
        try {
            // InternalQuCircuit.g:329:1: ( ruleLoop EOF )
            // InternalQuCircuit.g:330:1: ruleLoop EOF
            {
             before(grammarAccess.getLoopRule()); 
            pushFollow(FOLLOW_1);
            ruleLoop();

            state._fsp--;

             after(grammarAccess.getLoopRule()); 
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
    // $ANTLR end "entryRuleLoop"


    // $ANTLR start "ruleLoop"
    // InternalQuCircuit.g:337:1: ruleLoop : ( ( rule__Loop__Group__0 ) ) ;
    public final void ruleLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:341:2: ( ( ( rule__Loop__Group__0 ) ) )
            // InternalQuCircuit.g:342:2: ( ( rule__Loop__Group__0 ) )
            {
            // InternalQuCircuit.g:342:2: ( ( rule__Loop__Group__0 ) )
            // InternalQuCircuit.g:343:3: ( rule__Loop__Group__0 )
            {
             before(grammarAccess.getLoopAccess().getGroup()); 
            // InternalQuCircuit.g:344:3: ( rule__Loop__Group__0 )
            // InternalQuCircuit.g:344:4: rule__Loop__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Loop__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getGroup()); 

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
    // $ANTLR end "ruleLoop"


    // $ANTLR start "entryRuleOperation"
    // InternalQuCircuit.g:353:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // InternalQuCircuit.g:354:1: ( ruleOperation EOF )
            // InternalQuCircuit.g:355:1: ruleOperation EOF
            {
             before(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getOperationRule()); 
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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalQuCircuit.g:362:1: ruleOperation : ( ( rule__Operation__Group__0 ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:366:2: ( ( ( rule__Operation__Group__0 ) ) )
            // InternalQuCircuit.g:367:2: ( ( rule__Operation__Group__0 ) )
            {
            // InternalQuCircuit.g:367:2: ( ( rule__Operation__Group__0 ) )
            // InternalQuCircuit.g:368:3: ( rule__Operation__Group__0 )
            {
             before(grammarAccess.getOperationAccess().getGroup()); 
            // InternalQuCircuit.g:369:3: ( rule__Operation__Group__0 )
            // InternalQuCircuit.g:369:4: rule__Operation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getGroup()); 

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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleSelector"
    // InternalQuCircuit.g:378:1: entryRuleSelector : ruleSelector EOF ;
    public final void entryRuleSelector() throws RecognitionException {
        try {
            // InternalQuCircuit.g:379:1: ( ruleSelector EOF )
            // InternalQuCircuit.g:380:1: ruleSelector EOF
            {
             before(grammarAccess.getSelectorRule()); 
            pushFollow(FOLLOW_1);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getSelectorRule()); 
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
    // $ANTLR end "entryRuleSelector"


    // $ANTLR start "ruleSelector"
    // InternalQuCircuit.g:387:1: ruleSelector : ( ( rule__Selector__Alternatives ) ) ;
    public final void ruleSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:391:2: ( ( ( rule__Selector__Alternatives ) ) )
            // InternalQuCircuit.g:392:2: ( ( rule__Selector__Alternatives ) )
            {
            // InternalQuCircuit.g:392:2: ( ( rule__Selector__Alternatives ) )
            // InternalQuCircuit.g:393:3: ( rule__Selector__Alternatives )
            {
             before(grammarAccess.getSelectorAccess().getAlternatives()); 
            // InternalQuCircuit.g:394:3: ( rule__Selector__Alternatives )
            // InternalQuCircuit.g:394:4: rule__Selector__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Selector__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSelectorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleSelector"


    // $ANTLR start "entryRuleElementSelector"
    // InternalQuCircuit.g:403:1: entryRuleElementSelector : ruleElementSelector EOF ;
    public final void entryRuleElementSelector() throws RecognitionException {
        try {
            // InternalQuCircuit.g:404:1: ( ruleElementSelector EOF )
            // InternalQuCircuit.g:405:1: ruleElementSelector EOF
            {
             before(grammarAccess.getElementSelectorRule()); 
            pushFollow(FOLLOW_1);
            ruleElementSelector();

            state._fsp--;

             after(grammarAccess.getElementSelectorRule()); 
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
    // $ANTLR end "entryRuleElementSelector"


    // $ANTLR start "ruleElementSelector"
    // InternalQuCircuit.g:412:1: ruleElementSelector : ( ( rule__ElementSelector__Group__0 ) ) ;
    public final void ruleElementSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:416:2: ( ( ( rule__ElementSelector__Group__0 ) ) )
            // InternalQuCircuit.g:417:2: ( ( rule__ElementSelector__Group__0 ) )
            {
            // InternalQuCircuit.g:417:2: ( ( rule__ElementSelector__Group__0 ) )
            // InternalQuCircuit.g:418:3: ( rule__ElementSelector__Group__0 )
            {
             before(grammarAccess.getElementSelectorAccess().getGroup()); 
            // InternalQuCircuit.g:419:3: ( rule__ElementSelector__Group__0 )
            // InternalQuCircuit.g:419:4: rule__ElementSelector__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ElementSelector__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getElementSelectorAccess().getGroup()); 

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
    // $ANTLR end "ruleElementSelector"


    // $ANTLR start "entryRuleRangeSelector"
    // InternalQuCircuit.g:428:1: entryRuleRangeSelector : ruleRangeSelector EOF ;
    public final void entryRuleRangeSelector() throws RecognitionException {
        try {
            // InternalQuCircuit.g:429:1: ( ruleRangeSelector EOF )
            // InternalQuCircuit.g:430:1: ruleRangeSelector EOF
            {
             before(grammarAccess.getRangeSelectorRule()); 
            pushFollow(FOLLOW_1);
            ruleRangeSelector();

            state._fsp--;

             after(grammarAccess.getRangeSelectorRule()); 
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
    // $ANTLR end "entryRuleRangeSelector"


    // $ANTLR start "ruleRangeSelector"
    // InternalQuCircuit.g:437:1: ruleRangeSelector : ( ( rule__RangeSelector__Group__0 ) ) ;
    public final void ruleRangeSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:441:2: ( ( ( rule__RangeSelector__Group__0 ) ) )
            // InternalQuCircuit.g:442:2: ( ( rule__RangeSelector__Group__0 ) )
            {
            // InternalQuCircuit.g:442:2: ( ( rule__RangeSelector__Group__0 ) )
            // InternalQuCircuit.g:443:3: ( rule__RangeSelector__Group__0 )
            {
             before(grammarAccess.getRangeSelectorAccess().getGroup()); 
            // InternalQuCircuit.g:444:3: ( rule__RangeSelector__Group__0 )
            // InternalQuCircuit.g:444:4: rule__RangeSelector__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RangeSelector__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRangeSelectorAccess().getGroup()); 

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
    // $ANTLR end "ruleRangeSelector"


    // $ANTLR start "entryRuleEString"
    // InternalQuCircuit.g:453:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalQuCircuit.g:454:1: ( ruleEString EOF )
            // InternalQuCircuit.g:455:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalQuCircuit.g:462:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:466:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalQuCircuit.g:467:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalQuCircuit.g:467:2: ( ( rule__EString__Alternatives ) )
            // InternalQuCircuit.g:468:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalQuCircuit.g:469:3: ( rule__EString__Alternatives )
            // InternalQuCircuit.g:469:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEDoubleObject"
    // InternalQuCircuit.g:478:1: entryRuleEDoubleObject : ruleEDoubleObject EOF ;
    public final void entryRuleEDoubleObject() throws RecognitionException {
        try {
            // InternalQuCircuit.g:479:1: ( ruleEDoubleObject EOF )
            // InternalQuCircuit.g:480:1: ruleEDoubleObject EOF
            {
             before(grammarAccess.getEDoubleObjectRule()); 
            pushFollow(FOLLOW_1);
            ruleEDoubleObject();

            state._fsp--;

             after(grammarAccess.getEDoubleObjectRule()); 
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
    // $ANTLR end "entryRuleEDoubleObject"


    // $ANTLR start "ruleEDoubleObject"
    // InternalQuCircuit.g:487:1: ruleEDoubleObject : ( ( rule__EDoubleObject__Group__0 ) ) ;
    public final void ruleEDoubleObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:491:2: ( ( ( rule__EDoubleObject__Group__0 ) ) )
            // InternalQuCircuit.g:492:2: ( ( rule__EDoubleObject__Group__0 ) )
            {
            // InternalQuCircuit.g:492:2: ( ( rule__EDoubleObject__Group__0 ) )
            // InternalQuCircuit.g:493:3: ( rule__EDoubleObject__Group__0 )
            {
             before(grammarAccess.getEDoubleObjectAccess().getGroup()); 
            // InternalQuCircuit.g:494:3: ( rule__EDoubleObject__Group__0 )
            // InternalQuCircuit.g:494:4: rule__EDoubleObject__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EDoubleObject__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleObjectAccess().getGroup()); 

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
    // $ANTLR end "ruleEDoubleObject"


    // $ANTLR start "ruleITERATION_TYPE"
    // InternalQuCircuit.g:503:1: ruleITERATION_TYPE : ( ( rule__ITERATION_TYPE__Alternatives ) ) ;
    public final void ruleITERATION_TYPE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:507:1: ( ( ( rule__ITERATION_TYPE__Alternatives ) ) )
            // InternalQuCircuit.g:508:2: ( ( rule__ITERATION_TYPE__Alternatives ) )
            {
            // InternalQuCircuit.g:508:2: ( ( rule__ITERATION_TYPE__Alternatives ) )
            // InternalQuCircuit.g:509:3: ( rule__ITERATION_TYPE__Alternatives )
            {
             before(grammarAccess.getITERATION_TYPEAccess().getAlternatives()); 
            // InternalQuCircuit.g:510:3: ( rule__ITERATION_TYPE__Alternatives )
            // InternalQuCircuit.g:510:4: rule__ITERATION_TYPE__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ITERATION_TYPE__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getITERATION_TYPEAccess().getAlternatives()); 

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
    // $ANTLR end "ruleITERATION_TYPE"


    // $ANTLR start "rule__QuantumOperation__Alternatives"
    // InternalQuCircuit.g:518:1: rule__QuantumOperation__Alternatives : ( ( ruleStatePreparation ) | ( ruleElementaryQuantumGate ) | ( ruleMeasurement ) | ( ruleCompositeQuantumGate ) | ( ruleLoop ) );
    public final void rule__QuantumOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:522:1: ( ( ruleStatePreparation ) | ( ruleElementaryQuantumGate ) | ( ruleMeasurement ) | ( ruleCompositeQuantumGate ) | ( ruleLoop ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt1=1;
                }
                break;
            case 32:
                {
                alt1=2;
                }
                break;
            case 38:
                {
                alt1=3;
                }
                break;
            case 40:
                {
                alt1=4;
                }
                break;
            case 41:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalQuCircuit.g:523:2: ( ruleStatePreparation )
                    {
                    // InternalQuCircuit.g:523:2: ( ruleStatePreparation )
                    // InternalQuCircuit.g:524:3: ruleStatePreparation
                    {
                     before(grammarAccess.getQuantumOperationAccess().getStatePreparationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleStatePreparation();

                    state._fsp--;

                     after(grammarAccess.getQuantumOperationAccess().getStatePreparationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQuCircuit.g:529:2: ( ruleElementaryQuantumGate )
                    {
                    // InternalQuCircuit.g:529:2: ( ruleElementaryQuantumGate )
                    // InternalQuCircuit.g:530:3: ruleElementaryQuantumGate
                    {
                     before(grammarAccess.getQuantumOperationAccess().getElementaryQuantumGateParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleElementaryQuantumGate();

                    state._fsp--;

                     after(grammarAccess.getQuantumOperationAccess().getElementaryQuantumGateParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQuCircuit.g:535:2: ( ruleMeasurement )
                    {
                    // InternalQuCircuit.g:535:2: ( ruleMeasurement )
                    // InternalQuCircuit.g:536:3: ruleMeasurement
                    {
                     before(grammarAccess.getQuantumOperationAccess().getMeasurementParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleMeasurement();

                    state._fsp--;

                     after(grammarAccess.getQuantumOperationAccess().getMeasurementParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalQuCircuit.g:541:2: ( ruleCompositeQuantumGate )
                    {
                    // InternalQuCircuit.g:541:2: ( ruleCompositeQuantumGate )
                    // InternalQuCircuit.g:542:3: ruleCompositeQuantumGate
                    {
                     before(grammarAccess.getQuantumOperationAccess().getCompositeQuantumGateParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleCompositeQuantumGate();

                    state._fsp--;

                     after(grammarAccess.getQuantumOperationAccess().getCompositeQuantumGateParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalQuCircuit.g:547:2: ( ruleLoop )
                    {
                    // InternalQuCircuit.g:547:2: ( ruleLoop )
                    // InternalQuCircuit.g:548:3: ruleLoop
                    {
                     before(grammarAccess.getQuantumOperationAccess().getLoopParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleLoop();

                    state._fsp--;

                     after(grammarAccess.getQuantumOperationAccess().getLoopParserRuleCall_4()); 

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
    // $ANTLR end "rule__QuantumOperation__Alternatives"


    // $ANTLR start "rule__Selector__Alternatives"
    // InternalQuCircuit.g:557:1: rule__Selector__Alternatives : ( ( ruleElementSelector ) | ( ruleRangeSelector ) );
    public final void rule__Selector__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:561:1: ( ( ruleElementSelector ) | ( ruleRangeSelector ) )
            int alt2=2;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==26) ) {
                    int LA2_4 = input.LA(3);

                    if ( (LA2_4==RULE_INT) ) {
                        int LA2_3 = input.LA(4);

                        if ( (LA2_3==54) ) {
                            alt2=2;
                        }
                        else if ( (LA2_3==EOF||LA2_3==22||LA2_3==26||LA2_3==31) ) {
                            alt2=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==26) ) {
                    int LA2_4 = input.LA(3);

                    if ( (LA2_4==RULE_INT) ) {
                        int LA2_3 = input.LA(4);

                        if ( (LA2_3==54) ) {
                            alt2=2;
                        }
                        else if ( (LA2_3==EOF||LA2_3==22||LA2_3==26||LA2_3==31) ) {
                            alt2=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA2_3 = input.LA(2);

                if ( (LA2_3==54) ) {
                    alt2=2;
                }
                else if ( (LA2_3==EOF||LA2_3==22||LA2_3==26||LA2_3==31) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalQuCircuit.g:562:2: ( ruleElementSelector )
                    {
                    // InternalQuCircuit.g:562:2: ( ruleElementSelector )
                    // InternalQuCircuit.g:563:3: ruleElementSelector
                    {
                     before(grammarAccess.getSelectorAccess().getElementSelectorParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleElementSelector();

                    state._fsp--;

                     after(grammarAccess.getSelectorAccess().getElementSelectorParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQuCircuit.g:568:2: ( ruleRangeSelector )
                    {
                    // InternalQuCircuit.g:568:2: ( ruleRangeSelector )
                    // InternalQuCircuit.g:569:3: ruleRangeSelector
                    {
                     before(grammarAccess.getSelectorAccess().getRangeSelectorParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRangeSelector();

                    state._fsp--;

                     after(grammarAccess.getSelectorAccess().getRangeSelectorParserRuleCall_1()); 

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
    // $ANTLR end "rule__Selector__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalQuCircuit.g:578:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:582:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalQuCircuit.g:583:2: ( RULE_STRING )
                    {
                    // InternalQuCircuit.g:583:2: ( RULE_STRING )
                    // InternalQuCircuit.g:584:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQuCircuit.g:589:2: ( RULE_ID )
                    {
                    // InternalQuCircuit.g:589:2: ( RULE_ID )
                    // InternalQuCircuit.g:590:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__EDoubleObject__Alternatives_4_0"
    // InternalQuCircuit.g:599:1: rule__EDoubleObject__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDoubleObject__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:603:1: ( ( 'E' ) | ( 'e' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalQuCircuit.g:604:2: ( 'E' )
                    {
                    // InternalQuCircuit.g:604:2: ( 'E' )
                    // InternalQuCircuit.g:605:3: 'E'
                    {
                     before(grammarAccess.getEDoubleObjectAccess().getEKeyword_4_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEDoubleObjectAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQuCircuit.g:610:2: ( 'e' )
                    {
                    // InternalQuCircuit.g:610:2: ( 'e' )
                    // InternalQuCircuit.g:611:3: 'e'
                    {
                     before(grammarAccess.getEDoubleObjectAccess().getEKeyword_4_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEDoubleObjectAccess().getEKeyword_4_0_1()); 

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
    // $ANTLR end "rule__EDoubleObject__Alternatives_4_0"


    // $ANTLR start "rule__ITERATION_TYPE__Alternatives"
    // InternalQuCircuit.g:620:1: rule__ITERATION_TYPE__Alternatives : ( ( ( 'NONE' ) ) | ( ( 'SHIFT' ) ) | ( ( 'CHANGE_BLOCK' ) ) );
    public final void rule__ITERATION_TYPE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:624:1: ( ( ( 'NONE' ) ) | ( ( 'SHIFT' ) ) | ( ( 'CHANGE_BLOCK' ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt5=1;
                }
                break;
            case 14:
                {
                alt5=2;
                }
                break;
            case 15:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalQuCircuit.g:625:2: ( ( 'NONE' ) )
                    {
                    // InternalQuCircuit.g:625:2: ( ( 'NONE' ) )
                    // InternalQuCircuit.g:626:3: ( 'NONE' )
                    {
                     before(grammarAccess.getITERATION_TYPEAccess().getNONEEnumLiteralDeclaration_0()); 
                    // InternalQuCircuit.g:627:3: ( 'NONE' )
                    // InternalQuCircuit.g:627:4: 'NONE'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getITERATION_TYPEAccess().getNONEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQuCircuit.g:631:2: ( ( 'SHIFT' ) )
                    {
                    // InternalQuCircuit.g:631:2: ( ( 'SHIFT' ) )
                    // InternalQuCircuit.g:632:3: ( 'SHIFT' )
                    {
                     before(grammarAccess.getITERATION_TYPEAccess().getSHIFTEnumLiteralDeclaration_1()); 
                    // InternalQuCircuit.g:633:3: ( 'SHIFT' )
                    // InternalQuCircuit.g:633:4: 'SHIFT'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getITERATION_TYPEAccess().getSHIFTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQuCircuit.g:637:2: ( ( 'CHANGE_BLOCK' ) )
                    {
                    // InternalQuCircuit.g:637:2: ( ( 'CHANGE_BLOCK' ) )
                    // InternalQuCircuit.g:638:3: ( 'CHANGE_BLOCK' )
                    {
                     before(grammarAccess.getITERATION_TYPEAccess().getCHANGE_BLOCKEnumLiteralDeclaration_2()); 
                    // InternalQuCircuit.g:639:3: ( 'CHANGE_BLOCK' )
                    // InternalQuCircuit.g:639:4: 'CHANGE_BLOCK'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getITERATION_TYPEAccess().getCHANGE_BLOCKEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__ITERATION_TYPE__Alternatives"


    // $ANTLR start "rule__QuantumCircuit__Group__0"
    // InternalQuCircuit.g:647:1: rule__QuantumCircuit__Group__0 : rule__QuantumCircuit__Group__0__Impl rule__QuantumCircuit__Group__1 ;
    public final void rule__QuantumCircuit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:651:1: ( rule__QuantumCircuit__Group__0__Impl rule__QuantumCircuit__Group__1 )
            // InternalQuCircuit.g:652:2: rule__QuantumCircuit__Group__0__Impl rule__QuantumCircuit__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__QuantumCircuit__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuantumCircuit__Group__1();

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
    // $ANTLR end "rule__QuantumCircuit__Group__0"


    // $ANTLR start "rule__QuantumCircuit__Group__0__Impl"
    // InternalQuCircuit.g:659:1: rule__QuantumCircuit__Group__0__Impl : ( 'QuantumCircuit' ) ;
    public final void rule__QuantumCircuit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:663:1: ( ( 'QuantumCircuit' ) )
            // InternalQuCircuit.g:664:1: ( 'QuantumCircuit' )
            {
            // InternalQuCircuit.g:664:1: ( 'QuantumCircuit' )
            // InternalQuCircuit.g:665:2: 'QuantumCircuit'
            {
             before(grammarAccess.getQuantumCircuitAccess().getQuantumCircuitKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getQuantumCircuitAccess().getQuantumCircuitKeyword_0()); 

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
    // $ANTLR end "rule__QuantumCircuit__Group__0__Impl"


    // $ANTLR start "rule__QuantumCircuit__Group__1"
    // InternalQuCircuit.g:674:1: rule__QuantumCircuit__Group__1 : rule__QuantumCircuit__Group__1__Impl rule__QuantumCircuit__Group__2 ;
    public final void rule__QuantumCircuit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:678:1: ( rule__QuantumCircuit__Group__1__Impl rule__QuantumCircuit__Group__2 )
            // InternalQuCircuit.g:679:2: rule__QuantumCircuit__Group__1__Impl rule__QuantumCircuit__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__QuantumCircuit__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuantumCircuit__Group__2();

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
    // $ANTLR end "rule__QuantumCircuit__Group__1"


    // $ANTLR start "rule__QuantumCircuit__Group__1__Impl"
    // InternalQuCircuit.g:686:1: rule__QuantumCircuit__Group__1__Impl : ( ( rule__QuantumCircuit__NameAssignment_1 ) ) ;
    public final void rule__QuantumCircuit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:690:1: ( ( ( rule__QuantumCircuit__NameAssignment_1 ) ) )
            // InternalQuCircuit.g:691:1: ( ( rule__QuantumCircuit__NameAssignment_1 ) )
            {
            // InternalQuCircuit.g:691:1: ( ( rule__QuantumCircuit__NameAssignment_1 ) )
            // InternalQuCircuit.g:692:2: ( rule__QuantumCircuit__NameAssignment_1 )
            {
             before(grammarAccess.getQuantumCircuitAccess().getNameAssignment_1()); 
            // InternalQuCircuit.g:693:2: ( rule__QuantumCircuit__NameAssignment_1 )
            // InternalQuCircuit.g:693:3: rule__QuantumCircuit__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__QuantumCircuit__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQuantumCircuitAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__QuantumCircuit__Group__1__Impl"


    // $ANTLR start "rule__QuantumCircuit__Group__2"
    // InternalQuCircuit.g:701:1: rule__QuantumCircuit__Group__2 : rule__QuantumCircuit__Group__2__Impl rule__QuantumCircuit__Group__3 ;
    public final void rule__QuantumCircuit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:705:1: ( rule__QuantumCircuit__Group__2__Impl rule__QuantumCircuit__Group__3 )
            // InternalQuCircuit.g:706:2: rule__QuantumCircuit__Group__2__Impl rule__QuantumCircuit__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__QuantumCircuit__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuantumCircuit__Group__3();

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
    // $ANTLR end "rule__QuantumCircuit__Group__2"


    // $ANTLR start "rule__QuantumCircuit__Group__2__Impl"
    // InternalQuCircuit.g:713:1: rule__QuantumCircuit__Group__2__Impl : ( ( rule__QuantumCircuit__QuantumRegistersAssignment_2 )? ) ;
    public final void rule__QuantumCircuit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:717:1: ( ( ( rule__QuantumCircuit__QuantumRegistersAssignment_2 )? ) )
            // InternalQuCircuit.g:718:1: ( ( rule__QuantumCircuit__QuantumRegistersAssignment_2 )? )
            {
            // InternalQuCircuit.g:718:1: ( ( rule__QuantumCircuit__QuantumRegistersAssignment_2 )? )
            // InternalQuCircuit.g:719:2: ( rule__QuantumCircuit__QuantumRegistersAssignment_2 )?
            {
             before(grammarAccess.getQuantumCircuitAccess().getQuantumRegistersAssignment_2()); 
            // InternalQuCircuit.g:720:2: ( rule__QuantumCircuit__QuantumRegistersAssignment_2 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalQuCircuit.g:720:3: rule__QuantumCircuit__QuantumRegistersAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__QuantumCircuit__QuantumRegistersAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuantumCircuitAccess().getQuantumRegistersAssignment_2()); 

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
    // $ANTLR end "rule__QuantumCircuit__Group__2__Impl"


    // $ANTLR start "rule__QuantumCircuit__Group__3"
    // InternalQuCircuit.g:728:1: rule__QuantumCircuit__Group__3 : rule__QuantumCircuit__Group__3__Impl rule__QuantumCircuit__Group__4 ;
    public final void rule__QuantumCircuit__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:732:1: ( rule__QuantumCircuit__Group__3__Impl rule__QuantumCircuit__Group__4 )
            // InternalQuCircuit.g:733:2: rule__QuantumCircuit__Group__3__Impl rule__QuantumCircuit__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__QuantumCircuit__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuantumCircuit__Group__4();

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
    // $ANTLR end "rule__QuantumCircuit__Group__3"


    // $ANTLR start "rule__QuantumCircuit__Group__3__Impl"
    // InternalQuCircuit.g:740:1: rule__QuantumCircuit__Group__3__Impl : ( '{' ) ;
    public final void rule__QuantumCircuit__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:744:1: ( ( '{' ) )
            // InternalQuCircuit.g:745:1: ( '{' )
            {
            // InternalQuCircuit.g:745:1: ( '{' )
            // InternalQuCircuit.g:746:2: '{'
            {
             before(grammarAccess.getQuantumCircuitAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getQuantumCircuitAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__QuantumCircuit__Group__3__Impl"


    // $ANTLR start "rule__QuantumCircuit__Group__4"
    // InternalQuCircuit.g:755:1: rule__QuantumCircuit__Group__4 : rule__QuantumCircuit__Group__4__Impl rule__QuantumCircuit__Group__5 ;
    public final void rule__QuantumCircuit__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:759:1: ( rule__QuantumCircuit__Group__4__Impl rule__QuantumCircuit__Group__5 )
            // InternalQuCircuit.g:760:2: rule__QuantumCircuit__Group__4__Impl rule__QuantumCircuit__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__QuantumCircuit__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuantumCircuit__Group__5();

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
    // $ANTLR end "rule__QuantumCircuit__Group__4"


    // $ANTLR start "rule__QuantumCircuit__Group__4__Impl"
    // InternalQuCircuit.g:767:1: rule__QuantumCircuit__Group__4__Impl : ( ( rule__QuantumCircuit__Group_4__0 )? ) ;
    public final void rule__QuantumCircuit__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:771:1: ( ( ( rule__QuantumCircuit__Group_4__0 )? ) )
            // InternalQuCircuit.g:772:1: ( ( rule__QuantumCircuit__Group_4__0 )? )
            {
            // InternalQuCircuit.g:772:1: ( ( rule__QuantumCircuit__Group_4__0 )? )
            // InternalQuCircuit.g:773:2: ( rule__QuantumCircuit__Group_4__0 )?
            {
             before(grammarAccess.getQuantumCircuitAccess().getGroup_4()); 
            // InternalQuCircuit.g:774:2: ( rule__QuantumCircuit__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalQuCircuit.g:774:3: rule__QuantumCircuit__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QuantumCircuit__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuantumCircuitAccess().getGroup_4()); 

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
    // $ANTLR end "rule__QuantumCircuit__Group__4__Impl"


    // $ANTLR start "rule__QuantumCircuit__Group__5"
    // InternalQuCircuit.g:782:1: rule__QuantumCircuit__Group__5 : rule__QuantumCircuit__Group__5__Impl rule__QuantumCircuit__Group__6 ;
    public final void rule__QuantumCircuit__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:786:1: ( rule__QuantumCircuit__Group__5__Impl rule__QuantumCircuit__Group__6 )
            // InternalQuCircuit.g:787:2: rule__QuantumCircuit__Group__5__Impl rule__QuantumCircuit__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__QuantumCircuit__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuantumCircuit__Group__6();

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
    // $ANTLR end "rule__QuantumCircuit__Group__5"


    // $ANTLR start "rule__QuantumCircuit__Group__5__Impl"
    // InternalQuCircuit.g:794:1: rule__QuantumCircuit__Group__5__Impl : ( ( rule__QuantumCircuit__ClassicRegistersAssignment_5 )* ) ;
    public final void rule__QuantumCircuit__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:798:1: ( ( ( rule__QuantumCircuit__ClassicRegistersAssignment_5 )* ) )
            // InternalQuCircuit.g:799:1: ( ( rule__QuantumCircuit__ClassicRegistersAssignment_5 )* )
            {
            // InternalQuCircuit.g:799:1: ( ( rule__QuantumCircuit__ClassicRegistersAssignment_5 )* )
            // InternalQuCircuit.g:800:2: ( rule__QuantumCircuit__ClassicRegistersAssignment_5 )*
            {
             before(grammarAccess.getQuantumCircuitAccess().getClassicRegistersAssignment_5()); 
            // InternalQuCircuit.g:801:2: ( rule__QuantumCircuit__ClassicRegistersAssignment_5 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==23) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalQuCircuit.g:801:3: rule__QuantumCircuit__ClassicRegistersAssignment_5
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__QuantumCircuit__ClassicRegistersAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getQuantumCircuitAccess().getClassicRegistersAssignment_5()); 

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
    // $ANTLR end "rule__QuantumCircuit__Group__5__Impl"


    // $ANTLR start "rule__QuantumCircuit__Group__6"
    // InternalQuCircuit.g:809:1: rule__QuantumCircuit__Group__6 : rule__QuantumCircuit__Group__6__Impl rule__QuantumCircuit__Group__7 ;
    public final void rule__QuantumCircuit__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:813:1: ( rule__QuantumCircuit__Group__6__Impl rule__QuantumCircuit__Group__7 )
            // InternalQuCircuit.g:814:2: rule__QuantumCircuit__Group__6__Impl rule__QuantumCircuit__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__QuantumCircuit__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuantumCircuit__Group__7();

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
    // $ANTLR end "rule__QuantumCircuit__Group__6"


    // $ANTLR start "rule__QuantumCircuit__Group__6__Impl"
    // InternalQuCircuit.g:821:1: rule__QuantumCircuit__Group__6__Impl : ( ( rule__QuantumCircuit__LayersAssignment_6 ) ) ;
    public final void rule__QuantumCircuit__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:825:1: ( ( ( rule__QuantumCircuit__LayersAssignment_6 ) ) )
            // InternalQuCircuit.g:826:1: ( ( rule__QuantumCircuit__LayersAssignment_6 ) )
            {
            // InternalQuCircuit.g:826:1: ( ( rule__QuantumCircuit__LayersAssignment_6 ) )
            // InternalQuCircuit.g:827:2: ( rule__QuantumCircuit__LayersAssignment_6 )
            {
             before(grammarAccess.getQuantumCircuitAccess().getLayersAssignment_6()); 
            // InternalQuCircuit.g:828:2: ( rule__QuantumCircuit__LayersAssignment_6 )
            // InternalQuCircuit.g:828:3: rule__QuantumCircuit__LayersAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__QuantumCircuit__LayersAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getQuantumCircuitAccess().getLayersAssignment_6()); 

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
    // $ANTLR end "rule__QuantumCircuit__Group__6__Impl"


    // $ANTLR start "rule__QuantumCircuit__Group__7"
    // InternalQuCircuit.g:836:1: rule__QuantumCircuit__Group__7 : rule__QuantumCircuit__Group__7__Impl rule__QuantumCircuit__Group__8 ;
    public final void rule__QuantumCircuit__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:840:1: ( rule__QuantumCircuit__Group__7__Impl rule__QuantumCircuit__Group__8 )
            // InternalQuCircuit.g:841:2: rule__QuantumCircuit__Group__7__Impl rule__QuantumCircuit__Group__8
            {
            pushFollow(FOLLOW_7);
            rule__QuantumCircuit__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuantumCircuit__Group__8();

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
    // $ANTLR end "rule__QuantumCircuit__Group__7"


    // $ANTLR start "rule__QuantumCircuit__Group__7__Impl"
    // InternalQuCircuit.g:848:1: rule__QuantumCircuit__Group__7__Impl : ( ( rule__QuantumCircuit__LayersAssignment_7 )* ) ;
    public final void rule__QuantumCircuit__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:852:1: ( ( ( rule__QuantumCircuit__LayersAssignment_7 )* ) )
            // InternalQuCircuit.g:853:1: ( ( rule__QuantumCircuit__LayersAssignment_7 )* )
            {
            // InternalQuCircuit.g:853:1: ( ( rule__QuantumCircuit__LayersAssignment_7 )* )
            // InternalQuCircuit.g:854:2: ( rule__QuantumCircuit__LayersAssignment_7 )*
            {
             before(grammarAccess.getQuantumCircuitAccess().getLayersAssignment_7()); 
            // InternalQuCircuit.g:855:2: ( rule__QuantumCircuit__LayersAssignment_7 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==25) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalQuCircuit.g:855:3: rule__QuantumCircuit__LayersAssignment_7
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__QuantumCircuit__LayersAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getQuantumCircuitAccess().getLayersAssignment_7()); 

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
    // $ANTLR end "rule__QuantumCircuit__Group__7__Impl"


    // $ANTLR start "rule__QuantumCircuit__Group__8"
    // InternalQuCircuit.g:863:1: rule__QuantumCircuit__Group__8 : rule__QuantumCircuit__Group__8__Impl ;
    public final void rule__QuantumCircuit__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:867:1: ( rule__QuantumCircuit__Group__8__Impl )
            // InternalQuCircuit.g:868:2: rule__QuantumCircuit__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QuantumCircuit__Group__8__Impl();

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
    // $ANTLR end "rule__QuantumCircuit__Group__8"


    // $ANTLR start "rule__QuantumCircuit__Group__8__Impl"
    // InternalQuCircuit.g:874:1: rule__QuantumCircuit__Group__8__Impl : ( '}' ) ;
    public final void rule__QuantumCircuit__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:878:1: ( ( '}' ) )
            // InternalQuCircuit.g:879:1: ( '}' )
            {
            // InternalQuCircuit.g:879:1: ( '}' )
            // InternalQuCircuit.g:880:2: '}'
            {
             before(grammarAccess.getQuantumCircuitAccess().getRightCurlyBracketKeyword_8()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getQuantumCircuitAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__QuantumCircuit__Group__8__Impl"


    // $ANTLR start "rule__QuantumCircuit__Group_4__0"
    // InternalQuCircuit.g:890:1: rule__QuantumCircuit__Group_4__0 : rule__QuantumCircuit__Group_4__0__Impl rule__QuantumCircuit__Group_4__1 ;
    public final void rule__QuantumCircuit__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:894:1: ( rule__QuantumCircuit__Group_4__0__Impl rule__QuantumCircuit__Group_4__1 )
            // InternalQuCircuit.g:895:2: rule__QuantumCircuit__Group_4__0__Impl rule__QuantumCircuit__Group_4__1
            {
            pushFollow(FOLLOW_9);
            rule__QuantumCircuit__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuantumCircuit__Group_4__1();

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
    // $ANTLR end "rule__QuantumCircuit__Group_4__0"


    // $ANTLR start "rule__QuantumCircuit__Group_4__0__Impl"
    // InternalQuCircuit.g:902:1: rule__QuantumCircuit__Group_4__0__Impl : ( ( rule__QuantumCircuit__QuantumRegistersAssignment_4_0 ) ) ;
    public final void rule__QuantumCircuit__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:906:1: ( ( ( rule__QuantumCircuit__QuantumRegistersAssignment_4_0 ) ) )
            // InternalQuCircuit.g:907:1: ( ( rule__QuantumCircuit__QuantumRegistersAssignment_4_0 ) )
            {
            // InternalQuCircuit.g:907:1: ( ( rule__QuantumCircuit__QuantumRegistersAssignment_4_0 ) )
            // InternalQuCircuit.g:908:2: ( rule__QuantumCircuit__QuantumRegistersAssignment_4_0 )
            {
             before(grammarAccess.getQuantumCircuitAccess().getQuantumRegistersAssignment_4_0()); 
            // InternalQuCircuit.g:909:2: ( rule__QuantumCircuit__QuantumRegistersAssignment_4_0 )
            // InternalQuCircuit.g:909:3: rule__QuantumCircuit__QuantumRegistersAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__QuantumCircuit__QuantumRegistersAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getQuantumCircuitAccess().getQuantumRegistersAssignment_4_0()); 

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
    // $ANTLR end "rule__QuantumCircuit__Group_4__0__Impl"


    // $ANTLR start "rule__QuantumCircuit__Group_4__1"
    // InternalQuCircuit.g:917:1: rule__QuantumCircuit__Group_4__1 : rule__QuantumCircuit__Group_4__1__Impl ;
    public final void rule__QuantumCircuit__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:921:1: ( rule__QuantumCircuit__Group_4__1__Impl )
            // InternalQuCircuit.g:922:2: rule__QuantumCircuit__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QuantumCircuit__Group_4__1__Impl();

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
    // $ANTLR end "rule__QuantumCircuit__Group_4__1"


    // $ANTLR start "rule__QuantumCircuit__Group_4__1__Impl"
    // InternalQuCircuit.g:928:1: rule__QuantumCircuit__Group_4__1__Impl : ( ( rule__QuantumCircuit__QuantumRegistersAssignment_4_1 )* ) ;
    public final void rule__QuantumCircuit__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:932:1: ( ( ( rule__QuantumCircuit__QuantumRegistersAssignment_4_1 )* ) )
            // InternalQuCircuit.g:933:1: ( ( rule__QuantumCircuit__QuantumRegistersAssignment_4_1 )* )
            {
            // InternalQuCircuit.g:933:1: ( ( rule__QuantumCircuit__QuantumRegistersAssignment_4_1 )* )
            // InternalQuCircuit.g:934:2: ( rule__QuantumCircuit__QuantumRegistersAssignment_4_1 )*
            {
             before(grammarAccess.getQuantumCircuitAccess().getQuantumRegistersAssignment_4_1()); 
            // InternalQuCircuit.g:935:2: ( rule__QuantumCircuit__QuantumRegistersAssignment_4_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==19) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalQuCircuit.g:935:3: rule__QuantumCircuit__QuantumRegistersAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__QuantumCircuit__QuantumRegistersAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getQuantumCircuitAccess().getQuantumRegistersAssignment_4_1()); 

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
    // $ANTLR end "rule__QuantumCircuit__Group_4__1__Impl"


    // $ANTLR start "rule__QuantumRegister__Group__0"
    // InternalQuCircuit.g:944:1: rule__QuantumRegister__Group__0 : rule__QuantumRegister__Group__0__Impl rule__QuantumRegister__Group__1 ;
    public final void rule__QuantumRegister__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:948:1: ( rule__QuantumRegister__Group__0__Impl rule__QuantumRegister__Group__1 )
            // InternalQuCircuit.g:949:2: rule__QuantumRegister__Group__0__Impl rule__QuantumRegister__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__QuantumRegister__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuantumRegister__Group__1();

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
    // $ANTLR end "rule__QuantumRegister__Group__0"


    // $ANTLR start "rule__QuantumRegister__Group__0__Impl"
    // InternalQuCircuit.g:956:1: rule__QuantumRegister__Group__0__Impl : ( () ) ;
    public final void rule__QuantumRegister__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:960:1: ( ( () ) )
            // InternalQuCircuit.g:961:1: ( () )
            {
            // InternalQuCircuit.g:961:1: ( () )
            // InternalQuCircuit.g:962:2: ()
            {
             before(grammarAccess.getQuantumRegisterAccess().getQuantumRegisterAction_0()); 
            // InternalQuCircuit.g:963:2: ()
            // InternalQuCircuit.g:963:3: 
            {
            }

             after(grammarAccess.getQuantumRegisterAccess().getQuantumRegisterAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuantumRegister__Group__0__Impl"


    // $ANTLR start "rule__QuantumRegister__Group__1"
    // InternalQuCircuit.g:971:1: rule__QuantumRegister__Group__1 : rule__QuantumRegister__Group__1__Impl rule__QuantumRegister__Group__2 ;
    public final void rule__QuantumRegister__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:975:1: ( rule__QuantumRegister__Group__1__Impl rule__QuantumRegister__Group__2 )
            // InternalQuCircuit.g:976:2: rule__QuantumRegister__Group__1__Impl rule__QuantumRegister__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__QuantumRegister__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuantumRegister__Group__2();

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
    // $ANTLR end "rule__QuantumRegister__Group__1"


    // $ANTLR start "rule__QuantumRegister__Group__1__Impl"
    // InternalQuCircuit.g:983:1: rule__QuantumRegister__Group__1__Impl : ( 'QuantumRegister' ) ;
    public final void rule__QuantumRegister__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:987:1: ( ( 'QuantumRegister' ) )
            // InternalQuCircuit.g:988:1: ( 'QuantumRegister' )
            {
            // InternalQuCircuit.g:988:1: ( 'QuantumRegister' )
            // InternalQuCircuit.g:989:2: 'QuantumRegister'
            {
             before(grammarAccess.getQuantumRegisterAccess().getQuantumRegisterKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getQuantumRegisterAccess().getQuantumRegisterKeyword_1()); 

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
    // $ANTLR end "rule__QuantumRegister__Group__1__Impl"


    // $ANTLR start "rule__QuantumRegister__Group__2"
    // InternalQuCircuit.g:998:1: rule__QuantumRegister__Group__2 : rule__QuantumRegister__Group__2__Impl rule__QuantumRegister__Group__3 ;
    public final void rule__QuantumRegister__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1002:1: ( rule__QuantumRegister__Group__2__Impl rule__QuantumRegister__Group__3 )
            // InternalQuCircuit.g:1003:2: rule__QuantumRegister__Group__2__Impl rule__QuantumRegister__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__QuantumRegister__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuantumRegister__Group__3();

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
    // $ANTLR end "rule__QuantumRegister__Group__2"


    // $ANTLR start "rule__QuantumRegister__Group__2__Impl"
    // InternalQuCircuit.g:1010:1: rule__QuantumRegister__Group__2__Impl : ( ( rule__QuantumRegister__NameAssignment_2 ) ) ;
    public final void rule__QuantumRegister__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1014:1: ( ( ( rule__QuantumRegister__NameAssignment_2 ) ) )
            // InternalQuCircuit.g:1015:1: ( ( rule__QuantumRegister__NameAssignment_2 ) )
            {
            // InternalQuCircuit.g:1015:1: ( ( rule__QuantumRegister__NameAssignment_2 ) )
            // InternalQuCircuit.g:1016:2: ( rule__QuantumRegister__NameAssignment_2 )
            {
             before(grammarAccess.getQuantumRegisterAccess().getNameAssignment_2()); 
            // InternalQuCircuit.g:1017:2: ( rule__QuantumRegister__NameAssignment_2 )
            // InternalQuCircuit.g:1017:3: rule__QuantumRegister__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__QuantumRegister__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getQuantumRegisterAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__QuantumRegister__Group__2__Impl"


    // $ANTLR start "rule__QuantumRegister__Group__3"
    // InternalQuCircuit.g:1025:1: rule__QuantumRegister__Group__3 : rule__QuantumRegister__Group__3__Impl rule__QuantumRegister__Group__4 ;
    public final void rule__QuantumRegister__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1029:1: ( rule__QuantumRegister__Group__3__Impl rule__QuantumRegister__Group__4 )
            // InternalQuCircuit.g:1030:2: rule__QuantumRegister__Group__3__Impl rule__QuantumRegister__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__QuantumRegister__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuantumRegister__Group__4();

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
    // $ANTLR end "rule__QuantumRegister__Group__3"


    // $ANTLR start "rule__QuantumRegister__Group__3__Impl"
    // InternalQuCircuit.g:1037:1: rule__QuantumRegister__Group__3__Impl : ( '{' ) ;
    public final void rule__QuantumRegister__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1041:1: ( ( '{' ) )
            // InternalQuCircuit.g:1042:1: ( '{' )
            {
            // InternalQuCircuit.g:1042:1: ( '{' )
            // InternalQuCircuit.g:1043:2: '{'
            {
             before(grammarAccess.getQuantumRegisterAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getQuantumRegisterAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__QuantumRegister__Group__3__Impl"


    // $ANTLR start "rule__QuantumRegister__Group__4"
    // InternalQuCircuit.g:1052:1: rule__QuantumRegister__Group__4 : rule__QuantumRegister__Group__4__Impl rule__QuantumRegister__Group__5 ;
    public final void rule__QuantumRegister__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1056:1: ( rule__QuantumRegister__Group__4__Impl rule__QuantumRegister__Group__5 )
            // InternalQuCircuit.g:1057:2: rule__QuantumRegister__Group__4__Impl rule__QuantumRegister__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__QuantumRegister__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuantumRegister__Group__5();

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
    // $ANTLR end "rule__QuantumRegister__Group__4"


    // $ANTLR start "rule__QuantumRegister__Group__4__Impl"
    // InternalQuCircuit.g:1064:1: rule__QuantumRegister__Group__4__Impl : ( ( rule__QuantumRegister__Group_4__0 )? ) ;
    public final void rule__QuantumRegister__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1068:1: ( ( ( rule__QuantumRegister__Group_4__0 )? ) )
            // InternalQuCircuit.g:1069:1: ( ( rule__QuantumRegister__Group_4__0 )? )
            {
            // InternalQuCircuit.g:1069:1: ( ( rule__QuantumRegister__Group_4__0 )? )
            // InternalQuCircuit.g:1070:2: ( rule__QuantumRegister__Group_4__0 )?
            {
             before(grammarAccess.getQuantumRegisterAccess().getGroup_4()); 
            // InternalQuCircuit.g:1071:2: ( rule__QuantumRegister__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalQuCircuit.g:1071:3: rule__QuantumRegister__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QuantumRegister__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuantumRegisterAccess().getGroup_4()); 

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
    // $ANTLR end "rule__QuantumRegister__Group__4__Impl"


    // $ANTLR start "rule__QuantumRegister__Group__5"
    // InternalQuCircuit.g:1079:1: rule__QuantumRegister__Group__5 : rule__QuantumRegister__Group__5__Impl ;
    public final void rule__QuantumRegister__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1083:1: ( rule__QuantumRegister__Group__5__Impl )
            // InternalQuCircuit.g:1084:2: rule__QuantumRegister__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QuantumRegister__Group__5__Impl();

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
    // $ANTLR end "rule__QuantumRegister__Group__5"


    // $ANTLR start "rule__QuantumRegister__Group__5__Impl"
    // InternalQuCircuit.g:1090:1: rule__QuantumRegister__Group__5__Impl : ( '}' ) ;
    public final void rule__QuantumRegister__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1094:1: ( ( '}' ) )
            // InternalQuCircuit.g:1095:1: ( '}' )
            {
            // InternalQuCircuit.g:1095:1: ( '}' )
            // InternalQuCircuit.g:1096:2: '}'
            {
             before(grammarAccess.getQuantumRegisterAccess().getRightCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getQuantumRegisterAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__QuantumRegister__Group__5__Impl"


    // $ANTLR start "rule__QuantumRegister__Group_4__0"
    // InternalQuCircuit.g:1106:1: rule__QuantumRegister__Group_4__0 : rule__QuantumRegister__Group_4__0__Impl rule__QuantumRegister__Group_4__1 ;
    public final void rule__QuantumRegister__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1110:1: ( rule__QuantumRegister__Group_4__0__Impl rule__QuantumRegister__Group_4__1 )
            // InternalQuCircuit.g:1111:2: rule__QuantumRegister__Group_4__0__Impl rule__QuantumRegister__Group_4__1
            {
            pushFollow(FOLLOW_13);
            rule__QuantumRegister__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuantumRegister__Group_4__1();

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
    // $ANTLR end "rule__QuantumRegister__Group_4__0"


    // $ANTLR start "rule__QuantumRegister__Group_4__0__Impl"
    // InternalQuCircuit.g:1118:1: rule__QuantumRegister__Group_4__0__Impl : ( 'NumberOfQubits' ) ;
    public final void rule__QuantumRegister__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1122:1: ( ( 'NumberOfQubits' ) )
            // InternalQuCircuit.g:1123:1: ( 'NumberOfQubits' )
            {
            // InternalQuCircuit.g:1123:1: ( 'NumberOfQubits' )
            // InternalQuCircuit.g:1124:2: 'NumberOfQubits'
            {
             before(grammarAccess.getQuantumRegisterAccess().getNumberOfQubitsKeyword_4_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getQuantumRegisterAccess().getNumberOfQubitsKeyword_4_0()); 

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
    // $ANTLR end "rule__QuantumRegister__Group_4__0__Impl"


    // $ANTLR start "rule__QuantumRegister__Group_4__1"
    // InternalQuCircuit.g:1133:1: rule__QuantumRegister__Group_4__1 : rule__QuantumRegister__Group_4__1__Impl ;
    public final void rule__QuantumRegister__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1137:1: ( rule__QuantumRegister__Group_4__1__Impl )
            // InternalQuCircuit.g:1138:2: rule__QuantumRegister__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QuantumRegister__Group_4__1__Impl();

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
    // $ANTLR end "rule__QuantumRegister__Group_4__1"


    // $ANTLR start "rule__QuantumRegister__Group_4__1__Impl"
    // InternalQuCircuit.g:1144:1: rule__QuantumRegister__Group_4__1__Impl : ( ( rule__QuantumRegister__NumberOfQubitsAssignment_4_1 ) ) ;
    public final void rule__QuantumRegister__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1148:1: ( ( ( rule__QuantumRegister__NumberOfQubitsAssignment_4_1 ) ) )
            // InternalQuCircuit.g:1149:1: ( ( rule__QuantumRegister__NumberOfQubitsAssignment_4_1 ) )
            {
            // InternalQuCircuit.g:1149:1: ( ( rule__QuantumRegister__NumberOfQubitsAssignment_4_1 ) )
            // InternalQuCircuit.g:1150:2: ( rule__QuantumRegister__NumberOfQubitsAssignment_4_1 )
            {
             before(grammarAccess.getQuantumRegisterAccess().getNumberOfQubitsAssignment_4_1()); 
            // InternalQuCircuit.g:1151:2: ( rule__QuantumRegister__NumberOfQubitsAssignment_4_1 )
            // InternalQuCircuit.g:1151:3: rule__QuantumRegister__NumberOfQubitsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__QuantumRegister__NumberOfQubitsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getQuantumRegisterAccess().getNumberOfQubitsAssignment_4_1()); 

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
    // $ANTLR end "rule__QuantumRegister__Group_4__1__Impl"


    // $ANTLR start "rule__SimplifiedQuantumRegister__Group__0"
    // InternalQuCircuit.g:1160:1: rule__SimplifiedQuantumRegister__Group__0 : rule__SimplifiedQuantumRegister__Group__0__Impl rule__SimplifiedQuantumRegister__Group__1 ;
    public final void rule__SimplifiedQuantumRegister__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1164:1: ( rule__SimplifiedQuantumRegister__Group__0__Impl rule__SimplifiedQuantumRegister__Group__1 )
            // InternalQuCircuit.g:1165:2: rule__SimplifiedQuantumRegister__Group__0__Impl rule__SimplifiedQuantumRegister__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__SimplifiedQuantumRegister__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimplifiedQuantumRegister__Group__1();

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
    // $ANTLR end "rule__SimplifiedQuantumRegister__Group__0"


    // $ANTLR start "rule__SimplifiedQuantumRegister__Group__0__Impl"
    // InternalQuCircuit.g:1172:1: rule__SimplifiedQuantumRegister__Group__0__Impl : ( () ) ;
    public final void rule__SimplifiedQuantumRegister__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1176:1: ( ( () ) )
            // InternalQuCircuit.g:1177:1: ( () )
            {
            // InternalQuCircuit.g:1177:1: ( () )
            // InternalQuCircuit.g:1178:2: ()
            {
             before(grammarAccess.getSimplifiedQuantumRegisterAccess().getQuantumRegisterAction_0()); 
            // InternalQuCircuit.g:1179:2: ()
            // InternalQuCircuit.g:1179:3: 
            {
            }

             after(grammarAccess.getSimplifiedQuantumRegisterAccess().getQuantumRegisterAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimplifiedQuantumRegister__Group__0__Impl"


    // $ANTLR start "rule__SimplifiedQuantumRegister__Group__1"
    // InternalQuCircuit.g:1187:1: rule__SimplifiedQuantumRegister__Group__1 : rule__SimplifiedQuantumRegister__Group__1__Impl rule__SimplifiedQuantumRegister__Group__2 ;
    public final void rule__SimplifiedQuantumRegister__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1191:1: ( rule__SimplifiedQuantumRegister__Group__1__Impl rule__SimplifiedQuantumRegister__Group__2 )
            // InternalQuCircuit.g:1192:2: rule__SimplifiedQuantumRegister__Group__1__Impl rule__SimplifiedQuantumRegister__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__SimplifiedQuantumRegister__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimplifiedQuantumRegister__Group__2();

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
    // $ANTLR end "rule__SimplifiedQuantumRegister__Group__1"


    // $ANTLR start "rule__SimplifiedQuantumRegister__Group__1__Impl"
    // InternalQuCircuit.g:1199:1: rule__SimplifiedQuantumRegister__Group__1__Impl : ( '(' ) ;
    public final void rule__SimplifiedQuantumRegister__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1203:1: ( ( '(' ) )
            // InternalQuCircuit.g:1204:1: ( '(' )
            {
            // InternalQuCircuit.g:1204:1: ( '(' )
            // InternalQuCircuit.g:1205:2: '('
            {
             before(grammarAccess.getSimplifiedQuantumRegisterAccess().getLeftParenthesisKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSimplifiedQuantumRegisterAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__SimplifiedQuantumRegister__Group__1__Impl"


    // $ANTLR start "rule__SimplifiedQuantumRegister__Group__2"
    // InternalQuCircuit.g:1214:1: rule__SimplifiedQuantumRegister__Group__2 : rule__SimplifiedQuantumRegister__Group__2__Impl rule__SimplifiedQuantumRegister__Group__3 ;
    public final void rule__SimplifiedQuantumRegister__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1218:1: ( rule__SimplifiedQuantumRegister__Group__2__Impl rule__SimplifiedQuantumRegister__Group__3 )
            // InternalQuCircuit.g:1219:2: rule__SimplifiedQuantumRegister__Group__2__Impl rule__SimplifiedQuantumRegister__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__SimplifiedQuantumRegister__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimplifiedQuantumRegister__Group__3();

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
    // $ANTLR end "rule__SimplifiedQuantumRegister__Group__2"


    // $ANTLR start "rule__SimplifiedQuantumRegister__Group__2__Impl"
    // InternalQuCircuit.g:1226:1: rule__SimplifiedQuantumRegister__Group__2__Impl : ( ( rule__SimplifiedQuantumRegister__NumberOfQubitsAssignment_2 ) ) ;
    public final void rule__SimplifiedQuantumRegister__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1230:1: ( ( ( rule__SimplifiedQuantumRegister__NumberOfQubitsAssignment_2 ) ) )
            // InternalQuCircuit.g:1231:1: ( ( rule__SimplifiedQuantumRegister__NumberOfQubitsAssignment_2 ) )
            {
            // InternalQuCircuit.g:1231:1: ( ( rule__SimplifiedQuantumRegister__NumberOfQubitsAssignment_2 ) )
            // InternalQuCircuit.g:1232:2: ( rule__SimplifiedQuantumRegister__NumberOfQubitsAssignment_2 )
            {
             before(grammarAccess.getSimplifiedQuantumRegisterAccess().getNumberOfQubitsAssignment_2()); 
            // InternalQuCircuit.g:1233:2: ( rule__SimplifiedQuantumRegister__NumberOfQubitsAssignment_2 )
            // InternalQuCircuit.g:1233:3: rule__SimplifiedQuantumRegister__NumberOfQubitsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SimplifiedQuantumRegister__NumberOfQubitsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSimplifiedQuantumRegisterAccess().getNumberOfQubitsAssignment_2()); 

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
    // $ANTLR end "rule__SimplifiedQuantumRegister__Group__2__Impl"


    // $ANTLR start "rule__SimplifiedQuantumRegister__Group__3"
    // InternalQuCircuit.g:1241:1: rule__SimplifiedQuantumRegister__Group__3 : rule__SimplifiedQuantumRegister__Group__3__Impl ;
    public final void rule__SimplifiedQuantumRegister__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1245:1: ( rule__SimplifiedQuantumRegister__Group__3__Impl )
            // InternalQuCircuit.g:1246:2: rule__SimplifiedQuantumRegister__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimplifiedQuantumRegister__Group__3__Impl();

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
    // $ANTLR end "rule__SimplifiedQuantumRegister__Group__3"


    // $ANTLR start "rule__SimplifiedQuantumRegister__Group__3__Impl"
    // InternalQuCircuit.g:1252:1: rule__SimplifiedQuantumRegister__Group__3__Impl : ( ')' ) ;
    public final void rule__SimplifiedQuantumRegister__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1256:1: ( ( ')' ) )
            // InternalQuCircuit.g:1257:1: ( ')' )
            {
            // InternalQuCircuit.g:1257:1: ( ')' )
            // InternalQuCircuit.g:1258:2: ')'
            {
             before(grammarAccess.getSimplifiedQuantumRegisterAccess().getRightParenthesisKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSimplifiedQuantumRegisterAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__SimplifiedQuantumRegister__Group__3__Impl"


    // $ANTLR start "rule__ClassicRegister__Group__0"
    // InternalQuCircuit.g:1268:1: rule__ClassicRegister__Group__0 : rule__ClassicRegister__Group__0__Impl rule__ClassicRegister__Group__1 ;
    public final void rule__ClassicRegister__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1272:1: ( rule__ClassicRegister__Group__0__Impl rule__ClassicRegister__Group__1 )
            // InternalQuCircuit.g:1273:2: rule__ClassicRegister__Group__0__Impl rule__ClassicRegister__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__ClassicRegister__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassicRegister__Group__1();

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
    // $ANTLR end "rule__ClassicRegister__Group__0"


    // $ANTLR start "rule__ClassicRegister__Group__0__Impl"
    // InternalQuCircuit.g:1280:1: rule__ClassicRegister__Group__0__Impl : ( () ) ;
    public final void rule__ClassicRegister__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1284:1: ( ( () ) )
            // InternalQuCircuit.g:1285:1: ( () )
            {
            // InternalQuCircuit.g:1285:1: ( () )
            // InternalQuCircuit.g:1286:2: ()
            {
             before(grammarAccess.getClassicRegisterAccess().getClassicRegisterAction_0()); 
            // InternalQuCircuit.g:1287:2: ()
            // InternalQuCircuit.g:1287:3: 
            {
            }

             after(grammarAccess.getClassicRegisterAccess().getClassicRegisterAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassicRegister__Group__0__Impl"


    // $ANTLR start "rule__ClassicRegister__Group__1"
    // InternalQuCircuit.g:1295:1: rule__ClassicRegister__Group__1 : rule__ClassicRegister__Group__1__Impl rule__ClassicRegister__Group__2 ;
    public final void rule__ClassicRegister__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1299:1: ( rule__ClassicRegister__Group__1__Impl rule__ClassicRegister__Group__2 )
            // InternalQuCircuit.g:1300:2: rule__ClassicRegister__Group__1__Impl rule__ClassicRegister__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__ClassicRegister__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassicRegister__Group__2();

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
    // $ANTLR end "rule__ClassicRegister__Group__1"


    // $ANTLR start "rule__ClassicRegister__Group__1__Impl"
    // InternalQuCircuit.g:1307:1: rule__ClassicRegister__Group__1__Impl : ( 'ClassicRegister' ) ;
    public final void rule__ClassicRegister__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1311:1: ( ( 'ClassicRegister' ) )
            // InternalQuCircuit.g:1312:1: ( 'ClassicRegister' )
            {
            // InternalQuCircuit.g:1312:1: ( 'ClassicRegister' )
            // InternalQuCircuit.g:1313:2: 'ClassicRegister'
            {
             before(grammarAccess.getClassicRegisterAccess().getClassicRegisterKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getClassicRegisterAccess().getClassicRegisterKeyword_1()); 

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
    // $ANTLR end "rule__ClassicRegister__Group__1__Impl"


    // $ANTLR start "rule__ClassicRegister__Group__2"
    // InternalQuCircuit.g:1322:1: rule__ClassicRegister__Group__2 : rule__ClassicRegister__Group__2__Impl rule__ClassicRegister__Group__3 ;
    public final void rule__ClassicRegister__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1326:1: ( rule__ClassicRegister__Group__2__Impl rule__ClassicRegister__Group__3 )
            // InternalQuCircuit.g:1327:2: rule__ClassicRegister__Group__2__Impl rule__ClassicRegister__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__ClassicRegister__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassicRegister__Group__3();

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
    // $ANTLR end "rule__ClassicRegister__Group__2"


    // $ANTLR start "rule__ClassicRegister__Group__2__Impl"
    // InternalQuCircuit.g:1334:1: rule__ClassicRegister__Group__2__Impl : ( ( rule__ClassicRegister__NameAssignment_2 ) ) ;
    public final void rule__ClassicRegister__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1338:1: ( ( ( rule__ClassicRegister__NameAssignment_2 ) ) )
            // InternalQuCircuit.g:1339:1: ( ( rule__ClassicRegister__NameAssignment_2 ) )
            {
            // InternalQuCircuit.g:1339:1: ( ( rule__ClassicRegister__NameAssignment_2 ) )
            // InternalQuCircuit.g:1340:2: ( rule__ClassicRegister__NameAssignment_2 )
            {
             before(grammarAccess.getClassicRegisterAccess().getNameAssignment_2()); 
            // InternalQuCircuit.g:1341:2: ( rule__ClassicRegister__NameAssignment_2 )
            // InternalQuCircuit.g:1341:3: rule__ClassicRegister__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ClassicRegister__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getClassicRegisterAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__ClassicRegister__Group__2__Impl"


    // $ANTLR start "rule__ClassicRegister__Group__3"
    // InternalQuCircuit.g:1349:1: rule__ClassicRegister__Group__3 : rule__ClassicRegister__Group__3__Impl rule__ClassicRegister__Group__4 ;
    public final void rule__ClassicRegister__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1353:1: ( rule__ClassicRegister__Group__3__Impl rule__ClassicRegister__Group__4 )
            // InternalQuCircuit.g:1354:2: rule__ClassicRegister__Group__3__Impl rule__ClassicRegister__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__ClassicRegister__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassicRegister__Group__4();

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
    // $ANTLR end "rule__ClassicRegister__Group__3"


    // $ANTLR start "rule__ClassicRegister__Group__3__Impl"
    // InternalQuCircuit.g:1361:1: rule__ClassicRegister__Group__3__Impl : ( '{' ) ;
    public final void rule__ClassicRegister__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1365:1: ( ( '{' ) )
            // InternalQuCircuit.g:1366:1: ( '{' )
            {
            // InternalQuCircuit.g:1366:1: ( '{' )
            // InternalQuCircuit.g:1367:2: '{'
            {
             before(grammarAccess.getClassicRegisterAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getClassicRegisterAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__ClassicRegister__Group__3__Impl"


    // $ANTLR start "rule__ClassicRegister__Group__4"
    // InternalQuCircuit.g:1376:1: rule__ClassicRegister__Group__4 : rule__ClassicRegister__Group__4__Impl rule__ClassicRegister__Group__5 ;
    public final void rule__ClassicRegister__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1380:1: ( rule__ClassicRegister__Group__4__Impl rule__ClassicRegister__Group__5 )
            // InternalQuCircuit.g:1381:2: rule__ClassicRegister__Group__4__Impl rule__ClassicRegister__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__ClassicRegister__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassicRegister__Group__5();

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
    // $ANTLR end "rule__ClassicRegister__Group__4"


    // $ANTLR start "rule__ClassicRegister__Group__4__Impl"
    // InternalQuCircuit.g:1388:1: rule__ClassicRegister__Group__4__Impl : ( ( rule__ClassicRegister__Group_4__0 )? ) ;
    public final void rule__ClassicRegister__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1392:1: ( ( ( rule__ClassicRegister__Group_4__0 )? ) )
            // InternalQuCircuit.g:1393:1: ( ( rule__ClassicRegister__Group_4__0 )? )
            {
            // InternalQuCircuit.g:1393:1: ( ( rule__ClassicRegister__Group_4__0 )? )
            // InternalQuCircuit.g:1394:2: ( rule__ClassicRegister__Group_4__0 )?
            {
             before(grammarAccess.getClassicRegisterAccess().getGroup_4()); 
            // InternalQuCircuit.g:1395:2: ( rule__ClassicRegister__Group_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalQuCircuit.g:1395:3: rule__ClassicRegister__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClassicRegister__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassicRegisterAccess().getGroup_4()); 

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
    // $ANTLR end "rule__ClassicRegister__Group__4__Impl"


    // $ANTLR start "rule__ClassicRegister__Group__5"
    // InternalQuCircuit.g:1403:1: rule__ClassicRegister__Group__5 : rule__ClassicRegister__Group__5__Impl ;
    public final void rule__ClassicRegister__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1407:1: ( rule__ClassicRegister__Group__5__Impl )
            // InternalQuCircuit.g:1408:2: rule__ClassicRegister__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassicRegister__Group__5__Impl();

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
    // $ANTLR end "rule__ClassicRegister__Group__5"


    // $ANTLR start "rule__ClassicRegister__Group__5__Impl"
    // InternalQuCircuit.g:1414:1: rule__ClassicRegister__Group__5__Impl : ( '}' ) ;
    public final void rule__ClassicRegister__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1418:1: ( ( '}' ) )
            // InternalQuCircuit.g:1419:1: ( '}' )
            {
            // InternalQuCircuit.g:1419:1: ( '}' )
            // InternalQuCircuit.g:1420:2: '}'
            {
             before(grammarAccess.getClassicRegisterAccess().getRightCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getClassicRegisterAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__ClassicRegister__Group__5__Impl"


    // $ANTLR start "rule__ClassicRegister__Group_4__0"
    // InternalQuCircuit.g:1430:1: rule__ClassicRegister__Group_4__0 : rule__ClassicRegister__Group_4__0__Impl rule__ClassicRegister__Group_4__1 ;
    public final void rule__ClassicRegister__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1434:1: ( rule__ClassicRegister__Group_4__0__Impl rule__ClassicRegister__Group_4__1 )
            // InternalQuCircuit.g:1435:2: rule__ClassicRegister__Group_4__0__Impl rule__ClassicRegister__Group_4__1
            {
            pushFollow(FOLLOW_13);
            rule__ClassicRegister__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassicRegister__Group_4__1();

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
    // $ANTLR end "rule__ClassicRegister__Group_4__0"


    // $ANTLR start "rule__ClassicRegister__Group_4__0__Impl"
    // InternalQuCircuit.g:1442:1: rule__ClassicRegister__Group_4__0__Impl : ( 'NumberOfBits' ) ;
    public final void rule__ClassicRegister__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1446:1: ( ( 'NumberOfBits' ) )
            // InternalQuCircuit.g:1447:1: ( 'NumberOfBits' )
            {
            // InternalQuCircuit.g:1447:1: ( 'NumberOfBits' )
            // InternalQuCircuit.g:1448:2: 'NumberOfBits'
            {
             before(grammarAccess.getClassicRegisterAccess().getNumberOfBitsKeyword_4_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getClassicRegisterAccess().getNumberOfBitsKeyword_4_0()); 

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
    // $ANTLR end "rule__ClassicRegister__Group_4__0__Impl"


    // $ANTLR start "rule__ClassicRegister__Group_4__1"
    // InternalQuCircuit.g:1457:1: rule__ClassicRegister__Group_4__1 : rule__ClassicRegister__Group_4__1__Impl ;
    public final void rule__ClassicRegister__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1461:1: ( rule__ClassicRegister__Group_4__1__Impl )
            // InternalQuCircuit.g:1462:2: rule__ClassicRegister__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassicRegister__Group_4__1__Impl();

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
    // $ANTLR end "rule__ClassicRegister__Group_4__1"


    // $ANTLR start "rule__ClassicRegister__Group_4__1__Impl"
    // InternalQuCircuit.g:1468:1: rule__ClassicRegister__Group_4__1__Impl : ( ( rule__ClassicRegister__NumberOfBitsAssignment_4_1 ) ) ;
    public final void rule__ClassicRegister__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1472:1: ( ( ( rule__ClassicRegister__NumberOfBitsAssignment_4_1 ) ) )
            // InternalQuCircuit.g:1473:1: ( ( rule__ClassicRegister__NumberOfBitsAssignment_4_1 ) )
            {
            // InternalQuCircuit.g:1473:1: ( ( rule__ClassicRegister__NumberOfBitsAssignment_4_1 ) )
            // InternalQuCircuit.g:1474:2: ( rule__ClassicRegister__NumberOfBitsAssignment_4_1 )
            {
             before(grammarAccess.getClassicRegisterAccess().getNumberOfBitsAssignment_4_1()); 
            // InternalQuCircuit.g:1475:2: ( rule__ClassicRegister__NumberOfBitsAssignment_4_1 )
            // InternalQuCircuit.g:1475:3: rule__ClassicRegister__NumberOfBitsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ClassicRegister__NumberOfBitsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getClassicRegisterAccess().getNumberOfBitsAssignment_4_1()); 

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
    // $ANTLR end "rule__ClassicRegister__Group_4__1__Impl"


    // $ANTLR start "rule__Layer__Group__0"
    // InternalQuCircuit.g:1484:1: rule__Layer__Group__0 : rule__Layer__Group__0__Impl rule__Layer__Group__1 ;
    public final void rule__Layer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1488:1: ( rule__Layer__Group__0__Impl rule__Layer__Group__1 )
            // InternalQuCircuit.g:1489:2: rule__Layer__Group__0__Impl rule__Layer__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Layer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group__1();

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
    // $ANTLR end "rule__Layer__Group__0"


    // $ANTLR start "rule__Layer__Group__0__Impl"
    // InternalQuCircuit.g:1496:1: rule__Layer__Group__0__Impl : ( () ) ;
    public final void rule__Layer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1500:1: ( ( () ) )
            // InternalQuCircuit.g:1501:1: ( () )
            {
            // InternalQuCircuit.g:1501:1: ( () )
            // InternalQuCircuit.g:1502:2: ()
            {
             before(grammarAccess.getLayerAccess().getLayerAction_0()); 
            // InternalQuCircuit.g:1503:2: ()
            // InternalQuCircuit.g:1503:3: 
            {
            }

             after(grammarAccess.getLayerAccess().getLayerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layer__Group__0__Impl"


    // $ANTLR start "rule__Layer__Group__1"
    // InternalQuCircuit.g:1511:1: rule__Layer__Group__1 : rule__Layer__Group__1__Impl rule__Layer__Group__2 ;
    public final void rule__Layer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1515:1: ( rule__Layer__Group__1__Impl rule__Layer__Group__2 )
            // InternalQuCircuit.g:1516:2: rule__Layer__Group__1__Impl rule__Layer__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Layer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group__2();

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
    // $ANTLR end "rule__Layer__Group__1"


    // $ANTLR start "rule__Layer__Group__1__Impl"
    // InternalQuCircuit.g:1523:1: rule__Layer__Group__1__Impl : ( 'Layer' ) ;
    public final void rule__Layer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1527:1: ( ( 'Layer' ) )
            // InternalQuCircuit.g:1528:1: ( 'Layer' )
            {
            // InternalQuCircuit.g:1528:1: ( 'Layer' )
            // InternalQuCircuit.g:1529:2: 'Layer'
            {
             before(grammarAccess.getLayerAccess().getLayerKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getLayerAccess().getLayerKeyword_1()); 

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
    // $ANTLR end "rule__Layer__Group__1__Impl"


    // $ANTLR start "rule__Layer__Group__2"
    // InternalQuCircuit.g:1538:1: rule__Layer__Group__2 : rule__Layer__Group__2__Impl rule__Layer__Group__3 ;
    public final void rule__Layer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1542:1: ( rule__Layer__Group__2__Impl rule__Layer__Group__3 )
            // InternalQuCircuit.g:1543:2: rule__Layer__Group__2__Impl rule__Layer__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Layer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group__3();

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
    // $ANTLR end "rule__Layer__Group__2"


    // $ANTLR start "rule__Layer__Group__2__Impl"
    // InternalQuCircuit.g:1550:1: rule__Layer__Group__2__Impl : ( ( rule__Layer__NameAssignment_2 ) ) ;
    public final void rule__Layer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1554:1: ( ( ( rule__Layer__NameAssignment_2 ) ) )
            // InternalQuCircuit.g:1555:1: ( ( rule__Layer__NameAssignment_2 ) )
            {
            // InternalQuCircuit.g:1555:1: ( ( rule__Layer__NameAssignment_2 ) )
            // InternalQuCircuit.g:1556:2: ( rule__Layer__NameAssignment_2 )
            {
             before(grammarAccess.getLayerAccess().getNameAssignment_2()); 
            // InternalQuCircuit.g:1557:2: ( rule__Layer__NameAssignment_2 )
            // InternalQuCircuit.g:1557:3: rule__Layer__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Layer__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLayerAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Layer__Group__2__Impl"


    // $ANTLR start "rule__Layer__Group__3"
    // InternalQuCircuit.g:1565:1: rule__Layer__Group__3 : rule__Layer__Group__3__Impl rule__Layer__Group__4 ;
    public final void rule__Layer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1569:1: ( rule__Layer__Group__3__Impl rule__Layer__Group__4 )
            // InternalQuCircuit.g:1570:2: rule__Layer__Group__3__Impl rule__Layer__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Layer__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group__4();

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
    // $ANTLR end "rule__Layer__Group__3"


    // $ANTLR start "rule__Layer__Group__3__Impl"
    // InternalQuCircuit.g:1577:1: rule__Layer__Group__3__Impl : ( '{' ) ;
    public final void rule__Layer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1581:1: ( ( '{' ) )
            // InternalQuCircuit.g:1582:1: ( '{' )
            {
            // InternalQuCircuit.g:1582:1: ( '{' )
            // InternalQuCircuit.g:1583:2: '{'
            {
             before(grammarAccess.getLayerAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getLayerAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Layer__Group__3__Impl"


    // $ANTLR start "rule__Layer__Group__4"
    // InternalQuCircuit.g:1592:1: rule__Layer__Group__4 : rule__Layer__Group__4__Impl rule__Layer__Group__5 ;
    public final void rule__Layer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1596:1: ( rule__Layer__Group__4__Impl rule__Layer__Group__5 )
            // InternalQuCircuit.g:1597:2: rule__Layer__Group__4__Impl rule__Layer__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__Layer__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group__5();

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
    // $ANTLR end "rule__Layer__Group__4"


    // $ANTLR start "rule__Layer__Group__4__Impl"
    // InternalQuCircuit.g:1604:1: rule__Layer__Group__4__Impl : ( ( rule__Layer__QuantumOperationsAssignment_4 ) ) ;
    public final void rule__Layer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1608:1: ( ( ( rule__Layer__QuantumOperationsAssignment_4 ) ) )
            // InternalQuCircuit.g:1609:1: ( ( rule__Layer__QuantumOperationsAssignment_4 ) )
            {
            // InternalQuCircuit.g:1609:1: ( ( rule__Layer__QuantumOperationsAssignment_4 ) )
            // InternalQuCircuit.g:1610:2: ( rule__Layer__QuantumOperationsAssignment_4 )
            {
             before(grammarAccess.getLayerAccess().getQuantumOperationsAssignment_4()); 
            // InternalQuCircuit.g:1611:2: ( rule__Layer__QuantumOperationsAssignment_4 )
            // InternalQuCircuit.g:1611:3: rule__Layer__QuantumOperationsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Layer__QuantumOperationsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLayerAccess().getQuantumOperationsAssignment_4()); 

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
    // $ANTLR end "rule__Layer__Group__4__Impl"


    // $ANTLR start "rule__Layer__Group__5"
    // InternalQuCircuit.g:1619:1: rule__Layer__Group__5 : rule__Layer__Group__5__Impl rule__Layer__Group__6 ;
    public final void rule__Layer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1623:1: ( rule__Layer__Group__5__Impl rule__Layer__Group__6 )
            // InternalQuCircuit.g:1624:2: rule__Layer__Group__5__Impl rule__Layer__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__Layer__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group__6();

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
    // $ANTLR end "rule__Layer__Group__5"


    // $ANTLR start "rule__Layer__Group__5__Impl"
    // InternalQuCircuit.g:1631:1: rule__Layer__Group__5__Impl : ( ( rule__Layer__Group_5__0 )* ) ;
    public final void rule__Layer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1635:1: ( ( ( rule__Layer__Group_5__0 )* ) )
            // InternalQuCircuit.g:1636:1: ( ( rule__Layer__Group_5__0 )* )
            {
            // InternalQuCircuit.g:1636:1: ( ( rule__Layer__Group_5__0 )* )
            // InternalQuCircuit.g:1637:2: ( rule__Layer__Group_5__0 )*
            {
             before(grammarAccess.getLayerAccess().getGroup_5()); 
            // InternalQuCircuit.g:1638:2: ( rule__Layer__Group_5__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==26) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalQuCircuit.g:1638:3: rule__Layer__Group_5__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Layer__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getLayerAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Layer__Group__5__Impl"


    // $ANTLR start "rule__Layer__Group__6"
    // InternalQuCircuit.g:1646:1: rule__Layer__Group__6 : rule__Layer__Group__6__Impl ;
    public final void rule__Layer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1650:1: ( rule__Layer__Group__6__Impl )
            // InternalQuCircuit.g:1651:2: rule__Layer__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Layer__Group__6__Impl();

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
    // $ANTLR end "rule__Layer__Group__6"


    // $ANTLR start "rule__Layer__Group__6__Impl"
    // InternalQuCircuit.g:1657:1: rule__Layer__Group__6__Impl : ( '}' ) ;
    public final void rule__Layer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1661:1: ( ( '}' ) )
            // InternalQuCircuit.g:1662:1: ( '}' )
            {
            // InternalQuCircuit.g:1662:1: ( '}' )
            // InternalQuCircuit.g:1663:2: '}'
            {
             before(grammarAccess.getLayerAccess().getRightCurlyBracketKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getLayerAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Layer__Group__6__Impl"


    // $ANTLR start "rule__Layer__Group_5__0"
    // InternalQuCircuit.g:1673:1: rule__Layer__Group_5__0 : rule__Layer__Group_5__0__Impl rule__Layer__Group_5__1 ;
    public final void rule__Layer__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1677:1: ( rule__Layer__Group_5__0__Impl rule__Layer__Group_5__1 )
            // InternalQuCircuit.g:1678:2: rule__Layer__Group_5__0__Impl rule__Layer__Group_5__1
            {
            pushFollow(FOLLOW_18);
            rule__Layer__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layer__Group_5__1();

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
    // $ANTLR end "rule__Layer__Group_5__0"


    // $ANTLR start "rule__Layer__Group_5__0__Impl"
    // InternalQuCircuit.g:1685:1: rule__Layer__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Layer__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1689:1: ( ( ',' ) )
            // InternalQuCircuit.g:1690:1: ( ',' )
            {
            // InternalQuCircuit.g:1690:1: ( ',' )
            // InternalQuCircuit.g:1691:2: ','
            {
             before(grammarAccess.getLayerAccess().getCommaKeyword_5_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getLayerAccess().getCommaKeyword_5_0()); 

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
    // $ANTLR end "rule__Layer__Group_5__0__Impl"


    // $ANTLR start "rule__Layer__Group_5__1"
    // InternalQuCircuit.g:1700:1: rule__Layer__Group_5__1 : rule__Layer__Group_5__1__Impl ;
    public final void rule__Layer__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1704:1: ( rule__Layer__Group_5__1__Impl )
            // InternalQuCircuit.g:1705:2: rule__Layer__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Layer__Group_5__1__Impl();

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
    // $ANTLR end "rule__Layer__Group_5__1"


    // $ANTLR start "rule__Layer__Group_5__1__Impl"
    // InternalQuCircuit.g:1711:1: rule__Layer__Group_5__1__Impl : ( ( rule__Layer__QuantumOperationsAssignment_5_1 ) ) ;
    public final void rule__Layer__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1715:1: ( ( ( rule__Layer__QuantumOperationsAssignment_5_1 ) ) )
            // InternalQuCircuit.g:1716:1: ( ( rule__Layer__QuantumOperationsAssignment_5_1 ) )
            {
            // InternalQuCircuit.g:1716:1: ( ( rule__Layer__QuantumOperationsAssignment_5_1 ) )
            // InternalQuCircuit.g:1717:2: ( rule__Layer__QuantumOperationsAssignment_5_1 )
            {
             before(grammarAccess.getLayerAccess().getQuantumOperationsAssignment_5_1()); 
            // InternalQuCircuit.g:1718:2: ( rule__Layer__QuantumOperationsAssignment_5_1 )
            // InternalQuCircuit.g:1718:3: rule__Layer__QuantumOperationsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Layer__QuantumOperationsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getLayerAccess().getQuantumOperationsAssignment_5_1()); 

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
    // $ANTLR end "rule__Layer__Group_5__1__Impl"


    // $ANTLR start "rule__StatePreparation__Group__0"
    // InternalQuCircuit.g:1727:1: rule__StatePreparation__Group__0 : rule__StatePreparation__Group__0__Impl rule__StatePreparation__Group__1 ;
    public final void rule__StatePreparation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1731:1: ( rule__StatePreparation__Group__0__Impl rule__StatePreparation__Group__1 )
            // InternalQuCircuit.g:1732:2: rule__StatePreparation__Group__0__Impl rule__StatePreparation__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__StatePreparation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatePreparation__Group__1();

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
    // $ANTLR end "rule__StatePreparation__Group__0"


    // $ANTLR start "rule__StatePreparation__Group__0__Impl"
    // InternalQuCircuit.g:1739:1: rule__StatePreparation__Group__0__Impl : ( 'StatePreparation' ) ;
    public final void rule__StatePreparation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1743:1: ( ( 'StatePreparation' ) )
            // InternalQuCircuit.g:1744:1: ( 'StatePreparation' )
            {
            // InternalQuCircuit.g:1744:1: ( 'StatePreparation' )
            // InternalQuCircuit.g:1745:2: 'StatePreparation'
            {
             before(grammarAccess.getStatePreparationAccess().getStatePreparationKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getStatePreparationAccess().getStatePreparationKeyword_0()); 

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
    // $ANTLR end "rule__StatePreparation__Group__0__Impl"


    // $ANTLR start "rule__StatePreparation__Group__1"
    // InternalQuCircuit.g:1754:1: rule__StatePreparation__Group__1 : rule__StatePreparation__Group__1__Impl rule__StatePreparation__Group__2 ;
    public final void rule__StatePreparation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1758:1: ( rule__StatePreparation__Group__1__Impl rule__StatePreparation__Group__2 )
            // InternalQuCircuit.g:1759:2: rule__StatePreparation__Group__1__Impl rule__StatePreparation__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__StatePreparation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatePreparation__Group__2();

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
    // $ANTLR end "rule__StatePreparation__Group__1"


    // $ANTLR start "rule__StatePreparation__Group__1__Impl"
    // InternalQuCircuit.g:1766:1: rule__StatePreparation__Group__1__Impl : ( ( rule__StatePreparation__NameAssignment_1 ) ) ;
    public final void rule__StatePreparation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1770:1: ( ( ( rule__StatePreparation__NameAssignment_1 ) ) )
            // InternalQuCircuit.g:1771:1: ( ( rule__StatePreparation__NameAssignment_1 ) )
            {
            // InternalQuCircuit.g:1771:1: ( ( rule__StatePreparation__NameAssignment_1 ) )
            // InternalQuCircuit.g:1772:2: ( rule__StatePreparation__NameAssignment_1 )
            {
             before(grammarAccess.getStatePreparationAccess().getNameAssignment_1()); 
            // InternalQuCircuit.g:1773:2: ( rule__StatePreparation__NameAssignment_1 )
            // InternalQuCircuit.g:1773:3: rule__StatePreparation__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__StatePreparation__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStatePreparationAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__StatePreparation__Group__1__Impl"


    // $ANTLR start "rule__StatePreparation__Group__2"
    // InternalQuCircuit.g:1781:1: rule__StatePreparation__Group__2 : rule__StatePreparation__Group__2__Impl rule__StatePreparation__Group__3 ;
    public final void rule__StatePreparation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1785:1: ( rule__StatePreparation__Group__2__Impl rule__StatePreparation__Group__3 )
            // InternalQuCircuit.g:1786:2: rule__StatePreparation__Group__2__Impl rule__StatePreparation__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__StatePreparation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatePreparation__Group__3();

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
    // $ANTLR end "rule__StatePreparation__Group__2"


    // $ANTLR start "rule__StatePreparation__Group__2__Impl"
    // InternalQuCircuit.g:1793:1: rule__StatePreparation__Group__2__Impl : ( '{' ) ;
    public final void rule__StatePreparation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1797:1: ( ( '{' ) )
            // InternalQuCircuit.g:1798:1: ( '{' )
            {
            // InternalQuCircuit.g:1798:1: ( '{' )
            // InternalQuCircuit.g:1799:2: '{'
            {
             before(grammarAccess.getStatePreparationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getStatePreparationAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__StatePreparation__Group__2__Impl"


    // $ANTLR start "rule__StatePreparation__Group__3"
    // InternalQuCircuit.g:1808:1: rule__StatePreparation__Group__3 : rule__StatePreparation__Group__3__Impl rule__StatePreparation__Group__4 ;
    public final void rule__StatePreparation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1812:1: ( rule__StatePreparation__Group__3__Impl rule__StatePreparation__Group__4 )
            // InternalQuCircuit.g:1813:2: rule__StatePreparation__Group__3__Impl rule__StatePreparation__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__StatePreparation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatePreparation__Group__4();

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
    // $ANTLR end "rule__StatePreparation__Group__3"


    // $ANTLR start "rule__StatePreparation__Group__3__Impl"
    // InternalQuCircuit.g:1820:1: rule__StatePreparation__Group__3__Impl : ( 'operation' ) ;
    public final void rule__StatePreparation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1824:1: ( ( 'operation' ) )
            // InternalQuCircuit.g:1825:1: ( 'operation' )
            {
            // InternalQuCircuit.g:1825:1: ( 'operation' )
            // InternalQuCircuit.g:1826:2: 'operation'
            {
             before(grammarAccess.getStatePreparationAccess().getOperationKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getStatePreparationAccess().getOperationKeyword_3()); 

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
    // $ANTLR end "rule__StatePreparation__Group__3__Impl"


    // $ANTLR start "rule__StatePreparation__Group__4"
    // InternalQuCircuit.g:1835:1: rule__StatePreparation__Group__4 : rule__StatePreparation__Group__4__Impl rule__StatePreparation__Group__5 ;
    public final void rule__StatePreparation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1839:1: ( rule__StatePreparation__Group__4__Impl rule__StatePreparation__Group__5 )
            // InternalQuCircuit.g:1840:2: rule__StatePreparation__Group__4__Impl rule__StatePreparation__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__StatePreparation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatePreparation__Group__5();

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
    // $ANTLR end "rule__StatePreparation__Group__4"


    // $ANTLR start "rule__StatePreparation__Group__4__Impl"
    // InternalQuCircuit.g:1847:1: rule__StatePreparation__Group__4__Impl : ( ( rule__StatePreparation__OperationsAssignment_4 ) ) ;
    public final void rule__StatePreparation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1851:1: ( ( ( rule__StatePreparation__OperationsAssignment_4 ) ) )
            // InternalQuCircuit.g:1852:1: ( ( rule__StatePreparation__OperationsAssignment_4 ) )
            {
            // InternalQuCircuit.g:1852:1: ( ( rule__StatePreparation__OperationsAssignment_4 ) )
            // InternalQuCircuit.g:1853:2: ( rule__StatePreparation__OperationsAssignment_4 )
            {
             before(grammarAccess.getStatePreparationAccess().getOperationsAssignment_4()); 
            // InternalQuCircuit.g:1854:2: ( rule__StatePreparation__OperationsAssignment_4 )
            // InternalQuCircuit.g:1854:3: rule__StatePreparation__OperationsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__StatePreparation__OperationsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getStatePreparationAccess().getOperationsAssignment_4()); 

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
    // $ANTLR end "rule__StatePreparation__Group__4__Impl"


    // $ANTLR start "rule__StatePreparation__Group__5"
    // InternalQuCircuit.g:1862:1: rule__StatePreparation__Group__5 : rule__StatePreparation__Group__5__Impl rule__StatePreparation__Group__6 ;
    public final void rule__StatePreparation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1866:1: ( rule__StatePreparation__Group__5__Impl rule__StatePreparation__Group__6 )
            // InternalQuCircuit.g:1867:2: rule__StatePreparation__Group__5__Impl rule__StatePreparation__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__StatePreparation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatePreparation__Group__6();

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
    // $ANTLR end "rule__StatePreparation__Group__5"


    // $ANTLR start "rule__StatePreparation__Group__5__Impl"
    // InternalQuCircuit.g:1874:1: rule__StatePreparation__Group__5__Impl : ( ( rule__StatePreparation__Group_5__0 )* ) ;
    public final void rule__StatePreparation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1878:1: ( ( ( rule__StatePreparation__Group_5__0 )* ) )
            // InternalQuCircuit.g:1879:1: ( ( rule__StatePreparation__Group_5__0 )* )
            {
            // InternalQuCircuit.g:1879:1: ( ( rule__StatePreparation__Group_5__0 )* )
            // InternalQuCircuit.g:1880:2: ( rule__StatePreparation__Group_5__0 )*
            {
             before(grammarAccess.getStatePreparationAccess().getGroup_5()); 
            // InternalQuCircuit.g:1881:2: ( rule__StatePreparation__Group_5__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==26) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalQuCircuit.g:1881:3: rule__StatePreparation__Group_5__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__StatePreparation__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getStatePreparationAccess().getGroup_5()); 

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
    // $ANTLR end "rule__StatePreparation__Group__5__Impl"


    // $ANTLR start "rule__StatePreparation__Group__6"
    // InternalQuCircuit.g:1889:1: rule__StatePreparation__Group__6 : rule__StatePreparation__Group__6__Impl rule__StatePreparation__Group__7 ;
    public final void rule__StatePreparation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1893:1: ( rule__StatePreparation__Group__6__Impl rule__StatePreparation__Group__7 )
            // InternalQuCircuit.g:1894:2: rule__StatePreparation__Group__6__Impl rule__StatePreparation__Group__7
            {
            pushFollow(FOLLOW_23);
            rule__StatePreparation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatePreparation__Group__7();

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
    // $ANTLR end "rule__StatePreparation__Group__6"


    // $ANTLR start "rule__StatePreparation__Group__6__Impl"
    // InternalQuCircuit.g:1901:1: rule__StatePreparation__Group__6__Impl : ( 'targetQubits' ) ;
    public final void rule__StatePreparation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1905:1: ( ( 'targetQubits' ) )
            // InternalQuCircuit.g:1906:1: ( 'targetQubits' )
            {
            // InternalQuCircuit.g:1906:1: ( 'targetQubits' )
            // InternalQuCircuit.g:1907:2: 'targetQubits'
            {
             before(grammarAccess.getStatePreparationAccess().getTargetQubitsKeyword_6()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getStatePreparationAccess().getTargetQubitsKeyword_6()); 

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
    // $ANTLR end "rule__StatePreparation__Group__6__Impl"


    // $ANTLR start "rule__StatePreparation__Group__7"
    // InternalQuCircuit.g:1916:1: rule__StatePreparation__Group__7 : rule__StatePreparation__Group__7__Impl rule__StatePreparation__Group__8 ;
    public final void rule__StatePreparation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1920:1: ( rule__StatePreparation__Group__7__Impl rule__StatePreparation__Group__8 )
            // InternalQuCircuit.g:1921:2: rule__StatePreparation__Group__7__Impl rule__StatePreparation__Group__8
            {
            pushFollow(FOLLOW_24);
            rule__StatePreparation__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatePreparation__Group__8();

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
    // $ANTLR end "rule__StatePreparation__Group__7"


    // $ANTLR start "rule__StatePreparation__Group__7__Impl"
    // InternalQuCircuit.g:1928:1: rule__StatePreparation__Group__7__Impl : ( '[' ) ;
    public final void rule__StatePreparation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1932:1: ( ( '[' ) )
            // InternalQuCircuit.g:1933:1: ( '[' )
            {
            // InternalQuCircuit.g:1933:1: ( '[' )
            // InternalQuCircuit.g:1934:2: '['
            {
             before(grammarAccess.getStatePreparationAccess().getLeftSquareBracketKeyword_7()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getStatePreparationAccess().getLeftSquareBracketKeyword_7()); 

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
    // $ANTLR end "rule__StatePreparation__Group__7__Impl"


    // $ANTLR start "rule__StatePreparation__Group__8"
    // InternalQuCircuit.g:1943:1: rule__StatePreparation__Group__8 : rule__StatePreparation__Group__8__Impl rule__StatePreparation__Group__9 ;
    public final void rule__StatePreparation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1947:1: ( rule__StatePreparation__Group__8__Impl rule__StatePreparation__Group__9 )
            // InternalQuCircuit.g:1948:2: rule__StatePreparation__Group__8__Impl rule__StatePreparation__Group__9
            {
            pushFollow(FOLLOW_25);
            rule__StatePreparation__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatePreparation__Group__9();

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
    // $ANTLR end "rule__StatePreparation__Group__8"


    // $ANTLR start "rule__StatePreparation__Group__8__Impl"
    // InternalQuCircuit.g:1955:1: rule__StatePreparation__Group__8__Impl : ( ( rule__StatePreparation__TargetQubitsAssignment_8 ) ) ;
    public final void rule__StatePreparation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1959:1: ( ( ( rule__StatePreparation__TargetQubitsAssignment_8 ) ) )
            // InternalQuCircuit.g:1960:1: ( ( rule__StatePreparation__TargetQubitsAssignment_8 ) )
            {
            // InternalQuCircuit.g:1960:1: ( ( rule__StatePreparation__TargetQubitsAssignment_8 ) )
            // InternalQuCircuit.g:1961:2: ( rule__StatePreparation__TargetQubitsAssignment_8 )
            {
             before(grammarAccess.getStatePreparationAccess().getTargetQubitsAssignment_8()); 
            // InternalQuCircuit.g:1962:2: ( rule__StatePreparation__TargetQubitsAssignment_8 )
            // InternalQuCircuit.g:1962:3: rule__StatePreparation__TargetQubitsAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__StatePreparation__TargetQubitsAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getStatePreparationAccess().getTargetQubitsAssignment_8()); 

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
    // $ANTLR end "rule__StatePreparation__Group__8__Impl"


    // $ANTLR start "rule__StatePreparation__Group__9"
    // InternalQuCircuit.g:1970:1: rule__StatePreparation__Group__9 : rule__StatePreparation__Group__9__Impl rule__StatePreparation__Group__10 ;
    public final void rule__StatePreparation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1974:1: ( rule__StatePreparation__Group__9__Impl rule__StatePreparation__Group__10 )
            // InternalQuCircuit.g:1975:2: rule__StatePreparation__Group__9__Impl rule__StatePreparation__Group__10
            {
            pushFollow(FOLLOW_25);
            rule__StatePreparation__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatePreparation__Group__10();

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
    // $ANTLR end "rule__StatePreparation__Group__9"


    // $ANTLR start "rule__StatePreparation__Group__9__Impl"
    // InternalQuCircuit.g:1982:1: rule__StatePreparation__Group__9__Impl : ( ( rule__StatePreparation__Group_9__0 )* ) ;
    public final void rule__StatePreparation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:1986:1: ( ( ( rule__StatePreparation__Group_9__0 )* ) )
            // InternalQuCircuit.g:1987:1: ( ( rule__StatePreparation__Group_9__0 )* )
            {
            // InternalQuCircuit.g:1987:1: ( ( rule__StatePreparation__Group_9__0 )* )
            // InternalQuCircuit.g:1988:2: ( rule__StatePreparation__Group_9__0 )*
            {
             before(grammarAccess.getStatePreparationAccess().getGroup_9()); 
            // InternalQuCircuit.g:1989:2: ( rule__StatePreparation__Group_9__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==26) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalQuCircuit.g:1989:3: rule__StatePreparation__Group_9__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__StatePreparation__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getStatePreparationAccess().getGroup_9()); 

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
    // $ANTLR end "rule__StatePreparation__Group__9__Impl"


    // $ANTLR start "rule__StatePreparation__Group__10"
    // InternalQuCircuit.g:1997:1: rule__StatePreparation__Group__10 : rule__StatePreparation__Group__10__Impl rule__StatePreparation__Group__11 ;
    public final void rule__StatePreparation__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2001:1: ( rule__StatePreparation__Group__10__Impl rule__StatePreparation__Group__11 )
            // InternalQuCircuit.g:2002:2: rule__StatePreparation__Group__10__Impl rule__StatePreparation__Group__11
            {
            pushFollow(FOLLOW_26);
            rule__StatePreparation__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatePreparation__Group__11();

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
    // $ANTLR end "rule__StatePreparation__Group__10"


    // $ANTLR start "rule__StatePreparation__Group__10__Impl"
    // InternalQuCircuit.g:2009:1: rule__StatePreparation__Group__10__Impl : ( ']' ) ;
    public final void rule__StatePreparation__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2013:1: ( ( ']' ) )
            // InternalQuCircuit.g:2014:1: ( ']' )
            {
            // InternalQuCircuit.g:2014:1: ( ']' )
            // InternalQuCircuit.g:2015:2: ']'
            {
             before(grammarAccess.getStatePreparationAccess().getRightSquareBracketKeyword_10()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getStatePreparationAccess().getRightSquareBracketKeyword_10()); 

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
    // $ANTLR end "rule__StatePreparation__Group__10__Impl"


    // $ANTLR start "rule__StatePreparation__Group__11"
    // InternalQuCircuit.g:2024:1: rule__StatePreparation__Group__11 : rule__StatePreparation__Group__11__Impl ;
    public final void rule__StatePreparation__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2028:1: ( rule__StatePreparation__Group__11__Impl )
            // InternalQuCircuit.g:2029:2: rule__StatePreparation__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StatePreparation__Group__11__Impl();

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
    // $ANTLR end "rule__StatePreparation__Group__11"


    // $ANTLR start "rule__StatePreparation__Group__11__Impl"
    // InternalQuCircuit.g:2035:1: rule__StatePreparation__Group__11__Impl : ( '}' ) ;
    public final void rule__StatePreparation__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2039:1: ( ( '}' ) )
            // InternalQuCircuit.g:2040:1: ( '}' )
            {
            // InternalQuCircuit.g:2040:1: ( '}' )
            // InternalQuCircuit.g:2041:2: '}'
            {
             before(grammarAccess.getStatePreparationAccess().getRightCurlyBracketKeyword_11()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getStatePreparationAccess().getRightCurlyBracketKeyword_11()); 

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
    // $ANTLR end "rule__StatePreparation__Group__11__Impl"


    // $ANTLR start "rule__StatePreparation__Group_5__0"
    // InternalQuCircuit.g:2051:1: rule__StatePreparation__Group_5__0 : rule__StatePreparation__Group_5__0__Impl rule__StatePreparation__Group_5__1 ;
    public final void rule__StatePreparation__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2055:1: ( rule__StatePreparation__Group_5__0__Impl rule__StatePreparation__Group_5__1 )
            // InternalQuCircuit.g:2056:2: rule__StatePreparation__Group_5__0__Impl rule__StatePreparation__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__StatePreparation__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatePreparation__Group_5__1();

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
    // $ANTLR end "rule__StatePreparation__Group_5__0"


    // $ANTLR start "rule__StatePreparation__Group_5__0__Impl"
    // InternalQuCircuit.g:2063:1: rule__StatePreparation__Group_5__0__Impl : ( ',' ) ;
    public final void rule__StatePreparation__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2067:1: ( ( ',' ) )
            // InternalQuCircuit.g:2068:1: ( ',' )
            {
            // InternalQuCircuit.g:2068:1: ( ',' )
            // InternalQuCircuit.g:2069:2: ','
            {
             before(grammarAccess.getStatePreparationAccess().getCommaKeyword_5_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getStatePreparationAccess().getCommaKeyword_5_0()); 

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
    // $ANTLR end "rule__StatePreparation__Group_5__0__Impl"


    // $ANTLR start "rule__StatePreparation__Group_5__1"
    // InternalQuCircuit.g:2078:1: rule__StatePreparation__Group_5__1 : rule__StatePreparation__Group_5__1__Impl ;
    public final void rule__StatePreparation__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2082:1: ( rule__StatePreparation__Group_5__1__Impl )
            // InternalQuCircuit.g:2083:2: rule__StatePreparation__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StatePreparation__Group_5__1__Impl();

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
    // $ANTLR end "rule__StatePreparation__Group_5__1"


    // $ANTLR start "rule__StatePreparation__Group_5__1__Impl"
    // InternalQuCircuit.g:2089:1: rule__StatePreparation__Group_5__1__Impl : ( ( rule__StatePreparation__OperationsAssignment_5_1 ) ) ;
    public final void rule__StatePreparation__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2093:1: ( ( ( rule__StatePreparation__OperationsAssignment_5_1 ) ) )
            // InternalQuCircuit.g:2094:1: ( ( rule__StatePreparation__OperationsAssignment_5_1 ) )
            {
            // InternalQuCircuit.g:2094:1: ( ( rule__StatePreparation__OperationsAssignment_5_1 ) )
            // InternalQuCircuit.g:2095:2: ( rule__StatePreparation__OperationsAssignment_5_1 )
            {
             before(grammarAccess.getStatePreparationAccess().getOperationsAssignment_5_1()); 
            // InternalQuCircuit.g:2096:2: ( rule__StatePreparation__OperationsAssignment_5_1 )
            // InternalQuCircuit.g:2096:3: rule__StatePreparation__OperationsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__StatePreparation__OperationsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getStatePreparationAccess().getOperationsAssignment_5_1()); 

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
    // $ANTLR end "rule__StatePreparation__Group_5__1__Impl"


    // $ANTLR start "rule__StatePreparation__Group_9__0"
    // InternalQuCircuit.g:2105:1: rule__StatePreparation__Group_9__0 : rule__StatePreparation__Group_9__0__Impl rule__StatePreparation__Group_9__1 ;
    public final void rule__StatePreparation__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2109:1: ( rule__StatePreparation__Group_9__0__Impl rule__StatePreparation__Group_9__1 )
            // InternalQuCircuit.g:2110:2: rule__StatePreparation__Group_9__0__Impl rule__StatePreparation__Group_9__1
            {
            pushFollow(FOLLOW_24);
            rule__StatePreparation__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatePreparation__Group_9__1();

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
    // $ANTLR end "rule__StatePreparation__Group_9__0"


    // $ANTLR start "rule__StatePreparation__Group_9__0__Impl"
    // InternalQuCircuit.g:2117:1: rule__StatePreparation__Group_9__0__Impl : ( ',' ) ;
    public final void rule__StatePreparation__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2121:1: ( ( ',' ) )
            // InternalQuCircuit.g:2122:1: ( ',' )
            {
            // InternalQuCircuit.g:2122:1: ( ',' )
            // InternalQuCircuit.g:2123:2: ','
            {
             before(grammarAccess.getStatePreparationAccess().getCommaKeyword_9_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getStatePreparationAccess().getCommaKeyword_9_0()); 

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
    // $ANTLR end "rule__StatePreparation__Group_9__0__Impl"


    // $ANTLR start "rule__StatePreparation__Group_9__1"
    // InternalQuCircuit.g:2132:1: rule__StatePreparation__Group_9__1 : rule__StatePreparation__Group_9__1__Impl ;
    public final void rule__StatePreparation__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2136:1: ( rule__StatePreparation__Group_9__1__Impl )
            // InternalQuCircuit.g:2137:2: rule__StatePreparation__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StatePreparation__Group_9__1__Impl();

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
    // $ANTLR end "rule__StatePreparation__Group_9__1"


    // $ANTLR start "rule__StatePreparation__Group_9__1__Impl"
    // InternalQuCircuit.g:2143:1: rule__StatePreparation__Group_9__1__Impl : ( ( rule__StatePreparation__TargetQubitsAssignment_9_1 ) ) ;
    public final void rule__StatePreparation__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2147:1: ( ( ( rule__StatePreparation__TargetQubitsAssignment_9_1 ) ) )
            // InternalQuCircuit.g:2148:1: ( ( rule__StatePreparation__TargetQubitsAssignment_9_1 ) )
            {
            // InternalQuCircuit.g:2148:1: ( ( rule__StatePreparation__TargetQubitsAssignment_9_1 ) )
            // InternalQuCircuit.g:2149:2: ( rule__StatePreparation__TargetQubitsAssignment_9_1 )
            {
             before(grammarAccess.getStatePreparationAccess().getTargetQubitsAssignment_9_1()); 
            // InternalQuCircuit.g:2150:2: ( rule__StatePreparation__TargetQubitsAssignment_9_1 )
            // InternalQuCircuit.g:2150:3: rule__StatePreparation__TargetQubitsAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__StatePreparation__TargetQubitsAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getStatePreparationAccess().getTargetQubitsAssignment_9_1()); 

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
    // $ANTLR end "rule__StatePreparation__Group_9__1__Impl"


    // $ANTLR start "rule__ElementaryQuantumGate__Group__0"
    // InternalQuCircuit.g:2159:1: rule__ElementaryQuantumGate__Group__0 : rule__ElementaryQuantumGate__Group__0__Impl rule__ElementaryQuantumGate__Group__1 ;
    public final void rule__ElementaryQuantumGate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2163:1: ( rule__ElementaryQuantumGate__Group__0__Impl rule__ElementaryQuantumGate__Group__1 )
            // InternalQuCircuit.g:2164:2: rule__ElementaryQuantumGate__Group__0__Impl rule__ElementaryQuantumGate__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__ElementaryQuantumGate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementaryQuantumGate__Group__1();

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group__0"


    // $ANTLR start "rule__ElementaryQuantumGate__Group__0__Impl"
    // InternalQuCircuit.g:2171:1: rule__ElementaryQuantumGate__Group__0__Impl : ( 'ElementaryQuantumGate' ) ;
    public final void rule__ElementaryQuantumGate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2175:1: ( ( 'ElementaryQuantumGate' ) )
            // InternalQuCircuit.g:2176:1: ( 'ElementaryQuantumGate' )
            {
            // InternalQuCircuit.g:2176:1: ( 'ElementaryQuantumGate' )
            // InternalQuCircuit.g:2177:2: 'ElementaryQuantumGate'
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getElementaryQuantumGateKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getElementaryQuantumGateAccess().getElementaryQuantumGateKeyword_0()); 

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group__0__Impl"


    // $ANTLR start "rule__ElementaryQuantumGate__Group__1"
    // InternalQuCircuit.g:2186:1: rule__ElementaryQuantumGate__Group__1 : rule__ElementaryQuantumGate__Group__1__Impl rule__ElementaryQuantumGate__Group__2 ;
    public final void rule__ElementaryQuantumGate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2190:1: ( rule__ElementaryQuantumGate__Group__1__Impl rule__ElementaryQuantumGate__Group__2 )
            // InternalQuCircuit.g:2191:2: rule__ElementaryQuantumGate__Group__1__Impl rule__ElementaryQuantumGate__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__ElementaryQuantumGate__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementaryQuantumGate__Group__2();

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group__1"


    // $ANTLR start "rule__ElementaryQuantumGate__Group__1__Impl"
    // InternalQuCircuit.g:2198:1: rule__ElementaryQuantumGate__Group__1__Impl : ( ( rule__ElementaryQuantumGate__InverseFormAssignment_1 )? ) ;
    public final void rule__ElementaryQuantumGate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2202:1: ( ( ( rule__ElementaryQuantumGate__InverseFormAssignment_1 )? ) )
            // InternalQuCircuit.g:2203:1: ( ( rule__ElementaryQuantumGate__InverseFormAssignment_1 )? )
            {
            // InternalQuCircuit.g:2203:1: ( ( rule__ElementaryQuantumGate__InverseFormAssignment_1 )? )
            // InternalQuCircuit.g:2204:2: ( rule__ElementaryQuantumGate__InverseFormAssignment_1 )?
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getInverseFormAssignment_1()); 
            // InternalQuCircuit.g:2205:2: ( rule__ElementaryQuantumGate__InverseFormAssignment_1 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==56) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalQuCircuit.g:2205:3: rule__ElementaryQuantumGate__InverseFormAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ElementaryQuantumGate__InverseFormAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getElementaryQuantumGateAccess().getInverseFormAssignment_1()); 

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group__1__Impl"


    // $ANTLR start "rule__ElementaryQuantumGate__Group__2"
    // InternalQuCircuit.g:2213:1: rule__ElementaryQuantumGate__Group__2 : rule__ElementaryQuantumGate__Group__2__Impl rule__ElementaryQuantumGate__Group__3 ;
    public final void rule__ElementaryQuantumGate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2217:1: ( rule__ElementaryQuantumGate__Group__2__Impl rule__ElementaryQuantumGate__Group__3 )
            // InternalQuCircuit.g:2218:2: rule__ElementaryQuantumGate__Group__2__Impl rule__ElementaryQuantumGate__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__ElementaryQuantumGate__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementaryQuantumGate__Group__3();

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group__2"


    // $ANTLR start "rule__ElementaryQuantumGate__Group__2__Impl"
    // InternalQuCircuit.g:2225:1: rule__ElementaryQuantumGate__Group__2__Impl : ( ( rule__ElementaryQuantumGate__NameAssignment_2 ) ) ;
    public final void rule__ElementaryQuantumGate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2229:1: ( ( ( rule__ElementaryQuantumGate__NameAssignment_2 ) ) )
            // InternalQuCircuit.g:2230:1: ( ( rule__ElementaryQuantumGate__NameAssignment_2 ) )
            {
            // InternalQuCircuit.g:2230:1: ( ( rule__ElementaryQuantumGate__NameAssignment_2 ) )
            // InternalQuCircuit.g:2231:2: ( rule__ElementaryQuantumGate__NameAssignment_2 )
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getNameAssignment_2()); 
            // InternalQuCircuit.g:2232:2: ( rule__ElementaryQuantumGate__NameAssignment_2 )
            // InternalQuCircuit.g:2232:3: rule__ElementaryQuantumGate__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ElementaryQuantumGate__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getElementaryQuantumGateAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group__2__Impl"


    // $ANTLR start "rule__ElementaryQuantumGate__Group__3"
    // InternalQuCircuit.g:2240:1: rule__ElementaryQuantumGate__Group__3 : rule__ElementaryQuantumGate__Group__3__Impl rule__ElementaryQuantumGate__Group__4 ;
    public final void rule__ElementaryQuantumGate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2244:1: ( rule__ElementaryQuantumGate__Group__3__Impl rule__ElementaryQuantumGate__Group__4 )
            // InternalQuCircuit.g:2245:2: rule__ElementaryQuantumGate__Group__3__Impl rule__ElementaryQuantumGate__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__ElementaryQuantumGate__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementaryQuantumGate__Group__4();

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group__3"


    // $ANTLR start "rule__ElementaryQuantumGate__Group__3__Impl"
    // InternalQuCircuit.g:2252:1: rule__ElementaryQuantumGate__Group__3__Impl : ( '{' ) ;
    public final void rule__ElementaryQuantumGate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2256:1: ( ( '{' ) )
            // InternalQuCircuit.g:2257:1: ( '{' )
            {
            // InternalQuCircuit.g:2257:1: ( '{' )
            // InternalQuCircuit.g:2258:2: '{'
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getElementaryQuantumGateAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group__3__Impl"


    // $ANTLR start "rule__ElementaryQuantumGate__Group__4"
    // InternalQuCircuit.g:2267:1: rule__ElementaryQuantumGate__Group__4 : rule__ElementaryQuantumGate__Group__4__Impl rule__ElementaryQuantumGate__Group__5 ;
    public final void rule__ElementaryQuantumGate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2271:1: ( rule__ElementaryQuantumGate__Group__4__Impl rule__ElementaryQuantumGate__Group__5 )
            // InternalQuCircuit.g:2272:2: rule__ElementaryQuantumGate__Group__4__Impl rule__ElementaryQuantumGate__Group__5
            {
            pushFollow(FOLLOW_28);
            rule__ElementaryQuantumGate__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementaryQuantumGate__Group__5();

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group__4"


    // $ANTLR start "rule__ElementaryQuantumGate__Group__4__Impl"
    // InternalQuCircuit.g:2279:1: rule__ElementaryQuantumGate__Group__4__Impl : ( ( rule__ElementaryQuantumGate__Group_4__0 )? ) ;
    public final void rule__ElementaryQuantumGate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2283:1: ( ( ( rule__ElementaryQuantumGate__Group_4__0 )? ) )
            // InternalQuCircuit.g:2284:1: ( ( rule__ElementaryQuantumGate__Group_4__0 )? )
            {
            // InternalQuCircuit.g:2284:1: ( ( rule__ElementaryQuantumGate__Group_4__0 )? )
            // InternalQuCircuit.g:2285:2: ( rule__ElementaryQuantumGate__Group_4__0 )?
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getGroup_4()); 
            // InternalQuCircuit.g:2286:2: ( rule__ElementaryQuantumGate__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==28) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalQuCircuit.g:2286:3: rule__ElementaryQuantumGate__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ElementaryQuantumGate__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getElementaryQuantumGateAccess().getGroup_4()); 

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group__4__Impl"


    // $ANTLR start "rule__ElementaryQuantumGate__Group__5"
    // InternalQuCircuit.g:2294:1: rule__ElementaryQuantumGate__Group__5 : rule__ElementaryQuantumGate__Group__5__Impl rule__ElementaryQuantumGate__Group__6 ;
    public final void rule__ElementaryQuantumGate__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2298:1: ( rule__ElementaryQuantumGate__Group__5__Impl rule__ElementaryQuantumGate__Group__6 )
            // InternalQuCircuit.g:2299:2: rule__ElementaryQuantumGate__Group__5__Impl rule__ElementaryQuantumGate__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__ElementaryQuantumGate__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementaryQuantumGate__Group__6();

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group__5"


    // $ANTLR start "rule__ElementaryQuantumGate__Group__5__Impl"
    // InternalQuCircuit.g:2306:1: rule__ElementaryQuantumGate__Group__5__Impl : ( 'targetQubits' ) ;
    public final void rule__ElementaryQuantumGate__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2310:1: ( ( 'targetQubits' ) )
            // InternalQuCircuit.g:2311:1: ( 'targetQubits' )
            {
            // InternalQuCircuit.g:2311:1: ( 'targetQubits' )
            // InternalQuCircuit.g:2312:2: 'targetQubits'
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getTargetQubitsKeyword_5()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getElementaryQuantumGateAccess().getTargetQubitsKeyword_5()); 

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group__5__Impl"


    // $ANTLR start "rule__ElementaryQuantumGate__Group__6"
    // InternalQuCircuit.g:2321:1: rule__ElementaryQuantumGate__Group__6 : rule__ElementaryQuantumGate__Group__6__Impl rule__ElementaryQuantumGate__Group__7 ;
    public final void rule__ElementaryQuantumGate__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2325:1: ( rule__ElementaryQuantumGate__Group__6__Impl rule__ElementaryQuantumGate__Group__7 )
            // InternalQuCircuit.g:2326:2: rule__ElementaryQuantumGate__Group__6__Impl rule__ElementaryQuantumGate__Group__7
            {
            pushFollow(FOLLOW_14);
            rule__ElementaryQuantumGate__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementaryQuantumGate__Group__7();

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group__6"


    // $ANTLR start "rule__ElementaryQuantumGate__Group__6__Impl"
    // InternalQuCircuit.g:2333:1: rule__ElementaryQuantumGate__Group__6__Impl : ( '[' ) ;
    public final void rule__ElementaryQuantumGate__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2337:1: ( ( '[' ) )
            // InternalQuCircuit.g:2338:1: ( '[' )
            {
            // InternalQuCircuit.g:2338:1: ( '[' )
            // InternalQuCircuit.g:2339:2: '['
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getLeftSquareBracketKeyword_6()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getElementaryQuantumGateAccess().getLeftSquareBracketKeyword_6()); 

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group__6__Impl"


    // $ANTLR start "rule__ElementaryQuantumGate__Group__7"
    // InternalQuCircuit.g:2348:1: rule__ElementaryQuantumGate__Group__7 : rule__ElementaryQuantumGate__Group__7__Impl rule__ElementaryQuantumGate__Group__8 ;
    public final void rule__ElementaryQuantumGate__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2352:1: ( rule__ElementaryQuantumGate__Group__7__Impl rule__ElementaryQuantumGate__Group__8 )
            // InternalQuCircuit.g:2353:2: rule__ElementaryQuantumGate__Group__7__Impl rule__ElementaryQuantumGate__Group__8
            {
            pushFollow(FOLLOW_24);
            rule__ElementaryQuantumGate__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementaryQuantumGate__Group__8();

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group__7"


    // $ANTLR start "rule__ElementaryQuantumGate__Group__7__Impl"
    // InternalQuCircuit.g:2360:1: rule__ElementaryQuantumGate__Group__7__Impl : ( '(' ) ;
    public final void rule__ElementaryQuantumGate__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2364:1: ( ( '(' ) )
            // InternalQuCircuit.g:2365:1: ( '(' )
            {
            // InternalQuCircuit.g:2365:1: ( '(' )
            // InternalQuCircuit.g:2366:2: '('
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getLeftParenthesisKeyword_7()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getElementaryQuantumGateAccess().getLeftParenthesisKeyword_7()); 

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group__7__Impl"


    // $ANTLR start "rule__ElementaryQuantumGate__Group__8"
    // InternalQuCircuit.g:2375:1: rule__ElementaryQuantumGate__Group__8 : rule__ElementaryQuantumGate__Group__8__Impl rule__ElementaryQuantumGate__Group__9 ;
    public final void rule__ElementaryQuantumGate__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2379:1: ( rule__ElementaryQuantumGate__Group__8__Impl rule__ElementaryQuantumGate__Group__9 )
            // InternalQuCircuit.g:2380:2: rule__ElementaryQuantumGate__Group__8__Impl rule__ElementaryQuantumGate__Group__9
            {
            pushFollow(FOLLOW_15);
            rule__ElementaryQuantumGate__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementaryQuantumGate__Group__9();

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group__8"


    // $ANTLR start "rule__ElementaryQuantumGate__Group__8__Impl"
    // InternalQuCircuit.g:2387:1: rule__ElementaryQuantumGate__Group__8__Impl : ( ( rule__ElementaryQuantumGate__TargetQubitsAssignment_8 ) ) ;
    public final void rule__ElementaryQuantumGate__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2391:1: ( ( ( rule__ElementaryQuantumGate__TargetQubitsAssignment_8 ) ) )
            // InternalQuCircuit.g:2392:1: ( ( rule__ElementaryQuantumGate__TargetQubitsAssignment_8 ) )
            {
            // InternalQuCircuit.g:2392:1: ( ( rule__ElementaryQuantumGate__TargetQubitsAssignment_8 ) )
            // InternalQuCircuit.g:2393:2: ( rule__ElementaryQuantumGate__TargetQubitsAssignment_8 )
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getTargetQubitsAssignment_8()); 
            // InternalQuCircuit.g:2394:2: ( rule__ElementaryQuantumGate__TargetQubitsAssignment_8 )
            // InternalQuCircuit.g:2394:3: rule__ElementaryQuantumGate__TargetQubitsAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__ElementaryQuantumGate__TargetQubitsAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getElementaryQuantumGateAccess().getTargetQubitsAssignment_8()); 

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group__8__Impl"


    // $ANTLR start "rule__ElementaryQuantumGate__Group__9"
    // InternalQuCircuit.g:2402:1: rule__ElementaryQuantumGate__Group__9 : rule__ElementaryQuantumGate__Group__9__Impl rule__ElementaryQuantumGate__Group__10 ;
    public final void rule__ElementaryQuantumGate__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2406:1: ( rule__ElementaryQuantumGate__Group__9__Impl rule__ElementaryQuantumGate__Group__10 )
            // InternalQuCircuit.g:2407:2: rule__ElementaryQuantumGate__Group__9__Impl rule__ElementaryQuantumGate__Group__10
            {
            pushFollow(FOLLOW_25);
            rule__ElementaryQuantumGate__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementaryQuantumGate__Group__10();

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group__9"


    // $ANTLR start "rule__ElementaryQuantumGate__Group__9__Impl"
    // InternalQuCircuit.g:2414:1: rule__ElementaryQuantumGate__Group__9__Impl : ( ')' ) ;
    public final void rule__ElementaryQuantumGate__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2418:1: ( ( ')' ) )
            // InternalQuCircuit.g:2419:1: ( ')' )
            {
            // InternalQuCircuit.g:2419:1: ( ')' )
            // InternalQuCircuit.g:2420:2: ')'
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getRightParenthesisKeyword_9()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getElementaryQuantumGateAccess().getRightParenthesisKeyword_9()); 

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group__9__Impl"


    // $ANTLR start "rule__ElementaryQuantumGate__Group__10"
    // InternalQuCircuit.g:2429:1: rule__ElementaryQuantumGate__Group__10 : rule__ElementaryQuantumGate__Group__10__Impl rule__ElementaryQuantumGate__Group__11 ;
    public final void rule__ElementaryQuantumGate__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2433:1: ( rule__ElementaryQuantumGate__Group__10__Impl rule__ElementaryQuantumGate__Group__11 )
            // InternalQuCircuit.g:2434:2: rule__ElementaryQuantumGate__Group__10__Impl rule__ElementaryQuantumGate__Group__11
            {
            pushFollow(FOLLOW_25);
            rule__ElementaryQuantumGate__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementaryQuantumGate__Group__11();

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group__10"


    // $ANTLR start "rule__ElementaryQuantumGate__Group__10__Impl"
    // InternalQuCircuit.g:2441:1: rule__ElementaryQuantumGate__Group__10__Impl : ( ( rule__ElementaryQuantumGate__Group_10__0 )* ) ;
    public final void rule__ElementaryQuantumGate__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2445:1: ( ( ( rule__ElementaryQuantumGate__Group_10__0 )* ) )
            // InternalQuCircuit.g:2446:1: ( ( rule__ElementaryQuantumGate__Group_10__0 )* )
            {
            // InternalQuCircuit.g:2446:1: ( ( rule__ElementaryQuantumGate__Group_10__0 )* )
            // InternalQuCircuit.g:2447:2: ( rule__ElementaryQuantumGate__Group_10__0 )*
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getGroup_10()); 
            // InternalQuCircuit.g:2448:2: ( rule__ElementaryQuantumGate__Group_10__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==26) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalQuCircuit.g:2448:3: rule__ElementaryQuantumGate__Group_10__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__ElementaryQuantumGate__Group_10__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getElementaryQuantumGateAccess().getGroup_10()); 

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group__10__Impl"


    // $ANTLR start "rule__ElementaryQuantumGate__Group__11"
    // InternalQuCircuit.g:2456:1: rule__ElementaryQuantumGate__Group__11 : rule__ElementaryQuantumGate__Group__11__Impl rule__ElementaryQuantumGate__Group__12 ;
    public final void rule__ElementaryQuantumGate__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2460:1: ( rule__ElementaryQuantumGate__Group__11__Impl rule__ElementaryQuantumGate__Group__12 )
            // InternalQuCircuit.g:2461:2: rule__ElementaryQuantumGate__Group__11__Impl rule__ElementaryQuantumGate__Group__12
            {
            pushFollow(FOLLOW_29);
            rule__ElementaryQuantumGate__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementaryQuantumGate__Group__12();

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group__11"


    // $ANTLR start "rule__ElementaryQuantumGate__Group__11__Impl"
    // InternalQuCircuit.g:2468:1: rule__ElementaryQuantumGate__Group__11__Impl : ( ']' ) ;
    public final void rule__ElementaryQuantumGate__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2472:1: ( ( ']' ) )
            // InternalQuCircuit.g:2473:1: ( ']' )
            {
            // InternalQuCircuit.g:2473:1: ( ']' )
            // InternalQuCircuit.g:2474:2: ']'
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getRightSquareBracketKeyword_11()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getElementaryQuantumGateAccess().getRightSquareBracketKeyword_11()); 

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group__11__Impl"


    // $ANTLR start "rule__ElementaryQuantumGate__Group__12"
    // InternalQuCircuit.g:2483:1: rule__ElementaryQuantumGate__Group__12 : rule__ElementaryQuantumGate__Group__12__Impl rule__ElementaryQuantumGate__Group__13 ;
    public final void rule__ElementaryQuantumGate__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2487:1: ( rule__ElementaryQuantumGate__Group__12__Impl rule__ElementaryQuantumGate__Group__13 )
            // InternalQuCircuit.g:2488:2: rule__ElementaryQuantumGate__Group__12__Impl rule__ElementaryQuantumGate__Group__13
            {
            pushFollow(FOLLOW_29);
            rule__ElementaryQuantumGate__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementaryQuantumGate__Group__13();

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group__12"


    // $ANTLR start "rule__ElementaryQuantumGate__Group__12__Impl"
    // InternalQuCircuit.g:2495:1: rule__ElementaryQuantumGate__Group__12__Impl : ( ( rule__ElementaryQuantumGate__Group_12__0 )* ) ;
    public final void rule__ElementaryQuantumGate__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2499:1: ( ( ( rule__ElementaryQuantumGate__Group_12__0 )* ) )
            // InternalQuCircuit.g:2500:1: ( ( rule__ElementaryQuantumGate__Group_12__0 )* )
            {
            // InternalQuCircuit.g:2500:1: ( ( rule__ElementaryQuantumGate__Group_12__0 )* )
            // InternalQuCircuit.g:2501:2: ( rule__ElementaryQuantumGate__Group_12__0 )*
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getGroup_12()); 
            // InternalQuCircuit.g:2502:2: ( rule__ElementaryQuantumGate__Group_12__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==33) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalQuCircuit.g:2502:3: rule__ElementaryQuantumGate__Group_12__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__ElementaryQuantumGate__Group_12__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getElementaryQuantumGateAccess().getGroup_12()); 

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group__12__Impl"


    // $ANTLR start "rule__ElementaryQuantumGate__Group__13"
    // InternalQuCircuit.g:2510:1: rule__ElementaryQuantumGate__Group__13 : rule__ElementaryQuantumGate__Group__13__Impl rule__ElementaryQuantumGate__Group__14 ;
    public final void rule__ElementaryQuantumGate__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2514:1: ( rule__ElementaryQuantumGate__Group__13__Impl rule__ElementaryQuantumGate__Group__14 )
            // InternalQuCircuit.g:2515:2: rule__ElementaryQuantumGate__Group__13__Impl rule__ElementaryQuantumGate__Group__14
            {
            pushFollow(FOLLOW_29);
            rule__ElementaryQuantumGate__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementaryQuantumGate__Group__14();

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group__13"


    // $ANTLR start "rule__ElementaryQuantumGate__Group__13__Impl"
    // InternalQuCircuit.g:2522:1: rule__ElementaryQuantumGate__Group__13__Impl : ( ( rule__ElementaryQuantumGate__Group_13__0 )? ) ;
    public final void rule__ElementaryQuantumGate__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2526:1: ( ( ( rule__ElementaryQuantumGate__Group_13__0 )? ) )
            // InternalQuCircuit.g:2527:1: ( ( rule__ElementaryQuantumGate__Group_13__0 )? )
            {
            // InternalQuCircuit.g:2527:1: ( ( rule__ElementaryQuantumGate__Group_13__0 )? )
            // InternalQuCircuit.g:2528:2: ( rule__ElementaryQuantumGate__Group_13__0 )?
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getGroup_13()); 
            // InternalQuCircuit.g:2529:2: ( rule__ElementaryQuantumGate__Group_13__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==34) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalQuCircuit.g:2529:3: rule__ElementaryQuantumGate__Group_13__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ElementaryQuantumGate__Group_13__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getElementaryQuantumGateAccess().getGroup_13()); 

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group__13__Impl"


    // $ANTLR start "rule__ElementaryQuantumGate__Group__14"
    // InternalQuCircuit.g:2537:1: rule__ElementaryQuantumGate__Group__14 : rule__ElementaryQuantumGate__Group__14__Impl ;
    public final void rule__ElementaryQuantumGate__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2541:1: ( rule__ElementaryQuantumGate__Group__14__Impl )
            // InternalQuCircuit.g:2542:2: rule__ElementaryQuantumGate__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ElementaryQuantumGate__Group__14__Impl();

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group__14"


    // $ANTLR start "rule__ElementaryQuantumGate__Group__14__Impl"
    // InternalQuCircuit.g:2548:1: rule__ElementaryQuantumGate__Group__14__Impl : ( '}' ) ;
    public final void rule__ElementaryQuantumGate__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2552:1: ( ( '}' ) )
            // InternalQuCircuit.g:2553:1: ( '}' )
            {
            // InternalQuCircuit.g:2553:1: ( '}' )
            // InternalQuCircuit.g:2554:2: '}'
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getRightCurlyBracketKeyword_14()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getElementaryQuantumGateAccess().getRightCurlyBracketKeyword_14()); 

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group__14__Impl"


    // $ANTLR start "rule__ElementaryQuantumGate__Group_4__0"
    // InternalQuCircuit.g:2564:1: rule__ElementaryQuantumGate__Group_4__0 : rule__ElementaryQuantumGate__Group_4__0__Impl rule__ElementaryQuantumGate__Group_4__1 ;
    public final void rule__ElementaryQuantumGate__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2568:1: ( rule__ElementaryQuantumGate__Group_4__0__Impl rule__ElementaryQuantumGate__Group_4__1 )
            // InternalQuCircuit.g:2569:2: rule__ElementaryQuantumGate__Group_4__0__Impl rule__ElementaryQuantumGate__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__ElementaryQuantumGate__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementaryQuantumGate__Group_4__1();

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group_4__0"


    // $ANTLR start "rule__ElementaryQuantumGate__Group_4__0__Impl"
    // InternalQuCircuit.g:2576:1: rule__ElementaryQuantumGate__Group_4__0__Impl : ( 'operation' ) ;
    public final void rule__ElementaryQuantumGate__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2580:1: ( ( 'operation' ) )
            // InternalQuCircuit.g:2581:1: ( 'operation' )
            {
            // InternalQuCircuit.g:2581:1: ( 'operation' )
            // InternalQuCircuit.g:2582:2: 'operation'
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getOperationKeyword_4_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getElementaryQuantumGateAccess().getOperationKeyword_4_0()); 

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group_4__0__Impl"


    // $ANTLR start "rule__ElementaryQuantumGate__Group_4__1"
    // InternalQuCircuit.g:2591:1: rule__ElementaryQuantumGate__Group_4__1 : rule__ElementaryQuantumGate__Group_4__1__Impl ;
    public final void rule__ElementaryQuantumGate__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2595:1: ( rule__ElementaryQuantumGate__Group_4__1__Impl )
            // InternalQuCircuit.g:2596:2: rule__ElementaryQuantumGate__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ElementaryQuantumGate__Group_4__1__Impl();

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group_4__1"


    // $ANTLR start "rule__ElementaryQuantumGate__Group_4__1__Impl"
    // InternalQuCircuit.g:2602:1: rule__ElementaryQuantumGate__Group_4__1__Impl : ( ( rule__ElementaryQuantumGate__OperationsAssignment_4_1 ) ) ;
    public final void rule__ElementaryQuantumGate__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2606:1: ( ( ( rule__ElementaryQuantumGate__OperationsAssignment_4_1 ) ) )
            // InternalQuCircuit.g:2607:1: ( ( rule__ElementaryQuantumGate__OperationsAssignment_4_1 ) )
            {
            // InternalQuCircuit.g:2607:1: ( ( rule__ElementaryQuantumGate__OperationsAssignment_4_1 ) )
            // InternalQuCircuit.g:2608:2: ( rule__ElementaryQuantumGate__OperationsAssignment_4_1 )
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getOperationsAssignment_4_1()); 
            // InternalQuCircuit.g:2609:2: ( rule__ElementaryQuantumGate__OperationsAssignment_4_1 )
            // InternalQuCircuit.g:2609:3: rule__ElementaryQuantumGate__OperationsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ElementaryQuantumGate__OperationsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getElementaryQuantumGateAccess().getOperationsAssignment_4_1()); 

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group_4__1__Impl"


    // $ANTLR start "rule__ElementaryQuantumGate__Group_10__0"
    // InternalQuCircuit.g:2618:1: rule__ElementaryQuantumGate__Group_10__0 : rule__ElementaryQuantumGate__Group_10__0__Impl rule__ElementaryQuantumGate__Group_10__1 ;
    public final void rule__ElementaryQuantumGate__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2622:1: ( rule__ElementaryQuantumGate__Group_10__0__Impl rule__ElementaryQuantumGate__Group_10__1 )
            // InternalQuCircuit.g:2623:2: rule__ElementaryQuantumGate__Group_10__0__Impl rule__ElementaryQuantumGate__Group_10__1
            {
            pushFollow(FOLLOW_14);
            rule__ElementaryQuantumGate__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementaryQuantumGate__Group_10__1();

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group_10__0"


    // $ANTLR start "rule__ElementaryQuantumGate__Group_10__0__Impl"
    // InternalQuCircuit.g:2630:1: rule__ElementaryQuantumGate__Group_10__0__Impl : ( ',' ) ;
    public final void rule__ElementaryQuantumGate__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2634:1: ( ( ',' ) )
            // InternalQuCircuit.g:2635:1: ( ',' )
            {
            // InternalQuCircuit.g:2635:1: ( ',' )
            // InternalQuCircuit.g:2636:2: ','
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getCommaKeyword_10_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getElementaryQuantumGateAccess().getCommaKeyword_10_0()); 

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group_10__0__Impl"


    // $ANTLR start "rule__ElementaryQuantumGate__Group_10__1"
    // InternalQuCircuit.g:2645:1: rule__ElementaryQuantumGate__Group_10__1 : rule__ElementaryQuantumGate__Group_10__1__Impl rule__ElementaryQuantumGate__Group_10__2 ;
    public final void rule__ElementaryQuantumGate__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2649:1: ( rule__ElementaryQuantumGate__Group_10__1__Impl rule__ElementaryQuantumGate__Group_10__2 )
            // InternalQuCircuit.g:2650:2: rule__ElementaryQuantumGate__Group_10__1__Impl rule__ElementaryQuantumGate__Group_10__2
            {
            pushFollow(FOLLOW_24);
            rule__ElementaryQuantumGate__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementaryQuantumGate__Group_10__2();

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group_10__1"


    // $ANTLR start "rule__ElementaryQuantumGate__Group_10__1__Impl"
    // InternalQuCircuit.g:2657:1: rule__ElementaryQuantumGate__Group_10__1__Impl : ( '(' ) ;
    public final void rule__ElementaryQuantumGate__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2661:1: ( ( '(' ) )
            // InternalQuCircuit.g:2662:1: ( '(' )
            {
            // InternalQuCircuit.g:2662:1: ( '(' )
            // InternalQuCircuit.g:2663:2: '('
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getLeftParenthesisKeyword_10_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getElementaryQuantumGateAccess().getLeftParenthesisKeyword_10_1()); 

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group_10__1__Impl"


    // $ANTLR start "rule__ElementaryQuantumGate__Group_10__2"
    // InternalQuCircuit.g:2672:1: rule__ElementaryQuantumGate__Group_10__2 : rule__ElementaryQuantumGate__Group_10__2__Impl rule__ElementaryQuantumGate__Group_10__3 ;
    public final void rule__ElementaryQuantumGate__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2676:1: ( rule__ElementaryQuantumGate__Group_10__2__Impl rule__ElementaryQuantumGate__Group_10__3 )
            // InternalQuCircuit.g:2677:2: rule__ElementaryQuantumGate__Group_10__2__Impl rule__ElementaryQuantumGate__Group_10__3
            {
            pushFollow(FOLLOW_15);
            rule__ElementaryQuantumGate__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementaryQuantumGate__Group_10__3();

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group_10__2"


    // $ANTLR start "rule__ElementaryQuantumGate__Group_10__2__Impl"
    // InternalQuCircuit.g:2684:1: rule__ElementaryQuantumGate__Group_10__2__Impl : ( ( rule__ElementaryQuantumGate__TargetQubitsAssignment_10_2 ) ) ;
    public final void rule__ElementaryQuantumGate__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2688:1: ( ( ( rule__ElementaryQuantumGate__TargetQubitsAssignment_10_2 ) ) )
            // InternalQuCircuit.g:2689:1: ( ( rule__ElementaryQuantumGate__TargetQubitsAssignment_10_2 ) )
            {
            // InternalQuCircuit.g:2689:1: ( ( rule__ElementaryQuantumGate__TargetQubitsAssignment_10_2 ) )
            // InternalQuCircuit.g:2690:2: ( rule__ElementaryQuantumGate__TargetQubitsAssignment_10_2 )
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getTargetQubitsAssignment_10_2()); 
            // InternalQuCircuit.g:2691:2: ( rule__ElementaryQuantumGate__TargetQubitsAssignment_10_2 )
            // InternalQuCircuit.g:2691:3: rule__ElementaryQuantumGate__TargetQubitsAssignment_10_2
            {
            pushFollow(FOLLOW_2);
            rule__ElementaryQuantumGate__TargetQubitsAssignment_10_2();

            state._fsp--;


            }

             after(grammarAccess.getElementaryQuantumGateAccess().getTargetQubitsAssignment_10_2()); 

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group_10__2__Impl"


    // $ANTLR start "rule__ElementaryQuantumGate__Group_10__3"
    // InternalQuCircuit.g:2699:1: rule__ElementaryQuantumGate__Group_10__3 : rule__ElementaryQuantumGate__Group_10__3__Impl ;
    public final void rule__ElementaryQuantumGate__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2703:1: ( rule__ElementaryQuantumGate__Group_10__3__Impl )
            // InternalQuCircuit.g:2704:2: rule__ElementaryQuantumGate__Group_10__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ElementaryQuantumGate__Group_10__3__Impl();

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group_10__3"


    // $ANTLR start "rule__ElementaryQuantumGate__Group_10__3__Impl"
    // InternalQuCircuit.g:2710:1: rule__ElementaryQuantumGate__Group_10__3__Impl : ( ')' ) ;
    public final void rule__ElementaryQuantumGate__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2714:1: ( ( ')' ) )
            // InternalQuCircuit.g:2715:1: ( ')' )
            {
            // InternalQuCircuit.g:2715:1: ( ')' )
            // InternalQuCircuit.g:2716:2: ')'
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getRightParenthesisKeyword_10_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getElementaryQuantumGateAccess().getRightParenthesisKeyword_10_3()); 

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group_10__3__Impl"


    // $ANTLR start "rule__ElementaryQuantumGate__Group_12__0"
    // InternalQuCircuit.g:2726:1: rule__ElementaryQuantumGate__Group_12__0 : rule__ElementaryQuantumGate__Group_12__0__Impl rule__ElementaryQuantumGate__Group_12__1 ;
    public final void rule__ElementaryQuantumGate__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2730:1: ( rule__ElementaryQuantumGate__Group_12__0__Impl rule__ElementaryQuantumGate__Group_12__1 )
            // InternalQuCircuit.g:2731:2: rule__ElementaryQuantumGate__Group_12__0__Impl rule__ElementaryQuantumGate__Group_12__1
            {
            pushFollow(FOLLOW_23);
            rule__ElementaryQuantumGate__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementaryQuantumGate__Group_12__1();

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group_12__0"


    // $ANTLR start "rule__ElementaryQuantumGate__Group_12__0__Impl"
    // InternalQuCircuit.g:2738:1: rule__ElementaryQuantumGate__Group_12__0__Impl : ( 'controlQubits' ) ;
    public final void rule__ElementaryQuantumGate__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2742:1: ( ( 'controlQubits' ) )
            // InternalQuCircuit.g:2743:1: ( 'controlQubits' )
            {
            // InternalQuCircuit.g:2743:1: ( 'controlQubits' )
            // InternalQuCircuit.g:2744:2: 'controlQubits'
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getControlQubitsKeyword_12_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getElementaryQuantumGateAccess().getControlQubitsKeyword_12_0()); 

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group_12__0__Impl"


    // $ANTLR start "rule__ElementaryQuantumGate__Group_12__1"
    // InternalQuCircuit.g:2753:1: rule__ElementaryQuantumGate__Group_12__1 : rule__ElementaryQuantumGate__Group_12__1__Impl rule__ElementaryQuantumGate__Group_12__2 ;
    public final void rule__ElementaryQuantumGate__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2757:1: ( rule__ElementaryQuantumGate__Group_12__1__Impl rule__ElementaryQuantumGate__Group_12__2 )
            // InternalQuCircuit.g:2758:2: rule__ElementaryQuantumGate__Group_12__1__Impl rule__ElementaryQuantumGate__Group_12__2
            {
            pushFollow(FOLLOW_24);
            rule__ElementaryQuantumGate__Group_12__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementaryQuantumGate__Group_12__2();

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group_12__1"


    // $ANTLR start "rule__ElementaryQuantumGate__Group_12__1__Impl"
    // InternalQuCircuit.g:2765:1: rule__ElementaryQuantumGate__Group_12__1__Impl : ( '[' ) ;
    public final void rule__ElementaryQuantumGate__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2769:1: ( ( '[' ) )
            // InternalQuCircuit.g:2770:1: ( '[' )
            {
            // InternalQuCircuit.g:2770:1: ( '[' )
            // InternalQuCircuit.g:2771:2: '['
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getLeftSquareBracketKeyword_12_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getElementaryQuantumGateAccess().getLeftSquareBracketKeyword_12_1()); 

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group_12__1__Impl"


    // $ANTLR start "rule__ElementaryQuantumGate__Group_12__2"
    // InternalQuCircuit.g:2780:1: rule__ElementaryQuantumGate__Group_12__2 : rule__ElementaryQuantumGate__Group_12__2__Impl rule__ElementaryQuantumGate__Group_12__3 ;
    public final void rule__ElementaryQuantumGate__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2784:1: ( rule__ElementaryQuantumGate__Group_12__2__Impl rule__ElementaryQuantumGate__Group_12__3 )
            // InternalQuCircuit.g:2785:2: rule__ElementaryQuantumGate__Group_12__2__Impl rule__ElementaryQuantumGate__Group_12__3
            {
            pushFollow(FOLLOW_25);
            rule__ElementaryQuantumGate__Group_12__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementaryQuantumGate__Group_12__3();

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group_12__2"


    // $ANTLR start "rule__ElementaryQuantumGate__Group_12__2__Impl"
    // InternalQuCircuit.g:2792:1: rule__ElementaryQuantumGate__Group_12__2__Impl : ( ( rule__ElementaryQuantumGate__ControlQubitsAssignment_12_2 ) ) ;
    public final void rule__ElementaryQuantumGate__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2796:1: ( ( ( rule__ElementaryQuantumGate__ControlQubitsAssignment_12_2 ) ) )
            // InternalQuCircuit.g:2797:1: ( ( rule__ElementaryQuantumGate__ControlQubitsAssignment_12_2 ) )
            {
            // InternalQuCircuit.g:2797:1: ( ( rule__ElementaryQuantumGate__ControlQubitsAssignment_12_2 ) )
            // InternalQuCircuit.g:2798:2: ( rule__ElementaryQuantumGate__ControlQubitsAssignment_12_2 )
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getControlQubitsAssignment_12_2()); 
            // InternalQuCircuit.g:2799:2: ( rule__ElementaryQuantumGate__ControlQubitsAssignment_12_2 )
            // InternalQuCircuit.g:2799:3: rule__ElementaryQuantumGate__ControlQubitsAssignment_12_2
            {
            pushFollow(FOLLOW_2);
            rule__ElementaryQuantumGate__ControlQubitsAssignment_12_2();

            state._fsp--;


            }

             after(grammarAccess.getElementaryQuantumGateAccess().getControlQubitsAssignment_12_2()); 

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group_12__2__Impl"


    // $ANTLR start "rule__ElementaryQuantumGate__Group_12__3"
    // InternalQuCircuit.g:2807:1: rule__ElementaryQuantumGate__Group_12__3 : rule__ElementaryQuantumGate__Group_12__3__Impl rule__ElementaryQuantumGate__Group_12__4 ;
    public final void rule__ElementaryQuantumGate__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2811:1: ( rule__ElementaryQuantumGate__Group_12__3__Impl rule__ElementaryQuantumGate__Group_12__4 )
            // InternalQuCircuit.g:2812:2: rule__ElementaryQuantumGate__Group_12__3__Impl rule__ElementaryQuantumGate__Group_12__4
            {
            pushFollow(FOLLOW_25);
            rule__ElementaryQuantumGate__Group_12__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementaryQuantumGate__Group_12__4();

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group_12__3"


    // $ANTLR start "rule__ElementaryQuantumGate__Group_12__3__Impl"
    // InternalQuCircuit.g:2819:1: rule__ElementaryQuantumGate__Group_12__3__Impl : ( ( rule__ElementaryQuantumGate__Group_12_3__0 )* ) ;
    public final void rule__ElementaryQuantumGate__Group_12__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2823:1: ( ( ( rule__ElementaryQuantumGate__Group_12_3__0 )* ) )
            // InternalQuCircuit.g:2824:1: ( ( rule__ElementaryQuantumGate__Group_12_3__0 )* )
            {
            // InternalQuCircuit.g:2824:1: ( ( rule__ElementaryQuantumGate__Group_12_3__0 )* )
            // InternalQuCircuit.g:2825:2: ( rule__ElementaryQuantumGate__Group_12_3__0 )*
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getGroup_12_3()); 
            // InternalQuCircuit.g:2826:2: ( rule__ElementaryQuantumGate__Group_12_3__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==26) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalQuCircuit.g:2826:3: rule__ElementaryQuantumGate__Group_12_3__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__ElementaryQuantumGate__Group_12_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getElementaryQuantumGateAccess().getGroup_12_3()); 

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group_12__3__Impl"


    // $ANTLR start "rule__ElementaryQuantumGate__Group_12__4"
    // InternalQuCircuit.g:2834:1: rule__ElementaryQuantumGate__Group_12__4 : rule__ElementaryQuantumGate__Group_12__4__Impl ;
    public final void rule__ElementaryQuantumGate__Group_12__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2838:1: ( rule__ElementaryQuantumGate__Group_12__4__Impl )
            // InternalQuCircuit.g:2839:2: rule__ElementaryQuantumGate__Group_12__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ElementaryQuantumGate__Group_12__4__Impl();

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group_12__4"


    // $ANTLR start "rule__ElementaryQuantumGate__Group_12__4__Impl"
    // InternalQuCircuit.g:2845:1: rule__ElementaryQuantumGate__Group_12__4__Impl : ( ']' ) ;
    public final void rule__ElementaryQuantumGate__Group_12__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2849:1: ( ( ']' ) )
            // InternalQuCircuit.g:2850:1: ( ']' )
            {
            // InternalQuCircuit.g:2850:1: ( ']' )
            // InternalQuCircuit.g:2851:2: ']'
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getRightSquareBracketKeyword_12_4()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getElementaryQuantumGateAccess().getRightSquareBracketKeyword_12_4()); 

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group_12__4__Impl"


    // $ANTLR start "rule__ElementaryQuantumGate__Group_12_3__0"
    // InternalQuCircuit.g:2861:1: rule__ElementaryQuantumGate__Group_12_3__0 : rule__ElementaryQuantumGate__Group_12_3__0__Impl rule__ElementaryQuantumGate__Group_12_3__1 ;
    public final void rule__ElementaryQuantumGate__Group_12_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2865:1: ( rule__ElementaryQuantumGate__Group_12_3__0__Impl rule__ElementaryQuantumGate__Group_12_3__1 )
            // InternalQuCircuit.g:2866:2: rule__ElementaryQuantumGate__Group_12_3__0__Impl rule__ElementaryQuantumGate__Group_12_3__1
            {
            pushFollow(FOLLOW_24);
            rule__ElementaryQuantumGate__Group_12_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementaryQuantumGate__Group_12_3__1();

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group_12_3__0"


    // $ANTLR start "rule__ElementaryQuantumGate__Group_12_3__0__Impl"
    // InternalQuCircuit.g:2873:1: rule__ElementaryQuantumGate__Group_12_3__0__Impl : ( ',' ) ;
    public final void rule__ElementaryQuantumGate__Group_12_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2877:1: ( ( ',' ) )
            // InternalQuCircuit.g:2878:1: ( ',' )
            {
            // InternalQuCircuit.g:2878:1: ( ',' )
            // InternalQuCircuit.g:2879:2: ','
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getCommaKeyword_12_3_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getElementaryQuantumGateAccess().getCommaKeyword_12_3_0()); 

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group_12_3__0__Impl"


    // $ANTLR start "rule__ElementaryQuantumGate__Group_12_3__1"
    // InternalQuCircuit.g:2888:1: rule__ElementaryQuantumGate__Group_12_3__1 : rule__ElementaryQuantumGate__Group_12_3__1__Impl ;
    public final void rule__ElementaryQuantumGate__Group_12_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2892:1: ( rule__ElementaryQuantumGate__Group_12_3__1__Impl )
            // InternalQuCircuit.g:2893:2: rule__ElementaryQuantumGate__Group_12_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ElementaryQuantumGate__Group_12_3__1__Impl();

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group_12_3__1"


    // $ANTLR start "rule__ElementaryQuantumGate__Group_12_3__1__Impl"
    // InternalQuCircuit.g:2899:1: rule__ElementaryQuantumGate__Group_12_3__1__Impl : ( ( rule__ElementaryQuantumGate__ControlQubitsAssignment_12_3_1 ) ) ;
    public final void rule__ElementaryQuantumGate__Group_12_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2903:1: ( ( ( rule__ElementaryQuantumGate__ControlQubitsAssignment_12_3_1 ) ) )
            // InternalQuCircuit.g:2904:1: ( ( rule__ElementaryQuantumGate__ControlQubitsAssignment_12_3_1 ) )
            {
            // InternalQuCircuit.g:2904:1: ( ( rule__ElementaryQuantumGate__ControlQubitsAssignment_12_3_1 ) )
            // InternalQuCircuit.g:2905:2: ( rule__ElementaryQuantumGate__ControlQubitsAssignment_12_3_1 )
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getControlQubitsAssignment_12_3_1()); 
            // InternalQuCircuit.g:2906:2: ( rule__ElementaryQuantumGate__ControlQubitsAssignment_12_3_1 )
            // InternalQuCircuit.g:2906:3: rule__ElementaryQuantumGate__ControlQubitsAssignment_12_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ElementaryQuantumGate__ControlQubitsAssignment_12_3_1();

            state._fsp--;


            }

             after(grammarAccess.getElementaryQuantumGateAccess().getControlQubitsAssignment_12_3_1()); 

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group_12_3__1__Impl"


    // $ANTLR start "rule__ElementaryQuantumGate__Group_13__0"
    // InternalQuCircuit.g:2915:1: rule__ElementaryQuantumGate__Group_13__0 : rule__ElementaryQuantumGate__Group_13__0__Impl rule__ElementaryQuantumGate__Group_13__1 ;
    public final void rule__ElementaryQuantumGate__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2919:1: ( rule__ElementaryQuantumGate__Group_13__0__Impl rule__ElementaryQuantumGate__Group_13__1 )
            // InternalQuCircuit.g:2920:2: rule__ElementaryQuantumGate__Group_13__0__Impl rule__ElementaryQuantumGate__Group_13__1
            {
            pushFollow(FOLLOW_11);
            rule__ElementaryQuantumGate__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementaryQuantumGate__Group_13__1();

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group_13__0"


    // $ANTLR start "rule__ElementaryQuantumGate__Group_13__0__Impl"
    // InternalQuCircuit.g:2927:1: rule__ElementaryQuantumGate__Group_13__0__Impl : ( 'angleParameter' ) ;
    public final void rule__ElementaryQuantumGate__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2931:1: ( ( 'angleParameter' ) )
            // InternalQuCircuit.g:2932:1: ( 'angleParameter' )
            {
            // InternalQuCircuit.g:2932:1: ( 'angleParameter' )
            // InternalQuCircuit.g:2933:2: 'angleParameter'
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getAngleParameterKeyword_13_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getElementaryQuantumGateAccess().getAngleParameterKeyword_13_0()); 

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group_13__0__Impl"


    // $ANTLR start "rule__ElementaryQuantumGate__Group_13__1"
    // InternalQuCircuit.g:2942:1: rule__ElementaryQuantumGate__Group_13__1 : rule__ElementaryQuantumGate__Group_13__1__Impl ;
    public final void rule__ElementaryQuantumGate__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2946:1: ( rule__ElementaryQuantumGate__Group_13__1__Impl )
            // InternalQuCircuit.g:2947:2: rule__ElementaryQuantumGate__Group_13__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ElementaryQuantumGate__Group_13__1__Impl();

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group_13__1"


    // $ANTLR start "rule__ElementaryQuantumGate__Group_13__1__Impl"
    // InternalQuCircuit.g:2953:1: rule__ElementaryQuantumGate__Group_13__1__Impl : ( ( rule__ElementaryQuantumGate__AngleParameterAssignment_13_1 ) ) ;
    public final void rule__ElementaryQuantumGate__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2957:1: ( ( ( rule__ElementaryQuantumGate__AngleParameterAssignment_13_1 ) ) )
            // InternalQuCircuit.g:2958:1: ( ( rule__ElementaryQuantumGate__AngleParameterAssignment_13_1 ) )
            {
            // InternalQuCircuit.g:2958:1: ( ( rule__ElementaryQuantumGate__AngleParameterAssignment_13_1 ) )
            // InternalQuCircuit.g:2959:2: ( rule__ElementaryQuantumGate__AngleParameterAssignment_13_1 )
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getAngleParameterAssignment_13_1()); 
            // InternalQuCircuit.g:2960:2: ( rule__ElementaryQuantumGate__AngleParameterAssignment_13_1 )
            // InternalQuCircuit.g:2960:3: rule__ElementaryQuantumGate__AngleParameterAssignment_13_1
            {
            pushFollow(FOLLOW_2);
            rule__ElementaryQuantumGate__AngleParameterAssignment_13_1();

            state._fsp--;


            }

             after(grammarAccess.getElementaryQuantumGateAccess().getAngleParameterAssignment_13_1()); 

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
    // $ANTLR end "rule__ElementaryQuantumGate__Group_13__1__Impl"


    // $ANTLR start "rule__AngleParameter__Group__0"
    // InternalQuCircuit.g:2969:1: rule__AngleParameter__Group__0 : rule__AngleParameter__Group__0__Impl rule__AngleParameter__Group__1 ;
    public final void rule__AngleParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2973:1: ( rule__AngleParameter__Group__0__Impl rule__AngleParameter__Group__1 )
            // InternalQuCircuit.g:2974:2: rule__AngleParameter__Group__0__Impl rule__AngleParameter__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__AngleParameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AngleParameter__Group__1();

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
    // $ANTLR end "rule__AngleParameter__Group__0"


    // $ANTLR start "rule__AngleParameter__Group__0__Impl"
    // InternalQuCircuit.g:2981:1: rule__AngleParameter__Group__0__Impl : ( () ) ;
    public final void rule__AngleParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:2985:1: ( ( () ) )
            // InternalQuCircuit.g:2986:1: ( () )
            {
            // InternalQuCircuit.g:2986:1: ( () )
            // InternalQuCircuit.g:2987:2: ()
            {
             before(grammarAccess.getAngleParameterAccess().getAngleParameterAction_0()); 
            // InternalQuCircuit.g:2988:2: ()
            // InternalQuCircuit.g:2988:3: 
            {
            }

             after(grammarAccess.getAngleParameterAccess().getAngleParameterAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AngleParameter__Group__0__Impl"


    // $ANTLR start "rule__AngleParameter__Group__1"
    // InternalQuCircuit.g:2996:1: rule__AngleParameter__Group__1 : rule__AngleParameter__Group__1__Impl rule__AngleParameter__Group__2 ;
    public final void rule__AngleParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3000:1: ( rule__AngleParameter__Group__1__Impl rule__AngleParameter__Group__2 )
            // InternalQuCircuit.g:3001:2: rule__AngleParameter__Group__1__Impl rule__AngleParameter__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__AngleParameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AngleParameter__Group__2();

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
    // $ANTLR end "rule__AngleParameter__Group__1"


    // $ANTLR start "rule__AngleParameter__Group__1__Impl"
    // InternalQuCircuit.g:3008:1: rule__AngleParameter__Group__1__Impl : ( '{' ) ;
    public final void rule__AngleParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3012:1: ( ( '{' ) )
            // InternalQuCircuit.g:3013:1: ( '{' )
            {
            // InternalQuCircuit.g:3013:1: ( '{' )
            // InternalQuCircuit.g:3014:2: '{'
            {
             before(grammarAccess.getAngleParameterAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAngleParameterAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__AngleParameter__Group__1__Impl"


    // $ANTLR start "rule__AngleParameter__Group__2"
    // InternalQuCircuit.g:3023:1: rule__AngleParameter__Group__2 : rule__AngleParameter__Group__2__Impl rule__AngleParameter__Group__3 ;
    public final void rule__AngleParameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3027:1: ( rule__AngleParameter__Group__2__Impl rule__AngleParameter__Group__3 )
            // InternalQuCircuit.g:3028:2: rule__AngleParameter__Group__2__Impl rule__AngleParameter__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__AngleParameter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AngleParameter__Group__3();

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
    // $ANTLR end "rule__AngleParameter__Group__2"


    // $ANTLR start "rule__AngleParameter__Group__2__Impl"
    // InternalQuCircuit.g:3035:1: rule__AngleParameter__Group__2__Impl : ( ( rule__AngleParameter__Group_2__0 )? ) ;
    public final void rule__AngleParameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3039:1: ( ( ( rule__AngleParameter__Group_2__0 )? ) )
            // InternalQuCircuit.g:3040:1: ( ( rule__AngleParameter__Group_2__0 )? )
            {
            // InternalQuCircuit.g:3040:1: ( ( rule__AngleParameter__Group_2__0 )? )
            // InternalQuCircuit.g:3041:2: ( rule__AngleParameter__Group_2__0 )?
            {
             before(grammarAccess.getAngleParameterAccess().getGroup_2()); 
            // InternalQuCircuit.g:3042:2: ( rule__AngleParameter__Group_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==35) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalQuCircuit.g:3042:3: rule__AngleParameter__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AngleParameter__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAngleParameterAccess().getGroup_2()); 

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
    // $ANTLR end "rule__AngleParameter__Group__2__Impl"


    // $ANTLR start "rule__AngleParameter__Group__3"
    // InternalQuCircuit.g:3050:1: rule__AngleParameter__Group__3 : rule__AngleParameter__Group__3__Impl rule__AngleParameter__Group__4 ;
    public final void rule__AngleParameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3054:1: ( rule__AngleParameter__Group__3__Impl rule__AngleParameter__Group__4 )
            // InternalQuCircuit.g:3055:2: rule__AngleParameter__Group__3__Impl rule__AngleParameter__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__AngleParameter__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AngleParameter__Group__4();

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
    // $ANTLR end "rule__AngleParameter__Group__3"


    // $ANTLR start "rule__AngleParameter__Group__3__Impl"
    // InternalQuCircuit.g:3062:1: rule__AngleParameter__Group__3__Impl : ( ( rule__AngleParameter__Group_3__0 )? ) ;
    public final void rule__AngleParameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3066:1: ( ( ( rule__AngleParameter__Group_3__0 )? ) )
            // InternalQuCircuit.g:3067:1: ( ( rule__AngleParameter__Group_3__0 )? )
            {
            // InternalQuCircuit.g:3067:1: ( ( rule__AngleParameter__Group_3__0 )? )
            // InternalQuCircuit.g:3068:2: ( rule__AngleParameter__Group_3__0 )?
            {
             before(grammarAccess.getAngleParameterAccess().getGroup_3()); 
            // InternalQuCircuit.g:3069:2: ( rule__AngleParameter__Group_3__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==36) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalQuCircuit.g:3069:3: rule__AngleParameter__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AngleParameter__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAngleParameterAccess().getGroup_3()); 

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
    // $ANTLR end "rule__AngleParameter__Group__3__Impl"


    // $ANTLR start "rule__AngleParameter__Group__4"
    // InternalQuCircuit.g:3077:1: rule__AngleParameter__Group__4 : rule__AngleParameter__Group__4__Impl rule__AngleParameter__Group__5 ;
    public final void rule__AngleParameter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3081:1: ( rule__AngleParameter__Group__4__Impl rule__AngleParameter__Group__5 )
            // InternalQuCircuit.g:3082:2: rule__AngleParameter__Group__4__Impl rule__AngleParameter__Group__5
            {
            pushFollow(FOLLOW_31);
            rule__AngleParameter__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AngleParameter__Group__5();

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
    // $ANTLR end "rule__AngleParameter__Group__4"


    // $ANTLR start "rule__AngleParameter__Group__4__Impl"
    // InternalQuCircuit.g:3089:1: rule__AngleParameter__Group__4__Impl : ( ( rule__AngleParameter__Group_4__0 )? ) ;
    public final void rule__AngleParameter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3093:1: ( ( ( rule__AngleParameter__Group_4__0 )? ) )
            // InternalQuCircuit.g:3094:1: ( ( rule__AngleParameter__Group_4__0 )? )
            {
            // InternalQuCircuit.g:3094:1: ( ( rule__AngleParameter__Group_4__0 )? )
            // InternalQuCircuit.g:3095:2: ( rule__AngleParameter__Group_4__0 )?
            {
             before(grammarAccess.getAngleParameterAccess().getGroup_4()); 
            // InternalQuCircuit.g:3096:2: ( rule__AngleParameter__Group_4__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==37) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalQuCircuit.g:3096:3: rule__AngleParameter__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AngleParameter__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAngleParameterAccess().getGroup_4()); 

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
    // $ANTLR end "rule__AngleParameter__Group__4__Impl"


    // $ANTLR start "rule__AngleParameter__Group__5"
    // InternalQuCircuit.g:3104:1: rule__AngleParameter__Group__5 : rule__AngleParameter__Group__5__Impl ;
    public final void rule__AngleParameter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3108:1: ( rule__AngleParameter__Group__5__Impl )
            // InternalQuCircuit.g:3109:2: rule__AngleParameter__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AngleParameter__Group__5__Impl();

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
    // $ANTLR end "rule__AngleParameter__Group__5"


    // $ANTLR start "rule__AngleParameter__Group__5__Impl"
    // InternalQuCircuit.g:3115:1: rule__AngleParameter__Group__5__Impl : ( '}' ) ;
    public final void rule__AngleParameter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3119:1: ( ( '}' ) )
            // InternalQuCircuit.g:3120:1: ( '}' )
            {
            // InternalQuCircuit.g:3120:1: ( '}' )
            // InternalQuCircuit.g:3121:2: '}'
            {
             before(grammarAccess.getAngleParameterAccess().getRightCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getAngleParameterAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__AngleParameter__Group__5__Impl"


    // $ANTLR start "rule__AngleParameter__Group_2__0"
    // InternalQuCircuit.g:3131:1: rule__AngleParameter__Group_2__0 : rule__AngleParameter__Group_2__0__Impl rule__AngleParameter__Group_2__1 ;
    public final void rule__AngleParameter__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3135:1: ( rule__AngleParameter__Group_2__0__Impl rule__AngleParameter__Group_2__1 )
            // InternalQuCircuit.g:3136:2: rule__AngleParameter__Group_2__0__Impl rule__AngleParameter__Group_2__1
            {
            pushFollow(FOLLOW_32);
            rule__AngleParameter__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AngleParameter__Group_2__1();

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
    // $ANTLR end "rule__AngleParameter__Group_2__0"


    // $ANTLR start "rule__AngleParameter__Group_2__0__Impl"
    // InternalQuCircuit.g:3143:1: rule__AngleParameter__Group_2__0__Impl : ( 'theta' ) ;
    public final void rule__AngleParameter__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3147:1: ( ( 'theta' ) )
            // InternalQuCircuit.g:3148:1: ( 'theta' )
            {
            // InternalQuCircuit.g:3148:1: ( 'theta' )
            // InternalQuCircuit.g:3149:2: 'theta'
            {
             before(grammarAccess.getAngleParameterAccess().getThetaKeyword_2_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getAngleParameterAccess().getThetaKeyword_2_0()); 

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
    // $ANTLR end "rule__AngleParameter__Group_2__0__Impl"


    // $ANTLR start "rule__AngleParameter__Group_2__1"
    // InternalQuCircuit.g:3158:1: rule__AngleParameter__Group_2__1 : rule__AngleParameter__Group_2__1__Impl ;
    public final void rule__AngleParameter__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3162:1: ( rule__AngleParameter__Group_2__1__Impl )
            // InternalQuCircuit.g:3163:2: rule__AngleParameter__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AngleParameter__Group_2__1__Impl();

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
    // $ANTLR end "rule__AngleParameter__Group_2__1"


    // $ANTLR start "rule__AngleParameter__Group_2__1__Impl"
    // InternalQuCircuit.g:3169:1: rule__AngleParameter__Group_2__1__Impl : ( ( rule__AngleParameter__ThetaAssignment_2_1 ) ) ;
    public final void rule__AngleParameter__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3173:1: ( ( ( rule__AngleParameter__ThetaAssignment_2_1 ) ) )
            // InternalQuCircuit.g:3174:1: ( ( rule__AngleParameter__ThetaAssignment_2_1 ) )
            {
            // InternalQuCircuit.g:3174:1: ( ( rule__AngleParameter__ThetaAssignment_2_1 ) )
            // InternalQuCircuit.g:3175:2: ( rule__AngleParameter__ThetaAssignment_2_1 )
            {
             before(grammarAccess.getAngleParameterAccess().getThetaAssignment_2_1()); 
            // InternalQuCircuit.g:3176:2: ( rule__AngleParameter__ThetaAssignment_2_1 )
            // InternalQuCircuit.g:3176:3: rule__AngleParameter__ThetaAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__AngleParameter__ThetaAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAngleParameterAccess().getThetaAssignment_2_1()); 

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
    // $ANTLR end "rule__AngleParameter__Group_2__1__Impl"


    // $ANTLR start "rule__AngleParameter__Group_3__0"
    // InternalQuCircuit.g:3185:1: rule__AngleParameter__Group_3__0 : rule__AngleParameter__Group_3__0__Impl rule__AngleParameter__Group_3__1 ;
    public final void rule__AngleParameter__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3189:1: ( rule__AngleParameter__Group_3__0__Impl rule__AngleParameter__Group_3__1 )
            // InternalQuCircuit.g:3190:2: rule__AngleParameter__Group_3__0__Impl rule__AngleParameter__Group_3__1
            {
            pushFollow(FOLLOW_32);
            rule__AngleParameter__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AngleParameter__Group_3__1();

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
    // $ANTLR end "rule__AngleParameter__Group_3__0"


    // $ANTLR start "rule__AngleParameter__Group_3__0__Impl"
    // InternalQuCircuit.g:3197:1: rule__AngleParameter__Group_3__0__Impl : ( 'phi' ) ;
    public final void rule__AngleParameter__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3201:1: ( ( 'phi' ) )
            // InternalQuCircuit.g:3202:1: ( 'phi' )
            {
            // InternalQuCircuit.g:3202:1: ( 'phi' )
            // InternalQuCircuit.g:3203:2: 'phi'
            {
             before(grammarAccess.getAngleParameterAccess().getPhiKeyword_3_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getAngleParameterAccess().getPhiKeyword_3_0()); 

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
    // $ANTLR end "rule__AngleParameter__Group_3__0__Impl"


    // $ANTLR start "rule__AngleParameter__Group_3__1"
    // InternalQuCircuit.g:3212:1: rule__AngleParameter__Group_3__1 : rule__AngleParameter__Group_3__1__Impl ;
    public final void rule__AngleParameter__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3216:1: ( rule__AngleParameter__Group_3__1__Impl )
            // InternalQuCircuit.g:3217:2: rule__AngleParameter__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AngleParameter__Group_3__1__Impl();

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
    // $ANTLR end "rule__AngleParameter__Group_3__1"


    // $ANTLR start "rule__AngleParameter__Group_3__1__Impl"
    // InternalQuCircuit.g:3223:1: rule__AngleParameter__Group_3__1__Impl : ( ( rule__AngleParameter__PhiAssignment_3_1 ) ) ;
    public final void rule__AngleParameter__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3227:1: ( ( ( rule__AngleParameter__PhiAssignment_3_1 ) ) )
            // InternalQuCircuit.g:3228:1: ( ( rule__AngleParameter__PhiAssignment_3_1 ) )
            {
            // InternalQuCircuit.g:3228:1: ( ( rule__AngleParameter__PhiAssignment_3_1 ) )
            // InternalQuCircuit.g:3229:2: ( rule__AngleParameter__PhiAssignment_3_1 )
            {
             before(grammarAccess.getAngleParameterAccess().getPhiAssignment_3_1()); 
            // InternalQuCircuit.g:3230:2: ( rule__AngleParameter__PhiAssignment_3_1 )
            // InternalQuCircuit.g:3230:3: rule__AngleParameter__PhiAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__AngleParameter__PhiAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAngleParameterAccess().getPhiAssignment_3_1()); 

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
    // $ANTLR end "rule__AngleParameter__Group_3__1__Impl"


    // $ANTLR start "rule__AngleParameter__Group_4__0"
    // InternalQuCircuit.g:3239:1: rule__AngleParameter__Group_4__0 : rule__AngleParameter__Group_4__0__Impl rule__AngleParameter__Group_4__1 ;
    public final void rule__AngleParameter__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3243:1: ( rule__AngleParameter__Group_4__0__Impl rule__AngleParameter__Group_4__1 )
            // InternalQuCircuit.g:3244:2: rule__AngleParameter__Group_4__0__Impl rule__AngleParameter__Group_4__1
            {
            pushFollow(FOLLOW_32);
            rule__AngleParameter__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AngleParameter__Group_4__1();

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
    // $ANTLR end "rule__AngleParameter__Group_4__0"


    // $ANTLR start "rule__AngleParameter__Group_4__0__Impl"
    // InternalQuCircuit.g:3251:1: rule__AngleParameter__Group_4__0__Impl : ( 'lambda' ) ;
    public final void rule__AngleParameter__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3255:1: ( ( 'lambda' ) )
            // InternalQuCircuit.g:3256:1: ( 'lambda' )
            {
            // InternalQuCircuit.g:3256:1: ( 'lambda' )
            // InternalQuCircuit.g:3257:2: 'lambda'
            {
             before(grammarAccess.getAngleParameterAccess().getLambdaKeyword_4_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getAngleParameterAccess().getLambdaKeyword_4_0()); 

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
    // $ANTLR end "rule__AngleParameter__Group_4__0__Impl"


    // $ANTLR start "rule__AngleParameter__Group_4__1"
    // InternalQuCircuit.g:3266:1: rule__AngleParameter__Group_4__1 : rule__AngleParameter__Group_4__1__Impl ;
    public final void rule__AngleParameter__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3270:1: ( rule__AngleParameter__Group_4__1__Impl )
            // InternalQuCircuit.g:3271:2: rule__AngleParameter__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AngleParameter__Group_4__1__Impl();

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
    // $ANTLR end "rule__AngleParameter__Group_4__1"


    // $ANTLR start "rule__AngleParameter__Group_4__1__Impl"
    // InternalQuCircuit.g:3277:1: rule__AngleParameter__Group_4__1__Impl : ( ( rule__AngleParameter__LambdaAssignment_4_1 ) ) ;
    public final void rule__AngleParameter__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3281:1: ( ( ( rule__AngleParameter__LambdaAssignment_4_1 ) ) )
            // InternalQuCircuit.g:3282:1: ( ( rule__AngleParameter__LambdaAssignment_4_1 ) )
            {
            // InternalQuCircuit.g:3282:1: ( ( rule__AngleParameter__LambdaAssignment_4_1 ) )
            // InternalQuCircuit.g:3283:2: ( rule__AngleParameter__LambdaAssignment_4_1 )
            {
             before(grammarAccess.getAngleParameterAccess().getLambdaAssignment_4_1()); 
            // InternalQuCircuit.g:3284:2: ( rule__AngleParameter__LambdaAssignment_4_1 )
            // InternalQuCircuit.g:3284:3: rule__AngleParameter__LambdaAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__AngleParameter__LambdaAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getAngleParameterAccess().getLambdaAssignment_4_1()); 

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
    // $ANTLR end "rule__AngleParameter__Group_4__1__Impl"


    // $ANTLR start "rule__Measurement__Group__0"
    // InternalQuCircuit.g:3293:1: rule__Measurement__Group__0 : rule__Measurement__Group__0__Impl rule__Measurement__Group__1 ;
    public final void rule__Measurement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3297:1: ( rule__Measurement__Group__0__Impl rule__Measurement__Group__1 )
            // InternalQuCircuit.g:3298:2: rule__Measurement__Group__0__Impl rule__Measurement__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Measurement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Measurement__Group__1();

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
    // $ANTLR end "rule__Measurement__Group__0"


    // $ANTLR start "rule__Measurement__Group__0__Impl"
    // InternalQuCircuit.g:3305:1: rule__Measurement__Group__0__Impl : ( 'Measurement' ) ;
    public final void rule__Measurement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3309:1: ( ( 'Measurement' ) )
            // InternalQuCircuit.g:3310:1: ( 'Measurement' )
            {
            // InternalQuCircuit.g:3310:1: ( 'Measurement' )
            // InternalQuCircuit.g:3311:2: 'Measurement'
            {
             before(grammarAccess.getMeasurementAccess().getMeasurementKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getMeasurementAccess().getMeasurementKeyword_0()); 

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
    // $ANTLR end "rule__Measurement__Group__0__Impl"


    // $ANTLR start "rule__Measurement__Group__1"
    // InternalQuCircuit.g:3320:1: rule__Measurement__Group__1 : rule__Measurement__Group__1__Impl rule__Measurement__Group__2 ;
    public final void rule__Measurement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3324:1: ( rule__Measurement__Group__1__Impl rule__Measurement__Group__2 )
            // InternalQuCircuit.g:3325:2: rule__Measurement__Group__1__Impl rule__Measurement__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Measurement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Measurement__Group__2();

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
    // $ANTLR end "rule__Measurement__Group__1"


    // $ANTLR start "rule__Measurement__Group__1__Impl"
    // InternalQuCircuit.g:3332:1: rule__Measurement__Group__1__Impl : ( ( rule__Measurement__NameAssignment_1 ) ) ;
    public final void rule__Measurement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3336:1: ( ( ( rule__Measurement__NameAssignment_1 ) ) )
            // InternalQuCircuit.g:3337:1: ( ( rule__Measurement__NameAssignment_1 ) )
            {
            // InternalQuCircuit.g:3337:1: ( ( rule__Measurement__NameAssignment_1 ) )
            // InternalQuCircuit.g:3338:2: ( rule__Measurement__NameAssignment_1 )
            {
             before(grammarAccess.getMeasurementAccess().getNameAssignment_1()); 
            // InternalQuCircuit.g:3339:2: ( rule__Measurement__NameAssignment_1 )
            // InternalQuCircuit.g:3339:3: rule__Measurement__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Measurement__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMeasurementAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Measurement__Group__1__Impl"


    // $ANTLR start "rule__Measurement__Group__2"
    // InternalQuCircuit.g:3347:1: rule__Measurement__Group__2 : rule__Measurement__Group__2__Impl rule__Measurement__Group__3 ;
    public final void rule__Measurement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3351:1: ( rule__Measurement__Group__2__Impl rule__Measurement__Group__3 )
            // InternalQuCircuit.g:3352:2: rule__Measurement__Group__2__Impl rule__Measurement__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__Measurement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Measurement__Group__3();

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
    // $ANTLR end "rule__Measurement__Group__2"


    // $ANTLR start "rule__Measurement__Group__2__Impl"
    // InternalQuCircuit.g:3359:1: rule__Measurement__Group__2__Impl : ( '{' ) ;
    public final void rule__Measurement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3363:1: ( ( '{' ) )
            // InternalQuCircuit.g:3364:1: ( '{' )
            {
            // InternalQuCircuit.g:3364:1: ( '{' )
            // InternalQuCircuit.g:3365:2: '{'
            {
             before(grammarAccess.getMeasurementAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMeasurementAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Measurement__Group__2__Impl"


    // $ANTLR start "rule__Measurement__Group__3"
    // InternalQuCircuit.g:3374:1: rule__Measurement__Group__3 : rule__Measurement__Group__3__Impl rule__Measurement__Group__4 ;
    public final void rule__Measurement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3378:1: ( rule__Measurement__Group__3__Impl rule__Measurement__Group__4 )
            // InternalQuCircuit.g:3379:2: rule__Measurement__Group__3__Impl rule__Measurement__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__Measurement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Measurement__Group__4();

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
    // $ANTLR end "rule__Measurement__Group__3"


    // $ANTLR start "rule__Measurement__Group__3__Impl"
    // InternalQuCircuit.g:3386:1: rule__Measurement__Group__3__Impl : ( ( rule__Measurement__Group_3__0 )? ) ;
    public final void rule__Measurement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3390:1: ( ( ( rule__Measurement__Group_3__0 )? ) )
            // InternalQuCircuit.g:3391:1: ( ( rule__Measurement__Group_3__0 )? )
            {
            // InternalQuCircuit.g:3391:1: ( ( rule__Measurement__Group_3__0 )? )
            // InternalQuCircuit.g:3392:2: ( rule__Measurement__Group_3__0 )?
            {
             before(grammarAccess.getMeasurementAccess().getGroup_3()); 
            // InternalQuCircuit.g:3393:2: ( rule__Measurement__Group_3__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==28) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalQuCircuit.g:3393:3: rule__Measurement__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Measurement__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMeasurementAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Measurement__Group__3__Impl"


    // $ANTLR start "rule__Measurement__Group__4"
    // InternalQuCircuit.g:3401:1: rule__Measurement__Group__4 : rule__Measurement__Group__4__Impl rule__Measurement__Group__5 ;
    public final void rule__Measurement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3405:1: ( rule__Measurement__Group__4__Impl rule__Measurement__Group__5 )
            // InternalQuCircuit.g:3406:2: rule__Measurement__Group__4__Impl rule__Measurement__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__Measurement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Measurement__Group__5();

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
    // $ANTLR end "rule__Measurement__Group__4"


    // $ANTLR start "rule__Measurement__Group__4__Impl"
    // InternalQuCircuit.g:3413:1: rule__Measurement__Group__4__Impl : ( 'targetQubits' ) ;
    public final void rule__Measurement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3417:1: ( ( 'targetQubits' ) )
            // InternalQuCircuit.g:3418:1: ( 'targetQubits' )
            {
            // InternalQuCircuit.g:3418:1: ( 'targetQubits' )
            // InternalQuCircuit.g:3419:2: 'targetQubits'
            {
             before(grammarAccess.getMeasurementAccess().getTargetQubitsKeyword_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getMeasurementAccess().getTargetQubitsKeyword_4()); 

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
    // $ANTLR end "rule__Measurement__Group__4__Impl"


    // $ANTLR start "rule__Measurement__Group__5"
    // InternalQuCircuit.g:3428:1: rule__Measurement__Group__5 : rule__Measurement__Group__5__Impl rule__Measurement__Group__6 ;
    public final void rule__Measurement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3432:1: ( rule__Measurement__Group__5__Impl rule__Measurement__Group__6 )
            // InternalQuCircuit.g:3433:2: rule__Measurement__Group__5__Impl rule__Measurement__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__Measurement__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Measurement__Group__6();

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
    // $ANTLR end "rule__Measurement__Group__5"


    // $ANTLR start "rule__Measurement__Group__5__Impl"
    // InternalQuCircuit.g:3440:1: rule__Measurement__Group__5__Impl : ( '[' ) ;
    public final void rule__Measurement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3444:1: ( ( '[' ) )
            // InternalQuCircuit.g:3445:1: ( '[' )
            {
            // InternalQuCircuit.g:3445:1: ( '[' )
            // InternalQuCircuit.g:3446:2: '['
            {
             before(grammarAccess.getMeasurementAccess().getLeftSquareBracketKeyword_5()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getMeasurementAccess().getLeftSquareBracketKeyword_5()); 

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
    // $ANTLR end "rule__Measurement__Group__5__Impl"


    // $ANTLR start "rule__Measurement__Group__6"
    // InternalQuCircuit.g:3455:1: rule__Measurement__Group__6 : rule__Measurement__Group__6__Impl rule__Measurement__Group__7 ;
    public final void rule__Measurement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3459:1: ( rule__Measurement__Group__6__Impl rule__Measurement__Group__7 )
            // InternalQuCircuit.g:3460:2: rule__Measurement__Group__6__Impl rule__Measurement__Group__7
            {
            pushFollow(FOLLOW_24);
            rule__Measurement__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Measurement__Group__7();

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
    // $ANTLR end "rule__Measurement__Group__6"


    // $ANTLR start "rule__Measurement__Group__6__Impl"
    // InternalQuCircuit.g:3467:1: rule__Measurement__Group__6__Impl : ( '(' ) ;
    public final void rule__Measurement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3471:1: ( ( '(' ) )
            // InternalQuCircuit.g:3472:1: ( '(' )
            {
            // InternalQuCircuit.g:3472:1: ( '(' )
            // InternalQuCircuit.g:3473:2: '('
            {
             before(grammarAccess.getMeasurementAccess().getLeftParenthesisKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMeasurementAccess().getLeftParenthesisKeyword_6()); 

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
    // $ANTLR end "rule__Measurement__Group__6__Impl"


    // $ANTLR start "rule__Measurement__Group__7"
    // InternalQuCircuit.g:3482:1: rule__Measurement__Group__7 : rule__Measurement__Group__7__Impl rule__Measurement__Group__8 ;
    public final void rule__Measurement__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3486:1: ( rule__Measurement__Group__7__Impl rule__Measurement__Group__8 )
            // InternalQuCircuit.g:3487:2: rule__Measurement__Group__7__Impl rule__Measurement__Group__8
            {
            pushFollow(FOLLOW_15);
            rule__Measurement__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Measurement__Group__8();

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
    // $ANTLR end "rule__Measurement__Group__7"


    // $ANTLR start "rule__Measurement__Group__7__Impl"
    // InternalQuCircuit.g:3494:1: rule__Measurement__Group__7__Impl : ( ( rule__Measurement__TargetQubitsAssignment_7 ) ) ;
    public final void rule__Measurement__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3498:1: ( ( ( rule__Measurement__TargetQubitsAssignment_7 ) ) )
            // InternalQuCircuit.g:3499:1: ( ( rule__Measurement__TargetQubitsAssignment_7 ) )
            {
            // InternalQuCircuit.g:3499:1: ( ( rule__Measurement__TargetQubitsAssignment_7 ) )
            // InternalQuCircuit.g:3500:2: ( rule__Measurement__TargetQubitsAssignment_7 )
            {
             before(grammarAccess.getMeasurementAccess().getTargetQubitsAssignment_7()); 
            // InternalQuCircuit.g:3501:2: ( rule__Measurement__TargetQubitsAssignment_7 )
            // InternalQuCircuit.g:3501:3: rule__Measurement__TargetQubitsAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Measurement__TargetQubitsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getMeasurementAccess().getTargetQubitsAssignment_7()); 

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
    // $ANTLR end "rule__Measurement__Group__7__Impl"


    // $ANTLR start "rule__Measurement__Group__8"
    // InternalQuCircuit.g:3509:1: rule__Measurement__Group__8 : rule__Measurement__Group__8__Impl rule__Measurement__Group__9 ;
    public final void rule__Measurement__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3513:1: ( rule__Measurement__Group__8__Impl rule__Measurement__Group__9 )
            // InternalQuCircuit.g:3514:2: rule__Measurement__Group__8__Impl rule__Measurement__Group__9
            {
            pushFollow(FOLLOW_25);
            rule__Measurement__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Measurement__Group__9();

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
    // $ANTLR end "rule__Measurement__Group__8"


    // $ANTLR start "rule__Measurement__Group__8__Impl"
    // InternalQuCircuit.g:3521:1: rule__Measurement__Group__8__Impl : ( ')' ) ;
    public final void rule__Measurement__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3525:1: ( ( ')' ) )
            // InternalQuCircuit.g:3526:1: ( ')' )
            {
            // InternalQuCircuit.g:3526:1: ( ')' )
            // InternalQuCircuit.g:3527:2: ')'
            {
             before(grammarAccess.getMeasurementAccess().getRightParenthesisKeyword_8()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMeasurementAccess().getRightParenthesisKeyword_8()); 

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
    // $ANTLR end "rule__Measurement__Group__8__Impl"


    // $ANTLR start "rule__Measurement__Group__9"
    // InternalQuCircuit.g:3536:1: rule__Measurement__Group__9 : rule__Measurement__Group__9__Impl rule__Measurement__Group__10 ;
    public final void rule__Measurement__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3540:1: ( rule__Measurement__Group__9__Impl rule__Measurement__Group__10 )
            // InternalQuCircuit.g:3541:2: rule__Measurement__Group__9__Impl rule__Measurement__Group__10
            {
            pushFollow(FOLLOW_25);
            rule__Measurement__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Measurement__Group__10();

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
    // $ANTLR end "rule__Measurement__Group__9"


    // $ANTLR start "rule__Measurement__Group__9__Impl"
    // InternalQuCircuit.g:3548:1: rule__Measurement__Group__9__Impl : ( ( rule__Measurement__Group_9__0 )* ) ;
    public final void rule__Measurement__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3552:1: ( ( ( rule__Measurement__Group_9__0 )* ) )
            // InternalQuCircuit.g:3553:1: ( ( rule__Measurement__Group_9__0 )* )
            {
            // InternalQuCircuit.g:3553:1: ( ( rule__Measurement__Group_9__0 )* )
            // InternalQuCircuit.g:3554:2: ( rule__Measurement__Group_9__0 )*
            {
             before(grammarAccess.getMeasurementAccess().getGroup_9()); 
            // InternalQuCircuit.g:3555:2: ( rule__Measurement__Group_9__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==26) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalQuCircuit.g:3555:3: rule__Measurement__Group_9__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Measurement__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getMeasurementAccess().getGroup_9()); 

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
    // $ANTLR end "rule__Measurement__Group__9__Impl"


    // $ANTLR start "rule__Measurement__Group__10"
    // InternalQuCircuit.g:3563:1: rule__Measurement__Group__10 : rule__Measurement__Group__10__Impl rule__Measurement__Group__11 ;
    public final void rule__Measurement__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3567:1: ( rule__Measurement__Group__10__Impl rule__Measurement__Group__11 )
            // InternalQuCircuit.g:3568:2: rule__Measurement__Group__10__Impl rule__Measurement__Group__11
            {
            pushFollow(FOLLOW_33);
            rule__Measurement__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Measurement__Group__11();

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
    // $ANTLR end "rule__Measurement__Group__10"


    // $ANTLR start "rule__Measurement__Group__10__Impl"
    // InternalQuCircuit.g:3575:1: rule__Measurement__Group__10__Impl : ( ']' ) ;
    public final void rule__Measurement__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3579:1: ( ( ']' ) )
            // InternalQuCircuit.g:3580:1: ( ']' )
            {
            // InternalQuCircuit.g:3580:1: ( ']' )
            // InternalQuCircuit.g:3581:2: ']'
            {
             before(grammarAccess.getMeasurementAccess().getRightSquareBracketKeyword_10()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getMeasurementAccess().getRightSquareBracketKeyword_10()); 

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
    // $ANTLR end "rule__Measurement__Group__10__Impl"


    // $ANTLR start "rule__Measurement__Group__11"
    // InternalQuCircuit.g:3590:1: rule__Measurement__Group__11 : rule__Measurement__Group__11__Impl rule__Measurement__Group__12 ;
    public final void rule__Measurement__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3594:1: ( rule__Measurement__Group__11__Impl rule__Measurement__Group__12 )
            // InternalQuCircuit.g:3595:2: rule__Measurement__Group__11__Impl rule__Measurement__Group__12
            {
            pushFollow(FOLLOW_23);
            rule__Measurement__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Measurement__Group__12();

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
    // $ANTLR end "rule__Measurement__Group__11"


    // $ANTLR start "rule__Measurement__Group__11__Impl"
    // InternalQuCircuit.g:3602:1: rule__Measurement__Group__11__Impl : ( 'classicBits' ) ;
    public final void rule__Measurement__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3606:1: ( ( 'classicBits' ) )
            // InternalQuCircuit.g:3607:1: ( 'classicBits' )
            {
            // InternalQuCircuit.g:3607:1: ( 'classicBits' )
            // InternalQuCircuit.g:3608:2: 'classicBits'
            {
             before(grammarAccess.getMeasurementAccess().getClassicBitsKeyword_11()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getMeasurementAccess().getClassicBitsKeyword_11()); 

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
    // $ANTLR end "rule__Measurement__Group__11__Impl"


    // $ANTLR start "rule__Measurement__Group__12"
    // InternalQuCircuit.g:3617:1: rule__Measurement__Group__12 : rule__Measurement__Group__12__Impl rule__Measurement__Group__13 ;
    public final void rule__Measurement__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3621:1: ( rule__Measurement__Group__12__Impl rule__Measurement__Group__13 )
            // InternalQuCircuit.g:3622:2: rule__Measurement__Group__12__Impl rule__Measurement__Group__13
            {
            pushFollow(FOLLOW_14);
            rule__Measurement__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Measurement__Group__13();

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
    // $ANTLR end "rule__Measurement__Group__12"


    // $ANTLR start "rule__Measurement__Group__12__Impl"
    // InternalQuCircuit.g:3629:1: rule__Measurement__Group__12__Impl : ( '[' ) ;
    public final void rule__Measurement__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3633:1: ( ( '[' ) )
            // InternalQuCircuit.g:3634:1: ( '[' )
            {
            // InternalQuCircuit.g:3634:1: ( '[' )
            // InternalQuCircuit.g:3635:2: '['
            {
             before(grammarAccess.getMeasurementAccess().getLeftSquareBracketKeyword_12()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getMeasurementAccess().getLeftSquareBracketKeyword_12()); 

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
    // $ANTLR end "rule__Measurement__Group__12__Impl"


    // $ANTLR start "rule__Measurement__Group__13"
    // InternalQuCircuit.g:3644:1: rule__Measurement__Group__13 : rule__Measurement__Group__13__Impl rule__Measurement__Group__14 ;
    public final void rule__Measurement__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3648:1: ( rule__Measurement__Group__13__Impl rule__Measurement__Group__14 )
            // InternalQuCircuit.g:3649:2: rule__Measurement__Group__13__Impl rule__Measurement__Group__14
            {
            pushFollow(FOLLOW_24);
            rule__Measurement__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Measurement__Group__14();

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
    // $ANTLR end "rule__Measurement__Group__13"


    // $ANTLR start "rule__Measurement__Group__13__Impl"
    // InternalQuCircuit.g:3656:1: rule__Measurement__Group__13__Impl : ( '(' ) ;
    public final void rule__Measurement__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3660:1: ( ( '(' ) )
            // InternalQuCircuit.g:3661:1: ( '(' )
            {
            // InternalQuCircuit.g:3661:1: ( '(' )
            // InternalQuCircuit.g:3662:2: '('
            {
             before(grammarAccess.getMeasurementAccess().getLeftParenthesisKeyword_13()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMeasurementAccess().getLeftParenthesisKeyword_13()); 

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
    // $ANTLR end "rule__Measurement__Group__13__Impl"


    // $ANTLR start "rule__Measurement__Group__14"
    // InternalQuCircuit.g:3671:1: rule__Measurement__Group__14 : rule__Measurement__Group__14__Impl rule__Measurement__Group__15 ;
    public final void rule__Measurement__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3675:1: ( rule__Measurement__Group__14__Impl rule__Measurement__Group__15 )
            // InternalQuCircuit.g:3676:2: rule__Measurement__Group__14__Impl rule__Measurement__Group__15
            {
            pushFollow(FOLLOW_15);
            rule__Measurement__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Measurement__Group__15();

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
    // $ANTLR end "rule__Measurement__Group__14"


    // $ANTLR start "rule__Measurement__Group__14__Impl"
    // InternalQuCircuit.g:3683:1: rule__Measurement__Group__14__Impl : ( ( rule__Measurement__ClassicBitsAssignment_14 ) ) ;
    public final void rule__Measurement__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3687:1: ( ( ( rule__Measurement__ClassicBitsAssignment_14 ) ) )
            // InternalQuCircuit.g:3688:1: ( ( rule__Measurement__ClassicBitsAssignment_14 ) )
            {
            // InternalQuCircuit.g:3688:1: ( ( rule__Measurement__ClassicBitsAssignment_14 ) )
            // InternalQuCircuit.g:3689:2: ( rule__Measurement__ClassicBitsAssignment_14 )
            {
             before(grammarAccess.getMeasurementAccess().getClassicBitsAssignment_14()); 
            // InternalQuCircuit.g:3690:2: ( rule__Measurement__ClassicBitsAssignment_14 )
            // InternalQuCircuit.g:3690:3: rule__Measurement__ClassicBitsAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__Measurement__ClassicBitsAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getMeasurementAccess().getClassicBitsAssignment_14()); 

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
    // $ANTLR end "rule__Measurement__Group__14__Impl"


    // $ANTLR start "rule__Measurement__Group__15"
    // InternalQuCircuit.g:3698:1: rule__Measurement__Group__15 : rule__Measurement__Group__15__Impl rule__Measurement__Group__16 ;
    public final void rule__Measurement__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3702:1: ( rule__Measurement__Group__15__Impl rule__Measurement__Group__16 )
            // InternalQuCircuit.g:3703:2: rule__Measurement__Group__15__Impl rule__Measurement__Group__16
            {
            pushFollow(FOLLOW_25);
            rule__Measurement__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Measurement__Group__16();

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
    // $ANTLR end "rule__Measurement__Group__15"


    // $ANTLR start "rule__Measurement__Group__15__Impl"
    // InternalQuCircuit.g:3710:1: rule__Measurement__Group__15__Impl : ( ')' ) ;
    public final void rule__Measurement__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3714:1: ( ( ')' ) )
            // InternalQuCircuit.g:3715:1: ( ')' )
            {
            // InternalQuCircuit.g:3715:1: ( ')' )
            // InternalQuCircuit.g:3716:2: ')'
            {
             before(grammarAccess.getMeasurementAccess().getRightParenthesisKeyword_15()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMeasurementAccess().getRightParenthesisKeyword_15()); 

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
    // $ANTLR end "rule__Measurement__Group__15__Impl"


    // $ANTLR start "rule__Measurement__Group__16"
    // InternalQuCircuit.g:3725:1: rule__Measurement__Group__16 : rule__Measurement__Group__16__Impl rule__Measurement__Group__17 ;
    public final void rule__Measurement__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3729:1: ( rule__Measurement__Group__16__Impl rule__Measurement__Group__17 )
            // InternalQuCircuit.g:3730:2: rule__Measurement__Group__16__Impl rule__Measurement__Group__17
            {
            pushFollow(FOLLOW_25);
            rule__Measurement__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Measurement__Group__17();

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
    // $ANTLR end "rule__Measurement__Group__16"


    // $ANTLR start "rule__Measurement__Group__16__Impl"
    // InternalQuCircuit.g:3737:1: rule__Measurement__Group__16__Impl : ( ( rule__Measurement__Group_16__0 )* ) ;
    public final void rule__Measurement__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3741:1: ( ( ( rule__Measurement__Group_16__0 )* ) )
            // InternalQuCircuit.g:3742:1: ( ( rule__Measurement__Group_16__0 )* )
            {
            // InternalQuCircuit.g:3742:1: ( ( rule__Measurement__Group_16__0 )* )
            // InternalQuCircuit.g:3743:2: ( rule__Measurement__Group_16__0 )*
            {
             before(grammarAccess.getMeasurementAccess().getGroup_16()); 
            // InternalQuCircuit.g:3744:2: ( rule__Measurement__Group_16__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==26) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalQuCircuit.g:3744:3: rule__Measurement__Group_16__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Measurement__Group_16__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getMeasurementAccess().getGroup_16()); 

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
    // $ANTLR end "rule__Measurement__Group__16__Impl"


    // $ANTLR start "rule__Measurement__Group__17"
    // InternalQuCircuit.g:3752:1: rule__Measurement__Group__17 : rule__Measurement__Group__17__Impl rule__Measurement__Group__18 ;
    public final void rule__Measurement__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3756:1: ( rule__Measurement__Group__17__Impl rule__Measurement__Group__18 )
            // InternalQuCircuit.g:3757:2: rule__Measurement__Group__17__Impl rule__Measurement__Group__18
            {
            pushFollow(FOLLOW_26);
            rule__Measurement__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Measurement__Group__18();

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
    // $ANTLR end "rule__Measurement__Group__17"


    // $ANTLR start "rule__Measurement__Group__17__Impl"
    // InternalQuCircuit.g:3764:1: rule__Measurement__Group__17__Impl : ( ']' ) ;
    public final void rule__Measurement__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3768:1: ( ( ']' ) )
            // InternalQuCircuit.g:3769:1: ( ']' )
            {
            // InternalQuCircuit.g:3769:1: ( ']' )
            // InternalQuCircuit.g:3770:2: ']'
            {
             before(grammarAccess.getMeasurementAccess().getRightSquareBracketKeyword_17()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getMeasurementAccess().getRightSquareBracketKeyword_17()); 

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
    // $ANTLR end "rule__Measurement__Group__17__Impl"


    // $ANTLR start "rule__Measurement__Group__18"
    // InternalQuCircuit.g:3779:1: rule__Measurement__Group__18 : rule__Measurement__Group__18__Impl ;
    public final void rule__Measurement__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3783:1: ( rule__Measurement__Group__18__Impl )
            // InternalQuCircuit.g:3784:2: rule__Measurement__Group__18__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Measurement__Group__18__Impl();

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
    // $ANTLR end "rule__Measurement__Group__18"


    // $ANTLR start "rule__Measurement__Group__18__Impl"
    // InternalQuCircuit.g:3790:1: rule__Measurement__Group__18__Impl : ( '}' ) ;
    public final void rule__Measurement__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3794:1: ( ( '}' ) )
            // InternalQuCircuit.g:3795:1: ( '}' )
            {
            // InternalQuCircuit.g:3795:1: ( '}' )
            // InternalQuCircuit.g:3796:2: '}'
            {
             before(grammarAccess.getMeasurementAccess().getRightCurlyBracketKeyword_18()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMeasurementAccess().getRightCurlyBracketKeyword_18()); 

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
    // $ANTLR end "rule__Measurement__Group__18__Impl"


    // $ANTLR start "rule__Measurement__Group_3__0"
    // InternalQuCircuit.g:3806:1: rule__Measurement__Group_3__0 : rule__Measurement__Group_3__0__Impl rule__Measurement__Group_3__1 ;
    public final void rule__Measurement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3810:1: ( rule__Measurement__Group_3__0__Impl rule__Measurement__Group_3__1 )
            // InternalQuCircuit.g:3811:2: rule__Measurement__Group_3__0__Impl rule__Measurement__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Measurement__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Measurement__Group_3__1();

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
    // $ANTLR end "rule__Measurement__Group_3__0"


    // $ANTLR start "rule__Measurement__Group_3__0__Impl"
    // InternalQuCircuit.g:3818:1: rule__Measurement__Group_3__0__Impl : ( 'operation' ) ;
    public final void rule__Measurement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3822:1: ( ( 'operation' ) )
            // InternalQuCircuit.g:3823:1: ( 'operation' )
            {
            // InternalQuCircuit.g:3823:1: ( 'operation' )
            // InternalQuCircuit.g:3824:2: 'operation'
            {
             before(grammarAccess.getMeasurementAccess().getOperationKeyword_3_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getMeasurementAccess().getOperationKeyword_3_0()); 

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
    // $ANTLR end "rule__Measurement__Group_3__0__Impl"


    // $ANTLR start "rule__Measurement__Group_3__1"
    // InternalQuCircuit.g:3833:1: rule__Measurement__Group_3__1 : rule__Measurement__Group_3__1__Impl ;
    public final void rule__Measurement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3837:1: ( rule__Measurement__Group_3__1__Impl )
            // InternalQuCircuit.g:3838:2: rule__Measurement__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Measurement__Group_3__1__Impl();

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
    // $ANTLR end "rule__Measurement__Group_3__1"


    // $ANTLR start "rule__Measurement__Group_3__1__Impl"
    // InternalQuCircuit.g:3844:1: rule__Measurement__Group_3__1__Impl : ( ( rule__Measurement__OperationsAssignment_3_1 ) ) ;
    public final void rule__Measurement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3848:1: ( ( ( rule__Measurement__OperationsAssignment_3_1 ) ) )
            // InternalQuCircuit.g:3849:1: ( ( rule__Measurement__OperationsAssignment_3_1 ) )
            {
            // InternalQuCircuit.g:3849:1: ( ( rule__Measurement__OperationsAssignment_3_1 ) )
            // InternalQuCircuit.g:3850:2: ( rule__Measurement__OperationsAssignment_3_1 )
            {
             before(grammarAccess.getMeasurementAccess().getOperationsAssignment_3_1()); 
            // InternalQuCircuit.g:3851:2: ( rule__Measurement__OperationsAssignment_3_1 )
            // InternalQuCircuit.g:3851:3: rule__Measurement__OperationsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Measurement__OperationsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMeasurementAccess().getOperationsAssignment_3_1()); 

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
    // $ANTLR end "rule__Measurement__Group_3__1__Impl"


    // $ANTLR start "rule__Measurement__Group_9__0"
    // InternalQuCircuit.g:3860:1: rule__Measurement__Group_9__0 : rule__Measurement__Group_9__0__Impl rule__Measurement__Group_9__1 ;
    public final void rule__Measurement__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3864:1: ( rule__Measurement__Group_9__0__Impl rule__Measurement__Group_9__1 )
            // InternalQuCircuit.g:3865:2: rule__Measurement__Group_9__0__Impl rule__Measurement__Group_9__1
            {
            pushFollow(FOLLOW_14);
            rule__Measurement__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Measurement__Group_9__1();

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
    // $ANTLR end "rule__Measurement__Group_9__0"


    // $ANTLR start "rule__Measurement__Group_9__0__Impl"
    // InternalQuCircuit.g:3872:1: rule__Measurement__Group_9__0__Impl : ( ',' ) ;
    public final void rule__Measurement__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3876:1: ( ( ',' ) )
            // InternalQuCircuit.g:3877:1: ( ',' )
            {
            // InternalQuCircuit.g:3877:1: ( ',' )
            // InternalQuCircuit.g:3878:2: ','
            {
             before(grammarAccess.getMeasurementAccess().getCommaKeyword_9_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMeasurementAccess().getCommaKeyword_9_0()); 

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
    // $ANTLR end "rule__Measurement__Group_9__0__Impl"


    // $ANTLR start "rule__Measurement__Group_9__1"
    // InternalQuCircuit.g:3887:1: rule__Measurement__Group_9__1 : rule__Measurement__Group_9__1__Impl rule__Measurement__Group_9__2 ;
    public final void rule__Measurement__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3891:1: ( rule__Measurement__Group_9__1__Impl rule__Measurement__Group_9__2 )
            // InternalQuCircuit.g:3892:2: rule__Measurement__Group_9__1__Impl rule__Measurement__Group_9__2
            {
            pushFollow(FOLLOW_24);
            rule__Measurement__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Measurement__Group_9__2();

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
    // $ANTLR end "rule__Measurement__Group_9__1"


    // $ANTLR start "rule__Measurement__Group_9__1__Impl"
    // InternalQuCircuit.g:3899:1: rule__Measurement__Group_9__1__Impl : ( '(' ) ;
    public final void rule__Measurement__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3903:1: ( ( '(' ) )
            // InternalQuCircuit.g:3904:1: ( '(' )
            {
            // InternalQuCircuit.g:3904:1: ( '(' )
            // InternalQuCircuit.g:3905:2: '('
            {
             before(grammarAccess.getMeasurementAccess().getLeftParenthesisKeyword_9_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMeasurementAccess().getLeftParenthesisKeyword_9_1()); 

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
    // $ANTLR end "rule__Measurement__Group_9__1__Impl"


    // $ANTLR start "rule__Measurement__Group_9__2"
    // InternalQuCircuit.g:3914:1: rule__Measurement__Group_9__2 : rule__Measurement__Group_9__2__Impl rule__Measurement__Group_9__3 ;
    public final void rule__Measurement__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3918:1: ( rule__Measurement__Group_9__2__Impl rule__Measurement__Group_9__3 )
            // InternalQuCircuit.g:3919:2: rule__Measurement__Group_9__2__Impl rule__Measurement__Group_9__3
            {
            pushFollow(FOLLOW_15);
            rule__Measurement__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Measurement__Group_9__3();

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
    // $ANTLR end "rule__Measurement__Group_9__2"


    // $ANTLR start "rule__Measurement__Group_9__2__Impl"
    // InternalQuCircuit.g:3926:1: rule__Measurement__Group_9__2__Impl : ( ( rule__Measurement__TargetQubitsAssignment_9_2 ) ) ;
    public final void rule__Measurement__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3930:1: ( ( ( rule__Measurement__TargetQubitsAssignment_9_2 ) ) )
            // InternalQuCircuit.g:3931:1: ( ( rule__Measurement__TargetQubitsAssignment_9_2 ) )
            {
            // InternalQuCircuit.g:3931:1: ( ( rule__Measurement__TargetQubitsAssignment_9_2 ) )
            // InternalQuCircuit.g:3932:2: ( rule__Measurement__TargetQubitsAssignment_9_2 )
            {
             before(grammarAccess.getMeasurementAccess().getTargetQubitsAssignment_9_2()); 
            // InternalQuCircuit.g:3933:2: ( rule__Measurement__TargetQubitsAssignment_9_2 )
            // InternalQuCircuit.g:3933:3: rule__Measurement__TargetQubitsAssignment_9_2
            {
            pushFollow(FOLLOW_2);
            rule__Measurement__TargetQubitsAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getMeasurementAccess().getTargetQubitsAssignment_9_2()); 

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
    // $ANTLR end "rule__Measurement__Group_9__2__Impl"


    // $ANTLR start "rule__Measurement__Group_9__3"
    // InternalQuCircuit.g:3941:1: rule__Measurement__Group_9__3 : rule__Measurement__Group_9__3__Impl ;
    public final void rule__Measurement__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3945:1: ( rule__Measurement__Group_9__3__Impl )
            // InternalQuCircuit.g:3946:2: rule__Measurement__Group_9__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Measurement__Group_9__3__Impl();

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
    // $ANTLR end "rule__Measurement__Group_9__3"


    // $ANTLR start "rule__Measurement__Group_9__3__Impl"
    // InternalQuCircuit.g:3952:1: rule__Measurement__Group_9__3__Impl : ( ')' ) ;
    public final void rule__Measurement__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3956:1: ( ( ')' ) )
            // InternalQuCircuit.g:3957:1: ( ')' )
            {
            // InternalQuCircuit.g:3957:1: ( ')' )
            // InternalQuCircuit.g:3958:2: ')'
            {
             before(grammarAccess.getMeasurementAccess().getRightParenthesisKeyword_9_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMeasurementAccess().getRightParenthesisKeyword_9_3()); 

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
    // $ANTLR end "rule__Measurement__Group_9__3__Impl"


    // $ANTLR start "rule__Measurement__Group_16__0"
    // InternalQuCircuit.g:3968:1: rule__Measurement__Group_16__0 : rule__Measurement__Group_16__0__Impl rule__Measurement__Group_16__1 ;
    public final void rule__Measurement__Group_16__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3972:1: ( rule__Measurement__Group_16__0__Impl rule__Measurement__Group_16__1 )
            // InternalQuCircuit.g:3973:2: rule__Measurement__Group_16__0__Impl rule__Measurement__Group_16__1
            {
            pushFollow(FOLLOW_14);
            rule__Measurement__Group_16__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Measurement__Group_16__1();

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
    // $ANTLR end "rule__Measurement__Group_16__0"


    // $ANTLR start "rule__Measurement__Group_16__0__Impl"
    // InternalQuCircuit.g:3980:1: rule__Measurement__Group_16__0__Impl : ( ',' ) ;
    public final void rule__Measurement__Group_16__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3984:1: ( ( ',' ) )
            // InternalQuCircuit.g:3985:1: ( ',' )
            {
            // InternalQuCircuit.g:3985:1: ( ',' )
            // InternalQuCircuit.g:3986:2: ','
            {
             before(grammarAccess.getMeasurementAccess().getCommaKeyword_16_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMeasurementAccess().getCommaKeyword_16_0()); 

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
    // $ANTLR end "rule__Measurement__Group_16__0__Impl"


    // $ANTLR start "rule__Measurement__Group_16__1"
    // InternalQuCircuit.g:3995:1: rule__Measurement__Group_16__1 : rule__Measurement__Group_16__1__Impl rule__Measurement__Group_16__2 ;
    public final void rule__Measurement__Group_16__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:3999:1: ( rule__Measurement__Group_16__1__Impl rule__Measurement__Group_16__2 )
            // InternalQuCircuit.g:4000:2: rule__Measurement__Group_16__1__Impl rule__Measurement__Group_16__2
            {
            pushFollow(FOLLOW_24);
            rule__Measurement__Group_16__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Measurement__Group_16__2();

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
    // $ANTLR end "rule__Measurement__Group_16__1"


    // $ANTLR start "rule__Measurement__Group_16__1__Impl"
    // InternalQuCircuit.g:4007:1: rule__Measurement__Group_16__1__Impl : ( '(' ) ;
    public final void rule__Measurement__Group_16__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4011:1: ( ( '(' ) )
            // InternalQuCircuit.g:4012:1: ( '(' )
            {
            // InternalQuCircuit.g:4012:1: ( '(' )
            // InternalQuCircuit.g:4013:2: '('
            {
             before(grammarAccess.getMeasurementAccess().getLeftParenthesisKeyword_16_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMeasurementAccess().getLeftParenthesisKeyword_16_1()); 

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
    // $ANTLR end "rule__Measurement__Group_16__1__Impl"


    // $ANTLR start "rule__Measurement__Group_16__2"
    // InternalQuCircuit.g:4022:1: rule__Measurement__Group_16__2 : rule__Measurement__Group_16__2__Impl rule__Measurement__Group_16__3 ;
    public final void rule__Measurement__Group_16__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4026:1: ( rule__Measurement__Group_16__2__Impl rule__Measurement__Group_16__3 )
            // InternalQuCircuit.g:4027:2: rule__Measurement__Group_16__2__Impl rule__Measurement__Group_16__3
            {
            pushFollow(FOLLOW_15);
            rule__Measurement__Group_16__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Measurement__Group_16__3();

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
    // $ANTLR end "rule__Measurement__Group_16__2"


    // $ANTLR start "rule__Measurement__Group_16__2__Impl"
    // InternalQuCircuit.g:4034:1: rule__Measurement__Group_16__2__Impl : ( ( rule__Measurement__ClassicBitsAssignment_16_2 ) ) ;
    public final void rule__Measurement__Group_16__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4038:1: ( ( ( rule__Measurement__ClassicBitsAssignment_16_2 ) ) )
            // InternalQuCircuit.g:4039:1: ( ( rule__Measurement__ClassicBitsAssignment_16_2 ) )
            {
            // InternalQuCircuit.g:4039:1: ( ( rule__Measurement__ClassicBitsAssignment_16_2 ) )
            // InternalQuCircuit.g:4040:2: ( rule__Measurement__ClassicBitsAssignment_16_2 )
            {
             before(grammarAccess.getMeasurementAccess().getClassicBitsAssignment_16_2()); 
            // InternalQuCircuit.g:4041:2: ( rule__Measurement__ClassicBitsAssignment_16_2 )
            // InternalQuCircuit.g:4041:3: rule__Measurement__ClassicBitsAssignment_16_2
            {
            pushFollow(FOLLOW_2);
            rule__Measurement__ClassicBitsAssignment_16_2();

            state._fsp--;


            }

             after(grammarAccess.getMeasurementAccess().getClassicBitsAssignment_16_2()); 

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
    // $ANTLR end "rule__Measurement__Group_16__2__Impl"


    // $ANTLR start "rule__Measurement__Group_16__3"
    // InternalQuCircuit.g:4049:1: rule__Measurement__Group_16__3 : rule__Measurement__Group_16__3__Impl ;
    public final void rule__Measurement__Group_16__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4053:1: ( rule__Measurement__Group_16__3__Impl )
            // InternalQuCircuit.g:4054:2: rule__Measurement__Group_16__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Measurement__Group_16__3__Impl();

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
    // $ANTLR end "rule__Measurement__Group_16__3"


    // $ANTLR start "rule__Measurement__Group_16__3__Impl"
    // InternalQuCircuit.g:4060:1: rule__Measurement__Group_16__3__Impl : ( ')' ) ;
    public final void rule__Measurement__Group_16__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4064:1: ( ( ')' ) )
            // InternalQuCircuit.g:4065:1: ( ')' )
            {
            // InternalQuCircuit.g:4065:1: ( ')' )
            // InternalQuCircuit.g:4066:2: ')'
            {
             before(grammarAccess.getMeasurementAccess().getRightParenthesisKeyword_16_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMeasurementAccess().getRightParenthesisKeyword_16_3()); 

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
    // $ANTLR end "rule__Measurement__Group_16__3__Impl"


    // $ANTLR start "rule__CompositeQuantumGate__Group__0"
    // InternalQuCircuit.g:4076:1: rule__CompositeQuantumGate__Group__0 : rule__CompositeQuantumGate__Group__0__Impl rule__CompositeQuantumGate__Group__1 ;
    public final void rule__CompositeQuantumGate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4080:1: ( rule__CompositeQuantumGate__Group__0__Impl rule__CompositeQuantumGate__Group__1 )
            // InternalQuCircuit.g:4081:2: rule__CompositeQuantumGate__Group__0__Impl rule__CompositeQuantumGate__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__CompositeQuantumGate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeQuantumGate__Group__1();

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
    // $ANTLR end "rule__CompositeQuantumGate__Group__0"


    // $ANTLR start "rule__CompositeQuantumGate__Group__0__Impl"
    // InternalQuCircuit.g:4088:1: rule__CompositeQuantumGate__Group__0__Impl : ( 'CompositeQuantumGate' ) ;
    public final void rule__CompositeQuantumGate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4092:1: ( ( 'CompositeQuantumGate' ) )
            // InternalQuCircuit.g:4093:1: ( 'CompositeQuantumGate' )
            {
            // InternalQuCircuit.g:4093:1: ( 'CompositeQuantumGate' )
            // InternalQuCircuit.g:4094:2: 'CompositeQuantumGate'
            {
             before(grammarAccess.getCompositeQuantumGateAccess().getCompositeQuantumGateKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getCompositeQuantumGateAccess().getCompositeQuantumGateKeyword_0()); 

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
    // $ANTLR end "rule__CompositeQuantumGate__Group__0__Impl"


    // $ANTLR start "rule__CompositeQuantumGate__Group__1"
    // InternalQuCircuit.g:4103:1: rule__CompositeQuantumGate__Group__1 : rule__CompositeQuantumGate__Group__1__Impl rule__CompositeQuantumGate__Group__2 ;
    public final void rule__CompositeQuantumGate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4107:1: ( rule__CompositeQuantumGate__Group__1__Impl rule__CompositeQuantumGate__Group__2 )
            // InternalQuCircuit.g:4108:2: rule__CompositeQuantumGate__Group__1__Impl rule__CompositeQuantumGate__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__CompositeQuantumGate__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeQuantumGate__Group__2();

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
    // $ANTLR end "rule__CompositeQuantumGate__Group__1"


    // $ANTLR start "rule__CompositeQuantumGate__Group__1__Impl"
    // InternalQuCircuit.g:4115:1: rule__CompositeQuantumGate__Group__1__Impl : ( ( rule__CompositeQuantumGate__NameAssignment_1 ) ) ;
    public final void rule__CompositeQuantumGate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4119:1: ( ( ( rule__CompositeQuantumGate__NameAssignment_1 ) ) )
            // InternalQuCircuit.g:4120:1: ( ( rule__CompositeQuantumGate__NameAssignment_1 ) )
            {
            // InternalQuCircuit.g:4120:1: ( ( rule__CompositeQuantumGate__NameAssignment_1 ) )
            // InternalQuCircuit.g:4121:2: ( rule__CompositeQuantumGate__NameAssignment_1 )
            {
             before(grammarAccess.getCompositeQuantumGateAccess().getNameAssignment_1()); 
            // InternalQuCircuit.g:4122:2: ( rule__CompositeQuantumGate__NameAssignment_1 )
            // InternalQuCircuit.g:4122:3: rule__CompositeQuantumGate__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeQuantumGate__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeQuantumGateAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__CompositeQuantumGate__Group__1__Impl"


    // $ANTLR start "rule__CompositeQuantumGate__Group__2"
    // InternalQuCircuit.g:4130:1: rule__CompositeQuantumGate__Group__2 : rule__CompositeQuantumGate__Group__2__Impl rule__CompositeQuantumGate__Group__3 ;
    public final void rule__CompositeQuantumGate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4134:1: ( rule__CompositeQuantumGate__Group__2__Impl rule__CompositeQuantumGate__Group__3 )
            // InternalQuCircuit.g:4135:2: rule__CompositeQuantumGate__Group__2__Impl rule__CompositeQuantumGate__Group__3
            {
            pushFollow(FOLLOW_34);
            rule__CompositeQuantumGate__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeQuantumGate__Group__3();

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
    // $ANTLR end "rule__CompositeQuantumGate__Group__2"


    // $ANTLR start "rule__CompositeQuantumGate__Group__2__Impl"
    // InternalQuCircuit.g:4142:1: rule__CompositeQuantumGate__Group__2__Impl : ( '{' ) ;
    public final void rule__CompositeQuantumGate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4146:1: ( ( '{' ) )
            // InternalQuCircuit.g:4147:1: ( '{' )
            {
            // InternalQuCircuit.g:4147:1: ( '{' )
            // InternalQuCircuit.g:4148:2: '{'
            {
             before(grammarAccess.getCompositeQuantumGateAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCompositeQuantumGateAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__CompositeQuantumGate__Group__2__Impl"


    // $ANTLR start "rule__CompositeQuantumGate__Group__3"
    // InternalQuCircuit.g:4157:1: rule__CompositeQuantumGate__Group__3 : rule__CompositeQuantumGate__Group__3__Impl rule__CompositeQuantumGate__Group__4 ;
    public final void rule__CompositeQuantumGate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4161:1: ( rule__CompositeQuantumGate__Group__3__Impl rule__CompositeQuantumGate__Group__4 )
            // InternalQuCircuit.g:4162:2: rule__CompositeQuantumGate__Group__3__Impl rule__CompositeQuantumGate__Group__4
            {
            pushFollow(FOLLOW_34);
            rule__CompositeQuantumGate__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeQuantumGate__Group__4();

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
    // $ANTLR end "rule__CompositeQuantumGate__Group__3"


    // $ANTLR start "rule__CompositeQuantumGate__Group__3__Impl"
    // InternalQuCircuit.g:4169:1: rule__CompositeQuantumGate__Group__3__Impl : ( ( rule__CompositeQuantumGate__InverseFormAssignment_3 )? ) ;
    public final void rule__CompositeQuantumGate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4173:1: ( ( ( rule__CompositeQuantumGate__InverseFormAssignment_3 )? ) )
            // InternalQuCircuit.g:4174:1: ( ( rule__CompositeQuantumGate__InverseFormAssignment_3 )? )
            {
            // InternalQuCircuit.g:4174:1: ( ( rule__CompositeQuantumGate__InverseFormAssignment_3 )? )
            // InternalQuCircuit.g:4175:2: ( rule__CompositeQuantumGate__InverseFormAssignment_3 )?
            {
             before(grammarAccess.getCompositeQuantumGateAccess().getInverseFormAssignment_3()); 
            // InternalQuCircuit.g:4176:2: ( rule__CompositeQuantumGate__InverseFormAssignment_3 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==56) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalQuCircuit.g:4176:3: rule__CompositeQuantumGate__InverseFormAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompositeQuantumGate__InverseFormAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompositeQuantumGateAccess().getInverseFormAssignment_3()); 

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
    // $ANTLR end "rule__CompositeQuantumGate__Group__3__Impl"


    // $ANTLR start "rule__CompositeQuantumGate__Group__4"
    // InternalQuCircuit.g:4184:1: rule__CompositeQuantumGate__Group__4 : rule__CompositeQuantumGate__Group__4__Impl rule__CompositeQuantumGate__Group__5 ;
    public final void rule__CompositeQuantumGate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4188:1: ( rule__CompositeQuantumGate__Group__4__Impl rule__CompositeQuantumGate__Group__5 )
            // InternalQuCircuit.g:4189:2: rule__CompositeQuantumGate__Group__4__Impl rule__CompositeQuantumGate__Group__5
            {
            pushFollow(FOLLOW_34);
            rule__CompositeQuantumGate__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeQuantumGate__Group__5();

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
    // $ANTLR end "rule__CompositeQuantumGate__Group__4"


    // $ANTLR start "rule__CompositeQuantumGate__Group__4__Impl"
    // InternalQuCircuit.g:4196:1: rule__CompositeQuantumGate__Group__4__Impl : ( ( rule__CompositeQuantumGate__Group_4__0 )? ) ;
    public final void rule__CompositeQuantumGate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4200:1: ( ( ( rule__CompositeQuantumGate__Group_4__0 )? ) )
            // InternalQuCircuit.g:4201:1: ( ( rule__CompositeQuantumGate__Group_4__0 )? )
            {
            // InternalQuCircuit.g:4201:1: ( ( rule__CompositeQuantumGate__Group_4__0 )? )
            // InternalQuCircuit.g:4202:2: ( rule__CompositeQuantumGate__Group_4__0 )?
            {
             before(grammarAccess.getCompositeQuantumGateAccess().getGroup_4()); 
            // InternalQuCircuit.g:4203:2: ( rule__CompositeQuantumGate__Group_4__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==28) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalQuCircuit.g:4203:3: rule__CompositeQuantumGate__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompositeQuantumGate__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompositeQuantumGateAccess().getGroup_4()); 

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
    // $ANTLR end "rule__CompositeQuantumGate__Group__4__Impl"


    // $ANTLR start "rule__CompositeQuantumGate__Group__5"
    // InternalQuCircuit.g:4211:1: rule__CompositeQuantumGate__Group__5 : rule__CompositeQuantumGate__Group__5__Impl rule__CompositeQuantumGate__Group__6 ;
    public final void rule__CompositeQuantumGate__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4215:1: ( rule__CompositeQuantumGate__Group__5__Impl rule__CompositeQuantumGate__Group__6 )
            // InternalQuCircuit.g:4216:2: rule__CompositeQuantumGate__Group__5__Impl rule__CompositeQuantumGate__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__CompositeQuantumGate__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeQuantumGate__Group__6();

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
    // $ANTLR end "rule__CompositeQuantumGate__Group__5"


    // $ANTLR start "rule__CompositeQuantumGate__Group__5__Impl"
    // InternalQuCircuit.g:4223:1: rule__CompositeQuantumGate__Group__5__Impl : ( 'targetQubits' ) ;
    public final void rule__CompositeQuantumGate__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4227:1: ( ( 'targetQubits' ) )
            // InternalQuCircuit.g:4228:1: ( 'targetQubits' )
            {
            // InternalQuCircuit.g:4228:1: ( 'targetQubits' )
            // InternalQuCircuit.g:4229:2: 'targetQubits'
            {
             before(grammarAccess.getCompositeQuantumGateAccess().getTargetQubitsKeyword_5()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getCompositeQuantumGateAccess().getTargetQubitsKeyword_5()); 

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
    // $ANTLR end "rule__CompositeQuantumGate__Group__5__Impl"


    // $ANTLR start "rule__CompositeQuantumGate__Group__6"
    // InternalQuCircuit.g:4238:1: rule__CompositeQuantumGate__Group__6 : rule__CompositeQuantumGate__Group__6__Impl rule__CompositeQuantumGate__Group__7 ;
    public final void rule__CompositeQuantumGate__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4242:1: ( rule__CompositeQuantumGate__Group__6__Impl rule__CompositeQuantumGate__Group__7 )
            // InternalQuCircuit.g:4243:2: rule__CompositeQuantumGate__Group__6__Impl rule__CompositeQuantumGate__Group__7
            {
            pushFollow(FOLLOW_14);
            rule__CompositeQuantumGate__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeQuantumGate__Group__7();

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
    // $ANTLR end "rule__CompositeQuantumGate__Group__6"


    // $ANTLR start "rule__CompositeQuantumGate__Group__6__Impl"
    // InternalQuCircuit.g:4250:1: rule__CompositeQuantumGate__Group__6__Impl : ( '[' ) ;
    public final void rule__CompositeQuantumGate__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4254:1: ( ( '[' ) )
            // InternalQuCircuit.g:4255:1: ( '[' )
            {
            // InternalQuCircuit.g:4255:1: ( '[' )
            // InternalQuCircuit.g:4256:2: '['
            {
             before(grammarAccess.getCompositeQuantumGateAccess().getLeftSquareBracketKeyword_6()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getCompositeQuantumGateAccess().getLeftSquareBracketKeyword_6()); 

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
    // $ANTLR end "rule__CompositeQuantumGate__Group__6__Impl"


    // $ANTLR start "rule__CompositeQuantumGate__Group__7"
    // InternalQuCircuit.g:4265:1: rule__CompositeQuantumGate__Group__7 : rule__CompositeQuantumGate__Group__7__Impl rule__CompositeQuantumGate__Group__8 ;
    public final void rule__CompositeQuantumGate__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4269:1: ( rule__CompositeQuantumGate__Group__7__Impl rule__CompositeQuantumGate__Group__8 )
            // InternalQuCircuit.g:4270:2: rule__CompositeQuantumGate__Group__7__Impl rule__CompositeQuantumGate__Group__8
            {
            pushFollow(FOLLOW_24);
            rule__CompositeQuantumGate__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeQuantumGate__Group__8();

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
    // $ANTLR end "rule__CompositeQuantumGate__Group__7"


    // $ANTLR start "rule__CompositeQuantumGate__Group__7__Impl"
    // InternalQuCircuit.g:4277:1: rule__CompositeQuantumGate__Group__7__Impl : ( '(' ) ;
    public final void rule__CompositeQuantumGate__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4281:1: ( ( '(' ) )
            // InternalQuCircuit.g:4282:1: ( '(' )
            {
            // InternalQuCircuit.g:4282:1: ( '(' )
            // InternalQuCircuit.g:4283:2: '('
            {
             before(grammarAccess.getCompositeQuantumGateAccess().getLeftParenthesisKeyword_7()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCompositeQuantumGateAccess().getLeftParenthesisKeyword_7()); 

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
    // $ANTLR end "rule__CompositeQuantumGate__Group__7__Impl"


    // $ANTLR start "rule__CompositeQuantumGate__Group__8"
    // InternalQuCircuit.g:4292:1: rule__CompositeQuantumGate__Group__8 : rule__CompositeQuantumGate__Group__8__Impl rule__CompositeQuantumGate__Group__9 ;
    public final void rule__CompositeQuantumGate__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4296:1: ( rule__CompositeQuantumGate__Group__8__Impl rule__CompositeQuantumGate__Group__9 )
            // InternalQuCircuit.g:4297:2: rule__CompositeQuantumGate__Group__8__Impl rule__CompositeQuantumGate__Group__9
            {
            pushFollow(FOLLOW_15);
            rule__CompositeQuantumGate__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeQuantumGate__Group__9();

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
    // $ANTLR end "rule__CompositeQuantumGate__Group__8"


    // $ANTLR start "rule__CompositeQuantumGate__Group__8__Impl"
    // InternalQuCircuit.g:4304:1: rule__CompositeQuantumGate__Group__8__Impl : ( ( rule__CompositeQuantumGate__TargetQubitsAssignment_8 ) ) ;
    public final void rule__CompositeQuantumGate__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4308:1: ( ( ( rule__CompositeQuantumGate__TargetQubitsAssignment_8 ) ) )
            // InternalQuCircuit.g:4309:1: ( ( rule__CompositeQuantumGate__TargetQubitsAssignment_8 ) )
            {
            // InternalQuCircuit.g:4309:1: ( ( rule__CompositeQuantumGate__TargetQubitsAssignment_8 ) )
            // InternalQuCircuit.g:4310:2: ( rule__CompositeQuantumGate__TargetQubitsAssignment_8 )
            {
             before(grammarAccess.getCompositeQuantumGateAccess().getTargetQubitsAssignment_8()); 
            // InternalQuCircuit.g:4311:2: ( rule__CompositeQuantumGate__TargetQubitsAssignment_8 )
            // InternalQuCircuit.g:4311:3: rule__CompositeQuantumGate__TargetQubitsAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__CompositeQuantumGate__TargetQubitsAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getCompositeQuantumGateAccess().getTargetQubitsAssignment_8()); 

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
    // $ANTLR end "rule__CompositeQuantumGate__Group__8__Impl"


    // $ANTLR start "rule__CompositeQuantumGate__Group__9"
    // InternalQuCircuit.g:4319:1: rule__CompositeQuantumGate__Group__9 : rule__CompositeQuantumGate__Group__9__Impl rule__CompositeQuantumGate__Group__10 ;
    public final void rule__CompositeQuantumGate__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4323:1: ( rule__CompositeQuantumGate__Group__9__Impl rule__CompositeQuantumGate__Group__10 )
            // InternalQuCircuit.g:4324:2: rule__CompositeQuantumGate__Group__9__Impl rule__CompositeQuantumGate__Group__10
            {
            pushFollow(FOLLOW_25);
            rule__CompositeQuantumGate__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeQuantumGate__Group__10();

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
    // $ANTLR end "rule__CompositeQuantumGate__Group__9"


    // $ANTLR start "rule__CompositeQuantumGate__Group__9__Impl"
    // InternalQuCircuit.g:4331:1: rule__CompositeQuantumGate__Group__9__Impl : ( ')' ) ;
    public final void rule__CompositeQuantumGate__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4335:1: ( ( ')' ) )
            // InternalQuCircuit.g:4336:1: ( ')' )
            {
            // InternalQuCircuit.g:4336:1: ( ')' )
            // InternalQuCircuit.g:4337:2: ')'
            {
             before(grammarAccess.getCompositeQuantumGateAccess().getRightParenthesisKeyword_9()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCompositeQuantumGateAccess().getRightParenthesisKeyword_9()); 

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
    // $ANTLR end "rule__CompositeQuantumGate__Group__9__Impl"


    // $ANTLR start "rule__CompositeQuantumGate__Group__10"
    // InternalQuCircuit.g:4346:1: rule__CompositeQuantumGate__Group__10 : rule__CompositeQuantumGate__Group__10__Impl rule__CompositeQuantumGate__Group__11 ;
    public final void rule__CompositeQuantumGate__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4350:1: ( rule__CompositeQuantumGate__Group__10__Impl rule__CompositeQuantumGate__Group__11 )
            // InternalQuCircuit.g:4351:2: rule__CompositeQuantumGate__Group__10__Impl rule__CompositeQuantumGate__Group__11
            {
            pushFollow(FOLLOW_25);
            rule__CompositeQuantumGate__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeQuantumGate__Group__11();

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
    // $ANTLR end "rule__CompositeQuantumGate__Group__10"


    // $ANTLR start "rule__CompositeQuantumGate__Group__10__Impl"
    // InternalQuCircuit.g:4358:1: rule__CompositeQuantumGate__Group__10__Impl : ( ( rule__CompositeQuantumGate__Group_10__0 )* ) ;
    public final void rule__CompositeQuantumGate__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4362:1: ( ( ( rule__CompositeQuantumGate__Group_10__0 )* ) )
            // InternalQuCircuit.g:4363:1: ( ( rule__CompositeQuantumGate__Group_10__0 )* )
            {
            // InternalQuCircuit.g:4363:1: ( ( rule__CompositeQuantumGate__Group_10__0 )* )
            // InternalQuCircuit.g:4364:2: ( rule__CompositeQuantumGate__Group_10__0 )*
            {
             before(grammarAccess.getCompositeQuantumGateAccess().getGroup_10()); 
            // InternalQuCircuit.g:4365:2: ( rule__CompositeQuantumGate__Group_10__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==26) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalQuCircuit.g:4365:3: rule__CompositeQuantumGate__Group_10__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__CompositeQuantumGate__Group_10__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getCompositeQuantumGateAccess().getGroup_10()); 

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
    // $ANTLR end "rule__CompositeQuantumGate__Group__10__Impl"


    // $ANTLR start "rule__CompositeQuantumGate__Group__11"
    // InternalQuCircuit.g:4373:1: rule__CompositeQuantumGate__Group__11 : rule__CompositeQuantumGate__Group__11__Impl rule__CompositeQuantumGate__Group__12 ;
    public final void rule__CompositeQuantumGate__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4377:1: ( rule__CompositeQuantumGate__Group__11__Impl rule__CompositeQuantumGate__Group__12 )
            // InternalQuCircuit.g:4378:2: rule__CompositeQuantumGate__Group__11__Impl rule__CompositeQuantumGate__Group__12
            {
            pushFollow(FOLLOW_35);
            rule__CompositeQuantumGate__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeQuantumGate__Group__12();

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
    // $ANTLR end "rule__CompositeQuantumGate__Group__11"


    // $ANTLR start "rule__CompositeQuantumGate__Group__11__Impl"
    // InternalQuCircuit.g:4385:1: rule__CompositeQuantumGate__Group__11__Impl : ( ']' ) ;
    public final void rule__CompositeQuantumGate__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4389:1: ( ( ']' ) )
            // InternalQuCircuit.g:4390:1: ( ']' )
            {
            // InternalQuCircuit.g:4390:1: ( ']' )
            // InternalQuCircuit.g:4391:2: ']'
            {
             before(grammarAccess.getCompositeQuantumGateAccess().getRightSquareBracketKeyword_11()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getCompositeQuantumGateAccess().getRightSquareBracketKeyword_11()); 

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
    // $ANTLR end "rule__CompositeQuantumGate__Group__11__Impl"


    // $ANTLR start "rule__CompositeQuantumGate__Group__12"
    // InternalQuCircuit.g:4400:1: rule__CompositeQuantumGate__Group__12 : rule__CompositeQuantumGate__Group__12__Impl rule__CompositeQuantumGate__Group__13 ;
    public final void rule__CompositeQuantumGate__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4404:1: ( rule__CompositeQuantumGate__Group__12__Impl rule__CompositeQuantumGate__Group__13 )
            // InternalQuCircuit.g:4405:2: rule__CompositeQuantumGate__Group__12__Impl rule__CompositeQuantumGate__Group__13
            {
            pushFollow(FOLLOW_35);
            rule__CompositeQuantumGate__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeQuantumGate__Group__13();

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
    // $ANTLR end "rule__CompositeQuantumGate__Group__12"


    // $ANTLR start "rule__CompositeQuantumGate__Group__12__Impl"
    // InternalQuCircuit.g:4412:1: rule__CompositeQuantumGate__Group__12__Impl : ( ( rule__CompositeQuantumGate__Group_12__0 )? ) ;
    public final void rule__CompositeQuantumGate__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4416:1: ( ( ( rule__CompositeQuantumGate__Group_12__0 )? ) )
            // InternalQuCircuit.g:4417:1: ( ( rule__CompositeQuantumGate__Group_12__0 )? )
            {
            // InternalQuCircuit.g:4417:1: ( ( rule__CompositeQuantumGate__Group_12__0 )? )
            // InternalQuCircuit.g:4418:2: ( rule__CompositeQuantumGate__Group_12__0 )?
            {
             before(grammarAccess.getCompositeQuantumGateAccess().getGroup_12()); 
            // InternalQuCircuit.g:4419:2: ( rule__CompositeQuantumGate__Group_12__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==33) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalQuCircuit.g:4419:3: rule__CompositeQuantumGate__Group_12__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompositeQuantumGate__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompositeQuantumGateAccess().getGroup_12()); 

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
    // $ANTLR end "rule__CompositeQuantumGate__Group__12__Impl"


    // $ANTLR start "rule__CompositeQuantumGate__Group__13"
    // InternalQuCircuit.g:4427:1: rule__CompositeQuantumGate__Group__13 : rule__CompositeQuantumGate__Group__13__Impl ;
    public final void rule__CompositeQuantumGate__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4431:1: ( rule__CompositeQuantumGate__Group__13__Impl )
            // InternalQuCircuit.g:4432:2: rule__CompositeQuantumGate__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeQuantumGate__Group__13__Impl();

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
    // $ANTLR end "rule__CompositeQuantumGate__Group__13"


    // $ANTLR start "rule__CompositeQuantumGate__Group__13__Impl"
    // InternalQuCircuit.g:4438:1: rule__CompositeQuantumGate__Group__13__Impl : ( '}' ) ;
    public final void rule__CompositeQuantumGate__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4442:1: ( ( '}' ) )
            // InternalQuCircuit.g:4443:1: ( '}' )
            {
            // InternalQuCircuit.g:4443:1: ( '}' )
            // InternalQuCircuit.g:4444:2: '}'
            {
             before(grammarAccess.getCompositeQuantumGateAccess().getRightCurlyBracketKeyword_13()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCompositeQuantumGateAccess().getRightCurlyBracketKeyword_13()); 

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
    // $ANTLR end "rule__CompositeQuantumGate__Group__13__Impl"


    // $ANTLR start "rule__CompositeQuantumGate__Group_4__0"
    // InternalQuCircuit.g:4454:1: rule__CompositeQuantumGate__Group_4__0 : rule__CompositeQuantumGate__Group_4__0__Impl rule__CompositeQuantumGate__Group_4__1 ;
    public final void rule__CompositeQuantumGate__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4458:1: ( rule__CompositeQuantumGate__Group_4__0__Impl rule__CompositeQuantumGate__Group_4__1 )
            // InternalQuCircuit.g:4459:2: rule__CompositeQuantumGate__Group_4__0__Impl rule__CompositeQuantumGate__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__CompositeQuantumGate__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeQuantumGate__Group_4__1();

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
    // $ANTLR end "rule__CompositeQuantumGate__Group_4__0"


    // $ANTLR start "rule__CompositeQuantumGate__Group_4__0__Impl"
    // InternalQuCircuit.g:4466:1: rule__CompositeQuantumGate__Group_4__0__Impl : ( 'operation' ) ;
    public final void rule__CompositeQuantumGate__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4470:1: ( ( 'operation' ) )
            // InternalQuCircuit.g:4471:1: ( 'operation' )
            {
            // InternalQuCircuit.g:4471:1: ( 'operation' )
            // InternalQuCircuit.g:4472:2: 'operation'
            {
             before(grammarAccess.getCompositeQuantumGateAccess().getOperationKeyword_4_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCompositeQuantumGateAccess().getOperationKeyword_4_0()); 

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
    // $ANTLR end "rule__CompositeQuantumGate__Group_4__0__Impl"


    // $ANTLR start "rule__CompositeQuantumGate__Group_4__1"
    // InternalQuCircuit.g:4481:1: rule__CompositeQuantumGate__Group_4__1 : rule__CompositeQuantumGate__Group_4__1__Impl ;
    public final void rule__CompositeQuantumGate__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4485:1: ( rule__CompositeQuantumGate__Group_4__1__Impl )
            // InternalQuCircuit.g:4486:2: rule__CompositeQuantumGate__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeQuantumGate__Group_4__1__Impl();

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
    // $ANTLR end "rule__CompositeQuantumGate__Group_4__1"


    // $ANTLR start "rule__CompositeQuantumGate__Group_4__1__Impl"
    // InternalQuCircuit.g:4492:1: rule__CompositeQuantumGate__Group_4__1__Impl : ( ( rule__CompositeQuantumGate__OperationsAssignment_4_1 ) ) ;
    public final void rule__CompositeQuantumGate__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4496:1: ( ( ( rule__CompositeQuantumGate__OperationsAssignment_4_1 ) ) )
            // InternalQuCircuit.g:4497:1: ( ( rule__CompositeQuantumGate__OperationsAssignment_4_1 ) )
            {
            // InternalQuCircuit.g:4497:1: ( ( rule__CompositeQuantumGate__OperationsAssignment_4_1 ) )
            // InternalQuCircuit.g:4498:2: ( rule__CompositeQuantumGate__OperationsAssignment_4_1 )
            {
             before(grammarAccess.getCompositeQuantumGateAccess().getOperationsAssignment_4_1()); 
            // InternalQuCircuit.g:4499:2: ( rule__CompositeQuantumGate__OperationsAssignment_4_1 )
            // InternalQuCircuit.g:4499:3: rule__CompositeQuantumGate__OperationsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeQuantumGate__OperationsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeQuantumGateAccess().getOperationsAssignment_4_1()); 

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
    // $ANTLR end "rule__CompositeQuantumGate__Group_4__1__Impl"


    // $ANTLR start "rule__CompositeQuantumGate__Group_10__0"
    // InternalQuCircuit.g:4508:1: rule__CompositeQuantumGate__Group_10__0 : rule__CompositeQuantumGate__Group_10__0__Impl rule__CompositeQuantumGate__Group_10__1 ;
    public final void rule__CompositeQuantumGate__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4512:1: ( rule__CompositeQuantumGate__Group_10__0__Impl rule__CompositeQuantumGate__Group_10__1 )
            // InternalQuCircuit.g:4513:2: rule__CompositeQuantumGate__Group_10__0__Impl rule__CompositeQuantumGate__Group_10__1
            {
            pushFollow(FOLLOW_14);
            rule__CompositeQuantumGate__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeQuantumGate__Group_10__1();

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
    // $ANTLR end "rule__CompositeQuantumGate__Group_10__0"


    // $ANTLR start "rule__CompositeQuantumGate__Group_10__0__Impl"
    // InternalQuCircuit.g:4520:1: rule__CompositeQuantumGate__Group_10__0__Impl : ( ',' ) ;
    public final void rule__CompositeQuantumGate__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4524:1: ( ( ',' ) )
            // InternalQuCircuit.g:4525:1: ( ',' )
            {
            // InternalQuCircuit.g:4525:1: ( ',' )
            // InternalQuCircuit.g:4526:2: ','
            {
             before(grammarAccess.getCompositeQuantumGateAccess().getCommaKeyword_10_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getCompositeQuantumGateAccess().getCommaKeyword_10_0()); 

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
    // $ANTLR end "rule__CompositeQuantumGate__Group_10__0__Impl"


    // $ANTLR start "rule__CompositeQuantumGate__Group_10__1"
    // InternalQuCircuit.g:4535:1: rule__CompositeQuantumGate__Group_10__1 : rule__CompositeQuantumGate__Group_10__1__Impl rule__CompositeQuantumGate__Group_10__2 ;
    public final void rule__CompositeQuantumGate__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4539:1: ( rule__CompositeQuantumGate__Group_10__1__Impl rule__CompositeQuantumGate__Group_10__2 )
            // InternalQuCircuit.g:4540:2: rule__CompositeQuantumGate__Group_10__1__Impl rule__CompositeQuantumGate__Group_10__2
            {
            pushFollow(FOLLOW_24);
            rule__CompositeQuantumGate__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeQuantumGate__Group_10__2();

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
    // $ANTLR end "rule__CompositeQuantumGate__Group_10__1"


    // $ANTLR start "rule__CompositeQuantumGate__Group_10__1__Impl"
    // InternalQuCircuit.g:4547:1: rule__CompositeQuantumGate__Group_10__1__Impl : ( '(' ) ;
    public final void rule__CompositeQuantumGate__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4551:1: ( ( '(' ) )
            // InternalQuCircuit.g:4552:1: ( '(' )
            {
            // InternalQuCircuit.g:4552:1: ( '(' )
            // InternalQuCircuit.g:4553:2: '('
            {
             before(grammarAccess.getCompositeQuantumGateAccess().getLeftParenthesisKeyword_10_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCompositeQuantumGateAccess().getLeftParenthesisKeyword_10_1()); 

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
    // $ANTLR end "rule__CompositeQuantumGate__Group_10__1__Impl"


    // $ANTLR start "rule__CompositeQuantumGate__Group_10__2"
    // InternalQuCircuit.g:4562:1: rule__CompositeQuantumGate__Group_10__2 : rule__CompositeQuantumGate__Group_10__2__Impl rule__CompositeQuantumGate__Group_10__3 ;
    public final void rule__CompositeQuantumGate__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4566:1: ( rule__CompositeQuantumGate__Group_10__2__Impl rule__CompositeQuantumGate__Group_10__3 )
            // InternalQuCircuit.g:4567:2: rule__CompositeQuantumGate__Group_10__2__Impl rule__CompositeQuantumGate__Group_10__3
            {
            pushFollow(FOLLOW_15);
            rule__CompositeQuantumGate__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeQuantumGate__Group_10__3();

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
    // $ANTLR end "rule__CompositeQuantumGate__Group_10__2"


    // $ANTLR start "rule__CompositeQuantumGate__Group_10__2__Impl"
    // InternalQuCircuit.g:4574:1: rule__CompositeQuantumGate__Group_10__2__Impl : ( ( rule__CompositeQuantumGate__TargetQubitsAssignment_10_2 ) ) ;
    public final void rule__CompositeQuantumGate__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4578:1: ( ( ( rule__CompositeQuantumGate__TargetQubitsAssignment_10_2 ) ) )
            // InternalQuCircuit.g:4579:1: ( ( rule__CompositeQuantumGate__TargetQubitsAssignment_10_2 ) )
            {
            // InternalQuCircuit.g:4579:1: ( ( rule__CompositeQuantumGate__TargetQubitsAssignment_10_2 ) )
            // InternalQuCircuit.g:4580:2: ( rule__CompositeQuantumGate__TargetQubitsAssignment_10_2 )
            {
             before(grammarAccess.getCompositeQuantumGateAccess().getTargetQubitsAssignment_10_2()); 
            // InternalQuCircuit.g:4581:2: ( rule__CompositeQuantumGate__TargetQubitsAssignment_10_2 )
            // InternalQuCircuit.g:4581:3: rule__CompositeQuantumGate__TargetQubitsAssignment_10_2
            {
            pushFollow(FOLLOW_2);
            rule__CompositeQuantumGate__TargetQubitsAssignment_10_2();

            state._fsp--;


            }

             after(grammarAccess.getCompositeQuantumGateAccess().getTargetQubitsAssignment_10_2()); 

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
    // $ANTLR end "rule__CompositeQuantumGate__Group_10__2__Impl"


    // $ANTLR start "rule__CompositeQuantumGate__Group_10__3"
    // InternalQuCircuit.g:4589:1: rule__CompositeQuantumGate__Group_10__3 : rule__CompositeQuantumGate__Group_10__3__Impl ;
    public final void rule__CompositeQuantumGate__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4593:1: ( rule__CompositeQuantumGate__Group_10__3__Impl )
            // InternalQuCircuit.g:4594:2: rule__CompositeQuantumGate__Group_10__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeQuantumGate__Group_10__3__Impl();

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
    // $ANTLR end "rule__CompositeQuantumGate__Group_10__3"


    // $ANTLR start "rule__CompositeQuantumGate__Group_10__3__Impl"
    // InternalQuCircuit.g:4600:1: rule__CompositeQuantumGate__Group_10__3__Impl : ( ')' ) ;
    public final void rule__CompositeQuantumGate__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4604:1: ( ( ')' ) )
            // InternalQuCircuit.g:4605:1: ( ')' )
            {
            // InternalQuCircuit.g:4605:1: ( ')' )
            // InternalQuCircuit.g:4606:2: ')'
            {
             before(grammarAccess.getCompositeQuantumGateAccess().getRightParenthesisKeyword_10_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCompositeQuantumGateAccess().getRightParenthesisKeyword_10_3()); 

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
    // $ANTLR end "rule__CompositeQuantumGate__Group_10__3__Impl"


    // $ANTLR start "rule__CompositeQuantumGate__Group_12__0"
    // InternalQuCircuit.g:4616:1: rule__CompositeQuantumGate__Group_12__0 : rule__CompositeQuantumGate__Group_12__0__Impl rule__CompositeQuantumGate__Group_12__1 ;
    public final void rule__CompositeQuantumGate__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4620:1: ( rule__CompositeQuantumGate__Group_12__0__Impl rule__CompositeQuantumGate__Group_12__1 )
            // InternalQuCircuit.g:4621:2: rule__CompositeQuantumGate__Group_12__0__Impl rule__CompositeQuantumGate__Group_12__1
            {
            pushFollow(FOLLOW_23);
            rule__CompositeQuantumGate__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeQuantumGate__Group_12__1();

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
    // $ANTLR end "rule__CompositeQuantumGate__Group_12__0"


    // $ANTLR start "rule__CompositeQuantumGate__Group_12__0__Impl"
    // InternalQuCircuit.g:4628:1: rule__CompositeQuantumGate__Group_12__0__Impl : ( 'controlQubits' ) ;
    public final void rule__CompositeQuantumGate__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4632:1: ( ( 'controlQubits' ) )
            // InternalQuCircuit.g:4633:1: ( 'controlQubits' )
            {
            // InternalQuCircuit.g:4633:1: ( 'controlQubits' )
            // InternalQuCircuit.g:4634:2: 'controlQubits'
            {
             before(grammarAccess.getCompositeQuantumGateAccess().getControlQubitsKeyword_12_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getCompositeQuantumGateAccess().getControlQubitsKeyword_12_0()); 

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
    // $ANTLR end "rule__CompositeQuantumGate__Group_12__0__Impl"


    // $ANTLR start "rule__CompositeQuantumGate__Group_12__1"
    // InternalQuCircuit.g:4643:1: rule__CompositeQuantumGate__Group_12__1 : rule__CompositeQuantumGate__Group_12__1__Impl rule__CompositeQuantumGate__Group_12__2 ;
    public final void rule__CompositeQuantumGate__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4647:1: ( rule__CompositeQuantumGate__Group_12__1__Impl rule__CompositeQuantumGate__Group_12__2 )
            // InternalQuCircuit.g:4648:2: rule__CompositeQuantumGate__Group_12__1__Impl rule__CompositeQuantumGate__Group_12__2
            {
            pushFollow(FOLLOW_24);
            rule__CompositeQuantumGate__Group_12__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeQuantumGate__Group_12__2();

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
    // $ANTLR end "rule__CompositeQuantumGate__Group_12__1"


    // $ANTLR start "rule__CompositeQuantumGate__Group_12__1__Impl"
    // InternalQuCircuit.g:4655:1: rule__CompositeQuantumGate__Group_12__1__Impl : ( '[' ) ;
    public final void rule__CompositeQuantumGate__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4659:1: ( ( '[' ) )
            // InternalQuCircuit.g:4660:1: ( '[' )
            {
            // InternalQuCircuit.g:4660:1: ( '[' )
            // InternalQuCircuit.g:4661:2: '['
            {
             before(grammarAccess.getCompositeQuantumGateAccess().getLeftSquareBracketKeyword_12_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getCompositeQuantumGateAccess().getLeftSquareBracketKeyword_12_1()); 

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
    // $ANTLR end "rule__CompositeQuantumGate__Group_12__1__Impl"


    // $ANTLR start "rule__CompositeQuantumGate__Group_12__2"
    // InternalQuCircuit.g:4670:1: rule__CompositeQuantumGate__Group_12__2 : rule__CompositeQuantumGate__Group_12__2__Impl rule__CompositeQuantumGate__Group_12__3 ;
    public final void rule__CompositeQuantumGate__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4674:1: ( rule__CompositeQuantumGate__Group_12__2__Impl rule__CompositeQuantumGate__Group_12__3 )
            // InternalQuCircuit.g:4675:2: rule__CompositeQuantumGate__Group_12__2__Impl rule__CompositeQuantumGate__Group_12__3
            {
            pushFollow(FOLLOW_25);
            rule__CompositeQuantumGate__Group_12__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeQuantumGate__Group_12__3();

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
    // $ANTLR end "rule__CompositeQuantumGate__Group_12__2"


    // $ANTLR start "rule__CompositeQuantumGate__Group_12__2__Impl"
    // InternalQuCircuit.g:4682:1: rule__CompositeQuantumGate__Group_12__2__Impl : ( ( rule__CompositeQuantumGate__ControlQubitsAssignment_12_2 ) ) ;
    public final void rule__CompositeQuantumGate__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4686:1: ( ( ( rule__CompositeQuantumGate__ControlQubitsAssignment_12_2 ) ) )
            // InternalQuCircuit.g:4687:1: ( ( rule__CompositeQuantumGate__ControlQubitsAssignment_12_2 ) )
            {
            // InternalQuCircuit.g:4687:1: ( ( rule__CompositeQuantumGate__ControlQubitsAssignment_12_2 ) )
            // InternalQuCircuit.g:4688:2: ( rule__CompositeQuantumGate__ControlQubitsAssignment_12_2 )
            {
             before(grammarAccess.getCompositeQuantumGateAccess().getControlQubitsAssignment_12_2()); 
            // InternalQuCircuit.g:4689:2: ( rule__CompositeQuantumGate__ControlQubitsAssignment_12_2 )
            // InternalQuCircuit.g:4689:3: rule__CompositeQuantumGate__ControlQubitsAssignment_12_2
            {
            pushFollow(FOLLOW_2);
            rule__CompositeQuantumGate__ControlQubitsAssignment_12_2();

            state._fsp--;


            }

             after(grammarAccess.getCompositeQuantumGateAccess().getControlQubitsAssignment_12_2()); 

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
    // $ANTLR end "rule__CompositeQuantumGate__Group_12__2__Impl"


    // $ANTLR start "rule__CompositeQuantumGate__Group_12__3"
    // InternalQuCircuit.g:4697:1: rule__CompositeQuantumGate__Group_12__3 : rule__CompositeQuantumGate__Group_12__3__Impl rule__CompositeQuantumGate__Group_12__4 ;
    public final void rule__CompositeQuantumGate__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4701:1: ( rule__CompositeQuantumGate__Group_12__3__Impl rule__CompositeQuantumGate__Group_12__4 )
            // InternalQuCircuit.g:4702:2: rule__CompositeQuantumGate__Group_12__3__Impl rule__CompositeQuantumGate__Group_12__4
            {
            pushFollow(FOLLOW_25);
            rule__CompositeQuantumGate__Group_12__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeQuantumGate__Group_12__4();

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
    // $ANTLR end "rule__CompositeQuantumGate__Group_12__3"


    // $ANTLR start "rule__CompositeQuantumGate__Group_12__3__Impl"
    // InternalQuCircuit.g:4709:1: rule__CompositeQuantumGate__Group_12__3__Impl : ( ( rule__CompositeQuantumGate__Group_12_3__0 )* ) ;
    public final void rule__CompositeQuantumGate__Group_12__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4713:1: ( ( ( rule__CompositeQuantumGate__Group_12_3__0 )* ) )
            // InternalQuCircuit.g:4714:1: ( ( rule__CompositeQuantumGate__Group_12_3__0 )* )
            {
            // InternalQuCircuit.g:4714:1: ( ( rule__CompositeQuantumGate__Group_12_3__0 )* )
            // InternalQuCircuit.g:4715:2: ( rule__CompositeQuantumGate__Group_12_3__0 )*
            {
             before(grammarAccess.getCompositeQuantumGateAccess().getGroup_12_3()); 
            // InternalQuCircuit.g:4716:2: ( rule__CompositeQuantumGate__Group_12_3__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==26) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalQuCircuit.g:4716:3: rule__CompositeQuantumGate__Group_12_3__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__CompositeQuantumGate__Group_12_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getCompositeQuantumGateAccess().getGroup_12_3()); 

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
    // $ANTLR end "rule__CompositeQuantumGate__Group_12__3__Impl"


    // $ANTLR start "rule__CompositeQuantumGate__Group_12__4"
    // InternalQuCircuit.g:4724:1: rule__CompositeQuantumGate__Group_12__4 : rule__CompositeQuantumGate__Group_12__4__Impl ;
    public final void rule__CompositeQuantumGate__Group_12__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4728:1: ( rule__CompositeQuantumGate__Group_12__4__Impl )
            // InternalQuCircuit.g:4729:2: rule__CompositeQuantumGate__Group_12__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeQuantumGate__Group_12__4__Impl();

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
    // $ANTLR end "rule__CompositeQuantumGate__Group_12__4"


    // $ANTLR start "rule__CompositeQuantumGate__Group_12__4__Impl"
    // InternalQuCircuit.g:4735:1: rule__CompositeQuantumGate__Group_12__4__Impl : ( ']' ) ;
    public final void rule__CompositeQuantumGate__Group_12__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4739:1: ( ( ']' ) )
            // InternalQuCircuit.g:4740:1: ( ']' )
            {
            // InternalQuCircuit.g:4740:1: ( ']' )
            // InternalQuCircuit.g:4741:2: ']'
            {
             before(grammarAccess.getCompositeQuantumGateAccess().getRightSquareBracketKeyword_12_4()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getCompositeQuantumGateAccess().getRightSquareBracketKeyword_12_4()); 

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
    // $ANTLR end "rule__CompositeQuantumGate__Group_12__4__Impl"


    // $ANTLR start "rule__CompositeQuantumGate__Group_12_3__0"
    // InternalQuCircuit.g:4751:1: rule__CompositeQuantumGate__Group_12_3__0 : rule__CompositeQuantumGate__Group_12_3__0__Impl rule__CompositeQuantumGate__Group_12_3__1 ;
    public final void rule__CompositeQuantumGate__Group_12_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4755:1: ( rule__CompositeQuantumGate__Group_12_3__0__Impl rule__CompositeQuantumGate__Group_12_3__1 )
            // InternalQuCircuit.g:4756:2: rule__CompositeQuantumGate__Group_12_3__0__Impl rule__CompositeQuantumGate__Group_12_3__1
            {
            pushFollow(FOLLOW_24);
            rule__CompositeQuantumGate__Group_12_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeQuantumGate__Group_12_3__1();

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
    // $ANTLR end "rule__CompositeQuantumGate__Group_12_3__0"


    // $ANTLR start "rule__CompositeQuantumGate__Group_12_3__0__Impl"
    // InternalQuCircuit.g:4763:1: rule__CompositeQuantumGate__Group_12_3__0__Impl : ( ',' ) ;
    public final void rule__CompositeQuantumGate__Group_12_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4767:1: ( ( ',' ) )
            // InternalQuCircuit.g:4768:1: ( ',' )
            {
            // InternalQuCircuit.g:4768:1: ( ',' )
            // InternalQuCircuit.g:4769:2: ','
            {
             before(grammarAccess.getCompositeQuantumGateAccess().getCommaKeyword_12_3_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getCompositeQuantumGateAccess().getCommaKeyword_12_3_0()); 

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
    // $ANTLR end "rule__CompositeQuantumGate__Group_12_3__0__Impl"


    // $ANTLR start "rule__CompositeQuantumGate__Group_12_3__1"
    // InternalQuCircuit.g:4778:1: rule__CompositeQuantumGate__Group_12_3__1 : rule__CompositeQuantumGate__Group_12_3__1__Impl ;
    public final void rule__CompositeQuantumGate__Group_12_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4782:1: ( rule__CompositeQuantumGate__Group_12_3__1__Impl )
            // InternalQuCircuit.g:4783:2: rule__CompositeQuantumGate__Group_12_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeQuantumGate__Group_12_3__1__Impl();

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
    // $ANTLR end "rule__CompositeQuantumGate__Group_12_3__1"


    // $ANTLR start "rule__CompositeQuantumGate__Group_12_3__1__Impl"
    // InternalQuCircuit.g:4789:1: rule__CompositeQuantumGate__Group_12_3__1__Impl : ( ( rule__CompositeQuantumGate__ControlQubitsAssignment_12_3_1 ) ) ;
    public final void rule__CompositeQuantumGate__Group_12_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4793:1: ( ( ( rule__CompositeQuantumGate__ControlQubitsAssignment_12_3_1 ) ) )
            // InternalQuCircuit.g:4794:1: ( ( rule__CompositeQuantumGate__ControlQubitsAssignment_12_3_1 ) )
            {
            // InternalQuCircuit.g:4794:1: ( ( rule__CompositeQuantumGate__ControlQubitsAssignment_12_3_1 ) )
            // InternalQuCircuit.g:4795:2: ( rule__CompositeQuantumGate__ControlQubitsAssignment_12_3_1 )
            {
             before(grammarAccess.getCompositeQuantumGateAccess().getControlQubitsAssignment_12_3_1()); 
            // InternalQuCircuit.g:4796:2: ( rule__CompositeQuantumGate__ControlQubitsAssignment_12_3_1 )
            // InternalQuCircuit.g:4796:3: rule__CompositeQuantumGate__ControlQubitsAssignment_12_3_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeQuantumGate__ControlQubitsAssignment_12_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeQuantumGateAccess().getControlQubitsAssignment_12_3_1()); 

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
    // $ANTLR end "rule__CompositeQuantumGate__Group_12_3__1__Impl"


    // $ANTLR start "rule__Loop__Group__0"
    // InternalQuCircuit.g:4805:1: rule__Loop__Group__0 : rule__Loop__Group__0__Impl rule__Loop__Group__1 ;
    public final void rule__Loop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4809:1: ( rule__Loop__Group__0__Impl rule__Loop__Group__1 )
            // InternalQuCircuit.g:4810:2: rule__Loop__Group__0__Impl rule__Loop__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Loop__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__1();

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
    // $ANTLR end "rule__Loop__Group__0"


    // $ANTLR start "rule__Loop__Group__0__Impl"
    // InternalQuCircuit.g:4817:1: rule__Loop__Group__0__Impl : ( 'Loop' ) ;
    public final void rule__Loop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4821:1: ( ( 'Loop' ) )
            // InternalQuCircuit.g:4822:1: ( 'Loop' )
            {
            // InternalQuCircuit.g:4822:1: ( 'Loop' )
            // InternalQuCircuit.g:4823:2: 'Loop'
            {
             before(grammarAccess.getLoopAccess().getLoopKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getLoopKeyword_0()); 

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
    // $ANTLR end "rule__Loop__Group__0__Impl"


    // $ANTLR start "rule__Loop__Group__1"
    // InternalQuCircuit.g:4832:1: rule__Loop__Group__1 : rule__Loop__Group__1__Impl rule__Loop__Group__2 ;
    public final void rule__Loop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4836:1: ( rule__Loop__Group__1__Impl rule__Loop__Group__2 )
            // InternalQuCircuit.g:4837:2: rule__Loop__Group__1__Impl rule__Loop__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Loop__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__2();

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
    // $ANTLR end "rule__Loop__Group__1"


    // $ANTLR start "rule__Loop__Group__1__Impl"
    // InternalQuCircuit.g:4844:1: rule__Loop__Group__1__Impl : ( ( rule__Loop__NameAssignment_1 ) ) ;
    public final void rule__Loop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4848:1: ( ( ( rule__Loop__NameAssignment_1 ) ) )
            // InternalQuCircuit.g:4849:1: ( ( rule__Loop__NameAssignment_1 ) )
            {
            // InternalQuCircuit.g:4849:1: ( ( rule__Loop__NameAssignment_1 ) )
            // InternalQuCircuit.g:4850:2: ( rule__Loop__NameAssignment_1 )
            {
             before(grammarAccess.getLoopAccess().getNameAssignment_1()); 
            // InternalQuCircuit.g:4851:2: ( rule__Loop__NameAssignment_1 )
            // InternalQuCircuit.g:4851:3: rule__Loop__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Loop__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Loop__Group__1__Impl"


    // $ANTLR start "rule__Loop__Group__2"
    // InternalQuCircuit.g:4859:1: rule__Loop__Group__2 : rule__Loop__Group__2__Impl rule__Loop__Group__3 ;
    public final void rule__Loop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4863:1: ( rule__Loop__Group__2__Impl rule__Loop__Group__3 )
            // InternalQuCircuit.g:4864:2: rule__Loop__Group__2__Impl rule__Loop__Group__3
            {
            pushFollow(FOLLOW_36);
            rule__Loop__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__3();

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
    // $ANTLR end "rule__Loop__Group__2"


    // $ANTLR start "rule__Loop__Group__2__Impl"
    // InternalQuCircuit.g:4871:1: rule__Loop__Group__2__Impl : ( '{' ) ;
    public final void rule__Loop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4875:1: ( ( '{' ) )
            // InternalQuCircuit.g:4876:1: ( '{' )
            {
            // InternalQuCircuit.g:4876:1: ( '{' )
            // InternalQuCircuit.g:4877:2: '{'
            {
             before(grammarAccess.getLoopAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Loop__Group__2__Impl"


    // $ANTLR start "rule__Loop__Group__3"
    // InternalQuCircuit.g:4886:1: rule__Loop__Group__3 : rule__Loop__Group__3__Impl rule__Loop__Group__4 ;
    public final void rule__Loop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4890:1: ( rule__Loop__Group__3__Impl rule__Loop__Group__4 )
            // InternalQuCircuit.g:4891:2: rule__Loop__Group__3__Impl rule__Loop__Group__4
            {
            pushFollow(FOLLOW_36);
            rule__Loop__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__4();

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
    // $ANTLR end "rule__Loop__Group__3"


    // $ANTLR start "rule__Loop__Group__3__Impl"
    // InternalQuCircuit.g:4898:1: rule__Loop__Group__3__Impl : ( ( rule__Loop__InverseFormAssignment_3 )? ) ;
    public final void rule__Loop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4902:1: ( ( ( rule__Loop__InverseFormAssignment_3 )? ) )
            // InternalQuCircuit.g:4903:1: ( ( rule__Loop__InverseFormAssignment_3 )? )
            {
            // InternalQuCircuit.g:4903:1: ( ( rule__Loop__InverseFormAssignment_3 )? )
            // InternalQuCircuit.g:4904:2: ( rule__Loop__InverseFormAssignment_3 )?
            {
             before(grammarAccess.getLoopAccess().getInverseFormAssignment_3()); 
            // InternalQuCircuit.g:4905:2: ( rule__Loop__InverseFormAssignment_3 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==56) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalQuCircuit.g:4905:3: rule__Loop__InverseFormAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Loop__InverseFormAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLoopAccess().getInverseFormAssignment_3()); 

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
    // $ANTLR end "rule__Loop__Group__3__Impl"


    // $ANTLR start "rule__Loop__Group__4"
    // InternalQuCircuit.g:4913:1: rule__Loop__Group__4 : rule__Loop__Group__4__Impl rule__Loop__Group__5 ;
    public final void rule__Loop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4917:1: ( rule__Loop__Group__4__Impl rule__Loop__Group__5 )
            // InternalQuCircuit.g:4918:2: rule__Loop__Group__4__Impl rule__Loop__Group__5
            {
            pushFollow(FOLLOW_36);
            rule__Loop__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__5();

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
    // $ANTLR end "rule__Loop__Group__4"


    // $ANTLR start "rule__Loop__Group__4__Impl"
    // InternalQuCircuit.g:4925:1: rule__Loop__Group__4__Impl : ( ( rule__Loop__IncrementBlockTargetQubitsAssignment_4 )? ) ;
    public final void rule__Loop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4929:1: ( ( ( rule__Loop__IncrementBlockTargetQubitsAssignment_4 )? ) )
            // InternalQuCircuit.g:4930:1: ( ( rule__Loop__IncrementBlockTargetQubitsAssignment_4 )? )
            {
            // InternalQuCircuit.g:4930:1: ( ( rule__Loop__IncrementBlockTargetQubitsAssignment_4 )? )
            // InternalQuCircuit.g:4931:2: ( rule__Loop__IncrementBlockTargetQubitsAssignment_4 )?
            {
             before(grammarAccess.getLoopAccess().getIncrementBlockTargetQubitsAssignment_4()); 
            // InternalQuCircuit.g:4932:2: ( rule__Loop__IncrementBlockTargetQubitsAssignment_4 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==57) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalQuCircuit.g:4932:3: rule__Loop__IncrementBlockTargetQubitsAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Loop__IncrementBlockTargetQubitsAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLoopAccess().getIncrementBlockTargetQubitsAssignment_4()); 

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
    // $ANTLR end "rule__Loop__Group__4__Impl"


    // $ANTLR start "rule__Loop__Group__5"
    // InternalQuCircuit.g:4940:1: rule__Loop__Group__5 : rule__Loop__Group__5__Impl rule__Loop__Group__6 ;
    public final void rule__Loop__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4944:1: ( rule__Loop__Group__5__Impl rule__Loop__Group__6 )
            // InternalQuCircuit.g:4945:2: rule__Loop__Group__5__Impl rule__Loop__Group__6
            {
            pushFollow(FOLLOW_36);
            rule__Loop__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__6();

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
    // $ANTLR end "rule__Loop__Group__5"


    // $ANTLR start "rule__Loop__Group__5__Impl"
    // InternalQuCircuit.g:4952:1: rule__Loop__Group__5__Impl : ( ( rule__Loop__IncrementBlockControlQubitsAssignment_5 )? ) ;
    public final void rule__Loop__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4956:1: ( ( ( rule__Loop__IncrementBlockControlQubitsAssignment_5 )? ) )
            // InternalQuCircuit.g:4957:1: ( ( rule__Loop__IncrementBlockControlQubitsAssignment_5 )? )
            {
            // InternalQuCircuit.g:4957:1: ( ( rule__Loop__IncrementBlockControlQubitsAssignment_5 )? )
            // InternalQuCircuit.g:4958:2: ( rule__Loop__IncrementBlockControlQubitsAssignment_5 )?
            {
             before(grammarAccess.getLoopAccess().getIncrementBlockControlQubitsAssignment_5()); 
            // InternalQuCircuit.g:4959:2: ( rule__Loop__IncrementBlockControlQubitsAssignment_5 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==58) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalQuCircuit.g:4959:3: rule__Loop__IncrementBlockControlQubitsAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Loop__IncrementBlockControlQubitsAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLoopAccess().getIncrementBlockControlQubitsAssignment_5()); 

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
    // $ANTLR end "rule__Loop__Group__5__Impl"


    // $ANTLR start "rule__Loop__Group__6"
    // InternalQuCircuit.g:4967:1: rule__Loop__Group__6 : rule__Loop__Group__6__Impl rule__Loop__Group__7 ;
    public final void rule__Loop__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4971:1: ( rule__Loop__Group__6__Impl rule__Loop__Group__7 )
            // InternalQuCircuit.g:4972:2: rule__Loop__Group__6__Impl rule__Loop__Group__7
            {
            pushFollow(FOLLOW_36);
            rule__Loop__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__7();

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
    // $ANTLR end "rule__Loop__Group__6"


    // $ANTLR start "rule__Loop__Group__6__Impl"
    // InternalQuCircuit.g:4979:1: rule__Loop__Group__6__Impl : ( ( rule__Loop__Group_6__0 )? ) ;
    public final void rule__Loop__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4983:1: ( ( ( rule__Loop__Group_6__0 )? ) )
            // InternalQuCircuit.g:4984:1: ( ( rule__Loop__Group_6__0 )? )
            {
            // InternalQuCircuit.g:4984:1: ( ( rule__Loop__Group_6__0 )? )
            // InternalQuCircuit.g:4985:2: ( rule__Loop__Group_6__0 )?
            {
             before(grammarAccess.getLoopAccess().getGroup_6()); 
            // InternalQuCircuit.g:4986:2: ( rule__Loop__Group_6__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==44) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalQuCircuit.g:4986:3: rule__Loop__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Loop__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLoopAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Loop__Group__6__Impl"


    // $ANTLR start "rule__Loop__Group__7"
    // InternalQuCircuit.g:4994:1: rule__Loop__Group__7 : rule__Loop__Group__7__Impl rule__Loop__Group__8 ;
    public final void rule__Loop__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:4998:1: ( rule__Loop__Group__7__Impl rule__Loop__Group__8 )
            // InternalQuCircuit.g:4999:2: rule__Loop__Group__7__Impl rule__Loop__Group__8
            {
            pushFollow(FOLLOW_36);
            rule__Loop__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__8();

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
    // $ANTLR end "rule__Loop__Group__7"


    // $ANTLR start "rule__Loop__Group__7__Impl"
    // InternalQuCircuit.g:5006:1: rule__Loop__Group__7__Impl : ( ( rule__Loop__IncrementTargetQubitsAssignment_7 )? ) ;
    public final void rule__Loop__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5010:1: ( ( ( rule__Loop__IncrementTargetQubitsAssignment_7 )? ) )
            // InternalQuCircuit.g:5011:1: ( ( rule__Loop__IncrementTargetQubitsAssignment_7 )? )
            {
            // InternalQuCircuit.g:5011:1: ( ( rule__Loop__IncrementTargetQubitsAssignment_7 )? )
            // InternalQuCircuit.g:5012:2: ( rule__Loop__IncrementTargetQubitsAssignment_7 )?
            {
             before(grammarAccess.getLoopAccess().getIncrementTargetQubitsAssignment_7()); 
            // InternalQuCircuit.g:5013:2: ( rule__Loop__IncrementTargetQubitsAssignment_7 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==59) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalQuCircuit.g:5013:3: rule__Loop__IncrementTargetQubitsAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__Loop__IncrementTargetQubitsAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLoopAccess().getIncrementTargetQubitsAssignment_7()); 

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
    // $ANTLR end "rule__Loop__Group__7__Impl"


    // $ANTLR start "rule__Loop__Group__8"
    // InternalQuCircuit.g:5021:1: rule__Loop__Group__8 : rule__Loop__Group__8__Impl rule__Loop__Group__9 ;
    public final void rule__Loop__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5025:1: ( rule__Loop__Group__8__Impl rule__Loop__Group__9 )
            // InternalQuCircuit.g:5026:2: rule__Loop__Group__8__Impl rule__Loop__Group__9
            {
            pushFollow(FOLLOW_36);
            rule__Loop__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__9();

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
    // $ANTLR end "rule__Loop__Group__8"


    // $ANTLR start "rule__Loop__Group__8__Impl"
    // InternalQuCircuit.g:5033:1: rule__Loop__Group__8__Impl : ( ( rule__Loop__IncrementControlQubitsAssignment_8 )? ) ;
    public final void rule__Loop__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5037:1: ( ( ( rule__Loop__IncrementControlQubitsAssignment_8 )? ) )
            // InternalQuCircuit.g:5038:1: ( ( rule__Loop__IncrementControlQubitsAssignment_8 )? )
            {
            // InternalQuCircuit.g:5038:1: ( ( rule__Loop__IncrementControlQubitsAssignment_8 )? )
            // InternalQuCircuit.g:5039:2: ( rule__Loop__IncrementControlQubitsAssignment_8 )?
            {
             before(grammarAccess.getLoopAccess().getIncrementControlQubitsAssignment_8()); 
            // InternalQuCircuit.g:5040:2: ( rule__Loop__IncrementControlQubitsAssignment_8 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==60) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalQuCircuit.g:5040:3: rule__Loop__IncrementControlQubitsAssignment_8
                    {
                    pushFollow(FOLLOW_2);
                    rule__Loop__IncrementControlQubitsAssignment_8();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLoopAccess().getIncrementControlQubitsAssignment_8()); 

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
    // $ANTLR end "rule__Loop__Group__8__Impl"


    // $ANTLR start "rule__Loop__Group__9"
    // InternalQuCircuit.g:5048:1: rule__Loop__Group__9 : rule__Loop__Group__9__Impl rule__Loop__Group__10 ;
    public final void rule__Loop__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5052:1: ( rule__Loop__Group__9__Impl rule__Loop__Group__10 )
            // InternalQuCircuit.g:5053:2: rule__Loop__Group__9__Impl rule__Loop__Group__10
            {
            pushFollow(FOLLOW_36);
            rule__Loop__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__10();

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
    // $ANTLR end "rule__Loop__Group__9"


    // $ANTLR start "rule__Loop__Group__9__Impl"
    // InternalQuCircuit.g:5060:1: rule__Loop__Group__9__Impl : ( ( rule__Loop__Group_9__0 )? ) ;
    public final void rule__Loop__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5064:1: ( ( ( rule__Loop__Group_9__0 )? ) )
            // InternalQuCircuit.g:5065:1: ( ( rule__Loop__Group_9__0 )? )
            {
            // InternalQuCircuit.g:5065:1: ( ( rule__Loop__Group_9__0 )? )
            // InternalQuCircuit.g:5066:2: ( rule__Loop__Group_9__0 )?
            {
             before(grammarAccess.getLoopAccess().getGroup_9()); 
            // InternalQuCircuit.g:5067:2: ( rule__Loop__Group_9__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==45) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalQuCircuit.g:5067:3: rule__Loop__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Loop__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLoopAccess().getGroup_9()); 

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
    // $ANTLR end "rule__Loop__Group__9__Impl"


    // $ANTLR start "rule__Loop__Group__10"
    // InternalQuCircuit.g:5075:1: rule__Loop__Group__10 : rule__Loop__Group__10__Impl rule__Loop__Group__11 ;
    public final void rule__Loop__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5079:1: ( rule__Loop__Group__10__Impl rule__Loop__Group__11 )
            // InternalQuCircuit.g:5080:2: rule__Loop__Group__10__Impl rule__Loop__Group__11
            {
            pushFollow(FOLLOW_36);
            rule__Loop__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__11();

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
    // $ANTLR end "rule__Loop__Group__10"


    // $ANTLR start "rule__Loop__Group__10__Impl"
    // InternalQuCircuit.g:5087:1: rule__Loop__Group__10__Impl : ( ( rule__Loop__Group_10__0 )? ) ;
    public final void rule__Loop__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5091:1: ( ( ( rule__Loop__Group_10__0 )? ) )
            // InternalQuCircuit.g:5092:1: ( ( rule__Loop__Group_10__0 )? )
            {
            // InternalQuCircuit.g:5092:1: ( ( rule__Loop__Group_10__0 )? )
            // InternalQuCircuit.g:5093:2: ( rule__Loop__Group_10__0 )?
            {
             before(grammarAccess.getLoopAccess().getGroup_10()); 
            // InternalQuCircuit.g:5094:2: ( rule__Loop__Group_10__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==46) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalQuCircuit.g:5094:3: rule__Loop__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Loop__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLoopAccess().getGroup_10()); 

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
    // $ANTLR end "rule__Loop__Group__10__Impl"


    // $ANTLR start "rule__Loop__Group__11"
    // InternalQuCircuit.g:5102:1: rule__Loop__Group__11 : rule__Loop__Group__11__Impl rule__Loop__Group__12 ;
    public final void rule__Loop__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5106:1: ( rule__Loop__Group__11__Impl rule__Loop__Group__12 )
            // InternalQuCircuit.g:5107:2: rule__Loop__Group__11__Impl rule__Loop__Group__12
            {
            pushFollow(FOLLOW_36);
            rule__Loop__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__12();

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
    // $ANTLR end "rule__Loop__Group__11"


    // $ANTLR start "rule__Loop__Group__11__Impl"
    // InternalQuCircuit.g:5114:1: rule__Loop__Group__11__Impl : ( ( rule__Loop__Group_11__0 )? ) ;
    public final void rule__Loop__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5118:1: ( ( ( rule__Loop__Group_11__0 )? ) )
            // InternalQuCircuit.g:5119:1: ( ( rule__Loop__Group_11__0 )? )
            {
            // InternalQuCircuit.g:5119:1: ( ( rule__Loop__Group_11__0 )? )
            // InternalQuCircuit.g:5120:2: ( rule__Loop__Group_11__0 )?
            {
             before(grammarAccess.getLoopAccess().getGroup_11()); 
            // InternalQuCircuit.g:5121:2: ( rule__Loop__Group_11__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==47) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalQuCircuit.g:5121:3: rule__Loop__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Loop__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLoopAccess().getGroup_11()); 

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
    // $ANTLR end "rule__Loop__Group__11__Impl"


    // $ANTLR start "rule__Loop__Group__12"
    // InternalQuCircuit.g:5129:1: rule__Loop__Group__12 : rule__Loop__Group__12__Impl rule__Loop__Group__13 ;
    public final void rule__Loop__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5133:1: ( rule__Loop__Group__12__Impl rule__Loop__Group__13 )
            // InternalQuCircuit.g:5134:2: rule__Loop__Group__12__Impl rule__Loop__Group__13
            {
            pushFollow(FOLLOW_36);
            rule__Loop__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__13();

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
    // $ANTLR end "rule__Loop__Group__12"


    // $ANTLR start "rule__Loop__Group__12__Impl"
    // InternalQuCircuit.g:5141:1: rule__Loop__Group__12__Impl : ( ( rule__Loop__Group_12__0 )? ) ;
    public final void rule__Loop__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5145:1: ( ( ( rule__Loop__Group_12__0 )? ) )
            // InternalQuCircuit.g:5146:1: ( ( rule__Loop__Group_12__0 )? )
            {
            // InternalQuCircuit.g:5146:1: ( ( rule__Loop__Group_12__0 )? )
            // InternalQuCircuit.g:5147:2: ( rule__Loop__Group_12__0 )?
            {
             before(grammarAccess.getLoopAccess().getGroup_12()); 
            // InternalQuCircuit.g:5148:2: ( rule__Loop__Group_12__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==48) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalQuCircuit.g:5148:3: rule__Loop__Group_12__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Loop__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLoopAccess().getGroup_12()); 

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
    // $ANTLR end "rule__Loop__Group__12__Impl"


    // $ANTLR start "rule__Loop__Group__13"
    // InternalQuCircuit.g:5156:1: rule__Loop__Group__13 : rule__Loop__Group__13__Impl rule__Loop__Group__14 ;
    public final void rule__Loop__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5160:1: ( rule__Loop__Group__13__Impl rule__Loop__Group__14 )
            // InternalQuCircuit.g:5161:2: rule__Loop__Group__13__Impl rule__Loop__Group__14
            {
            pushFollow(FOLLOW_36);
            rule__Loop__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__14();

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
    // $ANTLR end "rule__Loop__Group__13"


    // $ANTLR start "rule__Loop__Group__13__Impl"
    // InternalQuCircuit.g:5168:1: rule__Loop__Group__13__Impl : ( ( rule__Loop__Group_13__0 )? ) ;
    public final void rule__Loop__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5172:1: ( ( ( rule__Loop__Group_13__0 )? ) )
            // InternalQuCircuit.g:5173:1: ( ( rule__Loop__Group_13__0 )? )
            {
            // InternalQuCircuit.g:5173:1: ( ( rule__Loop__Group_13__0 )? )
            // InternalQuCircuit.g:5174:2: ( rule__Loop__Group_13__0 )?
            {
             before(grammarAccess.getLoopAccess().getGroup_13()); 
            // InternalQuCircuit.g:5175:2: ( rule__Loop__Group_13__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==49) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalQuCircuit.g:5175:3: rule__Loop__Group_13__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Loop__Group_13__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLoopAccess().getGroup_13()); 

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
    // $ANTLR end "rule__Loop__Group__13__Impl"


    // $ANTLR start "rule__Loop__Group__14"
    // InternalQuCircuit.g:5183:1: rule__Loop__Group__14 : rule__Loop__Group__14__Impl rule__Loop__Group__15 ;
    public final void rule__Loop__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5187:1: ( rule__Loop__Group__14__Impl rule__Loop__Group__15 )
            // InternalQuCircuit.g:5188:2: rule__Loop__Group__14__Impl rule__Loop__Group__15
            {
            pushFollow(FOLLOW_36);
            rule__Loop__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__15();

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
    // $ANTLR end "rule__Loop__Group__14"


    // $ANTLR start "rule__Loop__Group__14__Impl"
    // InternalQuCircuit.g:5195:1: rule__Loop__Group__14__Impl : ( ( rule__Loop__Group_14__0 )? ) ;
    public final void rule__Loop__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5199:1: ( ( ( rule__Loop__Group_14__0 )? ) )
            // InternalQuCircuit.g:5200:1: ( ( rule__Loop__Group_14__0 )? )
            {
            // InternalQuCircuit.g:5200:1: ( ( rule__Loop__Group_14__0 )? )
            // InternalQuCircuit.g:5201:2: ( rule__Loop__Group_14__0 )?
            {
             before(grammarAccess.getLoopAccess().getGroup_14()); 
            // InternalQuCircuit.g:5202:2: ( rule__Loop__Group_14__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==50) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalQuCircuit.g:5202:3: rule__Loop__Group_14__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Loop__Group_14__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLoopAccess().getGroup_14()); 

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
    // $ANTLR end "rule__Loop__Group__14__Impl"


    // $ANTLR start "rule__Loop__Group__15"
    // InternalQuCircuit.g:5210:1: rule__Loop__Group__15 : rule__Loop__Group__15__Impl rule__Loop__Group__16 ;
    public final void rule__Loop__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5214:1: ( rule__Loop__Group__15__Impl rule__Loop__Group__16 )
            // InternalQuCircuit.g:5215:2: rule__Loop__Group__15__Impl rule__Loop__Group__16
            {
            pushFollow(FOLLOW_23);
            rule__Loop__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__16();

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
    // $ANTLR end "rule__Loop__Group__15"


    // $ANTLR start "rule__Loop__Group__15__Impl"
    // InternalQuCircuit.g:5222:1: rule__Loop__Group__15__Impl : ( 'targetQubits' ) ;
    public final void rule__Loop__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5226:1: ( ( 'targetQubits' ) )
            // InternalQuCircuit.g:5227:1: ( 'targetQubits' )
            {
            // InternalQuCircuit.g:5227:1: ( 'targetQubits' )
            // InternalQuCircuit.g:5228:2: 'targetQubits'
            {
             before(grammarAccess.getLoopAccess().getTargetQubitsKeyword_15()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getTargetQubitsKeyword_15()); 

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
    // $ANTLR end "rule__Loop__Group__15__Impl"


    // $ANTLR start "rule__Loop__Group__16"
    // InternalQuCircuit.g:5237:1: rule__Loop__Group__16 : rule__Loop__Group__16__Impl rule__Loop__Group__17 ;
    public final void rule__Loop__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5241:1: ( rule__Loop__Group__16__Impl rule__Loop__Group__17 )
            // InternalQuCircuit.g:5242:2: rule__Loop__Group__16__Impl rule__Loop__Group__17
            {
            pushFollow(FOLLOW_14);
            rule__Loop__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__17();

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
    // $ANTLR end "rule__Loop__Group__16"


    // $ANTLR start "rule__Loop__Group__16__Impl"
    // InternalQuCircuit.g:5249:1: rule__Loop__Group__16__Impl : ( '[' ) ;
    public final void rule__Loop__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5253:1: ( ( '[' ) )
            // InternalQuCircuit.g:5254:1: ( '[' )
            {
            // InternalQuCircuit.g:5254:1: ( '[' )
            // InternalQuCircuit.g:5255:2: '['
            {
             before(grammarAccess.getLoopAccess().getLeftSquareBracketKeyword_16()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getLeftSquareBracketKeyword_16()); 

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
    // $ANTLR end "rule__Loop__Group__16__Impl"


    // $ANTLR start "rule__Loop__Group__17"
    // InternalQuCircuit.g:5264:1: rule__Loop__Group__17 : rule__Loop__Group__17__Impl rule__Loop__Group__18 ;
    public final void rule__Loop__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5268:1: ( rule__Loop__Group__17__Impl rule__Loop__Group__18 )
            // InternalQuCircuit.g:5269:2: rule__Loop__Group__17__Impl rule__Loop__Group__18
            {
            pushFollow(FOLLOW_24);
            rule__Loop__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__18();

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
    // $ANTLR end "rule__Loop__Group__17"


    // $ANTLR start "rule__Loop__Group__17__Impl"
    // InternalQuCircuit.g:5276:1: rule__Loop__Group__17__Impl : ( '(' ) ;
    public final void rule__Loop__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5280:1: ( ( '(' ) )
            // InternalQuCircuit.g:5281:1: ( '(' )
            {
            // InternalQuCircuit.g:5281:1: ( '(' )
            // InternalQuCircuit.g:5282:2: '('
            {
             before(grammarAccess.getLoopAccess().getLeftParenthesisKeyword_17()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getLeftParenthesisKeyword_17()); 

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
    // $ANTLR end "rule__Loop__Group__17__Impl"


    // $ANTLR start "rule__Loop__Group__18"
    // InternalQuCircuit.g:5291:1: rule__Loop__Group__18 : rule__Loop__Group__18__Impl rule__Loop__Group__19 ;
    public final void rule__Loop__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5295:1: ( rule__Loop__Group__18__Impl rule__Loop__Group__19 )
            // InternalQuCircuit.g:5296:2: rule__Loop__Group__18__Impl rule__Loop__Group__19
            {
            pushFollow(FOLLOW_15);
            rule__Loop__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__19();

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
    // $ANTLR end "rule__Loop__Group__18"


    // $ANTLR start "rule__Loop__Group__18__Impl"
    // InternalQuCircuit.g:5303:1: rule__Loop__Group__18__Impl : ( ( rule__Loop__TargetQubitsAssignment_18 ) ) ;
    public final void rule__Loop__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5307:1: ( ( ( rule__Loop__TargetQubitsAssignment_18 ) ) )
            // InternalQuCircuit.g:5308:1: ( ( rule__Loop__TargetQubitsAssignment_18 ) )
            {
            // InternalQuCircuit.g:5308:1: ( ( rule__Loop__TargetQubitsAssignment_18 ) )
            // InternalQuCircuit.g:5309:2: ( rule__Loop__TargetQubitsAssignment_18 )
            {
             before(grammarAccess.getLoopAccess().getTargetQubitsAssignment_18()); 
            // InternalQuCircuit.g:5310:2: ( rule__Loop__TargetQubitsAssignment_18 )
            // InternalQuCircuit.g:5310:3: rule__Loop__TargetQubitsAssignment_18
            {
            pushFollow(FOLLOW_2);
            rule__Loop__TargetQubitsAssignment_18();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getTargetQubitsAssignment_18()); 

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
    // $ANTLR end "rule__Loop__Group__18__Impl"


    // $ANTLR start "rule__Loop__Group__19"
    // InternalQuCircuit.g:5318:1: rule__Loop__Group__19 : rule__Loop__Group__19__Impl rule__Loop__Group__20 ;
    public final void rule__Loop__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5322:1: ( rule__Loop__Group__19__Impl rule__Loop__Group__20 )
            // InternalQuCircuit.g:5323:2: rule__Loop__Group__19__Impl rule__Loop__Group__20
            {
            pushFollow(FOLLOW_25);
            rule__Loop__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__20();

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
    // $ANTLR end "rule__Loop__Group__19"


    // $ANTLR start "rule__Loop__Group__19__Impl"
    // InternalQuCircuit.g:5330:1: rule__Loop__Group__19__Impl : ( ')' ) ;
    public final void rule__Loop__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5334:1: ( ( ')' ) )
            // InternalQuCircuit.g:5335:1: ( ')' )
            {
            // InternalQuCircuit.g:5335:1: ( ')' )
            // InternalQuCircuit.g:5336:2: ')'
            {
             before(grammarAccess.getLoopAccess().getRightParenthesisKeyword_19()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getRightParenthesisKeyword_19()); 

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
    // $ANTLR end "rule__Loop__Group__19__Impl"


    // $ANTLR start "rule__Loop__Group__20"
    // InternalQuCircuit.g:5345:1: rule__Loop__Group__20 : rule__Loop__Group__20__Impl rule__Loop__Group__21 ;
    public final void rule__Loop__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5349:1: ( rule__Loop__Group__20__Impl rule__Loop__Group__21 )
            // InternalQuCircuit.g:5350:2: rule__Loop__Group__20__Impl rule__Loop__Group__21
            {
            pushFollow(FOLLOW_25);
            rule__Loop__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__21();

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
    // $ANTLR end "rule__Loop__Group__20"


    // $ANTLR start "rule__Loop__Group__20__Impl"
    // InternalQuCircuit.g:5357:1: rule__Loop__Group__20__Impl : ( ( rule__Loop__Group_20__0 )* ) ;
    public final void rule__Loop__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5361:1: ( ( ( rule__Loop__Group_20__0 )* ) )
            // InternalQuCircuit.g:5362:1: ( ( rule__Loop__Group_20__0 )* )
            {
            // InternalQuCircuit.g:5362:1: ( ( rule__Loop__Group_20__0 )* )
            // InternalQuCircuit.g:5363:2: ( rule__Loop__Group_20__0 )*
            {
             before(grammarAccess.getLoopAccess().getGroup_20()); 
            // InternalQuCircuit.g:5364:2: ( rule__Loop__Group_20__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==26) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalQuCircuit.g:5364:3: rule__Loop__Group_20__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Loop__Group_20__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

             after(grammarAccess.getLoopAccess().getGroup_20()); 

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
    // $ANTLR end "rule__Loop__Group__20__Impl"


    // $ANTLR start "rule__Loop__Group__21"
    // InternalQuCircuit.g:5372:1: rule__Loop__Group__21 : rule__Loop__Group__21__Impl rule__Loop__Group__22 ;
    public final void rule__Loop__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5376:1: ( rule__Loop__Group__21__Impl rule__Loop__Group__22 )
            // InternalQuCircuit.g:5377:2: rule__Loop__Group__21__Impl rule__Loop__Group__22
            {
            pushFollow(FOLLOW_37);
            rule__Loop__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__22();

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
    // $ANTLR end "rule__Loop__Group__21"


    // $ANTLR start "rule__Loop__Group__21__Impl"
    // InternalQuCircuit.g:5384:1: rule__Loop__Group__21__Impl : ( ']' ) ;
    public final void rule__Loop__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5388:1: ( ( ']' ) )
            // InternalQuCircuit.g:5389:1: ( ']' )
            {
            // InternalQuCircuit.g:5389:1: ( ']' )
            // InternalQuCircuit.g:5390:2: ']'
            {
             before(grammarAccess.getLoopAccess().getRightSquareBracketKeyword_21()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getRightSquareBracketKeyword_21()); 

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
    // $ANTLR end "rule__Loop__Group__21__Impl"


    // $ANTLR start "rule__Loop__Group__22"
    // InternalQuCircuit.g:5399:1: rule__Loop__Group__22 : rule__Loop__Group__22__Impl rule__Loop__Group__23 ;
    public final void rule__Loop__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5403:1: ( rule__Loop__Group__22__Impl rule__Loop__Group__23 )
            // InternalQuCircuit.g:5404:2: rule__Loop__Group__22__Impl rule__Loop__Group__23
            {
            pushFollow(FOLLOW_37);
            rule__Loop__Group__22__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__23();

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
    // $ANTLR end "rule__Loop__Group__22"


    // $ANTLR start "rule__Loop__Group__22__Impl"
    // InternalQuCircuit.g:5411:1: rule__Loop__Group__22__Impl : ( ( rule__Loop__Group_22__0 )? ) ;
    public final void rule__Loop__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5415:1: ( ( ( rule__Loop__Group_22__0 )? ) )
            // InternalQuCircuit.g:5416:1: ( ( rule__Loop__Group_22__0 )? )
            {
            // InternalQuCircuit.g:5416:1: ( ( rule__Loop__Group_22__0 )? )
            // InternalQuCircuit.g:5417:2: ( rule__Loop__Group_22__0 )?
            {
             before(grammarAccess.getLoopAccess().getGroup_22()); 
            // InternalQuCircuit.g:5418:2: ( rule__Loop__Group_22__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==33) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalQuCircuit.g:5418:3: rule__Loop__Group_22__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Loop__Group_22__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLoopAccess().getGroup_22()); 

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
    // $ANTLR end "rule__Loop__Group__22__Impl"


    // $ANTLR start "rule__Loop__Group__23"
    // InternalQuCircuit.g:5426:1: rule__Loop__Group__23 : rule__Loop__Group__23__Impl rule__Loop__Group__24 ;
    public final void rule__Loop__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5430:1: ( rule__Loop__Group__23__Impl rule__Loop__Group__24 )
            // InternalQuCircuit.g:5431:2: rule__Loop__Group__23__Impl rule__Loop__Group__24
            {
            pushFollow(FOLLOW_37);
            rule__Loop__Group__23__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__24();

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
    // $ANTLR end "rule__Loop__Group__23"


    // $ANTLR start "rule__Loop__Group__23__Impl"
    // InternalQuCircuit.g:5438:1: rule__Loop__Group__23__Impl : ( ( rule__Loop__Group_23__0 )? ) ;
    public final void rule__Loop__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5442:1: ( ( ( rule__Loop__Group_23__0 )? ) )
            // InternalQuCircuit.g:5443:1: ( ( rule__Loop__Group_23__0 )? )
            {
            // InternalQuCircuit.g:5443:1: ( ( rule__Loop__Group_23__0 )? )
            // InternalQuCircuit.g:5444:2: ( rule__Loop__Group_23__0 )?
            {
             before(grammarAccess.getLoopAccess().getGroup_23()); 
            // InternalQuCircuit.g:5445:2: ( rule__Loop__Group_23__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==51) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalQuCircuit.g:5445:3: rule__Loop__Group_23__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Loop__Group_23__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLoopAccess().getGroup_23()); 

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
    // $ANTLR end "rule__Loop__Group__23__Impl"


    // $ANTLR start "rule__Loop__Group__24"
    // InternalQuCircuit.g:5453:1: rule__Loop__Group__24 : rule__Loop__Group__24__Impl rule__Loop__Group__25 ;
    public final void rule__Loop__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5457:1: ( rule__Loop__Group__24__Impl rule__Loop__Group__25 )
            // InternalQuCircuit.g:5458:2: rule__Loop__Group__24__Impl rule__Loop__Group__25
            {
            pushFollow(FOLLOW_37);
            rule__Loop__Group__24__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__25();

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
    // $ANTLR end "rule__Loop__Group__24"


    // $ANTLR start "rule__Loop__Group__24__Impl"
    // InternalQuCircuit.g:5465:1: rule__Loop__Group__24__Impl : ( ( rule__Loop__Group_24__0 )? ) ;
    public final void rule__Loop__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5469:1: ( ( ( rule__Loop__Group_24__0 )? ) )
            // InternalQuCircuit.g:5470:1: ( ( rule__Loop__Group_24__0 )? )
            {
            // InternalQuCircuit.g:5470:1: ( ( rule__Loop__Group_24__0 )? )
            // InternalQuCircuit.g:5471:2: ( rule__Loop__Group_24__0 )?
            {
             before(grammarAccess.getLoopAccess().getGroup_24()); 
            // InternalQuCircuit.g:5472:2: ( rule__Loop__Group_24__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==52) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalQuCircuit.g:5472:3: rule__Loop__Group_24__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Loop__Group_24__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLoopAccess().getGroup_24()); 

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
    // $ANTLR end "rule__Loop__Group__24__Impl"


    // $ANTLR start "rule__Loop__Group__25"
    // InternalQuCircuit.g:5480:1: rule__Loop__Group__25 : rule__Loop__Group__25__Impl rule__Loop__Group__26 ;
    public final void rule__Loop__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5484:1: ( rule__Loop__Group__25__Impl rule__Loop__Group__26 )
            // InternalQuCircuit.g:5485:2: rule__Loop__Group__25__Impl rule__Loop__Group__26
            {
            pushFollow(FOLLOW_3);
            rule__Loop__Group__25__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__26();

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
    // $ANTLR end "rule__Loop__Group__25"


    // $ANTLR start "rule__Loop__Group__25__Impl"
    // InternalQuCircuit.g:5492:1: rule__Loop__Group__25__Impl : ( 'loop' ) ;
    public final void rule__Loop__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5496:1: ( ( 'loop' ) )
            // InternalQuCircuit.g:5497:1: ( 'loop' )
            {
            // InternalQuCircuit.g:5497:1: ( 'loop' )
            // InternalQuCircuit.g:5498:2: 'loop'
            {
             before(grammarAccess.getLoopAccess().getLoopKeyword_25()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getLoopKeyword_25()); 

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
    // $ANTLR end "rule__Loop__Group__25__Impl"


    // $ANTLR start "rule__Loop__Group__26"
    // InternalQuCircuit.g:5507:1: rule__Loop__Group__26 : rule__Loop__Group__26__Impl rule__Loop__Group__27 ;
    public final void rule__Loop__Group__26() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5511:1: ( rule__Loop__Group__26__Impl rule__Loop__Group__27 )
            // InternalQuCircuit.g:5512:2: rule__Loop__Group__26__Impl rule__Loop__Group__27
            {
            pushFollow(FOLLOW_38);
            rule__Loop__Group__26__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__27();

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
    // $ANTLR end "rule__Loop__Group__26"


    // $ANTLR start "rule__Loop__Group__26__Impl"
    // InternalQuCircuit.g:5519:1: rule__Loop__Group__26__Impl : ( ( rule__Loop__LoopAssignment_26 ) ) ;
    public final void rule__Loop__Group__26__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5523:1: ( ( ( rule__Loop__LoopAssignment_26 ) ) )
            // InternalQuCircuit.g:5524:1: ( ( rule__Loop__LoopAssignment_26 ) )
            {
            // InternalQuCircuit.g:5524:1: ( ( rule__Loop__LoopAssignment_26 ) )
            // InternalQuCircuit.g:5525:2: ( rule__Loop__LoopAssignment_26 )
            {
             before(grammarAccess.getLoopAccess().getLoopAssignment_26()); 
            // InternalQuCircuit.g:5526:2: ( rule__Loop__LoopAssignment_26 )
            // InternalQuCircuit.g:5526:3: rule__Loop__LoopAssignment_26
            {
            pushFollow(FOLLOW_2);
            rule__Loop__LoopAssignment_26();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getLoopAssignment_26()); 

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
    // $ANTLR end "rule__Loop__Group__26__Impl"


    // $ANTLR start "rule__Loop__Group__27"
    // InternalQuCircuit.g:5534:1: rule__Loop__Group__27 : rule__Loop__Group__27__Impl rule__Loop__Group__28 ;
    public final void rule__Loop__Group__27() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5538:1: ( rule__Loop__Group__27__Impl rule__Loop__Group__28 )
            // InternalQuCircuit.g:5539:2: rule__Loop__Group__27__Impl rule__Loop__Group__28
            {
            pushFollow(FOLLOW_23);
            rule__Loop__Group__27__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__28();

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
    // $ANTLR end "rule__Loop__Group__27"


    // $ANTLR start "rule__Loop__Group__27__Impl"
    // InternalQuCircuit.g:5546:1: rule__Loop__Group__27__Impl : ( 'loopTargetQubits' ) ;
    public final void rule__Loop__Group__27__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5550:1: ( ( 'loopTargetQubits' ) )
            // InternalQuCircuit.g:5551:1: ( 'loopTargetQubits' )
            {
            // InternalQuCircuit.g:5551:1: ( 'loopTargetQubits' )
            // InternalQuCircuit.g:5552:2: 'loopTargetQubits'
            {
             before(grammarAccess.getLoopAccess().getLoopTargetQubitsKeyword_27()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getLoopTargetQubitsKeyword_27()); 

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
    // $ANTLR end "rule__Loop__Group__27__Impl"


    // $ANTLR start "rule__Loop__Group__28"
    // InternalQuCircuit.g:5561:1: rule__Loop__Group__28 : rule__Loop__Group__28__Impl rule__Loop__Group__29 ;
    public final void rule__Loop__Group__28() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5565:1: ( rule__Loop__Group__28__Impl rule__Loop__Group__29 )
            // InternalQuCircuit.g:5566:2: rule__Loop__Group__28__Impl rule__Loop__Group__29
            {
            pushFollow(FOLLOW_14);
            rule__Loop__Group__28__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__29();

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
    // $ANTLR end "rule__Loop__Group__28"


    // $ANTLR start "rule__Loop__Group__28__Impl"
    // InternalQuCircuit.g:5573:1: rule__Loop__Group__28__Impl : ( '[' ) ;
    public final void rule__Loop__Group__28__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5577:1: ( ( '[' ) )
            // InternalQuCircuit.g:5578:1: ( '[' )
            {
            // InternalQuCircuit.g:5578:1: ( '[' )
            // InternalQuCircuit.g:5579:2: '['
            {
             before(grammarAccess.getLoopAccess().getLeftSquareBracketKeyword_28()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getLeftSquareBracketKeyword_28()); 

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
    // $ANTLR end "rule__Loop__Group__28__Impl"


    // $ANTLR start "rule__Loop__Group__29"
    // InternalQuCircuit.g:5588:1: rule__Loop__Group__29 : rule__Loop__Group__29__Impl rule__Loop__Group__30 ;
    public final void rule__Loop__Group__29() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5592:1: ( rule__Loop__Group__29__Impl rule__Loop__Group__30 )
            // InternalQuCircuit.g:5593:2: rule__Loop__Group__29__Impl rule__Loop__Group__30
            {
            pushFollow(FOLLOW_24);
            rule__Loop__Group__29__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__30();

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
    // $ANTLR end "rule__Loop__Group__29"


    // $ANTLR start "rule__Loop__Group__29__Impl"
    // InternalQuCircuit.g:5600:1: rule__Loop__Group__29__Impl : ( '(' ) ;
    public final void rule__Loop__Group__29__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5604:1: ( ( '(' ) )
            // InternalQuCircuit.g:5605:1: ( '(' )
            {
            // InternalQuCircuit.g:5605:1: ( '(' )
            // InternalQuCircuit.g:5606:2: '('
            {
             before(grammarAccess.getLoopAccess().getLeftParenthesisKeyword_29()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getLeftParenthesisKeyword_29()); 

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
    // $ANTLR end "rule__Loop__Group__29__Impl"


    // $ANTLR start "rule__Loop__Group__30"
    // InternalQuCircuit.g:5615:1: rule__Loop__Group__30 : rule__Loop__Group__30__Impl rule__Loop__Group__31 ;
    public final void rule__Loop__Group__30() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5619:1: ( rule__Loop__Group__30__Impl rule__Loop__Group__31 )
            // InternalQuCircuit.g:5620:2: rule__Loop__Group__30__Impl rule__Loop__Group__31
            {
            pushFollow(FOLLOW_15);
            rule__Loop__Group__30__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__31();

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
    // $ANTLR end "rule__Loop__Group__30"


    // $ANTLR start "rule__Loop__Group__30__Impl"
    // InternalQuCircuit.g:5627:1: rule__Loop__Group__30__Impl : ( ( rule__Loop__LoopTargetQubitsAssignment_30 ) ) ;
    public final void rule__Loop__Group__30__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5631:1: ( ( ( rule__Loop__LoopTargetQubitsAssignment_30 ) ) )
            // InternalQuCircuit.g:5632:1: ( ( rule__Loop__LoopTargetQubitsAssignment_30 ) )
            {
            // InternalQuCircuit.g:5632:1: ( ( rule__Loop__LoopTargetQubitsAssignment_30 ) )
            // InternalQuCircuit.g:5633:2: ( rule__Loop__LoopTargetQubitsAssignment_30 )
            {
             before(grammarAccess.getLoopAccess().getLoopTargetQubitsAssignment_30()); 
            // InternalQuCircuit.g:5634:2: ( rule__Loop__LoopTargetQubitsAssignment_30 )
            // InternalQuCircuit.g:5634:3: rule__Loop__LoopTargetQubitsAssignment_30
            {
            pushFollow(FOLLOW_2);
            rule__Loop__LoopTargetQubitsAssignment_30();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getLoopTargetQubitsAssignment_30()); 

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
    // $ANTLR end "rule__Loop__Group__30__Impl"


    // $ANTLR start "rule__Loop__Group__31"
    // InternalQuCircuit.g:5642:1: rule__Loop__Group__31 : rule__Loop__Group__31__Impl rule__Loop__Group__32 ;
    public final void rule__Loop__Group__31() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5646:1: ( rule__Loop__Group__31__Impl rule__Loop__Group__32 )
            // InternalQuCircuit.g:5647:2: rule__Loop__Group__31__Impl rule__Loop__Group__32
            {
            pushFollow(FOLLOW_25);
            rule__Loop__Group__31__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__32();

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
    // $ANTLR end "rule__Loop__Group__31"


    // $ANTLR start "rule__Loop__Group__31__Impl"
    // InternalQuCircuit.g:5654:1: rule__Loop__Group__31__Impl : ( ')' ) ;
    public final void rule__Loop__Group__31__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5658:1: ( ( ')' ) )
            // InternalQuCircuit.g:5659:1: ( ')' )
            {
            // InternalQuCircuit.g:5659:1: ( ')' )
            // InternalQuCircuit.g:5660:2: ')'
            {
             before(grammarAccess.getLoopAccess().getRightParenthesisKeyword_31()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getRightParenthesisKeyword_31()); 

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
    // $ANTLR end "rule__Loop__Group__31__Impl"


    // $ANTLR start "rule__Loop__Group__32"
    // InternalQuCircuit.g:5669:1: rule__Loop__Group__32 : rule__Loop__Group__32__Impl rule__Loop__Group__33 ;
    public final void rule__Loop__Group__32() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5673:1: ( rule__Loop__Group__32__Impl rule__Loop__Group__33 )
            // InternalQuCircuit.g:5674:2: rule__Loop__Group__32__Impl rule__Loop__Group__33
            {
            pushFollow(FOLLOW_25);
            rule__Loop__Group__32__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__33();

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
    // $ANTLR end "rule__Loop__Group__32"


    // $ANTLR start "rule__Loop__Group__32__Impl"
    // InternalQuCircuit.g:5681:1: rule__Loop__Group__32__Impl : ( ( rule__Loop__Group_32__0 )* ) ;
    public final void rule__Loop__Group__32__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5685:1: ( ( ( rule__Loop__Group_32__0 )* ) )
            // InternalQuCircuit.g:5686:1: ( ( rule__Loop__Group_32__0 )* )
            {
            // InternalQuCircuit.g:5686:1: ( ( rule__Loop__Group_32__0 )* )
            // InternalQuCircuit.g:5687:2: ( rule__Loop__Group_32__0 )*
            {
             before(grammarAccess.getLoopAccess().getGroup_32()); 
            // InternalQuCircuit.g:5688:2: ( rule__Loop__Group_32__0 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==26) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalQuCircuit.g:5688:3: rule__Loop__Group_32__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Loop__Group_32__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

             after(grammarAccess.getLoopAccess().getGroup_32()); 

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
    // $ANTLR end "rule__Loop__Group__32__Impl"


    // $ANTLR start "rule__Loop__Group__33"
    // InternalQuCircuit.g:5696:1: rule__Loop__Group__33 : rule__Loop__Group__33__Impl rule__Loop__Group__34 ;
    public final void rule__Loop__Group__33() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5700:1: ( rule__Loop__Group__33__Impl rule__Loop__Group__34 )
            // InternalQuCircuit.g:5701:2: rule__Loop__Group__33__Impl rule__Loop__Group__34
            {
            pushFollow(FOLLOW_39);
            rule__Loop__Group__33__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__34();

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
    // $ANTLR end "rule__Loop__Group__33"


    // $ANTLR start "rule__Loop__Group__33__Impl"
    // InternalQuCircuit.g:5708:1: rule__Loop__Group__33__Impl : ( ']' ) ;
    public final void rule__Loop__Group__33__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5712:1: ( ( ']' ) )
            // InternalQuCircuit.g:5713:1: ( ']' )
            {
            // InternalQuCircuit.g:5713:1: ( ']' )
            // InternalQuCircuit.g:5714:2: ']'
            {
             before(grammarAccess.getLoopAccess().getRightSquareBracketKeyword_33()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getRightSquareBracketKeyword_33()); 

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
    // $ANTLR end "rule__Loop__Group__33__Impl"


    // $ANTLR start "rule__Loop__Group__34"
    // InternalQuCircuit.g:5723:1: rule__Loop__Group__34 : rule__Loop__Group__34__Impl rule__Loop__Group__35 ;
    public final void rule__Loop__Group__34() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5727:1: ( rule__Loop__Group__34__Impl rule__Loop__Group__35 )
            // InternalQuCircuit.g:5728:2: rule__Loop__Group__34__Impl rule__Loop__Group__35
            {
            pushFollow(FOLLOW_39);
            rule__Loop__Group__34__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group__35();

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
    // $ANTLR end "rule__Loop__Group__34"


    // $ANTLR start "rule__Loop__Group__34__Impl"
    // InternalQuCircuit.g:5735:1: rule__Loop__Group__34__Impl : ( ( rule__Loop__Group_34__0 )? ) ;
    public final void rule__Loop__Group__34__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5739:1: ( ( ( rule__Loop__Group_34__0 )? ) )
            // InternalQuCircuit.g:5740:1: ( ( rule__Loop__Group_34__0 )? )
            {
            // InternalQuCircuit.g:5740:1: ( ( rule__Loop__Group_34__0 )? )
            // InternalQuCircuit.g:5741:2: ( rule__Loop__Group_34__0 )?
            {
             before(grammarAccess.getLoopAccess().getGroup_34()); 
            // InternalQuCircuit.g:5742:2: ( rule__Loop__Group_34__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==53) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalQuCircuit.g:5742:3: rule__Loop__Group_34__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Loop__Group_34__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLoopAccess().getGroup_34()); 

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
    // $ANTLR end "rule__Loop__Group__34__Impl"


    // $ANTLR start "rule__Loop__Group__35"
    // InternalQuCircuit.g:5750:1: rule__Loop__Group__35 : rule__Loop__Group__35__Impl ;
    public final void rule__Loop__Group__35() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5754:1: ( rule__Loop__Group__35__Impl )
            // InternalQuCircuit.g:5755:2: rule__Loop__Group__35__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Loop__Group__35__Impl();

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
    // $ANTLR end "rule__Loop__Group__35"


    // $ANTLR start "rule__Loop__Group__35__Impl"
    // InternalQuCircuit.g:5761:1: rule__Loop__Group__35__Impl : ( '}' ) ;
    public final void rule__Loop__Group__35__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5765:1: ( ( '}' ) )
            // InternalQuCircuit.g:5766:1: ( '}' )
            {
            // InternalQuCircuit.g:5766:1: ( '}' )
            // InternalQuCircuit.g:5767:2: '}'
            {
             before(grammarAccess.getLoopAccess().getRightCurlyBracketKeyword_35()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getRightCurlyBracketKeyword_35()); 

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
    // $ANTLR end "rule__Loop__Group__35__Impl"


    // $ANTLR start "rule__Loop__Group_6__0"
    // InternalQuCircuit.g:5777:1: rule__Loop__Group_6__0 : rule__Loop__Group_6__0__Impl rule__Loop__Group_6__1 ;
    public final void rule__Loop__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5781:1: ( rule__Loop__Group_6__0__Impl rule__Loop__Group_6__1 )
            // InternalQuCircuit.g:5782:2: rule__Loop__Group_6__0__Impl rule__Loop__Group_6__1
            {
            pushFollow(FOLLOW_13);
            rule__Loop__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_6__1();

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
    // $ANTLR end "rule__Loop__Group_6__0"


    // $ANTLR start "rule__Loop__Group_6__0__Impl"
    // InternalQuCircuit.g:5789:1: rule__Loop__Group_6__0__Impl : ( 'iterations' ) ;
    public final void rule__Loop__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5793:1: ( ( 'iterations' ) )
            // InternalQuCircuit.g:5794:1: ( 'iterations' )
            {
            // InternalQuCircuit.g:5794:1: ( 'iterations' )
            // InternalQuCircuit.g:5795:2: 'iterations'
            {
             before(grammarAccess.getLoopAccess().getIterationsKeyword_6_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getIterationsKeyword_6_0()); 

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
    // $ANTLR end "rule__Loop__Group_6__0__Impl"


    // $ANTLR start "rule__Loop__Group_6__1"
    // InternalQuCircuit.g:5804:1: rule__Loop__Group_6__1 : rule__Loop__Group_6__1__Impl ;
    public final void rule__Loop__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5808:1: ( rule__Loop__Group_6__1__Impl )
            // InternalQuCircuit.g:5809:2: rule__Loop__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Loop__Group_6__1__Impl();

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
    // $ANTLR end "rule__Loop__Group_6__1"


    // $ANTLR start "rule__Loop__Group_6__1__Impl"
    // InternalQuCircuit.g:5815:1: rule__Loop__Group_6__1__Impl : ( ( rule__Loop__IterationsAssignment_6_1 ) ) ;
    public final void rule__Loop__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5819:1: ( ( ( rule__Loop__IterationsAssignment_6_1 ) ) )
            // InternalQuCircuit.g:5820:1: ( ( rule__Loop__IterationsAssignment_6_1 ) )
            {
            // InternalQuCircuit.g:5820:1: ( ( rule__Loop__IterationsAssignment_6_1 ) )
            // InternalQuCircuit.g:5821:2: ( rule__Loop__IterationsAssignment_6_1 )
            {
             before(grammarAccess.getLoopAccess().getIterationsAssignment_6_1()); 
            // InternalQuCircuit.g:5822:2: ( rule__Loop__IterationsAssignment_6_1 )
            // InternalQuCircuit.g:5822:3: rule__Loop__IterationsAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Loop__IterationsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getIterationsAssignment_6_1()); 

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
    // $ANTLR end "rule__Loop__Group_6__1__Impl"


    // $ANTLR start "rule__Loop__Group_9__0"
    // InternalQuCircuit.g:5831:1: rule__Loop__Group_9__0 : rule__Loop__Group_9__0__Impl rule__Loop__Group_9__1 ;
    public final void rule__Loop__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5835:1: ( rule__Loop__Group_9__0__Impl rule__Loop__Group_9__1 )
            // InternalQuCircuit.g:5836:2: rule__Loop__Group_9__0__Impl rule__Loop__Group_9__1
            {
            pushFollow(FOLLOW_13);
            rule__Loop__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_9__1();

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
    // $ANTLR end "rule__Loop__Group_9__0"


    // $ANTLR start "rule__Loop__Group_9__0__Impl"
    // InternalQuCircuit.g:5843:1: rule__Loop__Group_9__0__Impl : ( 'targetQubitsBlockSize' ) ;
    public final void rule__Loop__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5847:1: ( ( 'targetQubitsBlockSize' ) )
            // InternalQuCircuit.g:5848:1: ( 'targetQubitsBlockSize' )
            {
            // InternalQuCircuit.g:5848:1: ( 'targetQubitsBlockSize' )
            // InternalQuCircuit.g:5849:2: 'targetQubitsBlockSize'
            {
             before(grammarAccess.getLoopAccess().getTargetQubitsBlockSizeKeyword_9_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getTargetQubitsBlockSizeKeyword_9_0()); 

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
    // $ANTLR end "rule__Loop__Group_9__0__Impl"


    // $ANTLR start "rule__Loop__Group_9__1"
    // InternalQuCircuit.g:5858:1: rule__Loop__Group_9__1 : rule__Loop__Group_9__1__Impl ;
    public final void rule__Loop__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5862:1: ( rule__Loop__Group_9__1__Impl )
            // InternalQuCircuit.g:5863:2: rule__Loop__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Loop__Group_9__1__Impl();

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
    // $ANTLR end "rule__Loop__Group_9__1"


    // $ANTLR start "rule__Loop__Group_9__1__Impl"
    // InternalQuCircuit.g:5869:1: rule__Loop__Group_9__1__Impl : ( ( rule__Loop__TargetQubitsBlockSizeAssignment_9_1 ) ) ;
    public final void rule__Loop__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5873:1: ( ( ( rule__Loop__TargetQubitsBlockSizeAssignment_9_1 ) ) )
            // InternalQuCircuit.g:5874:1: ( ( rule__Loop__TargetQubitsBlockSizeAssignment_9_1 ) )
            {
            // InternalQuCircuit.g:5874:1: ( ( rule__Loop__TargetQubitsBlockSizeAssignment_9_1 ) )
            // InternalQuCircuit.g:5875:2: ( rule__Loop__TargetQubitsBlockSizeAssignment_9_1 )
            {
             before(grammarAccess.getLoopAccess().getTargetQubitsBlockSizeAssignment_9_1()); 
            // InternalQuCircuit.g:5876:2: ( rule__Loop__TargetQubitsBlockSizeAssignment_9_1 )
            // InternalQuCircuit.g:5876:3: rule__Loop__TargetQubitsBlockSizeAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__Loop__TargetQubitsBlockSizeAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getTargetQubitsBlockSizeAssignment_9_1()); 

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
    // $ANTLR end "rule__Loop__Group_9__1__Impl"


    // $ANTLR start "rule__Loop__Group_10__0"
    // InternalQuCircuit.g:5885:1: rule__Loop__Group_10__0 : rule__Loop__Group_10__0__Impl rule__Loop__Group_10__1 ;
    public final void rule__Loop__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5889:1: ( rule__Loop__Group_10__0__Impl rule__Loop__Group_10__1 )
            // InternalQuCircuit.g:5890:2: rule__Loop__Group_10__0__Impl rule__Loop__Group_10__1
            {
            pushFollow(FOLLOW_13);
            rule__Loop__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_10__1();

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
    // $ANTLR end "rule__Loop__Group_10__0"


    // $ANTLR start "rule__Loop__Group_10__0__Impl"
    // InternalQuCircuit.g:5897:1: rule__Loop__Group_10__0__Impl : ( 'controlQubitsBlockSize' ) ;
    public final void rule__Loop__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5901:1: ( ( 'controlQubitsBlockSize' ) )
            // InternalQuCircuit.g:5902:1: ( 'controlQubitsBlockSize' )
            {
            // InternalQuCircuit.g:5902:1: ( 'controlQubitsBlockSize' )
            // InternalQuCircuit.g:5903:2: 'controlQubitsBlockSize'
            {
             before(grammarAccess.getLoopAccess().getControlQubitsBlockSizeKeyword_10_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getControlQubitsBlockSizeKeyword_10_0()); 

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
    // $ANTLR end "rule__Loop__Group_10__0__Impl"


    // $ANTLR start "rule__Loop__Group_10__1"
    // InternalQuCircuit.g:5912:1: rule__Loop__Group_10__1 : rule__Loop__Group_10__1__Impl ;
    public final void rule__Loop__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5916:1: ( rule__Loop__Group_10__1__Impl )
            // InternalQuCircuit.g:5917:2: rule__Loop__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Loop__Group_10__1__Impl();

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
    // $ANTLR end "rule__Loop__Group_10__1"


    // $ANTLR start "rule__Loop__Group_10__1__Impl"
    // InternalQuCircuit.g:5923:1: rule__Loop__Group_10__1__Impl : ( ( rule__Loop__ControlQubitsBlockSizeAssignment_10_1 ) ) ;
    public final void rule__Loop__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5927:1: ( ( ( rule__Loop__ControlQubitsBlockSizeAssignment_10_1 ) ) )
            // InternalQuCircuit.g:5928:1: ( ( rule__Loop__ControlQubitsBlockSizeAssignment_10_1 ) )
            {
            // InternalQuCircuit.g:5928:1: ( ( rule__Loop__ControlQubitsBlockSizeAssignment_10_1 ) )
            // InternalQuCircuit.g:5929:2: ( rule__Loop__ControlQubitsBlockSizeAssignment_10_1 )
            {
             before(grammarAccess.getLoopAccess().getControlQubitsBlockSizeAssignment_10_1()); 
            // InternalQuCircuit.g:5930:2: ( rule__Loop__ControlQubitsBlockSizeAssignment_10_1 )
            // InternalQuCircuit.g:5930:3: rule__Loop__ControlQubitsBlockSizeAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__Loop__ControlQubitsBlockSizeAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getControlQubitsBlockSizeAssignment_10_1()); 

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
    // $ANTLR end "rule__Loop__Group_10__1__Impl"


    // $ANTLR start "rule__Loop__Group_11__0"
    // InternalQuCircuit.g:5939:1: rule__Loop__Group_11__0 : rule__Loop__Group_11__0__Impl rule__Loop__Group_11__1 ;
    public final void rule__Loop__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5943:1: ( rule__Loop__Group_11__0__Impl rule__Loop__Group_11__1 )
            // InternalQuCircuit.g:5944:2: rule__Loop__Group_11__0__Impl rule__Loop__Group_11__1
            {
            pushFollow(FOLLOW_40);
            rule__Loop__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_11__1();

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
    // $ANTLR end "rule__Loop__Group_11__0"


    // $ANTLR start "rule__Loop__Group_11__0__Impl"
    // InternalQuCircuit.g:5951:1: rule__Loop__Group_11__0__Impl : ( 'controlQubitsIterationType' ) ;
    public final void rule__Loop__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5955:1: ( ( 'controlQubitsIterationType' ) )
            // InternalQuCircuit.g:5956:1: ( 'controlQubitsIterationType' )
            {
            // InternalQuCircuit.g:5956:1: ( 'controlQubitsIterationType' )
            // InternalQuCircuit.g:5957:2: 'controlQubitsIterationType'
            {
             before(grammarAccess.getLoopAccess().getControlQubitsIterationTypeKeyword_11_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getControlQubitsIterationTypeKeyword_11_0()); 

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
    // $ANTLR end "rule__Loop__Group_11__0__Impl"


    // $ANTLR start "rule__Loop__Group_11__1"
    // InternalQuCircuit.g:5966:1: rule__Loop__Group_11__1 : rule__Loop__Group_11__1__Impl ;
    public final void rule__Loop__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5970:1: ( rule__Loop__Group_11__1__Impl )
            // InternalQuCircuit.g:5971:2: rule__Loop__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Loop__Group_11__1__Impl();

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
    // $ANTLR end "rule__Loop__Group_11__1"


    // $ANTLR start "rule__Loop__Group_11__1__Impl"
    // InternalQuCircuit.g:5977:1: rule__Loop__Group_11__1__Impl : ( ( rule__Loop__ControlQubitsIterationTypeAssignment_11_1 ) ) ;
    public final void rule__Loop__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5981:1: ( ( ( rule__Loop__ControlQubitsIterationTypeAssignment_11_1 ) ) )
            // InternalQuCircuit.g:5982:1: ( ( rule__Loop__ControlQubitsIterationTypeAssignment_11_1 ) )
            {
            // InternalQuCircuit.g:5982:1: ( ( rule__Loop__ControlQubitsIterationTypeAssignment_11_1 ) )
            // InternalQuCircuit.g:5983:2: ( rule__Loop__ControlQubitsIterationTypeAssignment_11_1 )
            {
             before(grammarAccess.getLoopAccess().getControlQubitsIterationTypeAssignment_11_1()); 
            // InternalQuCircuit.g:5984:2: ( rule__Loop__ControlQubitsIterationTypeAssignment_11_1 )
            // InternalQuCircuit.g:5984:3: rule__Loop__ControlQubitsIterationTypeAssignment_11_1
            {
            pushFollow(FOLLOW_2);
            rule__Loop__ControlQubitsIterationTypeAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getControlQubitsIterationTypeAssignment_11_1()); 

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
    // $ANTLR end "rule__Loop__Group_11__1__Impl"


    // $ANTLR start "rule__Loop__Group_12__0"
    // InternalQuCircuit.g:5993:1: rule__Loop__Group_12__0 : rule__Loop__Group_12__0__Impl rule__Loop__Group_12__1 ;
    public final void rule__Loop__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:5997:1: ( rule__Loop__Group_12__0__Impl rule__Loop__Group_12__1 )
            // InternalQuCircuit.g:5998:2: rule__Loop__Group_12__0__Impl rule__Loop__Group_12__1
            {
            pushFollow(FOLLOW_40);
            rule__Loop__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_12__1();

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
    // $ANTLR end "rule__Loop__Group_12__0"


    // $ANTLR start "rule__Loop__Group_12__0__Impl"
    // InternalQuCircuit.g:6005:1: rule__Loop__Group_12__0__Impl : ( 'targetQubitsIterationType' ) ;
    public final void rule__Loop__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6009:1: ( ( 'targetQubitsIterationType' ) )
            // InternalQuCircuit.g:6010:1: ( 'targetQubitsIterationType' )
            {
            // InternalQuCircuit.g:6010:1: ( 'targetQubitsIterationType' )
            // InternalQuCircuit.g:6011:2: 'targetQubitsIterationType'
            {
             before(grammarAccess.getLoopAccess().getTargetQubitsIterationTypeKeyword_12_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getTargetQubitsIterationTypeKeyword_12_0()); 

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
    // $ANTLR end "rule__Loop__Group_12__0__Impl"


    // $ANTLR start "rule__Loop__Group_12__1"
    // InternalQuCircuit.g:6020:1: rule__Loop__Group_12__1 : rule__Loop__Group_12__1__Impl ;
    public final void rule__Loop__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6024:1: ( rule__Loop__Group_12__1__Impl )
            // InternalQuCircuit.g:6025:2: rule__Loop__Group_12__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Loop__Group_12__1__Impl();

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
    // $ANTLR end "rule__Loop__Group_12__1"


    // $ANTLR start "rule__Loop__Group_12__1__Impl"
    // InternalQuCircuit.g:6031:1: rule__Loop__Group_12__1__Impl : ( ( rule__Loop__TargetQubitsIterationTypeAssignment_12_1 ) ) ;
    public final void rule__Loop__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6035:1: ( ( ( rule__Loop__TargetQubitsIterationTypeAssignment_12_1 ) ) )
            // InternalQuCircuit.g:6036:1: ( ( rule__Loop__TargetQubitsIterationTypeAssignment_12_1 ) )
            {
            // InternalQuCircuit.g:6036:1: ( ( rule__Loop__TargetQubitsIterationTypeAssignment_12_1 ) )
            // InternalQuCircuit.g:6037:2: ( rule__Loop__TargetQubitsIterationTypeAssignment_12_1 )
            {
             before(grammarAccess.getLoopAccess().getTargetQubitsIterationTypeAssignment_12_1()); 
            // InternalQuCircuit.g:6038:2: ( rule__Loop__TargetQubitsIterationTypeAssignment_12_1 )
            // InternalQuCircuit.g:6038:3: rule__Loop__TargetQubitsIterationTypeAssignment_12_1
            {
            pushFollow(FOLLOW_2);
            rule__Loop__TargetQubitsIterationTypeAssignment_12_1();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getTargetQubitsIterationTypeAssignment_12_1()); 

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
    // $ANTLR end "rule__Loop__Group_12__1__Impl"


    // $ANTLR start "rule__Loop__Group_13__0"
    // InternalQuCircuit.g:6047:1: rule__Loop__Group_13__0 : rule__Loop__Group_13__0__Impl rule__Loop__Group_13__1 ;
    public final void rule__Loop__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6051:1: ( rule__Loop__Group_13__0__Impl rule__Loop__Group_13__1 )
            // InternalQuCircuit.g:6052:2: rule__Loop__Group_13__0__Impl rule__Loop__Group_13__1
            {
            pushFollow(FOLLOW_13);
            rule__Loop__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_13__1();

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
    // $ANTLR end "rule__Loop__Group_13__0"


    // $ANTLR start "rule__Loop__Group_13__0__Impl"
    // InternalQuCircuit.g:6059:1: rule__Loop__Group_13__0__Impl : ( 'incrementBy' ) ;
    public final void rule__Loop__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6063:1: ( ( 'incrementBy' ) )
            // InternalQuCircuit.g:6064:1: ( 'incrementBy' )
            {
            // InternalQuCircuit.g:6064:1: ( 'incrementBy' )
            // InternalQuCircuit.g:6065:2: 'incrementBy'
            {
             before(grammarAccess.getLoopAccess().getIncrementByKeyword_13_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getIncrementByKeyword_13_0()); 

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
    // $ANTLR end "rule__Loop__Group_13__0__Impl"


    // $ANTLR start "rule__Loop__Group_13__1"
    // InternalQuCircuit.g:6074:1: rule__Loop__Group_13__1 : rule__Loop__Group_13__1__Impl ;
    public final void rule__Loop__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6078:1: ( rule__Loop__Group_13__1__Impl )
            // InternalQuCircuit.g:6079:2: rule__Loop__Group_13__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Loop__Group_13__1__Impl();

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
    // $ANTLR end "rule__Loop__Group_13__1"


    // $ANTLR start "rule__Loop__Group_13__1__Impl"
    // InternalQuCircuit.g:6085:1: rule__Loop__Group_13__1__Impl : ( ( rule__Loop__IncrementByAssignment_13_1 ) ) ;
    public final void rule__Loop__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6089:1: ( ( ( rule__Loop__IncrementByAssignment_13_1 ) ) )
            // InternalQuCircuit.g:6090:1: ( ( rule__Loop__IncrementByAssignment_13_1 ) )
            {
            // InternalQuCircuit.g:6090:1: ( ( rule__Loop__IncrementByAssignment_13_1 ) )
            // InternalQuCircuit.g:6091:2: ( rule__Loop__IncrementByAssignment_13_1 )
            {
             before(grammarAccess.getLoopAccess().getIncrementByAssignment_13_1()); 
            // InternalQuCircuit.g:6092:2: ( rule__Loop__IncrementByAssignment_13_1 )
            // InternalQuCircuit.g:6092:3: rule__Loop__IncrementByAssignment_13_1
            {
            pushFollow(FOLLOW_2);
            rule__Loop__IncrementByAssignment_13_1();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getIncrementByAssignment_13_1()); 

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
    // $ANTLR end "rule__Loop__Group_13__1__Impl"


    // $ANTLR start "rule__Loop__Group_14__0"
    // InternalQuCircuit.g:6101:1: rule__Loop__Group_14__0 : rule__Loop__Group_14__0__Impl rule__Loop__Group_14__1 ;
    public final void rule__Loop__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6105:1: ( rule__Loop__Group_14__0__Impl rule__Loop__Group_14__1 )
            // InternalQuCircuit.g:6106:2: rule__Loop__Group_14__0__Impl rule__Loop__Group_14__1
            {
            pushFollow(FOLLOW_14);
            rule__Loop__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_14__1();

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
    // $ANTLR end "rule__Loop__Group_14__0"


    // $ANTLR start "rule__Loop__Group_14__0__Impl"
    // InternalQuCircuit.g:6113:1: rule__Loop__Group_14__0__Impl : ( 'operations' ) ;
    public final void rule__Loop__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6117:1: ( ( 'operations' ) )
            // InternalQuCircuit.g:6118:1: ( 'operations' )
            {
            // InternalQuCircuit.g:6118:1: ( 'operations' )
            // InternalQuCircuit.g:6119:2: 'operations'
            {
             before(grammarAccess.getLoopAccess().getOperationsKeyword_14_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getOperationsKeyword_14_0()); 

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
    // $ANTLR end "rule__Loop__Group_14__0__Impl"


    // $ANTLR start "rule__Loop__Group_14__1"
    // InternalQuCircuit.g:6128:1: rule__Loop__Group_14__1 : rule__Loop__Group_14__1__Impl rule__Loop__Group_14__2 ;
    public final void rule__Loop__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6132:1: ( rule__Loop__Group_14__1__Impl rule__Loop__Group_14__2 )
            // InternalQuCircuit.g:6133:2: rule__Loop__Group_14__1__Impl rule__Loop__Group_14__2
            {
            pushFollow(FOLLOW_3);
            rule__Loop__Group_14__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_14__2();

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
    // $ANTLR end "rule__Loop__Group_14__1"


    // $ANTLR start "rule__Loop__Group_14__1__Impl"
    // InternalQuCircuit.g:6140:1: rule__Loop__Group_14__1__Impl : ( '(' ) ;
    public final void rule__Loop__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6144:1: ( ( '(' ) )
            // InternalQuCircuit.g:6145:1: ( '(' )
            {
            // InternalQuCircuit.g:6145:1: ( '(' )
            // InternalQuCircuit.g:6146:2: '('
            {
             before(grammarAccess.getLoopAccess().getLeftParenthesisKeyword_14_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getLeftParenthesisKeyword_14_1()); 

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
    // $ANTLR end "rule__Loop__Group_14__1__Impl"


    // $ANTLR start "rule__Loop__Group_14__2"
    // InternalQuCircuit.g:6155:1: rule__Loop__Group_14__2 : rule__Loop__Group_14__2__Impl rule__Loop__Group_14__3 ;
    public final void rule__Loop__Group_14__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6159:1: ( rule__Loop__Group_14__2__Impl rule__Loop__Group_14__3 )
            // InternalQuCircuit.g:6160:2: rule__Loop__Group_14__2__Impl rule__Loop__Group_14__3
            {
            pushFollow(FOLLOW_41);
            rule__Loop__Group_14__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_14__3();

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
    // $ANTLR end "rule__Loop__Group_14__2"


    // $ANTLR start "rule__Loop__Group_14__2__Impl"
    // InternalQuCircuit.g:6167:1: rule__Loop__Group_14__2__Impl : ( ( rule__Loop__OperationsAssignment_14_2 ) ) ;
    public final void rule__Loop__Group_14__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6171:1: ( ( ( rule__Loop__OperationsAssignment_14_2 ) ) )
            // InternalQuCircuit.g:6172:1: ( ( rule__Loop__OperationsAssignment_14_2 ) )
            {
            // InternalQuCircuit.g:6172:1: ( ( rule__Loop__OperationsAssignment_14_2 ) )
            // InternalQuCircuit.g:6173:2: ( rule__Loop__OperationsAssignment_14_2 )
            {
             before(grammarAccess.getLoopAccess().getOperationsAssignment_14_2()); 
            // InternalQuCircuit.g:6174:2: ( rule__Loop__OperationsAssignment_14_2 )
            // InternalQuCircuit.g:6174:3: rule__Loop__OperationsAssignment_14_2
            {
            pushFollow(FOLLOW_2);
            rule__Loop__OperationsAssignment_14_2();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getOperationsAssignment_14_2()); 

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
    // $ANTLR end "rule__Loop__Group_14__2__Impl"


    // $ANTLR start "rule__Loop__Group_14__3"
    // InternalQuCircuit.g:6182:1: rule__Loop__Group_14__3 : rule__Loop__Group_14__3__Impl rule__Loop__Group_14__4 ;
    public final void rule__Loop__Group_14__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6186:1: ( rule__Loop__Group_14__3__Impl rule__Loop__Group_14__4 )
            // InternalQuCircuit.g:6187:2: rule__Loop__Group_14__3__Impl rule__Loop__Group_14__4
            {
            pushFollow(FOLLOW_41);
            rule__Loop__Group_14__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_14__4();

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
    // $ANTLR end "rule__Loop__Group_14__3"


    // $ANTLR start "rule__Loop__Group_14__3__Impl"
    // InternalQuCircuit.g:6194:1: rule__Loop__Group_14__3__Impl : ( ( rule__Loop__Group_14_3__0 )* ) ;
    public final void rule__Loop__Group_14__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6198:1: ( ( ( rule__Loop__Group_14_3__0 )* ) )
            // InternalQuCircuit.g:6199:1: ( ( rule__Loop__Group_14_3__0 )* )
            {
            // InternalQuCircuit.g:6199:1: ( ( rule__Loop__Group_14_3__0 )* )
            // InternalQuCircuit.g:6200:2: ( rule__Loop__Group_14_3__0 )*
            {
             before(grammarAccess.getLoopAccess().getGroup_14_3()); 
            // InternalQuCircuit.g:6201:2: ( rule__Loop__Group_14_3__0 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==26) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalQuCircuit.g:6201:3: rule__Loop__Group_14_3__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Loop__Group_14_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

             after(grammarAccess.getLoopAccess().getGroup_14_3()); 

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
    // $ANTLR end "rule__Loop__Group_14__3__Impl"


    // $ANTLR start "rule__Loop__Group_14__4"
    // InternalQuCircuit.g:6209:1: rule__Loop__Group_14__4 : rule__Loop__Group_14__4__Impl ;
    public final void rule__Loop__Group_14__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6213:1: ( rule__Loop__Group_14__4__Impl )
            // InternalQuCircuit.g:6214:2: rule__Loop__Group_14__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Loop__Group_14__4__Impl();

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
    // $ANTLR end "rule__Loop__Group_14__4"


    // $ANTLR start "rule__Loop__Group_14__4__Impl"
    // InternalQuCircuit.g:6220:1: rule__Loop__Group_14__4__Impl : ( ')' ) ;
    public final void rule__Loop__Group_14__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6224:1: ( ( ')' ) )
            // InternalQuCircuit.g:6225:1: ( ')' )
            {
            // InternalQuCircuit.g:6225:1: ( ')' )
            // InternalQuCircuit.g:6226:2: ')'
            {
             before(grammarAccess.getLoopAccess().getRightParenthesisKeyword_14_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getRightParenthesisKeyword_14_4()); 

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
    // $ANTLR end "rule__Loop__Group_14__4__Impl"


    // $ANTLR start "rule__Loop__Group_14_3__0"
    // InternalQuCircuit.g:6236:1: rule__Loop__Group_14_3__0 : rule__Loop__Group_14_3__0__Impl rule__Loop__Group_14_3__1 ;
    public final void rule__Loop__Group_14_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6240:1: ( rule__Loop__Group_14_3__0__Impl rule__Loop__Group_14_3__1 )
            // InternalQuCircuit.g:6241:2: rule__Loop__Group_14_3__0__Impl rule__Loop__Group_14_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Loop__Group_14_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_14_3__1();

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
    // $ANTLR end "rule__Loop__Group_14_3__0"


    // $ANTLR start "rule__Loop__Group_14_3__0__Impl"
    // InternalQuCircuit.g:6248:1: rule__Loop__Group_14_3__0__Impl : ( ',' ) ;
    public final void rule__Loop__Group_14_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6252:1: ( ( ',' ) )
            // InternalQuCircuit.g:6253:1: ( ',' )
            {
            // InternalQuCircuit.g:6253:1: ( ',' )
            // InternalQuCircuit.g:6254:2: ','
            {
             before(grammarAccess.getLoopAccess().getCommaKeyword_14_3_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getCommaKeyword_14_3_0()); 

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
    // $ANTLR end "rule__Loop__Group_14_3__0__Impl"


    // $ANTLR start "rule__Loop__Group_14_3__1"
    // InternalQuCircuit.g:6263:1: rule__Loop__Group_14_3__1 : rule__Loop__Group_14_3__1__Impl ;
    public final void rule__Loop__Group_14_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6267:1: ( rule__Loop__Group_14_3__1__Impl )
            // InternalQuCircuit.g:6268:2: rule__Loop__Group_14_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Loop__Group_14_3__1__Impl();

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
    // $ANTLR end "rule__Loop__Group_14_3__1"


    // $ANTLR start "rule__Loop__Group_14_3__1__Impl"
    // InternalQuCircuit.g:6274:1: rule__Loop__Group_14_3__1__Impl : ( ( rule__Loop__OperationsAssignment_14_3_1 ) ) ;
    public final void rule__Loop__Group_14_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6278:1: ( ( ( rule__Loop__OperationsAssignment_14_3_1 ) ) )
            // InternalQuCircuit.g:6279:1: ( ( rule__Loop__OperationsAssignment_14_3_1 ) )
            {
            // InternalQuCircuit.g:6279:1: ( ( rule__Loop__OperationsAssignment_14_3_1 ) )
            // InternalQuCircuit.g:6280:2: ( rule__Loop__OperationsAssignment_14_3_1 )
            {
             before(grammarAccess.getLoopAccess().getOperationsAssignment_14_3_1()); 
            // InternalQuCircuit.g:6281:2: ( rule__Loop__OperationsAssignment_14_3_1 )
            // InternalQuCircuit.g:6281:3: rule__Loop__OperationsAssignment_14_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Loop__OperationsAssignment_14_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getOperationsAssignment_14_3_1()); 

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
    // $ANTLR end "rule__Loop__Group_14_3__1__Impl"


    // $ANTLR start "rule__Loop__Group_20__0"
    // InternalQuCircuit.g:6290:1: rule__Loop__Group_20__0 : rule__Loop__Group_20__0__Impl rule__Loop__Group_20__1 ;
    public final void rule__Loop__Group_20__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6294:1: ( rule__Loop__Group_20__0__Impl rule__Loop__Group_20__1 )
            // InternalQuCircuit.g:6295:2: rule__Loop__Group_20__0__Impl rule__Loop__Group_20__1
            {
            pushFollow(FOLLOW_14);
            rule__Loop__Group_20__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_20__1();

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
    // $ANTLR end "rule__Loop__Group_20__0"


    // $ANTLR start "rule__Loop__Group_20__0__Impl"
    // InternalQuCircuit.g:6302:1: rule__Loop__Group_20__0__Impl : ( ',' ) ;
    public final void rule__Loop__Group_20__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6306:1: ( ( ',' ) )
            // InternalQuCircuit.g:6307:1: ( ',' )
            {
            // InternalQuCircuit.g:6307:1: ( ',' )
            // InternalQuCircuit.g:6308:2: ','
            {
             before(grammarAccess.getLoopAccess().getCommaKeyword_20_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getCommaKeyword_20_0()); 

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
    // $ANTLR end "rule__Loop__Group_20__0__Impl"


    // $ANTLR start "rule__Loop__Group_20__1"
    // InternalQuCircuit.g:6317:1: rule__Loop__Group_20__1 : rule__Loop__Group_20__1__Impl rule__Loop__Group_20__2 ;
    public final void rule__Loop__Group_20__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6321:1: ( rule__Loop__Group_20__1__Impl rule__Loop__Group_20__2 )
            // InternalQuCircuit.g:6322:2: rule__Loop__Group_20__1__Impl rule__Loop__Group_20__2
            {
            pushFollow(FOLLOW_24);
            rule__Loop__Group_20__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_20__2();

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
    // $ANTLR end "rule__Loop__Group_20__1"


    // $ANTLR start "rule__Loop__Group_20__1__Impl"
    // InternalQuCircuit.g:6329:1: rule__Loop__Group_20__1__Impl : ( '(' ) ;
    public final void rule__Loop__Group_20__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6333:1: ( ( '(' ) )
            // InternalQuCircuit.g:6334:1: ( '(' )
            {
            // InternalQuCircuit.g:6334:1: ( '(' )
            // InternalQuCircuit.g:6335:2: '('
            {
             before(grammarAccess.getLoopAccess().getLeftParenthesisKeyword_20_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getLeftParenthesisKeyword_20_1()); 

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
    // $ANTLR end "rule__Loop__Group_20__1__Impl"


    // $ANTLR start "rule__Loop__Group_20__2"
    // InternalQuCircuit.g:6344:1: rule__Loop__Group_20__2 : rule__Loop__Group_20__2__Impl rule__Loop__Group_20__3 ;
    public final void rule__Loop__Group_20__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6348:1: ( rule__Loop__Group_20__2__Impl rule__Loop__Group_20__3 )
            // InternalQuCircuit.g:6349:2: rule__Loop__Group_20__2__Impl rule__Loop__Group_20__3
            {
            pushFollow(FOLLOW_15);
            rule__Loop__Group_20__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_20__3();

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
    // $ANTLR end "rule__Loop__Group_20__2"


    // $ANTLR start "rule__Loop__Group_20__2__Impl"
    // InternalQuCircuit.g:6356:1: rule__Loop__Group_20__2__Impl : ( ( rule__Loop__TargetQubitsAssignment_20_2 ) ) ;
    public final void rule__Loop__Group_20__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6360:1: ( ( ( rule__Loop__TargetQubitsAssignment_20_2 ) ) )
            // InternalQuCircuit.g:6361:1: ( ( rule__Loop__TargetQubitsAssignment_20_2 ) )
            {
            // InternalQuCircuit.g:6361:1: ( ( rule__Loop__TargetQubitsAssignment_20_2 ) )
            // InternalQuCircuit.g:6362:2: ( rule__Loop__TargetQubitsAssignment_20_2 )
            {
             before(grammarAccess.getLoopAccess().getTargetQubitsAssignment_20_2()); 
            // InternalQuCircuit.g:6363:2: ( rule__Loop__TargetQubitsAssignment_20_2 )
            // InternalQuCircuit.g:6363:3: rule__Loop__TargetQubitsAssignment_20_2
            {
            pushFollow(FOLLOW_2);
            rule__Loop__TargetQubitsAssignment_20_2();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getTargetQubitsAssignment_20_2()); 

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
    // $ANTLR end "rule__Loop__Group_20__2__Impl"


    // $ANTLR start "rule__Loop__Group_20__3"
    // InternalQuCircuit.g:6371:1: rule__Loop__Group_20__3 : rule__Loop__Group_20__3__Impl ;
    public final void rule__Loop__Group_20__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6375:1: ( rule__Loop__Group_20__3__Impl )
            // InternalQuCircuit.g:6376:2: rule__Loop__Group_20__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Loop__Group_20__3__Impl();

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
    // $ANTLR end "rule__Loop__Group_20__3"


    // $ANTLR start "rule__Loop__Group_20__3__Impl"
    // InternalQuCircuit.g:6382:1: rule__Loop__Group_20__3__Impl : ( ')' ) ;
    public final void rule__Loop__Group_20__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6386:1: ( ( ')' ) )
            // InternalQuCircuit.g:6387:1: ( ')' )
            {
            // InternalQuCircuit.g:6387:1: ( ')' )
            // InternalQuCircuit.g:6388:2: ')'
            {
             before(grammarAccess.getLoopAccess().getRightParenthesisKeyword_20_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getRightParenthesisKeyword_20_3()); 

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
    // $ANTLR end "rule__Loop__Group_20__3__Impl"


    // $ANTLR start "rule__Loop__Group_22__0"
    // InternalQuCircuit.g:6398:1: rule__Loop__Group_22__0 : rule__Loop__Group_22__0__Impl rule__Loop__Group_22__1 ;
    public final void rule__Loop__Group_22__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6402:1: ( rule__Loop__Group_22__0__Impl rule__Loop__Group_22__1 )
            // InternalQuCircuit.g:6403:2: rule__Loop__Group_22__0__Impl rule__Loop__Group_22__1
            {
            pushFollow(FOLLOW_23);
            rule__Loop__Group_22__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_22__1();

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
    // $ANTLR end "rule__Loop__Group_22__0"


    // $ANTLR start "rule__Loop__Group_22__0__Impl"
    // InternalQuCircuit.g:6410:1: rule__Loop__Group_22__0__Impl : ( 'controlQubits' ) ;
    public final void rule__Loop__Group_22__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6414:1: ( ( 'controlQubits' ) )
            // InternalQuCircuit.g:6415:1: ( 'controlQubits' )
            {
            // InternalQuCircuit.g:6415:1: ( 'controlQubits' )
            // InternalQuCircuit.g:6416:2: 'controlQubits'
            {
             before(grammarAccess.getLoopAccess().getControlQubitsKeyword_22_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getControlQubitsKeyword_22_0()); 

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
    // $ANTLR end "rule__Loop__Group_22__0__Impl"


    // $ANTLR start "rule__Loop__Group_22__1"
    // InternalQuCircuit.g:6425:1: rule__Loop__Group_22__1 : rule__Loop__Group_22__1__Impl rule__Loop__Group_22__2 ;
    public final void rule__Loop__Group_22__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6429:1: ( rule__Loop__Group_22__1__Impl rule__Loop__Group_22__2 )
            // InternalQuCircuit.g:6430:2: rule__Loop__Group_22__1__Impl rule__Loop__Group_22__2
            {
            pushFollow(FOLLOW_24);
            rule__Loop__Group_22__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_22__2();

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
    // $ANTLR end "rule__Loop__Group_22__1"


    // $ANTLR start "rule__Loop__Group_22__1__Impl"
    // InternalQuCircuit.g:6437:1: rule__Loop__Group_22__1__Impl : ( '[' ) ;
    public final void rule__Loop__Group_22__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6441:1: ( ( '[' ) )
            // InternalQuCircuit.g:6442:1: ( '[' )
            {
            // InternalQuCircuit.g:6442:1: ( '[' )
            // InternalQuCircuit.g:6443:2: '['
            {
             before(grammarAccess.getLoopAccess().getLeftSquareBracketKeyword_22_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getLeftSquareBracketKeyword_22_1()); 

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
    // $ANTLR end "rule__Loop__Group_22__1__Impl"


    // $ANTLR start "rule__Loop__Group_22__2"
    // InternalQuCircuit.g:6452:1: rule__Loop__Group_22__2 : rule__Loop__Group_22__2__Impl rule__Loop__Group_22__3 ;
    public final void rule__Loop__Group_22__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6456:1: ( rule__Loop__Group_22__2__Impl rule__Loop__Group_22__3 )
            // InternalQuCircuit.g:6457:2: rule__Loop__Group_22__2__Impl rule__Loop__Group_22__3
            {
            pushFollow(FOLLOW_25);
            rule__Loop__Group_22__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_22__3();

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
    // $ANTLR end "rule__Loop__Group_22__2"


    // $ANTLR start "rule__Loop__Group_22__2__Impl"
    // InternalQuCircuit.g:6464:1: rule__Loop__Group_22__2__Impl : ( ( rule__Loop__ControlQubitsAssignment_22_2 ) ) ;
    public final void rule__Loop__Group_22__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6468:1: ( ( ( rule__Loop__ControlQubitsAssignment_22_2 ) ) )
            // InternalQuCircuit.g:6469:1: ( ( rule__Loop__ControlQubitsAssignment_22_2 ) )
            {
            // InternalQuCircuit.g:6469:1: ( ( rule__Loop__ControlQubitsAssignment_22_2 ) )
            // InternalQuCircuit.g:6470:2: ( rule__Loop__ControlQubitsAssignment_22_2 )
            {
             before(grammarAccess.getLoopAccess().getControlQubitsAssignment_22_2()); 
            // InternalQuCircuit.g:6471:2: ( rule__Loop__ControlQubitsAssignment_22_2 )
            // InternalQuCircuit.g:6471:3: rule__Loop__ControlQubitsAssignment_22_2
            {
            pushFollow(FOLLOW_2);
            rule__Loop__ControlQubitsAssignment_22_2();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getControlQubitsAssignment_22_2()); 

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
    // $ANTLR end "rule__Loop__Group_22__2__Impl"


    // $ANTLR start "rule__Loop__Group_22__3"
    // InternalQuCircuit.g:6479:1: rule__Loop__Group_22__3 : rule__Loop__Group_22__3__Impl rule__Loop__Group_22__4 ;
    public final void rule__Loop__Group_22__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6483:1: ( rule__Loop__Group_22__3__Impl rule__Loop__Group_22__4 )
            // InternalQuCircuit.g:6484:2: rule__Loop__Group_22__3__Impl rule__Loop__Group_22__4
            {
            pushFollow(FOLLOW_25);
            rule__Loop__Group_22__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_22__4();

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
    // $ANTLR end "rule__Loop__Group_22__3"


    // $ANTLR start "rule__Loop__Group_22__3__Impl"
    // InternalQuCircuit.g:6491:1: rule__Loop__Group_22__3__Impl : ( ( rule__Loop__Group_22_3__0 )* ) ;
    public final void rule__Loop__Group_22__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6495:1: ( ( ( rule__Loop__Group_22_3__0 )* ) )
            // InternalQuCircuit.g:6496:1: ( ( rule__Loop__Group_22_3__0 )* )
            {
            // InternalQuCircuit.g:6496:1: ( ( rule__Loop__Group_22_3__0 )* )
            // InternalQuCircuit.g:6497:2: ( rule__Loop__Group_22_3__0 )*
            {
             before(grammarAccess.getLoopAccess().getGroup_22_3()); 
            // InternalQuCircuit.g:6498:2: ( rule__Loop__Group_22_3__0 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==26) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalQuCircuit.g:6498:3: rule__Loop__Group_22_3__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Loop__Group_22_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

             after(grammarAccess.getLoopAccess().getGroup_22_3()); 

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
    // $ANTLR end "rule__Loop__Group_22__3__Impl"


    // $ANTLR start "rule__Loop__Group_22__4"
    // InternalQuCircuit.g:6506:1: rule__Loop__Group_22__4 : rule__Loop__Group_22__4__Impl ;
    public final void rule__Loop__Group_22__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6510:1: ( rule__Loop__Group_22__4__Impl )
            // InternalQuCircuit.g:6511:2: rule__Loop__Group_22__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Loop__Group_22__4__Impl();

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
    // $ANTLR end "rule__Loop__Group_22__4"


    // $ANTLR start "rule__Loop__Group_22__4__Impl"
    // InternalQuCircuit.g:6517:1: rule__Loop__Group_22__4__Impl : ( ']' ) ;
    public final void rule__Loop__Group_22__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6521:1: ( ( ']' ) )
            // InternalQuCircuit.g:6522:1: ( ']' )
            {
            // InternalQuCircuit.g:6522:1: ( ']' )
            // InternalQuCircuit.g:6523:2: ']'
            {
             before(grammarAccess.getLoopAccess().getRightSquareBracketKeyword_22_4()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getRightSquareBracketKeyword_22_4()); 

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
    // $ANTLR end "rule__Loop__Group_22__4__Impl"


    // $ANTLR start "rule__Loop__Group_22_3__0"
    // InternalQuCircuit.g:6533:1: rule__Loop__Group_22_3__0 : rule__Loop__Group_22_3__0__Impl rule__Loop__Group_22_3__1 ;
    public final void rule__Loop__Group_22_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6537:1: ( rule__Loop__Group_22_3__0__Impl rule__Loop__Group_22_3__1 )
            // InternalQuCircuit.g:6538:2: rule__Loop__Group_22_3__0__Impl rule__Loop__Group_22_3__1
            {
            pushFollow(FOLLOW_24);
            rule__Loop__Group_22_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_22_3__1();

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
    // $ANTLR end "rule__Loop__Group_22_3__0"


    // $ANTLR start "rule__Loop__Group_22_3__0__Impl"
    // InternalQuCircuit.g:6545:1: rule__Loop__Group_22_3__0__Impl : ( ',' ) ;
    public final void rule__Loop__Group_22_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6549:1: ( ( ',' ) )
            // InternalQuCircuit.g:6550:1: ( ',' )
            {
            // InternalQuCircuit.g:6550:1: ( ',' )
            // InternalQuCircuit.g:6551:2: ','
            {
             before(grammarAccess.getLoopAccess().getCommaKeyword_22_3_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getCommaKeyword_22_3_0()); 

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
    // $ANTLR end "rule__Loop__Group_22_3__0__Impl"


    // $ANTLR start "rule__Loop__Group_22_3__1"
    // InternalQuCircuit.g:6560:1: rule__Loop__Group_22_3__1 : rule__Loop__Group_22_3__1__Impl ;
    public final void rule__Loop__Group_22_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6564:1: ( rule__Loop__Group_22_3__1__Impl )
            // InternalQuCircuit.g:6565:2: rule__Loop__Group_22_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Loop__Group_22_3__1__Impl();

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
    // $ANTLR end "rule__Loop__Group_22_3__1"


    // $ANTLR start "rule__Loop__Group_22_3__1__Impl"
    // InternalQuCircuit.g:6571:1: rule__Loop__Group_22_3__1__Impl : ( ( rule__Loop__ControlQubitsAssignment_22_3_1 ) ) ;
    public final void rule__Loop__Group_22_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6575:1: ( ( ( rule__Loop__ControlQubitsAssignment_22_3_1 ) ) )
            // InternalQuCircuit.g:6576:1: ( ( rule__Loop__ControlQubitsAssignment_22_3_1 ) )
            {
            // InternalQuCircuit.g:6576:1: ( ( rule__Loop__ControlQubitsAssignment_22_3_1 ) )
            // InternalQuCircuit.g:6577:2: ( rule__Loop__ControlQubitsAssignment_22_3_1 )
            {
             before(grammarAccess.getLoopAccess().getControlQubitsAssignment_22_3_1()); 
            // InternalQuCircuit.g:6578:2: ( rule__Loop__ControlQubitsAssignment_22_3_1 )
            // InternalQuCircuit.g:6578:3: rule__Loop__ControlQubitsAssignment_22_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Loop__ControlQubitsAssignment_22_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getControlQubitsAssignment_22_3_1()); 

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
    // $ANTLR end "rule__Loop__Group_22_3__1__Impl"


    // $ANTLR start "rule__Loop__Group_23__0"
    // InternalQuCircuit.g:6587:1: rule__Loop__Group_23__0 : rule__Loop__Group_23__0__Impl rule__Loop__Group_23__1 ;
    public final void rule__Loop__Group_23__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6591:1: ( rule__Loop__Group_23__0__Impl rule__Loop__Group_23__1 )
            // InternalQuCircuit.g:6592:2: rule__Loop__Group_23__0__Impl rule__Loop__Group_23__1
            {
            pushFollow(FOLLOW_23);
            rule__Loop__Group_23__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_23__1();

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
    // $ANTLR end "rule__Loop__Group_23__0"


    // $ANTLR start "rule__Loop__Group_23__0__Impl"
    // InternalQuCircuit.g:6599:1: rule__Loop__Group_23__0__Impl : ( 'fixedControlQubits' ) ;
    public final void rule__Loop__Group_23__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6603:1: ( ( 'fixedControlQubits' ) )
            // InternalQuCircuit.g:6604:1: ( 'fixedControlQubits' )
            {
            // InternalQuCircuit.g:6604:1: ( 'fixedControlQubits' )
            // InternalQuCircuit.g:6605:2: 'fixedControlQubits'
            {
             before(grammarAccess.getLoopAccess().getFixedControlQubitsKeyword_23_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getFixedControlQubitsKeyword_23_0()); 

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
    // $ANTLR end "rule__Loop__Group_23__0__Impl"


    // $ANTLR start "rule__Loop__Group_23__1"
    // InternalQuCircuit.g:6614:1: rule__Loop__Group_23__1 : rule__Loop__Group_23__1__Impl rule__Loop__Group_23__2 ;
    public final void rule__Loop__Group_23__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6618:1: ( rule__Loop__Group_23__1__Impl rule__Loop__Group_23__2 )
            // InternalQuCircuit.g:6619:2: rule__Loop__Group_23__1__Impl rule__Loop__Group_23__2
            {
            pushFollow(FOLLOW_24);
            rule__Loop__Group_23__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_23__2();

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
    // $ANTLR end "rule__Loop__Group_23__1"


    // $ANTLR start "rule__Loop__Group_23__1__Impl"
    // InternalQuCircuit.g:6626:1: rule__Loop__Group_23__1__Impl : ( '[' ) ;
    public final void rule__Loop__Group_23__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6630:1: ( ( '[' ) )
            // InternalQuCircuit.g:6631:1: ( '[' )
            {
            // InternalQuCircuit.g:6631:1: ( '[' )
            // InternalQuCircuit.g:6632:2: '['
            {
             before(grammarAccess.getLoopAccess().getLeftSquareBracketKeyword_23_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getLeftSquareBracketKeyword_23_1()); 

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
    // $ANTLR end "rule__Loop__Group_23__1__Impl"


    // $ANTLR start "rule__Loop__Group_23__2"
    // InternalQuCircuit.g:6641:1: rule__Loop__Group_23__2 : rule__Loop__Group_23__2__Impl rule__Loop__Group_23__3 ;
    public final void rule__Loop__Group_23__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6645:1: ( rule__Loop__Group_23__2__Impl rule__Loop__Group_23__3 )
            // InternalQuCircuit.g:6646:2: rule__Loop__Group_23__2__Impl rule__Loop__Group_23__3
            {
            pushFollow(FOLLOW_25);
            rule__Loop__Group_23__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_23__3();

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
    // $ANTLR end "rule__Loop__Group_23__2"


    // $ANTLR start "rule__Loop__Group_23__2__Impl"
    // InternalQuCircuit.g:6653:1: rule__Loop__Group_23__2__Impl : ( ( rule__Loop__FixedControlQubitsAssignment_23_2 ) ) ;
    public final void rule__Loop__Group_23__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6657:1: ( ( ( rule__Loop__FixedControlQubitsAssignment_23_2 ) ) )
            // InternalQuCircuit.g:6658:1: ( ( rule__Loop__FixedControlQubitsAssignment_23_2 ) )
            {
            // InternalQuCircuit.g:6658:1: ( ( rule__Loop__FixedControlQubitsAssignment_23_2 ) )
            // InternalQuCircuit.g:6659:2: ( rule__Loop__FixedControlQubitsAssignment_23_2 )
            {
             before(grammarAccess.getLoopAccess().getFixedControlQubitsAssignment_23_2()); 
            // InternalQuCircuit.g:6660:2: ( rule__Loop__FixedControlQubitsAssignment_23_2 )
            // InternalQuCircuit.g:6660:3: rule__Loop__FixedControlQubitsAssignment_23_2
            {
            pushFollow(FOLLOW_2);
            rule__Loop__FixedControlQubitsAssignment_23_2();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getFixedControlQubitsAssignment_23_2()); 

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
    // $ANTLR end "rule__Loop__Group_23__2__Impl"


    // $ANTLR start "rule__Loop__Group_23__3"
    // InternalQuCircuit.g:6668:1: rule__Loop__Group_23__3 : rule__Loop__Group_23__3__Impl rule__Loop__Group_23__4 ;
    public final void rule__Loop__Group_23__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6672:1: ( rule__Loop__Group_23__3__Impl rule__Loop__Group_23__4 )
            // InternalQuCircuit.g:6673:2: rule__Loop__Group_23__3__Impl rule__Loop__Group_23__4
            {
            pushFollow(FOLLOW_25);
            rule__Loop__Group_23__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_23__4();

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
    // $ANTLR end "rule__Loop__Group_23__3"


    // $ANTLR start "rule__Loop__Group_23__3__Impl"
    // InternalQuCircuit.g:6680:1: rule__Loop__Group_23__3__Impl : ( ( rule__Loop__Group_23_3__0 )* ) ;
    public final void rule__Loop__Group_23__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6684:1: ( ( ( rule__Loop__Group_23_3__0 )* ) )
            // InternalQuCircuit.g:6685:1: ( ( rule__Loop__Group_23_3__0 )* )
            {
            // InternalQuCircuit.g:6685:1: ( ( rule__Loop__Group_23_3__0 )* )
            // InternalQuCircuit.g:6686:2: ( rule__Loop__Group_23_3__0 )*
            {
             before(grammarAccess.getLoopAccess().getGroup_23_3()); 
            // InternalQuCircuit.g:6687:2: ( rule__Loop__Group_23_3__0 )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==26) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalQuCircuit.g:6687:3: rule__Loop__Group_23_3__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Loop__Group_23_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

             after(grammarAccess.getLoopAccess().getGroup_23_3()); 

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
    // $ANTLR end "rule__Loop__Group_23__3__Impl"


    // $ANTLR start "rule__Loop__Group_23__4"
    // InternalQuCircuit.g:6695:1: rule__Loop__Group_23__4 : rule__Loop__Group_23__4__Impl ;
    public final void rule__Loop__Group_23__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6699:1: ( rule__Loop__Group_23__4__Impl )
            // InternalQuCircuit.g:6700:2: rule__Loop__Group_23__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Loop__Group_23__4__Impl();

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
    // $ANTLR end "rule__Loop__Group_23__4"


    // $ANTLR start "rule__Loop__Group_23__4__Impl"
    // InternalQuCircuit.g:6706:1: rule__Loop__Group_23__4__Impl : ( ']' ) ;
    public final void rule__Loop__Group_23__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6710:1: ( ( ']' ) )
            // InternalQuCircuit.g:6711:1: ( ']' )
            {
            // InternalQuCircuit.g:6711:1: ( ']' )
            // InternalQuCircuit.g:6712:2: ']'
            {
             before(grammarAccess.getLoopAccess().getRightSquareBracketKeyword_23_4()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getRightSquareBracketKeyword_23_4()); 

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
    // $ANTLR end "rule__Loop__Group_23__4__Impl"


    // $ANTLR start "rule__Loop__Group_23_3__0"
    // InternalQuCircuit.g:6722:1: rule__Loop__Group_23_3__0 : rule__Loop__Group_23_3__0__Impl rule__Loop__Group_23_3__1 ;
    public final void rule__Loop__Group_23_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6726:1: ( rule__Loop__Group_23_3__0__Impl rule__Loop__Group_23_3__1 )
            // InternalQuCircuit.g:6727:2: rule__Loop__Group_23_3__0__Impl rule__Loop__Group_23_3__1
            {
            pushFollow(FOLLOW_24);
            rule__Loop__Group_23_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_23_3__1();

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
    // $ANTLR end "rule__Loop__Group_23_3__0"


    // $ANTLR start "rule__Loop__Group_23_3__0__Impl"
    // InternalQuCircuit.g:6734:1: rule__Loop__Group_23_3__0__Impl : ( ',' ) ;
    public final void rule__Loop__Group_23_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6738:1: ( ( ',' ) )
            // InternalQuCircuit.g:6739:1: ( ',' )
            {
            // InternalQuCircuit.g:6739:1: ( ',' )
            // InternalQuCircuit.g:6740:2: ','
            {
             before(grammarAccess.getLoopAccess().getCommaKeyword_23_3_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getCommaKeyword_23_3_0()); 

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
    // $ANTLR end "rule__Loop__Group_23_3__0__Impl"


    // $ANTLR start "rule__Loop__Group_23_3__1"
    // InternalQuCircuit.g:6749:1: rule__Loop__Group_23_3__1 : rule__Loop__Group_23_3__1__Impl ;
    public final void rule__Loop__Group_23_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6753:1: ( rule__Loop__Group_23_3__1__Impl )
            // InternalQuCircuit.g:6754:2: rule__Loop__Group_23_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Loop__Group_23_3__1__Impl();

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
    // $ANTLR end "rule__Loop__Group_23_3__1"


    // $ANTLR start "rule__Loop__Group_23_3__1__Impl"
    // InternalQuCircuit.g:6760:1: rule__Loop__Group_23_3__1__Impl : ( ( rule__Loop__FixedControlQubitsAssignment_23_3_1 ) ) ;
    public final void rule__Loop__Group_23_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6764:1: ( ( ( rule__Loop__FixedControlQubitsAssignment_23_3_1 ) ) )
            // InternalQuCircuit.g:6765:1: ( ( rule__Loop__FixedControlQubitsAssignment_23_3_1 ) )
            {
            // InternalQuCircuit.g:6765:1: ( ( rule__Loop__FixedControlQubitsAssignment_23_3_1 ) )
            // InternalQuCircuit.g:6766:2: ( rule__Loop__FixedControlQubitsAssignment_23_3_1 )
            {
             before(grammarAccess.getLoopAccess().getFixedControlQubitsAssignment_23_3_1()); 
            // InternalQuCircuit.g:6767:2: ( rule__Loop__FixedControlQubitsAssignment_23_3_1 )
            // InternalQuCircuit.g:6767:3: rule__Loop__FixedControlQubitsAssignment_23_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Loop__FixedControlQubitsAssignment_23_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getFixedControlQubitsAssignment_23_3_1()); 

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
    // $ANTLR end "rule__Loop__Group_23_3__1__Impl"


    // $ANTLR start "rule__Loop__Group_24__0"
    // InternalQuCircuit.g:6776:1: rule__Loop__Group_24__0 : rule__Loop__Group_24__0__Impl rule__Loop__Group_24__1 ;
    public final void rule__Loop__Group_24__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6780:1: ( rule__Loop__Group_24__0__Impl rule__Loop__Group_24__1 )
            // InternalQuCircuit.g:6781:2: rule__Loop__Group_24__0__Impl rule__Loop__Group_24__1
            {
            pushFollow(FOLLOW_23);
            rule__Loop__Group_24__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_24__1();

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
    // $ANTLR end "rule__Loop__Group_24__0"


    // $ANTLR start "rule__Loop__Group_24__0__Impl"
    // InternalQuCircuit.g:6788:1: rule__Loop__Group_24__0__Impl : ( 'fixedTargetQubits' ) ;
    public final void rule__Loop__Group_24__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6792:1: ( ( 'fixedTargetQubits' ) )
            // InternalQuCircuit.g:6793:1: ( 'fixedTargetQubits' )
            {
            // InternalQuCircuit.g:6793:1: ( 'fixedTargetQubits' )
            // InternalQuCircuit.g:6794:2: 'fixedTargetQubits'
            {
             before(grammarAccess.getLoopAccess().getFixedTargetQubitsKeyword_24_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getFixedTargetQubitsKeyword_24_0()); 

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
    // $ANTLR end "rule__Loop__Group_24__0__Impl"


    // $ANTLR start "rule__Loop__Group_24__1"
    // InternalQuCircuit.g:6803:1: rule__Loop__Group_24__1 : rule__Loop__Group_24__1__Impl rule__Loop__Group_24__2 ;
    public final void rule__Loop__Group_24__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6807:1: ( rule__Loop__Group_24__1__Impl rule__Loop__Group_24__2 )
            // InternalQuCircuit.g:6808:2: rule__Loop__Group_24__1__Impl rule__Loop__Group_24__2
            {
            pushFollow(FOLLOW_24);
            rule__Loop__Group_24__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_24__2();

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
    // $ANTLR end "rule__Loop__Group_24__1"


    // $ANTLR start "rule__Loop__Group_24__1__Impl"
    // InternalQuCircuit.g:6815:1: rule__Loop__Group_24__1__Impl : ( '[' ) ;
    public final void rule__Loop__Group_24__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6819:1: ( ( '[' ) )
            // InternalQuCircuit.g:6820:1: ( '[' )
            {
            // InternalQuCircuit.g:6820:1: ( '[' )
            // InternalQuCircuit.g:6821:2: '['
            {
             before(grammarAccess.getLoopAccess().getLeftSquareBracketKeyword_24_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getLeftSquareBracketKeyword_24_1()); 

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
    // $ANTLR end "rule__Loop__Group_24__1__Impl"


    // $ANTLR start "rule__Loop__Group_24__2"
    // InternalQuCircuit.g:6830:1: rule__Loop__Group_24__2 : rule__Loop__Group_24__2__Impl rule__Loop__Group_24__3 ;
    public final void rule__Loop__Group_24__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6834:1: ( rule__Loop__Group_24__2__Impl rule__Loop__Group_24__3 )
            // InternalQuCircuit.g:6835:2: rule__Loop__Group_24__2__Impl rule__Loop__Group_24__3
            {
            pushFollow(FOLLOW_25);
            rule__Loop__Group_24__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_24__3();

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
    // $ANTLR end "rule__Loop__Group_24__2"


    // $ANTLR start "rule__Loop__Group_24__2__Impl"
    // InternalQuCircuit.g:6842:1: rule__Loop__Group_24__2__Impl : ( ( rule__Loop__FixedTargetQubitsAssignment_24_2 ) ) ;
    public final void rule__Loop__Group_24__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6846:1: ( ( ( rule__Loop__FixedTargetQubitsAssignment_24_2 ) ) )
            // InternalQuCircuit.g:6847:1: ( ( rule__Loop__FixedTargetQubitsAssignment_24_2 ) )
            {
            // InternalQuCircuit.g:6847:1: ( ( rule__Loop__FixedTargetQubitsAssignment_24_2 ) )
            // InternalQuCircuit.g:6848:2: ( rule__Loop__FixedTargetQubitsAssignment_24_2 )
            {
             before(grammarAccess.getLoopAccess().getFixedTargetQubitsAssignment_24_2()); 
            // InternalQuCircuit.g:6849:2: ( rule__Loop__FixedTargetQubitsAssignment_24_2 )
            // InternalQuCircuit.g:6849:3: rule__Loop__FixedTargetQubitsAssignment_24_2
            {
            pushFollow(FOLLOW_2);
            rule__Loop__FixedTargetQubitsAssignment_24_2();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getFixedTargetQubitsAssignment_24_2()); 

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
    // $ANTLR end "rule__Loop__Group_24__2__Impl"


    // $ANTLR start "rule__Loop__Group_24__3"
    // InternalQuCircuit.g:6857:1: rule__Loop__Group_24__3 : rule__Loop__Group_24__3__Impl rule__Loop__Group_24__4 ;
    public final void rule__Loop__Group_24__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6861:1: ( rule__Loop__Group_24__3__Impl rule__Loop__Group_24__4 )
            // InternalQuCircuit.g:6862:2: rule__Loop__Group_24__3__Impl rule__Loop__Group_24__4
            {
            pushFollow(FOLLOW_25);
            rule__Loop__Group_24__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_24__4();

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
    // $ANTLR end "rule__Loop__Group_24__3"


    // $ANTLR start "rule__Loop__Group_24__3__Impl"
    // InternalQuCircuit.g:6869:1: rule__Loop__Group_24__3__Impl : ( ( rule__Loop__Group_24_3__0 )* ) ;
    public final void rule__Loop__Group_24__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6873:1: ( ( ( rule__Loop__Group_24_3__0 )* ) )
            // InternalQuCircuit.g:6874:1: ( ( rule__Loop__Group_24_3__0 )* )
            {
            // InternalQuCircuit.g:6874:1: ( ( rule__Loop__Group_24_3__0 )* )
            // InternalQuCircuit.g:6875:2: ( rule__Loop__Group_24_3__0 )*
            {
             before(grammarAccess.getLoopAccess().getGroup_24_3()); 
            // InternalQuCircuit.g:6876:2: ( rule__Loop__Group_24_3__0 )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==26) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalQuCircuit.g:6876:3: rule__Loop__Group_24_3__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Loop__Group_24_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

             after(grammarAccess.getLoopAccess().getGroup_24_3()); 

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
    // $ANTLR end "rule__Loop__Group_24__3__Impl"


    // $ANTLR start "rule__Loop__Group_24__4"
    // InternalQuCircuit.g:6884:1: rule__Loop__Group_24__4 : rule__Loop__Group_24__4__Impl ;
    public final void rule__Loop__Group_24__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6888:1: ( rule__Loop__Group_24__4__Impl )
            // InternalQuCircuit.g:6889:2: rule__Loop__Group_24__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Loop__Group_24__4__Impl();

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
    // $ANTLR end "rule__Loop__Group_24__4"


    // $ANTLR start "rule__Loop__Group_24__4__Impl"
    // InternalQuCircuit.g:6895:1: rule__Loop__Group_24__4__Impl : ( ']' ) ;
    public final void rule__Loop__Group_24__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6899:1: ( ( ']' ) )
            // InternalQuCircuit.g:6900:1: ( ']' )
            {
            // InternalQuCircuit.g:6900:1: ( ']' )
            // InternalQuCircuit.g:6901:2: ']'
            {
             before(grammarAccess.getLoopAccess().getRightSquareBracketKeyword_24_4()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getRightSquareBracketKeyword_24_4()); 

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
    // $ANTLR end "rule__Loop__Group_24__4__Impl"


    // $ANTLR start "rule__Loop__Group_24_3__0"
    // InternalQuCircuit.g:6911:1: rule__Loop__Group_24_3__0 : rule__Loop__Group_24_3__0__Impl rule__Loop__Group_24_3__1 ;
    public final void rule__Loop__Group_24_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6915:1: ( rule__Loop__Group_24_3__0__Impl rule__Loop__Group_24_3__1 )
            // InternalQuCircuit.g:6916:2: rule__Loop__Group_24_3__0__Impl rule__Loop__Group_24_3__1
            {
            pushFollow(FOLLOW_24);
            rule__Loop__Group_24_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_24_3__1();

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
    // $ANTLR end "rule__Loop__Group_24_3__0"


    // $ANTLR start "rule__Loop__Group_24_3__0__Impl"
    // InternalQuCircuit.g:6923:1: rule__Loop__Group_24_3__0__Impl : ( ',' ) ;
    public final void rule__Loop__Group_24_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6927:1: ( ( ',' ) )
            // InternalQuCircuit.g:6928:1: ( ',' )
            {
            // InternalQuCircuit.g:6928:1: ( ',' )
            // InternalQuCircuit.g:6929:2: ','
            {
             before(grammarAccess.getLoopAccess().getCommaKeyword_24_3_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getCommaKeyword_24_3_0()); 

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
    // $ANTLR end "rule__Loop__Group_24_3__0__Impl"


    // $ANTLR start "rule__Loop__Group_24_3__1"
    // InternalQuCircuit.g:6938:1: rule__Loop__Group_24_3__1 : rule__Loop__Group_24_3__1__Impl ;
    public final void rule__Loop__Group_24_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6942:1: ( rule__Loop__Group_24_3__1__Impl )
            // InternalQuCircuit.g:6943:2: rule__Loop__Group_24_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Loop__Group_24_3__1__Impl();

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
    // $ANTLR end "rule__Loop__Group_24_3__1"


    // $ANTLR start "rule__Loop__Group_24_3__1__Impl"
    // InternalQuCircuit.g:6949:1: rule__Loop__Group_24_3__1__Impl : ( ( rule__Loop__FixedTargetQubitsAssignment_24_3_1 ) ) ;
    public final void rule__Loop__Group_24_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6953:1: ( ( ( rule__Loop__FixedTargetQubitsAssignment_24_3_1 ) ) )
            // InternalQuCircuit.g:6954:1: ( ( rule__Loop__FixedTargetQubitsAssignment_24_3_1 ) )
            {
            // InternalQuCircuit.g:6954:1: ( ( rule__Loop__FixedTargetQubitsAssignment_24_3_1 ) )
            // InternalQuCircuit.g:6955:2: ( rule__Loop__FixedTargetQubitsAssignment_24_3_1 )
            {
             before(grammarAccess.getLoopAccess().getFixedTargetQubitsAssignment_24_3_1()); 
            // InternalQuCircuit.g:6956:2: ( rule__Loop__FixedTargetQubitsAssignment_24_3_1 )
            // InternalQuCircuit.g:6956:3: rule__Loop__FixedTargetQubitsAssignment_24_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Loop__FixedTargetQubitsAssignment_24_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getFixedTargetQubitsAssignment_24_3_1()); 

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
    // $ANTLR end "rule__Loop__Group_24_3__1__Impl"


    // $ANTLR start "rule__Loop__Group_32__0"
    // InternalQuCircuit.g:6965:1: rule__Loop__Group_32__0 : rule__Loop__Group_32__0__Impl rule__Loop__Group_32__1 ;
    public final void rule__Loop__Group_32__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6969:1: ( rule__Loop__Group_32__0__Impl rule__Loop__Group_32__1 )
            // InternalQuCircuit.g:6970:2: rule__Loop__Group_32__0__Impl rule__Loop__Group_32__1
            {
            pushFollow(FOLLOW_14);
            rule__Loop__Group_32__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_32__1();

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
    // $ANTLR end "rule__Loop__Group_32__0"


    // $ANTLR start "rule__Loop__Group_32__0__Impl"
    // InternalQuCircuit.g:6977:1: rule__Loop__Group_32__0__Impl : ( ',' ) ;
    public final void rule__Loop__Group_32__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6981:1: ( ( ',' ) )
            // InternalQuCircuit.g:6982:1: ( ',' )
            {
            // InternalQuCircuit.g:6982:1: ( ',' )
            // InternalQuCircuit.g:6983:2: ','
            {
             before(grammarAccess.getLoopAccess().getCommaKeyword_32_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getCommaKeyword_32_0()); 

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
    // $ANTLR end "rule__Loop__Group_32__0__Impl"


    // $ANTLR start "rule__Loop__Group_32__1"
    // InternalQuCircuit.g:6992:1: rule__Loop__Group_32__1 : rule__Loop__Group_32__1__Impl rule__Loop__Group_32__2 ;
    public final void rule__Loop__Group_32__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:6996:1: ( rule__Loop__Group_32__1__Impl rule__Loop__Group_32__2 )
            // InternalQuCircuit.g:6997:2: rule__Loop__Group_32__1__Impl rule__Loop__Group_32__2
            {
            pushFollow(FOLLOW_24);
            rule__Loop__Group_32__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_32__2();

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
    // $ANTLR end "rule__Loop__Group_32__1"


    // $ANTLR start "rule__Loop__Group_32__1__Impl"
    // InternalQuCircuit.g:7004:1: rule__Loop__Group_32__1__Impl : ( '(' ) ;
    public final void rule__Loop__Group_32__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7008:1: ( ( '(' ) )
            // InternalQuCircuit.g:7009:1: ( '(' )
            {
            // InternalQuCircuit.g:7009:1: ( '(' )
            // InternalQuCircuit.g:7010:2: '('
            {
             before(grammarAccess.getLoopAccess().getLeftParenthesisKeyword_32_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getLeftParenthesisKeyword_32_1()); 

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
    // $ANTLR end "rule__Loop__Group_32__1__Impl"


    // $ANTLR start "rule__Loop__Group_32__2"
    // InternalQuCircuit.g:7019:1: rule__Loop__Group_32__2 : rule__Loop__Group_32__2__Impl rule__Loop__Group_32__3 ;
    public final void rule__Loop__Group_32__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7023:1: ( rule__Loop__Group_32__2__Impl rule__Loop__Group_32__3 )
            // InternalQuCircuit.g:7024:2: rule__Loop__Group_32__2__Impl rule__Loop__Group_32__3
            {
            pushFollow(FOLLOW_15);
            rule__Loop__Group_32__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_32__3();

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
    // $ANTLR end "rule__Loop__Group_32__2"


    // $ANTLR start "rule__Loop__Group_32__2__Impl"
    // InternalQuCircuit.g:7031:1: rule__Loop__Group_32__2__Impl : ( ( rule__Loop__LoopTargetQubitsAssignment_32_2 ) ) ;
    public final void rule__Loop__Group_32__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7035:1: ( ( ( rule__Loop__LoopTargetQubitsAssignment_32_2 ) ) )
            // InternalQuCircuit.g:7036:1: ( ( rule__Loop__LoopTargetQubitsAssignment_32_2 ) )
            {
            // InternalQuCircuit.g:7036:1: ( ( rule__Loop__LoopTargetQubitsAssignment_32_2 ) )
            // InternalQuCircuit.g:7037:2: ( rule__Loop__LoopTargetQubitsAssignment_32_2 )
            {
             before(grammarAccess.getLoopAccess().getLoopTargetQubitsAssignment_32_2()); 
            // InternalQuCircuit.g:7038:2: ( rule__Loop__LoopTargetQubitsAssignment_32_2 )
            // InternalQuCircuit.g:7038:3: rule__Loop__LoopTargetQubitsAssignment_32_2
            {
            pushFollow(FOLLOW_2);
            rule__Loop__LoopTargetQubitsAssignment_32_2();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getLoopTargetQubitsAssignment_32_2()); 

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
    // $ANTLR end "rule__Loop__Group_32__2__Impl"


    // $ANTLR start "rule__Loop__Group_32__3"
    // InternalQuCircuit.g:7046:1: rule__Loop__Group_32__3 : rule__Loop__Group_32__3__Impl ;
    public final void rule__Loop__Group_32__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7050:1: ( rule__Loop__Group_32__3__Impl )
            // InternalQuCircuit.g:7051:2: rule__Loop__Group_32__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Loop__Group_32__3__Impl();

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
    // $ANTLR end "rule__Loop__Group_32__3"


    // $ANTLR start "rule__Loop__Group_32__3__Impl"
    // InternalQuCircuit.g:7057:1: rule__Loop__Group_32__3__Impl : ( ')' ) ;
    public final void rule__Loop__Group_32__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7061:1: ( ( ')' ) )
            // InternalQuCircuit.g:7062:1: ( ')' )
            {
            // InternalQuCircuit.g:7062:1: ( ')' )
            // InternalQuCircuit.g:7063:2: ')'
            {
             before(grammarAccess.getLoopAccess().getRightParenthesisKeyword_32_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getRightParenthesisKeyword_32_3()); 

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
    // $ANTLR end "rule__Loop__Group_32__3__Impl"


    // $ANTLR start "rule__Loop__Group_34__0"
    // InternalQuCircuit.g:7073:1: rule__Loop__Group_34__0 : rule__Loop__Group_34__0__Impl rule__Loop__Group_34__1 ;
    public final void rule__Loop__Group_34__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7077:1: ( rule__Loop__Group_34__0__Impl rule__Loop__Group_34__1 )
            // InternalQuCircuit.g:7078:2: rule__Loop__Group_34__0__Impl rule__Loop__Group_34__1
            {
            pushFollow(FOLLOW_23);
            rule__Loop__Group_34__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_34__1();

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
    // $ANTLR end "rule__Loop__Group_34__0"


    // $ANTLR start "rule__Loop__Group_34__0__Impl"
    // InternalQuCircuit.g:7085:1: rule__Loop__Group_34__0__Impl : ( 'loopControlQubits' ) ;
    public final void rule__Loop__Group_34__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7089:1: ( ( 'loopControlQubits' ) )
            // InternalQuCircuit.g:7090:1: ( 'loopControlQubits' )
            {
            // InternalQuCircuit.g:7090:1: ( 'loopControlQubits' )
            // InternalQuCircuit.g:7091:2: 'loopControlQubits'
            {
             before(grammarAccess.getLoopAccess().getLoopControlQubitsKeyword_34_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getLoopControlQubitsKeyword_34_0()); 

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
    // $ANTLR end "rule__Loop__Group_34__0__Impl"


    // $ANTLR start "rule__Loop__Group_34__1"
    // InternalQuCircuit.g:7100:1: rule__Loop__Group_34__1 : rule__Loop__Group_34__1__Impl rule__Loop__Group_34__2 ;
    public final void rule__Loop__Group_34__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7104:1: ( rule__Loop__Group_34__1__Impl rule__Loop__Group_34__2 )
            // InternalQuCircuit.g:7105:2: rule__Loop__Group_34__1__Impl rule__Loop__Group_34__2
            {
            pushFollow(FOLLOW_14);
            rule__Loop__Group_34__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_34__2();

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
    // $ANTLR end "rule__Loop__Group_34__1"


    // $ANTLR start "rule__Loop__Group_34__1__Impl"
    // InternalQuCircuit.g:7112:1: rule__Loop__Group_34__1__Impl : ( '[' ) ;
    public final void rule__Loop__Group_34__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7116:1: ( ( '[' ) )
            // InternalQuCircuit.g:7117:1: ( '[' )
            {
            // InternalQuCircuit.g:7117:1: ( '[' )
            // InternalQuCircuit.g:7118:2: '['
            {
             before(grammarAccess.getLoopAccess().getLeftSquareBracketKeyword_34_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getLeftSquareBracketKeyword_34_1()); 

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
    // $ANTLR end "rule__Loop__Group_34__1__Impl"


    // $ANTLR start "rule__Loop__Group_34__2"
    // InternalQuCircuit.g:7127:1: rule__Loop__Group_34__2 : rule__Loop__Group_34__2__Impl rule__Loop__Group_34__3 ;
    public final void rule__Loop__Group_34__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7131:1: ( rule__Loop__Group_34__2__Impl rule__Loop__Group_34__3 )
            // InternalQuCircuit.g:7132:2: rule__Loop__Group_34__2__Impl rule__Loop__Group_34__3
            {
            pushFollow(FOLLOW_24);
            rule__Loop__Group_34__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_34__3();

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
    // $ANTLR end "rule__Loop__Group_34__2"


    // $ANTLR start "rule__Loop__Group_34__2__Impl"
    // InternalQuCircuit.g:7139:1: rule__Loop__Group_34__2__Impl : ( '(' ) ;
    public final void rule__Loop__Group_34__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7143:1: ( ( '(' ) )
            // InternalQuCircuit.g:7144:1: ( '(' )
            {
            // InternalQuCircuit.g:7144:1: ( '(' )
            // InternalQuCircuit.g:7145:2: '('
            {
             before(grammarAccess.getLoopAccess().getLeftParenthesisKeyword_34_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getLeftParenthesisKeyword_34_2()); 

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
    // $ANTLR end "rule__Loop__Group_34__2__Impl"


    // $ANTLR start "rule__Loop__Group_34__3"
    // InternalQuCircuit.g:7154:1: rule__Loop__Group_34__3 : rule__Loop__Group_34__3__Impl rule__Loop__Group_34__4 ;
    public final void rule__Loop__Group_34__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7158:1: ( rule__Loop__Group_34__3__Impl rule__Loop__Group_34__4 )
            // InternalQuCircuit.g:7159:2: rule__Loop__Group_34__3__Impl rule__Loop__Group_34__4
            {
            pushFollow(FOLLOW_15);
            rule__Loop__Group_34__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_34__4();

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
    // $ANTLR end "rule__Loop__Group_34__3"


    // $ANTLR start "rule__Loop__Group_34__3__Impl"
    // InternalQuCircuit.g:7166:1: rule__Loop__Group_34__3__Impl : ( ( rule__Loop__LoopControlQubitsAssignment_34_3 ) ) ;
    public final void rule__Loop__Group_34__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7170:1: ( ( ( rule__Loop__LoopControlQubitsAssignment_34_3 ) ) )
            // InternalQuCircuit.g:7171:1: ( ( rule__Loop__LoopControlQubitsAssignment_34_3 ) )
            {
            // InternalQuCircuit.g:7171:1: ( ( rule__Loop__LoopControlQubitsAssignment_34_3 ) )
            // InternalQuCircuit.g:7172:2: ( rule__Loop__LoopControlQubitsAssignment_34_3 )
            {
             before(grammarAccess.getLoopAccess().getLoopControlQubitsAssignment_34_3()); 
            // InternalQuCircuit.g:7173:2: ( rule__Loop__LoopControlQubitsAssignment_34_3 )
            // InternalQuCircuit.g:7173:3: rule__Loop__LoopControlQubitsAssignment_34_3
            {
            pushFollow(FOLLOW_2);
            rule__Loop__LoopControlQubitsAssignment_34_3();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getLoopControlQubitsAssignment_34_3()); 

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
    // $ANTLR end "rule__Loop__Group_34__3__Impl"


    // $ANTLR start "rule__Loop__Group_34__4"
    // InternalQuCircuit.g:7181:1: rule__Loop__Group_34__4 : rule__Loop__Group_34__4__Impl rule__Loop__Group_34__5 ;
    public final void rule__Loop__Group_34__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7185:1: ( rule__Loop__Group_34__4__Impl rule__Loop__Group_34__5 )
            // InternalQuCircuit.g:7186:2: rule__Loop__Group_34__4__Impl rule__Loop__Group_34__5
            {
            pushFollow(FOLLOW_25);
            rule__Loop__Group_34__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_34__5();

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
    // $ANTLR end "rule__Loop__Group_34__4"


    // $ANTLR start "rule__Loop__Group_34__4__Impl"
    // InternalQuCircuit.g:7193:1: rule__Loop__Group_34__4__Impl : ( ')' ) ;
    public final void rule__Loop__Group_34__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7197:1: ( ( ')' ) )
            // InternalQuCircuit.g:7198:1: ( ')' )
            {
            // InternalQuCircuit.g:7198:1: ( ')' )
            // InternalQuCircuit.g:7199:2: ')'
            {
             before(grammarAccess.getLoopAccess().getRightParenthesisKeyword_34_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getRightParenthesisKeyword_34_4()); 

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
    // $ANTLR end "rule__Loop__Group_34__4__Impl"


    // $ANTLR start "rule__Loop__Group_34__5"
    // InternalQuCircuit.g:7208:1: rule__Loop__Group_34__5 : rule__Loop__Group_34__5__Impl rule__Loop__Group_34__6 ;
    public final void rule__Loop__Group_34__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7212:1: ( rule__Loop__Group_34__5__Impl rule__Loop__Group_34__6 )
            // InternalQuCircuit.g:7213:2: rule__Loop__Group_34__5__Impl rule__Loop__Group_34__6
            {
            pushFollow(FOLLOW_25);
            rule__Loop__Group_34__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_34__6();

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
    // $ANTLR end "rule__Loop__Group_34__5"


    // $ANTLR start "rule__Loop__Group_34__5__Impl"
    // InternalQuCircuit.g:7220:1: rule__Loop__Group_34__5__Impl : ( ( rule__Loop__Group_34_5__0 )* ) ;
    public final void rule__Loop__Group_34__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7224:1: ( ( ( rule__Loop__Group_34_5__0 )* ) )
            // InternalQuCircuit.g:7225:1: ( ( rule__Loop__Group_34_5__0 )* )
            {
            // InternalQuCircuit.g:7225:1: ( ( rule__Loop__Group_34_5__0 )* )
            // InternalQuCircuit.g:7226:2: ( rule__Loop__Group_34_5__0 )*
            {
             before(grammarAccess.getLoopAccess().getGroup_34_5()); 
            // InternalQuCircuit.g:7227:2: ( rule__Loop__Group_34_5__0 )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==26) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalQuCircuit.g:7227:3: rule__Loop__Group_34_5__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Loop__Group_34_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

             after(grammarAccess.getLoopAccess().getGroup_34_5()); 

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
    // $ANTLR end "rule__Loop__Group_34__5__Impl"


    // $ANTLR start "rule__Loop__Group_34__6"
    // InternalQuCircuit.g:7235:1: rule__Loop__Group_34__6 : rule__Loop__Group_34__6__Impl ;
    public final void rule__Loop__Group_34__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7239:1: ( rule__Loop__Group_34__6__Impl )
            // InternalQuCircuit.g:7240:2: rule__Loop__Group_34__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Loop__Group_34__6__Impl();

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
    // $ANTLR end "rule__Loop__Group_34__6"


    // $ANTLR start "rule__Loop__Group_34__6__Impl"
    // InternalQuCircuit.g:7246:1: rule__Loop__Group_34__6__Impl : ( ']' ) ;
    public final void rule__Loop__Group_34__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7250:1: ( ( ']' ) )
            // InternalQuCircuit.g:7251:1: ( ']' )
            {
            // InternalQuCircuit.g:7251:1: ( ']' )
            // InternalQuCircuit.g:7252:2: ']'
            {
             before(grammarAccess.getLoopAccess().getRightSquareBracketKeyword_34_6()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getRightSquareBracketKeyword_34_6()); 

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
    // $ANTLR end "rule__Loop__Group_34__6__Impl"


    // $ANTLR start "rule__Loop__Group_34_5__0"
    // InternalQuCircuit.g:7262:1: rule__Loop__Group_34_5__0 : rule__Loop__Group_34_5__0__Impl rule__Loop__Group_34_5__1 ;
    public final void rule__Loop__Group_34_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7266:1: ( rule__Loop__Group_34_5__0__Impl rule__Loop__Group_34_5__1 )
            // InternalQuCircuit.g:7267:2: rule__Loop__Group_34_5__0__Impl rule__Loop__Group_34_5__1
            {
            pushFollow(FOLLOW_14);
            rule__Loop__Group_34_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_34_5__1();

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
    // $ANTLR end "rule__Loop__Group_34_5__0"


    // $ANTLR start "rule__Loop__Group_34_5__0__Impl"
    // InternalQuCircuit.g:7274:1: rule__Loop__Group_34_5__0__Impl : ( ',' ) ;
    public final void rule__Loop__Group_34_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7278:1: ( ( ',' ) )
            // InternalQuCircuit.g:7279:1: ( ',' )
            {
            // InternalQuCircuit.g:7279:1: ( ',' )
            // InternalQuCircuit.g:7280:2: ','
            {
             before(grammarAccess.getLoopAccess().getCommaKeyword_34_5_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getCommaKeyword_34_5_0()); 

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
    // $ANTLR end "rule__Loop__Group_34_5__0__Impl"


    // $ANTLR start "rule__Loop__Group_34_5__1"
    // InternalQuCircuit.g:7289:1: rule__Loop__Group_34_5__1 : rule__Loop__Group_34_5__1__Impl rule__Loop__Group_34_5__2 ;
    public final void rule__Loop__Group_34_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7293:1: ( rule__Loop__Group_34_5__1__Impl rule__Loop__Group_34_5__2 )
            // InternalQuCircuit.g:7294:2: rule__Loop__Group_34_5__1__Impl rule__Loop__Group_34_5__2
            {
            pushFollow(FOLLOW_24);
            rule__Loop__Group_34_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_34_5__2();

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
    // $ANTLR end "rule__Loop__Group_34_5__1"


    // $ANTLR start "rule__Loop__Group_34_5__1__Impl"
    // InternalQuCircuit.g:7301:1: rule__Loop__Group_34_5__1__Impl : ( '(' ) ;
    public final void rule__Loop__Group_34_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7305:1: ( ( '(' ) )
            // InternalQuCircuit.g:7306:1: ( '(' )
            {
            // InternalQuCircuit.g:7306:1: ( '(' )
            // InternalQuCircuit.g:7307:2: '('
            {
             before(grammarAccess.getLoopAccess().getLeftParenthesisKeyword_34_5_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getLeftParenthesisKeyword_34_5_1()); 

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
    // $ANTLR end "rule__Loop__Group_34_5__1__Impl"


    // $ANTLR start "rule__Loop__Group_34_5__2"
    // InternalQuCircuit.g:7316:1: rule__Loop__Group_34_5__2 : rule__Loop__Group_34_5__2__Impl rule__Loop__Group_34_5__3 ;
    public final void rule__Loop__Group_34_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7320:1: ( rule__Loop__Group_34_5__2__Impl rule__Loop__Group_34_5__3 )
            // InternalQuCircuit.g:7321:2: rule__Loop__Group_34_5__2__Impl rule__Loop__Group_34_5__3
            {
            pushFollow(FOLLOW_15);
            rule__Loop__Group_34_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Loop__Group_34_5__3();

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
    // $ANTLR end "rule__Loop__Group_34_5__2"


    // $ANTLR start "rule__Loop__Group_34_5__2__Impl"
    // InternalQuCircuit.g:7328:1: rule__Loop__Group_34_5__2__Impl : ( ( rule__Loop__LoopControlQubitsAssignment_34_5_2 ) ) ;
    public final void rule__Loop__Group_34_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7332:1: ( ( ( rule__Loop__LoopControlQubitsAssignment_34_5_2 ) ) )
            // InternalQuCircuit.g:7333:1: ( ( rule__Loop__LoopControlQubitsAssignment_34_5_2 ) )
            {
            // InternalQuCircuit.g:7333:1: ( ( rule__Loop__LoopControlQubitsAssignment_34_5_2 ) )
            // InternalQuCircuit.g:7334:2: ( rule__Loop__LoopControlQubitsAssignment_34_5_2 )
            {
             before(grammarAccess.getLoopAccess().getLoopControlQubitsAssignment_34_5_2()); 
            // InternalQuCircuit.g:7335:2: ( rule__Loop__LoopControlQubitsAssignment_34_5_2 )
            // InternalQuCircuit.g:7335:3: rule__Loop__LoopControlQubitsAssignment_34_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Loop__LoopControlQubitsAssignment_34_5_2();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getLoopControlQubitsAssignment_34_5_2()); 

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
    // $ANTLR end "rule__Loop__Group_34_5__2__Impl"


    // $ANTLR start "rule__Loop__Group_34_5__3"
    // InternalQuCircuit.g:7343:1: rule__Loop__Group_34_5__3 : rule__Loop__Group_34_5__3__Impl ;
    public final void rule__Loop__Group_34_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7347:1: ( rule__Loop__Group_34_5__3__Impl )
            // InternalQuCircuit.g:7348:2: rule__Loop__Group_34_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Loop__Group_34_5__3__Impl();

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
    // $ANTLR end "rule__Loop__Group_34_5__3"


    // $ANTLR start "rule__Loop__Group_34_5__3__Impl"
    // InternalQuCircuit.g:7354:1: rule__Loop__Group_34_5__3__Impl : ( ')' ) ;
    public final void rule__Loop__Group_34_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7358:1: ( ( ')' ) )
            // InternalQuCircuit.g:7359:1: ( ')' )
            {
            // InternalQuCircuit.g:7359:1: ( ')' )
            // InternalQuCircuit.g:7360:2: ')'
            {
             before(grammarAccess.getLoopAccess().getRightParenthesisKeyword_34_5_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getRightParenthesisKeyword_34_5_3()); 

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
    // $ANTLR end "rule__Loop__Group_34_5__3__Impl"


    // $ANTLR start "rule__Operation__Group__0"
    // InternalQuCircuit.g:7370:1: rule__Operation__Group__0 : rule__Operation__Group__0__Impl rule__Operation__Group__1 ;
    public final void rule__Operation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7374:1: ( rule__Operation__Group__0__Impl rule__Operation__Group__1 )
            // InternalQuCircuit.g:7375:2: rule__Operation__Group__0__Impl rule__Operation__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Operation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__1();

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
    // $ANTLR end "rule__Operation__Group__0"


    // $ANTLR start "rule__Operation__Group__0__Impl"
    // InternalQuCircuit.g:7382:1: rule__Operation__Group__0__Impl : ( ( rule__Operation__OperationAssignment_0 ) ) ;
    public final void rule__Operation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7386:1: ( ( ( rule__Operation__OperationAssignment_0 ) ) )
            // InternalQuCircuit.g:7387:1: ( ( rule__Operation__OperationAssignment_0 ) )
            {
            // InternalQuCircuit.g:7387:1: ( ( rule__Operation__OperationAssignment_0 ) )
            // InternalQuCircuit.g:7388:2: ( rule__Operation__OperationAssignment_0 )
            {
             before(grammarAccess.getOperationAccess().getOperationAssignment_0()); 
            // InternalQuCircuit.g:7389:2: ( rule__Operation__OperationAssignment_0 )
            // InternalQuCircuit.g:7389:3: rule__Operation__OperationAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Operation__OperationAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getOperationAssignment_0()); 

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
    // $ANTLR end "rule__Operation__Group__0__Impl"


    // $ANTLR start "rule__Operation__Group__1"
    // InternalQuCircuit.g:7397:1: rule__Operation__Group__1 : rule__Operation__Group__1__Impl ;
    public final void rule__Operation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7401:1: ( rule__Operation__Group__1__Impl )
            // InternalQuCircuit.g:7402:2: rule__Operation__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group__1__Impl();

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
    // $ANTLR end "rule__Operation__Group__1"


    // $ANTLR start "rule__Operation__Group__1__Impl"
    // InternalQuCircuit.g:7408:1: rule__Operation__Group__1__Impl : ( ( rule__Operation__Group_1__0 )? ) ;
    public final void rule__Operation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7412:1: ( ( ( rule__Operation__Group_1__0 )? ) )
            // InternalQuCircuit.g:7413:1: ( ( rule__Operation__Group_1__0 )? )
            {
            // InternalQuCircuit.g:7413:1: ( ( rule__Operation__Group_1__0 )? )
            // InternalQuCircuit.g:7414:2: ( rule__Operation__Group_1__0 )?
            {
             before(grammarAccess.getOperationAccess().getGroup_1()); 
            // InternalQuCircuit.g:7415:2: ( rule__Operation__Group_1__0 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==21) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalQuCircuit.g:7415:3: rule__Operation__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operation__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperationAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Operation__Group__1__Impl"


    // $ANTLR start "rule__Operation__Group_1__0"
    // InternalQuCircuit.g:7424:1: rule__Operation__Group_1__0 : rule__Operation__Group_1__0__Impl rule__Operation__Group_1__1 ;
    public final void rule__Operation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7428:1: ( rule__Operation__Group_1__0__Impl rule__Operation__Group_1__1 )
            // InternalQuCircuit.g:7429:2: rule__Operation__Group_1__0__Impl rule__Operation__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Operation__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group_1__1();

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
    // $ANTLR end "rule__Operation__Group_1__0"


    // $ANTLR start "rule__Operation__Group_1__0__Impl"
    // InternalQuCircuit.g:7436:1: rule__Operation__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Operation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7440:1: ( ( '(' ) )
            // InternalQuCircuit.g:7441:1: ( '(' )
            {
            // InternalQuCircuit.g:7441:1: ( '(' )
            // InternalQuCircuit.g:7442:2: '('
            {
             before(grammarAccess.getOperationAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getLeftParenthesisKeyword_1_0()); 

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
    // $ANTLR end "rule__Operation__Group_1__0__Impl"


    // $ANTLR start "rule__Operation__Group_1__1"
    // InternalQuCircuit.g:7451:1: rule__Operation__Group_1__1 : rule__Operation__Group_1__1__Impl rule__Operation__Group_1__2 ;
    public final void rule__Operation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7455:1: ( rule__Operation__Group_1__1__Impl rule__Operation__Group_1__2 )
            // InternalQuCircuit.g:7456:2: rule__Operation__Group_1__1__Impl rule__Operation__Group_1__2
            {
            pushFollow(FOLLOW_15);
            rule__Operation__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group_1__2();

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
    // $ANTLR end "rule__Operation__Group_1__1"


    // $ANTLR start "rule__Operation__Group_1__1__Impl"
    // InternalQuCircuit.g:7463:1: rule__Operation__Group_1__1__Impl : ( ( rule__Operation__QuboAssignment_1_1 ) ) ;
    public final void rule__Operation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7467:1: ( ( ( rule__Operation__QuboAssignment_1_1 ) ) )
            // InternalQuCircuit.g:7468:1: ( ( rule__Operation__QuboAssignment_1_1 ) )
            {
            // InternalQuCircuit.g:7468:1: ( ( rule__Operation__QuboAssignment_1_1 ) )
            // InternalQuCircuit.g:7469:2: ( rule__Operation__QuboAssignment_1_1 )
            {
             before(grammarAccess.getOperationAccess().getQuboAssignment_1_1()); 
            // InternalQuCircuit.g:7470:2: ( rule__Operation__QuboAssignment_1_1 )
            // InternalQuCircuit.g:7470:3: rule__Operation__QuboAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Operation__QuboAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getQuboAssignment_1_1()); 

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
    // $ANTLR end "rule__Operation__Group_1__1__Impl"


    // $ANTLR start "rule__Operation__Group_1__2"
    // InternalQuCircuit.g:7478:1: rule__Operation__Group_1__2 : rule__Operation__Group_1__2__Impl ;
    public final void rule__Operation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7482:1: ( rule__Operation__Group_1__2__Impl )
            // InternalQuCircuit.g:7483:2: rule__Operation__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group_1__2__Impl();

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
    // $ANTLR end "rule__Operation__Group_1__2"


    // $ANTLR start "rule__Operation__Group_1__2__Impl"
    // InternalQuCircuit.g:7489:1: rule__Operation__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Operation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7493:1: ( ( ')' ) )
            // InternalQuCircuit.g:7494:1: ( ')' )
            {
            // InternalQuCircuit.g:7494:1: ( ')' )
            // InternalQuCircuit.g:7495:2: ')'
            {
             before(grammarAccess.getOperationAccess().getRightParenthesisKeyword_1_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getRightParenthesisKeyword_1_2()); 

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
    // $ANTLR end "rule__Operation__Group_1__2__Impl"


    // $ANTLR start "rule__ElementSelector__Group__0"
    // InternalQuCircuit.g:7505:1: rule__ElementSelector__Group__0 : rule__ElementSelector__Group__0__Impl rule__ElementSelector__Group__1 ;
    public final void rule__ElementSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7509:1: ( rule__ElementSelector__Group__0__Impl rule__ElementSelector__Group__1 )
            // InternalQuCircuit.g:7510:2: rule__ElementSelector__Group__0__Impl rule__ElementSelector__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__ElementSelector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementSelector__Group__1();

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
    // $ANTLR end "rule__ElementSelector__Group__0"


    // $ANTLR start "rule__ElementSelector__Group__0__Impl"
    // InternalQuCircuit.g:7517:1: rule__ElementSelector__Group__0__Impl : ( () ) ;
    public final void rule__ElementSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7521:1: ( ( () ) )
            // InternalQuCircuit.g:7522:1: ( () )
            {
            // InternalQuCircuit.g:7522:1: ( () )
            // InternalQuCircuit.g:7523:2: ()
            {
             before(grammarAccess.getElementSelectorAccess().getElementSelectorAction_0()); 
            // InternalQuCircuit.g:7524:2: ()
            // InternalQuCircuit.g:7524:3: 
            {
            }

             after(grammarAccess.getElementSelectorAccess().getElementSelectorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementSelector__Group__0__Impl"


    // $ANTLR start "rule__ElementSelector__Group__1"
    // InternalQuCircuit.g:7532:1: rule__ElementSelector__Group__1 : rule__ElementSelector__Group__1__Impl rule__ElementSelector__Group__2 ;
    public final void rule__ElementSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7536:1: ( rule__ElementSelector__Group__1__Impl rule__ElementSelector__Group__2 )
            // InternalQuCircuit.g:7537:2: rule__ElementSelector__Group__1__Impl rule__ElementSelector__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__ElementSelector__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementSelector__Group__2();

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
    // $ANTLR end "rule__ElementSelector__Group__1"


    // $ANTLR start "rule__ElementSelector__Group__1__Impl"
    // InternalQuCircuit.g:7544:1: rule__ElementSelector__Group__1__Impl : ( ( rule__ElementSelector__Group_1__0 )? ) ;
    public final void rule__ElementSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7548:1: ( ( ( rule__ElementSelector__Group_1__0 )? ) )
            // InternalQuCircuit.g:7549:1: ( ( rule__ElementSelector__Group_1__0 )? )
            {
            // InternalQuCircuit.g:7549:1: ( ( rule__ElementSelector__Group_1__0 )? )
            // InternalQuCircuit.g:7550:2: ( rule__ElementSelector__Group_1__0 )?
            {
             before(grammarAccess.getElementSelectorAccess().getGroup_1()); 
            // InternalQuCircuit.g:7551:2: ( rule__ElementSelector__Group_1__0 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( ((LA57_0>=RULE_STRING && LA57_0<=RULE_ID)) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalQuCircuit.g:7551:3: rule__ElementSelector__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ElementSelector__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getElementSelectorAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ElementSelector__Group__1__Impl"


    // $ANTLR start "rule__ElementSelector__Group__2"
    // InternalQuCircuit.g:7559:1: rule__ElementSelector__Group__2 : rule__ElementSelector__Group__2__Impl ;
    public final void rule__ElementSelector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7563:1: ( rule__ElementSelector__Group__2__Impl )
            // InternalQuCircuit.g:7564:2: rule__ElementSelector__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ElementSelector__Group__2__Impl();

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
    // $ANTLR end "rule__ElementSelector__Group__2"


    // $ANTLR start "rule__ElementSelector__Group__2__Impl"
    // InternalQuCircuit.g:7570:1: rule__ElementSelector__Group__2__Impl : ( ( rule__ElementSelector__IndexAssignment_2 ) ) ;
    public final void rule__ElementSelector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7574:1: ( ( ( rule__ElementSelector__IndexAssignment_2 ) ) )
            // InternalQuCircuit.g:7575:1: ( ( rule__ElementSelector__IndexAssignment_2 ) )
            {
            // InternalQuCircuit.g:7575:1: ( ( rule__ElementSelector__IndexAssignment_2 ) )
            // InternalQuCircuit.g:7576:2: ( rule__ElementSelector__IndexAssignment_2 )
            {
             before(grammarAccess.getElementSelectorAccess().getIndexAssignment_2()); 
            // InternalQuCircuit.g:7577:2: ( rule__ElementSelector__IndexAssignment_2 )
            // InternalQuCircuit.g:7577:3: rule__ElementSelector__IndexAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ElementSelector__IndexAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getElementSelectorAccess().getIndexAssignment_2()); 

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
    // $ANTLR end "rule__ElementSelector__Group__2__Impl"


    // $ANTLR start "rule__ElementSelector__Group_1__0"
    // InternalQuCircuit.g:7586:1: rule__ElementSelector__Group_1__0 : rule__ElementSelector__Group_1__0__Impl rule__ElementSelector__Group_1__1 ;
    public final void rule__ElementSelector__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7590:1: ( rule__ElementSelector__Group_1__0__Impl rule__ElementSelector__Group_1__1 )
            // InternalQuCircuit.g:7591:2: rule__ElementSelector__Group_1__0__Impl rule__ElementSelector__Group_1__1
            {
            pushFollow(FOLLOW_42);
            rule__ElementSelector__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElementSelector__Group_1__1();

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
    // $ANTLR end "rule__ElementSelector__Group_1__0"


    // $ANTLR start "rule__ElementSelector__Group_1__0__Impl"
    // InternalQuCircuit.g:7598:1: rule__ElementSelector__Group_1__0__Impl : ( ( rule__ElementSelector__RegisterAssignment_1_0 ) ) ;
    public final void rule__ElementSelector__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7602:1: ( ( ( rule__ElementSelector__RegisterAssignment_1_0 ) ) )
            // InternalQuCircuit.g:7603:1: ( ( rule__ElementSelector__RegisterAssignment_1_0 ) )
            {
            // InternalQuCircuit.g:7603:1: ( ( rule__ElementSelector__RegisterAssignment_1_0 ) )
            // InternalQuCircuit.g:7604:2: ( rule__ElementSelector__RegisterAssignment_1_0 )
            {
             before(grammarAccess.getElementSelectorAccess().getRegisterAssignment_1_0()); 
            // InternalQuCircuit.g:7605:2: ( rule__ElementSelector__RegisterAssignment_1_0 )
            // InternalQuCircuit.g:7605:3: rule__ElementSelector__RegisterAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ElementSelector__RegisterAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getElementSelectorAccess().getRegisterAssignment_1_0()); 

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
    // $ANTLR end "rule__ElementSelector__Group_1__0__Impl"


    // $ANTLR start "rule__ElementSelector__Group_1__1"
    // InternalQuCircuit.g:7613:1: rule__ElementSelector__Group_1__1 : rule__ElementSelector__Group_1__1__Impl ;
    public final void rule__ElementSelector__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7617:1: ( rule__ElementSelector__Group_1__1__Impl )
            // InternalQuCircuit.g:7618:2: rule__ElementSelector__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ElementSelector__Group_1__1__Impl();

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
    // $ANTLR end "rule__ElementSelector__Group_1__1"


    // $ANTLR start "rule__ElementSelector__Group_1__1__Impl"
    // InternalQuCircuit.g:7624:1: rule__ElementSelector__Group_1__1__Impl : ( ',' ) ;
    public final void rule__ElementSelector__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7628:1: ( ( ',' ) )
            // InternalQuCircuit.g:7629:1: ( ',' )
            {
            // InternalQuCircuit.g:7629:1: ( ',' )
            // InternalQuCircuit.g:7630:2: ','
            {
             before(grammarAccess.getElementSelectorAccess().getCommaKeyword_1_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getElementSelectorAccess().getCommaKeyword_1_1()); 

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
    // $ANTLR end "rule__ElementSelector__Group_1__1__Impl"


    // $ANTLR start "rule__RangeSelector__Group__0"
    // InternalQuCircuit.g:7640:1: rule__RangeSelector__Group__0 : rule__RangeSelector__Group__0__Impl rule__RangeSelector__Group__1 ;
    public final void rule__RangeSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7644:1: ( rule__RangeSelector__Group__0__Impl rule__RangeSelector__Group__1 )
            // InternalQuCircuit.g:7645:2: rule__RangeSelector__Group__0__Impl rule__RangeSelector__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__RangeSelector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RangeSelector__Group__1();

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
    // $ANTLR end "rule__RangeSelector__Group__0"


    // $ANTLR start "rule__RangeSelector__Group__0__Impl"
    // InternalQuCircuit.g:7652:1: rule__RangeSelector__Group__0__Impl : ( () ) ;
    public final void rule__RangeSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7656:1: ( ( () ) )
            // InternalQuCircuit.g:7657:1: ( () )
            {
            // InternalQuCircuit.g:7657:1: ( () )
            // InternalQuCircuit.g:7658:2: ()
            {
             before(grammarAccess.getRangeSelectorAccess().getRangeSelectorAction_0()); 
            // InternalQuCircuit.g:7659:2: ()
            // InternalQuCircuit.g:7659:3: 
            {
            }

             after(grammarAccess.getRangeSelectorAccess().getRangeSelectorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RangeSelector__Group__0__Impl"


    // $ANTLR start "rule__RangeSelector__Group__1"
    // InternalQuCircuit.g:7667:1: rule__RangeSelector__Group__1 : rule__RangeSelector__Group__1__Impl rule__RangeSelector__Group__2 ;
    public final void rule__RangeSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7671:1: ( rule__RangeSelector__Group__1__Impl rule__RangeSelector__Group__2 )
            // InternalQuCircuit.g:7672:2: rule__RangeSelector__Group__1__Impl rule__RangeSelector__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__RangeSelector__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RangeSelector__Group__2();

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
    // $ANTLR end "rule__RangeSelector__Group__1"


    // $ANTLR start "rule__RangeSelector__Group__1__Impl"
    // InternalQuCircuit.g:7679:1: rule__RangeSelector__Group__1__Impl : ( ( rule__RangeSelector__Group_1__0 )? ) ;
    public final void rule__RangeSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7683:1: ( ( ( rule__RangeSelector__Group_1__0 )? ) )
            // InternalQuCircuit.g:7684:1: ( ( rule__RangeSelector__Group_1__0 )? )
            {
            // InternalQuCircuit.g:7684:1: ( ( rule__RangeSelector__Group_1__0 )? )
            // InternalQuCircuit.g:7685:2: ( rule__RangeSelector__Group_1__0 )?
            {
             before(grammarAccess.getRangeSelectorAccess().getGroup_1()); 
            // InternalQuCircuit.g:7686:2: ( rule__RangeSelector__Group_1__0 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( ((LA58_0>=RULE_STRING && LA58_0<=RULE_ID)) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalQuCircuit.g:7686:3: rule__RangeSelector__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RangeSelector__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRangeSelectorAccess().getGroup_1()); 

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
    // $ANTLR end "rule__RangeSelector__Group__1__Impl"


    // $ANTLR start "rule__RangeSelector__Group__2"
    // InternalQuCircuit.g:7694:1: rule__RangeSelector__Group__2 : rule__RangeSelector__Group__2__Impl rule__RangeSelector__Group__3 ;
    public final void rule__RangeSelector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7698:1: ( rule__RangeSelector__Group__2__Impl rule__RangeSelector__Group__3 )
            // InternalQuCircuit.g:7699:2: rule__RangeSelector__Group__2__Impl rule__RangeSelector__Group__3
            {
            pushFollow(FOLLOW_43);
            rule__RangeSelector__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RangeSelector__Group__3();

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
    // $ANTLR end "rule__RangeSelector__Group__2"


    // $ANTLR start "rule__RangeSelector__Group__2__Impl"
    // InternalQuCircuit.g:7706:1: rule__RangeSelector__Group__2__Impl : ( ( rule__RangeSelector__BeginAssignment_2 ) ) ;
    public final void rule__RangeSelector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7710:1: ( ( ( rule__RangeSelector__BeginAssignment_2 ) ) )
            // InternalQuCircuit.g:7711:1: ( ( rule__RangeSelector__BeginAssignment_2 ) )
            {
            // InternalQuCircuit.g:7711:1: ( ( rule__RangeSelector__BeginAssignment_2 ) )
            // InternalQuCircuit.g:7712:2: ( rule__RangeSelector__BeginAssignment_2 )
            {
             before(grammarAccess.getRangeSelectorAccess().getBeginAssignment_2()); 
            // InternalQuCircuit.g:7713:2: ( rule__RangeSelector__BeginAssignment_2 )
            // InternalQuCircuit.g:7713:3: rule__RangeSelector__BeginAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RangeSelector__BeginAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRangeSelectorAccess().getBeginAssignment_2()); 

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
    // $ANTLR end "rule__RangeSelector__Group__2__Impl"


    // $ANTLR start "rule__RangeSelector__Group__3"
    // InternalQuCircuit.g:7721:1: rule__RangeSelector__Group__3 : rule__RangeSelector__Group__3__Impl rule__RangeSelector__Group__4 ;
    public final void rule__RangeSelector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7725:1: ( rule__RangeSelector__Group__3__Impl rule__RangeSelector__Group__4 )
            // InternalQuCircuit.g:7726:2: rule__RangeSelector__Group__3__Impl rule__RangeSelector__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__RangeSelector__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RangeSelector__Group__4();

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
    // $ANTLR end "rule__RangeSelector__Group__3"


    // $ANTLR start "rule__RangeSelector__Group__3__Impl"
    // InternalQuCircuit.g:7733:1: rule__RangeSelector__Group__3__Impl : ( '-' ) ;
    public final void rule__RangeSelector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7737:1: ( ( '-' ) )
            // InternalQuCircuit.g:7738:1: ( '-' )
            {
            // InternalQuCircuit.g:7738:1: ( '-' )
            // InternalQuCircuit.g:7739:2: '-'
            {
             before(grammarAccess.getRangeSelectorAccess().getHyphenMinusKeyword_3()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getRangeSelectorAccess().getHyphenMinusKeyword_3()); 

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
    // $ANTLR end "rule__RangeSelector__Group__3__Impl"


    // $ANTLR start "rule__RangeSelector__Group__4"
    // InternalQuCircuit.g:7748:1: rule__RangeSelector__Group__4 : rule__RangeSelector__Group__4__Impl ;
    public final void rule__RangeSelector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7752:1: ( rule__RangeSelector__Group__4__Impl )
            // InternalQuCircuit.g:7753:2: rule__RangeSelector__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RangeSelector__Group__4__Impl();

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
    // $ANTLR end "rule__RangeSelector__Group__4"


    // $ANTLR start "rule__RangeSelector__Group__4__Impl"
    // InternalQuCircuit.g:7759:1: rule__RangeSelector__Group__4__Impl : ( ( rule__RangeSelector__EndAssignment_4 ) ) ;
    public final void rule__RangeSelector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7763:1: ( ( ( rule__RangeSelector__EndAssignment_4 ) ) )
            // InternalQuCircuit.g:7764:1: ( ( rule__RangeSelector__EndAssignment_4 ) )
            {
            // InternalQuCircuit.g:7764:1: ( ( rule__RangeSelector__EndAssignment_4 ) )
            // InternalQuCircuit.g:7765:2: ( rule__RangeSelector__EndAssignment_4 )
            {
             before(grammarAccess.getRangeSelectorAccess().getEndAssignment_4()); 
            // InternalQuCircuit.g:7766:2: ( rule__RangeSelector__EndAssignment_4 )
            // InternalQuCircuit.g:7766:3: rule__RangeSelector__EndAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__RangeSelector__EndAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRangeSelectorAccess().getEndAssignment_4()); 

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
    // $ANTLR end "rule__RangeSelector__Group__4__Impl"


    // $ANTLR start "rule__RangeSelector__Group_1__0"
    // InternalQuCircuit.g:7775:1: rule__RangeSelector__Group_1__0 : rule__RangeSelector__Group_1__0__Impl rule__RangeSelector__Group_1__1 ;
    public final void rule__RangeSelector__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7779:1: ( rule__RangeSelector__Group_1__0__Impl rule__RangeSelector__Group_1__1 )
            // InternalQuCircuit.g:7780:2: rule__RangeSelector__Group_1__0__Impl rule__RangeSelector__Group_1__1
            {
            pushFollow(FOLLOW_42);
            rule__RangeSelector__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RangeSelector__Group_1__1();

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
    // $ANTLR end "rule__RangeSelector__Group_1__0"


    // $ANTLR start "rule__RangeSelector__Group_1__0__Impl"
    // InternalQuCircuit.g:7787:1: rule__RangeSelector__Group_1__0__Impl : ( ( rule__RangeSelector__RegisterAssignment_1_0 ) ) ;
    public final void rule__RangeSelector__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7791:1: ( ( ( rule__RangeSelector__RegisterAssignment_1_0 ) ) )
            // InternalQuCircuit.g:7792:1: ( ( rule__RangeSelector__RegisterAssignment_1_0 ) )
            {
            // InternalQuCircuit.g:7792:1: ( ( rule__RangeSelector__RegisterAssignment_1_0 ) )
            // InternalQuCircuit.g:7793:2: ( rule__RangeSelector__RegisterAssignment_1_0 )
            {
             before(grammarAccess.getRangeSelectorAccess().getRegisterAssignment_1_0()); 
            // InternalQuCircuit.g:7794:2: ( rule__RangeSelector__RegisterAssignment_1_0 )
            // InternalQuCircuit.g:7794:3: rule__RangeSelector__RegisterAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__RangeSelector__RegisterAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getRangeSelectorAccess().getRegisterAssignment_1_0()); 

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
    // $ANTLR end "rule__RangeSelector__Group_1__0__Impl"


    // $ANTLR start "rule__RangeSelector__Group_1__1"
    // InternalQuCircuit.g:7802:1: rule__RangeSelector__Group_1__1 : rule__RangeSelector__Group_1__1__Impl ;
    public final void rule__RangeSelector__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7806:1: ( rule__RangeSelector__Group_1__1__Impl )
            // InternalQuCircuit.g:7807:2: rule__RangeSelector__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RangeSelector__Group_1__1__Impl();

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
    // $ANTLR end "rule__RangeSelector__Group_1__1"


    // $ANTLR start "rule__RangeSelector__Group_1__1__Impl"
    // InternalQuCircuit.g:7813:1: rule__RangeSelector__Group_1__1__Impl : ( ',' ) ;
    public final void rule__RangeSelector__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7817:1: ( ( ',' ) )
            // InternalQuCircuit.g:7818:1: ( ',' )
            {
            // InternalQuCircuit.g:7818:1: ( ',' )
            // InternalQuCircuit.g:7819:2: ','
            {
             before(grammarAccess.getRangeSelectorAccess().getCommaKeyword_1_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getRangeSelectorAccess().getCommaKeyword_1_1()); 

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
    // $ANTLR end "rule__RangeSelector__Group_1__1__Impl"


    // $ANTLR start "rule__EDoubleObject__Group__0"
    // InternalQuCircuit.g:7829:1: rule__EDoubleObject__Group__0 : rule__EDoubleObject__Group__0__Impl rule__EDoubleObject__Group__1 ;
    public final void rule__EDoubleObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7833:1: ( rule__EDoubleObject__Group__0__Impl rule__EDoubleObject__Group__1 )
            // InternalQuCircuit.g:7834:2: rule__EDoubleObject__Group__0__Impl rule__EDoubleObject__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__EDoubleObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDoubleObject__Group__1();

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
    // $ANTLR end "rule__EDoubleObject__Group__0"


    // $ANTLR start "rule__EDoubleObject__Group__0__Impl"
    // InternalQuCircuit.g:7841:1: rule__EDoubleObject__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDoubleObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7845:1: ( ( ( '-' )? ) )
            // InternalQuCircuit.g:7846:1: ( ( '-' )? )
            {
            // InternalQuCircuit.g:7846:1: ( ( '-' )? )
            // InternalQuCircuit.g:7847:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleObjectAccess().getHyphenMinusKeyword_0()); 
            // InternalQuCircuit.g:7848:2: ( '-' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==54) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalQuCircuit.g:7848:3: '-'
                    {
                    match(input,54,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleObjectAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__EDoubleObject__Group__0__Impl"


    // $ANTLR start "rule__EDoubleObject__Group__1"
    // InternalQuCircuit.g:7856:1: rule__EDoubleObject__Group__1 : rule__EDoubleObject__Group__1__Impl rule__EDoubleObject__Group__2 ;
    public final void rule__EDoubleObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7860:1: ( rule__EDoubleObject__Group__1__Impl rule__EDoubleObject__Group__2 )
            // InternalQuCircuit.g:7861:2: rule__EDoubleObject__Group__1__Impl rule__EDoubleObject__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__EDoubleObject__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDoubleObject__Group__2();

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
    // $ANTLR end "rule__EDoubleObject__Group__1"


    // $ANTLR start "rule__EDoubleObject__Group__1__Impl"
    // InternalQuCircuit.g:7868:1: rule__EDoubleObject__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDoubleObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7872:1: ( ( ( RULE_INT )? ) )
            // InternalQuCircuit.g:7873:1: ( ( RULE_INT )? )
            {
            // InternalQuCircuit.g:7873:1: ( ( RULE_INT )? )
            // InternalQuCircuit.g:7874:2: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleObjectAccess().getINTTerminalRuleCall_1()); 
            // InternalQuCircuit.g:7875:2: ( RULE_INT )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_INT) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalQuCircuit.g:7875:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleObjectAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EDoubleObject__Group__1__Impl"


    // $ANTLR start "rule__EDoubleObject__Group__2"
    // InternalQuCircuit.g:7883:1: rule__EDoubleObject__Group__2 : rule__EDoubleObject__Group__2__Impl rule__EDoubleObject__Group__3 ;
    public final void rule__EDoubleObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7887:1: ( rule__EDoubleObject__Group__2__Impl rule__EDoubleObject__Group__3 )
            // InternalQuCircuit.g:7888:2: rule__EDoubleObject__Group__2__Impl rule__EDoubleObject__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__EDoubleObject__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDoubleObject__Group__3();

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
    // $ANTLR end "rule__EDoubleObject__Group__2"


    // $ANTLR start "rule__EDoubleObject__Group__2__Impl"
    // InternalQuCircuit.g:7895:1: rule__EDoubleObject__Group__2__Impl : ( '.' ) ;
    public final void rule__EDoubleObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7899:1: ( ( '.' ) )
            // InternalQuCircuit.g:7900:1: ( '.' )
            {
            // InternalQuCircuit.g:7900:1: ( '.' )
            // InternalQuCircuit.g:7901:2: '.'
            {
             before(grammarAccess.getEDoubleObjectAccess().getFullStopKeyword_2()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getEDoubleObjectAccess().getFullStopKeyword_2()); 

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
    // $ANTLR end "rule__EDoubleObject__Group__2__Impl"


    // $ANTLR start "rule__EDoubleObject__Group__3"
    // InternalQuCircuit.g:7910:1: rule__EDoubleObject__Group__3 : rule__EDoubleObject__Group__3__Impl rule__EDoubleObject__Group__4 ;
    public final void rule__EDoubleObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7914:1: ( rule__EDoubleObject__Group__3__Impl rule__EDoubleObject__Group__4 )
            // InternalQuCircuit.g:7915:2: rule__EDoubleObject__Group__3__Impl rule__EDoubleObject__Group__4
            {
            pushFollow(FOLLOW_44);
            rule__EDoubleObject__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDoubleObject__Group__4();

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
    // $ANTLR end "rule__EDoubleObject__Group__3"


    // $ANTLR start "rule__EDoubleObject__Group__3__Impl"
    // InternalQuCircuit.g:7922:1: rule__EDoubleObject__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDoubleObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7926:1: ( ( RULE_INT ) )
            // InternalQuCircuit.g:7927:1: ( RULE_INT )
            {
            // InternalQuCircuit.g:7927:1: ( RULE_INT )
            // InternalQuCircuit.g:7928:2: RULE_INT
            {
             before(grammarAccess.getEDoubleObjectAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleObjectAccess().getINTTerminalRuleCall_3()); 

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
    // $ANTLR end "rule__EDoubleObject__Group__3__Impl"


    // $ANTLR start "rule__EDoubleObject__Group__4"
    // InternalQuCircuit.g:7937:1: rule__EDoubleObject__Group__4 : rule__EDoubleObject__Group__4__Impl ;
    public final void rule__EDoubleObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7941:1: ( rule__EDoubleObject__Group__4__Impl )
            // InternalQuCircuit.g:7942:2: rule__EDoubleObject__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDoubleObject__Group__4__Impl();

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
    // $ANTLR end "rule__EDoubleObject__Group__4"


    // $ANTLR start "rule__EDoubleObject__Group__4__Impl"
    // InternalQuCircuit.g:7948:1: rule__EDoubleObject__Group__4__Impl : ( ( rule__EDoubleObject__Group_4__0 )? ) ;
    public final void rule__EDoubleObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7952:1: ( ( ( rule__EDoubleObject__Group_4__0 )? ) )
            // InternalQuCircuit.g:7953:1: ( ( rule__EDoubleObject__Group_4__0 )? )
            {
            // InternalQuCircuit.g:7953:1: ( ( rule__EDoubleObject__Group_4__0 )? )
            // InternalQuCircuit.g:7954:2: ( rule__EDoubleObject__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleObjectAccess().getGroup_4()); 
            // InternalQuCircuit.g:7955:2: ( rule__EDoubleObject__Group_4__0 )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( ((LA61_0>=11 && LA61_0<=12)) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalQuCircuit.g:7955:3: rule__EDoubleObject__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EDoubleObject__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEDoubleObjectAccess().getGroup_4()); 

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
    // $ANTLR end "rule__EDoubleObject__Group__4__Impl"


    // $ANTLR start "rule__EDoubleObject__Group_4__0"
    // InternalQuCircuit.g:7964:1: rule__EDoubleObject__Group_4__0 : rule__EDoubleObject__Group_4__0__Impl rule__EDoubleObject__Group_4__1 ;
    public final void rule__EDoubleObject__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7968:1: ( rule__EDoubleObject__Group_4__0__Impl rule__EDoubleObject__Group_4__1 )
            // InternalQuCircuit.g:7969:2: rule__EDoubleObject__Group_4__0__Impl rule__EDoubleObject__Group_4__1
            {
            pushFollow(FOLLOW_45);
            rule__EDoubleObject__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDoubleObject__Group_4__1();

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
    // $ANTLR end "rule__EDoubleObject__Group_4__0"


    // $ANTLR start "rule__EDoubleObject__Group_4__0__Impl"
    // InternalQuCircuit.g:7976:1: rule__EDoubleObject__Group_4__0__Impl : ( ( rule__EDoubleObject__Alternatives_4_0 ) ) ;
    public final void rule__EDoubleObject__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7980:1: ( ( ( rule__EDoubleObject__Alternatives_4_0 ) ) )
            // InternalQuCircuit.g:7981:1: ( ( rule__EDoubleObject__Alternatives_4_0 ) )
            {
            // InternalQuCircuit.g:7981:1: ( ( rule__EDoubleObject__Alternatives_4_0 ) )
            // InternalQuCircuit.g:7982:2: ( rule__EDoubleObject__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleObjectAccess().getAlternatives_4_0()); 
            // InternalQuCircuit.g:7983:2: ( rule__EDoubleObject__Alternatives_4_0 )
            // InternalQuCircuit.g:7983:3: rule__EDoubleObject__Alternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__EDoubleObject__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleObjectAccess().getAlternatives_4_0()); 

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
    // $ANTLR end "rule__EDoubleObject__Group_4__0__Impl"


    // $ANTLR start "rule__EDoubleObject__Group_4__1"
    // InternalQuCircuit.g:7991:1: rule__EDoubleObject__Group_4__1 : rule__EDoubleObject__Group_4__1__Impl rule__EDoubleObject__Group_4__2 ;
    public final void rule__EDoubleObject__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:7995:1: ( rule__EDoubleObject__Group_4__1__Impl rule__EDoubleObject__Group_4__2 )
            // InternalQuCircuit.g:7996:2: rule__EDoubleObject__Group_4__1__Impl rule__EDoubleObject__Group_4__2
            {
            pushFollow(FOLLOW_45);
            rule__EDoubleObject__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDoubleObject__Group_4__2();

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
    // $ANTLR end "rule__EDoubleObject__Group_4__1"


    // $ANTLR start "rule__EDoubleObject__Group_4__1__Impl"
    // InternalQuCircuit.g:8003:1: rule__EDoubleObject__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDoubleObject__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8007:1: ( ( ( '-' )? ) )
            // InternalQuCircuit.g:8008:1: ( ( '-' )? )
            {
            // InternalQuCircuit.g:8008:1: ( ( '-' )? )
            // InternalQuCircuit.g:8009:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleObjectAccess().getHyphenMinusKeyword_4_1()); 
            // InternalQuCircuit.g:8010:2: ( '-' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==54) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalQuCircuit.g:8010:3: '-'
                    {
                    match(input,54,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleObjectAccess().getHyphenMinusKeyword_4_1()); 

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
    // $ANTLR end "rule__EDoubleObject__Group_4__1__Impl"


    // $ANTLR start "rule__EDoubleObject__Group_4__2"
    // InternalQuCircuit.g:8018:1: rule__EDoubleObject__Group_4__2 : rule__EDoubleObject__Group_4__2__Impl ;
    public final void rule__EDoubleObject__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8022:1: ( rule__EDoubleObject__Group_4__2__Impl )
            // InternalQuCircuit.g:8023:2: rule__EDoubleObject__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDoubleObject__Group_4__2__Impl();

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
    // $ANTLR end "rule__EDoubleObject__Group_4__2"


    // $ANTLR start "rule__EDoubleObject__Group_4__2__Impl"
    // InternalQuCircuit.g:8029:1: rule__EDoubleObject__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDoubleObject__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8033:1: ( ( RULE_INT ) )
            // InternalQuCircuit.g:8034:1: ( RULE_INT )
            {
            // InternalQuCircuit.g:8034:1: ( RULE_INT )
            // InternalQuCircuit.g:8035:2: RULE_INT
            {
             before(grammarAccess.getEDoubleObjectAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleObjectAccess().getINTTerminalRuleCall_4_2()); 

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
    // $ANTLR end "rule__EDoubleObject__Group_4__2__Impl"


    // $ANTLR start "rule__QuantumCircuit__NameAssignment_1"
    // InternalQuCircuit.g:8045:1: rule__QuantumCircuit__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__QuantumCircuit__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8049:1: ( ( ruleEString ) )
            // InternalQuCircuit.g:8050:2: ( ruleEString )
            {
            // InternalQuCircuit.g:8050:2: ( ruleEString )
            // InternalQuCircuit.g:8051:3: ruleEString
            {
             before(grammarAccess.getQuantumCircuitAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQuantumCircuitAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__QuantumCircuit__NameAssignment_1"


    // $ANTLR start "rule__QuantumCircuit__QuantumRegistersAssignment_2"
    // InternalQuCircuit.g:8060:1: rule__QuantumCircuit__QuantumRegistersAssignment_2 : ( ruleSimplifiedQuantumRegister ) ;
    public final void rule__QuantumCircuit__QuantumRegistersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8064:1: ( ( ruleSimplifiedQuantumRegister ) )
            // InternalQuCircuit.g:8065:2: ( ruleSimplifiedQuantumRegister )
            {
            // InternalQuCircuit.g:8065:2: ( ruleSimplifiedQuantumRegister )
            // InternalQuCircuit.g:8066:3: ruleSimplifiedQuantumRegister
            {
             before(grammarAccess.getQuantumCircuitAccess().getQuantumRegistersSimplifiedQuantumRegisterParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSimplifiedQuantumRegister();

            state._fsp--;

             after(grammarAccess.getQuantumCircuitAccess().getQuantumRegistersSimplifiedQuantumRegisterParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__QuantumCircuit__QuantumRegistersAssignment_2"


    // $ANTLR start "rule__QuantumCircuit__QuantumRegistersAssignment_4_0"
    // InternalQuCircuit.g:8075:1: rule__QuantumCircuit__QuantumRegistersAssignment_4_0 : ( ruleQuantumRegister ) ;
    public final void rule__QuantumCircuit__QuantumRegistersAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8079:1: ( ( ruleQuantumRegister ) )
            // InternalQuCircuit.g:8080:2: ( ruleQuantumRegister )
            {
            // InternalQuCircuit.g:8080:2: ( ruleQuantumRegister )
            // InternalQuCircuit.g:8081:3: ruleQuantumRegister
            {
             before(grammarAccess.getQuantumCircuitAccess().getQuantumRegistersQuantumRegisterParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleQuantumRegister();

            state._fsp--;

             after(grammarAccess.getQuantumCircuitAccess().getQuantumRegistersQuantumRegisterParserRuleCall_4_0_0()); 

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
    // $ANTLR end "rule__QuantumCircuit__QuantumRegistersAssignment_4_0"


    // $ANTLR start "rule__QuantumCircuit__QuantumRegistersAssignment_4_1"
    // InternalQuCircuit.g:8090:1: rule__QuantumCircuit__QuantumRegistersAssignment_4_1 : ( ruleQuantumRegister ) ;
    public final void rule__QuantumCircuit__QuantumRegistersAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8094:1: ( ( ruleQuantumRegister ) )
            // InternalQuCircuit.g:8095:2: ( ruleQuantumRegister )
            {
            // InternalQuCircuit.g:8095:2: ( ruleQuantumRegister )
            // InternalQuCircuit.g:8096:3: ruleQuantumRegister
            {
             before(grammarAccess.getQuantumCircuitAccess().getQuantumRegistersQuantumRegisterParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQuantumRegister();

            state._fsp--;

             after(grammarAccess.getQuantumCircuitAccess().getQuantumRegistersQuantumRegisterParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__QuantumCircuit__QuantumRegistersAssignment_4_1"


    // $ANTLR start "rule__QuantumCircuit__ClassicRegistersAssignment_5"
    // InternalQuCircuit.g:8105:1: rule__QuantumCircuit__ClassicRegistersAssignment_5 : ( ruleClassicRegister ) ;
    public final void rule__QuantumCircuit__ClassicRegistersAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8109:1: ( ( ruleClassicRegister ) )
            // InternalQuCircuit.g:8110:2: ( ruleClassicRegister )
            {
            // InternalQuCircuit.g:8110:2: ( ruleClassicRegister )
            // InternalQuCircuit.g:8111:3: ruleClassicRegister
            {
             before(grammarAccess.getQuantumCircuitAccess().getClassicRegistersClassicRegisterParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleClassicRegister();

            state._fsp--;

             after(grammarAccess.getQuantumCircuitAccess().getClassicRegistersClassicRegisterParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__QuantumCircuit__ClassicRegistersAssignment_5"


    // $ANTLR start "rule__QuantumCircuit__LayersAssignment_6"
    // InternalQuCircuit.g:8120:1: rule__QuantumCircuit__LayersAssignment_6 : ( ruleLayer ) ;
    public final void rule__QuantumCircuit__LayersAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8124:1: ( ( ruleLayer ) )
            // InternalQuCircuit.g:8125:2: ( ruleLayer )
            {
            // InternalQuCircuit.g:8125:2: ( ruleLayer )
            // InternalQuCircuit.g:8126:3: ruleLayer
            {
             before(grammarAccess.getQuantumCircuitAccess().getLayersLayerParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleLayer();

            state._fsp--;

             after(grammarAccess.getQuantumCircuitAccess().getLayersLayerParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__QuantumCircuit__LayersAssignment_6"


    // $ANTLR start "rule__QuantumCircuit__LayersAssignment_7"
    // InternalQuCircuit.g:8135:1: rule__QuantumCircuit__LayersAssignment_7 : ( ruleLayer ) ;
    public final void rule__QuantumCircuit__LayersAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8139:1: ( ( ruleLayer ) )
            // InternalQuCircuit.g:8140:2: ( ruleLayer )
            {
            // InternalQuCircuit.g:8140:2: ( ruleLayer )
            // InternalQuCircuit.g:8141:3: ruleLayer
            {
             before(grammarAccess.getQuantumCircuitAccess().getLayersLayerParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleLayer();

            state._fsp--;

             after(grammarAccess.getQuantumCircuitAccess().getLayersLayerParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__QuantumCircuit__LayersAssignment_7"


    // $ANTLR start "rule__QuantumRegister__NameAssignment_2"
    // InternalQuCircuit.g:8150:1: rule__QuantumRegister__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__QuantumRegister__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8154:1: ( ( ruleEString ) )
            // InternalQuCircuit.g:8155:2: ( ruleEString )
            {
            // InternalQuCircuit.g:8155:2: ( ruleEString )
            // InternalQuCircuit.g:8156:3: ruleEString
            {
             before(grammarAccess.getQuantumRegisterAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQuantumRegisterAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__QuantumRegister__NameAssignment_2"


    // $ANTLR start "rule__QuantumRegister__NumberOfQubitsAssignment_4_1"
    // InternalQuCircuit.g:8165:1: rule__QuantumRegister__NumberOfQubitsAssignment_4_1 : ( RULE_INT ) ;
    public final void rule__QuantumRegister__NumberOfQubitsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8169:1: ( ( RULE_INT ) )
            // InternalQuCircuit.g:8170:2: ( RULE_INT )
            {
            // InternalQuCircuit.g:8170:2: ( RULE_INT )
            // InternalQuCircuit.g:8171:3: RULE_INT
            {
             before(grammarAccess.getQuantumRegisterAccess().getNumberOfQubitsINTTerminalRuleCall_4_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getQuantumRegisterAccess().getNumberOfQubitsINTTerminalRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__QuantumRegister__NumberOfQubitsAssignment_4_1"


    // $ANTLR start "rule__SimplifiedQuantumRegister__NumberOfQubitsAssignment_2"
    // InternalQuCircuit.g:8180:1: rule__SimplifiedQuantumRegister__NumberOfQubitsAssignment_2 : ( RULE_INT ) ;
    public final void rule__SimplifiedQuantumRegister__NumberOfQubitsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8184:1: ( ( RULE_INT ) )
            // InternalQuCircuit.g:8185:2: ( RULE_INT )
            {
            // InternalQuCircuit.g:8185:2: ( RULE_INT )
            // InternalQuCircuit.g:8186:3: RULE_INT
            {
             before(grammarAccess.getSimplifiedQuantumRegisterAccess().getNumberOfQubitsINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSimplifiedQuantumRegisterAccess().getNumberOfQubitsINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__SimplifiedQuantumRegister__NumberOfQubitsAssignment_2"


    // $ANTLR start "rule__ClassicRegister__NameAssignment_2"
    // InternalQuCircuit.g:8195:1: rule__ClassicRegister__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ClassicRegister__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8199:1: ( ( ruleEString ) )
            // InternalQuCircuit.g:8200:2: ( ruleEString )
            {
            // InternalQuCircuit.g:8200:2: ( ruleEString )
            // InternalQuCircuit.g:8201:3: ruleEString
            {
             before(grammarAccess.getClassicRegisterAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getClassicRegisterAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ClassicRegister__NameAssignment_2"


    // $ANTLR start "rule__ClassicRegister__NumberOfBitsAssignment_4_1"
    // InternalQuCircuit.g:8210:1: rule__ClassicRegister__NumberOfBitsAssignment_4_1 : ( RULE_INT ) ;
    public final void rule__ClassicRegister__NumberOfBitsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8214:1: ( ( RULE_INT ) )
            // InternalQuCircuit.g:8215:2: ( RULE_INT )
            {
            // InternalQuCircuit.g:8215:2: ( RULE_INT )
            // InternalQuCircuit.g:8216:3: RULE_INT
            {
             before(grammarAccess.getClassicRegisterAccess().getNumberOfBitsINTTerminalRuleCall_4_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getClassicRegisterAccess().getNumberOfBitsINTTerminalRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__ClassicRegister__NumberOfBitsAssignment_4_1"


    // $ANTLR start "rule__Layer__NameAssignment_2"
    // InternalQuCircuit.g:8225:1: rule__Layer__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Layer__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8229:1: ( ( ruleEString ) )
            // InternalQuCircuit.g:8230:2: ( ruleEString )
            {
            // InternalQuCircuit.g:8230:2: ( ruleEString )
            // InternalQuCircuit.g:8231:3: ruleEString
            {
             before(grammarAccess.getLayerAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLayerAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Layer__NameAssignment_2"


    // $ANTLR start "rule__Layer__QuantumOperationsAssignment_4"
    // InternalQuCircuit.g:8240:1: rule__Layer__QuantumOperationsAssignment_4 : ( ruleQuantumOperation ) ;
    public final void rule__Layer__QuantumOperationsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8244:1: ( ( ruleQuantumOperation ) )
            // InternalQuCircuit.g:8245:2: ( ruleQuantumOperation )
            {
            // InternalQuCircuit.g:8245:2: ( ruleQuantumOperation )
            // InternalQuCircuit.g:8246:3: ruleQuantumOperation
            {
             before(grammarAccess.getLayerAccess().getQuantumOperationsQuantumOperationParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleQuantumOperation();

            state._fsp--;

             after(grammarAccess.getLayerAccess().getQuantumOperationsQuantumOperationParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Layer__QuantumOperationsAssignment_4"


    // $ANTLR start "rule__Layer__QuantumOperationsAssignment_5_1"
    // InternalQuCircuit.g:8255:1: rule__Layer__QuantumOperationsAssignment_5_1 : ( ruleQuantumOperation ) ;
    public final void rule__Layer__QuantumOperationsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8259:1: ( ( ruleQuantumOperation ) )
            // InternalQuCircuit.g:8260:2: ( ruleQuantumOperation )
            {
            // InternalQuCircuit.g:8260:2: ( ruleQuantumOperation )
            // InternalQuCircuit.g:8261:3: ruleQuantumOperation
            {
             before(grammarAccess.getLayerAccess().getQuantumOperationsQuantumOperationParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQuantumOperation();

            state._fsp--;

             after(grammarAccess.getLayerAccess().getQuantumOperationsQuantumOperationParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Layer__QuantumOperationsAssignment_5_1"


    // $ANTLR start "rule__StatePreparation__NameAssignment_1"
    // InternalQuCircuit.g:8270:1: rule__StatePreparation__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__StatePreparation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8274:1: ( ( ruleEString ) )
            // InternalQuCircuit.g:8275:2: ( ruleEString )
            {
            // InternalQuCircuit.g:8275:2: ( ruleEString )
            // InternalQuCircuit.g:8276:3: ruleEString
            {
             before(grammarAccess.getStatePreparationAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStatePreparationAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__StatePreparation__NameAssignment_1"


    // $ANTLR start "rule__StatePreparation__OperationsAssignment_4"
    // InternalQuCircuit.g:8285:1: rule__StatePreparation__OperationsAssignment_4 : ( ruleOperation ) ;
    public final void rule__StatePreparation__OperationsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8289:1: ( ( ruleOperation ) )
            // InternalQuCircuit.g:8290:2: ( ruleOperation )
            {
            // InternalQuCircuit.g:8290:2: ( ruleOperation )
            // InternalQuCircuit.g:8291:3: ruleOperation
            {
             before(grammarAccess.getStatePreparationAccess().getOperationsOperationParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getStatePreparationAccess().getOperationsOperationParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__StatePreparation__OperationsAssignment_4"


    // $ANTLR start "rule__StatePreparation__OperationsAssignment_5_1"
    // InternalQuCircuit.g:8300:1: rule__StatePreparation__OperationsAssignment_5_1 : ( ruleOperation ) ;
    public final void rule__StatePreparation__OperationsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8304:1: ( ( ruleOperation ) )
            // InternalQuCircuit.g:8305:2: ( ruleOperation )
            {
            // InternalQuCircuit.g:8305:2: ( ruleOperation )
            // InternalQuCircuit.g:8306:3: ruleOperation
            {
             before(grammarAccess.getStatePreparationAccess().getOperationsOperationParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getStatePreparationAccess().getOperationsOperationParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__StatePreparation__OperationsAssignment_5_1"


    // $ANTLR start "rule__StatePreparation__TargetQubitsAssignment_8"
    // InternalQuCircuit.g:8315:1: rule__StatePreparation__TargetQubitsAssignment_8 : ( ruleSelector ) ;
    public final void rule__StatePreparation__TargetQubitsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8319:1: ( ( ruleSelector ) )
            // InternalQuCircuit.g:8320:2: ( ruleSelector )
            {
            // InternalQuCircuit.g:8320:2: ( ruleSelector )
            // InternalQuCircuit.g:8321:3: ruleSelector
            {
             before(grammarAccess.getStatePreparationAccess().getTargetQubitsSelectorParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getStatePreparationAccess().getTargetQubitsSelectorParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__StatePreparation__TargetQubitsAssignment_8"


    // $ANTLR start "rule__StatePreparation__TargetQubitsAssignment_9_1"
    // InternalQuCircuit.g:8330:1: rule__StatePreparation__TargetQubitsAssignment_9_1 : ( ruleSelector ) ;
    public final void rule__StatePreparation__TargetQubitsAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8334:1: ( ( ruleSelector ) )
            // InternalQuCircuit.g:8335:2: ( ruleSelector )
            {
            // InternalQuCircuit.g:8335:2: ( ruleSelector )
            // InternalQuCircuit.g:8336:3: ruleSelector
            {
             before(grammarAccess.getStatePreparationAccess().getTargetQubitsSelectorParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getStatePreparationAccess().getTargetQubitsSelectorParserRuleCall_9_1_0()); 

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
    // $ANTLR end "rule__StatePreparation__TargetQubitsAssignment_9_1"


    // $ANTLR start "rule__ElementaryQuantumGate__InverseFormAssignment_1"
    // InternalQuCircuit.g:8345:1: rule__ElementaryQuantumGate__InverseFormAssignment_1 : ( ( 'inverseForm' ) ) ;
    public final void rule__ElementaryQuantumGate__InverseFormAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8349:1: ( ( ( 'inverseForm' ) ) )
            // InternalQuCircuit.g:8350:2: ( ( 'inverseForm' ) )
            {
            // InternalQuCircuit.g:8350:2: ( ( 'inverseForm' ) )
            // InternalQuCircuit.g:8351:3: ( 'inverseForm' )
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getInverseFormInverseFormKeyword_1_0()); 
            // InternalQuCircuit.g:8352:3: ( 'inverseForm' )
            // InternalQuCircuit.g:8353:4: 'inverseForm'
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getInverseFormInverseFormKeyword_1_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getElementaryQuantumGateAccess().getInverseFormInverseFormKeyword_1_0()); 

            }

             after(grammarAccess.getElementaryQuantumGateAccess().getInverseFormInverseFormKeyword_1_0()); 

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
    // $ANTLR end "rule__ElementaryQuantumGate__InverseFormAssignment_1"


    // $ANTLR start "rule__ElementaryQuantumGate__NameAssignment_2"
    // InternalQuCircuit.g:8364:1: rule__ElementaryQuantumGate__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ElementaryQuantumGate__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8368:1: ( ( ruleEString ) )
            // InternalQuCircuit.g:8369:2: ( ruleEString )
            {
            // InternalQuCircuit.g:8369:2: ( ruleEString )
            // InternalQuCircuit.g:8370:3: ruleEString
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getElementaryQuantumGateAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ElementaryQuantumGate__NameAssignment_2"


    // $ANTLR start "rule__ElementaryQuantumGate__OperationsAssignment_4_1"
    // InternalQuCircuit.g:8379:1: rule__ElementaryQuantumGate__OperationsAssignment_4_1 : ( ruleOperation ) ;
    public final void rule__ElementaryQuantumGate__OperationsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8383:1: ( ( ruleOperation ) )
            // InternalQuCircuit.g:8384:2: ( ruleOperation )
            {
            // InternalQuCircuit.g:8384:2: ( ruleOperation )
            // InternalQuCircuit.g:8385:3: ruleOperation
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getOperationsOperationParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getElementaryQuantumGateAccess().getOperationsOperationParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__ElementaryQuantumGate__OperationsAssignment_4_1"


    // $ANTLR start "rule__ElementaryQuantumGate__TargetQubitsAssignment_8"
    // InternalQuCircuit.g:8394:1: rule__ElementaryQuantumGate__TargetQubitsAssignment_8 : ( ruleSelector ) ;
    public final void rule__ElementaryQuantumGate__TargetQubitsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8398:1: ( ( ruleSelector ) )
            // InternalQuCircuit.g:8399:2: ( ruleSelector )
            {
            // InternalQuCircuit.g:8399:2: ( ruleSelector )
            // InternalQuCircuit.g:8400:3: ruleSelector
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getTargetQubitsSelectorParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getElementaryQuantumGateAccess().getTargetQubitsSelectorParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__ElementaryQuantumGate__TargetQubitsAssignment_8"


    // $ANTLR start "rule__ElementaryQuantumGate__TargetQubitsAssignment_10_2"
    // InternalQuCircuit.g:8409:1: rule__ElementaryQuantumGate__TargetQubitsAssignment_10_2 : ( ruleSelector ) ;
    public final void rule__ElementaryQuantumGate__TargetQubitsAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8413:1: ( ( ruleSelector ) )
            // InternalQuCircuit.g:8414:2: ( ruleSelector )
            {
            // InternalQuCircuit.g:8414:2: ( ruleSelector )
            // InternalQuCircuit.g:8415:3: ruleSelector
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getTargetQubitsSelectorParserRuleCall_10_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getElementaryQuantumGateAccess().getTargetQubitsSelectorParserRuleCall_10_2_0()); 

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
    // $ANTLR end "rule__ElementaryQuantumGate__TargetQubitsAssignment_10_2"


    // $ANTLR start "rule__ElementaryQuantumGate__ControlQubitsAssignment_12_2"
    // InternalQuCircuit.g:8424:1: rule__ElementaryQuantumGate__ControlQubitsAssignment_12_2 : ( ruleSelector ) ;
    public final void rule__ElementaryQuantumGate__ControlQubitsAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8428:1: ( ( ruleSelector ) )
            // InternalQuCircuit.g:8429:2: ( ruleSelector )
            {
            // InternalQuCircuit.g:8429:2: ( ruleSelector )
            // InternalQuCircuit.g:8430:3: ruleSelector
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getControlQubitsSelectorParserRuleCall_12_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getElementaryQuantumGateAccess().getControlQubitsSelectorParserRuleCall_12_2_0()); 

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
    // $ANTLR end "rule__ElementaryQuantumGate__ControlQubitsAssignment_12_2"


    // $ANTLR start "rule__ElementaryQuantumGate__ControlQubitsAssignment_12_3_1"
    // InternalQuCircuit.g:8439:1: rule__ElementaryQuantumGate__ControlQubitsAssignment_12_3_1 : ( ruleSelector ) ;
    public final void rule__ElementaryQuantumGate__ControlQubitsAssignment_12_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8443:1: ( ( ruleSelector ) )
            // InternalQuCircuit.g:8444:2: ( ruleSelector )
            {
            // InternalQuCircuit.g:8444:2: ( ruleSelector )
            // InternalQuCircuit.g:8445:3: ruleSelector
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getControlQubitsSelectorParserRuleCall_12_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getElementaryQuantumGateAccess().getControlQubitsSelectorParserRuleCall_12_3_1_0()); 

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
    // $ANTLR end "rule__ElementaryQuantumGate__ControlQubitsAssignment_12_3_1"


    // $ANTLR start "rule__ElementaryQuantumGate__AngleParameterAssignment_13_1"
    // InternalQuCircuit.g:8454:1: rule__ElementaryQuantumGate__AngleParameterAssignment_13_1 : ( ruleAngleParameter ) ;
    public final void rule__ElementaryQuantumGate__AngleParameterAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8458:1: ( ( ruleAngleParameter ) )
            // InternalQuCircuit.g:8459:2: ( ruleAngleParameter )
            {
            // InternalQuCircuit.g:8459:2: ( ruleAngleParameter )
            // InternalQuCircuit.g:8460:3: ruleAngleParameter
            {
             before(grammarAccess.getElementaryQuantumGateAccess().getAngleParameterAngleParameterParserRuleCall_13_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAngleParameter();

            state._fsp--;

             after(grammarAccess.getElementaryQuantumGateAccess().getAngleParameterAngleParameterParserRuleCall_13_1_0()); 

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
    // $ANTLR end "rule__ElementaryQuantumGate__AngleParameterAssignment_13_1"


    // $ANTLR start "rule__AngleParameter__ThetaAssignment_2_1"
    // InternalQuCircuit.g:8469:1: rule__AngleParameter__ThetaAssignment_2_1 : ( ruleEDoubleObject ) ;
    public final void rule__AngleParameter__ThetaAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8473:1: ( ( ruleEDoubleObject ) )
            // InternalQuCircuit.g:8474:2: ( ruleEDoubleObject )
            {
            // InternalQuCircuit.g:8474:2: ( ruleEDoubleObject )
            // InternalQuCircuit.g:8475:3: ruleEDoubleObject
            {
             before(grammarAccess.getAngleParameterAccess().getThetaEDoubleObjectParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDoubleObject();

            state._fsp--;

             after(grammarAccess.getAngleParameterAccess().getThetaEDoubleObjectParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__AngleParameter__ThetaAssignment_2_1"


    // $ANTLR start "rule__AngleParameter__PhiAssignment_3_1"
    // InternalQuCircuit.g:8484:1: rule__AngleParameter__PhiAssignment_3_1 : ( ruleEDoubleObject ) ;
    public final void rule__AngleParameter__PhiAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8488:1: ( ( ruleEDoubleObject ) )
            // InternalQuCircuit.g:8489:2: ( ruleEDoubleObject )
            {
            // InternalQuCircuit.g:8489:2: ( ruleEDoubleObject )
            // InternalQuCircuit.g:8490:3: ruleEDoubleObject
            {
             before(grammarAccess.getAngleParameterAccess().getPhiEDoubleObjectParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDoubleObject();

            state._fsp--;

             after(grammarAccess.getAngleParameterAccess().getPhiEDoubleObjectParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__AngleParameter__PhiAssignment_3_1"


    // $ANTLR start "rule__AngleParameter__LambdaAssignment_4_1"
    // InternalQuCircuit.g:8499:1: rule__AngleParameter__LambdaAssignment_4_1 : ( ruleEDoubleObject ) ;
    public final void rule__AngleParameter__LambdaAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8503:1: ( ( ruleEDoubleObject ) )
            // InternalQuCircuit.g:8504:2: ( ruleEDoubleObject )
            {
            // InternalQuCircuit.g:8504:2: ( ruleEDoubleObject )
            // InternalQuCircuit.g:8505:3: ruleEDoubleObject
            {
             before(grammarAccess.getAngleParameterAccess().getLambdaEDoubleObjectParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDoubleObject();

            state._fsp--;

             after(grammarAccess.getAngleParameterAccess().getLambdaEDoubleObjectParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__AngleParameter__LambdaAssignment_4_1"


    // $ANTLR start "rule__Measurement__NameAssignment_1"
    // InternalQuCircuit.g:8514:1: rule__Measurement__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Measurement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8518:1: ( ( ruleEString ) )
            // InternalQuCircuit.g:8519:2: ( ruleEString )
            {
            // InternalQuCircuit.g:8519:2: ( ruleEString )
            // InternalQuCircuit.g:8520:3: ruleEString
            {
             before(grammarAccess.getMeasurementAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMeasurementAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Measurement__NameAssignment_1"


    // $ANTLR start "rule__Measurement__OperationsAssignment_3_1"
    // InternalQuCircuit.g:8529:1: rule__Measurement__OperationsAssignment_3_1 : ( ruleOperation ) ;
    public final void rule__Measurement__OperationsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8533:1: ( ( ruleOperation ) )
            // InternalQuCircuit.g:8534:2: ( ruleOperation )
            {
            // InternalQuCircuit.g:8534:2: ( ruleOperation )
            // InternalQuCircuit.g:8535:3: ruleOperation
            {
             before(grammarAccess.getMeasurementAccess().getOperationsOperationParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getMeasurementAccess().getOperationsOperationParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Measurement__OperationsAssignment_3_1"


    // $ANTLR start "rule__Measurement__TargetQubitsAssignment_7"
    // InternalQuCircuit.g:8544:1: rule__Measurement__TargetQubitsAssignment_7 : ( ruleSelector ) ;
    public final void rule__Measurement__TargetQubitsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8548:1: ( ( ruleSelector ) )
            // InternalQuCircuit.g:8549:2: ( ruleSelector )
            {
            // InternalQuCircuit.g:8549:2: ( ruleSelector )
            // InternalQuCircuit.g:8550:3: ruleSelector
            {
             before(grammarAccess.getMeasurementAccess().getTargetQubitsSelectorParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getMeasurementAccess().getTargetQubitsSelectorParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Measurement__TargetQubitsAssignment_7"


    // $ANTLR start "rule__Measurement__TargetQubitsAssignment_9_2"
    // InternalQuCircuit.g:8559:1: rule__Measurement__TargetQubitsAssignment_9_2 : ( ruleSelector ) ;
    public final void rule__Measurement__TargetQubitsAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8563:1: ( ( ruleSelector ) )
            // InternalQuCircuit.g:8564:2: ( ruleSelector )
            {
            // InternalQuCircuit.g:8564:2: ( ruleSelector )
            // InternalQuCircuit.g:8565:3: ruleSelector
            {
             before(grammarAccess.getMeasurementAccess().getTargetQubitsSelectorParserRuleCall_9_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getMeasurementAccess().getTargetQubitsSelectorParserRuleCall_9_2_0()); 

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
    // $ANTLR end "rule__Measurement__TargetQubitsAssignment_9_2"


    // $ANTLR start "rule__Measurement__ClassicBitsAssignment_14"
    // InternalQuCircuit.g:8574:1: rule__Measurement__ClassicBitsAssignment_14 : ( ruleSelector ) ;
    public final void rule__Measurement__ClassicBitsAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8578:1: ( ( ruleSelector ) )
            // InternalQuCircuit.g:8579:2: ( ruleSelector )
            {
            // InternalQuCircuit.g:8579:2: ( ruleSelector )
            // InternalQuCircuit.g:8580:3: ruleSelector
            {
             before(grammarAccess.getMeasurementAccess().getClassicBitsSelectorParserRuleCall_14_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getMeasurementAccess().getClassicBitsSelectorParserRuleCall_14_0()); 

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
    // $ANTLR end "rule__Measurement__ClassicBitsAssignment_14"


    // $ANTLR start "rule__Measurement__ClassicBitsAssignment_16_2"
    // InternalQuCircuit.g:8589:1: rule__Measurement__ClassicBitsAssignment_16_2 : ( ruleSelector ) ;
    public final void rule__Measurement__ClassicBitsAssignment_16_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8593:1: ( ( ruleSelector ) )
            // InternalQuCircuit.g:8594:2: ( ruleSelector )
            {
            // InternalQuCircuit.g:8594:2: ( ruleSelector )
            // InternalQuCircuit.g:8595:3: ruleSelector
            {
             before(grammarAccess.getMeasurementAccess().getClassicBitsSelectorParserRuleCall_16_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getMeasurementAccess().getClassicBitsSelectorParserRuleCall_16_2_0()); 

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
    // $ANTLR end "rule__Measurement__ClassicBitsAssignment_16_2"


    // $ANTLR start "rule__CompositeQuantumGate__NameAssignment_1"
    // InternalQuCircuit.g:8604:1: rule__CompositeQuantumGate__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__CompositeQuantumGate__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8608:1: ( ( ruleEString ) )
            // InternalQuCircuit.g:8609:2: ( ruleEString )
            {
            // InternalQuCircuit.g:8609:2: ( ruleEString )
            // InternalQuCircuit.g:8610:3: ruleEString
            {
             before(grammarAccess.getCompositeQuantumGateAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCompositeQuantumGateAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__CompositeQuantumGate__NameAssignment_1"


    // $ANTLR start "rule__CompositeQuantumGate__InverseFormAssignment_3"
    // InternalQuCircuit.g:8619:1: rule__CompositeQuantumGate__InverseFormAssignment_3 : ( ( 'inverseForm' ) ) ;
    public final void rule__CompositeQuantumGate__InverseFormAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8623:1: ( ( ( 'inverseForm' ) ) )
            // InternalQuCircuit.g:8624:2: ( ( 'inverseForm' ) )
            {
            // InternalQuCircuit.g:8624:2: ( ( 'inverseForm' ) )
            // InternalQuCircuit.g:8625:3: ( 'inverseForm' )
            {
             before(grammarAccess.getCompositeQuantumGateAccess().getInverseFormInverseFormKeyword_3_0()); 
            // InternalQuCircuit.g:8626:3: ( 'inverseForm' )
            // InternalQuCircuit.g:8627:4: 'inverseForm'
            {
             before(grammarAccess.getCompositeQuantumGateAccess().getInverseFormInverseFormKeyword_3_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getCompositeQuantumGateAccess().getInverseFormInverseFormKeyword_3_0()); 

            }

             after(grammarAccess.getCompositeQuantumGateAccess().getInverseFormInverseFormKeyword_3_0()); 

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
    // $ANTLR end "rule__CompositeQuantumGate__InverseFormAssignment_3"


    // $ANTLR start "rule__CompositeQuantumGate__OperationsAssignment_4_1"
    // InternalQuCircuit.g:8638:1: rule__CompositeQuantumGate__OperationsAssignment_4_1 : ( ruleOperation ) ;
    public final void rule__CompositeQuantumGate__OperationsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8642:1: ( ( ruleOperation ) )
            // InternalQuCircuit.g:8643:2: ( ruleOperation )
            {
            // InternalQuCircuit.g:8643:2: ( ruleOperation )
            // InternalQuCircuit.g:8644:3: ruleOperation
            {
             before(grammarAccess.getCompositeQuantumGateAccess().getOperationsOperationParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getCompositeQuantumGateAccess().getOperationsOperationParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__CompositeQuantumGate__OperationsAssignment_4_1"


    // $ANTLR start "rule__CompositeQuantumGate__TargetQubitsAssignment_8"
    // InternalQuCircuit.g:8653:1: rule__CompositeQuantumGate__TargetQubitsAssignment_8 : ( ruleSelector ) ;
    public final void rule__CompositeQuantumGate__TargetQubitsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8657:1: ( ( ruleSelector ) )
            // InternalQuCircuit.g:8658:2: ( ruleSelector )
            {
            // InternalQuCircuit.g:8658:2: ( ruleSelector )
            // InternalQuCircuit.g:8659:3: ruleSelector
            {
             before(grammarAccess.getCompositeQuantumGateAccess().getTargetQubitsSelectorParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getCompositeQuantumGateAccess().getTargetQubitsSelectorParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__CompositeQuantumGate__TargetQubitsAssignment_8"


    // $ANTLR start "rule__CompositeQuantumGate__TargetQubitsAssignment_10_2"
    // InternalQuCircuit.g:8668:1: rule__CompositeQuantumGate__TargetQubitsAssignment_10_2 : ( ruleSelector ) ;
    public final void rule__CompositeQuantumGate__TargetQubitsAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8672:1: ( ( ruleSelector ) )
            // InternalQuCircuit.g:8673:2: ( ruleSelector )
            {
            // InternalQuCircuit.g:8673:2: ( ruleSelector )
            // InternalQuCircuit.g:8674:3: ruleSelector
            {
             before(grammarAccess.getCompositeQuantumGateAccess().getTargetQubitsSelectorParserRuleCall_10_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getCompositeQuantumGateAccess().getTargetQubitsSelectorParserRuleCall_10_2_0()); 

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
    // $ANTLR end "rule__CompositeQuantumGate__TargetQubitsAssignment_10_2"


    // $ANTLR start "rule__CompositeQuantumGate__ControlQubitsAssignment_12_2"
    // InternalQuCircuit.g:8683:1: rule__CompositeQuantumGate__ControlQubitsAssignment_12_2 : ( ruleSelector ) ;
    public final void rule__CompositeQuantumGate__ControlQubitsAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8687:1: ( ( ruleSelector ) )
            // InternalQuCircuit.g:8688:2: ( ruleSelector )
            {
            // InternalQuCircuit.g:8688:2: ( ruleSelector )
            // InternalQuCircuit.g:8689:3: ruleSelector
            {
             before(grammarAccess.getCompositeQuantumGateAccess().getControlQubitsSelectorParserRuleCall_12_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getCompositeQuantumGateAccess().getControlQubitsSelectorParserRuleCall_12_2_0()); 

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
    // $ANTLR end "rule__CompositeQuantumGate__ControlQubitsAssignment_12_2"


    // $ANTLR start "rule__CompositeQuantumGate__ControlQubitsAssignment_12_3_1"
    // InternalQuCircuit.g:8698:1: rule__CompositeQuantumGate__ControlQubitsAssignment_12_3_1 : ( ruleSelector ) ;
    public final void rule__CompositeQuantumGate__ControlQubitsAssignment_12_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8702:1: ( ( ruleSelector ) )
            // InternalQuCircuit.g:8703:2: ( ruleSelector )
            {
            // InternalQuCircuit.g:8703:2: ( ruleSelector )
            // InternalQuCircuit.g:8704:3: ruleSelector
            {
             before(grammarAccess.getCompositeQuantumGateAccess().getControlQubitsSelectorParserRuleCall_12_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getCompositeQuantumGateAccess().getControlQubitsSelectorParserRuleCall_12_3_1_0()); 

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
    // $ANTLR end "rule__CompositeQuantumGate__ControlQubitsAssignment_12_3_1"


    // $ANTLR start "rule__Loop__NameAssignment_1"
    // InternalQuCircuit.g:8713:1: rule__Loop__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Loop__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8717:1: ( ( ruleEString ) )
            // InternalQuCircuit.g:8718:2: ( ruleEString )
            {
            // InternalQuCircuit.g:8718:2: ( ruleEString )
            // InternalQuCircuit.g:8719:3: ruleEString
            {
             before(grammarAccess.getLoopAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLoopAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Loop__NameAssignment_1"


    // $ANTLR start "rule__Loop__InverseFormAssignment_3"
    // InternalQuCircuit.g:8728:1: rule__Loop__InverseFormAssignment_3 : ( ( 'inverseForm' ) ) ;
    public final void rule__Loop__InverseFormAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8732:1: ( ( ( 'inverseForm' ) ) )
            // InternalQuCircuit.g:8733:2: ( ( 'inverseForm' ) )
            {
            // InternalQuCircuit.g:8733:2: ( ( 'inverseForm' ) )
            // InternalQuCircuit.g:8734:3: ( 'inverseForm' )
            {
             before(grammarAccess.getLoopAccess().getInverseFormInverseFormKeyword_3_0()); 
            // InternalQuCircuit.g:8735:3: ( 'inverseForm' )
            // InternalQuCircuit.g:8736:4: 'inverseForm'
            {
             before(grammarAccess.getLoopAccess().getInverseFormInverseFormKeyword_3_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getInverseFormInverseFormKeyword_3_0()); 

            }

             after(grammarAccess.getLoopAccess().getInverseFormInverseFormKeyword_3_0()); 

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
    // $ANTLR end "rule__Loop__InverseFormAssignment_3"


    // $ANTLR start "rule__Loop__IncrementBlockTargetQubitsAssignment_4"
    // InternalQuCircuit.g:8747:1: rule__Loop__IncrementBlockTargetQubitsAssignment_4 : ( ( 'incrementBlockTargetQubits' ) ) ;
    public final void rule__Loop__IncrementBlockTargetQubitsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8751:1: ( ( ( 'incrementBlockTargetQubits' ) ) )
            // InternalQuCircuit.g:8752:2: ( ( 'incrementBlockTargetQubits' ) )
            {
            // InternalQuCircuit.g:8752:2: ( ( 'incrementBlockTargetQubits' ) )
            // InternalQuCircuit.g:8753:3: ( 'incrementBlockTargetQubits' )
            {
             before(grammarAccess.getLoopAccess().getIncrementBlockTargetQubitsIncrementBlockTargetQubitsKeyword_4_0()); 
            // InternalQuCircuit.g:8754:3: ( 'incrementBlockTargetQubits' )
            // InternalQuCircuit.g:8755:4: 'incrementBlockTargetQubits'
            {
             before(grammarAccess.getLoopAccess().getIncrementBlockTargetQubitsIncrementBlockTargetQubitsKeyword_4_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getIncrementBlockTargetQubitsIncrementBlockTargetQubitsKeyword_4_0()); 

            }

             after(grammarAccess.getLoopAccess().getIncrementBlockTargetQubitsIncrementBlockTargetQubitsKeyword_4_0()); 

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
    // $ANTLR end "rule__Loop__IncrementBlockTargetQubitsAssignment_4"


    // $ANTLR start "rule__Loop__IncrementBlockControlQubitsAssignment_5"
    // InternalQuCircuit.g:8766:1: rule__Loop__IncrementBlockControlQubitsAssignment_5 : ( ( 'incrementBlockControlQubits' ) ) ;
    public final void rule__Loop__IncrementBlockControlQubitsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8770:1: ( ( ( 'incrementBlockControlQubits' ) ) )
            // InternalQuCircuit.g:8771:2: ( ( 'incrementBlockControlQubits' ) )
            {
            // InternalQuCircuit.g:8771:2: ( ( 'incrementBlockControlQubits' ) )
            // InternalQuCircuit.g:8772:3: ( 'incrementBlockControlQubits' )
            {
             before(grammarAccess.getLoopAccess().getIncrementBlockControlQubitsIncrementBlockControlQubitsKeyword_5_0()); 
            // InternalQuCircuit.g:8773:3: ( 'incrementBlockControlQubits' )
            // InternalQuCircuit.g:8774:4: 'incrementBlockControlQubits'
            {
             before(grammarAccess.getLoopAccess().getIncrementBlockControlQubitsIncrementBlockControlQubitsKeyword_5_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getIncrementBlockControlQubitsIncrementBlockControlQubitsKeyword_5_0()); 

            }

             after(grammarAccess.getLoopAccess().getIncrementBlockControlQubitsIncrementBlockControlQubitsKeyword_5_0()); 

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
    // $ANTLR end "rule__Loop__IncrementBlockControlQubitsAssignment_5"


    // $ANTLR start "rule__Loop__IterationsAssignment_6_1"
    // InternalQuCircuit.g:8785:1: rule__Loop__IterationsAssignment_6_1 : ( RULE_INT ) ;
    public final void rule__Loop__IterationsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8789:1: ( ( RULE_INT ) )
            // InternalQuCircuit.g:8790:2: ( RULE_INT )
            {
            // InternalQuCircuit.g:8790:2: ( RULE_INT )
            // InternalQuCircuit.g:8791:3: RULE_INT
            {
             before(grammarAccess.getLoopAccess().getIterationsINTTerminalRuleCall_6_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getIterationsINTTerminalRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__Loop__IterationsAssignment_6_1"


    // $ANTLR start "rule__Loop__IncrementTargetQubitsAssignment_7"
    // InternalQuCircuit.g:8800:1: rule__Loop__IncrementTargetQubitsAssignment_7 : ( ( 'incrementTargetQubits' ) ) ;
    public final void rule__Loop__IncrementTargetQubitsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8804:1: ( ( ( 'incrementTargetQubits' ) ) )
            // InternalQuCircuit.g:8805:2: ( ( 'incrementTargetQubits' ) )
            {
            // InternalQuCircuit.g:8805:2: ( ( 'incrementTargetQubits' ) )
            // InternalQuCircuit.g:8806:3: ( 'incrementTargetQubits' )
            {
             before(grammarAccess.getLoopAccess().getIncrementTargetQubitsIncrementTargetQubitsKeyword_7_0()); 
            // InternalQuCircuit.g:8807:3: ( 'incrementTargetQubits' )
            // InternalQuCircuit.g:8808:4: 'incrementTargetQubits'
            {
             before(grammarAccess.getLoopAccess().getIncrementTargetQubitsIncrementTargetQubitsKeyword_7_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getIncrementTargetQubitsIncrementTargetQubitsKeyword_7_0()); 

            }

             after(grammarAccess.getLoopAccess().getIncrementTargetQubitsIncrementTargetQubitsKeyword_7_0()); 

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
    // $ANTLR end "rule__Loop__IncrementTargetQubitsAssignment_7"


    // $ANTLR start "rule__Loop__IncrementControlQubitsAssignment_8"
    // InternalQuCircuit.g:8819:1: rule__Loop__IncrementControlQubitsAssignment_8 : ( ( 'incrementControlQubits' ) ) ;
    public final void rule__Loop__IncrementControlQubitsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8823:1: ( ( ( 'incrementControlQubits' ) ) )
            // InternalQuCircuit.g:8824:2: ( ( 'incrementControlQubits' ) )
            {
            // InternalQuCircuit.g:8824:2: ( ( 'incrementControlQubits' ) )
            // InternalQuCircuit.g:8825:3: ( 'incrementControlQubits' )
            {
             before(grammarAccess.getLoopAccess().getIncrementControlQubitsIncrementControlQubitsKeyword_8_0()); 
            // InternalQuCircuit.g:8826:3: ( 'incrementControlQubits' )
            // InternalQuCircuit.g:8827:4: 'incrementControlQubits'
            {
             before(grammarAccess.getLoopAccess().getIncrementControlQubitsIncrementControlQubitsKeyword_8_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getIncrementControlQubitsIncrementControlQubitsKeyword_8_0()); 

            }

             after(grammarAccess.getLoopAccess().getIncrementControlQubitsIncrementControlQubitsKeyword_8_0()); 

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
    // $ANTLR end "rule__Loop__IncrementControlQubitsAssignment_8"


    // $ANTLR start "rule__Loop__TargetQubitsBlockSizeAssignment_9_1"
    // InternalQuCircuit.g:8838:1: rule__Loop__TargetQubitsBlockSizeAssignment_9_1 : ( RULE_INT ) ;
    public final void rule__Loop__TargetQubitsBlockSizeAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8842:1: ( ( RULE_INT ) )
            // InternalQuCircuit.g:8843:2: ( RULE_INT )
            {
            // InternalQuCircuit.g:8843:2: ( RULE_INT )
            // InternalQuCircuit.g:8844:3: RULE_INT
            {
             before(grammarAccess.getLoopAccess().getTargetQubitsBlockSizeINTTerminalRuleCall_9_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getTargetQubitsBlockSizeINTTerminalRuleCall_9_1_0()); 

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
    // $ANTLR end "rule__Loop__TargetQubitsBlockSizeAssignment_9_1"


    // $ANTLR start "rule__Loop__ControlQubitsBlockSizeAssignment_10_1"
    // InternalQuCircuit.g:8853:1: rule__Loop__ControlQubitsBlockSizeAssignment_10_1 : ( RULE_INT ) ;
    public final void rule__Loop__ControlQubitsBlockSizeAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8857:1: ( ( RULE_INT ) )
            // InternalQuCircuit.g:8858:2: ( RULE_INT )
            {
            // InternalQuCircuit.g:8858:2: ( RULE_INT )
            // InternalQuCircuit.g:8859:3: RULE_INT
            {
             before(grammarAccess.getLoopAccess().getControlQubitsBlockSizeINTTerminalRuleCall_10_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getControlQubitsBlockSizeINTTerminalRuleCall_10_1_0()); 

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
    // $ANTLR end "rule__Loop__ControlQubitsBlockSizeAssignment_10_1"


    // $ANTLR start "rule__Loop__ControlQubitsIterationTypeAssignment_11_1"
    // InternalQuCircuit.g:8868:1: rule__Loop__ControlQubitsIterationTypeAssignment_11_1 : ( ruleITERATION_TYPE ) ;
    public final void rule__Loop__ControlQubitsIterationTypeAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8872:1: ( ( ruleITERATION_TYPE ) )
            // InternalQuCircuit.g:8873:2: ( ruleITERATION_TYPE )
            {
            // InternalQuCircuit.g:8873:2: ( ruleITERATION_TYPE )
            // InternalQuCircuit.g:8874:3: ruleITERATION_TYPE
            {
             before(grammarAccess.getLoopAccess().getControlQubitsIterationTypeITERATION_TYPEEnumRuleCall_11_1_0()); 
            pushFollow(FOLLOW_2);
            ruleITERATION_TYPE();

            state._fsp--;

             after(grammarAccess.getLoopAccess().getControlQubitsIterationTypeITERATION_TYPEEnumRuleCall_11_1_0()); 

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
    // $ANTLR end "rule__Loop__ControlQubitsIterationTypeAssignment_11_1"


    // $ANTLR start "rule__Loop__TargetQubitsIterationTypeAssignment_12_1"
    // InternalQuCircuit.g:8883:1: rule__Loop__TargetQubitsIterationTypeAssignment_12_1 : ( ruleITERATION_TYPE ) ;
    public final void rule__Loop__TargetQubitsIterationTypeAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8887:1: ( ( ruleITERATION_TYPE ) )
            // InternalQuCircuit.g:8888:2: ( ruleITERATION_TYPE )
            {
            // InternalQuCircuit.g:8888:2: ( ruleITERATION_TYPE )
            // InternalQuCircuit.g:8889:3: ruleITERATION_TYPE
            {
             before(grammarAccess.getLoopAccess().getTargetQubitsIterationTypeITERATION_TYPEEnumRuleCall_12_1_0()); 
            pushFollow(FOLLOW_2);
            ruleITERATION_TYPE();

            state._fsp--;

             after(grammarAccess.getLoopAccess().getTargetQubitsIterationTypeITERATION_TYPEEnumRuleCall_12_1_0()); 

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
    // $ANTLR end "rule__Loop__TargetQubitsIterationTypeAssignment_12_1"


    // $ANTLR start "rule__Loop__IncrementByAssignment_13_1"
    // InternalQuCircuit.g:8898:1: rule__Loop__IncrementByAssignment_13_1 : ( RULE_INT ) ;
    public final void rule__Loop__IncrementByAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8902:1: ( ( RULE_INT ) )
            // InternalQuCircuit.g:8903:2: ( RULE_INT )
            {
            // InternalQuCircuit.g:8903:2: ( RULE_INT )
            // InternalQuCircuit.g:8904:3: RULE_INT
            {
             before(grammarAccess.getLoopAccess().getIncrementByINTTerminalRuleCall_13_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLoopAccess().getIncrementByINTTerminalRuleCall_13_1_0()); 

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
    // $ANTLR end "rule__Loop__IncrementByAssignment_13_1"


    // $ANTLR start "rule__Loop__OperationsAssignment_14_2"
    // InternalQuCircuit.g:8913:1: rule__Loop__OperationsAssignment_14_2 : ( ruleOperation ) ;
    public final void rule__Loop__OperationsAssignment_14_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8917:1: ( ( ruleOperation ) )
            // InternalQuCircuit.g:8918:2: ( ruleOperation )
            {
            // InternalQuCircuit.g:8918:2: ( ruleOperation )
            // InternalQuCircuit.g:8919:3: ruleOperation
            {
             before(grammarAccess.getLoopAccess().getOperationsOperationParserRuleCall_14_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getLoopAccess().getOperationsOperationParserRuleCall_14_2_0()); 

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
    // $ANTLR end "rule__Loop__OperationsAssignment_14_2"


    // $ANTLR start "rule__Loop__OperationsAssignment_14_3_1"
    // InternalQuCircuit.g:8928:1: rule__Loop__OperationsAssignment_14_3_1 : ( ruleOperation ) ;
    public final void rule__Loop__OperationsAssignment_14_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8932:1: ( ( ruleOperation ) )
            // InternalQuCircuit.g:8933:2: ( ruleOperation )
            {
            // InternalQuCircuit.g:8933:2: ( ruleOperation )
            // InternalQuCircuit.g:8934:3: ruleOperation
            {
             before(grammarAccess.getLoopAccess().getOperationsOperationParserRuleCall_14_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getLoopAccess().getOperationsOperationParserRuleCall_14_3_1_0()); 

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
    // $ANTLR end "rule__Loop__OperationsAssignment_14_3_1"


    // $ANTLR start "rule__Loop__TargetQubitsAssignment_18"
    // InternalQuCircuit.g:8943:1: rule__Loop__TargetQubitsAssignment_18 : ( ruleSelector ) ;
    public final void rule__Loop__TargetQubitsAssignment_18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8947:1: ( ( ruleSelector ) )
            // InternalQuCircuit.g:8948:2: ( ruleSelector )
            {
            // InternalQuCircuit.g:8948:2: ( ruleSelector )
            // InternalQuCircuit.g:8949:3: ruleSelector
            {
             before(grammarAccess.getLoopAccess().getTargetQubitsSelectorParserRuleCall_18_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getLoopAccess().getTargetQubitsSelectorParserRuleCall_18_0()); 

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
    // $ANTLR end "rule__Loop__TargetQubitsAssignment_18"


    // $ANTLR start "rule__Loop__TargetQubitsAssignment_20_2"
    // InternalQuCircuit.g:8958:1: rule__Loop__TargetQubitsAssignment_20_2 : ( ruleSelector ) ;
    public final void rule__Loop__TargetQubitsAssignment_20_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8962:1: ( ( ruleSelector ) )
            // InternalQuCircuit.g:8963:2: ( ruleSelector )
            {
            // InternalQuCircuit.g:8963:2: ( ruleSelector )
            // InternalQuCircuit.g:8964:3: ruleSelector
            {
             before(grammarAccess.getLoopAccess().getTargetQubitsSelectorParserRuleCall_20_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getLoopAccess().getTargetQubitsSelectorParserRuleCall_20_2_0()); 

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
    // $ANTLR end "rule__Loop__TargetQubitsAssignment_20_2"


    // $ANTLR start "rule__Loop__ControlQubitsAssignment_22_2"
    // InternalQuCircuit.g:8973:1: rule__Loop__ControlQubitsAssignment_22_2 : ( ruleSelector ) ;
    public final void rule__Loop__ControlQubitsAssignment_22_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8977:1: ( ( ruleSelector ) )
            // InternalQuCircuit.g:8978:2: ( ruleSelector )
            {
            // InternalQuCircuit.g:8978:2: ( ruleSelector )
            // InternalQuCircuit.g:8979:3: ruleSelector
            {
             before(grammarAccess.getLoopAccess().getControlQubitsSelectorParserRuleCall_22_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getLoopAccess().getControlQubitsSelectorParserRuleCall_22_2_0()); 

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
    // $ANTLR end "rule__Loop__ControlQubitsAssignment_22_2"


    // $ANTLR start "rule__Loop__ControlQubitsAssignment_22_3_1"
    // InternalQuCircuit.g:8988:1: rule__Loop__ControlQubitsAssignment_22_3_1 : ( ruleSelector ) ;
    public final void rule__Loop__ControlQubitsAssignment_22_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:8992:1: ( ( ruleSelector ) )
            // InternalQuCircuit.g:8993:2: ( ruleSelector )
            {
            // InternalQuCircuit.g:8993:2: ( ruleSelector )
            // InternalQuCircuit.g:8994:3: ruleSelector
            {
             before(grammarAccess.getLoopAccess().getControlQubitsSelectorParserRuleCall_22_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getLoopAccess().getControlQubitsSelectorParserRuleCall_22_3_1_0()); 

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
    // $ANTLR end "rule__Loop__ControlQubitsAssignment_22_3_1"


    // $ANTLR start "rule__Loop__FixedControlQubitsAssignment_23_2"
    // InternalQuCircuit.g:9003:1: rule__Loop__FixedControlQubitsAssignment_23_2 : ( ruleSelector ) ;
    public final void rule__Loop__FixedControlQubitsAssignment_23_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:9007:1: ( ( ruleSelector ) )
            // InternalQuCircuit.g:9008:2: ( ruleSelector )
            {
            // InternalQuCircuit.g:9008:2: ( ruleSelector )
            // InternalQuCircuit.g:9009:3: ruleSelector
            {
             before(grammarAccess.getLoopAccess().getFixedControlQubitsSelectorParserRuleCall_23_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getLoopAccess().getFixedControlQubitsSelectorParserRuleCall_23_2_0()); 

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
    // $ANTLR end "rule__Loop__FixedControlQubitsAssignment_23_2"


    // $ANTLR start "rule__Loop__FixedControlQubitsAssignment_23_3_1"
    // InternalQuCircuit.g:9018:1: rule__Loop__FixedControlQubitsAssignment_23_3_1 : ( ruleSelector ) ;
    public final void rule__Loop__FixedControlQubitsAssignment_23_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:9022:1: ( ( ruleSelector ) )
            // InternalQuCircuit.g:9023:2: ( ruleSelector )
            {
            // InternalQuCircuit.g:9023:2: ( ruleSelector )
            // InternalQuCircuit.g:9024:3: ruleSelector
            {
             before(grammarAccess.getLoopAccess().getFixedControlQubitsSelectorParserRuleCall_23_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getLoopAccess().getFixedControlQubitsSelectorParserRuleCall_23_3_1_0()); 

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
    // $ANTLR end "rule__Loop__FixedControlQubitsAssignment_23_3_1"


    // $ANTLR start "rule__Loop__FixedTargetQubitsAssignment_24_2"
    // InternalQuCircuit.g:9033:1: rule__Loop__FixedTargetQubitsAssignment_24_2 : ( ruleSelector ) ;
    public final void rule__Loop__FixedTargetQubitsAssignment_24_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:9037:1: ( ( ruleSelector ) )
            // InternalQuCircuit.g:9038:2: ( ruleSelector )
            {
            // InternalQuCircuit.g:9038:2: ( ruleSelector )
            // InternalQuCircuit.g:9039:3: ruleSelector
            {
             before(grammarAccess.getLoopAccess().getFixedTargetQubitsSelectorParserRuleCall_24_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getLoopAccess().getFixedTargetQubitsSelectorParserRuleCall_24_2_0()); 

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
    // $ANTLR end "rule__Loop__FixedTargetQubitsAssignment_24_2"


    // $ANTLR start "rule__Loop__FixedTargetQubitsAssignment_24_3_1"
    // InternalQuCircuit.g:9048:1: rule__Loop__FixedTargetQubitsAssignment_24_3_1 : ( ruleSelector ) ;
    public final void rule__Loop__FixedTargetQubitsAssignment_24_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:9052:1: ( ( ruleSelector ) )
            // InternalQuCircuit.g:9053:2: ( ruleSelector )
            {
            // InternalQuCircuit.g:9053:2: ( ruleSelector )
            // InternalQuCircuit.g:9054:3: ruleSelector
            {
             before(grammarAccess.getLoopAccess().getFixedTargetQubitsSelectorParserRuleCall_24_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getLoopAccess().getFixedTargetQubitsSelectorParserRuleCall_24_3_1_0()); 

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
    // $ANTLR end "rule__Loop__FixedTargetQubitsAssignment_24_3_1"


    // $ANTLR start "rule__Loop__LoopAssignment_26"
    // InternalQuCircuit.g:9063:1: rule__Loop__LoopAssignment_26 : ( ( ruleEString ) ) ;
    public final void rule__Loop__LoopAssignment_26() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:9067:1: ( ( ( ruleEString ) ) )
            // InternalQuCircuit.g:9068:2: ( ( ruleEString ) )
            {
            // InternalQuCircuit.g:9068:2: ( ( ruleEString ) )
            // InternalQuCircuit.g:9069:3: ( ruleEString )
            {
             before(grammarAccess.getLoopAccess().getLoopConcreteLoopOperationCrossReference_26_0()); 
            // InternalQuCircuit.g:9070:3: ( ruleEString )
            // InternalQuCircuit.g:9071:4: ruleEString
            {
             before(grammarAccess.getLoopAccess().getLoopConcreteLoopOperationEStringParserRuleCall_26_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLoopAccess().getLoopConcreteLoopOperationEStringParserRuleCall_26_0_1()); 

            }

             after(grammarAccess.getLoopAccess().getLoopConcreteLoopOperationCrossReference_26_0()); 

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
    // $ANTLR end "rule__Loop__LoopAssignment_26"


    // $ANTLR start "rule__Loop__LoopTargetQubitsAssignment_30"
    // InternalQuCircuit.g:9082:1: rule__Loop__LoopTargetQubitsAssignment_30 : ( ruleSelector ) ;
    public final void rule__Loop__LoopTargetQubitsAssignment_30() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:9086:1: ( ( ruleSelector ) )
            // InternalQuCircuit.g:9087:2: ( ruleSelector )
            {
            // InternalQuCircuit.g:9087:2: ( ruleSelector )
            // InternalQuCircuit.g:9088:3: ruleSelector
            {
             before(grammarAccess.getLoopAccess().getLoopTargetQubitsSelectorParserRuleCall_30_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getLoopAccess().getLoopTargetQubitsSelectorParserRuleCall_30_0()); 

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
    // $ANTLR end "rule__Loop__LoopTargetQubitsAssignment_30"


    // $ANTLR start "rule__Loop__LoopTargetQubitsAssignment_32_2"
    // InternalQuCircuit.g:9097:1: rule__Loop__LoopTargetQubitsAssignment_32_2 : ( ruleSelector ) ;
    public final void rule__Loop__LoopTargetQubitsAssignment_32_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:9101:1: ( ( ruleSelector ) )
            // InternalQuCircuit.g:9102:2: ( ruleSelector )
            {
            // InternalQuCircuit.g:9102:2: ( ruleSelector )
            // InternalQuCircuit.g:9103:3: ruleSelector
            {
             before(grammarAccess.getLoopAccess().getLoopTargetQubitsSelectorParserRuleCall_32_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getLoopAccess().getLoopTargetQubitsSelectorParserRuleCall_32_2_0()); 

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
    // $ANTLR end "rule__Loop__LoopTargetQubitsAssignment_32_2"


    // $ANTLR start "rule__Loop__LoopControlQubitsAssignment_34_3"
    // InternalQuCircuit.g:9112:1: rule__Loop__LoopControlQubitsAssignment_34_3 : ( ruleSelector ) ;
    public final void rule__Loop__LoopControlQubitsAssignment_34_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:9116:1: ( ( ruleSelector ) )
            // InternalQuCircuit.g:9117:2: ( ruleSelector )
            {
            // InternalQuCircuit.g:9117:2: ( ruleSelector )
            // InternalQuCircuit.g:9118:3: ruleSelector
            {
             before(grammarAccess.getLoopAccess().getLoopControlQubitsSelectorParserRuleCall_34_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getLoopAccess().getLoopControlQubitsSelectorParserRuleCall_34_3_0()); 

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
    // $ANTLR end "rule__Loop__LoopControlQubitsAssignment_34_3"


    // $ANTLR start "rule__Loop__LoopControlQubitsAssignment_34_5_2"
    // InternalQuCircuit.g:9127:1: rule__Loop__LoopControlQubitsAssignment_34_5_2 : ( ruleSelector ) ;
    public final void rule__Loop__LoopControlQubitsAssignment_34_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:9131:1: ( ( ruleSelector ) )
            // InternalQuCircuit.g:9132:2: ( ruleSelector )
            {
            // InternalQuCircuit.g:9132:2: ( ruleSelector )
            // InternalQuCircuit.g:9133:3: ruleSelector
            {
             before(grammarAccess.getLoopAccess().getLoopControlQubitsSelectorParserRuleCall_34_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getLoopAccess().getLoopControlQubitsSelectorParserRuleCall_34_5_2_0()); 

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
    // $ANTLR end "rule__Loop__LoopControlQubitsAssignment_34_5_2"


    // $ANTLR start "rule__Operation__OperationAssignment_0"
    // InternalQuCircuit.g:9142:1: rule__Operation__OperationAssignment_0 : ( ( ruleEString ) ) ;
    public final void rule__Operation__OperationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:9146:1: ( ( ( ruleEString ) ) )
            // InternalQuCircuit.g:9147:2: ( ( ruleEString ) )
            {
            // InternalQuCircuit.g:9147:2: ( ( ruleEString ) )
            // InternalQuCircuit.g:9148:3: ( ruleEString )
            {
             before(grammarAccess.getOperationAccess().getOperationConcreteQuantumOperationCrossReference_0_0()); 
            // InternalQuCircuit.g:9149:3: ( ruleEString )
            // InternalQuCircuit.g:9150:4: ruleEString
            {
             before(grammarAccess.getOperationAccess().getOperationConcreteQuantumOperationEStringParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getOperationConcreteQuantumOperationEStringParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getOperationAccess().getOperationConcreteQuantumOperationCrossReference_0_0()); 

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
    // $ANTLR end "rule__Operation__OperationAssignment_0"


    // $ANTLR start "rule__Operation__QuboAssignment_1_1"
    // InternalQuCircuit.g:9161:1: rule__Operation__QuboAssignment_1_1 : ( ( ruleEString ) ) ;
    public final void rule__Operation__QuboAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:9165:1: ( ( ( ruleEString ) ) )
            // InternalQuCircuit.g:9166:2: ( ( ruleEString ) )
            {
            // InternalQuCircuit.g:9166:2: ( ( ruleEString ) )
            // InternalQuCircuit.g:9167:3: ( ruleEString )
            {
             before(grammarAccess.getOperationAccess().getQuboQuboCrossReference_1_1_0()); 
            // InternalQuCircuit.g:9168:3: ( ruleEString )
            // InternalQuCircuit.g:9169:4: ruleEString
            {
             before(grammarAccess.getOperationAccess().getQuboQuboEStringParserRuleCall_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getQuboQuboEStringParserRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getOperationAccess().getQuboQuboCrossReference_1_1_0()); 

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
    // $ANTLR end "rule__Operation__QuboAssignment_1_1"


    // $ANTLR start "rule__ElementSelector__RegisterAssignment_1_0"
    // InternalQuCircuit.g:9180:1: rule__ElementSelector__RegisterAssignment_1_0 : ( ( ruleEString ) ) ;
    public final void rule__ElementSelector__RegisterAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:9184:1: ( ( ( ruleEString ) ) )
            // InternalQuCircuit.g:9185:2: ( ( ruleEString ) )
            {
            // InternalQuCircuit.g:9185:2: ( ( ruleEString ) )
            // InternalQuCircuit.g:9186:3: ( ruleEString )
            {
             before(grammarAccess.getElementSelectorAccess().getRegisterRegisterCrossReference_1_0_0()); 
            // InternalQuCircuit.g:9187:3: ( ruleEString )
            // InternalQuCircuit.g:9188:4: ruleEString
            {
             before(grammarAccess.getElementSelectorAccess().getRegisterRegisterEStringParserRuleCall_1_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getElementSelectorAccess().getRegisterRegisterEStringParserRuleCall_1_0_0_1()); 

            }

             after(grammarAccess.getElementSelectorAccess().getRegisterRegisterCrossReference_1_0_0()); 

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
    // $ANTLR end "rule__ElementSelector__RegisterAssignment_1_0"


    // $ANTLR start "rule__ElementSelector__IndexAssignment_2"
    // InternalQuCircuit.g:9199:1: rule__ElementSelector__IndexAssignment_2 : ( RULE_INT ) ;
    public final void rule__ElementSelector__IndexAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:9203:1: ( ( RULE_INT ) )
            // InternalQuCircuit.g:9204:2: ( RULE_INT )
            {
            // InternalQuCircuit.g:9204:2: ( RULE_INT )
            // InternalQuCircuit.g:9205:3: RULE_INT
            {
             before(grammarAccess.getElementSelectorAccess().getIndexINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getElementSelectorAccess().getIndexINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__ElementSelector__IndexAssignment_2"


    // $ANTLR start "rule__RangeSelector__RegisterAssignment_1_0"
    // InternalQuCircuit.g:9214:1: rule__RangeSelector__RegisterAssignment_1_0 : ( ( ruleEString ) ) ;
    public final void rule__RangeSelector__RegisterAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:9218:1: ( ( ( ruleEString ) ) )
            // InternalQuCircuit.g:9219:2: ( ( ruleEString ) )
            {
            // InternalQuCircuit.g:9219:2: ( ( ruleEString ) )
            // InternalQuCircuit.g:9220:3: ( ruleEString )
            {
             before(grammarAccess.getRangeSelectorAccess().getRegisterRegisterCrossReference_1_0_0()); 
            // InternalQuCircuit.g:9221:3: ( ruleEString )
            // InternalQuCircuit.g:9222:4: ruleEString
            {
             before(grammarAccess.getRangeSelectorAccess().getRegisterRegisterEStringParserRuleCall_1_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRangeSelectorAccess().getRegisterRegisterEStringParserRuleCall_1_0_0_1()); 

            }

             after(grammarAccess.getRangeSelectorAccess().getRegisterRegisterCrossReference_1_0_0()); 

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
    // $ANTLR end "rule__RangeSelector__RegisterAssignment_1_0"


    // $ANTLR start "rule__RangeSelector__BeginAssignment_2"
    // InternalQuCircuit.g:9233:1: rule__RangeSelector__BeginAssignment_2 : ( RULE_INT ) ;
    public final void rule__RangeSelector__BeginAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:9237:1: ( ( RULE_INT ) )
            // InternalQuCircuit.g:9238:2: ( RULE_INT )
            {
            // InternalQuCircuit.g:9238:2: ( RULE_INT )
            // InternalQuCircuit.g:9239:3: RULE_INT
            {
             before(grammarAccess.getRangeSelectorAccess().getBeginINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRangeSelectorAccess().getBeginINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__RangeSelector__BeginAssignment_2"


    // $ANTLR start "rule__RangeSelector__EndAssignment_4"
    // InternalQuCircuit.g:9248:1: rule__RangeSelector__EndAssignment_4 : ( RULE_INT ) ;
    public final void rule__RangeSelector__EndAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQuCircuit.g:9252:1: ( ( RULE_INT ) )
            // InternalQuCircuit.g:9253:2: ( RULE_INT )
            {
            // InternalQuCircuit.g:9253:2: ( RULE_INT )
            // InternalQuCircuit.g:9254:3: RULE_INT
            {
             before(grammarAccess.getRangeSelectorAccess().getEndINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRangeSelectorAccess().getEndINTTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__RangeSelector__EndAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000220000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000002880000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000028C0000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002880002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001040000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000034108000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004040000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000024000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000084000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0100000000000030L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000600040000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000003800040000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00C0000000000040L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0100000030000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000200040000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x1F07F00020000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0018040200000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0020000000040000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000004400000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0040000000000040L});

}