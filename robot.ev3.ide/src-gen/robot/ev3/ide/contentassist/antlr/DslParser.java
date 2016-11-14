/*
 * generated by Xtext 2.10.0
 */
package robot.ev3.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import robot.ev3.ide.contentassist.antlr.internal.InternalDslParser;
import robot.ev3.services.DslGrammarAccess;

public class DslParser extends AbstractContentAssistParser {

	@Inject
	private DslGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalDslParser createParser() {
		InternalDslParser result = new InternalDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getSensorTypeAccess().getAlternatives(), "rule__SensorType__Alternatives");
					put(grammarAccess.getTouchSensorSidesAccess().getAlternatives(), "rule__TouchSensorSides__Alternatives");
					put(grammarAccess.getActionsAccess().getAlternatives(), "rule__Actions__Alternatives");
					put(grammarAccess.getDirectionsAccess().getAlternatives(), "rule__Directions__Alternatives");
					put(grammarAccess.getColorsAccess().getAlternatives(), "rule__Colors__Alternatives");
					put(grammarAccess.getCompareOperatorAccess().getAlternatives(), "rule__CompareOperator__Alternatives");
					put(grammarAccess.getMissionAccess().getGroup(), "rule__Mission__Group__0");
					put(grammarAccess.getTaskAccess().getGroup(), "rule__Task__Group__0");
					put(grammarAccess.getColorSensorAccess().getGroup(), "rule__ColorSensor__Group__0");
					put(grammarAccess.getTouchSensorAccess().getGroup(), "rule__TouchSensor__Group__0");
					put(grammarAccess.getUltrasonicSensorAccess().getGroup(), "rule__UltrasonicSensor__Group__0");
					put(grammarAccess.getMissionAccess().getTasksAssignment_1(), "rule__Mission__TasksAssignment_1");
					put(grammarAccess.getTaskAccess().getNameAssignment_1(), "rule__Task__NameAssignment_1");
					put(grammarAccess.getTaskAccess().getSensorAssignment_3(), "rule__Task__SensorAssignment_3");
					put(grammarAccess.getTaskAccess().getActionAssignment_5(), "rule__Task__ActionAssignment_5");
					put(grammarAccess.getColorSensorAccess().getKeyAssignment_4(), "rule__ColorSensor__KeyAssignment_4");
					put(grammarAccess.getTouchSensorAccess().getKeyAssignment_3(), "rule__TouchSensor__KeyAssignment_3");
					put(grammarAccess.getUltrasonicSensorAccess().getComparatorAssignment_3(), "rule__UltrasonicSensor__ComparatorAssignment_3");
					put(grammarAccess.getUltrasonicSensorAccess().getDistanceAssignment_4(), "rule__UltrasonicSensor__DistanceAssignment_4");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalDslParser typedParser = (InternalDslParser) parser;
			typedParser.entryRuleMission();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public DslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
