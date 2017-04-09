/*
 * generated by Xtext 2.11.0
 */
package io.entitas.lang.serializer;

import com.google.inject.Inject;
import io.entitas.lang.services.DSLGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class DSLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected DSLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Component_CommaKeyword_2_1_1_q;
	protected AbstractElementAlias match_ContextId_CommaKeyword_1_2_q;
	protected AbstractElementAlias match_ContextScopes_CommaKeyword_1_1_q;
	protected AbstractElementAlias match_Context_CommaKeyword_1_1_q;
	protected AbstractElementAlias match_MatcherRule_CommaKeyword_1_2_1_q;
	protected AbstractElementAlias match_MatcherRule_CommaKeyword_2_2_1_q;
	protected AbstractElementAlias match_MatcherRule_CommaKeyword_3_2_1_q;
	protected AbstractElementAlias match_PropertyRules_CommaKeyword_3_q;
	protected AbstractElementAlias match_System_CommaKeyword_2_1_1_q;
	protected AbstractElementAlias match_System_CommaKeyword_3_3_1_q;
	protected AbstractElementAlias match_TargetId_CommaKeyword_1_2_q;
	protected AbstractElementAlias match_Target_CommaKeyword_1_1_q;
	protected AbstractElementAlias match_TriggerRule_CommaKeyword_2_1_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (DSLGrammarAccess) access;
		match_Component_CommaKeyword_2_1_1_q = new TokenAlias(false, true, grammarAccess.getComponentAccess().getCommaKeyword_2_1_1());
		match_ContextId_CommaKeyword_1_2_q = new TokenAlias(false, true, grammarAccess.getContextIdAccess().getCommaKeyword_1_2());
		match_ContextScopes_CommaKeyword_1_1_q = new TokenAlias(false, true, grammarAccess.getContextScopesAccess().getCommaKeyword_1_1());
		match_Context_CommaKeyword_1_1_q = new TokenAlias(false, true, grammarAccess.getContextAccess().getCommaKeyword_1_1());
		match_MatcherRule_CommaKeyword_1_2_1_q = new TokenAlias(false, true, grammarAccess.getMatcherRuleAccess().getCommaKeyword_1_2_1());
		match_MatcherRule_CommaKeyword_2_2_1_q = new TokenAlias(false, true, grammarAccess.getMatcherRuleAccess().getCommaKeyword_2_2_1());
		match_MatcherRule_CommaKeyword_3_2_1_q = new TokenAlias(false, true, grammarAccess.getMatcherRuleAccess().getCommaKeyword_3_2_1());
		match_PropertyRules_CommaKeyword_3_q = new TokenAlias(false, true, grammarAccess.getPropertyRulesAccess().getCommaKeyword_3());
		match_System_CommaKeyword_2_1_1_q = new TokenAlias(false, true, grammarAccess.getSystemAccess().getCommaKeyword_2_1_1());
		match_System_CommaKeyword_3_3_1_q = new TokenAlias(false, true, grammarAccess.getSystemAccess().getCommaKeyword_3_3_1());
		match_TargetId_CommaKeyword_1_2_q = new TokenAlias(false, true, grammarAccess.getTargetIdAccess().getCommaKeyword_1_2());
		match_Target_CommaKeyword_1_1_q = new TokenAlias(false, true, grammarAccess.getTargetAccess().getCommaKeyword_1_1());
		match_TriggerRule_CommaKeyword_2_1_q = new TokenAlias(false, true, grammarAccess.getTriggerRuleAccess().getCommaKeyword_2_1());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Component_CommaKeyword_2_1_1_q.equals(syntax))
				emit_Component_CommaKeyword_2_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ContextId_CommaKeyword_1_2_q.equals(syntax))
				emit_ContextId_CommaKeyword_1_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ContextScopes_CommaKeyword_1_1_q.equals(syntax))
				emit_ContextScopes_CommaKeyword_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Context_CommaKeyword_1_1_q.equals(syntax))
				emit_Context_CommaKeyword_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_MatcherRule_CommaKeyword_1_2_1_q.equals(syntax))
				emit_MatcherRule_CommaKeyword_1_2_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_MatcherRule_CommaKeyword_2_2_1_q.equals(syntax))
				emit_MatcherRule_CommaKeyword_2_2_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_MatcherRule_CommaKeyword_3_2_1_q.equals(syntax))
				emit_MatcherRule_CommaKeyword_3_2_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PropertyRules_CommaKeyword_3_q.equals(syntax))
				emit_PropertyRules_CommaKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_System_CommaKeyword_2_1_1_q.equals(syntax))
				emit_System_CommaKeyword_2_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_System_CommaKeyword_3_3_1_q.equals(syntax))
				emit_System_CommaKeyword_3_3_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_TargetId_CommaKeyword_1_2_q.equals(syntax))
				emit_TargetId_CommaKeyword_1_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Target_CommaKeyword_1_1_q.equals(syntax))
				emit_Target_CommaKeyword_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_TriggerRule_CommaKeyword_2_1_q.equals(syntax))
				emit_TriggerRule_CommaKeyword_2_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     parameters+=ComponentParameter (ambiguity) ')' (rule end)
	 *     parameters+=ComponentParameter (ambiguity) ')' listOfProperties=PropertyList
	 *     parameters+=ComponentParameter (ambiguity) ')' propertyPrefix=PropertyPrefix
	 *     parameters+=ComponentParameter (ambiguity) ')' scope=ContextScopes
	 *     parameters+=ComponentParameter (ambiguity) parameters+=ComponentParameter
	 */
	protected void emit_Component_CommaKeyword_2_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     parameters+=ContextParameter (ambiguity) ')' (rule end)
	 */
	protected void emit_ContextId_CommaKeyword_1_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     references+=[ContextId|ID] (ambiguity) (rule end)
	 *     references+=[ContextId|ID] (ambiguity) references+=[ContextId|ID]
	 */
	protected void emit_ContextScopes_CommaKeyword_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     ids+=ContextId (ambiguity) (rule end)
	 *     ids+=ContextId (ambiguity) ids+=ContextId
	 */
	protected void emit_Context_CommaKeyword_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     allComponents+=[Component|ID] (ambiguity) ')' 'anyOf' '(' anyComponents+=[Component|ID]
	 *     allComponents+=[Component|ID] (ambiguity) ')' 'noneOf' '(' noneComponents+=[Component|ID]
	 *     allComponents+=[Component|ID] (ambiguity) ')' (rule end)
	 *     allComponents+=[Component|ID] (ambiguity) allComponents+=[Component|ID]
	 */
	protected void emit_MatcherRule_CommaKeyword_1_2_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     anyComponents+=[Component|ID] (ambiguity) ')' 'noneOf' '(' noneComponents+=[Component|ID]
	 *     anyComponents+=[Component|ID] (ambiguity) ')' (rule end)
	 *     anyComponents+=[Component|ID] (ambiguity) anyComponents+=[Component|ID]
	 */
	protected void emit_MatcherRule_CommaKeyword_2_2_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     noneComponents+=[Component|ID] (ambiguity) ')' (rule end)
	 *     noneComponents+=[Component|ID] (ambiguity) noneComponents+=[Component|ID]
	 */
	protected void emit_MatcherRule_CommaKeyword_3_2_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     alias=[Alias|ID] (ambiguity) (rule end)
	 */
	protected void emit_PropertyRules_CommaKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     parameters+=SystemParameter (ambiguity) ')' 'access' ':' accessRules+=AccessRule
	 *     parameters+=SystemParameter (ambiguity) ')' (rule end)
	 *     parameters+=SystemParameter (ambiguity) ')' reactive?='trigger'
	 *     parameters+=SystemParameter (ambiguity) parameters+=SystemParameter
	 */
	protected void emit_System_CommaKeyword_2_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     triggerRules+=TriggerRule (ambiguity) 'access' ':' accessRules+=AccessRule
	 *     triggerRules+=TriggerRule (ambiguity) 'filter' matcherRules=MatcherRule
	 *     triggerRules+=TriggerRule (ambiguity) (rule end)
	 *     triggerRules+=TriggerRule (ambiguity) noFilter?='noFilter'
	 *     triggerRules+=TriggerRule (ambiguity) triggerRules+=TriggerRule
	 */
	protected void emit_System_CommaKeyword_3_3_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     parameters+=TargetParameter (ambiguity) ')' (rule end)
	 *     parameters+=TargetParameter (ambiguity) ')' version=Version
	 */
	protected void emit_TargetId_CommaKeyword_1_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     ids+=TargetId (ambiguity) (rule end)
	 *     ids+=TargetId (ambiguity) ids+=TargetId
	 */
	protected void emit_Target_CommaKeyword_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     components+=[Component|ID] (ambiguity) ')' (rule end)
	 *     components+=[Component|ID] (ambiguity) components+=[Component|ID]
	 */
	protected void emit_TriggerRule_CommaKeyword_2_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
