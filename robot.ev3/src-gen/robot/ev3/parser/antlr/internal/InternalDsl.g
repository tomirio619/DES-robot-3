/*
 * generated by Xtext 2.10.0
 */
grammar InternalDsl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package robot.ev3.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleMission
entryRuleMission returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMissionRule()); }
	iv_ruleMission=ruleMission
	{ $current=$iv_ruleMission.current; }
	EOF;

// Rule Mission
ruleMission returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Mission:'
		{
			newLeafNode(otherlv_0, grammarAccess.getMissionAccess().getMissionKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMissionAccess().getTasksTaskParserRuleCall_1_0());
				}
				lv_tasks_1_0=ruleTask
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMissionRule());
					}
					add(
						$current,
						"tasks",
						lv_tasks_1_0,
						"robot.ev3.Dsl.Task");
					afterParserOrEnumRuleCall();
				}
			)
		)+
	)
;

// Entry rule entryRuleTask
entryRuleTask returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTaskRule()); }
	iv_ruleTask=ruleTask
	{ $current=$iv_ruleTask.current; }
	EOF;

// Rule Task
ruleTask returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Task:'
		{
			newLeafNode(otherlv_0, grammarAccess.getTaskAccess().getTaskKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTaskRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='Uses:'
		{
			newLeafNode(otherlv_2, grammarAccess.getTaskAccess().getUsesKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTaskAccess().getSensorSensorTypeParserRuleCall_3_0());
				}
				lv_sensor_3_0=ruleSensorType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTaskRule());
					}
					set(
						$current,
						"sensor",
						lv_sensor_3_0,
						"robot.ev3.Dsl.SensorType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='Do:'
		{
			newLeafNode(otherlv_4, grammarAccess.getTaskAccess().getDoKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTaskAccess().getActionActionsEnumRuleCall_5_0());
				}
				lv_action_5_0=ruleActions
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTaskRule());
					}
					set(
						$current,
						"action",
						lv_action_5_0,
						"robot.ev3.Dsl.Actions");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleSensorType
entryRuleSensorType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSensorTypeRule()); }
	iv_ruleSensorType=ruleSensorType
	{ $current=$iv_ruleSensorType.current; }
	EOF;

// Rule SensorType
ruleSensorType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getSensorTypeAccess().getColorSensorParserRuleCall_0());
		}
		this_ColorSensor_0=ruleColorSensor
		{
			$current = $this_ColorSensor_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getSensorTypeAccess().getTouchSensorParserRuleCall_1());
		}
		this_TouchSensor_1=ruleTouchSensor
		{
			$current = $this_TouchSensor_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getSensorTypeAccess().getUltrasonicSensorParserRuleCall_2());
		}
		this_UltrasonicSensor_2=ruleUltrasonicSensor
		{
			$current = $this_UltrasonicSensor_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleColorSensor
entryRuleColorSensor returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getColorSensorRule()); }
	iv_ruleColorSensor=ruleColorSensor
	{ $current=$iv_ruleColorSensor.current; }
	EOF;

// Rule ColorSensor
ruleColorSensor returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='ColorSensor'
		{
			newLeafNode(otherlv_0, grammarAccess.getColorSensorAccess().getColorSensorKeyword_0());
		}
		otherlv_1='On'
		{
			newLeafNode(otherlv_1, grammarAccess.getColorSensorAccess().getOnKeyword_1());
		}
		otherlv_2='DetectedColor'
		{
			newLeafNode(otherlv_2, grammarAccess.getColorSensorAccess().getDetectedColorKeyword_2());
		}
		otherlv_3='is:'
		{
			newLeafNode(otherlv_3, grammarAccess.getColorSensorAccess().getIsKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getColorSensorAccess().getKeyColorsEnumRuleCall_4_0());
				}
				lv_key_4_0=ruleColors
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getColorSensorRule());
					}
					set(
						$current,
						"key",
						lv_key_4_0,
						"robot.ev3.Dsl.Colors");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleTouchSensor
