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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_DECIMAL", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Mission:'", "'Task:'", "'Uses:'", "'Do:'", "'Not:'", "'AvoidObjects'", "'ColorSensor'", "'On'", "'DetectedColor'", "'is:'", "'TouchSensor'", "'TouchedSide:'", "'USensor'", "'Distance:'", "'LEFT'", "'RIGHT'", "'BOTH'", "'ROTATELEFT'", "'ROTATERIGHT'", "'DRIVEFORWARD'", "'DRIVEBACKWARD'", "'STOP'", "'TURNAROUND'", "'BEEP'", "'MEASURE'", "'DRIVETOEDGE'", "'BLACK'", "'BLUE'", "'CYAN'", "'DARK_GRAY'", "'GRAY'", "'GREEN'", "'LIGHT_GRAY'", "'MAGENTA'", "'ORANGE'", "'PINK'", "'RED'", "'WHITE'", "'YELLOW'", "'=='", "'!='", "'>='", "'>'", "'<='", "'<'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
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
    // InternalDsl.g:114:1: ruleTask returns [EObject current=null] : (otherlv_0= 'Task:' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Uses:' ( (lv_sensor_3_0= ruleSensorType ) ) )? otherlv_4= 'Do:' ( (lv_action_5_0= ruleActions ) ) otherlv_6= 'Not:' ( (lv_ignoreBehavior_7_0= ruleIgnorables ) ) ) ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_sensor_3_0 = null;

        Enumerator lv_action_5_0 = null;

        EObject lv_ignoreBehavior_7_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:120:2: ( (otherlv_0= 'Task:' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Uses:' ( (lv_sensor_3_0= ruleSensorType ) ) )? otherlv_4= 'Do:' ( (lv_action_5_0= ruleActions ) ) otherlv_6= 'Not:' ( (lv_ignoreBehavior_7_0= ruleIgnorables ) ) ) )
            // InternalDsl.g:121:2: (otherlv_0= 'Task:' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Uses:' ( (lv_sensor_3_0= ruleSensorType ) ) )? otherlv_4= 'Do:' ( (lv_action_5_0= ruleActions ) ) otherlv_6= 'Not:' ( (lv_ignoreBehavior_7_0= ruleIgnorables ) ) )
            {
            // InternalDsl.g:121:2: (otherlv_0= 'Task:' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Uses:' ( (lv_sensor_3_0= ruleSensorType ) ) )? otherlv_4= 'Do:' ( (lv_action_5_0= ruleActions ) ) otherlv_6= 'Not:' ( (lv_ignoreBehavior_7_0= ruleIgnorables ) ) )
            // InternalDsl.g:122:3: otherlv_0= 'Task:' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'Uses:' ( (lv_sensor_3_0= ruleSensorType ) ) )? otherlv_4= 'Do:' ( (lv_action_5_0= ruleActions ) ) otherlv_6= 'Not:' ( (lv_ignoreBehavior_7_0= ruleIgnorables ) )
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

            // InternalDsl.g:144:3: (otherlv_2= 'Uses:' ( (lv_sensor_3_0= ruleSensorType ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDsl.g:145:4: otherlv_2= 'Uses:' ( (lv_sensor_3_0= ruleSensorType ) )
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getTaskAccess().getUsesKeyword_2_0());
                    			
                    // InternalDsl.g:149:4: ( (lv_sensor_3_0= ruleSensorType ) )
                    // InternalDsl.g:150:5: (lv_sensor_3_0= ruleSensorType )
                    {
                    // InternalDsl.g:150:5: (lv_sensor_3_0= ruleSensorType )
                    // InternalDsl.g:151:6: lv_sensor_3_0= ruleSensorType
                    {

                    						newCompositeNode(grammarAccess.getTaskAccess().getSensorSensorTypeParserRuleCall_2_1_0());
                    					
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


                    }
                    break;

            }

            otherlv_4=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getTaskAccess().getDoKeyword_3());
            		
            // InternalDsl.g:173:3: ( (lv_action_5_0= ruleActions ) )
            // InternalDsl.g:174:4: (lv_action_5_0= ruleActions )
            {
            // InternalDsl.g:174:4: (lv_action_5_0= ruleActions )
            // InternalDsl.g:175:5: lv_action_5_0= ruleActions
            {

            					newCompositeNode(grammarAccess.getTaskAccess().getActionActionsEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_10);
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

            otherlv_6=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_6, grammarAccess.getTaskAccess().getNotKeyword_5());
            		
            // InternalDsl.g:196:3: ( (lv_ignoreBehavior_7_0= ruleIgnorables ) )
            // InternalDsl.g:197:4: (lv_ignoreBehavior_7_0= ruleIgnorables )
            {
            // InternalDsl.g:197:4: (lv_ignoreBehavior_7_0= ruleIgnorables )
            // InternalDsl.g:198:5: lv_ignoreBehavior_7_0= ruleIgnorables
            {

            					newCompositeNode(grammarAccess.getTaskAccess().getIgnoreBehaviorIgnorablesParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_ignoreBehavior_7_0=ruleIgnorables();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTaskRule());
            					}
            					set(
            						current,
            						"ignoreBehavior",
            						true,
            						"robot.ev3.Dsl.Ignorables");
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


    // $ANTLR start "entryRuleIgnorables"
    // InternalDsl.g:219:1: entryRuleIgnorables returns [EObject current=null] : iv_ruleIgnorables= ruleIgnorables EOF ;
    public final EObject entryRuleIgnorables() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIgnorables = null;


        try {
            // InternalDsl.g:219:51: (iv_ruleIgnorables= ruleIgnorables EOF )
            // InternalDsl.g:220:2: iv_ruleIgnorables= ruleIgnorables EOF
            {
             newCompositeNode(grammarAccess.getIgnorablesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIgnorables=ruleIgnorables();

            state._fsp--;

             current =iv_ruleIgnorables; 
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
    // $ANTLR end "entryRuleIgnorables"


    // $ANTLR start "ruleIgnorables"
    // InternalDsl.g:226:1: ruleIgnorables returns [EObject current=null] : ( (lv_AVOID_OBJECTS_0_0= 'AvoidObjects' ) ) ;
    public final EObject ruleIgnorables() throws RecognitionException {
        EObject current = null;

        Token lv_AVOID_OBJECTS_0_0=null;


        	enterRule();

        try {
            // InternalDsl.g:232:2: ( ( (lv_AVOID_OBJECTS_0_0= 'AvoidObjects' ) ) )
            // InternalDsl.g:233:2: ( (lv_AVOID_OBJECTS_0_0= 'AvoidObjects' ) )
            {
            // InternalDsl.g:233:2: ( (lv_AVOID_OBJECTS_0_0= 'AvoidObjects' ) )
            // InternalDsl.g:234:3: (lv_AVOID_OBJECTS_0_0= 'AvoidObjects' )
            {
            // InternalDsl.g:234:3: (lv_AVOID_OBJECTS_0_0= 'AvoidObjects' )
            // InternalDsl.g:235:4: lv_AVOID_OBJECTS_0_0= 'AvoidObjects'
            {
            lv_AVOID_OBJECTS_0_0=(Token)match(input,17,FOLLOW_2); 

            				newLeafNode(lv_AVOID_OBJECTS_0_0, grammarAccess.getIgnorablesAccess().getAVOID_OBJECTSAvoidObjectsKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIgnorablesRule());
            				}
            				setWithLastConsumed(current, "AVOID_OBJECTS", lv_AVOID_OBJECTS_0_0, "AvoidObjects");
            			

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
    // $ANTLR end "ruleIgnorables"


    // $ANTLR start "entryRuleSensorType"
    // InternalDsl.g:250:1: entryRuleSensorType returns [EObject current=null] : iv_ruleSensorType= ruleSensorType EOF ;
    public final EObject entryRuleSensorType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorType = null;


        try {
            // InternalDsl.g:250:51: (iv_ruleSensorType= ruleSensorType EOF )
            // InternalDsl.g:251:2: iv_ruleSensorType= ruleSensorType EOF
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
    // InternalDsl.g:257:1: ruleSensorType returns [EObject current=null] : (this_ColorSensor_0= ruleColorSensor | this_TouchSensor_1= ruleTouchSensor | this_UltrasonicSensor_2= ruleUltrasonicSensor ) ;
    public final EObject ruleSensorType() throws RecognitionException {
        EObject current = null;

        EObject this_ColorSensor_0 = null;

        EObject this_TouchSensor_1 = null;

        EObject this_UltrasonicSensor_2 = null;



        	enterRule();

        try {
            // InternalDsl.g:263:2: ( (this_ColorSensor_0= ruleColorSensor | this_TouchSensor_1= ruleTouchSensor | this_UltrasonicSensor_2= ruleUltrasonicSensor ) )
            // InternalDsl.g:264:2: (this_ColorSensor_0= ruleColorSensor | this_TouchSensor_1= ruleTouchSensor | this_UltrasonicSensor_2= ruleUltrasonicSensor )
            {
            // InternalDsl.g:264:2: (this_ColorSensor_0= ruleColorSensor | this_TouchSensor_1= ruleTouchSensor | this_UltrasonicSensor_2= ruleUltrasonicSensor )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt3=1;
                }
                break;
            case 22:
                {
                alt3=2;
                }
                break;
            case 24:
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
                    // InternalDsl.g:265:3: this_ColorSensor_0= ruleColorSensor
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
                    // InternalDsl.g:274:3: this_TouchSensor_1= ruleTouchSensor
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
                    // InternalDsl.g:283:3: this_UltrasonicSensor_2= ruleUltrasonicSensor
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
    // InternalDsl.g:295:1: entryRuleColorSensor returns [EObject current=null] : iv_ruleColorSensor= ruleColorSensor EOF ;
    public final EObject entryRuleColorSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorSensor = null;


        try {
            // InternalDsl.g:295:52: (iv_ruleColorSensor= ruleColorSensor EOF )
            // InternalDsl.g:296:2: iv_ruleColorSensor= ruleColorSensor EOF
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
    // InternalDsl.g:302:1: ruleColorSensor returns [EObject current=null] : (otherlv_0= 'ColorSensor' otherlv_1= 'On' otherlv_2= 'DetectedColor' otherlv_3= 'is:' ( (lv_key_4_0= ruleColors ) ) ) ;
    public final EObject ruleColorSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Enumerator lv_key_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:308:2: ( (otherlv_0= 'ColorSensor' otherlv_1= 'On' otherlv_2= 'DetectedColor' otherlv_3= 'is:' ( (lv_key_4_0= ruleColors ) ) ) )
            // InternalDsl.g:309:2: (otherlv_0= 'ColorSensor' otherlv_1= 'On' otherlv_2= 'DetectedColor' otherlv_3= 'is:' ( (lv_key_4_0= ruleColors ) ) )
            {
            // InternalDsl.g:309:2: (otherlv_0= 'ColorSensor' otherlv_1= 'On' otherlv_2= 'DetectedColor' otherlv_3= 'is:' ( (lv_key_4_0= ruleColors ) ) )
            // InternalDsl.g:310:3: otherlv_0= 'ColorSensor' otherlv_1= 'On' otherlv_2= 'DetectedColor' otherlv_3= 'is:' ( (lv_key_4_0= ruleColors ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getColorSensorAccess().getColorSensorKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getColorSensorAccess().getOnKeyword_1());
            		
            otherlv_2=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getColorSensorAccess().getDetectedColorKeyword_2());
            		
            otherlv_3=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getColorSensorAccess().getIsKeyword_3());
            		
            // InternalDsl.g:326:3: ( (lv_key_4_0= ruleColors ) )
            // InternalDsl.g:327:4: (lv_key_4_0= ruleColors )
            {
            // InternalDsl.g:327:4: (lv_key_4_0= ruleColors )
            // InternalDsl.g:328:5: lv_key_4_0= ruleColors
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
    // InternalDsl.g:349:1: entryRuleTouchSensor returns [EObject current=null] : iv_ruleTouchSensor= ruleTouchSensor EOF ;
    public final EObject entryRuleTouchSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTouchSensor = null;


        try {
            // InternalDsl.g:349:52: (iv_ruleTouchSensor= ruleTouchSensor EOF )
            // InternalDsl.g:350:2: iv_ruleTouchSensor= ruleTouchSensor EOF
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
    // InternalDsl.g:356:1: ruleTouchSensor returns [EObject current=null] : (otherlv_0= 'TouchSensor' otherlv_1= 'On' otherlv_2= 'TouchedSide:' ( (lv_key_3_0= ruleTouchSensorSides ) ) ) ;
    public final EObject ruleTouchSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Enumerator lv_key_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:362:2: ( (otherlv_0= 'TouchSensor' otherlv_1= 'On' otherlv_2= 'TouchedSide:' ( (lv_key_3_0= ruleTouchSensorSides ) ) ) )
            // InternalDsl.g:363:2: (otherlv_0= 'TouchSensor' otherlv_1= 'On' otherlv_2= 'TouchedSide:' ( (lv_key_3_0= ruleTouchSensorSides ) ) )
            {
            // InternalDsl.g:363:2: (otherlv_0= 'TouchSensor' otherlv_1= 'On' otherlv_2= 'TouchedSide:' ( (lv_key_3_0= ruleTouchSensorSides ) ) )
            // InternalDsl.g:364:3: otherlv_0= 'TouchSensor' otherlv_1= 'On' otherlv_2= 'TouchedSide:' ( (lv_key_3_0= ruleTouchSensorSides ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getTouchSensorAccess().getTouchSensorKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getTouchSensorAccess().getOnKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getTouchSensorAccess().getTouchedSideKeyword_2());
            		
            // InternalDsl.g:376:3: ( (lv_key_3_0= ruleTouchSensorSides ) )
            // InternalDsl.g:377:4: (lv_key_3_0= ruleTouchSensorSides )
            {
            // InternalDsl.g:377:4: (lv_key_3_0= ruleTouchSensorSides )
            // InternalDsl.g:378:5: lv_key_3_0= ruleTouchSensorSides
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
    // InternalDsl.g:399:1: entryRuleUltrasonicSensor returns [EObject current=null] : iv_ruleUltrasonicSensor= ruleUltrasonicSensor EOF ;
    public final EObject entryRuleUltrasonicSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUltrasonicSensor = null;


        try {
            // InternalDsl.g:399:57: (iv_ruleUltrasonicSensor= ruleUltrasonicSensor EOF )
            // InternalDsl.g:400:2: iv_ruleUltrasonicSensor= ruleUltrasonicSensor EOF
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
    // InternalDsl.g:406:1: ruleUltrasonicSensor returns [EObject current=null] : (otherlv_0= 'USensor' otherlv_1= 'On' otherlv_2= 'Distance:' ( (lv_comparator_3_0= ruleCompareOperator ) ) ( (lv_distance_4_0= RULE_DECIMAL ) ) ) ;
    public final EObject ruleUltrasonicSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_distance_4_0=null;
        Enumerator lv_comparator_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:412:2: ( (otherlv_0= 'USensor' otherlv_1= 'On' otherlv_2= 'Distance:' ( (lv_comparator_3_0= ruleCompareOperator ) ) ( (lv_distance_4_0= RULE_DECIMAL ) ) ) )
            // InternalDsl.g:413:2: (otherlv_0= 'USensor' otherlv_1= 'On' otherlv_2= 'Distance:' ( (lv_comparator_3_0= ruleCompareOperator ) ) ( (lv_distance_4_0= RULE_DECIMAL ) ) )
            {
            // InternalDsl.g:413:2: (otherlv_0= 'USensor' otherlv_1= 'On' otherlv_2= 'Distance:' ( (lv_comparator_3_0= ruleCompareOperator ) ) ( (lv_distance_4_0= RULE_DECIMAL ) ) )
            // InternalDsl.g:414:3: otherlv_0= 'USensor' otherlv_1= 'On' otherlv_2= 'Distance:' ( (lv_comparator_3_0= ruleCompareOperator ) ) ( (lv_distance_4_0= RULE_DECIMAL ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getUltrasonicSensorAccess().getUSensorKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getUltrasonicSensorAccess().getOnKeyword_1());
            		
            otherlv_2=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getUltrasonicSensorAccess().getDistanceKeyword_2());
            		
            // InternalDsl.g:426:3: ( (lv_comparator_3_0= ruleCompareOperator ) )
            // InternalDsl.g:427:4: (lv_comparator_3_0= ruleCompareOperator )
            {
            // InternalDsl.g:427:4: (lv_comparator_3_0= ruleCompareOperator )
            // InternalDsl.g:428:5: lv_comparator_3_0= ruleCompareOperator
            {

            					newCompositeNode(grammarAccess.getUltrasonicSensorAccess().getComparatorCompareOperatorEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_20);
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

            // InternalDsl.g:445:3: ( (lv_distance_4_0= RULE_DECIMAL ) )
            // InternalDsl.g:446:4: (lv_distance_4_0= RULE_DECIMAL )
            {
            // InternalDsl.g:446:4: (lv_distance_4_0= RULE_DECIMAL )
            // InternalDsl.g:447:5: lv_distance_4_0= RULE_DECIMAL
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
    // InternalDsl.g:467:1: ruleTouchSensorSides returns [Enumerator current=null] : ( (enumLiteral_0= 'LEFT' ) | (enumLiteral_1= 'RIGHT' ) | (enumLiteral_2= 'BOTH' ) ) ;
    public final Enumerator ruleTouchSensorSides() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDsl.g:473:2: ( ( (enumLiteral_0= 'LEFT' ) | (enumLiteral_1= 'RIGHT' ) | (enumLiteral_2= 'BOTH' ) ) )
            // InternalDsl.g:474:2: ( (enumLiteral_0= 'LEFT' ) | (enumLiteral_1= 'RIGHT' ) | (enumLiteral_2= 'BOTH' ) )
            {
            // InternalDsl.g:474:2: ( (enumLiteral_0= 'LEFT' ) | (enumLiteral_1= 'RIGHT' ) | (enumLiteral_2= 'BOTH' ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt4=1;
                }
                break;
            case 27:
                {
                alt4=2;
                }
                break;
            case 28:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalDsl.g:475:3: (enumLiteral_0= 'LEFT' )
                    {
                    // InternalDsl.g:475:3: (enumLiteral_0= 'LEFT' )
                    // InternalDsl.g:476:4: enumLiteral_0= 'LEFT'
                    {
                    enumLiteral_0=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getTouchSensorSidesAccess().getLEFTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTouchSensorSidesAccess().getLEFTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:483:3: (enumLiteral_1= 'RIGHT' )
                    {
                    // InternalDsl.g:483:3: (enumLiteral_1= 'RIGHT' )
                    // InternalDsl.g:484:4: enumLiteral_1= 'RIGHT'
                    {
                    enumLiteral_1=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getTouchSensorSidesAccess().getRIGHTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTouchSensorSidesAccess().getRIGHTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:491:3: (enumLiteral_2= 'BOTH' )
                    {
                    // InternalDsl.g:491:3: (enumLiteral_2= 'BOTH' )
                    // InternalDsl.g:492:4: enumLiteral_2= 'BOTH'
                    {
                    enumLiteral_2=(Token)match(input,28,FOLLOW_2); 

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
    // InternalDsl.g:502:1: ruleActions returns [Enumerator current=null] : ( (enumLiteral_0= 'ROTATELEFT' ) | (enumLiteral_1= 'ROTATERIGHT' ) | (enumLiteral_2= 'DRIVEFORWARD' ) | (enumLiteral_3= 'DRIVEBACKWARD' ) | (enumLiteral_4= 'STOP' ) | (enumLiteral_5= 'TURNAROUND' ) | (enumLiteral_6= 'BEEP' ) | (enumLiteral_7= 'MEASURE' ) | (enumLiteral_8= 'DRIVETOEDGE' ) ) ;
    public final Enumerator ruleActions() throws RecognitionException {
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


        	enterRule();

        try {
            // InternalDsl.g:508:2: ( ( (enumLiteral_0= 'ROTATELEFT' ) | (enumLiteral_1= 'ROTATERIGHT' ) | (enumLiteral_2= 'DRIVEFORWARD' ) | (enumLiteral_3= 'DRIVEBACKWARD' ) | (enumLiteral_4= 'STOP' ) | (enumLiteral_5= 'TURNAROUND' ) | (enumLiteral_6= 'BEEP' ) | (enumLiteral_7= 'MEASURE' ) | (enumLiteral_8= 'DRIVETOEDGE' ) ) )
            // InternalDsl.g:509:2: ( (enumLiteral_0= 'ROTATELEFT' ) | (enumLiteral_1= 'ROTATERIGHT' ) | (enumLiteral_2= 'DRIVEFORWARD' ) | (enumLiteral_3= 'DRIVEBACKWARD' ) | (enumLiteral_4= 'STOP' ) | (enumLiteral_5= 'TURNAROUND' ) | (enumLiteral_6= 'BEEP' ) | (enumLiteral_7= 'MEASURE' ) | (enumLiteral_8= 'DRIVETOEDGE' ) )
            {
            // InternalDsl.g:509:2: ( (enumLiteral_0= 'ROTATELEFT' ) | (enumLiteral_1= 'ROTATERIGHT' ) | (enumLiteral_2= 'DRIVEFORWARD' ) | (enumLiteral_3= 'DRIVEBACKWARD' ) | (enumLiteral_4= 'STOP' ) | (enumLiteral_5= 'TURNAROUND' ) | (enumLiteral_6= 'BEEP' ) | (enumLiteral_7= 'MEASURE' ) | (enumLiteral_8= 'DRIVETOEDGE' ) )
            int alt5=9;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt5=1;
                }
                break;
            case 30:
                {
                alt5=2;
                }
                break;
            case 31:
                {
                alt5=3;
                }
                break;
            case 32:
                {
                alt5=4;
                }
                break;
            case 33:
                {
                alt5=5;
                }
                break;
            case 34:
                {
                alt5=6;
                }
                break;
            case 35:
                {
                alt5=7;
                }
                break;
            case 36:
                {
                alt5=8;
                }
                break;
            case 37:
                {
                alt5=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalDsl.g:510:3: (enumLiteral_0= 'ROTATELEFT' )
                    {
                    // InternalDsl.g:510:3: (enumLiteral_0= 'ROTATELEFT' )
                    // InternalDsl.g:511:4: enumLiteral_0= 'ROTATELEFT'
                    {
                    enumLiteral_0=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getActionsAccess().getROTATE_LEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getActionsAccess().getROTATE_LEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:518:3: (enumLiteral_1= 'ROTATERIGHT' )
                    {
                    // InternalDsl.g:518:3: (enumLiteral_1= 'ROTATERIGHT' )
                    // InternalDsl.g:519:4: enumLiteral_1= 'ROTATERIGHT'
                    {
                    enumLiteral_1=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getActionsAccess().getROTATE_REnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getActionsAccess().getROTATE_REnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:526:3: (enumLiteral_2= 'DRIVEFORWARD' )
                    {
                    // InternalDsl.g:526:3: (enumLiteral_2= 'DRIVEFORWARD' )
                    // InternalDsl.g:527:4: enumLiteral_2= 'DRIVEFORWARD'
                    {
                    enumLiteral_2=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getActionsAccess().getDRIVE_FORWARDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getActionsAccess().getDRIVE_FORWARDEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:534:3: (enumLiteral_3= 'DRIVEBACKWARD' )
                    {
                    // InternalDsl.g:534:3: (enumLiteral_3= 'DRIVEBACKWARD' )
                    // InternalDsl.g:535:4: enumLiteral_3= 'DRIVEBACKWARD'
                    {
                    enumLiteral_3=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getActionsAccess().getDRIVE_BACKWARDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getActionsAccess().getDRIVE_BACKWARDEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:542:3: (enumLiteral_4= 'STOP' )
                    {
                    // InternalDsl.g:542:3: (enumLiteral_4= 'STOP' )
                    // InternalDsl.g:543:4: enumLiteral_4= 'STOP'
                    {
                    enumLiteral_4=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getActionsAccess().getSTOP_DRIVINGEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getActionsAccess().getSTOP_DRIVINGEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalDsl.g:550:3: (enumLiteral_5= 'TURNAROUND' )
                    {
                    // InternalDsl.g:550:3: (enumLiteral_5= 'TURNAROUND' )
                    // InternalDsl.g:551:4: enumLiteral_5= 'TURNAROUND'
                    {
                    enumLiteral_5=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getActionsAccess().getTURN_AROUNDEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getActionsAccess().getTURN_AROUNDEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalDsl.g:558:3: (enumLiteral_6= 'BEEP' )
                    {
                    // InternalDsl.g:558:3: (enumLiteral_6= 'BEEP' )
                    // InternalDsl.g:559:4: enumLiteral_6= 'BEEP'
                    {
                    enumLiteral_6=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getActionsAccess().getBEEPEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getActionsAccess().getBEEPEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalDsl.g:566:3: (enumLiteral_7= 'MEASURE' )
                    {
                    // InternalDsl.g:566:3: (enumLiteral_7= 'MEASURE' )
                    // InternalDsl.g:567:4: enumLiteral_7= 'MEASURE'
                    {
                    enumLiteral_7=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getActionsAccess().getMEASUREEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getActionsAccess().getMEASUREEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalDsl.g:574:3: (enumLiteral_8= 'DRIVETOEDGE' )
                    {
                    // InternalDsl.g:574:3: (enumLiteral_8= 'DRIVETOEDGE' )
                    // InternalDsl.g:575:4: enumLiteral_8= 'DRIVETOEDGE'
                    {
                    enumLiteral_8=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getActionsAccess().getDRIVETOEDGEEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getActionsAccess().getDRIVETOEDGEEnumLiteralDeclaration_8());
                    			

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
    // InternalDsl.g:585:1: ruleColors returns [Enumerator current=null] : ( (enumLiteral_0= 'BLACK' ) | (enumLiteral_1= 'BLUE' ) | (enumLiteral_2= 'CYAN' ) | (enumLiteral_3= 'DARK_GRAY' ) | (enumLiteral_4= 'GRAY' ) | (enumLiteral_5= 'GREEN' ) | (enumLiteral_6= 'LIGHT_GRAY' ) | (enumLiteral_7= 'MAGENTA' ) | (enumLiteral_8= 'ORANGE' ) | (enumLiteral_9= 'PINK' ) | (enumLiteral_10= 'RED' ) | (enumLiteral_11= 'WHITE' ) | (enumLiteral_12= 'YELLOW' ) ) ;
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
            // InternalDsl.g:591:2: ( ( (enumLiteral_0= 'BLACK' ) | (enumLiteral_1= 'BLUE' ) | (enumLiteral_2= 'CYAN' ) | (enumLiteral_3= 'DARK_GRAY' ) | (enumLiteral_4= 'GRAY' ) | (enumLiteral_5= 'GREEN' ) | (enumLiteral_6= 'LIGHT_GRAY' ) | (enumLiteral_7= 'MAGENTA' ) | (enumLiteral_8= 'ORANGE' ) | (enumLiteral_9= 'PINK' ) | (enumLiteral_10= 'RED' ) | (enumLiteral_11= 'WHITE' ) | (enumLiteral_12= 'YELLOW' ) ) )
            // InternalDsl.g:592:2: ( (enumLiteral_0= 'BLACK' ) | (enumLiteral_1= 'BLUE' ) | (enumLiteral_2= 'CYAN' ) | (enumLiteral_3= 'DARK_GRAY' ) | (enumLiteral_4= 'GRAY' ) | (enumLiteral_5= 'GREEN' ) | (enumLiteral_6= 'LIGHT_GRAY' ) | (enumLiteral_7= 'MAGENTA' ) | (enumLiteral_8= 'ORANGE' ) | (enumLiteral_9= 'PINK' ) | (enumLiteral_10= 'RED' ) | (enumLiteral_11= 'WHITE' ) | (enumLiteral_12= 'YELLOW' ) )
            {
            // InternalDsl.g:592:2: ( (enumLiteral_0= 'BLACK' ) | (enumLiteral_1= 'BLUE' ) | (enumLiteral_2= 'CYAN' ) | (enumLiteral_3= 'DARK_GRAY' ) | (enumLiteral_4= 'GRAY' ) | (enumLiteral_5= 'GREEN' ) | (enumLiteral_6= 'LIGHT_GRAY' ) | (enumLiteral_7= 'MAGENTA' ) | (enumLiteral_8= 'ORANGE' ) | (enumLiteral_9= 'PINK' ) | (enumLiteral_10= 'RED' ) | (enumLiteral_11= 'WHITE' ) | (enumLiteral_12= 'YELLOW' ) )
            int alt6=13;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt6=1;
                }
                break;
            case 39:
                {
                alt6=2;
                }
                break;
            case 40:
                {
                alt6=3;
                }
                break;
            case 41:
                {
                alt6=4;
                }
                break;
            case 42:
                {
                alt6=5;
                }
                break;
            case 43:
                {
                alt6=6;
                }
                break;
            case 44:
                {
                alt6=7;
                }
                break;
            case 45:
                {
                alt6=8;
                }
                break;
            case 46:
                {
                alt6=9;
                }
                break;
            case 47:
                {
                alt6=10;
                }
                break;
            case 48:
                {
                alt6=11;
                }
                break;
            case 49:
                {
                alt6=12;
                }
                break;
            case 50:
                {
                alt6=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalDsl.g:593:3: (enumLiteral_0= 'BLACK' )
                    {
                    // InternalDsl.g:593:3: (enumLiteral_0= 'BLACK' )
                    // InternalDsl.g:594:4: enumLiteral_0= 'BLACK'
                    {
                    enumLiteral_0=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getBLACKEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getColorsAccess().getBLACKEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:601:3: (enumLiteral_1= 'BLUE' )
                    {
                    // InternalDsl.g:601:3: (enumLiteral_1= 'BLUE' )
                    // InternalDsl.g:602:4: enumLiteral_1= 'BLUE'
                    {
                    enumLiteral_1=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getBLUEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getColorsAccess().getBLUEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:609:3: (enumLiteral_2= 'CYAN' )
                    {
                    // InternalDsl.g:609:3: (enumLiteral_2= 'CYAN' )
                    // InternalDsl.g:610:4: enumLiteral_2= 'CYAN'
                    {
                    enumLiteral_2=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getCYANEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getColorsAccess().getCYANEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:617:3: (enumLiteral_3= 'DARK_GRAY' )
                    {
                    // InternalDsl.g:617:3: (enumLiteral_3= 'DARK_GRAY' )
                    // InternalDsl.g:618:4: enumLiteral_3= 'DARK_GRAY'
                    {
                    enumLiteral_3=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getDARK_GRAYEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getColorsAccess().getDARK_GRAYEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:625:3: (enumLiteral_4= 'GRAY' )
                    {
                    // InternalDsl.g:625:3: (enumLiteral_4= 'GRAY' )
                    // InternalDsl.g:626:4: enumLiteral_4= 'GRAY'
                    {
                    enumLiteral_4=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getGRAYEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getColorsAccess().getGRAYEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalDsl.g:633:3: (enumLiteral_5= 'GREEN' )
                    {
                    // InternalDsl.g:633:3: (enumLiteral_5= 'GREEN' )
                    // InternalDsl.g:634:4: enumLiteral_5= 'GREEN'
                    {
                    enumLiteral_5=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getGREENEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getColorsAccess().getGREENEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalDsl.g:641:3: (enumLiteral_6= 'LIGHT_GRAY' )
                    {
                    // InternalDsl.g:641:3: (enumLiteral_6= 'LIGHT_GRAY' )
                    // InternalDsl.g:642:4: enumLiteral_6= 'LIGHT_GRAY'
                    {
                    enumLiteral_6=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getLIGHT_GRAYEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getColorsAccess().getLIGHT_GRAYEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalDsl.g:649:3: (enumLiteral_7= 'MAGENTA' )
                    {
                    // InternalDsl.g:649:3: (enumLiteral_7= 'MAGENTA' )
                    // InternalDsl.g:650:4: enumLiteral_7= 'MAGENTA'
                    {
                    enumLiteral_7=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getMAGENTAEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getColorsAccess().getMAGENTAEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalDsl.g:657:3: (enumLiteral_8= 'ORANGE' )
                    {
                    // InternalDsl.g:657:3: (enumLiteral_8= 'ORANGE' )
                    // InternalDsl.g:658:4: enumLiteral_8= 'ORANGE'
                    {
                    enumLiteral_8=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getORANGEEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getColorsAccess().getORANGEEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalDsl.g:665:3: (enumLiteral_9= 'PINK' )
                    {
                    // InternalDsl.g:665:3: (enumLiteral_9= 'PINK' )
                    // InternalDsl.g:666:4: enumLiteral_9= 'PINK'
                    {
                    enumLiteral_9=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getPINKEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getColorsAccess().getPINKEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalDsl.g:673:3: (enumLiteral_10= 'RED' )
                    {
                    // InternalDsl.g:673:3: (enumLiteral_10= 'RED' )
                    // InternalDsl.g:674:4: enumLiteral_10= 'RED'
                    {
                    enumLiteral_10=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getREDEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getColorsAccess().getREDEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalDsl.g:681:3: (enumLiteral_11= 'WHITE' )
                    {
                    // InternalDsl.g:681:3: (enumLiteral_11= 'WHITE' )
                    // InternalDsl.g:682:4: enumLiteral_11= 'WHITE'
                    {
                    enumLiteral_11=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getColorsAccess().getWHITEEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getColorsAccess().getWHITEEnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalDsl.g:689:3: (enumLiteral_12= 'YELLOW' )
                    {
                    // InternalDsl.g:689:3: (enumLiteral_12= 'YELLOW' )
                    // InternalDsl.g:690:4: enumLiteral_12= 'YELLOW'
                    {
                    enumLiteral_12=(Token)match(input,50,FOLLOW_2); 

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
    // InternalDsl.g:700:1: ruleCompareOperator returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '<' ) ) ;
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
            // InternalDsl.g:706:2: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '<' ) ) )
            // InternalDsl.g:707:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '<' ) )
            {
            // InternalDsl.g:707:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '<' ) )
            int alt7=6;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt7=1;
                }
                break;
            case 52:
                {
                alt7=2;
                }
                break;
            case 53:
                {
                alt7=3;
                }
                break;
            case 54:
                {
                alt7=4;
                }
                break;
            case 55:
                {
                alt7=5;
                }
                break;
            case 56:
                {
                alt7=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalDsl.g:708:3: (enumLiteral_0= '==' )
                    {
                    // InternalDsl.g:708:3: (enumLiteral_0= '==' )
                    // InternalDsl.g:709:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:716:3: (enumLiteral_1= '!=' )
                    {
                    // InternalDsl.g:716:3: (enumLiteral_1= '!=' )
                    // InternalDsl.g:717:4: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getCompareOperatorAccess().getNEQEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCompareOperatorAccess().getNEQEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:724:3: (enumLiteral_2= '>=' )
                    {
                    // InternalDsl.g:724:3: (enumLiteral_2= '>=' )
                    // InternalDsl.g:725:4: enumLiteral_2= '>='
                    {
                    enumLiteral_2=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:732:3: (enumLiteral_3= '>' )
                    {
                    // InternalDsl.g:732:3: (enumLiteral_3= '>' )
                    // InternalDsl.g:733:4: enumLiteral_3= '>'
                    {
                    enumLiteral_3=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getCompareOperatorAccess().getGEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getCompareOperatorAccess().getGEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:740:3: (enumLiteral_4= '<=' )
                    {
                    // InternalDsl.g:740:3: (enumLiteral_4= '<=' )
                    // InternalDsl.g:741:4: enumLiteral_4= '<='
                    {
                    enumLiteral_4=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalDsl.g:748:3: (enumLiteral_5= '<' )
                    {
                    // InternalDsl.g:748:3: (enumLiteral_5= '<' )
                    // InternalDsl.g:749:4: enumLiteral_5= '<'
                    {
                    enumLiteral_5=(Token)match(input,56,FOLLOW_2); 

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
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001440000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000003FE0000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0007FFC000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000001C000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x01F8000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000020L});

}