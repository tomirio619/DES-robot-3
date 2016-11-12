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
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_BOOL_LITERAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Behavior:'", "'type:'", "'priority:'", "'take-control:'", "'actions:'", "'+'", "'-'", "'*'", "'/'", "'max'", "'min'", "'mod'", "'^'", "'('", "')'", "'NOT'", "'distance'", "'color'", "'int'", "'drive'", "'floorColor'", "'leftTouch'", "'rightTouch'", "'distanceObjectInFront'", "'rotateLeft'", "'rotateRight'", "'driveForward'", "'driveBackward'", "'stopDriving'", "'AND'", "'OR'", "'=='", "'!='", "'>='", "'>'", "'<='", "'<'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
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
    public static final int RULE_BOOL_LITERAL=7;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__48=48;
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
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMissionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMission=ruleMission();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMission; 
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
    // $ANTLR end "entryRuleMission"


    // $ANTLR start "ruleMission"
    // InternalDsl.g:72:1: ruleMission returns [EObject current=null] : ( (lv_behaviorList_0_0= ruleBehavior ) )+ ;
    public final EObject ruleMission() throws RecognitionException {
        EObject current = null;

        EObject lv_behaviorList_0_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:78:2: ( ( (lv_behaviorList_0_0= ruleBehavior ) )+ )
            // InternalDsl.g:79:2: ( (lv_behaviorList_0_0= ruleBehavior ) )+
            {
            // InternalDsl.g:79:2: ( (lv_behaviorList_0_0= ruleBehavior ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDsl.g:80:3: (lv_behaviorList_0_0= ruleBehavior )
            	    {
            	    // InternalDsl.g:80:3: (lv_behaviorList_0_0= ruleBehavior )
            	    // InternalDsl.g:81:4: lv_behaviorList_0_0= ruleBehavior
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getMissionAccess().getBehaviorListBehaviorParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_behaviorList_0_0=ruleBehavior();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElementForParent(grammarAccess.getMissionRule());
            	      				}
            	      				add(
            	      					current,
            	      					"behaviorList",
            	      					lv_behaviorList_0_0,
            	      					"robot.ev3.Dsl.Behavior");
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


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
    // $ANTLR end "ruleMission"


    // $ANTLR start "entryRuleBehavior"
    // InternalDsl.g:101:1: entryRuleBehavior returns [EObject current=null] : iv_ruleBehavior= ruleBehavior EOF ;
    public final EObject entryRuleBehavior() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehavior = null;


        try {
            // InternalDsl.g:101:49: (iv_ruleBehavior= ruleBehavior EOF )
            // InternalDsl.g:102:2: iv_ruleBehavior= ruleBehavior EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBehaviorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBehavior=ruleBehavior();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBehavior; 
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
    // $ANTLR end "entryRuleBehavior"


    // $ANTLR start "ruleBehavior"
    // InternalDsl.g:108:1: ruleBehavior returns [EObject current=null] : (otherlv_0= 'Behavior:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type:' ( (lv_behaviorType_3_0= ruleBehaviorTypes ) )? otherlv_4= 'priority:' ( (lv_prio_5_0= RULE_INT ) )? otherlv_6= 'take-control:' ( (lv_control_7_0= ruleTakeControl ) ) otherlv_8= 'actions:' ( (lv_actions_9_0= ruleActions ) ) ) ;
    public final EObject ruleBehavior() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_prio_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_behaviorType_3_0 = null;

        EObject lv_control_7_0 = null;

        Enumerator lv_actions_9_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:114:2: ( (otherlv_0= 'Behavior:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type:' ( (lv_behaviorType_3_0= ruleBehaviorTypes ) )? otherlv_4= 'priority:' ( (lv_prio_5_0= RULE_INT ) )? otherlv_6= 'take-control:' ( (lv_control_7_0= ruleTakeControl ) ) otherlv_8= 'actions:' ( (lv_actions_9_0= ruleActions ) ) ) )
            // InternalDsl.g:115:2: (otherlv_0= 'Behavior:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type:' ( (lv_behaviorType_3_0= ruleBehaviorTypes ) )? otherlv_4= 'priority:' ( (lv_prio_5_0= RULE_INT ) )? otherlv_6= 'take-control:' ( (lv_control_7_0= ruleTakeControl ) ) otherlv_8= 'actions:' ( (lv_actions_9_0= ruleActions ) ) )
            {
            // InternalDsl.g:115:2: (otherlv_0= 'Behavior:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type:' ( (lv_behaviorType_3_0= ruleBehaviorTypes ) )? otherlv_4= 'priority:' ( (lv_prio_5_0= RULE_INT ) )? otherlv_6= 'take-control:' ( (lv_control_7_0= ruleTakeControl ) ) otherlv_8= 'actions:' ( (lv_actions_9_0= ruleActions ) ) )
            // InternalDsl.g:116:3: otherlv_0= 'Behavior:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type:' ( (lv_behaviorType_3_0= ruleBehaviorTypes ) )? otherlv_4= 'priority:' ( (lv_prio_5_0= RULE_INT ) )? otherlv_6= 'take-control:' ( (lv_control_7_0= ruleTakeControl ) ) otherlv_8= 'actions:' ( (lv_actions_9_0= ruleActions ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBehaviorAccess().getBehaviorKeyword_0());
              		
            }
            // InternalDsl.g:120:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:121:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:121:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:122:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getBehaviorAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getBehaviorRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getBehaviorAccess().getTypeKeyword_2());
              		
            }
            // InternalDsl.g:142:3: ( (lv_behaviorType_3_0= ruleBehaviorTypes ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==31) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDsl.g:143:4: (lv_behaviorType_3_0= ruleBehaviorTypes )
                    {
                    // InternalDsl.g:143:4: (lv_behaviorType_3_0= ruleBehaviorTypes )
                    // InternalDsl.g:144:5: lv_behaviorType_3_0= ruleBehaviorTypes
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getBehaviorAccess().getBehaviorTypeBehaviorTypesEnumRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_7);
                    lv_behaviorType_3_0=ruleBehaviorTypes();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getBehaviorRule());
                      					}
                      					set(
                      						current,
                      						"behaviorType",
                      						lv_behaviorType_3_0,
                      						"robot.ev3.Dsl.BehaviorTypes");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,14,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getBehaviorAccess().getPriorityKeyword_4());
              		
            }
            // InternalDsl.g:165:3: ( (lv_prio_5_0= RULE_INT ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_INT) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalDsl.g:166:4: (lv_prio_5_0= RULE_INT )
                    {
                    // InternalDsl.g:166:4: (lv_prio_5_0= RULE_INT )
                    // InternalDsl.g:167:5: lv_prio_5_0= RULE_INT
                    {
                    lv_prio_5_0=(Token)match(input,RULE_INT,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_prio_5_0, grammarAccess.getBehaviorAccess().getPrioINTTerminalRuleCall_5_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getBehaviorRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"prio",
                      						lv_prio_5_0,
                      						"org.eclipse.xtext.common.Terminals.INT");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getBehaviorAccess().getTakeControlKeyword_6());
              		
            }
            // InternalDsl.g:187:3: ( (lv_control_7_0= ruleTakeControl ) )
            // InternalDsl.g:188:4: (lv_control_7_0= ruleTakeControl )
            {
            // InternalDsl.g:188:4: (lv_control_7_0= ruleTakeControl )
            // InternalDsl.g:189:5: lv_control_7_0= ruleTakeControl
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBehaviorAccess().getControlTakeControlParserRuleCall_7_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_control_7_0=ruleTakeControl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBehaviorRule());
              					}
              					set(
              						current,
              						"control",
              						lv_control_7_0,
              						"robot.ev3.Dsl.TakeControl");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_8=(Token)match(input,16,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getBehaviorAccess().getActionsKeyword_8());
              		
            }
            // InternalDsl.g:210:3: ( (lv_actions_9_0= ruleActions ) )
            // InternalDsl.g:211:4: (lv_actions_9_0= ruleActions )
            {
            // InternalDsl.g:211:4: (lv_actions_9_0= ruleActions )
            // InternalDsl.g:212:5: lv_actions_9_0= ruleActions
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBehaviorAccess().getActionsActionsEnumRuleCall_9_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_actions_9_0=ruleActions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBehaviorRule());
              					}
              					set(
              						current,
              						"actions",
              						lv_actions_9_0,
              						"robot.ev3.Dsl.Actions");
              					afterParserOrEnumRuleCall();
              				
            }

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
    // $ANTLR end "ruleBehavior"


    // $ANTLR start "entryRuleTakeControl"
    // InternalDsl.g:233:1: entryRuleTakeControl returns [EObject current=null] : iv_ruleTakeControl= ruleTakeControl EOF ;
    public final EObject entryRuleTakeControl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTakeControl = null;


        try {
            // InternalDsl.g:233:52: (iv_ruleTakeControl= ruleTakeControl EOF )
            // InternalDsl.g:234:2: iv_ruleTakeControl= ruleTakeControl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTakeControlRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTakeControl=ruleTakeControl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTakeControl; 
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
    // $ANTLR end "entryRuleTakeControl"


    // $ANTLR start "ruleTakeControl"
    // InternalDsl.g:240:1: ruleTakeControl returns [EObject current=null] : ( ( (lv_takecontrol_0_0= ruleBooleanExpression ) ) | this_MeasurableConditions_1= ruleMeasurableConditions ) ;
    public final EObject ruleTakeControl() throws RecognitionException {
        EObject current = null;

        EObject lv_takecontrol_0_0 = null;

        EObject this_MeasurableConditions_1 = null;



        	enterRule();

        try {
            // InternalDsl.g:246:2: ( ( ( (lv_takecontrol_0_0= ruleBooleanExpression ) ) | this_MeasurableConditions_1= ruleMeasurableConditions ) )
            // InternalDsl.g:247:2: ( ( (lv_takecontrol_0_0= ruleBooleanExpression ) ) | this_MeasurableConditions_1= ruleMeasurableConditions )
            {
            // InternalDsl.g:247:2: ( ( (lv_takecontrol_0_0= ruleBooleanExpression ) ) | this_MeasurableConditions_1= ruleMeasurableConditions )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT||LA4_0==RULE_BOOL_LITERAL||(LA4_0>=17 && LA4_0<=18)||LA4_0==25||LA4_0==27) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=32 && LA4_0<=35)) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDsl.g:248:3: ( (lv_takecontrol_0_0= ruleBooleanExpression ) )
                    {
                    // InternalDsl.g:248:3: ( (lv_takecontrol_0_0= ruleBooleanExpression ) )
                    // InternalDsl.g:249:4: (lv_takecontrol_0_0= ruleBooleanExpression )
                    {
                    // InternalDsl.g:249:4: (lv_takecontrol_0_0= ruleBooleanExpression )
                    // InternalDsl.g:250:5: lv_takecontrol_0_0= ruleBooleanExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getTakeControlAccess().getTakecontrolBooleanExpressionParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_takecontrol_0_0=ruleBooleanExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getTakeControlRule());
                      					}
                      					set(
                      						current,
                      						"takecontrol",
                      						lv_takecontrol_0_0,
                      						"robot.ev3.Dsl.BooleanExpression");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:268:3: this_MeasurableConditions_1= ruleMeasurableConditions
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTakeControlAccess().getMeasurableConditionsParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MeasurableConditions_1=ruleMeasurableConditions();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MeasurableConditions_1;
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
    // $ANTLR end "ruleTakeControl"


    // $ANTLR start "entryRuleMeasurableConditions"
    // InternalDsl.g:280:1: entryRuleMeasurableConditions returns [EObject current=null] : iv_ruleMeasurableConditions= ruleMeasurableConditions EOF ;
    public final EObject entryRuleMeasurableConditions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasurableConditions = null;


        try {
            // InternalDsl.g:280:61: (iv_ruleMeasurableConditions= ruleMeasurableConditions EOF )
            // InternalDsl.g:281:2: iv_ruleMeasurableConditions= ruleMeasurableConditions EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMeasurableConditionsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMeasurableConditions=ruleMeasurableConditions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMeasurableConditions; 
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
    // $ANTLR end "entryRuleMeasurableConditions"


    // $ANTLR start "ruleMeasurableConditions"
    // InternalDsl.g:287:1: ruleMeasurableConditions returns [EObject current=null] : ( (lv_measurableConditions_0_0= ruleMeasurableCondition ) )+ ;
    public final EObject ruleMeasurableConditions() throws RecognitionException {
        EObject current = null;

        EObject lv_measurableConditions_0_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:293:2: ( ( (lv_measurableConditions_0_0= ruleMeasurableCondition ) )+ )
            // InternalDsl.g:294:2: ( (lv_measurableConditions_0_0= ruleMeasurableCondition ) )+
            {
            // InternalDsl.g:294:2: ( (lv_measurableConditions_0_0= ruleMeasurableCondition ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=32 && LA5_0<=35)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDsl.g:295:3: (lv_measurableConditions_0_0= ruleMeasurableCondition )
            	    {
            	    // InternalDsl.g:295:3: (lv_measurableConditions_0_0= ruleMeasurableCondition )
            	    // InternalDsl.g:296:4: lv_measurableConditions_0_0= ruleMeasurableCondition
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getMeasurableConditionsAccess().getMeasurableConditionsMeasurableConditionParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_13);
            	    lv_measurableConditions_0_0=ruleMeasurableCondition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElementForParent(grammarAccess.getMeasurableConditionsRule());
            	      				}
            	      				add(
            	      					current,
            	      					"measurableConditions",
            	      					lv_measurableConditions_0_0,
            	      					"robot.ev3.Dsl.MeasurableCondition");
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


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
    // $ANTLR end "ruleMeasurableConditions"


    // $ANTLR start "entryRuleMeasurableCondition"
    // InternalDsl.g:316:1: entryRuleMeasurableCondition returns [EObject current=null] : iv_ruleMeasurableCondition= ruleMeasurableCondition EOF ;
    public final EObject entryRuleMeasurableCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeasurableCondition = null;


        try {
            // InternalDsl.g:316:60: (iv_ruleMeasurableCondition= ruleMeasurableCondition EOF )
            // InternalDsl.g:317:2: iv_ruleMeasurableCondition= ruleMeasurableCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMeasurableConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMeasurableCondition=ruleMeasurableCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMeasurableCondition; 
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
    // $ANTLR end "entryRuleMeasurableCondition"


    // $ANTLR start "ruleMeasurableCondition"
    // InternalDsl.g:323:1: ruleMeasurableCondition returns [EObject current=null] : ( ( (lv_measurable_0_0= ruleMeasurables ) ) ( (lv_unit_1_0= ruleMeasurementUnit ) ) ( (lv_value_2_0= RULE_STRING ) ) ( (lv_operator_3_0= ruleCompareOperator ) ) ) ;
    public final EObject ruleMeasurableCondition() throws RecognitionException {
        EObject current = null;

        Token lv_value_2_0=null;
        Enumerator lv_measurable_0_0 = null;

        Enumerator lv_unit_1_0 = null;

        Enumerator lv_operator_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:329:2: ( ( ( (lv_measurable_0_0= ruleMeasurables ) ) ( (lv_unit_1_0= ruleMeasurementUnit ) ) ( (lv_value_2_0= RULE_STRING ) ) ( (lv_operator_3_0= ruleCompareOperator ) ) ) )
            // InternalDsl.g:330:2: ( ( (lv_measurable_0_0= ruleMeasurables ) ) ( (lv_unit_1_0= ruleMeasurementUnit ) ) ( (lv_value_2_0= RULE_STRING ) ) ( (lv_operator_3_0= ruleCompareOperator ) ) )
            {
            // InternalDsl.g:330:2: ( ( (lv_measurable_0_0= ruleMeasurables ) ) ( (lv_unit_1_0= ruleMeasurementUnit ) ) ( (lv_value_2_0= RULE_STRING ) ) ( (lv_operator_3_0= ruleCompareOperator ) ) )
            // InternalDsl.g:331:3: ( (lv_measurable_0_0= ruleMeasurables ) ) ( (lv_unit_1_0= ruleMeasurementUnit ) ) ( (lv_value_2_0= RULE_STRING ) ) ( (lv_operator_3_0= ruleCompareOperator ) )
            {
            // InternalDsl.g:331:3: ( (lv_measurable_0_0= ruleMeasurables ) )
            // InternalDsl.g:332:4: (lv_measurable_0_0= ruleMeasurables )
            {
            // InternalDsl.g:332:4: (lv_measurable_0_0= ruleMeasurables )
            // InternalDsl.g:333:5: lv_measurable_0_0= ruleMeasurables
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMeasurableConditionAccess().getMeasurableMeasurablesEnumRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_14);
            lv_measurable_0_0=ruleMeasurables();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMeasurableConditionRule());
              					}
              					set(
              						current,
              						"measurable",
              						lv_measurable_0_0,
              						"robot.ev3.Dsl.Measurables");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalDsl.g:350:3: ( (lv_unit_1_0= ruleMeasurementUnit ) )
            // InternalDsl.g:351:4: (lv_unit_1_0= ruleMeasurementUnit )
            {
            // InternalDsl.g:351:4: (lv_unit_1_0= ruleMeasurementUnit )
            // InternalDsl.g:352:5: lv_unit_1_0= ruleMeasurementUnit
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMeasurableConditionAccess().getUnitMeasurementUnitEnumRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_15);
            lv_unit_1_0=ruleMeasurementUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMeasurableConditionRule());
              					}
              					set(
              						current,
              						"unit",
              						lv_unit_1_0,
              						"robot.ev3.Dsl.MeasurementUnit");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalDsl.g:369:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalDsl.g:370:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalDsl.g:370:4: (lv_value_2_0= RULE_STRING )
            // InternalDsl.g:371:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_value_2_0, grammarAccess.getMeasurableConditionAccess().getValueSTRINGTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMeasurableConditionRule());
              					}
              					setWithLastConsumed(
              						current,
              						"value",
              						lv_value_2_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            // InternalDsl.g:387:3: ( (lv_operator_3_0= ruleCompareOperator ) )
            // InternalDsl.g:388:4: (lv_operator_3_0= ruleCompareOperator )
            {
            // InternalDsl.g:388:4: (lv_operator_3_0= ruleCompareOperator )
            // InternalDsl.g:389:5: lv_operator_3_0= ruleCompareOperator
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMeasurableConditionAccess().getOperatorCompareOperatorEnumRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_operator_3_0=ruleCompareOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMeasurableConditionRule());
              					}
              					set(
              						current,
              						"operator",
              						lv_operator_3_0,
              						"robot.ev3.Dsl.CompareOperator");
              					afterParserOrEnumRuleCall();
              				
            }

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
    // $ANTLR end "ruleMeasurableCondition"


    // $ANTLR start "entryRuleIntExpression"
    // InternalDsl.g:410:1: entryRuleIntExpression returns [EObject current=null] : iv_ruleIntExpression= ruleIntExpression EOF ;
    public final EObject entryRuleIntExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntExpression = null;


        try {
            // InternalDsl.g:410:54: (iv_ruleIntExpression= ruleIntExpression EOF )
            // InternalDsl.g:411:2: iv_ruleIntExpression= ruleIntExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIntExpression=ruleIntExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntExpression; 
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
    // $ANTLR end "entryRuleIntExpression"


    // $ANTLR start "ruleIntExpression"
    // InternalDsl.g:417:1: ruleIntExpression returns [EObject current=null] : this_ExpressionLevel1_0= ruleExpressionLevel1 ;
    public final EObject ruleIntExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ExpressionLevel1_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:423:2: (this_ExpressionLevel1_0= ruleExpressionLevel1 )
            // InternalDsl.g:424:2: this_ExpressionLevel1_0= ruleExpressionLevel1
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getIntExpressionAccess().getExpressionLevel1ParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_ExpressionLevel1_0=ruleExpressionLevel1();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_ExpressionLevel1_0;
              		afterParserOrEnumRuleCall();
              	
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
    // $ANTLR end "ruleIntExpression"


    // $ANTLR start "entryRuleExpressionLevel1"
    // InternalDsl.g:435:1: entryRuleExpressionLevel1 returns [EObject current=null] : iv_ruleExpressionLevel1= ruleExpressionLevel1 EOF ;
    public final EObject entryRuleExpressionLevel1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLevel1 = null;


        try {
            // InternalDsl.g:435:57: (iv_ruleExpressionLevel1= ruleExpressionLevel1 EOF )
            // InternalDsl.g:436:2: iv_ruleExpressionLevel1= ruleExpressionLevel1 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionLevel1Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpressionLevel1=ruleExpressionLevel1();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionLevel1; 
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
    // $ANTLR end "entryRuleExpressionLevel1"


    // $ANTLR start "ruleExpressionLevel1"
    // InternalDsl.g:442:1: ruleExpressionLevel1 returns [EObject current=null] : (this_ExpressionLevel2_0= ruleExpressionLevel2 ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLevel2 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLevel2 ) ) ) )* ) ;
    public final EObject ruleExpressionLevel1() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_ExpressionLevel2_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:448:2: ( (this_ExpressionLevel2_0= ruleExpressionLevel2 ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLevel2 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLevel2 ) ) ) )* ) )
            // InternalDsl.g:449:2: (this_ExpressionLevel2_0= ruleExpressionLevel2 ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLevel2 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLevel2 ) ) ) )* )
            {
            // InternalDsl.g:449:2: (this_ExpressionLevel2_0= ruleExpressionLevel2 ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLevel2 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLevel2 ) ) ) )* )
            // InternalDsl.g:450:3: this_ExpressionLevel2_0= ruleExpressionLevel2 ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLevel2 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLevel2 ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpressionLevel1Access().getExpressionLevel2ParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_17);
            this_ExpressionLevel2_0=ruleExpressionLevel2();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ExpressionLevel2_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDsl.g:458:3: ( ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLevel2 ) ) ) | ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLevel2 ) ) ) )*
            loop6:
            do {
                int alt6=3;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }
                else if ( (LA6_0==18) ) {
                    alt6=2;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDsl.g:459:4: ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLevel2 ) ) )
            	    {
            	    // InternalDsl.g:459:4: ( () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLevel2 ) ) )
            	    // InternalDsl.g:460:5: () otherlv_2= '+' ( (lv_right_3_0= ruleExpressionLevel2 ) )
            	    {
            	    // InternalDsl.g:460:5: ()
            	    // InternalDsl.g:461:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getExpressionLevel1Access().getExpressionAdditionLeftAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_2=(Token)match(input,17,FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_2, grammarAccess.getExpressionLevel1Access().getPlusSignKeyword_1_0_1());
            	      				
            	    }
            	    // InternalDsl.g:471:5: ( (lv_right_3_0= ruleExpressionLevel2 ) )
            	    // InternalDsl.g:472:6: (lv_right_3_0= ruleExpressionLevel2 )
            	    {
            	    // InternalDsl.g:472:6: (lv_right_3_0= ruleExpressionLevel2 )
            	    // InternalDsl.g:473:7: lv_right_3_0= ruleExpressionLevel2
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getExpressionLevel1Access().getRightExpressionLevel2ParserRuleCall_1_0_2_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_17);
            	    lv_right_3_0=ruleExpressionLevel2();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getExpressionLevel1Rule());
            	      							}
            	      							set(
            	      								current,
            	      								"right",
            	      								lv_right_3_0,
            	      								"robot.ev3.Dsl.ExpressionLevel2");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDsl.g:492:4: ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLevel2 ) ) )
            	    {
            	    // InternalDsl.g:492:4: ( () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLevel2 ) ) )
            	    // InternalDsl.g:493:5: () otherlv_5= '-' ( (lv_right_6_0= ruleExpressionLevel2 ) )
            	    {
            	    // InternalDsl.g:493:5: ()
            	    // InternalDsl.g:494:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getExpressionLevel1Access().getExpressionSubtractionLeftAction_1_1_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_5=(Token)match(input,18,FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_5, grammarAccess.getExpressionLevel1Access().getHyphenMinusKeyword_1_1_1());
            	      				
            	    }
            	    // InternalDsl.g:504:5: ( (lv_right_6_0= ruleExpressionLevel2 ) )
            	    // InternalDsl.g:505:6: (lv_right_6_0= ruleExpressionLevel2 )
            	    {
            	    // InternalDsl.g:505:6: (lv_right_6_0= ruleExpressionLevel2 )
            	    // InternalDsl.g:506:7: lv_right_6_0= ruleExpressionLevel2
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getExpressionLevel1Access().getRightExpressionLevel2ParserRuleCall_1_1_2_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_17);
            	    lv_right_6_0=ruleExpressionLevel2();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getExpressionLevel1Rule());
            	      							}
            	      							set(
            	      								current,
            	      								"right",
            	      								lv_right_6_0,
            	      								"robot.ev3.Dsl.ExpressionLevel2");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


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
    // $ANTLR end "ruleExpressionLevel1"


    // $ANTLR start "entryRuleExpressionLevel2"
    // InternalDsl.g:529:1: entryRuleExpressionLevel2 returns [EObject current=null] : iv_ruleExpressionLevel2= ruleExpressionLevel2 EOF ;
    public final EObject entryRuleExpressionLevel2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLevel2 = null;


        try {
            // InternalDsl.g:529:57: (iv_ruleExpressionLevel2= ruleExpressionLevel2 EOF )
            // InternalDsl.g:530:2: iv_ruleExpressionLevel2= ruleExpressionLevel2 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionLevel2Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpressionLevel2=ruleExpressionLevel2();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionLevel2; 
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
    // $ANTLR end "entryRuleExpressionLevel2"


    // $ANTLR start "ruleExpressionLevel2"
    // InternalDsl.g:536:1: ruleExpressionLevel2 returns [EObject current=null] : (this_ExpressionLevel3_0= ruleExpressionLevel3 ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_8= 'max' ( (lv_right_9_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_11= 'min' ( (lv_right_12_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_14= 'mod' ( (lv_right_15_0= ruleExpressionLevel3 ) ) ) )* ) ;
    public final EObject ruleExpressionLevel2() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        EObject this_ExpressionLevel3_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;

        EObject lv_right_9_0 = null;

        EObject lv_right_12_0 = null;

        EObject lv_right_15_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:542:2: ( (this_ExpressionLevel3_0= ruleExpressionLevel3 ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_8= 'max' ( (lv_right_9_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_11= 'min' ( (lv_right_12_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_14= 'mod' ( (lv_right_15_0= ruleExpressionLevel3 ) ) ) )* ) )
            // InternalDsl.g:543:2: (this_ExpressionLevel3_0= ruleExpressionLevel3 ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_8= 'max' ( (lv_right_9_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_11= 'min' ( (lv_right_12_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_14= 'mod' ( (lv_right_15_0= ruleExpressionLevel3 ) ) ) )* )
            {
            // InternalDsl.g:543:2: (this_ExpressionLevel3_0= ruleExpressionLevel3 ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_8= 'max' ( (lv_right_9_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_11= 'min' ( (lv_right_12_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_14= 'mod' ( (lv_right_15_0= ruleExpressionLevel3 ) ) ) )* )
            // InternalDsl.g:544:3: this_ExpressionLevel3_0= ruleExpressionLevel3 ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_8= 'max' ( (lv_right_9_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_11= 'min' ( (lv_right_12_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_14= 'mod' ( (lv_right_15_0= ruleExpressionLevel3 ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpressionLevel2Access().getExpressionLevel3ParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_19);
            this_ExpressionLevel3_0=ruleExpressionLevel3();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ExpressionLevel3_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDsl.g:552:3: ( ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_8= 'max' ( (lv_right_9_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_11= 'min' ( (lv_right_12_0= ruleExpressionLevel3 ) ) ) | ( () otherlv_14= 'mod' ( (lv_right_15_0= ruleExpressionLevel3 ) ) ) )*
            loop7:
            do {
                int alt7=6;
                switch ( input.LA(1) ) {
                case 19:
                    {
                    alt7=1;
                    }
                    break;
                case 20:
                    {
                    alt7=2;
                    }
                    break;
                case 21:
                    {
                    alt7=3;
                    }
                    break;
                case 22:
                    {
                    alt7=4;
                    }
                    break;
                case 23:
                    {
                    alt7=5;
                    }
                    break;

                }

                switch (alt7) {
            	case 1 :
            	    // InternalDsl.g:553:4: ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLevel3 ) ) )
            	    {
            	    // InternalDsl.g:553:4: ( () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLevel3 ) ) )
            	    // InternalDsl.g:554:5: () otherlv_2= '*' ( (lv_right_3_0= ruleExpressionLevel3 ) )
            	    {
            	    // InternalDsl.g:554:5: ()
            	    // InternalDsl.g:555:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getExpressionLevel2Access().getExpressionMultiplyLeftAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_2=(Token)match(input,19,FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_2, grammarAccess.getExpressionLevel2Access().getAsteriskKeyword_1_0_1());
            	      				
            	    }
            	    // InternalDsl.g:565:5: ( (lv_right_3_0= ruleExpressionLevel3 ) )
            	    // InternalDsl.g:566:6: (lv_right_3_0= ruleExpressionLevel3 )
            	    {
            	    // InternalDsl.g:566:6: (lv_right_3_0= ruleExpressionLevel3 )
            	    // InternalDsl.g:567:7: lv_right_3_0= ruleExpressionLevel3
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_0_2_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_19);
            	    lv_right_3_0=ruleExpressionLevel3();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getExpressionLevel2Rule());
            	      							}
            	      							set(
            	      								current,
            	      								"right",
            	      								lv_right_3_0,
            	      								"robot.ev3.Dsl.ExpressionLevel3");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDsl.g:586:4: ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLevel3 ) ) )
            	    {
            	    // InternalDsl.g:586:4: ( () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLevel3 ) ) )
            	    // InternalDsl.g:587:5: () otherlv_5= '/' ( (lv_right_6_0= ruleExpressionLevel3 ) )
            	    {
            	    // InternalDsl.g:587:5: ()
            	    // InternalDsl.g:588:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getExpressionLevel2Access().getExpressionDivisionLeftAction_1_1_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_5=(Token)match(input,20,FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_5, grammarAccess.getExpressionLevel2Access().getSolidusKeyword_1_1_1());
            	      				
            	    }
            	    // InternalDsl.g:598:5: ( (lv_right_6_0= ruleExpressionLevel3 ) )
            	    // InternalDsl.g:599:6: (lv_right_6_0= ruleExpressionLevel3 )
            	    {
            	    // InternalDsl.g:599:6: (lv_right_6_0= ruleExpressionLevel3 )
            	    // InternalDsl.g:600:7: lv_right_6_0= ruleExpressionLevel3
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_1_2_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_19);
            	    lv_right_6_0=ruleExpressionLevel3();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getExpressionLevel2Rule());
            	      							}
            	      							set(
            	      								current,
            	      								"right",
            	      								lv_right_6_0,
            	      								"robot.ev3.Dsl.ExpressionLevel3");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalDsl.g:619:4: ( () otherlv_8= 'max' ( (lv_right_9_0= ruleExpressionLevel3 ) ) )
            	    {
            	    // InternalDsl.g:619:4: ( () otherlv_8= 'max' ( (lv_right_9_0= ruleExpressionLevel3 ) ) )
            	    // InternalDsl.g:620:5: () otherlv_8= 'max' ( (lv_right_9_0= ruleExpressionLevel3 ) )
            	    {
            	    // InternalDsl.g:620:5: ()
            	    // InternalDsl.g:621:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getExpressionLevel2Access().getExpressionMaximumLeftAction_1_2_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_8=(Token)match(input,21,FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_8, grammarAccess.getExpressionLevel2Access().getMaxKeyword_1_2_1());
            	      				
            	    }
            	    // InternalDsl.g:631:5: ( (lv_right_9_0= ruleExpressionLevel3 ) )
            	    // InternalDsl.g:632:6: (lv_right_9_0= ruleExpressionLevel3 )
            	    {
            	    // InternalDsl.g:632:6: (lv_right_9_0= ruleExpressionLevel3 )
            	    // InternalDsl.g:633:7: lv_right_9_0= ruleExpressionLevel3
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_2_2_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_19);
            	    lv_right_9_0=ruleExpressionLevel3();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getExpressionLevel2Rule());
            	      							}
            	      							set(
            	      								current,
            	      								"right",
            	      								lv_right_9_0,
            	      								"robot.ev3.Dsl.ExpressionLevel3");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalDsl.g:652:4: ( () otherlv_11= 'min' ( (lv_right_12_0= ruleExpressionLevel3 ) ) )
            	    {
            	    // InternalDsl.g:652:4: ( () otherlv_11= 'min' ( (lv_right_12_0= ruleExpressionLevel3 ) ) )
            	    // InternalDsl.g:653:5: () otherlv_11= 'min' ( (lv_right_12_0= ruleExpressionLevel3 ) )
            	    {
            	    // InternalDsl.g:653:5: ()
            	    // InternalDsl.g:654:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getExpressionLevel2Access().getExpressionMinimumLeftAction_1_3_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_11=(Token)match(input,22,FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_11, grammarAccess.getExpressionLevel2Access().getMinKeyword_1_3_1());
            	      				
            	    }
            	    // InternalDsl.g:664:5: ( (lv_right_12_0= ruleExpressionLevel3 ) )
            	    // InternalDsl.g:665:6: (lv_right_12_0= ruleExpressionLevel3 )
            	    {
            	    // InternalDsl.g:665:6: (lv_right_12_0= ruleExpressionLevel3 )
            	    // InternalDsl.g:666:7: lv_right_12_0= ruleExpressionLevel3
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_3_2_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_19);
            	    lv_right_12_0=ruleExpressionLevel3();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getExpressionLevel2Rule());
            	      							}
            	      							set(
            	      								current,
            	      								"right",
            	      								lv_right_12_0,
            	      								"robot.ev3.Dsl.ExpressionLevel3");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalDsl.g:685:4: ( () otherlv_14= 'mod' ( (lv_right_15_0= ruleExpressionLevel3 ) ) )
            	    {
            	    // InternalDsl.g:685:4: ( () otherlv_14= 'mod' ( (lv_right_15_0= ruleExpressionLevel3 ) ) )
            	    // InternalDsl.g:686:5: () otherlv_14= 'mod' ( (lv_right_15_0= ruleExpressionLevel3 ) )
            	    {
            	    // InternalDsl.g:686:5: ()
            	    // InternalDsl.g:687:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getExpressionLevel2Access().getExpressionModuloLeftAction_1_4_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_14=(Token)match(input,23,FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_14, grammarAccess.getExpressionLevel2Access().getModKeyword_1_4_1());
            	      				
            	    }
            	    // InternalDsl.g:697:5: ( (lv_right_15_0= ruleExpressionLevel3 ) )
            	    // InternalDsl.g:698:6: (lv_right_15_0= ruleExpressionLevel3 )
            	    {
            	    // InternalDsl.g:698:6: (lv_right_15_0= ruleExpressionLevel3 )
            	    // InternalDsl.g:699:7: lv_right_15_0= ruleExpressionLevel3
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_4_2_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_19);
            	    lv_right_15_0=ruleExpressionLevel3();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getExpressionLevel2Rule());
            	      							}
            	      							set(
            	      								current,
            	      								"right",
            	      								lv_right_15_0,
            	      								"robot.ev3.Dsl.ExpressionLevel3");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


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
    // $ANTLR end "ruleExpressionLevel2"


    // $ANTLR start "entryRuleExpressionLevel3"
    // InternalDsl.g:722:1: entryRuleExpressionLevel3 returns [EObject current=null] : iv_ruleExpressionLevel3= ruleExpressionLevel3 EOF ;
    public final EObject entryRuleExpressionLevel3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLevel3 = null;


        try {
            // InternalDsl.g:722:57: (iv_ruleExpressionLevel3= ruleExpressionLevel3 EOF )
            // InternalDsl.g:723:2: iv_ruleExpressionLevel3= ruleExpressionLevel3 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionLevel3Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpressionLevel3=ruleExpressionLevel3();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionLevel3; 
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
    // $ANTLR end "entryRuleExpressionLevel3"


    // $ANTLR start "ruleExpressionLevel3"
    // InternalDsl.g:729:1: ruleExpressionLevel3 returns [EObject current=null] : (this_ExpressionLevel4_0= ruleExpressionLevel4 ( () otherlv_2= '^' ( (lv_right_3_0= ruleExpressionLevel3 ) ) )? ) ;
    public final EObject ruleExpressionLevel3() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ExpressionLevel4_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:735:2: ( (this_ExpressionLevel4_0= ruleExpressionLevel4 ( () otherlv_2= '^' ( (lv_right_3_0= ruleExpressionLevel3 ) ) )? ) )
            // InternalDsl.g:736:2: (this_ExpressionLevel4_0= ruleExpressionLevel4 ( () otherlv_2= '^' ( (lv_right_3_0= ruleExpressionLevel3 ) ) )? )
            {
            // InternalDsl.g:736:2: (this_ExpressionLevel4_0= ruleExpressionLevel4 ( () otherlv_2= '^' ( (lv_right_3_0= ruleExpressionLevel3 ) ) )? )
            // InternalDsl.g:737:3: this_ExpressionLevel4_0= ruleExpressionLevel4 ( () otherlv_2= '^' ( (lv_right_3_0= ruleExpressionLevel3 ) ) )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExpressionLevel3Access().getExpressionLevel4ParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_20);
            this_ExpressionLevel4_0=ruleExpressionLevel4();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ExpressionLevel4_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDsl.g:745:3: ( () otherlv_2= '^' ( (lv_right_3_0= ruleExpressionLevel3 ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDsl.g:746:4: () otherlv_2= '^' ( (lv_right_3_0= ruleExpressionLevel3 ) )
                    {
                    // InternalDsl.g:746:4: ()
                    // InternalDsl.g:747:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndSet(
                      						grammarAccess.getExpressionLevel3Access().getExpressionPowerLeftAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_2=(Token)match(input,24,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getExpressionLevel3Access().getCircumflexAccentKeyword_1_1());
                      			
                    }
                    // InternalDsl.g:757:4: ( (lv_right_3_0= ruleExpressionLevel3 ) )
                    // InternalDsl.g:758:5: (lv_right_3_0= ruleExpressionLevel3 )
                    {
                    // InternalDsl.g:758:5: (lv_right_3_0= ruleExpressionLevel3 )
                    // InternalDsl.g:759:6: lv_right_3_0= ruleExpressionLevel3
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExpressionLevel3Access().getRightExpressionLevel3ParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=ruleExpressionLevel3();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExpressionLevel3Rule());
                      						}
                      						set(
                      							current,
                      							"right",
                      							lv_right_3_0,
                      							"robot.ev3.Dsl.ExpressionLevel3");
                      						afterParserOrEnumRuleCall();
                      					
                    }

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
    // $ANTLR end "ruleExpressionLevel3"


    // $ANTLR start "entryRuleExpressionLevel4"
    // InternalDsl.g:781:1: entryRuleExpressionLevel4 returns [EObject current=null] : iv_ruleExpressionLevel4= ruleExpressionLevel4 EOF ;
    public final EObject entryRuleExpressionLevel4() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLevel4 = null;


        try {
            // InternalDsl.g:781:57: (iv_ruleExpressionLevel4= ruleExpressionLevel4 EOF )
            // InternalDsl.g:782:2: iv_ruleExpressionLevel4= ruleExpressionLevel4 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionLevel4Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpressionLevel4=ruleExpressionLevel4();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionLevel4; 
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
    // $ANTLR end "entryRuleExpressionLevel4"


    // $ANTLR start "ruleExpressionLevel4"
    // InternalDsl.g:788:1: ruleExpressionLevel4 returns [EObject current=null] : (this_ExpressionMinus_0= ruleExpressionMinus | this_ExpressionPlus_1= ruleExpressionPlus | this_ExpressionLevel5_2= ruleExpressionLevel5 ) ;
    public final EObject ruleExpressionLevel4() throws RecognitionException {
        EObject current = null;

        EObject this_ExpressionMinus_0 = null;

        EObject this_ExpressionPlus_1 = null;

        EObject this_ExpressionLevel5_2 = null;



        	enterRule();

        try {
            // InternalDsl.g:794:2: ( (this_ExpressionMinus_0= ruleExpressionMinus | this_ExpressionPlus_1= ruleExpressionPlus | this_ExpressionLevel5_2= ruleExpressionLevel5 ) )
            // InternalDsl.g:795:2: (this_ExpressionMinus_0= ruleExpressionMinus | this_ExpressionPlus_1= ruleExpressionPlus | this_ExpressionLevel5_2= ruleExpressionLevel5 )
            {
            // InternalDsl.g:795:2: (this_ExpressionMinus_0= ruleExpressionMinus | this_ExpressionPlus_1= ruleExpressionPlus | this_ExpressionLevel5_2= ruleExpressionLevel5 )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt9=1;
                }
                break;
            case 17:
                {
                alt9=2;
                }
                break;
            case RULE_INT:
            case 25:
                {
                alt9=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalDsl.g:796:3: this_ExpressionMinus_0= ruleExpressionMinus
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionLevel4Access().getExpressionMinusParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ExpressionMinus_0=ruleExpressionMinus();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ExpressionMinus_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalDsl.g:805:3: this_ExpressionPlus_1= ruleExpressionPlus
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionLevel4Access().getExpressionPlusParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ExpressionPlus_1=ruleExpressionPlus();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ExpressionPlus_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalDsl.g:814:3: this_ExpressionLevel5_2= ruleExpressionLevel5
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionLevel4Access().getExpressionLevel5ParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ExpressionLevel5_2=ruleExpressionLevel5();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ExpressionLevel5_2;
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
    // $ANTLR end "ruleExpressionLevel4"


    // $ANTLR start "entryRuleExpressionMinus"
    // InternalDsl.g:826:1: entryRuleExpressionMinus returns [EObject current=null] : iv_ruleExpressionMinus= ruleExpressionMinus EOF ;
    public final EObject entryRuleExpressionMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionMinus = null;


        try {
            // InternalDsl.g:826:56: (iv_ruleExpressionMinus= ruleExpressionMinus EOF )
            // InternalDsl.g:827:2: iv_ruleExpressionMinus= ruleExpressionMinus EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionMinusRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpressionMinus=ruleExpressionMinus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionMinus; 
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
    // $ANTLR end "entryRuleExpressionMinus"


    // $ANTLR start "ruleExpressionMinus"
    // InternalDsl.g:833:1: ruleExpressionMinus returns [EObject current=null] : (otherlv_0= '-' ( (lv_sub_1_0= ruleExpressionLevel5 ) ) ) ;
    public final EObject ruleExpressionMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_sub_1_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:839:2: ( (otherlv_0= '-' ( (lv_sub_1_0= ruleExpressionLevel5 ) ) ) )
            // InternalDsl.g:840:2: (otherlv_0= '-' ( (lv_sub_1_0= ruleExpressionLevel5 ) ) )
            {
            // InternalDsl.g:840:2: (otherlv_0= '-' ( (lv_sub_1_0= ruleExpressionLevel5 ) ) )
            // InternalDsl.g:841:3: otherlv_0= '-' ( (lv_sub_1_0= ruleExpressionLevel5 ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getExpressionMinusAccess().getHyphenMinusKeyword_0());
              		
            }
            // InternalDsl.g:845:3: ( (lv_sub_1_0= ruleExpressionLevel5 ) )
            // InternalDsl.g:846:4: (lv_sub_1_0= ruleExpressionLevel5 )
            {
            // InternalDsl.g:846:4: (lv_sub_1_0= ruleExpressionLevel5 )
            // InternalDsl.g:847:5: lv_sub_1_0= ruleExpressionLevel5
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExpressionMinusAccess().getSubExpressionLevel5ParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_sub_1_0=ruleExpressionLevel5();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExpressionMinusRule());
              					}
              					set(
              						current,
              						"sub",
              						lv_sub_1_0,
              						"robot.ev3.Dsl.ExpressionLevel5");
              					afterParserOrEnumRuleCall();
              				
            }

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
    // $ANTLR end "ruleExpressionMinus"


    // $ANTLR start "entryRuleExpressionPlus"
    // InternalDsl.g:868:1: entryRuleExpressionPlus returns [EObject current=null] : iv_ruleExpressionPlus= ruleExpressionPlus EOF ;
    public final EObject entryRuleExpressionPlus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionPlus = null;


        try {
            // InternalDsl.g:868:55: (iv_ruleExpressionPlus= ruleExpressionPlus EOF )
            // InternalDsl.g:869:2: iv_ruleExpressionPlus= ruleExpressionPlus EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionPlusRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpressionPlus=ruleExpressionPlus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionPlus; 
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
    // $ANTLR end "entryRuleExpressionPlus"


    // $ANTLR start "ruleExpressionPlus"
    // InternalDsl.g:875:1: ruleExpressionPlus returns [EObject current=null] : (otherlv_0= '+' ( (lv_sub_1_0= ruleExpressionLevel5 ) ) ) ;
    public final EObject ruleExpressionPlus() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_sub_1_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:881:2: ( (otherlv_0= '+' ( (lv_sub_1_0= ruleExpressionLevel5 ) ) ) )
            // InternalDsl.g:882:2: (otherlv_0= '+' ( (lv_sub_1_0= ruleExpressionLevel5 ) ) )
            {
            // InternalDsl.g:882:2: (otherlv_0= '+' ( (lv_sub_1_0= ruleExpressionLevel5 ) ) )
            // InternalDsl.g:883:3: otherlv_0= '+' ( (lv_sub_1_0= ruleExpressionLevel5 ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getExpressionPlusAccess().getPlusSignKeyword_0());
              		
            }
            // InternalDsl.g:887:3: ( (lv_sub_1_0= ruleExpressionLevel5 ) )
            // InternalDsl.g:888:4: (lv_sub_1_0= ruleExpressionLevel5 )
            {
            // InternalDsl.g:888:4: (lv_sub_1_0= ruleExpressionLevel5 )
            // InternalDsl.g:889:5: lv_sub_1_0= ruleExpressionLevel5
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExpressionPlusAccess().getSubExpressionLevel5ParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_sub_1_0=ruleExpressionLevel5();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExpressionPlusRule());
              					}
              					set(
              						current,
              						"sub",
              						lv_sub_1_0,
              						"robot.ev3.Dsl.ExpressionLevel5");
              					afterParserOrEnumRuleCall();
              				
            }

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
    // $ANTLR end "ruleExpressionPlus"


    // $ANTLR start "entryRuleExpressionLevel5"
    // InternalDsl.g:910:1: entryRuleExpressionLevel5 returns [EObject current=null] : iv_ruleExpressionLevel5= ruleExpressionLevel5 EOF ;
    public final EObject entryRuleExpressionLevel5() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionLevel5 = null;


        try {
            // InternalDsl.g:910:57: (iv_ruleExpressionLevel5= ruleExpressionLevel5 EOF )
            // InternalDsl.g:911:2: iv_ruleExpressionLevel5= ruleExpressionLevel5 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionLevel5Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpressionLevel5=ruleExpressionLevel5();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionLevel5; 
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
    // $ANTLR end "entryRuleExpressionLevel5"


    // $ANTLR start "ruleExpressionLevel5"
    // InternalDsl.g:917:1: ruleExpressionLevel5 returns [EObject current=null] : (this_ExpressionBracket_0= ruleExpressionBracket | this_ExpressionConstantInt_1= ruleExpressionConstantInt ) ;
    public final EObject ruleExpressionLevel5() throws RecognitionException {
        EObject current = null;

        EObject this_ExpressionBracket_0 = null;

        EObject this_ExpressionConstantInt_1 = null;



        	enterRule();

        try {
            // InternalDsl.g:923:2: ( (this_ExpressionBracket_0= ruleExpressionBracket | this_ExpressionConstantInt_1= ruleExpressionConstantInt ) )
            // InternalDsl.g:924:2: (this_ExpressionBracket_0= ruleExpressionBracket | this_ExpressionConstantInt_1= ruleExpressionConstantInt )
            {
            // InternalDsl.g:924:2: (this_ExpressionBracket_0= ruleExpressionBracket | this_ExpressionConstantInt_1= ruleExpressionConstantInt )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_INT) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalDsl.g:925:3: this_ExpressionBracket_0= ruleExpressionBracket
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionLevel5Access().getExpressionBracketParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ExpressionBracket_0=ruleExpressionBracket();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ExpressionBracket_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalDsl.g:934:3: this_ExpressionConstantInt_1= ruleExpressionConstantInt
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionLevel5Access().getExpressionConstantIntParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ExpressionConstantInt_1=ruleExpressionConstantInt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ExpressionConstantInt_1;
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
    // $ANTLR end "ruleExpressionLevel5"


    // $ANTLR start "entryRuleExpressionBracket"
    // InternalDsl.g:946:1: entryRuleExpressionBracket returns [EObject current=null] : iv_ruleExpressionBracket= ruleExpressionBracket EOF ;
    public final EObject entryRuleExpressionBracket() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionBracket = null;


        try {
            // InternalDsl.g:946:58: (iv_ruleExpressionBracket= ruleExpressionBracket EOF )
            // InternalDsl.g:947:2: iv_ruleExpressionBracket= ruleExpressionBracket EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionBracketRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpressionBracket=ruleExpressionBracket();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionBracket; 
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
    // $ANTLR end "entryRuleExpressionBracket"


    // $ANTLR start "ruleExpressionBracket"
    // InternalDsl.g:953:1: ruleExpressionBracket returns [EObject current=null] : (otherlv_0= '(' ( (lv_sub_1_0= ruleIntExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleExpressionBracket() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_sub_1_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:959:2: ( (otherlv_0= '(' ( (lv_sub_1_0= ruleIntExpression ) ) otherlv_2= ')' ) )
            // InternalDsl.g:960:2: (otherlv_0= '(' ( (lv_sub_1_0= ruleIntExpression ) ) otherlv_2= ')' )
            {
            // InternalDsl.g:960:2: (otherlv_0= '(' ( (lv_sub_1_0= ruleIntExpression ) ) otherlv_2= ')' )
            // InternalDsl.g:961:3: otherlv_0= '(' ( (lv_sub_1_0= ruleIntExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getExpressionBracketAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalDsl.g:965:3: ( (lv_sub_1_0= ruleIntExpression ) )
            // InternalDsl.g:966:4: (lv_sub_1_0= ruleIntExpression )
            {
            // InternalDsl.g:966:4: (lv_sub_1_0= ruleIntExpression )
            // InternalDsl.g:967:5: lv_sub_1_0= ruleIntExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExpressionBracketAccess().getSubIntExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_21);
            lv_sub_1_0=ruleIntExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExpressionBracketRule());
              					}
              					set(
              						current,
              						"sub",
              						lv_sub_1_0,
              						"robot.ev3.Dsl.IntExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getExpressionBracketAccess().getRightParenthesisKeyword_2());
              		
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
    // $ANTLR end "ruleExpressionBracket"


    // $ANTLR start "entryRuleExpressionConstantInt"
    // InternalDsl.g:992:1: entryRuleExpressionConstantInt returns [EObject current=null] : iv_ruleExpressionConstantInt= ruleExpressionConstantInt EOF ;
    public final EObject entryRuleExpressionConstantInt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionConstantInt = null;


        try {
            // InternalDsl.g:992:62: (iv_ruleExpressionConstantInt= ruleExpressionConstantInt EOF )
            // InternalDsl.g:993:2: iv_ruleExpressionConstantInt= ruleExpressionConstantInt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionConstantIntRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpressionConstantInt=ruleExpressionConstantInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionConstantInt; 
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
    // $ANTLR end "entryRuleExpressionConstantInt"


    // $ANTLR start "ruleExpressionConstantInt"
    // InternalDsl.g:999:1: ruleExpressionConstantInt returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleExpressionConstantInt() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalDsl.g:1005:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalDsl.g:1006:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalDsl.g:1006:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalDsl.g:1007:3: (lv_value_0_0= RULE_INT )
            {
            // InternalDsl.g:1007:3: (lv_value_0_0= RULE_INT )
            // InternalDsl.g:1008:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getExpressionConstantIntAccess().getValueINTTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getExpressionConstantIntRule());
              				}
              				setWithLastConsumed(
              					current,
              					"value",
              					lv_value_0_0,
              					"org.eclipse.xtext.common.Terminals.INT");
              			
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
    // $ANTLR end "ruleExpressionConstantInt"


    // $ANTLR start "entryRuleBooleanExpression"
    // InternalDsl.g:1027:1: entryRuleBooleanExpression returns [EObject current=null] : iv_ruleBooleanExpression= ruleBooleanExpression EOF ;
    public final EObject entryRuleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpression = null;


        try {
            // InternalDsl.g:1027:58: (iv_ruleBooleanExpression= ruleBooleanExpression EOF )
            // InternalDsl.g:1028:2: iv_ruleBooleanExpression= ruleBooleanExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBooleanExpression=ruleBooleanExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanExpression; 
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
    // $ANTLR end "entryRuleBooleanExpression"


    // $ANTLR start "ruleBooleanExpression"
    // InternalDsl.g:1034:1: ruleBooleanExpression returns [EObject current=null] : this_BooleanExpressionLevel1_0= ruleBooleanExpressionLevel1 ;
    public final EObject ruleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanExpressionLevel1_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1040:2: (this_BooleanExpressionLevel1_0= ruleBooleanExpressionLevel1 )
            // InternalDsl.g:1041:2: this_BooleanExpressionLevel1_0= ruleBooleanExpressionLevel1
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getBooleanExpressionAccess().getBooleanExpressionLevel1ParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_BooleanExpressionLevel1_0=ruleBooleanExpressionLevel1();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_BooleanExpressionLevel1_0;
              		afterParserOrEnumRuleCall();
              	
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
    // $ANTLR end "ruleBooleanExpression"


    // $ANTLR start "entryRuleBooleanExpressionLevel1"
    // InternalDsl.g:1052:1: entryRuleBooleanExpressionLevel1 returns [EObject current=null] : iv_ruleBooleanExpressionLevel1= ruleBooleanExpressionLevel1 EOF ;
    public final EObject entryRuleBooleanExpressionLevel1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpressionLevel1 = null;


        try {
            // InternalDsl.g:1052:64: (iv_ruleBooleanExpressionLevel1= ruleBooleanExpressionLevel1 EOF )
            // InternalDsl.g:1053:2: iv_ruleBooleanExpressionLevel1= ruleBooleanExpressionLevel1 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanExpressionLevel1Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBooleanExpressionLevel1=ruleBooleanExpressionLevel1();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanExpressionLevel1; 
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
    // $ANTLR end "entryRuleBooleanExpressionLevel1"


    // $ANTLR start "ruleBooleanExpressionLevel1"
    // InternalDsl.g:1059:1: ruleBooleanExpressionLevel1 returns [EObject current=null] : (this_BooleanExpressionLevel2_0= ruleBooleanExpressionLevel2 ( () ( (lv_bop_2_0= ruleBinaryBooleanOperator ) ) ( (lv_right_3_0= ruleBooleanExpressionLevel2 ) ) )* ) ;
    public final EObject ruleBooleanExpressionLevel1() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanExpressionLevel2_0 = null;

        Enumerator lv_bop_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1065:2: ( (this_BooleanExpressionLevel2_0= ruleBooleanExpressionLevel2 ( () ( (lv_bop_2_0= ruleBinaryBooleanOperator ) ) ( (lv_right_3_0= ruleBooleanExpressionLevel2 ) ) )* ) )
            // InternalDsl.g:1066:2: (this_BooleanExpressionLevel2_0= ruleBooleanExpressionLevel2 ( () ( (lv_bop_2_0= ruleBinaryBooleanOperator ) ) ( (lv_right_3_0= ruleBooleanExpressionLevel2 ) ) )* )
            {
            // InternalDsl.g:1066:2: (this_BooleanExpressionLevel2_0= ruleBooleanExpressionLevel2 ( () ( (lv_bop_2_0= ruleBinaryBooleanOperator ) ) ( (lv_right_3_0= ruleBooleanExpressionLevel2 ) ) )* )
            // InternalDsl.g:1067:3: this_BooleanExpressionLevel2_0= ruleBooleanExpressionLevel2 ( () ( (lv_bop_2_0= ruleBinaryBooleanOperator ) ) ( (lv_right_3_0= ruleBooleanExpressionLevel2 ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getBooleanExpressionLevel1Access().getBooleanExpressionLevel2ParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_22);
            this_BooleanExpressionLevel2_0=ruleBooleanExpressionLevel2();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_BooleanExpressionLevel2_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalDsl.g:1075:3: ( () ( (lv_bop_2_0= ruleBinaryBooleanOperator ) ) ( (lv_right_3_0= ruleBooleanExpressionLevel2 ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=41 && LA11_0<=42)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDsl.g:1076:4: () ( (lv_bop_2_0= ruleBinaryBooleanOperator ) ) ( (lv_right_3_0= ruleBooleanExpressionLevel2 ) )
            	    {
            	    // InternalDsl.g:1076:4: ()
            	    // InternalDsl.g:1077:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getBooleanExpressionLevel1Access().getExpressionBinOpLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalDsl.g:1083:4: ( (lv_bop_2_0= ruleBinaryBooleanOperator ) )
            	    // InternalDsl.g:1084:5: (lv_bop_2_0= ruleBinaryBooleanOperator )
            	    {
            	    // InternalDsl.g:1084:5: (lv_bop_2_0= ruleBinaryBooleanOperator )
            	    // InternalDsl.g:1085:6: lv_bop_2_0= ruleBinaryBooleanOperator
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getBooleanExpressionLevel1Access().getBopBinaryBooleanOperatorEnumRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_23);
            	    lv_bop_2_0=ruleBinaryBooleanOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getBooleanExpressionLevel1Rule());
            	      						}
            	      						set(
            	      							current,
            	      							"bop",
            	      							lv_bop_2_0,
            	      							"robot.ev3.Dsl.BinaryBooleanOperator");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalDsl.g:1102:4: ( (lv_right_3_0= ruleBooleanExpressionLevel2 ) )
            	    // InternalDsl.g:1103:5: (lv_right_3_0= ruleBooleanExpressionLevel2 )
            	    {
            	    // InternalDsl.g:1103:5: (lv_right_3_0= ruleBooleanExpressionLevel2 )
            	    // InternalDsl.g:1104:6: lv_right_3_0= ruleBooleanExpressionLevel2
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getBooleanExpressionLevel1Access().getRightBooleanExpressionLevel2ParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_22);
            	    lv_right_3_0=ruleBooleanExpressionLevel2();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getBooleanExpressionLevel1Rule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"robot.ev3.Dsl.BooleanExpressionLevel2");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


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
    // $ANTLR end "ruleBooleanExpressionLevel1"


    // $ANTLR start "entryRuleBooleanExpressionLevel2"
    // InternalDsl.g:1126:1: entryRuleBooleanExpressionLevel2 returns [EObject current=null] : iv_ruleBooleanExpressionLevel2= ruleBooleanExpressionLevel2 EOF ;
    public final EObject entryRuleBooleanExpressionLevel2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpressionLevel2 = null;


        try {
            // InternalDsl.g:1126:64: (iv_ruleBooleanExpressionLevel2= ruleBooleanExpressionLevel2 EOF )
            // InternalDsl.g:1127:2: iv_ruleBooleanExpressionLevel2= ruleBooleanExpressionLevel2 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanExpressionLevel2Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBooleanExpressionLevel2=ruleBooleanExpressionLevel2();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanExpressionLevel2; 
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
    // $ANTLR end "entryRuleBooleanExpressionLevel2"


    // $ANTLR start "ruleBooleanExpressionLevel2"
    // InternalDsl.g:1133:1: ruleBooleanExpressionLevel2 returns [EObject current=null] : (this_NotExpression_0= ruleNotExpression | this_BooleanExpressionLevel3_1= ruleBooleanExpressionLevel3 ) ;
    public final EObject ruleBooleanExpressionLevel2() throws RecognitionException {
        EObject current = null;

        EObject this_NotExpression_0 = null;

        EObject this_BooleanExpressionLevel3_1 = null;



        	enterRule();

        try {
            // InternalDsl.g:1139:2: ( (this_NotExpression_0= ruleNotExpression | this_BooleanExpressionLevel3_1= ruleBooleanExpressionLevel3 ) )
            // InternalDsl.g:1140:2: (this_NotExpression_0= ruleNotExpression | this_BooleanExpressionLevel3_1= ruleBooleanExpressionLevel3 )
            {
            // InternalDsl.g:1140:2: (this_NotExpression_0= ruleNotExpression | this_BooleanExpressionLevel3_1= ruleBooleanExpressionLevel3 )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_INT||LA12_0==RULE_BOOL_LITERAL||(LA12_0>=17 && LA12_0<=18)||LA12_0==25) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalDsl.g:1141:3: this_NotExpression_0= ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBooleanExpressionLevel2Access().getNotExpressionParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NotExpression_0=ruleNotExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NotExpression_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalDsl.g:1150:3: this_BooleanExpressionLevel3_1= ruleBooleanExpressionLevel3
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBooleanExpressionLevel2Access().getBooleanExpressionLevel3ParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BooleanExpressionLevel3_1=ruleBooleanExpressionLevel3();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BooleanExpressionLevel3_1;
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
    // $ANTLR end "ruleBooleanExpressionLevel2"


    // $ANTLR start "entryRuleNotExpression"
    // InternalDsl.g:1162:1: entryRuleNotExpression returns [EObject current=null] : iv_ruleNotExpression= ruleNotExpression EOF ;
    public final EObject entryRuleNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotExpression = null;


        try {
            // InternalDsl.g:1162:54: (iv_ruleNotExpression= ruleNotExpression EOF )
            // InternalDsl.g:1163:2: iv_ruleNotExpression= ruleNotExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNotExpression=ruleNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotExpression; 
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
    // $ANTLR end "entryRuleNotExpression"


    // $ANTLR start "ruleNotExpression"
    // InternalDsl.g:1169:1: ruleNotExpression returns [EObject current=null] : (otherlv_0= 'NOT' ( (lv_sub_1_0= ruleBooleanExpressionLevel3 ) ) ) ;
    public final EObject ruleNotExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_sub_1_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1175:2: ( (otherlv_0= 'NOT' ( (lv_sub_1_0= ruleBooleanExpressionLevel3 ) ) ) )
            // InternalDsl.g:1176:2: (otherlv_0= 'NOT' ( (lv_sub_1_0= ruleBooleanExpressionLevel3 ) ) )
            {
            // InternalDsl.g:1176:2: (otherlv_0= 'NOT' ( (lv_sub_1_0= ruleBooleanExpressionLevel3 ) ) )
            // InternalDsl.g:1177:3: otherlv_0= 'NOT' ( (lv_sub_1_0= ruleBooleanExpressionLevel3 ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNotExpressionAccess().getNOTKeyword_0());
              		
            }
            // InternalDsl.g:1181:3: ( (lv_sub_1_0= ruleBooleanExpressionLevel3 ) )
            // InternalDsl.g:1182:4: (lv_sub_1_0= ruleBooleanExpressionLevel3 )
            {
            // InternalDsl.g:1182:4: (lv_sub_1_0= ruleBooleanExpressionLevel3 )
            // InternalDsl.g:1183:5: lv_sub_1_0= ruleBooleanExpressionLevel3
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNotExpressionAccess().getSubBooleanExpressionLevel3ParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_sub_1_0=ruleBooleanExpressionLevel3();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNotExpressionRule());
              					}
              					set(
              						current,
              						"sub",
              						lv_sub_1_0,
              						"robot.ev3.Dsl.BooleanExpressionLevel3");
              					afterParserOrEnumRuleCall();
              				
            }

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
    // $ANTLR end "ruleNotExpression"


    // $ANTLR start "entryRuleBooleanExpressionLevel3"
    // InternalDsl.g:1204:1: entryRuleBooleanExpressionLevel3 returns [EObject current=null] : iv_ruleBooleanExpressionLevel3= ruleBooleanExpressionLevel3 EOF ;
    public final EObject entryRuleBooleanExpressionLevel3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpressionLevel3 = null;


        try {
            // InternalDsl.g:1204:64: (iv_ruleBooleanExpressionLevel3= ruleBooleanExpressionLevel3 EOF )
            // InternalDsl.g:1205:2: iv_ruleBooleanExpressionLevel3= ruleBooleanExpressionLevel3 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanExpressionLevel3Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBooleanExpressionLevel3=ruleBooleanExpressionLevel3();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanExpressionLevel3; 
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
    // $ANTLR end "entryRuleBooleanExpressionLevel3"


    // $ANTLR start "ruleBooleanExpressionLevel3"
    // InternalDsl.g:1211:1: ruleBooleanExpressionLevel3 returns [EObject current=null] : ( ( ( ruleComparisonExpression )=>this_ComparisonExpression_0= ruleComparisonExpression ) | this_BooleanExpressionBracket_1= ruleBooleanExpressionBracket | this_BooleanExpressionConstant_2= ruleBooleanExpressionConstant ) ;
    public final EObject ruleBooleanExpressionLevel3() throws RecognitionException {
        EObject current = null;

        EObject this_ComparisonExpression_0 = null;

        EObject this_BooleanExpressionBracket_1 = null;

        EObject this_BooleanExpressionConstant_2 = null;



        	enterRule();

        try {
            // InternalDsl.g:1217:2: ( ( ( ( ruleComparisonExpression )=>this_ComparisonExpression_0= ruleComparisonExpression ) | this_BooleanExpressionBracket_1= ruleBooleanExpressionBracket | this_BooleanExpressionConstant_2= ruleBooleanExpressionConstant ) )
            // InternalDsl.g:1218:2: ( ( ( ruleComparisonExpression )=>this_ComparisonExpression_0= ruleComparisonExpression ) | this_BooleanExpressionBracket_1= ruleBooleanExpressionBracket | this_BooleanExpressionConstant_2= ruleBooleanExpressionConstant )
            {
            // InternalDsl.g:1218:2: ( ( ( ruleComparisonExpression )=>this_ComparisonExpression_0= ruleComparisonExpression ) | this_BooleanExpressionBracket_1= ruleBooleanExpressionBracket | this_BooleanExpressionConstant_2= ruleBooleanExpressionConstant )
            int alt13=3;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==18) && (synpred1_InternalDsl())) {
                alt13=1;
            }
            else if ( (LA13_0==17) && (synpred1_InternalDsl())) {
                alt13=1;
            }
            else if ( (LA13_0==25) ) {
                int LA13_3 = input.LA(2);

                if ( (synpred1_InternalDsl()) ) {
                    alt13=1;
                }
                else if ( (true) ) {
                    alt13=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 3, input);

                    throw nvae;
                }
            }
            else if ( (LA13_0==RULE_INT) && (synpred1_InternalDsl())) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_BOOL_LITERAL) ) {
                alt13=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalDsl.g:1219:3: ( ( ruleComparisonExpression )=>this_ComparisonExpression_0= ruleComparisonExpression )
                    {
                    // InternalDsl.g:1219:3: ( ( ruleComparisonExpression )=>this_ComparisonExpression_0= ruleComparisonExpression )
                    // InternalDsl.g:1220:4: ( ruleComparisonExpression )=>this_ComparisonExpression_0= ruleComparisonExpression
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getBooleanExpressionLevel3Access().getComparisonExpressionParserRuleCall_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_ComparisonExpression_0=ruleComparisonExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_ComparisonExpression_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1231:3: this_BooleanExpressionBracket_1= ruleBooleanExpressionBracket
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBooleanExpressionLevel3Access().getBooleanExpressionBracketParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BooleanExpressionBracket_1=ruleBooleanExpressionBracket();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BooleanExpressionBracket_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalDsl.g:1240:3: this_BooleanExpressionConstant_2= ruleBooleanExpressionConstant
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBooleanExpressionLevel3Access().getBooleanExpressionConstantParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BooleanExpressionConstant_2=ruleBooleanExpressionConstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BooleanExpressionConstant_2;
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
    // $ANTLR end "ruleBooleanExpressionLevel3"


    // $ANTLR start "entryRuleComparisonExpression"
    // InternalDsl.g:1252:1: entryRuleComparisonExpression returns [EObject current=null] : iv_ruleComparisonExpression= ruleComparisonExpression EOF ;
    public final EObject entryRuleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonExpression = null;


        try {
            // InternalDsl.g:1252:61: (iv_ruleComparisonExpression= ruleComparisonExpression EOF )
            // InternalDsl.g:1253:2: iv_ruleComparisonExpression= ruleComparisonExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComparisonExpression=ruleComparisonExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparisonExpression; 
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
    // $ANTLR end "entryRuleComparisonExpression"


    // $ANTLR start "ruleComparisonExpression"
    // InternalDsl.g:1259:1: ruleComparisonExpression returns [EObject current=null] : ( () ( (lv_left_1_0= ruleIntExpression ) ) ( (lv_op_2_0= ruleCompareOperator ) ) ( (lv_right_3_0= ruleIntExpression ) ) ) ;
    public final EObject ruleComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_left_1_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1265:2: ( ( () ( (lv_left_1_0= ruleIntExpression ) ) ( (lv_op_2_0= ruleCompareOperator ) ) ( (lv_right_3_0= ruleIntExpression ) ) ) )
            // InternalDsl.g:1266:2: ( () ( (lv_left_1_0= ruleIntExpression ) ) ( (lv_op_2_0= ruleCompareOperator ) ) ( (lv_right_3_0= ruleIntExpression ) ) )
            {
            // InternalDsl.g:1266:2: ( () ( (lv_left_1_0= ruleIntExpression ) ) ( (lv_op_2_0= ruleCompareOperator ) ) ( (lv_right_3_0= ruleIntExpression ) ) )
            // InternalDsl.g:1267:3: () ( (lv_left_1_0= ruleIntExpression ) ) ( (lv_op_2_0= ruleCompareOperator ) ) ( (lv_right_3_0= ruleIntExpression ) )
            {
            // InternalDsl.g:1267:3: ()
            // InternalDsl.g:1268:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getComparisonExpressionAccess().getExpressionCompOpAction_0(),
              					current);
              			
            }

            }

            // InternalDsl.g:1274:3: ( (lv_left_1_0= ruleIntExpression ) )
            // InternalDsl.g:1275:4: (lv_left_1_0= ruleIntExpression )
            {
            // InternalDsl.g:1275:4: (lv_left_1_0= ruleIntExpression )
            // InternalDsl.g:1276:5: lv_left_1_0= ruleIntExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getComparisonExpressionAccess().getLeftIntExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_16);
            lv_left_1_0=ruleIntExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getComparisonExpressionRule());
              					}
              					set(
              						current,
              						"left",
              						lv_left_1_0,
              						"robot.ev3.Dsl.IntExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalDsl.g:1293:3: ( (lv_op_2_0= ruleCompareOperator ) )
            // InternalDsl.g:1294:4: (lv_op_2_0= ruleCompareOperator )
            {
            // InternalDsl.g:1294:4: (lv_op_2_0= ruleCompareOperator )
            // InternalDsl.g:1295:5: lv_op_2_0= ruleCompareOperator
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getComparisonExpressionAccess().getOpCompareOperatorEnumRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_18);
            lv_op_2_0=ruleCompareOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getComparisonExpressionRule());
              					}
              					set(
              						current,
              						"op",
              						lv_op_2_0,
              						"robot.ev3.Dsl.CompareOperator");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalDsl.g:1312:3: ( (lv_right_3_0= ruleIntExpression ) )
            // InternalDsl.g:1313:4: (lv_right_3_0= ruleIntExpression )
            {
            // InternalDsl.g:1313:4: (lv_right_3_0= ruleIntExpression )
            // InternalDsl.g:1314:5: lv_right_3_0= ruleIntExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getComparisonExpressionAccess().getRightIntExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_right_3_0=ruleIntExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getComparisonExpressionRule());
              					}
              					set(
              						current,
              						"right",
              						lv_right_3_0,
              						"robot.ev3.Dsl.IntExpression");
              					afterParserOrEnumRuleCall();
              				
            }

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
    // $ANTLR end "ruleComparisonExpression"


    // $ANTLR start "entryRuleBooleanExpressionBracket"
    // InternalDsl.g:1335:1: entryRuleBooleanExpressionBracket returns [EObject current=null] : iv_ruleBooleanExpressionBracket= ruleBooleanExpressionBracket EOF ;
    public final EObject entryRuleBooleanExpressionBracket() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpressionBracket = null;


        try {
            // InternalDsl.g:1335:65: (iv_ruleBooleanExpressionBracket= ruleBooleanExpressionBracket EOF )
            // InternalDsl.g:1336:2: iv_ruleBooleanExpressionBracket= ruleBooleanExpressionBracket EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanExpressionBracketRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBooleanExpressionBracket=ruleBooleanExpressionBracket();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanExpressionBracket; 
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
    // $ANTLR end "entryRuleBooleanExpressionBracket"


    // $ANTLR start "ruleBooleanExpressionBracket"
    // InternalDsl.g:1342:1: ruleBooleanExpressionBracket returns [EObject current=null] : (otherlv_0= '(' ( (lv_sub_1_0= ruleBooleanExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleBooleanExpressionBracket() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_sub_1_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1348:2: ( (otherlv_0= '(' ( (lv_sub_1_0= ruleBooleanExpression ) ) otherlv_2= ')' ) )
            // InternalDsl.g:1349:2: (otherlv_0= '(' ( (lv_sub_1_0= ruleBooleanExpression ) ) otherlv_2= ')' )
            {
            // InternalDsl.g:1349:2: (otherlv_0= '(' ( (lv_sub_1_0= ruleBooleanExpression ) ) otherlv_2= ')' )
            // InternalDsl.g:1350:3: otherlv_0= '(' ( (lv_sub_1_0= ruleBooleanExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBooleanExpressionBracketAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalDsl.g:1354:3: ( (lv_sub_1_0= ruleBooleanExpression ) )
            // InternalDsl.g:1355:4: (lv_sub_1_0= ruleBooleanExpression )
            {
            // InternalDsl.g:1355:4: (lv_sub_1_0= ruleBooleanExpression )
            // InternalDsl.g:1356:5: lv_sub_1_0= ruleBooleanExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBooleanExpressionBracketAccess().getSubBooleanExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_21);
            lv_sub_1_0=ruleBooleanExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBooleanExpressionBracketRule());
              					}
              					set(
              						current,
              						"sub",
              						lv_sub_1_0,
              						"robot.ev3.Dsl.BooleanExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getBooleanExpressionBracketAccess().getRightParenthesisKeyword_2());
              		
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
    // $ANTLR end "ruleBooleanExpressionBracket"


    // $ANTLR start "entryRuleBooleanExpressionConstant"
    // InternalDsl.g:1381:1: entryRuleBooleanExpressionConstant returns [EObject current=null] : iv_ruleBooleanExpressionConstant= ruleBooleanExpressionConstant EOF ;
    public final EObject entryRuleBooleanExpressionConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpressionConstant = null;


        try {
            // InternalDsl.g:1381:66: (iv_ruleBooleanExpressionConstant= ruleBooleanExpressionConstant EOF )
            // InternalDsl.g:1382:2: iv_ruleBooleanExpressionConstant= ruleBooleanExpressionConstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanExpressionConstantRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBooleanExpressionConstant=ruleBooleanExpressionConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanExpressionConstant; 
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
    // $ANTLR end "entryRuleBooleanExpressionConstant"


    // $ANTLR start "ruleBooleanExpressionConstant"
    // InternalDsl.g:1388:1: ruleBooleanExpressionConstant returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOL_LITERAL ) ) ;
    public final EObject ruleBooleanExpressionConstant() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalDsl.g:1394:2: ( ( (lv_value_0_0= RULE_BOOL_LITERAL ) ) )
            // InternalDsl.g:1395:2: ( (lv_value_0_0= RULE_BOOL_LITERAL ) )
            {
            // InternalDsl.g:1395:2: ( (lv_value_0_0= RULE_BOOL_LITERAL ) )
            // InternalDsl.g:1396:3: (lv_value_0_0= RULE_BOOL_LITERAL )
            {
            // InternalDsl.g:1396:3: (lv_value_0_0= RULE_BOOL_LITERAL )
            // InternalDsl.g:1397:4: lv_value_0_0= RULE_BOOL_LITERAL
            {
            lv_value_0_0=(Token)match(input,RULE_BOOL_LITERAL,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_value_0_0, grammarAccess.getBooleanExpressionConstantAccess().getValueBOOL_LITERALTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getBooleanExpressionConstantRule());
              				}
              				setWithLastConsumed(
              					current,
              					"value",
              					lv_value_0_0,
              					"robot.ev3.Dsl.BOOL_LITERAL");
              			
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
    // $ANTLR end "ruleBooleanExpressionConstant"


    // $ANTLR start "ruleMeasurementUnit"
    // InternalDsl.g:1416:1: ruleMeasurementUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'distance' ) | (enumLiteral_1= 'color' ) | (enumLiteral_2= 'int' ) ) ;
    public final Enumerator ruleMeasurementUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDsl.g:1422:2: ( ( (enumLiteral_0= 'distance' ) | (enumLiteral_1= 'color' ) | (enumLiteral_2= 'int' ) ) )
            // InternalDsl.g:1423:2: ( (enumLiteral_0= 'distance' ) | (enumLiteral_1= 'color' ) | (enumLiteral_2= 'int' ) )
            {
            // InternalDsl.g:1423:2: ( (enumLiteral_0= 'distance' ) | (enumLiteral_1= 'color' ) | (enumLiteral_2= 'int' ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt14=1;
                }
                break;
            case 29:
                {
                alt14=2;
                }
                break;
            case 30:
                {
                alt14=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalDsl.g:1424:3: (enumLiteral_0= 'distance' )
                    {
                    // InternalDsl.g:1424:3: (enumLiteral_0= 'distance' )
                    // InternalDsl.g:1425:4: enumLiteral_0= 'distance'
                    {
                    enumLiteral_0=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMeasurementUnitAccess().getDISTANCEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getMeasurementUnitAccess().getDISTANCEEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1432:3: (enumLiteral_1= 'color' )
                    {
                    // InternalDsl.g:1432:3: (enumLiteral_1= 'color' )
                    // InternalDsl.g:1433:4: enumLiteral_1= 'color'
                    {
                    enumLiteral_1=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMeasurementUnitAccess().getCOLOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getMeasurementUnitAccess().getCOLOREnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:1440:3: (enumLiteral_2= 'int' )
                    {
                    // InternalDsl.g:1440:3: (enumLiteral_2= 'int' )
                    // InternalDsl.g:1441:4: enumLiteral_2= 'int'
                    {
                    enumLiteral_2=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMeasurementUnitAccess().getINTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getMeasurementUnitAccess().getINTEnumLiteralDeclaration_2());
                      			
                    }

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
    // $ANTLR end "ruleMeasurementUnit"


    // $ANTLR start "ruleBehaviorTypes"
    // InternalDsl.g:1451:1: ruleBehaviorTypes returns [Enumerator current=null] : (enumLiteral_0= 'drive' ) ;
    public final Enumerator ruleBehaviorTypes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalDsl.g:1457:2: ( (enumLiteral_0= 'drive' ) )
            // InternalDsl.g:1458:2: (enumLiteral_0= 'drive' )
            {
            // InternalDsl.g:1458:2: (enumLiteral_0= 'drive' )
            // InternalDsl.g:1459:3: enumLiteral_0= 'drive'
            {
            enumLiteral_0=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = grammarAccess.getBehaviorTypesAccess().getDRIVEEnumLiteralDeclaration().getEnumLiteral().getInstance();
              			newLeafNode(enumLiteral_0, grammarAccess.getBehaviorTypesAccess().getDRIVEEnumLiteralDeclaration());
              		
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
    // $ANTLR end "ruleBehaviorTypes"


    // $ANTLR start "ruleMeasurables"
    // InternalDsl.g:1468:1: ruleMeasurables returns [Enumerator current=null] : ( (enumLiteral_0= 'floorColor' ) | (enumLiteral_1= 'leftTouch' ) | (enumLiteral_2= 'rightTouch' ) | (enumLiteral_3= 'distanceObjectInFront' ) ) ;
    public final Enumerator ruleMeasurables() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDsl.g:1474:2: ( ( (enumLiteral_0= 'floorColor' ) | (enumLiteral_1= 'leftTouch' ) | (enumLiteral_2= 'rightTouch' ) | (enumLiteral_3= 'distanceObjectInFront' ) ) )
            // InternalDsl.g:1475:2: ( (enumLiteral_0= 'floorColor' ) | (enumLiteral_1= 'leftTouch' ) | (enumLiteral_2= 'rightTouch' ) | (enumLiteral_3= 'distanceObjectInFront' ) )
            {
            // InternalDsl.g:1475:2: ( (enumLiteral_0= 'floorColor' ) | (enumLiteral_1= 'leftTouch' ) | (enumLiteral_2= 'rightTouch' ) | (enumLiteral_3= 'distanceObjectInFront' ) )
            int alt15=4;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt15=1;
                }
                break;
            case 33:
                {
                alt15=2;
                }
                break;
            case 34:
                {
                alt15=3;
                }
                break;
            case 35:
                {
                alt15=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalDsl.g:1476:3: (enumLiteral_0= 'floorColor' )
                    {
                    // InternalDsl.g:1476:3: (enumLiteral_0= 'floorColor' )
                    // InternalDsl.g:1477:4: enumLiteral_0= 'floorColor'
                    {
                    enumLiteral_0=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMeasurablesAccess().getFLOOR_COLOREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getMeasurablesAccess().getFLOOR_COLOREnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1484:3: (enumLiteral_1= 'leftTouch' )
                    {
                    // InternalDsl.g:1484:3: (enumLiteral_1= 'leftTouch' )
                    // InternalDsl.g:1485:4: enumLiteral_1= 'leftTouch'
                    {
                    enumLiteral_1=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMeasurablesAccess().getLEFT_TOUCHEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getMeasurablesAccess().getLEFT_TOUCHEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:1492:3: (enumLiteral_2= 'rightTouch' )
                    {
                    // InternalDsl.g:1492:3: (enumLiteral_2= 'rightTouch' )
                    // InternalDsl.g:1493:4: enumLiteral_2= 'rightTouch'
                    {
                    enumLiteral_2=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMeasurablesAccess().getRIGHT_TOUCHEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getMeasurablesAccess().getRIGHT_TOUCHEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:1500:3: (enumLiteral_3= 'distanceObjectInFront' )
                    {
                    // InternalDsl.g:1500:3: (enumLiteral_3= 'distanceObjectInFront' )
                    // InternalDsl.g:1501:4: enumLiteral_3= 'distanceObjectInFront'
                    {
                    enumLiteral_3=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMeasurablesAccess().getDIST_TO_OBJECT_FRONTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getMeasurablesAccess().getDIST_TO_OBJECT_FRONTEnumLiteralDeclaration_3());
                      			
                    }

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
    // $ANTLR end "ruleMeasurables"


    // $ANTLR start "ruleActions"
    // InternalDsl.g:1511:1: ruleActions returns [Enumerator current=null] : ( (enumLiteral_0= 'rotateLeft' ) | (enumLiteral_1= 'rotateRight' ) | (enumLiteral_2= 'driveForward' ) | (enumLiteral_3= 'driveBackward' ) | (enumLiteral_4= 'stopDriving' ) ) ;
    public final Enumerator ruleActions() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalDsl.g:1517:2: ( ( (enumLiteral_0= 'rotateLeft' ) | (enumLiteral_1= 'rotateRight' ) | (enumLiteral_2= 'driveForward' ) | (enumLiteral_3= 'driveBackward' ) | (enumLiteral_4= 'stopDriving' ) ) )
            // InternalDsl.g:1518:2: ( (enumLiteral_0= 'rotateLeft' ) | (enumLiteral_1= 'rotateRight' ) | (enumLiteral_2= 'driveForward' ) | (enumLiteral_3= 'driveBackward' ) | (enumLiteral_4= 'stopDriving' ) )
            {
            // InternalDsl.g:1518:2: ( (enumLiteral_0= 'rotateLeft' ) | (enumLiteral_1= 'rotateRight' ) | (enumLiteral_2= 'driveForward' ) | (enumLiteral_3= 'driveBackward' ) | (enumLiteral_4= 'stopDriving' ) )
            int alt16=5;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt16=1;
                }
                break;
            case 37:
                {
                alt16=2;
                }
                break;
            case 38:
                {
                alt16=3;
                }
                break;
            case 39:
                {
                alt16=4;
                }
                break;
            case 40:
                {
                alt16=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalDsl.g:1519:3: (enumLiteral_0= 'rotateLeft' )
                    {
                    // InternalDsl.g:1519:3: (enumLiteral_0= 'rotateLeft' )
                    // InternalDsl.g:1520:4: enumLiteral_0= 'rotateLeft'
                    {
                    enumLiteral_0=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getActionsAccess().getROTATE_LEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getActionsAccess().getROTATE_LEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1527:3: (enumLiteral_1= 'rotateRight' )
                    {
                    // InternalDsl.g:1527:3: (enumLiteral_1= 'rotateRight' )
                    // InternalDsl.g:1528:4: enumLiteral_1= 'rotateRight'
                    {
                    enumLiteral_1=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getActionsAccess().getROTATE_REnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getActionsAccess().getROTATE_REnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:1535:3: (enumLiteral_2= 'driveForward' )
                    {
                    // InternalDsl.g:1535:3: (enumLiteral_2= 'driveForward' )
                    // InternalDsl.g:1536:4: enumLiteral_2= 'driveForward'
                    {
                    enumLiteral_2=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getActionsAccess().getDRIVE_FORWARDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getActionsAccess().getDRIVE_FORWARDEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:1543:3: (enumLiteral_3= 'driveBackward' )
                    {
                    // InternalDsl.g:1543:3: (enumLiteral_3= 'driveBackward' )
                    // InternalDsl.g:1544:4: enumLiteral_3= 'driveBackward'
                    {
                    enumLiteral_3=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getActionsAccess().getDRIVE_BACKWARDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getActionsAccess().getDRIVE_BACKWARDEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:1551:3: (enumLiteral_4= 'stopDriving' )
                    {
                    // InternalDsl.g:1551:3: (enumLiteral_4= 'stopDriving' )
                    // InternalDsl.g:1552:4: enumLiteral_4= 'stopDriving'
                    {
                    enumLiteral_4=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getActionsAccess().getSTOP_DRIVINGEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getActionsAccess().getSTOP_DRIVINGEnumLiteralDeclaration_4());
                      			
                    }

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
    // $ANTLR end "ruleActions"


    // $ANTLR start "ruleBinaryBooleanOperator"
    // InternalDsl.g:1562:1: ruleBinaryBooleanOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) ) ;
    public final Enumerator ruleBinaryBooleanOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDsl.g:1568:2: ( ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) ) )
            // InternalDsl.g:1569:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) )
            {
            // InternalDsl.g:1569:2: ( (enumLiteral_0= 'AND' ) | (enumLiteral_1= 'OR' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==41) ) {
                alt17=1;
            }
            else if ( (LA17_0==42) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalDsl.g:1570:3: (enumLiteral_0= 'AND' )
                    {
                    // InternalDsl.g:1570:3: (enumLiteral_0= 'AND' )
                    // InternalDsl.g:1571:4: enumLiteral_0= 'AND'
                    {
                    enumLiteral_0=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBinaryBooleanOperatorAccess().getANDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getBinaryBooleanOperatorAccess().getANDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1578:3: (enumLiteral_1= 'OR' )
                    {
                    // InternalDsl.g:1578:3: (enumLiteral_1= 'OR' )
                    // InternalDsl.g:1579:4: enumLiteral_1= 'OR'
                    {
                    enumLiteral_1=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getBinaryBooleanOperatorAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getBinaryBooleanOperatorAccess().getOREnumLiteralDeclaration_1());
                      			
                    }

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
    // $ANTLR end "ruleBinaryBooleanOperator"


    // $ANTLR start "ruleCompareOperator"
    // InternalDsl.g:1589:1: ruleCompareOperator returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '<' ) ) ;
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
            // InternalDsl.g:1595:2: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '<' ) ) )
            // InternalDsl.g:1596:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '<' ) )
            {
            // InternalDsl.g:1596:2: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '>=' ) | (enumLiteral_3= '>' ) | (enumLiteral_4= '<=' ) | (enumLiteral_5= '<' ) )
            int alt18=6;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt18=1;
                }
                break;
            case 44:
                {
                alt18=2;
                }
                break;
            case 45:
                {
                alt18=3;
                }
                break;
            case 46:
                {
                alt18=4;
                }
                break;
            case 47:
                {
                alt18=5;
                }
                break;
            case 48:
                {
                alt18=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalDsl.g:1597:3: (enumLiteral_0= '==' )
                    {
                    // InternalDsl.g:1597:3: (enumLiteral_0= '==' )
                    // InternalDsl.g:1598:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1605:3: (enumLiteral_1= '!=' )
                    {
                    // InternalDsl.g:1605:3: (enumLiteral_1= '!=' )
                    // InternalDsl.g:1606:4: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCompareOperatorAccess().getNEQEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getCompareOperatorAccess().getNEQEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:1613:3: (enumLiteral_2= '>=' )
                    {
                    // InternalDsl.g:1613:3: (enumLiteral_2= '>=' )
                    // InternalDsl.g:1614:4: enumLiteral_2= '>='
                    {
                    enumLiteral_2=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:1621:3: (enumLiteral_3= '>' )
                    {
                    // InternalDsl.g:1621:3: (enumLiteral_3= '>' )
                    // InternalDsl.g:1622:4: enumLiteral_3= '>'
                    {
                    enumLiteral_3=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCompareOperatorAccess().getGEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getCompareOperatorAccess().getGEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:1629:3: (enumLiteral_4= '<=' )
                    {
                    // InternalDsl.g:1629:3: (enumLiteral_4= '<=' )
                    // InternalDsl.g:1630:4: enumLiteral_4= '<='
                    {
                    enumLiteral_4=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalDsl.g:1637:3: (enumLiteral_5= '<' )
                    {
                    // InternalDsl.g:1637:3: (enumLiteral_5= '<' )
                    // InternalDsl.g:1638:4: enumLiteral_5= '<'
                    {
                    enumLiteral_5=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCompareOperatorAccess().getLEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getCompareOperatorAccess().getLEnumLiteralDeclaration_5());
                      			
                    }

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
    // $ANTLR end "ruleCompareOperator"

    // $ANTLR start synpred1_InternalDsl
    public final void synpred1_InternalDsl_fragment() throws RecognitionException {   
        // InternalDsl.g:1220:4: ( ruleComparisonExpression )
        // InternalDsl.g:1220:5: ruleComparisonExpression
        {
        pushFollow(FOLLOW_2);
        ruleComparisonExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalDsl

    // Delegated rules

    public final boolean synpred1_InternalDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalDsl_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000080004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000F0A0600A0L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000001F000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000F0A0600A2L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000070000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0001F80000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002060020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000F80002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000000A0600A0L});

}