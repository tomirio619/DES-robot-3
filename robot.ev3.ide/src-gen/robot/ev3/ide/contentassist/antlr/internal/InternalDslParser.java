package robot.ev3.ide.contentassist.antlr.internal;

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
import robot.ev3.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_BOOL_LITERAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'drive'", "'distance'", "'color'", "'int'", "'floorColor'", "'leftTouch'", "'rightTouch'", "'distanceObjectInFront'", "'rotateLeft'", "'rotateRight'", "'driveForward'", "'driveBackward'", "'stopDriving'", "'AND'", "'OR'", "'=='", "'!='", "'>='", "'>'", "'<='", "'<'", "'Behavior:'", "'type:'", "'priority:'", "'take-control:'", "'actions:'", "'+'", "'-'", "'*'", "'/'", "'max'", "'min'", "'mod'", "'^'", "'('", "')'", "'NOT'"
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

    	public void setGrammarAccess(DslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleMission"
    // InternalDsl.g:54:1: entryRuleMission : ruleMission EOF ;
    public final void entryRuleMission() throws RecognitionException {
        try {
            // InternalDsl.g:55:1: ( ruleMission EOF )
            // InternalDsl.g:56:1: ruleMission EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMissionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMission();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMissionRule()); 
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
    // $ANTLR end "entryRuleMission"


    // $ANTLR start "ruleMission"
    // InternalDsl.g:63:1: ruleMission : ( ( ( rule__Mission__BehaviorListAssignment ) ) ( ( rule__Mission__BehaviorListAssignment )* ) ) ;
    public final void ruleMission() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:67:2: ( ( ( ( rule__Mission__BehaviorListAssignment ) ) ( ( rule__Mission__BehaviorListAssignment )* ) ) )
            // InternalDsl.g:68:2: ( ( ( rule__Mission__BehaviorListAssignment ) ) ( ( rule__Mission__BehaviorListAssignment )* ) )
            {
            // InternalDsl.g:68:2: ( ( ( rule__Mission__BehaviorListAssignment ) ) ( ( rule__Mission__BehaviorListAssignment )* ) )
            // InternalDsl.g:69:3: ( ( rule__Mission__BehaviorListAssignment ) ) ( ( rule__Mission__BehaviorListAssignment )* )
            {
            // InternalDsl.g:69:3: ( ( rule__Mission__BehaviorListAssignment ) )
            // InternalDsl.g:70:4: ( rule__Mission__BehaviorListAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMissionAccess().getBehaviorListAssignment()); 
            }
            // InternalDsl.g:71:4: ( rule__Mission__BehaviorListAssignment )
            // InternalDsl.g:71:5: rule__Mission__BehaviorListAssignment
            {
            pushFollow(FOLLOW_3);
            rule__Mission__BehaviorListAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMissionAccess().getBehaviorListAssignment()); 
            }

            }

            // InternalDsl.g:74:3: ( ( rule__Mission__BehaviorListAssignment )* )
            // InternalDsl.g:75:4: ( rule__Mission__BehaviorListAssignment )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMissionAccess().getBehaviorListAssignment()); 
            }
            // InternalDsl.g:76:4: ( rule__Mission__BehaviorListAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==33) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDsl.g:76:5: rule__Mission__BehaviorListAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Mission__BehaviorListAssignment();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMissionAccess().getBehaviorListAssignment()); 
            }

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
    // $ANTLR end "ruleMission"


    // $ANTLR start "entryRuleBehavior"
    // InternalDsl.g:86:1: entryRuleBehavior : ruleBehavior EOF ;
    public final void entryRuleBehavior() throws RecognitionException {
        try {
            // InternalDsl.g:87:1: ( ruleBehavior EOF )
            // InternalDsl.g:88:1: ruleBehavior EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBehaviorRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBehavior();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBehaviorRule()); 
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
    // $ANTLR end "entryRuleBehavior"


    // $ANTLR start "ruleBehavior"
    // InternalDsl.g:95:1: ruleBehavior : ( ( rule__Behavior__Group__0 ) ) ;
    public final void ruleBehavior() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:99:2: ( ( ( rule__Behavior__Group__0 ) ) )
            // InternalDsl.g:100:2: ( ( rule__Behavior__Group__0 ) )
            {
            // InternalDsl.g:100:2: ( ( rule__Behavior__Group__0 ) )
            // InternalDsl.g:101:3: ( rule__Behavior__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBehaviorAccess().getGroup()); 
            }
            // InternalDsl.g:102:3: ( rule__Behavior__Group__0 )
            // InternalDsl.g:102:4: rule__Behavior__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Behavior__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBehaviorAccess().getGroup()); 
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
    // $ANTLR end "ruleBehavior"


    // $ANTLR start "entryRuleTakeControl"
    // InternalDsl.g:111:1: entryRuleTakeControl : ruleTakeControl EOF ;
    public final void entryRuleTakeControl() throws RecognitionException {
        try {
            // InternalDsl.g:112:1: ( ruleTakeControl EOF )
            // InternalDsl.g:113:1: ruleTakeControl EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTakeControlRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTakeControl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTakeControlRule()); 
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
    // $ANTLR end "entryRuleTakeControl"


    // $ANTLR start "ruleTakeControl"
    // InternalDsl.g:120:1: ruleTakeControl : ( ( rule__TakeControl__Alternatives ) ) ;
    public final void ruleTakeControl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:124:2: ( ( ( rule__TakeControl__Alternatives ) ) )
            // InternalDsl.g:125:2: ( ( rule__TakeControl__Alternatives ) )
            {
            // InternalDsl.g:125:2: ( ( rule__TakeControl__Alternatives ) )
            // InternalDsl.g:126:3: ( rule__TakeControl__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTakeControlAccess().getAlternatives()); 
            }
            // InternalDsl.g:127:3: ( rule__TakeControl__Alternatives )
            // InternalDsl.g:127:4: rule__TakeControl__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TakeControl__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTakeControlAccess().getAlternatives()); 
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
    // $ANTLR end "ruleTakeControl"


    // $ANTLR start "entryRuleMeasurableConditions"
    // InternalDsl.g:136:1: entryRuleMeasurableConditions : ruleMeasurableConditions EOF ;
    public final void entryRuleMeasurableConditions() throws RecognitionException {
        try {
            // InternalDsl.g:137:1: ( ruleMeasurableConditions EOF )
            // InternalDsl.g:138:1: ruleMeasurableConditions EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMeasurableConditionsRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMeasurableConditions();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMeasurableConditionsRule()); 
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
    // $ANTLR end "entryRuleMeasurableConditions"


    // $ANTLR start "ruleMeasurableConditions"
    // InternalDsl.g:145:1: ruleMeasurableConditions : ( ( ( rule__MeasurableConditions__MeasurableConditionsAssignment ) ) ( ( rule__MeasurableConditions__MeasurableConditionsAssignment )* ) ) ;
    public final void ruleMeasurableConditions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:149:2: ( ( ( ( rule__MeasurableConditions__MeasurableConditionsAssignment ) ) ( ( rule__MeasurableConditions__MeasurableConditionsAssignment )* ) ) )
            // InternalDsl.g:150:2: ( ( ( rule__MeasurableConditions__MeasurableConditionsAssignment ) ) ( ( rule__MeasurableConditions__MeasurableConditionsAssignment )* ) )
            {
            // InternalDsl.g:150:2: ( ( ( rule__MeasurableConditions__MeasurableConditionsAssignment ) ) ( ( rule__MeasurableConditions__MeasurableConditionsAssignment )* ) )
            // InternalDsl.g:151:3: ( ( rule__MeasurableConditions__MeasurableConditionsAssignment ) ) ( ( rule__MeasurableConditions__MeasurableConditionsAssignment )* )
            {
            // InternalDsl.g:151:3: ( ( rule__MeasurableConditions__MeasurableConditionsAssignment ) )
            // InternalDsl.g:152:4: ( rule__MeasurableConditions__MeasurableConditionsAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMeasurableConditionsAccess().getMeasurableConditionsAssignment()); 
            }
            // InternalDsl.g:153:4: ( rule__MeasurableConditions__MeasurableConditionsAssignment )
            // InternalDsl.g:153:5: rule__MeasurableConditions__MeasurableConditionsAssignment
            {
            pushFollow(FOLLOW_4);
            rule__MeasurableConditions__MeasurableConditionsAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMeasurableConditionsAccess().getMeasurableConditionsAssignment()); 
            }

            }

            // InternalDsl.g:156:3: ( ( rule__MeasurableConditions__MeasurableConditionsAssignment )* )
            // InternalDsl.g:157:4: ( rule__MeasurableConditions__MeasurableConditionsAssignment )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMeasurableConditionsAccess().getMeasurableConditionsAssignment()); 
            }
            // InternalDsl.g:158:4: ( rule__MeasurableConditions__MeasurableConditionsAssignment )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=16 && LA2_0<=19)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDsl.g:158:5: rule__MeasurableConditions__MeasurableConditionsAssignment
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__MeasurableConditions__MeasurableConditionsAssignment();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMeasurableConditionsAccess().getMeasurableConditionsAssignment()); 
            }

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
    // $ANTLR end "ruleMeasurableConditions"


    // $ANTLR start "entryRuleMeasurableCondition"
    // InternalDsl.g:168:1: entryRuleMeasurableCondition : ruleMeasurableCondition EOF ;
    public final void entryRuleMeasurableCondition() throws RecognitionException {
        try {
            // InternalDsl.g:169:1: ( ruleMeasurableCondition EOF )
            // InternalDsl.g:170:1: ruleMeasurableCondition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMeasurableConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMeasurableCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMeasurableConditionRule()); 
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
    // $ANTLR end "entryRuleMeasurableCondition"


    // $ANTLR start "ruleMeasurableCondition"
    // InternalDsl.g:177:1: ruleMeasurableCondition : ( ( rule__MeasurableCondition__Group__0 ) ) ;
    public final void ruleMeasurableCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:181:2: ( ( ( rule__MeasurableCondition__Group__0 ) ) )
            // InternalDsl.g:182:2: ( ( rule__MeasurableCondition__Group__0 ) )
            {
            // InternalDsl.g:182:2: ( ( rule__MeasurableCondition__Group__0 ) )
            // InternalDsl.g:183:3: ( rule__MeasurableCondition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMeasurableConditionAccess().getGroup()); 
            }
            // InternalDsl.g:184:3: ( rule__MeasurableCondition__Group__0 )
            // InternalDsl.g:184:4: rule__MeasurableCondition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MeasurableCondition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMeasurableConditionAccess().getGroup()); 
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
    // $ANTLR end "ruleMeasurableCondition"


    // $ANTLR start "entryRuleIntExpression"
    // InternalDsl.g:193:1: entryRuleIntExpression : ruleIntExpression EOF ;
    public final void entryRuleIntExpression() throws RecognitionException {
        try {
            // InternalDsl.g:194:1: ( ruleIntExpression EOF )
            // InternalDsl.g:195:1: ruleIntExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleIntExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntExpressionRule()); 
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
    // $ANTLR end "entryRuleIntExpression"


    // $ANTLR start "ruleIntExpression"
    // InternalDsl.g:202:1: ruleIntExpression : ( ruleExpressionLevel1 ) ;
    public final void ruleIntExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:206:2: ( ( ruleExpressionLevel1 ) )
            // InternalDsl.g:207:2: ( ruleExpressionLevel1 )
            {
            // InternalDsl.g:207:2: ( ruleExpressionLevel1 )
            // InternalDsl.g:208:3: ruleExpressionLevel1
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntExpressionAccess().getExpressionLevel1ParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressionLevel1();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntExpressionAccess().getExpressionLevel1ParserRuleCall()); 
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
    // $ANTLR end "ruleIntExpression"


    // $ANTLR start "entryRuleExpressionLevel1"
    // InternalDsl.g:218:1: entryRuleExpressionLevel1 : ruleExpressionLevel1 EOF ;
    public final void entryRuleExpressionLevel1() throws RecognitionException {
        try {
            // InternalDsl.g:219:1: ( ruleExpressionLevel1 EOF )
            // InternalDsl.g:220:1: ruleExpressionLevel1 EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel1Rule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpressionLevel1();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel1Rule()); 
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
    // $ANTLR end "entryRuleExpressionLevel1"


    // $ANTLR start "ruleExpressionLevel1"
    // InternalDsl.g:227:1: ruleExpressionLevel1 : ( ( rule__ExpressionLevel1__Group__0 ) ) ;
    public final void ruleExpressionLevel1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:231:2: ( ( ( rule__ExpressionLevel1__Group__0 ) ) )
            // InternalDsl.g:232:2: ( ( rule__ExpressionLevel1__Group__0 ) )
            {
            // InternalDsl.g:232:2: ( ( rule__ExpressionLevel1__Group__0 ) )
            // InternalDsl.g:233:3: ( rule__ExpressionLevel1__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel1Access().getGroup()); 
            }
            // InternalDsl.g:234:3: ( rule__ExpressionLevel1__Group__0 )
            // InternalDsl.g:234:4: rule__ExpressionLevel1__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel1Access().getGroup()); 
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
    // $ANTLR end "ruleExpressionLevel1"


    // $ANTLR start "entryRuleExpressionLevel2"
    // InternalDsl.g:243:1: entryRuleExpressionLevel2 : ruleExpressionLevel2 EOF ;
    public final void entryRuleExpressionLevel2() throws RecognitionException {
        try {
            // InternalDsl.g:244:1: ( ruleExpressionLevel2 EOF )
            // InternalDsl.g:245:1: ruleExpressionLevel2 EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Rule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpressionLevel2();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Rule()); 
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
    // $ANTLR end "entryRuleExpressionLevel2"


    // $ANTLR start "ruleExpressionLevel2"
    // InternalDsl.g:252:1: ruleExpressionLevel2 : ( ( rule__ExpressionLevel2__Group__0 ) ) ;
    public final void ruleExpressionLevel2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:256:2: ( ( ( rule__ExpressionLevel2__Group__0 ) ) )
            // InternalDsl.g:257:2: ( ( rule__ExpressionLevel2__Group__0 ) )
            {
            // InternalDsl.g:257:2: ( ( rule__ExpressionLevel2__Group__0 ) )
            // InternalDsl.g:258:3: ( rule__ExpressionLevel2__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getGroup()); 
            }
            // InternalDsl.g:259:3: ( rule__ExpressionLevel2__Group__0 )
            // InternalDsl.g:259:4: rule__ExpressionLevel2__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getGroup()); 
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
    // $ANTLR end "ruleExpressionLevel2"


    // $ANTLR start "entryRuleExpressionLevel3"
    // InternalDsl.g:268:1: entryRuleExpressionLevel3 : ruleExpressionLevel3 EOF ;
    public final void entryRuleExpressionLevel3() throws RecognitionException {
        try {
            // InternalDsl.g:269:1: ( ruleExpressionLevel3 EOF )
            // InternalDsl.g:270:1: ruleExpressionLevel3 EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel3Rule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpressionLevel3();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel3Rule()); 
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
    // $ANTLR end "entryRuleExpressionLevel3"


    // $ANTLR start "ruleExpressionLevel3"
    // InternalDsl.g:277:1: ruleExpressionLevel3 : ( ( rule__ExpressionLevel3__Group__0 ) ) ;
    public final void ruleExpressionLevel3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:281:2: ( ( ( rule__ExpressionLevel3__Group__0 ) ) )
            // InternalDsl.g:282:2: ( ( rule__ExpressionLevel3__Group__0 ) )
            {
            // InternalDsl.g:282:2: ( ( rule__ExpressionLevel3__Group__0 ) )
            // InternalDsl.g:283:3: ( rule__ExpressionLevel3__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel3Access().getGroup()); 
            }
            // InternalDsl.g:284:3: ( rule__ExpressionLevel3__Group__0 )
            // InternalDsl.g:284:4: rule__ExpressionLevel3__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel3__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel3Access().getGroup()); 
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
    // $ANTLR end "ruleExpressionLevel3"


    // $ANTLR start "entryRuleExpressionLevel4"
    // InternalDsl.g:293:1: entryRuleExpressionLevel4 : ruleExpressionLevel4 EOF ;
    public final void entryRuleExpressionLevel4() throws RecognitionException {
        try {
            // InternalDsl.g:294:1: ( ruleExpressionLevel4 EOF )
            // InternalDsl.g:295:1: ruleExpressionLevel4 EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel4Rule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpressionLevel4();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel4Rule()); 
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
    // $ANTLR end "entryRuleExpressionLevel4"


    // $ANTLR start "ruleExpressionLevel4"
    // InternalDsl.g:302:1: ruleExpressionLevel4 : ( ( rule__ExpressionLevel4__Alternatives ) ) ;
    public final void ruleExpressionLevel4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:306:2: ( ( ( rule__ExpressionLevel4__Alternatives ) ) )
            // InternalDsl.g:307:2: ( ( rule__ExpressionLevel4__Alternatives ) )
            {
            // InternalDsl.g:307:2: ( ( rule__ExpressionLevel4__Alternatives ) )
            // InternalDsl.g:308:3: ( rule__ExpressionLevel4__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel4Access().getAlternatives()); 
            }
            // InternalDsl.g:309:3: ( rule__ExpressionLevel4__Alternatives )
            // InternalDsl.g:309:4: rule__ExpressionLevel4__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel4__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel4Access().getAlternatives()); 
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
    // $ANTLR end "ruleExpressionLevel4"


    // $ANTLR start "entryRuleExpressionMinus"
    // InternalDsl.g:318:1: entryRuleExpressionMinus : ruleExpressionMinus EOF ;
    public final void entryRuleExpressionMinus() throws RecognitionException {
        try {
            // InternalDsl.g:319:1: ( ruleExpressionMinus EOF )
            // InternalDsl.g:320:1: ruleExpressionMinus EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionMinusRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpressionMinus();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionMinusRule()); 
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
    // $ANTLR end "entryRuleExpressionMinus"


    // $ANTLR start "ruleExpressionMinus"
    // InternalDsl.g:327:1: ruleExpressionMinus : ( ( rule__ExpressionMinus__Group__0 ) ) ;
    public final void ruleExpressionMinus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:331:2: ( ( ( rule__ExpressionMinus__Group__0 ) ) )
            // InternalDsl.g:332:2: ( ( rule__ExpressionMinus__Group__0 ) )
            {
            // InternalDsl.g:332:2: ( ( rule__ExpressionMinus__Group__0 ) )
            // InternalDsl.g:333:3: ( rule__ExpressionMinus__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionMinusAccess().getGroup()); 
            }
            // InternalDsl.g:334:3: ( rule__ExpressionMinus__Group__0 )
            // InternalDsl.g:334:4: rule__ExpressionMinus__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionMinus__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionMinusAccess().getGroup()); 
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
    // $ANTLR end "ruleExpressionMinus"


    // $ANTLR start "entryRuleExpressionPlus"
    // InternalDsl.g:343:1: entryRuleExpressionPlus : ruleExpressionPlus EOF ;
    public final void entryRuleExpressionPlus() throws RecognitionException {
        try {
            // InternalDsl.g:344:1: ( ruleExpressionPlus EOF )
            // InternalDsl.g:345:1: ruleExpressionPlus EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionPlusRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpressionPlus();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionPlusRule()); 
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
    // $ANTLR end "entryRuleExpressionPlus"


    // $ANTLR start "ruleExpressionPlus"
    // InternalDsl.g:352:1: ruleExpressionPlus : ( ( rule__ExpressionPlus__Group__0 ) ) ;
    public final void ruleExpressionPlus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:356:2: ( ( ( rule__ExpressionPlus__Group__0 ) ) )
            // InternalDsl.g:357:2: ( ( rule__ExpressionPlus__Group__0 ) )
            {
            // InternalDsl.g:357:2: ( ( rule__ExpressionPlus__Group__0 ) )
            // InternalDsl.g:358:3: ( rule__ExpressionPlus__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionPlusAccess().getGroup()); 
            }
            // InternalDsl.g:359:3: ( rule__ExpressionPlus__Group__0 )
            // InternalDsl.g:359:4: rule__ExpressionPlus__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionPlus__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionPlusAccess().getGroup()); 
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
    // $ANTLR end "ruleExpressionPlus"


    // $ANTLR start "entryRuleExpressionLevel5"
    // InternalDsl.g:368:1: entryRuleExpressionLevel5 : ruleExpressionLevel5 EOF ;
    public final void entryRuleExpressionLevel5() throws RecognitionException {
        try {
            // InternalDsl.g:369:1: ( ruleExpressionLevel5 EOF )
            // InternalDsl.g:370:1: ruleExpressionLevel5 EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel5Rule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpressionLevel5();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel5Rule()); 
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
    // $ANTLR end "entryRuleExpressionLevel5"


    // $ANTLR start "ruleExpressionLevel5"
    // InternalDsl.g:377:1: ruleExpressionLevel5 : ( ( rule__ExpressionLevel5__Alternatives ) ) ;
    public final void ruleExpressionLevel5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:381:2: ( ( ( rule__ExpressionLevel5__Alternatives ) ) )
            // InternalDsl.g:382:2: ( ( rule__ExpressionLevel5__Alternatives ) )
            {
            // InternalDsl.g:382:2: ( ( rule__ExpressionLevel5__Alternatives ) )
            // InternalDsl.g:383:3: ( rule__ExpressionLevel5__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel5Access().getAlternatives()); 
            }
            // InternalDsl.g:384:3: ( rule__ExpressionLevel5__Alternatives )
            // InternalDsl.g:384:4: rule__ExpressionLevel5__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel5__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel5Access().getAlternatives()); 
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
    // $ANTLR end "ruleExpressionLevel5"


    // $ANTLR start "entryRuleExpressionBracket"
    // InternalDsl.g:393:1: entryRuleExpressionBracket : ruleExpressionBracket EOF ;
    public final void entryRuleExpressionBracket() throws RecognitionException {
        try {
            // InternalDsl.g:394:1: ( ruleExpressionBracket EOF )
            // InternalDsl.g:395:1: ruleExpressionBracket EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionBracketRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpressionBracket();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionBracketRule()); 
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
    // $ANTLR end "entryRuleExpressionBracket"


    // $ANTLR start "ruleExpressionBracket"
    // InternalDsl.g:402:1: ruleExpressionBracket : ( ( rule__ExpressionBracket__Group__0 ) ) ;
    public final void ruleExpressionBracket() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:406:2: ( ( ( rule__ExpressionBracket__Group__0 ) ) )
            // InternalDsl.g:407:2: ( ( rule__ExpressionBracket__Group__0 ) )
            {
            // InternalDsl.g:407:2: ( ( rule__ExpressionBracket__Group__0 ) )
            // InternalDsl.g:408:3: ( rule__ExpressionBracket__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionBracketAccess().getGroup()); 
            }
            // InternalDsl.g:409:3: ( rule__ExpressionBracket__Group__0 )
            // InternalDsl.g:409:4: rule__ExpressionBracket__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionBracket__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionBracketAccess().getGroup()); 
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
    // $ANTLR end "ruleExpressionBracket"


    // $ANTLR start "entryRuleExpressionConstantInt"
    // InternalDsl.g:418:1: entryRuleExpressionConstantInt : ruleExpressionConstantInt EOF ;
    public final void entryRuleExpressionConstantInt() throws RecognitionException {
        try {
            // InternalDsl.g:419:1: ( ruleExpressionConstantInt EOF )
            // InternalDsl.g:420:1: ruleExpressionConstantInt EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionConstantIntRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpressionConstantInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionConstantIntRule()); 
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
    // $ANTLR end "entryRuleExpressionConstantInt"


    // $ANTLR start "ruleExpressionConstantInt"
    // InternalDsl.g:427:1: ruleExpressionConstantInt : ( ( rule__ExpressionConstantInt__ValueAssignment ) ) ;
    public final void ruleExpressionConstantInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:431:2: ( ( ( rule__ExpressionConstantInt__ValueAssignment ) ) )
            // InternalDsl.g:432:2: ( ( rule__ExpressionConstantInt__ValueAssignment ) )
            {
            // InternalDsl.g:432:2: ( ( rule__ExpressionConstantInt__ValueAssignment ) )
            // InternalDsl.g:433:3: ( rule__ExpressionConstantInt__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionConstantIntAccess().getValueAssignment()); 
            }
            // InternalDsl.g:434:3: ( rule__ExpressionConstantInt__ValueAssignment )
            // InternalDsl.g:434:4: rule__ExpressionConstantInt__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionConstantInt__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionConstantIntAccess().getValueAssignment()); 
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
    // $ANTLR end "ruleExpressionConstantInt"


    // $ANTLR start "entryRuleBooleanExpression"
    // InternalDsl.g:443:1: entryRuleBooleanExpression : ruleBooleanExpression EOF ;
    public final void entryRuleBooleanExpression() throws RecognitionException {
        try {
            // InternalDsl.g:444:1: ( ruleBooleanExpression EOF )
            // InternalDsl.g:445:1: ruleBooleanExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBooleanExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionRule()); 
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
    // $ANTLR end "entryRuleBooleanExpression"


    // $ANTLR start "ruleBooleanExpression"
    // InternalDsl.g:452:1: ruleBooleanExpression : ( ruleBooleanExpressionLevel1 ) ;
    public final void ruleBooleanExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:456:2: ( ( ruleBooleanExpressionLevel1 ) )
            // InternalDsl.g:457:2: ( ruleBooleanExpressionLevel1 )
            {
            // InternalDsl.g:457:2: ( ruleBooleanExpressionLevel1 )
            // InternalDsl.g:458:3: ruleBooleanExpressionLevel1
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionAccess().getBooleanExpressionLevel1ParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleBooleanExpressionLevel1();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionAccess().getBooleanExpressionLevel1ParserRuleCall()); 
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
    // $ANTLR end "ruleBooleanExpression"


    // $ANTLR start "entryRuleBooleanExpressionLevel1"
    // InternalDsl.g:468:1: entryRuleBooleanExpressionLevel1 : ruleBooleanExpressionLevel1 EOF ;
    public final void entryRuleBooleanExpressionLevel1() throws RecognitionException {
        try {
            // InternalDsl.g:469:1: ( ruleBooleanExpressionLevel1 EOF )
            // InternalDsl.g:470:1: ruleBooleanExpressionLevel1 EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionLevel1Rule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBooleanExpressionLevel1();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionLevel1Rule()); 
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
    // $ANTLR end "entryRuleBooleanExpressionLevel1"


    // $ANTLR start "ruleBooleanExpressionLevel1"
    // InternalDsl.g:477:1: ruleBooleanExpressionLevel1 : ( ( rule__BooleanExpressionLevel1__Group__0 ) ) ;
    public final void ruleBooleanExpressionLevel1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:481:2: ( ( ( rule__BooleanExpressionLevel1__Group__0 ) ) )
            // InternalDsl.g:482:2: ( ( rule__BooleanExpressionLevel1__Group__0 ) )
            {
            // InternalDsl.g:482:2: ( ( rule__BooleanExpressionLevel1__Group__0 ) )
            // InternalDsl.g:483:3: ( rule__BooleanExpressionLevel1__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionLevel1Access().getGroup()); 
            }
            // InternalDsl.g:484:3: ( rule__BooleanExpressionLevel1__Group__0 )
            // InternalDsl.g:484:4: rule__BooleanExpressionLevel1__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionLevel1__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionLevel1Access().getGroup()); 
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
    // $ANTLR end "ruleBooleanExpressionLevel1"


    // $ANTLR start "entryRuleBooleanExpressionLevel2"
    // InternalDsl.g:493:1: entryRuleBooleanExpressionLevel2 : ruleBooleanExpressionLevel2 EOF ;
    public final void entryRuleBooleanExpressionLevel2() throws RecognitionException {
        try {
            // InternalDsl.g:494:1: ( ruleBooleanExpressionLevel2 EOF )
            // InternalDsl.g:495:1: ruleBooleanExpressionLevel2 EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionLevel2Rule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBooleanExpressionLevel2();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionLevel2Rule()); 
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
    // $ANTLR end "entryRuleBooleanExpressionLevel2"


    // $ANTLR start "ruleBooleanExpressionLevel2"
    // InternalDsl.g:502:1: ruleBooleanExpressionLevel2 : ( ( rule__BooleanExpressionLevel2__Alternatives ) ) ;
    public final void ruleBooleanExpressionLevel2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:506:2: ( ( ( rule__BooleanExpressionLevel2__Alternatives ) ) )
            // InternalDsl.g:507:2: ( ( rule__BooleanExpressionLevel2__Alternatives ) )
            {
            // InternalDsl.g:507:2: ( ( rule__BooleanExpressionLevel2__Alternatives ) )
            // InternalDsl.g:508:3: ( rule__BooleanExpressionLevel2__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionLevel2Access().getAlternatives()); 
            }
            // InternalDsl.g:509:3: ( rule__BooleanExpressionLevel2__Alternatives )
            // InternalDsl.g:509:4: rule__BooleanExpressionLevel2__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionLevel2__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionLevel2Access().getAlternatives()); 
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
    // $ANTLR end "ruleBooleanExpressionLevel2"


    // $ANTLR start "entryRuleNotExpression"
    // InternalDsl.g:518:1: entryRuleNotExpression : ruleNotExpression EOF ;
    public final void entryRuleNotExpression() throws RecognitionException {
        try {
            // InternalDsl.g:519:1: ( ruleNotExpression EOF )
            // InternalDsl.g:520:1: ruleNotExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNotExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotExpressionRule()); 
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
    // $ANTLR end "entryRuleNotExpression"


    // $ANTLR start "ruleNotExpression"
    // InternalDsl.g:527:1: ruleNotExpression : ( ( rule__NotExpression__Group__0 ) ) ;
    public final void ruleNotExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:531:2: ( ( ( rule__NotExpression__Group__0 ) ) )
            // InternalDsl.g:532:2: ( ( rule__NotExpression__Group__0 ) )
            {
            // InternalDsl.g:532:2: ( ( rule__NotExpression__Group__0 ) )
            // InternalDsl.g:533:3: ( rule__NotExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getGroup()); 
            }
            // InternalDsl.g:534:3: ( rule__NotExpression__Group__0 )
            // InternalDsl.g:534:4: rule__NotExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NotExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleNotExpression"


    // $ANTLR start "entryRuleBooleanExpressionLevel3"
    // InternalDsl.g:543:1: entryRuleBooleanExpressionLevel3 : ruleBooleanExpressionLevel3 EOF ;
    public final void entryRuleBooleanExpressionLevel3() throws RecognitionException {
        try {
            // InternalDsl.g:544:1: ( ruleBooleanExpressionLevel3 EOF )
            // InternalDsl.g:545:1: ruleBooleanExpressionLevel3 EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionLevel3Rule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBooleanExpressionLevel3();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionLevel3Rule()); 
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
    // $ANTLR end "entryRuleBooleanExpressionLevel3"


    // $ANTLR start "ruleBooleanExpressionLevel3"
    // InternalDsl.g:552:1: ruleBooleanExpressionLevel3 : ( ( rule__BooleanExpressionLevel3__Alternatives ) ) ;
    public final void ruleBooleanExpressionLevel3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:556:2: ( ( ( rule__BooleanExpressionLevel3__Alternatives ) ) )
            // InternalDsl.g:557:2: ( ( rule__BooleanExpressionLevel3__Alternatives ) )
            {
            // InternalDsl.g:557:2: ( ( rule__BooleanExpressionLevel3__Alternatives ) )
            // InternalDsl.g:558:3: ( rule__BooleanExpressionLevel3__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionLevel3Access().getAlternatives()); 
            }
            // InternalDsl.g:559:3: ( rule__BooleanExpressionLevel3__Alternatives )
            // InternalDsl.g:559:4: rule__BooleanExpressionLevel3__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionLevel3__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionLevel3Access().getAlternatives()); 
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
    // $ANTLR end "ruleBooleanExpressionLevel3"


    // $ANTLR start "entryRuleComparisonExpression"
    // InternalDsl.g:568:1: entryRuleComparisonExpression : ruleComparisonExpression EOF ;
    public final void entryRuleComparisonExpression() throws RecognitionException {
        try {
            // InternalDsl.g:569:1: ( ruleComparisonExpression EOF )
            // InternalDsl.g:570:1: ruleComparisonExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleComparisonExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonExpressionRule()); 
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
    // $ANTLR end "entryRuleComparisonExpression"


    // $ANTLR start "ruleComparisonExpression"
    // InternalDsl.g:577:1: ruleComparisonExpression : ( ( rule__ComparisonExpression__Group__0 ) ) ;
    public final void ruleComparisonExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:581:2: ( ( ( rule__ComparisonExpression__Group__0 ) ) )
            // InternalDsl.g:582:2: ( ( rule__ComparisonExpression__Group__0 ) )
            {
            // InternalDsl.g:582:2: ( ( rule__ComparisonExpression__Group__0 ) )
            // InternalDsl.g:583:3: ( rule__ComparisonExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonExpressionAccess().getGroup()); 
            }
            // InternalDsl.g:584:3: ( rule__ComparisonExpression__Group__0 )
            // InternalDsl.g:584:4: rule__ComparisonExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonExpressionAccess().getGroup()); 
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
    // $ANTLR end "ruleComparisonExpression"


    // $ANTLR start "entryRuleBooleanExpressionBracket"
    // InternalDsl.g:593:1: entryRuleBooleanExpressionBracket : ruleBooleanExpressionBracket EOF ;
    public final void entryRuleBooleanExpressionBracket() throws RecognitionException {
        try {
            // InternalDsl.g:594:1: ( ruleBooleanExpressionBracket EOF )
            // InternalDsl.g:595:1: ruleBooleanExpressionBracket EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionBracketRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBooleanExpressionBracket();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionBracketRule()); 
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
    // $ANTLR end "entryRuleBooleanExpressionBracket"


    // $ANTLR start "ruleBooleanExpressionBracket"
    // InternalDsl.g:602:1: ruleBooleanExpressionBracket : ( ( rule__BooleanExpressionBracket__Group__0 ) ) ;
    public final void ruleBooleanExpressionBracket() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:606:2: ( ( ( rule__BooleanExpressionBracket__Group__0 ) ) )
            // InternalDsl.g:607:2: ( ( rule__BooleanExpressionBracket__Group__0 ) )
            {
            // InternalDsl.g:607:2: ( ( rule__BooleanExpressionBracket__Group__0 ) )
            // InternalDsl.g:608:3: ( rule__BooleanExpressionBracket__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionBracketAccess().getGroup()); 
            }
            // InternalDsl.g:609:3: ( rule__BooleanExpressionBracket__Group__0 )
            // InternalDsl.g:609:4: rule__BooleanExpressionBracket__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionBracket__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionBracketAccess().getGroup()); 
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
    // $ANTLR end "ruleBooleanExpressionBracket"


    // $ANTLR start "entryRuleBooleanExpressionConstant"
    // InternalDsl.g:618:1: entryRuleBooleanExpressionConstant : ruleBooleanExpressionConstant EOF ;
    public final void entryRuleBooleanExpressionConstant() throws RecognitionException {
        try {
            // InternalDsl.g:619:1: ( ruleBooleanExpressionConstant EOF )
            // InternalDsl.g:620:1: ruleBooleanExpressionConstant EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionConstantRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBooleanExpressionConstant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionConstantRule()); 
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
    // $ANTLR end "entryRuleBooleanExpressionConstant"


    // $ANTLR start "ruleBooleanExpressionConstant"
    // InternalDsl.g:627:1: ruleBooleanExpressionConstant : ( ( rule__BooleanExpressionConstant__ValueAssignment ) ) ;
    public final void ruleBooleanExpressionConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:631:2: ( ( ( rule__BooleanExpressionConstant__ValueAssignment ) ) )
            // InternalDsl.g:632:2: ( ( rule__BooleanExpressionConstant__ValueAssignment ) )
            {
            // InternalDsl.g:632:2: ( ( rule__BooleanExpressionConstant__ValueAssignment ) )
            // InternalDsl.g:633:3: ( rule__BooleanExpressionConstant__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionConstantAccess().getValueAssignment()); 
            }
            // InternalDsl.g:634:3: ( rule__BooleanExpressionConstant__ValueAssignment )
            // InternalDsl.g:634:4: rule__BooleanExpressionConstant__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionConstant__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionConstantAccess().getValueAssignment()); 
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
    // $ANTLR end "ruleBooleanExpressionConstant"


    // $ANTLR start "ruleMeasurementUnit"
    // InternalDsl.g:643:1: ruleMeasurementUnit : ( ( rule__MeasurementUnit__Alternatives ) ) ;
    public final void ruleMeasurementUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:647:1: ( ( ( rule__MeasurementUnit__Alternatives ) ) )
            // InternalDsl.g:648:2: ( ( rule__MeasurementUnit__Alternatives ) )
            {
            // InternalDsl.g:648:2: ( ( rule__MeasurementUnit__Alternatives ) )
            // InternalDsl.g:649:3: ( rule__MeasurementUnit__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMeasurementUnitAccess().getAlternatives()); 
            }
            // InternalDsl.g:650:3: ( rule__MeasurementUnit__Alternatives )
            // InternalDsl.g:650:4: rule__MeasurementUnit__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MeasurementUnit__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMeasurementUnitAccess().getAlternatives()); 
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
    // $ANTLR end "ruleMeasurementUnit"


    // $ANTLR start "ruleBehaviorTypes"
    // InternalDsl.g:659:1: ruleBehaviorTypes : ( ( 'drive' ) ) ;
    public final void ruleBehaviorTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:663:1: ( ( ( 'drive' ) ) )
            // InternalDsl.g:664:2: ( ( 'drive' ) )
            {
            // InternalDsl.g:664:2: ( ( 'drive' ) )
            // InternalDsl.g:665:3: ( 'drive' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBehaviorTypesAccess().getDRIVEEnumLiteralDeclaration()); 
            }
            // InternalDsl.g:666:3: ( 'drive' )
            // InternalDsl.g:666:4: 'drive'
            {
            match(input,12,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBehaviorTypesAccess().getDRIVEEnumLiteralDeclaration()); 
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
    // $ANTLR end "ruleBehaviorTypes"


    // $ANTLR start "ruleMeasurables"
    // InternalDsl.g:675:1: ruleMeasurables : ( ( rule__Measurables__Alternatives ) ) ;
    public final void ruleMeasurables() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:679:1: ( ( ( rule__Measurables__Alternatives ) ) )
            // InternalDsl.g:680:2: ( ( rule__Measurables__Alternatives ) )
            {
            // InternalDsl.g:680:2: ( ( rule__Measurables__Alternatives ) )
            // InternalDsl.g:681:3: ( rule__Measurables__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMeasurablesAccess().getAlternatives()); 
            }
            // InternalDsl.g:682:3: ( rule__Measurables__Alternatives )
            // InternalDsl.g:682:4: rule__Measurables__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Measurables__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMeasurablesAccess().getAlternatives()); 
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
    // $ANTLR end "ruleMeasurables"


    // $ANTLR start "ruleActions"
    // InternalDsl.g:691:1: ruleActions : ( ( rule__Actions__Alternatives ) ) ;
    public final void ruleActions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:695:1: ( ( ( rule__Actions__Alternatives ) ) )
            // InternalDsl.g:696:2: ( ( rule__Actions__Alternatives ) )
            {
            // InternalDsl.g:696:2: ( ( rule__Actions__Alternatives ) )
            // InternalDsl.g:697:3: ( rule__Actions__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionsAccess().getAlternatives()); 
            }
            // InternalDsl.g:698:3: ( rule__Actions__Alternatives )
            // InternalDsl.g:698:4: rule__Actions__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Actions__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionsAccess().getAlternatives()); 
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
    // $ANTLR end "ruleActions"


    // $ANTLR start "ruleBinaryBooleanOperator"
    // InternalDsl.g:707:1: ruleBinaryBooleanOperator : ( ( rule__BinaryBooleanOperator__Alternatives ) ) ;
    public final void ruleBinaryBooleanOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:711:1: ( ( ( rule__BinaryBooleanOperator__Alternatives ) ) )
            // InternalDsl.g:712:2: ( ( rule__BinaryBooleanOperator__Alternatives ) )
            {
            // InternalDsl.g:712:2: ( ( rule__BinaryBooleanOperator__Alternatives ) )
            // InternalDsl.g:713:3: ( rule__BinaryBooleanOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryBooleanOperatorAccess().getAlternatives()); 
            }
            // InternalDsl.g:714:3: ( rule__BinaryBooleanOperator__Alternatives )
            // InternalDsl.g:714:4: rule__BinaryBooleanOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BinaryBooleanOperator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryBooleanOperatorAccess().getAlternatives()); 
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
    // $ANTLR end "ruleBinaryBooleanOperator"


    // $ANTLR start "ruleCompareOperator"
    // InternalDsl.g:723:1: ruleCompareOperator : ( ( rule__CompareOperator__Alternatives ) ) ;
    public final void ruleCompareOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:727:1: ( ( ( rule__CompareOperator__Alternatives ) ) )
            // InternalDsl.g:728:2: ( ( rule__CompareOperator__Alternatives ) )
            {
            // InternalDsl.g:728:2: ( ( rule__CompareOperator__Alternatives ) )
            // InternalDsl.g:729:3: ( rule__CompareOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperatorAccess().getAlternatives()); 
            }
            // InternalDsl.g:730:3: ( rule__CompareOperator__Alternatives )
            // InternalDsl.g:730:4: rule__CompareOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CompareOperator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareOperatorAccess().getAlternatives()); 
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
    // $ANTLR end "ruleCompareOperator"


    // $ANTLR start "rule__TakeControl__Alternatives"
    // InternalDsl.g:738:1: rule__TakeControl__Alternatives : ( ( ( rule__TakeControl__TakecontrolAssignment_0 ) ) | ( ruleMeasurableConditions ) );
    public final void rule__TakeControl__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:742:1: ( ( ( rule__TakeControl__TakecontrolAssignment_0 ) ) | ( ruleMeasurableConditions ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_INT||LA3_0==RULE_BOOL_LITERAL||(LA3_0>=38 && LA3_0<=39)||LA3_0==46||LA3_0==48) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=16 && LA3_0<=19)) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDsl.g:743:2: ( ( rule__TakeControl__TakecontrolAssignment_0 ) )
                    {
                    // InternalDsl.g:743:2: ( ( rule__TakeControl__TakecontrolAssignment_0 ) )
                    // InternalDsl.g:744:3: ( rule__TakeControl__TakecontrolAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTakeControlAccess().getTakecontrolAssignment_0()); 
                    }
                    // InternalDsl.g:745:3: ( rule__TakeControl__TakecontrolAssignment_0 )
                    // InternalDsl.g:745:4: rule__TakeControl__TakecontrolAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TakeControl__TakecontrolAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTakeControlAccess().getTakecontrolAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:749:2: ( ruleMeasurableConditions )
                    {
                    // InternalDsl.g:749:2: ( ruleMeasurableConditions )
                    // InternalDsl.g:750:3: ruleMeasurableConditions
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTakeControlAccess().getMeasurableConditionsParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleMeasurableConditions();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTakeControlAccess().getMeasurableConditionsParserRuleCall_1()); 
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
    // $ANTLR end "rule__TakeControl__Alternatives"


    // $ANTLR start "rule__ExpressionLevel1__Alternatives_1"
    // InternalDsl.g:759:1: rule__ExpressionLevel1__Alternatives_1 : ( ( ( rule__ExpressionLevel1__Group_1_0__0 ) ) | ( ( rule__ExpressionLevel1__Group_1_1__0 ) ) );
    public final void rule__ExpressionLevel1__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:763:1: ( ( ( rule__ExpressionLevel1__Group_1_0__0 ) ) | ( ( rule__ExpressionLevel1__Group_1_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==38) ) {
                alt4=1;
            }
            else if ( (LA4_0==39) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDsl.g:764:2: ( ( rule__ExpressionLevel1__Group_1_0__0 ) )
                    {
                    // InternalDsl.g:764:2: ( ( rule__ExpressionLevel1__Group_1_0__0 ) )
                    // InternalDsl.g:765:3: ( rule__ExpressionLevel1__Group_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionLevel1Access().getGroup_1_0()); 
                    }
                    // InternalDsl.g:766:3: ( rule__ExpressionLevel1__Group_1_0__0 )
                    // InternalDsl.g:766:4: rule__ExpressionLevel1__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionLevel1__Group_1_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionLevel1Access().getGroup_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:770:2: ( ( rule__ExpressionLevel1__Group_1_1__0 ) )
                    {
                    // InternalDsl.g:770:2: ( ( rule__ExpressionLevel1__Group_1_1__0 ) )
                    // InternalDsl.g:771:3: ( rule__ExpressionLevel1__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionLevel1Access().getGroup_1_1()); 
                    }
                    // InternalDsl.g:772:3: ( rule__ExpressionLevel1__Group_1_1__0 )
                    // InternalDsl.g:772:4: rule__ExpressionLevel1__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionLevel1__Group_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionLevel1Access().getGroup_1_1()); 
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
    // $ANTLR end "rule__ExpressionLevel1__Alternatives_1"


    // $ANTLR start "rule__ExpressionLevel2__Alternatives_1"
    // InternalDsl.g:780:1: rule__ExpressionLevel2__Alternatives_1 : ( ( ( rule__ExpressionLevel2__Group_1_0__0 ) ) | ( ( rule__ExpressionLevel2__Group_1_1__0 ) ) | ( ( rule__ExpressionLevel2__Group_1_2__0 ) ) | ( ( rule__ExpressionLevel2__Group_1_3__0 ) ) | ( ( rule__ExpressionLevel2__Group_1_4__0 ) ) );
    public final void rule__ExpressionLevel2__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:784:1: ( ( ( rule__ExpressionLevel2__Group_1_0__0 ) ) | ( ( rule__ExpressionLevel2__Group_1_1__0 ) ) | ( ( rule__ExpressionLevel2__Group_1_2__0 ) ) | ( ( rule__ExpressionLevel2__Group_1_3__0 ) ) | ( ( rule__ExpressionLevel2__Group_1_4__0 ) ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt5=1;
                }
                break;
            case 41:
                {
                alt5=2;
                }
                break;
            case 42:
                {
                alt5=3;
                }
                break;
            case 43:
                {
                alt5=4;
                }
                break;
            case 44:
                {
                alt5=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalDsl.g:785:2: ( ( rule__ExpressionLevel2__Group_1_0__0 ) )
                    {
                    // InternalDsl.g:785:2: ( ( rule__ExpressionLevel2__Group_1_0__0 ) )
                    // InternalDsl.g:786:3: ( rule__ExpressionLevel2__Group_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionLevel2Access().getGroup_1_0()); 
                    }
                    // InternalDsl.g:787:3: ( rule__ExpressionLevel2__Group_1_0__0 )
                    // InternalDsl.g:787:4: rule__ExpressionLevel2__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionLevel2__Group_1_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionLevel2Access().getGroup_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:791:2: ( ( rule__ExpressionLevel2__Group_1_1__0 ) )
                    {
                    // InternalDsl.g:791:2: ( ( rule__ExpressionLevel2__Group_1_1__0 ) )
                    // InternalDsl.g:792:3: ( rule__ExpressionLevel2__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionLevel2Access().getGroup_1_1()); 
                    }
                    // InternalDsl.g:793:3: ( rule__ExpressionLevel2__Group_1_1__0 )
                    // InternalDsl.g:793:4: rule__ExpressionLevel2__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionLevel2__Group_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionLevel2Access().getGroup_1_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:797:2: ( ( rule__ExpressionLevel2__Group_1_2__0 ) )
                    {
                    // InternalDsl.g:797:2: ( ( rule__ExpressionLevel2__Group_1_2__0 ) )
                    // InternalDsl.g:798:3: ( rule__ExpressionLevel2__Group_1_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionLevel2Access().getGroup_1_2()); 
                    }
                    // InternalDsl.g:799:3: ( rule__ExpressionLevel2__Group_1_2__0 )
                    // InternalDsl.g:799:4: rule__ExpressionLevel2__Group_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionLevel2__Group_1_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionLevel2Access().getGroup_1_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:803:2: ( ( rule__ExpressionLevel2__Group_1_3__0 ) )
                    {
                    // InternalDsl.g:803:2: ( ( rule__ExpressionLevel2__Group_1_3__0 ) )
                    // InternalDsl.g:804:3: ( rule__ExpressionLevel2__Group_1_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionLevel2Access().getGroup_1_3()); 
                    }
                    // InternalDsl.g:805:3: ( rule__ExpressionLevel2__Group_1_3__0 )
                    // InternalDsl.g:805:4: rule__ExpressionLevel2__Group_1_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionLevel2__Group_1_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionLevel2Access().getGroup_1_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:809:2: ( ( rule__ExpressionLevel2__Group_1_4__0 ) )
                    {
                    // InternalDsl.g:809:2: ( ( rule__ExpressionLevel2__Group_1_4__0 ) )
                    // InternalDsl.g:810:3: ( rule__ExpressionLevel2__Group_1_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionLevel2Access().getGroup_1_4()); 
                    }
                    // InternalDsl.g:811:3: ( rule__ExpressionLevel2__Group_1_4__0 )
                    // InternalDsl.g:811:4: rule__ExpressionLevel2__Group_1_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionLevel2__Group_1_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionLevel2Access().getGroup_1_4()); 
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
    // $ANTLR end "rule__ExpressionLevel2__Alternatives_1"


    // $ANTLR start "rule__ExpressionLevel4__Alternatives"
    // InternalDsl.g:819:1: rule__ExpressionLevel4__Alternatives : ( ( ruleExpressionMinus ) | ( ruleExpressionPlus ) | ( ruleExpressionLevel5 ) );
    public final void rule__ExpressionLevel4__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:823:1: ( ( ruleExpressionMinus ) | ( ruleExpressionPlus ) | ( ruleExpressionLevel5 ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt6=1;
                }
                break;
            case 38:
                {
                alt6=2;
                }
                break;
            case RULE_INT:
            case 46:
                {
                alt6=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalDsl.g:824:2: ( ruleExpressionMinus )
                    {
                    // InternalDsl.g:824:2: ( ruleExpressionMinus )
                    // InternalDsl.g:825:3: ruleExpressionMinus
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionLevel4Access().getExpressionMinusParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleExpressionMinus();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionLevel4Access().getExpressionMinusParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:830:2: ( ruleExpressionPlus )
                    {
                    // InternalDsl.g:830:2: ( ruleExpressionPlus )
                    // InternalDsl.g:831:3: ruleExpressionPlus
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionLevel4Access().getExpressionPlusParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleExpressionPlus();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionLevel4Access().getExpressionPlusParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:836:2: ( ruleExpressionLevel5 )
                    {
                    // InternalDsl.g:836:2: ( ruleExpressionLevel5 )
                    // InternalDsl.g:837:3: ruleExpressionLevel5
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionLevel4Access().getExpressionLevel5ParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleExpressionLevel5();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionLevel4Access().getExpressionLevel5ParserRuleCall_2()); 
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
    // $ANTLR end "rule__ExpressionLevel4__Alternatives"


    // $ANTLR start "rule__ExpressionLevel5__Alternatives"
    // InternalDsl.g:846:1: rule__ExpressionLevel5__Alternatives : ( ( ruleExpressionBracket ) | ( ruleExpressionConstantInt ) );
    public final void rule__ExpressionLevel5__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:850:1: ( ( ruleExpressionBracket ) | ( ruleExpressionConstantInt ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==46) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_INT) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalDsl.g:851:2: ( ruleExpressionBracket )
                    {
                    // InternalDsl.g:851:2: ( ruleExpressionBracket )
                    // InternalDsl.g:852:3: ruleExpressionBracket
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionLevel5Access().getExpressionBracketParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleExpressionBracket();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionLevel5Access().getExpressionBracketParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:857:2: ( ruleExpressionConstantInt )
                    {
                    // InternalDsl.g:857:2: ( ruleExpressionConstantInt )
                    // InternalDsl.g:858:3: ruleExpressionConstantInt
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionLevel5Access().getExpressionConstantIntParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleExpressionConstantInt();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionLevel5Access().getExpressionConstantIntParserRuleCall_1()); 
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
    // $ANTLR end "rule__ExpressionLevel5__Alternatives"


    // $ANTLR start "rule__BooleanExpressionLevel2__Alternatives"
    // InternalDsl.g:867:1: rule__BooleanExpressionLevel2__Alternatives : ( ( ruleNotExpression ) | ( ruleBooleanExpressionLevel3 ) );
    public final void rule__BooleanExpressionLevel2__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:871:1: ( ( ruleNotExpression ) | ( ruleBooleanExpressionLevel3 ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==48) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_INT||LA8_0==RULE_BOOL_LITERAL||(LA8_0>=38 && LA8_0<=39)||LA8_0==46) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalDsl.g:872:2: ( ruleNotExpression )
                    {
                    // InternalDsl.g:872:2: ( ruleNotExpression )
                    // InternalDsl.g:873:3: ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanExpressionLevel2Access().getNotExpressionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleNotExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanExpressionLevel2Access().getNotExpressionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:878:2: ( ruleBooleanExpressionLevel3 )
                    {
                    // InternalDsl.g:878:2: ( ruleBooleanExpressionLevel3 )
                    // InternalDsl.g:879:3: ruleBooleanExpressionLevel3
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanExpressionLevel2Access().getBooleanExpressionLevel3ParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBooleanExpressionLevel3();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanExpressionLevel2Access().getBooleanExpressionLevel3ParserRuleCall_1()); 
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
    // $ANTLR end "rule__BooleanExpressionLevel2__Alternatives"


    // $ANTLR start "rule__BooleanExpressionLevel3__Alternatives"
    // InternalDsl.g:888:1: rule__BooleanExpressionLevel3__Alternatives : ( ( ( ruleComparisonExpression ) ) | ( ruleBooleanExpressionBracket ) | ( ruleBooleanExpressionConstant ) );
    public final void rule__BooleanExpressionLevel3__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:892:1: ( ( ( ruleComparisonExpression ) ) | ( ruleBooleanExpressionBracket ) | ( ruleBooleanExpressionConstant ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case 38:
            case 39:
                {
                alt9=1;
                }
                break;
            case 46:
                {
                int LA9_3 = input.LA(2);

                if ( (synpred13_InternalDsl()) ) {
                    alt9=1;
                }
                else if ( (synpred14_InternalDsl()) ) {
                    alt9=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_BOOL_LITERAL:
                {
                alt9=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalDsl.g:893:2: ( ( ruleComparisonExpression ) )
                    {
                    // InternalDsl.g:893:2: ( ( ruleComparisonExpression ) )
                    // InternalDsl.g:894:3: ( ruleComparisonExpression )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanExpressionLevel3Access().getComparisonExpressionParserRuleCall_0()); 
                    }
                    // InternalDsl.g:895:3: ( ruleComparisonExpression )
                    // InternalDsl.g:895:4: ruleComparisonExpression
                    {
                    pushFollow(FOLLOW_2);
                    ruleComparisonExpression();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanExpressionLevel3Access().getComparisonExpressionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:899:2: ( ruleBooleanExpressionBracket )
                    {
                    // InternalDsl.g:899:2: ( ruleBooleanExpressionBracket )
                    // InternalDsl.g:900:3: ruleBooleanExpressionBracket
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanExpressionLevel3Access().getBooleanExpressionBracketParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBooleanExpressionBracket();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanExpressionLevel3Access().getBooleanExpressionBracketParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:905:2: ( ruleBooleanExpressionConstant )
                    {
                    // InternalDsl.g:905:2: ( ruleBooleanExpressionConstant )
                    // InternalDsl.g:906:3: ruleBooleanExpressionConstant
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanExpressionLevel3Access().getBooleanExpressionConstantParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBooleanExpressionConstant();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanExpressionLevel3Access().getBooleanExpressionConstantParserRuleCall_2()); 
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
    // $ANTLR end "rule__BooleanExpressionLevel3__Alternatives"


    // $ANTLR start "rule__MeasurementUnit__Alternatives"
    // InternalDsl.g:915:1: rule__MeasurementUnit__Alternatives : ( ( ( 'distance' ) ) | ( ( 'color' ) ) | ( ( 'int' ) ) );
    public final void rule__MeasurementUnit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:919:1: ( ( ( 'distance' ) ) | ( ( 'color' ) ) | ( ( 'int' ) ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt10=1;
                }
                break;
            case 14:
                {
                alt10=2;
                }
                break;
            case 15:
                {
                alt10=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalDsl.g:920:2: ( ( 'distance' ) )
                    {
                    // InternalDsl.g:920:2: ( ( 'distance' ) )
                    // InternalDsl.g:921:3: ( 'distance' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMeasurementUnitAccess().getDISTANCEEnumLiteralDeclaration_0()); 
                    }
                    // InternalDsl.g:922:3: ( 'distance' )
                    // InternalDsl.g:922:4: 'distance'
                    {
                    match(input,13,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMeasurementUnitAccess().getDISTANCEEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:926:2: ( ( 'color' ) )
                    {
                    // InternalDsl.g:926:2: ( ( 'color' ) )
                    // InternalDsl.g:927:3: ( 'color' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMeasurementUnitAccess().getCOLOREnumLiteralDeclaration_1()); 
                    }
                    // InternalDsl.g:928:3: ( 'color' )
                    // InternalDsl.g:928:4: 'color'
                    {
                    match(input,14,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMeasurementUnitAccess().getCOLOREnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:932:2: ( ( 'int' ) )
                    {
                    // InternalDsl.g:932:2: ( ( 'int' ) )
                    // InternalDsl.g:933:3: ( 'int' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMeasurementUnitAccess().getINTEnumLiteralDeclaration_2()); 
                    }
                    // InternalDsl.g:934:3: ( 'int' )
                    // InternalDsl.g:934:4: 'int'
                    {
                    match(input,15,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMeasurementUnitAccess().getINTEnumLiteralDeclaration_2()); 
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
    // $ANTLR end "rule__MeasurementUnit__Alternatives"


    // $ANTLR start "rule__Measurables__Alternatives"
    // InternalDsl.g:942:1: rule__Measurables__Alternatives : ( ( ( 'floorColor' ) ) | ( ( 'leftTouch' ) ) | ( ( 'rightTouch' ) ) | ( ( 'distanceObjectInFront' ) ) );
    public final void rule__Measurables__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:946:1: ( ( ( 'floorColor' ) ) | ( ( 'leftTouch' ) ) | ( ( 'rightTouch' ) ) | ( ( 'distanceObjectInFront' ) ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt11=1;
                }
                break;
            case 17:
                {
                alt11=2;
                }
                break;
            case 18:
                {
                alt11=3;
                }
                break;
            case 19:
                {
                alt11=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalDsl.g:947:2: ( ( 'floorColor' ) )
                    {
                    // InternalDsl.g:947:2: ( ( 'floorColor' ) )
                    // InternalDsl.g:948:3: ( 'floorColor' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMeasurablesAccess().getFLOOR_COLOREnumLiteralDeclaration_0()); 
                    }
                    // InternalDsl.g:949:3: ( 'floorColor' )
                    // InternalDsl.g:949:4: 'floorColor'
                    {
                    match(input,16,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMeasurablesAccess().getFLOOR_COLOREnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:953:2: ( ( 'leftTouch' ) )
                    {
                    // InternalDsl.g:953:2: ( ( 'leftTouch' ) )
                    // InternalDsl.g:954:3: ( 'leftTouch' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMeasurablesAccess().getLEFT_TOUCHEnumLiteralDeclaration_1()); 
                    }
                    // InternalDsl.g:955:3: ( 'leftTouch' )
                    // InternalDsl.g:955:4: 'leftTouch'
                    {
                    match(input,17,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMeasurablesAccess().getLEFT_TOUCHEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:959:2: ( ( 'rightTouch' ) )
                    {
                    // InternalDsl.g:959:2: ( ( 'rightTouch' ) )
                    // InternalDsl.g:960:3: ( 'rightTouch' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMeasurablesAccess().getRIGHT_TOUCHEnumLiteralDeclaration_2()); 
                    }
                    // InternalDsl.g:961:3: ( 'rightTouch' )
                    // InternalDsl.g:961:4: 'rightTouch'
                    {
                    match(input,18,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMeasurablesAccess().getRIGHT_TOUCHEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:965:2: ( ( 'distanceObjectInFront' ) )
                    {
                    // InternalDsl.g:965:2: ( ( 'distanceObjectInFront' ) )
                    // InternalDsl.g:966:3: ( 'distanceObjectInFront' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMeasurablesAccess().getDIST_TO_OBJECT_FRONTEnumLiteralDeclaration_3()); 
                    }
                    // InternalDsl.g:967:3: ( 'distanceObjectInFront' )
                    // InternalDsl.g:967:4: 'distanceObjectInFront'
                    {
                    match(input,19,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMeasurablesAccess().getDIST_TO_OBJECT_FRONTEnumLiteralDeclaration_3()); 
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
    // $ANTLR end "rule__Measurables__Alternatives"


    // $ANTLR start "rule__Actions__Alternatives"
    // InternalDsl.g:975:1: rule__Actions__Alternatives : ( ( ( 'rotateLeft' ) ) | ( ( 'rotateRight' ) ) | ( ( 'driveForward' ) ) | ( ( 'driveBackward' ) ) | ( ( 'stopDriving' ) ) );
    public final void rule__Actions__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:979:1: ( ( ( 'rotateLeft' ) ) | ( ( 'rotateRight' ) ) | ( ( 'driveForward' ) ) | ( ( 'driveBackward' ) ) | ( ( 'stopDriving' ) ) )
            int alt12=5;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt12=1;
                }
                break;
            case 21:
                {
                alt12=2;
                }
                break;
            case 22:
                {
                alt12=3;
                }
                break;
            case 23:
                {
                alt12=4;
                }
                break;
            case 24:
                {
                alt12=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalDsl.g:980:2: ( ( 'rotateLeft' ) )
                    {
                    // InternalDsl.g:980:2: ( ( 'rotateLeft' ) )
                    // InternalDsl.g:981:3: ( 'rotateLeft' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getActionsAccess().getROTATE_LEnumLiteralDeclaration_0()); 
                    }
                    // InternalDsl.g:982:3: ( 'rotateLeft' )
                    // InternalDsl.g:982:4: 'rotateLeft'
                    {
                    match(input,20,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getActionsAccess().getROTATE_LEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:986:2: ( ( 'rotateRight' ) )
                    {
                    // InternalDsl.g:986:2: ( ( 'rotateRight' ) )
                    // InternalDsl.g:987:3: ( 'rotateRight' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getActionsAccess().getROTATE_REnumLiteralDeclaration_1()); 
                    }
                    // InternalDsl.g:988:3: ( 'rotateRight' )
                    // InternalDsl.g:988:4: 'rotateRight'
                    {
                    match(input,21,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getActionsAccess().getROTATE_REnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:992:2: ( ( 'driveForward' ) )
                    {
                    // InternalDsl.g:992:2: ( ( 'driveForward' ) )
                    // InternalDsl.g:993:3: ( 'driveForward' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getActionsAccess().getDRIVE_FORWARDEnumLiteralDeclaration_2()); 
                    }
                    // InternalDsl.g:994:3: ( 'driveForward' )
                    // InternalDsl.g:994:4: 'driveForward'
                    {
                    match(input,22,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getActionsAccess().getDRIVE_FORWARDEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:998:2: ( ( 'driveBackward' ) )
                    {
                    // InternalDsl.g:998:2: ( ( 'driveBackward' ) )
                    // InternalDsl.g:999:3: ( 'driveBackward' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getActionsAccess().getDRIVE_BACKWARDEnumLiteralDeclaration_3()); 
                    }
                    // InternalDsl.g:1000:3: ( 'driveBackward' )
                    // InternalDsl.g:1000:4: 'driveBackward'
                    {
                    match(input,23,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getActionsAccess().getDRIVE_BACKWARDEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:1004:2: ( ( 'stopDriving' ) )
                    {
                    // InternalDsl.g:1004:2: ( ( 'stopDriving' ) )
                    // InternalDsl.g:1005:3: ( 'stopDriving' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getActionsAccess().getSTOP_DRIVINGEnumLiteralDeclaration_4()); 
                    }
                    // InternalDsl.g:1006:3: ( 'stopDriving' )
                    // InternalDsl.g:1006:4: 'stopDriving'
                    {
                    match(input,24,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getActionsAccess().getSTOP_DRIVINGEnumLiteralDeclaration_4()); 
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
    // $ANTLR end "rule__Actions__Alternatives"


    // $ANTLR start "rule__BinaryBooleanOperator__Alternatives"
    // InternalDsl.g:1014:1: rule__BinaryBooleanOperator__Alternatives : ( ( ( 'AND' ) ) | ( ( 'OR' ) ) );
    public final void rule__BinaryBooleanOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1018:1: ( ( ( 'AND' ) ) | ( ( 'OR' ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            else if ( (LA13_0==26) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalDsl.g:1019:2: ( ( 'AND' ) )
                    {
                    // InternalDsl.g:1019:2: ( ( 'AND' ) )
                    // InternalDsl.g:1020:3: ( 'AND' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryBooleanOperatorAccess().getANDEnumLiteralDeclaration_0()); 
                    }
                    // InternalDsl.g:1021:3: ( 'AND' )
                    // InternalDsl.g:1021:4: 'AND'
                    {
                    match(input,25,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryBooleanOperatorAccess().getANDEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1025:2: ( ( 'OR' ) )
                    {
                    // InternalDsl.g:1025:2: ( ( 'OR' ) )
                    // InternalDsl.g:1026:3: ( 'OR' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryBooleanOperatorAccess().getOREnumLiteralDeclaration_1()); 
                    }
                    // InternalDsl.g:1027:3: ( 'OR' )
                    // InternalDsl.g:1027:4: 'OR'
                    {
                    match(input,26,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryBooleanOperatorAccess().getOREnumLiteralDeclaration_1()); 
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
    // $ANTLR end "rule__BinaryBooleanOperator__Alternatives"


    // $ANTLR start "rule__CompareOperator__Alternatives"
    // InternalDsl.g:1035:1: rule__CompareOperator__Alternatives : ( ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '>=' ) ) | ( ( '>' ) ) | ( ( '<=' ) ) | ( ( '<' ) ) );
    public final void rule__CompareOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1039:1: ( ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '>=' ) ) | ( ( '>' ) ) | ( ( '<=' ) ) | ( ( '<' ) ) )
            int alt14=6;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt14=1;
                }
                break;
            case 28:
                {
                alt14=2;
                }
                break;
            case 29:
                {
                alt14=3;
                }
                break;
            case 30:
                {
                alt14=4;
                }
                break;
            case 31:
                {
                alt14=5;
                }
                break;
            case 32:
                {
                alt14=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalDsl.g:1040:2: ( ( '==' ) )
                    {
                    // InternalDsl.g:1040:2: ( ( '==' ) )
                    // InternalDsl.g:1041:3: ( '==' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }
                    // InternalDsl.g:1042:3: ( '==' )
                    // InternalDsl.g:1042:4: '=='
                    {
                    match(input,27,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:1046:2: ( ( '!=' ) )
                    {
                    // InternalDsl.g:1046:2: ( ( '!=' ) )
                    // InternalDsl.g:1047:3: ( '!=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getNEQEnumLiteralDeclaration_1()); 
                    }
                    // InternalDsl.g:1048:3: ( '!=' )
                    // InternalDsl.g:1048:4: '!='
                    {
                    match(input,28,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getNEQEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:1052:2: ( ( '>=' ) )
                    {
                    // InternalDsl.g:1052:2: ( ( '>=' ) )
                    // InternalDsl.g:1053:3: ( '>=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_2()); 
                    }
                    // InternalDsl.g:1054:3: ( '>=' )
                    // InternalDsl.g:1054:4: '>='
                    {
                    match(input,29,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:1058:2: ( ( '>' ) )
                    {
                    // InternalDsl.g:1058:2: ( ( '>' ) )
                    // InternalDsl.g:1059:3: ( '>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGEnumLiteralDeclaration_3()); 
                    }
                    // InternalDsl.g:1060:3: ( '>' )
                    // InternalDsl.g:1060:4: '>'
                    {
                    match(input,30,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getGEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:1064:2: ( ( '<=' ) )
                    {
                    // InternalDsl.g:1064:2: ( ( '<=' ) )
                    // InternalDsl.g:1065:3: ( '<=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_4()); 
                    }
                    // InternalDsl.g:1066:3: ( '<=' )
                    // InternalDsl.g:1066:4: '<='
                    {
                    match(input,31,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalDsl.g:1070:2: ( ( '<' ) )
                    {
                    // InternalDsl.g:1070:2: ( ( '<' ) )
                    // InternalDsl.g:1071:3: ( '<' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLEnumLiteralDeclaration_5()); 
                    }
                    // InternalDsl.g:1072:3: ( '<' )
                    // InternalDsl.g:1072:4: '<'
                    {
                    match(input,32,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getLEnumLiteralDeclaration_5()); 
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
    // $ANTLR end "rule__CompareOperator__Alternatives"


    // $ANTLR start "rule__Behavior__Group__0"
    // InternalDsl.g:1080:1: rule__Behavior__Group__0 : rule__Behavior__Group__0__Impl rule__Behavior__Group__1 ;
    public final void rule__Behavior__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1084:1: ( rule__Behavior__Group__0__Impl rule__Behavior__Group__1 )
            // InternalDsl.g:1085:2: rule__Behavior__Group__0__Impl rule__Behavior__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Behavior__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Behavior__Group__1();

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
    // $ANTLR end "rule__Behavior__Group__0"


    // $ANTLR start "rule__Behavior__Group__0__Impl"
    // InternalDsl.g:1092:1: rule__Behavior__Group__0__Impl : ( 'Behavior:' ) ;
    public final void rule__Behavior__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1096:1: ( ( 'Behavior:' ) )
            // InternalDsl.g:1097:1: ( 'Behavior:' )
            {
            // InternalDsl.g:1097:1: ( 'Behavior:' )
            // InternalDsl.g:1098:2: 'Behavior:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBehaviorAccess().getBehaviorKeyword_0()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBehaviorAccess().getBehaviorKeyword_0()); 
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
    // $ANTLR end "rule__Behavior__Group__0__Impl"


    // $ANTLR start "rule__Behavior__Group__1"
    // InternalDsl.g:1107:1: rule__Behavior__Group__1 : rule__Behavior__Group__1__Impl rule__Behavior__Group__2 ;
    public final void rule__Behavior__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1111:1: ( rule__Behavior__Group__1__Impl rule__Behavior__Group__2 )
            // InternalDsl.g:1112:2: rule__Behavior__Group__1__Impl rule__Behavior__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Behavior__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Behavior__Group__2();

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
    // $ANTLR end "rule__Behavior__Group__1"


    // $ANTLR start "rule__Behavior__Group__1__Impl"
    // InternalDsl.g:1119:1: rule__Behavior__Group__1__Impl : ( ( rule__Behavior__NameAssignment_1 ) ) ;
    public final void rule__Behavior__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1123:1: ( ( ( rule__Behavior__NameAssignment_1 ) ) )
            // InternalDsl.g:1124:1: ( ( rule__Behavior__NameAssignment_1 ) )
            {
            // InternalDsl.g:1124:1: ( ( rule__Behavior__NameAssignment_1 ) )
            // InternalDsl.g:1125:2: ( rule__Behavior__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBehaviorAccess().getNameAssignment_1()); 
            }
            // InternalDsl.g:1126:2: ( rule__Behavior__NameAssignment_1 )
            // InternalDsl.g:1126:3: rule__Behavior__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Behavior__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBehaviorAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__Behavior__Group__1__Impl"


    // $ANTLR start "rule__Behavior__Group__2"
    // InternalDsl.g:1134:1: rule__Behavior__Group__2 : rule__Behavior__Group__2__Impl rule__Behavior__Group__3 ;
    public final void rule__Behavior__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1138:1: ( rule__Behavior__Group__2__Impl rule__Behavior__Group__3 )
            // InternalDsl.g:1139:2: rule__Behavior__Group__2__Impl rule__Behavior__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Behavior__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Behavior__Group__3();

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
    // $ANTLR end "rule__Behavior__Group__2"


    // $ANTLR start "rule__Behavior__Group__2__Impl"
    // InternalDsl.g:1146:1: rule__Behavior__Group__2__Impl : ( 'type:' ) ;
    public final void rule__Behavior__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1150:1: ( ( 'type:' ) )
            // InternalDsl.g:1151:1: ( 'type:' )
            {
            // InternalDsl.g:1151:1: ( 'type:' )
            // InternalDsl.g:1152:2: 'type:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBehaviorAccess().getTypeKeyword_2()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBehaviorAccess().getTypeKeyword_2()); 
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
    // $ANTLR end "rule__Behavior__Group__2__Impl"


    // $ANTLR start "rule__Behavior__Group__3"
    // InternalDsl.g:1161:1: rule__Behavior__Group__3 : rule__Behavior__Group__3__Impl rule__Behavior__Group__4 ;
    public final void rule__Behavior__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1165:1: ( rule__Behavior__Group__3__Impl rule__Behavior__Group__4 )
            // InternalDsl.g:1166:2: rule__Behavior__Group__3__Impl rule__Behavior__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Behavior__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Behavior__Group__4();

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
    // $ANTLR end "rule__Behavior__Group__3"


    // $ANTLR start "rule__Behavior__Group__3__Impl"
    // InternalDsl.g:1173:1: rule__Behavior__Group__3__Impl : ( ( rule__Behavior__BehaviorTypeAssignment_3 )? ) ;
    public final void rule__Behavior__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1177:1: ( ( ( rule__Behavior__BehaviorTypeAssignment_3 )? ) )
            // InternalDsl.g:1178:1: ( ( rule__Behavior__BehaviorTypeAssignment_3 )? )
            {
            // InternalDsl.g:1178:1: ( ( rule__Behavior__BehaviorTypeAssignment_3 )? )
            // InternalDsl.g:1179:2: ( rule__Behavior__BehaviorTypeAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBehaviorAccess().getBehaviorTypeAssignment_3()); 
            }
            // InternalDsl.g:1180:2: ( rule__Behavior__BehaviorTypeAssignment_3 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==12) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDsl.g:1180:3: rule__Behavior__BehaviorTypeAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Behavior__BehaviorTypeAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBehaviorAccess().getBehaviorTypeAssignment_3()); 
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
    // $ANTLR end "rule__Behavior__Group__3__Impl"


    // $ANTLR start "rule__Behavior__Group__4"
    // InternalDsl.g:1188:1: rule__Behavior__Group__4 : rule__Behavior__Group__4__Impl rule__Behavior__Group__5 ;
    public final void rule__Behavior__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1192:1: ( rule__Behavior__Group__4__Impl rule__Behavior__Group__5 )
            // InternalDsl.g:1193:2: rule__Behavior__Group__4__Impl rule__Behavior__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Behavior__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Behavior__Group__5();

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
    // $ANTLR end "rule__Behavior__Group__4"


    // $ANTLR start "rule__Behavior__Group__4__Impl"
    // InternalDsl.g:1200:1: rule__Behavior__Group__4__Impl : ( 'priority:' ) ;
    public final void rule__Behavior__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1204:1: ( ( 'priority:' ) )
            // InternalDsl.g:1205:1: ( 'priority:' )
            {
            // InternalDsl.g:1205:1: ( 'priority:' )
            // InternalDsl.g:1206:2: 'priority:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBehaviorAccess().getPriorityKeyword_4()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBehaviorAccess().getPriorityKeyword_4()); 
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
    // $ANTLR end "rule__Behavior__Group__4__Impl"


    // $ANTLR start "rule__Behavior__Group__5"
    // InternalDsl.g:1215:1: rule__Behavior__Group__5 : rule__Behavior__Group__5__Impl rule__Behavior__Group__6 ;
    public final void rule__Behavior__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1219:1: ( rule__Behavior__Group__5__Impl rule__Behavior__Group__6 )
            // InternalDsl.g:1220:2: rule__Behavior__Group__5__Impl rule__Behavior__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Behavior__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Behavior__Group__6();

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
    // $ANTLR end "rule__Behavior__Group__5"


    // $ANTLR start "rule__Behavior__Group__5__Impl"
    // InternalDsl.g:1227:1: rule__Behavior__Group__5__Impl : ( ( rule__Behavior__PrioAssignment_5 )? ) ;
    public final void rule__Behavior__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1231:1: ( ( ( rule__Behavior__PrioAssignment_5 )? ) )
            // InternalDsl.g:1232:1: ( ( rule__Behavior__PrioAssignment_5 )? )
            {
            // InternalDsl.g:1232:1: ( ( rule__Behavior__PrioAssignment_5 )? )
            // InternalDsl.g:1233:2: ( rule__Behavior__PrioAssignment_5 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBehaviorAccess().getPrioAssignment_5()); 
            }
            // InternalDsl.g:1234:2: ( rule__Behavior__PrioAssignment_5 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_INT) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDsl.g:1234:3: rule__Behavior__PrioAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Behavior__PrioAssignment_5();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBehaviorAccess().getPrioAssignment_5()); 
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
    // $ANTLR end "rule__Behavior__Group__5__Impl"


    // $ANTLR start "rule__Behavior__Group__6"
    // InternalDsl.g:1242:1: rule__Behavior__Group__6 : rule__Behavior__Group__6__Impl rule__Behavior__Group__7 ;
    public final void rule__Behavior__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1246:1: ( rule__Behavior__Group__6__Impl rule__Behavior__Group__7 )
            // InternalDsl.g:1247:2: rule__Behavior__Group__6__Impl rule__Behavior__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__Behavior__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Behavior__Group__7();

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
    // $ANTLR end "rule__Behavior__Group__6"


    // $ANTLR start "rule__Behavior__Group__6__Impl"
    // InternalDsl.g:1254:1: rule__Behavior__Group__6__Impl : ( 'take-control:' ) ;
    public final void rule__Behavior__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1258:1: ( ( 'take-control:' ) )
            // InternalDsl.g:1259:1: ( 'take-control:' )
            {
            // InternalDsl.g:1259:1: ( 'take-control:' )
            // InternalDsl.g:1260:2: 'take-control:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBehaviorAccess().getTakeControlKeyword_6()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBehaviorAccess().getTakeControlKeyword_6()); 
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
    // $ANTLR end "rule__Behavior__Group__6__Impl"


    // $ANTLR start "rule__Behavior__Group__7"
    // InternalDsl.g:1269:1: rule__Behavior__Group__7 : rule__Behavior__Group__7__Impl rule__Behavior__Group__8 ;
    public final void rule__Behavior__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1273:1: ( rule__Behavior__Group__7__Impl rule__Behavior__Group__8 )
            // InternalDsl.g:1274:2: rule__Behavior__Group__7__Impl rule__Behavior__Group__8
            {
            pushFollow(FOLLOW_10);
            rule__Behavior__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Behavior__Group__8();

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
    // $ANTLR end "rule__Behavior__Group__7"


    // $ANTLR start "rule__Behavior__Group__7__Impl"
    // InternalDsl.g:1281:1: rule__Behavior__Group__7__Impl : ( ( rule__Behavior__ControlAssignment_7 ) ) ;
    public final void rule__Behavior__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1285:1: ( ( ( rule__Behavior__ControlAssignment_7 ) ) )
            // InternalDsl.g:1286:1: ( ( rule__Behavior__ControlAssignment_7 ) )
            {
            // InternalDsl.g:1286:1: ( ( rule__Behavior__ControlAssignment_7 ) )
            // InternalDsl.g:1287:2: ( rule__Behavior__ControlAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBehaviorAccess().getControlAssignment_7()); 
            }
            // InternalDsl.g:1288:2: ( rule__Behavior__ControlAssignment_7 )
            // InternalDsl.g:1288:3: rule__Behavior__ControlAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Behavior__ControlAssignment_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBehaviorAccess().getControlAssignment_7()); 
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
    // $ANTLR end "rule__Behavior__Group__7__Impl"


    // $ANTLR start "rule__Behavior__Group__8"
    // InternalDsl.g:1296:1: rule__Behavior__Group__8 : rule__Behavior__Group__8__Impl rule__Behavior__Group__9 ;
    public final void rule__Behavior__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1300:1: ( rule__Behavior__Group__8__Impl rule__Behavior__Group__9 )
            // InternalDsl.g:1301:2: rule__Behavior__Group__8__Impl rule__Behavior__Group__9
            {
            pushFollow(FOLLOW_11);
            rule__Behavior__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Behavior__Group__9();

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
    // $ANTLR end "rule__Behavior__Group__8"


    // $ANTLR start "rule__Behavior__Group__8__Impl"
    // InternalDsl.g:1308:1: rule__Behavior__Group__8__Impl : ( 'actions:' ) ;
    public final void rule__Behavior__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1312:1: ( ( 'actions:' ) )
            // InternalDsl.g:1313:1: ( 'actions:' )
            {
            // InternalDsl.g:1313:1: ( 'actions:' )
            // InternalDsl.g:1314:2: 'actions:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBehaviorAccess().getActionsKeyword_8()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBehaviorAccess().getActionsKeyword_8()); 
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
    // $ANTLR end "rule__Behavior__Group__8__Impl"


    // $ANTLR start "rule__Behavior__Group__9"
    // InternalDsl.g:1323:1: rule__Behavior__Group__9 : rule__Behavior__Group__9__Impl ;
    public final void rule__Behavior__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1327:1: ( rule__Behavior__Group__9__Impl )
            // InternalDsl.g:1328:2: rule__Behavior__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Behavior__Group__9__Impl();

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
    // $ANTLR end "rule__Behavior__Group__9"


    // $ANTLR start "rule__Behavior__Group__9__Impl"
    // InternalDsl.g:1334:1: rule__Behavior__Group__9__Impl : ( ( rule__Behavior__ActionsAssignment_9 ) ) ;
    public final void rule__Behavior__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1338:1: ( ( ( rule__Behavior__ActionsAssignment_9 ) ) )
            // InternalDsl.g:1339:1: ( ( rule__Behavior__ActionsAssignment_9 ) )
            {
            // InternalDsl.g:1339:1: ( ( rule__Behavior__ActionsAssignment_9 ) )
            // InternalDsl.g:1340:2: ( rule__Behavior__ActionsAssignment_9 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBehaviorAccess().getActionsAssignment_9()); 
            }
            // InternalDsl.g:1341:2: ( rule__Behavior__ActionsAssignment_9 )
            // InternalDsl.g:1341:3: rule__Behavior__ActionsAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Behavior__ActionsAssignment_9();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBehaviorAccess().getActionsAssignment_9()); 
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
    // $ANTLR end "rule__Behavior__Group__9__Impl"


    // $ANTLR start "rule__MeasurableCondition__Group__0"
    // InternalDsl.g:1350:1: rule__MeasurableCondition__Group__0 : rule__MeasurableCondition__Group__0__Impl rule__MeasurableCondition__Group__1 ;
    public final void rule__MeasurableCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1354:1: ( rule__MeasurableCondition__Group__0__Impl rule__MeasurableCondition__Group__1 )
            // InternalDsl.g:1355:2: rule__MeasurableCondition__Group__0__Impl rule__MeasurableCondition__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__MeasurableCondition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MeasurableCondition__Group__1();

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
    // $ANTLR end "rule__MeasurableCondition__Group__0"


    // $ANTLR start "rule__MeasurableCondition__Group__0__Impl"
    // InternalDsl.g:1362:1: rule__MeasurableCondition__Group__0__Impl : ( ( rule__MeasurableCondition__MeasurableAssignment_0 ) ) ;
    public final void rule__MeasurableCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1366:1: ( ( ( rule__MeasurableCondition__MeasurableAssignment_0 ) ) )
            // InternalDsl.g:1367:1: ( ( rule__MeasurableCondition__MeasurableAssignment_0 ) )
            {
            // InternalDsl.g:1367:1: ( ( rule__MeasurableCondition__MeasurableAssignment_0 ) )
            // InternalDsl.g:1368:2: ( rule__MeasurableCondition__MeasurableAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMeasurableConditionAccess().getMeasurableAssignment_0()); 
            }
            // InternalDsl.g:1369:2: ( rule__MeasurableCondition__MeasurableAssignment_0 )
            // InternalDsl.g:1369:3: rule__MeasurableCondition__MeasurableAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MeasurableCondition__MeasurableAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMeasurableConditionAccess().getMeasurableAssignment_0()); 
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
    // $ANTLR end "rule__MeasurableCondition__Group__0__Impl"


    // $ANTLR start "rule__MeasurableCondition__Group__1"
    // InternalDsl.g:1377:1: rule__MeasurableCondition__Group__1 : rule__MeasurableCondition__Group__1__Impl rule__MeasurableCondition__Group__2 ;
    public final void rule__MeasurableCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1381:1: ( rule__MeasurableCondition__Group__1__Impl rule__MeasurableCondition__Group__2 )
            // InternalDsl.g:1382:2: rule__MeasurableCondition__Group__1__Impl rule__MeasurableCondition__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__MeasurableCondition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MeasurableCondition__Group__2();

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
    // $ANTLR end "rule__MeasurableCondition__Group__1"


    // $ANTLR start "rule__MeasurableCondition__Group__1__Impl"
    // InternalDsl.g:1389:1: rule__MeasurableCondition__Group__1__Impl : ( ( rule__MeasurableCondition__UnitAssignment_1 ) ) ;
    public final void rule__MeasurableCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1393:1: ( ( ( rule__MeasurableCondition__UnitAssignment_1 ) ) )
            // InternalDsl.g:1394:1: ( ( rule__MeasurableCondition__UnitAssignment_1 ) )
            {
            // InternalDsl.g:1394:1: ( ( rule__MeasurableCondition__UnitAssignment_1 ) )
            // InternalDsl.g:1395:2: ( rule__MeasurableCondition__UnitAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMeasurableConditionAccess().getUnitAssignment_1()); 
            }
            // InternalDsl.g:1396:2: ( rule__MeasurableCondition__UnitAssignment_1 )
            // InternalDsl.g:1396:3: rule__MeasurableCondition__UnitAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MeasurableCondition__UnitAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMeasurableConditionAccess().getUnitAssignment_1()); 
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
    // $ANTLR end "rule__MeasurableCondition__Group__1__Impl"


    // $ANTLR start "rule__MeasurableCondition__Group__2"
    // InternalDsl.g:1404:1: rule__MeasurableCondition__Group__2 : rule__MeasurableCondition__Group__2__Impl rule__MeasurableCondition__Group__3 ;
    public final void rule__MeasurableCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1408:1: ( rule__MeasurableCondition__Group__2__Impl rule__MeasurableCondition__Group__3 )
            // InternalDsl.g:1409:2: rule__MeasurableCondition__Group__2__Impl rule__MeasurableCondition__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__MeasurableCondition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MeasurableCondition__Group__3();

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
    // $ANTLR end "rule__MeasurableCondition__Group__2"


    // $ANTLR start "rule__MeasurableCondition__Group__2__Impl"
    // InternalDsl.g:1416:1: rule__MeasurableCondition__Group__2__Impl : ( ( rule__MeasurableCondition__ValueAssignment_2 ) ) ;
    public final void rule__MeasurableCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1420:1: ( ( ( rule__MeasurableCondition__ValueAssignment_2 ) ) )
            // InternalDsl.g:1421:1: ( ( rule__MeasurableCondition__ValueAssignment_2 ) )
            {
            // InternalDsl.g:1421:1: ( ( rule__MeasurableCondition__ValueAssignment_2 ) )
            // InternalDsl.g:1422:2: ( rule__MeasurableCondition__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMeasurableConditionAccess().getValueAssignment_2()); 
            }
            // InternalDsl.g:1423:2: ( rule__MeasurableCondition__ValueAssignment_2 )
            // InternalDsl.g:1423:3: rule__MeasurableCondition__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MeasurableCondition__ValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMeasurableConditionAccess().getValueAssignment_2()); 
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
    // $ANTLR end "rule__MeasurableCondition__Group__2__Impl"


    // $ANTLR start "rule__MeasurableCondition__Group__3"
    // InternalDsl.g:1431:1: rule__MeasurableCondition__Group__3 : rule__MeasurableCondition__Group__3__Impl ;
    public final void rule__MeasurableCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1435:1: ( rule__MeasurableCondition__Group__3__Impl )
            // InternalDsl.g:1436:2: rule__MeasurableCondition__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MeasurableCondition__Group__3__Impl();

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
    // $ANTLR end "rule__MeasurableCondition__Group__3"


    // $ANTLR start "rule__MeasurableCondition__Group__3__Impl"
    // InternalDsl.g:1442:1: rule__MeasurableCondition__Group__3__Impl : ( ( rule__MeasurableCondition__OperatorAssignment_3 ) ) ;
    public final void rule__MeasurableCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1446:1: ( ( ( rule__MeasurableCondition__OperatorAssignment_3 ) ) )
            // InternalDsl.g:1447:1: ( ( rule__MeasurableCondition__OperatorAssignment_3 ) )
            {
            // InternalDsl.g:1447:1: ( ( rule__MeasurableCondition__OperatorAssignment_3 ) )
            // InternalDsl.g:1448:2: ( rule__MeasurableCondition__OperatorAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMeasurableConditionAccess().getOperatorAssignment_3()); 
            }
            // InternalDsl.g:1449:2: ( rule__MeasurableCondition__OperatorAssignment_3 )
            // InternalDsl.g:1449:3: rule__MeasurableCondition__OperatorAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MeasurableCondition__OperatorAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMeasurableConditionAccess().getOperatorAssignment_3()); 
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
    // $ANTLR end "rule__MeasurableCondition__Group__3__Impl"


    // $ANTLR start "rule__ExpressionLevel1__Group__0"
    // InternalDsl.g:1458:1: rule__ExpressionLevel1__Group__0 : rule__ExpressionLevel1__Group__0__Impl rule__ExpressionLevel1__Group__1 ;
    public final void rule__ExpressionLevel1__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1462:1: ( rule__ExpressionLevel1__Group__0__Impl rule__ExpressionLevel1__Group__1 )
            // InternalDsl.g:1463:2: rule__ExpressionLevel1__Group__0__Impl rule__ExpressionLevel1__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__ExpressionLevel1__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__Group__1();

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
    // $ANTLR end "rule__ExpressionLevel1__Group__0"


    // $ANTLR start "rule__ExpressionLevel1__Group__0__Impl"
    // InternalDsl.g:1470:1: rule__ExpressionLevel1__Group__0__Impl : ( ruleExpressionLevel2 ) ;
    public final void rule__ExpressionLevel1__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1474:1: ( ( ruleExpressionLevel2 ) )
            // InternalDsl.g:1475:1: ( ruleExpressionLevel2 )
            {
            // InternalDsl.g:1475:1: ( ruleExpressionLevel2 )
            // InternalDsl.g:1476:2: ruleExpressionLevel2
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel1Access().getExpressionLevel2ParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressionLevel2();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel1Access().getExpressionLevel2ParserRuleCall_0()); 
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
    // $ANTLR end "rule__ExpressionLevel1__Group__0__Impl"


    // $ANTLR start "rule__ExpressionLevel1__Group__1"
    // InternalDsl.g:1485:1: rule__ExpressionLevel1__Group__1 : rule__ExpressionLevel1__Group__1__Impl ;
    public final void rule__ExpressionLevel1__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1489:1: ( rule__ExpressionLevel1__Group__1__Impl )
            // InternalDsl.g:1490:2: rule__ExpressionLevel1__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__Group__1__Impl();

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
    // $ANTLR end "rule__ExpressionLevel1__Group__1"


    // $ANTLR start "rule__ExpressionLevel1__Group__1__Impl"
    // InternalDsl.g:1496:1: rule__ExpressionLevel1__Group__1__Impl : ( ( rule__ExpressionLevel1__Alternatives_1 )* ) ;
    public final void rule__ExpressionLevel1__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1500:1: ( ( ( rule__ExpressionLevel1__Alternatives_1 )* ) )
            // InternalDsl.g:1501:1: ( ( rule__ExpressionLevel1__Alternatives_1 )* )
            {
            // InternalDsl.g:1501:1: ( ( rule__ExpressionLevel1__Alternatives_1 )* )
            // InternalDsl.g:1502:2: ( rule__ExpressionLevel1__Alternatives_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel1Access().getAlternatives_1()); 
            }
            // InternalDsl.g:1503:2: ( rule__ExpressionLevel1__Alternatives_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=38 && LA17_0<=39)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalDsl.g:1503:3: rule__ExpressionLevel1__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__ExpressionLevel1__Alternatives_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel1Access().getAlternatives_1()); 
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
    // $ANTLR end "rule__ExpressionLevel1__Group__1__Impl"


    // $ANTLR start "rule__ExpressionLevel1__Group_1_0__0"
    // InternalDsl.g:1512:1: rule__ExpressionLevel1__Group_1_0__0 : rule__ExpressionLevel1__Group_1_0__0__Impl rule__ExpressionLevel1__Group_1_0__1 ;
    public final void rule__ExpressionLevel1__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1516:1: ( rule__ExpressionLevel1__Group_1_0__0__Impl rule__ExpressionLevel1__Group_1_0__1 )
            // InternalDsl.g:1517:2: rule__ExpressionLevel1__Group_1_0__0__Impl rule__ExpressionLevel1__Group_1_0__1
            {
            pushFollow(FOLLOW_17);
            rule__ExpressionLevel1__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__Group_1_0__1();

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
    // $ANTLR end "rule__ExpressionLevel1__Group_1_0__0"


    // $ANTLR start "rule__ExpressionLevel1__Group_1_0__0__Impl"
    // InternalDsl.g:1524:1: rule__ExpressionLevel1__Group_1_0__0__Impl : ( () ) ;
    public final void rule__ExpressionLevel1__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1528:1: ( ( () ) )
            // InternalDsl.g:1529:1: ( () )
            {
            // InternalDsl.g:1529:1: ( () )
            // InternalDsl.g:1530:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel1Access().getExpressionAdditionLeftAction_1_0_0()); 
            }
            // InternalDsl.g:1531:2: ()
            // InternalDsl.g:1531:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel1Access().getExpressionAdditionLeftAction_1_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel1__Group_1_0__0__Impl"


    // $ANTLR start "rule__ExpressionLevel1__Group_1_0__1"
    // InternalDsl.g:1539:1: rule__ExpressionLevel1__Group_1_0__1 : rule__ExpressionLevel1__Group_1_0__1__Impl rule__ExpressionLevel1__Group_1_0__2 ;
    public final void rule__ExpressionLevel1__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1543:1: ( rule__ExpressionLevel1__Group_1_0__1__Impl rule__ExpressionLevel1__Group_1_0__2 )
            // InternalDsl.g:1544:2: rule__ExpressionLevel1__Group_1_0__1__Impl rule__ExpressionLevel1__Group_1_0__2
            {
            pushFollow(FOLLOW_18);
            rule__ExpressionLevel1__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__Group_1_0__2();

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
    // $ANTLR end "rule__ExpressionLevel1__Group_1_0__1"


    // $ANTLR start "rule__ExpressionLevel1__Group_1_0__1__Impl"
    // InternalDsl.g:1551:1: rule__ExpressionLevel1__Group_1_0__1__Impl : ( '+' ) ;
    public final void rule__ExpressionLevel1__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1555:1: ( ( '+' ) )
            // InternalDsl.g:1556:1: ( '+' )
            {
            // InternalDsl.g:1556:1: ( '+' )
            // InternalDsl.g:1557:2: '+'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel1Access().getPlusSignKeyword_1_0_1()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel1Access().getPlusSignKeyword_1_0_1()); 
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
    // $ANTLR end "rule__ExpressionLevel1__Group_1_0__1__Impl"


    // $ANTLR start "rule__ExpressionLevel1__Group_1_0__2"
    // InternalDsl.g:1566:1: rule__ExpressionLevel1__Group_1_0__2 : rule__ExpressionLevel1__Group_1_0__2__Impl ;
    public final void rule__ExpressionLevel1__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1570:1: ( rule__ExpressionLevel1__Group_1_0__2__Impl )
            // InternalDsl.g:1571:2: rule__ExpressionLevel1__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__Group_1_0__2__Impl();

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
    // $ANTLR end "rule__ExpressionLevel1__Group_1_0__2"


    // $ANTLR start "rule__ExpressionLevel1__Group_1_0__2__Impl"
    // InternalDsl.g:1577:1: rule__ExpressionLevel1__Group_1_0__2__Impl : ( ( rule__ExpressionLevel1__RightAssignment_1_0_2 ) ) ;
    public final void rule__ExpressionLevel1__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1581:1: ( ( ( rule__ExpressionLevel1__RightAssignment_1_0_2 ) ) )
            // InternalDsl.g:1582:1: ( ( rule__ExpressionLevel1__RightAssignment_1_0_2 ) )
            {
            // InternalDsl.g:1582:1: ( ( rule__ExpressionLevel1__RightAssignment_1_0_2 ) )
            // InternalDsl.g:1583:2: ( rule__ExpressionLevel1__RightAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel1Access().getRightAssignment_1_0_2()); 
            }
            // InternalDsl.g:1584:2: ( rule__ExpressionLevel1__RightAssignment_1_0_2 )
            // InternalDsl.g:1584:3: rule__ExpressionLevel1__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__RightAssignment_1_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel1Access().getRightAssignment_1_0_2()); 
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
    // $ANTLR end "rule__ExpressionLevel1__Group_1_0__2__Impl"


    // $ANTLR start "rule__ExpressionLevel1__Group_1_1__0"
    // InternalDsl.g:1593:1: rule__ExpressionLevel1__Group_1_1__0 : rule__ExpressionLevel1__Group_1_1__0__Impl rule__ExpressionLevel1__Group_1_1__1 ;
    public final void rule__ExpressionLevel1__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1597:1: ( rule__ExpressionLevel1__Group_1_1__0__Impl rule__ExpressionLevel1__Group_1_1__1 )
            // InternalDsl.g:1598:2: rule__ExpressionLevel1__Group_1_1__0__Impl rule__ExpressionLevel1__Group_1_1__1
            {
            pushFollow(FOLLOW_15);
            rule__ExpressionLevel1__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__Group_1_1__1();

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
    // $ANTLR end "rule__ExpressionLevel1__Group_1_1__0"


    // $ANTLR start "rule__ExpressionLevel1__Group_1_1__0__Impl"
    // InternalDsl.g:1605:1: rule__ExpressionLevel1__Group_1_1__0__Impl : ( () ) ;
    public final void rule__ExpressionLevel1__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1609:1: ( ( () ) )
            // InternalDsl.g:1610:1: ( () )
            {
            // InternalDsl.g:1610:1: ( () )
            // InternalDsl.g:1611:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel1Access().getExpressionSubtractionLeftAction_1_1_0()); 
            }
            // InternalDsl.g:1612:2: ()
            // InternalDsl.g:1612:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel1Access().getExpressionSubtractionLeftAction_1_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel1__Group_1_1__0__Impl"


    // $ANTLR start "rule__ExpressionLevel1__Group_1_1__1"
    // InternalDsl.g:1620:1: rule__ExpressionLevel1__Group_1_1__1 : rule__ExpressionLevel1__Group_1_1__1__Impl rule__ExpressionLevel1__Group_1_1__2 ;
    public final void rule__ExpressionLevel1__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1624:1: ( rule__ExpressionLevel1__Group_1_1__1__Impl rule__ExpressionLevel1__Group_1_1__2 )
            // InternalDsl.g:1625:2: rule__ExpressionLevel1__Group_1_1__1__Impl rule__ExpressionLevel1__Group_1_1__2
            {
            pushFollow(FOLLOW_18);
            rule__ExpressionLevel1__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__Group_1_1__2();

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
    // $ANTLR end "rule__ExpressionLevel1__Group_1_1__1"


    // $ANTLR start "rule__ExpressionLevel1__Group_1_1__1__Impl"
    // InternalDsl.g:1632:1: rule__ExpressionLevel1__Group_1_1__1__Impl : ( '-' ) ;
    public final void rule__ExpressionLevel1__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1636:1: ( ( '-' ) )
            // InternalDsl.g:1637:1: ( '-' )
            {
            // InternalDsl.g:1637:1: ( '-' )
            // InternalDsl.g:1638:2: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel1Access().getHyphenMinusKeyword_1_1_1()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel1Access().getHyphenMinusKeyword_1_1_1()); 
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
    // $ANTLR end "rule__ExpressionLevel1__Group_1_1__1__Impl"


    // $ANTLR start "rule__ExpressionLevel1__Group_1_1__2"
    // InternalDsl.g:1647:1: rule__ExpressionLevel1__Group_1_1__2 : rule__ExpressionLevel1__Group_1_1__2__Impl ;
    public final void rule__ExpressionLevel1__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1651:1: ( rule__ExpressionLevel1__Group_1_1__2__Impl )
            // InternalDsl.g:1652:2: rule__ExpressionLevel1__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__Group_1_1__2__Impl();

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
    // $ANTLR end "rule__ExpressionLevel1__Group_1_1__2"


    // $ANTLR start "rule__ExpressionLevel1__Group_1_1__2__Impl"
    // InternalDsl.g:1658:1: rule__ExpressionLevel1__Group_1_1__2__Impl : ( ( rule__ExpressionLevel1__RightAssignment_1_1_2 ) ) ;
    public final void rule__ExpressionLevel1__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1662:1: ( ( ( rule__ExpressionLevel1__RightAssignment_1_1_2 ) ) )
            // InternalDsl.g:1663:1: ( ( rule__ExpressionLevel1__RightAssignment_1_1_2 ) )
            {
            // InternalDsl.g:1663:1: ( ( rule__ExpressionLevel1__RightAssignment_1_1_2 ) )
            // InternalDsl.g:1664:2: ( rule__ExpressionLevel1__RightAssignment_1_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel1Access().getRightAssignment_1_1_2()); 
            }
            // InternalDsl.g:1665:2: ( rule__ExpressionLevel1__RightAssignment_1_1_2 )
            // InternalDsl.g:1665:3: rule__ExpressionLevel1__RightAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel1__RightAssignment_1_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel1Access().getRightAssignment_1_1_2()); 
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
    // $ANTLR end "rule__ExpressionLevel1__Group_1_1__2__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group__0"
    // InternalDsl.g:1674:1: rule__ExpressionLevel2__Group__0 : rule__ExpressionLevel2__Group__0__Impl rule__ExpressionLevel2__Group__1 ;
    public final void rule__ExpressionLevel2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1678:1: ( rule__ExpressionLevel2__Group__0__Impl rule__ExpressionLevel2__Group__1 )
            // InternalDsl.g:1679:2: rule__ExpressionLevel2__Group__0__Impl rule__ExpressionLevel2__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__ExpressionLevel2__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group__1();

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
    // $ANTLR end "rule__ExpressionLevel2__Group__0"


    // $ANTLR start "rule__ExpressionLevel2__Group__0__Impl"
    // InternalDsl.g:1686:1: rule__ExpressionLevel2__Group__0__Impl : ( ruleExpressionLevel3 ) ;
    public final void rule__ExpressionLevel2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1690:1: ( ( ruleExpressionLevel3 ) )
            // InternalDsl.g:1691:1: ( ruleExpressionLevel3 )
            {
            // InternalDsl.g:1691:1: ( ruleExpressionLevel3 )
            // InternalDsl.g:1692:2: ruleExpressionLevel3
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getExpressionLevel3ParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressionLevel3();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getExpressionLevel3ParserRuleCall_0()); 
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
    // $ANTLR end "rule__ExpressionLevel2__Group__0__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group__1"
    // InternalDsl.g:1701:1: rule__ExpressionLevel2__Group__1 : rule__ExpressionLevel2__Group__1__Impl ;
    public final void rule__ExpressionLevel2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1705:1: ( rule__ExpressionLevel2__Group__1__Impl )
            // InternalDsl.g:1706:2: rule__ExpressionLevel2__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group__1__Impl();

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
    // $ANTLR end "rule__ExpressionLevel2__Group__1"


    // $ANTLR start "rule__ExpressionLevel2__Group__1__Impl"
    // InternalDsl.g:1712:1: rule__ExpressionLevel2__Group__1__Impl : ( ( rule__ExpressionLevel2__Alternatives_1 )* ) ;
    public final void rule__ExpressionLevel2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1716:1: ( ( ( rule__ExpressionLevel2__Alternatives_1 )* ) )
            // InternalDsl.g:1717:1: ( ( rule__ExpressionLevel2__Alternatives_1 )* )
            {
            // InternalDsl.g:1717:1: ( ( rule__ExpressionLevel2__Alternatives_1 )* )
            // InternalDsl.g:1718:2: ( rule__ExpressionLevel2__Alternatives_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getAlternatives_1()); 
            }
            // InternalDsl.g:1719:2: ( rule__ExpressionLevel2__Alternatives_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=40 && LA18_0<=44)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalDsl.g:1719:3: rule__ExpressionLevel2__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__ExpressionLevel2__Alternatives_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getAlternatives_1()); 
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
    // $ANTLR end "rule__ExpressionLevel2__Group__1__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_0__0"
    // InternalDsl.g:1728:1: rule__ExpressionLevel2__Group_1_0__0 : rule__ExpressionLevel2__Group_1_0__0__Impl rule__ExpressionLevel2__Group_1_0__1 ;
    public final void rule__ExpressionLevel2__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1732:1: ( rule__ExpressionLevel2__Group_1_0__0__Impl rule__ExpressionLevel2__Group_1_0__1 )
            // InternalDsl.g:1733:2: rule__ExpressionLevel2__Group_1_0__0__Impl rule__ExpressionLevel2__Group_1_0__1
            {
            pushFollow(FOLLOW_21);
            rule__ExpressionLevel2__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_0__1();

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
    // $ANTLR end "rule__ExpressionLevel2__Group_1_0__0"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_0__0__Impl"
    // InternalDsl.g:1740:1: rule__ExpressionLevel2__Group_1_0__0__Impl : ( () ) ;
    public final void rule__ExpressionLevel2__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1744:1: ( ( () ) )
            // InternalDsl.g:1745:1: ( () )
            {
            // InternalDsl.g:1745:1: ( () )
            // InternalDsl.g:1746:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getExpressionMultiplyLeftAction_1_0_0()); 
            }
            // InternalDsl.g:1747:2: ()
            // InternalDsl.g:1747:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getExpressionMultiplyLeftAction_1_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_0__0__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_0__1"
    // InternalDsl.g:1755:1: rule__ExpressionLevel2__Group_1_0__1 : rule__ExpressionLevel2__Group_1_0__1__Impl rule__ExpressionLevel2__Group_1_0__2 ;
    public final void rule__ExpressionLevel2__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1759:1: ( rule__ExpressionLevel2__Group_1_0__1__Impl rule__ExpressionLevel2__Group_1_0__2 )
            // InternalDsl.g:1760:2: rule__ExpressionLevel2__Group_1_0__1__Impl rule__ExpressionLevel2__Group_1_0__2
            {
            pushFollow(FOLLOW_18);
            rule__ExpressionLevel2__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_0__2();

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
    // $ANTLR end "rule__ExpressionLevel2__Group_1_0__1"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_0__1__Impl"
    // InternalDsl.g:1767:1: rule__ExpressionLevel2__Group_1_0__1__Impl : ( '*' ) ;
    public final void rule__ExpressionLevel2__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1771:1: ( ( '*' ) )
            // InternalDsl.g:1772:1: ( '*' )
            {
            // InternalDsl.g:1772:1: ( '*' )
            // InternalDsl.g:1773:2: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getAsteriskKeyword_1_0_1()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getAsteriskKeyword_1_0_1()); 
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
    // $ANTLR end "rule__ExpressionLevel2__Group_1_0__1__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_0__2"
    // InternalDsl.g:1782:1: rule__ExpressionLevel2__Group_1_0__2 : rule__ExpressionLevel2__Group_1_0__2__Impl ;
    public final void rule__ExpressionLevel2__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1786:1: ( rule__ExpressionLevel2__Group_1_0__2__Impl )
            // InternalDsl.g:1787:2: rule__ExpressionLevel2__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_0__2__Impl();

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
    // $ANTLR end "rule__ExpressionLevel2__Group_1_0__2"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_0__2__Impl"
    // InternalDsl.g:1793:1: rule__ExpressionLevel2__Group_1_0__2__Impl : ( ( rule__ExpressionLevel2__RightAssignment_1_0_2 ) ) ;
    public final void rule__ExpressionLevel2__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1797:1: ( ( ( rule__ExpressionLevel2__RightAssignment_1_0_2 ) ) )
            // InternalDsl.g:1798:1: ( ( rule__ExpressionLevel2__RightAssignment_1_0_2 ) )
            {
            // InternalDsl.g:1798:1: ( ( rule__ExpressionLevel2__RightAssignment_1_0_2 ) )
            // InternalDsl.g:1799:2: ( rule__ExpressionLevel2__RightAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getRightAssignment_1_0_2()); 
            }
            // InternalDsl.g:1800:2: ( rule__ExpressionLevel2__RightAssignment_1_0_2 )
            // InternalDsl.g:1800:3: rule__ExpressionLevel2__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__RightAssignment_1_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getRightAssignment_1_0_2()); 
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
    // $ANTLR end "rule__ExpressionLevel2__Group_1_0__2__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_1__0"
    // InternalDsl.g:1809:1: rule__ExpressionLevel2__Group_1_1__0 : rule__ExpressionLevel2__Group_1_1__0__Impl rule__ExpressionLevel2__Group_1_1__1 ;
    public final void rule__ExpressionLevel2__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1813:1: ( rule__ExpressionLevel2__Group_1_1__0__Impl rule__ExpressionLevel2__Group_1_1__1 )
            // InternalDsl.g:1814:2: rule__ExpressionLevel2__Group_1_1__0__Impl rule__ExpressionLevel2__Group_1_1__1
            {
            pushFollow(FOLLOW_22);
            rule__ExpressionLevel2__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_1__1();

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
    // $ANTLR end "rule__ExpressionLevel2__Group_1_1__0"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_1__0__Impl"
    // InternalDsl.g:1821:1: rule__ExpressionLevel2__Group_1_1__0__Impl : ( () ) ;
    public final void rule__ExpressionLevel2__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1825:1: ( ( () ) )
            // InternalDsl.g:1826:1: ( () )
            {
            // InternalDsl.g:1826:1: ( () )
            // InternalDsl.g:1827:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getExpressionDivisionLeftAction_1_1_0()); 
            }
            // InternalDsl.g:1828:2: ()
            // InternalDsl.g:1828:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getExpressionDivisionLeftAction_1_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_1__0__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_1__1"
    // InternalDsl.g:1836:1: rule__ExpressionLevel2__Group_1_1__1 : rule__ExpressionLevel2__Group_1_1__1__Impl rule__ExpressionLevel2__Group_1_1__2 ;
    public final void rule__ExpressionLevel2__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1840:1: ( rule__ExpressionLevel2__Group_1_1__1__Impl rule__ExpressionLevel2__Group_1_1__2 )
            // InternalDsl.g:1841:2: rule__ExpressionLevel2__Group_1_1__1__Impl rule__ExpressionLevel2__Group_1_1__2
            {
            pushFollow(FOLLOW_18);
            rule__ExpressionLevel2__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_1__2();

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
    // $ANTLR end "rule__ExpressionLevel2__Group_1_1__1"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_1__1__Impl"
    // InternalDsl.g:1848:1: rule__ExpressionLevel2__Group_1_1__1__Impl : ( '/' ) ;
    public final void rule__ExpressionLevel2__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1852:1: ( ( '/' ) )
            // InternalDsl.g:1853:1: ( '/' )
            {
            // InternalDsl.g:1853:1: ( '/' )
            // InternalDsl.g:1854:2: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getSolidusKeyword_1_1_1()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getSolidusKeyword_1_1_1()); 
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
    // $ANTLR end "rule__ExpressionLevel2__Group_1_1__1__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_1__2"
    // InternalDsl.g:1863:1: rule__ExpressionLevel2__Group_1_1__2 : rule__ExpressionLevel2__Group_1_1__2__Impl ;
    public final void rule__ExpressionLevel2__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1867:1: ( rule__ExpressionLevel2__Group_1_1__2__Impl )
            // InternalDsl.g:1868:2: rule__ExpressionLevel2__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_1__2__Impl();

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
    // $ANTLR end "rule__ExpressionLevel2__Group_1_1__2"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_1__2__Impl"
    // InternalDsl.g:1874:1: rule__ExpressionLevel2__Group_1_1__2__Impl : ( ( rule__ExpressionLevel2__RightAssignment_1_1_2 ) ) ;
    public final void rule__ExpressionLevel2__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1878:1: ( ( ( rule__ExpressionLevel2__RightAssignment_1_1_2 ) ) )
            // InternalDsl.g:1879:1: ( ( rule__ExpressionLevel2__RightAssignment_1_1_2 ) )
            {
            // InternalDsl.g:1879:1: ( ( rule__ExpressionLevel2__RightAssignment_1_1_2 ) )
            // InternalDsl.g:1880:2: ( rule__ExpressionLevel2__RightAssignment_1_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getRightAssignment_1_1_2()); 
            }
            // InternalDsl.g:1881:2: ( rule__ExpressionLevel2__RightAssignment_1_1_2 )
            // InternalDsl.g:1881:3: rule__ExpressionLevel2__RightAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__RightAssignment_1_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getRightAssignment_1_1_2()); 
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
    // $ANTLR end "rule__ExpressionLevel2__Group_1_1__2__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_2__0"
    // InternalDsl.g:1890:1: rule__ExpressionLevel2__Group_1_2__0 : rule__ExpressionLevel2__Group_1_2__0__Impl rule__ExpressionLevel2__Group_1_2__1 ;
    public final void rule__ExpressionLevel2__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1894:1: ( rule__ExpressionLevel2__Group_1_2__0__Impl rule__ExpressionLevel2__Group_1_2__1 )
            // InternalDsl.g:1895:2: rule__ExpressionLevel2__Group_1_2__0__Impl rule__ExpressionLevel2__Group_1_2__1
            {
            pushFollow(FOLLOW_23);
            rule__ExpressionLevel2__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_2__1();

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
    // $ANTLR end "rule__ExpressionLevel2__Group_1_2__0"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_2__0__Impl"
    // InternalDsl.g:1902:1: rule__ExpressionLevel2__Group_1_2__0__Impl : ( () ) ;
    public final void rule__ExpressionLevel2__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1906:1: ( ( () ) )
            // InternalDsl.g:1907:1: ( () )
            {
            // InternalDsl.g:1907:1: ( () )
            // InternalDsl.g:1908:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getExpressionMaximumLeftAction_1_2_0()); 
            }
            // InternalDsl.g:1909:2: ()
            // InternalDsl.g:1909:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getExpressionMaximumLeftAction_1_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_2__0__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_2__1"
    // InternalDsl.g:1917:1: rule__ExpressionLevel2__Group_1_2__1 : rule__ExpressionLevel2__Group_1_2__1__Impl rule__ExpressionLevel2__Group_1_2__2 ;
    public final void rule__ExpressionLevel2__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1921:1: ( rule__ExpressionLevel2__Group_1_2__1__Impl rule__ExpressionLevel2__Group_1_2__2 )
            // InternalDsl.g:1922:2: rule__ExpressionLevel2__Group_1_2__1__Impl rule__ExpressionLevel2__Group_1_2__2
            {
            pushFollow(FOLLOW_18);
            rule__ExpressionLevel2__Group_1_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_2__2();

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
    // $ANTLR end "rule__ExpressionLevel2__Group_1_2__1"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_2__1__Impl"
    // InternalDsl.g:1929:1: rule__ExpressionLevel2__Group_1_2__1__Impl : ( 'max' ) ;
    public final void rule__ExpressionLevel2__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1933:1: ( ( 'max' ) )
            // InternalDsl.g:1934:1: ( 'max' )
            {
            // InternalDsl.g:1934:1: ( 'max' )
            // InternalDsl.g:1935:2: 'max'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getMaxKeyword_1_2_1()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getMaxKeyword_1_2_1()); 
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
    // $ANTLR end "rule__ExpressionLevel2__Group_1_2__1__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_2__2"
    // InternalDsl.g:1944:1: rule__ExpressionLevel2__Group_1_2__2 : rule__ExpressionLevel2__Group_1_2__2__Impl ;
    public final void rule__ExpressionLevel2__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1948:1: ( rule__ExpressionLevel2__Group_1_2__2__Impl )
            // InternalDsl.g:1949:2: rule__ExpressionLevel2__Group_1_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_2__2__Impl();

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
    // $ANTLR end "rule__ExpressionLevel2__Group_1_2__2"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_2__2__Impl"
    // InternalDsl.g:1955:1: rule__ExpressionLevel2__Group_1_2__2__Impl : ( ( rule__ExpressionLevel2__RightAssignment_1_2_2 ) ) ;
    public final void rule__ExpressionLevel2__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1959:1: ( ( ( rule__ExpressionLevel2__RightAssignment_1_2_2 ) ) )
            // InternalDsl.g:1960:1: ( ( rule__ExpressionLevel2__RightAssignment_1_2_2 ) )
            {
            // InternalDsl.g:1960:1: ( ( rule__ExpressionLevel2__RightAssignment_1_2_2 ) )
            // InternalDsl.g:1961:2: ( rule__ExpressionLevel2__RightAssignment_1_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getRightAssignment_1_2_2()); 
            }
            // InternalDsl.g:1962:2: ( rule__ExpressionLevel2__RightAssignment_1_2_2 )
            // InternalDsl.g:1962:3: rule__ExpressionLevel2__RightAssignment_1_2_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__RightAssignment_1_2_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getRightAssignment_1_2_2()); 
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
    // $ANTLR end "rule__ExpressionLevel2__Group_1_2__2__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_3__0"
    // InternalDsl.g:1971:1: rule__ExpressionLevel2__Group_1_3__0 : rule__ExpressionLevel2__Group_1_3__0__Impl rule__ExpressionLevel2__Group_1_3__1 ;
    public final void rule__ExpressionLevel2__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1975:1: ( rule__ExpressionLevel2__Group_1_3__0__Impl rule__ExpressionLevel2__Group_1_3__1 )
            // InternalDsl.g:1976:2: rule__ExpressionLevel2__Group_1_3__0__Impl rule__ExpressionLevel2__Group_1_3__1
            {
            pushFollow(FOLLOW_24);
            rule__ExpressionLevel2__Group_1_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_3__1();

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
    // $ANTLR end "rule__ExpressionLevel2__Group_1_3__0"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_3__0__Impl"
    // InternalDsl.g:1983:1: rule__ExpressionLevel2__Group_1_3__0__Impl : ( () ) ;
    public final void rule__ExpressionLevel2__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1987:1: ( ( () ) )
            // InternalDsl.g:1988:1: ( () )
            {
            // InternalDsl.g:1988:1: ( () )
            // InternalDsl.g:1989:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getExpressionMinimumLeftAction_1_3_0()); 
            }
            // InternalDsl.g:1990:2: ()
            // InternalDsl.g:1990:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getExpressionMinimumLeftAction_1_3_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_3__0__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_3__1"
    // InternalDsl.g:1998:1: rule__ExpressionLevel2__Group_1_3__1 : rule__ExpressionLevel2__Group_1_3__1__Impl rule__ExpressionLevel2__Group_1_3__2 ;
    public final void rule__ExpressionLevel2__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2002:1: ( rule__ExpressionLevel2__Group_1_3__1__Impl rule__ExpressionLevel2__Group_1_3__2 )
            // InternalDsl.g:2003:2: rule__ExpressionLevel2__Group_1_3__1__Impl rule__ExpressionLevel2__Group_1_3__2
            {
            pushFollow(FOLLOW_18);
            rule__ExpressionLevel2__Group_1_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_3__2();

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
    // $ANTLR end "rule__ExpressionLevel2__Group_1_3__1"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_3__1__Impl"
    // InternalDsl.g:2010:1: rule__ExpressionLevel2__Group_1_3__1__Impl : ( 'min' ) ;
    public final void rule__ExpressionLevel2__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2014:1: ( ( 'min' ) )
            // InternalDsl.g:2015:1: ( 'min' )
            {
            // InternalDsl.g:2015:1: ( 'min' )
            // InternalDsl.g:2016:2: 'min'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getMinKeyword_1_3_1()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getMinKeyword_1_3_1()); 
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
    // $ANTLR end "rule__ExpressionLevel2__Group_1_3__1__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_3__2"
    // InternalDsl.g:2025:1: rule__ExpressionLevel2__Group_1_3__2 : rule__ExpressionLevel2__Group_1_3__2__Impl ;
    public final void rule__ExpressionLevel2__Group_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2029:1: ( rule__ExpressionLevel2__Group_1_3__2__Impl )
            // InternalDsl.g:2030:2: rule__ExpressionLevel2__Group_1_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_3__2__Impl();

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
    // $ANTLR end "rule__ExpressionLevel2__Group_1_3__2"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_3__2__Impl"
    // InternalDsl.g:2036:1: rule__ExpressionLevel2__Group_1_3__2__Impl : ( ( rule__ExpressionLevel2__RightAssignment_1_3_2 ) ) ;
    public final void rule__ExpressionLevel2__Group_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2040:1: ( ( ( rule__ExpressionLevel2__RightAssignment_1_3_2 ) ) )
            // InternalDsl.g:2041:1: ( ( rule__ExpressionLevel2__RightAssignment_1_3_2 ) )
            {
            // InternalDsl.g:2041:1: ( ( rule__ExpressionLevel2__RightAssignment_1_3_2 ) )
            // InternalDsl.g:2042:2: ( rule__ExpressionLevel2__RightAssignment_1_3_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getRightAssignment_1_3_2()); 
            }
            // InternalDsl.g:2043:2: ( rule__ExpressionLevel2__RightAssignment_1_3_2 )
            // InternalDsl.g:2043:3: rule__ExpressionLevel2__RightAssignment_1_3_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__RightAssignment_1_3_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getRightAssignment_1_3_2()); 
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
    // $ANTLR end "rule__ExpressionLevel2__Group_1_3__2__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_4__0"
    // InternalDsl.g:2052:1: rule__ExpressionLevel2__Group_1_4__0 : rule__ExpressionLevel2__Group_1_4__0__Impl rule__ExpressionLevel2__Group_1_4__1 ;
    public final void rule__ExpressionLevel2__Group_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2056:1: ( rule__ExpressionLevel2__Group_1_4__0__Impl rule__ExpressionLevel2__Group_1_4__1 )
            // InternalDsl.g:2057:2: rule__ExpressionLevel2__Group_1_4__0__Impl rule__ExpressionLevel2__Group_1_4__1
            {
            pushFollow(FOLLOW_19);
            rule__ExpressionLevel2__Group_1_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_4__1();

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
    // $ANTLR end "rule__ExpressionLevel2__Group_1_4__0"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_4__0__Impl"
    // InternalDsl.g:2064:1: rule__ExpressionLevel2__Group_1_4__0__Impl : ( () ) ;
    public final void rule__ExpressionLevel2__Group_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2068:1: ( ( () ) )
            // InternalDsl.g:2069:1: ( () )
            {
            // InternalDsl.g:2069:1: ( () )
            // InternalDsl.g:2070:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getExpressionModuloLeftAction_1_4_0()); 
            }
            // InternalDsl.g:2071:2: ()
            // InternalDsl.g:2071:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getExpressionModuloLeftAction_1_4_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel2__Group_1_4__0__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_4__1"
    // InternalDsl.g:2079:1: rule__ExpressionLevel2__Group_1_4__1 : rule__ExpressionLevel2__Group_1_4__1__Impl rule__ExpressionLevel2__Group_1_4__2 ;
    public final void rule__ExpressionLevel2__Group_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2083:1: ( rule__ExpressionLevel2__Group_1_4__1__Impl rule__ExpressionLevel2__Group_1_4__2 )
            // InternalDsl.g:2084:2: rule__ExpressionLevel2__Group_1_4__1__Impl rule__ExpressionLevel2__Group_1_4__2
            {
            pushFollow(FOLLOW_18);
            rule__ExpressionLevel2__Group_1_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_4__2();

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
    // $ANTLR end "rule__ExpressionLevel2__Group_1_4__1"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_4__1__Impl"
    // InternalDsl.g:2091:1: rule__ExpressionLevel2__Group_1_4__1__Impl : ( 'mod' ) ;
    public final void rule__ExpressionLevel2__Group_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2095:1: ( ( 'mod' ) )
            // InternalDsl.g:2096:1: ( 'mod' )
            {
            // InternalDsl.g:2096:1: ( 'mod' )
            // InternalDsl.g:2097:2: 'mod'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getModKeyword_1_4_1()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getModKeyword_1_4_1()); 
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
    // $ANTLR end "rule__ExpressionLevel2__Group_1_4__1__Impl"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_4__2"
    // InternalDsl.g:2106:1: rule__ExpressionLevel2__Group_1_4__2 : rule__ExpressionLevel2__Group_1_4__2__Impl ;
    public final void rule__ExpressionLevel2__Group_1_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2110:1: ( rule__ExpressionLevel2__Group_1_4__2__Impl )
            // InternalDsl.g:2111:2: rule__ExpressionLevel2__Group_1_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__Group_1_4__2__Impl();

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
    // $ANTLR end "rule__ExpressionLevel2__Group_1_4__2"


    // $ANTLR start "rule__ExpressionLevel2__Group_1_4__2__Impl"
    // InternalDsl.g:2117:1: rule__ExpressionLevel2__Group_1_4__2__Impl : ( ( rule__ExpressionLevel2__RightAssignment_1_4_2 ) ) ;
    public final void rule__ExpressionLevel2__Group_1_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2121:1: ( ( ( rule__ExpressionLevel2__RightAssignment_1_4_2 ) ) )
            // InternalDsl.g:2122:1: ( ( rule__ExpressionLevel2__RightAssignment_1_4_2 ) )
            {
            // InternalDsl.g:2122:1: ( ( rule__ExpressionLevel2__RightAssignment_1_4_2 ) )
            // InternalDsl.g:2123:2: ( rule__ExpressionLevel2__RightAssignment_1_4_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getRightAssignment_1_4_2()); 
            }
            // InternalDsl.g:2124:2: ( rule__ExpressionLevel2__RightAssignment_1_4_2 )
            // InternalDsl.g:2124:3: rule__ExpressionLevel2__RightAssignment_1_4_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel2__RightAssignment_1_4_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getRightAssignment_1_4_2()); 
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
    // $ANTLR end "rule__ExpressionLevel2__Group_1_4__2__Impl"


    // $ANTLR start "rule__ExpressionLevel3__Group__0"
    // InternalDsl.g:2133:1: rule__ExpressionLevel3__Group__0 : rule__ExpressionLevel3__Group__0__Impl rule__ExpressionLevel3__Group__1 ;
    public final void rule__ExpressionLevel3__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2137:1: ( rule__ExpressionLevel3__Group__0__Impl rule__ExpressionLevel3__Group__1 )
            // InternalDsl.g:2138:2: rule__ExpressionLevel3__Group__0__Impl rule__ExpressionLevel3__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__ExpressionLevel3__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel3__Group__1();

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
    // $ANTLR end "rule__ExpressionLevel3__Group__0"


    // $ANTLR start "rule__ExpressionLevel3__Group__0__Impl"
    // InternalDsl.g:2145:1: rule__ExpressionLevel3__Group__0__Impl : ( ruleExpressionLevel4 ) ;
    public final void rule__ExpressionLevel3__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2149:1: ( ( ruleExpressionLevel4 ) )
            // InternalDsl.g:2150:1: ( ruleExpressionLevel4 )
            {
            // InternalDsl.g:2150:1: ( ruleExpressionLevel4 )
            // InternalDsl.g:2151:2: ruleExpressionLevel4
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel3Access().getExpressionLevel4ParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressionLevel4();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel3Access().getExpressionLevel4ParserRuleCall_0()); 
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
    // $ANTLR end "rule__ExpressionLevel3__Group__0__Impl"


    // $ANTLR start "rule__ExpressionLevel3__Group__1"
    // InternalDsl.g:2160:1: rule__ExpressionLevel3__Group__1 : rule__ExpressionLevel3__Group__1__Impl ;
    public final void rule__ExpressionLevel3__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2164:1: ( rule__ExpressionLevel3__Group__1__Impl )
            // InternalDsl.g:2165:2: rule__ExpressionLevel3__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel3__Group__1__Impl();

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
    // $ANTLR end "rule__ExpressionLevel3__Group__1"


    // $ANTLR start "rule__ExpressionLevel3__Group__1__Impl"
    // InternalDsl.g:2171:1: rule__ExpressionLevel3__Group__1__Impl : ( ( rule__ExpressionLevel3__Group_1__0 )? ) ;
    public final void rule__ExpressionLevel3__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2175:1: ( ( ( rule__ExpressionLevel3__Group_1__0 )? ) )
            // InternalDsl.g:2176:1: ( ( rule__ExpressionLevel3__Group_1__0 )? )
            {
            // InternalDsl.g:2176:1: ( ( rule__ExpressionLevel3__Group_1__0 )? )
            // InternalDsl.g:2177:2: ( rule__ExpressionLevel3__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel3Access().getGroup_1()); 
            }
            // InternalDsl.g:2178:2: ( rule__ExpressionLevel3__Group_1__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==45) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalDsl.g:2178:3: rule__ExpressionLevel3__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpressionLevel3__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel3Access().getGroup_1()); 
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
    // $ANTLR end "rule__ExpressionLevel3__Group__1__Impl"


    // $ANTLR start "rule__ExpressionLevel3__Group_1__0"
    // InternalDsl.g:2187:1: rule__ExpressionLevel3__Group_1__0 : rule__ExpressionLevel3__Group_1__0__Impl rule__ExpressionLevel3__Group_1__1 ;
    public final void rule__ExpressionLevel3__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2191:1: ( rule__ExpressionLevel3__Group_1__0__Impl rule__ExpressionLevel3__Group_1__1 )
            // InternalDsl.g:2192:2: rule__ExpressionLevel3__Group_1__0__Impl rule__ExpressionLevel3__Group_1__1
            {
            pushFollow(FOLLOW_25);
            rule__ExpressionLevel3__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel3__Group_1__1();

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
    // $ANTLR end "rule__ExpressionLevel3__Group_1__0"


    // $ANTLR start "rule__ExpressionLevel3__Group_1__0__Impl"
    // InternalDsl.g:2199:1: rule__ExpressionLevel3__Group_1__0__Impl : ( () ) ;
    public final void rule__ExpressionLevel3__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2203:1: ( ( () ) )
            // InternalDsl.g:2204:1: ( () )
            {
            // InternalDsl.g:2204:1: ( () )
            // InternalDsl.g:2205:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel3Access().getExpressionPowerLeftAction_1_0()); 
            }
            // InternalDsl.g:2206:2: ()
            // InternalDsl.g:2206:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel3Access().getExpressionPowerLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionLevel3__Group_1__0__Impl"


    // $ANTLR start "rule__ExpressionLevel3__Group_1__1"
    // InternalDsl.g:2214:1: rule__ExpressionLevel3__Group_1__1 : rule__ExpressionLevel3__Group_1__1__Impl rule__ExpressionLevel3__Group_1__2 ;
    public final void rule__ExpressionLevel3__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2218:1: ( rule__ExpressionLevel3__Group_1__1__Impl rule__ExpressionLevel3__Group_1__2 )
            // InternalDsl.g:2219:2: rule__ExpressionLevel3__Group_1__1__Impl rule__ExpressionLevel3__Group_1__2
            {
            pushFollow(FOLLOW_18);
            rule__ExpressionLevel3__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel3__Group_1__2();

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
    // $ANTLR end "rule__ExpressionLevel3__Group_1__1"


    // $ANTLR start "rule__ExpressionLevel3__Group_1__1__Impl"
    // InternalDsl.g:2226:1: rule__ExpressionLevel3__Group_1__1__Impl : ( '^' ) ;
    public final void rule__ExpressionLevel3__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2230:1: ( ( '^' ) )
            // InternalDsl.g:2231:1: ( '^' )
            {
            // InternalDsl.g:2231:1: ( '^' )
            // InternalDsl.g:2232:2: '^'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel3Access().getCircumflexAccentKeyword_1_1()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel3Access().getCircumflexAccentKeyword_1_1()); 
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
    // $ANTLR end "rule__ExpressionLevel3__Group_1__1__Impl"


    // $ANTLR start "rule__ExpressionLevel3__Group_1__2"
    // InternalDsl.g:2241:1: rule__ExpressionLevel3__Group_1__2 : rule__ExpressionLevel3__Group_1__2__Impl ;
    public final void rule__ExpressionLevel3__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2245:1: ( rule__ExpressionLevel3__Group_1__2__Impl )
            // InternalDsl.g:2246:2: rule__ExpressionLevel3__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel3__Group_1__2__Impl();

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
    // $ANTLR end "rule__ExpressionLevel3__Group_1__2"


    // $ANTLR start "rule__ExpressionLevel3__Group_1__2__Impl"
    // InternalDsl.g:2252:1: rule__ExpressionLevel3__Group_1__2__Impl : ( ( rule__ExpressionLevel3__RightAssignment_1_2 ) ) ;
    public final void rule__ExpressionLevel3__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2256:1: ( ( ( rule__ExpressionLevel3__RightAssignment_1_2 ) ) )
            // InternalDsl.g:2257:1: ( ( rule__ExpressionLevel3__RightAssignment_1_2 ) )
            {
            // InternalDsl.g:2257:1: ( ( rule__ExpressionLevel3__RightAssignment_1_2 ) )
            // InternalDsl.g:2258:2: ( rule__ExpressionLevel3__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel3Access().getRightAssignment_1_2()); 
            }
            // InternalDsl.g:2259:2: ( rule__ExpressionLevel3__RightAssignment_1_2 )
            // InternalDsl.g:2259:3: rule__ExpressionLevel3__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionLevel3__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel3Access().getRightAssignment_1_2()); 
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
    // $ANTLR end "rule__ExpressionLevel3__Group_1__2__Impl"


    // $ANTLR start "rule__ExpressionMinus__Group__0"
    // InternalDsl.g:2268:1: rule__ExpressionMinus__Group__0 : rule__ExpressionMinus__Group__0__Impl rule__ExpressionMinus__Group__1 ;
    public final void rule__ExpressionMinus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2272:1: ( rule__ExpressionMinus__Group__0__Impl rule__ExpressionMinus__Group__1 )
            // InternalDsl.g:2273:2: rule__ExpressionMinus__Group__0__Impl rule__ExpressionMinus__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__ExpressionMinus__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionMinus__Group__1();

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
    // $ANTLR end "rule__ExpressionMinus__Group__0"


    // $ANTLR start "rule__ExpressionMinus__Group__0__Impl"
    // InternalDsl.g:2280:1: rule__ExpressionMinus__Group__0__Impl : ( '-' ) ;
    public final void rule__ExpressionMinus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2284:1: ( ( '-' ) )
            // InternalDsl.g:2285:1: ( '-' )
            {
            // InternalDsl.g:2285:1: ( '-' )
            // InternalDsl.g:2286:2: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionMinusAccess().getHyphenMinusKeyword_0()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionMinusAccess().getHyphenMinusKeyword_0()); 
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
    // $ANTLR end "rule__ExpressionMinus__Group__0__Impl"


    // $ANTLR start "rule__ExpressionMinus__Group__1"
    // InternalDsl.g:2295:1: rule__ExpressionMinus__Group__1 : rule__ExpressionMinus__Group__1__Impl ;
    public final void rule__ExpressionMinus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2299:1: ( rule__ExpressionMinus__Group__1__Impl )
            // InternalDsl.g:2300:2: rule__ExpressionMinus__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionMinus__Group__1__Impl();

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
    // $ANTLR end "rule__ExpressionMinus__Group__1"


    // $ANTLR start "rule__ExpressionMinus__Group__1__Impl"
    // InternalDsl.g:2306:1: rule__ExpressionMinus__Group__1__Impl : ( ( rule__ExpressionMinus__SubAssignment_1 ) ) ;
    public final void rule__ExpressionMinus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2310:1: ( ( ( rule__ExpressionMinus__SubAssignment_1 ) ) )
            // InternalDsl.g:2311:1: ( ( rule__ExpressionMinus__SubAssignment_1 ) )
            {
            // InternalDsl.g:2311:1: ( ( rule__ExpressionMinus__SubAssignment_1 ) )
            // InternalDsl.g:2312:2: ( rule__ExpressionMinus__SubAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionMinusAccess().getSubAssignment_1()); 
            }
            // InternalDsl.g:2313:2: ( rule__ExpressionMinus__SubAssignment_1 )
            // InternalDsl.g:2313:3: rule__ExpressionMinus__SubAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionMinus__SubAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionMinusAccess().getSubAssignment_1()); 
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
    // $ANTLR end "rule__ExpressionMinus__Group__1__Impl"


    // $ANTLR start "rule__ExpressionPlus__Group__0"
    // InternalDsl.g:2322:1: rule__ExpressionPlus__Group__0 : rule__ExpressionPlus__Group__0__Impl rule__ExpressionPlus__Group__1 ;
    public final void rule__ExpressionPlus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2326:1: ( rule__ExpressionPlus__Group__0__Impl rule__ExpressionPlus__Group__1 )
            // InternalDsl.g:2327:2: rule__ExpressionPlus__Group__0__Impl rule__ExpressionPlus__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__ExpressionPlus__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionPlus__Group__1();

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
    // $ANTLR end "rule__ExpressionPlus__Group__0"


    // $ANTLR start "rule__ExpressionPlus__Group__0__Impl"
    // InternalDsl.g:2334:1: rule__ExpressionPlus__Group__0__Impl : ( '+' ) ;
    public final void rule__ExpressionPlus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2338:1: ( ( '+' ) )
            // InternalDsl.g:2339:1: ( '+' )
            {
            // InternalDsl.g:2339:1: ( '+' )
            // InternalDsl.g:2340:2: '+'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionPlusAccess().getPlusSignKeyword_0()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionPlusAccess().getPlusSignKeyword_0()); 
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
    // $ANTLR end "rule__ExpressionPlus__Group__0__Impl"


    // $ANTLR start "rule__ExpressionPlus__Group__1"
    // InternalDsl.g:2349:1: rule__ExpressionPlus__Group__1 : rule__ExpressionPlus__Group__1__Impl ;
    public final void rule__ExpressionPlus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2353:1: ( rule__ExpressionPlus__Group__1__Impl )
            // InternalDsl.g:2354:2: rule__ExpressionPlus__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionPlus__Group__1__Impl();

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
    // $ANTLR end "rule__ExpressionPlus__Group__1"


    // $ANTLR start "rule__ExpressionPlus__Group__1__Impl"
    // InternalDsl.g:2360:1: rule__ExpressionPlus__Group__1__Impl : ( ( rule__ExpressionPlus__SubAssignment_1 ) ) ;
    public final void rule__ExpressionPlus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2364:1: ( ( ( rule__ExpressionPlus__SubAssignment_1 ) ) )
            // InternalDsl.g:2365:1: ( ( rule__ExpressionPlus__SubAssignment_1 ) )
            {
            // InternalDsl.g:2365:1: ( ( rule__ExpressionPlus__SubAssignment_1 ) )
            // InternalDsl.g:2366:2: ( rule__ExpressionPlus__SubAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionPlusAccess().getSubAssignment_1()); 
            }
            // InternalDsl.g:2367:2: ( rule__ExpressionPlus__SubAssignment_1 )
            // InternalDsl.g:2367:3: rule__ExpressionPlus__SubAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionPlus__SubAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionPlusAccess().getSubAssignment_1()); 
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
    // $ANTLR end "rule__ExpressionPlus__Group__1__Impl"


    // $ANTLR start "rule__ExpressionBracket__Group__0"
    // InternalDsl.g:2376:1: rule__ExpressionBracket__Group__0 : rule__ExpressionBracket__Group__0__Impl rule__ExpressionBracket__Group__1 ;
    public final void rule__ExpressionBracket__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2380:1: ( rule__ExpressionBracket__Group__0__Impl rule__ExpressionBracket__Group__1 )
            // InternalDsl.g:2381:2: rule__ExpressionBracket__Group__0__Impl rule__ExpressionBracket__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__ExpressionBracket__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionBracket__Group__1();

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
    // $ANTLR end "rule__ExpressionBracket__Group__0"


    // $ANTLR start "rule__ExpressionBracket__Group__0__Impl"
    // InternalDsl.g:2388:1: rule__ExpressionBracket__Group__0__Impl : ( '(' ) ;
    public final void rule__ExpressionBracket__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2392:1: ( ( '(' ) )
            // InternalDsl.g:2393:1: ( '(' )
            {
            // InternalDsl.g:2393:1: ( '(' )
            // InternalDsl.g:2394:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionBracketAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionBracketAccess().getLeftParenthesisKeyword_0()); 
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
    // $ANTLR end "rule__ExpressionBracket__Group__0__Impl"


    // $ANTLR start "rule__ExpressionBracket__Group__1"
    // InternalDsl.g:2403:1: rule__ExpressionBracket__Group__1 : rule__ExpressionBracket__Group__1__Impl rule__ExpressionBracket__Group__2 ;
    public final void rule__ExpressionBracket__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2407:1: ( rule__ExpressionBracket__Group__1__Impl rule__ExpressionBracket__Group__2 )
            // InternalDsl.g:2408:2: rule__ExpressionBracket__Group__1__Impl rule__ExpressionBracket__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__ExpressionBracket__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExpressionBracket__Group__2();

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
    // $ANTLR end "rule__ExpressionBracket__Group__1"


    // $ANTLR start "rule__ExpressionBracket__Group__1__Impl"
    // InternalDsl.g:2415:1: rule__ExpressionBracket__Group__1__Impl : ( ( rule__ExpressionBracket__SubAssignment_1 ) ) ;
    public final void rule__ExpressionBracket__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2419:1: ( ( ( rule__ExpressionBracket__SubAssignment_1 ) ) )
            // InternalDsl.g:2420:1: ( ( rule__ExpressionBracket__SubAssignment_1 ) )
            {
            // InternalDsl.g:2420:1: ( ( rule__ExpressionBracket__SubAssignment_1 ) )
            // InternalDsl.g:2421:2: ( rule__ExpressionBracket__SubAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionBracketAccess().getSubAssignment_1()); 
            }
            // InternalDsl.g:2422:2: ( rule__ExpressionBracket__SubAssignment_1 )
            // InternalDsl.g:2422:3: rule__ExpressionBracket__SubAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionBracket__SubAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionBracketAccess().getSubAssignment_1()); 
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
    // $ANTLR end "rule__ExpressionBracket__Group__1__Impl"


    // $ANTLR start "rule__ExpressionBracket__Group__2"
    // InternalDsl.g:2430:1: rule__ExpressionBracket__Group__2 : rule__ExpressionBracket__Group__2__Impl ;
    public final void rule__ExpressionBracket__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2434:1: ( rule__ExpressionBracket__Group__2__Impl )
            // InternalDsl.g:2435:2: rule__ExpressionBracket__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpressionBracket__Group__2__Impl();

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
    // $ANTLR end "rule__ExpressionBracket__Group__2"


    // $ANTLR start "rule__ExpressionBracket__Group__2__Impl"
    // InternalDsl.g:2441:1: rule__ExpressionBracket__Group__2__Impl : ( ')' ) ;
    public final void rule__ExpressionBracket__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2445:1: ( ( ')' ) )
            // InternalDsl.g:2446:1: ( ')' )
            {
            // InternalDsl.g:2446:1: ( ')' )
            // InternalDsl.g:2447:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionBracketAccess().getRightParenthesisKeyword_2()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionBracketAccess().getRightParenthesisKeyword_2()); 
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
    // $ANTLR end "rule__ExpressionBracket__Group__2__Impl"


    // $ANTLR start "rule__BooleanExpressionLevel1__Group__0"
    // InternalDsl.g:2457:1: rule__BooleanExpressionLevel1__Group__0 : rule__BooleanExpressionLevel1__Group__0__Impl rule__BooleanExpressionLevel1__Group__1 ;
    public final void rule__BooleanExpressionLevel1__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2461:1: ( rule__BooleanExpressionLevel1__Group__0__Impl rule__BooleanExpressionLevel1__Group__1 )
            // InternalDsl.g:2462:2: rule__BooleanExpressionLevel1__Group__0__Impl rule__BooleanExpressionLevel1__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__BooleanExpressionLevel1__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionLevel1__Group__1();

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
    // $ANTLR end "rule__BooleanExpressionLevel1__Group__0"


    // $ANTLR start "rule__BooleanExpressionLevel1__Group__0__Impl"
    // InternalDsl.g:2469:1: rule__BooleanExpressionLevel1__Group__0__Impl : ( ruleBooleanExpressionLevel2 ) ;
    public final void rule__BooleanExpressionLevel1__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2473:1: ( ( ruleBooleanExpressionLevel2 ) )
            // InternalDsl.g:2474:1: ( ruleBooleanExpressionLevel2 )
            {
            // InternalDsl.g:2474:1: ( ruleBooleanExpressionLevel2 )
            // InternalDsl.g:2475:2: ruleBooleanExpressionLevel2
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionLevel1Access().getBooleanExpressionLevel2ParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBooleanExpressionLevel2();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionLevel1Access().getBooleanExpressionLevel2ParserRuleCall_0()); 
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
    // $ANTLR end "rule__BooleanExpressionLevel1__Group__0__Impl"


    // $ANTLR start "rule__BooleanExpressionLevel1__Group__1"
    // InternalDsl.g:2484:1: rule__BooleanExpressionLevel1__Group__1 : rule__BooleanExpressionLevel1__Group__1__Impl ;
    public final void rule__BooleanExpressionLevel1__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2488:1: ( rule__BooleanExpressionLevel1__Group__1__Impl )
            // InternalDsl.g:2489:2: rule__BooleanExpressionLevel1__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionLevel1__Group__1__Impl();

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
    // $ANTLR end "rule__BooleanExpressionLevel1__Group__1"


    // $ANTLR start "rule__BooleanExpressionLevel1__Group__1__Impl"
    // InternalDsl.g:2495:1: rule__BooleanExpressionLevel1__Group__1__Impl : ( ( rule__BooleanExpressionLevel1__Group_1__0 )* ) ;
    public final void rule__BooleanExpressionLevel1__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2499:1: ( ( ( rule__BooleanExpressionLevel1__Group_1__0 )* ) )
            // InternalDsl.g:2500:1: ( ( rule__BooleanExpressionLevel1__Group_1__0 )* )
            {
            // InternalDsl.g:2500:1: ( ( rule__BooleanExpressionLevel1__Group_1__0 )* )
            // InternalDsl.g:2501:2: ( rule__BooleanExpressionLevel1__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionLevel1Access().getGroup_1()); 
            }
            // InternalDsl.g:2502:2: ( rule__BooleanExpressionLevel1__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=25 && LA20_0<=26)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalDsl.g:2502:3: rule__BooleanExpressionLevel1__Group_1__0
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__BooleanExpressionLevel1__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionLevel1Access().getGroup_1()); 
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
    // $ANTLR end "rule__BooleanExpressionLevel1__Group__1__Impl"


    // $ANTLR start "rule__BooleanExpressionLevel1__Group_1__0"
    // InternalDsl.g:2511:1: rule__BooleanExpressionLevel1__Group_1__0 : rule__BooleanExpressionLevel1__Group_1__0__Impl rule__BooleanExpressionLevel1__Group_1__1 ;
    public final void rule__BooleanExpressionLevel1__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2515:1: ( rule__BooleanExpressionLevel1__Group_1__0__Impl rule__BooleanExpressionLevel1__Group_1__1 )
            // InternalDsl.g:2516:2: rule__BooleanExpressionLevel1__Group_1__0__Impl rule__BooleanExpressionLevel1__Group_1__1
            {
            pushFollow(FOLLOW_27);
            rule__BooleanExpressionLevel1__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionLevel1__Group_1__1();

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
    // $ANTLR end "rule__BooleanExpressionLevel1__Group_1__0"


    // $ANTLR start "rule__BooleanExpressionLevel1__Group_1__0__Impl"
    // InternalDsl.g:2523:1: rule__BooleanExpressionLevel1__Group_1__0__Impl : ( () ) ;
    public final void rule__BooleanExpressionLevel1__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2527:1: ( ( () ) )
            // InternalDsl.g:2528:1: ( () )
            {
            // InternalDsl.g:2528:1: ( () )
            // InternalDsl.g:2529:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionLevel1Access().getExpressionBinOpLeftAction_1_0()); 
            }
            // InternalDsl.g:2530:2: ()
            // InternalDsl.g:2530:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionLevel1Access().getExpressionBinOpLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpressionLevel1__Group_1__0__Impl"


    // $ANTLR start "rule__BooleanExpressionLevel1__Group_1__1"
    // InternalDsl.g:2538:1: rule__BooleanExpressionLevel1__Group_1__1 : rule__BooleanExpressionLevel1__Group_1__1__Impl rule__BooleanExpressionLevel1__Group_1__2 ;
    public final void rule__BooleanExpressionLevel1__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2542:1: ( rule__BooleanExpressionLevel1__Group_1__1__Impl rule__BooleanExpressionLevel1__Group_1__2 )
            // InternalDsl.g:2543:2: rule__BooleanExpressionLevel1__Group_1__1__Impl rule__BooleanExpressionLevel1__Group_1__2
            {
            pushFollow(FOLLOW_29);
            rule__BooleanExpressionLevel1__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionLevel1__Group_1__2();

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
    // $ANTLR end "rule__BooleanExpressionLevel1__Group_1__1"


    // $ANTLR start "rule__BooleanExpressionLevel1__Group_1__1__Impl"
    // InternalDsl.g:2550:1: rule__BooleanExpressionLevel1__Group_1__1__Impl : ( ( rule__BooleanExpressionLevel1__BopAssignment_1_1 ) ) ;
    public final void rule__BooleanExpressionLevel1__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2554:1: ( ( ( rule__BooleanExpressionLevel1__BopAssignment_1_1 ) ) )
            // InternalDsl.g:2555:1: ( ( rule__BooleanExpressionLevel1__BopAssignment_1_1 ) )
            {
            // InternalDsl.g:2555:1: ( ( rule__BooleanExpressionLevel1__BopAssignment_1_1 ) )
            // InternalDsl.g:2556:2: ( rule__BooleanExpressionLevel1__BopAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionLevel1Access().getBopAssignment_1_1()); 
            }
            // InternalDsl.g:2557:2: ( rule__BooleanExpressionLevel1__BopAssignment_1_1 )
            // InternalDsl.g:2557:3: rule__BooleanExpressionLevel1__BopAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionLevel1__BopAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionLevel1Access().getBopAssignment_1_1()); 
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
    // $ANTLR end "rule__BooleanExpressionLevel1__Group_1__1__Impl"


    // $ANTLR start "rule__BooleanExpressionLevel1__Group_1__2"
    // InternalDsl.g:2565:1: rule__BooleanExpressionLevel1__Group_1__2 : rule__BooleanExpressionLevel1__Group_1__2__Impl ;
    public final void rule__BooleanExpressionLevel1__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2569:1: ( rule__BooleanExpressionLevel1__Group_1__2__Impl )
            // InternalDsl.g:2570:2: rule__BooleanExpressionLevel1__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionLevel1__Group_1__2__Impl();

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
    // $ANTLR end "rule__BooleanExpressionLevel1__Group_1__2"


    // $ANTLR start "rule__BooleanExpressionLevel1__Group_1__2__Impl"
    // InternalDsl.g:2576:1: rule__BooleanExpressionLevel1__Group_1__2__Impl : ( ( rule__BooleanExpressionLevel1__RightAssignment_1_2 ) ) ;
    public final void rule__BooleanExpressionLevel1__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2580:1: ( ( ( rule__BooleanExpressionLevel1__RightAssignment_1_2 ) ) )
            // InternalDsl.g:2581:1: ( ( rule__BooleanExpressionLevel1__RightAssignment_1_2 ) )
            {
            // InternalDsl.g:2581:1: ( ( rule__BooleanExpressionLevel1__RightAssignment_1_2 ) )
            // InternalDsl.g:2582:2: ( rule__BooleanExpressionLevel1__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionLevel1Access().getRightAssignment_1_2()); 
            }
            // InternalDsl.g:2583:2: ( rule__BooleanExpressionLevel1__RightAssignment_1_2 )
            // InternalDsl.g:2583:3: rule__BooleanExpressionLevel1__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionLevel1__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionLevel1Access().getRightAssignment_1_2()); 
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
    // $ANTLR end "rule__BooleanExpressionLevel1__Group_1__2__Impl"


    // $ANTLR start "rule__NotExpression__Group__0"
    // InternalDsl.g:2592:1: rule__NotExpression__Group__0 : rule__NotExpression__Group__0__Impl rule__NotExpression__Group__1 ;
    public final void rule__NotExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2596:1: ( rule__NotExpression__Group__0__Impl rule__NotExpression__Group__1 )
            // InternalDsl.g:2597:2: rule__NotExpression__Group__0__Impl rule__NotExpression__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__NotExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NotExpression__Group__1();

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
    // $ANTLR end "rule__NotExpression__Group__0"


    // $ANTLR start "rule__NotExpression__Group__0__Impl"
    // InternalDsl.g:2604:1: rule__NotExpression__Group__0__Impl : ( 'NOT' ) ;
    public final void rule__NotExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2608:1: ( ( 'NOT' ) )
            // InternalDsl.g:2609:1: ( 'NOT' )
            {
            // InternalDsl.g:2609:1: ( 'NOT' )
            // InternalDsl.g:2610:2: 'NOT'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getNOTKeyword_0()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotExpressionAccess().getNOTKeyword_0()); 
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
    // $ANTLR end "rule__NotExpression__Group__0__Impl"


    // $ANTLR start "rule__NotExpression__Group__1"
    // InternalDsl.g:2619:1: rule__NotExpression__Group__1 : rule__NotExpression__Group__1__Impl ;
    public final void rule__NotExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2623:1: ( rule__NotExpression__Group__1__Impl )
            // InternalDsl.g:2624:2: rule__NotExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NotExpression__Group__1__Impl();

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
    // $ANTLR end "rule__NotExpression__Group__1"


    // $ANTLR start "rule__NotExpression__Group__1__Impl"
    // InternalDsl.g:2630:1: rule__NotExpression__Group__1__Impl : ( ( rule__NotExpression__SubAssignment_1 ) ) ;
    public final void rule__NotExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2634:1: ( ( ( rule__NotExpression__SubAssignment_1 ) ) )
            // InternalDsl.g:2635:1: ( ( rule__NotExpression__SubAssignment_1 ) )
            {
            // InternalDsl.g:2635:1: ( ( rule__NotExpression__SubAssignment_1 ) )
            // InternalDsl.g:2636:2: ( rule__NotExpression__SubAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getSubAssignment_1()); 
            }
            // InternalDsl.g:2637:2: ( rule__NotExpression__SubAssignment_1 )
            // InternalDsl.g:2637:3: rule__NotExpression__SubAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NotExpression__SubAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotExpressionAccess().getSubAssignment_1()); 
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
    // $ANTLR end "rule__NotExpression__Group__1__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group__0"
    // InternalDsl.g:2646:1: rule__ComparisonExpression__Group__0 : rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1 ;
    public final void rule__ComparisonExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2650:1: ( rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1 )
            // InternalDsl.g:2651:2: rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__ComparisonExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__Group__1();

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
    // $ANTLR end "rule__ComparisonExpression__Group__0"


    // $ANTLR start "rule__ComparisonExpression__Group__0__Impl"
    // InternalDsl.g:2658:1: rule__ComparisonExpression__Group__0__Impl : ( () ) ;
    public final void rule__ComparisonExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2662:1: ( ( () ) )
            // InternalDsl.g:2663:1: ( () )
            {
            // InternalDsl.g:2663:1: ( () )
            // InternalDsl.g:2664:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonExpressionAccess().getExpressionCompOpAction_0()); 
            }
            // InternalDsl.g:2665:2: ()
            // InternalDsl.g:2665:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonExpressionAccess().getExpressionCompOpAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group__0__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group__1"
    // InternalDsl.g:2673:1: rule__ComparisonExpression__Group__1 : rule__ComparisonExpression__Group__1__Impl rule__ComparisonExpression__Group__2 ;
    public final void rule__ComparisonExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2677:1: ( rule__ComparisonExpression__Group__1__Impl rule__ComparisonExpression__Group__2 )
            // InternalDsl.g:2678:2: rule__ComparisonExpression__Group__1__Impl rule__ComparisonExpression__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__ComparisonExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__Group__2();

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
    // $ANTLR end "rule__ComparisonExpression__Group__1"


    // $ANTLR start "rule__ComparisonExpression__Group__1__Impl"
    // InternalDsl.g:2685:1: rule__ComparisonExpression__Group__1__Impl : ( ( rule__ComparisonExpression__LeftAssignment_1 ) ) ;
    public final void rule__ComparisonExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2689:1: ( ( ( rule__ComparisonExpression__LeftAssignment_1 ) ) )
            // InternalDsl.g:2690:1: ( ( rule__ComparisonExpression__LeftAssignment_1 ) )
            {
            // InternalDsl.g:2690:1: ( ( rule__ComparisonExpression__LeftAssignment_1 ) )
            // InternalDsl.g:2691:2: ( rule__ComparisonExpression__LeftAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonExpressionAccess().getLeftAssignment_1()); 
            }
            // InternalDsl.g:2692:2: ( rule__ComparisonExpression__LeftAssignment_1 )
            // InternalDsl.g:2692:3: rule__ComparisonExpression__LeftAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__LeftAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonExpressionAccess().getLeftAssignment_1()); 
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
    // $ANTLR end "rule__ComparisonExpression__Group__1__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group__2"
    // InternalDsl.g:2700:1: rule__ComparisonExpression__Group__2 : rule__ComparisonExpression__Group__2__Impl rule__ComparisonExpression__Group__3 ;
    public final void rule__ComparisonExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2704:1: ( rule__ComparisonExpression__Group__2__Impl rule__ComparisonExpression__Group__3 )
            // InternalDsl.g:2705:2: rule__ComparisonExpression__Group__2__Impl rule__ComparisonExpression__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__ComparisonExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__Group__3();

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
    // $ANTLR end "rule__ComparisonExpression__Group__2"


    // $ANTLR start "rule__ComparisonExpression__Group__2__Impl"
    // InternalDsl.g:2712:1: rule__ComparisonExpression__Group__2__Impl : ( ( rule__ComparisonExpression__OpAssignment_2 ) ) ;
    public final void rule__ComparisonExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2716:1: ( ( ( rule__ComparisonExpression__OpAssignment_2 ) ) )
            // InternalDsl.g:2717:1: ( ( rule__ComparisonExpression__OpAssignment_2 ) )
            {
            // InternalDsl.g:2717:1: ( ( rule__ComparisonExpression__OpAssignment_2 ) )
            // InternalDsl.g:2718:2: ( rule__ComparisonExpression__OpAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonExpressionAccess().getOpAssignment_2()); 
            }
            // InternalDsl.g:2719:2: ( rule__ComparisonExpression__OpAssignment_2 )
            // InternalDsl.g:2719:3: rule__ComparisonExpression__OpAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__OpAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonExpressionAccess().getOpAssignment_2()); 
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
    // $ANTLR end "rule__ComparisonExpression__Group__2__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group__3"
    // InternalDsl.g:2727:1: rule__ComparisonExpression__Group__3 : rule__ComparisonExpression__Group__3__Impl ;
    public final void rule__ComparisonExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2731:1: ( rule__ComparisonExpression__Group__3__Impl )
            // InternalDsl.g:2732:2: rule__ComparisonExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__Group__3__Impl();

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
    // $ANTLR end "rule__ComparisonExpression__Group__3"


    // $ANTLR start "rule__ComparisonExpression__Group__3__Impl"
    // InternalDsl.g:2738:1: rule__ComparisonExpression__Group__3__Impl : ( ( rule__ComparisonExpression__RightAssignment_3 ) ) ;
    public final void rule__ComparisonExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2742:1: ( ( ( rule__ComparisonExpression__RightAssignment_3 ) ) )
            // InternalDsl.g:2743:1: ( ( rule__ComparisonExpression__RightAssignment_3 ) )
            {
            // InternalDsl.g:2743:1: ( ( rule__ComparisonExpression__RightAssignment_3 ) )
            // InternalDsl.g:2744:2: ( rule__ComparisonExpression__RightAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonExpressionAccess().getRightAssignment_3()); 
            }
            // InternalDsl.g:2745:2: ( rule__ComparisonExpression__RightAssignment_3 )
            // InternalDsl.g:2745:3: rule__ComparisonExpression__RightAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonExpression__RightAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonExpressionAccess().getRightAssignment_3()); 
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
    // $ANTLR end "rule__ComparisonExpression__Group__3__Impl"


    // $ANTLR start "rule__BooleanExpressionBracket__Group__0"
    // InternalDsl.g:2754:1: rule__BooleanExpressionBracket__Group__0 : rule__BooleanExpressionBracket__Group__0__Impl rule__BooleanExpressionBracket__Group__1 ;
    public final void rule__BooleanExpressionBracket__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2758:1: ( rule__BooleanExpressionBracket__Group__0__Impl rule__BooleanExpressionBracket__Group__1 )
            // InternalDsl.g:2759:2: rule__BooleanExpressionBracket__Group__0__Impl rule__BooleanExpressionBracket__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__BooleanExpressionBracket__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionBracket__Group__1();

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
    // $ANTLR end "rule__BooleanExpressionBracket__Group__0"


    // $ANTLR start "rule__BooleanExpressionBracket__Group__0__Impl"
    // InternalDsl.g:2766:1: rule__BooleanExpressionBracket__Group__0__Impl : ( '(' ) ;
    public final void rule__BooleanExpressionBracket__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2770:1: ( ( '(' ) )
            // InternalDsl.g:2771:1: ( '(' )
            {
            // InternalDsl.g:2771:1: ( '(' )
            // InternalDsl.g:2772:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionBracketAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionBracketAccess().getLeftParenthesisKeyword_0()); 
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
    // $ANTLR end "rule__BooleanExpressionBracket__Group__0__Impl"


    // $ANTLR start "rule__BooleanExpressionBracket__Group__1"
    // InternalDsl.g:2781:1: rule__BooleanExpressionBracket__Group__1 : rule__BooleanExpressionBracket__Group__1__Impl rule__BooleanExpressionBracket__Group__2 ;
    public final void rule__BooleanExpressionBracket__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2785:1: ( rule__BooleanExpressionBracket__Group__1__Impl rule__BooleanExpressionBracket__Group__2 )
            // InternalDsl.g:2786:2: rule__BooleanExpressionBracket__Group__1__Impl rule__BooleanExpressionBracket__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__BooleanExpressionBracket__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionBracket__Group__2();

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
    // $ANTLR end "rule__BooleanExpressionBracket__Group__1"


    // $ANTLR start "rule__BooleanExpressionBracket__Group__1__Impl"
    // InternalDsl.g:2793:1: rule__BooleanExpressionBracket__Group__1__Impl : ( ( rule__BooleanExpressionBracket__SubAssignment_1 ) ) ;
    public final void rule__BooleanExpressionBracket__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2797:1: ( ( ( rule__BooleanExpressionBracket__SubAssignment_1 ) ) )
            // InternalDsl.g:2798:1: ( ( rule__BooleanExpressionBracket__SubAssignment_1 ) )
            {
            // InternalDsl.g:2798:1: ( ( rule__BooleanExpressionBracket__SubAssignment_1 ) )
            // InternalDsl.g:2799:2: ( rule__BooleanExpressionBracket__SubAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionBracketAccess().getSubAssignment_1()); 
            }
            // InternalDsl.g:2800:2: ( rule__BooleanExpressionBracket__SubAssignment_1 )
            // InternalDsl.g:2800:3: rule__BooleanExpressionBracket__SubAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionBracket__SubAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionBracketAccess().getSubAssignment_1()); 
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
    // $ANTLR end "rule__BooleanExpressionBracket__Group__1__Impl"


    // $ANTLR start "rule__BooleanExpressionBracket__Group__2"
    // InternalDsl.g:2808:1: rule__BooleanExpressionBracket__Group__2 : rule__BooleanExpressionBracket__Group__2__Impl ;
    public final void rule__BooleanExpressionBracket__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2812:1: ( rule__BooleanExpressionBracket__Group__2__Impl )
            // InternalDsl.g:2813:2: rule__BooleanExpressionBracket__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExpressionBracket__Group__2__Impl();

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
    // $ANTLR end "rule__BooleanExpressionBracket__Group__2"


    // $ANTLR start "rule__BooleanExpressionBracket__Group__2__Impl"
    // InternalDsl.g:2819:1: rule__BooleanExpressionBracket__Group__2__Impl : ( ')' ) ;
    public final void rule__BooleanExpressionBracket__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2823:1: ( ( ')' ) )
            // InternalDsl.g:2824:1: ( ')' )
            {
            // InternalDsl.g:2824:1: ( ')' )
            // InternalDsl.g:2825:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionBracketAccess().getRightParenthesisKeyword_2()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionBracketAccess().getRightParenthesisKeyword_2()); 
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
    // $ANTLR end "rule__BooleanExpressionBracket__Group__2__Impl"


    // $ANTLR start "rule__Mission__BehaviorListAssignment"
    // InternalDsl.g:2835:1: rule__Mission__BehaviorListAssignment : ( ruleBehavior ) ;
    public final void rule__Mission__BehaviorListAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2839:1: ( ( ruleBehavior ) )
            // InternalDsl.g:2840:2: ( ruleBehavior )
            {
            // InternalDsl.g:2840:2: ( ruleBehavior )
            // InternalDsl.g:2841:3: ruleBehavior
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMissionAccess().getBehaviorListBehaviorParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBehavior();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMissionAccess().getBehaviorListBehaviorParserRuleCall_0()); 
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
    // $ANTLR end "rule__Mission__BehaviorListAssignment"


    // $ANTLR start "rule__Behavior__NameAssignment_1"
    // InternalDsl.g:2850:1: rule__Behavior__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Behavior__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2854:1: ( ( RULE_ID ) )
            // InternalDsl.g:2855:2: ( RULE_ID )
            {
            // InternalDsl.g:2855:2: ( RULE_ID )
            // InternalDsl.g:2856:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBehaviorAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBehaviorAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Behavior__NameAssignment_1"


    // $ANTLR start "rule__Behavior__BehaviorTypeAssignment_3"
    // InternalDsl.g:2865:1: rule__Behavior__BehaviorTypeAssignment_3 : ( ruleBehaviorTypes ) ;
    public final void rule__Behavior__BehaviorTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2869:1: ( ( ruleBehaviorTypes ) )
            // InternalDsl.g:2870:2: ( ruleBehaviorTypes )
            {
            // InternalDsl.g:2870:2: ( ruleBehaviorTypes )
            // InternalDsl.g:2871:3: ruleBehaviorTypes
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBehaviorAccess().getBehaviorTypeBehaviorTypesEnumRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBehaviorTypes();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBehaviorAccess().getBehaviorTypeBehaviorTypesEnumRuleCall_3_0()); 
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
    // $ANTLR end "rule__Behavior__BehaviorTypeAssignment_3"


    // $ANTLR start "rule__Behavior__PrioAssignment_5"
    // InternalDsl.g:2880:1: rule__Behavior__PrioAssignment_5 : ( RULE_INT ) ;
    public final void rule__Behavior__PrioAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2884:1: ( ( RULE_INT ) )
            // InternalDsl.g:2885:2: ( RULE_INT )
            {
            // InternalDsl.g:2885:2: ( RULE_INT )
            // InternalDsl.g:2886:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBehaviorAccess().getPrioINTTerminalRuleCall_5_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBehaviorAccess().getPrioINTTerminalRuleCall_5_0()); 
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
    // $ANTLR end "rule__Behavior__PrioAssignment_5"


    // $ANTLR start "rule__Behavior__ControlAssignment_7"
    // InternalDsl.g:2895:1: rule__Behavior__ControlAssignment_7 : ( ruleTakeControl ) ;
    public final void rule__Behavior__ControlAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2899:1: ( ( ruleTakeControl ) )
            // InternalDsl.g:2900:2: ( ruleTakeControl )
            {
            // InternalDsl.g:2900:2: ( ruleTakeControl )
            // InternalDsl.g:2901:3: ruleTakeControl
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBehaviorAccess().getControlTakeControlParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTakeControl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBehaviorAccess().getControlTakeControlParserRuleCall_7_0()); 
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
    // $ANTLR end "rule__Behavior__ControlAssignment_7"


    // $ANTLR start "rule__Behavior__ActionsAssignment_9"
    // InternalDsl.g:2910:1: rule__Behavior__ActionsAssignment_9 : ( ruleActions ) ;
    public final void rule__Behavior__ActionsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2914:1: ( ( ruleActions ) )
            // InternalDsl.g:2915:2: ( ruleActions )
            {
            // InternalDsl.g:2915:2: ( ruleActions )
            // InternalDsl.g:2916:3: ruleActions
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBehaviorAccess().getActionsActionsEnumRuleCall_9_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleActions();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBehaviorAccess().getActionsActionsEnumRuleCall_9_0()); 
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
    // $ANTLR end "rule__Behavior__ActionsAssignment_9"


    // $ANTLR start "rule__TakeControl__TakecontrolAssignment_0"
    // InternalDsl.g:2925:1: rule__TakeControl__TakecontrolAssignment_0 : ( ruleBooleanExpression ) ;
    public final void rule__TakeControl__TakecontrolAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2929:1: ( ( ruleBooleanExpression ) )
            // InternalDsl.g:2930:2: ( ruleBooleanExpression )
            {
            // InternalDsl.g:2930:2: ( ruleBooleanExpression )
            // InternalDsl.g:2931:3: ruleBooleanExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTakeControlAccess().getTakecontrolBooleanExpressionParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBooleanExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTakeControlAccess().getTakecontrolBooleanExpressionParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__TakeControl__TakecontrolAssignment_0"


    // $ANTLR start "rule__MeasurableConditions__MeasurableConditionsAssignment"
    // InternalDsl.g:2940:1: rule__MeasurableConditions__MeasurableConditionsAssignment : ( ruleMeasurableCondition ) ;
    public final void rule__MeasurableConditions__MeasurableConditionsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2944:1: ( ( ruleMeasurableCondition ) )
            // InternalDsl.g:2945:2: ( ruleMeasurableCondition )
            {
            // InternalDsl.g:2945:2: ( ruleMeasurableCondition )
            // InternalDsl.g:2946:3: ruleMeasurableCondition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMeasurableConditionsAccess().getMeasurableConditionsMeasurableConditionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMeasurableCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMeasurableConditionsAccess().getMeasurableConditionsMeasurableConditionParserRuleCall_0()); 
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
    // $ANTLR end "rule__MeasurableConditions__MeasurableConditionsAssignment"


    // $ANTLR start "rule__MeasurableCondition__MeasurableAssignment_0"
    // InternalDsl.g:2955:1: rule__MeasurableCondition__MeasurableAssignment_0 : ( ruleMeasurables ) ;
    public final void rule__MeasurableCondition__MeasurableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2959:1: ( ( ruleMeasurables ) )
            // InternalDsl.g:2960:2: ( ruleMeasurables )
            {
            // InternalDsl.g:2960:2: ( ruleMeasurables )
            // InternalDsl.g:2961:3: ruleMeasurables
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMeasurableConditionAccess().getMeasurableMeasurablesEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMeasurables();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMeasurableConditionAccess().getMeasurableMeasurablesEnumRuleCall_0_0()); 
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
    // $ANTLR end "rule__MeasurableCondition__MeasurableAssignment_0"


    // $ANTLR start "rule__MeasurableCondition__UnitAssignment_1"
    // InternalDsl.g:2970:1: rule__MeasurableCondition__UnitAssignment_1 : ( ruleMeasurementUnit ) ;
    public final void rule__MeasurableCondition__UnitAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2974:1: ( ( ruleMeasurementUnit ) )
            // InternalDsl.g:2975:2: ( ruleMeasurementUnit )
            {
            // InternalDsl.g:2975:2: ( ruleMeasurementUnit )
            // InternalDsl.g:2976:3: ruleMeasurementUnit
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMeasurableConditionAccess().getUnitMeasurementUnitEnumRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMeasurementUnit();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMeasurableConditionAccess().getUnitMeasurementUnitEnumRuleCall_1_0()); 
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
    // $ANTLR end "rule__MeasurableCondition__UnitAssignment_1"


    // $ANTLR start "rule__MeasurableCondition__ValueAssignment_2"
    // InternalDsl.g:2985:1: rule__MeasurableCondition__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__MeasurableCondition__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2989:1: ( ( RULE_STRING ) )
            // InternalDsl.g:2990:2: ( RULE_STRING )
            {
            // InternalDsl.g:2990:2: ( RULE_STRING )
            // InternalDsl.g:2991:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMeasurableConditionAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMeasurableConditionAccess().getValueSTRINGTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__MeasurableCondition__ValueAssignment_2"


    // $ANTLR start "rule__MeasurableCondition__OperatorAssignment_3"
    // InternalDsl.g:3000:1: rule__MeasurableCondition__OperatorAssignment_3 : ( ruleCompareOperator ) ;
    public final void rule__MeasurableCondition__OperatorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3004:1: ( ( ruleCompareOperator ) )
            // InternalDsl.g:3005:2: ( ruleCompareOperator )
            {
            // InternalDsl.g:3005:2: ( ruleCompareOperator )
            // InternalDsl.g:3006:3: ruleCompareOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMeasurableConditionAccess().getOperatorCompareOperatorEnumRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCompareOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMeasurableConditionAccess().getOperatorCompareOperatorEnumRuleCall_3_0()); 
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
    // $ANTLR end "rule__MeasurableCondition__OperatorAssignment_3"


    // $ANTLR start "rule__ExpressionLevel1__RightAssignment_1_0_2"
    // InternalDsl.g:3015:1: rule__ExpressionLevel1__RightAssignment_1_0_2 : ( ruleExpressionLevel2 ) ;
    public final void rule__ExpressionLevel1__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3019:1: ( ( ruleExpressionLevel2 ) )
            // InternalDsl.g:3020:2: ( ruleExpressionLevel2 )
            {
            // InternalDsl.g:3020:2: ( ruleExpressionLevel2 )
            // InternalDsl.g:3021:3: ruleExpressionLevel2
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel1Access().getRightExpressionLevel2ParserRuleCall_1_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressionLevel2();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel1Access().getRightExpressionLevel2ParserRuleCall_1_0_2_0()); 
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
    // $ANTLR end "rule__ExpressionLevel1__RightAssignment_1_0_2"


    // $ANTLR start "rule__ExpressionLevel1__RightAssignment_1_1_2"
    // InternalDsl.g:3030:1: rule__ExpressionLevel1__RightAssignment_1_1_2 : ( ruleExpressionLevel2 ) ;
    public final void rule__ExpressionLevel1__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3034:1: ( ( ruleExpressionLevel2 ) )
            // InternalDsl.g:3035:2: ( ruleExpressionLevel2 )
            {
            // InternalDsl.g:3035:2: ( ruleExpressionLevel2 )
            // InternalDsl.g:3036:3: ruleExpressionLevel2
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel1Access().getRightExpressionLevel2ParserRuleCall_1_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressionLevel2();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel1Access().getRightExpressionLevel2ParserRuleCall_1_1_2_0()); 
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
    // $ANTLR end "rule__ExpressionLevel1__RightAssignment_1_1_2"


    // $ANTLR start "rule__ExpressionLevel2__RightAssignment_1_0_2"
    // InternalDsl.g:3045:1: rule__ExpressionLevel2__RightAssignment_1_0_2 : ( ruleExpressionLevel3 ) ;
    public final void rule__ExpressionLevel2__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3049:1: ( ( ruleExpressionLevel3 ) )
            // InternalDsl.g:3050:2: ( ruleExpressionLevel3 )
            {
            // InternalDsl.g:3050:2: ( ruleExpressionLevel3 )
            // InternalDsl.g:3051:3: ruleExpressionLevel3
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressionLevel3();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_0_2_0()); 
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
    // $ANTLR end "rule__ExpressionLevel2__RightAssignment_1_0_2"


    // $ANTLR start "rule__ExpressionLevel2__RightAssignment_1_1_2"
    // InternalDsl.g:3060:1: rule__ExpressionLevel2__RightAssignment_1_1_2 : ( ruleExpressionLevel3 ) ;
    public final void rule__ExpressionLevel2__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3064:1: ( ( ruleExpressionLevel3 ) )
            // InternalDsl.g:3065:2: ( ruleExpressionLevel3 )
            {
            // InternalDsl.g:3065:2: ( ruleExpressionLevel3 )
            // InternalDsl.g:3066:3: ruleExpressionLevel3
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressionLevel3();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_1_2_0()); 
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
    // $ANTLR end "rule__ExpressionLevel2__RightAssignment_1_1_2"


    // $ANTLR start "rule__ExpressionLevel2__RightAssignment_1_2_2"
    // InternalDsl.g:3075:1: rule__ExpressionLevel2__RightAssignment_1_2_2 : ( ruleExpressionLevel3 ) ;
    public final void rule__ExpressionLevel2__RightAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3079:1: ( ( ruleExpressionLevel3 ) )
            // InternalDsl.g:3080:2: ( ruleExpressionLevel3 )
            {
            // InternalDsl.g:3080:2: ( ruleExpressionLevel3 )
            // InternalDsl.g:3081:3: ruleExpressionLevel3
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_2_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressionLevel3();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_2_2_0()); 
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
    // $ANTLR end "rule__ExpressionLevel2__RightAssignment_1_2_2"


    // $ANTLR start "rule__ExpressionLevel2__RightAssignment_1_3_2"
    // InternalDsl.g:3090:1: rule__ExpressionLevel2__RightAssignment_1_3_2 : ( ruleExpressionLevel3 ) ;
    public final void rule__ExpressionLevel2__RightAssignment_1_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3094:1: ( ( ruleExpressionLevel3 ) )
            // InternalDsl.g:3095:2: ( ruleExpressionLevel3 )
            {
            // InternalDsl.g:3095:2: ( ruleExpressionLevel3 )
            // InternalDsl.g:3096:3: ruleExpressionLevel3
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_3_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressionLevel3();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_3_2_0()); 
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
    // $ANTLR end "rule__ExpressionLevel2__RightAssignment_1_3_2"


    // $ANTLR start "rule__ExpressionLevel2__RightAssignment_1_4_2"
    // InternalDsl.g:3105:1: rule__ExpressionLevel2__RightAssignment_1_4_2 : ( ruleExpressionLevel3 ) ;
    public final void rule__ExpressionLevel2__RightAssignment_1_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3109:1: ( ( ruleExpressionLevel3 ) )
            // InternalDsl.g:3110:2: ( ruleExpressionLevel3 )
            {
            // InternalDsl.g:3110:2: ( ruleExpressionLevel3 )
            // InternalDsl.g:3111:3: ruleExpressionLevel3
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_4_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressionLevel3();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel2Access().getRightExpressionLevel3ParserRuleCall_1_4_2_0()); 
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
    // $ANTLR end "rule__ExpressionLevel2__RightAssignment_1_4_2"


    // $ANTLR start "rule__ExpressionLevel3__RightAssignment_1_2"
    // InternalDsl.g:3120:1: rule__ExpressionLevel3__RightAssignment_1_2 : ( ruleExpressionLevel3 ) ;
    public final void rule__ExpressionLevel3__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3124:1: ( ( ruleExpressionLevel3 ) )
            // InternalDsl.g:3125:2: ( ruleExpressionLevel3 )
            {
            // InternalDsl.g:3125:2: ( ruleExpressionLevel3 )
            // InternalDsl.g:3126:3: ruleExpressionLevel3
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionLevel3Access().getRightExpressionLevel3ParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressionLevel3();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionLevel3Access().getRightExpressionLevel3ParserRuleCall_1_2_0()); 
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
    // $ANTLR end "rule__ExpressionLevel3__RightAssignment_1_2"


    // $ANTLR start "rule__ExpressionMinus__SubAssignment_1"
    // InternalDsl.g:3135:1: rule__ExpressionMinus__SubAssignment_1 : ( ruleExpressionLevel5 ) ;
    public final void rule__ExpressionMinus__SubAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3139:1: ( ( ruleExpressionLevel5 ) )
            // InternalDsl.g:3140:2: ( ruleExpressionLevel5 )
            {
            // InternalDsl.g:3140:2: ( ruleExpressionLevel5 )
            // InternalDsl.g:3141:3: ruleExpressionLevel5
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionMinusAccess().getSubExpressionLevel5ParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressionLevel5();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionMinusAccess().getSubExpressionLevel5ParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__ExpressionMinus__SubAssignment_1"


    // $ANTLR start "rule__ExpressionPlus__SubAssignment_1"
    // InternalDsl.g:3150:1: rule__ExpressionPlus__SubAssignment_1 : ( ruleExpressionLevel5 ) ;
    public final void rule__ExpressionPlus__SubAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3154:1: ( ( ruleExpressionLevel5 ) )
            // InternalDsl.g:3155:2: ( ruleExpressionLevel5 )
            {
            // InternalDsl.g:3155:2: ( ruleExpressionLevel5 )
            // InternalDsl.g:3156:3: ruleExpressionLevel5
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionPlusAccess().getSubExpressionLevel5ParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpressionLevel5();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionPlusAccess().getSubExpressionLevel5ParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__ExpressionPlus__SubAssignment_1"


    // $ANTLR start "rule__ExpressionBracket__SubAssignment_1"
    // InternalDsl.g:3165:1: rule__ExpressionBracket__SubAssignment_1 : ( ruleIntExpression ) ;
    public final void rule__ExpressionBracket__SubAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3169:1: ( ( ruleIntExpression ) )
            // InternalDsl.g:3170:2: ( ruleIntExpression )
            {
            // InternalDsl.g:3170:2: ( ruleIntExpression )
            // InternalDsl.g:3171:3: ruleIntExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionBracketAccess().getSubIntExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleIntExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionBracketAccess().getSubIntExpressionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__ExpressionBracket__SubAssignment_1"


    // $ANTLR start "rule__ExpressionConstantInt__ValueAssignment"
    // InternalDsl.g:3180:1: rule__ExpressionConstantInt__ValueAssignment : ( RULE_INT ) ;
    public final void rule__ExpressionConstantInt__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3184:1: ( ( RULE_INT ) )
            // InternalDsl.g:3185:2: ( RULE_INT )
            {
            // InternalDsl.g:3185:2: ( RULE_INT )
            // InternalDsl.g:3186:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionConstantIntAccess().getValueINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionConstantIntAccess().getValueINTTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__ExpressionConstantInt__ValueAssignment"


    // $ANTLR start "rule__BooleanExpressionLevel1__BopAssignment_1_1"
    // InternalDsl.g:3195:1: rule__BooleanExpressionLevel1__BopAssignment_1_1 : ( ruleBinaryBooleanOperator ) ;
    public final void rule__BooleanExpressionLevel1__BopAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3199:1: ( ( ruleBinaryBooleanOperator ) )
            // InternalDsl.g:3200:2: ( ruleBinaryBooleanOperator )
            {
            // InternalDsl.g:3200:2: ( ruleBinaryBooleanOperator )
            // InternalDsl.g:3201:3: ruleBinaryBooleanOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionLevel1Access().getBopBinaryBooleanOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBinaryBooleanOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionLevel1Access().getBopBinaryBooleanOperatorEnumRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__BooleanExpressionLevel1__BopAssignment_1_1"


    // $ANTLR start "rule__BooleanExpressionLevel1__RightAssignment_1_2"
    // InternalDsl.g:3210:1: rule__BooleanExpressionLevel1__RightAssignment_1_2 : ( ruleBooleanExpressionLevel2 ) ;
    public final void rule__BooleanExpressionLevel1__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3214:1: ( ( ruleBooleanExpressionLevel2 ) )
            // InternalDsl.g:3215:2: ( ruleBooleanExpressionLevel2 )
            {
            // InternalDsl.g:3215:2: ( ruleBooleanExpressionLevel2 )
            // InternalDsl.g:3216:3: ruleBooleanExpressionLevel2
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionLevel1Access().getRightBooleanExpressionLevel2ParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBooleanExpressionLevel2();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionLevel1Access().getRightBooleanExpressionLevel2ParserRuleCall_1_2_0()); 
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
    // $ANTLR end "rule__BooleanExpressionLevel1__RightAssignment_1_2"


    // $ANTLR start "rule__NotExpression__SubAssignment_1"
    // InternalDsl.g:3225:1: rule__NotExpression__SubAssignment_1 : ( ruleBooleanExpressionLevel3 ) ;
    public final void rule__NotExpression__SubAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3229:1: ( ( ruleBooleanExpressionLevel3 ) )
            // InternalDsl.g:3230:2: ( ruleBooleanExpressionLevel3 )
            {
            // InternalDsl.g:3230:2: ( ruleBooleanExpressionLevel3 )
            // InternalDsl.g:3231:3: ruleBooleanExpressionLevel3
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotExpressionAccess().getSubBooleanExpressionLevel3ParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBooleanExpressionLevel3();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotExpressionAccess().getSubBooleanExpressionLevel3ParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__NotExpression__SubAssignment_1"


    // $ANTLR start "rule__ComparisonExpression__LeftAssignment_1"
    // InternalDsl.g:3240:1: rule__ComparisonExpression__LeftAssignment_1 : ( ruleIntExpression ) ;
    public final void rule__ComparisonExpression__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3244:1: ( ( ruleIntExpression ) )
            // InternalDsl.g:3245:2: ( ruleIntExpression )
            {
            // InternalDsl.g:3245:2: ( ruleIntExpression )
            // InternalDsl.g:3246:3: ruleIntExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonExpressionAccess().getLeftIntExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleIntExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonExpressionAccess().getLeftIntExpressionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__ComparisonExpression__LeftAssignment_1"


    // $ANTLR start "rule__ComparisonExpression__OpAssignment_2"
    // InternalDsl.g:3255:1: rule__ComparisonExpression__OpAssignment_2 : ( ruleCompareOperator ) ;
    public final void rule__ComparisonExpression__OpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3259:1: ( ( ruleCompareOperator ) )
            // InternalDsl.g:3260:2: ( ruleCompareOperator )
            {
            // InternalDsl.g:3260:2: ( ruleCompareOperator )
            // InternalDsl.g:3261:3: ruleCompareOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonExpressionAccess().getOpCompareOperatorEnumRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCompareOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonExpressionAccess().getOpCompareOperatorEnumRuleCall_2_0()); 
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
    // $ANTLR end "rule__ComparisonExpression__OpAssignment_2"


    // $ANTLR start "rule__ComparisonExpression__RightAssignment_3"
    // InternalDsl.g:3270:1: rule__ComparisonExpression__RightAssignment_3 : ( ruleIntExpression ) ;
    public final void rule__ComparisonExpression__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3274:1: ( ( ruleIntExpression ) )
            // InternalDsl.g:3275:2: ( ruleIntExpression )
            {
            // InternalDsl.g:3275:2: ( ruleIntExpression )
            // InternalDsl.g:3276:3: ruleIntExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonExpressionAccess().getRightIntExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleIntExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonExpressionAccess().getRightIntExpressionParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__ComparisonExpression__RightAssignment_3"


    // $ANTLR start "rule__BooleanExpressionBracket__SubAssignment_1"
    // InternalDsl.g:3285:1: rule__BooleanExpressionBracket__SubAssignment_1 : ( ruleBooleanExpression ) ;
    public final void rule__BooleanExpressionBracket__SubAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3289:1: ( ( ruleBooleanExpression ) )
            // InternalDsl.g:3290:2: ( ruleBooleanExpression )
            {
            // InternalDsl.g:3290:2: ( ruleBooleanExpression )
            // InternalDsl.g:3291:3: ruleBooleanExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionBracketAccess().getSubBooleanExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBooleanExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionBracketAccess().getSubBooleanExpressionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__BooleanExpressionBracket__SubAssignment_1"


    // $ANTLR start "rule__BooleanExpressionConstant__ValueAssignment"
    // InternalDsl.g:3300:1: rule__BooleanExpressionConstant__ValueAssignment : ( RULE_BOOL_LITERAL ) ;
    public final void rule__BooleanExpressionConstant__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3304:1: ( ( RULE_BOOL_LITERAL ) )
            // InternalDsl.g:3305:2: ( RULE_BOOL_LITERAL )
            {
            // InternalDsl.g:3305:2: ( RULE_BOOL_LITERAL )
            // InternalDsl.g:3306:3: RULE_BOOL_LITERAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanExpressionConstantAccess().getValueBOOL_LITERALTerminalRuleCall_0()); 
            }
            match(input,RULE_BOOL_LITERAL,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanExpressionConstantAccess().getValueBOOL_LITERALTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__BooleanExpressionConstant__ValueAssignment"

    // $ANTLR start synpred13_InternalDsl
    public final void synpred13_InternalDsl_fragment() throws RecognitionException {   
        // InternalDsl.g:893:2: ( ( ( ruleComparisonExpression ) ) )
        // InternalDsl.g:893:2: ( ( ruleComparisonExpression ) )
        {
        // InternalDsl.g:893:2: ( ( ruleComparisonExpression ) )
        // InternalDsl.g:894:3: ( ruleComparisonExpression )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getBooleanExpressionLevel3Access().getComparisonExpressionParserRuleCall_0()); 
        }
        // InternalDsl.g:895:3: ( ruleComparisonExpression )
        // InternalDsl.g:895:4: ruleComparisonExpression
        {
        pushFollow(FOLLOW_2);
        ruleComparisonExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred13_InternalDsl

    // $ANTLR start synpred14_InternalDsl
    public final void synpred14_InternalDsl_fragment() throws RecognitionException {   
        // InternalDsl.g:899:2: ( ( ruleBooleanExpressionBracket ) )
        // InternalDsl.g:899:2: ( ruleBooleanExpressionBracket )
        {
        // InternalDsl.g:899:2: ( ruleBooleanExpressionBracket )
        // InternalDsl.g:900:3: ruleBooleanExpressionBracket
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getBooleanExpressionLevel3Access().getBooleanExpressionBracketParserRuleCall_1()); 
        }
        pushFollow(FOLLOW_2);
        ruleBooleanExpressionBracket();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred14_InternalDsl

    // Delegated rules

    public final boolean synpred14_InternalDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalDsl_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000000F0002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000800001000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000001000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000140C0000F00A0L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001F00000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000001F8000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000040C000000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00001F0000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00001F0000000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000140C0000000A0L});

}