entryRuleTouchSensor returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTouchSensorRule()); }
	iv_ruleTouchSensor=ruleTouchSensor
	{ $current=$iv_ruleTouchSensor.current; }
	EOF;

// Rule TouchSensor
ruleTouchSensor returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='TouchSensor'
		{
			newLeafNode(otherlv_0, grammarAccess.getTouchSensorAccess().getTouchSensorKeyword_0());
		}
		otherlv_1='On'
		{
			newLeafNode(otherlv_1, grammarAccess.getTouchSensorAccess().getOnKeyword_1());
		}
		otherlv_2='TouchedSide:'
		{
			newLeafNode(otherlv_2, grammarAccess.getTouchSensorAccess().getTouchedSideKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTouchSensorAccess().getKeyTouchSensorSidesEnumRuleCall_3_0());
				}
				lv_key_3_0=ruleTouchSensorSides
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTouchSensorRule());
					}
					set(
						$current,
						"key",
						lv_key_3_0,
						"robot.ev3.Dsl.TouchSensorSides");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleUltrasonicSensor
entryRuleUltrasonicSensor returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUltrasonicSensorRule()); }
	iv_ruleUltrasonicSensor=ruleUltrasonicSensor
	{ $current=$iv_ruleUltrasonicSensor.current; }
	EOF;

// Rule UltrasonicSensor
ruleUltrasonicSensor returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='USensor'
		{
			newLeafNode(otherlv_0, grammarAccess.getUltrasonicSensorAccess().getUSensorKeyword_0());
		}
		otherlv_1='On'
		{
			newLeafNode(otherlv_1, grammarAccess.getUltrasonicSensorAccess().getOnKeyword_1());
		}
		otherlv_2='Distance:'
		{
			newLeafNode(otherlv_2, grammarAccess.getUltrasonicSensorAccess().getDistanceKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getUltrasonicSensorAccess().getComparatorCompareOperatorEnumRuleCall_3_0());
				}
				lv_comparator_3_0=ruleCompareOperator
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getUltrasonicSensorRule());
					}
					set(
						$current,
						"comparator",
						lv_comparator_3_0,
						"robot.ev3.Dsl.CompareOperator");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_distance_4_0=RULE_DECIMAL
				{
					newLeafNode(lv_distance_4_0, grammarAccess.getUltrasonicSensorAccess().getDistanceDECIMALTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUltrasonicSensorRule());
					}
					setWithLastConsumed(
						$current,
						"distance",
						lv_distance_4_0,
						"robot.ev3.Dsl.DECIMAL");
				}
			)
		)
	)
;

// Rule TouchSensorSides
ruleTouchSensorSides returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='LEFT'
			{
				$current = grammarAccess.getTouchSensorSidesAccess().getLEFTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getTouchSensorSidesAccess().getLEFTEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='RIGHT'
			{
				$current = grammarAccess.getTouchSensorSidesAccess().getRIGHTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getTouchSensorSidesAccess().getRIGHTEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='BOTH'
			{
				$current = grammarAccess.getTouchSensorSidesAccess().getBOTHEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getTouchSensorSidesAccess().getBOTHEnumLiteralDeclaration_2());
			}
		)
	)
;

// Rule Actions
ruleActions returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='ROTATELEFT'
			{
				$current = grammarAccess.getActionsAccess().getROTATE_LEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getActionsAccess().getROTATE_LEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='ROTATERIGHT'
			{
				$current = grammarAccess.getActionsAccess().getROTATE_REnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getActionsAccess().getROTATE_REnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='DRIVEFORWARD'
			{
				$current = grammarAccess.getActionsAccess().getDRIVE_FORWARDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getActionsAccess().getDRIVE_FORWARDEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='DRIVEBACKWARD'
			{
				$current = grammarAccess.getActionsAccess().getDRIVE_BACKWARDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getActionsAccess().getDRIVE_BACKWARDEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='STOP'
			{
				$current = grammarAccess.getActionsAccess().getSTOP_DRIVINGEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getActionsAccess().getSTOP_DRIVINGEnumLiteralDeclaration_4());
			}
		)
		    |
		(
			enumLiteral_5='TURNAROUND'
			{
				$current = grammarAccess.getActionsAccess().getTURN_AROUNDEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_5, grammarAccess.getActionsAccess().getTURN_AROUNDEnumLiteralDeclaration_5());
			}
		)
		    |
		(
			enumLiteral_6='BEEP'
			{
				$current = grammarAccess.getActionsAccess().getBEEPEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_6, grammarAccess.getActionsAccess().getBEEPEnumLiteralDeclaration_6());
			}
		)
	)
