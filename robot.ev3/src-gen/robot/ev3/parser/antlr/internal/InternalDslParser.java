package robot.ev3.parser.antlr.internal;

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
import robot.ev3.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_DECIMAL", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Mission:'", "'Task:'", "'Uses:'", "'Do:'", "'ColorSensor'", "'On'", "'DetectedColor'", "'is:'", "'TouchSensor'", "'TouchedSide:'", "'USensor'", "'Distance:'", "'LEFT'", "'RIGHT'", "'BOTH'", "'ROTATELEFT'", "'ROTATERIGHT'", "'DRIVEFORWARD'", "'DRIVEBACKWARD'", "'STOP'", "'TURNAROUND'", "'BEEP'", "'BLACK'", "'BLUE'", "'CYAN'", "'DARK_GRAY'", "'GRAY'", "'GREEN'", "'LIGHT_GRAY'", "'MAGENTA'", "'ORANGE'", "'PINK'", "'RED'", "'WHITE'", "'YELLOW'", "'=='", "'!='", "'>='", "'>'", "'<='", "'<'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int RULE_ID=4;
    public static final int RULE_DECIMAL=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
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
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
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


        public InternalDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDsl.g"; }



     	private DslGrammarAccess grammarAccess;

        public InternalDslParser(TokenStream input, DslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Mission";
       	}

       	@Override
       	protected DslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMission"
    // InternalDsl.g:65:1: entryRuleMission returns [EObject current=null] : iv_ruleMission= ruleMission EOF ;
    public final EObject entryRuleMission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMission = null;


        try {
            // InternalDsl.g:65:48: (iv_ruleMission= ruleMission EOF )
            // InternalDsl.g:66:2: iv_ruleMission= ruleMission EOF
            {
             newCompositeNode(grammarAccess.getMissionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMission=ruleMission();

            state._fsp--;

             current =iv_ruleMission; 
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
    // $ANTLR end "entryRuleMission"


    // $ANTLR start "ruleMission"
    // InternalDsl.g:72:1: ruleMission returns [EObject current=null] : (otherlv_0= 'Mission:' ( (lv_tasks_1_0= ruleTask ) )+ ) ;
    public final EObject ruleMission() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_tasks_1_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:78:2: ( (otherlv_0= 'Mission:' ( (lv_tasks_1_0= ruleTask ) )+ ) )
            // InternalDsl.g:79:2: (otherlv_0= 'Mission:' ( (lv_tasks_1_0= ruleTask ) )+ )
            {
            // InternalDsl.g:79:2: (otherlv_0= 'Mission:' ( (lv_tasks_1_0= ruleTask ) )+ )
            // InternalDsl.g:80:3: otherlv_0= 'Mission:' ( (lv_tasks_1_0= ruleTask ) )+
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMissionAccess().getMissionKeyword_0());
            		
            // InternalDsl.g:84:3: ( (lv_tasks_1_0= ruleTask ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDsl.g:85:4: (lv_tasks_1_0= ruleTask )
            	    {
            	    // InternalDsl.g:85:4: (lv_tasks_1_0= ruleTask )
            	    // InternalDsl.g:86:5: lv_tasks_1_0= ruleTask
            	    {

            	    					newCompositeNode(grammarAccess.getMissionAccess().getTasksTaskParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_tasks_1_0=ruleTask();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMissionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"tasks",
            	    						lv_tasks_1_0,
            	    						"robot.ev3.Dsl.Task");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
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
    // $ANTLR end "ruleMission"


    // $ANTLR start "entryRuleTask"
    // InternalDsl.g:107:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // InternalDsl.g:107:45: (iv_ruleTask= ruleTask EOF )
            // InternalDsl.g:108:2: iv_ruleTask= ruleTask EOF
            {
             newCompositeNode(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTask=ruleTask();

            state._fsp--;

             current =iv_ruleTask; 
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
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // InternalDsl.g:114:1: ruleTask returns [EObject current=null] : (otherlv_0= 'Task:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Uses:' ( (lv_sensor_3_0= ruleSensorType ) ) otherlv_4= 'Do:' ( (lv_action_5_0= ruleActions ) ) ) ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_sensor_3_0 = null;

        Enumerator lv_action_5_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:120:2: ( (otherlv_0= 'Task:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Uses:' ( (lv_sensor_3_0= ruleSensorType ) ) otherlv_4= 'Do:' ( (lv_action_5_0= ruleActions ) ) ) )
            // InternalDsl.g:121:2: (otherlv_0= 'Task:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Uses:' ( (lv_sensor_3_0= ruleSensorType ) ) otherlv_4= 'Do:' ( (lv_action_5_0= ruleActions ) ) )
            {
            // InternalDsl.g:121:2: (otherlv_0= 'Task:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Uses:' ( (lv_sensor_3_0= ruleSensorType ) ) otherlv_4= 'Do:' ( (lv_action_5_0= ruleActions ) ) )
            // InternalDsl.g:122:3: otherlv_0= 'Task:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Uses:' ( (lv_sensor_3_0= ruleSensorType ) ) otherlv_4= 'Do:' ( (lv_action_5_0= ruleActions ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskAccess().getTaskKeyword_0());
            		
            // InternalDsl.g:126:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:127:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:127:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:128:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getTaskAccess().getUsesKeyword_2());
            		
            // InternalDsl.g:148:3: ( (lv_sensor_3_0= ruleSensorType ) )
            // InternalDsl.g:149:4: (lv_sensor_3_0= ruleSensorType )
            {
            // InternalDsl.g:149:4: (lv_sensor_3_0= ruleSensorType )
            // InternalDsl.g:150:5: lv_sensor_3_0= ruleSensorType
            {

            					newCompositeNode(grammarAccess.getTaskAccess().getSensorSensorTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_sensor_3_0=ruleSensorType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTaskRule());
            					}
            					set(
            						current,
            						"sensor",
            						lv_sensor_3_0,
            						"robot.ev3.Dsl.SensorType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getTaskAccess().getDoKeyword_4());
            		
            // InternalDsl.g:171:3: ( (lv_action_5_0= ruleActions ) )
            // InternalDsl.g:172:4: (lv_action_5_0= ruleActions )
            {
            // InternalDsl.g:172:4: (lv_action_5_0= ruleActions )
            // InternalDsl.g:173:5: lv_action_5_0= ruleActions
            {

            					newCompositeNode(grammarAccess.getTaskAccess().getActionActionsEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_action_5_0=ruleActions();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTaskRule());
            					}
            					set(
            						current,
            						"action",
            						lv_action_5_0,
            						"robot.ev3.Dsl.Actions");
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
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRuleSensorType"
    // InternalDsl.g:194:1: entryRuleSensorType returns [EObject current=null] : iv_ruleSensorType= ruleSensorType EOF ;
    public final EObject entryRuleSensorType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorType = null;


        try {
            // InternalDsl.g:194:51: (iv_ruleSensorType= ruleSensorType EOF )
            // InternalDsl.g:195:2: iv_ruleSensorType= ruleSensorType EOF
            {
             newCompositeNode(grammarAccess.getSensorTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensorType=ruleSensorType();

            state._fsp--;

             current =iv_ruleSensorType; 
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
    // $ANTLR end "entryRuleSensorType"


    // $ANTLR start "ruleSensorType"
    // InternalDsl.g:201:1: ruleSensorType returns [EObject current=null] : (this_ColorSensor_0= ruleColorSensor | this_TouchSensor_1= ruleTouchSensor | this_UltrasonicSensor_2= ruleUltrasonicSensor ) ;
    public final EObject ruleSensorType() throws RecognitionException {
        EObject current = null;

        EObject this_ColorSensor_0 = null;

        EObject this_TouchSensor_1 = null;

        EObject this_UltrasonicSensor_2 = null;



        	enterRule();

        try {
            // InternalDsl.g:207:2: ( (this_ColorSensor_0= ruleColorSensor | this_TouchSensor_1= ruleTouchSensor | this_UltrasonicSensor_2= ruleUltrasonicSensor ) )
            // InternalDsl.g:208:2: (this_ColorSensor_0= ruleColorSensor | this_TouchSensor_1= ruleTouchSensor | this_UltrasonicSensor_2= ruleUltrasonicSensor )
            {
            // InternalDsl.g:208:2: (this_ColorSensor_0= ruleColorSensor | this_TouchSensor_1= ruleTouchSensor | this_UltrasonicSensor_2= ruleUltrasonicSensor )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt2=1;
                }
                break;
            case 20:
                {
                alt2=2;
                }
                break;
            case 22:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalDsl.g:209:3: this_ColorSensor_0= ruleColorSensor
                    {

                    			newCompositeNode(grammarAccess.getSensorTypeAccess().getColorSensorParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ColorSensor_0=ruleColorSensor();

                    state._fsp--;


                    			current = this_ColorSensor_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:218:3: this_TouchSensor_1= ruleTouchSensor
                    {

                    			newCompositeNode(grammarAccess.getSensorTypeAccess().getTouchSensorParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TouchSensor_1=ruleTouchSensor();

                    state._fsp--;


                    			current = this_TouchSensor_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDsl.g:227:3: this_UltrasonicSensor_2= ruleUltrasonicSensor
                    {

                    			newCompositeNode(grammarAccess.getSensorTypeAccess().getUltrasonicSensorParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_UltrasonicSensor_2=ruleUltrasonicSensor();

                    state._fsp--;


                    			current = this_UltrasonicSensor_2;
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
    // $ANTLR end "ruleSensorType"


    // $ANTLR start "entryRuleColorSensor"
    // InternalDsl.g:239:1: entryRuleColorSensor returns [EObject current=null] : iv_ruleColorSensor= ruleColorSensor EOF ;
    public final EObject entryRuleColorSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorSensor = null;


        try {
            // InternalDsl.g:239:52: (iv_ruleColorSensor= ruleColorSensor EOF )
            // InternalDsl.g:240:2: iv_ruleColorSensor= ruleColorSensor EOF
            {
             newCompositeNode(grammarAccess.getColorSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColorSensor=ruleColorSensor();

            state._fsp--;

             current =iv_ruleColorSensor; 
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
    // $ANTLR end "entryRuleColorSensor"


    // $ANTLR start "ruleColorSensor"
    // InternalDsl.g:246:1: ruleColorSensor returns [EObject current=null] : (otherlv_0= 'ColorSensor' otherlv_1= 'On' otherlv_2= 'DetectedColor' otherlv_3= 'is:' ( (lv_key_4_0= ruleColors ) ) ) ;
    public final EObject ruleColorSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Enumerator lv_key_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:252:2: ( (otherlv_0= 'ColorSensor' otherlv_1= 'On' otherlv_2= 'DetectedColor' otherlv_3= 'is:' ( (lv_key_4_0= ruleColors ) ) ) )
            // InternalDsl.g:253:2: (otherlv_0= 'ColorSensor' otherlv_1= 'On' otherlv_2= 'DetectedColor' otherlv_3= 'is:' ( (lv_key_4_0= ruleColors ) ) )
            {
            // InternalDsl.g:253:2: (otherlv_0= 'ColorSensor' otherlv_1= 'On' otherlv_2= 'DetectedColor' otherlv_3= 'is:' ( (lv_key_4_0= ruleColors ) ) )
            // InternalDsl.g:254:3: otherlv_0= 'ColorSensor' otherlv_1= 'On' otherlv_2= 'DetectedColor' otherlv_3= 'is:' ( (lv_key_4_0= ruleColors ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getColorSensorAccess().getColorSensorKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getColorSensorAccess().getOnKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getColorSensorAccess().getDetectedColorKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getColorSensorAccess().getIsKeyword_3());
            		
            // InternalDsl.g:270:3: ( (lv_key_4_0= ruleColors ) )
            // InternalDsl.g:271:4: (lv_key_4_0= ruleColors )
            {
            // InternalDsl.g:271:4: (lv_key_4_0= ruleColors )
            // InternalDsl.g:272:5: lv_key_4_0= ruleColors
            {

            					newCompositeNode(grammarAccess.getColorSensorAccess().getKeyColorsEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_key_4_0=ruleColors();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColorSensorRule());
            					}
            					set(
            						current,
            						"key",
            						lv_key_4_0,
            						"robot.ev3.Dsl.Colors");
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
    // $ANTLR end "ruleColorSensor"


    // $ANTLR start "entryRuleTouchSensor"
    // InternalDsl.g:293:1: entryRuleTouchSensor returns [EObject current=null] : iv_ruleTouchSensor= ruleTouchSensor EOF ;
    public final EObject entryRuleTouchSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTouchSensor = null;


        try {
            // InternalDsl.g:293:52: (iv_ruleTouchSensor= ruleTouchSensor EOF )
            // InternalDsl.g:294:2: iv_ruleTouchSensor= ruleTouchSensor EOF
            {
             newCompositeNode(grammarAccess.getTouchSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTouchSensor=ruleTouchSensor();

            state._fsp--;

             current =iv_ruleTouchSensor; 
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
    // $ANTLR end "entryRuleTouchSensor"


    // $ANTLR start "ruleTouchSensor"
    // InternalDsl.g:300:1: ruleTouchSensor returns [EObject current=null] : (otherlv_0= 'TouchSensor' otherlv_1= 'On' otherlv_2= 'TouchedSide:' ( (lv_key_3_0= ruleTouchSensorSides ) ) ) ;
    public final EObject ruleTouchSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Enumerator lv_key_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:306:2: ( (otherlv_0= 'TouchSensor' otherlv_1= 'On' otherlv_2= 'TouchedSide:' ( (lv_key_3_0= ruleTouchSensorSides ) ) ) )
            // InternalDsl.g:307:2: (otherlv_0= 'TouchSensor' otherlv_1= 'On' otherlv_2= 'TouchedSide:' ( (lv_key_3_0= ruleTouchSensorSides ) ) )
            {
            // InternalDsl.g:307:2: (otherlv_0= 'TouchSensor' otherlv_1= 'On' otherlv_2= 'TouchedSide:' ( (lv_key_3_0= ruleTouchSensorSides ) ) )
            // InternalDsl.g:308:3: otherlv_0= 'TouchSensor' otherlv_1= 'On' otherlv_2= 'TouchedSide:' ( (lv_key_3_0= ruleTouchSensorSides ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getTouchSensorAccess().getTouchSensorKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getTouchSensorAccess().getOnKeyword_1());
            		
            otherlv_2=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getTouchSensorAccess().getTouchedSideKeyword_2());
            		
            // InternalDsl.g:320:3: ( (lv_key_3_0= ruleTouchSensorSides ) )
            // InternalDsl.g:321:4: (lv_key_3_0= ruleTouchSensorSides )
            {
            // InternalDsl.g:321:4: (lv_key_3_0= ruleTouchSensorSides )
            // InternalDsl.g:322:5: lv_key_3_0= ruleTouchSensorSides
            {

            					newCompositeNode(grammarAccess.getTouchSensorAccess().getKeyTouchSensorSidesEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_key_3_0=ruleTouchSensorSides();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTouchSensorRule());
            					}
            					set(
            						current,
            						"key",
            						lv_key_3_0,
            						"robot.ev3.Dsl.TouchSensorSides");
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
    // $ANTLR end "ruleTouchSensor"


    // $ANTLR start "entryRuleUltrasonicSensor"
    // InternalDsl.g:343:1: entryRuleUltrasonicSensor returns [EObject current=null] : iv_ruleUltrasonicSensor= ruleUltrasonicSensor EOF ;
    public final EObject entryRuleUltrasonicSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUltrasonicSensor = null;


        try {
            // InternalDsl.g:343:57: (iv_ruleUltrasonicSensor= ruleUltrasonicSensor EOF )
            // InternalDsl.g:344:2: iv_ruleUltrasonicSensor= ruleUltrasonicSensor EOF
            {
             newCompositeNode(grammarAccess.getUltrasonicSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUltrasonicSensor=ruleUltrasonicSensor();

            state._fsp--;

             current =iv_ruleUltrasonicSensor; 
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
    // $ANTLR end "entryRuleUltrasonicSensor"


    // $ANTLR start "ruleUltrasonicSensor"
    // InternalDsl.g:350:1: ruleUltrasonicSensor returns [EObject current=null] : (otherlv_0= 'USensor' otherlv_1= 'On' otherlv_2= 'Distance:' ( (lv_comparator_3_0= ruleCompareOperator ) ) ( (lv_distance_4_0= RULE_DECIMAL ) ) ) ;
    public final EObject ruleUltrasonicSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_distance_4_0=null;
        Enumerator lv_comparator_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:356:2: ( (otherlv_0= 'USensor' otherlv_1= 'On' otherlv_2= 'Distance:' ( (lv_comparator_3_0= ruleCompareOperator ) ) ( (lv_distance_4_0= RULE_DECIMAL ) ) ) )
            // InternalDsl.g:357:2: (otherlv_0= 'USensor' otherlv_1= 'On' otherlv_2= 'Distance:' ( (lv_comparator_3_0= ruleCompareOperator ) ) ( (lv_distance_4_0= RULE_DECIMAL ) ) )
            {
            // InternalDsl.g:357:2: (otherlv_0= 'USensor' otherlv_1= 'On' otherlv_2= 'Distance:' ( (lv_comparator_3_0= ruleCompareOperator ) ) ( (lv_distance_4_0= RULE_DECIMAL ) ) )
            // InternalDsl.g:358:3: otherlv_0= 'USensor' otherlv_1= 'On' otherlv_2= 'Distance:' ( (lv_comparator_3_0= ruleCompareOperator ) ) ( (lv_distance_4_0= RULE_DECIMAL ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getUltrasonicSensorAccess().getUSensorKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getUltrasonicSensorAccess().getOnKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getUltrasonicSensorAccess().getDistanceKeyword_2());
            		
            // InternalDsl.g:370:3: ( (lv_comparator_3_0= ruleCompareOperator ) )
            // InternalDsl.g:371:4: (lv_comparator_3_0= ruleCompareOperator )
            {
            // InternalDsl.g:371:4: (lv_comparator_3_0= ruleCompareOperator )
            // InternalDsl.g:372:5: lv_comparator_3_0= ruleCompareOperator
            {

            					newCompositeNode(grammarAccess.getUltrasonicSensorAccess().getComparatorCompareOperatorEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_18);
            lv_comparator_3_0=ruleCompareOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUltrasonicSensorRule());
            					}
            					set(
            						current,
            						"comparator",
            						lv_comparator_3_0,
            						"robot.ev3.Dsl.CompareOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:389:3: ( (lv_distance_4_0= RULE_DECIMAL ) )
            // InternalDsl.g:390:4: (lv_distance_4_0= RULE_DECIMAL )
            {
            // InternalDsl.g:390:4: (lv_distance_4_0= RULE_DECIMAL )
            // InternalDsl.g:391:5: lv_distance_4_0= RULE_DECIMAL
            {
            lv_distance_4_0=(Token)match(input,RULE_DECIMAL,FOLLOW_2); 

            					newLeafNode(lv_distance_4_0, grammarAccess.getUltrasonicSensorAccess().getDistanceDECIMALTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUltrasonicSensorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"distance",
            						lv_distance_4_0,
            						"robot.ev3.Dsl.DECIMAL");
            				

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
    // $ANTLR end "ruleUltrasonicSensor"


    // $ANTLR start "ruleTouchSensorSides"
    // InternalDsl.g:411:1: ruleTouchSensorSides returns [Enumerator current=null] : ( (enumLiteral_0= 'LEFT' ) | (enumLiteral_1= 'RIGHT' ) | (enumLiteral_2= 'BOTH' ) ) ;
    public final Enumerator ruleTouchSensorSides() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDsl.g:417:2: ( ( (enumLiteral_0= 'LEFT' ) | (enumLiteral_1= 'RIGHT' ) | (enumLiteral_2= 'BOTH' ) ) )
            // InternalDsl.g:418:2: ( (enumLiteral_0= 'LEFT' ) | (enumLiteral_1= 'RIGHT' ) | (enumLiteral_2= 'BOTH' ) )
            {
            // InternalDsl.g:418:2: ( (enumLiteral_0= 'LEFT' ) | (enumLiteral_1= 'RIGHT' ) | (enumLiteral_2= 'BOTH' ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt3=1;
                }
                break;
            case 25:
                {
                alt3=2;
                }
                break;
            case 26:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalDsl.g:419:3: (enumLiteral_0= 'LEFT' )
                    {
                    // InternalDsl.g:419:3: (enumLiteral_0= 'LEFT' )
                    // InternalDsl.g:420:4: enumLiteral_0= 'LEFT'
                    {
                    enumLiteral_0=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getTouchSensorSidesAccess().getLEFTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTouchSensorSidesAccess().getLEFTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:427:3: (enumLiteral_1= 'RIGHT' )
                    {
                    // InternalDsl.g:427:3: (enumLiteral_1= 'RIGHT' )
                    // InternalDsl.g:428:4: enumLiteral_1= 'RIGHT'
                    {
                    enumLiteral_1=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getTouchSensorSidesAccess().getRIGHTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTouchSensorSidesAccess().getRIGHTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:435:3: (enumLiteral_2= 'BOTH' )
                    {
                    // InternalDsl.g:435:3: (enumLiteral_2= 'BOTH' )
                    // InternalDsl.g:436:4: enumLiteral_2= 'BOTH'
                    {
                    enumLiteral_2=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getTouchSensorSidesAccess().getBOTHEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTouchSensorSidesAccess().getBOTHEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleTouchSensorSides"


    // $ANTLR start "ruleActions"
    // InternalDsl.g:446:1: ruleActions returns [Enumerator current=null] : ( (enumLiteral_0= 'ROTATELEFT' ) | (enumLiteral_1= 'ROTATERIGHT' ) | (enumLiteral_2= 'DRIVEFORWARD' ) | (enumLiteral_3= 'DRIVEBACKWARD' ) | (enumLiteral_4= 'STOP' ) | (enumLiteral_5= 'TURNAROUND' ) | (enumLiteral_6= 'BEEP' ) ) ;
    public final Enumerator ruleActions() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalDsl.g:452:2: ( ( (enumLiteral_0= 'ROTATELEFT' ) | (enumLiteral_1= 'ROTATERIGHT' ) | (enumLiteral_2= 'DRIVEFORWARD' ) | (enumLiteral_3= 'DRIVEBACKWARD' ) | (enumLiteral_4= 'STOP' ) | (enumLiteral_5= 'TURNAROUND' ) | (enumLiteral_6= 'BEEP' ) ) )
            // InternalDsl.g:453:2: ( (enumLiteral_0= 'ROTATELEFT' ) | (enumLiteral_1= 'ROTATERIGHT' ) | (enumLiteral_2= 'DRIVEFORWARD' ) | (enumLiteral_3= 'DRIVEBACKWARD' ) | (enumLiteral_4= 'STOP' ) | (enumLiteral_5= 'TURNAROUND' ) | (enumLiteral_6= 'BEEP' ) )
            {
            // InternalDsl.g:453:2: ( (enumLiteral_0= 'ROTATELEFT' ) | (enumLiteral_1= 'ROTATERIGHT' ) | (enumLiteral_2= 'DRIVEFORWARD' ) | (enumLiteral_3= 'DRIVEBACKWARD' ) | (enumLiteral_4= 'STOP' ) | (enumLiteral_5= 'TURNAROUND' ) | (enumLiteral_6= 'BEEP' ) )
            int alt4=7;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt4=1;
                }
                break;
            case 28:
                {
                alt4=2;
                }
                break;
            case 29:
                {
                alt4=3;
                }
                break;
            case 30:
                {
                alt4=4;
                }
                break;
            case 31:
                {
                alt4=5;
                }
                break;
            case 32:
                {
                alt4=6;
                }
                break;
            case 33:
                {
                alt4=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalDsl.g:454:3: (enumLiteral_0= 'ROTATELEFT' )
                    {
                    // InternalDsl.g:454:3: (enumLiteral_0= 'ROTATELEFT' )
                    // InternalDsl.g:455:4: enumLiteral_0= 'ROTATELEFT'
                    {
                    enumLiteral_0=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getActionsAccess().getROTATE_LEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getActionsAccess().getROTATE_LEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:462:3: (enumLiteral_1= 'ROTATERIGHT' )
                    {
                    // InternalDsl.g:462:3: (enumLiteral_1= 'ROTATERIGHT' )
                    // InternalDsl.g:463:4: enumLiteral_1= 'ROTATERIGHT'
                    {
                    enumLiteral_1=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getActionsAccess().getROTATE_REnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getActionsAccess().getROTATE_REnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:470:3: (enumLiteral_2= 'DRIVEFORWARD' )
                    {
                    // InternalDsl.g:470:3: (enumLiteral_2= 'DRIVEFORWARD' )
                    // InternalDsl.g:471:4: enumLiteral_2= 'DRIVEFORWARD'
                    {
                    enumLiteral_2=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getActionsAccess().getDRIVE_FORWARDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getActionsAccess().getDRIVE_FORWARDEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:478:3: (enumLiteral_3= 'DRIVEBACKWARD' )
                    {
                    // InternalDsl.g:478:3: (enumLiteral_3= 'DRIVEBACKWARD' )
                    // InternalDsl.g:479:4: enumLiteral_3= 'DRIVEBACKWARD'
                    {
                    enumLiteral_3=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getActionsAccess().getDRIVE_BACKWARDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getActionsAccess().getDRIVE_BACKWARDEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:486:3: (enumLiteral_4= 'STOP' )
                    {
                    // InternalDsl.g:486:3: (enumLiteral_4= 'STOP' )
                    // InternalDsl.g:487:4: enumLiteral_4= 'STOP'
                    {
                    enumLiteral_4=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getActionsAccess().getSTOP_DRIVINGEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getActionsAccess().getSTOP_DRIVINGEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalDsl.g:494:3: (enumLiteral_5= 'TURNAROUND' )
                    {
                    // InternalDsl.g:494:3: (enumLiteral_5= 'TURNAROUND' )
                    // InternalDsl.g:495:4: enumLiteral_5= 'TURNAROUND'
                    {
                    enumLiteral_5=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getActionsAccess().getTURN_AROUNDEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getActionsAccess().getTURN_AROUNDEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalDsl.g:502:3: (enumLiteral_6= 'BEEP' )
                    {
                    // InternalDsl.g:502:3: (enumLiteral_6= 'BEEP' )
                    // InternalDsl.g:503:4: enumLiteral_6= 'BEEP'
                    {
                    enumLiteral_6=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getActionsAccess().getBEEPEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getActionsAccess().getBEEPEnumLiteralDeclaration_6());
                    			

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
    // $ANTLR end "ruleActions"


    // $ANTLR start "ruleColors"
    // InternalDsl.g:513:1: ruleColors returns [Enumerator current=null] : ( (enumLiteral_0= 'BLACK' ) | (enumLiteral_1= 'BLUE' ) | (enumLiteral_2= 'CYAN' ) | (enumLiteral_3= 'DARK_GRAY' ) | (enumLiteral_4= 'GRAY' ) | (enumLiteral_5= 'GREEN' ) | (enumLiteral_6= 'LIGHT_GRAY' ) | (enumLiteral_7= 'MAGENTA' ) | (enumLiteral_8= 'ORANGE' ) | (enumLiteral_9= 'PINK' ) | (enumLiteral_10= 'RED' ) | (enumLiteral_11= 'WHITE' ) | (enumLiteral_12= 'YELLOW' ) ) ;
    public final Enumerator ruleColors() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;
        Token enumLiteral_12=null;


        	enterRule();

        try {
            // InternalDsl.g:519:2: ( ( (enumLiteral_0= 'BLACK' ) | (enumLiteral_1= 'BLUE' ) | (enumLiteral_2= 'CYAN' ) | (enumLiteral_3= 'DARK_GRAY' ) | (enumLiteral_4= 'GRAY' ) | (enumLiteral_5= 'GREEN' ) | (enumLiteral_6= 'LIGHT_GRAY' ) | (enumLiteral_7= 'MAGENTA' ) | (enumLiteral_8= 'ORANGE' ) | (enumLiteral_9= 'PINK' ) | (enumLiteral_10= 'RED' ) | (enumLiteral_11= 'WHITE' ) | (enumLiteral_12= 'YELLOW' ) ) )
            // InternalDsl.g:520:2: ( (enumLiteral_0= 'BLACK' ) | (enumLiteral_1= 'BLUE' ) | (enumLiteral_2= 'CYAN' ) | (enumLiteral_3= 'DARK_GRAY' ) | (enumLiteral_4= 'GRAY' ) | (enumLiteral_5= 'GREEN' ) | (enumLiteral_6= 'LIGHT_GRAY' ) | (enumLiteral_7= 'MAGENTA' ) | (enumLiteral_8= 'ORANGE' ) | (enumLiteral_9= 'PINK' ) | (enumLiteral_10= 'RED' ) | (enumLiteral_11= 'WHITE' ) | (enumLiteral_12= 'YELLOW' ) )
            {
            // InternalDsl.g:520:2: ( (enumLiteral_0= 'BLACK' ) | (enumLiteral_1= 'BLUE' ) | (enumLiteral_2= 'CYAN' ) | (enumLiteral_3= 'DARK_GRAY' ) | (enumLiteral_4= 'GRAY' ) | (enumLiteral_5= 'GREEN' ) | (enumLiteral_6= 'LIGHT_GRAY' ) | (enumLiteral_7= 'MAGENTA' ) | (enumLiteral_8= 'ORANGE' ) | (enumLiteral_9= 'PINK' ) | (enumLiteral_10= 'RED' ) | (enumLiteral_11= 'WHITE' ) | (enumLiteral_12= 'YELLOW' ) )
            int alt5=13;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt5=1;
                }
                break;
            case 35:
                {
                alt5=2;
                }
                break;
            case 36:
                {
                alt5=3;
                }
                break;
            case 37:
                {
                alt5=4;
                }
                break;
            case 38:
                {
                alt5=5;
                }
                break;
            case 39:
                {
                alt5=6;
                }
                break;
            case 40:
                {
                alt5=7;
                }
                break;
            case 41:
                {
                alt5=8;
                }
                break;
            case 42:
                {
                alt5=9;
                }
                break;
            case 43:
                {
                alt5=10;
                }
                break;
            case 44:
                {
                alt5=11;
                }
                break;
            case 45:
                {
                alt5=12;
                }
                break;
            case 46:
                {
                alt5=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalDsl.g:521:3: (enumLiteral_0= 'BLACK' )
                    {
                    // InternalDsl.g:521:3: (enumLiteral_0= 'BLACK' )
                    // InternalDsl.g:522:4: enumLiteral_0= 'BLACK'
                    {
                    enumLiteral_0=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getBLACKEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getColorsAccess().getBLACKEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:529:3: (enumLiteral_1= 'BLUE' )
                    {
                    // InternalDsl.g:529:3: (enumLiteral_1= 'BLUE' )
                    // InternalDsl.g:530:4: enumLiteral_1= 'BLUE'
                    {
                    enumLiteral_1=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getBLUEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getColorsAccess().getBLUEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:537:3: (enumLiteral_2= 'CYAN' )
                    {
                    // InternalDsl.g:537:3: (enumLiteral_2= 'CYAN' )
                    // InternalDsl.g:538:4: enumLiteral_2= 'CYAN'
                    {
                    enumLiteral_2=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getCYANEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getColorsAccess().getCYANEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:545:3: (enumLiteral_3= 'DARK_GRAY' )
                    {
                    // InternalDsl.g:545:3: (enumLiteral_3= 'DARK_GRAY' )
                    // InternalDsl.g:546:4: enumLiteral_3= 'DARK_GRAY'
                    {
                    enumLiteral_3=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getDARK_GRAYEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getColorsAccess().getDARK_GRAYEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:553:3: (enumLiteral_4= 'GRAY' )
                    {
                    // InternalDsl.g:553:3: (enumLiteral_4= 'GRAY' )
                    // InternalDsl.g:554:4: enumLiteral_4= 'GRAY'
                    {
                    enumLiteral_4=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getGRAYEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getColorsAccess().getGRAYEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalDsl.g:561:3: (enumLiteral_5= 'GREEN' )
                    {
                    // InternalDsl.g:561:3: (enumLiteral_5= 'GREEN' )
                    // InternalDsl.g:562:4: enumLiteral_5= 'GREEN'
                    {
                    enumLiteral_5=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getGREENEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getColorsAccess().getGREENEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalDsl.g:569:3: (enumLiteral_6= 'LIGHT_GRAY' )
                    {
                    // InternalDsl.g:569:3: (enumLiteral_6= 'LIGHT_GRAY' )
                    // InternalDsl.g:570:4: enumLiteral_6= 'LIGHT_GRAY'
                    {
                    enumLiteral_6=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getLIGHT_GRAYEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getColorsAccess().getLIGHT_GRAYEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalDsl.g:577:3: (enumLiteral_7= 'MAGENTA' )
                    {
                    // InternalDsl.g:577:3: (enumLiteral_7= 'MAGENTA' )
                    // InternalDsl.g:578:4: enumLiteral_7= 'MAGENTA'
                    {
                    enumLiteral_7=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getMAGENTAEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getColorsAccess().getMAGENTAEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalDsl.g:585:3: (enumLiteral_8= 'ORANGE' )
                    {
                    // InternalDsl.g:585:3: (enumLiteral_8= 'ORANGE' )
                    // InternalDsl.g:586:4: enumLiteral_8= 'ORANGE'
                    {
                    enumLiteral_8=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getORANGEEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getColorsAccess().getORANGEEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalDsl.g:593:3: (enumLiteral_9= 'PINK' )
                    {
                    // InternalDsl.g:593:3: (enumLiteral_9= 'PINK' )
                    // InternalDsl.g:594:4: enumLiteral_9= 'PINK'
                    {
                    enumLiteral_9=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getPINKEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getColorsAccess().getPINKEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalDsl.g:601:3: (enumLiteral_10= 'RED' )
                    {
                    // InternalDsl.g:601:3: (enumLiteral_10= 'RED' )
                    // InternalDsl.g:602:4: enumLiteral_10= 'RED'
                    {
                    enumLiteral_10=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getREDEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getColorsAccess().getREDEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalDsl.g:609:3: (enumLiteral_11= 'WHITE' )
                    {
                    // InternalDsl.g:609:3: (enumLiteral_11= 'WHITE' )
                    // InternalDsl.g:610:4: enumLiteral_11= 'WHITE'
                    {
                    enumLiteral_11=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getWHITEEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getColorsAccess().getWHITEEnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalDsl.g:617:3: (enumLiteral_12= 'YELLOW' )
                    {
                    // InternalDsl.g:617:3: (enumLiteral_12= 'YELLOW' )
                    // InternalDsl.g:618:4: enumLiteral_12= 'YELLOW'
                    {
                    enumLiteral_12=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getYELLOWEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_12, grammarAccess.getColorsAccess().getYELLOWEnumLiteralDeclaration_12());
                    			

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
    // $ANTLR end "ruleColors"


    // $ANTLR start "ruleCompareOperator"
    // InternalDsl.g:628:1: ruleCompareOperator returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '<' ) ) ;
    public final Enumerator ruleCompareOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalDsl.g:634:2: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '<' ) ) )
            // InternalDsl.g:635:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '<' ) )
            {
            // InternalDsl.g:635:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '<' ) )
            int alt6=6;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt6=1;
                }
                break;
            case 48:
                {
                alt6=2;
                }
                break;
            case 49:
                {
                alt6=3;
                }
                break;
            case 50:
                {
                alt6=4;
                }
                break;
            case 51:
                {
                alt6=5;
                }
                break;
            case 52:
                {
                alt6=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalDsl.g:636:3: (enumLiteral_0= '==' )
                    {
                    // InternalDsl.g:636:3: (enumLiteral_0= '==' )
                    // InternalDsl.g:637:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:644:3: (enumLiteral_1= '!=' )
                    {
                    // InternalDsl.g:644:3: (enumLiteral_1= '!=' )
                    // InternalDsl.g:645:4: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getCompareOperatorAccess().getNEQEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCompareOperatorAccess().getNEQEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:652:3: (enumLiteral_2= '>=' )
                    {
                    // InternalDsl.g:652:3: (enumLiteral_2= '>=' )
                    // InternalDsl.g:653:4: enumLiteral_2= '>='
                    {
                    enumLiteral_2=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:660:3: (enumLiteral_3= '>' )
                    {
                    // InternalDsl.g:660:3: (enumLiteral_3= '>' )
                    // InternalDsl.g:661:4: enumLiteral_3= '>'
                    {
                    enumLiteral_3=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getCompareOperatorAccess().getGEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getCompareOperatorAccess().getGEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:668:3: (enumLiteral_4= '<=' )
                    {
                    // InternalDsl.g:668:3: (enumLiteral_4= '<=' )
                    // InternalDsl.g:669:4: enumLiteral_4= '<='
                    {
                    enumLiteral_4=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalDsl.g:676:3: (enumLiteral_5= '<' )
                    {
                    // InternalDsl.g:676:3: (enumLiteral_5= '<' )
                    // InternalDsl.g:677:4: enumLiteral_5= '<'
                    {
                    enumLiteral_5=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getCompareOperatorAccess().getLEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getCompareOperatorAccess().getLEnumLiteralDeclaration_5());
                    			

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
    // $ANTLR end "ruleCompareOperator"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000510000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000003F8000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00007FFC00000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000007000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x001F800000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000020L});

}