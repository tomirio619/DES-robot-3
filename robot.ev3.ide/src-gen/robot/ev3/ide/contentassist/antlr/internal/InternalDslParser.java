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

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_DECIMAL", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'LEFT'", "'RIGHT'", "'BOTH'", "'ROTATELEFT'", "'ROTATERIGHT'", "'DRIVEFORWARD'", "'DRIVEBACKWARD'", "'STOP'", "'TURNAROUND'", "'BEEP'", "'MEASURE'", "'DRIVETOEDGE'", "'BLACK'", "'BLUE'", "'CYAN'", "'DARK_GRAY'", "'GRAY'", "'GREEN'", "'LIGHT_GRAY'", "'MAGENTA'", "'ORANGE'", "'PINK'", "'RED'", "'WHITE'", "'YELLOW'", "'=='", "'!='", "'>='", "'>'", "'<='", "'<'", "'Mission:'", "'Task:'", "'Do:'", "'Not:'", "'Uses:'", "'ColorSensor'", "'On'", "'DetectedColor'", "'is:'", "'TouchSensor'", "'TouchedSide:'", "'USensor'", "'Distance:'", "'AvoidObjects'"
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
    // InternalDsl.g:53:1: entryRuleMission : ruleMission EOF ;
    public final void entryRuleMission() throws RecognitionException {
        try {
            // InternalDsl.g:54:1: ( ruleMission EOF )
            // InternalDsl.g:55:1: ruleMission EOF
            {
             before(grammarAccess.getMissionRule()); 
            pushFollow(FOLLOW_1);
            ruleMission();

            state._fsp--;

             after(grammarAccess.getMissionRule()); 
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
    // $ANTLR end "entryRuleMission"


    // $ANTLR start "ruleMission"
    // InternalDsl.g:62:1: ruleMission : ( ( rule__Mission__Group__0 ) ) ;
    public final void ruleMission() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:66:2: ( ( ( rule__Mission__Group__0 ) ) )
            // InternalDsl.g:67:2: ( ( rule__Mission__Group__0 ) )
            {
            // InternalDsl.g:67:2: ( ( rule__Mission__Group__0 ) )
            // InternalDsl.g:68:3: ( rule__Mission__Group__0 )
            {
             before(grammarAccess.getMissionAccess().getGroup()); 
            // InternalDsl.g:69:3: ( rule__Mission__Group__0 )
            // InternalDsl.g:69:4: rule__Mission__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Mission__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleTask"
    // InternalDsl.g:78:1: entryRuleTask : ruleTask EOF ;
    public final void entryRuleTask() throws RecognitionException {
        try {
            // InternalDsl.g:79:1: ( ruleTask EOF )
            // InternalDsl.g:80:1: ruleTask EOF
            {
             before(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_1);
            ruleTask();

            state._fsp--;

             after(grammarAccess.getTaskRule()); 
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
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // InternalDsl.g:87:1: ruleTask : ( ( rule__Task__Group__0 ) ) ;
    public final void ruleTask() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:91:2: ( ( ( rule__Task__Group__0 ) ) )
            // InternalDsl.g:92:2: ( ( rule__Task__Group__0 ) )
            {
            // InternalDsl.g:92:2: ( ( rule__Task__Group__0 ) )
            // InternalDsl.g:93:3: ( rule__Task__Group__0 )
            {
             before(grammarAccess.getTaskAccess().getGroup()); 
            // InternalDsl.g:94:3: ( rule__Task__Group__0 )
            // InternalDsl.g:94:4: rule__Task__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRuleIgnorables"
    // InternalDsl.g:103:1: entryRuleIgnorables : ruleIgnorables EOF ;
    public final void entryRuleIgnorables() throws RecognitionException {
        try {
            // InternalDsl.g:104:1: ( ruleIgnorables EOF )
            // InternalDsl.g:105:1: ruleIgnorables EOF
            {
             before(grammarAccess.getIgnorablesRule()); 
            pushFollow(FOLLOW_1);
            ruleIgnorables();

            state._fsp--;

             after(grammarAccess.getIgnorablesRule()); 
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
    // $ANTLR end "entryRuleIgnorables"


    // $ANTLR start "ruleIgnorables"
    // InternalDsl.g:112:1: ruleIgnorables : ( ( rule__Ignorables__AVOID_OBJECTSAssignment ) ) ;
    public final void ruleIgnorables() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:116:2: ( ( ( rule__Ignorables__AVOID_OBJECTSAssignment ) ) )
            // InternalDsl.g:117:2: ( ( rule__Ignorables__AVOID_OBJECTSAssignment ) )
            {
            // InternalDsl.g:117:2: ( ( rule__Ignorables__AVOID_OBJECTSAssignment ) )
            // InternalDsl.g:118:3: ( rule__Ignorables__AVOID_OBJECTSAssignment )
            {
             before(grammarAccess.getIgnorablesAccess().getAVOID_OBJECTSAssignment()); 
            // InternalDsl.g:119:3: ( rule__Ignorables__AVOID_OBJECTSAssignment )
            // InternalDsl.g:119:4: rule__Ignorables__AVOID_OBJECTSAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Ignorables__AVOID_OBJECTSAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIgnorablesAccess().getAVOID_OBJECTSAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIgnorables"


    // $ANTLR start "entryRuleSensorType"
    // InternalDsl.g:128:1: entryRuleSensorType : ruleSensorType EOF ;
    public final void entryRuleSensorType() throws RecognitionException {
        try {
            // InternalDsl.g:129:1: ( ruleSensorType EOF )
            // InternalDsl.g:130:1: ruleSensorType EOF
            {
             before(grammarAccess.getSensorTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleSensorType();

            state._fsp--;

             after(grammarAccess.getSensorTypeRule()); 
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
    // $ANTLR end "entryRuleSensorType"


    // $ANTLR start "ruleSensorType"
    // InternalDsl.g:137:1: ruleSensorType : ( ( rule__SensorType__Alternatives ) ) ;
    public final void ruleSensorType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:141:2: ( ( ( rule__SensorType__Alternatives ) ) )
            // InternalDsl.g:142:2: ( ( rule__SensorType__Alternatives ) )
            {
            // InternalDsl.g:142:2: ( ( rule__SensorType__Alternatives ) )
            // InternalDsl.g:143:3: ( rule__SensorType__Alternatives )
            {
             before(grammarAccess.getSensorTypeAccess().getAlternatives()); 
            // InternalDsl.g:144:3: ( rule__SensorType__Alternatives )
            // InternalDsl.g:144:4: rule__SensorType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SensorType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSensorTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSensorType"


    // $ANTLR start "entryRuleColorSensor"
    // InternalDsl.g:153:1: entryRuleColorSensor : ruleColorSensor EOF ;
    public final void entryRuleColorSensor() throws RecognitionException {
        try {
            // InternalDsl.g:154:1: ( ruleColorSensor EOF )
            // InternalDsl.g:155:1: ruleColorSensor EOF
            {
             before(grammarAccess.getColorSensorRule()); 
            pushFollow(FOLLOW_1);
            ruleColorSensor();

            state._fsp--;

             after(grammarAccess.getColorSensorRule()); 
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
    // $ANTLR end "entryRuleColorSensor"


    // $ANTLR start "ruleColorSensor"
    // InternalDsl.g:162:1: ruleColorSensor : ( ( rule__ColorSensor__Group__0 ) ) ;
    public final void ruleColorSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:166:2: ( ( ( rule__ColorSensor__Group__0 ) ) )
            // InternalDsl.g:167:2: ( ( rule__ColorSensor__Group__0 ) )
            {
            // InternalDsl.g:167:2: ( ( rule__ColorSensor__Group__0 ) )
            // InternalDsl.g:168:3: ( rule__ColorSensor__Group__0 )
            {
             before(grammarAccess.getColorSensorAccess().getGroup()); 
            // InternalDsl.g:169:3: ( rule__ColorSensor__Group__0 )
            // InternalDsl.g:169:4: rule__ColorSensor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ColorSensor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getColorSensorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColorSensor"


    // $ANTLR start "entryRuleTouchSensor"
    // InternalDsl.g:178:1: entryRuleTouchSensor : ruleTouchSensor EOF ;
    public final void entryRuleTouchSensor() throws RecognitionException {
        try {
            // InternalDsl.g:179:1: ( ruleTouchSensor EOF )
            // InternalDsl.g:180:1: ruleTouchSensor EOF
            {
             before(grammarAccess.getTouchSensorRule()); 
            pushFollow(FOLLOW_1);
            ruleTouchSensor();

            state._fsp--;

             after(grammarAccess.getTouchSensorRule()); 
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
    // $ANTLR end "entryRuleTouchSensor"


    // $ANTLR start "ruleTouchSensor"
    // InternalDsl.g:187:1: ruleTouchSensor : ( ( rule__TouchSensor__Group__0 ) ) ;
    public final void ruleTouchSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:191:2: ( ( ( rule__TouchSensor__Group__0 ) ) )
            // InternalDsl.g:192:2: ( ( rule__TouchSensor__Group__0 ) )
            {
            // InternalDsl.g:192:2: ( ( rule__TouchSensor__Group__0 ) )
            // InternalDsl.g:193:3: ( rule__TouchSensor__Group__0 )
            {
             before(grammarAccess.getTouchSensorAccess().getGroup()); 
            // InternalDsl.g:194:3: ( rule__TouchSensor__Group__0 )
            // InternalDsl.g:194:4: rule__TouchSensor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TouchSensor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTouchSensorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTouchSensor"


    // $ANTLR start "entryRuleUltrasonicSensor"
    // InternalDsl.g:203:1: entryRuleUltrasonicSensor : ruleUltrasonicSensor EOF ;
    public final void entryRuleUltrasonicSensor() throws RecognitionException {
        try {
            // InternalDsl.g:204:1: ( ruleUltrasonicSensor EOF )
            // InternalDsl.g:205:1: ruleUltrasonicSensor EOF
            {
             before(grammarAccess.getUltrasonicSensorRule()); 
            pushFollow(FOLLOW_1);
            ruleUltrasonicSensor();

            state._fsp--;

             after(grammarAccess.getUltrasonicSensorRule()); 
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
    // $ANTLR end "entryRuleUltrasonicSensor"


    // $ANTLR start "ruleUltrasonicSensor"
    // InternalDsl.g:212:1: ruleUltrasonicSensor : ( ( rule__UltrasonicSensor__Group__0 ) ) ;
    public final void ruleUltrasonicSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:216:2: ( ( ( rule__UltrasonicSensor__Group__0 ) ) )
            // InternalDsl.g:217:2: ( ( rule__UltrasonicSensor__Group__0 ) )
            {
            // InternalDsl.g:217:2: ( ( rule__UltrasonicSensor__Group__0 ) )
            // InternalDsl.g:218:3: ( rule__UltrasonicSensor__Group__0 )
            {
             before(grammarAccess.getUltrasonicSensorAccess().getGroup()); 
            // InternalDsl.g:219:3: ( rule__UltrasonicSensor__Group__0 )
            // InternalDsl.g:219:4: rule__UltrasonicSensor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UltrasonicSensor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUltrasonicSensorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUltrasonicSensor"


    // $ANTLR start "ruleTouchSensorSides"
    // InternalDsl.g:228:1: ruleTouchSensorSides : ( ( rule__TouchSensorSides__Alternatives ) ) ;
    public final void ruleTouchSensorSides() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:232:1: ( ( ( rule__TouchSensorSides__Alternatives ) ) )
            // InternalDsl.g:233:2: ( ( rule__TouchSensorSides__Alternatives ) )
            {
            // InternalDsl.g:233:2: ( ( rule__TouchSensorSides__Alternatives ) )
            // InternalDsl.g:234:3: ( rule__TouchSensorSides__Alternatives )
            {
             before(grammarAccess.getTouchSensorSidesAccess().getAlternatives()); 
            // InternalDsl.g:235:3: ( rule__TouchSensorSides__Alternatives )
            // InternalDsl.g:235:4: rule__TouchSensorSides__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TouchSensorSides__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTouchSensorSidesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTouchSensorSides"


    // $ANTLR start "ruleActions"
    // InternalDsl.g:244:1: ruleActions : ( ( rule__Actions__Alternatives ) ) ;
    public final void ruleActions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:248:1: ( ( ( rule__Actions__Alternatives ) ) )
            // InternalDsl.g:249:2: ( ( rule__Actions__Alternatives ) )
            {
            // InternalDsl.g:249:2: ( ( rule__Actions__Alternatives ) )
            // InternalDsl.g:250:3: ( rule__Actions__Alternatives )
            {
             before(grammarAccess.getActionsAccess().getAlternatives()); 
            // InternalDsl.g:251:3: ( rule__Actions__Alternatives )
            // InternalDsl.g:251:4: rule__Actions__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Actions__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActionsAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "ruleColors"
    // InternalDsl.g:260:1: ruleColors : ( ( rule__Colors__Alternatives ) ) ;
    public final void ruleColors() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:264:1: ( ( ( rule__Colors__Alternatives ) ) )
            // InternalDsl.g:265:2: ( ( rule__Colors__Alternatives ) )
            {
            // InternalDsl.g:265:2: ( ( rule__Colors__Alternatives ) )
            // InternalDsl.g:266:3: ( rule__Colors__Alternatives )
            {
             before(grammarAccess.getColorsAccess().getAlternatives()); 
            // InternalDsl.g:267:3: ( rule__Colors__Alternatives )
            // InternalDsl.g:267:4: rule__Colors__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Colors__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getColorsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColors"


    // $ANTLR start "ruleCompareOperator"
    // InternalDsl.g:276:1: ruleCompareOperator : ( ( rule__CompareOperator__Alternatives ) ) ;
    public final void ruleCompareOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:280:1: ( ( ( rule__CompareOperator__Alternatives ) ) )
            // InternalDsl.g:281:2: ( ( rule__CompareOperator__Alternatives ) )
            {
            // InternalDsl.g:281:2: ( ( rule__CompareOperator__Alternatives ) )
            // InternalDsl.g:282:3: ( rule__CompareOperator__Alternatives )
            {
             before(grammarAccess.getCompareOperatorAccess().getAlternatives()); 
            // InternalDsl.g:283:3: ( rule__CompareOperator__Alternatives )
            // InternalDsl.g:283:4: rule__CompareOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CompareOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCompareOperatorAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "rule__SensorType__Alternatives"
    // InternalDsl.g:291:1: rule__SensorType__Alternatives : ( ( ruleColorSensor ) | ( ruleTouchSensor ) | ( ruleUltrasonicSensor ) );
    public final void rule__SensorType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:295:1: ( ( ruleColorSensor ) | ( ruleTouchSensor ) | ( ruleUltrasonicSensor ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt1=1;
                }
                break;
            case 52:
                {
                alt1=2;
                }
                break;
            case 54:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalDsl.g:296:2: ( ruleColorSensor )
                    {
                    // InternalDsl.g:296:2: ( ruleColorSensor )
                    // InternalDsl.g:297:3: ruleColorSensor
                    {
                     before(grammarAccess.getSensorTypeAccess().getColorSensorParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleColorSensor();

                    state._fsp--;

                     after(grammarAccess.getSensorTypeAccess().getColorSensorParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:302:2: ( ruleTouchSensor )
                    {
                    // InternalDsl.g:302:2: ( ruleTouchSensor )
                    // InternalDsl.g:303:3: ruleTouchSensor
                    {
                     before(grammarAccess.getSensorTypeAccess().getTouchSensorParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTouchSensor();

                    state._fsp--;

                     after(grammarAccess.getSensorTypeAccess().getTouchSensorParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:308:2: ( ruleUltrasonicSensor )
                    {
                    // InternalDsl.g:308:2: ( ruleUltrasonicSensor )
                    // InternalDsl.g:309:3: ruleUltrasonicSensor
                    {
                     before(grammarAccess.getSensorTypeAccess().getUltrasonicSensorParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleUltrasonicSensor();

                    state._fsp--;

                     after(grammarAccess.getSensorTypeAccess().getUltrasonicSensorParserRuleCall_2()); 

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
    // $ANTLR end "rule__SensorType__Alternatives"


    // $ANTLR start "rule__TouchSensorSides__Alternatives"
    // InternalDsl.g:318:1: rule__TouchSensorSides__Alternatives : ( ( ( 'LEFT' ) ) | ( ( 'RIGHT' ) ) | ( ( 'BOTH' ) ) );
    public final void rule__TouchSensorSides__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:322:1: ( ( ( 'LEFT' ) ) | ( ( 'RIGHT' ) ) | ( ( 'BOTH' ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt2=1;
                }
                break;
            case 13:
                {
                alt2=2;
                }
                break;
            case 14:
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
                    // InternalDsl.g:323:2: ( ( 'LEFT' ) )
                    {
                    // InternalDsl.g:323:2: ( ( 'LEFT' ) )
                    // InternalDsl.g:324:3: ( 'LEFT' )
                    {
                     before(grammarAccess.getTouchSensorSidesAccess().getLEFTEnumLiteralDeclaration_0()); 
                    // InternalDsl.g:325:3: ( 'LEFT' )
                    // InternalDsl.g:325:4: 'LEFT'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getTouchSensorSidesAccess().getLEFTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:329:2: ( ( 'RIGHT' ) )
                    {
                    // InternalDsl.g:329:2: ( ( 'RIGHT' ) )
                    // InternalDsl.g:330:3: ( 'RIGHT' )
                    {
                     before(grammarAccess.getTouchSensorSidesAccess().getRIGHTEnumLiteralDeclaration_1()); 
                    // InternalDsl.g:331:3: ( 'RIGHT' )
                    // InternalDsl.g:331:4: 'RIGHT'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getTouchSensorSidesAccess().getRIGHTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:335:2: ( ( 'BOTH' ) )
                    {
                    // InternalDsl.g:335:2: ( ( 'BOTH' ) )
                    // InternalDsl.g:336:3: ( 'BOTH' )
                    {
                     before(grammarAccess.getTouchSensorSidesAccess().getBOTHEnumLiteralDeclaration_2()); 
                    // InternalDsl.g:337:3: ( 'BOTH' )
                    // InternalDsl.g:337:4: 'BOTH'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getTouchSensorSidesAccess().getBOTHEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__TouchSensorSides__Alternatives"


    // $ANTLR start "rule__Actions__Alternatives"
    // InternalDsl.g:345:1: rule__Actions__Alternatives : ( ( ( 'ROTATELEFT' ) ) | ( ( 'ROTATERIGHT' ) ) | ( ( 'DRIVEFORWARD' ) ) | ( ( 'DRIVEBACKWARD' ) ) | ( ( 'STOP' ) ) | ( ( 'TURNAROUND' ) ) | ( ( 'BEEP' ) ) | ( ( 'MEASURE' ) ) | ( ( 'DRIVETOEDGE' ) ) );
    public final void rule__Actions__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:349:1: ( ( ( 'ROTATELEFT' ) ) | ( ( 'ROTATERIGHT' ) ) | ( ( 'DRIVEFORWARD' ) ) | ( ( 'DRIVEBACKWARD' ) ) | ( ( 'STOP' ) ) | ( ( 'TURNAROUND' ) ) | ( ( 'BEEP' ) ) | ( ( 'MEASURE' ) ) | ( ( 'DRIVETOEDGE' ) ) )
            int alt3=9;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt3=1;
                }
                break;
            case 16:
                {
                alt3=2;
                }
                break;
            case 17:
                {
                alt3=3;
                }
                break;
            case 18:
                {
                alt3=4;
                }
                break;
            case 19:
                {
                alt3=5;
                }
                break;
            case 20:
                {
                alt3=6;
                }
                break;
            case 21:
                {
                alt3=7;
                }
                break;
            case 22:
                {
                alt3=8;
                }
                break;
            case 23:
                {
                alt3=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalDsl.g:350:2: ( ( 'ROTATELEFT' ) )
                    {
                    // InternalDsl.g:350:2: ( ( 'ROTATELEFT' ) )
                    // InternalDsl.g:351:3: ( 'ROTATELEFT' )
                    {
                     before(grammarAccess.getActionsAccess().getROTATE_LEnumLiteralDeclaration_0()); 
                    // InternalDsl.g:352:3: ( 'ROTATELEFT' )
                    // InternalDsl.g:352:4: 'ROTATELEFT'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionsAccess().getROTATE_LEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:356:2: ( ( 'ROTATERIGHT' ) )
                    {
                    // InternalDsl.g:356:2: ( ( 'ROTATERIGHT' ) )
                    // InternalDsl.g:357:3: ( 'ROTATERIGHT' )
                    {
                     before(grammarAccess.getActionsAccess().getROTATE_REnumLiteralDeclaration_1()); 
                    // InternalDsl.g:358:3: ( 'ROTATERIGHT' )
                    // InternalDsl.g:358:4: 'ROTATERIGHT'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionsAccess().getROTATE_REnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:362:2: ( ( 'DRIVEFORWARD' ) )
                    {
                    // InternalDsl.g:362:2: ( ( 'DRIVEFORWARD' ) )
                    // InternalDsl.g:363:3: ( 'DRIVEFORWARD' )
                    {
                     before(grammarAccess.getActionsAccess().getDRIVE_FORWARDEnumLiteralDeclaration_2()); 
                    // InternalDsl.g:364:3: ( 'DRIVEFORWARD' )
                    // InternalDsl.g:364:4: 'DRIVEFORWARD'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionsAccess().getDRIVE_FORWARDEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:368:2: ( ( 'DRIVEBACKWARD' ) )
                    {
                    // InternalDsl.g:368:2: ( ( 'DRIVEBACKWARD' ) )
                    // InternalDsl.g:369:3: ( 'DRIVEBACKWARD' )
                    {
                     before(grammarAccess.getActionsAccess().getDRIVE_BACKWARDEnumLiteralDeclaration_3()); 
                    // InternalDsl.g:370:3: ( 'DRIVEBACKWARD' )
                    // InternalDsl.g:370:4: 'DRIVEBACKWARD'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionsAccess().getDRIVE_BACKWARDEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:374:2: ( ( 'STOP' ) )
                    {
                    // InternalDsl.g:374:2: ( ( 'STOP' ) )
                    // InternalDsl.g:375:3: ( 'STOP' )
                    {
                     before(grammarAccess.getActionsAccess().getSTOP_DRIVINGEnumLiteralDeclaration_4()); 
                    // InternalDsl.g:376:3: ( 'STOP' )
                    // InternalDsl.g:376:4: 'STOP'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionsAccess().getSTOP_DRIVINGEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDsl.g:380:2: ( ( 'TURNAROUND' ) )
                    {
                    // InternalDsl.g:380:2: ( ( 'TURNAROUND' ) )
                    // InternalDsl.g:381:3: ( 'TURNAROUND' )
                    {
                     before(grammarAccess.getActionsAccess().getTURN_AROUNDEnumLiteralDeclaration_5()); 
                    // InternalDsl.g:382:3: ( 'TURNAROUND' )
                    // InternalDsl.g:382:4: 'TURNAROUND'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionsAccess().getTURN_AROUNDEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalDsl.g:386:2: ( ( 'BEEP' ) )
                    {
                    // InternalDsl.g:386:2: ( ( 'BEEP' ) )
                    // InternalDsl.g:387:3: ( 'BEEP' )
                    {
                     before(grammarAccess.getActionsAccess().getBEEPEnumLiteralDeclaration_6()); 
                    // InternalDsl.g:388:3: ( 'BEEP' )
                    // InternalDsl.g:388:4: 'BEEP'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionsAccess().getBEEPEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalDsl.g:392:2: ( ( 'MEASURE' ) )
                    {
                    // InternalDsl.g:392:2: ( ( 'MEASURE' ) )
                    // InternalDsl.g:393:3: ( 'MEASURE' )
                    {
                     before(grammarAccess.getActionsAccess().getMEASUREEnumLiteralDeclaration_7()); 
                    // InternalDsl.g:394:3: ( 'MEASURE' )
                    // InternalDsl.g:394:4: 'MEASURE'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionsAccess().getMEASUREEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalDsl.g:398:2: ( ( 'DRIVETOEDGE' ) )
                    {
                    // InternalDsl.g:398:2: ( ( 'DRIVETOEDGE' ) )
                    // InternalDsl.g:399:3: ( 'DRIVETOEDGE' )
                    {
                     before(grammarAccess.getActionsAccess().getDRIVETOEDGEEnumLiteralDeclaration_8()); 
                    // InternalDsl.g:400:3: ( 'DRIVETOEDGE' )
                    // InternalDsl.g:400:4: 'DRIVETOEDGE'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionsAccess().getDRIVETOEDGEEnumLiteralDeclaration_8()); 

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


    // $ANTLR start "rule__Colors__Alternatives"
    // InternalDsl.g:408:1: rule__Colors__Alternatives : ( ( ( 'BLACK' ) ) | ( ( 'BLUE' ) ) | ( ( 'CYAN' ) ) | ( ( 'DARK_GRAY' ) ) | ( ( 'GRAY' ) ) | ( ( 'GREEN' ) ) | ( ( 'LIGHT_GRAY' ) ) | ( ( 'MAGENTA' ) ) | ( ( 'ORANGE' ) ) | ( ( 'PINK' ) ) | ( ( 'RED' ) ) | ( ( 'WHITE' ) ) | ( ( 'YELLOW' ) ) );
    public final void rule__Colors__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:412:1: ( ( ( 'BLACK' ) ) | ( ( 'BLUE' ) ) | ( ( 'CYAN' ) ) | ( ( 'DARK_GRAY' ) ) | ( ( 'GRAY' ) ) | ( ( 'GREEN' ) ) | ( ( 'LIGHT_GRAY' ) ) | ( ( 'MAGENTA' ) ) | ( ( 'ORANGE' ) ) | ( ( 'PINK' ) ) | ( ( 'RED' ) ) | ( ( 'WHITE' ) ) | ( ( 'YELLOW' ) ) )
            int alt4=13;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt4=1;
                }
                break;
            case 25:
                {
                alt4=2;
                }
                break;
            case 26:
                {
                alt4=3;
                }
                break;
            case 27:
                {
                alt4=4;
                }
                break;
            case 28:
                {
                alt4=5;
                }
                break;
            case 29:
                {
                alt4=6;
                }
                break;
            case 30:
                {
                alt4=7;
                }
                break;
            case 31:
                {
                alt4=8;
                }
                break;
            case 32:
                {
                alt4=9;
                }
                break;
            case 33:
                {
                alt4=10;
                }
                break;
            case 34:
                {
                alt4=11;
                }
                break;
            case 35:
                {
                alt4=12;
                }
                break;
            case 36:
                {
                alt4=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalDsl.g:413:2: ( ( 'BLACK' ) )
                    {
                    // InternalDsl.g:413:2: ( ( 'BLACK' ) )
                    // InternalDsl.g:414:3: ( 'BLACK' )
                    {
                     before(grammarAccess.getColorsAccess().getBLACKEnumLiteralDeclaration_0()); 
                    // InternalDsl.g:415:3: ( 'BLACK' )
                    // InternalDsl.g:415:4: 'BLACK'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorsAccess().getBLACKEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:419:2: ( ( 'BLUE' ) )
                    {
                    // InternalDsl.g:419:2: ( ( 'BLUE' ) )
                    // InternalDsl.g:420:3: ( 'BLUE' )
                    {
                     before(grammarAccess.getColorsAccess().getBLUEEnumLiteralDeclaration_1()); 
                    // InternalDsl.g:421:3: ( 'BLUE' )
                    // InternalDsl.g:421:4: 'BLUE'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorsAccess().getBLUEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:425:2: ( ( 'CYAN' ) )
                    {
                    // InternalDsl.g:425:2: ( ( 'CYAN' ) )
                    // InternalDsl.g:426:3: ( 'CYAN' )
                    {
                     before(grammarAccess.getColorsAccess().getCYANEnumLiteralDeclaration_2()); 
                    // InternalDsl.g:427:3: ( 'CYAN' )
                    // InternalDsl.g:427:4: 'CYAN'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorsAccess().getCYANEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:431:2: ( ( 'DARK_GRAY' ) )
                    {
                    // InternalDsl.g:431:2: ( ( 'DARK_GRAY' ) )
                    // InternalDsl.g:432:3: ( 'DARK_GRAY' )
                    {
                     before(grammarAccess.getColorsAccess().getDARK_GRAYEnumLiteralDeclaration_3()); 
                    // InternalDsl.g:433:3: ( 'DARK_GRAY' )
                    // InternalDsl.g:433:4: 'DARK_GRAY'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorsAccess().getDARK_GRAYEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:437:2: ( ( 'GRAY' ) )
                    {
                    // InternalDsl.g:437:2: ( ( 'GRAY' ) )
                    // InternalDsl.g:438:3: ( 'GRAY' )
                    {
                     before(grammarAccess.getColorsAccess().getGRAYEnumLiteralDeclaration_4()); 
                    // InternalDsl.g:439:3: ( 'GRAY' )
                    // InternalDsl.g:439:4: 'GRAY'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorsAccess().getGRAYEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDsl.g:443:2: ( ( 'GREEN' ) )
                    {
                    // InternalDsl.g:443:2: ( ( 'GREEN' ) )
                    // InternalDsl.g:444:3: ( 'GREEN' )
                    {
                     before(grammarAccess.getColorsAccess().getGREENEnumLiteralDeclaration_5()); 
                    // InternalDsl.g:445:3: ( 'GREEN' )
                    // InternalDsl.g:445:4: 'GREEN'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorsAccess().getGREENEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalDsl.g:449:2: ( ( 'LIGHT_GRAY' ) )
                    {
                    // InternalDsl.g:449:2: ( ( 'LIGHT_GRAY' ) )
                    // InternalDsl.g:450:3: ( 'LIGHT_GRAY' )
                    {
                     before(grammarAccess.getColorsAccess().getLIGHT_GRAYEnumLiteralDeclaration_6()); 
                    // InternalDsl.g:451:3: ( 'LIGHT_GRAY' )
                    // InternalDsl.g:451:4: 'LIGHT_GRAY'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorsAccess().getLIGHT_GRAYEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalDsl.g:455:2: ( ( 'MAGENTA' ) )
                    {
                    // InternalDsl.g:455:2: ( ( 'MAGENTA' ) )
                    // InternalDsl.g:456:3: ( 'MAGENTA' )
                    {
                     before(grammarAccess.getColorsAccess().getMAGENTAEnumLiteralDeclaration_7()); 
                    // InternalDsl.g:457:3: ( 'MAGENTA' )
                    // InternalDsl.g:457:4: 'MAGENTA'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorsAccess().getMAGENTAEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalDsl.g:461:2: ( ( 'ORANGE' ) )
                    {
                    // InternalDsl.g:461:2: ( ( 'ORANGE' ) )
                    // InternalDsl.g:462:3: ( 'ORANGE' )
                    {
                     before(grammarAccess.getColorsAccess().getORANGEEnumLiteralDeclaration_8()); 
                    // InternalDsl.g:463:3: ( 'ORANGE' )
                    // InternalDsl.g:463:4: 'ORANGE'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorsAccess().getORANGEEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalDsl.g:467:2: ( ( 'PINK' ) )
                    {
                    // InternalDsl.g:467:2: ( ( 'PINK' ) )
                    // InternalDsl.g:468:3: ( 'PINK' )
                    {
                     before(grammarAccess.getColorsAccess().getPINKEnumLiteralDeclaration_9()); 
                    // InternalDsl.g:469:3: ( 'PINK' )
                    // InternalDsl.g:469:4: 'PINK'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorsAccess().getPINKEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalDsl.g:473:2: ( ( 'RED' ) )
                    {
                    // InternalDsl.g:473:2: ( ( 'RED' ) )
                    // InternalDsl.g:474:3: ( 'RED' )
                    {
                     before(grammarAccess.getColorsAccess().getREDEnumLiteralDeclaration_10()); 
                    // InternalDsl.g:475:3: ( 'RED' )
                    // InternalDsl.g:475:4: 'RED'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorsAccess().getREDEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalDsl.g:479:2: ( ( 'WHITE' ) )
                    {
                    // InternalDsl.g:479:2: ( ( 'WHITE' ) )
                    // InternalDsl.g:480:3: ( 'WHITE' )
                    {
                     before(grammarAccess.getColorsAccess().getWHITEEnumLiteralDeclaration_11()); 
                    // InternalDsl.g:481:3: ( 'WHITE' )
                    // InternalDsl.g:481:4: 'WHITE'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorsAccess().getWHITEEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalDsl.g:485:2: ( ( 'YELLOW' ) )
                    {
                    // InternalDsl.g:485:2: ( ( 'YELLOW' ) )
                    // InternalDsl.g:486:3: ( 'YELLOW' )
                    {
                     before(grammarAccess.getColorsAccess().getYELLOWEnumLiteralDeclaration_12()); 
                    // InternalDsl.g:487:3: ( 'YELLOW' )
                    // InternalDsl.g:487:4: 'YELLOW'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorsAccess().getYELLOWEnumLiteralDeclaration_12()); 

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
    // $ANTLR end "rule__Colors__Alternatives"


    // $ANTLR start "rule__CompareOperator__Alternatives"
    // InternalDsl.g:495:1: rule__CompareOperator__Alternatives : ( ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '>=' ) ) | ( ( '>' ) ) | ( ( '<=' ) ) | ( ( '<' ) ) );
    public final void rule__CompareOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:499:1: ( ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '>=' ) ) | ( ( '>' ) ) | ( ( '<=' ) ) | ( ( '<' ) ) )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt5=1;
                }
                break;
            case 38:
                {
                alt5=2;
                }
                break;
            case 39:
                {
                alt5=3;
                }
                break;
            case 40:
                {
                alt5=4;
                }
                break;
            case 41:
                {
                alt5=5;
                }
                break;
            case 42:
                {
                alt5=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalDsl.g:500:2: ( ( '==' ) )
                    {
                    // InternalDsl.g:500:2: ( ( '==' ) )
                    // InternalDsl.g:501:3: ( '==' )
                    {
                     before(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    // InternalDsl.g:502:3: ( '==' )
                    // InternalDsl.g:502:4: '=='
                    {
                    match(input,37,FOLLOW_2); 

                    }

                     after(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:506:2: ( ( '!=' ) )
                    {
                    // InternalDsl.g:506:2: ( ( '!=' ) )
                    // InternalDsl.g:507:3: ( '!=' )
                    {
                     before(grammarAccess.getCompareOperatorAccess().getNEQEnumLiteralDeclaration_1()); 
                    // InternalDsl.g:508:3: ( '!=' )
                    // InternalDsl.g:508:4: '!='
                    {
                    match(input,38,FOLLOW_2); 

                    }

                     after(grammarAccess.getCompareOperatorAccess().getNEQEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:512:2: ( ( '>=' ) )
                    {
                    // InternalDsl.g:512:2: ( ( '>=' ) )
                    // InternalDsl.g:513:3: ( '>=' )
                    {
                     before(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_2()); 
                    // InternalDsl.g:514:3: ( '>=' )
                    // InternalDsl.g:514:4: '>='
                    {
                    match(input,39,FOLLOW_2); 

                    }

                     after(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:518:2: ( ( '>' ) )
                    {
                    // InternalDsl.g:518:2: ( ( '>' ) )
                    // InternalDsl.g:519:3: ( '>' )
                    {
                     before(grammarAccess.getCompareOperatorAccess().getGEnumLiteralDeclaration_3()); 
                    // InternalDsl.g:520:3: ( '>' )
                    // InternalDsl.g:520:4: '>'
                    {
                    match(input,40,FOLLOW_2); 

                    }

                     after(grammarAccess.getCompareOperatorAccess().getGEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:524:2: ( ( '<=' ) )
                    {
                    // InternalDsl.g:524:2: ( ( '<=' ) )
                    // InternalDsl.g:525:3: ( '<=' )
                    {
                     before(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_4()); 
                    // InternalDsl.g:526:3: ( '<=' )
                    // InternalDsl.g:526:4: '<='
                    {
                    match(input,41,FOLLOW_2); 

                    }

                     after(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDsl.g:530:2: ( ( '<' ) )
                    {
                    // InternalDsl.g:530:2: ( ( '<' ) )
                    // InternalDsl.g:531:3: ( '<' )
                    {
                     before(grammarAccess.getCompareOperatorAccess().getLEnumLiteralDeclaration_5()); 
                    // InternalDsl.g:532:3: ( '<' )
                    // InternalDsl.g:532:4: '<'
                    {
                    match(input,42,FOLLOW_2); 

                    }

                     after(grammarAccess.getCompareOperatorAccess().getLEnumLiteralDeclaration_5()); 

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


    // $ANTLR start "rule__Mission__Group__0"
    // InternalDsl.g:540:1: rule__Mission__Group__0 : rule__Mission__Group__0__Impl rule__Mission__Group__1 ;
    public final void rule__Mission__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:544:1: ( rule__Mission__Group__0__Impl rule__Mission__Group__1 )
            // InternalDsl.g:545:2: rule__Mission__Group__0__Impl rule__Mission__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Mission__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__0"


    // $ANTLR start "rule__Mission__Group__0__Impl"
    // InternalDsl.g:552:1: rule__Mission__Group__0__Impl : ( 'Mission:' ) ;
    public final void rule__Mission__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:556:1: ( ( 'Mission:' ) )
            // InternalDsl.g:557:1: ( 'Mission:' )
            {
            // InternalDsl.g:557:1: ( 'Mission:' )
            // InternalDsl.g:558:2: 'Mission:'
            {
             before(grammarAccess.getMissionAccess().getMissionKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getMissionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__0__Impl"


    // $ANTLR start "rule__Mission__Group__1"
    // InternalDsl.g:567:1: rule__Mission__Group__1 : rule__Mission__Group__1__Impl ;
    public final void rule__Mission__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:571:1: ( rule__Mission__Group__1__Impl )
            // InternalDsl.g:572:2: rule__Mission__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mission__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__1"


    // $ANTLR start "rule__Mission__Group__1__Impl"
    // InternalDsl.g:578:1: rule__Mission__Group__1__Impl : ( ( ( rule__Mission__TasksAssignment_1 ) ) ( ( rule__Mission__TasksAssignment_1 )* ) ) ;
    public final void rule__Mission__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:582:1: ( ( ( ( rule__Mission__TasksAssignment_1 ) ) ( ( rule__Mission__TasksAssignment_1 )* ) ) )
            // InternalDsl.g:583:1: ( ( ( rule__Mission__TasksAssignment_1 ) ) ( ( rule__Mission__TasksAssignment_1 )* ) )
            {
            // InternalDsl.g:583:1: ( ( ( rule__Mission__TasksAssignment_1 ) ) ( ( rule__Mission__TasksAssignment_1 )* ) )
            // InternalDsl.g:584:2: ( ( rule__Mission__TasksAssignment_1 ) ) ( ( rule__Mission__TasksAssignment_1 )* )
            {
            // InternalDsl.g:584:2: ( ( rule__Mission__TasksAssignment_1 ) )
            // InternalDsl.g:585:3: ( rule__Mission__TasksAssignment_1 )
            {
             before(grammarAccess.getMissionAccess().getTasksAssignment_1()); 
            // InternalDsl.g:586:3: ( rule__Mission__TasksAssignment_1 )
            // InternalDsl.g:586:4: rule__Mission__TasksAssignment_1
            {
            pushFollow(FOLLOW_4);
            rule__Mission__TasksAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getTasksAssignment_1()); 

            }

            // InternalDsl.g:589:2: ( ( rule__Mission__TasksAssignment_1 )* )
            // InternalDsl.g:590:3: ( rule__Mission__TasksAssignment_1 )*
            {
             before(grammarAccess.getMissionAccess().getTasksAssignment_1()); 
            // InternalDsl.g:591:3: ( rule__Mission__TasksAssignment_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==44) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDsl.g:591:4: rule__Mission__TasksAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Mission__TasksAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getMissionAccess().getTasksAssignment_1()); 

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
    // $ANTLR end "rule__Mission__Group__1__Impl"


    // $ANTLR start "rule__Task__Group__0"
    // InternalDsl.g:601:1: rule__Task__Group__0 : rule__Task__Group__0__Impl rule__Task__Group__1 ;
    public final void rule__Task__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:605:1: ( rule__Task__Group__0__Impl rule__Task__Group__1 )
            // InternalDsl.g:606:2: rule__Task__Group__0__Impl rule__Task__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Task__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__0"


    // $ANTLR start "rule__Task__Group__0__Impl"
    // InternalDsl.g:613:1: rule__Task__Group__0__Impl : ( 'Task:' ) ;
    public final void rule__Task__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:617:1: ( ( 'Task:' ) )
            // InternalDsl.g:618:1: ( 'Task:' )
            {
            // InternalDsl.g:618:1: ( 'Task:' )
            // InternalDsl.g:619:2: 'Task:'
            {
             before(grammarAccess.getTaskAccess().getTaskKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getTaskKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__0__Impl"


    // $ANTLR start "rule__Task__Group__1"
    // InternalDsl.g:628:1: rule__Task__Group__1 : rule__Task__Group__1__Impl rule__Task__Group__2 ;
    public final void rule__Task__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:632:1: ( rule__Task__Group__1__Impl rule__Task__Group__2 )
            // InternalDsl.g:633:2: rule__Task__Group__1__Impl rule__Task__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Task__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__1"


    // $ANTLR start "rule__Task__Group__1__Impl"
    // InternalDsl.g:640:1: rule__Task__Group__1__Impl : ( ( rule__Task__NameAssignment_1 ) ) ;
    public final void rule__Task__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:644:1: ( ( ( rule__Task__NameAssignment_1 ) ) )
            // InternalDsl.g:645:1: ( ( rule__Task__NameAssignment_1 ) )
            {
            // InternalDsl.g:645:1: ( ( rule__Task__NameAssignment_1 ) )
            // InternalDsl.g:646:2: ( rule__Task__NameAssignment_1 )
            {
             before(grammarAccess.getTaskAccess().getNameAssignment_1()); 
            // InternalDsl.g:647:2: ( rule__Task__NameAssignment_1 )
            // InternalDsl.g:647:3: rule__Task__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Task__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__1__Impl"


    // $ANTLR start "rule__Task__Group__2"
    // InternalDsl.g:655:1: rule__Task__Group__2 : rule__Task__Group__2__Impl rule__Task__Group__3 ;
    public final void rule__Task__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:659:1: ( rule__Task__Group__2__Impl rule__Task__Group__3 )
            // InternalDsl.g:660:2: rule__Task__Group__2__Impl rule__Task__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Task__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__2"


    // $ANTLR start "rule__Task__Group__2__Impl"
    // InternalDsl.g:667:1: rule__Task__Group__2__Impl : ( ( rule__Task__Group_2__0 )? ) ;
    public final void rule__Task__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:671:1: ( ( ( rule__Task__Group_2__0 )? ) )
            // InternalDsl.g:672:1: ( ( rule__Task__Group_2__0 )? )
            {
            // InternalDsl.g:672:1: ( ( rule__Task__Group_2__0 )? )
            // InternalDsl.g:673:2: ( rule__Task__Group_2__0 )?
            {
             before(grammarAccess.getTaskAccess().getGroup_2()); 
            // InternalDsl.g:674:2: ( rule__Task__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==47) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDsl.g:674:3: rule__Task__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Task__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTaskAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__2__Impl"


    // $ANTLR start "rule__Task__Group__3"
    // InternalDsl.g:682:1: rule__Task__Group__3 : rule__Task__Group__3__Impl rule__Task__Group__4 ;
    public final void rule__Task__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:686:1: ( rule__Task__Group__3__Impl rule__Task__Group__4 )
            // InternalDsl.g:687:2: rule__Task__Group__3__Impl rule__Task__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Task__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__3"


    // $ANTLR start "rule__Task__Group__3__Impl"
    // InternalDsl.g:694:1: rule__Task__Group__3__Impl : ( 'Do:' ) ;
    public final void rule__Task__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:698:1: ( ( 'Do:' ) )
            // InternalDsl.g:699:1: ( 'Do:' )
            {
            // InternalDsl.g:699:1: ( 'Do:' )
            // InternalDsl.g:700:2: 'Do:'
            {
             before(grammarAccess.getTaskAccess().getDoKeyword_3()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getDoKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__3__Impl"


    // $ANTLR start "rule__Task__Group__4"
    // InternalDsl.g:709:1: rule__Task__Group__4 : rule__Task__Group__4__Impl rule__Task__Group__5 ;
    public final void rule__Task__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:713:1: ( rule__Task__Group__4__Impl rule__Task__Group__5 )
            // InternalDsl.g:714:2: rule__Task__Group__4__Impl rule__Task__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Task__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__4"


    // $ANTLR start "rule__Task__Group__4__Impl"
    // InternalDsl.g:721:1: rule__Task__Group__4__Impl : ( ( rule__Task__ActionAssignment_4 ) ) ;
    public final void rule__Task__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:725:1: ( ( ( rule__Task__ActionAssignment_4 ) ) )
            // InternalDsl.g:726:1: ( ( rule__Task__ActionAssignment_4 ) )
            {
            // InternalDsl.g:726:1: ( ( rule__Task__ActionAssignment_4 ) )
            // InternalDsl.g:727:2: ( rule__Task__ActionAssignment_4 )
            {
             before(grammarAccess.getTaskAccess().getActionAssignment_4()); 
            // InternalDsl.g:728:2: ( rule__Task__ActionAssignment_4 )
            // InternalDsl.g:728:3: rule__Task__ActionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Task__ActionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getActionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__4__Impl"


    // $ANTLR start "rule__Task__Group__5"
    // InternalDsl.g:736:1: rule__Task__Group__5 : rule__Task__Group__5__Impl rule__Task__Group__6 ;
    public final void rule__Task__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:740:1: ( rule__Task__Group__5__Impl rule__Task__Group__6 )
            // InternalDsl.g:741:2: rule__Task__Group__5__Impl rule__Task__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__Task__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__5"


    // $ANTLR start "rule__Task__Group__5__Impl"
    // InternalDsl.g:748:1: rule__Task__Group__5__Impl : ( 'Not:' ) ;
    public final void rule__Task__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:752:1: ( ( 'Not:' ) )
            // InternalDsl.g:753:1: ( 'Not:' )
            {
            // InternalDsl.g:753:1: ( 'Not:' )
            // InternalDsl.g:754:2: 'Not:'
            {
             before(grammarAccess.getTaskAccess().getNotKeyword_5()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getNotKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__5__Impl"


    // $ANTLR start "rule__Task__Group__6"
    // InternalDsl.g:763:1: rule__Task__Group__6 : rule__Task__Group__6__Impl ;
    public final void rule__Task__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:767:1: ( rule__Task__Group__6__Impl )
            // InternalDsl.g:768:2: rule__Task__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__6"


    // $ANTLR start "rule__Task__Group__6__Impl"
    // InternalDsl.g:774:1: rule__Task__Group__6__Impl : ( ( rule__Task__IgnoreBehaviorAssignment_6 ) ) ;
    public final void rule__Task__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:778:1: ( ( ( rule__Task__IgnoreBehaviorAssignment_6 ) ) )
            // InternalDsl.g:779:1: ( ( rule__Task__IgnoreBehaviorAssignment_6 ) )
            {
            // InternalDsl.g:779:1: ( ( rule__Task__IgnoreBehaviorAssignment_6 ) )
            // InternalDsl.g:780:2: ( rule__Task__IgnoreBehaviorAssignment_6 )
            {
             before(grammarAccess.getTaskAccess().getIgnoreBehaviorAssignment_6()); 
            // InternalDsl.g:781:2: ( rule__Task__IgnoreBehaviorAssignment_6 )
            // InternalDsl.g:781:3: rule__Task__IgnoreBehaviorAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Task__IgnoreBehaviorAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getIgnoreBehaviorAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__6__Impl"


    // $ANTLR start "rule__Task__Group_2__0"
    // InternalDsl.g:790:1: rule__Task__Group_2__0 : rule__Task__Group_2__0__Impl rule__Task__Group_2__1 ;
    public final void rule__Task__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:794:1: ( rule__Task__Group_2__0__Impl rule__Task__Group_2__1 )
            // InternalDsl.g:795:2: rule__Task__Group_2__0__Impl rule__Task__Group_2__1
            {
            pushFollow(FOLLOW_10);
            rule__Task__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_2__0"


    // $ANTLR start "rule__Task__Group_2__0__Impl"
    // InternalDsl.g:802:1: rule__Task__Group_2__0__Impl : ( 'Uses:' ) ;
    public final void rule__Task__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:806:1: ( ( 'Uses:' ) )
            // InternalDsl.g:807:1: ( 'Uses:' )
            {
            // InternalDsl.g:807:1: ( 'Uses:' )
            // InternalDsl.g:808:2: 'Uses:'
            {
             before(grammarAccess.getTaskAccess().getUsesKeyword_2_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getUsesKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_2__0__Impl"


    // $ANTLR start "rule__Task__Group_2__1"
    // InternalDsl.g:817:1: rule__Task__Group_2__1 : rule__Task__Group_2__1__Impl ;
    public final void rule__Task__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:821:1: ( rule__Task__Group_2__1__Impl )
            // InternalDsl.g:822:2: rule__Task__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_2__1"


    // $ANTLR start "rule__Task__Group_2__1__Impl"
    // InternalDsl.g:828:1: rule__Task__Group_2__1__Impl : ( ( rule__Task__SensorAssignment_2_1 ) ) ;
    public final void rule__Task__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:832:1: ( ( ( rule__Task__SensorAssignment_2_1 ) ) )
            // InternalDsl.g:833:1: ( ( rule__Task__SensorAssignment_2_1 ) )
            {
            // InternalDsl.g:833:1: ( ( rule__Task__SensorAssignment_2_1 ) )
            // InternalDsl.g:834:2: ( rule__Task__SensorAssignment_2_1 )
            {
             before(grammarAccess.getTaskAccess().getSensorAssignment_2_1()); 
            // InternalDsl.g:835:2: ( rule__Task__SensorAssignment_2_1 )
            // InternalDsl.g:835:3: rule__Task__SensorAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Task__SensorAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getSensorAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_2__1__Impl"


    // $ANTLR start "rule__ColorSensor__Group__0"
    // InternalDsl.g:844:1: rule__ColorSensor__Group__0 : rule__ColorSensor__Group__0__Impl rule__ColorSensor__Group__1 ;
    public final void rule__ColorSensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:848:1: ( rule__ColorSensor__Group__0__Impl rule__ColorSensor__Group__1 )
            // InternalDsl.g:849:2: rule__ColorSensor__Group__0__Impl rule__ColorSensor__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__ColorSensor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColorSensor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorSensor__Group__0"


    // $ANTLR start "rule__ColorSensor__Group__0__Impl"
    // InternalDsl.g:856:1: rule__ColorSensor__Group__0__Impl : ( 'ColorSensor' ) ;
    public final void rule__ColorSensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:860:1: ( ( 'ColorSensor' ) )
            // InternalDsl.g:861:1: ( 'ColorSensor' )
            {
            // InternalDsl.g:861:1: ( 'ColorSensor' )
            // InternalDsl.g:862:2: 'ColorSensor'
            {
             before(grammarAccess.getColorSensorAccess().getColorSensorKeyword_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getColorSensorAccess().getColorSensorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorSensor__Group__0__Impl"


    // $ANTLR start "rule__ColorSensor__Group__1"
    // InternalDsl.g:871:1: rule__ColorSensor__Group__1 : rule__ColorSensor__Group__1__Impl rule__ColorSensor__Group__2 ;
    public final void rule__ColorSensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:875:1: ( rule__ColorSensor__Group__1__Impl rule__ColorSensor__Group__2 )
            // InternalDsl.g:876:2: rule__ColorSensor__Group__1__Impl rule__ColorSensor__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__ColorSensor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColorSensor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorSensor__Group__1"


    // $ANTLR start "rule__ColorSensor__Group__1__Impl"
    // InternalDsl.g:883:1: rule__ColorSensor__Group__1__Impl : ( 'On' ) ;
    public final void rule__ColorSensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:887:1: ( ( 'On' ) )
            // InternalDsl.g:888:1: ( 'On' )
            {
            // InternalDsl.g:888:1: ( 'On' )
            // InternalDsl.g:889:2: 'On'
            {
             before(grammarAccess.getColorSensorAccess().getOnKeyword_1()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getColorSensorAccess().getOnKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorSensor__Group__1__Impl"


    // $ANTLR start "rule__ColorSensor__Group__2"
    // InternalDsl.g:898:1: rule__ColorSensor__Group__2 : rule__ColorSensor__Group__2__Impl rule__ColorSensor__Group__3 ;
    public final void rule__ColorSensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:902:1: ( rule__ColorSensor__Group__2__Impl rule__ColorSensor__Group__3 )
            // InternalDsl.g:903:2: rule__ColorSensor__Group__2__Impl rule__ColorSensor__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__ColorSensor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColorSensor__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorSensor__Group__2"


    // $ANTLR start "rule__ColorSensor__Group__2__Impl"
    // InternalDsl.g:910:1: rule__ColorSensor__Group__2__Impl : ( 'DetectedColor' ) ;
    public final void rule__ColorSensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:914:1: ( ( 'DetectedColor' ) )
            // InternalDsl.g:915:1: ( 'DetectedColor' )
            {
            // InternalDsl.g:915:1: ( 'DetectedColor' )
            // InternalDsl.g:916:2: 'DetectedColor'
            {
             before(grammarAccess.getColorSensorAccess().getDetectedColorKeyword_2()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getColorSensorAccess().getDetectedColorKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorSensor__Group__2__Impl"


    // $ANTLR start "rule__ColorSensor__Group__3"
    // InternalDsl.g:925:1: rule__ColorSensor__Group__3 : rule__ColorSensor__Group__3__Impl rule__ColorSensor__Group__4 ;
    public final void rule__ColorSensor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:929:1: ( rule__ColorSensor__Group__3__Impl rule__ColorSensor__Group__4 )
            // InternalDsl.g:930:2: rule__ColorSensor__Group__3__Impl rule__ColorSensor__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__ColorSensor__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColorSensor__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorSensor__Group__3"


    // $ANTLR start "rule__ColorSensor__Group__3__Impl"
    // InternalDsl.g:937:1: rule__ColorSensor__Group__3__Impl : ( 'is:' ) ;
    public final void rule__ColorSensor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:941:1: ( ( 'is:' ) )
            // InternalDsl.g:942:1: ( 'is:' )
            {
            // InternalDsl.g:942:1: ( 'is:' )
            // InternalDsl.g:943:2: 'is:'
            {
             before(grammarAccess.getColorSensorAccess().getIsKeyword_3()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getColorSensorAccess().getIsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorSensor__Group__3__Impl"


    // $ANTLR start "rule__ColorSensor__Group__4"
    // InternalDsl.g:952:1: rule__ColorSensor__Group__4 : rule__ColorSensor__Group__4__Impl ;
    public final void rule__ColorSensor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:956:1: ( rule__ColorSensor__Group__4__Impl )
            // InternalDsl.g:957:2: rule__ColorSensor__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ColorSensor__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorSensor__Group__4"


    // $ANTLR start "rule__ColorSensor__Group__4__Impl"
    // InternalDsl.g:963:1: rule__ColorSensor__Group__4__Impl : ( ( rule__ColorSensor__KeyAssignment_4 ) ) ;
    public final void rule__ColorSensor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:967:1: ( ( ( rule__ColorSensor__KeyAssignment_4 ) ) )
            // InternalDsl.g:968:1: ( ( rule__ColorSensor__KeyAssignment_4 ) )
            {
            // InternalDsl.g:968:1: ( ( rule__ColorSensor__KeyAssignment_4 ) )
            // InternalDsl.g:969:2: ( rule__ColorSensor__KeyAssignment_4 )
            {
             before(grammarAccess.getColorSensorAccess().getKeyAssignment_4()); 
            // InternalDsl.g:970:2: ( rule__ColorSensor__KeyAssignment_4 )
            // InternalDsl.g:970:3: rule__ColorSensor__KeyAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ColorSensor__KeyAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getColorSensorAccess().getKeyAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorSensor__Group__4__Impl"


    // $ANTLR start "rule__TouchSensor__Group__0"
    // InternalDsl.g:979:1: rule__TouchSensor__Group__0 : rule__TouchSensor__Group__0__Impl rule__TouchSensor__Group__1 ;
    public final void rule__TouchSensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:983:1: ( rule__TouchSensor__Group__0__Impl rule__TouchSensor__Group__1 )
            // InternalDsl.g:984:2: rule__TouchSensor__Group__0__Impl rule__TouchSensor__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__TouchSensor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TouchSensor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TouchSensor__Group__0"


    // $ANTLR start "rule__TouchSensor__Group__0__Impl"
    // InternalDsl.g:991:1: rule__TouchSensor__Group__0__Impl : ( 'TouchSensor' ) ;
    public final void rule__TouchSensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:995:1: ( ( 'TouchSensor' ) )
            // InternalDsl.g:996:1: ( 'TouchSensor' )
            {
            // InternalDsl.g:996:1: ( 'TouchSensor' )
            // InternalDsl.g:997:2: 'TouchSensor'
            {
             before(grammarAccess.getTouchSensorAccess().getTouchSensorKeyword_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getTouchSensorAccess().getTouchSensorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TouchSensor__Group__0__Impl"


    // $ANTLR start "rule__TouchSensor__Group__1"
    // InternalDsl.g:1006:1: rule__TouchSensor__Group__1 : rule__TouchSensor__Group__1__Impl rule__TouchSensor__Group__2 ;
    public final void rule__TouchSensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1010:1: ( rule__TouchSensor__Group__1__Impl rule__TouchSensor__Group__2 )
            // InternalDsl.g:1011:2: rule__TouchSensor__Group__1__Impl rule__TouchSensor__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__TouchSensor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TouchSensor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TouchSensor__Group__1"


    // $ANTLR start "rule__TouchSensor__Group__1__Impl"
    // InternalDsl.g:1018:1: rule__TouchSensor__Group__1__Impl : ( 'On' ) ;
    public final void rule__TouchSensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1022:1: ( ( 'On' ) )
            // InternalDsl.g:1023:1: ( 'On' )
            {
            // InternalDsl.g:1023:1: ( 'On' )
            // InternalDsl.g:1024:2: 'On'
            {
             before(grammarAccess.getTouchSensorAccess().getOnKeyword_1()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getTouchSensorAccess().getOnKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TouchSensor__Group__1__Impl"


    // $ANTLR start "rule__TouchSensor__Group__2"
    // InternalDsl.g:1033:1: rule__TouchSensor__Group__2 : rule__TouchSensor__Group__2__Impl rule__TouchSensor__Group__3 ;
    public final void rule__TouchSensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1037:1: ( rule__TouchSensor__Group__2__Impl rule__TouchSensor__Group__3 )
            // InternalDsl.g:1038:2: rule__TouchSensor__Group__2__Impl rule__TouchSensor__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__TouchSensor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TouchSensor__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TouchSensor__Group__2"


    // $ANTLR start "rule__TouchSensor__Group__2__Impl"
    // InternalDsl.g:1045:1: rule__TouchSensor__Group__2__Impl : ( 'TouchedSide:' ) ;
    public final void rule__TouchSensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1049:1: ( ( 'TouchedSide:' ) )
            // InternalDsl.g:1050:1: ( 'TouchedSide:' )
            {
            // InternalDsl.g:1050:1: ( 'TouchedSide:' )
            // InternalDsl.g:1051:2: 'TouchedSide:'
            {
             before(grammarAccess.getTouchSensorAccess().getTouchedSideKeyword_2()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getTouchSensorAccess().getTouchedSideKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TouchSensor__Group__2__Impl"


    // $ANTLR start "rule__TouchSensor__Group__3"
    // InternalDsl.g:1060:1: rule__TouchSensor__Group__3 : rule__TouchSensor__Group__3__Impl ;
    public final void rule__TouchSensor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1064:1: ( rule__TouchSensor__Group__3__Impl )
            // InternalDsl.g:1065:2: rule__TouchSensor__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TouchSensor__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TouchSensor__Group__3"


    // $ANTLR start "rule__TouchSensor__Group__3__Impl"
    // InternalDsl.g:1071:1: rule__TouchSensor__Group__3__Impl : ( ( rule__TouchSensor__KeyAssignment_3 ) ) ;
    public final void rule__TouchSensor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1075:1: ( ( ( rule__TouchSensor__KeyAssignment_3 ) ) )
            // InternalDsl.g:1076:1: ( ( rule__TouchSensor__KeyAssignment_3 ) )
            {
            // InternalDsl.g:1076:1: ( ( rule__TouchSensor__KeyAssignment_3 ) )
            // InternalDsl.g:1077:2: ( rule__TouchSensor__KeyAssignment_3 )
            {
             before(grammarAccess.getTouchSensorAccess().getKeyAssignment_3()); 
            // InternalDsl.g:1078:2: ( rule__TouchSensor__KeyAssignment_3 )
            // InternalDsl.g:1078:3: rule__TouchSensor__KeyAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__TouchSensor__KeyAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTouchSensorAccess().getKeyAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TouchSensor__Group__3__Impl"


    // $ANTLR start "rule__UltrasonicSensor__Group__0"
    // InternalDsl.g:1087:1: rule__UltrasonicSensor__Group__0 : rule__UltrasonicSensor__Group__0__Impl rule__UltrasonicSensor__Group__1 ;
    public final void rule__UltrasonicSensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1091:1: ( rule__UltrasonicSensor__Group__0__Impl rule__UltrasonicSensor__Group__1 )
            // InternalDsl.g:1092:2: rule__UltrasonicSensor__Group__0__Impl rule__UltrasonicSensor__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__UltrasonicSensor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UltrasonicSensor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UltrasonicSensor__Group__0"


    // $ANTLR start "rule__UltrasonicSensor__Group__0__Impl"
    // InternalDsl.g:1099:1: rule__UltrasonicSensor__Group__0__Impl : ( 'USensor' ) ;
    public final void rule__UltrasonicSensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1103:1: ( ( 'USensor' ) )
            // InternalDsl.g:1104:1: ( 'USensor' )
            {
            // InternalDsl.g:1104:1: ( 'USensor' )
            // InternalDsl.g:1105:2: 'USensor'
            {
             before(grammarAccess.getUltrasonicSensorAccess().getUSensorKeyword_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getUltrasonicSensorAccess().getUSensorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UltrasonicSensor__Group__0__Impl"


    // $ANTLR start "rule__UltrasonicSensor__Group__1"
    // InternalDsl.g:1114:1: rule__UltrasonicSensor__Group__1 : rule__UltrasonicSensor__Group__1__Impl rule__UltrasonicSensor__Group__2 ;
    public final void rule__UltrasonicSensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1118:1: ( rule__UltrasonicSensor__Group__1__Impl rule__UltrasonicSensor__Group__2 )
            // InternalDsl.g:1119:2: rule__UltrasonicSensor__Group__1__Impl rule__UltrasonicSensor__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__UltrasonicSensor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UltrasonicSensor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UltrasonicSensor__Group__1"


    // $ANTLR start "rule__UltrasonicSensor__Group__1__Impl"
    // InternalDsl.g:1126:1: rule__UltrasonicSensor__Group__1__Impl : ( 'On' ) ;
    public final void rule__UltrasonicSensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1130:1: ( ( 'On' ) )
            // InternalDsl.g:1131:1: ( 'On' )
            {
            // InternalDsl.g:1131:1: ( 'On' )
            // InternalDsl.g:1132:2: 'On'
            {
             before(grammarAccess.getUltrasonicSensorAccess().getOnKeyword_1()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getUltrasonicSensorAccess().getOnKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UltrasonicSensor__Group__1__Impl"


    // $ANTLR start "rule__UltrasonicSensor__Group__2"
    // InternalDsl.g:1141:1: rule__UltrasonicSensor__Group__2 : rule__UltrasonicSensor__Group__2__Impl rule__UltrasonicSensor__Group__3 ;
    public final void rule__UltrasonicSensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1145:1: ( rule__UltrasonicSensor__Group__2__Impl rule__UltrasonicSensor__Group__3 )
            // InternalDsl.g:1146:2: rule__UltrasonicSensor__Group__2__Impl rule__UltrasonicSensor__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__UltrasonicSensor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UltrasonicSensor__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UltrasonicSensor__Group__2"


    // $ANTLR start "rule__UltrasonicSensor__Group__2__Impl"
    // InternalDsl.g:1153:1: rule__UltrasonicSensor__Group__2__Impl : ( 'Distance:' ) ;
    public final void rule__UltrasonicSensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1157:1: ( ( 'Distance:' ) )
            // InternalDsl.g:1158:1: ( 'Distance:' )
            {
            // InternalDsl.g:1158:1: ( 'Distance:' )
            // InternalDsl.g:1159:2: 'Distance:'
            {
             before(grammarAccess.getUltrasonicSensorAccess().getDistanceKeyword_2()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getUltrasonicSensorAccess().getDistanceKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UltrasonicSensor__Group__2__Impl"


    // $ANTLR start "rule__UltrasonicSensor__Group__3"
    // InternalDsl.g:1168:1: rule__UltrasonicSensor__Group__3 : rule__UltrasonicSensor__Group__3__Impl rule__UltrasonicSensor__Group__4 ;
    public final void rule__UltrasonicSensor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1172:1: ( rule__UltrasonicSensor__Group__3__Impl rule__UltrasonicSensor__Group__4 )
            // InternalDsl.g:1173:2: rule__UltrasonicSensor__Group__3__Impl rule__UltrasonicSensor__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__UltrasonicSensor__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UltrasonicSensor__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UltrasonicSensor__Group__3"


    // $ANTLR start "rule__UltrasonicSensor__Group__3__Impl"
    // InternalDsl.g:1180:1: rule__UltrasonicSensor__Group__3__Impl : ( ( rule__UltrasonicSensor__ComparatorAssignment_3 ) ) ;
    public final void rule__UltrasonicSensor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1184:1: ( ( ( rule__UltrasonicSensor__ComparatorAssignment_3 ) ) )
            // InternalDsl.g:1185:1: ( ( rule__UltrasonicSensor__ComparatorAssignment_3 ) )
            {
            // InternalDsl.g:1185:1: ( ( rule__UltrasonicSensor__ComparatorAssignment_3 ) )
            // InternalDsl.g:1186:2: ( rule__UltrasonicSensor__ComparatorAssignment_3 )
            {
             before(grammarAccess.getUltrasonicSensorAccess().getComparatorAssignment_3()); 
            // InternalDsl.g:1187:2: ( rule__UltrasonicSensor__ComparatorAssignment_3 )
            // InternalDsl.g:1187:3: rule__UltrasonicSensor__ComparatorAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__UltrasonicSensor__ComparatorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getUltrasonicSensorAccess().getComparatorAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UltrasonicSensor__Group__3__Impl"


    // $ANTLR start "rule__UltrasonicSensor__Group__4"
    // InternalDsl.g:1195:1: rule__UltrasonicSensor__Group__4 : rule__UltrasonicSensor__Group__4__Impl ;
    public final void rule__UltrasonicSensor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1199:1: ( rule__UltrasonicSensor__Group__4__Impl )
            // InternalDsl.g:1200:2: rule__UltrasonicSensor__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UltrasonicSensor__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UltrasonicSensor__Group__4"


    // $ANTLR start "rule__UltrasonicSensor__Group__4__Impl"
    // InternalDsl.g:1206:1: rule__UltrasonicSensor__Group__4__Impl : ( ( rule__UltrasonicSensor__DistanceAssignment_4 ) ) ;
    public final void rule__UltrasonicSensor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1210:1: ( ( ( rule__UltrasonicSensor__DistanceAssignment_4 ) ) )
            // InternalDsl.g:1211:1: ( ( rule__UltrasonicSensor__DistanceAssignment_4 ) )
            {
            // InternalDsl.g:1211:1: ( ( rule__UltrasonicSensor__DistanceAssignment_4 ) )
            // InternalDsl.g:1212:2: ( rule__UltrasonicSensor__DistanceAssignment_4 )
            {
             before(grammarAccess.getUltrasonicSensorAccess().getDistanceAssignment_4()); 
            // InternalDsl.g:1213:2: ( rule__UltrasonicSensor__DistanceAssignment_4 )
            // InternalDsl.g:1213:3: rule__UltrasonicSensor__DistanceAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__UltrasonicSensor__DistanceAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getUltrasonicSensorAccess().getDistanceAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UltrasonicSensor__Group__4__Impl"


    // $ANTLR start "rule__Mission__TasksAssignment_1"
    // InternalDsl.g:1222:1: rule__Mission__TasksAssignment_1 : ( ruleTask ) ;
    public final void rule__Mission__TasksAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1226:1: ( ( ruleTask ) )
            // InternalDsl.g:1227:2: ( ruleTask )
            {
            // InternalDsl.g:1227:2: ( ruleTask )
            // InternalDsl.g:1228:3: ruleTask
            {
             before(grammarAccess.getMissionAccess().getTasksTaskParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTask();

            state._fsp--;

             after(grammarAccess.getMissionAccess().getTasksTaskParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__TasksAssignment_1"


    // $ANTLR start "rule__Task__NameAssignment_1"
    // InternalDsl.g:1237:1: rule__Task__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Task__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1241:1: ( ( RULE_ID ) )
            // InternalDsl.g:1242:2: ( RULE_ID )
            {
            // InternalDsl.g:1242:2: ( RULE_ID )
            // InternalDsl.g:1243:3: RULE_ID
            {
             before(grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__NameAssignment_1"


    // $ANTLR start "rule__Task__SensorAssignment_2_1"
    // InternalDsl.g:1252:1: rule__Task__SensorAssignment_2_1 : ( ruleSensorType ) ;
    public final void rule__Task__SensorAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1256:1: ( ( ruleSensorType ) )
            // InternalDsl.g:1257:2: ( ruleSensorType )
            {
            // InternalDsl.g:1257:2: ( ruleSensorType )
            // InternalDsl.g:1258:3: ruleSensorType
            {
             before(grammarAccess.getTaskAccess().getSensorSensorTypeParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSensorType();

            state._fsp--;

             after(grammarAccess.getTaskAccess().getSensorSensorTypeParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__SensorAssignment_2_1"


    // $ANTLR start "rule__Task__ActionAssignment_4"
    // InternalDsl.g:1267:1: rule__Task__ActionAssignment_4 : ( ruleActions ) ;
    public final void rule__Task__ActionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1271:1: ( ( ruleActions ) )
            // InternalDsl.g:1272:2: ( ruleActions )
            {
            // InternalDsl.g:1272:2: ( ruleActions )
            // InternalDsl.g:1273:3: ruleActions
            {
             before(grammarAccess.getTaskAccess().getActionActionsEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleActions();

            state._fsp--;

             after(grammarAccess.getTaskAccess().getActionActionsEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__ActionAssignment_4"


    // $ANTLR start "rule__Task__IgnoreBehaviorAssignment_6"
    // InternalDsl.g:1282:1: rule__Task__IgnoreBehaviorAssignment_6 : ( ruleIgnorables ) ;
    public final void rule__Task__IgnoreBehaviorAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1286:1: ( ( ruleIgnorables ) )
            // InternalDsl.g:1287:2: ( ruleIgnorables )
            {
            // InternalDsl.g:1287:2: ( ruleIgnorables )
            // InternalDsl.g:1288:3: ruleIgnorables
            {
             before(grammarAccess.getTaskAccess().getIgnoreBehaviorIgnorablesParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleIgnorables();

            state._fsp--;

             after(grammarAccess.getTaskAccess().getIgnoreBehaviorIgnorablesParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__IgnoreBehaviorAssignment_6"


    // $ANTLR start "rule__Ignorables__AVOID_OBJECTSAssignment"
    // InternalDsl.g:1297:1: rule__Ignorables__AVOID_OBJECTSAssignment : ( ( 'AvoidObjects' ) ) ;
    public final void rule__Ignorables__AVOID_OBJECTSAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1301:1: ( ( ( 'AvoidObjects' ) ) )
            // InternalDsl.g:1302:2: ( ( 'AvoidObjects' ) )
            {
            // InternalDsl.g:1302:2: ( ( 'AvoidObjects' ) )
            // InternalDsl.g:1303:3: ( 'AvoidObjects' )
            {
             before(grammarAccess.getIgnorablesAccess().getAVOID_OBJECTSAvoidObjectsKeyword_0()); 
            // InternalDsl.g:1304:3: ( 'AvoidObjects' )
            // InternalDsl.g:1305:4: 'AvoidObjects'
            {
             before(grammarAccess.getIgnorablesAccess().getAVOID_OBJECTSAvoidObjectsKeyword_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getIgnorablesAccess().getAVOID_OBJECTSAvoidObjectsKeyword_0()); 

            }

             after(grammarAccess.getIgnorablesAccess().getAVOID_OBJECTSAvoidObjectsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ignorables__AVOID_OBJECTSAssignment"


    // $ANTLR start "rule__ColorSensor__KeyAssignment_4"
    // InternalDsl.g:1316:1: rule__ColorSensor__KeyAssignment_4 : ( ruleColors ) ;
    public final void rule__ColorSensor__KeyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1320:1: ( ( ruleColors ) )
            // InternalDsl.g:1321:2: ( ruleColors )
            {
            // InternalDsl.g:1321:2: ( ruleColors )
            // InternalDsl.g:1322:3: ruleColors
            {
             before(grammarAccess.getColorSensorAccess().getKeyColorsEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleColors();

            state._fsp--;

             after(grammarAccess.getColorSensorAccess().getKeyColorsEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColorSensor__KeyAssignment_4"


    // $ANTLR start "rule__TouchSensor__KeyAssignment_3"
    // InternalDsl.g:1331:1: rule__TouchSensor__KeyAssignment_3 : ( ruleTouchSensorSides ) ;
    public final void rule__TouchSensor__KeyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1335:1: ( ( ruleTouchSensorSides ) )
            // InternalDsl.g:1336:2: ( ruleTouchSensorSides )
            {
            // InternalDsl.g:1336:2: ( ruleTouchSensorSides )
            // InternalDsl.g:1337:3: ruleTouchSensorSides
            {
             before(grammarAccess.getTouchSensorAccess().getKeyTouchSensorSidesEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTouchSensorSides();

            state._fsp--;

             after(grammarAccess.getTouchSensorAccess().getKeyTouchSensorSidesEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TouchSensor__KeyAssignment_3"


    // $ANTLR start "rule__UltrasonicSensor__ComparatorAssignment_3"
    // InternalDsl.g:1346:1: rule__UltrasonicSensor__ComparatorAssignment_3 : ( ruleCompareOperator ) ;
    public final void rule__UltrasonicSensor__ComparatorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1350:1: ( ( ruleCompareOperator ) )
            // InternalDsl.g:1351:2: ( ruleCompareOperator )
            {
            // InternalDsl.g:1351:2: ( ruleCompareOperator )
            // InternalDsl.g:1352:3: ruleCompareOperator
            {
             before(grammarAccess.getUltrasonicSensorAccess().getComparatorCompareOperatorEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCompareOperator();

            state._fsp--;

             after(grammarAccess.getUltrasonicSensorAccess().getComparatorCompareOperatorEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UltrasonicSensor__ComparatorAssignment_3"


    // $ANTLR start "rule__UltrasonicSensor__DistanceAssignment_4"
    // InternalDsl.g:1361:1: rule__UltrasonicSensor__DistanceAssignment_4 : ( RULE_DECIMAL ) ;
    public final void rule__UltrasonicSensor__DistanceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1365:1: ( ( RULE_DECIMAL ) )
            // InternalDsl.g:1366:2: ( RULE_DECIMAL )
            {
            // InternalDsl.g:1366:2: ( RULE_DECIMAL )
            // InternalDsl.g:1367:3: RULE_DECIMAL
            {
             before(grammarAccess.getUltrasonicSensorAccess().getDistanceDECIMALTerminalRuleCall_4_0()); 
            match(input,RULE_DECIMAL,FOLLOW_2); 
             after(grammarAccess.getUltrasonicSensorAccess().getDistanceDECIMALTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UltrasonicSensor__DistanceAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000A00000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000FF8000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0051000000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000001FFF000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000007000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000007E000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000020L});

}