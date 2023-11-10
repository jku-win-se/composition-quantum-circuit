package quantum.circuit.lang.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import quantum.circuit.lang.services.QuCircuitGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQuCircuitParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'QuantumCircuit'", "'{'", "'}'", "'QuantumRegister'", "'NumberOfQubits'", "'('", "')'", "'ClassicRegister'", "'NumberOfBits'", "'Layer'", "','", "'StatePreparation'", "'operation'", "'targetQubits'", "'['", "']'", "'ElementaryQuantumGate'", "'inverseForm'", "'controlQubits'", "'angleParameter'", "'theta'", "'phi'", "'lambda'", "'Measurement'", "'classicBits'", "'CompositeQuantumGate'", "'Loop'", "'incrementBlockTargetQubits'", "'incrementBlockControlQubits'", "'iterations'", "'incrementTargetQubits'", "'incrementControlQubits'", "'targetQubitsBlockSize'", "'controlQubitsBlockSize'", "'controlQubitsIterationType'", "'targetQubitsIterationType'", "'incrementBy'", "'operations'", "'fixedControlQubits'", "'fixedTargetQubits'", "'loop'", "'loopTargetQubits'", "'loopControlQubits'", "'-'", "'.'", "'E'", "'e'", "'NONE'", "'SHIFT'", "'CHANGE_BLOCK'"
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
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
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

        public InternalQuCircuitParser(TokenStream input, QuCircuitGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "QuantumCircuit";
       	}

       	@Override
       	protected QuCircuitGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleQuantumCircuit"
    // InternalQuCircuit.g:65:1: entryRuleQuantumCircuit returns [EObject current=null] : iv_ruleQuantumCircuit= ruleQuantumCircuit EOF ;
    public final EObject entryRuleQuantumCircuit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantumCircuit = null;


        try {
            // InternalQuCircuit.g:65:55: (iv_ruleQuantumCircuit= ruleQuantumCircuit EOF )
            // InternalQuCircuit.g:66:2: iv_ruleQuantumCircuit= ruleQuantumCircuit EOF
            {
             newCompositeNode(grammarAccess.getQuantumCircuitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuantumCircuit=ruleQuantumCircuit();

            state._fsp--;

             current =iv_ruleQuantumCircuit; 
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
    // $ANTLR end "entryRuleQuantumCircuit"


    // $ANTLR start "ruleQuantumCircuit"
    // InternalQuCircuit.g:72:1: ruleQuantumCircuit returns [EObject current=null] : (otherlv_0= 'QuantumCircuit' ( (lv_name_1_0= ruleEString ) ) ( (lv_quantumRegisters_2_0= ruleSimplifiedQuantumRegister ) )? otherlv_3= '{' ( ( (lv_quantumRegisters_4_0= ruleQuantumRegister ) ) ( (lv_quantumRegisters_5_0= ruleQuantumRegister ) )* )? ( (lv_classicRegisters_6_0= ruleClassicRegister ) )* ( (lv_layers_7_0= ruleLayer ) ) ( (lv_layers_8_0= ruleLayer ) )* otherlv_9= '}' ) ;
    public final EObject ruleQuantumCircuit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_quantumRegisters_2_0 = null;

        EObject lv_quantumRegisters_4_0 = null;

        EObject lv_quantumRegisters_5_0 = null;

        EObject lv_classicRegisters_6_0 = null;

        EObject lv_layers_7_0 = null;

        EObject lv_layers_8_0 = null;



        	enterRule();

        try {
            // InternalQuCircuit.g:78:2: ( (otherlv_0= 'QuantumCircuit' ( (lv_name_1_0= ruleEString ) ) ( (lv_quantumRegisters_2_0= ruleSimplifiedQuantumRegister ) )? otherlv_3= '{' ( ( (lv_quantumRegisters_4_0= ruleQuantumRegister ) ) ( (lv_quantumRegisters_5_0= ruleQuantumRegister ) )* )? ( (lv_classicRegisters_6_0= ruleClassicRegister ) )* ( (lv_layers_7_0= ruleLayer ) ) ( (lv_layers_8_0= ruleLayer ) )* otherlv_9= '}' ) )
            // InternalQuCircuit.g:79:2: (otherlv_0= 'QuantumCircuit' ( (lv_name_1_0= ruleEString ) ) ( (lv_quantumRegisters_2_0= ruleSimplifiedQuantumRegister ) )? otherlv_3= '{' ( ( (lv_quantumRegisters_4_0= ruleQuantumRegister ) ) ( (lv_quantumRegisters_5_0= ruleQuantumRegister ) )* )? ( (lv_classicRegisters_6_0= ruleClassicRegister ) )* ( (lv_layers_7_0= ruleLayer ) ) ( (lv_layers_8_0= ruleLayer ) )* otherlv_9= '}' )
            {
            // InternalQuCircuit.g:79:2: (otherlv_0= 'QuantumCircuit' ( (lv_name_1_0= ruleEString ) ) ( (lv_quantumRegisters_2_0= ruleSimplifiedQuantumRegister ) )? otherlv_3= '{' ( ( (lv_quantumRegisters_4_0= ruleQuantumRegister ) ) ( (lv_quantumRegisters_5_0= ruleQuantumRegister ) )* )? ( (lv_classicRegisters_6_0= ruleClassicRegister ) )* ( (lv_layers_7_0= ruleLayer ) ) ( (lv_layers_8_0= ruleLayer ) )* otherlv_9= '}' )
            // InternalQuCircuit.g:80:3: otherlv_0= 'QuantumCircuit' ( (lv_name_1_0= ruleEString ) ) ( (lv_quantumRegisters_2_0= ruleSimplifiedQuantumRegister ) )? otherlv_3= '{' ( ( (lv_quantumRegisters_4_0= ruleQuantumRegister ) ) ( (lv_quantumRegisters_5_0= ruleQuantumRegister ) )* )? ( (lv_classicRegisters_6_0= ruleClassicRegister ) )* ( (lv_layers_7_0= ruleLayer ) ) ( (lv_layers_8_0= ruleLayer ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getQuantumCircuitAccess().getQuantumCircuitKeyword_0());
            		
            // InternalQuCircuit.g:84:3: ( (lv_name_1_0= ruleEString ) )
            // InternalQuCircuit.g:85:4: (lv_name_1_0= ruleEString )
            {
            // InternalQuCircuit.g:85:4: (lv_name_1_0= ruleEString )
            // InternalQuCircuit.g:86:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getQuantumCircuitAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQuantumCircuitRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"quantum.circuit.lang.QuCircuit.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQuCircuit.g:103:3: ( (lv_quantumRegisters_2_0= ruleSimplifiedQuantumRegister ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==16) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalQuCircuit.g:104:4: (lv_quantumRegisters_2_0= ruleSimplifiedQuantumRegister )
                    {
                    // InternalQuCircuit.g:104:4: (lv_quantumRegisters_2_0= ruleSimplifiedQuantumRegister )
                    // InternalQuCircuit.g:105:5: lv_quantumRegisters_2_0= ruleSimplifiedQuantumRegister
                    {

                    					newCompositeNode(grammarAccess.getQuantumCircuitAccess().getQuantumRegistersSimplifiedQuantumRegisterParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_quantumRegisters_2_0=ruleSimplifiedQuantumRegister();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getQuantumCircuitRule());
                    					}
                    					add(
                    						current,
                    						"quantumRegisters",
                    						lv_quantumRegisters_2_0,
                    						"quantum.circuit.lang.QuCircuit.SimplifiedQuantumRegister");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getQuantumCircuitAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalQuCircuit.g:126:3: ( ( (lv_quantumRegisters_4_0= ruleQuantumRegister ) ) ( (lv_quantumRegisters_5_0= ruleQuantumRegister ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalQuCircuit.g:127:4: ( (lv_quantumRegisters_4_0= ruleQuantumRegister ) ) ( (lv_quantumRegisters_5_0= ruleQuantumRegister ) )*
                    {
                    // InternalQuCircuit.g:127:4: ( (lv_quantumRegisters_4_0= ruleQuantumRegister ) )
                    // InternalQuCircuit.g:128:5: (lv_quantumRegisters_4_0= ruleQuantumRegister )
                    {
                    // InternalQuCircuit.g:128:5: (lv_quantumRegisters_4_0= ruleQuantumRegister )
                    // InternalQuCircuit.g:129:6: lv_quantumRegisters_4_0= ruleQuantumRegister
                    {

                    						newCompositeNode(grammarAccess.getQuantumCircuitAccess().getQuantumRegistersQuantumRegisterParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_quantumRegisters_4_0=ruleQuantumRegister();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getQuantumCircuitRule());
                    						}
                    						add(
                    							current,
                    							"quantumRegisters",
                    							lv_quantumRegisters_4_0,
                    							"quantum.circuit.lang.QuCircuit.QuantumRegister");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQuCircuit.g:146:4: ( (lv_quantumRegisters_5_0= ruleQuantumRegister ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==14) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalQuCircuit.g:147:5: (lv_quantumRegisters_5_0= ruleQuantumRegister )
                    	    {
                    	    // InternalQuCircuit.g:147:5: (lv_quantumRegisters_5_0= ruleQuantumRegister )
                    	    // InternalQuCircuit.g:148:6: lv_quantumRegisters_5_0= ruleQuantumRegister
                    	    {

                    	    						newCompositeNode(grammarAccess.getQuantumCircuitAccess().getQuantumRegistersQuantumRegisterParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_6);
                    	    lv_quantumRegisters_5_0=ruleQuantumRegister();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getQuantumCircuitRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"quantumRegisters",
                    	    							lv_quantumRegisters_5_0,
                    	    							"quantum.circuit.lang.QuCircuit.QuantumRegister");
                    	    						afterParserOrEnumRuleCall();
                    	    					

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

            // InternalQuCircuit.g:166:3: ( (lv_classicRegisters_6_0= ruleClassicRegister ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalQuCircuit.g:167:4: (lv_classicRegisters_6_0= ruleClassicRegister )
            	    {
            	    // InternalQuCircuit.g:167:4: (lv_classicRegisters_6_0= ruleClassicRegister )
            	    // InternalQuCircuit.g:168:5: lv_classicRegisters_6_0= ruleClassicRegister
            	    {

            	    					newCompositeNode(grammarAccess.getQuantumCircuitAccess().getClassicRegistersClassicRegisterParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_classicRegisters_6_0=ruleClassicRegister();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getQuantumCircuitRule());
            	    					}
            	    					add(
            	    						current,
            	    						"classicRegisters",
            	    						lv_classicRegisters_6_0,
            	    						"quantum.circuit.lang.QuCircuit.ClassicRegister");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalQuCircuit.g:185:3: ( (lv_layers_7_0= ruleLayer ) )
            // InternalQuCircuit.g:186:4: (lv_layers_7_0= ruleLayer )
            {
            // InternalQuCircuit.g:186:4: (lv_layers_7_0= ruleLayer )
            // InternalQuCircuit.g:187:5: lv_layers_7_0= ruleLayer
            {

            					newCompositeNode(grammarAccess.getQuantumCircuitAccess().getLayersLayerParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_7);
            lv_layers_7_0=ruleLayer();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQuantumCircuitRule());
            					}
            					add(
            						current,
            						"layers",
            						lv_layers_7_0,
            						"quantum.circuit.lang.QuCircuit.Layer");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQuCircuit.g:204:3: ( (lv_layers_8_0= ruleLayer ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==20) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalQuCircuit.g:205:4: (lv_layers_8_0= ruleLayer )
            	    {
            	    // InternalQuCircuit.g:205:4: (lv_layers_8_0= ruleLayer )
            	    // InternalQuCircuit.g:206:5: lv_layers_8_0= ruleLayer
            	    {

            	    					newCompositeNode(grammarAccess.getQuantumCircuitAccess().getLayersLayerParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_layers_8_0=ruleLayer();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getQuantumCircuitRule());
            	    					}
            	    					add(
            	    						current,
            	    						"layers",
            	    						lv_layers_8_0,
            	    						"quantum.circuit.lang.QuCircuit.Layer");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_9=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getQuantumCircuitAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleQuantumCircuit"


    // $ANTLR start "entryRuleQuantumRegister"
    // InternalQuCircuit.g:231:1: entryRuleQuantumRegister returns [EObject current=null] : iv_ruleQuantumRegister= ruleQuantumRegister EOF ;
    public final EObject entryRuleQuantumRegister() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantumRegister = null;


        try {
            // InternalQuCircuit.g:231:56: (iv_ruleQuantumRegister= ruleQuantumRegister EOF )
            // InternalQuCircuit.g:232:2: iv_ruleQuantumRegister= ruleQuantumRegister EOF
            {
             newCompositeNode(grammarAccess.getQuantumRegisterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuantumRegister=ruleQuantumRegister();

            state._fsp--;

             current =iv_ruleQuantumRegister; 
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
    // $ANTLR end "entryRuleQuantumRegister"


    // $ANTLR start "ruleQuantumRegister"
    // InternalQuCircuit.g:238:1: ruleQuantumRegister returns [EObject current=null] : ( () otherlv_1= 'QuantumRegister' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'NumberOfQubits' ( (lv_numberOfQubits_5_0= RULE_INT ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleQuantumRegister() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_numberOfQubits_5_0=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalQuCircuit.g:244:2: ( ( () otherlv_1= 'QuantumRegister' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'NumberOfQubits' ( (lv_numberOfQubits_5_0= RULE_INT ) ) )? otherlv_6= '}' ) )
            // InternalQuCircuit.g:245:2: ( () otherlv_1= 'QuantumRegister' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'NumberOfQubits' ( (lv_numberOfQubits_5_0= RULE_INT ) ) )? otherlv_6= '}' )
            {
            // InternalQuCircuit.g:245:2: ( () otherlv_1= 'QuantumRegister' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'NumberOfQubits' ( (lv_numberOfQubits_5_0= RULE_INT ) ) )? otherlv_6= '}' )
            // InternalQuCircuit.g:246:3: () otherlv_1= 'QuantumRegister' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'NumberOfQubits' ( (lv_numberOfQubits_5_0= RULE_INT ) ) )? otherlv_6= '}'
            {
            // InternalQuCircuit.g:246:3: ()
            // InternalQuCircuit.g:247:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getQuantumRegisterAccess().getQuantumRegisterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getQuantumRegisterAccess().getQuantumRegisterKeyword_1());
            		
            // InternalQuCircuit.g:257:3: ( (lv_name_2_0= ruleEString ) )
            // InternalQuCircuit.g:258:4: (lv_name_2_0= ruleEString )
            {
            // InternalQuCircuit.g:258:4: (lv_name_2_0= ruleEString )
            // InternalQuCircuit.g:259:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getQuantumRegisterAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQuantumRegisterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"quantum.circuit.lang.QuCircuit.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getQuantumRegisterAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalQuCircuit.g:280:3: (otherlv_4= 'NumberOfQubits' ( (lv_numberOfQubits_5_0= RULE_INT ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalQuCircuit.g:281:4: otherlv_4= 'NumberOfQubits' ( (lv_numberOfQubits_5_0= RULE_INT ) )
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getQuantumRegisterAccess().getNumberOfQubitsKeyword_4_0());
                    			
                    // InternalQuCircuit.g:285:4: ( (lv_numberOfQubits_5_0= RULE_INT ) )
                    // InternalQuCircuit.g:286:5: (lv_numberOfQubits_5_0= RULE_INT )
                    {
                    // InternalQuCircuit.g:286:5: (lv_numberOfQubits_5_0= RULE_INT )
                    // InternalQuCircuit.g:287:6: lv_numberOfQubits_5_0= RULE_INT
                    {
                    lv_numberOfQubits_5_0=(Token)match(input,RULE_INT,FOLLOW_10); 

                    						newLeafNode(lv_numberOfQubits_5_0, grammarAccess.getQuantumRegisterAccess().getNumberOfQubitsINTTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getQuantumRegisterRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"numberOfQubits",
                    							lv_numberOfQubits_5_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getQuantumRegisterAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleQuantumRegister"


    // $ANTLR start "entryRuleSimplifiedQuantumRegister"
    // InternalQuCircuit.g:312:1: entryRuleSimplifiedQuantumRegister returns [EObject current=null] : iv_ruleSimplifiedQuantumRegister= ruleSimplifiedQuantumRegister EOF ;
    public final EObject entryRuleSimplifiedQuantumRegister() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimplifiedQuantumRegister = null;


        try {
            // InternalQuCircuit.g:312:66: (iv_ruleSimplifiedQuantumRegister= ruleSimplifiedQuantumRegister EOF )
            // InternalQuCircuit.g:313:2: iv_ruleSimplifiedQuantumRegister= ruleSimplifiedQuantumRegister EOF
            {
             newCompositeNode(grammarAccess.getSimplifiedQuantumRegisterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimplifiedQuantumRegister=ruleSimplifiedQuantumRegister();

            state._fsp--;

             current =iv_ruleSimplifiedQuantumRegister; 
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
    // $ANTLR end "entryRuleSimplifiedQuantumRegister"


    // $ANTLR start "ruleSimplifiedQuantumRegister"
    // InternalQuCircuit.g:319:1: ruleSimplifiedQuantumRegister returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_numberOfQubits_2_0= RULE_INT ) ) otherlv_3= ')' ) ;
    public final EObject ruleSimplifiedQuantumRegister() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_numberOfQubits_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalQuCircuit.g:325:2: ( ( () otherlv_1= '(' ( (lv_numberOfQubits_2_0= RULE_INT ) ) otherlv_3= ')' ) )
            // InternalQuCircuit.g:326:2: ( () otherlv_1= '(' ( (lv_numberOfQubits_2_0= RULE_INT ) ) otherlv_3= ')' )
            {
            // InternalQuCircuit.g:326:2: ( () otherlv_1= '(' ( (lv_numberOfQubits_2_0= RULE_INT ) ) otherlv_3= ')' )
            // InternalQuCircuit.g:327:3: () otherlv_1= '(' ( (lv_numberOfQubits_2_0= RULE_INT ) ) otherlv_3= ')'
            {
            // InternalQuCircuit.g:327:3: ()
            // InternalQuCircuit.g:328:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSimplifiedQuantumRegisterAccess().getQuantumRegisterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getSimplifiedQuantumRegisterAccess().getLeftParenthesisKeyword_1());
            		
            // InternalQuCircuit.g:338:3: ( (lv_numberOfQubits_2_0= RULE_INT ) )
            // InternalQuCircuit.g:339:4: (lv_numberOfQubits_2_0= RULE_INT )
            {
            // InternalQuCircuit.g:339:4: (lv_numberOfQubits_2_0= RULE_INT )
            // InternalQuCircuit.g:340:5: lv_numberOfQubits_2_0= RULE_INT
            {
            lv_numberOfQubits_2_0=(Token)match(input,RULE_INT,FOLLOW_11); 

            					newLeafNode(lv_numberOfQubits_2_0, grammarAccess.getSimplifiedQuantumRegisterAccess().getNumberOfQubitsINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSimplifiedQuantumRegisterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"numberOfQubits",
            						lv_numberOfQubits_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getSimplifiedQuantumRegisterAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleSimplifiedQuantumRegister"


    // $ANTLR start "entryRuleClassicRegister"
    // InternalQuCircuit.g:364:1: entryRuleClassicRegister returns [EObject current=null] : iv_ruleClassicRegister= ruleClassicRegister EOF ;
    public final EObject entryRuleClassicRegister() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassicRegister = null;


        try {
            // InternalQuCircuit.g:364:56: (iv_ruleClassicRegister= ruleClassicRegister EOF )
            // InternalQuCircuit.g:365:2: iv_ruleClassicRegister= ruleClassicRegister EOF
            {
             newCompositeNode(grammarAccess.getClassicRegisterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassicRegister=ruleClassicRegister();

            state._fsp--;

             current =iv_ruleClassicRegister; 
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
    // $ANTLR end "entryRuleClassicRegister"


    // $ANTLR start "ruleClassicRegister"
    // InternalQuCircuit.g:371:1: ruleClassicRegister returns [EObject current=null] : ( () otherlv_1= 'ClassicRegister' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'NumberOfBits' ( (lv_numberOfBits_5_0= RULE_INT ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleClassicRegister() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_numberOfBits_5_0=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalQuCircuit.g:377:2: ( ( () otherlv_1= 'ClassicRegister' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'NumberOfBits' ( (lv_numberOfBits_5_0= RULE_INT ) ) )? otherlv_6= '}' ) )
            // InternalQuCircuit.g:378:2: ( () otherlv_1= 'ClassicRegister' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'NumberOfBits' ( (lv_numberOfBits_5_0= RULE_INT ) ) )? otherlv_6= '}' )
            {
            // InternalQuCircuit.g:378:2: ( () otherlv_1= 'ClassicRegister' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'NumberOfBits' ( (lv_numberOfBits_5_0= RULE_INT ) ) )? otherlv_6= '}' )
            // InternalQuCircuit.g:379:3: () otherlv_1= 'ClassicRegister' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'NumberOfBits' ( (lv_numberOfBits_5_0= RULE_INT ) ) )? otherlv_6= '}'
            {
            // InternalQuCircuit.g:379:3: ()
            // InternalQuCircuit.g:380:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getClassicRegisterAccess().getClassicRegisterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getClassicRegisterAccess().getClassicRegisterKeyword_1());
            		
            // InternalQuCircuit.g:390:3: ( (lv_name_2_0= ruleEString ) )
            // InternalQuCircuit.g:391:4: (lv_name_2_0= ruleEString )
            {
            // InternalQuCircuit.g:391:4: (lv_name_2_0= ruleEString )
            // InternalQuCircuit.g:392:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getClassicRegisterAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClassicRegisterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"quantum.circuit.lang.QuCircuit.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getClassicRegisterAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalQuCircuit.g:413:3: (otherlv_4= 'NumberOfBits' ( (lv_numberOfBits_5_0= RULE_INT ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalQuCircuit.g:414:4: otherlv_4= 'NumberOfBits' ( (lv_numberOfBits_5_0= RULE_INT ) )
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getClassicRegisterAccess().getNumberOfBitsKeyword_4_0());
                    			
                    // InternalQuCircuit.g:418:4: ( (lv_numberOfBits_5_0= RULE_INT ) )
                    // InternalQuCircuit.g:419:5: (lv_numberOfBits_5_0= RULE_INT )
                    {
                    // InternalQuCircuit.g:419:5: (lv_numberOfBits_5_0= RULE_INT )
                    // InternalQuCircuit.g:420:6: lv_numberOfBits_5_0= RULE_INT
                    {
                    lv_numberOfBits_5_0=(Token)match(input,RULE_INT,FOLLOW_10); 

                    						newLeafNode(lv_numberOfBits_5_0, grammarAccess.getClassicRegisterAccess().getNumberOfBitsINTTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClassicRegisterRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"numberOfBits",
                    							lv_numberOfBits_5_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getClassicRegisterAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleClassicRegister"


    // $ANTLR start "entryRuleLayer"
    // InternalQuCircuit.g:445:1: entryRuleLayer returns [EObject current=null] : iv_ruleLayer= ruleLayer EOF ;
    public final EObject entryRuleLayer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayer = null;


        try {
            // InternalQuCircuit.g:445:46: (iv_ruleLayer= ruleLayer EOF )
            // InternalQuCircuit.g:446:2: iv_ruleLayer= ruleLayer EOF
            {
             newCompositeNode(grammarAccess.getLayerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLayer=ruleLayer();

            state._fsp--;

             current =iv_ruleLayer; 
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
    // $ANTLR end "entryRuleLayer"


    // $ANTLR start "ruleLayer"
    // InternalQuCircuit.g:452:1: ruleLayer returns [EObject current=null] : ( () otherlv_1= 'Layer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' ( (lv_quantumOperations_4_0= ruleQuantumOperation ) ) (otherlv_5= ',' ( (lv_quantumOperations_6_0= ruleQuantumOperation ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleLayer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_quantumOperations_4_0 = null;

        EObject lv_quantumOperations_6_0 = null;



        	enterRule();

        try {
            // InternalQuCircuit.g:458:2: ( ( () otherlv_1= 'Layer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' ( (lv_quantumOperations_4_0= ruleQuantumOperation ) ) (otherlv_5= ',' ( (lv_quantumOperations_6_0= ruleQuantumOperation ) ) )* otherlv_7= '}' ) )
            // InternalQuCircuit.g:459:2: ( () otherlv_1= 'Layer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' ( (lv_quantumOperations_4_0= ruleQuantumOperation ) ) (otherlv_5= ',' ( (lv_quantumOperations_6_0= ruleQuantumOperation ) ) )* otherlv_7= '}' )
            {
            // InternalQuCircuit.g:459:2: ( () otherlv_1= 'Layer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' ( (lv_quantumOperations_4_0= ruleQuantumOperation ) ) (otherlv_5= ',' ( (lv_quantumOperations_6_0= ruleQuantumOperation ) ) )* otherlv_7= '}' )
            // InternalQuCircuit.g:460:3: () otherlv_1= 'Layer' ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' ( (lv_quantumOperations_4_0= ruleQuantumOperation ) ) (otherlv_5= ',' ( (lv_quantumOperations_6_0= ruleQuantumOperation ) ) )* otherlv_7= '}'
            {
            // InternalQuCircuit.g:460:3: ()
            // InternalQuCircuit.g:461:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLayerAccess().getLayerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getLayerAccess().getLayerKeyword_1());
            		
            // InternalQuCircuit.g:471:3: ( (lv_name_2_0= ruleEString ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_STRING && LA8_0<=RULE_ID)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalQuCircuit.g:472:4: (lv_name_2_0= ruleEString )
                    {
                    // InternalQuCircuit.g:472:4: (lv_name_2_0= ruleEString )
                    // InternalQuCircuit.g:473:5: lv_name_2_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getLayerAccess().getNameEStringParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_name_2_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLayerRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"quantum.circuit.lang.QuCircuit.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getLayerAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalQuCircuit.g:494:3: ( (lv_quantumOperations_4_0= ruleQuantumOperation ) )
            // InternalQuCircuit.g:495:4: (lv_quantumOperations_4_0= ruleQuantumOperation )
            {
            // InternalQuCircuit.g:495:4: (lv_quantumOperations_4_0= ruleQuantumOperation )
            // InternalQuCircuit.g:496:5: lv_quantumOperations_4_0= ruleQuantumOperation
            {

            					newCompositeNode(grammarAccess.getLayerAccess().getQuantumOperationsQuantumOperationParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_15);
            lv_quantumOperations_4_0=ruleQuantumOperation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLayerRule());
            					}
            					add(
            						current,
            						"quantumOperations",
            						lv_quantumOperations_4_0,
            						"quantum.circuit.lang.QuCircuit.QuantumOperation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQuCircuit.g:513:3: (otherlv_5= ',' ( (lv_quantumOperations_6_0= ruleQuantumOperation ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==21) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalQuCircuit.g:514:4: otherlv_5= ',' ( (lv_quantumOperations_6_0= ruleQuantumOperation ) )
            	    {
            	    otherlv_5=(Token)match(input,21,FOLLOW_14); 

            	    				newLeafNode(otherlv_5, grammarAccess.getLayerAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalQuCircuit.g:518:4: ( (lv_quantumOperations_6_0= ruleQuantumOperation ) )
            	    // InternalQuCircuit.g:519:5: (lv_quantumOperations_6_0= ruleQuantumOperation )
            	    {
            	    // InternalQuCircuit.g:519:5: (lv_quantumOperations_6_0= ruleQuantumOperation )
            	    // InternalQuCircuit.g:520:6: lv_quantumOperations_6_0= ruleQuantumOperation
            	    {

            	    						newCompositeNode(grammarAccess.getLayerAccess().getQuantumOperationsQuantumOperationParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_quantumOperations_6_0=ruleQuantumOperation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLayerRule());
            	    						}
            	    						add(
            	    							current,
            	    							"quantumOperations",
            	    							lv_quantumOperations_6_0,
            	    							"quantum.circuit.lang.QuCircuit.QuantumOperation");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getLayerAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleLayer"


    // $ANTLR start "entryRuleQuantumOperation"
    // InternalQuCircuit.g:546:1: entryRuleQuantumOperation returns [EObject current=null] : iv_ruleQuantumOperation= ruleQuantumOperation EOF ;
    public final EObject entryRuleQuantumOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantumOperation = null;


        try {
            // InternalQuCircuit.g:546:57: (iv_ruleQuantumOperation= ruleQuantumOperation EOF )
            // InternalQuCircuit.g:547:2: iv_ruleQuantumOperation= ruleQuantumOperation EOF
            {
             newCompositeNode(grammarAccess.getQuantumOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuantumOperation=ruleQuantumOperation();

            state._fsp--;

             current =iv_ruleQuantumOperation; 
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
    // $ANTLR end "entryRuleQuantumOperation"


    // $ANTLR start "ruleQuantumOperation"
    // InternalQuCircuit.g:553:1: ruleQuantumOperation returns [EObject current=null] : (this_StatePreparation_0= ruleStatePreparation | this_ElementaryQuantumGate_1= ruleElementaryQuantumGate | this_Measurement_2= ruleMeasurement | this_CompositeQuantumGate_3= ruleCompositeQuantumGate | this_Loop_4= ruleLoop ) ;
    public final EObject ruleQuantumOperation() throws RecognitionException {
        EObject current = null;

        EObject this_StatePreparation_0 = null;

        EObject this_ElementaryQuantumGate_1 = null;

        EObject this_Measurement_2 = null;

        EObject this_CompositeQuantumGate_3 = null;

        EObject this_Loop_4 = null;



        	enterRule();

        try {
            // InternalQuCircuit.g:559:2: ( (this_StatePreparation_0= ruleStatePreparation | this_ElementaryQuantumGate_1= ruleElementaryQuantumGate | this_Measurement_2= ruleMeasurement | this_CompositeQuantumGate_3= ruleCompositeQuantumGate | this_Loop_4= ruleLoop ) )
            // InternalQuCircuit.g:560:2: (this_StatePreparation_0= ruleStatePreparation | this_ElementaryQuantumGate_1= ruleElementaryQuantumGate | this_Measurement_2= ruleMeasurement | this_CompositeQuantumGate_3= ruleCompositeQuantumGate | this_Loop_4= ruleLoop )
            {
            // InternalQuCircuit.g:560:2: (this_StatePreparation_0= ruleStatePreparation | this_ElementaryQuantumGate_1= ruleElementaryQuantumGate | this_Measurement_2= ruleMeasurement | this_CompositeQuantumGate_3= ruleCompositeQuantumGate | this_Loop_4= ruleLoop )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt10=1;
                }
                break;
            case 27:
                {
                alt10=2;
                }
                break;
            case 34:
                {
                alt10=3;
                }
                break;
            case 36:
                {
                alt10=4;
                }
                break;
            case 37:
                {
                alt10=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalQuCircuit.g:561:3: this_StatePreparation_0= ruleStatePreparation
                    {

                    			newCompositeNode(grammarAccess.getQuantumOperationAccess().getStatePreparationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_StatePreparation_0=ruleStatePreparation();

                    state._fsp--;


                    			current = this_StatePreparation_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalQuCircuit.g:570:3: this_ElementaryQuantumGate_1= ruleElementaryQuantumGate
                    {

                    			newCompositeNode(grammarAccess.getQuantumOperationAccess().getElementaryQuantumGateParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ElementaryQuantumGate_1=ruleElementaryQuantumGate();

                    state._fsp--;


                    			current = this_ElementaryQuantumGate_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalQuCircuit.g:579:3: this_Measurement_2= ruleMeasurement
                    {

                    			newCompositeNode(grammarAccess.getQuantumOperationAccess().getMeasurementParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Measurement_2=ruleMeasurement();

                    state._fsp--;


                    			current = this_Measurement_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalQuCircuit.g:588:3: this_CompositeQuantumGate_3= ruleCompositeQuantumGate
                    {

                    			newCompositeNode(grammarAccess.getQuantumOperationAccess().getCompositeQuantumGateParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_CompositeQuantumGate_3=ruleCompositeQuantumGate();

                    state._fsp--;


                    			current = this_CompositeQuantumGate_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalQuCircuit.g:597:3: this_Loop_4= ruleLoop
                    {

                    			newCompositeNode(grammarAccess.getQuantumOperationAccess().getLoopParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Loop_4=ruleLoop();

                    state._fsp--;


                    			current = this_Loop_4;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleQuantumOperation"


    // $ANTLR start "entryRuleStatePreparation"
    // InternalQuCircuit.g:609:1: entryRuleStatePreparation returns [EObject current=null] : iv_ruleStatePreparation= ruleStatePreparation EOF ;
    public final EObject entryRuleStatePreparation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatePreparation = null;


        try {
            // InternalQuCircuit.g:609:57: (iv_ruleStatePreparation= ruleStatePreparation EOF )
            // InternalQuCircuit.g:610:2: iv_ruleStatePreparation= ruleStatePreparation EOF
            {
             newCompositeNode(grammarAccess.getStatePreparationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatePreparation=ruleStatePreparation();

            state._fsp--;

             current =iv_ruleStatePreparation; 
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
    // $ANTLR end "entryRuleStatePreparation"


    // $ANTLR start "ruleStatePreparation"
    // InternalQuCircuit.g:616:1: ruleStatePreparation returns [EObject current=null] : (otherlv_0= 'StatePreparation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'operation' ( (lv_operations_4_0= ruleOperation ) ) (otherlv_5= ',' ( (lv_operations_6_0= ruleOperation ) ) )* otherlv_7= 'targetQubits' otherlv_8= '[' ( (lv_targetQubits_9_0= ruleSelector ) ) (otherlv_10= ',' ( (lv_targetQubits_11_0= ruleSelector ) ) )* otherlv_12= ']' otherlv_13= '}' ) ;
    public final EObject ruleStatePreparation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_operations_4_0 = null;

        EObject lv_operations_6_0 = null;

        EObject lv_targetQubits_9_0 = null;

        EObject lv_targetQubits_11_0 = null;



        	enterRule();

        try {
            // InternalQuCircuit.g:622:2: ( (otherlv_0= 'StatePreparation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'operation' ( (lv_operations_4_0= ruleOperation ) ) (otherlv_5= ',' ( (lv_operations_6_0= ruleOperation ) ) )* otherlv_7= 'targetQubits' otherlv_8= '[' ( (lv_targetQubits_9_0= ruleSelector ) ) (otherlv_10= ',' ( (lv_targetQubits_11_0= ruleSelector ) ) )* otherlv_12= ']' otherlv_13= '}' ) )
            // InternalQuCircuit.g:623:2: (otherlv_0= 'StatePreparation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'operation' ( (lv_operations_4_0= ruleOperation ) ) (otherlv_5= ',' ( (lv_operations_6_0= ruleOperation ) ) )* otherlv_7= 'targetQubits' otherlv_8= '[' ( (lv_targetQubits_9_0= ruleSelector ) ) (otherlv_10= ',' ( (lv_targetQubits_11_0= ruleSelector ) ) )* otherlv_12= ']' otherlv_13= '}' )
            {
            // InternalQuCircuit.g:623:2: (otherlv_0= 'StatePreparation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'operation' ( (lv_operations_4_0= ruleOperation ) ) (otherlv_5= ',' ( (lv_operations_6_0= ruleOperation ) ) )* otherlv_7= 'targetQubits' otherlv_8= '[' ( (lv_targetQubits_9_0= ruleSelector ) ) (otherlv_10= ',' ( (lv_targetQubits_11_0= ruleSelector ) ) )* otherlv_12= ']' otherlv_13= '}' )
            // InternalQuCircuit.g:624:3: otherlv_0= 'StatePreparation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'operation' ( (lv_operations_4_0= ruleOperation ) ) (otherlv_5= ',' ( (lv_operations_6_0= ruleOperation ) ) )* otherlv_7= 'targetQubits' otherlv_8= '[' ( (lv_targetQubits_9_0= ruleSelector ) ) (otherlv_10= ',' ( (lv_targetQubits_11_0= ruleSelector ) ) )* otherlv_12= ']' otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStatePreparationAccess().getStatePreparationKeyword_0());
            		
            // InternalQuCircuit.g:628:3: ( (lv_name_1_0= ruleEString ) )
            // InternalQuCircuit.g:629:4: (lv_name_1_0= ruleEString )
            {
            // InternalQuCircuit.g:629:4: (lv_name_1_0= ruleEString )
            // InternalQuCircuit.g:630:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStatePreparationAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStatePreparationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"quantum.circuit.lang.QuCircuit.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getStatePreparationAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getStatePreparationAccess().getOperationKeyword_3());
            		
            // InternalQuCircuit.g:655:3: ( (lv_operations_4_0= ruleOperation ) )
            // InternalQuCircuit.g:656:4: (lv_operations_4_0= ruleOperation )
            {
            // InternalQuCircuit.g:656:4: (lv_operations_4_0= ruleOperation )
            // InternalQuCircuit.g:657:5: lv_operations_4_0= ruleOperation
            {

            					newCompositeNode(grammarAccess.getStatePreparationAccess().getOperationsOperationParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_17);
            lv_operations_4_0=ruleOperation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStatePreparationRule());
            					}
            					add(
            						current,
            						"operations",
            						lv_operations_4_0,
            						"quantum.circuit.lang.QuCircuit.Operation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQuCircuit.g:674:3: (otherlv_5= ',' ( (lv_operations_6_0= ruleOperation ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==21) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalQuCircuit.g:675:4: otherlv_5= ',' ( (lv_operations_6_0= ruleOperation ) )
            	    {
            	    otherlv_5=(Token)match(input,21,FOLLOW_3); 

            	    				newLeafNode(otherlv_5, grammarAccess.getStatePreparationAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalQuCircuit.g:679:4: ( (lv_operations_6_0= ruleOperation ) )
            	    // InternalQuCircuit.g:680:5: (lv_operations_6_0= ruleOperation )
            	    {
            	    // InternalQuCircuit.g:680:5: (lv_operations_6_0= ruleOperation )
            	    // InternalQuCircuit.g:681:6: lv_operations_6_0= ruleOperation
            	    {

            	    						newCompositeNode(grammarAccess.getStatePreparationAccess().getOperationsOperationParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_operations_6_0=ruleOperation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getStatePreparationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"operations",
            	    							lv_operations_6_0,
            	    							"quantum.circuit.lang.QuCircuit.Operation");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_7=(Token)match(input,24,FOLLOW_18); 

            			newLeafNode(otherlv_7, grammarAccess.getStatePreparationAccess().getTargetQubitsKeyword_6());
            		
            otherlv_8=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_8, grammarAccess.getStatePreparationAccess().getLeftSquareBracketKeyword_7());
            		
            // InternalQuCircuit.g:707:3: ( (lv_targetQubits_9_0= ruleSelector ) )
            // InternalQuCircuit.g:708:4: (lv_targetQubits_9_0= ruleSelector )
            {
            // InternalQuCircuit.g:708:4: (lv_targetQubits_9_0= ruleSelector )
            // InternalQuCircuit.g:709:5: lv_targetQubits_9_0= ruleSelector
            {

            					newCompositeNode(grammarAccess.getStatePreparationAccess().getTargetQubitsSelectorParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_20);
            lv_targetQubits_9_0=ruleSelector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStatePreparationRule());
            					}
            					add(
            						current,
            						"targetQubits",
            						lv_targetQubits_9_0,
            						"quantum.circuit.lang.QuCircuit.Selector");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQuCircuit.g:726:3: (otherlv_10= ',' ( (lv_targetQubits_11_0= ruleSelector ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==21) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalQuCircuit.g:727:4: otherlv_10= ',' ( (lv_targetQubits_11_0= ruleSelector ) )
            	    {
            	    otherlv_10=(Token)match(input,21,FOLLOW_19); 

            	    				newLeafNode(otherlv_10, grammarAccess.getStatePreparationAccess().getCommaKeyword_9_0());
            	    			
            	    // InternalQuCircuit.g:731:4: ( (lv_targetQubits_11_0= ruleSelector ) )
            	    // InternalQuCircuit.g:732:5: (lv_targetQubits_11_0= ruleSelector )
            	    {
            	    // InternalQuCircuit.g:732:5: (lv_targetQubits_11_0= ruleSelector )
            	    // InternalQuCircuit.g:733:6: lv_targetQubits_11_0= ruleSelector
            	    {

            	    						newCompositeNode(grammarAccess.getStatePreparationAccess().getTargetQubitsSelectorParserRuleCall_9_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_targetQubits_11_0=ruleSelector();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getStatePreparationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"targetQubits",
            	    							lv_targetQubits_11_0,
            	    							"quantum.circuit.lang.QuCircuit.Selector");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_12=(Token)match(input,26,FOLLOW_10); 

            			newLeafNode(otherlv_12, grammarAccess.getStatePreparationAccess().getRightSquareBracketKeyword_10());
            		
            otherlv_13=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getStatePreparationAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleStatePreparation"


    // $ANTLR start "entryRuleElementaryQuantumGate"
    // InternalQuCircuit.g:763:1: entryRuleElementaryQuantumGate returns [EObject current=null] : iv_ruleElementaryQuantumGate= ruleElementaryQuantumGate EOF ;
    public final EObject entryRuleElementaryQuantumGate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementaryQuantumGate = null;


        try {
            // InternalQuCircuit.g:763:62: (iv_ruleElementaryQuantumGate= ruleElementaryQuantumGate EOF )
            // InternalQuCircuit.g:764:2: iv_ruleElementaryQuantumGate= ruleElementaryQuantumGate EOF
            {
             newCompositeNode(grammarAccess.getElementaryQuantumGateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElementaryQuantumGate=ruleElementaryQuantumGate();

            state._fsp--;

             current =iv_ruleElementaryQuantumGate; 
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
    // $ANTLR end "entryRuleElementaryQuantumGate"


    // $ANTLR start "ruleElementaryQuantumGate"
    // InternalQuCircuit.g:770:1: ruleElementaryQuantumGate returns [EObject current=null] : (otherlv_0= 'ElementaryQuantumGate' ( (lv_inverseForm_1_0= 'inverseForm' ) )? ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'operation' ( (lv_operations_5_0= ruleOperation ) ) )? otherlv_6= 'targetQubits' otherlv_7= '[' otherlv_8= '(' ( (lv_targetQubits_9_0= ruleSelector ) ) otherlv_10= ')' (otherlv_11= ',' otherlv_12= '(' ( (lv_targetQubits_13_0= ruleSelector ) ) otherlv_14= ')' )* otherlv_15= ']' (otherlv_16= 'controlQubits' otherlv_17= '[' ( (lv_controlQubits_18_0= ruleSelector ) ) (otherlv_19= ',' ( (lv_controlQubits_20_0= ruleSelector ) ) )* otherlv_21= ']' )* (otherlv_22= 'angleParameter' ( (lv_angleParameter_23_0= ruleAngleParameter ) ) )? otherlv_24= '}' ) ;
    public final EObject ruleElementaryQuantumGate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_inverseForm_1_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_operations_5_0 = null;

        EObject lv_targetQubits_9_0 = null;

        EObject lv_targetQubits_13_0 = null;

        EObject lv_controlQubits_18_0 = null;

        EObject lv_controlQubits_20_0 = null;

        EObject lv_angleParameter_23_0 = null;



        	enterRule();

        try {
            // InternalQuCircuit.g:776:2: ( (otherlv_0= 'ElementaryQuantumGate' ( (lv_inverseForm_1_0= 'inverseForm' ) )? ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'operation' ( (lv_operations_5_0= ruleOperation ) ) )? otherlv_6= 'targetQubits' otherlv_7= '[' otherlv_8= '(' ( (lv_targetQubits_9_0= ruleSelector ) ) otherlv_10= ')' (otherlv_11= ',' otherlv_12= '(' ( (lv_targetQubits_13_0= ruleSelector ) ) otherlv_14= ')' )* otherlv_15= ']' (otherlv_16= 'controlQubits' otherlv_17= '[' ( (lv_controlQubits_18_0= ruleSelector ) ) (otherlv_19= ',' ( (lv_controlQubits_20_0= ruleSelector ) ) )* otherlv_21= ']' )* (otherlv_22= 'angleParameter' ( (lv_angleParameter_23_0= ruleAngleParameter ) ) )? otherlv_24= '}' ) )
            // InternalQuCircuit.g:777:2: (otherlv_0= 'ElementaryQuantumGate' ( (lv_inverseForm_1_0= 'inverseForm' ) )? ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'operation' ( (lv_operations_5_0= ruleOperation ) ) )? otherlv_6= 'targetQubits' otherlv_7= '[' otherlv_8= '(' ( (lv_targetQubits_9_0= ruleSelector ) ) otherlv_10= ')' (otherlv_11= ',' otherlv_12= '(' ( (lv_targetQubits_13_0= ruleSelector ) ) otherlv_14= ')' )* otherlv_15= ']' (otherlv_16= 'controlQubits' otherlv_17= '[' ( (lv_controlQubits_18_0= ruleSelector ) ) (otherlv_19= ',' ( (lv_controlQubits_20_0= ruleSelector ) ) )* otherlv_21= ']' )* (otherlv_22= 'angleParameter' ( (lv_angleParameter_23_0= ruleAngleParameter ) ) )? otherlv_24= '}' )
            {
            // InternalQuCircuit.g:777:2: (otherlv_0= 'ElementaryQuantumGate' ( (lv_inverseForm_1_0= 'inverseForm' ) )? ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'operation' ( (lv_operations_5_0= ruleOperation ) ) )? otherlv_6= 'targetQubits' otherlv_7= '[' otherlv_8= '(' ( (lv_targetQubits_9_0= ruleSelector ) ) otherlv_10= ')' (otherlv_11= ',' otherlv_12= '(' ( (lv_targetQubits_13_0= ruleSelector ) ) otherlv_14= ')' )* otherlv_15= ']' (otherlv_16= 'controlQubits' otherlv_17= '[' ( (lv_controlQubits_18_0= ruleSelector ) ) (otherlv_19= ',' ( (lv_controlQubits_20_0= ruleSelector ) ) )* otherlv_21= ']' )* (otherlv_22= 'angleParameter' ( (lv_angleParameter_23_0= ruleAngleParameter ) ) )? otherlv_24= '}' )
            // InternalQuCircuit.g:778:3: otherlv_0= 'ElementaryQuantumGate' ( (lv_inverseForm_1_0= 'inverseForm' ) )? ( (lv_name_2_0= ruleEString ) )? otherlv_3= '{' (otherlv_4= 'operation' ( (lv_operations_5_0= ruleOperation ) ) )? otherlv_6= 'targetQubits' otherlv_7= '[' otherlv_8= '(' ( (lv_targetQubits_9_0= ruleSelector ) ) otherlv_10= ')' (otherlv_11= ',' otherlv_12= '(' ( (lv_targetQubits_13_0= ruleSelector ) ) otherlv_14= ')' )* otherlv_15= ']' (otherlv_16= 'controlQubits' otherlv_17= '[' ( (lv_controlQubits_18_0= ruleSelector ) ) (otherlv_19= ',' ( (lv_controlQubits_20_0= ruleSelector ) ) )* otherlv_21= ']' )* (otherlv_22= 'angleParameter' ( (lv_angleParameter_23_0= ruleAngleParameter ) ) )? otherlv_24= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getElementaryQuantumGateAccess().getElementaryQuantumGateKeyword_0());
            		
            // InternalQuCircuit.g:782:3: ( (lv_inverseForm_1_0= 'inverseForm' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalQuCircuit.g:783:4: (lv_inverseForm_1_0= 'inverseForm' )
                    {
                    // InternalQuCircuit.g:783:4: (lv_inverseForm_1_0= 'inverseForm' )
                    // InternalQuCircuit.g:784:5: lv_inverseForm_1_0= 'inverseForm'
                    {
                    lv_inverseForm_1_0=(Token)match(input,28,FOLLOW_13); 

                    					newLeafNode(lv_inverseForm_1_0, grammarAccess.getElementaryQuantumGateAccess().getInverseFormInverseFormKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getElementaryQuantumGateRule());
                    					}
                    					setWithLastConsumed(current, "inverseForm", lv_inverseForm_1_0 != null, "inverseForm");
                    				

                    }


                    }
                    break;

            }

            // InternalQuCircuit.g:796:3: ( (lv_name_2_0= ruleEString ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_STRING && LA14_0<=RULE_ID)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalQuCircuit.g:797:4: (lv_name_2_0= ruleEString )
                    {
                    // InternalQuCircuit.g:797:4: (lv_name_2_0= ruleEString )
                    // InternalQuCircuit.g:798:5: lv_name_2_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getElementaryQuantumGateAccess().getNameEStringParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_name_2_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getElementaryQuantumGateRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"quantum.circuit.lang.QuCircuit.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getElementaryQuantumGateAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalQuCircuit.g:819:3: (otherlv_4= 'operation' ( (lv_operations_5_0= ruleOperation ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==23) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalQuCircuit.g:820:4: otherlv_4= 'operation' ( (lv_operations_5_0= ruleOperation ) )
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getElementaryQuantumGateAccess().getOperationKeyword_4_0());
                    			
                    // InternalQuCircuit.g:824:4: ( (lv_operations_5_0= ruleOperation ) )
                    // InternalQuCircuit.g:825:5: (lv_operations_5_0= ruleOperation )
                    {
                    // InternalQuCircuit.g:825:5: (lv_operations_5_0= ruleOperation )
                    // InternalQuCircuit.g:826:6: lv_operations_5_0= ruleOperation
                    {

                    						newCompositeNode(grammarAccess.getElementaryQuantumGateAccess().getOperationsOperationParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_operations_5_0=ruleOperation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getElementaryQuantumGateRule());
                    						}
                    						add(
                    							current,
                    							"operations",
                    							lv_operations_5_0,
                    							"quantum.circuit.lang.QuCircuit.Operation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,24,FOLLOW_18); 

            			newLeafNode(otherlv_6, grammarAccess.getElementaryQuantumGateAccess().getTargetQubitsKeyword_5());
            		
            otherlv_7=(Token)match(input,25,FOLLOW_24); 

            			newLeafNode(otherlv_7, grammarAccess.getElementaryQuantumGateAccess().getLeftSquareBracketKeyword_6());
            		
            otherlv_8=(Token)match(input,16,FOLLOW_19); 

            			newLeafNode(otherlv_8, grammarAccess.getElementaryQuantumGateAccess().getLeftParenthesisKeyword_7());
            		
            // InternalQuCircuit.g:856:3: ( (lv_targetQubits_9_0= ruleSelector ) )
            // InternalQuCircuit.g:857:4: (lv_targetQubits_9_0= ruleSelector )
            {
            // InternalQuCircuit.g:857:4: (lv_targetQubits_9_0= ruleSelector )
            // InternalQuCircuit.g:858:5: lv_targetQubits_9_0= ruleSelector
            {

            					newCompositeNode(grammarAccess.getElementaryQuantumGateAccess().getTargetQubitsSelectorParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_11);
            lv_targetQubits_9_0=ruleSelector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getElementaryQuantumGateRule());
            					}
            					add(
            						current,
            						"targetQubits",
            						lv_targetQubits_9_0,
            						"quantum.circuit.lang.QuCircuit.Selector");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,17,FOLLOW_20); 

            			newLeafNode(otherlv_10, grammarAccess.getElementaryQuantumGateAccess().getRightParenthesisKeyword_9());
            		
            // InternalQuCircuit.g:879:3: (otherlv_11= ',' otherlv_12= '(' ( (lv_targetQubits_13_0= ruleSelector ) ) otherlv_14= ')' )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==21) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalQuCircuit.g:880:4: otherlv_11= ',' otherlv_12= '(' ( (lv_targetQubits_13_0= ruleSelector ) ) otherlv_14= ')'
            	    {
            	    otherlv_11=(Token)match(input,21,FOLLOW_24); 

            	    				newLeafNode(otherlv_11, grammarAccess.getElementaryQuantumGateAccess().getCommaKeyword_10_0());
            	    			
            	    otherlv_12=(Token)match(input,16,FOLLOW_19); 

            	    				newLeafNode(otherlv_12, grammarAccess.getElementaryQuantumGateAccess().getLeftParenthesisKeyword_10_1());
            	    			
            	    // InternalQuCircuit.g:888:4: ( (lv_targetQubits_13_0= ruleSelector ) )
            	    // InternalQuCircuit.g:889:5: (lv_targetQubits_13_0= ruleSelector )
            	    {
            	    // InternalQuCircuit.g:889:5: (lv_targetQubits_13_0= ruleSelector )
            	    // InternalQuCircuit.g:890:6: lv_targetQubits_13_0= ruleSelector
            	    {

            	    						newCompositeNode(grammarAccess.getElementaryQuantumGateAccess().getTargetQubitsSelectorParserRuleCall_10_2_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_targetQubits_13_0=ruleSelector();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getElementaryQuantumGateRule());
            	    						}
            	    						add(
            	    							current,
            	    							"targetQubits",
            	    							lv_targetQubits_13_0,
            	    							"quantum.circuit.lang.QuCircuit.Selector");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_14=(Token)match(input,17,FOLLOW_20); 

            	    				newLeafNode(otherlv_14, grammarAccess.getElementaryQuantumGateAccess().getRightParenthesisKeyword_10_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_15=(Token)match(input,26,FOLLOW_25); 

            			newLeafNode(otherlv_15, grammarAccess.getElementaryQuantumGateAccess().getRightSquareBracketKeyword_11());
            		
            // InternalQuCircuit.g:916:3: (otherlv_16= 'controlQubits' otherlv_17= '[' ( (lv_controlQubits_18_0= ruleSelector ) ) (otherlv_19= ',' ( (lv_controlQubits_20_0= ruleSelector ) ) )* otherlv_21= ']' )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==29) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalQuCircuit.g:917:4: otherlv_16= 'controlQubits' otherlv_17= '[' ( (lv_controlQubits_18_0= ruleSelector ) ) (otherlv_19= ',' ( (lv_controlQubits_20_0= ruleSelector ) ) )* otherlv_21= ']'
            	    {
            	    otherlv_16=(Token)match(input,29,FOLLOW_18); 

            	    				newLeafNode(otherlv_16, grammarAccess.getElementaryQuantumGateAccess().getControlQubitsKeyword_12_0());
            	    			
            	    otherlv_17=(Token)match(input,25,FOLLOW_19); 

            	    				newLeafNode(otherlv_17, grammarAccess.getElementaryQuantumGateAccess().getLeftSquareBracketKeyword_12_1());
            	    			
            	    // InternalQuCircuit.g:925:4: ( (lv_controlQubits_18_0= ruleSelector ) )
            	    // InternalQuCircuit.g:926:5: (lv_controlQubits_18_0= ruleSelector )
            	    {
            	    // InternalQuCircuit.g:926:5: (lv_controlQubits_18_0= ruleSelector )
            	    // InternalQuCircuit.g:927:6: lv_controlQubits_18_0= ruleSelector
            	    {

            	    						newCompositeNode(grammarAccess.getElementaryQuantumGateAccess().getControlQubitsSelectorParserRuleCall_12_2_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_controlQubits_18_0=ruleSelector();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getElementaryQuantumGateRule());
            	    						}
            	    						add(
            	    							current,
            	    							"controlQubits",
            	    							lv_controlQubits_18_0,
            	    							"quantum.circuit.lang.QuCircuit.Selector");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalQuCircuit.g:944:4: (otherlv_19= ',' ( (lv_controlQubits_20_0= ruleSelector ) ) )*
            	    loop17:
            	    do {
            	        int alt17=2;
            	        int LA17_0 = input.LA(1);

            	        if ( (LA17_0==21) ) {
            	            alt17=1;
            	        }


            	        switch (alt17) {
            	    	case 1 :
            	    	    // InternalQuCircuit.g:945:5: otherlv_19= ',' ( (lv_controlQubits_20_0= ruleSelector ) )
            	    	    {
            	    	    otherlv_19=(Token)match(input,21,FOLLOW_19); 

            	    	    					newLeafNode(otherlv_19, grammarAccess.getElementaryQuantumGateAccess().getCommaKeyword_12_3_0());
            	    	    				
            	    	    // InternalQuCircuit.g:949:5: ( (lv_controlQubits_20_0= ruleSelector ) )
            	    	    // InternalQuCircuit.g:950:6: (lv_controlQubits_20_0= ruleSelector )
            	    	    {
            	    	    // InternalQuCircuit.g:950:6: (lv_controlQubits_20_0= ruleSelector )
            	    	    // InternalQuCircuit.g:951:7: lv_controlQubits_20_0= ruleSelector
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getElementaryQuantumGateAccess().getControlQubitsSelectorParserRuleCall_12_3_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_20);
            	    	    lv_controlQubits_20_0=ruleSelector();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getElementaryQuantumGateRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"controlQubits",
            	    	    								lv_controlQubits_20_0,
            	    	    								"quantum.circuit.lang.QuCircuit.Selector");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop17;
            	        }
            	    } while (true);

            	    otherlv_21=(Token)match(input,26,FOLLOW_25); 

            	    				newLeafNode(otherlv_21, grammarAccess.getElementaryQuantumGateAccess().getRightSquareBracketKeyword_12_4());
            	    			

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // InternalQuCircuit.g:974:3: (otherlv_22= 'angleParameter' ( (lv_angleParameter_23_0= ruleAngleParameter ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==30) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalQuCircuit.g:975:4: otherlv_22= 'angleParameter' ( (lv_angleParameter_23_0= ruleAngleParameter ) )
                    {
                    otherlv_22=(Token)match(input,30,FOLLOW_5); 

                    				newLeafNode(otherlv_22, grammarAccess.getElementaryQuantumGateAccess().getAngleParameterKeyword_13_0());
                    			
                    // InternalQuCircuit.g:979:4: ( (lv_angleParameter_23_0= ruleAngleParameter ) )
                    // InternalQuCircuit.g:980:5: (lv_angleParameter_23_0= ruleAngleParameter )
                    {
                    // InternalQuCircuit.g:980:5: (lv_angleParameter_23_0= ruleAngleParameter )
                    // InternalQuCircuit.g:981:6: lv_angleParameter_23_0= ruleAngleParameter
                    {

                    						newCompositeNode(grammarAccess.getElementaryQuantumGateAccess().getAngleParameterAngleParameterParserRuleCall_13_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_angleParameter_23_0=ruleAngleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getElementaryQuantumGateRule());
                    						}
                    						set(
                    							current,
                    							"angleParameter",
                    							lv_angleParameter_23_0,
                    							"quantum.circuit.lang.QuCircuit.AngleParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_24=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_24, grammarAccess.getElementaryQuantumGateAccess().getRightCurlyBracketKeyword_14());
            		

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
    // $ANTLR end "ruleElementaryQuantumGate"


    // $ANTLR start "entryRuleAngleParameter"
    // InternalQuCircuit.g:1007:1: entryRuleAngleParameter returns [EObject current=null] : iv_ruleAngleParameter= ruleAngleParameter EOF ;
    public final EObject entryRuleAngleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAngleParameter = null;


        try {
            // InternalQuCircuit.g:1007:55: (iv_ruleAngleParameter= ruleAngleParameter EOF )
            // InternalQuCircuit.g:1008:2: iv_ruleAngleParameter= ruleAngleParameter EOF
            {
             newCompositeNode(grammarAccess.getAngleParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAngleParameter=ruleAngleParameter();

            state._fsp--;

             current =iv_ruleAngleParameter; 
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
    // $ANTLR end "entryRuleAngleParameter"


    // $ANTLR start "ruleAngleParameter"
    // InternalQuCircuit.g:1014:1: ruleAngleParameter returns [EObject current=null] : ( () otherlv_1= '{' (otherlv_2= 'theta' ( (lv_theta_3_0= ruleEDoubleObject ) ) )? (otherlv_4= 'phi' ( (lv_phi_5_0= ruleEDoubleObject ) ) )? (otherlv_6= 'lambda' ( (lv_lambda_7_0= ruleEDoubleObject ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleAngleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_theta_3_0 = null;

        AntlrDatatypeRuleToken lv_phi_5_0 = null;

        AntlrDatatypeRuleToken lv_lambda_7_0 = null;



        	enterRule();

        try {
            // InternalQuCircuit.g:1020:2: ( ( () otherlv_1= '{' (otherlv_2= 'theta' ( (lv_theta_3_0= ruleEDoubleObject ) ) )? (otherlv_4= 'phi' ( (lv_phi_5_0= ruleEDoubleObject ) ) )? (otherlv_6= 'lambda' ( (lv_lambda_7_0= ruleEDoubleObject ) ) )? otherlv_8= '}' ) )
            // InternalQuCircuit.g:1021:2: ( () otherlv_1= '{' (otherlv_2= 'theta' ( (lv_theta_3_0= ruleEDoubleObject ) ) )? (otherlv_4= 'phi' ( (lv_phi_5_0= ruleEDoubleObject ) ) )? (otherlv_6= 'lambda' ( (lv_lambda_7_0= ruleEDoubleObject ) ) )? otherlv_8= '}' )
            {
            // InternalQuCircuit.g:1021:2: ( () otherlv_1= '{' (otherlv_2= 'theta' ( (lv_theta_3_0= ruleEDoubleObject ) ) )? (otherlv_4= 'phi' ( (lv_phi_5_0= ruleEDoubleObject ) ) )? (otherlv_6= 'lambda' ( (lv_lambda_7_0= ruleEDoubleObject ) ) )? otherlv_8= '}' )
            // InternalQuCircuit.g:1022:3: () otherlv_1= '{' (otherlv_2= 'theta' ( (lv_theta_3_0= ruleEDoubleObject ) ) )? (otherlv_4= 'phi' ( (lv_phi_5_0= ruleEDoubleObject ) ) )? (otherlv_6= 'lambda' ( (lv_lambda_7_0= ruleEDoubleObject ) ) )? otherlv_8= '}'
            {
            // InternalQuCircuit.g:1022:3: ()
            // InternalQuCircuit.g:1023:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAngleParameterAccess().getAngleParameterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getAngleParameterAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalQuCircuit.g:1033:3: (otherlv_2= 'theta' ( (lv_theta_3_0= ruleEDoubleObject ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==31) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalQuCircuit.g:1034:4: otherlv_2= 'theta' ( (lv_theta_3_0= ruleEDoubleObject ) )
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_27); 

                    				newLeafNode(otherlv_2, grammarAccess.getAngleParameterAccess().getThetaKeyword_2_0());
                    			
                    // InternalQuCircuit.g:1038:4: ( (lv_theta_3_0= ruleEDoubleObject ) )
                    // InternalQuCircuit.g:1039:5: (lv_theta_3_0= ruleEDoubleObject )
                    {
                    // InternalQuCircuit.g:1039:5: (lv_theta_3_0= ruleEDoubleObject )
                    // InternalQuCircuit.g:1040:6: lv_theta_3_0= ruleEDoubleObject
                    {

                    						newCompositeNode(grammarAccess.getAngleParameterAccess().getThetaEDoubleObjectParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_theta_3_0=ruleEDoubleObject();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAngleParameterRule());
                    						}
                    						set(
                    							current,
                    							"theta",
                    							lv_theta_3_0,
                    							"quantum.circuit.lang.QuCircuit.EDoubleObject");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQuCircuit.g:1058:3: (otherlv_4= 'phi' ( (lv_phi_5_0= ruleEDoubleObject ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==32) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalQuCircuit.g:1059:4: otherlv_4= 'phi' ( (lv_phi_5_0= ruleEDoubleObject ) )
                    {
                    otherlv_4=(Token)match(input,32,FOLLOW_27); 

                    				newLeafNode(otherlv_4, grammarAccess.getAngleParameterAccess().getPhiKeyword_3_0());
                    			
                    // InternalQuCircuit.g:1063:4: ( (lv_phi_5_0= ruleEDoubleObject ) )
                    // InternalQuCircuit.g:1064:5: (lv_phi_5_0= ruleEDoubleObject )
                    {
                    // InternalQuCircuit.g:1064:5: (lv_phi_5_0= ruleEDoubleObject )
                    // InternalQuCircuit.g:1065:6: lv_phi_5_0= ruleEDoubleObject
                    {

                    						newCompositeNode(grammarAccess.getAngleParameterAccess().getPhiEDoubleObjectParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_phi_5_0=ruleEDoubleObject();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAngleParameterRule());
                    						}
                    						set(
                    							current,
                    							"phi",
                    							lv_phi_5_0,
                    							"quantum.circuit.lang.QuCircuit.EDoubleObject");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQuCircuit.g:1083:3: (otherlv_6= 'lambda' ( (lv_lambda_7_0= ruleEDoubleObject ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==33) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalQuCircuit.g:1084:4: otherlv_6= 'lambda' ( (lv_lambda_7_0= ruleEDoubleObject ) )
                    {
                    otherlv_6=(Token)match(input,33,FOLLOW_27); 

                    				newLeafNode(otherlv_6, grammarAccess.getAngleParameterAccess().getLambdaKeyword_4_0());
                    			
                    // InternalQuCircuit.g:1088:4: ( (lv_lambda_7_0= ruleEDoubleObject ) )
                    // InternalQuCircuit.g:1089:5: (lv_lambda_7_0= ruleEDoubleObject )
                    {
                    // InternalQuCircuit.g:1089:5: (lv_lambda_7_0= ruleEDoubleObject )
                    // InternalQuCircuit.g:1090:6: lv_lambda_7_0= ruleEDoubleObject
                    {

                    						newCompositeNode(grammarAccess.getAngleParameterAccess().getLambdaEDoubleObjectParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_lambda_7_0=ruleEDoubleObject();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAngleParameterRule());
                    						}
                    						set(
                    							current,
                    							"lambda",
                    							lv_lambda_7_0,
                    							"quantum.circuit.lang.QuCircuit.EDoubleObject");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getAngleParameterAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleAngleParameter"


    // $ANTLR start "entryRuleMeasurement"
    // InternalQuCircuit.g:1116:1: entryRuleMeasurement returns [EObject current=null] : iv_ruleMeasurement= ruleMeasurement EOF ;
    public final EObject entryRuleMeasurement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasurement = null;


        try {
            // InternalQuCircuit.g:1116:52: (iv_ruleMeasurement= ruleMeasurement EOF )
            // InternalQuCircuit.g:1117:2: iv_ruleMeasurement= ruleMeasurement EOF
            {
             newCompositeNode(grammarAccess.getMeasurementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMeasurement=ruleMeasurement();

            state._fsp--;

             current =iv_ruleMeasurement; 
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
    // $ANTLR end "entryRuleMeasurement"


    // $ANTLR start "ruleMeasurement"
    // InternalQuCircuit.g:1123:1: ruleMeasurement returns [EObject current=null] : (otherlv_0= 'Measurement' ( (lv_name_1_0= ruleEString ) )? otherlv_2= '{' (otherlv_3= 'operation' ( (lv_operations_4_0= ruleOperation ) ) )? otherlv_5= 'targetQubits' otherlv_6= '[' otherlv_7= '(' ( (lv_targetQubits_8_0= ruleSelector ) ) otherlv_9= ')' (otherlv_10= ',' otherlv_11= '(' ( (lv_targetQubits_12_0= ruleSelector ) ) otherlv_13= ')' )* otherlv_14= ']' otherlv_15= 'classicBits' otherlv_16= '[' otherlv_17= '(' ( (lv_classicBits_18_0= ruleSelector ) ) otherlv_19= ')' (otherlv_20= ',' otherlv_21= '(' ( (lv_classicBits_22_0= ruleSelector ) ) otherlv_23= ')' )* otherlv_24= ']' otherlv_25= '}' ) ;
    public final EObject ruleMeasurement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_operations_4_0 = null;

        EObject lv_targetQubits_8_0 = null;

        EObject lv_targetQubits_12_0 = null;

        EObject lv_classicBits_18_0 = null;

        EObject lv_classicBits_22_0 = null;



        	enterRule();

        try {
            // InternalQuCircuit.g:1129:2: ( (otherlv_0= 'Measurement' ( (lv_name_1_0= ruleEString ) )? otherlv_2= '{' (otherlv_3= 'operation' ( (lv_operations_4_0= ruleOperation ) ) )? otherlv_5= 'targetQubits' otherlv_6= '[' otherlv_7= '(' ( (lv_targetQubits_8_0= ruleSelector ) ) otherlv_9= ')' (otherlv_10= ',' otherlv_11= '(' ( (lv_targetQubits_12_0= ruleSelector ) ) otherlv_13= ')' )* otherlv_14= ']' otherlv_15= 'classicBits' otherlv_16= '[' otherlv_17= '(' ( (lv_classicBits_18_0= ruleSelector ) ) otherlv_19= ')' (otherlv_20= ',' otherlv_21= '(' ( (lv_classicBits_22_0= ruleSelector ) ) otherlv_23= ')' )* otherlv_24= ']' otherlv_25= '}' ) )
            // InternalQuCircuit.g:1130:2: (otherlv_0= 'Measurement' ( (lv_name_1_0= ruleEString ) )? otherlv_2= '{' (otherlv_3= 'operation' ( (lv_operations_4_0= ruleOperation ) ) )? otherlv_5= 'targetQubits' otherlv_6= '[' otherlv_7= '(' ( (lv_targetQubits_8_0= ruleSelector ) ) otherlv_9= ')' (otherlv_10= ',' otherlv_11= '(' ( (lv_targetQubits_12_0= ruleSelector ) ) otherlv_13= ')' )* otherlv_14= ']' otherlv_15= 'classicBits' otherlv_16= '[' otherlv_17= '(' ( (lv_classicBits_18_0= ruleSelector ) ) otherlv_19= ')' (otherlv_20= ',' otherlv_21= '(' ( (lv_classicBits_22_0= ruleSelector ) ) otherlv_23= ')' )* otherlv_24= ']' otherlv_25= '}' )
            {
            // InternalQuCircuit.g:1130:2: (otherlv_0= 'Measurement' ( (lv_name_1_0= ruleEString ) )? otherlv_2= '{' (otherlv_3= 'operation' ( (lv_operations_4_0= ruleOperation ) ) )? otherlv_5= 'targetQubits' otherlv_6= '[' otherlv_7= '(' ( (lv_targetQubits_8_0= ruleSelector ) ) otherlv_9= ')' (otherlv_10= ',' otherlv_11= '(' ( (lv_targetQubits_12_0= ruleSelector ) ) otherlv_13= ')' )* otherlv_14= ']' otherlv_15= 'classicBits' otherlv_16= '[' otherlv_17= '(' ( (lv_classicBits_18_0= ruleSelector ) ) otherlv_19= ')' (otherlv_20= ',' otherlv_21= '(' ( (lv_classicBits_22_0= ruleSelector ) ) otherlv_23= ')' )* otherlv_24= ']' otherlv_25= '}' )
            // InternalQuCircuit.g:1131:3: otherlv_0= 'Measurement' ( (lv_name_1_0= ruleEString ) )? otherlv_2= '{' (otherlv_3= 'operation' ( (lv_operations_4_0= ruleOperation ) ) )? otherlv_5= 'targetQubits' otherlv_6= '[' otherlv_7= '(' ( (lv_targetQubits_8_0= ruleSelector ) ) otherlv_9= ')' (otherlv_10= ',' otherlv_11= '(' ( (lv_targetQubits_12_0= ruleSelector ) ) otherlv_13= ')' )* otherlv_14= ']' otherlv_15= 'classicBits' otherlv_16= '[' otherlv_17= '(' ( (lv_classicBits_18_0= ruleSelector ) ) otherlv_19= ')' (otherlv_20= ',' otherlv_21= '(' ( (lv_classicBits_22_0= ruleSelector ) ) otherlv_23= ')' )* otherlv_24= ']' otherlv_25= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getMeasurementAccess().getMeasurementKeyword_0());
            		
            // InternalQuCircuit.g:1135:3: ( (lv_name_1_0= ruleEString ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=RULE_STRING && LA23_0<=RULE_ID)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalQuCircuit.g:1136:4: (lv_name_1_0= ruleEString )
                    {
                    // InternalQuCircuit.g:1136:4: (lv_name_1_0= ruleEString )
                    // InternalQuCircuit.g:1137:5: lv_name_1_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getMeasurementAccess().getNameEStringParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_name_1_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMeasurementRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"quantum.circuit.lang.QuCircuit.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getMeasurementAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQuCircuit.g:1158:3: (otherlv_3= 'operation' ( (lv_operations_4_0= ruleOperation ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==23) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalQuCircuit.g:1159:4: otherlv_3= 'operation' ( (lv_operations_4_0= ruleOperation ) )
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getMeasurementAccess().getOperationKeyword_3_0());
                    			
                    // InternalQuCircuit.g:1163:4: ( (lv_operations_4_0= ruleOperation ) )
                    // InternalQuCircuit.g:1164:5: (lv_operations_4_0= ruleOperation )
                    {
                    // InternalQuCircuit.g:1164:5: (lv_operations_4_0= ruleOperation )
                    // InternalQuCircuit.g:1165:6: lv_operations_4_0= ruleOperation
                    {

                    						newCompositeNode(grammarAccess.getMeasurementAccess().getOperationsOperationParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_operations_4_0=ruleOperation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMeasurementRule());
                    						}
                    						add(
                    							current,
                    							"operations",
                    							lv_operations_4_0,
                    							"quantum.circuit.lang.QuCircuit.Operation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,24,FOLLOW_18); 

            			newLeafNode(otherlv_5, grammarAccess.getMeasurementAccess().getTargetQubitsKeyword_4());
            		
            otherlv_6=(Token)match(input,25,FOLLOW_24); 

            			newLeafNode(otherlv_6, grammarAccess.getMeasurementAccess().getLeftSquareBracketKeyword_5());
            		
            otherlv_7=(Token)match(input,16,FOLLOW_19); 

            			newLeafNode(otherlv_7, grammarAccess.getMeasurementAccess().getLeftParenthesisKeyword_6());
            		
            // InternalQuCircuit.g:1195:3: ( (lv_targetQubits_8_0= ruleSelector ) )
            // InternalQuCircuit.g:1196:4: (lv_targetQubits_8_0= ruleSelector )
            {
            // InternalQuCircuit.g:1196:4: (lv_targetQubits_8_0= ruleSelector )
            // InternalQuCircuit.g:1197:5: lv_targetQubits_8_0= ruleSelector
            {

            					newCompositeNode(grammarAccess.getMeasurementAccess().getTargetQubitsSelectorParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_11);
            lv_targetQubits_8_0=ruleSelector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMeasurementRule());
            					}
            					add(
            						current,
            						"targetQubits",
            						lv_targetQubits_8_0,
            						"quantum.circuit.lang.QuCircuit.Selector");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,17,FOLLOW_20); 

            			newLeafNode(otherlv_9, grammarAccess.getMeasurementAccess().getRightParenthesisKeyword_8());
            		
            // InternalQuCircuit.g:1218:3: (otherlv_10= ',' otherlv_11= '(' ( (lv_targetQubits_12_0= ruleSelector ) ) otherlv_13= ')' )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==21) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalQuCircuit.g:1219:4: otherlv_10= ',' otherlv_11= '(' ( (lv_targetQubits_12_0= ruleSelector ) ) otherlv_13= ')'
            	    {
            	    otherlv_10=(Token)match(input,21,FOLLOW_24); 

            	    				newLeafNode(otherlv_10, grammarAccess.getMeasurementAccess().getCommaKeyword_9_0());
            	    			
            	    otherlv_11=(Token)match(input,16,FOLLOW_19); 

            	    				newLeafNode(otherlv_11, grammarAccess.getMeasurementAccess().getLeftParenthesisKeyword_9_1());
            	    			
            	    // InternalQuCircuit.g:1227:4: ( (lv_targetQubits_12_0= ruleSelector ) )
            	    // InternalQuCircuit.g:1228:5: (lv_targetQubits_12_0= ruleSelector )
            	    {
            	    // InternalQuCircuit.g:1228:5: (lv_targetQubits_12_0= ruleSelector )
            	    // InternalQuCircuit.g:1229:6: lv_targetQubits_12_0= ruleSelector
            	    {

            	    						newCompositeNode(grammarAccess.getMeasurementAccess().getTargetQubitsSelectorParserRuleCall_9_2_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_targetQubits_12_0=ruleSelector();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMeasurementRule());
            	    						}
            	    						add(
            	    							current,
            	    							"targetQubits",
            	    							lv_targetQubits_12_0,
            	    							"quantum.circuit.lang.QuCircuit.Selector");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_13=(Token)match(input,17,FOLLOW_20); 

            	    				newLeafNode(otherlv_13, grammarAccess.getMeasurementAccess().getRightParenthesisKeyword_9_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            otherlv_14=(Token)match(input,26,FOLLOW_30); 

            			newLeafNode(otherlv_14, grammarAccess.getMeasurementAccess().getRightSquareBracketKeyword_10());
            		
            otherlv_15=(Token)match(input,35,FOLLOW_18); 

            			newLeafNode(otherlv_15, grammarAccess.getMeasurementAccess().getClassicBitsKeyword_11());
            		
            otherlv_16=(Token)match(input,25,FOLLOW_24); 

            			newLeafNode(otherlv_16, grammarAccess.getMeasurementAccess().getLeftSquareBracketKeyword_12());
            		
            otherlv_17=(Token)match(input,16,FOLLOW_19); 

            			newLeafNode(otherlv_17, grammarAccess.getMeasurementAccess().getLeftParenthesisKeyword_13());
            		
            // InternalQuCircuit.g:1267:3: ( (lv_classicBits_18_0= ruleSelector ) )
            // InternalQuCircuit.g:1268:4: (lv_classicBits_18_0= ruleSelector )
            {
            // InternalQuCircuit.g:1268:4: (lv_classicBits_18_0= ruleSelector )
            // InternalQuCircuit.g:1269:5: lv_classicBits_18_0= ruleSelector
            {

            					newCompositeNode(grammarAccess.getMeasurementAccess().getClassicBitsSelectorParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_11);
            lv_classicBits_18_0=ruleSelector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMeasurementRule());
            					}
            					add(
            						current,
            						"classicBits",
            						lv_classicBits_18_0,
            						"quantum.circuit.lang.QuCircuit.Selector");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_19=(Token)match(input,17,FOLLOW_20); 

            			newLeafNode(otherlv_19, grammarAccess.getMeasurementAccess().getRightParenthesisKeyword_15());
            		
            // InternalQuCircuit.g:1290:3: (otherlv_20= ',' otherlv_21= '(' ( (lv_classicBits_22_0= ruleSelector ) ) otherlv_23= ')' )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==21) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalQuCircuit.g:1291:4: otherlv_20= ',' otherlv_21= '(' ( (lv_classicBits_22_0= ruleSelector ) ) otherlv_23= ')'
            	    {
            	    otherlv_20=(Token)match(input,21,FOLLOW_24); 

            	    				newLeafNode(otherlv_20, grammarAccess.getMeasurementAccess().getCommaKeyword_16_0());
            	    			
            	    otherlv_21=(Token)match(input,16,FOLLOW_19); 

            	    				newLeafNode(otherlv_21, grammarAccess.getMeasurementAccess().getLeftParenthesisKeyword_16_1());
            	    			
            	    // InternalQuCircuit.g:1299:4: ( (lv_classicBits_22_0= ruleSelector ) )
            	    // InternalQuCircuit.g:1300:5: (lv_classicBits_22_0= ruleSelector )
            	    {
            	    // InternalQuCircuit.g:1300:5: (lv_classicBits_22_0= ruleSelector )
            	    // InternalQuCircuit.g:1301:6: lv_classicBits_22_0= ruleSelector
            	    {

            	    						newCompositeNode(grammarAccess.getMeasurementAccess().getClassicBitsSelectorParserRuleCall_16_2_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_classicBits_22_0=ruleSelector();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMeasurementRule());
            	    						}
            	    						add(
            	    							current,
            	    							"classicBits",
            	    							lv_classicBits_22_0,
            	    							"quantum.circuit.lang.QuCircuit.Selector");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_23=(Token)match(input,17,FOLLOW_20); 

            	    				newLeafNode(otherlv_23, grammarAccess.getMeasurementAccess().getRightParenthesisKeyword_16_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            otherlv_24=(Token)match(input,26,FOLLOW_10); 

            			newLeafNode(otherlv_24, grammarAccess.getMeasurementAccess().getRightSquareBracketKeyword_17());
            		
            otherlv_25=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_25, grammarAccess.getMeasurementAccess().getRightCurlyBracketKeyword_18());
            		

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
    // $ANTLR end "ruleMeasurement"


    // $ANTLR start "entryRuleCompositeQuantumGate"
    // InternalQuCircuit.g:1335:1: entryRuleCompositeQuantumGate returns [EObject current=null] : iv_ruleCompositeQuantumGate= ruleCompositeQuantumGate EOF ;
    public final EObject entryRuleCompositeQuantumGate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeQuantumGate = null;


        try {
            // InternalQuCircuit.g:1335:61: (iv_ruleCompositeQuantumGate= ruleCompositeQuantumGate EOF )
            // InternalQuCircuit.g:1336:2: iv_ruleCompositeQuantumGate= ruleCompositeQuantumGate EOF
            {
             newCompositeNode(grammarAccess.getCompositeQuantumGateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompositeQuantumGate=ruleCompositeQuantumGate();

            state._fsp--;

             current =iv_ruleCompositeQuantumGate; 
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
    // $ANTLR end "entryRuleCompositeQuantumGate"


    // $ANTLR start "ruleCompositeQuantumGate"
    // InternalQuCircuit.g:1342:1: ruleCompositeQuantumGate returns [EObject current=null] : (otherlv_0= 'CompositeQuantumGate' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_inverseForm_3_0= 'inverseForm' ) )? (otherlv_4= 'operation' ( (lv_operations_5_0= ruleOperation ) ) )? otherlv_6= 'targetQubits' otherlv_7= '[' otherlv_8= '(' ( (lv_targetQubits_9_0= ruleSelector ) ) otherlv_10= ')' (otherlv_11= ',' otherlv_12= '(' ( (lv_targetQubits_13_0= ruleSelector ) ) otherlv_14= ')' )* otherlv_15= ']' (otherlv_16= 'controlQubits' otherlv_17= '[' ( (lv_controlQubits_18_0= ruleSelector ) ) (otherlv_19= ',' ( (lv_controlQubits_20_0= ruleSelector ) ) )* otherlv_21= ']' )? otherlv_22= '}' ) ;
    public final EObject ruleCompositeQuantumGate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_inverseForm_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_operations_5_0 = null;

        EObject lv_targetQubits_9_0 = null;

        EObject lv_targetQubits_13_0 = null;

        EObject lv_controlQubits_18_0 = null;

        EObject lv_controlQubits_20_0 = null;



        	enterRule();

        try {
            // InternalQuCircuit.g:1348:2: ( (otherlv_0= 'CompositeQuantumGate' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_inverseForm_3_0= 'inverseForm' ) )? (otherlv_4= 'operation' ( (lv_operations_5_0= ruleOperation ) ) )? otherlv_6= 'targetQubits' otherlv_7= '[' otherlv_8= '(' ( (lv_targetQubits_9_0= ruleSelector ) ) otherlv_10= ')' (otherlv_11= ',' otherlv_12= '(' ( (lv_targetQubits_13_0= ruleSelector ) ) otherlv_14= ')' )* otherlv_15= ']' (otherlv_16= 'controlQubits' otherlv_17= '[' ( (lv_controlQubits_18_0= ruleSelector ) ) (otherlv_19= ',' ( (lv_controlQubits_20_0= ruleSelector ) ) )* otherlv_21= ']' )? otherlv_22= '}' ) )
            // InternalQuCircuit.g:1349:2: (otherlv_0= 'CompositeQuantumGate' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_inverseForm_3_0= 'inverseForm' ) )? (otherlv_4= 'operation' ( (lv_operations_5_0= ruleOperation ) ) )? otherlv_6= 'targetQubits' otherlv_7= '[' otherlv_8= '(' ( (lv_targetQubits_9_0= ruleSelector ) ) otherlv_10= ')' (otherlv_11= ',' otherlv_12= '(' ( (lv_targetQubits_13_0= ruleSelector ) ) otherlv_14= ')' )* otherlv_15= ']' (otherlv_16= 'controlQubits' otherlv_17= '[' ( (lv_controlQubits_18_0= ruleSelector ) ) (otherlv_19= ',' ( (lv_controlQubits_20_0= ruleSelector ) ) )* otherlv_21= ']' )? otherlv_22= '}' )
            {
            // InternalQuCircuit.g:1349:2: (otherlv_0= 'CompositeQuantumGate' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_inverseForm_3_0= 'inverseForm' ) )? (otherlv_4= 'operation' ( (lv_operations_5_0= ruleOperation ) ) )? otherlv_6= 'targetQubits' otherlv_7= '[' otherlv_8= '(' ( (lv_targetQubits_9_0= ruleSelector ) ) otherlv_10= ')' (otherlv_11= ',' otherlv_12= '(' ( (lv_targetQubits_13_0= ruleSelector ) ) otherlv_14= ')' )* otherlv_15= ']' (otherlv_16= 'controlQubits' otherlv_17= '[' ( (lv_controlQubits_18_0= ruleSelector ) ) (otherlv_19= ',' ( (lv_controlQubits_20_0= ruleSelector ) ) )* otherlv_21= ']' )? otherlv_22= '}' )
            // InternalQuCircuit.g:1350:3: otherlv_0= 'CompositeQuantumGate' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_inverseForm_3_0= 'inverseForm' ) )? (otherlv_4= 'operation' ( (lv_operations_5_0= ruleOperation ) ) )? otherlv_6= 'targetQubits' otherlv_7= '[' otherlv_8= '(' ( (lv_targetQubits_9_0= ruleSelector ) ) otherlv_10= ')' (otherlv_11= ',' otherlv_12= '(' ( (lv_targetQubits_13_0= ruleSelector ) ) otherlv_14= ')' )* otherlv_15= ']' (otherlv_16= 'controlQubits' otherlv_17= '[' ( (lv_controlQubits_18_0= ruleSelector ) ) (otherlv_19= ',' ( (lv_controlQubits_20_0= ruleSelector ) ) )* otherlv_21= ']' )? otherlv_22= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCompositeQuantumGateAccess().getCompositeQuantumGateKeyword_0());
            		
            // InternalQuCircuit.g:1354:3: ( (lv_name_1_0= ruleEString ) )
            // InternalQuCircuit.g:1355:4: (lv_name_1_0= ruleEString )
            {
            // InternalQuCircuit.g:1355:4: (lv_name_1_0= ruleEString )
            // InternalQuCircuit.g:1356:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCompositeQuantumGateAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositeQuantumGateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"quantum.circuit.lang.QuCircuit.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_31); 

            			newLeafNode(otherlv_2, grammarAccess.getCompositeQuantumGateAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQuCircuit.g:1377:3: ( (lv_inverseForm_3_0= 'inverseForm' ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==28) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalQuCircuit.g:1378:4: (lv_inverseForm_3_0= 'inverseForm' )
                    {
                    // InternalQuCircuit.g:1378:4: (lv_inverseForm_3_0= 'inverseForm' )
                    // InternalQuCircuit.g:1379:5: lv_inverseForm_3_0= 'inverseForm'
                    {
                    lv_inverseForm_3_0=(Token)match(input,28,FOLLOW_22); 

                    					newLeafNode(lv_inverseForm_3_0, grammarAccess.getCompositeQuantumGateAccess().getInverseFormInverseFormKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCompositeQuantumGateRule());
                    					}
                    					setWithLastConsumed(current, "inverseForm", lv_inverseForm_3_0 != null, "inverseForm");
                    				

                    }


                    }
                    break;

            }

            // InternalQuCircuit.g:1391:3: (otherlv_4= 'operation' ( (lv_operations_5_0= ruleOperation ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==23) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalQuCircuit.g:1392:4: otherlv_4= 'operation' ( (lv_operations_5_0= ruleOperation ) )
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getCompositeQuantumGateAccess().getOperationKeyword_4_0());
                    			
                    // InternalQuCircuit.g:1396:4: ( (lv_operations_5_0= ruleOperation ) )
                    // InternalQuCircuit.g:1397:5: (lv_operations_5_0= ruleOperation )
                    {
                    // InternalQuCircuit.g:1397:5: (lv_operations_5_0= ruleOperation )
                    // InternalQuCircuit.g:1398:6: lv_operations_5_0= ruleOperation
                    {

                    						newCompositeNode(grammarAccess.getCompositeQuantumGateAccess().getOperationsOperationParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_operations_5_0=ruleOperation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompositeQuantumGateRule());
                    						}
                    						add(
                    							current,
                    							"operations",
                    							lv_operations_5_0,
                    							"quantum.circuit.lang.QuCircuit.Operation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,24,FOLLOW_18); 

            			newLeafNode(otherlv_6, grammarAccess.getCompositeQuantumGateAccess().getTargetQubitsKeyword_5());
            		
            otherlv_7=(Token)match(input,25,FOLLOW_24); 

            			newLeafNode(otherlv_7, grammarAccess.getCompositeQuantumGateAccess().getLeftSquareBracketKeyword_6());
            		
            otherlv_8=(Token)match(input,16,FOLLOW_19); 

            			newLeafNode(otherlv_8, grammarAccess.getCompositeQuantumGateAccess().getLeftParenthesisKeyword_7());
            		
            // InternalQuCircuit.g:1428:3: ( (lv_targetQubits_9_0= ruleSelector ) )
            // InternalQuCircuit.g:1429:4: (lv_targetQubits_9_0= ruleSelector )
            {
            // InternalQuCircuit.g:1429:4: (lv_targetQubits_9_0= ruleSelector )
            // InternalQuCircuit.g:1430:5: lv_targetQubits_9_0= ruleSelector
            {

            					newCompositeNode(grammarAccess.getCompositeQuantumGateAccess().getTargetQubitsSelectorParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_11);
            lv_targetQubits_9_0=ruleSelector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositeQuantumGateRule());
            					}
            					add(
            						current,
            						"targetQubits",
            						lv_targetQubits_9_0,
            						"quantum.circuit.lang.QuCircuit.Selector");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,17,FOLLOW_20); 

            			newLeafNode(otherlv_10, grammarAccess.getCompositeQuantumGateAccess().getRightParenthesisKeyword_9());
            		
            // InternalQuCircuit.g:1451:3: (otherlv_11= ',' otherlv_12= '(' ( (lv_targetQubits_13_0= ruleSelector ) ) otherlv_14= ')' )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==21) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalQuCircuit.g:1452:4: otherlv_11= ',' otherlv_12= '(' ( (lv_targetQubits_13_0= ruleSelector ) ) otherlv_14= ')'
            	    {
            	    otherlv_11=(Token)match(input,21,FOLLOW_24); 

            	    				newLeafNode(otherlv_11, grammarAccess.getCompositeQuantumGateAccess().getCommaKeyword_10_0());
            	    			
            	    otherlv_12=(Token)match(input,16,FOLLOW_19); 

            	    				newLeafNode(otherlv_12, grammarAccess.getCompositeQuantumGateAccess().getLeftParenthesisKeyword_10_1());
            	    			
            	    // InternalQuCircuit.g:1460:4: ( (lv_targetQubits_13_0= ruleSelector ) )
            	    // InternalQuCircuit.g:1461:5: (lv_targetQubits_13_0= ruleSelector )
            	    {
            	    // InternalQuCircuit.g:1461:5: (lv_targetQubits_13_0= ruleSelector )
            	    // InternalQuCircuit.g:1462:6: lv_targetQubits_13_0= ruleSelector
            	    {

            	    						newCompositeNode(grammarAccess.getCompositeQuantumGateAccess().getTargetQubitsSelectorParserRuleCall_10_2_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_targetQubits_13_0=ruleSelector();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompositeQuantumGateRule());
            	    						}
            	    						add(
            	    							current,
            	    							"targetQubits",
            	    							lv_targetQubits_13_0,
            	    							"quantum.circuit.lang.QuCircuit.Selector");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_14=(Token)match(input,17,FOLLOW_20); 

            	    				newLeafNode(otherlv_14, grammarAccess.getCompositeQuantumGateAccess().getRightParenthesisKeyword_10_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            otherlv_15=(Token)match(input,26,FOLLOW_32); 

            			newLeafNode(otherlv_15, grammarAccess.getCompositeQuantumGateAccess().getRightSquareBracketKeyword_11());
            		
            // InternalQuCircuit.g:1488:3: (otherlv_16= 'controlQubits' otherlv_17= '[' ( (lv_controlQubits_18_0= ruleSelector ) ) (otherlv_19= ',' ( (lv_controlQubits_20_0= ruleSelector ) ) )* otherlv_21= ']' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==29) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalQuCircuit.g:1489:4: otherlv_16= 'controlQubits' otherlv_17= '[' ( (lv_controlQubits_18_0= ruleSelector ) ) (otherlv_19= ',' ( (lv_controlQubits_20_0= ruleSelector ) ) )* otherlv_21= ']'
                    {
                    otherlv_16=(Token)match(input,29,FOLLOW_18); 

                    				newLeafNode(otherlv_16, grammarAccess.getCompositeQuantumGateAccess().getControlQubitsKeyword_12_0());
                    			
                    otherlv_17=(Token)match(input,25,FOLLOW_19); 

                    				newLeafNode(otherlv_17, grammarAccess.getCompositeQuantumGateAccess().getLeftSquareBracketKeyword_12_1());
                    			
                    // InternalQuCircuit.g:1497:4: ( (lv_controlQubits_18_0= ruleSelector ) )
                    // InternalQuCircuit.g:1498:5: (lv_controlQubits_18_0= ruleSelector )
                    {
                    // InternalQuCircuit.g:1498:5: (lv_controlQubits_18_0= ruleSelector )
                    // InternalQuCircuit.g:1499:6: lv_controlQubits_18_0= ruleSelector
                    {

                    						newCompositeNode(grammarAccess.getCompositeQuantumGateAccess().getControlQubitsSelectorParserRuleCall_12_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_controlQubits_18_0=ruleSelector();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompositeQuantumGateRule());
                    						}
                    						add(
                    							current,
                    							"controlQubits",
                    							lv_controlQubits_18_0,
                    							"quantum.circuit.lang.QuCircuit.Selector");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQuCircuit.g:1516:4: (otherlv_19= ',' ( (lv_controlQubits_20_0= ruleSelector ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==21) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalQuCircuit.g:1517:5: otherlv_19= ',' ( (lv_controlQubits_20_0= ruleSelector ) )
                    	    {
                    	    otherlv_19=(Token)match(input,21,FOLLOW_19); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getCompositeQuantumGateAccess().getCommaKeyword_12_3_0());
                    	    				
                    	    // InternalQuCircuit.g:1521:5: ( (lv_controlQubits_20_0= ruleSelector ) )
                    	    // InternalQuCircuit.g:1522:6: (lv_controlQubits_20_0= ruleSelector )
                    	    {
                    	    // InternalQuCircuit.g:1522:6: (lv_controlQubits_20_0= ruleSelector )
                    	    // InternalQuCircuit.g:1523:7: lv_controlQubits_20_0= ruleSelector
                    	    {

                    	    							newCompositeNode(grammarAccess.getCompositeQuantumGateAccess().getControlQubitsSelectorParserRuleCall_12_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    lv_controlQubits_20_0=ruleSelector();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCompositeQuantumGateRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"controlQubits",
                    	    								lv_controlQubits_20_0,
                    	    								"quantum.circuit.lang.QuCircuit.Selector");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,26,FOLLOW_10); 

                    				newLeafNode(otherlv_21, grammarAccess.getCompositeQuantumGateAccess().getRightSquareBracketKeyword_12_4());
                    			

                    }
                    break;

            }

            otherlv_22=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getCompositeQuantumGateAccess().getRightCurlyBracketKeyword_13());
            		

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
    // $ANTLR end "ruleCompositeQuantumGate"


    // $ANTLR start "entryRuleLoop"
    // InternalQuCircuit.g:1554:1: entryRuleLoop returns [EObject current=null] : iv_ruleLoop= ruleLoop EOF ;
    public final EObject entryRuleLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoop = null;


        try {
            // InternalQuCircuit.g:1554:45: (iv_ruleLoop= ruleLoop EOF )
            // InternalQuCircuit.g:1555:2: iv_ruleLoop= ruleLoop EOF
            {
             newCompositeNode(grammarAccess.getLoopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoop=ruleLoop();

            state._fsp--;

             current =iv_ruleLoop; 
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
    // $ANTLR end "entryRuleLoop"


    // $ANTLR start "ruleLoop"
    // InternalQuCircuit.g:1561:1: ruleLoop returns [EObject current=null] : (otherlv_0= 'Loop' ( (lv_name_1_0= ruleEString ) )? otherlv_2= '{' ( (lv_inverseForm_3_0= 'inverseForm' ) )? ( (lv_incrementBlockTargetQubits_4_0= 'incrementBlockTargetQubits' ) )? ( (lv_incrementBlockControlQubits_5_0= 'incrementBlockControlQubits' ) )? (otherlv_6= 'iterations' ( (lv_iterations_7_0= RULE_INT ) ) )? ( (lv_incrementTargetQubits_8_0= 'incrementTargetQubits' ) )? ( (lv_incrementControlQubits_9_0= 'incrementControlQubits' ) )? (otherlv_10= 'targetQubitsBlockSize' ( (lv_targetQubitsBlockSize_11_0= RULE_INT ) ) )? (otherlv_12= 'controlQubitsBlockSize' ( (lv_controlQubitsBlockSize_13_0= RULE_INT ) ) )? (otherlv_14= 'controlQubitsIterationType' ( (lv_controlQubitsIterationType_15_0= ruleITERATION_TYPE ) ) )? (otherlv_16= 'targetQubitsIterationType' ( (lv_targetQubitsIterationType_17_0= ruleITERATION_TYPE ) ) )? (otherlv_18= 'incrementBy' ( (lv_incrementBy_19_0= RULE_INT ) ) )? (otherlv_20= 'operations' otherlv_21= '(' ( (lv_operations_22_0= ruleOperation ) ) (otherlv_23= ',' ( (lv_operations_24_0= ruleOperation ) ) )* otherlv_25= ')' )? otherlv_26= 'targetQubits' otherlv_27= '[' otherlv_28= '(' ( (lv_targetQubits_29_0= ruleSelector ) ) otherlv_30= ')' (otherlv_31= ',' otherlv_32= '(' ( (lv_targetQubits_33_0= ruleSelector ) ) otherlv_34= ')' )* otherlv_35= ']' (otherlv_36= 'controlQubits' otherlv_37= '[' ( (lv_controlQubits_38_0= ruleSelector ) ) (otherlv_39= ',' ( (lv_controlQubits_40_0= ruleSelector ) ) )* otherlv_41= ']' )? (otherlv_42= 'fixedControlQubits' otherlv_43= '[' ( (lv_fixedControlQubits_44_0= ruleSelector ) ) (otherlv_45= ',' ( (lv_fixedControlQubits_46_0= ruleSelector ) ) )* otherlv_47= ']' )? (otherlv_48= 'fixedTargetQubits' otherlv_49= '[' ( (lv_fixedTargetQubits_50_0= ruleSelector ) ) (otherlv_51= ',' ( (lv_fixedTargetQubits_52_0= ruleSelector ) ) )* otherlv_53= ']' )? otherlv_54= 'loop' ( ( ruleEString ) ) otherlv_56= 'loopTargetQubits' otherlv_57= '[' otherlv_58= '(' ( (lv_loopTargetQubits_59_0= ruleSelector ) ) otherlv_60= ')' (otherlv_61= ',' otherlv_62= '(' ( (lv_loopTargetQubits_63_0= ruleSelector ) ) otherlv_64= ')' )* otherlv_65= ']' (otherlv_66= 'loopControlQubits' otherlv_67= '[' otherlv_68= '(' ( (lv_loopControlQubits_69_0= ruleSelector ) ) otherlv_70= ')' (otherlv_71= ',' otherlv_72= '(' ( (lv_loopControlQubits_73_0= ruleSelector ) ) otherlv_74= ')' )* otherlv_75= ']' )? otherlv_76= '}' ) ;
    public final EObject ruleLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_inverseForm_3_0=null;
        Token lv_incrementBlockTargetQubits_4_0=null;
        Token lv_incrementBlockControlQubits_5_0=null;
        Token otherlv_6=null;
        Token lv_iterations_7_0=null;
        Token lv_incrementTargetQubits_8_0=null;
        Token lv_incrementControlQubits_9_0=null;
        Token otherlv_10=null;
        Token lv_targetQubitsBlockSize_11_0=null;
        Token otherlv_12=null;
        Token lv_controlQubitsBlockSize_13_0=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token lv_incrementBy_19_0=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token otherlv_39=null;
        Token otherlv_41=null;
        Token otherlv_42=null;
        Token otherlv_43=null;
        Token otherlv_45=null;
        Token otherlv_47=null;
        Token otherlv_48=null;
        Token otherlv_49=null;
        Token otherlv_51=null;
        Token otherlv_53=null;
        Token otherlv_54=null;
        Token otherlv_56=null;
        Token otherlv_57=null;
        Token otherlv_58=null;
        Token otherlv_60=null;
        Token otherlv_61=null;
        Token otherlv_62=null;
        Token otherlv_64=null;
        Token otherlv_65=null;
        Token otherlv_66=null;
        Token otherlv_67=null;
        Token otherlv_68=null;
        Token otherlv_70=null;
        Token otherlv_71=null;
        Token otherlv_72=null;
        Token otherlv_74=null;
        Token otherlv_75=null;
        Token otherlv_76=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_controlQubitsIterationType_15_0 = null;

        Enumerator lv_targetQubitsIterationType_17_0 = null;

        EObject lv_operations_22_0 = null;

        EObject lv_operations_24_0 = null;

        EObject lv_targetQubits_29_0 = null;

        EObject lv_targetQubits_33_0 = null;

        EObject lv_controlQubits_38_0 = null;

        EObject lv_controlQubits_40_0 = null;

        EObject lv_fixedControlQubits_44_0 = null;

        EObject lv_fixedControlQubits_46_0 = null;

        EObject lv_fixedTargetQubits_50_0 = null;

        EObject lv_fixedTargetQubits_52_0 = null;

        EObject lv_loopTargetQubits_59_0 = null;

        EObject lv_loopTargetQubits_63_0 = null;

        EObject lv_loopControlQubits_69_0 = null;

        EObject lv_loopControlQubits_73_0 = null;



        	enterRule();

        try {
            // InternalQuCircuit.g:1567:2: ( (otherlv_0= 'Loop' ( (lv_name_1_0= ruleEString ) )? otherlv_2= '{' ( (lv_inverseForm_3_0= 'inverseForm' ) )? ( (lv_incrementBlockTargetQubits_4_0= 'incrementBlockTargetQubits' ) )? ( (lv_incrementBlockControlQubits_5_0= 'incrementBlockControlQubits' ) )? (otherlv_6= 'iterations' ( (lv_iterations_7_0= RULE_INT ) ) )? ( (lv_incrementTargetQubits_8_0= 'incrementTargetQubits' ) )? ( (lv_incrementControlQubits_9_0= 'incrementControlQubits' ) )? (otherlv_10= 'targetQubitsBlockSize' ( (lv_targetQubitsBlockSize_11_0= RULE_INT ) ) )? (otherlv_12= 'controlQubitsBlockSize' ( (lv_controlQubitsBlockSize_13_0= RULE_INT ) ) )? (otherlv_14= 'controlQubitsIterationType' ( (lv_controlQubitsIterationType_15_0= ruleITERATION_TYPE ) ) )? (otherlv_16= 'targetQubitsIterationType' ( (lv_targetQubitsIterationType_17_0= ruleITERATION_TYPE ) ) )? (otherlv_18= 'incrementBy' ( (lv_incrementBy_19_0= RULE_INT ) ) )? (otherlv_20= 'operations' otherlv_21= '(' ( (lv_operations_22_0= ruleOperation ) ) (otherlv_23= ',' ( (lv_operations_24_0= ruleOperation ) ) )* otherlv_25= ')' )? otherlv_26= 'targetQubits' otherlv_27= '[' otherlv_28= '(' ( (lv_targetQubits_29_0= ruleSelector ) ) otherlv_30= ')' (otherlv_31= ',' otherlv_32= '(' ( (lv_targetQubits_33_0= ruleSelector ) ) otherlv_34= ')' )* otherlv_35= ']' (otherlv_36= 'controlQubits' otherlv_37= '[' ( (lv_controlQubits_38_0= ruleSelector ) ) (otherlv_39= ',' ( (lv_controlQubits_40_0= ruleSelector ) ) )* otherlv_41= ']' )? (otherlv_42= 'fixedControlQubits' otherlv_43= '[' ( (lv_fixedControlQubits_44_0= ruleSelector ) ) (otherlv_45= ',' ( (lv_fixedControlQubits_46_0= ruleSelector ) ) )* otherlv_47= ']' )? (otherlv_48= 'fixedTargetQubits' otherlv_49= '[' ( (lv_fixedTargetQubits_50_0= ruleSelector ) ) (otherlv_51= ',' ( (lv_fixedTargetQubits_52_0= ruleSelector ) ) )* otherlv_53= ']' )? otherlv_54= 'loop' ( ( ruleEString ) ) otherlv_56= 'loopTargetQubits' otherlv_57= '[' otherlv_58= '(' ( (lv_loopTargetQubits_59_0= ruleSelector ) ) otherlv_60= ')' (otherlv_61= ',' otherlv_62= '(' ( (lv_loopTargetQubits_63_0= ruleSelector ) ) otherlv_64= ')' )* otherlv_65= ']' (otherlv_66= 'loopControlQubits' otherlv_67= '[' otherlv_68= '(' ( (lv_loopControlQubits_69_0= ruleSelector ) ) otherlv_70= ')' (otherlv_71= ',' otherlv_72= '(' ( (lv_loopControlQubits_73_0= ruleSelector ) ) otherlv_74= ')' )* otherlv_75= ']' )? otherlv_76= '}' ) )
            // InternalQuCircuit.g:1568:2: (otherlv_0= 'Loop' ( (lv_name_1_0= ruleEString ) )? otherlv_2= '{' ( (lv_inverseForm_3_0= 'inverseForm' ) )? ( (lv_incrementBlockTargetQubits_4_0= 'incrementBlockTargetQubits' ) )? ( (lv_incrementBlockControlQubits_5_0= 'incrementBlockControlQubits' ) )? (otherlv_6= 'iterations' ( (lv_iterations_7_0= RULE_INT ) ) )? ( (lv_incrementTargetQubits_8_0= 'incrementTargetQubits' ) )? ( (lv_incrementControlQubits_9_0= 'incrementControlQubits' ) )? (otherlv_10= 'targetQubitsBlockSize' ( (lv_targetQubitsBlockSize_11_0= RULE_INT ) ) )? (otherlv_12= 'controlQubitsBlockSize' ( (lv_controlQubitsBlockSize_13_0= RULE_INT ) ) )? (otherlv_14= 'controlQubitsIterationType' ( (lv_controlQubitsIterationType_15_0= ruleITERATION_TYPE ) ) )? (otherlv_16= 'targetQubitsIterationType' ( (lv_targetQubitsIterationType_17_0= ruleITERATION_TYPE ) ) )? (otherlv_18= 'incrementBy' ( (lv_incrementBy_19_0= RULE_INT ) ) )? (otherlv_20= 'operations' otherlv_21= '(' ( (lv_operations_22_0= ruleOperation ) ) (otherlv_23= ',' ( (lv_operations_24_0= ruleOperation ) ) )* otherlv_25= ')' )? otherlv_26= 'targetQubits' otherlv_27= '[' otherlv_28= '(' ( (lv_targetQubits_29_0= ruleSelector ) ) otherlv_30= ')' (otherlv_31= ',' otherlv_32= '(' ( (lv_targetQubits_33_0= ruleSelector ) ) otherlv_34= ')' )* otherlv_35= ']' (otherlv_36= 'controlQubits' otherlv_37= '[' ( (lv_controlQubits_38_0= ruleSelector ) ) (otherlv_39= ',' ( (lv_controlQubits_40_0= ruleSelector ) ) )* otherlv_41= ']' )? (otherlv_42= 'fixedControlQubits' otherlv_43= '[' ( (lv_fixedControlQubits_44_0= ruleSelector ) ) (otherlv_45= ',' ( (lv_fixedControlQubits_46_0= ruleSelector ) ) )* otherlv_47= ']' )? (otherlv_48= 'fixedTargetQubits' otherlv_49= '[' ( (lv_fixedTargetQubits_50_0= ruleSelector ) ) (otherlv_51= ',' ( (lv_fixedTargetQubits_52_0= ruleSelector ) ) )* otherlv_53= ']' )? otherlv_54= 'loop' ( ( ruleEString ) ) otherlv_56= 'loopTargetQubits' otherlv_57= '[' otherlv_58= '(' ( (lv_loopTargetQubits_59_0= ruleSelector ) ) otherlv_60= ')' (otherlv_61= ',' otherlv_62= '(' ( (lv_loopTargetQubits_63_0= ruleSelector ) ) otherlv_64= ')' )* otherlv_65= ']' (otherlv_66= 'loopControlQubits' otherlv_67= '[' otherlv_68= '(' ( (lv_loopControlQubits_69_0= ruleSelector ) ) otherlv_70= ')' (otherlv_71= ',' otherlv_72= '(' ( (lv_loopControlQubits_73_0= ruleSelector ) ) otherlv_74= ')' )* otherlv_75= ']' )? otherlv_76= '}' )
            {
            // InternalQuCircuit.g:1568:2: (otherlv_0= 'Loop' ( (lv_name_1_0= ruleEString ) )? otherlv_2= '{' ( (lv_inverseForm_3_0= 'inverseForm' ) )? ( (lv_incrementBlockTargetQubits_4_0= 'incrementBlockTargetQubits' ) )? ( (lv_incrementBlockControlQubits_5_0= 'incrementBlockControlQubits' ) )? (otherlv_6= 'iterations' ( (lv_iterations_7_0= RULE_INT ) ) )? ( (lv_incrementTargetQubits_8_0= 'incrementTargetQubits' ) )? ( (lv_incrementControlQubits_9_0= 'incrementControlQubits' ) )? (otherlv_10= 'targetQubitsBlockSize' ( (lv_targetQubitsBlockSize_11_0= RULE_INT ) ) )? (otherlv_12= 'controlQubitsBlockSize' ( (lv_controlQubitsBlockSize_13_0= RULE_INT ) ) )? (otherlv_14= 'controlQubitsIterationType' ( (lv_controlQubitsIterationType_15_0= ruleITERATION_TYPE ) ) )? (otherlv_16= 'targetQubitsIterationType' ( (lv_targetQubitsIterationType_17_0= ruleITERATION_TYPE ) ) )? (otherlv_18= 'incrementBy' ( (lv_incrementBy_19_0= RULE_INT ) ) )? (otherlv_20= 'operations' otherlv_21= '(' ( (lv_operations_22_0= ruleOperation ) ) (otherlv_23= ',' ( (lv_operations_24_0= ruleOperation ) ) )* otherlv_25= ')' )? otherlv_26= 'targetQubits' otherlv_27= '[' otherlv_28= '(' ( (lv_targetQubits_29_0= ruleSelector ) ) otherlv_30= ')' (otherlv_31= ',' otherlv_32= '(' ( (lv_targetQubits_33_0= ruleSelector ) ) otherlv_34= ')' )* otherlv_35= ']' (otherlv_36= 'controlQubits' otherlv_37= '[' ( (lv_controlQubits_38_0= ruleSelector ) ) (otherlv_39= ',' ( (lv_controlQubits_40_0= ruleSelector ) ) )* otherlv_41= ']' )? (otherlv_42= 'fixedControlQubits' otherlv_43= '[' ( (lv_fixedControlQubits_44_0= ruleSelector ) ) (otherlv_45= ',' ( (lv_fixedControlQubits_46_0= ruleSelector ) ) )* otherlv_47= ']' )? (otherlv_48= 'fixedTargetQubits' otherlv_49= '[' ( (lv_fixedTargetQubits_50_0= ruleSelector ) ) (otherlv_51= ',' ( (lv_fixedTargetQubits_52_0= ruleSelector ) ) )* otherlv_53= ']' )? otherlv_54= 'loop' ( ( ruleEString ) ) otherlv_56= 'loopTargetQubits' otherlv_57= '[' otherlv_58= '(' ( (lv_loopTargetQubits_59_0= ruleSelector ) ) otherlv_60= ')' (otherlv_61= ',' otherlv_62= '(' ( (lv_loopTargetQubits_63_0= ruleSelector ) ) otherlv_64= ')' )* otherlv_65= ']' (otherlv_66= 'loopControlQubits' otherlv_67= '[' otherlv_68= '(' ( (lv_loopControlQubits_69_0= ruleSelector ) ) otherlv_70= ')' (otherlv_71= ',' otherlv_72= '(' ( (lv_loopControlQubits_73_0= ruleSelector ) ) otherlv_74= ')' )* otherlv_75= ']' )? otherlv_76= '}' )
            // InternalQuCircuit.g:1569:3: otherlv_0= 'Loop' ( (lv_name_1_0= ruleEString ) )? otherlv_2= '{' ( (lv_inverseForm_3_0= 'inverseForm' ) )? ( (lv_incrementBlockTargetQubits_4_0= 'incrementBlockTargetQubits' ) )? ( (lv_incrementBlockControlQubits_5_0= 'incrementBlockControlQubits' ) )? (otherlv_6= 'iterations' ( (lv_iterations_7_0= RULE_INT ) ) )? ( (lv_incrementTargetQubits_8_0= 'incrementTargetQubits' ) )? ( (lv_incrementControlQubits_9_0= 'incrementControlQubits' ) )? (otherlv_10= 'targetQubitsBlockSize' ( (lv_targetQubitsBlockSize_11_0= RULE_INT ) ) )? (otherlv_12= 'controlQubitsBlockSize' ( (lv_controlQubitsBlockSize_13_0= RULE_INT ) ) )? (otherlv_14= 'controlQubitsIterationType' ( (lv_controlQubitsIterationType_15_0= ruleITERATION_TYPE ) ) )? (otherlv_16= 'targetQubitsIterationType' ( (lv_targetQubitsIterationType_17_0= ruleITERATION_TYPE ) ) )? (otherlv_18= 'incrementBy' ( (lv_incrementBy_19_0= RULE_INT ) ) )? (otherlv_20= 'operations' otherlv_21= '(' ( (lv_operations_22_0= ruleOperation ) ) (otherlv_23= ',' ( (lv_operations_24_0= ruleOperation ) ) )* otherlv_25= ')' )? otherlv_26= 'targetQubits' otherlv_27= '[' otherlv_28= '(' ( (lv_targetQubits_29_0= ruleSelector ) ) otherlv_30= ')' (otherlv_31= ',' otherlv_32= '(' ( (lv_targetQubits_33_0= ruleSelector ) ) otherlv_34= ')' )* otherlv_35= ']' (otherlv_36= 'controlQubits' otherlv_37= '[' ( (lv_controlQubits_38_0= ruleSelector ) ) (otherlv_39= ',' ( (lv_controlQubits_40_0= ruleSelector ) ) )* otherlv_41= ']' )? (otherlv_42= 'fixedControlQubits' otherlv_43= '[' ( (lv_fixedControlQubits_44_0= ruleSelector ) ) (otherlv_45= ',' ( (lv_fixedControlQubits_46_0= ruleSelector ) ) )* otherlv_47= ']' )? (otherlv_48= 'fixedTargetQubits' otherlv_49= '[' ( (lv_fixedTargetQubits_50_0= ruleSelector ) ) (otherlv_51= ',' ( (lv_fixedTargetQubits_52_0= ruleSelector ) ) )* otherlv_53= ']' )? otherlv_54= 'loop' ( ( ruleEString ) ) otherlv_56= 'loopTargetQubits' otherlv_57= '[' otherlv_58= '(' ( (lv_loopTargetQubits_59_0= ruleSelector ) ) otherlv_60= ')' (otherlv_61= ',' otherlv_62= '(' ( (lv_loopTargetQubits_63_0= ruleSelector ) ) otherlv_64= ')' )* otherlv_65= ']' (otherlv_66= 'loopControlQubits' otherlv_67= '[' otherlv_68= '(' ( (lv_loopControlQubits_69_0= ruleSelector ) ) otherlv_70= ')' (otherlv_71= ',' otherlv_72= '(' ( (lv_loopControlQubits_73_0= ruleSelector ) ) otherlv_74= ')' )* otherlv_75= ']' )? otherlv_76= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getLoopAccess().getLoopKeyword_0());
            		
            // InternalQuCircuit.g:1573:3: ( (lv_name_1_0= ruleEString ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=RULE_STRING && LA32_0<=RULE_ID)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalQuCircuit.g:1574:4: (lv_name_1_0= ruleEString )
                    {
                    // InternalQuCircuit.g:1574:4: (lv_name_1_0= ruleEString )
                    // InternalQuCircuit.g:1575:5: lv_name_1_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getLoopAccess().getNameEStringParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_5);
                    lv_name_1_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLoopRule());
                    					}
                    					set(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"quantum.circuit.lang.QuCircuit.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,12,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getLoopAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalQuCircuit.g:1596:3: ( (lv_inverseForm_3_0= 'inverseForm' ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==28) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalQuCircuit.g:1597:4: (lv_inverseForm_3_0= 'inverseForm' )
                    {
                    // InternalQuCircuit.g:1597:4: (lv_inverseForm_3_0= 'inverseForm' )
                    // InternalQuCircuit.g:1598:5: lv_inverseForm_3_0= 'inverseForm'
                    {
                    lv_inverseForm_3_0=(Token)match(input,28,FOLLOW_34); 

                    					newLeafNode(lv_inverseForm_3_0, grammarAccess.getLoopAccess().getInverseFormInverseFormKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLoopRule());
                    					}
                    					setWithLastConsumed(current, "inverseForm", lv_inverseForm_3_0 != null, "inverseForm");
                    				

                    }


                    }
                    break;

            }

            // InternalQuCircuit.g:1610:3: ( (lv_incrementBlockTargetQubits_4_0= 'incrementBlockTargetQubits' ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==38) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalQuCircuit.g:1611:4: (lv_incrementBlockTargetQubits_4_0= 'incrementBlockTargetQubits' )
                    {
                    // InternalQuCircuit.g:1611:4: (lv_incrementBlockTargetQubits_4_0= 'incrementBlockTargetQubits' )
                    // InternalQuCircuit.g:1612:5: lv_incrementBlockTargetQubits_4_0= 'incrementBlockTargetQubits'
                    {
                    lv_incrementBlockTargetQubits_4_0=(Token)match(input,38,FOLLOW_35); 

                    					newLeafNode(lv_incrementBlockTargetQubits_4_0, grammarAccess.getLoopAccess().getIncrementBlockTargetQubitsIncrementBlockTargetQubitsKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLoopRule());
                    					}
                    					setWithLastConsumed(current, "incrementBlockTargetQubits", lv_incrementBlockTargetQubits_4_0 != null, "incrementBlockTargetQubits");
                    				

                    }


                    }
                    break;

            }

            // InternalQuCircuit.g:1624:3: ( (lv_incrementBlockControlQubits_5_0= 'incrementBlockControlQubits' ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==39) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalQuCircuit.g:1625:4: (lv_incrementBlockControlQubits_5_0= 'incrementBlockControlQubits' )
                    {
                    // InternalQuCircuit.g:1625:4: (lv_incrementBlockControlQubits_5_0= 'incrementBlockControlQubits' )
                    // InternalQuCircuit.g:1626:5: lv_incrementBlockControlQubits_5_0= 'incrementBlockControlQubits'
                    {
                    lv_incrementBlockControlQubits_5_0=(Token)match(input,39,FOLLOW_36); 

                    					newLeafNode(lv_incrementBlockControlQubits_5_0, grammarAccess.getLoopAccess().getIncrementBlockControlQubitsIncrementBlockControlQubitsKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLoopRule());
                    					}
                    					setWithLastConsumed(current, "incrementBlockControlQubits", lv_incrementBlockControlQubits_5_0 != null, "incrementBlockControlQubits");
                    				

                    }


                    }
                    break;

            }

            // InternalQuCircuit.g:1638:3: (otherlv_6= 'iterations' ( (lv_iterations_7_0= RULE_INT ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==40) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalQuCircuit.g:1639:4: otherlv_6= 'iterations' ( (lv_iterations_7_0= RULE_INT ) )
                    {
                    otherlv_6=(Token)match(input,40,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getLoopAccess().getIterationsKeyword_6_0());
                    			
                    // InternalQuCircuit.g:1643:4: ( (lv_iterations_7_0= RULE_INT ) )
                    // InternalQuCircuit.g:1644:5: (lv_iterations_7_0= RULE_INT )
                    {
                    // InternalQuCircuit.g:1644:5: (lv_iterations_7_0= RULE_INT )
                    // InternalQuCircuit.g:1645:6: lv_iterations_7_0= RULE_INT
                    {
                    lv_iterations_7_0=(Token)match(input,RULE_INT,FOLLOW_37); 

                    						newLeafNode(lv_iterations_7_0, grammarAccess.getLoopAccess().getIterationsINTTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLoopRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"iterations",
                    							lv_iterations_7_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQuCircuit.g:1662:3: ( (lv_incrementTargetQubits_8_0= 'incrementTargetQubits' ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==41) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalQuCircuit.g:1663:4: (lv_incrementTargetQubits_8_0= 'incrementTargetQubits' )
                    {
                    // InternalQuCircuit.g:1663:4: (lv_incrementTargetQubits_8_0= 'incrementTargetQubits' )
                    // InternalQuCircuit.g:1664:5: lv_incrementTargetQubits_8_0= 'incrementTargetQubits'
                    {
                    lv_incrementTargetQubits_8_0=(Token)match(input,41,FOLLOW_38); 

                    					newLeafNode(lv_incrementTargetQubits_8_0, grammarAccess.getLoopAccess().getIncrementTargetQubitsIncrementTargetQubitsKeyword_7_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLoopRule());
                    					}
                    					setWithLastConsumed(current, "incrementTargetQubits", lv_incrementTargetQubits_8_0 != null, "incrementTargetQubits");
                    				

                    }


                    }
                    break;

            }

            // InternalQuCircuit.g:1676:3: ( (lv_incrementControlQubits_9_0= 'incrementControlQubits' ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==42) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalQuCircuit.g:1677:4: (lv_incrementControlQubits_9_0= 'incrementControlQubits' )
                    {
                    // InternalQuCircuit.g:1677:4: (lv_incrementControlQubits_9_0= 'incrementControlQubits' )
                    // InternalQuCircuit.g:1678:5: lv_incrementControlQubits_9_0= 'incrementControlQubits'
                    {
                    lv_incrementControlQubits_9_0=(Token)match(input,42,FOLLOW_39); 

                    					newLeafNode(lv_incrementControlQubits_9_0, grammarAccess.getLoopAccess().getIncrementControlQubitsIncrementControlQubitsKeyword_8_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLoopRule());
                    					}
                    					setWithLastConsumed(current, "incrementControlQubits", lv_incrementControlQubits_9_0 != null, "incrementControlQubits");
                    				

                    }


                    }
                    break;

            }

            // InternalQuCircuit.g:1690:3: (otherlv_10= 'targetQubitsBlockSize' ( (lv_targetQubitsBlockSize_11_0= RULE_INT ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==43) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalQuCircuit.g:1691:4: otherlv_10= 'targetQubitsBlockSize' ( (lv_targetQubitsBlockSize_11_0= RULE_INT ) )
                    {
                    otherlv_10=(Token)match(input,43,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getLoopAccess().getTargetQubitsBlockSizeKeyword_9_0());
                    			
                    // InternalQuCircuit.g:1695:4: ( (lv_targetQubitsBlockSize_11_0= RULE_INT ) )
                    // InternalQuCircuit.g:1696:5: (lv_targetQubitsBlockSize_11_0= RULE_INT )
                    {
                    // InternalQuCircuit.g:1696:5: (lv_targetQubitsBlockSize_11_0= RULE_INT )
                    // InternalQuCircuit.g:1697:6: lv_targetQubitsBlockSize_11_0= RULE_INT
                    {
                    lv_targetQubitsBlockSize_11_0=(Token)match(input,RULE_INT,FOLLOW_40); 

                    						newLeafNode(lv_targetQubitsBlockSize_11_0, grammarAccess.getLoopAccess().getTargetQubitsBlockSizeINTTerminalRuleCall_9_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLoopRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"targetQubitsBlockSize",
                    							lv_targetQubitsBlockSize_11_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQuCircuit.g:1714:3: (otherlv_12= 'controlQubitsBlockSize' ( (lv_controlQubitsBlockSize_13_0= RULE_INT ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==44) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalQuCircuit.g:1715:4: otherlv_12= 'controlQubitsBlockSize' ( (lv_controlQubitsBlockSize_13_0= RULE_INT ) )
                    {
                    otherlv_12=(Token)match(input,44,FOLLOW_9); 

                    				newLeafNode(otherlv_12, grammarAccess.getLoopAccess().getControlQubitsBlockSizeKeyword_10_0());
                    			
                    // InternalQuCircuit.g:1719:4: ( (lv_controlQubitsBlockSize_13_0= RULE_INT ) )
                    // InternalQuCircuit.g:1720:5: (lv_controlQubitsBlockSize_13_0= RULE_INT )
                    {
                    // InternalQuCircuit.g:1720:5: (lv_controlQubitsBlockSize_13_0= RULE_INT )
                    // InternalQuCircuit.g:1721:6: lv_controlQubitsBlockSize_13_0= RULE_INT
                    {
                    lv_controlQubitsBlockSize_13_0=(Token)match(input,RULE_INT,FOLLOW_41); 

                    						newLeafNode(lv_controlQubitsBlockSize_13_0, grammarAccess.getLoopAccess().getControlQubitsBlockSizeINTTerminalRuleCall_10_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLoopRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"controlQubitsBlockSize",
                    							lv_controlQubitsBlockSize_13_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQuCircuit.g:1738:3: (otherlv_14= 'controlQubitsIterationType' ( (lv_controlQubitsIterationType_15_0= ruleITERATION_TYPE ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==45) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalQuCircuit.g:1739:4: otherlv_14= 'controlQubitsIterationType' ( (lv_controlQubitsIterationType_15_0= ruleITERATION_TYPE ) )
                    {
                    otherlv_14=(Token)match(input,45,FOLLOW_42); 

                    				newLeafNode(otherlv_14, grammarAccess.getLoopAccess().getControlQubitsIterationTypeKeyword_11_0());
                    			
                    // InternalQuCircuit.g:1743:4: ( (lv_controlQubitsIterationType_15_0= ruleITERATION_TYPE ) )
                    // InternalQuCircuit.g:1744:5: (lv_controlQubitsIterationType_15_0= ruleITERATION_TYPE )
                    {
                    // InternalQuCircuit.g:1744:5: (lv_controlQubitsIterationType_15_0= ruleITERATION_TYPE )
                    // InternalQuCircuit.g:1745:6: lv_controlQubitsIterationType_15_0= ruleITERATION_TYPE
                    {

                    						newCompositeNode(grammarAccess.getLoopAccess().getControlQubitsIterationTypeITERATION_TYPEEnumRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_43);
                    lv_controlQubitsIterationType_15_0=ruleITERATION_TYPE();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLoopRule());
                    						}
                    						set(
                    							current,
                    							"controlQubitsIterationType",
                    							lv_controlQubitsIterationType_15_0,
                    							"quantum.circuit.lang.QuCircuit.ITERATION_TYPE");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQuCircuit.g:1763:3: (otherlv_16= 'targetQubitsIterationType' ( (lv_targetQubitsIterationType_17_0= ruleITERATION_TYPE ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==46) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalQuCircuit.g:1764:4: otherlv_16= 'targetQubitsIterationType' ( (lv_targetQubitsIterationType_17_0= ruleITERATION_TYPE ) )
                    {
                    otherlv_16=(Token)match(input,46,FOLLOW_42); 

                    				newLeafNode(otherlv_16, grammarAccess.getLoopAccess().getTargetQubitsIterationTypeKeyword_12_0());
                    			
                    // InternalQuCircuit.g:1768:4: ( (lv_targetQubitsIterationType_17_0= ruleITERATION_TYPE ) )
                    // InternalQuCircuit.g:1769:5: (lv_targetQubitsIterationType_17_0= ruleITERATION_TYPE )
                    {
                    // InternalQuCircuit.g:1769:5: (lv_targetQubitsIterationType_17_0= ruleITERATION_TYPE )
                    // InternalQuCircuit.g:1770:6: lv_targetQubitsIterationType_17_0= ruleITERATION_TYPE
                    {

                    						newCompositeNode(grammarAccess.getLoopAccess().getTargetQubitsIterationTypeITERATION_TYPEEnumRuleCall_12_1_0());
                    					
                    pushFollow(FOLLOW_44);
                    lv_targetQubitsIterationType_17_0=ruleITERATION_TYPE();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLoopRule());
                    						}
                    						set(
                    							current,
                    							"targetQubitsIterationType",
                    							lv_targetQubitsIterationType_17_0,
                    							"quantum.circuit.lang.QuCircuit.ITERATION_TYPE");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQuCircuit.g:1788:3: (otherlv_18= 'incrementBy' ( (lv_incrementBy_19_0= RULE_INT ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==47) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalQuCircuit.g:1789:4: otherlv_18= 'incrementBy' ( (lv_incrementBy_19_0= RULE_INT ) )
                    {
                    otherlv_18=(Token)match(input,47,FOLLOW_9); 

                    				newLeafNode(otherlv_18, grammarAccess.getLoopAccess().getIncrementByKeyword_13_0());
                    			
                    // InternalQuCircuit.g:1793:4: ( (lv_incrementBy_19_0= RULE_INT ) )
                    // InternalQuCircuit.g:1794:5: (lv_incrementBy_19_0= RULE_INT )
                    {
                    // InternalQuCircuit.g:1794:5: (lv_incrementBy_19_0= RULE_INT )
                    // InternalQuCircuit.g:1795:6: lv_incrementBy_19_0= RULE_INT
                    {
                    lv_incrementBy_19_0=(Token)match(input,RULE_INT,FOLLOW_45); 

                    						newLeafNode(lv_incrementBy_19_0, grammarAccess.getLoopAccess().getIncrementByINTTerminalRuleCall_13_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLoopRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"incrementBy",
                    							lv_incrementBy_19_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalQuCircuit.g:1812:3: (otherlv_20= 'operations' otherlv_21= '(' ( (lv_operations_22_0= ruleOperation ) ) (otherlv_23= ',' ( (lv_operations_24_0= ruleOperation ) ) )* otherlv_25= ')' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==48) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalQuCircuit.g:1813:4: otherlv_20= 'operations' otherlv_21= '(' ( (lv_operations_22_0= ruleOperation ) ) (otherlv_23= ',' ( (lv_operations_24_0= ruleOperation ) ) )* otherlv_25= ')'
                    {
                    otherlv_20=(Token)match(input,48,FOLLOW_24); 

                    				newLeafNode(otherlv_20, grammarAccess.getLoopAccess().getOperationsKeyword_14_0());
                    			
                    otherlv_21=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_21, grammarAccess.getLoopAccess().getLeftParenthesisKeyword_14_1());
                    			
                    // InternalQuCircuit.g:1821:4: ( (lv_operations_22_0= ruleOperation ) )
                    // InternalQuCircuit.g:1822:5: (lv_operations_22_0= ruleOperation )
                    {
                    // InternalQuCircuit.g:1822:5: (lv_operations_22_0= ruleOperation )
                    // InternalQuCircuit.g:1823:6: lv_operations_22_0= ruleOperation
                    {

                    						newCompositeNode(grammarAccess.getLoopAccess().getOperationsOperationParserRuleCall_14_2_0());
                    					
                    pushFollow(FOLLOW_46);
                    lv_operations_22_0=ruleOperation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLoopRule());
                    						}
                    						add(
                    							current,
                    							"operations",
                    							lv_operations_22_0,
                    							"quantum.circuit.lang.QuCircuit.Operation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQuCircuit.g:1840:4: (otherlv_23= ',' ( (lv_operations_24_0= ruleOperation ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==21) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // InternalQuCircuit.g:1841:5: otherlv_23= ',' ( (lv_operations_24_0= ruleOperation ) )
                    	    {
                    	    otherlv_23=(Token)match(input,21,FOLLOW_3); 

                    	    					newLeafNode(otherlv_23, grammarAccess.getLoopAccess().getCommaKeyword_14_3_0());
                    	    				
                    	    // InternalQuCircuit.g:1845:5: ( (lv_operations_24_0= ruleOperation ) )
                    	    // InternalQuCircuit.g:1846:6: (lv_operations_24_0= ruleOperation )
                    	    {
                    	    // InternalQuCircuit.g:1846:6: (lv_operations_24_0= ruleOperation )
                    	    // InternalQuCircuit.g:1847:7: lv_operations_24_0= ruleOperation
                    	    {

                    	    							newCompositeNode(grammarAccess.getLoopAccess().getOperationsOperationParserRuleCall_14_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_46);
                    	    lv_operations_24_0=ruleOperation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getLoopRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"operations",
                    	    								lv_operations_24_0,
                    	    								"quantum.circuit.lang.QuCircuit.Operation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);

                    otherlv_25=(Token)match(input,17,FOLLOW_23); 

                    				newLeafNode(otherlv_25, grammarAccess.getLoopAccess().getRightParenthesisKeyword_14_4());
                    			

                    }
                    break;

            }

            otherlv_26=(Token)match(input,24,FOLLOW_18); 

            			newLeafNode(otherlv_26, grammarAccess.getLoopAccess().getTargetQubitsKeyword_15());
            		
            otherlv_27=(Token)match(input,25,FOLLOW_24); 

            			newLeafNode(otherlv_27, grammarAccess.getLoopAccess().getLeftSquareBracketKeyword_16());
            		
            otherlv_28=(Token)match(input,16,FOLLOW_19); 

            			newLeafNode(otherlv_28, grammarAccess.getLoopAccess().getLeftParenthesisKeyword_17());
            		
            // InternalQuCircuit.g:1882:3: ( (lv_targetQubits_29_0= ruleSelector ) )
            // InternalQuCircuit.g:1883:4: (lv_targetQubits_29_0= ruleSelector )
            {
            // InternalQuCircuit.g:1883:4: (lv_targetQubits_29_0= ruleSelector )
            // InternalQuCircuit.g:1884:5: lv_targetQubits_29_0= ruleSelector
            {

            					newCompositeNode(grammarAccess.getLoopAccess().getTargetQubitsSelectorParserRuleCall_18_0());
            				
            pushFollow(FOLLOW_11);
            lv_targetQubits_29_0=ruleSelector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLoopRule());
            					}
            					add(
            						current,
            						"targetQubits",
            						lv_targetQubits_29_0,
            						"quantum.circuit.lang.QuCircuit.Selector");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_30=(Token)match(input,17,FOLLOW_20); 

            			newLeafNode(otherlv_30, grammarAccess.getLoopAccess().getRightParenthesisKeyword_19());
            		
            // InternalQuCircuit.g:1905:3: (otherlv_31= ',' otherlv_32= '(' ( (lv_targetQubits_33_0= ruleSelector ) ) otherlv_34= ')' )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==21) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalQuCircuit.g:1906:4: otherlv_31= ',' otherlv_32= '(' ( (lv_targetQubits_33_0= ruleSelector ) ) otherlv_34= ')'
            	    {
            	    otherlv_31=(Token)match(input,21,FOLLOW_24); 

            	    				newLeafNode(otherlv_31, grammarAccess.getLoopAccess().getCommaKeyword_20_0());
            	    			
            	    otherlv_32=(Token)match(input,16,FOLLOW_19); 

            	    				newLeafNode(otherlv_32, grammarAccess.getLoopAccess().getLeftParenthesisKeyword_20_1());
            	    			
            	    // InternalQuCircuit.g:1914:4: ( (lv_targetQubits_33_0= ruleSelector ) )
            	    // InternalQuCircuit.g:1915:5: (lv_targetQubits_33_0= ruleSelector )
            	    {
            	    // InternalQuCircuit.g:1915:5: (lv_targetQubits_33_0= ruleSelector )
            	    // InternalQuCircuit.g:1916:6: lv_targetQubits_33_0= ruleSelector
            	    {

            	    						newCompositeNode(grammarAccess.getLoopAccess().getTargetQubitsSelectorParserRuleCall_20_2_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_targetQubits_33_0=ruleSelector();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLoopRule());
            	    						}
            	    						add(
            	    							current,
            	    							"targetQubits",
            	    							lv_targetQubits_33_0,
            	    							"quantum.circuit.lang.QuCircuit.Selector");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_34=(Token)match(input,17,FOLLOW_20); 

            	    				newLeafNode(otherlv_34, grammarAccess.getLoopAccess().getRightParenthesisKeyword_20_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            otherlv_35=(Token)match(input,26,FOLLOW_47); 

            			newLeafNode(otherlv_35, grammarAccess.getLoopAccess().getRightSquareBracketKeyword_21());
            		
            // InternalQuCircuit.g:1942:3: (otherlv_36= 'controlQubits' otherlv_37= '[' ( (lv_controlQubits_38_0= ruleSelector ) ) (otherlv_39= ',' ( (lv_controlQubits_40_0= ruleSelector ) ) )* otherlv_41= ']' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==29) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalQuCircuit.g:1943:4: otherlv_36= 'controlQubits' otherlv_37= '[' ( (lv_controlQubits_38_0= ruleSelector ) ) (otherlv_39= ',' ( (lv_controlQubits_40_0= ruleSelector ) ) )* otherlv_41= ']'
                    {
                    otherlv_36=(Token)match(input,29,FOLLOW_18); 

                    				newLeafNode(otherlv_36, grammarAccess.getLoopAccess().getControlQubitsKeyword_22_0());
                    			
                    otherlv_37=(Token)match(input,25,FOLLOW_19); 

                    				newLeafNode(otherlv_37, grammarAccess.getLoopAccess().getLeftSquareBracketKeyword_22_1());
                    			
                    // InternalQuCircuit.g:1951:4: ( (lv_controlQubits_38_0= ruleSelector ) )
                    // InternalQuCircuit.g:1952:5: (lv_controlQubits_38_0= ruleSelector )
                    {
                    // InternalQuCircuit.g:1952:5: (lv_controlQubits_38_0= ruleSelector )
                    // InternalQuCircuit.g:1953:6: lv_controlQubits_38_0= ruleSelector
                    {

                    						newCompositeNode(grammarAccess.getLoopAccess().getControlQubitsSelectorParserRuleCall_22_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_controlQubits_38_0=ruleSelector();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLoopRule());
                    						}
                    						add(
                    							current,
                    							"controlQubits",
                    							lv_controlQubits_38_0,
                    							"quantum.circuit.lang.QuCircuit.Selector");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQuCircuit.g:1970:4: (otherlv_39= ',' ( (lv_controlQubits_40_0= ruleSelector ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==21) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // InternalQuCircuit.g:1971:5: otherlv_39= ',' ( (lv_controlQubits_40_0= ruleSelector ) )
                    	    {
                    	    otherlv_39=(Token)match(input,21,FOLLOW_19); 

                    	    					newLeafNode(otherlv_39, grammarAccess.getLoopAccess().getCommaKeyword_22_3_0());
                    	    				
                    	    // InternalQuCircuit.g:1975:5: ( (lv_controlQubits_40_0= ruleSelector ) )
                    	    // InternalQuCircuit.g:1976:6: (lv_controlQubits_40_0= ruleSelector )
                    	    {
                    	    // InternalQuCircuit.g:1976:6: (lv_controlQubits_40_0= ruleSelector )
                    	    // InternalQuCircuit.g:1977:7: lv_controlQubits_40_0= ruleSelector
                    	    {

                    	    							newCompositeNode(grammarAccess.getLoopAccess().getControlQubitsSelectorParserRuleCall_22_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    lv_controlQubits_40_0=ruleSelector();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getLoopRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"controlQubits",
                    	    								lv_controlQubits_40_0,
                    	    								"quantum.circuit.lang.QuCircuit.Selector");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);

                    otherlv_41=(Token)match(input,26,FOLLOW_48); 

                    				newLeafNode(otherlv_41, grammarAccess.getLoopAccess().getRightSquareBracketKeyword_22_4());
                    			

                    }
                    break;

            }

            // InternalQuCircuit.g:2000:3: (otherlv_42= 'fixedControlQubits' otherlv_43= '[' ( (lv_fixedControlQubits_44_0= ruleSelector ) ) (otherlv_45= ',' ( (lv_fixedControlQubits_46_0= ruleSelector ) ) )* otherlv_47= ']' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==49) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalQuCircuit.g:2001:4: otherlv_42= 'fixedControlQubits' otherlv_43= '[' ( (lv_fixedControlQubits_44_0= ruleSelector ) ) (otherlv_45= ',' ( (lv_fixedControlQubits_46_0= ruleSelector ) ) )* otherlv_47= ']'
                    {
                    otherlv_42=(Token)match(input,49,FOLLOW_18); 

                    				newLeafNode(otherlv_42, grammarAccess.getLoopAccess().getFixedControlQubitsKeyword_23_0());
                    			
                    otherlv_43=(Token)match(input,25,FOLLOW_19); 

                    				newLeafNode(otherlv_43, grammarAccess.getLoopAccess().getLeftSquareBracketKeyword_23_1());
                    			
                    // InternalQuCircuit.g:2009:4: ( (lv_fixedControlQubits_44_0= ruleSelector ) )
                    // InternalQuCircuit.g:2010:5: (lv_fixedControlQubits_44_0= ruleSelector )
                    {
                    // InternalQuCircuit.g:2010:5: (lv_fixedControlQubits_44_0= ruleSelector )
                    // InternalQuCircuit.g:2011:6: lv_fixedControlQubits_44_0= ruleSelector
                    {

                    						newCompositeNode(grammarAccess.getLoopAccess().getFixedControlQubitsSelectorParserRuleCall_23_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_fixedControlQubits_44_0=ruleSelector();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLoopRule());
                    						}
                    						add(
                    							current,
                    							"fixedControlQubits",
                    							lv_fixedControlQubits_44_0,
                    							"quantum.circuit.lang.QuCircuit.Selector");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQuCircuit.g:2028:4: (otherlv_45= ',' ( (lv_fixedControlQubits_46_0= ruleSelector ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==21) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // InternalQuCircuit.g:2029:5: otherlv_45= ',' ( (lv_fixedControlQubits_46_0= ruleSelector ) )
                    	    {
                    	    otherlv_45=(Token)match(input,21,FOLLOW_19); 

                    	    					newLeafNode(otherlv_45, grammarAccess.getLoopAccess().getCommaKeyword_23_3_0());
                    	    				
                    	    // InternalQuCircuit.g:2033:5: ( (lv_fixedControlQubits_46_0= ruleSelector ) )
                    	    // InternalQuCircuit.g:2034:6: (lv_fixedControlQubits_46_0= ruleSelector )
                    	    {
                    	    // InternalQuCircuit.g:2034:6: (lv_fixedControlQubits_46_0= ruleSelector )
                    	    // InternalQuCircuit.g:2035:7: lv_fixedControlQubits_46_0= ruleSelector
                    	    {

                    	    							newCompositeNode(grammarAccess.getLoopAccess().getFixedControlQubitsSelectorParserRuleCall_23_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    lv_fixedControlQubits_46_0=ruleSelector();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getLoopRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"fixedControlQubits",
                    	    								lv_fixedControlQubits_46_0,
                    	    								"quantum.circuit.lang.QuCircuit.Selector");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);

                    otherlv_47=(Token)match(input,26,FOLLOW_49); 

                    				newLeafNode(otherlv_47, grammarAccess.getLoopAccess().getRightSquareBracketKeyword_23_4());
                    			

                    }
                    break;

            }

            // InternalQuCircuit.g:2058:3: (otherlv_48= 'fixedTargetQubits' otherlv_49= '[' ( (lv_fixedTargetQubits_50_0= ruleSelector ) ) (otherlv_51= ',' ( (lv_fixedTargetQubits_52_0= ruleSelector ) ) )* otherlv_53= ']' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==50) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalQuCircuit.g:2059:4: otherlv_48= 'fixedTargetQubits' otherlv_49= '[' ( (lv_fixedTargetQubits_50_0= ruleSelector ) ) (otherlv_51= ',' ( (lv_fixedTargetQubits_52_0= ruleSelector ) ) )* otherlv_53= ']'
                    {
                    otherlv_48=(Token)match(input,50,FOLLOW_18); 

                    				newLeafNode(otherlv_48, grammarAccess.getLoopAccess().getFixedTargetQubitsKeyword_24_0());
                    			
                    otherlv_49=(Token)match(input,25,FOLLOW_19); 

                    				newLeafNode(otherlv_49, grammarAccess.getLoopAccess().getLeftSquareBracketKeyword_24_1());
                    			
                    // InternalQuCircuit.g:2067:4: ( (lv_fixedTargetQubits_50_0= ruleSelector ) )
                    // InternalQuCircuit.g:2068:5: (lv_fixedTargetQubits_50_0= ruleSelector )
                    {
                    // InternalQuCircuit.g:2068:5: (lv_fixedTargetQubits_50_0= ruleSelector )
                    // InternalQuCircuit.g:2069:6: lv_fixedTargetQubits_50_0= ruleSelector
                    {

                    						newCompositeNode(grammarAccess.getLoopAccess().getFixedTargetQubitsSelectorParserRuleCall_24_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_fixedTargetQubits_50_0=ruleSelector();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLoopRule());
                    						}
                    						add(
                    							current,
                    							"fixedTargetQubits",
                    							lv_fixedTargetQubits_50_0,
                    							"quantum.circuit.lang.QuCircuit.Selector");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQuCircuit.g:2086:4: (otherlv_51= ',' ( (lv_fixedTargetQubits_52_0= ruleSelector ) ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==21) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // InternalQuCircuit.g:2087:5: otherlv_51= ',' ( (lv_fixedTargetQubits_52_0= ruleSelector ) )
                    	    {
                    	    otherlv_51=(Token)match(input,21,FOLLOW_19); 

                    	    					newLeafNode(otherlv_51, grammarAccess.getLoopAccess().getCommaKeyword_24_3_0());
                    	    				
                    	    // InternalQuCircuit.g:2091:5: ( (lv_fixedTargetQubits_52_0= ruleSelector ) )
                    	    // InternalQuCircuit.g:2092:6: (lv_fixedTargetQubits_52_0= ruleSelector )
                    	    {
                    	    // InternalQuCircuit.g:2092:6: (lv_fixedTargetQubits_52_0= ruleSelector )
                    	    // InternalQuCircuit.g:2093:7: lv_fixedTargetQubits_52_0= ruleSelector
                    	    {

                    	    							newCompositeNode(grammarAccess.getLoopAccess().getFixedTargetQubitsSelectorParserRuleCall_24_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    lv_fixedTargetQubits_52_0=ruleSelector();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getLoopRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"fixedTargetQubits",
                    	    								lv_fixedTargetQubits_52_0,
                    	    								"quantum.circuit.lang.QuCircuit.Selector");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);

                    otherlv_53=(Token)match(input,26,FOLLOW_50); 

                    				newLeafNode(otherlv_53, grammarAccess.getLoopAccess().getRightSquareBracketKeyword_24_4());
                    			

                    }
                    break;

            }

            otherlv_54=(Token)match(input,51,FOLLOW_3); 

            			newLeafNode(otherlv_54, grammarAccess.getLoopAccess().getLoopKeyword_25());
            		
            // InternalQuCircuit.g:2120:3: ( ( ruleEString ) )
            // InternalQuCircuit.g:2121:4: ( ruleEString )
            {
            // InternalQuCircuit.g:2121:4: ( ruleEString )
            // InternalQuCircuit.g:2122:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLoopRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLoopAccess().getLoopConcreteLoopOperationCrossReference_26_0());
            				
            pushFollow(FOLLOW_51);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_56=(Token)match(input,52,FOLLOW_18); 

            			newLeafNode(otherlv_56, grammarAccess.getLoopAccess().getLoopTargetQubitsKeyword_27());
            		
            otherlv_57=(Token)match(input,25,FOLLOW_24); 

            			newLeafNode(otherlv_57, grammarAccess.getLoopAccess().getLeftSquareBracketKeyword_28());
            		
            otherlv_58=(Token)match(input,16,FOLLOW_19); 

            			newLeafNode(otherlv_58, grammarAccess.getLoopAccess().getLeftParenthesisKeyword_29());
            		
            // InternalQuCircuit.g:2148:3: ( (lv_loopTargetQubits_59_0= ruleSelector ) )
            // InternalQuCircuit.g:2149:4: (lv_loopTargetQubits_59_0= ruleSelector )
            {
            // InternalQuCircuit.g:2149:4: (lv_loopTargetQubits_59_0= ruleSelector )
            // InternalQuCircuit.g:2150:5: lv_loopTargetQubits_59_0= ruleSelector
            {

            					newCompositeNode(grammarAccess.getLoopAccess().getLoopTargetQubitsSelectorParserRuleCall_30_0());
            				
            pushFollow(FOLLOW_11);
            lv_loopTargetQubits_59_0=ruleSelector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLoopRule());
            					}
            					add(
            						current,
            						"loopTargetQubits",
            						lv_loopTargetQubits_59_0,
            						"quantum.circuit.lang.QuCircuit.Selector");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_60=(Token)match(input,17,FOLLOW_20); 

            			newLeafNode(otherlv_60, grammarAccess.getLoopAccess().getRightParenthesisKeyword_31());
            		
            // InternalQuCircuit.g:2171:3: (otherlv_61= ',' otherlv_62= '(' ( (lv_loopTargetQubits_63_0= ruleSelector ) ) otherlv_64= ')' )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==21) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalQuCircuit.g:2172:4: otherlv_61= ',' otherlv_62= '(' ( (lv_loopTargetQubits_63_0= ruleSelector ) ) otherlv_64= ')'
            	    {
            	    otherlv_61=(Token)match(input,21,FOLLOW_24); 

            	    				newLeafNode(otherlv_61, grammarAccess.getLoopAccess().getCommaKeyword_32_0());
            	    			
            	    otherlv_62=(Token)match(input,16,FOLLOW_19); 

            	    				newLeafNode(otherlv_62, grammarAccess.getLoopAccess().getLeftParenthesisKeyword_32_1());
            	    			
            	    // InternalQuCircuit.g:2180:4: ( (lv_loopTargetQubits_63_0= ruleSelector ) )
            	    // InternalQuCircuit.g:2181:5: (lv_loopTargetQubits_63_0= ruleSelector )
            	    {
            	    // InternalQuCircuit.g:2181:5: (lv_loopTargetQubits_63_0= ruleSelector )
            	    // InternalQuCircuit.g:2182:6: lv_loopTargetQubits_63_0= ruleSelector
            	    {

            	    						newCompositeNode(grammarAccess.getLoopAccess().getLoopTargetQubitsSelectorParserRuleCall_32_2_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_loopTargetQubits_63_0=ruleSelector();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLoopRule());
            	    						}
            	    						add(
            	    							current,
            	    							"loopTargetQubits",
            	    							lv_loopTargetQubits_63_0,
            	    							"quantum.circuit.lang.QuCircuit.Selector");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_64=(Token)match(input,17,FOLLOW_20); 

            	    				newLeafNode(otherlv_64, grammarAccess.getLoopAccess().getRightParenthesisKeyword_32_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            otherlv_65=(Token)match(input,26,FOLLOW_52); 

            			newLeafNode(otherlv_65, grammarAccess.getLoopAccess().getRightSquareBracketKeyword_33());
            		
            // InternalQuCircuit.g:2208:3: (otherlv_66= 'loopControlQubits' otherlv_67= '[' otherlv_68= '(' ( (lv_loopControlQubits_69_0= ruleSelector ) ) otherlv_70= ')' (otherlv_71= ',' otherlv_72= '(' ( (lv_loopControlQubits_73_0= ruleSelector ) ) otherlv_74= ')' )* otherlv_75= ']' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==53) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalQuCircuit.g:2209:4: otherlv_66= 'loopControlQubits' otherlv_67= '[' otherlv_68= '(' ( (lv_loopControlQubits_69_0= ruleSelector ) ) otherlv_70= ')' (otherlv_71= ',' otherlv_72= '(' ( (lv_loopControlQubits_73_0= ruleSelector ) ) otherlv_74= ')' )* otherlv_75= ']'
                    {
                    otherlv_66=(Token)match(input,53,FOLLOW_18); 

                    				newLeafNode(otherlv_66, grammarAccess.getLoopAccess().getLoopControlQubitsKeyword_34_0());
                    			
                    otherlv_67=(Token)match(input,25,FOLLOW_24); 

                    				newLeafNode(otherlv_67, grammarAccess.getLoopAccess().getLeftSquareBracketKeyword_34_1());
                    			
                    otherlv_68=(Token)match(input,16,FOLLOW_19); 

                    				newLeafNode(otherlv_68, grammarAccess.getLoopAccess().getLeftParenthesisKeyword_34_2());
                    			
                    // InternalQuCircuit.g:2221:4: ( (lv_loopControlQubits_69_0= ruleSelector ) )
                    // InternalQuCircuit.g:2222:5: (lv_loopControlQubits_69_0= ruleSelector )
                    {
                    // InternalQuCircuit.g:2222:5: (lv_loopControlQubits_69_0= ruleSelector )
                    // InternalQuCircuit.g:2223:6: lv_loopControlQubits_69_0= ruleSelector
                    {

                    						newCompositeNode(grammarAccess.getLoopAccess().getLoopControlQubitsSelectorParserRuleCall_34_3_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_loopControlQubits_69_0=ruleSelector();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLoopRule());
                    						}
                    						add(
                    							current,
                    							"loopControlQubits",
                    							lv_loopControlQubits_69_0,
                    							"quantum.circuit.lang.QuCircuit.Selector");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_70=(Token)match(input,17,FOLLOW_20); 

                    				newLeafNode(otherlv_70, grammarAccess.getLoopAccess().getRightParenthesisKeyword_34_4());
                    			
                    // InternalQuCircuit.g:2244:4: (otherlv_71= ',' otherlv_72= '(' ( (lv_loopControlQubits_73_0= ruleSelector ) ) otherlv_74= ')' )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==21) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // InternalQuCircuit.g:2245:5: otherlv_71= ',' otherlv_72= '(' ( (lv_loopControlQubits_73_0= ruleSelector ) ) otherlv_74= ')'
                    	    {
                    	    otherlv_71=(Token)match(input,21,FOLLOW_24); 

                    	    					newLeafNode(otherlv_71, grammarAccess.getLoopAccess().getCommaKeyword_34_5_0());
                    	    				
                    	    otherlv_72=(Token)match(input,16,FOLLOW_19); 

                    	    					newLeafNode(otherlv_72, grammarAccess.getLoopAccess().getLeftParenthesisKeyword_34_5_1());
                    	    				
                    	    // InternalQuCircuit.g:2253:5: ( (lv_loopControlQubits_73_0= ruleSelector ) )
                    	    // InternalQuCircuit.g:2254:6: (lv_loopControlQubits_73_0= ruleSelector )
                    	    {
                    	    // InternalQuCircuit.g:2254:6: (lv_loopControlQubits_73_0= ruleSelector )
                    	    // InternalQuCircuit.g:2255:7: lv_loopControlQubits_73_0= ruleSelector
                    	    {

                    	    							newCompositeNode(grammarAccess.getLoopAccess().getLoopControlQubitsSelectorParserRuleCall_34_5_2_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_loopControlQubits_73_0=ruleSelector();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getLoopRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"loopControlQubits",
                    	    								lv_loopControlQubits_73_0,
                    	    								"quantum.circuit.lang.QuCircuit.Selector");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    otherlv_74=(Token)match(input,17,FOLLOW_20); 

                    	    					newLeafNode(otherlv_74, grammarAccess.getLoopAccess().getRightParenthesisKeyword_34_5_3());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop54;
                        }
                    } while (true);

                    otherlv_75=(Token)match(input,26,FOLLOW_10); 

                    				newLeafNode(otherlv_75, grammarAccess.getLoopAccess().getRightSquareBracketKeyword_34_6());
                    			

                    }
                    break;

            }

            otherlv_76=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_76, grammarAccess.getLoopAccess().getRightCurlyBracketKeyword_35());
            		

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
    // $ANTLR end "ruleLoop"


    // $ANTLR start "entryRuleOperation"
    // InternalQuCircuit.g:2290:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalQuCircuit.g:2290:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalQuCircuit.g:2291:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalQuCircuit.g:2297:1: ruleOperation returns [EObject current=null] : ( ( ( ruleEString ) ) (otherlv_1= '(' ( ( ruleEString ) ) otherlv_3= ')' )? ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalQuCircuit.g:2303:2: ( ( ( ( ruleEString ) ) (otherlv_1= '(' ( ( ruleEString ) ) otherlv_3= ')' )? ) )
            // InternalQuCircuit.g:2304:2: ( ( ( ruleEString ) ) (otherlv_1= '(' ( ( ruleEString ) ) otherlv_3= ')' )? )
            {
            // InternalQuCircuit.g:2304:2: ( ( ( ruleEString ) ) (otherlv_1= '(' ( ( ruleEString ) ) otherlv_3= ')' )? )
            // InternalQuCircuit.g:2305:3: ( ( ruleEString ) ) (otherlv_1= '(' ( ( ruleEString ) ) otherlv_3= ')' )?
            {
            // InternalQuCircuit.g:2305:3: ( ( ruleEString ) )
            // InternalQuCircuit.g:2306:4: ( ruleEString )
            {
            // InternalQuCircuit.g:2306:4: ( ruleEString )
            // InternalQuCircuit.g:2307:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOperationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getOperationAccess().getOperationConcreteQuantumOperationCrossReference_0_0());
            				
            pushFollow(FOLLOW_53);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQuCircuit.g:2321:3: (otherlv_1= '(' ( ( ruleEString ) ) otherlv_3= ')' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==16) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalQuCircuit.g:2322:4: otherlv_1= '(' ( ( ruleEString ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getOperationAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalQuCircuit.g:2326:4: ( ( ruleEString ) )
                    // InternalQuCircuit.g:2327:5: ( ruleEString )
                    {
                    // InternalQuCircuit.g:2327:5: ( ruleEString )
                    // InternalQuCircuit.g:2328:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOperationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getOperationAccess().getQuboQuboCrossReference_1_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getOperationAccess().getRightParenthesisKeyword_1_2());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleSelector"
    // InternalQuCircuit.g:2351:1: entryRuleSelector returns [EObject current=null] : iv_ruleSelector= ruleSelector EOF ;
    public final EObject entryRuleSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelector = null;


        try {
            // InternalQuCircuit.g:2351:49: (iv_ruleSelector= ruleSelector EOF )
            // InternalQuCircuit.g:2352:2: iv_ruleSelector= ruleSelector EOF
            {
             newCompositeNode(grammarAccess.getSelectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelector=ruleSelector();

            state._fsp--;

             current =iv_ruleSelector; 
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
    // $ANTLR end "entryRuleSelector"


    // $ANTLR start "ruleSelector"
    // InternalQuCircuit.g:2358:1: ruleSelector returns [EObject current=null] : (this_ElementSelector_0= ruleElementSelector | this_RangeSelector_1= ruleRangeSelector ) ;
    public final EObject ruleSelector() throws RecognitionException {
        EObject current = null;

        EObject this_ElementSelector_0 = null;

        EObject this_RangeSelector_1 = null;



        	enterRule();

        try {
            // InternalQuCircuit.g:2364:2: ( (this_ElementSelector_0= ruleElementSelector | this_RangeSelector_1= ruleRangeSelector ) )
            // InternalQuCircuit.g:2365:2: (this_ElementSelector_0= ruleElementSelector | this_RangeSelector_1= ruleRangeSelector )
            {
            // InternalQuCircuit.g:2365:2: (this_ElementSelector_0= ruleElementSelector | this_RangeSelector_1= ruleRangeSelector )
            int alt57=2;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA57_1 = input.LA(2);

                if ( (LA57_1==21) ) {
                    int LA57_4 = input.LA(3);

                    if ( (LA57_4==RULE_INT) ) {
                        int LA57_3 = input.LA(4);

                        if ( (LA57_3==EOF||LA57_3==17||LA57_3==21||LA57_3==26) ) {
                            alt57=1;
                        }
                        else if ( (LA57_3==54) ) {
                            alt57=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 57, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 57, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 57, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA57_2 = input.LA(2);

                if ( (LA57_2==21) ) {
                    int LA57_4 = input.LA(3);

                    if ( (LA57_4==RULE_INT) ) {
                        int LA57_3 = input.LA(4);

                        if ( (LA57_3==EOF||LA57_3==17||LA57_3==21||LA57_3==26) ) {
                            alt57=1;
                        }
                        else if ( (LA57_3==54) ) {
                            alt57=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 57, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 57, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 57, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA57_3 = input.LA(2);

                if ( (LA57_3==EOF||LA57_3==17||LA57_3==21||LA57_3==26) ) {
                    alt57=1;
                }
                else if ( (LA57_3==54) ) {
                    alt57=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 57, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // InternalQuCircuit.g:2366:3: this_ElementSelector_0= ruleElementSelector
                    {

                    			newCompositeNode(grammarAccess.getSelectorAccess().getElementSelectorParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ElementSelector_0=ruleElementSelector();

                    state._fsp--;


                    			current = this_ElementSelector_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalQuCircuit.g:2375:3: this_RangeSelector_1= ruleRangeSelector
                    {

                    			newCompositeNode(grammarAccess.getSelectorAccess().getRangeSelectorParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RangeSelector_1=ruleRangeSelector();

                    state._fsp--;


                    			current = this_RangeSelector_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleSelector"


    // $ANTLR start "entryRuleElementSelector"
    // InternalQuCircuit.g:2387:1: entryRuleElementSelector returns [EObject current=null] : iv_ruleElementSelector= ruleElementSelector EOF ;
    public final EObject entryRuleElementSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementSelector = null;


        try {
            // InternalQuCircuit.g:2387:56: (iv_ruleElementSelector= ruleElementSelector EOF )
            // InternalQuCircuit.g:2388:2: iv_ruleElementSelector= ruleElementSelector EOF
            {
             newCompositeNode(grammarAccess.getElementSelectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElementSelector=ruleElementSelector();

            state._fsp--;

             current =iv_ruleElementSelector; 
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
    // $ANTLR end "entryRuleElementSelector"


    // $ANTLR start "ruleElementSelector"
    // InternalQuCircuit.g:2394:1: ruleElementSelector returns [EObject current=null] : ( () ( ( ( ruleEString ) ) otherlv_2= ',' )? ( (lv_index_3_0= RULE_INT ) ) ) ;
    public final EObject ruleElementSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_index_3_0=null;


        	enterRule();

        try {
            // InternalQuCircuit.g:2400:2: ( ( () ( ( ( ruleEString ) ) otherlv_2= ',' )? ( (lv_index_3_0= RULE_INT ) ) ) )
            // InternalQuCircuit.g:2401:2: ( () ( ( ( ruleEString ) ) otherlv_2= ',' )? ( (lv_index_3_0= RULE_INT ) ) )
            {
            // InternalQuCircuit.g:2401:2: ( () ( ( ( ruleEString ) ) otherlv_2= ',' )? ( (lv_index_3_0= RULE_INT ) ) )
            // InternalQuCircuit.g:2402:3: () ( ( ( ruleEString ) ) otherlv_2= ',' )? ( (lv_index_3_0= RULE_INT ) )
            {
            // InternalQuCircuit.g:2402:3: ()
            // InternalQuCircuit.g:2403:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getElementSelectorAccess().getElementSelectorAction_0(),
            					current);
            			

            }

            // InternalQuCircuit.g:2409:3: ( ( ( ruleEString ) ) otherlv_2= ',' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( ((LA58_0>=RULE_STRING && LA58_0<=RULE_ID)) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalQuCircuit.g:2410:4: ( ( ruleEString ) ) otherlv_2= ','
                    {
                    // InternalQuCircuit.g:2410:4: ( ( ruleEString ) )
                    // InternalQuCircuit.g:2411:5: ( ruleEString )
                    {
                    // InternalQuCircuit.g:2411:5: ( ruleEString )
                    // InternalQuCircuit.g:2412:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getElementSelectorRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getElementSelectorAccess().getRegisterRegisterCrossReference_1_0_0());
                    					
                    pushFollow(FOLLOW_54);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,21,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getElementSelectorAccess().getCommaKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalQuCircuit.g:2431:3: ( (lv_index_3_0= RULE_INT ) )
            // InternalQuCircuit.g:2432:4: (lv_index_3_0= RULE_INT )
            {
            // InternalQuCircuit.g:2432:4: (lv_index_3_0= RULE_INT )
            // InternalQuCircuit.g:2433:5: lv_index_3_0= RULE_INT
            {
            lv_index_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_index_3_0, grammarAccess.getElementSelectorAccess().getIndexINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getElementSelectorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"index",
            						lv_index_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleElementSelector"


    // $ANTLR start "entryRuleRangeSelector"
    // InternalQuCircuit.g:2453:1: entryRuleRangeSelector returns [EObject current=null] : iv_ruleRangeSelector= ruleRangeSelector EOF ;
    public final EObject entryRuleRangeSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRangeSelector = null;


        try {
            // InternalQuCircuit.g:2453:54: (iv_ruleRangeSelector= ruleRangeSelector EOF )
            // InternalQuCircuit.g:2454:2: iv_ruleRangeSelector= ruleRangeSelector EOF
            {
             newCompositeNode(grammarAccess.getRangeSelectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRangeSelector=ruleRangeSelector();

            state._fsp--;

             current =iv_ruleRangeSelector; 
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
    // $ANTLR end "entryRuleRangeSelector"


    // $ANTLR start "ruleRangeSelector"
    // InternalQuCircuit.g:2460:1: ruleRangeSelector returns [EObject current=null] : ( () ( ( ( ruleEString ) ) otherlv_2= ',' )? ( (lv_begin_3_0= RULE_INT ) ) otherlv_4= '-' ( (lv_end_5_0= RULE_INT ) ) ) ;
    public final EObject ruleRangeSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_begin_3_0=null;
        Token otherlv_4=null;
        Token lv_end_5_0=null;


        	enterRule();

        try {
            // InternalQuCircuit.g:2466:2: ( ( () ( ( ( ruleEString ) ) otherlv_2= ',' )? ( (lv_begin_3_0= RULE_INT ) ) otherlv_4= '-' ( (lv_end_5_0= RULE_INT ) ) ) )
            // InternalQuCircuit.g:2467:2: ( () ( ( ( ruleEString ) ) otherlv_2= ',' )? ( (lv_begin_3_0= RULE_INT ) ) otherlv_4= '-' ( (lv_end_5_0= RULE_INT ) ) )
            {
            // InternalQuCircuit.g:2467:2: ( () ( ( ( ruleEString ) ) otherlv_2= ',' )? ( (lv_begin_3_0= RULE_INT ) ) otherlv_4= '-' ( (lv_end_5_0= RULE_INT ) ) )
            // InternalQuCircuit.g:2468:3: () ( ( ( ruleEString ) ) otherlv_2= ',' )? ( (lv_begin_3_0= RULE_INT ) ) otherlv_4= '-' ( (lv_end_5_0= RULE_INT ) )
            {
            // InternalQuCircuit.g:2468:3: ()
            // InternalQuCircuit.g:2469:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRangeSelectorAccess().getRangeSelectorAction_0(),
            					current);
            			

            }

            // InternalQuCircuit.g:2475:3: ( ( ( ruleEString ) ) otherlv_2= ',' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( ((LA59_0>=RULE_STRING && LA59_0<=RULE_ID)) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalQuCircuit.g:2476:4: ( ( ruleEString ) ) otherlv_2= ','
                    {
                    // InternalQuCircuit.g:2476:4: ( ( ruleEString ) )
                    // InternalQuCircuit.g:2477:5: ( ruleEString )
                    {
                    // InternalQuCircuit.g:2477:5: ( ruleEString )
                    // InternalQuCircuit.g:2478:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRangeSelectorRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRangeSelectorAccess().getRegisterRegisterCrossReference_1_0_0());
                    					
                    pushFollow(FOLLOW_54);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,21,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getRangeSelectorAccess().getCommaKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalQuCircuit.g:2497:3: ( (lv_begin_3_0= RULE_INT ) )
            // InternalQuCircuit.g:2498:4: (lv_begin_3_0= RULE_INT )
            {
            // InternalQuCircuit.g:2498:4: (lv_begin_3_0= RULE_INT )
            // InternalQuCircuit.g:2499:5: lv_begin_3_0= RULE_INT
            {
            lv_begin_3_0=(Token)match(input,RULE_INT,FOLLOW_55); 

            					newLeafNode(lv_begin_3_0, grammarAccess.getRangeSelectorAccess().getBeginINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRangeSelectorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"begin",
            						lv_begin_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,54,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getRangeSelectorAccess().getHyphenMinusKeyword_3());
            		
            // InternalQuCircuit.g:2519:3: ( (lv_end_5_0= RULE_INT ) )
            // InternalQuCircuit.g:2520:4: (lv_end_5_0= RULE_INT )
            {
            // InternalQuCircuit.g:2520:4: (lv_end_5_0= RULE_INT )
            // InternalQuCircuit.g:2521:5: lv_end_5_0= RULE_INT
            {
            lv_end_5_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_end_5_0, grammarAccess.getRangeSelectorAccess().getEndINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRangeSelectorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"end",
            						lv_end_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleRangeSelector"


    // $ANTLR start "entryRuleEString"
    // InternalQuCircuit.g:2541:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalQuCircuit.g:2541:47: (iv_ruleEString= ruleEString EOF )
            // InternalQuCircuit.g:2542:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalQuCircuit.g:2548:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalQuCircuit.g:2554:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalQuCircuit.g:2555:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalQuCircuit.g:2555:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_STRING) ) {
                alt60=1;
            }
            else if ( (LA60_0==RULE_ID) ) {
                alt60=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // InternalQuCircuit.g:2556:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalQuCircuit.g:2564:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEDoubleObject"
    // InternalQuCircuit.g:2575:1: entryRuleEDoubleObject returns [String current=null] : iv_ruleEDoubleObject= ruleEDoubleObject EOF ;
    public final String entryRuleEDoubleObject() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDoubleObject = null;


        try {
            // InternalQuCircuit.g:2575:53: (iv_ruleEDoubleObject= ruleEDoubleObject EOF )
            // InternalQuCircuit.g:2576:2: iv_ruleEDoubleObject= ruleEDoubleObject EOF
            {
             newCompositeNode(grammarAccess.getEDoubleObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDoubleObject=ruleEDoubleObject();

            state._fsp--;

             current =iv_ruleEDoubleObject.getText(); 
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
    // $ANTLR end "entryRuleEDoubleObject"


    // $ANTLR start "ruleEDoubleObject"
    // InternalQuCircuit.g:2582:1: ruleEDoubleObject returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDoubleObject() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalQuCircuit.g:2588:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalQuCircuit.g:2589:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalQuCircuit.g:2589:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalQuCircuit.g:2590:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalQuCircuit.g:2590:3: (kw= '-' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==54) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalQuCircuit.g:2591:4: kw= '-'
                    {
                    kw=(Token)match(input,54,FOLLOW_56); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleObjectAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalQuCircuit.g:2597:3: (this_INT_1= RULE_INT )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_INT) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalQuCircuit.g:2598:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_57); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleObjectAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,55,FOLLOW_9); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleObjectAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_58); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleObjectAccess().getINTTerminalRuleCall_3());
            		
            // InternalQuCircuit.g:2618:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( ((LA65_0>=56 && LA65_0<=57)) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalQuCircuit.g:2619:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalQuCircuit.g:2619:4: (kw= 'E' | kw= 'e' )
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==56) ) {
                        alt63=1;
                    }
                    else if ( (LA63_0==57) ) {
                        alt63=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 63, 0, input);

                        throw nvae;
                    }
                    switch (alt63) {
                        case 1 :
                            // InternalQuCircuit.g:2620:5: kw= 'E'
                            {
                            kw=(Token)match(input,56,FOLLOW_59); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleObjectAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalQuCircuit.g:2626:5: kw= 'e'
                            {
                            kw=(Token)match(input,57,FOLLOW_59); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleObjectAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalQuCircuit.g:2632:4: (kw= '-' )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==54) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // InternalQuCircuit.g:2633:5: kw= '-'
                            {
                            kw=(Token)match(input,54,FOLLOW_9); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleObjectAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEDoubleObjectAccess().getINTTerminalRuleCall_4_2());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleEDoubleObject"


    // $ANTLR start "ruleITERATION_TYPE"
    // InternalQuCircuit.g:2651:1: ruleITERATION_TYPE returns [Enumerator current=null] : ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'SHIFT' ) | (enumLiteral_2= 'CHANGE_BLOCK' ) ) ;
    public final Enumerator ruleITERATION_TYPE() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalQuCircuit.g:2657:2: ( ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'SHIFT' ) | (enumLiteral_2= 'CHANGE_BLOCK' ) ) )
            // InternalQuCircuit.g:2658:2: ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'SHIFT' ) | (enumLiteral_2= 'CHANGE_BLOCK' ) )
            {
            // InternalQuCircuit.g:2658:2: ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'SHIFT' ) | (enumLiteral_2= 'CHANGE_BLOCK' ) )
            int alt66=3;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt66=1;
                }
                break;
            case 59:
                {
                alt66=2;
                }
                break;
            case 60:
                {
                alt66=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }

            switch (alt66) {
                case 1 :
                    // InternalQuCircuit.g:2659:3: (enumLiteral_0= 'NONE' )
                    {
                    // InternalQuCircuit.g:2659:3: (enumLiteral_0= 'NONE' )
                    // InternalQuCircuit.g:2660:4: enumLiteral_0= 'NONE'
                    {
                    enumLiteral_0=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getITERATION_TYPEAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getITERATION_TYPEAccess().getNONEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalQuCircuit.g:2667:3: (enumLiteral_1= 'SHIFT' )
                    {
                    // InternalQuCircuit.g:2667:3: (enumLiteral_1= 'SHIFT' )
                    // InternalQuCircuit.g:2668:4: enumLiteral_1= 'SHIFT'
                    {
                    enumLiteral_1=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getITERATION_TYPEAccess().getSHIFTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getITERATION_TYPEAccess().getSHIFTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalQuCircuit.g:2675:3: (enumLiteral_2= 'CHANGE_BLOCK' )
                    {
                    // InternalQuCircuit.g:2675:3: (enumLiteral_2= 'CHANGE_BLOCK' )
                    // InternalQuCircuit.g:2676:4: enumLiteral_2= 'CHANGE_BLOCK'
                    {
                    enumLiteral_2=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getITERATION_TYPEAccess().getCHANGE_BLOCKEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getITERATION_TYPEAccess().getCHANGE_BLOCKEnumLiteralDeclaration_2());
                    			

                    }


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
    // $ANTLR end "ruleITERATION_TYPE"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000144000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000146000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000001060L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000003408400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004200000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010001060L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000060002000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000380002000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00C0000000000010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000300002000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200002000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000011800000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000020002000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0001FFC011000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0001FFC001000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0001FF8001000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0001FF0001000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0001FE0001000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0001FC0001000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0001F80001000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0001F00001000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0001E00001000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x1C00000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0001C00001000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0001800001000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0001000001000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000220000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x000E000020000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x000E000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0020000000002000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0080000000000010L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0300000000000002L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0040000000000010L});

}