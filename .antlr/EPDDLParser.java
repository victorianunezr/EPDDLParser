// Generated from /Users/victorianunezr/repos/EPDDLParser/EPDDLParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class EPDDLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EVENT=1, PRECONDITION=2, POSTCONDITIONS=3, STATE=4, INIT=5, GOAL=6, WHERE=7, 
		RELATIONS=8, DESIGNATED=9, PREDICATES=10, MODALITY=11, ACTION=12, PARAMETERS=13, 
		OBSERVABILITY_GROUPS=14, ACTION_TYPE_LIBRARIES=15, REQUIREMENTS=16, TYPES=17, 
		OBJECTS=18, STATIC=19, AGENTS=20, AGENT_GROUPS=21, VALUATION=22, STATE_NAME=23, 
		OBSERVABILITY_CONDITIONS=24, ACTION_TYPE=25, WORLDS=26, DEL=27, TYPING=28, 
		EQUALITY=29, CDOMAIN=30, EXISTENTIAL_FORMULAE=31, MULTI_AGENT=32, ONTIC_ACTIONS=33, 
		UNIVERSAL_FORMULAE=34, UNIVERSAL_POSTCONDITIONS=35, MODAL_PRECONDITIONS=36, 
		MODAL_POSTCONDITIONS=37, MODALITIES=38, ONTIC_CHANGE=39, COMMON_KNOWLEDGE=40, 
		DYNAMIC_COMMON_KNOWLEDGE=41, FINITARY_S5_THEORY=42, MAX_PRECONDITIONS_DEPTH=43, 
		MAX_POSTCONDITIONS_DEPTH=44, MAX_MODAL_DEPTH=45, FINITARY_THEORY=46, COLON=47, 
		IMPLY=48, OR=49, AND=50, NOT=51, EXISTS=52, FORALL=53, TRUE=54, FALSE=55, 
		ASSIGN=56, KW=57, IFF=58, WHEN=59, ALWAYS=60, IF=61, OTHERWISE=62, DEFINE=63, 
		DOMAIN=64, LIBRARY=65, PROBLEM=66, PREDICATE=67, PREDICATE_FORMULA=68, 
		FORMULA=69, POSTCONDITION=70, LITERAL=71, ALL=72, WORLD=73, AGENT=74, 
		TRIVIAL_DEF=75, NAME=76, AGENT_NAME=77, MODALITY_NAME=78, VARIABLE=79, 
		INT=80, WS=81, COMMENT=82, DASH=83, LPAREN=84, RPAREN=85, LBRACKET=86, 
		RBRACKET=87, LBRACE=88, RBRACE=89, LT=90, GT=91;
	public static final int
		RULE_mainDef = 0, RULE_domainDef = 1, RULE_libraryDef = 2, RULE_problemDef = 3, 
		RULE_domainItemDef = 4, RULE_libraryItemDef = 5, RULE_problemItemDef = 6, 
		RULE_domainLibrariesNameDef = 7, RULE_problemDomainNameDef = 8, RULE_agentNamesDef = 9, 
		RULE_agentGroupsListDef = 10, RULE_agentGroupDef = 11, RULE_objectNamesDef = 12, 
		RULE_staticPredListDef = 13, RULE_requireDef = 14, RULE_typesDef = 15, 
		RULE_predicateListDef = 16, RULE_predicateDef = 17, RULE_actionDef = 18, 
		RULE_parametersDef = 19, RULE_modalityDef = 20, RULE_observabilityGroupsDef = 21, 
		RULE_eventDef = 22, RULE_eventPreDef = 23, RULE_eventPostDef = 24, RULE_postconditionBlock = 25, 
		RULE_postcondition = 26, RULE_simplePostcondition = 27, RULE_actionTypeDef = 28, 
		RULE_stateDef = 29, RULE_initDef = 30, RULE_goalDef = 31, RULE_actionConditionDef = 32, 
		RULE_actionTypeSignatureDef = 33, RULE_actionPreDef = 34, RULE_actionObsDef = 35, 
		RULE_typedIdentList = 36, RULE_typedVariableList = 37, RULE_type = 38, 
		RULE_reservedType = 39, RULE_formula = 40, RULE_conditionFormula = 41, 
		RULE_condition = 42, RULE_atomicCondition = 43, RULE_predicateFormula = 44, 
		RULE_atomicEqFormula = 45, RULE_term = 46, RULE_groundTerm = 47, RULE_modality = 48, 
		RULE_singleModality = 49, RULE_groupModality = 50, RULE_modalityLabel = 51, 
		RULE_modalityAgent = 52, RULE_modalityAgentGroup = 53, RULE_allAgents = 54, 
		RULE_predicateName = 55, RULE_domainName = 56, RULE_problemName = 57, 
		RULE_libraryName = 58, RULE_stateName = 59, RULE_worldName = 60, RULE_actionName = 61, 
		RULE_eventName = 62, RULE_agentName = 63, RULE_modalityName = 64, RULE_staticPredDef = 65, 
		RULE_genericName = 66, RULE_stateWorldsDef = 67, RULE_stateRelDef = 68, 
		RULE_stateRelations = 69, RULE_worldRelation = 70, RULE_worldNamePair = 71, 
		RULE_stateValDef = 72, RULE_stateValuation = 73, RULE_worldValuation = 74, 
		RULE_stateDesignDef = 75, RULE_agentGroup = 76, RULE_literal = 77, RULE_initialStateDescr = 78, 
		RULE_fTheoryFormula = 79, RULE_simpleFTheoryFormula = 80, RULE_actionTypeName = 81, 
		RULE_parameter = 82, RULE_expression = 83, RULE_formulaOrEmpty = 84, RULE_obsConditionDef = 85, 
		RULE_universalObsCond = 86, RULE_obsCondition = 87, RULE_trivialObsCond = 88, 
		RULE_ifObsCond = 89, RULE_otherwiseObsCond = 90, RULE_observingAgent = 91, 
		RULE_observingAgentGroup = 92, RULE_agentGroupName = 93, RULE_predicate = 94, 
		RULE_actionTypeGroupsDef = 95, RULE_actionTypeEventsDef = 96, RULE_eventSignature = 97, 
		RULE_actionTypeRelDef = 98, RULE_actionRelations = 99, RULE_eventRelation = 100, 
		RULE_eventNamePair = 101, RULE_actionTypeDesignDef = 102, RULE_typedAgentList = 103, 
		RULE_knowsWhether = 104, RULE_requirementKey = 105;
	private static String[] makeRuleNames() {
		return new String[] {
			"mainDef", "domainDef", "libraryDef", "problemDef", "domainItemDef", 
			"libraryItemDef", "problemItemDef", "domainLibrariesNameDef", "problemDomainNameDef", 
			"agentNamesDef", "agentGroupsListDef", "agentGroupDef", "objectNamesDef", 
			"staticPredListDef", "requireDef", "typesDef", "predicateListDef", "predicateDef", 
			"actionDef", "parametersDef", "modalityDef", "observabilityGroupsDef", 
			"eventDef", "eventPreDef", "eventPostDef", "postconditionBlock", "postcondition", 
			"simplePostcondition", "actionTypeDef", "stateDef", "initDef", "goalDef", 
			"actionConditionDef", "actionTypeSignatureDef", "actionPreDef", "actionObsDef", 
			"typedIdentList", "typedVariableList", "type", "reservedType", "formula", 
			"conditionFormula", "condition", "atomicCondition", "predicateFormula", 
			"atomicEqFormula", "term", "groundTerm", "modality", "singleModality", 
			"groupModality", "modalityLabel", "modalityAgent", "modalityAgentGroup", 
			"allAgents", "predicateName", "domainName", "problemName", "libraryName", 
			"stateName", "worldName", "actionName", "eventName", "agentName", "modalityName", 
			"staticPredDef", "genericName", "stateWorldsDef", "stateRelDef", "stateRelations", 
			"worldRelation", "worldNamePair", "stateValDef", "stateValuation", "worldValuation", 
			"stateDesignDef", "agentGroup", "literal", "initialStateDescr", "fTheoryFormula", 
			"simpleFTheoryFormula", "actionTypeName", "parameter", "expression", 
			"formulaOrEmpty", "obsConditionDef", "universalObsCond", "obsCondition", 
			"trivialObsCond", "ifObsCond", "otherwiseObsCond", "observingAgent", 
			"observingAgentGroup", "agentGroupName", "predicate", "actionTypeGroupsDef", 
			"actionTypeEventsDef", "eventSignature", "actionTypeRelDef", "actionRelations", 
			"eventRelation", "eventNamePair", "actionTypeDesignDef", "typedAgentList", 
			"knowsWhether", "requirementKey"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':event'", "':precondition'", "':postconditions'", "':state'", 
			"':init'", "':goal'", "':where'", "':relations'", "':designated'", "':predicates'", 
			"':modality'", "':action'", "':parameters'", "':observability-groups'", 
			"':action-type-libraries'", "':requirements'", "':types'", "':objects'", 
			"':static'", "':agents'", "':agent-groups'", "':valuation'", "':state-name'", 
			"':observability-conditions'", "':action-type'", "':worlds'", "':del'", 
			"':typing'", "':equality'", "':domain'", "':existential-formulae'", "':multi-agent'", 
			"':ontic-actions'", "':universal-formulae'", "':universal-postconditions'", 
			"':modal-preconditions'", "':modal-postconditions'", "':modalities'", 
			"':ontic-change'", "':common-knowledge'", "':dynamic-common-knowledge'", 
			"':finitary-S5-theory'", "':maximum-preconditions-depth'", "':maximum-postconditions-depth'", 
			"':maximum-modal-depth'", "':ma-star-finitary-theory'", "':'", "'imply'", 
			"'or'", "'and'", "'not'", "'exists'", "'forall'", "'true'", "'false'", 
			"'<-'", "'kw'", "'iff'", "'when'", "'always'", "'if'", "'otherwise'", 
			"'define'", "'domain'", "'library'", "'problem'", "'predicate'", "'predicate-formula'", 
			"'formula'", "'postcondition'", "'literal'", "'All'", "'world'", "'agent'", 
			"'()'", null, null, null, null, null, null, null, "'-'", "'('", "')'", 
			"'['", "']'", "'{'", "'}'", "'<'", "'>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "EVENT", "PRECONDITION", "POSTCONDITIONS", "STATE", "INIT", "GOAL", 
			"WHERE", "RELATIONS", "DESIGNATED", "PREDICATES", "MODALITY", "ACTION", 
			"PARAMETERS", "OBSERVABILITY_GROUPS", "ACTION_TYPE_LIBRARIES", "REQUIREMENTS", 
			"TYPES", "OBJECTS", "STATIC", "AGENTS", "AGENT_GROUPS", "VALUATION", 
			"STATE_NAME", "OBSERVABILITY_CONDITIONS", "ACTION_TYPE", "WORLDS", "DEL", 
			"TYPING", "EQUALITY", "CDOMAIN", "EXISTENTIAL_FORMULAE", "MULTI_AGENT", 
			"ONTIC_ACTIONS", "UNIVERSAL_FORMULAE", "UNIVERSAL_POSTCONDITIONS", "MODAL_PRECONDITIONS", 
			"MODAL_POSTCONDITIONS", "MODALITIES", "ONTIC_CHANGE", "COMMON_KNOWLEDGE", 
			"DYNAMIC_COMMON_KNOWLEDGE", "FINITARY_S5_THEORY", "MAX_PRECONDITIONS_DEPTH", 
			"MAX_POSTCONDITIONS_DEPTH", "MAX_MODAL_DEPTH", "FINITARY_THEORY", "COLON", 
			"IMPLY", "OR", "AND", "NOT", "EXISTS", "FORALL", "TRUE", "FALSE", "ASSIGN", 
			"KW", "IFF", "WHEN", "ALWAYS", "IF", "OTHERWISE", "DEFINE", "DOMAIN", 
			"LIBRARY", "PROBLEM", "PREDICATE", "PREDICATE_FORMULA", "FORMULA", "POSTCONDITION", 
			"LITERAL", "ALL", "WORLD", "AGENT", "TRIVIAL_DEF", "NAME", "AGENT_NAME", 
			"MODALITY_NAME", "VARIABLE", "INT", "WS", "COMMENT", "DASH", "LPAREN", 
			"RPAREN", "LBRACKET", "RBRACKET", "LBRACE", "RBRACE", "LT", "GT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "EPDDLParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EPDDLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MainDefContext extends ParserRuleContext {
		public DomainDefContext domainDef() {
			return getRuleContext(DomainDefContext.class,0);
		}
		public LibraryDefContext libraryDef() {
			return getRuleContext(LibraryDefContext.class,0);
		}
		public ProblemDefContext problemDef() {
			return getRuleContext(ProblemDefContext.class,0);
		}
		public MainDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainDef; }
	}

	public final MainDefContext mainDef() throws RecognitionException {
		MainDefContext _localctx = new MainDefContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_mainDef);
		try {
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				domainDef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				libraryDef();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(214);
				problemDef();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DomainDefContext extends ParserRuleContext {
		public List<TerminalNode> LPAREN() { return getTokens(EPDDLParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(EPDDLParser.LPAREN, i);
		}
		public TerminalNode DEFINE() { return getToken(EPDDLParser.DEFINE, 0); }
		public TerminalNode DOMAIN() { return getToken(EPDDLParser.DOMAIN, 0); }
		public DomainNameContext domainName() {
			return getRuleContext(DomainNameContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(EPDDLParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(EPDDLParser.RPAREN, i);
		}
		public List<DomainItemDefContext> domainItemDef() {
			return getRuleContexts(DomainItemDefContext.class);
		}
		public DomainItemDefContext domainItemDef(int i) {
			return getRuleContext(DomainItemDefContext.class,i);
		}
		public DomainDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_domainDef; }
	}

	public final DomainDefContext domainDef() throws RecognitionException {
		DomainDefContext _localctx = new DomainDefContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_domainDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(LPAREN);
			setState(218);
			match(DEFINE);
			setState(219);
			match(LPAREN);
			setState(220);
			match(DOMAIN);
			setState(221);
			domainName();
			setState(222);
			match(RPAREN);
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAREN) {
				{
				{
				setState(223);
				domainItemDef();
				}
				}
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(229);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LibraryDefContext extends ParserRuleContext {
		public List<TerminalNode> LPAREN() { return getTokens(EPDDLParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(EPDDLParser.LPAREN, i);
		}
		public TerminalNode DEFINE() { return getToken(EPDDLParser.DEFINE, 0); }
		public TerminalNode LIBRARY() { return getToken(EPDDLParser.LIBRARY, 0); }
		public LibraryNameContext libraryName() {
			return getRuleContext(LibraryNameContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(EPDDLParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(EPDDLParser.RPAREN, i);
		}
		public List<LibraryItemDefContext> libraryItemDef() {
			return getRuleContexts(LibraryItemDefContext.class);
		}
		public LibraryItemDefContext libraryItemDef(int i) {
			return getRuleContext(LibraryItemDefContext.class,i);
		}
		public LibraryDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_libraryDef; }
	}

	public final LibraryDefContext libraryDef() throws RecognitionException {
		LibraryDefContext _localctx = new LibraryDefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_libraryDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(LPAREN);
			setState(232);
			match(DEFINE);
			setState(233);
			match(LPAREN);
			setState(234);
			match(LIBRARY);
			setState(235);
			libraryName();
			setState(236);
			match(RPAREN);
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAREN) {
				{
				{
				setState(237);
				libraryItemDef();
				}
				}
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(243);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProblemDefContext extends ParserRuleContext {
		public List<TerminalNode> LPAREN() { return getTokens(EPDDLParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(EPDDLParser.LPAREN, i);
		}
		public TerminalNode DEFINE() { return getToken(EPDDLParser.DEFINE, 0); }
		public TerminalNode PROBLEM() { return getToken(EPDDLParser.PROBLEM, 0); }
		public ProblemNameContext problemName() {
			return getRuleContext(ProblemNameContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(EPDDLParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(EPDDLParser.RPAREN, i);
		}
		public List<ProblemItemDefContext> problemItemDef() {
			return getRuleContexts(ProblemItemDefContext.class);
		}
		public ProblemItemDefContext problemItemDef(int i) {
			return getRuleContext(ProblemItemDefContext.class,i);
		}
		public ProblemDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_problemDef; }
	}

	public final ProblemDefContext problemDef() throws RecognitionException {
		ProblemDefContext _localctx = new ProblemDefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_problemDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(LPAREN);
			setState(246);
			match(DEFINE);
			setState(247);
			match(LPAREN);
			setState(248);
			match(PROBLEM);
			setState(249);
			problemName();
			setState(250);
			match(RPAREN);
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAREN) {
				{
				{
				setState(251);
				problemItemDef();
				}
				}
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(257);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DomainItemDefContext extends ParserRuleContext {
		public DomainLibrariesNameDefContext domainLibrariesNameDef() {
			return getRuleContext(DomainLibrariesNameDefContext.class,0);
		}
		public RequireDefContext requireDef() {
			return getRuleContext(RequireDefContext.class,0);
		}
		public TypesDefContext typesDef() {
			return getRuleContext(TypesDefContext.class,0);
		}
		public PredicateListDefContext predicateListDef() {
			return getRuleContext(PredicateListDefContext.class,0);
		}
		public ModalityDefContext modalityDef() {
			return getRuleContext(ModalityDefContext.class,0);
		}
		public ActionDefContext actionDef() {
			return getRuleContext(ActionDefContext.class,0);
		}
		public DomainItemDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_domainItemDef; }
	}

	public final DomainItemDefContext domainItemDef() throws RecognitionException {
		DomainItemDefContext _localctx = new DomainItemDefContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_domainItemDef);
		try {
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				domainLibrariesNameDef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				requireDef();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(261);
				typesDef();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(262);
				predicateListDef();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(263);
				modalityDef();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(264);
				actionDef();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LibraryItemDefContext extends ParserRuleContext {
		public RequireDefContext requireDef() {
			return getRuleContext(RequireDefContext.class,0);
		}
		public ModalityDefContext modalityDef() {
			return getRuleContext(ModalityDefContext.class,0);
		}
		public ObservabilityGroupsDefContext observabilityGroupsDef() {
			return getRuleContext(ObservabilityGroupsDefContext.class,0);
		}
		public ActionTypeDefContext actionTypeDef() {
			return getRuleContext(ActionTypeDefContext.class,0);
		}
		public EventDefContext eventDef() {
			return getRuleContext(EventDefContext.class,0);
		}
		public LibraryItemDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_libraryItemDef; }
	}

	public final LibraryItemDefContext libraryItemDef() throws RecognitionException {
		LibraryItemDefContext _localctx = new LibraryItemDefContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_libraryItemDef);
		try {
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				requireDef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				modalityDef();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(269);
				observabilityGroupsDef();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(270);
				actionTypeDef();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(271);
				eventDef();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProblemItemDefContext extends ParserRuleContext {
		public ProblemDomainNameDefContext problemDomainNameDef() {
			return getRuleContext(ProblemDomainNameDefContext.class,0);
		}
		public RequireDefContext requireDef() {
			return getRuleContext(RequireDefContext.class,0);
		}
		public ModalityDefContext modalityDef() {
			return getRuleContext(ModalityDefContext.class,0);
		}
		public AgentNamesDefContext agentNamesDef() {
			return getRuleContext(AgentNamesDefContext.class,0);
		}
		public AgentGroupsListDefContext agentGroupsListDef() {
			return getRuleContext(AgentGroupsListDefContext.class,0);
		}
		public ObjectNamesDefContext objectNamesDef() {
			return getRuleContext(ObjectNamesDefContext.class,0);
		}
		public StaticPredListDefContext staticPredListDef() {
			return getRuleContext(StaticPredListDefContext.class,0);
		}
		public InitDefContext initDef() {
			return getRuleContext(InitDefContext.class,0);
		}
		public StateDefContext stateDef() {
			return getRuleContext(StateDefContext.class,0);
		}
		public GoalDefContext goalDef() {
			return getRuleContext(GoalDefContext.class,0);
		}
		public ProblemItemDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_problemItemDef; }
	}

	public final ProblemItemDefContext problemItemDef() throws RecognitionException {
		ProblemItemDefContext _localctx = new ProblemItemDefContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_problemItemDef);
		try {
			setState(284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				problemDomainNameDef();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				requireDef();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(276);
				modalityDef();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(277);
				agentNamesDef();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(278);
				agentGroupsListDef();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(279);
				objectNamesDef();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(280);
				staticPredListDef();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(281);
				initDef();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(282);
				stateDef();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(283);
				goalDef();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DomainLibrariesNameDefContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(EPDDLParser.LPAREN, 0); }
		public TerminalNode ACTION_TYPE_LIBRARIES() { return getToken(EPDDLParser.ACTION_TYPE_LIBRARIES, 0); }
		public TerminalNode RPAREN() { return getToken(EPDDLParser.RPAREN, 0); }
		public List<LibraryNameContext> libraryName() {
			return getRuleContexts(LibraryNameContext.class);
		}
		public LibraryNameContext libraryName(int i) {
			return getRuleContext(LibraryNameContext.class,i);
		}
		public DomainLibrariesNameDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_domainLibrariesNameDef; }
	}

	public final DomainLibrariesNameDefContext domainLibrariesNameDef() throws RecognitionException {
		DomainLibrariesNameDefContext _localctx = new DomainLibrariesNameDefContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_domainLibrariesNameDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(LPAREN);
			setState(287);
			match(ACTION_TYPE_LIBRARIES);
			setState(289); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(288);
				libraryName();
				}
				}
				setState(291); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NAME );
			setState(293);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProblemDomainNameDefContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(EPDDLParser.LPAREN, 0); }
		public TerminalNode CDOMAIN() { return getToken(EPDDLParser.CDOMAIN, 0); }
		public DomainNameContext domainName() {
			return getRuleContext(DomainNameContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(EPDDLParser.RPAREN, 0); }
		public ProblemDomainNameDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_problemDomainNameDef; }
	}

	public final ProblemDomainNameDefContext problemDomainNameDef() throws RecognitionException {
		ProblemDomainNameDefContext _localctx = new ProblemDomainNameDefContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_problemDomainNameDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(LPAREN);
			setState(296);
			match(CDOMAIN);
			setState(297);
			domainName();
			setState(298);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AgentNamesDefContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(EPDDLParser.LPAREN, 0); }
		public TerminalNode AGENTS() { return getToken(EPDDLParser.AGENTS, 0); }
		public TypedAgentListContext typedAgentList() {
			return getRuleContext(TypedAgentListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(EPDDLParser.RPAREN, 0); }
		public AgentNamesDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_agentNamesDef; }
	}

	public final AgentNamesDefContext agentNamesDef() throws RecognitionException {
		AgentNamesDefContext _localctx = new AgentNamesDefContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_agentNamesDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(LPAREN);
			setState(301);
			match(AGENTS);
			setState(302);
			typedAgentList();
			setState(303);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AgentGroupsListDefContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(EPDDLParser.LPAREN, 0); }
		public TerminalNode AGENT_GROUPS() { return getToken(EPDDLParser.AGENT_GROUPS, 0); }
		public TerminalNode RPAREN() { return getToken(EPDDLParser.RPAREN, 0); }
		public List<AgentGroupDefContext> agentGroupDef() {
			return getRuleContexts(AgentGroupDefContext.class);
		}
		public AgentGroupDefContext agentGroupDef(int i) {
			return getRuleContext(AgentGroupDefContext.class,i);
		}
		public AgentGroupsListDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_agentGroupsListDef; }
	}

	public final AgentGroupsListDefContext agentGroupsListDef() throws RecognitionException {
		AgentGroupsListDefContext _localctx = new AgentGroupsListDefContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_agentGroupsListDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(LPAREN);
			setState(306);
			match(AGENT_GROUPS);
			setState(308); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(307);
				agentGroupDef();
				}
				}
				setState(310); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LPAREN );
			setState(312);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AgentGroupDefContext extends ParserRuleContext {
		public List<TerminalNode> LPAREN() { return getTokens(EPDDLParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(EPDDLParser.LPAREN, i);
		}
		public AgentGroupNameContext agentGroupName() {
			return getRuleContext(AgentGroupNameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(EPDDLParser.ASSIGN, 0); }
		public List<AgentNameContext> agentName() {
			return getRuleContexts(AgentNameContext.class);
		}
		public AgentNameContext agentName(int i) {
			return getRuleContext(AgentNameContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(EPDDLParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(EPDDLParser.RPAREN, i);
		}
		public AgentGroupDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_agentGroupDef; }
	}

	public final AgentGroupDefContext agentGroupDef() throws RecognitionException {
		AgentGroupDefContext _localctx = new AgentGroupDefContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_agentGroupDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(LPAREN);
			setState(315);
			agentGroupName();
			setState(316);
			match(ASSIGN);
			setState(317);
			match(LPAREN);
			setState(318);
			agentName();
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AGENT_NAME) {
				{
				{
				setState(319);
				agentName();
				}
				}
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(325);
			match(RPAREN);
			setState(326);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectNamesDefContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(EPDDLParser.LPAREN, 0); }
		public TerminalNode OBJECTS() { return getToken(EPDDLParser.OBJECTS, 0); }
		public TypedIdentListContext typedIdentList() {
			return getRuleContext(TypedIdentListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(EPDDLParser.RPAREN, 0); }
		public ObjectNamesDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectNamesDef; }
	}

	public final ObjectNamesDefContext objectNamesDef() throws RecognitionException {
		ObjectNamesDefContext _localctx = new ObjectNamesDefContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_objectNamesDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(LPAREN);
			setState(329);
			match(OBJECTS);
			setState(330);
			typedIdentList();
			setState(331);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StaticPredListDefContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(EPDDLParser.LPAREN, 0); }
		public TerminalNode STATIC() { return getToken(EPDDLParser.STATIC, 0); }
		public TerminalNode RPAREN() { return getToken(EPDDLParser.RPAREN, 0); }
		public List<StaticPredDefContext> staticPredDef() {
			return getRuleContexts(StaticPredDefContext.class);
		}
		public StaticPredDefContext staticPredDef(int i) {
			return getRuleContext(StaticPredDefContext.class,i);
		}
		public StaticPredListDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticPredListDef; }
	}

	public final StaticPredListDefContext staticPredListDef() throws RecognitionException {
		StaticPredListDefContext _localctx = new StaticPredListDefContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_staticPredListDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(LPAREN);
			setState(334);
			match(STATIC);
			setState(336); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(335);
				staticPredDef();
				}
				}
				setState(338); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LPAREN );
			setState(340);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RequireDefContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(EPDDLParser.LPAREN, 0); }
		public TerminalNode REQUIREMENTS() { return getToken(EPDDLParser.REQUIREMENTS, 0); }
		public TerminalNode RPAREN() { return getToken(EPDDLParser.RPAREN, 0); }
		public List<RequirementKeyContext> requirementKey() {
			return getRuleContexts(RequirementKeyContext.class);
		}
		public RequirementKeyContext requirementKey(int i) {
			return getRuleContext(RequirementKeyContext.class,i);
		}
		public RequireDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requireDef; }
	}

	public final RequireDefContext requireDef() throws RecognitionException {
		RequireDefContext _localctx = new RequireDefContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_requireDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(LPAREN);
			setState(343);
			match(REQUIREMENTS);
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 27)) & ~0x3f) == 0 && ((1L << (_la - 27)) & 144115188076445687L) != 0)) {
				{
				{
				setState(344);
				requirementKey();
				}
				}
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(350);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypesDefContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(EPDDLParser.LPAREN, 0); }
		public TerminalNode TYPES() { return getToken(EPDDLParser.TYPES, 0); }
		public TypedIdentListContext typedIdentList() {
			return getRuleContext(TypedIdentListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(EPDDLParser.RPAREN, 0); }
		public TypesDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typesDef; }
	}

	public final TypesDefContext typesDef() throws RecognitionException {
		TypesDefContext _localctx = new TypesDefContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_typesDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(LPAREN);
			setState(353);
			match(TYPES);
			setState(354);
			typedIdentList();
			setState(355);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PredicateListDefContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(EPDDLParser.LPAREN, 0); }
		public TerminalNode PREDICATES() { return getToken(EPDDLParser.PREDICATES, 0); }
		public TerminalNode RPAREN() { return getToken(EPDDLParser.RPAREN, 0); }
		public List<PredicateDefContext> predicateDef() {
			return getRuleContexts(PredicateDefContext.class);
		}
		public PredicateDefContext predicateDef(int i) {
			return getRuleContext(PredicateDefContext.class,i);
		}
		public PredicateListDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicateListDef; }
	}

	public final PredicateListDefContext predicateListDef() throws RecognitionException {
		PredicateListDefContext _localctx = new PredicateListDefContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_predicateListDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(LPAREN);
			setState(358);
			match(PREDICATES);
			setState(360); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(359);
				predicateDef();
				}
				}
				setState(362); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LPAREN );
			setState(364);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PredicateDefContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(EPDDLParser.LPAREN, 0); }
		public PredicateNameContext predicateName() {
			return getRuleContext(PredicateNameContext.class,0);
		}
		public TypedVariableListContext typedVariableList() {
			return getRuleContext(TypedVariableListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(EPDDLParser.RPAREN, 0); }
		public PredicateDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicateDef; }
	}

	public final PredicateDefContext predicateDef() throws RecognitionException {
		PredicateDefContext _localctx = new PredicateDefContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_predicateDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(LPAREN);
			setState(367);
			predicateName();
			setState(368);
			typedVariableList();
			setState(369);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ActionDefContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(EPDDLParser.LPAREN, 0); }
		public TerminalNode ACTION() { return getToken(EPDDLParser.ACTION, 0); }
		public ActionNameContext actionName() {
			return getRuleContext(ActionNameContext.class,0);
		}
		public ParametersDefContext parametersDef() {
			return getRuleContext(ParametersDefContext.class,0);
		}
		public ActionConditionDefContext actionConditionDef() {
			return getRuleContext(ActionConditionDefContext.class,0);
		}
		public ActionPreDefContext actionPreDef() {
			return getRuleContext(ActionPreDefContext.class,0);
		}
		public ActionTypeSignatureDefContext actionTypeSignatureDef() {
			return getRuleContext(ActionTypeSignatureDefContext.class,0);
		}
		public ActionObsDefContext actionObsDef() {
			return getRuleContext(ActionObsDefContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(EPDDLParser.RPAREN, 0); }
		public ActionDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionDef; }
	}

	public final ActionDefContext actionDef() throws RecognitionException {
		ActionDefContext _localctx = new ActionDefContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_actionDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			match(LPAREN);
			setState(372);
			match(ACTION);
			setState(373);
			actionName();
			setState(374);
			parametersDef();
			setState(375);
			actionConditionDef();
			setState(376);
			actionPreDef();
			setState(377);
			actionTypeSignatureDef();
			setState(378);
			actionObsDef();
			setState(379);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametersDefContext extends ParserRuleContext {
		public TerminalNode PARAMETERS() { return getToken(EPDDLParser.PARAMETERS, 0); }
		public TerminalNode LPAREN() { return getToken(EPDDLParser.LPAREN, 0); }
		public TypedVariableListContext typedVariableList() {
			return getRuleContext(TypedVariableListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(EPDDLParser.RPAREN, 0); }
		public ParametersDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametersDef; }
	}

	public final ParametersDefContext parametersDef() throws RecognitionException {
		ParametersDefContext _localctx = new ParametersDefContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_parametersDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(PARAMETERS);
			setState(382);
			match(LPAREN);
			setState(383);
			typedVariableList();
			setState(384);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ModalityDefContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(EPDDLParser.LPAREN, 0); }
		public TerminalNode MODALITY() { return getToken(EPDDLParser.MODALITY, 0); }
		public TerminalNode RPAREN() { return getToken(EPDDLParser.RPAREN, 0); }
		public List<ModalityNameContext> modalityName() {
			return getRuleContexts(ModalityNameContext.class);
		}
		public ModalityNameContext modalityName(int i) {
			return getRuleContext(ModalityNameContext.class,i);
		}
		public ModalityDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modalityDef; }
	}

	public final ModalityDefContext modalityDef() throws RecognitionException {
		ModalityDefContext _localctx = new ModalityDefContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_modalityDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(LPAREN);
			setState(387);
			match(MODALITY);
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MODALITY_NAME) {
				{
				{
				setState(388);
				modalityName();
				}
				}
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(394);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObservabilityGroupsDefContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(EPDDLParser.LPAREN, 0); }
		public TerminalNode OBSERVABILITY_GROUPS() { return getToken(EPDDLParser.OBSERVABILITY_GROUPS, 0); }
		public TerminalNode RPAREN() { return getToken(EPDDLParser.RPAREN, 0); }
		public List<ObservingAgentGroupContext> observingAgentGroup() {
			return getRuleContexts(ObservingAgentGroupContext.class);
		}
		public ObservingAgentGroupContext observingAgentGroup(int i) {
			return getRuleContext(ObservingAgentGroupContext.class,i);
		}
		public ObservabilityGroupsDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_observabilityGroupsDef; }
	}

	public final ObservabilityGroupsDefContext observabilityGroupsDef() throws RecognitionException {
		ObservabilityGroupsDefContext _localctx = new ObservabilityGroupsDefContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_observabilityGroupsDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(LPAREN);
			setState(397);
			match(OBSERVABILITY_GROUPS);
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 161L) != 0)) {
				{
				{
				setState(398);
				observingAgentGroup();
				}
				}
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(404);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EventDefContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(EPDDLParser.LPAREN, 0); }
		public TerminalNode EVENT() { return getToken(EPDDLParser.EVENT, 0); }
		public EventNameContext eventName() {
			return getRuleContext(EventNameContext.class,0);
		}
		public ParametersDefContext parametersDef() {
			return getRuleContext(ParametersDefContext.class,0);
		}
		public EventPreDefContext eventPreDef() {
			return getRuleContext(EventPreDefContext.class,0);
		}
		public EventPostDefContext eventPostDef() {
			return getRuleContext(EventPostDefContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(EPDDLParser.RPAREN, 0); }
		public EventDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventDef; }
	}

	public final EventDefContext eventDef() throws RecognitionException {
		EventDefContext _localctx = new EventDefContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_eventDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			match(LPAREN);
			setState(407);
			match(EVENT);
			setState(408);
			eventName();
			setState(409);
			parametersDef();
			setState(410);
			eventPreDef();
			setState(411);
			eventPostDef();
			setState(412);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EventPreDefContext extends ParserRuleContext {
		public TerminalNode PRECONDITION() { return getToken(EPDDLParser.PRECONDITION, 0); }
		public FormulaOrEmptyContext formulaOrEmpty() {
			return getRuleContext(FormulaOrEmptyContext.class,0);
		}
		public EventPreDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventPreDef; }
	}

	public final EventPreDefContext eventPreDef() throws RecognitionException {
		EventPreDefContext _localctx = new EventPreDefContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_eventPreDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			match(PRECONDITION);
			setState(415);
			formulaOrEmpty();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EventPostDefContext extends ParserRuleContext {
		public TerminalNode POSTCONDITIONS() { return getToken(EPDDLParser.POSTCONDITIONS, 0); }
		public PostconditionBlockContext postconditionBlock() {
			return getRuleContext(PostconditionBlockContext.class,0);
		}
		public EventPostDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventPostDef; }
	}

	public final EventPostDefContext eventPostDef() throws RecognitionException {
		EventPostDefContext _localctx = new EventPostDefContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_eventPostDef);
		try {
			setState(420);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case POSTCONDITIONS:
				enterOuterAlt(_localctx, 1);
				{
				setState(417);
				match(POSTCONDITIONS);
				setState(418);
				postconditionBlock();
				}
				break;
			case RPAREN:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PostconditionBlockContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(EPDDLParser.LPAREN, 0); }
		public TerminalNode COLON() { return getToken(EPDDLParser.COLON, 0); }
		public TerminalNode RPAREN() { return getToken(EPDDLParser.RPAREN, 0); }
		public List<PostconditionContext> postcondition() {
			return getRuleContexts(PostconditionContext.class);
		}
		public PostconditionContext postcondition(int i) {
			return getRuleContext(PostconditionContext.class,i);
		}
		public PostconditionBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postconditionBlock; }
	}

	public final PostconditionBlockContext postconditionBlock() throws RecognitionException {
		PostconditionBlockContext _localctx = new PostconditionBlockContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_postconditionBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			match(LPAREN);
			setState(423);
			match(COLON);
			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAREN) {
				{
				{
				setState(424);
				postcondition();
				}
				}
				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(430);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PostconditionContext extends ParserRuleContext {
		public SimplePostconditionContext simplePostcondition() {
			return getRuleContext(SimplePostconditionContext.class,0);
		}
		public List<TerminalNode> LPAREN() { return getTokens(EPDDLParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(EPDDLParser.LPAREN, i);
		}
		public TerminalNode FORALL() { return getToken(EPDDLParser.FORALL, 0); }
		public TypedVariableListContext typedVariableList() {
			return getRuleContext(TypedVariableListContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(EPDDLParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(EPDDLParser.RPAREN, i);
		}
		public TerminalNode VARIABLE() { return getToken(EPDDLParser.VARIABLE, 0); }
		public PostconditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postcondition; }
	}

	public final PostconditionContext postcondition() throws RecognitionException {
		PostconditionContext _localctx = new PostconditionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_postcondition);
		try {
			setState(444);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(432);
				simplePostcondition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(433);
				match(LPAREN);
				setState(434);
				match(FORALL);
				setState(435);
				match(LPAREN);
				setState(436);
				typedVariableList();
				setState(437);
				match(RPAREN);
				setState(438);
				simplePostcondition();
				setState(439);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(441);
				match(LPAREN);
				setState(442);
				match(VARIABLE);
				setState(443);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SimplePostconditionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(EPDDLParser.LPAREN, 0); }
		public TerminalNode IFF() { return getToken(EPDDLParser.IFF, 0); }
		public FormulaOrEmptyContext formulaOrEmpty() {
			return getRuleContext(FormulaOrEmptyContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(EPDDLParser.RPAREN, 0); }
		public TerminalNode WHEN() { return getToken(EPDDLParser.WHEN, 0); }
		public TerminalNode ALWAYS() { return getToken(EPDDLParser.ALWAYS, 0); }
		public SimplePostconditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simplePostcondition; }
	}

	public final SimplePostconditionContext simplePostcondition() throws RecognitionException {
		SimplePostconditionContext _localctx = new SimplePostconditionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_simplePostcondition);
		try {
			setState(463);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(446);
				match(LPAREN);
				setState(447);
				match(IFF);
				setState(448);
				formulaOrEmpty();
				setState(449);
				literal();
				setState(450);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(452);
				match(LPAREN);
				setState(453);
				match(WHEN);
				setState(454);
				formulaOrEmpty();
				setState(455);
				literal();
				setState(456);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(458);
				match(LPAREN);
				setState(459);
				match(ALWAYS);
				setState(460);
				literal();
				setState(461);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ActionTypeDefContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(EPDDLParser.LPAREN, 0); }
		public TerminalNode ACTION_TYPE() { return getToken(EPDDLParser.ACTION_TYPE, 0); }
		public ActionTypeNameContext actionTypeName() {
			return getRuleContext(ActionTypeNameContext.class,0);
		}
		public ParametersDefContext parametersDef() {
			return getRuleContext(ParametersDefContext.class,0);
		}
		public ActionTypeGroupsDefContext actionTypeGroupsDef() {
			return getRuleContext(ActionTypeGroupsDefContext.class,0);
		}
		public ActionTypeEventsDefContext actionTypeEventsDef() {
			return getRuleContext(ActionTypeEventsDefContext.class,0);
		}
		public ActionTypeRelDefContext actionTypeRelDef() {
			return getRuleContext(ActionTypeRelDefContext.class,0);
		}
		public ActionTypeDesignDefContext actionTypeDesignDef() {
			return getRuleContext(ActionTypeDesignDefContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(EPDDLParser.RPAREN, 0); }
		public ActionTypeDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionTypeDef; }
	}

	public final ActionTypeDefContext actionTypeDef() throws RecognitionException {
		ActionTypeDefContext _localctx = new ActionTypeDefContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_actionTypeDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			match(LPAREN);
			setState(466);
			match(ACTION_TYPE);
			setState(467);
			actionTypeName();
			setState(468);
			parametersDef();
			setState(469);
			actionTypeGroupsDef();
			setState(470);
			actionTypeEventsDef();
			setState(471);
			actionTypeRelDef();
			setState(472);
			actionTypeDesignDef();
			setState(473);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StateDefContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(EPDDLParser.LPAREN, 0); }
		public TerminalNode STATE() { return getToken(EPDDLParser.STATE, 0); }
		public StateNameContext stateName() {
			return getRuleContext(StateNameContext.class,0);
		}
		public StateWorldsDefContext stateWorldsDef() {
			return getRuleContext(StateWorldsDefContext.class,0);
		}
		public StateRelDefContext stateRelDef() {
			return getRuleContext(StateRelDefContext.class,0);
		}
		public StateValDefContext stateValDef() {
			return getRuleContext(StateValDefContext.class,0);
		}
		public StateDesignDefContext stateDesignDef() {
			return getRuleContext(StateDesignDefContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(EPDDLParser.RPAREN, 0); }
		public StateDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateDef; }
	}

	public final StateDefContext stateDef() throws RecognitionException {
		StateDefContext _localctx = new StateDefContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_stateDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			match(LPAREN);
			setState(476);
			match(STATE);
			setState(477);
			stateName();
			setState(478);
			stateWorldsDef();
			setState(479);
			stateRelDef();
			setState(480);
			stateValDef();
			setState(481);
			stateDesignDef();
			setState(482);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InitDefContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(EPDDLParser.LPAREN, 0); }
		public TerminalNode INIT() { return getToken(EPDDLParser.INIT, 0); }
		public InitialStateDescrContext initialStateDescr() {
			return getRuleContext(InitialStateDescrContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(EPDDLParser.RPAREN, 0); }
		public InitDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDef; }
	}

	public final InitDefContext initDef() throws RecognitionException {
		InitDefContext _localctx = new InitDefContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_initDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			match(LPAREN);
			setState(485);
			match(INIT);
			setState(486);
			initialStateDescr();
			setState(487);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GoalDefContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(EPDDLParser.LPAREN, 0); }
		public TerminalNode GOAL() { return getToken(EPDDLParser.GOAL, 0); }
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(EPDDLParser.RPAREN, 0); }
		public GoalDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goalDef; }
	}

	public final GoalDefContext goalDef() throws RecognitionException {
		GoalDefContext _localctx = new GoalDefContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_goalDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			match(LPAREN);
			setState(490);
			match(GOAL);
			setState(491);
			formula();
			setState(492);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ActionConditionDefContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(EPDDLParser.WHERE, 0); }
		public ConditionFormulaContext conditionFormula() {
			return getRuleContext(ConditionFormulaContext.class,0);
		}
		public ActionConditionDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionConditionDef; }
	}

	public final ActionConditionDefContext actionConditionDef() throws RecognitionException {
		ActionConditionDefContext _localctx = new ActionConditionDefContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_actionConditionDef);
		try {
			setState(497);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHERE:
				enterOuterAlt(_localctx, 1);
				{
				setState(494);
				match(WHERE);
				setState(495);
				conditionFormula();
				}
				break;
			case PRECONDITION:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ActionTypeSignatureDefContext extends ParserRuleContext {
		public TerminalNode ACTION_TYPE() { return getToken(EPDDLParser.ACTION_TYPE, 0); }
		public TerminalNode LPAREN() { return getToken(EPDDLParser.LPAREN, 0); }
		public ActionTypeNameContext actionTypeName() {
			return getRuleContext(ActionTypeNameContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(EPDDLParser.RPAREN, 0); }
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ActionTypeSignatureDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionTypeSignatureDef; }
	}

	public final ActionTypeSignatureDefContext actionTypeSignatureDef() throws RecognitionException {
		ActionTypeSignatureDefContext _localctx = new ActionTypeSignatureDefContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_actionTypeSignatureDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			match(ACTION_TYPE);
			setState(500);
			match(LPAREN);
			setState(501);
			actionTypeName();
			setState(505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAREN) {
				{
				{
				setState(502);
				parameter();
				}
				}
				setState(507);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(508);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ActionPreDefContext extends ParserRuleContext {
		public TerminalNode PRECONDITION() { return getToken(EPDDLParser.PRECONDITION, 0); }
		public FormulaOrEmptyContext formulaOrEmpty() {
			return getRuleContext(FormulaOrEmptyContext.class,0);
		}
		public ActionPreDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionPreDef; }
	}

	public final ActionPreDefContext actionPreDef() throws RecognitionException {
		ActionPreDefContext _localctx = new ActionPreDefContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_actionPreDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			match(PRECONDITION);
			setState(511);
			formulaOrEmpty();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ActionObsDefContext extends ParserRuleContext {
		public TerminalNode OBSERVABILITY_CONDITIONS() { return getToken(EPDDLParser.OBSERVABILITY_CONDITIONS, 0); }
		public List<ObsConditionDefContext> obsConditionDef() {
			return getRuleContexts(ObsConditionDefContext.class);
		}
		public ObsConditionDefContext obsConditionDef(int i) {
			return getRuleContext(ObsConditionDefContext.class,i);
		}
		public ActionObsDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionObsDef; }
	}

	public final ActionObsDefContext actionObsDef() throws RecognitionException {
		ActionObsDefContext _localctx = new ActionObsDefContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_actionObsDef);
		int _la;
		try {
			setState(521);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OBSERVABILITY_CONDITIONS:
				enterOuterAlt(_localctx, 1);
				{
				setState(513);
				match(OBSERVABILITY_CONDITIONS);
				setState(517);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LPAREN) {
					{
					{
					setState(514);
					obsConditionDef();
					}
					}
					setState(519);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case RPAREN:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypedIdentListContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(EPDDLParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(EPDDLParser.NAME, i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(EPDDLParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(EPDDLParser.ASSIGN, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypedIdentListContext> typedIdentList() {
			return getRuleContexts(TypedIdentListContext.class);
		}
		public TypedIdentListContext typedIdentList(int i) {
			return getRuleContext(TypedIdentListContext.class,i);
		}
		public TypedIdentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedIdentList; }
	}

	public final TypedIdentListContext typedIdentList() throws RecognitionException {
		TypedIdentListContext _localctx = new TypedIdentListContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_typedIdentList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(523);
					match(NAME);
					setState(527);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NAME) {
						{
						{
						setState(524);
						match(NAME);
						}
						}
						setState(529);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(530);
					match(ASSIGN);
					setState(531);
					type();
					setState(532);
					typedIdentList();
					}
					} 
				}
				setState(538);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypedVariableListContext extends ParserRuleContext {
		public List<TerminalNode> VARIABLE() { return getTokens(EPDDLParser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(EPDDLParser.VARIABLE, i);
		}
		public TerminalNode DASH() { return getToken(EPDDLParser.DASH, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypedVariableListContext typedVariableList() {
			return getRuleContext(TypedVariableListContext.class,0);
		}
		public TypedVariableListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedVariableList; }
	}

	public final TypedVariableListContext typedVariableList() throws RecognitionException {
		TypedVariableListContext _localctx = new TypedVariableListContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_typedVariableList);
		int _la;
		try {
			setState(553);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(550);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VARIABLE) {
					{
					setState(539);
					match(VARIABLE);
					setState(543);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VARIABLE) {
						{
						{
						setState(540);
						match(VARIABLE);
						}
						}
						setState(545);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(546);
					match(DASH);
					setState(547);
					type();
					setState(548);
					typedVariableList();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public ReservedTypeContext reservedType() {
			return getRuleContext(ReservedTypeContext.class,0);
		}
		public TerminalNode NAME() { return getToken(EPDDLParser.NAME, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_type);
		try {
			setState(557);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PREDICATE:
			case PREDICATE_FORMULA:
			case FORMULA:
			case POSTCONDITION:
			case LITERAL:
			case AGENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(555);
				reservedType();
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(556);
				match(NAME);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReservedTypeContext extends ParserRuleContext {
		public TerminalNode AGENT() { return getToken(EPDDLParser.AGENT, 0); }
		public TerminalNode PREDICATE() { return getToken(EPDDLParser.PREDICATE, 0); }
		public TerminalNode LITERAL() { return getToken(EPDDLParser.LITERAL, 0); }
		public TerminalNode PREDICATE_FORMULA() { return getToken(EPDDLParser.PREDICATE_FORMULA, 0); }
		public TerminalNode FORMULA() { return getToken(EPDDLParser.FORMULA, 0); }
		public TerminalNode POSTCONDITION() { return getToken(EPDDLParser.POSTCONDITION, 0); }
		public ReservedTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reservedType; }
	}

	public final ReservedTypeContext reservedType() throws RecognitionException {
		ReservedTypeContext _localctx = new ReservedTypeContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_reservedType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			_la = _input.LA(1);
			if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 159L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FormulaContext extends ParserRuleContext {
		public List<TerminalNode> LPAREN() { return getTokens(EPDDLParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(EPDDLParser.LPAREN, i);
		}
		public TerminalNode IMPLY() { return getToken(EPDDLParser.IMPLY, 0); }
		public List<FormulaContext> formula() {
			return getRuleContexts(FormulaContext.class);
		}
		public FormulaContext formula(int i) {
			return getRuleContext(FormulaContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(EPDDLParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(EPDDLParser.RPAREN, i);
		}
		public TerminalNode OR() { return getToken(EPDDLParser.OR, 0); }
		public TerminalNode AND() { return getToken(EPDDLParser.AND, 0); }
		public TerminalNode NOT() { return getToken(EPDDLParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(EPDDLParser.EXISTS, 0); }
		public TypedVariableListContext typedVariableList() {
			return getRuleContext(TypedVariableListContext.class,0);
		}
		public TerminalNode FORALL() { return getToken(EPDDLParser.FORALL, 0); }
		public ModalityContext modality() {
			return getRuleContext(ModalityContext.class,0);
		}
		public PredicateFormulaContext predicateFormula() {
			return getRuleContext(PredicateFormulaContext.class,0);
		}
		public AtomicEqFormulaContext atomicEqFormula() {
			return getRuleContext(AtomicEqFormulaContext.class,0);
		}
		public TerminalNode TRUE() { return getToken(EPDDLParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(EPDDLParser.FALSE, 0); }
		public FormulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formula; }
	}

	public final FormulaContext formula() throws RecognitionException {
		FormulaContext _localctx = new FormulaContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_formula);
		int _la;
		try {
			setState(617);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(561);
				match(LPAREN);
				setState(562);
				match(IMPLY);
				setState(563);
				formula();
				setState(564);
				formula();
				setState(565);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(567);
				match(LPAREN);
				setState(568);
				match(OR);
				setState(569);
				formula();
				setState(573);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & 74088185859L) != 0)) {
					{
					{
					setState(570);
					formula();
					}
					}
					setState(575);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(576);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(578);
				match(LPAREN);
				setState(579);
				match(AND);
				setState(580);
				formula();
				setState(584);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & 74088185859L) != 0)) {
					{
					{
					setState(581);
					formula();
					}
					}
					setState(586);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(587);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(589);
				match(LPAREN);
				setState(590);
				match(NOT);
				setState(591);
				formula();
				setState(592);
				match(RPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(594);
				match(LPAREN);
				setState(595);
				match(EXISTS);
				setState(596);
				match(LPAREN);
				setState(597);
				typedVariableList();
				setState(598);
				match(RPAREN);
				setState(599);
				formula();
				setState(600);
				match(RPAREN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(602);
				match(LPAREN);
				setState(603);
				match(FORALL);
				setState(604);
				match(LPAREN);
				setState(605);
				typedVariableList();
				setState(606);
				match(RPAREN);
				setState(607);
				formula();
				setState(608);
				match(RPAREN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(610);
				modality();
				setState(611);
				formula();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(613);
				predicateFormula();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(614);
				atomicEqFormula();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(615);
				match(TRUE);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(616);
				match(FALSE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionFormulaContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(EPDDLParser.LPAREN, 0); }
		public TerminalNode AND() { return getToken(EPDDLParser.AND, 0); }
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(EPDDLParser.RPAREN, 0); }
		public ConditionFormulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionFormula; }
	}

	public final ConditionFormulaContext conditionFormula() throws RecognitionException {
		ConditionFormulaContext _localctx = new ConditionFormulaContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_conditionFormula);
		int _la;
		try {
			setState(631);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(619);
				match(LPAREN);
				setState(620);
				match(AND);
				setState(621);
				condition();
				setState(625);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LPAREN) {
					{
					{
					setState(622);
					condition();
					}
					}
					setState(627);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(628);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(630);
				condition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public AtomicConditionContext atomicCondition() {
			return getRuleContext(AtomicConditionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(EPDDLParser.LPAREN, 0); }
		public TerminalNode NOT() { return getToken(EPDDLParser.NOT, 0); }
		public TerminalNode RPAREN() { return getToken(EPDDLParser.RPAREN, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_condition);
		try {
			setState(639);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(633);
				atomicCondition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(634);
				match(LPAREN);
				setState(635);
				match(NOT);
				setState(636);
				atomicCondition();
				setState(637);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtomicConditionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(EPDDLParser.LPAREN, 0); }
		public PredicateNameContext predicateName() {
			return getRuleContext(PredicateNameContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(EPDDLParser.RPAREN, 0); }
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(EPDDLParser.ASSIGN, 0); }
		public AtomicConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomicCondition; }
	}

	public final AtomicConditionContext atomicCondition() throws RecognitionException {
		AtomicConditionContext _localctx = new AtomicConditionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_atomicCondition);
		int _la;
		try {
			setState(657);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(641);
				match(LPAREN);
				setState(642);
				predicateName();
				setState(646);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 11L) != 0)) {
					{
					{
					setState(643);
					term();
					}
					}
					setState(648);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(649);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(651);
				match(LPAREN);
				setState(652);
				match(ASSIGN);
				setState(653);
				term();
				setState(654);
				term();
				setState(655);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PredicateFormulaContext extends ParserRuleContext {
		public List<TerminalNode> LPAREN() { return getTokens(EPDDLParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(EPDDLParser.LPAREN, i);
		}
		public TerminalNode IMPLY() { return getToken(EPDDLParser.IMPLY, 0); }
		public List<PredicateFormulaContext> predicateFormula() {
			return getRuleContexts(PredicateFormulaContext.class);
		}
		public PredicateFormulaContext predicateFormula(int i) {
			return getRuleContext(PredicateFormulaContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(EPDDLParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(EPDDLParser.RPAREN, i);
		}
		public TerminalNode OR() { return getToken(EPDDLParser.OR, 0); }
		public TerminalNode AND() { return getToken(EPDDLParser.AND, 0); }
		public TerminalNode NOT() { return getToken(EPDDLParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(EPDDLParser.EXISTS, 0); }
		public TypedVariableListContext typedVariableList() {
			return getRuleContext(TypedVariableListContext.class,0);
		}
		public TerminalNode FORALL() { return getToken(EPDDLParser.FORALL, 0); }
		public PredicateNameContext predicateName() {
			return getRuleContext(PredicateNameContext.class,0);
		}
		public List<GroundTermContext> groundTerm() {
			return getRuleContexts(GroundTermContext.class);
		}
		public GroundTermContext groundTerm(int i) {
			return getRuleContext(GroundTermContext.class,i);
		}
		public PredicateFormulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicateFormula; }
	}

	public final PredicateFormulaContext predicateFormula() throws RecognitionException {
		PredicateFormulaContext _localctx = new PredicateFormulaContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_predicateFormula);
		int _la;
		try {
			setState(714);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(659);
				match(LPAREN);
				setState(660);
				match(IMPLY);
				setState(661);
				predicateFormula();
				setState(662);
				predicateFormula();
				setState(663);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(665);
				match(LPAREN);
				setState(666);
				match(OR);
				setState(668); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(667);
					predicateFormula();
					}
					}
					setState(670); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LPAREN );
				setState(672);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(674);
				match(LPAREN);
				setState(675);
				match(AND);
				setState(677); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(676);
					predicateFormula();
					}
					}
					setState(679); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LPAREN );
				setState(681);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(683);
				match(LPAREN);
				setState(684);
				match(NOT);
				setState(685);
				predicateFormula();
				setState(686);
				match(RPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(688);
				match(LPAREN);
				setState(689);
				match(EXISTS);
				setState(690);
				match(LPAREN);
				setState(691);
				typedVariableList();
				setState(692);
				match(RPAREN);
				setState(693);
				predicateFormula();
				setState(694);
				match(RPAREN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(696);
				match(LPAREN);
				setState(697);
				match(FORALL);
				setState(698);
				match(LPAREN);
				setState(699);
				typedVariableList();
				setState(700);
				match(RPAREN);
				setState(701);
				predicateFormula();
				setState(702);
				match(RPAREN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(704);
				match(LPAREN);
				setState(705);
				predicateName();
				setState(709);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NAME || _la==AGENT_NAME) {
					{
					{
					setState(706);
					groundTerm();
					}
					}
					setState(711);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(712);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtomicEqFormulaContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(EPDDLParser.LPAREN, 0); }
		public TerminalNode ASSIGN() { return getToken(EPDDLParser.ASSIGN, 0); }
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(EPDDLParser.RPAREN, 0); }
		public AtomicEqFormulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomicEqFormula; }
	}

	public final AtomicEqFormulaContext atomicEqFormula() throws RecognitionException {
		AtomicEqFormulaContext _localctx = new AtomicEqFormulaContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_atomicEqFormula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(716);
			match(LPAREN);
			setState(717);
			match(ASSIGN);
			setState(718);
			term();
			setState(719);
			term();
			setState(720);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public GroundTermContext groundTerm() {
			return getRuleContext(GroundTermContext.class,0);
		}
		public TerminalNode VARIABLE() { return getToken(EPDDLParser.VARIABLE, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_term);
		try {
			setState(724);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
			case AGENT_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(722);
				groundTerm();
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(723);
				match(VARIABLE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GroundTermContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(EPDDLParser.NAME, 0); }
		public AgentNameContext agentName() {
			return getRuleContext(AgentNameContext.class,0);
		}
		public GroundTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groundTerm; }
	}

	public final GroundTermContext groundTerm() throws RecognitionException {
		GroundTermContext _localctx = new GroundTermContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_groundTerm);
		try {
			setState(728);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(726);
				match(NAME);
				}
				break;
			case AGENT_NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(727);
				agentName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ModalityContext extends ParserRuleContext {
		public SingleModalityContext singleModality() {
			return getRuleContext(SingleModalityContext.class,0);
		}
		public GroupModalityContext groupModality() {
			return getRuleContext(GroupModalityContext.class,0);
		}
		public ModalityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modality; }
	}

	public final ModalityContext modality() throws RecognitionException {
		ModalityContext _localctx = new ModalityContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_modality);
		try {
			setState(732);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(730);
				singleModality();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(731);
				groupModality();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SingleModalityContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(EPDDLParser.LBRACKET, 0); }
		public ModalityLabelContext modalityLabel() {
			return getRuleContext(ModalityLabelContext.class,0);
		}
		public ModalityAgentContext modalityAgent() {
			return getRuleContext(ModalityAgentContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(EPDDLParser.RBRACKET, 0); }
		public TerminalNode LT() { return getToken(EPDDLParser.LT, 0); }
		public TerminalNode GT() { return getToken(EPDDLParser.GT, 0); }
		public SingleModalityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleModality; }
	}

	public final SingleModalityContext singleModality() throws RecognitionException {
		SingleModalityContext _localctx = new SingleModalityContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_singleModality);
		try {
			setState(744);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(734);
				match(LBRACKET);
				setState(735);
				modalityLabel();
				setState(736);
				modalityAgent();
				setState(737);
				match(RBRACKET);
				}
				break;
			case LT:
				enterOuterAlt(_localctx, 2);
				{
				setState(739);
				match(LT);
				setState(740);
				modalityLabel();
				setState(741);
				modalityAgent();
				setState(742);
				match(GT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GroupModalityContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(EPDDLParser.LBRACKET, 0); }
		public ModalityLabelContext modalityLabel() {
			return getRuleContext(ModalityLabelContext.class,0);
		}
		public ModalityAgentGroupContext modalityAgentGroup() {
			return getRuleContext(ModalityAgentGroupContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(EPDDLParser.RBRACKET, 0); }
		public TerminalNode LT() { return getToken(EPDDLParser.LT, 0); }
		public TerminalNode GT() { return getToken(EPDDLParser.GT, 0); }
		public GroupModalityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupModality; }
	}

	public final GroupModalityContext groupModality() throws RecognitionException {
		GroupModalityContext _localctx = new GroupModalityContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_groupModality);
		try {
			setState(756);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(746);
				match(LBRACKET);
				setState(747);
				modalityLabel();
				setState(748);
				modalityAgentGroup();
				setState(749);
				match(RBRACKET);
				}
				break;
			case LT:
				enterOuterAlt(_localctx, 2);
				{
				setState(751);
				match(LT);
				setState(752);
				modalityLabel();
				setState(753);
				modalityAgentGroup();
				setState(754);
				match(GT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ModalityLabelContext extends ParserRuleContext {
		public ModalityNameContext modalityName() {
			return getRuleContext(ModalityNameContext.class,0);
		}
		public ModalityLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modalityLabel; }
	}

	public final ModalityLabelContext modalityLabel() throws RecognitionException {
		ModalityLabelContext _localctx = new ModalityLabelContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_modalityLabel);
		try {
			setState(760);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MODALITY_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(758);
				modalityName();
				}
				break;
			case ALL:
			case AGENT_NAME:
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ModalityAgentContext extends ParserRuleContext {
		public AgentNameContext agentName() {
			return getRuleContext(AgentNameContext.class,0);
		}
		public TerminalNode VARIABLE() { return getToken(EPDDLParser.VARIABLE, 0); }
		public AllAgentsContext allAgents() {
			return getRuleContext(AllAgentsContext.class,0);
		}
		public ModalityAgentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modalityAgent; }
	}

	public final ModalityAgentContext modalityAgent() throws RecognitionException {
		ModalityAgentContext _localctx = new ModalityAgentContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_modalityAgent);
		try {
			setState(765);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AGENT_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(762);
				agentName();
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(763);
				match(VARIABLE);
				}
				break;
			case ALL:
				enterOuterAlt(_localctx, 3);
				{
				setState(764);
				allAgents();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ModalityAgentGroupContext extends ParserRuleContext {
		public List<ModalityAgentContext> modalityAgent() {
			return getRuleContexts(ModalityAgentContext.class);
		}
		public ModalityAgentContext modalityAgent(int i) {
			return getRuleContext(ModalityAgentContext.class,i);
		}
		public ModalityAgentGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modalityAgentGroup; }
	}

	public final ModalityAgentGroupContext modalityAgentGroup() throws RecognitionException {
		ModalityAgentGroupContext _localctx = new ModalityAgentGroupContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_modalityAgentGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767);
			modalityAgent();
			setState(771);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 161L) != 0)) {
				{
				{
				setState(768);
				modalityAgent();
				}
				}
				setState(773);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AllAgentsContext extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(EPDDLParser.ALL, 0); }
		public AllAgentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allAgents; }
	}

	public final AllAgentsContext allAgents() throws RecognitionException {
		AllAgentsContext _localctx = new AllAgentsContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_allAgents);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(774);
			match(ALL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PredicateNameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(EPDDLParser.NAME, 0); }
		public PredicateNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicateName; }
	}

	public final PredicateNameContext predicateName() throws RecognitionException {
		PredicateNameContext _localctx = new PredicateNameContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_predicateName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(776);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DomainNameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(EPDDLParser.NAME, 0); }
		public DomainNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_domainName; }
	}

	public final DomainNameContext domainName() throws RecognitionException {
		DomainNameContext _localctx = new DomainNameContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_domainName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(778);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProblemNameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(EPDDLParser.NAME, 0); }
		public ProblemNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_problemName; }
	}

	public final ProblemNameContext problemName() throws RecognitionException {
		ProblemNameContext _localctx = new ProblemNameContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_problemName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(780);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LibraryNameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(EPDDLParser.NAME, 0); }
		public LibraryNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_libraryName; }
	}

	public final LibraryNameContext libraryName() throws RecognitionException {
		LibraryNameContext _localctx = new LibraryNameContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_libraryName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(782);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StateNameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(EPDDLParser.NAME, 0); }
		public StateNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateName; }
	}

	public final StateNameContext stateName() throws RecognitionException {
		StateNameContext _localctx = new StateNameContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_stateName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(784);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WorldNameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(EPDDLParser.NAME, 0); }
		public WorldNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_worldName; }
	}

	public final WorldNameContext worldName() throws RecognitionException {
		WorldNameContext _localctx = new WorldNameContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_worldName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(786);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ActionNameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(EPDDLParser.NAME, 0); }
		public ActionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionName; }
	}

	public final ActionNameContext actionName() throws RecognitionException {
		ActionNameContext _localctx = new ActionNameContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_actionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(788);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EventNameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(EPDDLParser.NAME, 0); }
		public EventNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventName; }
	}

	public final EventNameContext eventName() throws RecognitionException {
		EventNameContext _localctx = new EventNameContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_eventName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(790);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AgentNameContext extends ParserRuleContext {
		public TerminalNode AGENT_NAME() { return getToken(EPDDLParser.AGENT_NAME, 0); }
		public AgentNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_agentName; }
	}

	public final AgentNameContext agentName() throws RecognitionException {
		AgentNameContext _localctx = new AgentNameContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_agentName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(792);
			match(AGENT_NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ModalityNameContext extends ParserRuleContext {
		public TerminalNode MODALITY_NAME() { return getToken(EPDDLParser.MODALITY_NAME, 0); }
		public ModalityNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modalityName; }
	}

	public final ModalityNameContext modalityName() throws RecognitionException {
		ModalityNameContext _localctx = new ModalityNameContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_modalityName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(794);
			match(MODALITY_NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StaticPredDefContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(EPDDLParser.LPAREN, 0); }
		public PredicateNameContext predicateName() {
			return getRuleContext(PredicateNameContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(EPDDLParser.RPAREN, 0); }
		public List<GenericNameContext> genericName() {
			return getRuleContexts(GenericNameContext.class);
		}
		public GenericNameContext genericName(int i) {
			return getRuleContext(GenericNameContext.class,i);
		}
		public StaticPredDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticPredDef; }
	}

	public final StaticPredDefContext staticPredDef() throws RecognitionException {
		StaticPredDefContext _localctx = new StaticPredDefContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_staticPredDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(796);
			match(LPAREN);
			setState(797);
			predicateName();
			setState(801);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAME || _la==AGENT_NAME) {
				{
				{
				setState(798);
				genericName();
				}
				}
				setState(803);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(804);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GenericNameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(EPDDLParser.NAME, 0); }
		public AgentNameContext agentName() {
			return getRuleContext(AgentNameContext.class,0);
		}
		public GenericNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericName; }
	}

	public final GenericNameContext genericName() throws RecognitionException {
		GenericNameContext _localctx = new GenericNameContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_genericName);
		try {
			setState(808);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(806);
				match(NAME);
				}
				break;
			case AGENT_NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(807);
				agentName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StateWorldsDefContext extends ParserRuleContext {
		public TerminalNode WORLDS() { return getToken(EPDDLParser.WORLDS, 0); }
		public TerminalNode LPAREN() { return getToken(EPDDLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(EPDDLParser.RPAREN, 0); }
		public List<WorldNameContext> worldName() {
			return getRuleContexts(WorldNameContext.class);
		}
		public WorldNameContext worldName(int i) {
			return getRuleContext(WorldNameContext.class,i);
		}
		public StateWorldsDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateWorldsDef; }
	}

	public final StateWorldsDefContext stateWorldsDef() throws RecognitionException {
		StateWorldsDefContext _localctx = new StateWorldsDefContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_stateWorldsDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(810);
			match(WORLDS);
			setState(811);
			match(LPAREN);
			setState(813); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(812);
				worldName();
				}
				}
				setState(815); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NAME );
			setState(817);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StateRelDefContext extends ParserRuleContext {
		public TerminalNode RELATIONS() { return getToken(EPDDLParser.RELATIONS, 0); }
		public StateRelationsContext stateRelations() {
			return getRuleContext(StateRelationsContext.class,0);
		}
		public StateRelDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateRelDef; }
	}

	public final StateRelDefContext stateRelDef() throws RecognitionException {
		StateRelDefContext _localctx = new StateRelDefContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_stateRelDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(819);
			match(RELATIONS);
			setState(820);
			stateRelations();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StateRelationsContext extends ParserRuleContext {
		public List<WorldRelationContext> worldRelation() {
			return getRuleContexts(WorldRelationContext.class);
		}
		public WorldRelationContext worldRelation(int i) {
			return getRuleContext(WorldRelationContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(EPDDLParser.LPAREN, 0); }
		public TerminalNode TRIVIAL_DEF() { return getToken(EPDDLParser.TRIVIAL_DEF, 0); }
		public TerminalNode RPAREN() { return getToken(EPDDLParser.RPAREN, 0); }
		public StateRelationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateRelations; }
	}

	public final StateRelationsContext stateRelations() throws RecognitionException {
		StateRelationsContext _localctx = new StateRelationsContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_stateRelations);
		int _la;
		try {
			setState(830);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(823); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(822);
					worldRelation();
					}
					}
					setState(825); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LPAREN );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(827);
				match(LPAREN);
				setState(828);
				match(TRIVIAL_DEF);
				setState(829);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WorldRelationContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(EPDDLParser.LPAREN, 0); }
		public AgentGroupContext agentGroup() {
			return getRuleContext(AgentGroupContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(EPDDLParser.RPAREN, 0); }
		public List<WorldNamePairContext> worldNamePair() {
			return getRuleContexts(WorldNamePairContext.class);
		}
		public WorldNamePairContext worldNamePair(int i) {
			return getRuleContext(WorldNamePairContext.class,i);
		}
		public WorldRelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_worldRelation; }
	}

	public final WorldRelationContext worldRelation() throws RecognitionException {
		WorldRelationContext _localctx = new WorldRelationContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_worldRelation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(832);
			match(LPAREN);
			setState(833);
			agentGroup();
			setState(835); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(834);
				worldNamePair();
				}
				}
				setState(837); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LPAREN );
			setState(839);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WorldNamePairContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(EPDDLParser.LPAREN, 0); }
		public List<WorldNameContext> worldName() {
			return getRuleContexts(WorldNameContext.class);
		}
		public WorldNameContext worldName(int i) {
			return getRuleContext(WorldNameContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(EPDDLParser.RPAREN, 0); }
		public WorldNamePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_worldNamePair; }
	}

	public final WorldNamePairContext worldNamePair() throws RecognitionException {
		WorldNamePairContext _localctx = new WorldNamePairContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_worldNamePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(841);
			match(LPAREN);
			setState(842);
			worldName();
			setState(843);
			worldName();
			setState(844);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StateValDefContext extends ParserRuleContext {
		public TerminalNode VALUATION() { return getToken(EPDDLParser.VALUATION, 0); }
		public StateValuationContext stateValuation() {
			return getRuleContext(StateValuationContext.class,0);
		}
		public StateValDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateValDef; }
	}

	public final StateValDefContext stateValDef() throws RecognitionException {
		StateValDefContext _localctx = new StateValDefContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_stateValDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(846);
			match(VALUATION);
			setState(847);
			stateValuation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StateValuationContext extends ParserRuleContext {
		public List<WorldValuationContext> worldValuation() {
			return getRuleContexts(WorldValuationContext.class);
		}
		public WorldValuationContext worldValuation(int i) {
			return getRuleContext(WorldValuationContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(EPDDLParser.LPAREN, 0); }
		public TerminalNode TRIVIAL_DEF() { return getToken(EPDDLParser.TRIVIAL_DEF, 0); }
		public TerminalNode RPAREN() { return getToken(EPDDLParser.RPAREN, 0); }
		public StateValuationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateValuation; }
	}

	public final StateValuationContext stateValuation() throws RecognitionException {
		StateValuationContext _localctx = new StateValuationContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_stateValuation);
		int _la;
		try {
			setState(857);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(850); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(849);
					worldValuation();
					}
					}
					setState(852); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LPAREN );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(854);
				match(LPAREN);
				setState(855);
				match(TRIVIAL_DEF);
				setState(856);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WorldValuationContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(EPDDLParser.LPAREN, 0); }
		public WorldNameContext worldName() {
			return getRuleContext(WorldNameContext.class,0);
		}
		public TerminalNode LBRACKET() { return getToken(EPDDLParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(EPDDLParser.RBRACKET, 0); }
		public TerminalNode RPAREN() { return getToken(EPDDLParser.RPAREN, 0); }
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public WorldValuationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_worldValuation; }
	}

	public final WorldValuationContext worldValuation() throws RecognitionException {
		WorldValuationContext _localctx = new WorldValuationContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_worldValuation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(859);
			match(LPAREN);
			setState(860);
			worldName();
			setState(861);
			match(LBRACKET);
			setState(865);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAREN) {
				{
				{
				setState(862);
				literal();
				}
				}
				setState(867);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(868);
			match(RBRACKET);
			setState(869);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StateDesignDefContext extends ParserRuleContext {
		public TerminalNode DESIGNATED() { return getToken(EPDDLParser.DESIGNATED, 0); }
		public TerminalNode LPAREN() { return getToken(EPDDLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(EPDDLParser.RPAREN, 0); }
		public List<WorldNameContext> worldName() {
			return getRuleContexts(WorldNameContext.class);
		}
		public WorldNameContext worldName(int i) {
			return getRuleContext(WorldNameContext.class,i);
		}
		public StateDesignDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateDesignDef; }
	}

	public final StateDesignDefContext stateDesignDef() throws RecognitionException {
		StateDesignDefContext _localctx = new StateDesignDefContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_stateDesignDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(871);
			match(DESIGNATED);
			setState(872);
			match(LPAREN);
			setState(874); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(873);
				worldName();
				}
				}
				setState(876); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NAME );
			setState(878);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AgentGroupContext extends ParserRuleContext {
		public AgentGroupNameContext agentGroupName() {
			return getRuleContext(AgentGroupNameContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(EPDDLParser.LBRACE, 0); }
		public List<AgentNameContext> agentName() {
			return getRuleContexts(AgentNameContext.class);
		}
		public AgentNameContext agentName(int i) {
			return getRuleContext(AgentNameContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(EPDDLParser.RBRACE, 0); }
		public AgentGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_agentGroup; }
	}

	public final AgentGroupContext agentGroup() throws RecognitionException {
		AgentGroupContext _localctx = new AgentGroupContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_agentGroup);
		int _la;
		try {
			setState(891);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL:
			case AGENT_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(880);
				agentGroupName();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(881);
				match(LBRACE);
				setState(882);
				agentName();
				setState(886);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AGENT_NAME) {
					{
					{
					setState(883);
					agentName();
					}
					}
					setState(888);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(889);
				match(RBRACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(EPDDLParser.LPAREN, 0); }
		public TerminalNode NOT() { return getToken(EPDDLParser.NOT, 0); }
		public TerminalNode RPAREN() { return getToken(EPDDLParser.RPAREN, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_literal);
		try {
			setState(899);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(893);
				predicate();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(894);
				match(LPAREN);
				setState(895);
				match(NOT);
				setState(896);
				predicate();
				setState(897);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InitialStateDescrContext extends ParserRuleContext {
		public List<FTheoryFormulaContext> fTheoryFormula() {
			return getRuleContexts(FTheoryFormulaContext.class);
		}
		public FTheoryFormulaContext fTheoryFormula(int i) {
			return getRuleContext(FTheoryFormulaContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(EPDDLParser.LPAREN, 0); }
		public TerminalNode STATE_NAME() { return getToken(EPDDLParser.STATE_NAME, 0); }
		public StateNameContext stateName() {
			return getRuleContext(StateNameContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(EPDDLParser.RPAREN, 0); }
		public InitialStateDescrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialStateDescr; }
	}

	public final InitialStateDescrContext initialStateDescr() throws RecognitionException {
		InitialStateDescrContext _localctx = new InitialStateDescrContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_initialStateDescr);
		int _la;
		try {
			setState(912);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(904);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LPAREN || _la==LBRACKET) {
					{
					{
					setState(901);
					fTheoryFormula();
					}
					}
					setState(906);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(907);
				match(LPAREN);
				setState(908);
				match(STATE_NAME);
				setState(909);
				stateName();
				setState(910);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FTheoryFormulaContext extends ParserRuleContext {
		public SimpleFTheoryFormulaContext simpleFTheoryFormula() {
			return getRuleContext(SimpleFTheoryFormulaContext.class,0);
		}
		public List<TerminalNode> LPAREN() { return getTokens(EPDDLParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(EPDDLParser.LPAREN, i);
		}
		public TerminalNode FORALL() { return getToken(EPDDLParser.FORALL, 0); }
		public TypedVariableListContext typedVariableList() {
			return getRuleContext(TypedVariableListContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(EPDDLParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(EPDDLParser.RPAREN, i);
		}
		public FTheoryFormulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fTheoryFormula; }
	}

	public final FTheoryFormulaContext fTheoryFormula() throws RecognitionException {
		FTheoryFormulaContext _localctx = new FTheoryFormulaContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_fTheoryFormula);
		try {
			setState(923);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(914);
				simpleFTheoryFormula();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(915);
				match(LPAREN);
				setState(916);
				match(FORALL);
				setState(917);
				match(LPAREN);
				setState(918);
				typedVariableList();
				setState(919);
				match(RPAREN);
				setState(920);
				simpleFTheoryFormula();
				setState(921);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleFTheoryFormulaContext extends ParserRuleContext {
		public PredicateFormulaContext predicateFormula() {
			return getRuleContext(PredicateFormulaContext.class,0);
		}
		public List<TerminalNode> LBRACKET() { return getTokens(EPDDLParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(EPDDLParser.LBRACKET, i);
		}
		public TerminalNode ALL() { return getToken(EPDDLParser.ALL, 0); }
		public List<TerminalNode> RBRACKET() { return getTokens(EPDDLParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(EPDDLParser.RBRACKET, i);
		}
		public AgentNameContext agentName() {
			return getRuleContext(AgentNameContext.class,0);
		}
		public KnowsWhetherContext knowsWhether() {
			return getRuleContext(KnowsWhetherContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(EPDDLParser.LPAREN, 0); }
		public TerminalNode NOT() { return getToken(EPDDLParser.NOT, 0); }
		public TerminalNode RPAREN() { return getToken(EPDDLParser.RPAREN, 0); }
		public SimpleFTheoryFormulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleFTheoryFormula; }
	}

	public final SimpleFTheoryFormulaContext simpleFTheoryFormula() throws RecognitionException {
		SimpleFTheoryFormulaContext _localctx = new SimpleFTheoryFormulaContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_simpleFTheoryFormula);
		try {
			setState(953);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(925);
				predicateFormula();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(926);
				match(LBRACKET);
				setState(927);
				match(ALL);
				setState(928);
				match(RBRACKET);
				setState(929);
				predicateFormula();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(930);
				match(LBRACKET);
				setState(931);
				match(ALL);
				setState(932);
				match(RBRACKET);
				setState(933);
				match(LBRACKET);
				setState(934);
				agentName();
				setState(935);
				match(RBRACKET);
				setState(936);
				predicateFormula();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(938);
				match(LBRACKET);
				setState(939);
				match(ALL);
				setState(940);
				match(RBRACKET);
				setState(941);
				knowsWhether();
				setState(942);
				predicateFormula();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(944);
				match(LBRACKET);
				setState(945);
				match(ALL);
				setState(946);
				match(RBRACKET);
				setState(947);
				match(LPAREN);
				setState(948);
				match(NOT);
				setState(949);
				knowsWhether();
				setState(950);
				predicateFormula();
				setState(951);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ActionTypeNameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(EPDDLParser.NAME, 0); }
		public ActionTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionTypeName; }
	}

	public final ActionTypeNameContext actionTypeName() throws RecognitionException {
		ActionTypeNameContext _localctx = new ActionTypeNameContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_actionTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(955);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(EPDDLParser.LPAREN, 0); }
		public TerminalNode VARIABLE() { return getToken(EPDDLParser.VARIABLE, 0); }
		public TerminalNode ASSIGN() { return getToken(EPDDLParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(EPDDLParser.RPAREN, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(957);
			match(LPAREN);
			setState(958);
			match(VARIABLE);
			setState(959);
			match(ASSIGN);
			setState(960);
			expression();
			setState(961);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public PostconditionBlockContext postconditionBlock() {
			return getRuleContext(PostconditionBlockContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_expression);
		try {
			setState(966);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(963);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(964);
				formula();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(965);
				postconditionBlock();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FormulaOrEmptyContext extends ParserRuleContext {
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public TerminalNode TRIVIAL_DEF() { return getToken(EPDDLParser.TRIVIAL_DEF, 0); }
		public FormulaOrEmptyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formulaOrEmpty; }
	}

	public final FormulaOrEmptyContext formulaOrEmpty() throws RecognitionException {
		FormulaOrEmptyContext _localctx = new FormulaOrEmptyContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_formulaOrEmpty);
		try {
			setState(970);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case LPAREN:
			case LBRACKET:
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(968);
				formula();
				}
				break;
			case TRIVIAL_DEF:
				enterOuterAlt(_localctx, 2);
				{
				setState(969);
				match(TRIVIAL_DEF);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObsConditionDefContext extends ParserRuleContext {
		public UniversalObsCondContext universalObsCond() {
			return getRuleContext(UniversalObsCondContext.class,0);
		}
		public ObsConditionContext obsCondition() {
			return getRuleContext(ObsConditionContext.class,0);
		}
		public ObsConditionDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obsConditionDef; }
	}

	public final ObsConditionDefContext obsConditionDef() throws RecognitionException {
		ObsConditionDefContext _localctx = new ObsConditionDefContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_obsConditionDef);
		try {
			setState(974);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(972);
				universalObsCond();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(973);
				obsCondition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UniversalObsCondContext extends ParserRuleContext {
		public List<TerminalNode> LPAREN() { return getTokens(EPDDLParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(EPDDLParser.LPAREN, i);
		}
		public TerminalNode FORALL() { return getToken(EPDDLParser.FORALL, 0); }
		public TerminalNode VARIABLE() { return getToken(EPDDLParser.VARIABLE, 0); }
		public TerminalNode DASH() { return getToken(EPDDLParser.DASH, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(EPDDLParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(EPDDLParser.RPAREN, i);
		}
		public List<ObsConditionContext> obsCondition() {
			return getRuleContexts(ObsConditionContext.class);
		}
		public ObsConditionContext obsCondition(int i) {
			return getRuleContext(ObsConditionContext.class,i);
		}
		public UniversalObsCondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_universalObsCond; }
	}

	public final UniversalObsCondContext universalObsCond() throws RecognitionException {
		UniversalObsCondContext _localctx = new UniversalObsCondContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_universalObsCond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(976);
			match(LPAREN);
			setState(977);
			match(FORALL);
			setState(978);
			match(LPAREN);
			setState(979);
			match(VARIABLE);
			setState(980);
			match(DASH);
			setState(981);
			type();
			setState(982);
			match(RPAREN);
			setState(984); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(983);
				obsCondition();
				}
				}
				setState(986); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LPAREN );
			setState(988);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObsConditionContext extends ParserRuleContext {
		public TrivialObsCondContext trivialObsCond() {
			return getRuleContext(TrivialObsCondContext.class,0);
		}
		public IfObsCondContext ifObsCond() {
			return getRuleContext(IfObsCondContext.class,0);
		}
		public OtherwiseObsCondContext otherwiseObsCond() {
			return getRuleContext(OtherwiseObsCondContext.class,0);
		}
		public ObsConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obsCondition; }
	}

	public final ObsConditionContext obsCondition() throws RecognitionException {
		ObsConditionContext _localctx = new ObsConditionContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_obsCondition);
		try {
			setState(993);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(990);
				trivialObsCond();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(991);
				ifObsCond();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(992);
				otherwiseObsCond();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TrivialObsCondContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(EPDDLParser.LPAREN, 0); }
		public ObservingAgentContext observingAgent() {
			return getRuleContext(ObservingAgentContext.class,0);
		}
		public ObservingAgentGroupContext observingAgentGroup() {
			return getRuleContext(ObservingAgentGroupContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(EPDDLParser.RPAREN, 0); }
		public TrivialObsCondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trivialObsCond; }
	}

	public final TrivialObsCondContext trivialObsCond() throws RecognitionException {
		TrivialObsCondContext _localctx = new TrivialObsCondContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_trivialObsCond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(995);
			match(LPAREN);
			setState(996);
			observingAgent();
			setState(997);
			observingAgentGroup();
			setState(998);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfObsCondContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(EPDDLParser.LPAREN, 0); }
		public TerminalNode IF() { return getToken(EPDDLParser.IF, 0); }
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public ObservingAgentContext observingAgent() {
			return getRuleContext(ObservingAgentContext.class,0);
		}
		public ObservingAgentGroupContext observingAgentGroup() {
			return getRuleContext(ObservingAgentGroupContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(EPDDLParser.RPAREN, 0); }
		public IfObsCondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifObsCond; }
	}

	public final IfObsCondContext ifObsCond() throws RecognitionException {
		IfObsCondContext _localctx = new IfObsCondContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_ifObsCond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1000);
			match(LPAREN);
			setState(1001);
			match(IF);
			setState(1002);
			formula();
			setState(1003);
			observingAgent();
			setState(1004);
			observingAgentGroup();
			setState(1005);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OtherwiseObsCondContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(EPDDLParser.LPAREN, 0); }
		public TerminalNode OTHERWISE() { return getToken(EPDDLParser.OTHERWISE, 0); }
		public ObservingAgentContext observingAgent() {
			return getRuleContext(ObservingAgentContext.class,0);
		}
		public ObservingAgentGroupContext observingAgentGroup() {
			return getRuleContext(ObservingAgentGroupContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(EPDDLParser.RPAREN, 0); }
		public OtherwiseObsCondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherwiseObsCond; }
	}

	public final OtherwiseObsCondContext otherwiseObsCond() throws RecognitionException {
		OtherwiseObsCondContext _localctx = new OtherwiseObsCondContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_otherwiseObsCond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1007);
			match(LPAREN);
			setState(1008);
			match(OTHERWISE);
			setState(1009);
			observingAgent();
			setState(1010);
			observingAgentGroup();
			setState(1011);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObservingAgentContext extends ParserRuleContext {
		public TerminalNode AGENT_NAME() { return getToken(EPDDLParser.AGENT_NAME, 0); }
		public TerminalNode VARIABLE() { return getToken(EPDDLParser.VARIABLE, 0); }
		public TerminalNode ALL() { return getToken(EPDDLParser.ALL, 0); }
		public ObservingAgentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_observingAgent; }
	}

	public final ObservingAgentContext observingAgent() throws RecognitionException {
		ObservingAgentContext _localctx = new ObservingAgentContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_observingAgent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1013);
			_la = _input.LA(1);
			if ( !(((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 161L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObservingAgentGroupContext extends ParserRuleContext {
		public List<ObservingAgentContext> observingAgent() {
			return getRuleContexts(ObservingAgentContext.class);
		}
		public ObservingAgentContext observingAgent(int i) {
			return getRuleContext(ObservingAgentContext.class,i);
		}
		public ObservingAgentGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_observingAgentGroup; }
	}

	public final ObservingAgentGroupContext observingAgentGroup() throws RecognitionException {
		ObservingAgentGroupContext _localctx = new ObservingAgentGroupContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_observingAgentGroup);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1015);
			observingAgent();
			setState(1019);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1016);
					observingAgent();
					}
					} 
				}
				setState(1021);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AgentGroupNameContext extends ParserRuleContext {
		public TerminalNode AGENT_NAME() { return getToken(EPDDLParser.AGENT_NAME, 0); }
		public TerminalNode ALL() { return getToken(EPDDLParser.ALL, 0); }
		public AgentGroupNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_agentGroupName; }
	}

	public final AgentGroupNameContext agentGroupName() throws RecognitionException {
		AgentGroupNameContext _localctx = new AgentGroupNameContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_agentGroupName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1022);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==AGENT_NAME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PredicateContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(EPDDLParser.LPAREN, 0); }
		public PredicateNameContext predicateName() {
			return getRuleContext(PredicateNameContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(EPDDLParser.RPAREN, 0); }
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_predicate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1024);
			match(LPAREN);
			setState(1025);
			predicateName();
			setState(1029);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 11L) != 0)) {
				{
				{
				setState(1026);
				term();
				}
				}
				setState(1031);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1032);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ActionTypeGroupsDefContext extends ParserRuleContext {
		public TerminalNode OBSERVABILITY_GROUPS() { return getToken(EPDDLParser.OBSERVABILITY_GROUPS, 0); }
		public TerminalNode LPAREN() { return getToken(EPDDLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(EPDDLParser.RPAREN, 0); }
		public List<ObservingAgentGroupContext> observingAgentGroup() {
			return getRuleContexts(ObservingAgentGroupContext.class);
		}
		public ObservingAgentGroupContext observingAgentGroup(int i) {
			return getRuleContext(ObservingAgentGroupContext.class,i);
		}
		public ActionTypeGroupsDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionTypeGroupsDef; }
	}

	public final ActionTypeGroupsDefContext actionTypeGroupsDef() throws RecognitionException {
		ActionTypeGroupsDefContext _localctx = new ActionTypeGroupsDefContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_actionTypeGroupsDef);
		int _la;
		try {
			setState(1044);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OBSERVABILITY_GROUPS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1034);
				match(OBSERVABILITY_GROUPS);
				setState(1035);
				match(LPAREN);
				setState(1039);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 161L) != 0)) {
					{
					{
					setState(1036);
					observingAgentGroup();
					}
					}
					setState(1041);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1042);
				match(RPAREN);
				}
				break;
			case EVENT:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ActionTypeEventsDefContext extends ParserRuleContext {
		public TerminalNode EVENT() { return getToken(EPDDLParser.EVENT, 0); }
		public List<EventSignatureContext> eventSignature() {
			return getRuleContexts(EventSignatureContext.class);
		}
		public EventSignatureContext eventSignature(int i) {
			return getRuleContext(EventSignatureContext.class,i);
		}
		public ActionTypeEventsDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionTypeEventsDef; }
	}

	public final ActionTypeEventsDefContext actionTypeEventsDef() throws RecognitionException {
		ActionTypeEventsDefContext _localctx = new ActionTypeEventsDefContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_actionTypeEventsDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1046);
			match(EVENT);
			setState(1048); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1047);
				eventSignature();
				}
				}
				setState(1050); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LPAREN );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EventSignatureContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(EPDDLParser.LPAREN, 0); }
		public EventNameContext eventName() {
			return getRuleContext(EventNameContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(EPDDLParser.RPAREN, 0); }
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public EventSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventSignature; }
	}

	public final EventSignatureContext eventSignature() throws RecognitionException {
		EventSignatureContext _localctx = new EventSignatureContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_eventSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1052);
			match(LPAREN);
			setState(1053);
			eventName();
			setState(1057);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAREN) {
				{
				{
				setState(1054);
				parameter();
				}
				}
				setState(1059);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1060);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ActionTypeRelDefContext extends ParserRuleContext {
		public TerminalNode RELATIONS() { return getToken(EPDDLParser.RELATIONS, 0); }
		public ActionRelationsContext actionRelations() {
			return getRuleContext(ActionRelationsContext.class,0);
		}
		public ActionTypeRelDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionTypeRelDef; }
	}

	public final ActionTypeRelDefContext actionTypeRelDef() throws RecognitionException {
		ActionTypeRelDefContext _localctx = new ActionTypeRelDefContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_actionTypeRelDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1062);
			match(RELATIONS);
			setState(1063);
			actionRelations();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ActionRelationsContext extends ParserRuleContext {
		public List<EventRelationContext> eventRelation() {
			return getRuleContexts(EventRelationContext.class);
		}
		public EventRelationContext eventRelation(int i) {
			return getRuleContext(EventRelationContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(EPDDLParser.LPAREN, 0); }
		public TerminalNode TRIVIAL_DEF() { return getToken(EPDDLParser.TRIVIAL_DEF, 0); }
		public TerminalNode RPAREN() { return getToken(EPDDLParser.RPAREN, 0); }
		public ActionRelationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionRelations; }
	}

	public final ActionRelationsContext actionRelations() throws RecognitionException {
		ActionRelationsContext _localctx = new ActionRelationsContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_actionRelations);
		int _la;
		try {
			setState(1073);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1066); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1065);
					eventRelation();
					}
					}
					setState(1068); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LPAREN );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1070);
				match(LPAREN);
				setState(1071);
				match(TRIVIAL_DEF);
				setState(1072);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EventRelationContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(EPDDLParser.LPAREN, 0); }
		public AgentGroupContext agentGroup() {
			return getRuleContext(AgentGroupContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(EPDDLParser.RPAREN, 0); }
		public List<EventNamePairContext> eventNamePair() {
			return getRuleContexts(EventNamePairContext.class);
		}
		public EventNamePairContext eventNamePair(int i) {
			return getRuleContext(EventNamePairContext.class,i);
		}
		public EventRelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventRelation; }
	}

	public final EventRelationContext eventRelation() throws RecognitionException {
		EventRelationContext _localctx = new EventRelationContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_eventRelation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1075);
			match(LPAREN);
			setState(1076);
			agentGroup();
			setState(1078); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1077);
				eventNamePair();
				}
				}
				setState(1080); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LPAREN );
			setState(1082);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EventNamePairContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(EPDDLParser.LPAREN, 0); }
		public List<EventNameContext> eventName() {
			return getRuleContexts(EventNameContext.class);
		}
		public EventNameContext eventName(int i) {
			return getRuleContext(EventNameContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(EPDDLParser.RPAREN, 0); }
		public EventNamePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventNamePair; }
	}

	public final EventNamePairContext eventNamePair() throws RecognitionException {
		EventNamePairContext _localctx = new EventNamePairContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_eventNamePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1084);
			match(LPAREN);
			setState(1085);
			eventName();
			setState(1086);
			eventName();
			setState(1087);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ActionTypeDesignDefContext extends ParserRuleContext {
		public TerminalNode DESIGNATED() { return getToken(EPDDLParser.DESIGNATED, 0); }
		public TerminalNode LPAREN() { return getToken(EPDDLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(EPDDLParser.RPAREN, 0); }
		public List<EventNameContext> eventName() {
			return getRuleContexts(EventNameContext.class);
		}
		public EventNameContext eventName(int i) {
			return getRuleContext(EventNameContext.class,i);
		}
		public ActionTypeDesignDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionTypeDesignDef; }
	}

	public final ActionTypeDesignDefContext actionTypeDesignDef() throws RecognitionException {
		ActionTypeDesignDefContext _localctx = new ActionTypeDesignDefContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_actionTypeDesignDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1089);
			match(DESIGNATED);
			setState(1090);
			match(LPAREN);
			setState(1094);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAME) {
				{
				{
				setState(1091);
				eventName();
				}
				}
				setState(1096);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1097);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypedAgentListContext extends ParserRuleContext {
		public List<TerminalNode> AGENT_NAME() { return getTokens(EPDDLParser.AGENT_NAME); }
		public TerminalNode AGENT_NAME(int i) {
			return getToken(EPDDLParser.AGENT_NAME, i);
		}
		public TerminalNode DASH() { return getToken(EPDDLParser.DASH, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypedAgentListContext typedAgentList() {
			return getRuleContext(TypedAgentListContext.class,0);
		}
		public TypedAgentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedAgentList; }
	}

	public final TypedAgentListContext typedAgentList() throws RecognitionException {
		TypedAgentListContext _localctx = new TypedAgentListContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_typedAgentList);
		int _la;
		try {
			setState(1116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AGENT_NAME) {
					{
					{
					setState(1099);
					match(AGENT_NAME);
					}
					}
					setState(1104);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1105);
				match(AGENT_NAME);
				setState(1109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AGENT_NAME) {
					{
					{
					setState(1106);
					match(AGENT_NAME);
					}
					}
					setState(1111);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1112);
				match(DASH);
				setState(1113);
				type();
				setState(1114);
				typedAgentList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class KnowsWhetherContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(EPDDLParser.LBRACKET, 0); }
		public TerminalNode MODALITY_NAME() { return getToken(EPDDLParser.MODALITY_NAME, 0); }
		public AgentNameContext agentName() {
			return getRuleContext(AgentNameContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(EPDDLParser.RBRACKET, 0); }
		public KnowsWhetherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_knowsWhether; }
	}

	public final KnowsWhetherContext knowsWhether() throws RecognitionException {
		KnowsWhetherContext _localctx = new KnowsWhetherContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_knowsWhether);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1118);
			match(LBRACKET);
			setState(1119);
			match(MODALITY_NAME);
			setState(1120);
			agentName();
			setState(1121);
			match(RBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RequirementKeyContext extends ParserRuleContext {
		public TerminalNode DEL() { return getToken(EPDDLParser.DEL, 0); }
		public TerminalNode TYPING() { return getToken(EPDDLParser.TYPING, 0); }
		public TerminalNode EQUALITY() { return getToken(EPDDLParser.EQUALITY, 0); }
		public TerminalNode MULTI_AGENT() { return getToken(EPDDLParser.MULTI_AGENT, 0); }
		public TerminalNode ONTIC_ACTIONS() { return getToken(EPDDLParser.ONTIC_ACTIONS, 0); }
		public TerminalNode EXISTENTIAL_FORMULAE() { return getToken(EPDDLParser.EXISTENTIAL_FORMULAE, 0); }
		public TerminalNode UNIVERSAL_FORMULAE() { return getToken(EPDDLParser.UNIVERSAL_FORMULAE, 0); }
		public TerminalNode UNIVERSAL_POSTCONDITIONS() { return getToken(EPDDLParser.UNIVERSAL_POSTCONDITIONS, 0); }
		public TerminalNode MODAL_PRECONDITIONS() { return getToken(EPDDLParser.MODAL_PRECONDITIONS, 0); }
		public TerminalNode MODAL_POSTCONDITIONS() { return getToken(EPDDLParser.MODAL_POSTCONDITIONS, 0); }
		public TerminalNode MODALITIES() { return getToken(EPDDLParser.MODALITIES, 0); }
		public TerminalNode ONTIC_CHANGE() { return getToken(EPDDLParser.ONTIC_CHANGE, 0); }
		public TerminalNode COMMON_KNOWLEDGE() { return getToken(EPDDLParser.COMMON_KNOWLEDGE, 0); }
		public TerminalNode DYNAMIC_COMMON_KNOWLEDGE() { return getToken(EPDDLParser.DYNAMIC_COMMON_KNOWLEDGE, 0); }
		public TerminalNode FINITARY_S5_THEORY() { return getToken(EPDDLParser.FINITARY_S5_THEORY, 0); }
		public TerminalNode LPAREN() { return getToken(EPDDLParser.LPAREN, 0); }
		public TerminalNode MAX_PRECONDITIONS_DEPTH() { return getToken(EPDDLParser.MAX_PRECONDITIONS_DEPTH, 0); }
		public TerminalNode INT() { return getToken(EPDDLParser.INT, 0); }
		public TerminalNode RPAREN() { return getToken(EPDDLParser.RPAREN, 0); }
		public TerminalNode MAX_POSTCONDITIONS_DEPTH() { return getToken(EPDDLParser.MAX_POSTCONDITIONS_DEPTH, 0); }
		public TerminalNode MAX_MODAL_DEPTH() { return getToken(EPDDLParser.MAX_MODAL_DEPTH, 0); }
		public TerminalNode FINITARY_THEORY() { return getToken(EPDDLParser.FINITARY_THEORY, 0); }
		public RequirementKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requirementKey; }
	}

	public final RequirementKeyContext requirementKey() throws RecognitionException {
		RequirementKeyContext _localctx = new RequirementKeyContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_requirementKey);
		try {
			setState(1151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1123);
				match(DEL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1124);
				match(TYPING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1125);
				match(EQUALITY);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1126);
				match(MULTI_AGENT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1127);
				match(ONTIC_ACTIONS);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1128);
				match(EXISTENTIAL_FORMULAE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1129);
				match(UNIVERSAL_FORMULAE);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1130);
				match(UNIVERSAL_POSTCONDITIONS);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1131);
				match(MODAL_PRECONDITIONS);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1132);
				match(MODAL_POSTCONDITIONS);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1133);
				match(MODALITIES);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1134);
				match(ONTIC_CHANGE);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1135);
				match(COMMON_KNOWLEDGE);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1136);
				match(DYNAMIC_COMMON_KNOWLEDGE);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1137);
				match(FINITARY_S5_THEORY);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1138);
				match(LPAREN);
				setState(1139);
				match(MAX_PRECONDITIONS_DEPTH);
				setState(1140);
				match(INT);
				setState(1141);
				match(RPAREN);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1142);
				match(LPAREN);
				setState(1143);
				match(MAX_POSTCONDITIONS_DEPTH);
				setState(1144);
				match(INT);
				setState(1145);
				match(RPAREN);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1146);
				match(LPAREN);
				setState(1147);
				match(MAX_MODAL_DEPTH);
				setState(1148);
				match(INT);
				setState(1149);
				match(RPAREN);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1150);
				match(FINITARY_THEORY);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001[\u0482\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007J\u0002"+
		"K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007O\u0002"+
		"P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007T\u0002"+
		"U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007Y\u0002"+
		"Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007^\u0002"+
		"_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007c\u0002"+
		"d\u0007d\u0002e\u0007e\u0002f\u0007f\u0002g\u0007g\u0002h\u0007h\u0002"+
		"i\u0007i\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u00d8\b\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u0001\u00e1\b\u0001\n\u0001\f\u0001\u00e4\t\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u00ef\b\u0002\n\u0002\f\u0002"+
		"\u00f2\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u00fd\b\u0003"+
		"\n\u0003\f\u0003\u0100\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u010a"+
		"\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u0111\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u011d\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0004\u0007\u0122"+
		"\b\u0007\u000b\u0007\f\u0007\u0123\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0004\n\u0135\b\n\u000b\n\f\n\u0136\u0001\n\u0001\n"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0005\u000b\u0141\b\u000b\n\u000b\f\u000b\u0144\t\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0004\r\u0151\b\r\u000b\r\f\r\u0152\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0005\u000e\u015a\b\u000e\n\u000e\f\u000e\u015d"+
		"\t\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0004\u0010\u0169"+
		"\b\u0010\u000b\u0010\f\u0010\u016a\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u0186\b\u0014"+
		"\n\u0014\f\u0014\u0189\t\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0005\u0015\u0190\b\u0015\n\u0015\f\u0015\u0193\t\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u01a5\b\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u01aa\b\u0019\n\u0019"+
		"\f\u0019\u01ad\t\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u01bd\b\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b"+
		"\u01d0\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001 \u0001 \u0001 \u0003 \u01f2\b \u0001!\u0001!\u0001!\u0001!\u0005"+
		"!\u01f8\b!\n!\f!\u01fb\t!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001"+
		"#\u0001#\u0005#\u0204\b#\n#\f#\u0207\t#\u0001#\u0003#\u020a\b#\u0001$"+
		"\u0001$\u0005$\u020e\b$\n$\f$\u0211\t$\u0001$\u0001$\u0001$\u0001$\u0005"+
		"$\u0217\b$\n$\f$\u021a\t$\u0001%\u0001%\u0005%\u021e\b%\n%\f%\u0221\t"+
		"%\u0001%\u0001%\u0001%\u0001%\u0003%\u0227\b%\u0001%\u0003%\u022a\b%\u0001"+
		"&\u0001&\u0003&\u022e\b&\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0005(\u023c\b(\n(\f(\u023f\t(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0005(\u0247\b(\n(\f(\u024a\t(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0003"+
		"(\u026a\b(\u0001)\u0001)\u0001)\u0001)\u0005)\u0270\b)\n)\f)\u0273\t)"+
		"\u0001)\u0001)\u0001)\u0003)\u0278\b)\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0003*\u0280\b*\u0001+\u0001+\u0001+\u0005+\u0285\b+\n+\f+\u0288"+
		"\t+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0003+\u0292"+
		"\b+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0004"+
		",\u029d\b,\u000b,\f,\u029e\u0001,\u0001,\u0001,\u0001,\u0001,\u0004,\u02a6"+
		"\b,\u000b,\f,\u02a7\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0005,\u02c4"+
		"\b,\n,\f,\u02c7\t,\u0001,\u0001,\u0003,\u02cb\b,\u0001-\u0001-\u0001-"+
		"\u0001-\u0001-\u0001-\u0001.\u0001.\u0003.\u02d5\b.\u0001/\u0001/\u0003"+
		"/\u02d9\b/\u00010\u00010\u00030\u02dd\b0\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u00011\u00011\u00011\u00011\u00031\u02e9\b1\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00032\u02f5\b2\u0001"+
		"3\u00013\u00033\u02f9\b3\u00014\u00014\u00014\u00034\u02fe\b4\u00015\u0001"+
		"5\u00055\u0302\b5\n5\f5\u0305\t5\u00016\u00016\u00017\u00017\u00018\u0001"+
		"8\u00019\u00019\u0001:\u0001:\u0001;\u0001;\u0001<\u0001<\u0001=\u0001"+
		"=\u0001>\u0001>\u0001?\u0001?\u0001@\u0001@\u0001A\u0001A\u0001A\u0005"+
		"A\u0320\bA\nA\fA\u0323\tA\u0001A\u0001A\u0001B\u0001B\u0003B\u0329\bB"+
		"\u0001C\u0001C\u0001C\u0004C\u032e\bC\u000bC\fC\u032f\u0001C\u0001C\u0001"+
		"D\u0001D\u0001D\u0001E\u0004E\u0338\bE\u000bE\fE\u0339\u0001E\u0001E\u0001"+
		"E\u0003E\u033f\bE\u0001F\u0001F\u0001F\u0004F\u0344\bF\u000bF\fF\u0345"+
		"\u0001F\u0001F\u0001G\u0001G\u0001G\u0001G\u0001G\u0001H\u0001H\u0001"+
		"H\u0001I\u0004I\u0353\bI\u000bI\fI\u0354\u0001I\u0001I\u0001I\u0003I\u035a"+
		"\bI\u0001J\u0001J\u0001J\u0001J\u0005J\u0360\bJ\nJ\fJ\u0363\tJ\u0001J"+
		"\u0001J\u0001J\u0001K\u0001K\u0001K\u0004K\u036b\bK\u000bK\fK\u036c\u0001"+
		"K\u0001K\u0001L\u0001L\u0001L\u0001L\u0005L\u0375\bL\nL\fL\u0378\tL\u0001"+
		"L\u0001L\u0003L\u037c\bL\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0003"+
		"M\u0384\bM\u0001N\u0005N\u0387\bN\nN\fN\u038a\tN\u0001N\u0001N\u0001N"+
		"\u0001N\u0001N\u0003N\u0391\bN\u0001O\u0001O\u0001O\u0001O\u0001O\u0001"+
		"O\u0001O\u0001O\u0001O\u0003O\u039c\bO\u0001P\u0001P\u0001P\u0001P\u0001"+
		"P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001"+
		"P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001"+
		"P\u0001P\u0001P\u0001P\u0003P\u03ba\bP\u0001Q\u0001Q\u0001R\u0001R\u0001"+
		"R\u0001R\u0001R\u0001R\u0001S\u0001S\u0001S\u0003S\u03c7\bS\u0001T\u0001"+
		"T\u0003T\u03cb\bT\u0001U\u0001U\u0003U\u03cf\bU\u0001V\u0001V\u0001V\u0001"+
		"V\u0001V\u0001V\u0001V\u0001V\u0004V\u03d9\bV\u000bV\fV\u03da\u0001V\u0001"+
		"V\u0001W\u0001W\u0001W\u0003W\u03e2\bW\u0001X\u0001X\u0001X\u0001X\u0001"+
		"X\u0001Y\u0001Y\u0001Y\u0001Y\u0001Y\u0001Y\u0001Y\u0001Z\u0001Z\u0001"+
		"Z\u0001Z\u0001Z\u0001Z\u0001[\u0001[\u0001\\\u0001\\\u0005\\\u03fa\b\\"+
		"\n\\\f\\\u03fd\t\\\u0001]\u0001]\u0001^\u0001^\u0001^\u0005^\u0404\b^"+
		"\n^\f^\u0407\t^\u0001^\u0001^\u0001_\u0001_\u0001_\u0005_\u040e\b_\n_"+
		"\f_\u0411\t_\u0001_\u0001_\u0003_\u0415\b_\u0001`\u0001`\u0004`\u0419"+
		"\b`\u000b`\f`\u041a\u0001a\u0001a\u0001a\u0005a\u0420\ba\na\fa\u0423\t"+
		"a\u0001a\u0001a\u0001b\u0001b\u0001b\u0001c\u0004c\u042b\bc\u000bc\fc"+
		"\u042c\u0001c\u0001c\u0001c\u0003c\u0432\bc\u0001d\u0001d\u0001d\u0004"+
		"d\u0437\bd\u000bd\fd\u0438\u0001d\u0001d\u0001e\u0001e\u0001e\u0001e\u0001"+
		"e\u0001f\u0001f\u0001f\u0005f\u0445\bf\nf\ff\u0448\tf\u0001f\u0001f\u0001"+
		"g\u0005g\u044d\bg\ng\fg\u0450\tg\u0001g\u0001g\u0005g\u0454\bg\ng\fg\u0457"+
		"\tg\u0001g\u0001g\u0001g\u0001g\u0003g\u045d\bg\u0001h\u0001h\u0001h\u0001"+
		"h\u0001h\u0001i\u0001i\u0001i\u0001i\u0001i\u0001i\u0001i\u0001i\u0001"+
		"i\u0001i\u0001i\u0001i\u0001i\u0001i\u0001i\u0001i\u0001i\u0001i\u0001"+
		"i\u0001i\u0001i\u0001i\u0001i\u0001i\u0001i\u0001i\u0001i\u0001i\u0003"+
		"i\u0480\bi\u0001i\u0000\u0000j\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPR"+
		"TVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6"+
		"\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be"+
		"\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u0000\u0003"+
		"\u0002\u0000CGJJ\u0003\u0000HHMMOO\u0002\u0000HHMM\u04a3\u0000\u00d7\u0001"+
		"\u0000\u0000\u0000\u0002\u00d9\u0001\u0000\u0000\u0000\u0004\u00e7\u0001"+
		"\u0000\u0000\u0000\u0006\u00f5\u0001\u0000\u0000\u0000\b\u0109\u0001\u0000"+
		"\u0000\u0000\n\u0110\u0001\u0000\u0000\u0000\f\u011c\u0001\u0000\u0000"+
		"\u0000\u000e\u011e\u0001\u0000\u0000\u0000\u0010\u0127\u0001\u0000\u0000"+
		"\u0000\u0012\u012c\u0001\u0000\u0000\u0000\u0014\u0131\u0001\u0000\u0000"+
		"\u0000\u0016\u013a\u0001\u0000\u0000\u0000\u0018\u0148\u0001\u0000\u0000"+
		"\u0000\u001a\u014d\u0001\u0000\u0000\u0000\u001c\u0156\u0001\u0000\u0000"+
		"\u0000\u001e\u0160\u0001\u0000\u0000\u0000 \u0165\u0001\u0000\u0000\u0000"+
		"\"\u016e\u0001\u0000\u0000\u0000$\u0173\u0001\u0000\u0000\u0000&\u017d"+
		"\u0001\u0000\u0000\u0000(\u0182\u0001\u0000\u0000\u0000*\u018c\u0001\u0000"+
		"\u0000\u0000,\u0196\u0001\u0000\u0000\u0000.\u019e\u0001\u0000\u0000\u0000"+
		"0\u01a4\u0001\u0000\u0000\u00002\u01a6\u0001\u0000\u0000\u00004\u01bc"+
		"\u0001\u0000\u0000\u00006\u01cf\u0001\u0000\u0000\u00008\u01d1\u0001\u0000"+
		"\u0000\u0000:\u01db\u0001\u0000\u0000\u0000<\u01e4\u0001\u0000\u0000\u0000"+
		">\u01e9\u0001\u0000\u0000\u0000@\u01f1\u0001\u0000\u0000\u0000B\u01f3"+
		"\u0001\u0000\u0000\u0000D\u01fe\u0001\u0000\u0000\u0000F\u0209\u0001\u0000"+
		"\u0000\u0000H\u0218\u0001\u0000\u0000\u0000J\u0229\u0001\u0000\u0000\u0000"+
		"L\u022d\u0001\u0000\u0000\u0000N\u022f\u0001\u0000\u0000\u0000P\u0269"+
		"\u0001\u0000\u0000\u0000R\u0277\u0001\u0000\u0000\u0000T\u027f\u0001\u0000"+
		"\u0000\u0000V\u0291\u0001\u0000\u0000\u0000X\u02ca\u0001\u0000\u0000\u0000"+
		"Z\u02cc\u0001\u0000\u0000\u0000\\\u02d4\u0001\u0000\u0000\u0000^\u02d8"+
		"\u0001\u0000\u0000\u0000`\u02dc\u0001\u0000\u0000\u0000b\u02e8\u0001\u0000"+
		"\u0000\u0000d\u02f4\u0001\u0000\u0000\u0000f\u02f8\u0001\u0000\u0000\u0000"+
		"h\u02fd\u0001\u0000\u0000\u0000j\u02ff\u0001\u0000\u0000\u0000l\u0306"+
		"\u0001\u0000\u0000\u0000n\u0308\u0001\u0000\u0000\u0000p\u030a\u0001\u0000"+
		"\u0000\u0000r\u030c\u0001\u0000\u0000\u0000t\u030e\u0001\u0000\u0000\u0000"+
		"v\u0310\u0001\u0000\u0000\u0000x\u0312\u0001\u0000\u0000\u0000z\u0314"+
		"\u0001\u0000\u0000\u0000|\u0316\u0001\u0000\u0000\u0000~\u0318\u0001\u0000"+
		"\u0000\u0000\u0080\u031a\u0001\u0000\u0000\u0000\u0082\u031c\u0001\u0000"+
		"\u0000\u0000\u0084\u0328\u0001\u0000\u0000\u0000\u0086\u032a\u0001\u0000"+
		"\u0000\u0000\u0088\u0333\u0001\u0000\u0000\u0000\u008a\u033e\u0001\u0000"+
		"\u0000\u0000\u008c\u0340\u0001\u0000\u0000\u0000\u008e\u0349\u0001\u0000"+
		"\u0000\u0000\u0090\u034e\u0001\u0000\u0000\u0000\u0092\u0359\u0001\u0000"+
		"\u0000\u0000\u0094\u035b\u0001\u0000\u0000\u0000\u0096\u0367\u0001\u0000"+
		"\u0000\u0000\u0098\u037b\u0001\u0000\u0000\u0000\u009a\u0383\u0001\u0000"+
		"\u0000\u0000\u009c\u0390\u0001\u0000\u0000\u0000\u009e\u039b\u0001\u0000"+
		"\u0000\u0000\u00a0\u03b9\u0001\u0000\u0000\u0000\u00a2\u03bb\u0001\u0000"+
		"\u0000\u0000\u00a4\u03bd\u0001\u0000\u0000\u0000\u00a6\u03c6\u0001\u0000"+
		"\u0000\u0000\u00a8\u03ca\u0001\u0000\u0000\u0000\u00aa\u03ce\u0001\u0000"+
		"\u0000\u0000\u00ac\u03d0\u0001\u0000\u0000\u0000\u00ae\u03e1\u0001\u0000"+
		"\u0000\u0000\u00b0\u03e3\u0001\u0000\u0000\u0000\u00b2\u03e8\u0001\u0000"+
		"\u0000\u0000\u00b4\u03ef\u0001\u0000\u0000\u0000\u00b6\u03f5\u0001\u0000"+
		"\u0000\u0000\u00b8\u03f7\u0001\u0000\u0000\u0000\u00ba\u03fe\u0001\u0000"+
		"\u0000\u0000\u00bc\u0400\u0001\u0000\u0000\u0000\u00be\u0414\u0001\u0000"+
		"\u0000\u0000\u00c0\u0416\u0001\u0000\u0000\u0000\u00c2\u041c\u0001\u0000"+
		"\u0000\u0000\u00c4\u0426\u0001\u0000\u0000\u0000\u00c6\u0431\u0001\u0000"+
		"\u0000\u0000\u00c8\u0433\u0001\u0000\u0000\u0000\u00ca\u043c\u0001\u0000"+
		"\u0000\u0000\u00cc\u0441\u0001\u0000\u0000\u0000\u00ce\u045c\u0001\u0000"+
		"\u0000\u0000\u00d0\u045e\u0001\u0000\u0000\u0000\u00d2\u047f\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d8\u0003\u0002\u0001\u0000\u00d5\u00d8\u0003\u0004"+
		"\u0002\u0000\u00d6\u00d8\u0003\u0006\u0003\u0000\u00d7\u00d4\u0001\u0000"+
		"\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d7\u00d6\u0001\u0000"+
		"\u0000\u0000\u00d8\u0001\u0001\u0000\u0000\u0000\u00d9\u00da\u0005T\u0000"+
		"\u0000\u00da\u00db\u0005?\u0000\u0000\u00db\u00dc\u0005T\u0000\u0000\u00dc"+
		"\u00dd\u0005@\u0000\u0000\u00dd\u00de\u0003p8\u0000\u00de\u00e2\u0005"+
		"U\u0000\u0000\u00df\u00e1\u0003\b\u0004\u0000\u00e0\u00df\u0001\u0000"+
		"\u0000\u0000\u00e1\u00e4\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3\u00e5\u0001\u0000"+
		"\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e5\u00e6\u0005U\u0000"+
		"\u0000\u00e6\u0003\u0001\u0000\u0000\u0000\u00e7\u00e8\u0005T\u0000\u0000"+
		"\u00e8\u00e9\u0005?\u0000\u0000\u00e9\u00ea\u0005T\u0000\u0000\u00ea\u00eb"+
		"\u0005A\u0000\u0000\u00eb\u00ec\u0003t:\u0000\u00ec\u00f0\u0005U\u0000"+
		"\u0000\u00ed\u00ef\u0003\n\u0005\u0000\u00ee\u00ed\u0001\u0000\u0000\u0000"+
		"\u00ef\u00f2\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000"+
		"\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1\u00f3\u0001\u0000\u0000\u0000"+
		"\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f3\u00f4\u0005U\u0000\u0000\u00f4"+
		"\u0005\u0001\u0000\u0000\u0000\u00f5\u00f6\u0005T\u0000\u0000\u00f6\u00f7"+
		"\u0005?\u0000\u0000\u00f7\u00f8\u0005T\u0000\u0000\u00f8\u00f9\u0005B"+
		"\u0000\u0000\u00f9\u00fa\u0003r9\u0000\u00fa\u00fe\u0005U\u0000\u0000"+
		"\u00fb\u00fd\u0003\f\u0006\u0000\u00fc\u00fb\u0001\u0000\u0000\u0000\u00fd"+
		"\u0100\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00fe"+
		"\u00ff\u0001\u0000\u0000\u0000\u00ff\u0101\u0001\u0000\u0000\u0000\u0100"+
		"\u00fe\u0001\u0000\u0000\u0000\u0101\u0102\u0005U\u0000\u0000\u0102\u0007"+
		"\u0001\u0000\u0000\u0000\u0103\u010a\u0003\u000e\u0007\u0000\u0104\u010a"+
		"\u0003\u001c\u000e\u0000\u0105\u010a\u0003\u001e\u000f\u0000\u0106\u010a"+
		"\u0003 \u0010\u0000\u0107\u010a\u0003(\u0014\u0000\u0108\u010a\u0003$"+
		"\u0012\u0000\u0109\u0103\u0001\u0000\u0000\u0000\u0109\u0104\u0001\u0000"+
		"\u0000\u0000\u0109\u0105\u0001\u0000\u0000\u0000\u0109\u0106\u0001\u0000"+
		"\u0000\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u0109\u0108\u0001\u0000"+
		"\u0000\u0000\u010a\t\u0001\u0000\u0000\u0000\u010b\u0111\u0003\u001c\u000e"+
		"\u0000\u010c\u0111\u0003(\u0014\u0000\u010d\u0111\u0003*\u0015\u0000\u010e"+
		"\u0111\u00038\u001c\u0000\u010f\u0111\u0003,\u0016\u0000\u0110\u010b\u0001"+
		"\u0000\u0000\u0000\u0110\u010c\u0001\u0000\u0000\u0000\u0110\u010d\u0001"+
		"\u0000\u0000\u0000\u0110\u010e\u0001\u0000\u0000\u0000\u0110\u010f\u0001"+
		"\u0000\u0000\u0000\u0111\u000b\u0001\u0000\u0000\u0000\u0112\u011d\u0003"+
		"\u0010\b\u0000\u0113\u011d\u0003\u001c\u000e\u0000\u0114\u011d\u0003("+
		"\u0014\u0000\u0115\u011d\u0003\u0012\t\u0000\u0116\u011d\u0003\u0014\n"+
		"\u0000\u0117\u011d\u0003\u0018\f\u0000\u0118\u011d\u0003\u001a\r\u0000"+
		"\u0119\u011d\u0003<\u001e\u0000\u011a\u011d\u0003:\u001d\u0000\u011b\u011d"+
		"\u0003>\u001f\u0000\u011c\u0112\u0001\u0000\u0000\u0000\u011c\u0113\u0001"+
		"\u0000\u0000\u0000\u011c\u0114\u0001\u0000\u0000\u0000\u011c\u0115\u0001"+
		"\u0000\u0000\u0000\u011c\u0116\u0001\u0000\u0000\u0000\u011c\u0117\u0001"+
		"\u0000\u0000\u0000\u011c\u0118\u0001\u0000\u0000\u0000\u011c\u0119\u0001"+
		"\u0000\u0000\u0000\u011c\u011a\u0001\u0000\u0000\u0000\u011c\u011b\u0001"+
		"\u0000\u0000\u0000\u011d\r\u0001\u0000\u0000\u0000\u011e\u011f\u0005T"+
		"\u0000\u0000\u011f\u0121\u0005\u000f\u0000\u0000\u0120\u0122\u0003t:\u0000"+
		"\u0121\u0120\u0001\u0000\u0000\u0000\u0122\u0123\u0001\u0000\u0000\u0000"+
		"\u0123\u0121\u0001\u0000\u0000\u0000\u0123\u0124\u0001\u0000\u0000\u0000"+
		"\u0124\u0125\u0001\u0000\u0000\u0000\u0125\u0126\u0005U\u0000\u0000\u0126"+
		"\u000f\u0001\u0000\u0000\u0000\u0127\u0128\u0005T\u0000\u0000\u0128\u0129"+
		"\u0005\u001e\u0000\u0000\u0129\u012a\u0003p8\u0000\u012a\u012b\u0005U"+
		"\u0000\u0000\u012b\u0011\u0001\u0000\u0000\u0000\u012c\u012d\u0005T\u0000"+
		"\u0000\u012d\u012e\u0005\u0014\u0000\u0000\u012e\u012f\u0003\u00ceg\u0000"+
		"\u012f\u0130\u0005U\u0000\u0000\u0130\u0013\u0001\u0000\u0000\u0000\u0131"+
		"\u0132\u0005T\u0000\u0000\u0132\u0134\u0005\u0015\u0000\u0000\u0133\u0135"+
		"\u0003\u0016\u000b\u0000\u0134\u0133\u0001\u0000\u0000\u0000\u0135\u0136"+
		"\u0001\u0000\u0000\u0000\u0136\u0134\u0001\u0000\u0000\u0000\u0136\u0137"+
		"\u0001\u0000\u0000\u0000\u0137\u0138\u0001\u0000\u0000\u0000\u0138\u0139"+
		"\u0005U\u0000\u0000\u0139\u0015\u0001\u0000\u0000\u0000\u013a\u013b\u0005"+
		"T\u0000\u0000\u013b\u013c\u0003\u00ba]\u0000\u013c\u013d\u00058\u0000"+
		"\u0000\u013d\u013e\u0005T\u0000\u0000\u013e\u0142\u0003~?\u0000\u013f"+
		"\u0141\u0003~?\u0000\u0140\u013f\u0001\u0000\u0000\u0000\u0141\u0144\u0001"+
		"\u0000\u0000\u0000\u0142\u0140\u0001\u0000\u0000\u0000\u0142\u0143\u0001"+
		"\u0000\u0000\u0000\u0143\u0145\u0001\u0000\u0000\u0000\u0144\u0142\u0001"+
		"\u0000\u0000\u0000\u0145\u0146\u0005U\u0000\u0000\u0146\u0147\u0005U\u0000"+
		"\u0000\u0147\u0017\u0001\u0000\u0000\u0000\u0148\u0149\u0005T\u0000\u0000"+
		"\u0149\u014a\u0005\u0012\u0000\u0000\u014a\u014b\u0003H$\u0000\u014b\u014c"+
		"\u0005U\u0000\u0000\u014c\u0019\u0001\u0000\u0000\u0000\u014d\u014e\u0005"+
		"T\u0000\u0000\u014e\u0150\u0005\u0013\u0000\u0000\u014f\u0151\u0003\u0082"+
		"A\u0000\u0150\u014f\u0001\u0000\u0000\u0000\u0151\u0152\u0001\u0000\u0000"+
		"\u0000\u0152\u0150\u0001\u0000\u0000\u0000\u0152\u0153\u0001\u0000\u0000"+
		"\u0000\u0153\u0154\u0001\u0000\u0000\u0000\u0154\u0155\u0005U\u0000\u0000"+
		"\u0155\u001b\u0001\u0000\u0000\u0000\u0156\u0157\u0005T\u0000\u0000\u0157"+
		"\u015b\u0005\u0010\u0000\u0000\u0158\u015a\u0003\u00d2i\u0000\u0159\u0158"+
		"\u0001\u0000\u0000\u0000\u015a\u015d\u0001\u0000\u0000\u0000\u015b\u0159"+
		"\u0001\u0000\u0000\u0000\u015b\u015c\u0001\u0000\u0000\u0000\u015c\u015e"+
		"\u0001\u0000\u0000\u0000\u015d\u015b\u0001\u0000\u0000\u0000\u015e\u015f"+
		"\u0005U\u0000\u0000\u015f\u001d\u0001\u0000\u0000\u0000\u0160\u0161\u0005"+
		"T\u0000\u0000\u0161\u0162\u0005\u0011\u0000\u0000\u0162\u0163\u0003H$"+
		"\u0000\u0163\u0164\u0005U\u0000\u0000\u0164\u001f\u0001\u0000\u0000\u0000"+
		"\u0165\u0166\u0005T\u0000\u0000\u0166\u0168\u0005\n\u0000\u0000\u0167"+
		"\u0169\u0003\"\u0011\u0000\u0168\u0167\u0001\u0000\u0000\u0000\u0169\u016a"+
		"\u0001\u0000\u0000\u0000\u016a\u0168\u0001\u0000\u0000\u0000\u016a\u016b"+
		"\u0001\u0000\u0000\u0000\u016b\u016c\u0001\u0000\u0000\u0000\u016c\u016d"+
		"\u0005U\u0000\u0000\u016d!\u0001\u0000\u0000\u0000\u016e\u016f\u0005T"+
		"\u0000\u0000\u016f\u0170\u0003n7\u0000\u0170\u0171\u0003J%\u0000\u0171"+
		"\u0172\u0005U\u0000\u0000\u0172#\u0001\u0000\u0000\u0000\u0173\u0174\u0005"+
		"T\u0000\u0000\u0174\u0175\u0005\f\u0000\u0000\u0175\u0176\u0003z=\u0000"+
		"\u0176\u0177\u0003&\u0013\u0000\u0177\u0178\u0003@ \u0000\u0178\u0179"+
		"\u0003D\"\u0000\u0179\u017a\u0003B!\u0000\u017a\u017b\u0003F#\u0000\u017b"+
		"\u017c\u0005U\u0000\u0000\u017c%\u0001\u0000\u0000\u0000\u017d\u017e\u0005"+
		"\r\u0000\u0000\u017e\u017f\u0005T\u0000\u0000\u017f\u0180\u0003J%\u0000"+
		"\u0180\u0181\u0005U\u0000\u0000\u0181\'\u0001\u0000\u0000\u0000\u0182"+
		"\u0183\u0005T\u0000\u0000\u0183\u0187\u0005\u000b\u0000\u0000\u0184\u0186"+
		"\u0003\u0080@\u0000\u0185\u0184\u0001\u0000\u0000\u0000\u0186\u0189\u0001"+
		"\u0000\u0000\u0000\u0187\u0185\u0001\u0000\u0000\u0000\u0187\u0188\u0001"+
		"\u0000\u0000\u0000\u0188\u018a\u0001\u0000\u0000\u0000\u0189\u0187\u0001"+
		"\u0000\u0000\u0000\u018a\u018b\u0005U\u0000\u0000\u018b)\u0001\u0000\u0000"+
		"\u0000\u018c\u018d\u0005T\u0000\u0000\u018d\u0191\u0005\u000e\u0000\u0000"+
		"\u018e\u0190\u0003\u00b8\\\u0000\u018f\u018e\u0001\u0000\u0000\u0000\u0190"+
		"\u0193\u0001\u0000\u0000\u0000\u0191\u018f\u0001\u0000\u0000\u0000\u0191"+
		"\u0192\u0001\u0000\u0000\u0000\u0192\u0194\u0001\u0000\u0000\u0000\u0193"+
		"\u0191\u0001\u0000\u0000\u0000\u0194\u0195\u0005U\u0000\u0000\u0195+\u0001"+
		"\u0000\u0000\u0000\u0196\u0197\u0005T\u0000\u0000\u0197\u0198\u0005\u0001"+
		"\u0000\u0000\u0198\u0199\u0003|>\u0000\u0199\u019a\u0003&\u0013\u0000"+
		"\u019a\u019b\u0003.\u0017\u0000\u019b\u019c\u00030\u0018\u0000\u019c\u019d"+
		"\u0005U\u0000\u0000\u019d-\u0001\u0000\u0000\u0000\u019e\u019f\u0005\u0002"+
		"\u0000\u0000\u019f\u01a0\u0003\u00a8T\u0000\u01a0/\u0001\u0000\u0000\u0000"+
		"\u01a1\u01a2\u0005\u0003\u0000\u0000\u01a2\u01a5\u00032\u0019\u0000\u01a3"+
		"\u01a5\u0001\u0000\u0000\u0000\u01a4\u01a1\u0001\u0000\u0000\u0000\u01a4"+
		"\u01a3\u0001\u0000\u0000\u0000\u01a51\u0001\u0000\u0000\u0000\u01a6\u01a7"+
		"\u0005T\u0000\u0000\u01a7\u01ab\u0005/\u0000\u0000\u01a8\u01aa\u00034"+
		"\u001a\u0000\u01a9\u01a8\u0001\u0000\u0000\u0000\u01aa\u01ad\u0001\u0000"+
		"\u0000\u0000\u01ab\u01a9\u0001\u0000\u0000\u0000\u01ab\u01ac\u0001\u0000"+
		"\u0000\u0000\u01ac\u01ae\u0001\u0000\u0000\u0000\u01ad\u01ab\u0001\u0000"+
		"\u0000\u0000\u01ae\u01af\u0005U\u0000\u0000\u01af3\u0001\u0000\u0000\u0000"+
		"\u01b0\u01bd\u00036\u001b\u0000\u01b1\u01b2\u0005T\u0000\u0000\u01b2\u01b3"+
		"\u00055\u0000\u0000\u01b3\u01b4\u0005T\u0000\u0000\u01b4\u01b5\u0003J"+
		"%\u0000\u01b5\u01b6\u0005U\u0000\u0000\u01b6\u01b7\u00036\u001b\u0000"+
		"\u01b7\u01b8\u0005U\u0000\u0000\u01b8\u01bd\u0001\u0000\u0000\u0000\u01b9"+
		"\u01ba\u0005T\u0000\u0000\u01ba\u01bb\u0005O\u0000\u0000\u01bb\u01bd\u0005"+
		"U\u0000\u0000\u01bc\u01b0\u0001\u0000\u0000\u0000\u01bc\u01b1\u0001\u0000"+
		"\u0000\u0000\u01bc\u01b9\u0001\u0000\u0000\u0000\u01bd5\u0001\u0000\u0000"+
		"\u0000\u01be\u01bf\u0005T\u0000\u0000\u01bf\u01c0\u0005:\u0000\u0000\u01c0"+
		"\u01c1\u0003\u00a8T\u0000\u01c1\u01c2\u0003\u009aM\u0000\u01c2\u01c3\u0005"+
		"U\u0000\u0000\u01c3\u01d0\u0001\u0000\u0000\u0000\u01c4\u01c5\u0005T\u0000"+
		"\u0000\u01c5\u01c6\u0005;\u0000\u0000\u01c6\u01c7\u0003\u00a8T\u0000\u01c7"+
		"\u01c8\u0003\u009aM\u0000\u01c8\u01c9\u0005U\u0000\u0000\u01c9\u01d0\u0001"+
		"\u0000\u0000\u0000\u01ca\u01cb\u0005T\u0000\u0000\u01cb\u01cc\u0005<\u0000"+
		"\u0000\u01cc\u01cd\u0003\u009aM\u0000\u01cd\u01ce\u0005U\u0000\u0000\u01ce"+
		"\u01d0\u0001\u0000\u0000\u0000\u01cf\u01be\u0001\u0000\u0000\u0000\u01cf"+
		"\u01c4\u0001\u0000\u0000\u0000\u01cf\u01ca\u0001\u0000\u0000\u0000\u01d0"+
		"7\u0001\u0000\u0000\u0000\u01d1\u01d2\u0005T\u0000\u0000\u01d2\u01d3\u0005"+
		"\u0019\u0000\u0000\u01d3\u01d4\u0003\u00a2Q\u0000\u01d4\u01d5\u0003&\u0013"+
		"\u0000\u01d5\u01d6\u0003\u00be_\u0000\u01d6\u01d7\u0003\u00c0`\u0000\u01d7"+
		"\u01d8\u0003\u00c4b\u0000\u01d8\u01d9\u0003\u00ccf\u0000\u01d9\u01da\u0005"+
		"U\u0000\u0000\u01da9\u0001\u0000\u0000\u0000\u01db\u01dc\u0005T\u0000"+
		"\u0000\u01dc\u01dd\u0005\u0004\u0000\u0000\u01dd\u01de\u0003v;\u0000\u01de"+
		"\u01df\u0003\u0086C\u0000\u01df\u01e0\u0003\u0088D\u0000\u01e0\u01e1\u0003"+
		"\u0090H\u0000\u01e1\u01e2\u0003\u0096K\u0000\u01e2\u01e3\u0005U\u0000"+
		"\u0000\u01e3;\u0001\u0000\u0000\u0000\u01e4\u01e5\u0005T\u0000\u0000\u01e5"+
		"\u01e6\u0005\u0005\u0000\u0000\u01e6\u01e7\u0003\u009cN\u0000\u01e7\u01e8"+
		"\u0005U\u0000\u0000\u01e8=\u0001\u0000\u0000\u0000\u01e9\u01ea\u0005T"+
		"\u0000\u0000\u01ea\u01eb\u0005\u0006\u0000\u0000\u01eb\u01ec\u0003P(\u0000"+
		"\u01ec\u01ed\u0005U\u0000\u0000\u01ed?\u0001\u0000\u0000\u0000\u01ee\u01ef"+
		"\u0005\u0007\u0000\u0000\u01ef\u01f2\u0003R)\u0000\u01f0\u01f2\u0001\u0000"+
		"\u0000\u0000\u01f1\u01ee\u0001\u0000\u0000\u0000\u01f1\u01f0\u0001\u0000"+
		"\u0000\u0000\u01f2A\u0001\u0000\u0000\u0000\u01f3\u01f4\u0005\u0019\u0000"+
		"\u0000\u01f4\u01f5\u0005T\u0000\u0000\u01f5\u01f9\u0003\u00a2Q\u0000\u01f6"+
		"\u01f8\u0003\u00a4R\u0000\u01f7\u01f6\u0001\u0000\u0000\u0000\u01f8\u01fb"+
		"\u0001\u0000\u0000\u0000\u01f9\u01f7\u0001\u0000\u0000\u0000\u01f9\u01fa"+
		"\u0001\u0000\u0000\u0000\u01fa\u01fc\u0001\u0000\u0000\u0000\u01fb\u01f9"+
		"\u0001\u0000\u0000\u0000\u01fc\u01fd\u0005U\u0000\u0000\u01fdC\u0001\u0000"+
		"\u0000\u0000\u01fe\u01ff\u0005\u0002\u0000\u0000\u01ff\u0200\u0003\u00a8"+
		"T\u0000\u0200E\u0001\u0000\u0000\u0000\u0201\u0205\u0005\u0018\u0000\u0000"+
		"\u0202\u0204\u0003\u00aaU\u0000\u0203\u0202\u0001\u0000\u0000\u0000\u0204"+
		"\u0207\u0001\u0000\u0000\u0000\u0205\u0203\u0001\u0000\u0000\u0000\u0205"+
		"\u0206\u0001\u0000\u0000\u0000\u0206\u020a\u0001\u0000\u0000\u0000\u0207"+
		"\u0205\u0001\u0000\u0000\u0000\u0208\u020a\u0001\u0000\u0000\u0000\u0209"+
		"\u0201\u0001\u0000\u0000\u0000\u0209\u0208\u0001\u0000\u0000\u0000\u020a"+
		"G\u0001\u0000\u0000\u0000\u020b\u020f\u0005L\u0000\u0000\u020c\u020e\u0005"+
		"L\u0000\u0000\u020d\u020c\u0001\u0000\u0000\u0000\u020e\u0211\u0001\u0000"+
		"\u0000\u0000\u020f\u020d\u0001\u0000\u0000\u0000\u020f\u0210\u0001\u0000"+
		"\u0000\u0000\u0210\u0212\u0001\u0000\u0000\u0000\u0211\u020f\u0001\u0000"+
		"\u0000\u0000\u0212\u0213\u00058\u0000\u0000\u0213\u0214\u0003L&\u0000"+
		"\u0214\u0215\u0003H$\u0000\u0215\u0217\u0001\u0000\u0000\u0000\u0216\u020b"+
		"\u0001\u0000\u0000\u0000\u0217\u021a\u0001\u0000\u0000\u0000\u0218\u0216"+
		"\u0001\u0000\u0000\u0000\u0218\u0219\u0001\u0000\u0000\u0000\u0219I\u0001"+
		"\u0000\u0000\u0000\u021a\u0218\u0001\u0000\u0000\u0000\u021b\u021f\u0005"+
		"O\u0000\u0000\u021c\u021e\u0005O\u0000\u0000\u021d\u021c\u0001\u0000\u0000"+
		"\u0000\u021e\u0221\u0001\u0000\u0000\u0000\u021f\u021d\u0001\u0000\u0000"+
		"\u0000\u021f\u0220\u0001\u0000\u0000\u0000\u0220\u0222\u0001\u0000\u0000"+
		"\u0000\u0221\u021f\u0001\u0000\u0000\u0000\u0222\u0223\u0005S\u0000\u0000"+
		"\u0223\u0224\u0003L&\u0000\u0224\u0225\u0003J%\u0000\u0225\u0227\u0001"+
		"\u0000\u0000\u0000\u0226\u021b\u0001\u0000\u0000\u0000\u0226\u0227\u0001"+
		"\u0000\u0000\u0000\u0227\u022a\u0001\u0000\u0000\u0000\u0228\u022a\u0001"+
		"\u0000\u0000\u0000\u0229\u0226\u0001\u0000\u0000\u0000\u0229\u0228\u0001"+
		"\u0000\u0000\u0000\u022aK\u0001\u0000\u0000\u0000\u022b\u022e\u0003N\'"+
		"\u0000\u022c\u022e\u0005L\u0000\u0000\u022d\u022b\u0001\u0000\u0000\u0000"+
		"\u022d\u022c\u0001\u0000\u0000\u0000\u022eM\u0001\u0000\u0000\u0000\u022f"+
		"\u0230\u0007\u0000\u0000\u0000\u0230O\u0001\u0000\u0000\u0000\u0231\u0232"+
		"\u0005T\u0000\u0000\u0232\u0233\u00050\u0000\u0000\u0233\u0234\u0003P"+
		"(\u0000\u0234\u0235\u0003P(\u0000\u0235\u0236\u0005U\u0000\u0000\u0236"+
		"\u026a\u0001\u0000\u0000\u0000\u0237\u0238\u0005T\u0000\u0000\u0238\u0239"+
		"\u00051\u0000\u0000\u0239\u023d\u0003P(\u0000\u023a\u023c\u0003P(\u0000"+
		"\u023b\u023a\u0001\u0000\u0000\u0000\u023c\u023f\u0001\u0000\u0000\u0000"+
		"\u023d\u023b\u0001\u0000\u0000\u0000\u023d\u023e\u0001\u0000\u0000\u0000"+
		"\u023e\u0240\u0001\u0000\u0000\u0000\u023f\u023d\u0001\u0000\u0000\u0000"+
		"\u0240\u0241\u0005U\u0000\u0000\u0241\u026a\u0001\u0000\u0000\u0000\u0242"+
		"\u0243\u0005T\u0000\u0000\u0243\u0244\u00052\u0000\u0000\u0244\u0248\u0003"+
		"P(\u0000\u0245\u0247\u0003P(\u0000\u0246\u0245\u0001\u0000\u0000\u0000"+
		"\u0247\u024a\u0001\u0000\u0000\u0000\u0248\u0246\u0001\u0000\u0000\u0000"+
		"\u0248\u0249\u0001\u0000\u0000\u0000\u0249\u024b\u0001\u0000\u0000\u0000"+
		"\u024a\u0248\u0001\u0000\u0000\u0000\u024b\u024c\u0005U\u0000\u0000\u024c"+
		"\u026a\u0001\u0000\u0000\u0000\u024d\u024e\u0005T\u0000\u0000\u024e\u024f"+
		"\u00053\u0000\u0000\u024f\u0250\u0003P(\u0000\u0250\u0251\u0005U\u0000"+
		"\u0000\u0251\u026a\u0001\u0000\u0000\u0000\u0252\u0253\u0005T\u0000\u0000"+
		"\u0253\u0254\u00054\u0000\u0000\u0254\u0255\u0005T\u0000\u0000\u0255\u0256"+
		"\u0003J%\u0000\u0256\u0257\u0005U\u0000\u0000\u0257\u0258\u0003P(\u0000"+
		"\u0258\u0259\u0005U\u0000\u0000\u0259\u026a\u0001\u0000\u0000\u0000\u025a"+
		"\u025b\u0005T\u0000\u0000\u025b\u025c\u00055\u0000\u0000\u025c\u025d\u0005"+
		"T\u0000\u0000\u025d\u025e\u0003J%\u0000\u025e\u025f\u0005U\u0000\u0000"+
		"\u025f\u0260\u0003P(\u0000\u0260\u0261\u0005U\u0000\u0000\u0261\u026a"+
		"\u0001\u0000\u0000\u0000\u0262\u0263\u0003`0\u0000\u0263\u0264\u0003P"+
		"(\u0000\u0264\u026a\u0001\u0000\u0000\u0000\u0265\u026a\u0003X,\u0000"+
		"\u0266\u026a\u0003Z-\u0000\u0267\u026a\u00056\u0000\u0000\u0268\u026a"+
		"\u00057\u0000\u0000\u0269\u0231\u0001\u0000\u0000\u0000\u0269\u0237\u0001"+
		"\u0000\u0000\u0000\u0269\u0242\u0001\u0000\u0000\u0000\u0269\u024d\u0001"+
		"\u0000\u0000\u0000\u0269\u0252\u0001\u0000\u0000\u0000\u0269\u025a\u0001"+
		"\u0000\u0000\u0000\u0269\u0262\u0001\u0000\u0000\u0000\u0269\u0265\u0001"+
		"\u0000\u0000\u0000\u0269\u0266\u0001\u0000\u0000\u0000\u0269\u0267\u0001"+
		"\u0000\u0000\u0000\u0269\u0268\u0001\u0000\u0000\u0000\u026aQ\u0001\u0000"+
		"\u0000\u0000\u026b\u026c\u0005T\u0000\u0000\u026c\u026d\u00052\u0000\u0000"+
		"\u026d\u0271\u0003T*\u0000\u026e\u0270\u0003T*\u0000\u026f\u026e\u0001"+
		"\u0000\u0000\u0000\u0270\u0273\u0001\u0000\u0000\u0000\u0271\u026f\u0001"+
		"\u0000\u0000\u0000\u0271\u0272\u0001\u0000\u0000\u0000\u0272\u0274\u0001"+
		"\u0000\u0000\u0000\u0273\u0271\u0001\u0000\u0000\u0000\u0274\u0275\u0005"+
		"U\u0000\u0000\u0275\u0278\u0001\u0000\u0000\u0000\u0276\u0278\u0003T*"+
		"\u0000\u0277\u026b\u0001\u0000\u0000\u0000\u0277\u0276\u0001\u0000\u0000"+
		"\u0000\u0278S\u0001\u0000\u0000\u0000\u0279\u0280\u0003V+\u0000\u027a"+
		"\u027b\u0005T\u0000\u0000\u027b\u027c\u00053\u0000\u0000\u027c\u027d\u0003"+
		"V+\u0000\u027d\u027e\u0005U\u0000\u0000\u027e\u0280\u0001\u0000\u0000"+
		"\u0000\u027f\u0279\u0001\u0000\u0000\u0000\u027f\u027a\u0001\u0000\u0000"+
		"\u0000\u0280U\u0001\u0000\u0000\u0000\u0281\u0282\u0005T\u0000\u0000\u0282"+
		"\u0286\u0003n7\u0000\u0283\u0285\u0003\\.\u0000\u0284\u0283\u0001\u0000"+
		"\u0000\u0000\u0285\u0288\u0001\u0000\u0000\u0000\u0286\u0284\u0001\u0000"+
		"\u0000\u0000\u0286\u0287\u0001\u0000\u0000\u0000\u0287\u0289\u0001\u0000"+
		"\u0000\u0000\u0288\u0286\u0001\u0000\u0000\u0000\u0289\u028a\u0005U\u0000"+
		"\u0000\u028a\u0292\u0001\u0000\u0000\u0000\u028b\u028c\u0005T\u0000\u0000"+
		"\u028c\u028d\u00058\u0000\u0000\u028d\u028e\u0003\\.\u0000\u028e\u028f"+
		"\u0003\\.\u0000\u028f\u0290\u0005U\u0000\u0000\u0290\u0292\u0001\u0000"+
		"\u0000\u0000\u0291\u0281\u0001\u0000\u0000\u0000\u0291\u028b\u0001\u0000"+
		"\u0000\u0000\u0292W\u0001\u0000\u0000\u0000\u0293\u0294\u0005T\u0000\u0000"+
		"\u0294\u0295\u00050\u0000\u0000\u0295\u0296\u0003X,\u0000\u0296\u0297"+
		"\u0003X,\u0000\u0297\u0298\u0005U\u0000\u0000\u0298\u02cb\u0001\u0000"+
		"\u0000\u0000\u0299\u029a\u0005T\u0000\u0000\u029a\u029c\u00051\u0000\u0000"+
		"\u029b\u029d\u0003X,\u0000\u029c\u029b\u0001\u0000\u0000\u0000\u029d\u029e"+
		"\u0001\u0000\u0000\u0000\u029e\u029c\u0001\u0000\u0000\u0000\u029e\u029f"+
		"\u0001\u0000\u0000\u0000\u029f\u02a0\u0001\u0000\u0000\u0000\u02a0\u02a1"+
		"\u0005U\u0000\u0000\u02a1\u02cb\u0001\u0000\u0000\u0000\u02a2\u02a3\u0005"+
		"T\u0000\u0000\u02a3\u02a5\u00052\u0000\u0000\u02a4\u02a6\u0003X,\u0000"+
		"\u02a5\u02a4\u0001\u0000\u0000\u0000\u02a6\u02a7\u0001\u0000\u0000\u0000"+
		"\u02a7\u02a5\u0001\u0000\u0000\u0000\u02a7\u02a8\u0001\u0000\u0000\u0000"+
		"\u02a8\u02a9\u0001\u0000\u0000\u0000\u02a9\u02aa\u0005U\u0000\u0000\u02aa"+
		"\u02cb\u0001\u0000\u0000\u0000\u02ab\u02ac\u0005T\u0000\u0000\u02ac\u02ad"+
		"\u00053\u0000\u0000\u02ad\u02ae\u0003X,\u0000\u02ae\u02af\u0005U\u0000"+
		"\u0000\u02af\u02cb\u0001\u0000\u0000\u0000\u02b0\u02b1\u0005T\u0000\u0000"+
		"\u02b1\u02b2\u00054\u0000\u0000\u02b2\u02b3\u0005T\u0000\u0000\u02b3\u02b4"+
		"\u0003J%\u0000\u02b4\u02b5\u0005U\u0000\u0000\u02b5\u02b6\u0003X,\u0000"+
		"\u02b6\u02b7\u0005U\u0000\u0000\u02b7\u02cb\u0001\u0000\u0000\u0000\u02b8"+
		"\u02b9\u0005T\u0000\u0000\u02b9\u02ba\u00055\u0000\u0000\u02ba\u02bb\u0005"+
		"T\u0000\u0000\u02bb\u02bc\u0003J%\u0000\u02bc\u02bd\u0005U\u0000\u0000"+
		"\u02bd\u02be\u0003X,\u0000\u02be\u02bf\u0005U\u0000\u0000\u02bf\u02cb"+
		"\u0001\u0000\u0000\u0000\u02c0\u02c1\u0005T\u0000\u0000\u02c1\u02c5\u0003"+
		"n7\u0000\u02c2\u02c4\u0003^/\u0000\u02c3\u02c2\u0001\u0000\u0000\u0000"+
		"\u02c4\u02c7\u0001\u0000\u0000\u0000\u02c5\u02c3\u0001\u0000\u0000\u0000"+
		"\u02c5\u02c6\u0001\u0000\u0000\u0000\u02c6\u02c8\u0001\u0000\u0000\u0000"+
		"\u02c7\u02c5\u0001\u0000\u0000\u0000\u02c8\u02c9\u0005U\u0000\u0000\u02c9"+
		"\u02cb\u0001\u0000\u0000\u0000\u02ca\u0293\u0001\u0000\u0000\u0000\u02ca"+
		"\u0299\u0001\u0000\u0000\u0000\u02ca\u02a2\u0001\u0000\u0000\u0000\u02ca"+
		"\u02ab\u0001\u0000\u0000\u0000\u02ca\u02b0\u0001\u0000\u0000\u0000\u02ca"+
		"\u02b8\u0001\u0000\u0000\u0000\u02ca\u02c0\u0001\u0000\u0000\u0000\u02cb"+
		"Y\u0001\u0000\u0000\u0000\u02cc\u02cd\u0005T\u0000\u0000\u02cd\u02ce\u0005"+
		"8\u0000\u0000\u02ce\u02cf\u0003\\.\u0000\u02cf\u02d0\u0003\\.\u0000\u02d0"+
		"\u02d1\u0005U\u0000\u0000\u02d1[\u0001\u0000\u0000\u0000\u02d2\u02d5\u0003"+
		"^/\u0000\u02d3\u02d5\u0005O\u0000\u0000\u02d4\u02d2\u0001\u0000\u0000"+
		"\u0000\u02d4\u02d3\u0001\u0000\u0000\u0000\u02d5]\u0001\u0000\u0000\u0000"+
		"\u02d6\u02d9\u0005L\u0000\u0000\u02d7\u02d9\u0003~?\u0000\u02d8\u02d6"+
		"\u0001\u0000\u0000\u0000\u02d8\u02d7\u0001\u0000\u0000\u0000\u02d9_\u0001"+
		"\u0000\u0000\u0000\u02da\u02dd\u0003b1\u0000\u02db\u02dd\u0003d2\u0000"+
		"\u02dc\u02da\u0001\u0000\u0000\u0000\u02dc\u02db\u0001\u0000\u0000\u0000"+
		"\u02dda\u0001\u0000\u0000\u0000\u02de\u02df\u0005V\u0000\u0000\u02df\u02e0"+
		"\u0003f3\u0000\u02e0\u02e1\u0003h4\u0000\u02e1\u02e2\u0005W\u0000\u0000"+
		"\u02e2\u02e9\u0001\u0000\u0000\u0000\u02e3\u02e4\u0005Z\u0000\u0000\u02e4"+
		"\u02e5\u0003f3\u0000\u02e5\u02e6\u0003h4\u0000\u02e6\u02e7\u0005[\u0000"+
		"\u0000\u02e7\u02e9\u0001\u0000\u0000\u0000\u02e8\u02de\u0001\u0000\u0000"+
		"\u0000\u02e8\u02e3\u0001\u0000\u0000\u0000\u02e9c\u0001\u0000\u0000\u0000"+
		"\u02ea\u02eb\u0005V\u0000\u0000\u02eb\u02ec\u0003f3\u0000\u02ec\u02ed"+
		"\u0003j5\u0000\u02ed\u02ee\u0005W\u0000\u0000\u02ee\u02f5\u0001\u0000"+
		"\u0000\u0000\u02ef\u02f0\u0005Z\u0000\u0000\u02f0\u02f1\u0003f3\u0000"+
		"\u02f1\u02f2\u0003j5\u0000\u02f2\u02f3\u0005[\u0000\u0000\u02f3\u02f5"+
		"\u0001\u0000\u0000\u0000\u02f4\u02ea\u0001\u0000\u0000\u0000\u02f4\u02ef"+
		"\u0001\u0000\u0000\u0000\u02f5e\u0001\u0000\u0000\u0000\u02f6\u02f9\u0003"+
		"\u0080@\u0000\u02f7\u02f9\u0001\u0000\u0000\u0000\u02f8\u02f6\u0001\u0000"+
		"\u0000\u0000\u02f8\u02f7\u0001\u0000\u0000\u0000\u02f9g\u0001\u0000\u0000"+
		"\u0000\u02fa\u02fe\u0003~?\u0000\u02fb\u02fe\u0005O\u0000\u0000\u02fc"+
		"\u02fe\u0003l6\u0000\u02fd\u02fa\u0001\u0000\u0000\u0000\u02fd\u02fb\u0001"+
		"\u0000\u0000\u0000\u02fd\u02fc\u0001\u0000\u0000\u0000\u02fei\u0001\u0000"+
		"\u0000\u0000\u02ff\u0303\u0003h4\u0000\u0300\u0302\u0003h4\u0000\u0301"+
		"\u0300\u0001\u0000\u0000\u0000\u0302\u0305\u0001\u0000\u0000\u0000\u0303"+
		"\u0301\u0001\u0000\u0000\u0000\u0303\u0304\u0001\u0000\u0000\u0000\u0304"+
		"k\u0001\u0000\u0000\u0000\u0305\u0303\u0001\u0000\u0000\u0000\u0306\u0307"+
		"\u0005H\u0000\u0000\u0307m\u0001\u0000\u0000\u0000\u0308\u0309\u0005L"+
		"\u0000\u0000\u0309o\u0001\u0000\u0000\u0000\u030a\u030b\u0005L\u0000\u0000"+
		"\u030bq\u0001\u0000\u0000\u0000\u030c\u030d\u0005L\u0000\u0000\u030ds"+
		"\u0001\u0000\u0000\u0000\u030e\u030f\u0005L\u0000\u0000\u030fu\u0001\u0000"+
		"\u0000\u0000\u0310\u0311\u0005L\u0000\u0000\u0311w\u0001\u0000\u0000\u0000"+
		"\u0312\u0313\u0005L\u0000\u0000\u0313y\u0001\u0000\u0000\u0000\u0314\u0315"+
		"\u0005L\u0000\u0000\u0315{\u0001\u0000\u0000\u0000\u0316\u0317\u0005L"+
		"\u0000\u0000\u0317}\u0001\u0000\u0000\u0000\u0318\u0319\u0005M\u0000\u0000"+
		"\u0319\u007f\u0001\u0000\u0000\u0000\u031a\u031b\u0005N\u0000\u0000\u031b"+
		"\u0081\u0001\u0000\u0000\u0000\u031c\u031d\u0005T\u0000\u0000\u031d\u0321"+
		"\u0003n7\u0000\u031e\u0320\u0003\u0084B\u0000\u031f\u031e\u0001\u0000"+
		"\u0000\u0000\u0320\u0323\u0001\u0000\u0000\u0000\u0321\u031f\u0001\u0000"+
		"\u0000\u0000\u0321\u0322\u0001\u0000\u0000\u0000\u0322\u0324\u0001\u0000"+
		"\u0000\u0000\u0323\u0321\u0001\u0000\u0000\u0000\u0324\u0325\u0005U\u0000"+
		"\u0000\u0325\u0083\u0001\u0000\u0000\u0000\u0326\u0329\u0005L\u0000\u0000"+
		"\u0327\u0329\u0003~?\u0000\u0328\u0326\u0001\u0000\u0000\u0000\u0328\u0327"+
		"\u0001\u0000\u0000\u0000\u0329\u0085\u0001\u0000\u0000\u0000\u032a\u032b"+
		"\u0005\u001a\u0000\u0000\u032b\u032d\u0005T\u0000\u0000\u032c\u032e\u0003"+
		"x<\u0000\u032d\u032c\u0001\u0000\u0000\u0000\u032e\u032f\u0001\u0000\u0000"+
		"\u0000\u032f\u032d\u0001\u0000\u0000\u0000\u032f\u0330\u0001\u0000\u0000"+
		"\u0000\u0330\u0331\u0001\u0000\u0000\u0000\u0331\u0332\u0005U\u0000\u0000"+
		"\u0332\u0087\u0001\u0000\u0000\u0000\u0333\u0334\u0005\b\u0000\u0000\u0334"+
		"\u0335\u0003\u008aE\u0000\u0335\u0089\u0001\u0000\u0000\u0000\u0336\u0338"+
		"\u0003\u008cF\u0000\u0337\u0336\u0001\u0000\u0000\u0000\u0338\u0339\u0001"+
		"\u0000\u0000\u0000\u0339\u0337\u0001\u0000\u0000\u0000\u0339\u033a\u0001"+
		"\u0000\u0000\u0000\u033a\u033f\u0001\u0000\u0000\u0000\u033b\u033c\u0005"+
		"T\u0000\u0000\u033c\u033d\u0005K\u0000\u0000\u033d\u033f\u0005U\u0000"+
		"\u0000\u033e\u0337\u0001\u0000\u0000\u0000\u033e\u033b\u0001\u0000\u0000"+
		"\u0000\u033f\u008b\u0001\u0000\u0000\u0000\u0340\u0341\u0005T\u0000\u0000"+
		"\u0341\u0343\u0003\u0098L\u0000\u0342\u0344\u0003\u008eG\u0000\u0343\u0342"+
		"\u0001\u0000\u0000\u0000\u0344\u0345\u0001\u0000\u0000\u0000\u0345\u0343"+
		"\u0001\u0000\u0000\u0000\u0345\u0346\u0001\u0000\u0000\u0000\u0346\u0347"+
		"\u0001\u0000\u0000\u0000\u0347\u0348\u0005U\u0000\u0000\u0348\u008d\u0001"+
		"\u0000\u0000\u0000\u0349\u034a\u0005T\u0000\u0000\u034a\u034b\u0003x<"+
		"\u0000\u034b\u034c\u0003x<\u0000\u034c\u034d\u0005U\u0000\u0000\u034d"+
		"\u008f\u0001\u0000\u0000\u0000\u034e\u034f\u0005\u0016\u0000\u0000\u034f"+
		"\u0350\u0003\u0092I\u0000\u0350\u0091\u0001\u0000\u0000\u0000\u0351\u0353"+
		"\u0003\u0094J\u0000\u0352\u0351\u0001\u0000\u0000\u0000\u0353\u0354\u0001"+
		"\u0000\u0000\u0000\u0354\u0352\u0001\u0000\u0000\u0000\u0354\u0355\u0001"+
		"\u0000\u0000\u0000\u0355\u035a\u0001\u0000\u0000\u0000\u0356\u0357\u0005"+
		"T\u0000\u0000\u0357\u0358\u0005K\u0000\u0000\u0358\u035a\u0005U\u0000"+
		"\u0000\u0359\u0352\u0001\u0000\u0000\u0000\u0359\u0356\u0001\u0000\u0000"+
		"\u0000\u035a\u0093\u0001\u0000\u0000\u0000\u035b\u035c\u0005T\u0000\u0000"+
		"\u035c\u035d\u0003x<\u0000\u035d\u0361\u0005V\u0000\u0000\u035e\u0360"+
		"\u0003\u009aM\u0000\u035f\u035e\u0001\u0000\u0000\u0000\u0360\u0363\u0001"+
		"\u0000\u0000\u0000\u0361\u035f\u0001\u0000\u0000\u0000\u0361\u0362\u0001"+
		"\u0000\u0000\u0000\u0362\u0364\u0001\u0000\u0000\u0000\u0363\u0361\u0001"+
		"\u0000\u0000\u0000\u0364\u0365\u0005W\u0000\u0000\u0365\u0366\u0005U\u0000"+
		"\u0000\u0366\u0095\u0001\u0000\u0000\u0000\u0367\u0368\u0005\t\u0000\u0000"+
		"\u0368\u036a\u0005T\u0000\u0000\u0369\u036b\u0003x<\u0000\u036a\u0369"+
		"\u0001\u0000\u0000\u0000\u036b\u036c\u0001\u0000\u0000\u0000\u036c\u036a"+
		"\u0001\u0000\u0000\u0000\u036c\u036d\u0001\u0000\u0000\u0000\u036d\u036e"+
		"\u0001\u0000\u0000\u0000\u036e\u036f\u0005U\u0000\u0000\u036f\u0097\u0001"+
		"\u0000\u0000\u0000\u0370\u037c\u0003\u00ba]\u0000\u0371\u0372\u0005X\u0000"+
		"\u0000\u0372\u0376\u0003~?\u0000\u0373\u0375\u0003~?\u0000\u0374\u0373"+
		"\u0001\u0000\u0000\u0000\u0375\u0378\u0001\u0000\u0000\u0000\u0376\u0374"+
		"\u0001\u0000\u0000\u0000\u0376\u0377\u0001\u0000\u0000\u0000\u0377\u0379"+
		"\u0001\u0000\u0000\u0000\u0378\u0376\u0001\u0000\u0000\u0000\u0379\u037a"+
		"\u0005Y\u0000\u0000\u037a\u037c\u0001\u0000\u0000\u0000\u037b\u0370\u0001"+
		"\u0000\u0000\u0000\u037b\u0371\u0001\u0000\u0000\u0000\u037c\u0099\u0001"+
		"\u0000\u0000\u0000\u037d\u0384\u0003\u00bc^\u0000\u037e\u037f\u0005T\u0000"+
		"\u0000\u037f\u0380\u00053\u0000\u0000\u0380\u0381\u0003\u00bc^\u0000\u0381"+
		"\u0382\u0005U\u0000\u0000\u0382\u0384\u0001\u0000\u0000\u0000\u0383\u037d"+
		"\u0001\u0000\u0000\u0000\u0383\u037e\u0001\u0000\u0000\u0000\u0384\u009b"+
		"\u0001\u0000\u0000\u0000\u0385\u0387\u0003\u009eO\u0000\u0386\u0385\u0001"+
		"\u0000\u0000\u0000\u0387\u038a\u0001\u0000\u0000\u0000\u0388\u0386\u0001"+
		"\u0000\u0000\u0000\u0388\u0389\u0001\u0000\u0000\u0000\u0389\u0391\u0001"+
		"\u0000\u0000\u0000\u038a\u0388\u0001\u0000\u0000\u0000\u038b\u038c\u0005"+
		"T\u0000\u0000\u038c\u038d\u0005\u0017\u0000\u0000\u038d\u038e\u0003v;"+
		"\u0000\u038e\u038f\u0005U\u0000\u0000\u038f\u0391\u0001\u0000\u0000\u0000"+
		"\u0390\u0388\u0001\u0000\u0000\u0000\u0390\u038b\u0001\u0000\u0000\u0000"+
		"\u0391\u009d\u0001\u0000\u0000\u0000\u0392\u039c\u0003\u00a0P\u0000\u0393"+
		"\u0394\u0005T\u0000\u0000\u0394\u0395\u00055\u0000\u0000\u0395\u0396\u0005"+
		"T\u0000\u0000\u0396\u0397\u0003J%\u0000\u0397\u0398\u0005U\u0000\u0000"+
		"\u0398\u0399\u0003\u00a0P\u0000\u0399\u039a\u0005U\u0000\u0000\u039a\u039c"+
		"\u0001\u0000\u0000\u0000\u039b\u0392\u0001\u0000\u0000\u0000\u039b\u0393"+
		"\u0001\u0000\u0000\u0000\u039c\u009f\u0001\u0000\u0000\u0000\u039d\u03ba"+
		"\u0003X,\u0000\u039e\u039f\u0005V\u0000\u0000\u039f\u03a0\u0005H\u0000"+
		"\u0000\u03a0\u03a1\u0005W\u0000\u0000\u03a1\u03ba\u0003X,\u0000\u03a2"+
		"\u03a3\u0005V\u0000\u0000\u03a3\u03a4\u0005H\u0000\u0000\u03a4\u03a5\u0005"+
		"W\u0000\u0000\u03a5\u03a6\u0005V\u0000\u0000\u03a6\u03a7\u0003~?\u0000"+
		"\u03a7\u03a8\u0005W\u0000\u0000\u03a8\u03a9\u0003X,\u0000\u03a9\u03ba"+
		"\u0001\u0000\u0000\u0000\u03aa\u03ab\u0005V\u0000\u0000\u03ab\u03ac\u0005"+
		"H\u0000\u0000\u03ac\u03ad\u0005W\u0000\u0000\u03ad\u03ae\u0003\u00d0h"+
		"\u0000\u03ae\u03af\u0003X,\u0000\u03af\u03ba\u0001\u0000\u0000\u0000\u03b0"+
		"\u03b1\u0005V\u0000\u0000\u03b1\u03b2\u0005H\u0000\u0000\u03b2\u03b3\u0005"+
		"W\u0000\u0000\u03b3\u03b4\u0005T\u0000\u0000\u03b4\u03b5\u00053\u0000"+
		"\u0000\u03b5\u03b6\u0003\u00d0h\u0000\u03b6\u03b7\u0003X,\u0000\u03b7"+
		"\u03b8\u0005U\u0000\u0000\u03b8\u03ba\u0001\u0000\u0000\u0000\u03b9\u039d"+
		"\u0001\u0000\u0000\u0000\u03b9\u039e\u0001\u0000\u0000\u0000\u03b9\u03a2"+
		"\u0001\u0000\u0000\u0000\u03b9\u03aa\u0001\u0000\u0000\u0000\u03b9\u03b0"+
		"\u0001\u0000\u0000\u0000\u03ba\u00a1\u0001\u0000\u0000\u0000\u03bb\u03bc"+
		"\u0005L\u0000\u0000\u03bc\u00a3\u0001\u0000\u0000\u0000\u03bd\u03be\u0005"+
		"T\u0000\u0000\u03be\u03bf\u0005O\u0000\u0000\u03bf\u03c0\u00058\u0000"+
		"\u0000\u03c0\u03c1\u0003\u00a6S\u0000\u03c1\u03c2\u0005U\u0000\u0000\u03c2"+
		"\u00a5\u0001\u0000\u0000\u0000\u03c3\u03c7\u0003\\.\u0000\u03c4\u03c7"+
		"\u0003P(\u0000\u03c5\u03c7\u00032\u0019\u0000\u03c6\u03c3\u0001\u0000"+
		"\u0000\u0000\u03c6\u03c4\u0001\u0000\u0000\u0000\u03c6\u03c5\u0001\u0000"+
		"\u0000\u0000\u03c7\u00a7\u0001\u0000\u0000\u0000\u03c8\u03cb\u0003P(\u0000"+
		"\u03c9\u03cb\u0005K\u0000\u0000\u03ca\u03c8\u0001\u0000\u0000\u0000\u03ca"+
		"\u03c9\u0001\u0000\u0000\u0000\u03cb\u00a9\u0001\u0000\u0000\u0000\u03cc"+
		"\u03cf\u0003\u00acV\u0000\u03cd\u03cf\u0003\u00aeW\u0000\u03ce\u03cc\u0001"+
		"\u0000\u0000\u0000\u03ce\u03cd\u0001\u0000\u0000\u0000\u03cf\u00ab\u0001"+
		"\u0000\u0000\u0000\u03d0\u03d1\u0005T\u0000\u0000\u03d1\u03d2\u00055\u0000"+
		"\u0000\u03d2\u03d3\u0005T\u0000\u0000\u03d3\u03d4\u0005O\u0000\u0000\u03d4"+
		"\u03d5\u0005S\u0000\u0000\u03d5\u03d6\u0003L&\u0000\u03d6\u03d8\u0005"+
		"U\u0000\u0000\u03d7\u03d9\u0003\u00aeW\u0000\u03d8\u03d7\u0001\u0000\u0000"+
		"\u0000\u03d9\u03da\u0001\u0000\u0000\u0000\u03da\u03d8\u0001\u0000\u0000"+
		"\u0000\u03da\u03db\u0001\u0000\u0000\u0000\u03db\u03dc\u0001\u0000\u0000"+
		"\u0000\u03dc\u03dd\u0005U\u0000\u0000\u03dd\u00ad\u0001\u0000\u0000\u0000"+
		"\u03de\u03e2\u0003\u00b0X\u0000\u03df\u03e2\u0003\u00b2Y\u0000\u03e0\u03e2"+
		"\u0003\u00b4Z\u0000\u03e1\u03de\u0001\u0000\u0000\u0000\u03e1\u03df\u0001"+
		"\u0000\u0000\u0000\u03e1\u03e0\u0001\u0000\u0000\u0000\u03e2\u00af\u0001"+
		"\u0000\u0000\u0000\u03e3\u03e4\u0005T\u0000\u0000\u03e4\u03e5\u0003\u00b6"+
		"[\u0000\u03e5\u03e6\u0003\u00b8\\\u0000\u03e6\u03e7\u0005U\u0000\u0000"+
		"\u03e7\u00b1\u0001\u0000\u0000\u0000\u03e8\u03e9\u0005T\u0000\u0000\u03e9"+
		"\u03ea\u0005=\u0000\u0000\u03ea\u03eb\u0003P(\u0000\u03eb\u03ec\u0003"+
		"\u00b6[\u0000\u03ec\u03ed\u0003\u00b8\\\u0000\u03ed\u03ee\u0005U\u0000"+
		"\u0000\u03ee\u00b3\u0001\u0000\u0000\u0000\u03ef\u03f0\u0005T\u0000\u0000"+
		"\u03f0\u03f1\u0005>\u0000\u0000\u03f1\u03f2\u0003\u00b6[\u0000\u03f2\u03f3"+
		"\u0003\u00b8\\\u0000\u03f3\u03f4\u0005U\u0000\u0000\u03f4\u00b5\u0001"+
		"\u0000\u0000\u0000\u03f5\u03f6\u0007\u0001\u0000\u0000\u03f6\u00b7\u0001"+
		"\u0000\u0000\u0000\u03f7\u03fb\u0003\u00b6[\u0000\u03f8\u03fa\u0003\u00b6"+
		"[\u0000\u03f9\u03f8\u0001\u0000\u0000\u0000\u03fa\u03fd\u0001\u0000\u0000"+
		"\u0000\u03fb\u03f9\u0001\u0000\u0000\u0000\u03fb\u03fc\u0001\u0000\u0000"+
		"\u0000\u03fc\u00b9\u0001\u0000\u0000\u0000\u03fd\u03fb\u0001\u0000\u0000"+
		"\u0000\u03fe\u03ff\u0007\u0002\u0000\u0000\u03ff\u00bb\u0001\u0000\u0000"+
		"\u0000\u0400\u0401\u0005T\u0000\u0000\u0401\u0405\u0003n7\u0000\u0402"+
		"\u0404\u0003\\.\u0000\u0403\u0402\u0001\u0000\u0000\u0000\u0404\u0407"+
		"\u0001\u0000\u0000\u0000\u0405\u0403\u0001\u0000\u0000\u0000\u0405\u0406"+
		"\u0001\u0000\u0000\u0000\u0406\u0408\u0001\u0000\u0000\u0000\u0407\u0405"+
		"\u0001\u0000\u0000\u0000\u0408\u0409\u0005U\u0000\u0000\u0409\u00bd\u0001"+
		"\u0000\u0000\u0000\u040a\u040b\u0005\u000e\u0000\u0000\u040b\u040f\u0005"+
		"T\u0000\u0000\u040c\u040e\u0003\u00b8\\\u0000\u040d\u040c\u0001\u0000"+
		"\u0000\u0000\u040e\u0411\u0001\u0000\u0000\u0000\u040f\u040d\u0001\u0000"+
		"\u0000\u0000\u040f\u0410\u0001\u0000\u0000\u0000\u0410\u0412\u0001\u0000"+
		"\u0000\u0000\u0411\u040f\u0001\u0000\u0000\u0000\u0412\u0415\u0005U\u0000"+
		"\u0000\u0413\u0415\u0001\u0000\u0000\u0000\u0414\u040a\u0001\u0000\u0000"+
		"\u0000\u0414\u0413\u0001\u0000\u0000\u0000\u0415\u00bf\u0001\u0000\u0000"+
		"\u0000\u0416\u0418\u0005\u0001\u0000\u0000\u0417\u0419\u0003\u00c2a\u0000"+
		"\u0418\u0417\u0001\u0000\u0000\u0000\u0419\u041a\u0001\u0000\u0000\u0000"+
		"\u041a\u0418\u0001\u0000\u0000\u0000\u041a\u041b\u0001\u0000\u0000\u0000"+
		"\u041b\u00c1\u0001\u0000\u0000\u0000\u041c\u041d\u0005T\u0000\u0000\u041d"+
		"\u0421\u0003|>\u0000\u041e\u0420\u0003\u00a4R\u0000\u041f\u041e\u0001"+
		"\u0000\u0000\u0000\u0420\u0423\u0001\u0000\u0000\u0000\u0421\u041f\u0001"+
		"\u0000\u0000\u0000\u0421\u0422\u0001\u0000\u0000\u0000\u0422\u0424\u0001"+
		"\u0000\u0000\u0000\u0423\u0421\u0001\u0000\u0000\u0000\u0424\u0425\u0005"+
		"U\u0000\u0000\u0425\u00c3\u0001\u0000\u0000\u0000\u0426\u0427\u0005\b"+
		"\u0000\u0000\u0427\u0428\u0003\u00c6c\u0000\u0428\u00c5\u0001\u0000\u0000"+
		"\u0000\u0429\u042b\u0003\u00c8d\u0000\u042a\u0429\u0001\u0000\u0000\u0000"+
		"\u042b\u042c\u0001\u0000\u0000\u0000\u042c\u042a\u0001\u0000\u0000\u0000"+
		"\u042c\u042d\u0001\u0000\u0000\u0000\u042d\u0432\u0001\u0000\u0000\u0000"+
		"\u042e\u042f\u0005T\u0000\u0000\u042f\u0430\u0005K\u0000\u0000\u0430\u0432"+
		"\u0005U\u0000\u0000\u0431\u042a\u0001\u0000\u0000\u0000\u0431\u042e\u0001"+
		"\u0000\u0000\u0000\u0432\u00c7\u0001\u0000\u0000\u0000\u0433\u0434\u0005"+
		"T\u0000\u0000\u0434\u0436\u0003\u0098L\u0000\u0435\u0437\u0003\u00cae"+
		"\u0000\u0436\u0435\u0001\u0000\u0000\u0000\u0437\u0438\u0001\u0000\u0000"+
		"\u0000\u0438\u0436\u0001\u0000\u0000\u0000\u0438\u0439\u0001\u0000\u0000"+
		"\u0000\u0439\u043a\u0001\u0000\u0000\u0000\u043a\u043b\u0005U\u0000\u0000"+
		"\u043b\u00c9\u0001\u0000\u0000\u0000\u043c\u043d\u0005T\u0000\u0000\u043d"+
		"\u043e\u0003|>\u0000\u043e\u043f\u0003|>\u0000\u043f\u0440\u0005U\u0000"+
		"\u0000\u0440\u00cb\u0001\u0000\u0000\u0000\u0441\u0442\u0005\t\u0000\u0000"+
		"\u0442\u0446\u0005T\u0000\u0000\u0443\u0445\u0003|>\u0000\u0444\u0443"+
		"\u0001\u0000\u0000\u0000\u0445\u0448\u0001\u0000\u0000\u0000\u0446\u0444"+
		"\u0001\u0000\u0000\u0000\u0446\u0447\u0001\u0000\u0000\u0000\u0447\u0449"+
		"\u0001\u0000\u0000\u0000\u0448\u0446\u0001\u0000\u0000\u0000\u0449\u044a"+
		"\u0005U\u0000\u0000\u044a\u00cd\u0001\u0000\u0000\u0000\u044b\u044d\u0005"+
		"M\u0000\u0000\u044c\u044b\u0001\u0000\u0000\u0000\u044d\u0450\u0001\u0000"+
		"\u0000\u0000\u044e\u044c\u0001\u0000\u0000\u0000\u044e\u044f\u0001\u0000"+
		"\u0000\u0000\u044f\u045d\u0001\u0000\u0000\u0000\u0450\u044e\u0001\u0000"+
		"\u0000\u0000\u0451\u0455\u0005M\u0000\u0000\u0452\u0454\u0005M\u0000\u0000"+
		"\u0453\u0452\u0001\u0000\u0000\u0000\u0454\u0457\u0001\u0000\u0000\u0000"+
		"\u0455\u0453\u0001\u0000\u0000\u0000\u0455\u0456\u0001\u0000\u0000\u0000"+
		"\u0456\u0458\u0001\u0000\u0000\u0000\u0457\u0455\u0001\u0000\u0000\u0000"+
		"\u0458\u0459\u0005S\u0000\u0000\u0459\u045a\u0003L&\u0000\u045a\u045b"+
		"\u0003\u00ceg\u0000\u045b\u045d\u0001\u0000\u0000\u0000\u045c\u044e\u0001"+
		"\u0000\u0000\u0000\u045c\u0451\u0001\u0000\u0000\u0000\u045d\u00cf\u0001"+
		"\u0000\u0000\u0000\u045e\u045f\u0005V\u0000\u0000\u045f\u0460\u0005N\u0000"+
		"\u0000\u0460\u0461\u0003~?\u0000\u0461\u0462\u0005W\u0000\u0000\u0462"+
		"\u00d1\u0001\u0000\u0000\u0000\u0463\u0480\u0005\u001b\u0000\u0000\u0464"+
		"\u0480\u0005\u001c\u0000\u0000\u0465\u0480\u0005\u001d\u0000\u0000\u0466"+
		"\u0480\u0005 \u0000\u0000\u0467\u0480\u0005!\u0000\u0000\u0468\u0480\u0005"+
		"\u001f\u0000\u0000\u0469\u0480\u0005\"\u0000\u0000\u046a\u0480\u0005#"+
		"\u0000\u0000\u046b\u0480\u0005$\u0000\u0000\u046c\u0480\u0005%\u0000\u0000"+
		"\u046d\u0480\u0005&\u0000\u0000\u046e\u0480\u0005\'\u0000\u0000\u046f"+
		"\u0480\u0005(\u0000\u0000\u0470\u0480\u0005)\u0000\u0000\u0471\u0480\u0005"+
		"*\u0000\u0000\u0472\u0473\u0005T\u0000\u0000\u0473\u0474\u0005+\u0000"+
		"\u0000\u0474\u0475\u0005P\u0000\u0000\u0475\u0480\u0005U\u0000\u0000\u0476"+
		"\u0477\u0005T\u0000\u0000\u0477\u0478\u0005,\u0000\u0000\u0478\u0479\u0005"+
		"P\u0000\u0000\u0479\u0480\u0005U\u0000\u0000\u047a\u047b\u0005T\u0000"+
		"\u0000\u047b\u047c\u0005-\u0000\u0000\u047c\u047d\u0005P\u0000\u0000\u047d"+
		"\u0480\u0005U\u0000\u0000\u047e\u0480\u0005.\u0000\u0000\u047f\u0463\u0001"+
		"\u0000\u0000\u0000\u047f\u0464\u0001\u0000\u0000\u0000\u047f\u0465\u0001"+
		"\u0000\u0000\u0000\u047f\u0466\u0001\u0000\u0000\u0000\u047f\u0467\u0001"+
		"\u0000\u0000\u0000\u047f\u0468\u0001\u0000\u0000\u0000\u047f\u0469\u0001"+
		"\u0000\u0000\u0000\u047f\u046a\u0001\u0000\u0000\u0000\u047f\u046b\u0001"+
		"\u0000\u0000\u0000\u047f\u046c\u0001\u0000\u0000\u0000\u047f\u046d\u0001"+
		"\u0000\u0000\u0000\u047f\u046e\u0001\u0000\u0000\u0000\u047f\u046f\u0001"+
		"\u0000\u0000\u0000\u047f\u0470\u0001\u0000\u0000\u0000\u047f\u0471\u0001"+
		"\u0000\u0000\u0000\u047f\u0472\u0001\u0000\u0000\u0000\u047f\u0476\u0001"+
		"\u0000\u0000\u0000\u047f\u047a\u0001\u0000\u0000\u0000\u047f\u047e\u0001"+
		"\u0000\u0000\u0000\u0480\u00d3\u0001\u0000\u0000\u0000U\u00d7\u00e2\u00f0"+
		"\u00fe\u0109\u0110\u011c\u0123\u0136\u0142\u0152\u015b\u016a\u0187\u0191"+
		"\u01a4\u01ab\u01bc\u01cf\u01f1\u01f9\u0205\u0209\u020f\u0218\u021f\u0226"+
		"\u0229\u022d\u023d\u0248\u0269\u0271\u0277\u027f\u0286\u0291\u029e\u02a7"+
		"\u02c5\u02ca\u02d4\u02d8\u02dc\u02e8\u02f4\u02f8\u02fd\u0303\u0321\u0328"+
		"\u032f\u0339\u033e\u0345\u0354\u0359\u0361\u036c\u0376\u037b\u0383\u0388"+
		"\u0390\u039b\u03b9\u03c6\u03ca\u03ce\u03da\u03e1\u03fb\u0405\u040f\u0414"+
		"\u041a\u0421\u042c\u0431\u0438\u0446\u044e\u0455\u045c\u047f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}