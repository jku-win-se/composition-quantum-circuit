/*
 * generated by Xtext 2.31.0
 */
package quantum.circuit.lang.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import quantum.circuit.lang.ide.contentassist.antlr.internal.InternalQuCircuitParser;
import quantum.circuit.lang.services.QuCircuitGrammarAccess;

public class QuCircuitParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(QuCircuitGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, QuCircuitGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getQuantumOperationAccess().getAlternatives(), "rule__QuantumOperation__Alternatives");
			builder.put(grammarAccess.getSelectorAccess().getAlternatives(), "rule__Selector__Alternatives");
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getEDoubleObjectAccess().getAlternatives_4_0(), "rule__EDoubleObject__Alternatives_4_0");
			builder.put(grammarAccess.getITERATION_TYPEAccess().getAlternatives(), "rule__ITERATION_TYPE__Alternatives");
			builder.put(grammarAccess.getQuantumCircuitAccess().getGroup(), "rule__QuantumCircuit__Group__0");
			builder.put(grammarAccess.getQuantumCircuitAccess().getGroup_4(), "rule__QuantumCircuit__Group_4__0");
			builder.put(grammarAccess.getQuantumRegisterAccess().getGroup(), "rule__QuantumRegister__Group__0");
			builder.put(grammarAccess.getQuantumRegisterAccess().getGroup_4(), "rule__QuantumRegister__Group_4__0");
			builder.put(grammarAccess.getSimplifiedQuantumRegisterAccess().getGroup(), "rule__SimplifiedQuantumRegister__Group__0");
			builder.put(grammarAccess.getClassicRegisterAccess().getGroup(), "rule__ClassicRegister__Group__0");
			builder.put(grammarAccess.getClassicRegisterAccess().getGroup_4(), "rule__ClassicRegister__Group_4__0");
			builder.put(grammarAccess.getLayerAccess().getGroup(), "rule__Layer__Group__0");
			builder.put(grammarAccess.getLayerAccess().getGroup_5(), "rule__Layer__Group_5__0");
			builder.put(grammarAccess.getStatePreparationAccess().getGroup(), "rule__StatePreparation__Group__0");
			builder.put(grammarAccess.getStatePreparationAccess().getGroup_5(), "rule__StatePreparation__Group_5__0");
			builder.put(grammarAccess.getStatePreparationAccess().getGroup_9(), "rule__StatePreparation__Group_9__0");
			builder.put(grammarAccess.getElementaryQuantumGateAccess().getGroup(), "rule__ElementaryQuantumGate__Group__0");
			builder.put(grammarAccess.getElementaryQuantumGateAccess().getGroup_4(), "rule__ElementaryQuantumGate__Group_4__0");
			builder.put(grammarAccess.getElementaryQuantumGateAccess().getGroup_10(), "rule__ElementaryQuantumGate__Group_10__0");
			builder.put(grammarAccess.getElementaryQuantumGateAccess().getGroup_12(), "rule__ElementaryQuantumGate__Group_12__0");
			builder.put(grammarAccess.getElementaryQuantumGateAccess().getGroup_12_3(), "rule__ElementaryQuantumGate__Group_12_3__0");
			builder.put(grammarAccess.getElementaryQuantumGateAccess().getGroup_13(), "rule__ElementaryQuantumGate__Group_13__0");
			builder.put(grammarAccess.getAngleParameterAccess().getGroup(), "rule__AngleParameter__Group__0");
			builder.put(grammarAccess.getAngleParameterAccess().getGroup_2(), "rule__AngleParameter__Group_2__0");
			builder.put(grammarAccess.getAngleParameterAccess().getGroup_3(), "rule__AngleParameter__Group_3__0");
			builder.put(grammarAccess.getAngleParameterAccess().getGroup_4(), "rule__AngleParameter__Group_4__0");
			builder.put(grammarAccess.getMeasurementAccess().getGroup(), "rule__Measurement__Group__0");
			builder.put(grammarAccess.getMeasurementAccess().getGroup_3(), "rule__Measurement__Group_3__0");
			builder.put(grammarAccess.getMeasurementAccess().getGroup_9(), "rule__Measurement__Group_9__0");
			builder.put(grammarAccess.getMeasurementAccess().getGroup_16(), "rule__Measurement__Group_16__0");
			builder.put(grammarAccess.getCompositeQuantumGateAccess().getGroup(), "rule__CompositeQuantumGate__Group__0");
			builder.put(grammarAccess.getCompositeQuantumGateAccess().getGroup_4(), "rule__CompositeQuantumGate__Group_4__0");
			builder.put(grammarAccess.getCompositeQuantumGateAccess().getGroup_10(), "rule__CompositeQuantumGate__Group_10__0");
			builder.put(grammarAccess.getCompositeQuantumGateAccess().getGroup_12(), "rule__CompositeQuantumGate__Group_12__0");
			builder.put(grammarAccess.getCompositeQuantumGateAccess().getGroup_12_3(), "rule__CompositeQuantumGate__Group_12_3__0");
			builder.put(grammarAccess.getLoopAccess().getGroup(), "rule__Loop__Group__0");
			builder.put(grammarAccess.getLoopAccess().getGroup_6(), "rule__Loop__Group_6__0");
			builder.put(grammarAccess.getLoopAccess().getGroup_9(), "rule__Loop__Group_9__0");
			builder.put(grammarAccess.getLoopAccess().getGroup_10(), "rule__Loop__Group_10__0");
			builder.put(grammarAccess.getLoopAccess().getGroup_11(), "rule__Loop__Group_11__0");
			builder.put(grammarAccess.getLoopAccess().getGroup_12(), "rule__Loop__Group_12__0");
			builder.put(grammarAccess.getLoopAccess().getGroup_13(), "rule__Loop__Group_13__0");
			builder.put(grammarAccess.getLoopAccess().getGroup_14(), "rule__Loop__Group_14__0");
			builder.put(grammarAccess.getLoopAccess().getGroup_14_3(), "rule__Loop__Group_14_3__0");
			builder.put(grammarAccess.getLoopAccess().getGroup_20(), "rule__Loop__Group_20__0");
			builder.put(grammarAccess.getLoopAccess().getGroup_22(), "rule__Loop__Group_22__0");
			builder.put(grammarAccess.getLoopAccess().getGroup_22_3(), "rule__Loop__Group_22_3__0");
			builder.put(grammarAccess.getLoopAccess().getGroup_23(), "rule__Loop__Group_23__0");
			builder.put(grammarAccess.getLoopAccess().getGroup_23_3(), "rule__Loop__Group_23_3__0");
			builder.put(grammarAccess.getLoopAccess().getGroup_24(), "rule__Loop__Group_24__0");
			builder.put(grammarAccess.getLoopAccess().getGroup_24_3(), "rule__Loop__Group_24_3__0");
			builder.put(grammarAccess.getLoopAccess().getGroup_32(), "rule__Loop__Group_32__0");
			builder.put(grammarAccess.getLoopAccess().getGroup_34(), "rule__Loop__Group_34__0");
			builder.put(grammarAccess.getLoopAccess().getGroup_34_5(), "rule__Loop__Group_34_5__0");
			builder.put(grammarAccess.getOperationAccess().getGroup(), "rule__Operation__Group__0");
			builder.put(grammarAccess.getOperationAccess().getGroup_1(), "rule__Operation__Group_1__0");
			builder.put(grammarAccess.getElementSelectorAccess().getGroup(), "rule__ElementSelector__Group__0");
			builder.put(grammarAccess.getElementSelectorAccess().getGroup_1(), "rule__ElementSelector__Group_1__0");
			builder.put(grammarAccess.getRangeSelectorAccess().getGroup(), "rule__RangeSelector__Group__0");
			builder.put(grammarAccess.getRangeSelectorAccess().getGroup_1(), "rule__RangeSelector__Group_1__0");
			builder.put(grammarAccess.getEDoubleObjectAccess().getGroup(), "rule__EDoubleObject__Group__0");
			builder.put(grammarAccess.getEDoubleObjectAccess().getGroup_4(), "rule__EDoubleObject__Group_4__0");
			builder.put(grammarAccess.getQuantumCircuitAccess().getNameAssignment_1(), "rule__QuantumCircuit__NameAssignment_1");
			builder.put(grammarAccess.getQuantumCircuitAccess().getQuantumRegistersAssignment_2(), "rule__QuantumCircuit__QuantumRegistersAssignment_2");
			builder.put(grammarAccess.getQuantumCircuitAccess().getQuantumRegistersAssignment_4_0(), "rule__QuantumCircuit__QuantumRegistersAssignment_4_0");
			builder.put(grammarAccess.getQuantumCircuitAccess().getQuantumRegistersAssignment_4_1(), "rule__QuantumCircuit__QuantumRegistersAssignment_4_1");
			builder.put(grammarAccess.getQuantumCircuitAccess().getClassicRegistersAssignment_5(), "rule__QuantumCircuit__ClassicRegistersAssignment_5");
			builder.put(grammarAccess.getQuantumCircuitAccess().getLayersAssignment_6(), "rule__QuantumCircuit__LayersAssignment_6");
			builder.put(grammarAccess.getQuantumCircuitAccess().getLayersAssignment_7(), "rule__QuantumCircuit__LayersAssignment_7");
			builder.put(grammarAccess.getQuantumRegisterAccess().getNameAssignment_2(), "rule__QuantumRegister__NameAssignment_2");
			builder.put(grammarAccess.getQuantumRegisterAccess().getNumberOfQubitsAssignment_4_1(), "rule__QuantumRegister__NumberOfQubitsAssignment_4_1");
			builder.put(grammarAccess.getSimplifiedQuantumRegisterAccess().getNumberOfQubitsAssignment_2(), "rule__SimplifiedQuantumRegister__NumberOfQubitsAssignment_2");
			builder.put(grammarAccess.getClassicRegisterAccess().getNameAssignment_2(), "rule__ClassicRegister__NameAssignment_2");
			builder.put(grammarAccess.getClassicRegisterAccess().getNumberOfBitsAssignment_4_1(), "rule__ClassicRegister__NumberOfBitsAssignment_4_1");
			builder.put(grammarAccess.getLayerAccess().getNameAssignment_2(), "rule__Layer__NameAssignment_2");
			builder.put(grammarAccess.getLayerAccess().getQuantumOperationsAssignment_4(), "rule__Layer__QuantumOperationsAssignment_4");
			builder.put(grammarAccess.getLayerAccess().getQuantumOperationsAssignment_5_1(), "rule__Layer__QuantumOperationsAssignment_5_1");
			builder.put(grammarAccess.getStatePreparationAccess().getNameAssignment_1(), "rule__StatePreparation__NameAssignment_1");
			builder.put(grammarAccess.getStatePreparationAccess().getOperationsAssignment_4(), "rule__StatePreparation__OperationsAssignment_4");
			builder.put(grammarAccess.getStatePreparationAccess().getOperationsAssignment_5_1(), "rule__StatePreparation__OperationsAssignment_5_1");
			builder.put(grammarAccess.getStatePreparationAccess().getTargetQubitsAssignment_8(), "rule__StatePreparation__TargetQubitsAssignment_8");
			builder.put(grammarAccess.getStatePreparationAccess().getTargetQubitsAssignment_9_1(), "rule__StatePreparation__TargetQubitsAssignment_9_1");
			builder.put(grammarAccess.getElementaryQuantumGateAccess().getInverseFormAssignment_1(), "rule__ElementaryQuantumGate__InverseFormAssignment_1");
			builder.put(grammarAccess.getElementaryQuantumGateAccess().getNameAssignment_2(), "rule__ElementaryQuantumGate__NameAssignment_2");
			builder.put(grammarAccess.getElementaryQuantumGateAccess().getOperationsAssignment_4_1(), "rule__ElementaryQuantumGate__OperationsAssignment_4_1");
			builder.put(grammarAccess.getElementaryQuantumGateAccess().getTargetQubitsAssignment_8(), "rule__ElementaryQuantumGate__TargetQubitsAssignment_8");
			builder.put(grammarAccess.getElementaryQuantumGateAccess().getTargetQubitsAssignment_10_2(), "rule__ElementaryQuantumGate__TargetQubitsAssignment_10_2");
			builder.put(grammarAccess.getElementaryQuantumGateAccess().getControlQubitsAssignment_12_2(), "rule__ElementaryQuantumGate__ControlQubitsAssignment_12_2");
			builder.put(grammarAccess.getElementaryQuantumGateAccess().getControlQubitsAssignment_12_3_1(), "rule__ElementaryQuantumGate__ControlQubitsAssignment_12_3_1");
			builder.put(grammarAccess.getElementaryQuantumGateAccess().getAngleParameterAssignment_13_1(), "rule__ElementaryQuantumGate__AngleParameterAssignment_13_1");
			builder.put(grammarAccess.getAngleParameterAccess().getThetaAssignment_2_1(), "rule__AngleParameter__ThetaAssignment_2_1");
			builder.put(grammarAccess.getAngleParameterAccess().getPhiAssignment_3_1(), "rule__AngleParameter__PhiAssignment_3_1");
			builder.put(grammarAccess.getAngleParameterAccess().getLambdaAssignment_4_1(), "rule__AngleParameter__LambdaAssignment_4_1");
			builder.put(grammarAccess.getMeasurementAccess().getNameAssignment_1(), "rule__Measurement__NameAssignment_1");
			builder.put(grammarAccess.getMeasurementAccess().getOperationsAssignment_3_1(), "rule__Measurement__OperationsAssignment_3_1");
			builder.put(grammarAccess.getMeasurementAccess().getTargetQubitsAssignment_7(), "rule__Measurement__TargetQubitsAssignment_7");
			builder.put(grammarAccess.getMeasurementAccess().getTargetQubitsAssignment_9_2(), "rule__Measurement__TargetQubitsAssignment_9_2");
			builder.put(grammarAccess.getMeasurementAccess().getClassicBitsAssignment_14(), "rule__Measurement__ClassicBitsAssignment_14");
			builder.put(grammarAccess.getMeasurementAccess().getClassicBitsAssignment_16_2(), "rule__Measurement__ClassicBitsAssignment_16_2");
			builder.put(grammarAccess.getCompositeQuantumGateAccess().getNameAssignment_1(), "rule__CompositeQuantumGate__NameAssignment_1");
			builder.put(grammarAccess.getCompositeQuantumGateAccess().getInverseFormAssignment_3(), "rule__CompositeQuantumGate__InverseFormAssignment_3");
			builder.put(grammarAccess.getCompositeQuantumGateAccess().getOperationsAssignment_4_1(), "rule__CompositeQuantumGate__OperationsAssignment_4_1");
			builder.put(grammarAccess.getCompositeQuantumGateAccess().getTargetQubitsAssignment_8(), "rule__CompositeQuantumGate__TargetQubitsAssignment_8");
			builder.put(grammarAccess.getCompositeQuantumGateAccess().getTargetQubitsAssignment_10_2(), "rule__CompositeQuantumGate__TargetQubitsAssignment_10_2");
			builder.put(grammarAccess.getCompositeQuantumGateAccess().getControlQubitsAssignment_12_2(), "rule__CompositeQuantumGate__ControlQubitsAssignment_12_2");
			builder.put(grammarAccess.getCompositeQuantumGateAccess().getControlQubitsAssignment_12_3_1(), "rule__CompositeQuantumGate__ControlQubitsAssignment_12_3_1");
			builder.put(grammarAccess.getLoopAccess().getNameAssignment_1(), "rule__Loop__NameAssignment_1");
			builder.put(grammarAccess.getLoopAccess().getInverseFormAssignment_3(), "rule__Loop__InverseFormAssignment_3");
			builder.put(grammarAccess.getLoopAccess().getIncrementBlockTargetQubitsAssignment_4(), "rule__Loop__IncrementBlockTargetQubitsAssignment_4");
			builder.put(grammarAccess.getLoopAccess().getIncrementBlockControlQubitsAssignment_5(), "rule__Loop__IncrementBlockControlQubitsAssignment_5");
			builder.put(grammarAccess.getLoopAccess().getIterationsAssignment_6_1(), "rule__Loop__IterationsAssignment_6_1");
			builder.put(grammarAccess.getLoopAccess().getIncrementTargetQubitsAssignment_7(), "rule__Loop__IncrementTargetQubitsAssignment_7");
			builder.put(grammarAccess.getLoopAccess().getIncrementControlQubitsAssignment_8(), "rule__Loop__IncrementControlQubitsAssignment_8");
			builder.put(grammarAccess.getLoopAccess().getTargetQubitsBlockSizeAssignment_9_1(), "rule__Loop__TargetQubitsBlockSizeAssignment_9_1");
			builder.put(grammarAccess.getLoopAccess().getControlQubitsBlockSizeAssignment_10_1(), "rule__Loop__ControlQubitsBlockSizeAssignment_10_1");
			builder.put(grammarAccess.getLoopAccess().getControlQubitsIterationTypeAssignment_11_1(), "rule__Loop__ControlQubitsIterationTypeAssignment_11_1");
			builder.put(grammarAccess.getLoopAccess().getTargetQubitsIterationTypeAssignment_12_1(), "rule__Loop__TargetQubitsIterationTypeAssignment_12_1");
			builder.put(grammarAccess.getLoopAccess().getIncrementByAssignment_13_1(), "rule__Loop__IncrementByAssignment_13_1");
			builder.put(grammarAccess.getLoopAccess().getOperationsAssignment_14_2(), "rule__Loop__OperationsAssignment_14_2");
			builder.put(grammarAccess.getLoopAccess().getOperationsAssignment_14_3_1(), "rule__Loop__OperationsAssignment_14_3_1");
			builder.put(grammarAccess.getLoopAccess().getTargetQubitsAssignment_18(), "rule__Loop__TargetQubitsAssignment_18");
			builder.put(grammarAccess.getLoopAccess().getTargetQubitsAssignment_20_2(), "rule__Loop__TargetQubitsAssignment_20_2");
			builder.put(grammarAccess.getLoopAccess().getControlQubitsAssignment_22_2(), "rule__Loop__ControlQubitsAssignment_22_2");
			builder.put(grammarAccess.getLoopAccess().getControlQubitsAssignment_22_3_1(), "rule__Loop__ControlQubitsAssignment_22_3_1");
			builder.put(grammarAccess.getLoopAccess().getFixedControlQubitsAssignment_23_2(), "rule__Loop__FixedControlQubitsAssignment_23_2");
			builder.put(grammarAccess.getLoopAccess().getFixedControlQubitsAssignment_23_3_1(), "rule__Loop__FixedControlQubitsAssignment_23_3_1");
			builder.put(grammarAccess.getLoopAccess().getFixedTargetQubitsAssignment_24_2(), "rule__Loop__FixedTargetQubitsAssignment_24_2");
			builder.put(grammarAccess.getLoopAccess().getFixedTargetQubitsAssignment_24_3_1(), "rule__Loop__FixedTargetQubitsAssignment_24_3_1");
			builder.put(grammarAccess.getLoopAccess().getLoopAssignment_26(), "rule__Loop__LoopAssignment_26");
			builder.put(grammarAccess.getLoopAccess().getLoopTargetQubitsAssignment_30(), "rule__Loop__LoopTargetQubitsAssignment_30");
			builder.put(grammarAccess.getLoopAccess().getLoopTargetQubitsAssignment_32_2(), "rule__Loop__LoopTargetQubitsAssignment_32_2");
			builder.put(grammarAccess.getLoopAccess().getLoopControlQubitsAssignment_34_3(), "rule__Loop__LoopControlQubitsAssignment_34_3");
			builder.put(grammarAccess.getLoopAccess().getLoopControlQubitsAssignment_34_5_2(), "rule__Loop__LoopControlQubitsAssignment_34_5_2");
			builder.put(grammarAccess.getOperationAccess().getOperationAssignment_0(), "rule__Operation__OperationAssignment_0");
			builder.put(grammarAccess.getOperationAccess().getQuboAssignment_1_1(), "rule__Operation__QuboAssignment_1_1");
			builder.put(grammarAccess.getElementSelectorAccess().getRegisterAssignment_1_0(), "rule__ElementSelector__RegisterAssignment_1_0");
			builder.put(grammarAccess.getElementSelectorAccess().getIndexAssignment_2(), "rule__ElementSelector__IndexAssignment_2");
			builder.put(grammarAccess.getRangeSelectorAccess().getRegisterAssignment_1_0(), "rule__RangeSelector__RegisterAssignment_1_0");
			builder.put(grammarAccess.getRangeSelectorAccess().getBeginAssignment_2(), "rule__RangeSelector__BeginAssignment_2");
			builder.put(grammarAccess.getRangeSelectorAccess().getEndAssignment_4(), "rule__RangeSelector__EndAssignment_4");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private QuCircuitGrammarAccess grammarAccess;

	@Override
	protected InternalQuCircuitParser createParser() {
		InternalQuCircuitParser result = new InternalQuCircuitParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public QuCircuitGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(QuCircuitGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
