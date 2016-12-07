package robot.ev3.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslLexer extends Lexer {
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

    public InternalDslLexer() {;} 
    public InternalDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalDsl.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:11:7: ( 'LEFT' )
            // InternalDsl.g:11:9: 'LEFT'
            {
            match("LEFT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:12:7: ( 'RIGHT' )
            // InternalDsl.g:12:9: 'RIGHT'
            {
            match("RIGHT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:13:7: ( 'BOTH' )
            // InternalDsl.g:13:9: 'BOTH'
            {
            match("BOTH"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:14:7: ( 'ROTATELEFT' )
            // InternalDsl.g:14:9: 'ROTATELEFT'
            {
            match("ROTATELEFT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:15:7: ( 'ROTATERIGHT' )
            // InternalDsl.g:15:9: 'ROTATERIGHT'
            {
            match("ROTATERIGHT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:16:7: ( 'DRIVEFORWARD' )
            // InternalDsl.g:16:9: 'DRIVEFORWARD'
            {
            match("DRIVEFORWARD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:17:7: ( 'DRIVEBACKWARD' )
            // InternalDsl.g:17:9: 'DRIVEBACKWARD'
            {
            match("DRIVEBACKWARD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:18:7: ( 'STOP' )
            // InternalDsl.g:18:9: 'STOP'
            {
            match("STOP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:19:7: ( 'TURNAROUND' )
            // InternalDsl.g:19:9: 'TURNAROUND'
            {
            match("TURNAROUND"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:20:7: ( 'BEEP' )
            // InternalDsl.g:20:9: 'BEEP'
            {
            match("BEEP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:21:7: ( 'MEASURE' )
            // InternalDsl.g:21:9: 'MEASURE'
            {
            match("MEASURE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:22:7: ( 'DRIVETOEDGE' )
            // InternalDsl.g:22:9: 'DRIVETOEDGE'
            {
            match("DRIVETOEDGE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:23:7: ( 'BLACK' )
            // InternalDsl.g:23:9: 'BLACK'
            {
            match("BLACK"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:24:7: ( 'BLUE' )
            // InternalDsl.g:24:9: 'BLUE'
            {
            match("BLUE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:25:7: ( 'CYAN' )
            // InternalDsl.g:25:9: 'CYAN'
            {
            match("CYAN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:26:7: ( 'DARK_GRAY' )
            // InternalDsl.g:26:9: 'DARK_GRAY'
            {
            match("DARK_GRAY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:27:7: ( 'GRAY' )
            // InternalDsl.g:27:9: 'GRAY'
            {
            match("GRAY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:28:7: ( 'GREEN' )
            // InternalDsl.g:28:9: 'GREEN'
            {
            match("GREEN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:29:7: ( 'LIGHT_GRAY' )
            // InternalDsl.g:29:9: 'LIGHT_GRAY'
            {
            match("LIGHT_GRAY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:30:7: ( 'MAGENTA' )
            // InternalDsl.g:30:9: 'MAGENTA'
            {
            match("MAGENTA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:31:7: ( 'ORANGE' )
            // InternalDsl.g:31:9: 'ORANGE'
            {
            match("ORANGE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:32:7: ( 'PINK' )
            // InternalDsl.g:32:9: 'PINK'
            {
            match("PINK"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:33:7: ( 'RED' )
            // InternalDsl.g:33:9: 'RED'
            {
            match("RED"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:34:7: ( 'WHITE' )
            // InternalDsl.g:34:9: 'WHITE'
            {
            match("WHITE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:35:7: ( 'YELLOW' )
            // InternalDsl.g:35:9: 'YELLOW'
            {
            match("YELLOW"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:36:7: ( '==' )
            // InternalDsl.g:36:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:37:7: ( '!=' )
            // InternalDsl.g:37:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:38:7: ( '>=' )
            // InternalDsl.g:38:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:39:7: ( '>' )
            // InternalDsl.g:39:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:40:7: ( '<=' )
            // InternalDsl.g:40:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:41:7: ( '<' )
            // InternalDsl.g:41:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:42:7: ( 'Mission:' )
            // InternalDsl.g:42:9: 'Mission:'
            {
            match("Mission:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:43:7: ( 'Task:' )
            // InternalDsl.g:43:9: 'Task:'
            {
            match("Task:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:44:7: ( 'Do:' )
            // InternalDsl.g:44:9: 'Do:'
            {
            match("Do:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:45:7: ( 'Not:' )
            // InternalDsl.g:45:9: 'Not:'
            {
            match("Not:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:46:7: ( 'Uses:' )
            // InternalDsl.g:46:9: 'Uses:'
            {
            match("Uses:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:47:7: ( 'ColorSensor' )
            // InternalDsl.g:47:9: 'ColorSensor'
            {
            match("ColorSensor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:48:7: ( 'On' )
            // InternalDsl.g:48:9: 'On'
            {
            match("On"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:49:7: ( 'DetectedColor' )
            // InternalDsl.g:49:9: 'DetectedColor'
            {
            match("DetectedColor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:50:7: ( 'is:' )
            // InternalDsl.g:50:9: 'is:'
            {
            match("is:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:51:7: ( 'TouchSensor' )
            // InternalDsl.g:51:9: 'TouchSensor'
            {
            match("TouchSensor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:52:7: ( 'TouchedSide:' )
            // InternalDsl.g:52:9: 'TouchedSide:'
            {
            match("TouchedSide:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:53:7: ( 'USensor' )
            // InternalDsl.g:53:9: 'USensor'
            {
            match("USensor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:54:7: ( 'Distance:' )
            // InternalDsl.g:54:9: 'Distance:'
            {
            match("Distance:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:55:7: ( 'AvoidObjects' )
            // InternalDsl.g:55:9: 'AvoidObjects'
            {
            match("AvoidObjects"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "RULE_DECIMAL"
    public final void mRULE_DECIMAL() throws RecognitionException {
        try {
            int _type = RULE_DECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:1376:14: ( RULE_INT '.' RULE_INT )
            // InternalDsl.g:1376:16: RULE_INT '.' RULE_INT
            {
            mRULE_INT(); 
            match('.'); 
            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECIMAL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:1378:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalDsl.g:1378:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalDsl.g:1378:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalDsl.g:1378:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalDsl.g:1378:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            // InternalDsl.g:1380:19: ( ( '0' .. '9' )+ )
            // InternalDsl.g:1380:21: ( '0' .. '9' )+
            {
            // InternalDsl.g:1380:21: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDsl.g:1380:22: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:1382:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalDsl.g:1382:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalDsl.g:1382:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalDsl.g:1382:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalDsl.g:1382:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalDsl.g:1382:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalDsl.g:1382:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalDsl.g:1382:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalDsl.g:1382:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalDsl.g:1382:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalDsl.g:1382:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:1384:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalDsl.g:1384:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalDsl.g:1384:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDsl.g:1384:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:1386:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalDsl.g:1386:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalDsl.g:1386:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDsl.g:1386:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalDsl.g:1386:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDsl.g:1386:41: ( '\\r' )? '\\n'
                    {
                    // InternalDsl.g:1386:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalDsl.g:1386:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:1388:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalDsl.g:1388:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalDsl.g:1388:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDsl.g:1390:16: ( . )
            // InternalDsl.g:1390:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalDsl.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | RULE_DECIMAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=52;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalDsl.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalDsl.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalDsl.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalDsl.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalDsl.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalDsl.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalDsl.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalDsl.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalDsl.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalDsl.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalDsl.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalDsl.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalDsl.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // InternalDsl.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // InternalDsl.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // InternalDsl.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // InternalDsl.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // InternalDsl.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // InternalDsl.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // InternalDsl.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // InternalDsl.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // InternalDsl.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // InternalDsl.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // InternalDsl.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // InternalDsl.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // InternalDsl.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // InternalDsl.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // InternalDsl.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // InternalDsl.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // InternalDsl.g:1:184: T__41
                {
                mT__41(); 

                }
                break;
            case 31 :
                // InternalDsl.g:1:190: T__42
                {
                mT__42(); 

                }
                break;
            case 32 :
                // InternalDsl.g:1:196: T__43
                {
                mT__43(); 

                }
                break;
            case 33 :
                // InternalDsl.g:1:202: T__44
                {
                mT__44(); 

                }
                break;
            case 34 :
                // InternalDsl.g:1:208: T__45
                {
                mT__45(); 

                }
                break;
            case 35 :
                // InternalDsl.g:1:214: T__46
                {
                mT__46(); 

                }
                break;
            case 36 :
                // InternalDsl.g:1:220: T__47
                {
                mT__47(); 

                }
                break;
            case 37 :
                // InternalDsl.g:1:226: T__48
                {
                mT__48(); 

                }
                break;
            case 38 :
                // InternalDsl.g:1:232: T__49
                {
                mT__49(); 

                }
                break;
            case 39 :
                // InternalDsl.g:1:238: T__50
                {
                mT__50(); 

                }
                break;
            case 40 :
                // InternalDsl.g:1:244: T__51
                {
                mT__51(); 

                }
                break;
            case 41 :
                // InternalDsl.g:1:250: T__52
                {
                mT__52(); 

                }
                break;
            case 42 :
                // InternalDsl.g:1:256: T__53
                {
                mT__53(); 

                }
                break;
            case 43 :
                // InternalDsl.g:1:262: T__54
                {
                mT__54(); 

                }
                break;
            case 44 :
                // InternalDsl.g:1:268: T__55
                {
                mT__55(); 

                }
                break;
            case 45 :
                // InternalDsl.g:1:274: T__56
                {
                mT__56(); 

                }
                break;
            case 46 :
                // InternalDsl.g:1:280: RULE_DECIMAL
                {
                mRULE_DECIMAL(); 

                }
                break;
            case 47 :
                // InternalDsl.g:1:293: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 48 :
                // InternalDsl.g:1:301: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 49 :
                // InternalDsl.g:1:313: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 50 :
                // InternalDsl.g:1:329: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 51 :
                // InternalDsl.g:1:345: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 52 :
                // InternalDsl.g:1:353: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\15\40\2\35\1\76\1\100\4\40\2\35\1\uffff\3\35\2\uffff\2\40\1\uffff\26\40\1\145\3\40\6\uffff\5\40\5\uffff\4\40\1\162\6\40\1\uffff\16\40\1\uffff\6\40\1\uffff\1\40\1\u008e\3\40\1\uffff\1\u0092\1\u0093\1\40\1\u0095\4\40\1\u009a\6\40\1\u00a1\1\40\1\u00a3\2\40\1\u00a6\2\40\1\uffff\3\40\1\uffff\1\40\1\u00ad\1\40\2\uffff\1\u00af\1\uffff\4\40\1\uffff\1\40\1\uffff\4\40\1\uffff\1\40\1\uffff\1\u00bd\1\40\1\uffff\1\u00bf\1\40\1\uffff\3\40\1\uffff\1\40\1\uffff\15\40\1\uffff\1\u00d3\1\uffff\1\u00d4\16\40\1\u00e3\1\u00e4\2\40\2\uffff\1\u00e7\15\40\3\uffff\1\40\1\uffff\7\40\1\u00fd\1\40\1\uffff\5\40\1\u0104\1\u0105\4\40\1\uffff\1\40\1\u010b\4\40\2\uffff\1\u0110\2\40\1\u0113\1\40\1\uffff\1\u0115\1\40\1\u0117\1\40\1\uffff\1\u0119\1\40\1\uffff\1\40\3\uffff\1\u011c\1\uffff\1\u011d\1\u011e\3\uffff";
    static final String DFA12_eofS =
        "\u011f\uffff";
    static final String DFA12_minS =
        "\1\0\3\105\1\101\1\124\1\125\1\101\1\131\2\122\1\111\1\110\1\105\4\75\1\157\1\123\1\163\1\166\1\56\1\101\1\uffff\2\0\1\52\2\uffff\1\106\1\107\1\uffff\1\107\1\124\1\104\1\124\1\105\1\101\1\111\1\122\1\72\1\164\1\163\1\117\1\122\1\163\1\165\1\101\1\107\1\163\1\101\1\154\2\101\1\60\1\116\1\111\1\114\6\uffff\1\164\2\145\1\72\1\157\5\uffff\1\124\2\110\1\101\1\60\1\110\1\120\1\103\1\105\1\126\1\113\1\uffff\1\145\1\164\1\120\1\116\1\153\1\143\1\123\1\105\1\163\1\116\1\157\1\131\1\105\1\116\1\uffff\1\113\1\124\1\114\1\72\1\163\1\156\1\uffff\1\151\1\60\3\124\1\uffff\2\60\1\113\1\60\1\105\1\137\1\143\1\141\1\60\1\101\1\72\1\150\1\125\1\116\1\151\1\60\1\162\1\60\1\116\1\107\1\60\1\105\1\117\1\uffff\1\72\1\163\1\144\1\uffff\1\137\1\60\1\105\2\uffff\1\60\1\uffff\1\102\1\107\1\164\1\156\1\uffff\1\122\1\uffff\1\123\1\122\1\124\1\157\1\uffff\1\123\1\uffff\1\60\1\105\1\uffff\1\60\1\127\1\uffff\1\157\1\117\1\107\1\uffff\1\114\1\uffff\1\117\1\101\1\117\1\122\1\145\1\143\1\117\1\145\1\144\1\105\1\101\1\156\1\145\1\uffff\1\60\1\uffff\1\60\1\162\1\142\1\122\1\105\1\111\1\122\1\103\1\105\1\101\1\144\1\145\1\125\1\156\1\123\2\60\1\72\1\156\2\uffff\1\60\1\152\1\101\1\106\1\107\1\127\1\113\1\104\1\131\1\103\1\72\1\116\1\163\1\151\3\uffff\1\163\1\uffff\1\145\1\131\1\124\1\110\1\101\1\127\1\107\1\60\1\157\1\uffff\1\104\1\157\1\144\1\157\1\143\2\60\1\124\1\122\1\101\1\105\1\uffff\1\154\1\60\1\162\1\145\1\162\1\164\2\uffff\1\60\1\104\1\122\1\60\1\157\1\uffff\1\60\1\72\1\60\1\163\1\uffff\1\60\1\104\1\uffff\1\162\3\uffff\1\60\1\uffff\2\60\3\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\111\2\117\1\157\1\124\1\157\1\151\1\157\1\122\1\156\1\111\1\110\1\105\4\75\1\157\2\163\1\166\1\71\1\172\1\uffff\2\uffff\1\57\2\uffff\1\106\1\107\1\uffff\1\107\1\124\1\104\1\124\1\105\1\125\1\111\1\122\1\72\1\164\1\163\1\117\1\122\1\163\1\165\1\101\1\107\1\163\1\101\1\154\1\105\1\101\1\172\1\116\1\111\1\114\6\uffff\1\164\2\145\1\72\1\157\5\uffff\1\124\2\110\1\101\1\172\1\110\1\120\1\103\1\105\1\126\1\113\1\uffff\1\145\1\164\1\120\1\116\1\153\1\143\1\123\1\105\1\163\1\116\1\157\1\131\1\105\1\116\1\uffff\1\113\1\124\1\114\1\72\1\163\1\156\1\uffff\1\151\1\172\3\124\1\uffff\2\172\1\113\1\172\1\105\1\137\1\143\1\141\1\172\1\101\1\72\1\150\1\125\1\116\1\151\1\172\1\162\1\172\1\116\1\107\1\172\1\105\1\117\1\uffff\1\72\1\163\1\144\1\uffff\1\137\1\172\1\105\2\uffff\1\172\1\uffff\1\124\1\107\1\164\1\156\1\uffff\1\122\1\uffff\1\145\1\122\1\124\1\157\1\uffff\1\123\1\uffff\1\172\1\105\1\uffff\1\172\1\127\1\uffff\1\157\1\117\1\107\1\uffff\1\122\1\uffff\1\117\1\101\1\117\1\122\1\145\1\143\1\117\1\145\1\144\1\105\1\101\1\156\1\145\1\uffff\1\172\1\uffff\1\172\1\162\1\142\1\122\1\105\1\111\1\122\1\103\1\105\1\101\1\144\1\145\1\125\1\156\1\123\2\172\1\72\1\156\2\uffff\1\172\1\152\1\101\1\106\1\107\1\127\1\113\1\104\1\131\1\103\1\72\1\116\1\163\1\151\3\uffff\1\163\1\uffff\1\145\1\131\1\124\1\110\1\101\1\127\1\107\1\172\1\157\1\uffff\1\104\1\157\1\144\1\157\1\143\2\172\1\124\1\122\1\101\1\105\1\uffff\1\154\1\172\1\162\1\145\1\162\1\164\2\uffff\1\172\1\104\1\122\1\172\1\157\1\uffff\1\172\1\72\1\172\1\163\1\uffff\1\172\1\104\1\uffff\1\162\3\uffff\1\172\1\uffff\2\172\3\uffff";
    static final String DFA12_acceptS =
        "\30\uffff\1\57\3\uffff\1\63\1\64\2\uffff\1\57\32\uffff\1\32\1\33\1\34\1\35\1\36\1\37\5\uffff\1\56\1\60\1\61\1\62\1\63\13\uffff\1\42\16\uffff\1\46\6\uffff\1\50\5\uffff\1\27\27\uffff\1\43\3\uffff\1\1\3\uffff\1\3\1\12\1\uffff\1\16\4\uffff\1\10\1\uffff\1\41\4\uffff\1\17\1\uffff\1\21\2\uffff\1\26\2\uffff\1\44\3\uffff\1\2\1\uffff\1\15\15\uffff\1\22\1\uffff\1\30\23\uffff\1\25\1\31\16\uffff\1\13\1\24\1\40\1\uffff\1\53\11\uffff\1\54\13\uffff\1\20\6\uffff\1\23\1\4\5\uffff\1\11\4\uffff\1\5\2\uffff\1\14\1\uffff\1\51\1\52\1\45\1\uffff\1\6\2\uffff\1\55\1\7\1\47";
    static final String DFA12_specialS =
        "\1\0\30\uffff\1\1\1\2\u0104\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\35\2\34\2\35\1\34\22\35\1\34\1\17\1\31\4\35\1\32\7\35\1\33\12\26\2\35\1\21\1\16\1\20\2\35\1\25\1\3\1\10\1\4\2\30\1\11\4\30\1\1\1\7\1\22\1\12\1\13\1\30\1\2\1\5\1\6\1\23\1\30\1\14\1\30\1\15\1\30\3\35\1\27\1\30\1\35\10\30\1\24\21\30\uff85\35",
            "\1\36\3\uffff\1\37",
            "\1\43\3\uffff\1\41\5\uffff\1\42",
            "\1\45\6\uffff\1\46\2\uffff\1\44",
            "\1\50\20\uffff\1\47\22\uffff\1\52\3\uffff\1\53\5\uffff\1\51",
            "\1\54",
            "\1\55\13\uffff\1\56\15\uffff\1\57",
            "\1\61\3\uffff\1\60\43\uffff\1\62",
            "\1\63\25\uffff\1\64",
            "\1\65",
            "\1\66\33\uffff\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\77",
            "\1\101",
            "\1\103\37\uffff\1\102",
            "\1\104",
            "\1\105",
            "\1\106\1\uffff\12\106",
            "\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\0\107",
            "\0\107",
            "\1\110\4\uffff\1\111",
            "",
            "",
            "\1\113",
            "\1\114",
            "",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122\23\uffff\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142\3\uffff\1\143",
            "\1\144",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\146",
            "\1\147",
            "\1\150",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "",
            "",
            "",
            "",
            "",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "",
            "\1\u008d",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u0094",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u00a2",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u00a4",
            "\1\u00a5",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u00a7",
            "\1\u00a8",
            "",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "",
            "\1\u00ac",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u00ae",
            "",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\1\u00b1\3\uffff\1\u00b0\15\uffff\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "",
            "\1\u00b6",
            "",
            "\1\u00b7\21\uffff\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "",
            "\1\u00bc",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u00be",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u00c0",
            "",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "",
            "\1\u00c4\5\uffff\1\u00c5",
            "",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u00e5",
            "\1\u00e6",
            "",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "",
            "",
            "",
            "\1\u00f5",
            "",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u00fe",
            "",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "",
            "\1\u010a",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u0111",
            "\1\u0112",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u0114",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u0116",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u0118",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\u011a",
            "",
            "\1\u011b",
            "",
            "",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | RULE_DECIMAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='L') ) {s = 1;}

                        else if ( (LA12_0=='R') ) {s = 2;}

                        else if ( (LA12_0=='B') ) {s = 3;}

                        else if ( (LA12_0=='D') ) {s = 4;}

                        else if ( (LA12_0=='S') ) {s = 5;}

                        else if ( (LA12_0=='T') ) {s = 6;}

                        else if ( (LA12_0=='M') ) {s = 7;}

                        else if ( (LA12_0=='C') ) {s = 8;}

                        else if ( (LA12_0=='G') ) {s = 9;}

                        else if ( (LA12_0=='O') ) {s = 10;}

                        else if ( (LA12_0=='P') ) {s = 11;}

                        else if ( (LA12_0=='W') ) {s = 12;}

                        else if ( (LA12_0=='Y') ) {s = 13;}

                        else if ( (LA12_0=='=') ) {s = 14;}

                        else if ( (LA12_0=='!') ) {s = 15;}

                        else if ( (LA12_0=='>') ) {s = 16;}

                        else if ( (LA12_0=='<') ) {s = 17;}

                        else if ( (LA12_0=='N') ) {s = 18;}

                        else if ( (LA12_0=='U') ) {s = 19;}

                        else if ( (LA12_0=='i') ) {s = 20;}

                        else if ( (LA12_0=='A') ) {s = 21;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 22;}

                        else if ( (LA12_0=='^') ) {s = 23;}

                        else if ( ((LA12_0>='E' && LA12_0<='F')||(LA12_0>='H' && LA12_0<='K')||LA12_0=='Q'||LA12_0=='V'||LA12_0=='X'||LA12_0=='Z'||LA12_0=='_'||(LA12_0>='a' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='z')) ) {s = 24;}

                        else if ( (LA12_0=='\"') ) {s = 25;}

                        else if ( (LA12_0=='\'') ) {s = 26;}

                        else if ( (LA12_0=='/') ) {s = 27;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 28;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='.')||(LA12_0>=':' && LA12_0<=';')||(LA12_0>='?' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||(LA12_0>='{' && LA12_0<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_25 = input.LA(1);

                        s = -1;
                        if ( ((LA12_25>='\u0000' && LA12_25<='\uFFFF')) ) {s = 71;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_26 = input.LA(1);

                        s = -1;
                        if ( ((LA12_26>='\u0000' && LA12_26<='\uFFFF')) ) {s = 71;}

                        else s = 29;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}