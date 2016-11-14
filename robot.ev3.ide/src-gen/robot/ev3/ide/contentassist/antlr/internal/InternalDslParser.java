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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_DECIMAL", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'LEFT'", "'RIGHT'", "'BOTH'", "'ROTATELEFT'", "'ROTATERIGHT'", "'DRIVEFORWARD'", "'DRIVEBACKWARD'", "'STOP'", "'TURNAROUND'", "'BEEP'", "'BLACK'", "'BLUE'", "'CYAN'", "'DARK_GRAY'", "'GRAY'", "'GREEN'", "'LIGHT_GRAY'", "'MAGENTA'", "'ORANGE'", "'PINK'", "'RED'", "'WHITE'", "'YELLOW'", "'=='", "'!='", "'>='", "'>'", "'<='", "'<'", "'Mission:'", "'Task:'", "'Uses:'", "'Do:'", "'ColorSensor'", "'On'", "'DetectedColor'", "'is:'", "'TouchSensor'", "'TouchedSide:'", "'USensor'", "'Distance:'"
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


    // $ANTLR start "entryRuleSensorType"
    // InternalDsl.g:103:1: entryRuleSensorType : ruleSensorType EOF ;
    public final void entryRuleSensorType() throws RecognitionException {
        try {
            // InternalDsl.g:104:1: ( ruleSensorType EOF )
            // InternalDsl.g:105:1: ruleSensorType EOF
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
    // InternalDsl.g:112:1: ruleSensorType : ( ( rule__SensorType__Alternatives ) ) ;
    public final void ruleSensorType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:116:2: ( ( ( rule__SensorType__Alternatives ) ) )
            // InternalDsl.g:117:2: ( ( rule__SensorType__Alternatives ) )
            {
            // InternalDsl.g:117:2: ( ( rule__SensorType__Alternatives ) )
            // InternalDsl.g:118:3: ( rule__SensorType__Alternatives )
            {
             before(grammarAccess.getSensorTypeAccess().getAlternatives()); 
            // InternalDsl.g:119:3: ( rule__SensorType__Alternatives )
            // InternalDsl.g:119:4: rule__SensorType__Alternatives
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
    // InternalDsl.g:128:1: entryRuleColorSensor : ruleColorSensor EOF ;
    public final void entryRuleColorSensor() throws RecognitionException {
        try {
            // InternalDsl.g:129:1: ( ruleColorSensor EOF )
            // InternalDsl.g:130:1: ruleColorSensor EOF
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
    // InternalDsl.g:137:1: ruleColorSensor : ( ( rule__ColorSensor__Group__0 ) ) ;
    public final void ruleColorSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:141:2: ( ( ( rule__ColorSensor__Group__0 ) ) )
            // InternalDsl.g:142:2: ( ( rule__ColorSensor__Group__0 ) )
            {
            // InternalDsl.g:142:2: ( ( rule__ColorSensor__Group__0 ) )
            // InternalDsl.g:143:3: ( rule__ColorSensor__Group__0 )
            {
             before(grammarAccess.getColorSensorAccess().getGroup()); 
            // InternalDsl.g:144:3: ( rule__ColorSensor__Group__0 )
            // InternalDsl.g:144:4: rule__ColorSensor__Group__0
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
    // InternalDsl.g:153:1: entryRuleTouchSensor : ruleTouchSensor EOF ;
    public final void entryRuleTouchSensor() throws RecognitionException {
        try {
            // InternalDsl.g:154:1: ( ruleTouchSensor EOF )
            // InternalDsl.g:155:1: ruleTouchSensor EOF
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
    // InternalDsl.g:162:1: ruleTouchSensor : ( ( rule__TouchSensor__Group__0 ) ) ;
    public final void ruleTouchSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:166:2: ( ( ( rule__TouchSensor__Group__0 ) ) )
            // InternalDsl.g:167:2: ( ( rule__TouchSensor__Group__0 ) )
            {
            // InternalDsl.g:167:2: ( ( rule__TouchSensor__Group__0 ) )
            // InternalDsl.g:168:3: ( rule__TouchSensor__Group__0 )
            {
             before(grammarAccess.getTouchSensorAccess().getGroup()); 
            // InternalDsl.g:169:3: ( rule__TouchSensor__Group__0 )
            // InternalDsl.g:169:4: rule__TouchSensor__Group__0
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
    // InternalDsl.g:178:1: entryRuleUltrasonicSensor : ruleUltrasonicSensor EOF ;
    public final void entryRuleUltrasonicSensor() throws RecognitionException {
        try {
            // InternalDsl.g:179:1: ( ruleUltrasonicSensor EOF )
            // InternalDsl.g:180:1: ruleUltrasonicSensor EOF
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
    // InternalDsl.g:187:1: ruleUltrasonicSensor : ( ( rule__UltrasonicSensor__Group__0 ) ) ;
    public final void ruleUltrasonicSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:191:2: ( ( ( rule__UltrasonicSensor__Group__0 ) ) )
            // InternalDsl.g:192:2: ( ( rule__UltrasonicSensor__Group__0 ) )
            {
            // InternalDsl.g:192:2: ( ( rule__UltrasonicSensor__Group__0 ) )
            // InternalDsl.g:193:3: ( rule__UltrasonicSensor__Group__0 )
            {
             before(grammarAccess.getUltrasonicSensorAccess().getGroup()); 
            // InternalDsl.g:194:3: ( rule__UltrasonicSensor__Group__0 )
            // InternalDsl.g:194:4: rule__UltrasonicSensor__Group__0
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
    // InternalDsl.g:203:1: ruleTouchSensorSides : ( ( rule__TouchSensorSides__Alternatives ) ) ;
    public final void ruleTouchSensorSides() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:207:1: ( ( ( rule__TouchSensorSides__Alternatives ) ) )
            // InternalDsl.g:208:2: ( ( rule__TouchSensorSides__Alternatives ) )
            {
            // InternalDsl.g:208:2: ( ( rule__TouchSensorSides__Alternatives ) )
            // InternalDsl.g:209:3: ( rule__TouchSensorSides__Alternatives )
            {
             before(grammarAccess.getTouchSensorSidesAccess().getAlternatives()); 
            // InternalDsl.g:210:3: ( rule__TouchSensorSides__Alternatives )
            // InternalDsl.g:210:4: rule__TouchSensorSides__Alternatives
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
    // InternalDsl.g:219:1: ruleActions : ( ( rule__Actions__Alternatives ) ) ;
    public final void ruleActions() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:223:1: ( ( ( rule__Actions__Alternatives ) ) )
            // InternalDsl.g:224:2: ( ( rule__Actions__Alternatives ) )
            {
            // InternalDsl.g:224:2: ( ( rule__Actions__Alternatives ) )
            // InternalDsl.g:225:3: ( rule__Actions__Alternatives )
            {
             before(grammarAccess.getActionsAccess().getAlternatives()); 
            // InternalDsl.g:226:3: ( rule__Actions__Alternatives )
            // InternalDsl.g:226:4: rule__Actions__Alternatives
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
    // InternalDsl.g:235:1: ruleColors : ( ( rule__Colors__Alternatives ) ) ;
    public final void ruleColors() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:239:1: ( ( ( rule__Colors__Alternatives ) ) )
            // InternalDsl.g:240:2: ( ( rule__Colors__Alternatives ) )
            {
            // InternalDsl.g:240:2: ( ( rule__Colors__Alternatives ) )
            // InternalDsl.g:241:3: ( rule__Colors__Alternatives )
            {
             before(grammarAccess.getColorsAccess().getAlternatives()); 
            // InternalDsl.g:242:3: ( rule__Colors__Alternatives )
            // InternalDsl.g:242:4: rule__Colors__Alternatives
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
    // InternalDsl.g:251:1: ruleCompareOperator : ( ( rule__CompareOperator__Alternatives ) ) ;
    public final void ruleCompareOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:255:1: ( ( ( rule__CompareOperator__Alternatives ) ) )
            // InternalDsl.g:256:2: ( ( rule__CompareOperator__Alternatives ) )
            {
            // InternalDsl.g:256:2: ( ( rule__CompareOperator__Alternatives ) )
            // InternalDsl.g:257:3: ( rule__CompareOperator__Alternatives )
            {
             before(grammarAccess.getCompareOperatorAccess().getAlternatives()); 
            // InternalDsl.g:258:3: ( rule__CompareOperator__Alternatives )
            // InternalDsl.g:258:4: rule__CompareOperator__Alternatives
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
    // InternalDsl.g:266:1: rule__SensorType__Alternatives : ( ( ruleColorSensor ) | ( ruleTouchSensor ) | ( ruleUltrasonicSensor ) );
    public final void rule__SensorType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:270:1: ( ( ruleColorSensor ) | ( ruleTouchSensor ) | ( ruleUltrasonicSensor ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt1=1;
                }
                break;
            case 49:
                {
                alt1=2;
                }
                break;
            case 51:
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
                    // InternalDsl.g:271:2: ( ruleColorSensor )
                    {
                    // InternalDsl.g:271:2: ( ruleColorSensor )
                    // InternalDsl.g:272:3: ruleColorSensor
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
                    // InternalDsl.g:277:2: ( ruleTouchSensor )
                    {
                    // InternalDsl.g:277:2: ( ruleTouchSensor )
                    // InternalDsl.g:278:3: ruleTouchSensor
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
                    // InternalDsl.g:283:2: ( ruleUltrasonicSensor )
                    {
                    // InternalDsl.g:283:2: ( ruleUltrasonicSensor )
                    // InternalDsl.g:284:3: ruleUltrasonicSensor
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
    // InternalDsl.g:293:1: rule__TouchSensorSides__Alternatives : ( ( ( 'LEFT' ) ) | ( ( 'RIGHT' ) ) | ( ( 'BOTH' ) ) );
    public final void rule__TouchSensorSides__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:297:1: ( ( ( 'LEFT' ) ) | ( ( 'RIGHT' ) ) | ( ( 'BOTH' ) ) )
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
                    // InternalDsl.g:298:2: ( ( 'LEFT' ) )
                    {
                    // InternalDsl.g:298:2: ( ( 'LEFT' ) )
                    // InternalDsl.g:299:3: ( 'LEFT' )
                    {
                     before(grammarAccess.getTouchSensorSidesAccess().getLEFTEnumLiteralDeclaration_0()); 
                    // InternalDsl.g:300:3: ( 'LEFT' )
                    // InternalDsl.g:300:4: 'LEFT'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getTouchSensorSidesAccess().getLEFTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:304:2: ( ( 'RIGHT' ) )
                    {
                    // InternalDsl.g:304:2: ( ( 'RIGHT' ) )
                    // InternalDsl.g:305:3: ( 'RIGHT' )
                    {
                     before(grammarAccess.getTouchSensorSidesAccess().getRIGHTEnumLiteralDeclaration_1()); 
                    // InternalDsl.g:306:3: ( 'RIGHT' )
                    // InternalDsl.g:306:4: 'RIGHT'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getTouchSensorSidesAccess().getRIGHTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:310:2: ( ( 'BOTH' ) )
                    {
                    // InternalDsl.g:310:2: ( ( 'BOTH' ) )
                    // InternalDsl.g:311:3: ( 'BOTH' )
                    {
                     before(grammarAccess.getTouchSensorSidesAccess().getBOTHEnumLiteralDeclaration_2()); 
                    // InternalDsl.g:312:3: ( 'BOTH' )
                    // InternalDsl.g:312:4: 'BOTH'
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
    // InternalDsl.g:320:1: rule__Actions__Alternatives : ( ( ( 'ROTATELEFT' ) ) | ( ( 'ROTATERIGHT' ) ) | ( ( 'DRIVEFORWARD' ) ) | ( ( 'DRIVEBACKWARD' ) ) | ( ( 'STOP' ) ) | ( ( 'TURNAROUND' ) ) | ( ( 'BEEP' ) ) );
    public final void rule__Actions__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:324:1: ( ( ( 'ROTATELEFT' ) ) | ( ( 'ROTATERIGHT' ) ) | ( ( 'DRIVEFORWARD' ) ) | ( ( 'DRIVEBACKWARD' ) ) | ( ( 'STOP' ) ) | ( ( 'TURNAROUND' ) ) | ( ( 'BEEP' ) ) )
            int alt3=7;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalDsl.g:325:2: ( ( 'ROTATELEFT' ) )
                    {
                    // InternalDsl.g:325:2: ( ( 'ROTATELEFT' ) )
                    // InternalDsl.g:326:3: ( 'ROTATELEFT' )
                    {
                     before(grammarAccess.getActionsAccess().getROTATE_LEnumLiteralDeclaration_0()); 
                    // InternalDsl.g:327:3: ( 'ROTATELEFT' )
                    // InternalDsl.g:327:4: 'ROTATELEFT'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionsAccess().getROTATE_LEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:331:2: ( ( 'ROTATERIGHT' ) )
                    {
                    // InternalDsl.g:331:2: ( ( 'ROTATERIGHT' ) )
                    // InternalDsl.g:332:3: ( 'ROTATERIGHT' )
                    {
                     before(grammarAccess.getActionsAccess().getROTATE_REnumLiteralDeclaration_1()); 
                    // InternalDsl.g:333:3: ( 'ROTATERIGHT' )
                    // InternalDsl.g:333:4: 'ROTATERIGHT'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionsAccess().getROTATE_REnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:337:2: ( ( 'DRIVEFORWARD' ) )
                    {
                    // InternalDsl.g:337:2: ( ( 'DRIVEFORWARD' ) )
                    // InternalDsl.g:338:3: ( 'DRIVEFORWARD' )
                    {
                     before(grammarAccess.getActionsAccess().getDRIVE_FORWARDEnumLiteralDeclaration_2()); 
                    // InternalDsl.g:339:3: ( 'DRIVEFORWARD' )
                    // InternalDsl.g:339:4: 'DRIVEFORWARD'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionsAccess().getDRIVE_FORWARDEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:343:2: ( ( 'DRIVEBACKWARD' ) )
                    {
                    // InternalDsl.g:343:2: ( ( 'DRIVEBACKWARD' ) )
                    // InternalDsl.g:344:3: ( 'DRIVEBACKWARD' )
                    {
                     before(grammarAccess.getActionsAccess().getDRIVE_BACKWARDEnumLiteralDeclaration_3()); 
                    // InternalDsl.g:345:3: ( 'DRIVEBACKWARD' )
                    // InternalDsl.g:345:4: 'DRIVEBACKWARD'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionsAccess().getDRIVE_BACKWARDEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:349:2: ( ( 'STOP' ) )
                    {
                    // InternalDsl.g:349:2: ( ( 'STOP' ) )
                    // InternalDsl.g:350:3: ( 'STOP' )
                    {
                     before(grammarAccess.getActionsAccess().getSTOP_DRIVINGEnumLiteralDeclaration_4()); 
                    // InternalDsl.g:351:3: ( 'STOP' )
                    // InternalDsl.g:351:4: 'STOP'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionsAccess().getSTOP_DRIVINGEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDsl.g:355:2: ( ( 'TURNAROUND' ) )
                    {
                    // InternalDsl.g:355:2: ( ( 'TURNAROUND' ) )
                    // InternalDsl.g:356:3: ( 'TURNAROUND' )
                    {
                     before(grammarAccess.getActionsAccess().getTURN_AROUNDEnumLiteralDeclaration_5()); 
                    // InternalDsl.g:357:3: ( 'TURNAROUND' )
                    // InternalDsl.g:357:4: 'TURNAROUND'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionsAccess().getTURN_AROUNDEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalDsl.g:361:2: ( ( 'BEEP' ) )
                    {
                    // InternalDsl.g:361:2: ( ( 'BEEP' ) )
                    // InternalDsl.g:362:3: ( 'BEEP' )
                    {
                     before(grammarAccess.getActionsAccess().getBEEPEnumLiteralDeclaration_6()); 
                    // InternalDsl.g:363:3: ( 'BEEP' )
                    // InternalDsl.g:363:4: 'BEEP'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getActionsAccess().getBEEPEnumLiteralDeclaration_6()); 

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
    // InternalDsl.g:371:1: rule__Colors__Alternatives : ( ( ( 'BLACK' ) ) | ( ( 'BLUE' ) ) | ( ( 'CYAN' ) ) | ( ( 'DARK_GRAY' ) ) | ( ( 'GRAY' ) ) | ( ( 'GREEN' ) ) | ( ( 'LIGHT_GRAY' ) ) | ( ( 'MAGENTA' ) ) | ( ( 'ORANGE' ) ) | ( ( 'PINK' ) ) | ( ( 'RED' ) ) | ( ( 'WHITE' ) ) | ( ( 'YELLOW' ) ) );
    public final void rule__Colors__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:375:1: ( ( ( 'BLACK' ) ) | ( ( 'BLUE' ) ) | ( ( 'CYAN' ) ) | ( ( 'DARK_GRAY' ) ) | ( ( 'GRAY' ) ) | ( ( 'GREEN' ) ) | ( ( 'LIGHT_GRAY' ) ) | ( ( 'MAGENTA' ) ) | ( ( 'ORANGE' ) ) | ( ( 'PINK' ) ) | ( ( 'RED' ) ) | ( ( 'WHITE' ) ) | ( ( 'YELLOW' ) ) )
            int alt4=13;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt4=1;
                }
                break;
            case 23:
                {
                alt4=2;
                }
                break;
            case 24:
                {
                alt4=3;
                }
                break;
            case 25:
                {
                alt4=4;
                }
                break;
            case 26:
                {
                alt4=5;
                }
                break;
            case 27:
                {
                alt4=6;
                }
                break;
            case 28:
                {
                alt4=7;
                }
                break;
            case 29:
                {
                alt4=8;
                }
                break;
            case 30:
                {
                alt4=9;
                }
                break;
            case 31:
                {
                alt4=10;
                }
                break;
            case 32:
                {
                alt4=11;
                }
                break;
            case 33:
                {
                alt4=12;
                }
                break;
            case 34:
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
                    // InternalDsl.g:376:2: ( ( 'BLACK' ) )
                    {
                    // InternalDsl.g:376:2: ( ( 'BLACK' ) )
                    // InternalDsl.g:377:3: ( 'BLACK' )
                    {
                     before(grammarAccess.getColorsAccess().getBLACKEnumLiteralDeclaration_0()); 
                    // InternalDsl.g:378:3: ( 'BLACK' )
                    // InternalDsl.g:378:4: 'BLACK'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorsAccess().getBLACKEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:382:2: ( ( 'BLUE' ) )
                    {
                    // InternalDsl.g:382:2: ( ( 'BLUE' ) )
                    // InternalDsl.g:383:3: ( 'BLUE' )
                    {
                     before(grammarAccess.getColorsAccess().getBLUEEnumLiteralDeclaration_1()); 
                    // InternalDsl.g:384:3: ( 'BLUE' )
                    // InternalDsl.g:384:4: 'BLUE'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorsAccess().getBLUEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:388:2: ( ( 'CYAN' ) )
                    {
                    // InternalDsl.g:388:2: ( ( 'CYAN' ) )
                    // InternalDsl.g:389:3: ( 'CYAN' )
                    {
                     before(grammarAccess.getColorsAccess().getCYANEnumLiteralDeclaration_2()); 
                    // InternalDsl.g:390:3: ( 'CYAN' )
                    // InternalDsl.g:390:4: 'CYAN'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorsAccess().getCYANEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:394:2: ( ( 'DARK_GRAY' ) )
                    {
                    // InternalDsl.g:394:2: ( ( 'DARK_GRAY' ) )
                    // InternalDsl.g:395:3: ( 'DARK_GRAY' )
                    {
                     before(grammarAccess.getColorsAccess().getDARK_GRAYEnumLiteralDeclaration_3()); 
                    // InternalDsl.g:396:3: ( 'DARK_GRAY' )
                    // InternalDsl.g:396:4: 'DARK_GRAY'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorsAccess().getDARK_GRAYEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:400:2: ( ( 'GRAY' ) )
                    {
                    // InternalDsl.g:400:2: ( ( 'GRAY' ) )
                    // InternalDsl.g:401:3: ( 'GRAY' )
                    {
                     before(grammarAccess.getColorsAccess().getGRAYEnumLiteralDeclaration_4()); 
                    // InternalDsl.g:402:3: ( 'GRAY' )
                    // InternalDsl.g:402:4: 'GRAY'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorsAccess().getGRAYEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDsl.g:406:2: ( ( 'GREEN' ) )
                    {
                    // InternalDsl.g:406:2: ( ( 'GREEN' ) )
                    // InternalDsl.g:407:3: ( 'GREEN' )
                    {
                     before(grammarAccess.getColorsAccess().getGREENEnumLiteralDeclaration_5()); 
                    // InternalDsl.g:408:3: ( 'GREEN' )
                    // InternalDsl.g:408:4: 'GREEN'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorsAccess().getGREENEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalDsl.g:412:2: ( ( 'LIGHT_GRAY' ) )
                    {
                    // InternalDsl.g:412:2: ( ( 'LIGHT_GRAY' ) )
                    // InternalDsl.g:413:3: ( 'LIGHT_GRAY' )
                    {
                     before(grammarAccess.getColorsAccess().getLIGHT_GRAYEnumLiteralDeclaration_6()); 
                    // InternalDsl.g:414:3: ( 'LIGHT_GRAY' )
                    // InternalDsl.g:414:4: 'LIGHT_GRAY'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorsAccess().getLIGHT_GRAYEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalDsl.g:418:2: ( ( 'MAGENTA' ) )
                    {
                    // InternalDsl.g:418:2: ( ( 'MAGENTA' ) )
                    // InternalDsl.g:419:3: ( 'MAGENTA' )
                    {
                     before(grammarAccess.getColorsAccess().getMAGENTAEnumLiteralDeclaration_7()); 
                    // InternalDsl.g:420:3: ( 'MAGENTA' )
                    // InternalDsl.g:420:4: 'MAGENTA'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorsAccess().getMAGENTAEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalDsl.g:424:2: ( ( 'ORANGE' ) )
                    {
                    // InternalDsl.g:424:2: ( ( 'ORANGE' ) )
                    // InternalDsl.g:425:3: ( 'ORANGE' )
                    {
                     before(grammarAccess.getColorsAccess().getORANGEEnumLiteralDeclaration_8()); 
                    // InternalDsl.g:426:3: ( 'ORANGE' )
                    // InternalDsl.g:426:4: 'ORANGE'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorsAccess().getORANGEEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalDsl.g:430:2: ( ( 'PINK' ) )
                    {
                    // InternalDsl.g:430:2: ( ( 'PINK' ) )
                    // InternalDsl.g:431:3: ( 'PINK' )
                    {
                     before(grammarAccess.getColorsAccess().getPINKEnumLiteralDeclaration_9()); 
                    // InternalDsl.g:432:3: ( 'PINK' )
                    // InternalDsl.g:432:4: 'PINK'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorsAccess().getPINKEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalDsl.g:436:2: ( ( 'RED' ) )
                    {
                    // InternalDsl.g:436:2: ( ( 'RED' ) )
                    // InternalDsl.g:437:3: ( 'RED' )
                    {
                     before(grammarAccess.getColorsAccess().getREDEnumLiteralDeclaration_10()); 
                    // InternalDsl.g:438:3: ( 'RED' )
                    // InternalDsl.g:438:4: 'RED'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorsAccess().getREDEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalDsl.g:442:2: ( ( 'WHITE' ) )
                    {
                    // InternalDsl.g:442:2: ( ( 'WHITE' ) )
                    // InternalDsl.g:443:3: ( 'WHITE' )
                    {
                     before(grammarAccess.getColorsAccess().getWHITEEnumLiteralDeclaration_11()); 
                    // InternalDsl.g:444:3: ( 'WHITE' )
                    // InternalDsl.g:444:4: 'WHITE'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getColorsAccess().getWHITEEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalDsl.g:448:2: ( ( 'YELLOW' ) )
                    {
                    // InternalDsl.g:448:2: ( ( 'YELLOW' ) )
                    // InternalDsl.g:449:3: ( 'YELLOW' )
                    {
                     before(grammarAccess.getColorsAccess().getYELLOWEnumLiteralDeclaration_12()); 
                    // InternalDsl.g:450:3: ( 'YELLOW' )
                    // InternalDsl.g:450:4: 'YELLOW'
                    {
                    match(input,34,FOLLOW_2); 

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
    // InternalDsl.g:458:1: rule__CompareOperator__Alternatives : ( ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '>=' ) ) | ( ( '>' ) ) | ( ( '<=' ) ) | ( ( '<' ) ) );
    public final void rule__CompareOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:462:1: ( ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '>=' ) ) | ( ( '>' ) ) | ( ( '<=' ) ) | ( ( '<' ) ) )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt5=1;
                }
                break;
            case 36:
                {
                alt5=2;
                }
                break;
            case 37:
                {
                alt5=3;
                }
                break;
            case 38:
                {
                alt5=4;
                }
                break;
            case 39:
                {
                alt5=5;
                }
                break;
            case 40:
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
                    // InternalDsl.g:463:2: ( ( '==' ) )
                    {
                    // InternalDsl.g:463:2: ( ( '==' ) )
                    // InternalDsl.g:464:3: ( '==' )
                    {
                     before(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    // InternalDsl.g:465:3: ( '==' )
                    // InternalDsl.g:465:4: '=='
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:469:2: ( ( '!=' ) )
                    {
                    // InternalDsl.g:469:2: ( ( '!=' ) )
                    // InternalDsl.g:470:3: ( '!=' )
                    {
                     before(grammarAccess.getCompareOperatorAccess().getNEQEnumLiteralDeclaration_1()); 
                    // InternalDsl.g:471:3: ( '!=' )
                    // InternalDsl.g:471:4: '!='
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getCompareOperatorAccess().getNEQEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:475:2: ( ( '>=' ) )
                    {
                    // InternalDsl.g:475:2: ( ( '>=' ) )
                    // InternalDsl.g:476:3: ( '>=' )
                    {
                     before(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_2()); 
                    // InternalDsl.g:477:3: ( '>=' )
                    // InternalDsl.g:477:4: '>='
                    {
                    match(input,37,FOLLOW_2); 

                    }

                     after(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:481:2: ( ( '>' ) )
                    {
                    // InternalDsl.g:481:2: ( ( '>' ) )
                    // InternalDsl.g:482:3: ( '>' )
                    {
                     before(grammarAccess.getCompareOperatorAccess().getGEnumLiteralDeclaration_3()); 
                    // InternalDsl.g:483:3: ( '>' )
                    // InternalDsl.g:483:4: '>'
                    {
                    match(input,38,FOLLOW_2); 

                    }

                     after(grammarAccess.getCompareOperatorAccess().getGEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:487:2: ( ( '<=' ) )
                    {
                    // InternalDsl.g:487:2: ( ( '<=' ) )
                    // InternalDsl.g:488:3: ( '<=' )
                    {
                     before(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_4()); 
                    // InternalDsl.g:489:3: ( '<=' )
                    // InternalDsl.g:489:4: '<='
                    {
                    match(input,39,FOLLOW_2); 

                    }

                     after(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDsl.g:493:2: ( ( '<' ) )
                    {
                    // InternalDsl.g:493:2: ( ( '<' ) )
                    // InternalDsl.g:494:3: ( '<' )
                    {
                     before(grammarAccess.getCompareOperatorAccess().getLEnumLiteralDeclaration_5()); 
                    // InternalDsl.g:495:3: ( '<' )
                    // InternalDsl.g:495:4: '<'
                    {
                    match(input,40,FOLLOW_2); 

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
    // InternalDsl.g:503:1: rule__Mission__Group__0 : rule__Mission__Group__0__Impl rule__Mission__Group__1 ;
    public final void rule__Mission__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:507:1: ( rule__Mission__Group__0__Impl rule__Mission__Group__1 )
            // InternalDsl.g:508:2: rule__Mission__Group__0__Impl rule__Mission__Group__1
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
    // InternalDsl.g:515:1: rule__Mission__Group__0__Impl : ( 'Mission:' ) ;
    public final void rule__Mission__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:519:1: ( ( 'Mission:' ) )
            // InternalDsl.g:520:1: ( 'Mission:' )
            {
            // InternalDsl.g:520:1: ( 'Mission:' )
            // InternalDsl.g:521:2: 'Mission:'
            {
             before(grammarAccess.getMissionAccess().getMissionKeyword_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalDsl.g:530:1: rule__Mission__Group__1 : rule__Mission__Group__1__Impl ;
    public final void rule__Mission__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:534:1: ( rule__Mission__Group__1__Impl )
            // InternalDsl.g:535:2: rule__Mission__Group__1__Impl
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
    // InternalDsl.g:541:1: rule__Mission__Group__1__Impl : ( ( ( rule__Mission__TasksAssignment_1 ) ) ( ( rule__Mission__TasksAssignment_1 )* ) ) ;
    public final void rule__Mission__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:545:1: ( ( ( ( rule__Mission__TasksAssignment_1 ) ) ( ( rule__Mission__TasksAssignment_1 )* ) ) )
            // InternalDsl.g:546:1: ( ( ( rule__Mission__TasksAssignment_1 ) ) ( ( rule__Mission__TasksAssignment_1 )* ) )
            {
            // InternalDsl.g:546:1: ( ( ( rule__Mission__TasksAssignment_1 ) ) ( ( rule__Mission__TasksAssignment_1 )* ) )
            // InternalDsl.g:547:2: ( ( rule__Mission__TasksAssignment_1 ) ) ( ( rule__Mission__TasksAssignment_1 )* )
            {
            // InternalDsl.g:547:2: ( ( rule__Mission__TasksAssignment_1 ) )
            // InternalDsl.g:548:3: ( rule__Mission__TasksAssignment_1 )
            {
             before(grammarAccess.getMissionAccess().getTasksAssignment_1()); 
            // InternalDsl.g:549:3: ( rule__Mission__TasksAssignment_1 )
            // InternalDsl.g:549:4: rule__Mission__TasksAssignment_1
            {
            pushFollow(FOLLOW_4);
            rule__Mission__TasksAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getTasksAssignment_1()); 

            }

            // InternalDsl.g:552:2: ( ( rule__Mission__TasksAssignment_1 )* )
            // InternalDsl.g:553:3: ( rule__Mission__TasksAssignment_1 )*
            {
             before(grammarAccess.getMissionAccess().getTasksAssignment_1()); 
            // InternalDsl.g:554:3: ( rule__Mission__TasksAssignment_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==42) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDsl.g:554:4: rule__Mission__TasksAssignment_1
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
    // InternalDsl.g:564:1: rule__Task__Group__0 : rule__Task__Group__0__Impl rule__Task__Group__1 ;
    public final void rule__Task__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:568:1: ( rule__Task__Group__0__Impl rule__Task__Group__1 )
            // InternalDsl.g:569:2: rule__Task__Group__0__Impl rule__Task__Group__1
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
    // InternalDsl.g:576:1: rule__Task__Group__0__Impl : ( 'Task:' ) ;
    public final void rule__Task__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:580:1: ( ( 'Task:' ) )
            // InternalDsl.g:581:1: ( 'Task:' )
            {
            // InternalDsl.g:581:1: ( 'Task:' )
            // InternalDsl.g:582:2: 'Task:'
            {
             before(grammarAccess.getTaskAccess().getTaskKeyword_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalDsl.g:591:1: rule__Task__Group__1 : rule__Task__Group__1__Impl rule__Task__Group__2 ;
    public final void rule__Task__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:595:1: ( rule__Task__Group__1__Impl rule__Task__Group__2 )
            // InternalDsl.g:596:2: rule__Task__Group__1__Impl rule__Task__Group__2
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
    // InternalDsl.g:603:1: rule__Task__Group__1__Impl : ( ( rule__Task__NameAssignment_1 ) ) ;
    public final void rule__Task__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:607:1: ( ( ( rule__Task__NameAssignment_1 ) ) )
            // InternalDsl.g:608:1: ( ( rule__Task__NameAssignment_1 ) )
            {
            // InternalDsl.g:608:1: ( ( rule__Task__NameAssignment_1 ) )
            // InternalDsl.g:609:2: ( rule__Task__NameAssignment_1 )
            {
             before(grammarAccess.getTaskAccess().getNameAssignment_1()); 
            // InternalDsl.g:610:2: ( rule__Task__NameAssignment_1 )
            // InternalDsl.g:610:3: rule__Task__NameAssignment_1
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
    // InternalDsl.g:618:1: rule__Task__Group__2 : rule__Task__Group__2__Impl rule__Task__Group__3 ;
    public final void rule__Task__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:622:1: ( rule__Task__Group__2__Impl rule__Task__Group__3 )
            // InternalDsl.g:623:2: rule__Task__Group__2__Impl rule__Task__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalDsl.g:630:1: rule__Task__Group__2__Impl : ( 'Uses:' ) ;
    public final void rule__Task__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:634:1: ( ( 'Uses:' ) )
            // InternalDsl.g:635:1: ( 'Uses:' )
            {
            // InternalDsl.g:635:1: ( 'Uses:' )
            // InternalDsl.g:636:2: 'Uses:'
            {
             before(grammarAccess.getTaskAccess().getUsesKeyword_2()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getUsesKeyword_2()); 

            }


            }

        }
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
    // InternalDsl.g:645:1: rule__Task__Group__3 : rule__Task__Group__3__Impl rule__Task__Group__4 ;
    public final void rule__Task__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:649:1: ( rule__Task__Group__3__Impl rule__Task__Group__4 )
            // InternalDsl.g:650:2: rule__Task__Group__3__Impl rule__Task__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalDsl.g:657:1: rule__Task__Group__3__Impl : ( ( rule__Task__SensorAssignment_3 ) ) ;
    public final void rule__Task__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:661:1: ( ( ( rule__Task__SensorAssignment_3 ) ) )
            // InternalDsl.g:662:1: ( ( rule__Task__SensorAssignment_3 ) )
            {
            // InternalDsl.g:662:1: ( ( rule__Task__SensorAssignment_3 ) )
            // InternalDsl.g:663:2: ( rule__Task__SensorAssignment_3 )
            {
             before(grammarAccess.getTaskAccess().getSensorAssignment_3()); 
            // InternalDsl.g:664:2: ( rule__Task__SensorAssignment_3 )
            // InternalDsl.g:664:3: rule__Task__SensorAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Task__SensorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getSensorAssignment_3()); 

            }


            }

        }
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
    // InternalDsl.g:672:1: rule__Task__Group__4 : rule__Task__Group__4__Impl rule__Task__Group__5 ;
    public final void rule__Task__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:676:1: ( rule__Task__Group__4__Impl rule__Task__Group__5 )
            // InternalDsl.g:677:2: rule__Task__Group__4__Impl rule__Task__Group__5
            {
            pushFollow(FOLLOW_9);
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
    // InternalDsl.g:684:1: rule__Task__Group__4__Impl : ( 'Do:' ) ;
    public final void rule__Task__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:688:1: ( ( 'Do:' ) )
            // InternalDsl.g:689:1: ( 'Do:' )
            {
            // InternalDsl.g:689:1: ( 'Do:' )
            // InternalDsl.g:690:2: 'Do:'
            {
             before(grammarAccess.getTaskAccess().getDoKeyword_4()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getDoKeyword_4()); 

            }


            }

        }
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
    // InternalDsl.g:699:1: rule__Task__Group__5 : rule__Task__Group__5__Impl ;
    public final void rule__Task__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:703:1: ( rule__Task__Group__5__Impl )
            // InternalDsl.g:704:2: rule__Task__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group__5__Impl();

            state._fsp--;


            }

        }
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
    // InternalDsl.g:710:1: rule__Task__Group__5__Impl : ( ( rule__Task__ActionAssignment_5 ) ) ;
    public final void rule__Task__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:714:1: ( ( ( rule__Task__ActionAssignment_5 ) ) )
            // InternalDsl.g:715:1: ( ( rule__Task__ActionAssignment_5 ) )
            {
            // InternalDsl.g:715:1: ( ( rule__Task__ActionAssignment_5 ) )
            // InternalDsl.g:716:2: ( rule__Task__ActionAssignment_5 )
            {
             before(grammarAccess.getTaskAccess().getActionAssignment_5()); 
            // InternalDsl.g:717:2: ( rule__Task__ActionAssignment_5 )
            // InternalDsl.g:717:3: rule__Task__ActionAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Task__ActionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getActionAssignment_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__ColorSensor__Group__0"
    // InternalDsl.g:726:1: rule__ColorSensor__Group__0 : rule__ColorSensor__Group__0__Impl rule__ColorSensor__Group__1 ;
    public final void rule__ColorSensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:730:1: ( rule__ColorSensor__Group__0__Impl rule__ColorSensor__Group__1 )
            // InternalDsl.g:731:2: rule__ColorSensor__Group__0__Impl rule__ColorSensor__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalDsl.g:738:1: rule__ColorSensor__Group__0__Impl : ( 'ColorSensor' ) ;
    public final void rule__ColorSensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:742:1: ( ( 'ColorSensor' ) )
            // InternalDsl.g:743:1: ( 'ColorSensor' )
            {
            // InternalDsl.g:743:1: ( 'ColorSensor' )
            // InternalDsl.g:744:2: 'ColorSensor'
            {
             before(grammarAccess.getColorSensorAccess().getColorSensorKeyword_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalDsl.g:753:1: rule__ColorSensor__Group__1 : rule__ColorSensor__Group__1__Impl rule__ColorSensor__Group__2 ;
    public final void rule__ColorSensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:757:1: ( rule__ColorSensor__Group__1__Impl rule__ColorSensor__Group__2 )
            // InternalDsl.g:758:2: rule__ColorSensor__Group__1__Impl rule__ColorSensor__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalDsl.g:765:1: rule__ColorSensor__Group__1__Impl : ( 'On' ) ;
    public final void rule__ColorSensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:769:1: ( ( 'On' ) )
            // InternalDsl.g:770:1: ( 'On' )
            {
            // InternalDsl.g:770:1: ( 'On' )
            // InternalDsl.g:771:2: 'On'
            {
             before(grammarAccess.getColorSensorAccess().getOnKeyword_1()); 
            match(input,46,FOLLOW_2); 
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
    // InternalDsl.g:780:1: rule__ColorSensor__Group__2 : rule__ColorSensor__Group__2__Impl rule__ColorSensor__Group__3 ;
    public final void rule__ColorSensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:784:1: ( rule__ColorSensor__Group__2__Impl rule__ColorSensor__Group__3 )
            // InternalDsl.g:785:2: rule__ColorSensor__Group__2__Impl rule__ColorSensor__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalDsl.g:792:1: rule__ColorSensor__Group__2__Impl : ( 'DetectedColor' ) ;
    public final void rule__ColorSensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:796:1: ( ( 'DetectedColor' ) )
            // InternalDsl.g:797:1: ( 'DetectedColor' )
            {
            // InternalDsl.g:797:1: ( 'DetectedColor' )
            // InternalDsl.g:798:2: 'DetectedColor'
            {
             before(grammarAccess.getColorSensorAccess().getDetectedColorKeyword_2()); 
            match(input,47,FOLLOW_2); 
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
    // InternalDsl.g:807:1: rule__ColorSensor__Group__3 : rule__ColorSensor__Group__3__Impl rule__ColorSensor__Group__4 ;
    public final void rule__ColorSensor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:811:1: ( rule__ColorSensor__Group__3__Impl rule__ColorSensor__Group__4 )
            // InternalDsl.g:812:2: rule__ColorSensor__Group__3__Impl rule__ColorSensor__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalDsl.g:819:1: rule__ColorSensor__Group__3__Impl : ( 'is:' ) ;
    public final void rule__ColorSensor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:823:1: ( ( 'is:' ) )
            // InternalDsl.g:824:1: ( 'is:' )
            {
            // InternalDsl.g:824:1: ( 'is:' )
            // InternalDsl.g:825:2: 'is:'
            {
             before(grammarAccess.getColorSensorAccess().getIsKeyword_3()); 
            match(input,48,FOLLOW_2); 
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
    // InternalDsl.g:834:1: rule__ColorSensor__Group__4 : rule__ColorSensor__Group__4__Impl ;
    public final void rule__ColorSensor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:838:1: ( rule__ColorSensor__Group__4__Impl )
            // InternalDsl.g:839:2: rule__ColorSensor__Group__4__Impl
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
    // InternalDsl.g:845:1: rule__ColorSensor__Group__4__Impl : ( ( rule__ColorSensor__KeyAssignment_4 ) ) ;
    public final void rule__ColorSensor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:849:1: ( ( ( rule__ColorSensor__KeyAssignment_4 ) ) )
            // InternalDsl.g:850:1: ( ( rule__ColorSensor__KeyAssignment_4 ) )
            {
            // InternalDsl.g:850:1: ( ( rule__ColorSensor__KeyAssignment_4 ) )
            // InternalDsl.g:851:2: ( rule__ColorSensor__KeyAssignment_4 )
            {
             before(grammarAccess.getColorSensorAccess().getKeyAssignment_4()); 
            // InternalDsl.g:852:2: ( rule__ColorSensor__KeyAssignment_4 )
            // InternalDsl.g:852:3: rule__ColorSensor__KeyAssignment_4
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
    // InternalDsl.g:861:1: rule__TouchSensor__Group__0 : rule__TouchSensor__Group__0__Impl rule__TouchSensor__Group__1 ;
    public final void rule__TouchSensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:865:1: ( rule__TouchSensor__Group__0__Impl rule__TouchSensor__Group__1 )
            // InternalDsl.g:866:2: rule__TouchSensor__Group__0__Impl rule__TouchSensor__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalDsl.g:873:1: rule__TouchSensor__Group__0__Impl : ( 'TouchSensor' ) ;
    public final void rule__TouchSensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:877:1: ( ( 'TouchSensor' ) )
            // InternalDsl.g:878:1: ( 'TouchSensor' )
            {
            // InternalDsl.g:878:1: ( 'TouchSensor' )
            // InternalDsl.g:879:2: 'TouchSensor'
            {
             before(grammarAccess.getTouchSensorAccess().getTouchSensorKeyword_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalDsl.g:888:1: rule__TouchSensor__Group__1 : rule__TouchSensor__Group__1__Impl rule__TouchSensor__Group__2 ;
    public final void rule__TouchSensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:892:1: ( rule__TouchSensor__Group__1__Impl rule__TouchSensor__Group__2 )
            // InternalDsl.g:893:2: rule__TouchSensor__Group__1__Impl rule__TouchSensor__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalDsl.g:900:1: rule__TouchSensor__Group__1__Impl : ( 'On' ) ;
    public final void rule__TouchSensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:904:1: ( ( 'On' ) )
            // InternalDsl.g:905:1: ( 'On' )
            {
            // InternalDsl.g:905:1: ( 'On' )
            // InternalDsl.g:906:2: 'On'
            {
             before(grammarAccess.getTouchSensorAccess().getOnKeyword_1()); 
            match(input,46,FOLLOW_2); 
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
    // InternalDsl.g:915:1: rule__TouchSensor__Group__2 : rule__TouchSensor__Group__2__Impl rule__TouchSensor__Group__3 ;
    public final void rule__TouchSensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:919:1: ( rule__TouchSensor__Group__2__Impl rule__TouchSensor__Group__3 )
            // InternalDsl.g:920:2: rule__TouchSensor__Group__2__Impl rule__TouchSensor__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalDsl.g:927:1: rule__TouchSensor__Group__2__Impl : ( 'TouchedSide:' ) ;
    public final void rule__TouchSensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:931:1: ( ( 'TouchedSide:' ) )
            // InternalDsl.g:932:1: ( 'TouchedSide:' )
            {
            // InternalDsl.g:932:1: ( 'TouchedSide:' )
            // InternalDsl.g:933:2: 'TouchedSide:'
            {
             before(grammarAccess.getTouchSensorAccess().getTouchedSideKeyword_2()); 
            match(input,50,FOLLOW_2); 
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
    // InternalDsl.g:942:1: rule__TouchSensor__Group__3 : rule__TouchSensor__Group__3__Impl ;
    public final void rule__TouchSensor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:946:1: ( rule__TouchSensor__Group__3__Impl )
            // InternalDsl.g:947:2: rule__TouchSensor__Group__3__Impl
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
    // InternalDsl.g:953:1: rule__TouchSensor__Group__3__Impl : ( ( rule__TouchSensor__KeyAssignment_3 ) ) ;
    public final void rule__TouchSensor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:957:1: ( ( ( rule__TouchSensor__KeyAssignment_3 ) ) )
            // InternalDsl.g:958:1: ( ( rule__TouchSensor__KeyAssignment_3 ) )
            {
            // InternalDsl.g:958:1: ( ( rule__TouchSensor__KeyAssignment_3 ) )
            // InternalDsl.g:959:2: ( rule__TouchSensor__KeyAssignment_3 )
            {
             before(grammarAccess.getTouchSensorAccess().getKeyAssignment_3()); 
            // InternalDsl.g:960:2: ( rule__TouchSensor__KeyAssignment_3 )
            // InternalDsl.g:960:3: rule__TouchSensor__KeyAssignment_3
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
    // InternalDsl.g:969:1: rule__UltrasonicSensor__Group__0 : rule__UltrasonicSensor__Group__0__Impl rule__UltrasonicSensor__Group__1 ;
    public final void rule__UltrasonicSensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:973:1: ( rule__UltrasonicSensor__Group__0__Impl rule__UltrasonicSensor__Group__1 )
            // InternalDsl.g:974:2: rule__UltrasonicSensor__Group__0__Impl rule__UltrasonicSensor__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalDsl.g:981:1: rule__UltrasonicSensor__Group__0__Impl : ( 'USensor' ) ;
    public final void rule__UltrasonicSensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:985:1: ( ( 'USensor' ) )
            // InternalDsl.g:986:1: ( 'USensor' )
            {
            // InternalDsl.g:986:1: ( 'USensor' )
            // InternalDsl.g:987:2: 'USensor'
            {
             before(grammarAccess.getUltrasonicSensorAccess().getUSensorKeyword_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalDsl.g:996:1: rule__UltrasonicSensor__Group__1 : rule__UltrasonicSensor__Group__1__Impl rule__UltrasonicSensor__Group__2 ;
    public final void rule__UltrasonicSensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1000:1: ( rule__UltrasonicSensor__Group__1__Impl rule__UltrasonicSensor__Group__2 )
            // InternalDsl.g:1001:2: rule__UltrasonicSensor__Group__1__Impl rule__UltrasonicSensor__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalDsl.g:1008:1: rule__UltrasonicSensor__Group__1__Impl : ( 'On' ) ;
    public final void rule__UltrasonicSensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1012:1: ( ( 'On' ) )
            // InternalDsl.g:1013:1: ( 'On' )
            {
            // InternalDsl.g:1013:1: ( 'On' )
            // InternalDsl.g:1014:2: 'On'
            {
             before(grammarAccess.getUltrasonicSensorAccess().getOnKeyword_1()); 
            match(input,46,FOLLOW_2); 
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
    // InternalDsl.g:1023:1: rule__UltrasonicSensor__Group__2 : rule__UltrasonicSensor__Group__2__Impl rule__UltrasonicSensor__Group__3 ;
    public final void rule__UltrasonicSensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1027:1: ( rule__UltrasonicSensor__Group__2__Impl rule__UltrasonicSensor__Group__3 )
            // InternalDsl.g:1028:2: rule__UltrasonicSensor__Group__2__Impl rule__UltrasonicSensor__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalDsl.g:1035:1: rule__UltrasonicSensor__Group__2__Impl : ( 'Distance:' ) ;
    public final void rule__UltrasonicSensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1039:1: ( ( 'Distance:' ) )
            // InternalDsl.g:1040:1: ( 'Distance:' )
            {
            // InternalDsl.g:1040:1: ( 'Distance:' )
            // InternalDsl.g:1041:2: 'Distance:'
            {
             before(grammarAccess.getUltrasonicSensorAccess().getDistanceKeyword_2()); 
            match(input,52,FOLLOW_2); 
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
    // InternalDsl.g:1050:1: rule__UltrasonicSensor__Group__3 : rule__UltrasonicSensor__Group__3__Impl rule__UltrasonicSensor__Group__4 ;
    public final void rule__UltrasonicSensor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1054:1: ( rule__UltrasonicSensor__Group__3__Impl rule__UltrasonicSensor__Group__4 )
            // InternalDsl.g:1055:2: rule__UltrasonicSensor__Group__3__Impl rule__UltrasonicSensor__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalDsl.g:1062:1: rule__UltrasonicSensor__Group__3__Impl : ( ( rule__UltrasonicSensor__ComparatorAssignment_3 ) ) ;
    public final void rule__UltrasonicSensor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1066:1: ( ( ( rule__UltrasonicSensor__ComparatorAssignment_3 ) ) )
            // InternalDsl.g:1067:1: ( ( rule__UltrasonicSensor__ComparatorAssignment_3 ) )
            {
            // InternalDsl.g:1067:1: ( ( rule__UltrasonicSensor__ComparatorAssignment_3 ) )
            // InternalDsl.g:1068:2: ( rule__UltrasonicSensor__ComparatorAssignment_3 )
            {
             before(grammarAccess.getUltrasonicSensorAccess().getComparatorAssignment_3()); 
            // InternalDsl.g:1069:2: ( rule__UltrasonicSensor__ComparatorAssignment_3 )
            // InternalDsl.g:1069:3: rule__UltrasonicSensor__ComparatorAssignment_3
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
    // InternalDsl.g:1077:1: rule__UltrasonicSensor__Group__4 : rule__UltrasonicSensor__Group__4__Impl ;
    public final void rule__UltrasonicSensor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1081:1: ( rule__UltrasonicSensor__Group__4__Impl )
            // InternalDsl.g:1082:2: rule__UltrasonicSensor__Group__4__Impl
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
    // InternalDsl.g:1088:1: rule__UltrasonicSensor__Group__4__Impl : ( ( rule__UltrasonicSensor__DistanceAssignment_4 ) ) ;
    public final void rule__UltrasonicSensor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1092:1: ( ( ( rule__UltrasonicSensor__DistanceAssignment_4 ) ) )
            // InternalDsl.g:1093:1: ( ( rule__UltrasonicSensor__DistanceAssignment_4 ) )
            {
            // InternalDsl.g:1093:1: ( ( rule__UltrasonicSensor__DistanceAssignment_4 ) )
            // InternalDsl.g:1094:2: ( rule__UltrasonicSensor__DistanceAssignment_4 )
            {
             before(grammarAccess.getUltrasonicSensorAccess().getDistanceAssignment_4()); 
            // InternalDsl.g:1095:2: ( rule__UltrasonicSensor__DistanceAssignment_4 )
            // InternalDsl.g:1095:3: rule__UltrasonicSensor__DistanceAssignment_4
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
    // InternalDsl.g:1104:1: rule__Mission__TasksAssignment_1 : ( ruleTask ) ;
    public final void rule__Mission__TasksAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1108:1: ( ( ruleTask ) )
            // InternalDsl.g:1109:2: ( ruleTask )
            {
            // InternalDsl.g:1109:2: ( ruleTask )
            // InternalDsl.g:1110:3: ruleTask
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
    // InternalDsl.g:1119:1: rule__Task__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Task__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1123:1: ( ( RULE_ID ) )
            // InternalDsl.g:1124:2: ( RULE_ID )
            {
            // InternalDsl.g:1124:2: ( RULE_ID )
            // InternalDsl.g:1125:3: RULE_ID
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


    // $ANTLR start "rule__Task__SensorAssignment_3"
    // InternalDsl.g:1134:1: rule__Task__SensorAssignment_3 : ( ruleSensorType ) ;
    public final void rule__Task__SensorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1138:1: ( ( ruleSensorType ) )
            // InternalDsl.g:1139:2: ( ruleSensorType )
            {
            // InternalDsl.g:1139:2: ( ruleSensorType )
            // InternalDsl.g:1140:3: ruleSensorType
            {
             before(grammarAccess.getTaskAccess().getSensorSensorTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSensorType();

            state._fsp--;

             after(grammarAccess.getTaskAccess().getSensorSensorTypeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__SensorAssignment_3"


    // $ANTLR start "rule__Task__ActionAssignment_5"
    // InternalDsl.g:1149:1: rule__Task__ActionAssignment_5 : ( ruleActions ) ;
    public final void rule__Task__ActionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1153:1: ( ( ruleActions ) )
            // InternalDsl.g:1154:2: ( ruleActions )
            {
            // InternalDsl.g:1154:2: ( ruleActions )
            // InternalDsl.g:1155:3: ruleActions
            {
             before(grammarAccess.getTaskAccess().getActionActionsEnumRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleActions();

            state._fsp--;

             after(grammarAccess.getTaskAccess().getActionActionsEnumRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__ActionAssignment_5"


    // $ANTLR start "rule__ColorSensor__KeyAssignment_4"
    // InternalDsl.g:1164:1: rule__ColorSensor__KeyAssignment_4 : ( ruleColors ) ;
    public final void rule__ColorSensor__KeyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1168:1: ( ( ruleColors ) )
            // InternalDsl.g:1169:2: ( ruleColors )
            {
            // InternalDsl.g:1169:2: ( ruleColors )
            // InternalDsl.g:1170:3: ruleColors
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
    // InternalDsl.g:1179:1: rule__TouchSensor__KeyAssignment_3 : ( ruleTouchSensorSides ) ;
    public final void rule__TouchSensor__KeyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1183:1: ( ( ruleTouchSensorSides ) )
            // InternalDsl.g:1184:2: ( ruleTouchSensorSides )
            {
            // InternalDsl.g:1184:2: ( ruleTouchSensorSides )
            // InternalDsl.g:1185:3: ruleTouchSensorSides
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
    // InternalDsl.g:1194:1: rule__UltrasonicSensor__ComparatorAssignment_3 : ( ruleCompareOperator ) ;
    public final void rule__UltrasonicSensor__ComparatorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1198:1: ( ( ruleCompareOperator ) )
            // InternalDsl.g:1199:2: ( ruleCompareOperator )
            {
            // InternalDsl.g:1199:2: ( ruleCompareOperator )
            // InternalDsl.g:1200:3: ruleCompareOperator
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
    // InternalDsl.g:1209:1: rule__UltrasonicSensor__DistanceAssignment_4 : ( RULE_DECIMAL ) ;
    public final void rule__UltrasonicSensor__DistanceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1213:1: ( ( RULE_DECIMAL ) )
            // InternalDsl.g:1214:2: ( RULE_DECIMAL )
            {
            // InternalDsl.g:1214:2: ( RULE_DECIMAL )
            // InternalDsl.g:1215:3: RULE_DECIMAL
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000A200000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000003F8000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000007FFC00000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000007000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000001F800000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000020L});

}