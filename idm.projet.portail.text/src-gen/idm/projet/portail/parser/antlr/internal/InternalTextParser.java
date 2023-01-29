package idm.projet.portail.parser.antlr.internal;

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
import idm.projet.portail.services.TextGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTextParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Universite'", "'Departement'", "'{'", "'Description'", "':'", "';'", "'Responsable'", "'}'", "'Secretaire'", "'Telephone'", "'Bureau'", "'Mail'", "'Formation'", "'Intervenant'", "'Specialit\\u00E9'", "'Ues intervenants'", "','", "'Ues responsables'", "'Responsable formation'", "'Responsable parcours'", "'Credit'", "'Secretaires'", "'Responsables formation'", "'-'", "'Parcours'", "'Comp\\u00E9tences'", "'D\\u00E9bouch\\u00E9s'", "'UE'", "'Objectif'", "'Competence'", "'Evaluation'", "'Programme'", "'Type enseignement'", "'Nombre d\\'heure de cours magistrals'", "'Nombre d\\'heure de travaux dirig\\u00E9s'", "'Nombre d\\'heure de travaux pratiques'", "'Responsables'", "'Intervenants'", "'Semestre'", "'Date de debut'", "'Date de fin'", "'Ues facultatives'", "'Ues obligatoires'", "'EDate'", "'Seance'", "'Date'", "'Heure de d\\u00E9but'", "'Heure de fin'", "'kind'", "'Ressources'", "'Ressource'", "'Lien'", "'CM'", "'TD'", "'TP'"
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
    public static final int T__61=61;
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
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
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


        public InternalTextParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTextParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTextParser.tokenNames; }
    public String getGrammarFileName() { return "InternalText.g"; }



     	private TextGrammarAccess grammarAccess;

        public InternalTextParser(TokenStream input, TextGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Universite";
       	}

       	@Override
       	protected TextGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleUniversite"
    // InternalText.g:65:1: entryRuleUniversite returns [EObject current=null] : iv_ruleUniversite= ruleUniversite EOF ;
    public final EObject entryRuleUniversite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUniversite = null;


        try {
            // InternalText.g:65:51: (iv_ruleUniversite= ruleUniversite EOF )
            // InternalText.g:66:2: iv_ruleUniversite= ruleUniversite EOF
            {
             newCompositeNode(grammarAccess.getUniversiteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUniversite=ruleUniversite();

            state._fsp--;

             current =iv_ruleUniversite; 
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
    // $ANTLR end "entryRuleUniversite"


    // $ANTLR start "ruleUniversite"
    // InternalText.g:72:1: ruleUniversite returns [EObject current=null] : (otherlv_0= 'Universite' ( (lv_name_1_0= ruleEString ) ) ( ( (lv_departements_2_0= ruleDepartement ) ) | ( (lv_employes_3_0= ruleEmploye ) ) )* ) ;
    public final EObject ruleUniversite() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_departements_2_0 = null;

        EObject lv_employes_3_0 = null;



        	enterRule();

        try {
            // InternalText.g:78:2: ( (otherlv_0= 'Universite' ( (lv_name_1_0= ruleEString ) ) ( ( (lv_departements_2_0= ruleDepartement ) ) | ( (lv_employes_3_0= ruleEmploye ) ) )* ) )
            // InternalText.g:79:2: (otherlv_0= 'Universite' ( (lv_name_1_0= ruleEString ) ) ( ( (lv_departements_2_0= ruleDepartement ) ) | ( (lv_employes_3_0= ruleEmploye ) ) )* )
            {
            // InternalText.g:79:2: (otherlv_0= 'Universite' ( (lv_name_1_0= ruleEString ) ) ( ( (lv_departements_2_0= ruleDepartement ) ) | ( (lv_employes_3_0= ruleEmploye ) ) )* )
            // InternalText.g:80:3: otherlv_0= 'Universite' ( (lv_name_1_0= ruleEString ) ) ( ( (lv_departements_2_0= ruleDepartement ) ) | ( (lv_employes_3_0= ruleEmploye ) ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getUniversiteAccess().getUniversiteKeyword_0());
            		
            // InternalText.g:84:3: ( (lv_name_1_0= ruleEString ) )
            // InternalText.g:85:4: (lv_name_1_0= ruleEString )
            {
            // InternalText.g:85:4: (lv_name_1_0= ruleEString )
            // InternalText.g:86:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getUniversiteAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUniversiteRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"idm.projet.portail.Text.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalText.g:103:3: ( ( (lv_departements_2_0= ruleDepartement ) ) | ( (lv_employes_3_0= ruleEmploye ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }
                else if ( (LA1_0==19||LA1_0==24) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalText.g:104:4: ( (lv_departements_2_0= ruleDepartement ) )
            	    {
            	    // InternalText.g:104:4: ( (lv_departements_2_0= ruleDepartement ) )
            	    // InternalText.g:105:5: (lv_departements_2_0= ruleDepartement )
            	    {
            	    // InternalText.g:105:5: (lv_departements_2_0= ruleDepartement )
            	    // InternalText.g:106:6: lv_departements_2_0= ruleDepartement
            	    {

            	    						newCompositeNode(grammarAccess.getUniversiteAccess().getDepartementsDepartementParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_departements_2_0=ruleDepartement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getUniversiteRule());
            	    						}
            	    						add(
            	    							current,
            	    							"departements",
            	    							lv_departements_2_0,
            	    							"idm.projet.portail.Text.Departement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalText.g:124:4: ( (lv_employes_3_0= ruleEmploye ) )
            	    {
            	    // InternalText.g:124:4: ( (lv_employes_3_0= ruleEmploye ) )
            	    // InternalText.g:125:5: (lv_employes_3_0= ruleEmploye )
            	    {
            	    // InternalText.g:125:5: (lv_employes_3_0= ruleEmploye )
            	    // InternalText.g:126:6: lv_employes_3_0= ruleEmploye
            	    {

            	    						newCompositeNode(grammarAccess.getUniversiteAccess().getEmployesEmployeParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_employes_3_0=ruleEmploye();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getUniversiteRule());
            	    						}
            	    						add(
            	    							current,
            	    							"employes",
            	    							lv_employes_3_0,
            	    							"idm.projet.portail.Text.Employe");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleUniversite"


    // $ANTLR start "entryRuleDepartement"
    // InternalText.g:148:1: entryRuleDepartement returns [EObject current=null] : iv_ruleDepartement= ruleDepartement EOF ;
    public final EObject entryRuleDepartement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDepartement = null;


        try {
            // InternalText.g:148:52: (iv_ruleDepartement= ruleDepartement EOF )
            // InternalText.g:149:2: iv_ruleDepartement= ruleDepartement EOF
            {
             newCompositeNode(grammarAccess.getDepartementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDepartement=ruleDepartement();

            state._fsp--;

             current =iv_ruleDepartement; 
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
    // $ANTLR end "entryRuleDepartement"


    // $ANTLR start "ruleDepartement"
    // InternalText.g:155:1: ruleDepartement returns [EObject current=null] : (otherlv_0= 'Departement' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Description' otherlv_4= ':' ( (lv_description_5_0= ruleEString ) ) otherlv_6= ';' otherlv_7= 'Responsable' otherlv_8= ':' ( ( ruleEString ) ) otherlv_10= ';' ( (lv_formations_11_0= ruleFormation ) ) ( (lv_formations_12_0= ruleFormation ) )* otherlv_13= '}' ) ;
    public final EObject ruleDepartement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_description_5_0 = null;

        EObject lv_formations_11_0 = null;

        EObject lv_formations_12_0 = null;



        	enterRule();

        try {
            // InternalText.g:161:2: ( (otherlv_0= 'Departement' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Description' otherlv_4= ':' ( (lv_description_5_0= ruleEString ) ) otherlv_6= ';' otherlv_7= 'Responsable' otherlv_8= ':' ( ( ruleEString ) ) otherlv_10= ';' ( (lv_formations_11_0= ruleFormation ) ) ( (lv_formations_12_0= ruleFormation ) )* otherlv_13= '}' ) )
            // InternalText.g:162:2: (otherlv_0= 'Departement' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Description' otherlv_4= ':' ( (lv_description_5_0= ruleEString ) ) otherlv_6= ';' otherlv_7= 'Responsable' otherlv_8= ':' ( ( ruleEString ) ) otherlv_10= ';' ( (lv_formations_11_0= ruleFormation ) ) ( (lv_formations_12_0= ruleFormation ) )* otherlv_13= '}' )
            {
            // InternalText.g:162:2: (otherlv_0= 'Departement' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Description' otherlv_4= ':' ( (lv_description_5_0= ruleEString ) ) otherlv_6= ';' otherlv_7= 'Responsable' otherlv_8= ':' ( ( ruleEString ) ) otherlv_10= ';' ( (lv_formations_11_0= ruleFormation ) ) ( (lv_formations_12_0= ruleFormation ) )* otherlv_13= '}' )
            // InternalText.g:163:3: otherlv_0= 'Departement' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Description' otherlv_4= ':' ( (lv_description_5_0= ruleEString ) ) otherlv_6= ';' otherlv_7= 'Responsable' otherlv_8= ':' ( ( ruleEString ) ) otherlv_10= ';' ( (lv_formations_11_0= ruleFormation ) ) ( (lv_formations_12_0= ruleFormation ) )* otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDepartementAccess().getDepartementKeyword_0());
            		
            // InternalText.g:167:3: ( (lv_name_1_0= ruleEString ) )
            // InternalText.g:168:4: (lv_name_1_0= ruleEString )
            {
            // InternalText.g:168:4: (lv_name_1_0= ruleEString )
            // InternalText.g:169:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDepartementAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDepartementRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"idm.projet.portail.Text.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getDepartementAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getDepartementAccess().getDescriptionKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getDepartementAccess().getColonKeyword_4());
            		
            // InternalText.g:198:3: ( (lv_description_5_0= ruleEString ) )
            // InternalText.g:199:4: (lv_description_5_0= ruleEString )
            {
            // InternalText.g:199:4: (lv_description_5_0= ruleEString )
            // InternalText.g:200:5: lv_description_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDepartementAccess().getDescriptionEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_description_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDepartementRule());
            					}
            					set(
            						current,
            						"description",
            						lv_description_5_0,
            						"idm.projet.portail.Text.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getDepartementAccess().getSemicolonKeyword_6());
            		
            otherlv_7=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getDepartementAccess().getResponsableKeyword_7());
            		
            otherlv_8=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getDepartementAccess().getColonKeyword_8());
            		
            // InternalText.g:229:3: ( ( ruleEString ) )
            // InternalText.g:230:4: ( ruleEString )
            {
            // InternalText.g:230:4: ( ruleEString )
            // InternalText.g:231:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDepartementRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDepartementAccess().getResponsableDepartementIntervenantCrossReference_9_0());
            				
            pushFollow(FOLLOW_8);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_10, grammarAccess.getDepartementAccess().getSemicolonKeyword_10());
            		
            // InternalText.g:249:3: ( (lv_formations_11_0= ruleFormation ) )
            // InternalText.g:250:4: (lv_formations_11_0= ruleFormation )
            {
            // InternalText.g:250:4: (lv_formations_11_0= ruleFormation )
            // InternalText.g:251:5: lv_formations_11_0= ruleFormation
            {

            					newCompositeNode(grammarAccess.getDepartementAccess().getFormationsFormationParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_11);
            lv_formations_11_0=ruleFormation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDepartementRule());
            					}
            					add(
            						current,
            						"formations",
            						lv_formations_11_0,
            						"idm.projet.portail.Text.Formation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalText.g:268:3: ( (lv_formations_12_0= ruleFormation ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==23) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalText.g:269:4: (lv_formations_12_0= ruleFormation )
            	    {
            	    // InternalText.g:269:4: (lv_formations_12_0= ruleFormation )
            	    // InternalText.g:270:5: lv_formations_12_0= ruleFormation
            	    {

            	    					newCompositeNode(grammarAccess.getDepartementAccess().getFormationsFormationParserRuleCall_12_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_formations_12_0=ruleFormation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDepartementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"formations",
            	    						lv_formations_12_0,
            	    						"idm.projet.portail.Text.Formation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_13=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getDepartementAccess().getRightCurlyBracketKeyword_13());
            		

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
    // $ANTLR end "ruleDepartement"


    // $ANTLR start "entryRuleEmploye"
    // InternalText.g:295:1: entryRuleEmploye returns [EObject current=null] : iv_ruleEmploye= ruleEmploye EOF ;
    public final EObject entryRuleEmploye() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmploye = null;


        try {
            // InternalText.g:295:48: (iv_ruleEmploye= ruleEmploye EOF )
            // InternalText.g:296:2: iv_ruleEmploye= ruleEmploye EOF
            {
             newCompositeNode(grammarAccess.getEmployeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEmploye=ruleEmploye();

            state._fsp--;

             current =iv_ruleEmploye; 
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
    // $ANTLR end "entryRuleEmploye"


    // $ANTLR start "ruleEmploye"
    // InternalText.g:302:1: ruleEmploye returns [EObject current=null] : (this_Intervenant_0= ruleIntervenant | this_Secretaire_1= ruleSecretaire ) ;
    public final EObject ruleEmploye() throws RecognitionException {
        EObject current = null;

        EObject this_Intervenant_0 = null;

        EObject this_Secretaire_1 = null;



        	enterRule();

        try {
            // InternalText.g:308:2: ( (this_Intervenant_0= ruleIntervenant | this_Secretaire_1= ruleSecretaire ) )
            // InternalText.g:309:2: (this_Intervenant_0= ruleIntervenant | this_Secretaire_1= ruleSecretaire )
            {
            // InternalText.g:309:2: (this_Intervenant_0= ruleIntervenant | this_Secretaire_1= ruleSecretaire )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==24) ) {
                alt3=1;
            }
            else if ( (LA3_0==19) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalText.g:310:3: this_Intervenant_0= ruleIntervenant
                    {

                    			newCompositeNode(grammarAccess.getEmployeAccess().getIntervenantParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Intervenant_0=ruleIntervenant();

                    state._fsp--;


                    			current = this_Intervenant_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalText.g:319:3: this_Secretaire_1= ruleSecretaire
                    {

                    			newCompositeNode(grammarAccess.getEmployeAccess().getSecretaireParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Secretaire_1=ruleSecretaire();

                    state._fsp--;


                    			current = this_Secretaire_1;
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
    // $ANTLR end "ruleEmploye"


    // $ANTLR start "entryRuleSecretaire"
    // InternalText.g:331:1: entryRuleSecretaire returns [EObject current=null] : iv_ruleSecretaire= ruleSecretaire EOF ;
    public final EObject entryRuleSecretaire() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecretaire = null;


        try {
            // InternalText.g:331:51: (iv_ruleSecretaire= ruleSecretaire EOF )
            // InternalText.g:332:2: iv_ruleSecretaire= ruleSecretaire EOF
            {
             newCompositeNode(grammarAccess.getSecretaireRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSecretaire=ruleSecretaire();

            state._fsp--;

             current =iv_ruleSecretaire; 
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
    // $ANTLR end "entryRuleSecretaire"


    // $ANTLR start "ruleSecretaire"
    // InternalText.g:338:1: ruleSecretaire returns [EObject current=null] : (otherlv_0= 'Secretaire' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Telephone' otherlv_4= ':' ( (lv_telephone_5_0= ruleEString ) ) otherlv_6= ';' otherlv_7= 'Bureau' otherlv_8= ':' ( (lv_bureau_9_0= ruleEString ) ) otherlv_10= ';' otherlv_11= 'Mail' otherlv_12= ':' ( (lv_mail_13_0= ruleEString ) ) otherlv_14= ';' otherlv_15= 'Formation' otherlv_16= ':' ( ( ruleEString ) ) otherlv_18= '}' ) ;
    public final EObject ruleSecretaire() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
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
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_telephone_5_0 = null;

        AntlrDatatypeRuleToken lv_bureau_9_0 = null;

        AntlrDatatypeRuleToken lv_mail_13_0 = null;



        	enterRule();

        try {
            // InternalText.g:344:2: ( (otherlv_0= 'Secretaire' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Telephone' otherlv_4= ':' ( (lv_telephone_5_0= ruleEString ) ) otherlv_6= ';' otherlv_7= 'Bureau' otherlv_8= ':' ( (lv_bureau_9_0= ruleEString ) ) otherlv_10= ';' otherlv_11= 'Mail' otherlv_12= ':' ( (lv_mail_13_0= ruleEString ) ) otherlv_14= ';' otherlv_15= 'Formation' otherlv_16= ':' ( ( ruleEString ) ) otherlv_18= '}' ) )
            // InternalText.g:345:2: (otherlv_0= 'Secretaire' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Telephone' otherlv_4= ':' ( (lv_telephone_5_0= ruleEString ) ) otherlv_6= ';' otherlv_7= 'Bureau' otherlv_8= ':' ( (lv_bureau_9_0= ruleEString ) ) otherlv_10= ';' otherlv_11= 'Mail' otherlv_12= ':' ( (lv_mail_13_0= ruleEString ) ) otherlv_14= ';' otherlv_15= 'Formation' otherlv_16= ':' ( ( ruleEString ) ) otherlv_18= '}' )
            {
            // InternalText.g:345:2: (otherlv_0= 'Secretaire' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Telephone' otherlv_4= ':' ( (lv_telephone_5_0= ruleEString ) ) otherlv_6= ';' otherlv_7= 'Bureau' otherlv_8= ':' ( (lv_bureau_9_0= ruleEString ) ) otherlv_10= ';' otherlv_11= 'Mail' otherlv_12= ':' ( (lv_mail_13_0= ruleEString ) ) otherlv_14= ';' otherlv_15= 'Formation' otherlv_16= ':' ( ( ruleEString ) ) otherlv_18= '}' )
            // InternalText.g:346:3: otherlv_0= 'Secretaire' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Telephone' otherlv_4= ':' ( (lv_telephone_5_0= ruleEString ) ) otherlv_6= ';' otherlv_7= 'Bureau' otherlv_8= ':' ( (lv_bureau_9_0= ruleEString ) ) otherlv_10= ';' otherlv_11= 'Mail' otherlv_12= ':' ( (lv_mail_13_0= ruleEString ) ) otherlv_14= ';' otherlv_15= 'Formation' otherlv_16= ':' ( ( ruleEString ) ) otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSecretaireAccess().getSecretaireKeyword_0());
            		
            // InternalText.g:350:3: ( (lv_name_1_0= ruleEString ) )
            // InternalText.g:351:4: (lv_name_1_0= ruleEString )
            {
            // InternalText.g:351:4: (lv_name_1_0= ruleEString )
            // InternalText.g:352:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSecretaireAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSecretaireRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"idm.projet.portail.Text.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getSecretaireAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getSecretaireAccess().getTelephoneKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getSecretaireAccess().getColonKeyword_4());
            		
            // InternalText.g:381:3: ( (lv_telephone_5_0= ruleEString ) )
            // InternalText.g:382:4: (lv_telephone_5_0= ruleEString )
            {
            // InternalText.g:382:4: (lv_telephone_5_0= ruleEString )
            // InternalText.g:383:5: lv_telephone_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSecretaireAccess().getTelephoneEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_telephone_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSecretaireRule());
            					}
            					set(
            						current,
            						"telephone",
            						lv_telephone_5_0,
            						"idm.projet.portail.Text.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getSecretaireAccess().getSemicolonKeyword_6());
            		
            otherlv_7=(Token)match(input,21,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getSecretaireAccess().getBureauKeyword_7());
            		
            otherlv_8=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getSecretaireAccess().getColonKeyword_8());
            		
            // InternalText.g:412:3: ( (lv_bureau_9_0= ruleEString ) )
            // InternalText.g:413:4: (lv_bureau_9_0= ruleEString )
            {
            // InternalText.g:413:4: (lv_bureau_9_0= ruleEString )
            // InternalText.g:414:5: lv_bureau_9_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSecretaireAccess().getBureauEStringParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_8);
            lv_bureau_9_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSecretaireRule());
            					}
            					set(
            						current,
            						"bureau",
            						lv_bureau_9_0,
            						"idm.projet.portail.Text.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,16,FOLLOW_14); 

            			newLeafNode(otherlv_10, grammarAccess.getSecretaireAccess().getSemicolonKeyword_10());
            		
            otherlv_11=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_11, grammarAccess.getSecretaireAccess().getMailKeyword_11());
            		
            otherlv_12=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_12, grammarAccess.getSecretaireAccess().getColonKeyword_12());
            		
            // InternalText.g:443:3: ( (lv_mail_13_0= ruleEString ) )
            // InternalText.g:444:4: (lv_mail_13_0= ruleEString )
            {
            // InternalText.g:444:4: (lv_mail_13_0= ruleEString )
            // InternalText.g:445:5: lv_mail_13_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSecretaireAccess().getMailEStringParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_8);
            lv_mail_13_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSecretaireRule());
            					}
            					set(
            						current,
            						"mail",
            						lv_mail_13_0,
            						"idm.projet.portail.Text.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_14=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_14, grammarAccess.getSecretaireAccess().getSemicolonKeyword_14());
            		
            otherlv_15=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_15, grammarAccess.getSecretaireAccess().getFormationKeyword_15());
            		
            otherlv_16=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_16, grammarAccess.getSecretaireAccess().getColonKeyword_16());
            		
            // InternalText.g:474:3: ( ( ruleEString ) )
            // InternalText.g:475:4: ( ruleEString )
            {
            // InternalText.g:475:4: ( ruleEString )
            // InternalText.g:476:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSecretaireRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSecretaireAccess().getFormationFormationCrossReference_17_0());
            				
            pushFollow(FOLLOW_15);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_18=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getSecretaireAccess().getRightCurlyBracketKeyword_18());
            		

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
    // $ANTLR end "ruleSecretaire"


    // $ANTLR start "entryRuleIntervenant"
    // InternalText.g:498:1: entryRuleIntervenant returns [EObject current=null] : iv_ruleIntervenant= ruleIntervenant EOF ;
    public final EObject entryRuleIntervenant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntervenant = null;


        try {
            // InternalText.g:498:52: (iv_ruleIntervenant= ruleIntervenant EOF )
            // InternalText.g:499:2: iv_ruleIntervenant= ruleIntervenant EOF
            {
             newCompositeNode(grammarAccess.getIntervenantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntervenant=ruleIntervenant();

            state._fsp--;

             current =iv_ruleIntervenant; 
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
    // $ANTLR end "entryRuleIntervenant"


    // $ANTLR start "ruleIntervenant"
    // InternalText.g:505:1: ruleIntervenant returns [EObject current=null] : (otherlv_0= 'Intervenant' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Telephone' otherlv_4= ':' ( (lv_telephone_5_0= ruleEString ) ) otherlv_6= ';' otherlv_7= 'Bureau' otherlv_8= ':' ( (lv_bureau_9_0= ruleEString ) ) otherlv_10= ';' otherlv_11= 'Mail' otherlv_12= ':' ( (lv_mail_13_0= ruleEString ) ) otherlv_14= ';' otherlv_15= 'Specialit\\u00E9' otherlv_16= ':' ( (lv_specialite_17_0= ruleEString ) ) otherlv_18= ';' (otherlv_19= 'Ues intervenants' otherlv_20= ':' ( ( ruleEString ) ) (otherlv_22= ',' ( ( ruleEString ) ) )* )? (otherlv_24= 'Ues responsables' otherlv_25= ':' ( ( ruleEString ) ) (otherlv_27= ',' ( ( ruleEString ) ) )* )? (otherlv_29= 'Responsable formation' otherlv_30= ':' ( ( ruleEString ) ) )? (otherlv_32= 'Responsable parcours' otherlv_33= ':' ( ( ruleEString ) ) )? otherlv_35= '}' ) ;
    public final EObject ruleIntervenant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
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
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_telephone_5_0 = null;

        AntlrDatatypeRuleToken lv_bureau_9_0 = null;

        AntlrDatatypeRuleToken lv_mail_13_0 = null;

        AntlrDatatypeRuleToken lv_specialite_17_0 = null;



        	enterRule();

        try {
            // InternalText.g:511:2: ( (otherlv_0= 'Intervenant' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Telephone' otherlv_4= ':' ( (lv_telephone_5_0= ruleEString ) ) otherlv_6= ';' otherlv_7= 'Bureau' otherlv_8= ':' ( (lv_bureau_9_0= ruleEString ) ) otherlv_10= ';' otherlv_11= 'Mail' otherlv_12= ':' ( (lv_mail_13_0= ruleEString ) ) otherlv_14= ';' otherlv_15= 'Specialit\\u00E9' otherlv_16= ':' ( (lv_specialite_17_0= ruleEString ) ) otherlv_18= ';' (otherlv_19= 'Ues intervenants' otherlv_20= ':' ( ( ruleEString ) ) (otherlv_22= ',' ( ( ruleEString ) ) )* )? (otherlv_24= 'Ues responsables' otherlv_25= ':' ( ( ruleEString ) ) (otherlv_27= ',' ( ( ruleEString ) ) )* )? (otherlv_29= 'Responsable formation' otherlv_30= ':' ( ( ruleEString ) ) )? (otherlv_32= 'Responsable parcours' otherlv_33= ':' ( ( ruleEString ) ) )? otherlv_35= '}' ) )
            // InternalText.g:512:2: (otherlv_0= 'Intervenant' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Telephone' otherlv_4= ':' ( (lv_telephone_5_0= ruleEString ) ) otherlv_6= ';' otherlv_7= 'Bureau' otherlv_8= ':' ( (lv_bureau_9_0= ruleEString ) ) otherlv_10= ';' otherlv_11= 'Mail' otherlv_12= ':' ( (lv_mail_13_0= ruleEString ) ) otherlv_14= ';' otherlv_15= 'Specialit\\u00E9' otherlv_16= ':' ( (lv_specialite_17_0= ruleEString ) ) otherlv_18= ';' (otherlv_19= 'Ues intervenants' otherlv_20= ':' ( ( ruleEString ) ) (otherlv_22= ',' ( ( ruleEString ) ) )* )? (otherlv_24= 'Ues responsables' otherlv_25= ':' ( ( ruleEString ) ) (otherlv_27= ',' ( ( ruleEString ) ) )* )? (otherlv_29= 'Responsable formation' otherlv_30= ':' ( ( ruleEString ) ) )? (otherlv_32= 'Responsable parcours' otherlv_33= ':' ( ( ruleEString ) ) )? otherlv_35= '}' )
            {
            // InternalText.g:512:2: (otherlv_0= 'Intervenant' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Telephone' otherlv_4= ':' ( (lv_telephone_5_0= ruleEString ) ) otherlv_6= ';' otherlv_7= 'Bureau' otherlv_8= ':' ( (lv_bureau_9_0= ruleEString ) ) otherlv_10= ';' otherlv_11= 'Mail' otherlv_12= ':' ( (lv_mail_13_0= ruleEString ) ) otherlv_14= ';' otherlv_15= 'Specialit\\u00E9' otherlv_16= ':' ( (lv_specialite_17_0= ruleEString ) ) otherlv_18= ';' (otherlv_19= 'Ues intervenants' otherlv_20= ':' ( ( ruleEString ) ) (otherlv_22= ',' ( ( ruleEString ) ) )* )? (otherlv_24= 'Ues responsables' otherlv_25= ':' ( ( ruleEString ) ) (otherlv_27= ',' ( ( ruleEString ) ) )* )? (otherlv_29= 'Responsable formation' otherlv_30= ':' ( ( ruleEString ) ) )? (otherlv_32= 'Responsable parcours' otherlv_33= ':' ( ( ruleEString ) ) )? otherlv_35= '}' )
            // InternalText.g:513:3: otherlv_0= 'Intervenant' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Telephone' otherlv_4= ':' ( (lv_telephone_5_0= ruleEString ) ) otherlv_6= ';' otherlv_7= 'Bureau' otherlv_8= ':' ( (lv_bureau_9_0= ruleEString ) ) otherlv_10= ';' otherlv_11= 'Mail' otherlv_12= ':' ( (lv_mail_13_0= ruleEString ) ) otherlv_14= ';' otherlv_15= 'Specialit\\u00E9' otherlv_16= ':' ( (lv_specialite_17_0= ruleEString ) ) otherlv_18= ';' (otherlv_19= 'Ues intervenants' otherlv_20= ':' ( ( ruleEString ) ) (otherlv_22= ',' ( ( ruleEString ) ) )* )? (otherlv_24= 'Ues responsables' otherlv_25= ':' ( ( ruleEString ) ) (otherlv_27= ',' ( ( ruleEString ) ) )* )? (otherlv_29= 'Responsable formation' otherlv_30= ':' ( ( ruleEString ) ) )? (otherlv_32= 'Responsable parcours' otherlv_33= ':' ( ( ruleEString ) ) )? otherlv_35= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getIntervenantAccess().getIntervenantKeyword_0());
            		
            // InternalText.g:517:3: ( (lv_name_1_0= ruleEString ) )
            // InternalText.g:518:4: (lv_name_1_0= ruleEString )
            {
            // InternalText.g:518:4: (lv_name_1_0= ruleEString )
            // InternalText.g:519:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getIntervenantAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntervenantRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"idm.projet.portail.Text.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getIntervenantAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getIntervenantAccess().getTelephoneKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getIntervenantAccess().getColonKeyword_4());
            		
            // InternalText.g:548:3: ( (lv_telephone_5_0= ruleEString ) )
            // InternalText.g:549:4: (lv_telephone_5_0= ruleEString )
            {
            // InternalText.g:549:4: (lv_telephone_5_0= ruleEString )
            // InternalText.g:550:5: lv_telephone_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getIntervenantAccess().getTelephoneEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_telephone_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntervenantRule());
            					}
            					set(
            						current,
            						"telephone",
            						lv_telephone_5_0,
            						"idm.projet.portail.Text.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getIntervenantAccess().getSemicolonKeyword_6());
            		
            otherlv_7=(Token)match(input,21,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getIntervenantAccess().getBureauKeyword_7());
            		
            otherlv_8=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getIntervenantAccess().getColonKeyword_8());
            		
            // InternalText.g:579:3: ( (lv_bureau_9_0= ruleEString ) )
            // InternalText.g:580:4: (lv_bureau_9_0= ruleEString )
            {
            // InternalText.g:580:4: (lv_bureau_9_0= ruleEString )
            // InternalText.g:581:5: lv_bureau_9_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getIntervenantAccess().getBureauEStringParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_8);
            lv_bureau_9_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntervenantRule());
            					}
            					set(
            						current,
            						"bureau",
            						lv_bureau_9_0,
            						"idm.projet.portail.Text.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,16,FOLLOW_14); 

            			newLeafNode(otherlv_10, grammarAccess.getIntervenantAccess().getSemicolonKeyword_10());
            		
            otherlv_11=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_11, grammarAccess.getIntervenantAccess().getMailKeyword_11());
            		
            otherlv_12=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_12, grammarAccess.getIntervenantAccess().getColonKeyword_12());
            		
            // InternalText.g:610:3: ( (lv_mail_13_0= ruleEString ) )
            // InternalText.g:611:4: (lv_mail_13_0= ruleEString )
            {
            // InternalText.g:611:4: (lv_mail_13_0= ruleEString )
            // InternalText.g:612:5: lv_mail_13_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getIntervenantAccess().getMailEStringParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_8);
            lv_mail_13_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntervenantRule());
            					}
            					set(
            						current,
            						"mail",
            						lv_mail_13_0,
            						"idm.projet.portail.Text.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_14=(Token)match(input,16,FOLLOW_16); 

            			newLeafNode(otherlv_14, grammarAccess.getIntervenantAccess().getSemicolonKeyword_14());
            		
            otherlv_15=(Token)match(input,25,FOLLOW_7); 

            			newLeafNode(otherlv_15, grammarAccess.getIntervenantAccess().getSpecialitKeyword_15());
            		
            otherlv_16=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_16, grammarAccess.getIntervenantAccess().getColonKeyword_16());
            		
            // InternalText.g:641:3: ( (lv_specialite_17_0= ruleEString ) )
            // InternalText.g:642:4: (lv_specialite_17_0= ruleEString )
            {
            // InternalText.g:642:4: (lv_specialite_17_0= ruleEString )
            // InternalText.g:643:5: lv_specialite_17_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getIntervenantAccess().getSpecialiteEStringParserRuleCall_17_0());
            				
            pushFollow(FOLLOW_8);
            lv_specialite_17_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntervenantRule());
            					}
            					set(
            						current,
            						"specialite",
            						lv_specialite_17_0,
            						"idm.projet.portail.Text.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_18=(Token)match(input,16,FOLLOW_17); 

            			newLeafNode(otherlv_18, grammarAccess.getIntervenantAccess().getSemicolonKeyword_18());
            		
            // InternalText.g:664:3: (otherlv_19= 'Ues intervenants' otherlv_20= ':' ( ( ruleEString ) ) (otherlv_22= ',' ( ( ruleEString ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==26) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalText.g:665:4: otherlv_19= 'Ues intervenants' otherlv_20= ':' ( ( ruleEString ) ) (otherlv_22= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_19=(Token)match(input,26,FOLLOW_7); 

                    				newLeafNode(otherlv_19, grammarAccess.getIntervenantAccess().getUesIntervenantsKeyword_19_0());
                    			
                    otherlv_20=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_20, grammarAccess.getIntervenantAccess().getColonKeyword_19_1());
                    			
                    // InternalText.g:673:4: ( ( ruleEString ) )
                    // InternalText.g:674:5: ( ruleEString )
                    {
                    // InternalText.g:674:5: ( ruleEString )
                    // InternalText.g:675:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIntervenantRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getIntervenantAccess().getUesIntervenantUECrossReference_19_2_0());
                    					
                    pushFollow(FOLLOW_18);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalText.g:689:4: (otherlv_22= ',' ( ( ruleEString ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==27) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalText.g:690:5: otherlv_22= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_22=(Token)match(input,27,FOLLOW_3); 

                    	    					newLeafNode(otherlv_22, grammarAccess.getIntervenantAccess().getCommaKeyword_19_3_0());
                    	    				
                    	    // InternalText.g:694:5: ( ( ruleEString ) )
                    	    // InternalText.g:695:6: ( ruleEString )
                    	    {
                    	    // InternalText.g:695:6: ( ruleEString )
                    	    // InternalText.g:696:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getIntervenantRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getIntervenantAccess().getUesIntervenantUECrossReference_19_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    ruleEString();

                    	    state._fsp--;


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

            // InternalText.g:712:3: (otherlv_24= 'Ues responsables' otherlv_25= ':' ( ( ruleEString ) ) (otherlv_27= ',' ( ( ruleEString ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==28) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalText.g:713:4: otherlv_24= 'Ues responsables' otherlv_25= ':' ( ( ruleEString ) ) (otherlv_27= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_24=(Token)match(input,28,FOLLOW_7); 

                    				newLeafNode(otherlv_24, grammarAccess.getIntervenantAccess().getUesResponsablesKeyword_20_0());
                    			
                    otherlv_25=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_25, grammarAccess.getIntervenantAccess().getColonKeyword_20_1());
                    			
                    // InternalText.g:721:4: ( ( ruleEString ) )
                    // InternalText.g:722:5: ( ruleEString )
                    {
                    // InternalText.g:722:5: ( ruleEString )
                    // InternalText.g:723:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIntervenantRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getIntervenantAccess().getUesResponsableUECrossReference_20_2_0());
                    					
                    pushFollow(FOLLOW_19);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalText.g:737:4: (otherlv_27= ',' ( ( ruleEString ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==27) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalText.g:738:5: otherlv_27= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_27=(Token)match(input,27,FOLLOW_3); 

                    	    					newLeafNode(otherlv_27, grammarAccess.getIntervenantAccess().getCommaKeyword_20_3_0());
                    	    				
                    	    // InternalText.g:742:5: ( ( ruleEString ) )
                    	    // InternalText.g:743:6: ( ruleEString )
                    	    {
                    	    // InternalText.g:743:6: ( ruleEString )
                    	    // InternalText.g:744:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getIntervenantRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getIntervenantAccess().getUesResponsableUECrossReference_20_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalText.g:760:3: (otherlv_29= 'Responsable formation' otherlv_30= ':' ( ( ruleEString ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==29) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalText.g:761:4: otherlv_29= 'Responsable formation' otherlv_30= ':' ( ( ruleEString ) )
                    {
                    otherlv_29=(Token)match(input,29,FOLLOW_7); 

                    				newLeafNode(otherlv_29, grammarAccess.getIntervenantAccess().getResponsableFormationKeyword_21_0());
                    			
                    otherlv_30=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_30, grammarAccess.getIntervenantAccess().getColonKeyword_21_1());
                    			
                    // InternalText.g:769:4: ( ( ruleEString ) )
                    // InternalText.g:770:5: ( ruleEString )
                    {
                    // InternalText.g:770:5: ( ruleEString )
                    // InternalText.g:771:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIntervenantRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getIntervenantAccess().getResponsableFormationFormationCrossReference_21_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalText.g:786:3: (otherlv_32= 'Responsable parcours' otherlv_33= ':' ( ( ruleEString ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==30) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalText.g:787:4: otherlv_32= 'Responsable parcours' otherlv_33= ':' ( ( ruleEString ) )
                    {
                    otherlv_32=(Token)match(input,30,FOLLOW_7); 

                    				newLeafNode(otherlv_32, grammarAccess.getIntervenantAccess().getResponsableParcoursKeyword_22_0());
                    			
                    otherlv_33=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_33, grammarAccess.getIntervenantAccess().getColonKeyword_22_1());
                    			
                    // InternalText.g:795:4: ( ( ruleEString ) )
                    // InternalText.g:796:5: ( ruleEString )
                    {
                    // InternalText.g:796:5: ( ruleEString )
                    // InternalText.g:797:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIntervenantRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getIntervenantAccess().getResponsableParcoursParcoursCrossReference_22_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_35=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_35, grammarAccess.getIntervenantAccess().getRightCurlyBracketKeyword_23());
            		

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
    // $ANTLR end "ruleIntervenant"


    // $ANTLR start "entryRuleEString"
    // InternalText.g:820:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalText.g:820:47: (iv_ruleEString= ruleEString EOF )
            // InternalText.g:821:2: iv_ruleEString= ruleEString EOF
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
    // InternalText.g:827:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalText.g:833:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalText.g:834:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalText.g:834:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalText.g:835:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalText.g:843:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleFormation"
    // InternalText.g:854:1: entryRuleFormation returns [EObject current=null] : iv_ruleFormation= ruleFormation EOF ;
    public final EObject entryRuleFormation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormation = null;


        try {
            // InternalText.g:854:50: (iv_ruleFormation= ruleFormation EOF )
            // InternalText.g:855:2: iv_ruleFormation= ruleFormation EOF
            {
             newCompositeNode(grammarAccess.getFormationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFormation=ruleFormation();

            state._fsp--;

             current =iv_ruleFormation; 
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
    // $ANTLR end "entryRuleFormation"


    // $ANTLR start "ruleFormation"
    // InternalText.g:861:1: ruleFormation returns [EObject current=null] : (otherlv_0= 'Formation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Description' otherlv_4= ':' ( (lv_description_5_0= ruleEString ) ) otherlv_6= ';' otherlv_7= 'Credit' otherlv_8= ':' ( (lv_credit_9_0= ruleEInt ) ) otherlv_10= ';' otherlv_11= 'Secretaires' otherlv_12= ':' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ';' otherlv_17= 'Responsables formation' otherlv_18= ':' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ';' ( ( (lv_ues_23_0= ruleUE ) ) | ( (lv_parcours_24_0= ruleParcours ) ) )* otherlv_25= '}' ) ;
    public final EObject ruleFormation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_25=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_description_5_0 = null;

        AntlrDatatypeRuleToken lv_credit_9_0 = null;

        EObject lv_ues_23_0 = null;

        EObject lv_parcours_24_0 = null;



        	enterRule();

        try {
            // InternalText.g:867:2: ( (otherlv_0= 'Formation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Description' otherlv_4= ':' ( (lv_description_5_0= ruleEString ) ) otherlv_6= ';' otherlv_7= 'Credit' otherlv_8= ':' ( (lv_credit_9_0= ruleEInt ) ) otherlv_10= ';' otherlv_11= 'Secretaires' otherlv_12= ':' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ';' otherlv_17= 'Responsables formation' otherlv_18= ':' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ';' ( ( (lv_ues_23_0= ruleUE ) ) | ( (lv_parcours_24_0= ruleParcours ) ) )* otherlv_25= '}' ) )
            // InternalText.g:868:2: (otherlv_0= 'Formation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Description' otherlv_4= ':' ( (lv_description_5_0= ruleEString ) ) otherlv_6= ';' otherlv_7= 'Credit' otherlv_8= ':' ( (lv_credit_9_0= ruleEInt ) ) otherlv_10= ';' otherlv_11= 'Secretaires' otherlv_12= ':' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ';' otherlv_17= 'Responsables formation' otherlv_18= ':' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ';' ( ( (lv_ues_23_0= ruleUE ) ) | ( (lv_parcours_24_0= ruleParcours ) ) )* otherlv_25= '}' )
            {
            // InternalText.g:868:2: (otherlv_0= 'Formation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Description' otherlv_4= ':' ( (lv_description_5_0= ruleEString ) ) otherlv_6= ';' otherlv_7= 'Credit' otherlv_8= ':' ( (lv_credit_9_0= ruleEInt ) ) otherlv_10= ';' otherlv_11= 'Secretaires' otherlv_12= ':' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ';' otherlv_17= 'Responsables formation' otherlv_18= ':' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ';' ( ( (lv_ues_23_0= ruleUE ) ) | ( (lv_parcours_24_0= ruleParcours ) ) )* otherlv_25= '}' )
            // InternalText.g:869:3: otherlv_0= 'Formation' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Description' otherlv_4= ':' ( (lv_description_5_0= ruleEString ) ) otherlv_6= ';' otherlv_7= 'Credit' otherlv_8= ':' ( (lv_credit_9_0= ruleEInt ) ) otherlv_10= ';' otherlv_11= 'Secretaires' otherlv_12= ':' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ';' otherlv_17= 'Responsables formation' otherlv_18= ':' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ';' ( ( (lv_ues_23_0= ruleUE ) ) | ( (lv_parcours_24_0= ruleParcours ) ) )* otherlv_25= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFormationAccess().getFormationKeyword_0());
            		
            // InternalText.g:873:3: ( (lv_name_1_0= ruleEString ) )
            // InternalText.g:874:4: (lv_name_1_0= ruleEString )
            {
            // InternalText.g:874:4: (lv_name_1_0= ruleEString )
            // InternalText.g:875:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFormationAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFormationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"idm.projet.portail.Text.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getFormationAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getFormationAccess().getDescriptionKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getFormationAccess().getColonKeyword_4());
            		
            // InternalText.g:904:3: ( (lv_description_5_0= ruleEString ) )
            // InternalText.g:905:4: (lv_description_5_0= ruleEString )
            {
            // InternalText.g:905:4: (lv_description_5_0= ruleEString )
            // InternalText.g:906:5: lv_description_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFormationAccess().getDescriptionEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_description_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFormationRule());
            					}
            					set(
            						current,
            						"description",
            						lv_description_5_0,
            						"idm.projet.portail.Text.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_21); 

            			newLeafNode(otherlv_6, grammarAccess.getFormationAccess().getSemicolonKeyword_6());
            		
            otherlv_7=(Token)match(input,31,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getFormationAccess().getCreditKeyword_7());
            		
            otherlv_8=(Token)match(input,15,FOLLOW_22); 

            			newLeafNode(otherlv_8, grammarAccess.getFormationAccess().getColonKeyword_8());
            		
            // InternalText.g:935:3: ( (lv_credit_9_0= ruleEInt ) )
            // InternalText.g:936:4: (lv_credit_9_0= ruleEInt )
            {
            // InternalText.g:936:4: (lv_credit_9_0= ruleEInt )
            // InternalText.g:937:5: lv_credit_9_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getFormationAccess().getCreditEIntParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_8);
            lv_credit_9_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFormationRule());
            					}
            					set(
            						current,
            						"credit",
            						lv_credit_9_0,
            						"idm.projet.portail.Text.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,16,FOLLOW_23); 

            			newLeafNode(otherlv_10, grammarAccess.getFormationAccess().getSemicolonKeyword_10());
            		
            otherlv_11=(Token)match(input,32,FOLLOW_7); 

            			newLeafNode(otherlv_11, grammarAccess.getFormationAccess().getSecretairesKeyword_11());
            		
            otherlv_12=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_12, grammarAccess.getFormationAccess().getColonKeyword_12());
            		
            // InternalText.g:966:3: ( ( ruleEString ) )
            // InternalText.g:967:4: ( ruleEString )
            {
            // InternalText.g:967:4: ( ruleEString )
            // InternalText.g:968:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFormationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getFormationAccess().getSecretairesSecretaireCrossReference_13_0());
            				
            pushFollow(FOLLOW_24);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalText.g:982:3: (otherlv_14= ',' ( ( ruleEString ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==27) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalText.g:983:4: otherlv_14= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_14=(Token)match(input,27,FOLLOW_3); 

            	    				newLeafNode(otherlv_14, grammarAccess.getFormationAccess().getCommaKeyword_14_0());
            	    			
            	    // InternalText.g:987:4: ( ( ruleEString ) )
            	    // InternalText.g:988:5: ( ruleEString )
            	    {
            	    // InternalText.g:988:5: ( ruleEString )
            	    // InternalText.g:989:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getFormationRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getFormationAccess().getSecretairesSecretaireCrossReference_14_1_0());
            	    					
            	    pushFollow(FOLLOW_24);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_16=(Token)match(input,16,FOLLOW_25); 

            			newLeafNode(otherlv_16, grammarAccess.getFormationAccess().getSemicolonKeyword_15());
            		
            otherlv_17=(Token)match(input,33,FOLLOW_7); 

            			newLeafNode(otherlv_17, grammarAccess.getFormationAccess().getResponsablesFormationKeyword_16());
            		
            otherlv_18=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_18, grammarAccess.getFormationAccess().getColonKeyword_17());
            		
            // InternalText.g:1016:3: ( ( ruleEString ) )
            // InternalText.g:1017:4: ( ruleEString )
            {
            // InternalText.g:1017:4: ( ruleEString )
            // InternalText.g:1018:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFormationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getFormationAccess().getResponsablesFormationIntervenantCrossReference_18_0());
            				
            pushFollow(FOLLOW_24);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalText.g:1032:3: (otherlv_20= ',' ( ( ruleEString ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==27) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalText.g:1033:4: otherlv_20= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_20=(Token)match(input,27,FOLLOW_3); 

            	    				newLeafNode(otherlv_20, grammarAccess.getFormationAccess().getCommaKeyword_19_0());
            	    			
            	    // InternalText.g:1037:4: ( ( ruleEString ) )
            	    // InternalText.g:1038:5: ( ruleEString )
            	    {
            	    // InternalText.g:1038:5: ( ruleEString )
            	    // InternalText.g:1039:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getFormationRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getFormationAccess().getResponsablesFormationIntervenantCrossReference_19_1_0());
            	    					
            	    pushFollow(FOLLOW_24);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_22=(Token)match(input,16,FOLLOW_26); 

            			newLeafNode(otherlv_22, grammarAccess.getFormationAccess().getSemicolonKeyword_20());
            		
            // InternalText.g:1058:3: ( ( (lv_ues_23_0= ruleUE ) ) | ( (lv_parcours_24_0= ruleParcours ) ) )*
            loop13:
            do {
                int alt13=3;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==38) ) {
                    alt13=1;
                }
                else if ( (LA13_0==35) ) {
                    alt13=2;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalText.g:1059:4: ( (lv_ues_23_0= ruleUE ) )
            	    {
            	    // InternalText.g:1059:4: ( (lv_ues_23_0= ruleUE ) )
            	    // InternalText.g:1060:5: (lv_ues_23_0= ruleUE )
            	    {
            	    // InternalText.g:1060:5: (lv_ues_23_0= ruleUE )
            	    // InternalText.g:1061:6: lv_ues_23_0= ruleUE
            	    {

            	    						newCompositeNode(grammarAccess.getFormationAccess().getUesUEParserRuleCall_21_0_0());
            	    					
            	    pushFollow(FOLLOW_26);
            	    lv_ues_23_0=ruleUE();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFormationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ues",
            	    							lv_ues_23_0,
            	    							"idm.projet.portail.Text.UE");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalText.g:1079:4: ( (lv_parcours_24_0= ruleParcours ) )
            	    {
            	    // InternalText.g:1079:4: ( (lv_parcours_24_0= ruleParcours ) )
            	    // InternalText.g:1080:5: (lv_parcours_24_0= ruleParcours )
            	    {
            	    // InternalText.g:1080:5: (lv_parcours_24_0= ruleParcours )
            	    // InternalText.g:1081:6: lv_parcours_24_0= ruleParcours
            	    {

            	    						newCompositeNode(grammarAccess.getFormationAccess().getParcoursParcoursParserRuleCall_21_1_0());
            	    					
            	    pushFollow(FOLLOW_26);
            	    lv_parcours_24_0=ruleParcours();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFormationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"parcours",
            	    							lv_parcours_24_0,
            	    							"idm.projet.portail.Text.Parcours");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_25=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_25, grammarAccess.getFormationAccess().getRightCurlyBracketKeyword_22());
            		

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
    // $ANTLR end "ruleFormation"


    // $ANTLR start "entryRuleEInt"
    // InternalText.g:1107:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalText.g:1107:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalText.g:1108:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalText.g:1114:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalText.g:1120:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalText.g:1121:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalText.g:1121:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalText.g:1122:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalText.g:1122:3: (kw= '-' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==34) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalText.g:1123:4: kw= '-'
                    {
                    kw=(Token)match(input,34,FOLLOW_27); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleParcours"
    // InternalText.g:1140:1: entryRuleParcours returns [EObject current=null] : iv_ruleParcours= ruleParcours EOF ;
    public final EObject entryRuleParcours() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParcours = null;


        try {
            // InternalText.g:1140:49: (iv_ruleParcours= ruleParcours EOF )
            // InternalText.g:1141:2: iv_ruleParcours= ruleParcours EOF
            {
             newCompositeNode(grammarAccess.getParcoursRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParcours=ruleParcours();

            state._fsp--;

             current =iv_ruleParcours; 
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
    // $ANTLR end "entryRuleParcours"


    // $ANTLR start "ruleParcours"
    // InternalText.g:1147:1: ruleParcours returns [EObject current=null] : (otherlv_0= 'Parcours' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Description' otherlv_4= ':' ( (lv_description_5_0= ruleEString ) ) otherlv_6= ';' otherlv_7= 'Comp\\u00E9tences' otherlv_8= ':' ( (lv_competence_9_0= ruleEString ) ) otherlv_10= ';' otherlv_11= 'D\\u00E9bouch\\u00E9s' otherlv_12= ':' ( (lv_debouche_13_0= ruleEString ) ) otherlv_14= ';' otherlv_15= 'Responsable parcours' otherlv_16= ':' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ';' ( (lv_semestres_21_0= ruleSemestre ) ) ( (lv_semestres_22_0= ruleSemestre ) )* otherlv_23= '}' ) ;
    public final EObject ruleParcours() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
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
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_description_5_0 = null;

        AntlrDatatypeRuleToken lv_competence_9_0 = null;

        AntlrDatatypeRuleToken lv_debouche_13_0 = null;

        EObject lv_semestres_21_0 = null;

        EObject lv_semestres_22_0 = null;



        	enterRule();

        try {
            // InternalText.g:1153:2: ( (otherlv_0= 'Parcours' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Description' otherlv_4= ':' ( (lv_description_5_0= ruleEString ) ) otherlv_6= ';' otherlv_7= 'Comp\\u00E9tences' otherlv_8= ':' ( (lv_competence_9_0= ruleEString ) ) otherlv_10= ';' otherlv_11= 'D\\u00E9bouch\\u00E9s' otherlv_12= ':' ( (lv_debouche_13_0= ruleEString ) ) otherlv_14= ';' otherlv_15= 'Responsable parcours' otherlv_16= ':' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ';' ( (lv_semestres_21_0= ruleSemestre ) ) ( (lv_semestres_22_0= ruleSemestre ) )* otherlv_23= '}' ) )
            // InternalText.g:1154:2: (otherlv_0= 'Parcours' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Description' otherlv_4= ':' ( (lv_description_5_0= ruleEString ) ) otherlv_6= ';' otherlv_7= 'Comp\\u00E9tences' otherlv_8= ':' ( (lv_competence_9_0= ruleEString ) ) otherlv_10= ';' otherlv_11= 'D\\u00E9bouch\\u00E9s' otherlv_12= ':' ( (lv_debouche_13_0= ruleEString ) ) otherlv_14= ';' otherlv_15= 'Responsable parcours' otherlv_16= ':' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ';' ( (lv_semestres_21_0= ruleSemestre ) ) ( (lv_semestres_22_0= ruleSemestre ) )* otherlv_23= '}' )
            {
            // InternalText.g:1154:2: (otherlv_0= 'Parcours' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Description' otherlv_4= ':' ( (lv_description_5_0= ruleEString ) ) otherlv_6= ';' otherlv_7= 'Comp\\u00E9tences' otherlv_8= ':' ( (lv_competence_9_0= ruleEString ) ) otherlv_10= ';' otherlv_11= 'D\\u00E9bouch\\u00E9s' otherlv_12= ':' ( (lv_debouche_13_0= ruleEString ) ) otherlv_14= ';' otherlv_15= 'Responsable parcours' otherlv_16= ':' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ';' ( (lv_semestres_21_0= ruleSemestre ) ) ( (lv_semestres_22_0= ruleSemestre ) )* otherlv_23= '}' )
            // InternalText.g:1155:3: otherlv_0= 'Parcours' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Description' otherlv_4= ':' ( (lv_description_5_0= ruleEString ) ) otherlv_6= ';' otherlv_7= 'Comp\\u00E9tences' otherlv_8= ':' ( (lv_competence_9_0= ruleEString ) ) otherlv_10= ';' otherlv_11= 'D\\u00E9bouch\\u00E9s' otherlv_12= ':' ( (lv_debouche_13_0= ruleEString ) ) otherlv_14= ';' otherlv_15= 'Responsable parcours' otherlv_16= ':' ( ( ruleEString ) ) (otherlv_18= ',' ( ( ruleEString ) ) )* otherlv_20= ';' ( (lv_semestres_21_0= ruleSemestre ) ) ( (lv_semestres_22_0= ruleSemestre ) )* otherlv_23= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getParcoursAccess().getParcoursKeyword_0());
            		
            // InternalText.g:1159:3: ( (lv_name_1_0= ruleEString ) )
            // InternalText.g:1160:4: (lv_name_1_0= ruleEString )
            {
            // InternalText.g:1160:4: (lv_name_1_0= ruleEString )
            // InternalText.g:1161:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParcoursAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParcoursRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"idm.projet.portail.Text.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getParcoursAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getParcoursAccess().getDescriptionKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getParcoursAccess().getColonKeyword_4());
            		
            // InternalText.g:1190:3: ( (lv_description_5_0= ruleEString ) )
            // InternalText.g:1191:4: (lv_description_5_0= ruleEString )
            {
            // InternalText.g:1191:4: (lv_description_5_0= ruleEString )
            // InternalText.g:1192:5: lv_description_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParcoursAccess().getDescriptionEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_description_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParcoursRule());
            					}
            					set(
            						current,
            						"description",
            						lv_description_5_0,
            						"idm.projet.portail.Text.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_28); 

            			newLeafNode(otherlv_6, grammarAccess.getParcoursAccess().getSemicolonKeyword_6());
            		
            otherlv_7=(Token)match(input,36,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getParcoursAccess().getCompTencesKeyword_7());
            		
            otherlv_8=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getParcoursAccess().getColonKeyword_8());
            		
            // InternalText.g:1221:3: ( (lv_competence_9_0= ruleEString ) )
            // InternalText.g:1222:4: (lv_competence_9_0= ruleEString )
            {
            // InternalText.g:1222:4: (lv_competence_9_0= ruleEString )
            // InternalText.g:1223:5: lv_competence_9_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParcoursAccess().getCompetenceEStringParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_8);
            lv_competence_9_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParcoursRule());
            					}
            					set(
            						current,
            						"competence",
            						lv_competence_9_0,
            						"idm.projet.portail.Text.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,16,FOLLOW_29); 

            			newLeafNode(otherlv_10, grammarAccess.getParcoursAccess().getSemicolonKeyword_10());
            		
            otherlv_11=(Token)match(input,37,FOLLOW_7); 

            			newLeafNode(otherlv_11, grammarAccess.getParcoursAccess().getDBouchSKeyword_11());
            		
            otherlv_12=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_12, grammarAccess.getParcoursAccess().getColonKeyword_12());
            		
            // InternalText.g:1252:3: ( (lv_debouche_13_0= ruleEString ) )
            // InternalText.g:1253:4: (lv_debouche_13_0= ruleEString )
            {
            // InternalText.g:1253:4: (lv_debouche_13_0= ruleEString )
            // InternalText.g:1254:5: lv_debouche_13_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParcoursAccess().getDeboucheEStringParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_8);
            lv_debouche_13_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParcoursRule());
            					}
            					set(
            						current,
            						"debouche",
            						lv_debouche_13_0,
            						"idm.projet.portail.Text.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_14=(Token)match(input,16,FOLLOW_30); 

            			newLeafNode(otherlv_14, grammarAccess.getParcoursAccess().getSemicolonKeyword_14());
            		
            otherlv_15=(Token)match(input,30,FOLLOW_7); 

            			newLeafNode(otherlv_15, grammarAccess.getParcoursAccess().getResponsableParcoursKeyword_15());
            		
            otherlv_16=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_16, grammarAccess.getParcoursAccess().getColonKeyword_16());
            		
            // InternalText.g:1283:3: ( ( ruleEString ) )
            // InternalText.g:1284:4: ( ruleEString )
            {
            // InternalText.g:1284:4: ( ruleEString )
            // InternalText.g:1285:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParcoursRule());
            					}
            				

            					newCompositeNode(grammarAccess.getParcoursAccess().getResponsableParcoursIntervenantCrossReference_17_0());
            				
            pushFollow(FOLLOW_24);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalText.g:1299:3: (otherlv_18= ',' ( ( ruleEString ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==27) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalText.g:1300:4: otherlv_18= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_18=(Token)match(input,27,FOLLOW_3); 

            	    				newLeafNode(otherlv_18, grammarAccess.getParcoursAccess().getCommaKeyword_18_0());
            	    			
            	    // InternalText.g:1304:4: ( ( ruleEString ) )
            	    // InternalText.g:1305:5: ( ruleEString )
            	    {
            	    // InternalText.g:1305:5: ( ruleEString )
            	    // InternalText.g:1306:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getParcoursRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getParcoursAccess().getResponsableParcoursIntervenantCrossReference_18_1_0());
            	    					
            	    pushFollow(FOLLOW_24);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_20=(Token)match(input,16,FOLLOW_31); 

            			newLeafNode(otherlv_20, grammarAccess.getParcoursAccess().getSemicolonKeyword_19());
            		
            // InternalText.g:1325:3: ( (lv_semestres_21_0= ruleSemestre ) )
            // InternalText.g:1326:4: (lv_semestres_21_0= ruleSemestre )
            {
            // InternalText.g:1326:4: (lv_semestres_21_0= ruleSemestre )
            // InternalText.g:1327:5: lv_semestres_21_0= ruleSemestre
            {

            					newCompositeNode(grammarAccess.getParcoursAccess().getSemestresSemestreParserRuleCall_20_0());
            				
            pushFollow(FOLLOW_32);
            lv_semestres_21_0=ruleSemestre();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParcoursRule());
            					}
            					add(
            						current,
            						"semestres",
            						lv_semestres_21_0,
            						"idm.projet.portail.Text.Semestre");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalText.g:1344:3: ( (lv_semestres_22_0= ruleSemestre ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==49) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalText.g:1345:4: (lv_semestres_22_0= ruleSemestre )
            	    {
            	    // InternalText.g:1345:4: (lv_semestres_22_0= ruleSemestre )
            	    // InternalText.g:1346:5: lv_semestres_22_0= ruleSemestre
            	    {

            	    					newCompositeNode(grammarAccess.getParcoursAccess().getSemestresSemestreParserRuleCall_21_0());
            	    				
            	    pushFollow(FOLLOW_32);
            	    lv_semestres_22_0=ruleSemestre();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getParcoursRule());
            	    					}
            	    					add(
            	    						current,
            	    						"semestres",
            	    						lv_semestres_22_0,
            	    						"idm.projet.portail.Text.Semestre");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_23=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_23, grammarAccess.getParcoursAccess().getRightCurlyBracketKeyword_22());
            		

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
    // $ANTLR end "ruleParcours"


    // $ANTLR start "entryRuleUE"
    // InternalText.g:1371:1: entryRuleUE returns [EObject current=null] : iv_ruleUE= ruleUE EOF ;
    public final EObject entryRuleUE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUE = null;


        try {
            // InternalText.g:1371:43: (iv_ruleUE= ruleUE EOF )
            // InternalText.g:1372:2: iv_ruleUE= ruleUE EOF
            {
             newCompositeNode(grammarAccess.getUERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUE=ruleUE();

            state._fsp--;

             current =iv_ruleUE; 
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
    // $ANTLR end "entryRuleUE"


    // $ANTLR start "ruleUE"
    // InternalText.g:1378:1: ruleUE returns [EObject current=null] : (otherlv_0= 'UE' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Description' otherlv_4= ':' ( (lv_description_5_0= ruleEString ) ) otherlv_6= ';' otherlv_7= 'Objectif' otherlv_8= ':' ( (lv_objectif_9_0= ruleEString ) ) otherlv_10= ';' otherlv_11= 'Competence' otherlv_12= ':' ( (lv_competence_13_0= ruleEString ) ) otherlv_14= ';' otherlv_15= 'Evaluation' otherlv_16= ':' ( (lv_evaluation_17_0= ruleEString ) ) otherlv_18= ';' otherlv_19= 'Programme' otherlv_20= ':' ( (lv_programme_21_0= ruleEString ) ) otherlv_22= ';' otherlv_23= 'Type enseignement' otherlv_24= ':' ( (lv_typeEnseignement_25_0= ruleEString ) ) otherlv_26= ';' otherlv_27= 'Credit' otherlv_28= ':' ( (lv_Credit_29_0= ruleEInt ) ) otherlv_30= ';' otherlv_31= 'Nombre d\\'heure de cours magistrals' otherlv_32= ':' ( (lv_heureCM_33_0= ruleEInt ) ) otherlv_34= ';' otherlv_35= 'Nombre d\\'heure de travaux dirig\\u00E9s' otherlv_36= ':' ( (lv_heureTD_37_0= ruleEInt ) ) otherlv_38= ';' otherlv_39= 'Nombre d\\'heure de travaux pratiques' otherlv_40= ':' ( (lv_heureTP_41_0= ruleEInt ) ) otherlv_42= ';' otherlv_43= 'Responsables' otherlv_44= ':' ( ( ruleEString ) ) (otherlv_46= ',' ( ( ruleEString ) ) )* otherlv_48= ';' otherlv_49= 'Intervenants' otherlv_50= ':' ( ( ruleEString ) ) (otherlv_52= ',' ( ( ruleEString ) ) )* otherlv_54= ';' ( (lv_seances_55_0= ruleSeance ) ) ( (lv_seances_56_0= ruleSeance ) )* otherlv_57= '}' ) ;
    public final EObject ruleUE() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
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
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token otherlv_40=null;
        Token otherlv_42=null;
        Token otherlv_43=null;
        Token otherlv_44=null;
        Token otherlv_46=null;
        Token otherlv_48=null;
        Token otherlv_49=null;
        Token otherlv_50=null;
        Token otherlv_52=null;
        Token otherlv_54=null;
        Token otherlv_57=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_description_5_0 = null;

        AntlrDatatypeRuleToken lv_objectif_9_0 = null;

        AntlrDatatypeRuleToken lv_competence_13_0 = null;

        AntlrDatatypeRuleToken lv_evaluation_17_0 = null;

        AntlrDatatypeRuleToken lv_programme_21_0 = null;

        AntlrDatatypeRuleToken lv_typeEnseignement_25_0 = null;

        AntlrDatatypeRuleToken lv_Credit_29_0 = null;

        AntlrDatatypeRuleToken lv_heureCM_33_0 = null;

        AntlrDatatypeRuleToken lv_heureTD_37_0 = null;

        AntlrDatatypeRuleToken lv_heureTP_41_0 = null;

        EObject lv_seances_55_0 = null;

        EObject lv_seances_56_0 = null;



        	enterRule();

        try {
            // InternalText.g:1384:2: ( (otherlv_0= 'UE' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Description' otherlv_4= ':' ( (lv_description_5_0= ruleEString ) ) otherlv_6= ';' otherlv_7= 'Objectif' otherlv_8= ':' ( (lv_objectif_9_0= ruleEString ) ) otherlv_10= ';' otherlv_11= 'Competence' otherlv_12= ':' ( (lv_competence_13_0= ruleEString ) ) otherlv_14= ';' otherlv_15= 'Evaluation' otherlv_16= ':' ( (lv_evaluation_17_0= ruleEString ) ) otherlv_18= ';' otherlv_19= 'Programme' otherlv_20= ':' ( (lv_programme_21_0= ruleEString ) ) otherlv_22= ';' otherlv_23= 'Type enseignement' otherlv_24= ':' ( (lv_typeEnseignement_25_0= ruleEString ) ) otherlv_26= ';' otherlv_27= 'Credit' otherlv_28= ':' ( (lv_Credit_29_0= ruleEInt ) ) otherlv_30= ';' otherlv_31= 'Nombre d\\'heure de cours magistrals' otherlv_32= ':' ( (lv_heureCM_33_0= ruleEInt ) ) otherlv_34= ';' otherlv_35= 'Nombre d\\'heure de travaux dirig\\u00E9s' otherlv_36= ':' ( (lv_heureTD_37_0= ruleEInt ) ) otherlv_38= ';' otherlv_39= 'Nombre d\\'heure de travaux pratiques' otherlv_40= ':' ( (lv_heureTP_41_0= ruleEInt ) ) otherlv_42= ';' otherlv_43= 'Responsables' otherlv_44= ':' ( ( ruleEString ) ) (otherlv_46= ',' ( ( ruleEString ) ) )* otherlv_48= ';' otherlv_49= 'Intervenants' otherlv_50= ':' ( ( ruleEString ) ) (otherlv_52= ',' ( ( ruleEString ) ) )* otherlv_54= ';' ( (lv_seances_55_0= ruleSeance ) ) ( (lv_seances_56_0= ruleSeance ) )* otherlv_57= '}' ) )
            // InternalText.g:1385:2: (otherlv_0= 'UE' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Description' otherlv_4= ':' ( (lv_description_5_0= ruleEString ) ) otherlv_6= ';' otherlv_7= 'Objectif' otherlv_8= ':' ( (lv_objectif_9_0= ruleEString ) ) otherlv_10= ';' otherlv_11= 'Competence' otherlv_12= ':' ( (lv_competence_13_0= ruleEString ) ) otherlv_14= ';' otherlv_15= 'Evaluation' otherlv_16= ':' ( (lv_evaluation_17_0= ruleEString ) ) otherlv_18= ';' otherlv_19= 'Programme' otherlv_20= ':' ( (lv_programme_21_0= ruleEString ) ) otherlv_22= ';' otherlv_23= 'Type enseignement' otherlv_24= ':' ( (lv_typeEnseignement_25_0= ruleEString ) ) otherlv_26= ';' otherlv_27= 'Credit' otherlv_28= ':' ( (lv_Credit_29_0= ruleEInt ) ) otherlv_30= ';' otherlv_31= 'Nombre d\\'heure de cours magistrals' otherlv_32= ':' ( (lv_heureCM_33_0= ruleEInt ) ) otherlv_34= ';' otherlv_35= 'Nombre d\\'heure de travaux dirig\\u00E9s' otherlv_36= ':' ( (lv_heureTD_37_0= ruleEInt ) ) otherlv_38= ';' otherlv_39= 'Nombre d\\'heure de travaux pratiques' otherlv_40= ':' ( (lv_heureTP_41_0= ruleEInt ) ) otherlv_42= ';' otherlv_43= 'Responsables' otherlv_44= ':' ( ( ruleEString ) ) (otherlv_46= ',' ( ( ruleEString ) ) )* otherlv_48= ';' otherlv_49= 'Intervenants' otherlv_50= ':' ( ( ruleEString ) ) (otherlv_52= ',' ( ( ruleEString ) ) )* otherlv_54= ';' ( (lv_seances_55_0= ruleSeance ) ) ( (lv_seances_56_0= ruleSeance ) )* otherlv_57= '}' )
            {
            // InternalText.g:1385:2: (otherlv_0= 'UE' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Description' otherlv_4= ':' ( (lv_description_5_0= ruleEString ) ) otherlv_6= ';' otherlv_7= 'Objectif' otherlv_8= ':' ( (lv_objectif_9_0= ruleEString ) ) otherlv_10= ';' otherlv_11= 'Competence' otherlv_12= ':' ( (lv_competence_13_0= ruleEString ) ) otherlv_14= ';' otherlv_15= 'Evaluation' otherlv_16= ':' ( (lv_evaluation_17_0= ruleEString ) ) otherlv_18= ';' otherlv_19= 'Programme' otherlv_20= ':' ( (lv_programme_21_0= ruleEString ) ) otherlv_22= ';' otherlv_23= 'Type enseignement' otherlv_24= ':' ( (lv_typeEnseignement_25_0= ruleEString ) ) otherlv_26= ';' otherlv_27= 'Credit' otherlv_28= ':' ( (lv_Credit_29_0= ruleEInt ) ) otherlv_30= ';' otherlv_31= 'Nombre d\\'heure de cours magistrals' otherlv_32= ':' ( (lv_heureCM_33_0= ruleEInt ) ) otherlv_34= ';' otherlv_35= 'Nombre d\\'heure de travaux dirig\\u00E9s' otherlv_36= ':' ( (lv_heureTD_37_0= ruleEInt ) ) otherlv_38= ';' otherlv_39= 'Nombre d\\'heure de travaux pratiques' otherlv_40= ':' ( (lv_heureTP_41_0= ruleEInt ) ) otherlv_42= ';' otherlv_43= 'Responsables' otherlv_44= ':' ( ( ruleEString ) ) (otherlv_46= ',' ( ( ruleEString ) ) )* otherlv_48= ';' otherlv_49= 'Intervenants' otherlv_50= ':' ( ( ruleEString ) ) (otherlv_52= ',' ( ( ruleEString ) ) )* otherlv_54= ';' ( (lv_seances_55_0= ruleSeance ) ) ( (lv_seances_56_0= ruleSeance ) )* otherlv_57= '}' )
            // InternalText.g:1386:3: otherlv_0= 'UE' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Description' otherlv_4= ':' ( (lv_description_5_0= ruleEString ) ) otherlv_6= ';' otherlv_7= 'Objectif' otherlv_8= ':' ( (lv_objectif_9_0= ruleEString ) ) otherlv_10= ';' otherlv_11= 'Competence' otherlv_12= ':' ( (lv_competence_13_0= ruleEString ) ) otherlv_14= ';' otherlv_15= 'Evaluation' otherlv_16= ':' ( (lv_evaluation_17_0= ruleEString ) ) otherlv_18= ';' otherlv_19= 'Programme' otherlv_20= ':' ( (lv_programme_21_0= ruleEString ) ) otherlv_22= ';' otherlv_23= 'Type enseignement' otherlv_24= ':' ( (lv_typeEnseignement_25_0= ruleEString ) ) otherlv_26= ';' otherlv_27= 'Credit' otherlv_28= ':' ( (lv_Credit_29_0= ruleEInt ) ) otherlv_30= ';' otherlv_31= 'Nombre d\\'heure de cours magistrals' otherlv_32= ':' ( (lv_heureCM_33_0= ruleEInt ) ) otherlv_34= ';' otherlv_35= 'Nombre d\\'heure de travaux dirig\\u00E9s' otherlv_36= ':' ( (lv_heureTD_37_0= ruleEInt ) ) otherlv_38= ';' otherlv_39= 'Nombre d\\'heure de travaux pratiques' otherlv_40= ':' ( (lv_heureTP_41_0= ruleEInt ) ) otherlv_42= ';' otherlv_43= 'Responsables' otherlv_44= ':' ( ( ruleEString ) ) (otherlv_46= ',' ( ( ruleEString ) ) )* otherlv_48= ';' otherlv_49= 'Intervenants' otherlv_50= ':' ( ( ruleEString ) ) (otherlv_52= ',' ( ( ruleEString ) ) )* otherlv_54= ';' ( (lv_seances_55_0= ruleSeance ) ) ( (lv_seances_56_0= ruleSeance ) )* otherlv_57= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getUEAccess().getUEKeyword_0());
            		
            // InternalText.g:1390:3: ( (lv_name_1_0= ruleEString ) )
            // InternalText.g:1391:4: (lv_name_1_0= ruleEString )
            {
            // InternalText.g:1391:4: (lv_name_1_0= ruleEString )
            // InternalText.g:1392:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getUEAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUERule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"idm.projet.portail.Text.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getUEAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getUEAccess().getDescriptionKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getUEAccess().getColonKeyword_4());
            		
            // InternalText.g:1421:3: ( (lv_description_5_0= ruleEString ) )
            // InternalText.g:1422:4: (lv_description_5_0= ruleEString )
            {
            // InternalText.g:1422:4: (lv_description_5_0= ruleEString )
            // InternalText.g:1423:5: lv_description_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getUEAccess().getDescriptionEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_description_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUERule());
            					}
            					set(
            						current,
            						"description",
            						lv_description_5_0,
            						"idm.projet.portail.Text.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_33); 

            			newLeafNode(otherlv_6, grammarAccess.getUEAccess().getSemicolonKeyword_6());
            		
            otherlv_7=(Token)match(input,39,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getUEAccess().getObjectifKeyword_7());
            		
            otherlv_8=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getUEAccess().getColonKeyword_8());
            		
            // InternalText.g:1452:3: ( (lv_objectif_9_0= ruleEString ) )
            // InternalText.g:1453:4: (lv_objectif_9_0= ruleEString )
            {
            // InternalText.g:1453:4: (lv_objectif_9_0= ruleEString )
            // InternalText.g:1454:5: lv_objectif_9_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getUEAccess().getObjectifEStringParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_8);
            lv_objectif_9_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUERule());
            					}
            					set(
            						current,
            						"objectif",
            						lv_objectif_9_0,
            						"idm.projet.portail.Text.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,16,FOLLOW_34); 

            			newLeafNode(otherlv_10, grammarAccess.getUEAccess().getSemicolonKeyword_10());
            		
            otherlv_11=(Token)match(input,40,FOLLOW_7); 

            			newLeafNode(otherlv_11, grammarAccess.getUEAccess().getCompetenceKeyword_11());
            		
            otherlv_12=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_12, grammarAccess.getUEAccess().getColonKeyword_12());
            		
            // InternalText.g:1483:3: ( (lv_competence_13_0= ruleEString ) )
            // InternalText.g:1484:4: (lv_competence_13_0= ruleEString )
            {
            // InternalText.g:1484:4: (lv_competence_13_0= ruleEString )
            // InternalText.g:1485:5: lv_competence_13_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getUEAccess().getCompetenceEStringParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_8);
            lv_competence_13_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUERule());
            					}
            					set(
            						current,
            						"competence",
            						lv_competence_13_0,
            						"idm.projet.portail.Text.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_14=(Token)match(input,16,FOLLOW_35); 

            			newLeafNode(otherlv_14, grammarAccess.getUEAccess().getSemicolonKeyword_14());
            		
            otherlv_15=(Token)match(input,41,FOLLOW_7); 

            			newLeafNode(otherlv_15, grammarAccess.getUEAccess().getEvaluationKeyword_15());
            		
            otherlv_16=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_16, grammarAccess.getUEAccess().getColonKeyword_16());
            		
            // InternalText.g:1514:3: ( (lv_evaluation_17_0= ruleEString ) )
            // InternalText.g:1515:4: (lv_evaluation_17_0= ruleEString )
            {
            // InternalText.g:1515:4: (lv_evaluation_17_0= ruleEString )
            // InternalText.g:1516:5: lv_evaluation_17_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getUEAccess().getEvaluationEStringParserRuleCall_17_0());
            				
            pushFollow(FOLLOW_8);
            lv_evaluation_17_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUERule());
            					}
            					set(
            						current,
            						"evaluation",
            						lv_evaluation_17_0,
            						"idm.projet.portail.Text.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_18=(Token)match(input,16,FOLLOW_36); 

            			newLeafNode(otherlv_18, grammarAccess.getUEAccess().getSemicolonKeyword_18());
            		
            otherlv_19=(Token)match(input,42,FOLLOW_7); 

            			newLeafNode(otherlv_19, grammarAccess.getUEAccess().getProgrammeKeyword_19());
            		
            otherlv_20=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_20, grammarAccess.getUEAccess().getColonKeyword_20());
            		
            // InternalText.g:1545:3: ( (lv_programme_21_0= ruleEString ) )
            // InternalText.g:1546:4: (lv_programme_21_0= ruleEString )
            {
            // InternalText.g:1546:4: (lv_programme_21_0= ruleEString )
            // InternalText.g:1547:5: lv_programme_21_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getUEAccess().getProgrammeEStringParserRuleCall_21_0());
            				
            pushFollow(FOLLOW_8);
            lv_programme_21_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUERule());
            					}
            					set(
            						current,
            						"programme",
            						lv_programme_21_0,
            						"idm.projet.portail.Text.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_22=(Token)match(input,16,FOLLOW_37); 

            			newLeafNode(otherlv_22, grammarAccess.getUEAccess().getSemicolonKeyword_22());
            		
            otherlv_23=(Token)match(input,43,FOLLOW_7); 

            			newLeafNode(otherlv_23, grammarAccess.getUEAccess().getTypeEnseignementKeyword_23());
            		
            otherlv_24=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_24, grammarAccess.getUEAccess().getColonKeyword_24());
            		
            // InternalText.g:1576:3: ( (lv_typeEnseignement_25_0= ruleEString ) )
            // InternalText.g:1577:4: (lv_typeEnseignement_25_0= ruleEString )
            {
            // InternalText.g:1577:4: (lv_typeEnseignement_25_0= ruleEString )
            // InternalText.g:1578:5: lv_typeEnseignement_25_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getUEAccess().getTypeEnseignementEStringParserRuleCall_25_0());
            				
            pushFollow(FOLLOW_8);
            lv_typeEnseignement_25_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUERule());
            					}
            					set(
            						current,
            						"typeEnseignement",
            						lv_typeEnseignement_25_0,
            						"idm.projet.portail.Text.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_26=(Token)match(input,16,FOLLOW_21); 

            			newLeafNode(otherlv_26, grammarAccess.getUEAccess().getSemicolonKeyword_26());
            		
            otherlv_27=(Token)match(input,31,FOLLOW_7); 

            			newLeafNode(otherlv_27, grammarAccess.getUEAccess().getCreditKeyword_27());
            		
            otherlv_28=(Token)match(input,15,FOLLOW_22); 

            			newLeafNode(otherlv_28, grammarAccess.getUEAccess().getColonKeyword_28());
            		
            // InternalText.g:1607:3: ( (lv_Credit_29_0= ruleEInt ) )
            // InternalText.g:1608:4: (lv_Credit_29_0= ruleEInt )
            {
            // InternalText.g:1608:4: (lv_Credit_29_0= ruleEInt )
            // InternalText.g:1609:5: lv_Credit_29_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getUEAccess().getCreditEIntParserRuleCall_29_0());
            				
            pushFollow(FOLLOW_8);
            lv_Credit_29_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUERule());
            					}
            					set(
            						current,
            						"Credit",
            						lv_Credit_29_0,
            						"idm.projet.portail.Text.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_30=(Token)match(input,16,FOLLOW_38); 

            			newLeafNode(otherlv_30, grammarAccess.getUEAccess().getSemicolonKeyword_30());
            		
            otherlv_31=(Token)match(input,44,FOLLOW_7); 

            			newLeafNode(otherlv_31, grammarAccess.getUEAccess().getNombreDHeureDeCoursMagistralsKeyword_31());
            		
            otherlv_32=(Token)match(input,15,FOLLOW_22); 

            			newLeafNode(otherlv_32, grammarAccess.getUEAccess().getColonKeyword_32());
            		
            // InternalText.g:1638:3: ( (lv_heureCM_33_0= ruleEInt ) )
            // InternalText.g:1639:4: (lv_heureCM_33_0= ruleEInt )
            {
            // InternalText.g:1639:4: (lv_heureCM_33_0= ruleEInt )
            // InternalText.g:1640:5: lv_heureCM_33_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getUEAccess().getHeureCMEIntParserRuleCall_33_0());
            				
            pushFollow(FOLLOW_8);
            lv_heureCM_33_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUERule());
            					}
            					set(
            						current,
            						"heureCM",
            						lv_heureCM_33_0,
            						"idm.projet.portail.Text.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_34=(Token)match(input,16,FOLLOW_39); 

            			newLeafNode(otherlv_34, grammarAccess.getUEAccess().getSemicolonKeyword_34());
            		
            otherlv_35=(Token)match(input,45,FOLLOW_7); 

            			newLeafNode(otherlv_35, grammarAccess.getUEAccess().getNombreDHeureDeTravauxDirigSKeyword_35());
            		
            otherlv_36=(Token)match(input,15,FOLLOW_22); 

            			newLeafNode(otherlv_36, grammarAccess.getUEAccess().getColonKeyword_36());
            		
            // InternalText.g:1669:3: ( (lv_heureTD_37_0= ruleEInt ) )
            // InternalText.g:1670:4: (lv_heureTD_37_0= ruleEInt )
            {
            // InternalText.g:1670:4: (lv_heureTD_37_0= ruleEInt )
            // InternalText.g:1671:5: lv_heureTD_37_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getUEAccess().getHeureTDEIntParserRuleCall_37_0());
            				
            pushFollow(FOLLOW_8);
            lv_heureTD_37_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUERule());
            					}
            					set(
            						current,
            						"heureTD",
            						lv_heureTD_37_0,
            						"idm.projet.portail.Text.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_38=(Token)match(input,16,FOLLOW_40); 

            			newLeafNode(otherlv_38, grammarAccess.getUEAccess().getSemicolonKeyword_38());
            		
            otherlv_39=(Token)match(input,46,FOLLOW_7); 

            			newLeafNode(otherlv_39, grammarAccess.getUEAccess().getNombreDHeureDeTravauxPratiquesKeyword_39());
            		
            otherlv_40=(Token)match(input,15,FOLLOW_22); 

            			newLeafNode(otherlv_40, grammarAccess.getUEAccess().getColonKeyword_40());
            		
            // InternalText.g:1700:3: ( (lv_heureTP_41_0= ruleEInt ) )
            // InternalText.g:1701:4: (lv_heureTP_41_0= ruleEInt )
            {
            // InternalText.g:1701:4: (lv_heureTP_41_0= ruleEInt )
            // InternalText.g:1702:5: lv_heureTP_41_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getUEAccess().getHeureTPEIntParserRuleCall_41_0());
            				
            pushFollow(FOLLOW_8);
            lv_heureTP_41_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUERule());
            					}
            					set(
            						current,
            						"heureTP",
            						lv_heureTP_41_0,
            						"idm.projet.portail.Text.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_42=(Token)match(input,16,FOLLOW_41); 

            			newLeafNode(otherlv_42, grammarAccess.getUEAccess().getSemicolonKeyword_42());
            		
            otherlv_43=(Token)match(input,47,FOLLOW_7); 

            			newLeafNode(otherlv_43, grammarAccess.getUEAccess().getResponsablesKeyword_43());
            		
            otherlv_44=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_44, grammarAccess.getUEAccess().getColonKeyword_44());
            		
            // InternalText.g:1731:3: ( ( ruleEString ) )
            // InternalText.g:1732:4: ( ruleEString )
            {
            // InternalText.g:1732:4: ( ruleEString )
            // InternalText.g:1733:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUERule());
            					}
            				

            					newCompositeNode(grammarAccess.getUEAccess().getResponsablesIntervenantCrossReference_45_0());
            				
            pushFollow(FOLLOW_24);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalText.g:1747:3: (otherlv_46= ',' ( ( ruleEString ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==27) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalText.g:1748:4: otherlv_46= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_46=(Token)match(input,27,FOLLOW_3); 

            	    				newLeafNode(otherlv_46, grammarAccess.getUEAccess().getCommaKeyword_46_0());
            	    			
            	    // InternalText.g:1752:4: ( ( ruleEString ) )
            	    // InternalText.g:1753:5: ( ruleEString )
            	    {
            	    // InternalText.g:1753:5: ( ruleEString )
            	    // InternalText.g:1754:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getUERule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getUEAccess().getResponsablesIntervenantCrossReference_46_1_0());
            	    					
            	    pushFollow(FOLLOW_24);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_48=(Token)match(input,16,FOLLOW_42); 

            			newLeafNode(otherlv_48, grammarAccess.getUEAccess().getSemicolonKeyword_47());
            		
            otherlv_49=(Token)match(input,48,FOLLOW_7); 

            			newLeafNode(otherlv_49, grammarAccess.getUEAccess().getIntervenantsKeyword_48());
            		
            otherlv_50=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_50, grammarAccess.getUEAccess().getColonKeyword_49());
            		
            // InternalText.g:1781:3: ( ( ruleEString ) )
            // InternalText.g:1782:4: ( ruleEString )
            {
            // InternalText.g:1782:4: ( ruleEString )
            // InternalText.g:1783:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUERule());
            					}
            				

            					newCompositeNode(grammarAccess.getUEAccess().getIntervenantsIntervenantCrossReference_50_0());
            				
            pushFollow(FOLLOW_24);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalText.g:1797:3: (otherlv_52= ',' ( ( ruleEString ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==27) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalText.g:1798:4: otherlv_52= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_52=(Token)match(input,27,FOLLOW_3); 

            	    				newLeafNode(otherlv_52, grammarAccess.getUEAccess().getCommaKeyword_51_0());
            	    			
            	    // InternalText.g:1802:4: ( ( ruleEString ) )
            	    // InternalText.g:1803:5: ( ruleEString )
            	    {
            	    // InternalText.g:1803:5: ( ruleEString )
            	    // InternalText.g:1804:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getUERule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getUEAccess().getIntervenantsIntervenantCrossReference_51_1_0());
            	    					
            	    pushFollow(FOLLOW_24);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_54=(Token)match(input,16,FOLLOW_43); 

            			newLeafNode(otherlv_54, grammarAccess.getUEAccess().getSemicolonKeyword_52());
            		
            // InternalText.g:1823:3: ( (lv_seances_55_0= ruleSeance ) )
            // InternalText.g:1824:4: (lv_seances_55_0= ruleSeance )
            {
            // InternalText.g:1824:4: (lv_seances_55_0= ruleSeance )
            // InternalText.g:1825:5: lv_seances_55_0= ruleSeance
            {

            					newCompositeNode(grammarAccess.getUEAccess().getSeancesSeanceParserRuleCall_53_0());
            				
            pushFollow(FOLLOW_44);
            lv_seances_55_0=ruleSeance();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUERule());
            					}
            					add(
            						current,
            						"seances",
            						lv_seances_55_0,
            						"idm.projet.portail.Text.Seance");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalText.g:1842:3: ( (lv_seances_56_0= ruleSeance ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==55) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalText.g:1843:4: (lv_seances_56_0= ruleSeance )
            	    {
            	    // InternalText.g:1843:4: (lv_seances_56_0= ruleSeance )
            	    // InternalText.g:1844:5: lv_seances_56_0= ruleSeance
            	    {

            	    					newCompositeNode(grammarAccess.getUEAccess().getSeancesSeanceParserRuleCall_54_0());
            	    				
            	    pushFollow(FOLLOW_44);
            	    lv_seances_56_0=ruleSeance();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getUERule());
            	    					}
            	    					add(
            	    						current,
            	    						"seances",
            	    						lv_seances_56_0,
            	    						"idm.projet.portail.Text.Seance");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_57=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_57, grammarAccess.getUEAccess().getRightCurlyBracketKeyword_55());
            		

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
    // $ANTLR end "ruleUE"


    // $ANTLR start "entryRuleSemestre"
    // InternalText.g:1869:1: entryRuleSemestre returns [EObject current=null] : iv_ruleSemestre= ruleSemestre EOF ;
    public final EObject entryRuleSemestre() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSemestre = null;


        try {
            // InternalText.g:1869:49: (iv_ruleSemestre= ruleSemestre EOF )
            // InternalText.g:1870:2: iv_ruleSemestre= ruleSemestre EOF
            {
             newCompositeNode(grammarAccess.getSemestreRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSemestre=ruleSemestre();

            state._fsp--;

             current =iv_ruleSemestre; 
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
    // $ANTLR end "entryRuleSemestre"


    // $ANTLR start "ruleSemestre"
    // InternalText.g:1876:1: ruleSemestre returns [EObject current=null] : (otherlv_0= 'Semestre' ( (lv_name_1_0= ruleEInt ) ) otherlv_2= '{' otherlv_3= 'Date de debut' otherlv_4= ':' ( (lv_dateDebut_5_0= ruleEString ) ) otherlv_6= ';' otherlv_7= 'Date de fin' otherlv_8= ':' ( (lv_dateFin_9_0= ruleEString ) ) otherlv_10= ';' (otherlv_11= 'Ues facultatives' otherlv_12= ':' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ';' )? otherlv_17= 'Ues obligatoires' otherlv_18= ':' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ';' otherlv_23= '}' ) ;
    public final EObject ruleSemestre() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_dateDebut_5_0 = null;

        AntlrDatatypeRuleToken lv_dateFin_9_0 = null;



        	enterRule();

        try {
            // InternalText.g:1882:2: ( (otherlv_0= 'Semestre' ( (lv_name_1_0= ruleEInt ) ) otherlv_2= '{' otherlv_3= 'Date de debut' otherlv_4= ':' ( (lv_dateDebut_5_0= ruleEString ) ) otherlv_6= ';' otherlv_7= 'Date de fin' otherlv_8= ':' ( (lv_dateFin_9_0= ruleEString ) ) otherlv_10= ';' (otherlv_11= 'Ues facultatives' otherlv_12= ':' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ';' )? otherlv_17= 'Ues obligatoires' otherlv_18= ':' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ';' otherlv_23= '}' ) )
            // InternalText.g:1883:2: (otherlv_0= 'Semestre' ( (lv_name_1_0= ruleEInt ) ) otherlv_2= '{' otherlv_3= 'Date de debut' otherlv_4= ':' ( (lv_dateDebut_5_0= ruleEString ) ) otherlv_6= ';' otherlv_7= 'Date de fin' otherlv_8= ':' ( (lv_dateFin_9_0= ruleEString ) ) otherlv_10= ';' (otherlv_11= 'Ues facultatives' otherlv_12= ':' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ';' )? otherlv_17= 'Ues obligatoires' otherlv_18= ':' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ';' otherlv_23= '}' )
            {
            // InternalText.g:1883:2: (otherlv_0= 'Semestre' ( (lv_name_1_0= ruleEInt ) ) otherlv_2= '{' otherlv_3= 'Date de debut' otherlv_4= ':' ( (lv_dateDebut_5_0= ruleEString ) ) otherlv_6= ';' otherlv_7= 'Date de fin' otherlv_8= ':' ( (lv_dateFin_9_0= ruleEString ) ) otherlv_10= ';' (otherlv_11= 'Ues facultatives' otherlv_12= ':' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ';' )? otherlv_17= 'Ues obligatoires' otherlv_18= ':' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ';' otherlv_23= '}' )
            // InternalText.g:1884:3: otherlv_0= 'Semestre' ( (lv_name_1_0= ruleEInt ) ) otherlv_2= '{' otherlv_3= 'Date de debut' otherlv_4= ':' ( (lv_dateDebut_5_0= ruleEString ) ) otherlv_6= ';' otherlv_7= 'Date de fin' otherlv_8= ':' ( (lv_dateFin_9_0= ruleEString ) ) otherlv_10= ';' (otherlv_11= 'Ues facultatives' otherlv_12= ':' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ';' )? otherlv_17= 'Ues obligatoires' otherlv_18= ':' ( ( ruleEString ) ) (otherlv_20= ',' ( ( ruleEString ) ) )* otherlv_22= ';' otherlv_23= '}'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getSemestreAccess().getSemestreKeyword_0());
            		
            // InternalText.g:1888:3: ( (lv_name_1_0= ruleEInt ) )
            // InternalText.g:1889:4: (lv_name_1_0= ruleEInt )
            {
            // InternalText.g:1889:4: (lv_name_1_0= ruleEInt )
            // InternalText.g:1890:5: lv_name_1_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getSemestreAccess().getNameEIntParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_1_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSemestreRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"idm.projet.portail.Text.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_45); 

            			newLeafNode(otherlv_2, grammarAccess.getSemestreAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,50,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getSemestreAccess().getDateDeDebutKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getSemestreAccess().getColonKeyword_4());
            		
            // InternalText.g:1919:3: ( (lv_dateDebut_5_0= ruleEString ) )
            // InternalText.g:1920:4: (lv_dateDebut_5_0= ruleEString )
            {
            // InternalText.g:1920:4: (lv_dateDebut_5_0= ruleEString )
            // InternalText.g:1921:5: lv_dateDebut_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSemestreAccess().getDateDebutEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_dateDebut_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSemestreRule());
            					}
            					set(
            						current,
            						"dateDebut",
            						lv_dateDebut_5_0,
            						"idm.projet.portail.Text.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_46); 

            			newLeafNode(otherlv_6, grammarAccess.getSemestreAccess().getSemicolonKeyword_6());
            		
            otherlv_7=(Token)match(input,51,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getSemestreAccess().getDateDeFinKeyword_7());
            		
            otherlv_8=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getSemestreAccess().getColonKeyword_8());
            		
            // InternalText.g:1950:3: ( (lv_dateFin_9_0= ruleEString ) )
            // InternalText.g:1951:4: (lv_dateFin_9_0= ruleEString )
            {
            // InternalText.g:1951:4: (lv_dateFin_9_0= ruleEString )
            // InternalText.g:1952:5: lv_dateFin_9_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSemestreAccess().getDateFinEStringParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_8);
            lv_dateFin_9_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSemestreRule());
            					}
            					set(
            						current,
            						"dateFin",
            						lv_dateFin_9_0,
            						"idm.projet.portail.Text.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,16,FOLLOW_47); 

            			newLeafNode(otherlv_10, grammarAccess.getSemestreAccess().getSemicolonKeyword_10());
            		
            // InternalText.g:1973:3: (otherlv_11= 'Ues facultatives' otherlv_12= ':' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ';' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==52) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalText.g:1974:4: otherlv_11= 'Ues facultatives' otherlv_12= ':' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ';'
                    {
                    otherlv_11=(Token)match(input,52,FOLLOW_7); 

                    				newLeafNode(otherlv_11, grammarAccess.getSemestreAccess().getUesFacultativesKeyword_11_0());
                    			
                    otherlv_12=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getSemestreAccess().getColonKeyword_11_1());
                    			
                    // InternalText.g:1982:4: ( ( ruleEString ) )
                    // InternalText.g:1983:5: ( ruleEString )
                    {
                    // InternalText.g:1983:5: ( ruleEString )
                    // InternalText.g:1984:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSemestreRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSemestreAccess().getUeFacultativesUECrossReference_11_2_0());
                    					
                    pushFollow(FOLLOW_24);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalText.g:1998:4: (otherlv_14= ',' ( ( ruleEString ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==27) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalText.g:1999:5: otherlv_14= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_14=(Token)match(input,27,FOLLOW_3); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getSemestreAccess().getCommaKeyword_11_3_0());
                    	    				
                    	    // InternalText.g:2003:5: ( ( ruleEString ) )
                    	    // InternalText.g:2004:6: ( ruleEString )
                    	    {
                    	    // InternalText.g:2004:6: ( ruleEString )
                    	    // InternalText.g:2005:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getSemestreRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getSemestreAccess().getUeFacultativesUECrossReference_11_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_24);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,16,FOLLOW_48); 

                    				newLeafNode(otherlv_16, grammarAccess.getSemestreAccess().getSemicolonKeyword_11_4());
                    			

                    }
                    break;

            }

            otherlv_17=(Token)match(input,53,FOLLOW_7); 

            			newLeafNode(otherlv_17, grammarAccess.getSemestreAccess().getUesObligatoiresKeyword_12());
            		
            otherlv_18=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_18, grammarAccess.getSemestreAccess().getColonKeyword_13());
            		
            // InternalText.g:2033:3: ( ( ruleEString ) )
            // InternalText.g:2034:4: ( ruleEString )
            {
            // InternalText.g:2034:4: ( ruleEString )
            // InternalText.g:2035:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSemestreRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSemestreAccess().getUeObligatoiresUECrossReference_14_0());
            				
            pushFollow(FOLLOW_24);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalText.g:2049:3: (otherlv_20= ',' ( ( ruleEString ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==27) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalText.g:2050:4: otherlv_20= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_20=(Token)match(input,27,FOLLOW_3); 

            	    				newLeafNode(otherlv_20, grammarAccess.getSemestreAccess().getCommaKeyword_15_0());
            	    			
            	    // InternalText.g:2054:4: ( ( ruleEString ) )
            	    // InternalText.g:2055:5: ( ruleEString )
            	    {
            	    // InternalText.g:2055:5: ( ruleEString )
            	    // InternalText.g:2056:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getSemestreRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getSemestreAccess().getUeObligatoiresUECrossReference_15_1_0());
            	    					
            	    pushFollow(FOLLOW_24);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_22=(Token)match(input,16,FOLLOW_15); 

            			newLeafNode(otherlv_22, grammarAccess.getSemestreAccess().getSemicolonKeyword_16());
            		
            otherlv_23=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_23, grammarAccess.getSemestreAccess().getRightCurlyBracketKeyword_17());
            		

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
    // $ANTLR end "ruleSemestre"


    // $ANTLR start "entryRuleEDate"
    // InternalText.g:2083:1: entryRuleEDate returns [String current=null] : iv_ruleEDate= ruleEDate EOF ;
    public final String entryRuleEDate() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDate = null;


        try {
            // InternalText.g:2083:45: (iv_ruleEDate= ruleEDate EOF )
            // InternalText.g:2084:2: iv_ruleEDate= ruleEDate EOF
            {
             newCompositeNode(grammarAccess.getEDateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDate=ruleEDate();

            state._fsp--;

             current =iv_ruleEDate.getText(); 
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
    // $ANTLR end "entryRuleEDate"


    // $ANTLR start "ruleEDate"
    // InternalText.g:2090:1: ruleEDate returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'EDate' this_EDate_1= ruleEDate ) ;
    public final AntlrDatatypeRuleToken ruleEDate() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_EDate_1 = null;



        	enterRule();

        try {
            // InternalText.g:2096:2: ( (kw= 'EDate' this_EDate_1= ruleEDate ) )
            // InternalText.g:2097:2: (kw= 'EDate' this_EDate_1= ruleEDate )
            {
            // InternalText.g:2097:2: (kw= 'EDate' this_EDate_1= ruleEDate )
            // InternalText.g:2098:3: kw= 'EDate' this_EDate_1= ruleEDate
            {
            kw=(Token)match(input,54,FOLLOW_49); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDateAccess().getEDateKeyword_0());
            		

            			newCompositeNode(grammarAccess.getEDateAccess().getEDateParserRuleCall_1());
            		
            pushFollow(FOLLOW_2);
            this_EDate_1=ruleEDate();

            state._fsp--;


            			current.merge(this_EDate_1);
            		

            			afterParserOrEnumRuleCall();
            		

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
    // $ANTLR end "ruleEDate"


    // $ANTLR start "entryRuleSeance"
    // InternalText.g:2117:1: entryRuleSeance returns [EObject current=null] : iv_ruleSeance= ruleSeance EOF ;
    public final EObject entryRuleSeance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSeance = null;


        try {
            // InternalText.g:2117:47: (iv_ruleSeance= ruleSeance EOF )
            // InternalText.g:2118:2: iv_ruleSeance= ruleSeance EOF
            {
             newCompositeNode(grammarAccess.getSeanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSeance=ruleSeance();

            state._fsp--;

             current =iv_ruleSeance; 
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
    // $ANTLR end "entryRuleSeance"


    // $ANTLR start "ruleSeance"
    // InternalText.g:2124:1: ruleSeance returns [EObject current=null] : (otherlv_0= 'Seance' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Date' otherlv_4= ':' ( (lv_date_5_0= ruleEString ) ) otherlv_6= ';' otherlv_7= 'Heure de d\\u00E9but' otherlv_8= ':' ( (lv_heureDebut_9_0= ruleEString ) ) otherlv_10= ';' otherlv_11= 'Heure de fin' otherlv_12= ':' ( (lv_heureFin_13_0= ruleEString ) ) otherlv_14= ';' otherlv_15= 'Description' otherlv_16= ':' ( (lv_description_17_0= ruleEString ) ) otherlv_18= ';' otherlv_19= 'kind' otherlv_20= ':' ( (lv_kind_21_0= ruleSeanceKind ) ) otherlv_22= ';' (otherlv_23= 'Ressources' otherlv_24= ':' ( (lv_ressources_25_0= ruleRessource ) ) (otherlv_26= ',' ( (lv_ressources_27_0= ruleRessource ) ) )* otherlv_28= ';' )? otherlv_29= '}' ) ;
    public final EObject ruleSeance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
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
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_date_5_0 = null;

        AntlrDatatypeRuleToken lv_heureDebut_9_0 = null;

        AntlrDatatypeRuleToken lv_heureFin_13_0 = null;

        AntlrDatatypeRuleToken lv_description_17_0 = null;

        Enumerator lv_kind_21_0 = null;

        EObject lv_ressources_25_0 = null;

        EObject lv_ressources_27_0 = null;



        	enterRule();

        try {
            // InternalText.g:2130:2: ( (otherlv_0= 'Seance' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Date' otherlv_4= ':' ( (lv_date_5_0= ruleEString ) ) otherlv_6= ';' otherlv_7= 'Heure de d\\u00E9but' otherlv_8= ':' ( (lv_heureDebut_9_0= ruleEString ) ) otherlv_10= ';' otherlv_11= 'Heure de fin' otherlv_12= ':' ( (lv_heureFin_13_0= ruleEString ) ) otherlv_14= ';' otherlv_15= 'Description' otherlv_16= ':' ( (lv_description_17_0= ruleEString ) ) otherlv_18= ';' otherlv_19= 'kind' otherlv_20= ':' ( (lv_kind_21_0= ruleSeanceKind ) ) otherlv_22= ';' (otherlv_23= 'Ressources' otherlv_24= ':' ( (lv_ressources_25_0= ruleRessource ) ) (otherlv_26= ',' ( (lv_ressources_27_0= ruleRessource ) ) )* otherlv_28= ';' )? otherlv_29= '}' ) )
            // InternalText.g:2131:2: (otherlv_0= 'Seance' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Date' otherlv_4= ':' ( (lv_date_5_0= ruleEString ) ) otherlv_6= ';' otherlv_7= 'Heure de d\\u00E9but' otherlv_8= ':' ( (lv_heureDebut_9_0= ruleEString ) ) otherlv_10= ';' otherlv_11= 'Heure de fin' otherlv_12= ':' ( (lv_heureFin_13_0= ruleEString ) ) otherlv_14= ';' otherlv_15= 'Description' otherlv_16= ':' ( (lv_description_17_0= ruleEString ) ) otherlv_18= ';' otherlv_19= 'kind' otherlv_20= ':' ( (lv_kind_21_0= ruleSeanceKind ) ) otherlv_22= ';' (otherlv_23= 'Ressources' otherlv_24= ':' ( (lv_ressources_25_0= ruleRessource ) ) (otherlv_26= ',' ( (lv_ressources_27_0= ruleRessource ) ) )* otherlv_28= ';' )? otherlv_29= '}' )
            {
            // InternalText.g:2131:2: (otherlv_0= 'Seance' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Date' otherlv_4= ':' ( (lv_date_5_0= ruleEString ) ) otherlv_6= ';' otherlv_7= 'Heure de d\\u00E9but' otherlv_8= ':' ( (lv_heureDebut_9_0= ruleEString ) ) otherlv_10= ';' otherlv_11= 'Heure de fin' otherlv_12= ':' ( (lv_heureFin_13_0= ruleEString ) ) otherlv_14= ';' otherlv_15= 'Description' otherlv_16= ':' ( (lv_description_17_0= ruleEString ) ) otherlv_18= ';' otherlv_19= 'kind' otherlv_20= ':' ( (lv_kind_21_0= ruleSeanceKind ) ) otherlv_22= ';' (otherlv_23= 'Ressources' otherlv_24= ':' ( (lv_ressources_25_0= ruleRessource ) ) (otherlv_26= ',' ( (lv_ressources_27_0= ruleRessource ) ) )* otherlv_28= ';' )? otherlv_29= '}' )
            // InternalText.g:2132:3: otherlv_0= 'Seance' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Date' otherlv_4= ':' ( (lv_date_5_0= ruleEString ) ) otherlv_6= ';' otherlv_7= 'Heure de d\\u00E9but' otherlv_8= ':' ( (lv_heureDebut_9_0= ruleEString ) ) otherlv_10= ';' otherlv_11= 'Heure de fin' otherlv_12= ':' ( (lv_heureFin_13_0= ruleEString ) ) otherlv_14= ';' otherlv_15= 'Description' otherlv_16= ':' ( (lv_description_17_0= ruleEString ) ) otherlv_18= ';' otherlv_19= 'kind' otherlv_20= ':' ( (lv_kind_21_0= ruleSeanceKind ) ) otherlv_22= ';' (otherlv_23= 'Ressources' otherlv_24= ':' ( (lv_ressources_25_0= ruleRessource ) ) (otherlv_26= ',' ( (lv_ressources_27_0= ruleRessource ) ) )* otherlv_28= ';' )? otherlv_29= '}'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSeanceAccess().getSeanceKeyword_0());
            		
            // InternalText.g:2136:3: ( (lv_name_1_0= ruleEString ) )
            // InternalText.g:2137:4: (lv_name_1_0= ruleEString )
            {
            // InternalText.g:2137:4: (lv_name_1_0= ruleEString )
            // InternalText.g:2138:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSeanceAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSeanceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"idm.projet.portail.Text.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_50); 

            			newLeafNode(otherlv_2, grammarAccess.getSeanceAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,56,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getSeanceAccess().getDateKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getSeanceAccess().getColonKeyword_4());
            		
            // InternalText.g:2167:3: ( (lv_date_5_0= ruleEString ) )
            // InternalText.g:2168:4: (lv_date_5_0= ruleEString )
            {
            // InternalText.g:2168:4: (lv_date_5_0= ruleEString )
            // InternalText.g:2169:5: lv_date_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSeanceAccess().getDateEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_date_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSeanceRule());
            					}
            					set(
            						current,
            						"date",
            						lv_date_5_0,
            						"idm.projet.portail.Text.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_51); 

            			newLeafNode(otherlv_6, grammarAccess.getSeanceAccess().getSemicolonKeyword_6());
            		
            otherlv_7=(Token)match(input,57,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getSeanceAccess().getHeureDeDButKeyword_7());
            		
            otherlv_8=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getSeanceAccess().getColonKeyword_8());
            		
            // InternalText.g:2198:3: ( (lv_heureDebut_9_0= ruleEString ) )
            // InternalText.g:2199:4: (lv_heureDebut_9_0= ruleEString )
            {
            // InternalText.g:2199:4: (lv_heureDebut_9_0= ruleEString )
            // InternalText.g:2200:5: lv_heureDebut_9_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSeanceAccess().getHeureDebutEStringParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_8);
            lv_heureDebut_9_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSeanceRule());
            					}
            					set(
            						current,
            						"heureDebut",
            						lv_heureDebut_9_0,
            						"idm.projet.portail.Text.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,16,FOLLOW_52); 

            			newLeafNode(otherlv_10, grammarAccess.getSeanceAccess().getSemicolonKeyword_10());
            		
            otherlv_11=(Token)match(input,58,FOLLOW_7); 

            			newLeafNode(otherlv_11, grammarAccess.getSeanceAccess().getHeureDeFinKeyword_11());
            		
            otherlv_12=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_12, grammarAccess.getSeanceAccess().getColonKeyword_12());
            		
            // InternalText.g:2229:3: ( (lv_heureFin_13_0= ruleEString ) )
            // InternalText.g:2230:4: (lv_heureFin_13_0= ruleEString )
            {
            // InternalText.g:2230:4: (lv_heureFin_13_0= ruleEString )
            // InternalText.g:2231:5: lv_heureFin_13_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSeanceAccess().getHeureFinEStringParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_8);
            lv_heureFin_13_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSeanceRule());
            					}
            					set(
            						current,
            						"heureFin",
            						lv_heureFin_13_0,
            						"idm.projet.portail.Text.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_14=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_14, grammarAccess.getSeanceAccess().getSemicolonKeyword_14());
            		
            otherlv_15=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_15, grammarAccess.getSeanceAccess().getDescriptionKeyword_15());
            		
            otherlv_16=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_16, grammarAccess.getSeanceAccess().getColonKeyword_16());
            		
            // InternalText.g:2260:3: ( (lv_description_17_0= ruleEString ) )
            // InternalText.g:2261:4: (lv_description_17_0= ruleEString )
            {
            // InternalText.g:2261:4: (lv_description_17_0= ruleEString )
            // InternalText.g:2262:5: lv_description_17_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSeanceAccess().getDescriptionEStringParserRuleCall_17_0());
            				
            pushFollow(FOLLOW_8);
            lv_description_17_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSeanceRule());
            					}
            					set(
            						current,
            						"description",
            						lv_description_17_0,
            						"idm.projet.portail.Text.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_18=(Token)match(input,16,FOLLOW_53); 

            			newLeafNode(otherlv_18, grammarAccess.getSeanceAccess().getSemicolonKeyword_18());
            		
            otherlv_19=(Token)match(input,59,FOLLOW_7); 

            			newLeafNode(otherlv_19, grammarAccess.getSeanceAccess().getKindKeyword_19());
            		
            otherlv_20=(Token)match(input,15,FOLLOW_54); 

            			newLeafNode(otherlv_20, grammarAccess.getSeanceAccess().getColonKeyword_20());
            		
            // InternalText.g:2291:3: ( (lv_kind_21_0= ruleSeanceKind ) )
            // InternalText.g:2292:4: (lv_kind_21_0= ruleSeanceKind )
            {
            // InternalText.g:2292:4: (lv_kind_21_0= ruleSeanceKind )
            // InternalText.g:2293:5: lv_kind_21_0= ruleSeanceKind
            {

            					newCompositeNode(grammarAccess.getSeanceAccess().getKindSeanceKindEnumRuleCall_21_0());
            				
            pushFollow(FOLLOW_8);
            lv_kind_21_0=ruleSeanceKind();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSeanceRule());
            					}
            					set(
            						current,
            						"kind",
            						lv_kind_21_0,
            						"idm.projet.portail.Text.SeanceKind");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_22=(Token)match(input,16,FOLLOW_55); 

            			newLeafNode(otherlv_22, grammarAccess.getSeanceAccess().getSemicolonKeyword_22());
            		
            // InternalText.g:2314:3: (otherlv_23= 'Ressources' otherlv_24= ':' ( (lv_ressources_25_0= ruleRessource ) ) (otherlv_26= ',' ( (lv_ressources_27_0= ruleRessource ) ) )* otherlv_28= ';' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==60) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalText.g:2315:4: otherlv_23= 'Ressources' otherlv_24= ':' ( (lv_ressources_25_0= ruleRessource ) ) (otherlv_26= ',' ( (lv_ressources_27_0= ruleRessource ) ) )* otherlv_28= ';'
                    {
                    otherlv_23=(Token)match(input,60,FOLLOW_7); 

                    				newLeafNode(otherlv_23, grammarAccess.getSeanceAccess().getRessourcesKeyword_23_0());
                    			
                    otherlv_24=(Token)match(input,15,FOLLOW_56); 

                    				newLeafNode(otherlv_24, grammarAccess.getSeanceAccess().getColonKeyword_23_1());
                    			
                    // InternalText.g:2323:4: ( (lv_ressources_25_0= ruleRessource ) )
                    // InternalText.g:2324:5: (lv_ressources_25_0= ruleRessource )
                    {
                    // InternalText.g:2324:5: (lv_ressources_25_0= ruleRessource )
                    // InternalText.g:2325:6: lv_ressources_25_0= ruleRessource
                    {

                    						newCompositeNode(grammarAccess.getSeanceAccess().getRessourcesRessourceParserRuleCall_23_2_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_ressources_25_0=ruleRessource();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSeanceRule());
                    						}
                    						add(
                    							current,
                    							"ressources",
                    							lv_ressources_25_0,
                    							"idm.projet.portail.Text.Ressource");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalText.g:2342:4: (otherlv_26= ',' ( (lv_ressources_27_0= ruleRessource ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==27) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalText.g:2343:5: otherlv_26= ',' ( (lv_ressources_27_0= ruleRessource ) )
                    	    {
                    	    otherlv_26=(Token)match(input,27,FOLLOW_56); 

                    	    					newLeafNode(otherlv_26, grammarAccess.getSeanceAccess().getCommaKeyword_23_3_0());
                    	    				
                    	    // InternalText.g:2347:5: ( (lv_ressources_27_0= ruleRessource ) )
                    	    // InternalText.g:2348:6: (lv_ressources_27_0= ruleRessource )
                    	    {
                    	    // InternalText.g:2348:6: (lv_ressources_27_0= ruleRessource )
                    	    // InternalText.g:2349:7: lv_ressources_27_0= ruleRessource
                    	    {

                    	    							newCompositeNode(grammarAccess.getSeanceAccess().getRessourcesRessourceParserRuleCall_23_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_24);
                    	    lv_ressources_27_0=ruleRessource();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSeanceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"ressources",
                    	    								lv_ressources_27_0,
                    	    								"idm.projet.portail.Text.Ressource");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_28=(Token)match(input,16,FOLLOW_15); 

                    				newLeafNode(otherlv_28, grammarAccess.getSeanceAccess().getSemicolonKeyword_23_4());
                    			

                    }
                    break;

            }

            otherlv_29=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_29, grammarAccess.getSeanceAccess().getRightCurlyBracketKeyword_24());
            		

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
    // $ANTLR end "ruleSeance"


    // $ANTLR start "entryRuleRessource"
    // InternalText.g:2380:1: entryRuleRessource returns [EObject current=null] : iv_ruleRessource= ruleRessource EOF ;
    public final EObject entryRuleRessource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRessource = null;


        try {
            // InternalText.g:2380:50: (iv_ruleRessource= ruleRessource EOF )
            // InternalText.g:2381:2: iv_ruleRessource= ruleRessource EOF
            {
             newCompositeNode(grammarAccess.getRessourceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRessource=ruleRessource();

            state._fsp--;

             current =iv_ruleRessource; 
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
    // $ANTLR end "entryRuleRessource"


    // $ANTLR start "ruleRessource"
    // InternalText.g:2387:1: ruleRessource returns [EObject current=null] : (otherlv_0= 'Ressource' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Lien' otherlv_4= ':' ( (lv_lien_5_0= ruleEString ) ) otherlv_6= '}' ) ;
    public final EObject ruleRessource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_lien_5_0 = null;



        	enterRule();

        try {
            // InternalText.g:2393:2: ( (otherlv_0= 'Ressource' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Lien' otherlv_4= ':' ( (lv_lien_5_0= ruleEString ) ) otherlv_6= '}' ) )
            // InternalText.g:2394:2: (otherlv_0= 'Ressource' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Lien' otherlv_4= ':' ( (lv_lien_5_0= ruleEString ) ) otherlv_6= '}' )
            {
            // InternalText.g:2394:2: (otherlv_0= 'Ressource' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Lien' otherlv_4= ':' ( (lv_lien_5_0= ruleEString ) ) otherlv_6= '}' )
            // InternalText.g:2395:3: otherlv_0= 'Ressource' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Lien' otherlv_4= ':' ( (lv_lien_5_0= ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,61,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRessourceAccess().getRessourceKeyword_0());
            		
            // InternalText.g:2399:3: ( (lv_name_1_0= ruleEString ) )
            // InternalText.g:2400:4: (lv_name_1_0= ruleEString )
            {
            // InternalText.g:2400:4: (lv_name_1_0= ruleEString )
            // InternalText.g:2401:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRessourceAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRessourceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"idm.projet.portail.Text.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_57); 

            			newLeafNode(otherlv_2, grammarAccess.getRessourceAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,62,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getRessourceAccess().getLienKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getRessourceAccess().getColonKeyword_4());
            		
            // InternalText.g:2430:3: ( (lv_lien_5_0= ruleEString ) )
            // InternalText.g:2431:4: (lv_lien_5_0= ruleEString )
            {
            // InternalText.g:2431:4: (lv_lien_5_0= ruleEString )
            // InternalText.g:2432:5: lv_lien_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRessourceAccess().getLienEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_15);
            lv_lien_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRessourceRule());
            					}
            					set(
            						current,
            						"lien",
            						lv_lien_5_0,
            						"idm.projet.portail.Text.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getRessourceAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleRessource"


    // $ANTLR start "ruleSeanceKind"
    // InternalText.g:2457:1: ruleSeanceKind returns [Enumerator current=null] : ( (enumLiteral_0= 'CM' ) | (enumLiteral_1= 'TD' ) | (enumLiteral_2= 'TP' ) ) ;
    public final Enumerator ruleSeanceKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalText.g:2463:2: ( ( (enumLiteral_0= 'CM' ) | (enumLiteral_1= 'TD' ) | (enumLiteral_2= 'TP' ) ) )
            // InternalText.g:2464:2: ( (enumLiteral_0= 'CM' ) | (enumLiteral_1= 'TD' ) | (enumLiteral_2= 'TP' ) )
            {
            // InternalText.g:2464:2: ( (enumLiteral_0= 'CM' ) | (enumLiteral_1= 'TD' ) | (enumLiteral_2= 'TP' ) )
            int alt25=3;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt25=1;
                }
                break;
            case 64:
                {
                alt25=2;
                }
                break;
            case 65:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalText.g:2465:3: (enumLiteral_0= 'CM' )
                    {
                    // InternalText.g:2465:3: (enumLiteral_0= 'CM' )
                    // InternalText.g:2466:4: enumLiteral_0= 'CM'
                    {
                    enumLiteral_0=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getSeanceKindAccess().getCMEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSeanceKindAccess().getCMEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalText.g:2473:3: (enumLiteral_1= 'TD' )
                    {
                    // InternalText.g:2473:3: (enumLiteral_1= 'TD' )
                    // InternalText.g:2474:4: enumLiteral_1= 'TD'
                    {
                    enumLiteral_1=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getSeanceKindAccess().getTDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSeanceKindAccess().getTDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalText.g:2481:3: (enumLiteral_2= 'TP' )
                    {
                    // InternalText.g:2481:3: (enumLiteral_2= 'TP' )
                    // InternalText.g:2482:4: enumLiteral_2= 'TP'
                    {
                    enumLiteral_2=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getSeanceKindAccess().getTPEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSeanceKindAccess().getTPEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleSeanceKind"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000001081002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000840000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000074040000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000078040000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000068040000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040040000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000400000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008010000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000004800040000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0002000000040000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0080000000040000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x1000000000040000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x4000000000000000L});

}