;

// Rule Colors
ruleColors returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='BLACK'
			{
				$current = grammarAccess.getColorsAccess().getBLACKEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getColorsAccess().getBLACKEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='BLUE'
			{
				$current = grammarAccess.getColorsAccess().getBLUEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getColorsAccess().getBLUEEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='CYAN'
			{
				$current = grammarAccess.getColorsAccess().getCYANEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getColorsAccess().getCYANEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='DARK_GRAY'
			{
				$current = grammarAccess.getColorsAccess().getDARK_GRAYEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getColorsAccess().getDARK_GRAYEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='GRAY'
			{
				$current = grammarAccess.getColorsAccess().getGRAYEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getColorsAccess().getGRAYEnumLiteralDeclaration_4());
			}
		)
		    |
		(
			enumLiteral_5='GREEN'
			{
				$current = grammarAccess.getColorsAccess().getGREENEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_5, grammarAccess.getColorsAccess().getGREENEnumLiteralDeclaration_5());
			}
		)
		    |
		(
			enumLiteral_6='LIGHT_GRAY'
			{
				$current = grammarAccess.getColorsAccess().getLIGHT_GRAYEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_6, grammarAccess.getColorsAccess().getLIGHT_GRAYEnumLiteralDeclaration_6());
			}
		)
		    |
		(
			enumLiteral_7='MAGENTA'
			{
				$current = grammarAccess.getColorsAccess().getMAGENTAEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_7, grammarAccess.getColorsAccess().getMAGENTAEnumLiteralDeclaration_7());
			}
		)
		    |
		(
			enumLiteral_8='ORANGE'
			{
				$current = grammarAccess.getColorsAccess().getORANGEEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_8, grammarAccess.getColorsAccess().getORANGEEnumLiteralDeclaration_8());
			}
		)
		    |
		(
			enumLiteral_9='PINK'
			{
				$current = grammarAccess.getColorsAccess().getPINKEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_9, grammarAccess.getColorsAccess().getPINKEnumLiteralDeclaration_9());
			}
		)
		    |
		(
			enumLiteral_10='RED'
			{
				$current = grammarAccess.getColorsAccess().getREDEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_10, grammarAccess.getColorsAccess().getREDEnumLiteralDeclaration_10());
			}
		)
		    |
		(
			enumLiteral_11='WHITE'
			{
				$current = grammarAccess.getColorsAccess().getWHITEEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_11, grammarAccess.getColorsAccess().getWHITEEnumLiteralDeclaration_11());
			}
		)
		    |
		(
			enumLiteral_12='YELLOW'
			{
				$current = grammarAccess.getColorsAccess().getYELLOWEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_12, grammarAccess.getColorsAccess().getYELLOWEnumLiteralDeclaration_12());
			}
		)
	)
;

// Rule CompareOperator
ruleCompareOperator returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='=='
			{
				$current = grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='!='
			{
				$current = grammarAccess.getCompareOperatorAccess().getNEQEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getCompareOperatorAccess().getNEQEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='>='
			{
				$current = grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='>'
			{
				$current = grammarAccess.getCompareOperatorAccess().getGEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getCompareOperatorAccess().getGEnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='<='
			{
				$current = grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_4());
			}
		)
		    |
		(
			enumLiteral_5='<'
			{
				$current = grammarAccess.getCompareOperatorAccess().getLEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_5, grammarAccess.getCompareOperatorAccess().getLEnumLiteralDeclaration_5());
			}
		)
	)
;

RULE_DECIMAL : RULE_INT '.' RULE_INT;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

fragment RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
