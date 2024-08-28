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
		NAME=1, AGENT_NAME=2, MODALITY_NAME=3, VARIABLE=4, INT=5, WS=6, DASH=7, 
		SEMICOLON=8, LPAREN=9, RPAREN=10, LBRACKET=11, RBRACKET=12, LBRACE=13, 
		RBRACE=14, COLON=15, IMPLY=16, OR=17, AND=18, NOT=19, EXISTS=20, FORALL=21, 
		TRUE=22, FALSE=23, ASSIGN=24, KW=25, IFF=26, WHEN=27, ALWAYS=28, IF=29, 
		OTHERWISE=30, DEFINE=31, DOMAIN=32, LIBRARY=33, PROBLEM=34, ACTION_TYPE_LIBRARIES=35, 
		REQUIREMENTS=36, TYPES=37, PREDICATE=38, PREDICATE_FORMULA=39, FORMULA=40, 
		POSTCONDITION=41, LITERAL=42, PREDICATES=43, MODALITY=44, ACTION=45, PARAMETERS=46, 
		OBSERVABILITY_GROUPS=47, ALL=48, EVENT=49, PRECONDITION=50, POSTCONDITIONS=51, 
		STATE=52, INIT=53, GOAL=54, WHERE=55, RELATIONS=56, DESIGNATED=57, WORLD=58, 
		OBJECTS=59, STATIC=60, AGENT=61, AGENTS=62, AGENT_GROUPS=63, VALUTATION=64, 
		STATE_NAME=65, OBSERVABILITY_CONDITIONS=66, ACTION_TYPE=67, WORLDS=68, 
		TRIVIAL_RELATION=69, DEL=70, TYPING=71, EQUALITY=72, EXISTENTIAL_FORMULAE=73, 
		UNIVERSAL_FORMULAE=74, UNIVERSAL_POSTCONDITIONS=75, MODAL_PRECONDITIONS=76, 
		MODAL_POSTCONDITIONS=77, MODALITIES=78, ONTIC_CHANGE=79, COMMON_KNOWLEDGE=80, 
		DYNAMIC_COMMON_KNOWLEDGE=81, FINITARY_S5_THEORY=82, MAX_PRECONDITIONS_DEPTH=83, 
		MAX_POSTCONDITIONS_DEPTH=84, MAX_MODAL_DEPTH=85;
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
			null, null, null, null, null, null, null, "'-'", "';'", "'('", "')'", 
			"'['", "']'", "'{'", "'}'", "':'", "'imply'", "'or'", "'and'", "'not'", 
			"'exists'", "'forall'", "'true'", "'false'", "'<-'", "'kw'", "'iff'", 
			"'when'", "'always'", "'if'", "'otherwise'", "'define'", "'domain'", 
			"'library'", "'problem'", "'action-type-libraries'", "'requirements'", 
			"'types'", "'predicate'", "'predicate-formula'", "'formula'", "'postcondition'", 
			"'literal'", "'predicates'", "'modality'", "'action'", "'parameters'", 
			"'observability-groups'", "'All'", "'event'", "'precondition'", "'postconditions'", 
			"'state'", "'init'", "'goal'", "'where'", "'relations'", "'designated'", 
			"'world'", "'objects'", "'static'", "'agent'", "'agents'", "'agent-groups'", 
			"'valuation'", "'state-name'", "'observability-conditions'", "'action-type'", 
			"'worlds'", "'()'", "':del'", "':typing'", "':equality'", "':existential-formulae'", 
			"':universal-formulae'", "':universal-postconditions'", "':modal-preconditions'", 
			"':modal-postconditions'", "':modalities'", "':ontic-change'", "':common-knowledge'", 
			"':dynamic-common-knowledge'", "':finitary-S5-theory'", "':maximum-preconditions-depth'", 
			"':maximum-postconditions-depth'", "':maximum-modal-depth'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NAME", "AGENT_NAME", "MODALITY_NAME", "VARIABLE", "INT", "WS", 
			"DASH", "SEMICOLON", "LPAREN", "RPAREN", "LBRACKET", "RBRACKET", "LBRACE", 
			"RBRACE", "COLON", "IMPLY", "OR", "AND", "NOT", "EXISTS", "FORALL", "TRUE", 
			"FALSE", "ASSIGN", "KW", "IFF", "WHEN", "ALWAYS", "IF", "OTHERWISE", 
			"DEFINE", "DOMAIN", "LIBRARY", "PROBLEM", "ACTION_TYPE_LIBRARIES", "REQUIREMENTS", 
			"TYPES", "PREDICATE", "PREDICATE_FORMULA", "FORMULA", "POSTCONDITION", 
			"LITERAL", "PREDICATES", "MODALITY", "ACTION", "PARAMETERS", "OBSERVABILITY_GROUPS", 
			"ALL", "EVENT", "PRECONDITION", "POSTCONDITIONS", "STATE", "INIT", "GOAL", 
			"WHERE", "RELATIONS", "DESIGNATED", "WORLD", "OBJECTS", "STATIC", "AGENT", 
			"AGENTS", "AGENT_GROUPS", "VALUTATION", "STATE_NAME", "OBSERVABILITY_CONDITIONS", 
			"ACTION_TYPE", "WORLDS", "TRIVIAL_RELATION", "DEL", "TYPING", "EQUALITY", 
			"EXISTENTIAL_FORMULAE", "UNIVERSAL_FORMULAE", "UNIVERSAL_POSTCONDITIONS", 
			"MODAL_PRECONDITIONS", "MODAL_POSTCONDITIONS", "MODALITIES", "ONTIC_CHANGE", 
			"COMMON_KNOWLEDGE", "DYNAMIC_COMMON_KNOWLEDGE", "FINITARY_S5_THEORY", 
			"MAX_PRECONDITIONS_DEPTH", "MAX_POSTCONDITIONS_DEPTH", "MAX_MODAL_DEPTH"
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
		public TerminalNode COLON() { return getToken(EPDDLParser.COLON, 0); }
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
			match(COLON);
			setState(288);
			match(ACTION_TYPE_LIBRARIES);
			setState(290); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(289);
				libraryName();
				}
				}
				setState(292); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NAME );
			setState(294);
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
		public TerminalNode COLON() { return getToken(EPDDLParser.COLON, 0); }
		public TerminalNode DOMAIN() { return getToken(EPDDLParser.DOMAIN, 0); }
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
			setState(296);
			match(LPAREN);
			setState(297);
			match(COLON);
			setState(298);
			match(DOMAIN);
			setState(299);
			domainName();
			setState(300);
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
		public TerminalNode COLON() { return getToken(EPDDLParser.COLON, 0); }
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
			setState(302);
			match(LPAREN);
			setState(303);
			match(COLON);
			setState(304);
			match(AGENTS);
			setState(305);
			typedAgentList();
			setState(306);
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
		public TerminalNode COLON() { return getToken(EPDDLParser.COLON, 0); }
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
			setState(308);
			match(LPAREN);
			setState(309);
			match(COLON);
			setState(310);
			match(AGENT_GROUPS);
			setState(312); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(311);
				agentGroupDef();
				}
				}
				setState(314); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LPAREN );
			setState(316);
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
			setState(318);
			match(LPAREN);
			setState(319);
			agentGroupName();
			setState(320);
			match(ASSIGN);
			setState(321);
			match(LPAREN);
			setState(322);
			agentName();
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AGENT_NAME) {
				{
				{
				setState(323);
				agentName();
				}
				}
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(329);
			match(RPAREN);
			setState(330);
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
		public TerminalNode COLON() { return getToken(EPDDLParser.COLON, 0); }
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
			setState(332);
			match(LPAREN);
			setState(333);
			match(COLON);
			setState(334);
			match(OBJECTS);
			setState(335);
			typedIdentList();
			setState(336);
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
		public TerminalNode COLON() { return getToken(EPDDLParser.COLON, 0); }
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
			setState(338);
			match(LPAREN);
			setState(339);
			match(COLON);
			setState(340);
			match(STATIC);
			setState(342); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(341);
				staticPredDef();
				}
				}
				setState(344); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LPAREN );
			setState(346);
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
		public TerminalNode COLON() { return getToken(EPDDLParser.COLON, 0); }
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
			setState(348);
			match(LPAREN);
			setState(349);
			match(COLON);
			setState(350);
			match(REQUIREMENTS);
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAREN || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 8191L) != 0)) {
				{
				{
				setState(351);
				requirementKey();
				}
				}
				setState(356);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(357);
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
		public TerminalNode COLON() { return getToken(EPDDLParser.COLON, 0); }
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
			setState(359);
			match(LPAREN);
			setState(360);
			match(COLON);
			setState(361);
			match(TYPES);
			setState(362);
			typedIdentList();
			setState(363);
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
		public TerminalNode COLON() { return getToken(EPDDLParser.COLON, 0); }
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
			setState(365);
			match(LPAREN);
			setState(366);
			match(COLON);
			setState(367);
			match(PREDICATES);
			setState(369); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(368);
				predicateDef();
				}
				}
				setState(371); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LPAREN );
			setState(373);
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
			setState(375);
			match(LPAREN);
			setState(376);
			predicateName();
			setState(377);
			typedVariableList();
			setState(378);
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
		public TerminalNode COLON() { return getToken(EPDDLParser.COLON, 0); }
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
		public ActionTypeSignatureDefContext actionTypeSignatureDef() {
			return getRuleContext(ActionTypeSignatureDefContext.class,0);
		}
		public ActionPreDefContext actionPreDef() {
			return getRuleContext(ActionPreDefContext.class,0);
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
			setState(380);
			match(LPAREN);
			setState(381);
			match(COLON);
			setState(382);
			match(ACTION);
			setState(383);
			actionName();
			setState(384);
			parametersDef();
			setState(385);
			actionConditionDef();
			setState(386);
			actionTypeSignatureDef();
			setState(387);
			actionPreDef();
			setState(388);
			actionObsDef();
			setState(389);
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
		public TerminalNode COLON() { return getToken(EPDDLParser.COLON, 0); }
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
			setState(391);
			match(COLON);
			setState(392);
			match(PARAMETERS);
			setState(393);
			match(LPAREN);
			setState(394);
			typedVariableList();
			setState(395);
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
		public TerminalNode COLON() { return getToken(EPDDLParser.COLON, 0); }
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
			setState(397);
			match(LPAREN);
			setState(398);
			match(COLON);
			setState(399);
			match(MODALITY);
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MODALITY_NAME) {
				{
				{
				setState(400);
				modalityName();
				}
				}
				setState(405);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(406);
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
		public TerminalNode COLON() { return getToken(EPDDLParser.COLON, 0); }
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
			setState(408);
			match(LPAREN);
			setState(409);
			match(COLON);
			setState(410);
			match(OBSERVABILITY_GROUPS);
			setState(414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 281474976710676L) != 0)) {
				{
				{
				setState(411);
				observingAgentGroup();
				}
				}
				setState(416);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(417);
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
		public TerminalNode COLON() { return getToken(EPDDLParser.COLON, 0); }
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
			setState(419);
			match(LPAREN);
			setState(420);
			match(COLON);
			setState(421);
			match(EVENT);
			setState(422);
			eventName();
			setState(423);
			parametersDef();
			setState(424);
			eventPreDef();
			setState(425);
			eventPostDef();
			setState(426);
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
		public TerminalNode COLON() { return getToken(EPDDLParser.COLON, 0); }
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
			setState(428);
			match(COLON);
			setState(429);
			match(PRECONDITION);
			setState(430);
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
		public TerminalNode COLON() { return getToken(EPDDLParser.COLON, 0); }
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
			setState(436);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(432);
				match(COLON);
				setState(433);
				match(POSTCONDITIONS);
				setState(434);
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
			setState(438);
			match(LPAREN);
			setState(439);
			match(COLON);
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAREN) {
				{
				{
				setState(440);
				postcondition();
				}
				}
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(446);
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
			setState(460);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(448);
				simplePostcondition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(449);
				match(LPAREN);
				setState(450);
				match(FORALL);
				setState(451);
				match(LPAREN);
				setState(452);
				typedVariableList();
				setState(453);
				match(RPAREN);
				setState(454);
				simplePostcondition();
				setState(455);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(457);
				match(LPAREN);
				setState(458);
				match(VARIABLE);
				setState(459);
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
			setState(479);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(462);
				match(LPAREN);
				setState(463);
				match(IFF);
				setState(464);
				formulaOrEmpty();
				setState(465);
				literal();
				setState(466);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(468);
				match(LPAREN);
				setState(469);
				match(WHEN);
				setState(470);
				formulaOrEmpty();
				setState(471);
				literal();
				setState(472);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(474);
				match(LPAREN);
				setState(475);
				match(ALWAYS);
				setState(476);
				literal();
				setState(477);
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
		public TerminalNode COLON() { return getToken(EPDDLParser.COLON, 0); }
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
			setState(481);
			match(LPAREN);
			setState(482);
			match(COLON);
			setState(483);
			match(ACTION_TYPE);
			setState(484);
			actionTypeName();
			setState(485);
			parametersDef();
			setState(486);
			actionTypeGroupsDef();
			setState(487);
			actionTypeEventsDef();
			setState(488);
			actionTypeRelDef();
			setState(489);
			actionTypeDesignDef();
			setState(490);
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
		public TerminalNode COLON() { return getToken(EPDDLParser.COLON, 0); }
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
			setState(492);
			match(LPAREN);
			setState(493);
			match(COLON);
			setState(494);
			match(STATE);
			setState(495);
			stateName();
			setState(496);
			stateWorldsDef();
			setState(497);
			stateRelDef();
			setState(498);
			stateValDef();
			setState(499);
			stateDesignDef();
			setState(500);
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
		public TerminalNode COLON() { return getToken(EPDDLParser.COLON, 0); }
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
			setState(502);
			match(LPAREN);
			setState(503);
			match(COLON);
			setState(504);
			match(INIT);
			setState(505);
			initialStateDescr();
			setState(506);
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
		public TerminalNode COLON() { return getToken(EPDDLParser.COLON, 0); }
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
			setState(508);
			match(LPAREN);
			setState(509);
			match(COLON);
			setState(510);
			match(GOAL);
			setState(511);
			formula();
			setState(512);
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
		public TerminalNode COLON() { return getToken(EPDDLParser.COLON, 0); }
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
			setState(518);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(514);
				match(COLON);
				setState(515);
				match(WHERE);
				setState(516);
				conditionFormula();
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
	public static class ActionTypeSignatureDefContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(EPDDLParser.COLON, 0); }
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
			setState(520);
			match(COLON);
			setState(521);
			match(ACTION_TYPE);
			setState(522);
			match(LPAREN);
			setState(523);
			actionTypeName();
			setState(527);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAREN) {
				{
				{
				setState(524);
				parameter();
				}
				}
				setState(529);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(530);
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
		public TerminalNode COLON() { return getToken(EPDDLParser.COLON, 0); }
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
			setState(532);
			match(COLON);
			setState(533);
			match(PRECONDITION);
			setState(534);
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
		public TerminalNode COLON() { return getToken(EPDDLParser.COLON, 0); }
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
			setState(545);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(536);
				match(COLON);
				setState(537);
				match(OBSERVABILITY_CONDITIONS);
				setState(541);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LPAREN) {
					{
					{
					setState(538);
					obsConditionDef();
					}
					}
					setState(543);
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
			setState(560);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(547);
					match(NAME);
					setState(551);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NAME) {
						{
						{
						setState(548);
						match(NAME);
						}
						}
						setState(553);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(554);
					match(ASSIGN);
					setState(555);
					type();
					setState(556);
					typedIdentList();
					}
					} 
				}
				setState(562);
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
		public List<TypedVariableListContext> typedVariableList() {
			return getRuleContexts(TypedVariableListContext.class);
		}
		public TypedVariableListContext typedVariableList(int i) {
			return getRuleContext(TypedVariableListContext.class,i);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(563);
					match(VARIABLE);
					setState(567);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==VARIABLE) {
						{
						{
						setState(564);
						match(VARIABLE);
						}
						}
						setState(569);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(570);
					match(ASSIGN);
					setState(571);
					type();
					setState(572);
					typedVariableList();
					}
					} 
				}
				setState(578);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
			setState(581);
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
				setState(579);
				reservedType();
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(580);
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
			setState(583);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2305851530428809216L) != 0)) ) {
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
			setState(641);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(585);
				match(LPAREN);
				setState(586);
				match(IMPLY);
				setState(587);
				formula();
				setState(588);
				formula();
				setState(589);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(591);
				match(LPAREN);
				setState(592);
				match(OR);
				setState(593);
				formula();
				setState(597);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 12583424L) != 0)) {
					{
					{
					setState(594);
					formula();
					}
					}
					setState(599);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(600);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(602);
				match(LPAREN);
				setState(603);
				match(AND);
				setState(604);
				formula();
				setState(608);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 12583424L) != 0)) {
					{
					{
					setState(605);
					formula();
					}
					}
					setState(610);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(611);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(613);
				match(LPAREN);
				setState(614);
				match(NOT);
				setState(615);
				formula();
				setState(616);
				match(RPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(618);
				match(LPAREN);
				setState(619);
				match(EXISTS);
				setState(620);
				match(LPAREN);
				setState(621);
				typedVariableList();
				setState(622);
				match(RPAREN);
				setState(623);
				formula();
				setState(624);
				match(RPAREN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(626);
				match(LPAREN);
				setState(627);
				match(FORALL);
				setState(628);
				match(LPAREN);
				setState(629);
				typedVariableList();
				setState(630);
				match(RPAREN);
				setState(631);
				formula();
				setState(632);
				match(RPAREN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(634);
				modality();
				setState(635);
				formula();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(637);
				predicateFormula();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(638);
				atomicEqFormula();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(639);
				match(TRUE);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(640);
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
			setState(655);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(643);
				match(LPAREN);
				setState(644);
				match(AND);
				setState(645);
				condition();
				setState(649);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LPAREN) {
					{
					{
					setState(646);
					condition();
					}
					}
					setState(651);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(652);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(654);
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
			setState(663);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(657);
				atomicCondition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(658);
				match(LPAREN);
				setState(659);
				match(NOT);
				setState(660);
				atomicCondition();
				setState(661);
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
			setState(681);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(665);
				match(LPAREN);
				setState(666);
				predicateName();
				setState(670);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 22L) != 0)) {
					{
					{
					setState(667);
					term();
					}
					}
					setState(672);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(673);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(675);
				match(LPAREN);
				setState(676);
				match(ASSIGN);
				setState(677);
				term();
				setState(678);
				term();
				setState(679);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(683);
			match(LPAREN);
			setState(684);
			predicateName();
			setState(688);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 22L) != 0)) {
				{
				{
				setState(685);
				term();
				}
				}
				setState(690);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(691);
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
			setState(693);
			match(LPAREN);
			setState(694);
			match(ASSIGN);
			setState(695);
			term();
			setState(696);
			term();
			setState(697);
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
			setState(701);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
			case AGENT_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(699);
				groundTerm();
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(700);
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
			setState(705);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(703);
				match(NAME);
				}
				break;
			case AGENT_NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(704);
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
			setState(709);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(707);
				singleModality();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(708);
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
		public TerminalNode LPAREN() { return getToken(EPDDLParser.LPAREN, 0); }
		public ModalityLabelContext modalityLabel() {
			return getRuleContext(ModalityLabelContext.class,0);
		}
		public ModalityAgentContext modalityAgent() {
			return getRuleContext(ModalityAgentContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(EPDDLParser.RPAREN, 0); }
		public SingleModalityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleModality; }
	}

	public final SingleModalityContext singleModality() throws RecognitionException {
		SingleModalityContext _localctx = new SingleModalityContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_singleModality);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(711);
			match(LPAREN);
			setState(712);
			modalityLabel();
			setState(713);
			modalityAgent();
			setState(714);
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
	public static class GroupModalityContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(EPDDLParser.LPAREN, 0); }
		public ModalityLabelContext modalityLabel() {
			return getRuleContext(ModalityLabelContext.class,0);
		}
		public ModalityAgentGroupContext modalityAgentGroup() {
			return getRuleContext(ModalityAgentGroupContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(EPDDLParser.RPAREN, 0); }
		public GroupModalityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupModality; }
	}

	public final GroupModalityContext groupModality() throws RecognitionException {
		GroupModalityContext _localctx = new GroupModalityContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_groupModality);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(716);
			match(LPAREN);
			setState(717);
			modalityLabel();
			setState(718);
			modalityAgentGroup();
			setState(719);
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
			setState(723);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MODALITY_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(721);
				modalityName();
				}
				break;
			case AGENT_NAME:
			case VARIABLE:
			case ALL:
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
			setState(728);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AGENT_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(725);
				agentName();
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(726);
				match(VARIABLE);
				}
				break;
			case ALL:
				enterOuterAlt(_localctx, 3);
				{
				setState(727);
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
			setState(730);
			modalityAgent();
			setState(734);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 281474976710676L) != 0)) {
				{
				{
				setState(731);
				modalityAgent();
				}
				}
				setState(736);
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
			setState(737);
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
			setState(739);
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
			setState(741);
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
			setState(743);
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
			setState(745);
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
			setState(747);
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
			setState(749);
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
			setState(751);
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
			setState(753);
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
			setState(755);
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
			setState(757);
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
			setState(759);
			match(LPAREN);
			setState(760);
			predicateName();
			setState(764);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAME || _la==AGENT_NAME) {
				{
				{
				setState(761);
				genericName();
				}
				}
				setState(766);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(767);
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
			setState(771);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(769);
				match(NAME);
				}
				break;
			case AGENT_NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(770);
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
		public TerminalNode COLON() { return getToken(EPDDLParser.COLON, 0); }
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
			setState(773);
			match(COLON);
			setState(774);
			match(WORLDS);
			setState(775);
			match(LPAREN);
			setState(777); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(776);
				worldName();
				}
				}
				setState(779); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NAME );
			setState(781);
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
		public TerminalNode COLON() { return getToken(EPDDLParser.COLON, 0); }
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
			setState(783);
			match(COLON);
			setState(784);
			match(RELATIONS);
			setState(785);
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
		public TerminalNode TRIVIAL_RELATION() { return getToken(EPDDLParser.TRIVIAL_RELATION, 0); }
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
			setState(795);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(788); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(787);
					worldRelation();
					}
					}
					setState(790); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LPAREN );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(792);
				match(LPAREN);
				setState(793);
				match(TRIVIAL_RELATION);
				setState(794);
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
			setState(797);
			match(LPAREN);
			setState(798);
			agentGroup();
			setState(800); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(799);
				worldNamePair();
				}
				}
				setState(802); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LPAREN );
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
			setState(806);
			match(LPAREN);
			setState(807);
			worldName();
			setState(808);
			worldName();
			setState(809);
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
		public TerminalNode COLON() { return getToken(EPDDLParser.COLON, 0); }
		public TerminalNode VALUTATION() { return getToken(EPDDLParser.VALUTATION, 0); }
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
			setState(811);
			match(COLON);
			setState(812);
			match(VALUTATION);
			setState(813);
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
		public TerminalNode TRIVIAL_RELATION() { return getToken(EPDDLParser.TRIVIAL_RELATION, 0); }
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
			setState(823);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(816); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(815);
					worldValuation();
					}
					}
					setState(818); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LPAREN );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(820);
				match(LPAREN);
				setState(821);
				match(TRIVIAL_RELATION);
				setState(822);
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
			setState(825);
			match(LPAREN);
			setState(826);
			worldName();
			setState(827);
			match(LBRACKET);
			setState(831);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAREN) {
				{
				{
				setState(828);
				literal();
				}
				}
				setState(833);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(834);
			match(RBRACKET);
			setState(835);
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
		public TerminalNode COLON() { return getToken(EPDDLParser.COLON, 0); }
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
			setState(837);
			match(COLON);
			setState(838);
			match(DESIGNATED);
			setState(839);
			match(LPAREN);
			setState(841); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(840);
				worldName();
				}
				}
				setState(843); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NAME );
			setState(845);
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
			setState(858);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AGENT_NAME:
			case ALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(847);
				agentGroupName();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(848);
				match(LBRACE);
				setState(849);
				agentName();
				setState(853);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AGENT_NAME) {
					{
					{
					setState(850);
					agentName();
					}
					}
					setState(855);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(856);
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
			setState(866);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(860);
				predicate();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(861);
				match(LPAREN);
				setState(862);
				match(NOT);
				setState(863);
				predicate();
				setState(864);
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
		public TerminalNode COLON() { return getToken(EPDDLParser.COLON, 0); }
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
			setState(879);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(869); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(868);
					fTheoryFormula();
					}
					}
					setState(871); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LPAREN );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(873);
				match(LPAREN);
				setState(874);
				match(COLON);
				setState(875);
				match(STATE_NAME);
				setState(876);
				stateName();
				setState(877);
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
			setState(890);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(881);
				simpleFTheoryFormula();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(882);
				match(LPAREN);
				setState(883);
				match(FORALL);
				setState(884);
				match(LPAREN);
				setState(885);
				typedVariableList();
				setState(886);
				match(RPAREN);
				setState(887);
				simpleFTheoryFormula();
				setState(888);
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
		public List<TerminalNode> LPAREN() { return getTokens(EPDDLParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(EPDDLParser.LPAREN, i);
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
		public List<TerminalNode> RPAREN() { return getTokens(EPDDLParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(EPDDLParser.RPAREN, i);
		}
		public AgentNameContext agentName() {
			return getRuleContext(AgentNameContext.class,0);
		}
		public KnowsWhetherContext knowsWhether() {
			return getRuleContext(KnowsWhetherContext.class,0);
		}
		public TerminalNode NOT() { return getToken(EPDDLParser.NOT, 0); }
		public SimpleFTheoryFormulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleFTheoryFormula; }
	}

	public final SimpleFTheoryFormulaContext simpleFTheoryFormula() throws RecognitionException {
		SimpleFTheoryFormulaContext _localctx = new SimpleFTheoryFormulaContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_simpleFTheoryFormula);
		try {
			setState(929);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(892);
				predicateFormula();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(893);
				match(LPAREN);
				setState(894);
				match(LBRACKET);
				setState(895);
				match(ALL);
				setState(896);
				match(RBRACKET);
				setState(897);
				predicateFormula();
				setState(898);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(900);
				match(LPAREN);
				setState(901);
				match(LBRACKET);
				setState(902);
				match(ALL);
				setState(903);
				match(RBRACKET);
				setState(904);
				match(LBRACKET);
				setState(905);
				agentName();
				setState(906);
				match(RBRACKET);
				setState(907);
				predicateFormula();
				setState(908);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(910);
				match(LPAREN);
				setState(911);
				match(LBRACKET);
				setState(912);
				match(ALL);
				setState(913);
				match(RBRACKET);
				setState(914);
				knowsWhether();
				setState(915);
				predicateFormula();
				setState(916);
				match(RPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(918);
				match(LPAREN);
				setState(919);
				match(LBRACKET);
				setState(920);
				match(ALL);
				setState(921);
				match(RBRACKET);
				setState(922);
				match(LPAREN);
				setState(923);
				match(NOT);
				setState(924);
				knowsWhether();
				setState(925);
				predicateFormula();
				setState(926);
				match(RPAREN);
				setState(927);
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
			setState(931);
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
			setState(933);
			match(LPAREN);
			setState(934);
			match(VARIABLE);
			setState(935);
			match(ASSIGN);
			setState(936);
			expression();
			setState(937);
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
			setState(942);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(939);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(940);
				formula();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(941);
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
		public TerminalNode LPAREN() { return getToken(EPDDLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(EPDDLParser.RPAREN, 0); }
		public FormulaOrEmptyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formulaOrEmpty; }
	}

	public final FormulaOrEmptyContext formulaOrEmpty() throws RecognitionException {
		FormulaOrEmptyContext _localctx = new FormulaOrEmptyContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_formulaOrEmpty);
		try {
			setState(947);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(944);
				formula();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(945);
				match(LPAREN);
				setState(946);
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
			setState(951);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(949);
				universalObsCond();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(950);
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
			setState(953);
			match(LPAREN);
			setState(954);
			match(FORALL);
			setState(955);
			match(LPAREN);
			setState(956);
			match(VARIABLE);
			setState(957);
			match(DASH);
			setState(958);
			type();
			setState(959);
			match(RPAREN);
			setState(961); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(960);
				obsCondition();
				}
				}
				setState(963); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LPAREN );
			setState(965);
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
			setState(970);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(967);
				trivialObsCond();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(968);
				ifObsCond();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(969);
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
			setState(972);
			match(LPAREN);
			setState(973);
			observingAgent();
			setState(974);
			observingAgentGroup();
			setState(975);
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
			setState(977);
			match(LPAREN);
			setState(978);
			match(IF);
			setState(979);
			formula();
			setState(980);
			observingAgent();
			setState(981);
			observingAgentGroup();
			setState(982);
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
			setState(984);
			match(LPAREN);
			setState(985);
			match(OTHERWISE);
			setState(986);
			observingAgent();
			setState(987);
			observingAgentGroup();
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
			setState(990);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 281474976710676L) != 0)) ) {
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
			setState(992);
			observingAgent();
			setState(996);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(993);
					observingAgent();
					}
					} 
				}
				setState(998);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
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
			setState(999);
			_la = _input.LA(1);
			if ( !(_la==AGENT_NAME || _la==ALL) ) {
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
			setState(1001);
			match(LPAREN);
			setState(1002);
			predicateName();
			setState(1006);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 22L) != 0)) {
				{
				{
				setState(1003);
				term();
				}
				}
				setState(1008);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1009);
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
		public TerminalNode COLON() { return getToken(EPDDLParser.COLON, 0); }
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
			setState(1022);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1011);
				match(COLON);
				setState(1012);
				match(OBSERVABILITY_GROUPS);
				setState(1013);
				match(LPAREN);
				setState(1017);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 281474976710676L) != 0)) {
					{
					{
					setState(1014);
					observingAgentGroup();
					}
					}
					setState(1019);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1020);
				match(RPAREN);
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
	public static class ActionTypeEventsDefContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(EPDDLParser.COLON, 0); }
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
			setState(1024);
			match(COLON);
			setState(1025);
			match(EVENT);
			setState(1027); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1026);
				eventSignature();
				}
				}
				setState(1029); 
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
			setState(1031);
			match(LPAREN);
			setState(1032);
			eventName();
			setState(1036);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LPAREN) {
				{
				{
				setState(1033);
				parameter();
				}
				}
				setState(1038);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1039);
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
		public TerminalNode COLON() { return getToken(EPDDLParser.COLON, 0); }
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
			setState(1041);
			match(COLON);
			setState(1042);
			match(RELATIONS);
			setState(1043);
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
		public TerminalNode TRIVIAL_RELATION() { return getToken(EPDDLParser.TRIVIAL_RELATION, 0); }
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
			setState(1053);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1046); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1045);
					eventRelation();
					}
					}
					setState(1048); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LPAREN );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1050);
				match(LPAREN);
				setState(1051);
				match(TRIVIAL_RELATION);
				setState(1052);
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
			setState(1055);
			match(LPAREN);
			setState(1056);
			agentGroup();
			setState(1058); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1057);
				eventNamePair();
				}
				}
				setState(1060); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LPAREN );
			setState(1062);
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
			setState(1064);
			match(LPAREN);
			setState(1065);
			eventName();
			setState(1066);
			eventName();
			setState(1067);
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
		public TerminalNode COLON() { return getToken(EPDDLParser.COLON, 0); }
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
			setState(1069);
			match(COLON);
			setState(1070);
			match(DESIGNATED);
			setState(1071);
			match(LPAREN);
			setState(1075);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAME) {
				{
				{
				setState(1072);
				eventName();
				}
				}
				setState(1077);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1078);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(1091);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AGENT_NAME) {
				{
				setState(1080);
				match(AGENT_NAME);
				setState(1084);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AGENT_NAME) {
					{
					{
					setState(1081);
					match(AGENT_NAME);
					}
					}
					setState(1086);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1087);
				match(DASH);
				setState(1088);
				type();
				setState(1089);
				typedAgentList();
				}
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
			setState(1093);
			match(LBRACKET);
			setState(1094);
			match(MODALITY_NAME);
			setState(1095);
			agentName();
			setState(1096);
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
		public RequirementKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requirementKey; }
	}

	public final RequirementKeyContext requirementKey() throws RecognitionException {
		RequirementKeyContext _localctx = new RequirementKeyContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_requirementKey);
		try {
			setState(1123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1098);
				match(DEL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1099);
				match(TYPING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1100);
				match(EQUALITY);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1101);
				match(EXISTENTIAL_FORMULAE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1102);
				match(UNIVERSAL_FORMULAE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1103);
				match(UNIVERSAL_POSTCONDITIONS);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1104);
				match(MODAL_PRECONDITIONS);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1105);
				match(MODAL_POSTCONDITIONS);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1106);
				match(MODALITIES);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1107);
				match(ONTIC_CHANGE);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1108);
				match(COMMON_KNOWLEDGE);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1109);
				match(DYNAMIC_COMMON_KNOWLEDGE);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1110);
				match(FINITARY_S5_THEORY);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1111);
				match(LPAREN);
				setState(1112);
				match(MAX_PRECONDITIONS_DEPTH);
				setState(1113);
				match(INT);
				setState(1114);
				match(RPAREN);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1115);
				match(LPAREN);
				setState(1116);
				match(MAX_POSTCONDITIONS_DEPTH);
				setState(1117);
				match(INT);
				setState(1118);
				match(RPAREN);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1119);
				match(LPAREN);
				setState(1120);
				match(MAX_MODAL_DEPTH);
				setState(1121);
				match(INT);
				setState(1122);
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

	public static final String _serializedATN =
		"\u0004\u0001U\u0466\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"\u0006\u011d\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0004"+
		"\u0007\u0123\b\u0007\u000b\u0007\f\u0007\u0124\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0004\n\u0139"+
		"\b\n\u000b\n\f\n\u013a\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0145\b\u000b\n\u000b"+
		"\f\u000b\u0148\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0004"+
		"\r\u0157\b\r\u000b\r\f\r\u0158\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0005\u000e\u0161\b\u000e\n\u000e\f\u000e\u0164"+
		"\t\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0004\u0010\u0172\b\u0010\u000b\u0010\f\u0010\u0173\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u0192\b\u0014\n\u0014"+
		"\f\u0014\u0195\t\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0005\u0015\u019d\b\u0015\n\u0015\f\u0015\u01a0"+
		"\t\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0003\u0018\u01b5\b\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0005\u0019\u01ba\b\u0019\n\u0019\f\u0019\u01bd\t\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0003\u001a\u01cd\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0003\u001b\u01e0\b\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0003 \u0207\b \u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0005!\u020e\b!\n!\f!\u0211\t!\u0001!\u0001!\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0005#\u021c\b#\n#\f#"+
		"\u021f\t#\u0001#\u0003#\u0222\b#\u0001$\u0001$\u0005$\u0226\b$\n$\f$\u0229"+
		"\t$\u0001$\u0001$\u0001$\u0001$\u0005$\u022f\b$\n$\f$\u0232\t$\u0001%"+
		"\u0001%\u0005%\u0236\b%\n%\f%\u0239\t%\u0001%\u0001%\u0001%\u0001%\u0005"+
		"%\u023f\b%\n%\f%\u0242\t%\u0001&\u0001&\u0003&\u0246\b&\u0001\'\u0001"+
		"\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0005(\u0254\b(\n(\f(\u0257\t(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0005(\u025f\b(\n(\f(\u0262\t(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0003(\u0282\b(\u0001)\u0001)\u0001)\u0001"+
		")\u0005)\u0288\b)\n)\f)\u028b\t)\u0001)\u0001)\u0001)\u0003)\u0290\b)"+
		"\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u0298\b*\u0001+\u0001"+
		"+\u0001+\u0005+\u029d\b+\n+\f+\u02a0\t+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0003+\u02aa\b+\u0001,\u0001,\u0001,\u0005,\u02af"+
		"\b,\n,\f,\u02b2\t,\u0001,\u0001,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001.\u0001.\u0003.\u02be\b.\u0001/\u0001/\u0003/\u02c2\b/\u00010\u0001"+
		"0\u00030\u02c6\b0\u00011\u00011\u00011\u00011\u00011\u00012\u00012\u0001"+
		"2\u00012\u00012\u00013\u00013\u00033\u02d4\b3\u00014\u00014\u00014\u0003"+
		"4\u02d9\b4\u00015\u00015\u00055\u02dd\b5\n5\f5\u02e0\t5\u00016\u00016"+
		"\u00017\u00017\u00018\u00018\u00019\u00019\u0001:\u0001:\u0001;\u0001"+
		";\u0001<\u0001<\u0001=\u0001=\u0001>\u0001>\u0001?\u0001?\u0001@\u0001"+
		"@\u0001A\u0001A\u0001A\u0005A\u02fb\bA\nA\fA\u02fe\tA\u0001A\u0001A\u0001"+
		"B\u0001B\u0003B\u0304\bB\u0001C\u0001C\u0001C\u0001C\u0004C\u030a\bC\u000b"+
		"C\fC\u030b\u0001C\u0001C\u0001D\u0001D\u0001D\u0001D\u0001E\u0004E\u0315"+
		"\bE\u000bE\fE\u0316\u0001E\u0001E\u0001E\u0003E\u031c\bE\u0001F\u0001"+
		"F\u0001F\u0004F\u0321\bF\u000bF\fF\u0322\u0001F\u0001F\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0001H\u0001H\u0001H\u0001H\u0001I\u0004I\u0331\bI\u000b"+
		"I\fI\u0332\u0001I\u0001I\u0001I\u0003I\u0338\bI\u0001J\u0001J\u0001J\u0001"+
		"J\u0005J\u033e\bJ\nJ\fJ\u0341\tJ\u0001J\u0001J\u0001J\u0001K\u0001K\u0001"+
		"K\u0001K\u0004K\u034a\bK\u000bK\fK\u034b\u0001K\u0001K\u0001L\u0001L\u0001"+
		"L\u0001L\u0005L\u0354\bL\nL\fL\u0357\tL\u0001L\u0001L\u0003L\u035b\bL"+
		"\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0003M\u0363\bM\u0001N\u0004"+
		"N\u0366\bN\u000bN\fN\u0367\u0001N\u0001N\u0001N\u0001N\u0001N\u0001N\u0003"+
		"N\u0370\bN\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001"+
		"O\u0003O\u037b\bO\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001"+
		"P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001"+
		"P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001"+
		"P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0003"+
		"P\u03a2\bP\u0001Q\u0001Q\u0001R\u0001R\u0001R\u0001R\u0001R\u0001R\u0001"+
		"S\u0001S\u0001S\u0003S\u03af\bS\u0001T\u0001T\u0001T\u0003T\u03b4\bT\u0001"+
		"U\u0001U\u0003U\u03b8\bU\u0001V\u0001V\u0001V\u0001V\u0001V\u0001V\u0001"+
		"V\u0001V\u0004V\u03c2\bV\u000bV\fV\u03c3\u0001V\u0001V\u0001W\u0001W\u0001"+
		"W\u0003W\u03cb\bW\u0001X\u0001X\u0001X\u0001X\u0001X\u0001Y\u0001Y\u0001"+
		"Y\u0001Y\u0001Y\u0001Y\u0001Y\u0001Z\u0001Z\u0001Z\u0001Z\u0001Z\u0001"+
		"Z\u0001[\u0001[\u0001\\\u0001\\\u0005\\\u03e3\b\\\n\\\f\\\u03e6\t\\\u0001"+
		"]\u0001]\u0001^\u0001^\u0001^\u0005^\u03ed\b^\n^\f^\u03f0\t^\u0001^\u0001"+
		"^\u0001_\u0001_\u0001_\u0001_\u0005_\u03f8\b_\n_\f_\u03fb\t_\u0001_\u0001"+
		"_\u0003_\u03ff\b_\u0001`\u0001`\u0001`\u0004`\u0404\b`\u000b`\f`\u0405"+
		"\u0001a\u0001a\u0001a\u0005a\u040b\ba\na\fa\u040e\ta\u0001a\u0001a\u0001"+
		"b\u0001b\u0001b\u0001b\u0001c\u0004c\u0417\bc\u000bc\fc\u0418\u0001c\u0001"+
		"c\u0001c\u0003c\u041e\bc\u0001d\u0001d\u0001d\u0004d\u0423\bd\u000bd\f"+
		"d\u0424\u0001d\u0001d\u0001e\u0001e\u0001e\u0001e\u0001e\u0001f\u0001"+
		"f\u0001f\u0001f\u0005f\u0432\bf\nf\ff\u0435\tf\u0001f\u0001f\u0001g\u0001"+
		"g\u0005g\u043b\bg\ng\fg\u043e\tg\u0001g\u0001g\u0001g\u0001g\u0003g\u0444"+
		"\bg\u0001h\u0001h\u0001h\u0001h\u0001h\u0001i\u0001i\u0001i\u0001i\u0001"+
		"i\u0001i\u0001i\u0001i\u0001i\u0001i\u0001i\u0001i\u0001i\u0001i\u0001"+
		"i\u0001i\u0001i\u0001i\u0001i\u0001i\u0001i\u0001i\u0001i\u0001i\u0001"+
		"i\u0003i\u0464\bi\u0001i\u0000\u0000j\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc"+
		"\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u0000"+
		"\u0003\u0002\u0000&*==\u0003\u0000\u0002\u0002\u0004\u000400\u0002\u0000"+
		"\u0002\u000200\u0478\u0000\u00d7\u0001\u0000\u0000\u0000\u0002\u00d9\u0001"+
		"\u0000\u0000\u0000\u0004\u00e7\u0001\u0000\u0000\u0000\u0006\u00f5\u0001"+
		"\u0000\u0000\u0000\b\u0109\u0001\u0000\u0000\u0000\n\u0110\u0001\u0000"+
		"\u0000\u0000\f\u011c\u0001\u0000\u0000\u0000\u000e\u011e\u0001\u0000\u0000"+
		"\u0000\u0010\u0128\u0001\u0000\u0000\u0000\u0012\u012e\u0001\u0000\u0000"+
		"\u0000\u0014\u0134\u0001\u0000\u0000\u0000\u0016\u013e\u0001\u0000\u0000"+
		"\u0000\u0018\u014c\u0001\u0000\u0000\u0000\u001a\u0152\u0001\u0000\u0000"+
		"\u0000\u001c\u015c\u0001\u0000\u0000\u0000\u001e\u0167\u0001\u0000\u0000"+
		"\u0000 \u016d\u0001\u0000\u0000\u0000\"\u0177\u0001\u0000\u0000\u0000"+
		"$\u017c\u0001\u0000\u0000\u0000&\u0187\u0001\u0000\u0000\u0000(\u018d"+
		"\u0001\u0000\u0000\u0000*\u0198\u0001\u0000\u0000\u0000,\u01a3\u0001\u0000"+
		"\u0000\u0000.\u01ac\u0001\u0000\u0000\u00000\u01b4\u0001\u0000\u0000\u0000"+
		"2\u01b6\u0001\u0000\u0000\u00004\u01cc\u0001\u0000\u0000\u00006\u01df"+
		"\u0001\u0000\u0000\u00008\u01e1\u0001\u0000\u0000\u0000:\u01ec\u0001\u0000"+
		"\u0000\u0000<\u01f6\u0001\u0000\u0000\u0000>\u01fc\u0001\u0000\u0000\u0000"+
		"@\u0206\u0001\u0000\u0000\u0000B\u0208\u0001\u0000\u0000\u0000D\u0214"+
		"\u0001\u0000\u0000\u0000F\u0221\u0001\u0000\u0000\u0000H\u0230\u0001\u0000"+
		"\u0000\u0000J\u0240\u0001\u0000\u0000\u0000L\u0245\u0001\u0000\u0000\u0000"+
		"N\u0247\u0001\u0000\u0000\u0000P\u0281\u0001\u0000\u0000\u0000R\u028f"+
		"\u0001\u0000\u0000\u0000T\u0297\u0001\u0000\u0000\u0000V\u02a9\u0001\u0000"+
		"\u0000\u0000X\u02ab\u0001\u0000\u0000\u0000Z\u02b5\u0001\u0000\u0000\u0000"+
		"\\\u02bd\u0001\u0000\u0000\u0000^\u02c1\u0001\u0000\u0000\u0000`\u02c5"+
		"\u0001\u0000\u0000\u0000b\u02c7\u0001\u0000\u0000\u0000d\u02cc\u0001\u0000"+
		"\u0000\u0000f\u02d3\u0001\u0000\u0000\u0000h\u02d8\u0001\u0000\u0000\u0000"+
		"j\u02da\u0001\u0000\u0000\u0000l\u02e1\u0001\u0000\u0000\u0000n\u02e3"+
		"\u0001\u0000\u0000\u0000p\u02e5\u0001\u0000\u0000\u0000r\u02e7\u0001\u0000"+
		"\u0000\u0000t\u02e9\u0001\u0000\u0000\u0000v\u02eb\u0001\u0000\u0000\u0000"+
		"x\u02ed\u0001\u0000\u0000\u0000z\u02ef\u0001\u0000\u0000\u0000|\u02f1"+
		"\u0001\u0000\u0000\u0000~\u02f3\u0001\u0000\u0000\u0000\u0080\u02f5\u0001"+
		"\u0000\u0000\u0000\u0082\u02f7\u0001\u0000\u0000\u0000\u0084\u0303\u0001"+
		"\u0000\u0000\u0000\u0086\u0305\u0001\u0000\u0000\u0000\u0088\u030f\u0001"+
		"\u0000\u0000\u0000\u008a\u031b\u0001\u0000\u0000\u0000\u008c\u031d\u0001"+
		"\u0000\u0000\u0000\u008e\u0326\u0001\u0000\u0000\u0000\u0090\u032b\u0001"+
		"\u0000\u0000\u0000\u0092\u0337\u0001\u0000\u0000\u0000\u0094\u0339\u0001"+
		"\u0000\u0000\u0000\u0096\u0345\u0001\u0000\u0000\u0000\u0098\u035a\u0001"+
		"\u0000\u0000\u0000\u009a\u0362\u0001\u0000\u0000\u0000\u009c\u036f\u0001"+
		"\u0000\u0000\u0000\u009e\u037a\u0001\u0000\u0000\u0000\u00a0\u03a1\u0001"+
		"\u0000\u0000\u0000\u00a2\u03a3\u0001\u0000\u0000\u0000\u00a4\u03a5\u0001"+
		"\u0000\u0000\u0000\u00a6\u03ae\u0001\u0000\u0000\u0000\u00a8\u03b3\u0001"+
		"\u0000\u0000\u0000\u00aa\u03b7\u0001\u0000\u0000\u0000\u00ac\u03b9\u0001"+
		"\u0000\u0000\u0000\u00ae\u03ca\u0001\u0000\u0000\u0000\u00b0\u03cc\u0001"+
		"\u0000\u0000\u0000\u00b2\u03d1\u0001\u0000\u0000\u0000\u00b4\u03d8\u0001"+
		"\u0000\u0000\u0000\u00b6\u03de\u0001\u0000\u0000\u0000\u00b8\u03e0\u0001"+
		"\u0000\u0000\u0000\u00ba\u03e7\u0001\u0000\u0000\u0000\u00bc\u03e9\u0001"+
		"\u0000\u0000\u0000\u00be\u03fe\u0001\u0000\u0000\u0000\u00c0\u0400\u0001"+
		"\u0000\u0000\u0000\u00c2\u0407\u0001\u0000\u0000\u0000\u00c4\u0411\u0001"+
		"\u0000\u0000\u0000\u00c6\u041d\u0001\u0000\u0000\u0000\u00c8\u041f\u0001"+
		"\u0000\u0000\u0000\u00ca\u0428\u0001\u0000\u0000\u0000\u00cc\u042d\u0001"+
		"\u0000\u0000\u0000\u00ce\u0443\u0001\u0000\u0000\u0000\u00d0\u0445\u0001"+
		"\u0000\u0000\u0000\u00d2\u0463\u0001\u0000\u0000\u0000\u00d4\u00d8\u0003"+
		"\u0002\u0001\u0000\u00d5\u00d8\u0003\u0004\u0002\u0000\u00d6\u00d8\u0003"+
		"\u0006\u0003\u0000\u00d7\u00d4\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001"+
		"\u0000\u0000\u0000\u00d7\u00d6\u0001\u0000\u0000\u0000\u00d8\u0001\u0001"+
		"\u0000\u0000\u0000\u00d9\u00da\u0005\t\u0000\u0000\u00da\u00db\u0005\u001f"+
		"\u0000\u0000\u00db\u00dc\u0005\t\u0000\u0000\u00dc\u00dd\u0005 \u0000"+
		"\u0000\u00dd\u00de\u0003p8\u0000\u00de\u00e2\u0005\n\u0000\u0000\u00df"+
		"\u00e1\u0003\b\u0004\u0000\u00e0\u00df\u0001\u0000\u0000\u0000\u00e1\u00e4"+
		"\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e3"+
		"\u0001\u0000\u0000\u0000\u00e3\u00e5\u0001\u0000\u0000\u0000\u00e4\u00e2"+
		"\u0001\u0000\u0000\u0000\u00e5\u00e6\u0005\n\u0000\u0000\u00e6\u0003\u0001"+
		"\u0000\u0000\u0000\u00e7\u00e8\u0005\t\u0000\u0000\u00e8\u00e9\u0005\u001f"+
		"\u0000\u0000\u00e9\u00ea\u0005\t\u0000\u0000\u00ea\u00eb\u0005!\u0000"+
		"\u0000\u00eb\u00ec\u0003t:\u0000\u00ec\u00f0\u0005\n\u0000\u0000\u00ed"+
		"\u00ef\u0003\n\u0005\u0000\u00ee\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f2"+
		"\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f0\u00f1"+
		"\u0001\u0000\u0000\u0000\u00f1\u00f3\u0001\u0000\u0000\u0000\u00f2\u00f0"+
		"\u0001\u0000\u0000\u0000\u00f3\u00f4\u0005\n\u0000\u0000\u00f4\u0005\u0001"+
		"\u0000\u0000\u0000\u00f5\u00f6\u0005\t\u0000\u0000\u00f6\u00f7\u0005\u001f"+
		"\u0000\u0000\u00f7\u00f8\u0005\t\u0000\u0000\u00f8\u00f9\u0005\"\u0000"+
		"\u0000\u00f9\u00fa\u0003r9\u0000\u00fa\u00fe\u0005\n\u0000\u0000\u00fb"+
		"\u00fd\u0003\f\u0006\u0000\u00fc\u00fb\u0001\u0000\u0000\u0000\u00fd\u0100"+
		"\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00fe\u00ff"+
		"\u0001\u0000\u0000\u0000\u00ff\u0101\u0001\u0000\u0000\u0000\u0100\u00fe"+
		"\u0001\u0000\u0000\u0000\u0101\u0102\u0005\n\u0000\u0000\u0102\u0007\u0001"+
		"\u0000\u0000\u0000\u0103\u010a\u0003\u000e\u0007\u0000\u0104\u010a\u0003"+
		"\u001c\u000e\u0000\u0105\u010a\u0003\u001e\u000f\u0000\u0106\u010a\u0003"+
		" \u0010\u0000\u0107\u010a\u0003(\u0014\u0000\u0108\u010a\u0003$\u0012"+
		"\u0000\u0109\u0103\u0001\u0000\u0000\u0000\u0109\u0104\u0001\u0000\u0000"+
		"\u0000\u0109\u0105\u0001\u0000\u0000\u0000\u0109\u0106\u0001\u0000\u0000"+
		"\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u0109\u0108\u0001\u0000\u0000"+
		"\u0000\u010a\t\u0001\u0000\u0000\u0000\u010b\u0111\u0003\u001c\u000e\u0000"+
		"\u010c\u0111\u0003(\u0014\u0000\u010d\u0111\u0003*\u0015\u0000\u010e\u0111"+
		"\u00038\u001c\u0000\u010f\u0111\u0003,\u0016\u0000\u0110\u010b\u0001\u0000"+
		"\u0000\u0000\u0110\u010c\u0001\u0000\u0000\u0000\u0110\u010d\u0001\u0000"+
		"\u0000\u0000\u0110\u010e\u0001\u0000\u0000\u0000\u0110\u010f\u0001\u0000"+
		"\u0000\u0000\u0111\u000b\u0001\u0000\u0000\u0000\u0112\u011d\u0003\u0010"+
		"\b\u0000\u0113\u011d\u0003\u001c\u000e\u0000\u0114\u011d\u0003(\u0014"+
		"\u0000\u0115\u011d\u0003\u0012\t\u0000\u0116\u011d\u0003\u0014\n\u0000"+
		"\u0117\u011d\u0003\u0018\f\u0000\u0118\u011d\u0003\u001a\r\u0000\u0119"+
		"\u011d\u0003<\u001e\u0000\u011a\u011d\u0003:\u001d\u0000\u011b\u011d\u0003"+
		">\u001f\u0000\u011c\u0112\u0001\u0000\u0000\u0000\u011c\u0113\u0001\u0000"+
		"\u0000\u0000\u011c\u0114\u0001\u0000\u0000\u0000\u011c\u0115\u0001\u0000"+
		"\u0000\u0000\u011c\u0116\u0001\u0000\u0000\u0000\u011c\u0117\u0001\u0000"+
		"\u0000\u0000\u011c\u0118\u0001\u0000\u0000\u0000\u011c\u0119\u0001\u0000"+
		"\u0000\u0000\u011c\u011a\u0001\u0000\u0000\u0000\u011c\u011b\u0001\u0000"+
		"\u0000\u0000\u011d\r\u0001\u0000\u0000\u0000\u011e\u011f\u0005\t\u0000"+
		"\u0000\u011f\u0120\u0005\u000f\u0000\u0000\u0120\u0122\u0005#\u0000\u0000"+
		"\u0121\u0123\u0003t:\u0000\u0122\u0121\u0001\u0000\u0000\u0000\u0123\u0124"+
		"\u0001\u0000\u0000\u0000\u0124\u0122\u0001\u0000\u0000\u0000\u0124\u0125"+
		"\u0001\u0000\u0000\u0000\u0125\u0126\u0001\u0000\u0000\u0000\u0126\u0127"+
		"\u0005\n\u0000\u0000\u0127\u000f\u0001\u0000\u0000\u0000\u0128\u0129\u0005"+
		"\t\u0000\u0000\u0129\u012a\u0005\u000f\u0000\u0000\u012a\u012b\u0005 "+
		"\u0000\u0000\u012b\u012c\u0003p8\u0000\u012c\u012d\u0005\n\u0000\u0000"+
		"\u012d\u0011\u0001\u0000\u0000\u0000\u012e\u012f\u0005\t\u0000\u0000\u012f"+
		"\u0130\u0005\u000f\u0000\u0000\u0130\u0131\u0005>\u0000\u0000\u0131\u0132"+
		"\u0003\u00ceg\u0000\u0132\u0133\u0005\n\u0000\u0000\u0133\u0013\u0001"+
		"\u0000\u0000\u0000\u0134\u0135\u0005\t\u0000\u0000\u0135\u0136\u0005\u000f"+
		"\u0000\u0000\u0136\u0138\u0005?\u0000\u0000\u0137\u0139\u0003\u0016\u000b"+
		"\u0000\u0138\u0137\u0001\u0000\u0000\u0000\u0139\u013a\u0001\u0000\u0000"+
		"\u0000\u013a\u0138\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000"+
		"\u0000\u013b\u013c\u0001\u0000\u0000\u0000\u013c\u013d\u0005\n\u0000\u0000"+
		"\u013d\u0015\u0001\u0000\u0000\u0000\u013e\u013f\u0005\t\u0000\u0000\u013f"+
		"\u0140\u0003\u00ba]\u0000\u0140\u0141\u0005\u0018\u0000\u0000\u0141\u0142"+
		"\u0005\t\u0000\u0000\u0142\u0146\u0003~?\u0000\u0143\u0145\u0003~?\u0000"+
		"\u0144\u0143\u0001\u0000\u0000\u0000\u0145\u0148\u0001\u0000\u0000\u0000"+
		"\u0146\u0144\u0001\u0000\u0000\u0000\u0146\u0147\u0001\u0000\u0000\u0000"+
		"\u0147\u0149\u0001\u0000\u0000\u0000\u0148\u0146\u0001\u0000\u0000\u0000"+
		"\u0149\u014a\u0005\n\u0000\u0000\u014a\u014b\u0005\n\u0000\u0000\u014b"+
		"\u0017\u0001\u0000\u0000\u0000\u014c\u014d\u0005\t\u0000\u0000\u014d\u014e"+
		"\u0005\u000f\u0000\u0000\u014e\u014f\u0005;\u0000\u0000\u014f\u0150\u0003"+
		"H$\u0000\u0150\u0151\u0005\n\u0000\u0000\u0151\u0019\u0001\u0000\u0000"+
		"\u0000\u0152\u0153\u0005\t\u0000\u0000\u0153\u0154\u0005\u000f\u0000\u0000"+
		"\u0154\u0156\u0005<\u0000\u0000\u0155\u0157\u0003\u0082A\u0000\u0156\u0155"+
		"\u0001\u0000\u0000\u0000\u0157\u0158\u0001\u0000\u0000\u0000\u0158\u0156"+
		"\u0001\u0000\u0000\u0000\u0158\u0159\u0001\u0000\u0000\u0000\u0159\u015a"+
		"\u0001\u0000\u0000\u0000\u015a\u015b\u0005\n\u0000\u0000\u015b\u001b\u0001"+
		"\u0000\u0000\u0000\u015c\u015d\u0005\t\u0000\u0000\u015d\u015e\u0005\u000f"+
		"\u0000\u0000\u015e\u0162\u0005$\u0000\u0000\u015f\u0161\u0003\u00d2i\u0000"+
		"\u0160\u015f\u0001\u0000\u0000\u0000\u0161\u0164\u0001\u0000\u0000\u0000"+
		"\u0162\u0160\u0001\u0000\u0000\u0000\u0162\u0163\u0001\u0000\u0000\u0000"+
		"\u0163\u0165\u0001\u0000\u0000\u0000\u0164\u0162\u0001\u0000\u0000\u0000"+
		"\u0165\u0166\u0005\n\u0000\u0000\u0166\u001d\u0001\u0000\u0000\u0000\u0167"+
		"\u0168\u0005\t\u0000\u0000\u0168\u0169\u0005\u000f\u0000\u0000\u0169\u016a"+
		"\u0005%\u0000\u0000\u016a\u016b\u0003H$\u0000\u016b\u016c\u0005\n\u0000"+
		"\u0000\u016c\u001f\u0001\u0000\u0000\u0000\u016d\u016e\u0005\t\u0000\u0000"+
		"\u016e\u016f\u0005\u000f\u0000\u0000\u016f\u0171\u0005+\u0000\u0000\u0170"+
		"\u0172\u0003\"\u0011\u0000\u0171\u0170\u0001\u0000\u0000\u0000\u0172\u0173"+
		"\u0001\u0000\u0000\u0000\u0173\u0171\u0001\u0000\u0000\u0000\u0173\u0174"+
		"\u0001\u0000\u0000\u0000\u0174\u0175\u0001\u0000\u0000\u0000\u0175\u0176"+
		"\u0005\n\u0000\u0000\u0176!\u0001\u0000\u0000\u0000\u0177\u0178\u0005"+
		"\t\u0000\u0000\u0178\u0179\u0003n7\u0000\u0179\u017a\u0003J%\u0000\u017a"+
		"\u017b\u0005\n\u0000\u0000\u017b#\u0001\u0000\u0000\u0000\u017c\u017d"+
		"\u0005\t\u0000\u0000\u017d\u017e\u0005\u000f\u0000\u0000\u017e\u017f\u0005"+
		"-\u0000\u0000\u017f\u0180\u0003z=\u0000\u0180\u0181\u0003&\u0013\u0000"+
		"\u0181\u0182\u0003@ \u0000\u0182\u0183\u0003B!\u0000\u0183\u0184\u0003"+
		"D\"\u0000\u0184\u0185\u0003F#\u0000\u0185\u0186\u0005\n\u0000\u0000\u0186"+
		"%\u0001\u0000\u0000\u0000\u0187\u0188\u0005\u000f\u0000\u0000\u0188\u0189"+
		"\u0005.\u0000\u0000\u0189\u018a\u0005\t\u0000\u0000\u018a\u018b\u0003"+
		"J%\u0000\u018b\u018c\u0005\n\u0000\u0000\u018c\'\u0001\u0000\u0000\u0000"+
		"\u018d\u018e\u0005\t\u0000\u0000\u018e\u018f\u0005\u000f\u0000\u0000\u018f"+
		"\u0193\u0005,\u0000\u0000\u0190\u0192\u0003\u0080@\u0000\u0191\u0190\u0001"+
		"\u0000\u0000\u0000\u0192\u0195\u0001\u0000\u0000\u0000\u0193\u0191\u0001"+
		"\u0000\u0000\u0000\u0193\u0194\u0001\u0000\u0000\u0000\u0194\u0196\u0001"+
		"\u0000\u0000\u0000\u0195\u0193\u0001\u0000\u0000\u0000\u0196\u0197\u0005"+
		"\n\u0000\u0000\u0197)\u0001\u0000\u0000\u0000\u0198\u0199\u0005\t\u0000"+
		"\u0000\u0199\u019a\u0005\u000f\u0000\u0000\u019a\u019e\u0005/\u0000\u0000"+
		"\u019b\u019d\u0003\u00b8\\\u0000\u019c\u019b\u0001\u0000\u0000\u0000\u019d"+
		"\u01a0\u0001\u0000\u0000\u0000\u019e\u019c\u0001\u0000\u0000\u0000\u019e"+
		"\u019f\u0001\u0000\u0000\u0000\u019f\u01a1\u0001\u0000\u0000\u0000\u01a0"+
		"\u019e\u0001\u0000\u0000\u0000\u01a1\u01a2\u0005\n\u0000\u0000\u01a2+"+
		"\u0001\u0000\u0000\u0000\u01a3\u01a4\u0005\t\u0000\u0000\u01a4\u01a5\u0005"+
		"\u000f\u0000\u0000\u01a5\u01a6\u00051\u0000\u0000\u01a6\u01a7\u0003|>"+
		"\u0000\u01a7\u01a8\u0003&\u0013\u0000\u01a8\u01a9\u0003.\u0017\u0000\u01a9"+
		"\u01aa\u00030\u0018\u0000\u01aa\u01ab\u0005\n\u0000\u0000\u01ab-\u0001"+
		"\u0000\u0000\u0000\u01ac\u01ad\u0005\u000f\u0000\u0000\u01ad\u01ae\u0005"+
		"2\u0000\u0000\u01ae\u01af\u0003\u00a8T\u0000\u01af/\u0001\u0000\u0000"+
		"\u0000\u01b0\u01b1\u0005\u000f\u0000\u0000\u01b1\u01b2\u00053\u0000\u0000"+
		"\u01b2\u01b5\u00032\u0019\u0000\u01b3\u01b5\u0001\u0000\u0000\u0000\u01b4"+
		"\u01b0\u0001\u0000\u0000\u0000\u01b4\u01b3\u0001\u0000\u0000\u0000\u01b5"+
		"1\u0001\u0000\u0000\u0000\u01b6\u01b7\u0005\t\u0000\u0000\u01b7\u01bb"+
		"\u0005\u000f\u0000\u0000\u01b8\u01ba\u00034\u001a\u0000\u01b9\u01b8\u0001"+
		"\u0000\u0000\u0000\u01ba\u01bd\u0001\u0000\u0000\u0000\u01bb\u01b9\u0001"+
		"\u0000\u0000\u0000\u01bb\u01bc\u0001\u0000\u0000\u0000\u01bc\u01be\u0001"+
		"\u0000\u0000\u0000\u01bd\u01bb\u0001\u0000\u0000\u0000\u01be\u01bf\u0005"+
		"\n\u0000\u0000\u01bf3\u0001\u0000\u0000\u0000\u01c0\u01cd\u00036\u001b"+
		"\u0000\u01c1\u01c2\u0005\t\u0000\u0000\u01c2\u01c3\u0005\u0015\u0000\u0000"+
		"\u01c3\u01c4\u0005\t\u0000\u0000\u01c4\u01c5\u0003J%\u0000\u01c5\u01c6"+
		"\u0005\n\u0000\u0000\u01c6\u01c7\u00036\u001b\u0000\u01c7\u01c8\u0005"+
		"\n\u0000\u0000\u01c8\u01cd\u0001\u0000\u0000\u0000\u01c9\u01ca\u0005\t"+
		"\u0000\u0000\u01ca\u01cb\u0005\u0004\u0000\u0000\u01cb\u01cd\u0005\n\u0000"+
		"\u0000\u01cc\u01c0\u0001\u0000\u0000\u0000\u01cc\u01c1\u0001\u0000\u0000"+
		"\u0000\u01cc\u01c9\u0001\u0000\u0000\u0000\u01cd5\u0001\u0000\u0000\u0000"+
		"\u01ce\u01cf\u0005\t\u0000\u0000\u01cf\u01d0\u0005\u001a\u0000\u0000\u01d0"+
		"\u01d1\u0003\u00a8T\u0000\u01d1\u01d2\u0003\u009aM\u0000\u01d2\u01d3\u0005"+
		"\n\u0000\u0000\u01d3\u01e0\u0001\u0000\u0000\u0000\u01d4\u01d5\u0005\t"+
		"\u0000\u0000\u01d5\u01d6\u0005\u001b\u0000\u0000\u01d6\u01d7\u0003\u00a8"+
		"T\u0000\u01d7\u01d8\u0003\u009aM\u0000\u01d8\u01d9\u0005\n\u0000\u0000"+
		"\u01d9\u01e0\u0001\u0000\u0000\u0000\u01da\u01db\u0005\t\u0000\u0000\u01db"+
		"\u01dc\u0005\u001c\u0000\u0000\u01dc\u01dd\u0003\u009aM\u0000\u01dd\u01de"+
		"\u0005\n\u0000\u0000\u01de\u01e0\u0001\u0000\u0000\u0000\u01df\u01ce\u0001"+
		"\u0000\u0000\u0000\u01df\u01d4\u0001\u0000\u0000\u0000\u01df\u01da\u0001"+
		"\u0000\u0000\u0000\u01e07\u0001\u0000\u0000\u0000\u01e1\u01e2\u0005\t"+
		"\u0000\u0000\u01e2\u01e3\u0005\u000f\u0000\u0000\u01e3\u01e4\u0005C\u0000"+
		"\u0000\u01e4\u01e5\u0003\u00a2Q\u0000\u01e5\u01e6\u0003&\u0013\u0000\u01e6"+
		"\u01e7\u0003\u00be_\u0000\u01e7\u01e8\u0003\u00c0`\u0000\u01e8\u01e9\u0003"+
		"\u00c4b\u0000\u01e9\u01ea\u0003\u00ccf\u0000\u01ea\u01eb\u0005\n\u0000"+
		"\u0000\u01eb9\u0001\u0000\u0000\u0000\u01ec\u01ed\u0005\t\u0000\u0000"+
		"\u01ed\u01ee\u0005\u000f\u0000\u0000\u01ee\u01ef\u00054\u0000\u0000\u01ef"+
		"\u01f0\u0003v;\u0000\u01f0\u01f1\u0003\u0086C\u0000\u01f1\u01f2\u0003"+
		"\u0088D\u0000\u01f2\u01f3\u0003\u0090H\u0000\u01f3\u01f4\u0003\u0096K"+
		"\u0000\u01f4\u01f5\u0005\n\u0000\u0000\u01f5;\u0001\u0000\u0000\u0000"+
		"\u01f6\u01f7\u0005\t\u0000\u0000\u01f7\u01f8\u0005\u000f\u0000\u0000\u01f8"+
		"\u01f9\u00055\u0000\u0000\u01f9\u01fa\u0003\u009cN\u0000\u01fa\u01fb\u0005"+
		"\n\u0000\u0000\u01fb=\u0001\u0000\u0000\u0000\u01fc\u01fd\u0005\t\u0000"+
		"\u0000\u01fd\u01fe\u0005\u000f\u0000\u0000\u01fe\u01ff\u00056\u0000\u0000"+
		"\u01ff\u0200\u0003P(\u0000\u0200\u0201\u0005\n\u0000\u0000\u0201?\u0001"+
		"\u0000\u0000\u0000\u0202\u0203\u0005\u000f\u0000\u0000\u0203\u0204\u0005"+
		"7\u0000\u0000\u0204\u0207\u0003R)\u0000\u0205\u0207\u0001\u0000\u0000"+
		"\u0000\u0206\u0202\u0001\u0000\u0000\u0000\u0206\u0205\u0001\u0000\u0000"+
		"\u0000\u0207A\u0001\u0000\u0000\u0000\u0208\u0209\u0005\u000f\u0000\u0000"+
		"\u0209\u020a\u0005C\u0000\u0000\u020a\u020b\u0005\t\u0000\u0000\u020b"+
		"\u020f\u0003\u00a2Q\u0000\u020c\u020e\u0003\u00a4R\u0000\u020d\u020c\u0001"+
		"\u0000\u0000\u0000\u020e\u0211\u0001\u0000\u0000\u0000\u020f\u020d\u0001"+
		"\u0000\u0000\u0000\u020f\u0210\u0001\u0000\u0000\u0000\u0210\u0212\u0001"+
		"\u0000\u0000\u0000\u0211\u020f\u0001\u0000\u0000\u0000\u0212\u0213\u0005"+
		"\n\u0000\u0000\u0213C\u0001\u0000\u0000\u0000\u0214\u0215\u0005\u000f"+
		"\u0000\u0000\u0215\u0216\u00052\u0000\u0000\u0216\u0217\u0003\u00a8T\u0000"+
		"\u0217E\u0001\u0000\u0000\u0000\u0218\u0219\u0005\u000f\u0000\u0000\u0219"+
		"\u021d\u0005B\u0000\u0000\u021a\u021c\u0003\u00aaU\u0000\u021b\u021a\u0001"+
		"\u0000\u0000\u0000\u021c\u021f\u0001\u0000\u0000\u0000\u021d\u021b\u0001"+
		"\u0000\u0000\u0000\u021d\u021e\u0001\u0000\u0000\u0000\u021e\u0222\u0001"+
		"\u0000\u0000\u0000\u021f\u021d\u0001\u0000\u0000\u0000\u0220\u0222\u0001"+
		"\u0000\u0000\u0000\u0221\u0218\u0001\u0000\u0000\u0000\u0221\u0220\u0001"+
		"\u0000\u0000\u0000\u0222G\u0001\u0000\u0000\u0000\u0223\u0227\u0005\u0001"+
		"\u0000\u0000\u0224\u0226\u0005\u0001\u0000\u0000\u0225\u0224\u0001\u0000"+
		"\u0000\u0000\u0226\u0229\u0001\u0000\u0000\u0000\u0227\u0225\u0001\u0000"+
		"\u0000\u0000\u0227\u0228\u0001\u0000\u0000\u0000\u0228\u022a\u0001\u0000"+
		"\u0000\u0000\u0229\u0227\u0001\u0000\u0000\u0000\u022a\u022b\u0005\u0018"+
		"\u0000\u0000\u022b\u022c\u0003L&\u0000\u022c\u022d\u0003H$\u0000\u022d"+
		"\u022f\u0001\u0000\u0000\u0000\u022e\u0223\u0001\u0000\u0000\u0000\u022f"+
		"\u0232\u0001\u0000\u0000\u0000\u0230\u022e\u0001\u0000\u0000\u0000\u0230"+
		"\u0231\u0001\u0000\u0000\u0000\u0231I\u0001\u0000\u0000\u0000\u0232\u0230"+
		"\u0001\u0000\u0000\u0000\u0233\u0237\u0005\u0004\u0000\u0000\u0234\u0236"+
		"\u0005\u0004\u0000\u0000\u0235\u0234\u0001\u0000\u0000\u0000\u0236\u0239"+
		"\u0001\u0000\u0000\u0000\u0237\u0235\u0001\u0000\u0000\u0000\u0237\u0238"+
		"\u0001\u0000\u0000\u0000\u0238\u023a\u0001\u0000\u0000\u0000\u0239\u0237"+
		"\u0001\u0000\u0000\u0000\u023a\u023b\u0005\u0018\u0000\u0000\u023b\u023c"+
		"\u0003L&\u0000\u023c\u023d\u0003J%\u0000\u023d\u023f\u0001\u0000\u0000"+
		"\u0000\u023e\u0233\u0001\u0000\u0000\u0000\u023f\u0242\u0001\u0000\u0000"+
		"\u0000\u0240\u023e\u0001\u0000\u0000\u0000\u0240\u0241\u0001\u0000\u0000"+
		"\u0000\u0241K\u0001\u0000\u0000\u0000\u0242\u0240\u0001\u0000\u0000\u0000"+
		"\u0243\u0246\u0003N\'\u0000\u0244\u0246\u0005\u0001\u0000\u0000\u0245"+
		"\u0243\u0001\u0000\u0000\u0000\u0245\u0244\u0001\u0000\u0000\u0000\u0246"+
		"M\u0001\u0000\u0000\u0000\u0247\u0248\u0007\u0000\u0000\u0000\u0248O\u0001"+
		"\u0000\u0000\u0000\u0249\u024a\u0005\t\u0000\u0000\u024a\u024b\u0005\u0010"+
		"\u0000\u0000\u024b\u024c\u0003P(\u0000\u024c\u024d\u0003P(\u0000\u024d"+
		"\u024e\u0005\n\u0000\u0000\u024e\u0282\u0001\u0000\u0000\u0000\u024f\u0250"+
		"\u0005\t\u0000\u0000\u0250\u0251\u0005\u0011\u0000\u0000\u0251\u0255\u0003"+
		"P(\u0000\u0252\u0254\u0003P(\u0000\u0253\u0252\u0001\u0000\u0000\u0000"+
		"\u0254\u0257\u0001\u0000\u0000\u0000\u0255\u0253\u0001\u0000\u0000\u0000"+
		"\u0255\u0256\u0001\u0000\u0000\u0000\u0256\u0258\u0001\u0000\u0000\u0000"+
		"\u0257\u0255\u0001\u0000\u0000\u0000\u0258\u0259\u0005\n\u0000\u0000\u0259"+
		"\u0282\u0001\u0000\u0000\u0000\u025a\u025b\u0005\t\u0000\u0000\u025b\u025c"+
		"\u0005\u0012\u0000\u0000\u025c\u0260\u0003P(\u0000\u025d\u025f\u0003P"+
		"(\u0000\u025e\u025d\u0001\u0000\u0000\u0000\u025f\u0262\u0001\u0000\u0000"+
		"\u0000\u0260\u025e\u0001\u0000\u0000\u0000\u0260\u0261\u0001\u0000\u0000"+
		"\u0000\u0261\u0263\u0001\u0000\u0000\u0000\u0262\u0260\u0001\u0000\u0000"+
		"\u0000\u0263\u0264\u0005\n\u0000\u0000\u0264\u0282\u0001\u0000\u0000\u0000"+
		"\u0265\u0266\u0005\t\u0000\u0000\u0266\u0267\u0005\u0013\u0000\u0000\u0267"+
		"\u0268\u0003P(\u0000\u0268\u0269\u0005\n\u0000\u0000\u0269\u0282\u0001"+
		"\u0000\u0000\u0000\u026a\u026b\u0005\t\u0000\u0000\u026b\u026c\u0005\u0014"+
		"\u0000\u0000\u026c\u026d\u0005\t\u0000\u0000\u026d\u026e\u0003J%\u0000"+
		"\u026e\u026f\u0005\n\u0000\u0000\u026f\u0270\u0003P(\u0000\u0270\u0271"+
		"\u0005\n\u0000\u0000\u0271\u0282\u0001\u0000\u0000\u0000\u0272\u0273\u0005"+
		"\t\u0000\u0000\u0273\u0274\u0005\u0015\u0000\u0000\u0274\u0275\u0005\t"+
		"\u0000\u0000\u0275\u0276\u0003J%\u0000\u0276\u0277\u0005\n\u0000\u0000"+
		"\u0277\u0278\u0003P(\u0000\u0278\u0279\u0005\n\u0000\u0000\u0279\u0282"+
		"\u0001\u0000\u0000\u0000\u027a\u027b\u0003`0\u0000\u027b\u027c\u0003P"+
		"(\u0000\u027c\u0282\u0001\u0000\u0000\u0000\u027d\u0282\u0003X,\u0000"+
		"\u027e\u0282\u0003Z-\u0000\u027f\u0282\u0005\u0016\u0000\u0000\u0280\u0282"+
		"\u0005\u0017\u0000\u0000\u0281\u0249\u0001\u0000\u0000\u0000\u0281\u024f"+
		"\u0001\u0000\u0000\u0000\u0281\u025a\u0001\u0000\u0000\u0000\u0281\u0265"+
		"\u0001\u0000\u0000\u0000\u0281\u026a\u0001\u0000\u0000\u0000\u0281\u0272"+
		"\u0001\u0000\u0000\u0000\u0281\u027a\u0001\u0000\u0000\u0000\u0281\u027d"+
		"\u0001\u0000\u0000\u0000\u0281\u027e\u0001\u0000\u0000\u0000\u0281\u027f"+
		"\u0001\u0000\u0000\u0000\u0281\u0280\u0001\u0000\u0000\u0000\u0282Q\u0001"+
		"\u0000\u0000\u0000\u0283\u0284\u0005\t\u0000\u0000\u0284\u0285\u0005\u0012"+
		"\u0000\u0000\u0285\u0289\u0003T*\u0000\u0286\u0288\u0003T*\u0000\u0287"+
		"\u0286\u0001\u0000\u0000\u0000\u0288\u028b\u0001\u0000\u0000\u0000\u0289"+
		"\u0287\u0001\u0000\u0000\u0000\u0289\u028a\u0001\u0000\u0000\u0000\u028a"+
		"\u028c\u0001\u0000\u0000\u0000\u028b\u0289\u0001\u0000\u0000\u0000\u028c"+
		"\u028d\u0005\n\u0000\u0000\u028d\u0290\u0001\u0000\u0000\u0000\u028e\u0290"+
		"\u0003T*\u0000\u028f\u0283\u0001\u0000\u0000\u0000\u028f\u028e\u0001\u0000"+
		"\u0000\u0000\u0290S\u0001\u0000\u0000\u0000\u0291\u0298\u0003V+\u0000"+
		"\u0292\u0293\u0005\t\u0000\u0000\u0293\u0294\u0005\u0013\u0000\u0000\u0294"+
		"\u0295\u0003V+\u0000\u0295\u0296\u0005\n\u0000\u0000\u0296\u0298\u0001"+
		"\u0000\u0000\u0000\u0297\u0291\u0001\u0000\u0000\u0000\u0297\u0292\u0001"+
		"\u0000\u0000\u0000\u0298U\u0001\u0000\u0000\u0000\u0299\u029a\u0005\t"+
		"\u0000\u0000\u029a\u029e\u0003n7\u0000\u029b\u029d\u0003\\.\u0000\u029c"+
		"\u029b\u0001\u0000\u0000\u0000\u029d\u02a0\u0001\u0000\u0000\u0000\u029e"+
		"\u029c\u0001\u0000\u0000\u0000\u029e\u029f\u0001\u0000\u0000\u0000\u029f"+
		"\u02a1\u0001\u0000\u0000\u0000\u02a0\u029e\u0001\u0000\u0000\u0000\u02a1"+
		"\u02a2\u0005\n\u0000\u0000\u02a2\u02aa\u0001\u0000\u0000\u0000\u02a3\u02a4"+
		"\u0005\t\u0000\u0000\u02a4\u02a5\u0005\u0018\u0000\u0000\u02a5\u02a6\u0003"+
		"\\.\u0000\u02a6\u02a7\u0003\\.\u0000\u02a7\u02a8\u0005\n\u0000\u0000\u02a8"+
		"\u02aa\u0001\u0000\u0000\u0000\u02a9\u0299\u0001\u0000\u0000\u0000\u02a9"+
		"\u02a3\u0001\u0000\u0000\u0000\u02aaW\u0001\u0000\u0000\u0000\u02ab\u02ac"+
		"\u0005\t\u0000\u0000\u02ac\u02b0\u0003n7\u0000\u02ad\u02af\u0003\\.\u0000"+
		"\u02ae\u02ad\u0001\u0000\u0000\u0000\u02af\u02b2\u0001\u0000\u0000\u0000"+
		"\u02b0\u02ae\u0001\u0000\u0000\u0000\u02b0\u02b1\u0001\u0000\u0000\u0000"+
		"\u02b1\u02b3\u0001\u0000\u0000\u0000\u02b2\u02b0\u0001\u0000\u0000\u0000"+
		"\u02b3\u02b4\u0005\n\u0000\u0000\u02b4Y\u0001\u0000\u0000\u0000\u02b5"+
		"\u02b6\u0005\t\u0000\u0000\u02b6\u02b7\u0005\u0018\u0000\u0000\u02b7\u02b8"+
		"\u0003\\.\u0000\u02b8\u02b9\u0003\\.\u0000\u02b9\u02ba\u0005\n\u0000\u0000"+
		"\u02ba[\u0001\u0000\u0000\u0000\u02bb\u02be\u0003^/\u0000\u02bc\u02be"+
		"\u0005\u0004\u0000\u0000\u02bd\u02bb\u0001\u0000\u0000\u0000\u02bd\u02bc"+
		"\u0001\u0000\u0000\u0000\u02be]\u0001\u0000\u0000\u0000\u02bf\u02c2\u0005"+
		"\u0001\u0000\u0000\u02c0\u02c2\u0003~?\u0000\u02c1\u02bf\u0001\u0000\u0000"+
		"\u0000\u02c1\u02c0\u0001\u0000\u0000\u0000\u02c2_\u0001\u0000\u0000\u0000"+
		"\u02c3\u02c6\u0003b1\u0000\u02c4\u02c6\u0003d2\u0000\u02c5\u02c3\u0001"+
		"\u0000\u0000\u0000\u02c5\u02c4\u0001\u0000\u0000\u0000\u02c6a\u0001\u0000"+
		"\u0000\u0000\u02c7\u02c8\u0005\t\u0000\u0000\u02c8\u02c9\u0003f3\u0000"+
		"\u02c9\u02ca\u0003h4\u0000\u02ca\u02cb\u0005\n\u0000\u0000\u02cbc\u0001"+
		"\u0000\u0000\u0000\u02cc\u02cd\u0005\t\u0000\u0000\u02cd\u02ce\u0003f"+
		"3\u0000\u02ce\u02cf\u0003j5\u0000\u02cf\u02d0\u0005\n\u0000\u0000\u02d0"+
		"e\u0001\u0000\u0000\u0000\u02d1\u02d4\u0003\u0080@\u0000\u02d2\u02d4\u0001"+
		"\u0000\u0000\u0000\u02d3\u02d1\u0001\u0000\u0000\u0000\u02d3\u02d2\u0001"+
		"\u0000\u0000\u0000\u02d4g\u0001\u0000\u0000\u0000\u02d5\u02d9\u0003~?"+
		"\u0000\u02d6\u02d9\u0005\u0004\u0000\u0000\u02d7\u02d9\u0003l6\u0000\u02d8"+
		"\u02d5\u0001\u0000\u0000\u0000\u02d8\u02d6\u0001\u0000\u0000\u0000\u02d8"+
		"\u02d7\u0001\u0000\u0000\u0000\u02d9i\u0001\u0000\u0000\u0000\u02da\u02de"+
		"\u0003h4\u0000\u02db\u02dd\u0003h4\u0000\u02dc\u02db\u0001\u0000\u0000"+
		"\u0000\u02dd\u02e0\u0001\u0000\u0000\u0000\u02de\u02dc\u0001\u0000\u0000"+
		"\u0000\u02de\u02df\u0001\u0000\u0000\u0000\u02dfk\u0001\u0000\u0000\u0000"+
		"\u02e0\u02de\u0001\u0000\u0000\u0000\u02e1\u02e2\u00050\u0000\u0000\u02e2"+
		"m\u0001\u0000\u0000\u0000\u02e3\u02e4\u0005\u0001\u0000\u0000\u02e4o\u0001"+
		"\u0000\u0000\u0000\u02e5\u02e6\u0005\u0001\u0000\u0000\u02e6q\u0001\u0000"+
		"\u0000\u0000\u02e7\u02e8\u0005\u0001\u0000\u0000\u02e8s\u0001\u0000\u0000"+
		"\u0000\u02e9\u02ea\u0005\u0001\u0000\u0000\u02eau\u0001\u0000\u0000\u0000"+
		"\u02eb\u02ec\u0005\u0001\u0000\u0000\u02ecw\u0001\u0000\u0000\u0000\u02ed"+
		"\u02ee\u0005\u0001\u0000\u0000\u02eey\u0001\u0000\u0000\u0000\u02ef\u02f0"+
		"\u0005\u0001\u0000\u0000\u02f0{\u0001\u0000\u0000\u0000\u02f1\u02f2\u0005"+
		"\u0001\u0000\u0000\u02f2}\u0001\u0000\u0000\u0000\u02f3\u02f4\u0005\u0002"+
		"\u0000\u0000\u02f4\u007f\u0001\u0000\u0000\u0000\u02f5\u02f6\u0005\u0003"+
		"\u0000\u0000\u02f6\u0081\u0001\u0000\u0000\u0000\u02f7\u02f8\u0005\t\u0000"+
		"\u0000\u02f8\u02fc\u0003n7\u0000\u02f9\u02fb\u0003\u0084B\u0000\u02fa"+
		"\u02f9\u0001\u0000\u0000\u0000\u02fb\u02fe\u0001\u0000\u0000\u0000\u02fc"+
		"\u02fa\u0001\u0000\u0000\u0000\u02fc\u02fd\u0001\u0000\u0000\u0000\u02fd"+
		"\u02ff\u0001\u0000\u0000\u0000\u02fe\u02fc\u0001\u0000\u0000\u0000\u02ff"+
		"\u0300\u0005\n\u0000\u0000\u0300\u0083\u0001\u0000\u0000\u0000\u0301\u0304"+
		"\u0005\u0001\u0000\u0000\u0302\u0304\u0003~?\u0000\u0303\u0301\u0001\u0000"+
		"\u0000\u0000\u0303\u0302\u0001\u0000\u0000\u0000\u0304\u0085\u0001\u0000"+
		"\u0000\u0000\u0305\u0306\u0005\u000f\u0000\u0000\u0306\u0307\u0005D\u0000"+
		"\u0000\u0307\u0309\u0005\t\u0000\u0000\u0308\u030a\u0003x<\u0000\u0309"+
		"\u0308\u0001\u0000\u0000\u0000\u030a\u030b\u0001\u0000\u0000\u0000\u030b"+
		"\u0309\u0001\u0000\u0000\u0000\u030b\u030c\u0001\u0000\u0000\u0000\u030c"+
		"\u030d\u0001\u0000\u0000\u0000\u030d\u030e\u0005\n\u0000\u0000\u030e\u0087"+
		"\u0001\u0000\u0000\u0000\u030f\u0310\u0005\u000f\u0000\u0000\u0310\u0311"+
		"\u00058\u0000\u0000\u0311\u0312\u0003\u008aE\u0000\u0312\u0089\u0001\u0000"+
		"\u0000\u0000\u0313\u0315\u0003\u008cF\u0000\u0314\u0313\u0001\u0000\u0000"+
		"\u0000\u0315\u0316\u0001\u0000\u0000\u0000\u0316\u0314\u0001\u0000\u0000"+
		"\u0000\u0316\u0317\u0001\u0000\u0000\u0000\u0317\u031c\u0001\u0000\u0000"+
		"\u0000\u0318\u0319\u0005\t\u0000\u0000\u0319\u031a\u0005E\u0000\u0000"+
		"\u031a\u031c\u0005\n\u0000\u0000\u031b\u0314\u0001\u0000\u0000\u0000\u031b"+
		"\u0318\u0001\u0000\u0000\u0000\u031c\u008b\u0001\u0000\u0000\u0000\u031d"+
		"\u031e\u0005\t\u0000\u0000\u031e\u0320\u0003\u0098L\u0000\u031f\u0321"+
		"\u0003\u008eG\u0000\u0320\u031f\u0001\u0000\u0000\u0000\u0321\u0322\u0001"+
		"\u0000\u0000\u0000\u0322\u0320\u0001\u0000\u0000\u0000\u0322\u0323\u0001"+
		"\u0000\u0000\u0000\u0323\u0324\u0001\u0000\u0000\u0000\u0324\u0325\u0005"+
		"\n\u0000\u0000\u0325\u008d\u0001\u0000\u0000\u0000\u0326\u0327\u0005\t"+
		"\u0000\u0000\u0327\u0328\u0003x<\u0000\u0328\u0329\u0003x<\u0000\u0329"+
		"\u032a\u0005\n\u0000\u0000\u032a\u008f\u0001\u0000\u0000\u0000\u032b\u032c"+
		"\u0005\u000f\u0000\u0000\u032c\u032d\u0005@\u0000\u0000\u032d\u032e\u0003"+
		"\u0092I\u0000\u032e\u0091\u0001\u0000\u0000\u0000\u032f\u0331\u0003\u0094"+
		"J\u0000\u0330\u032f\u0001\u0000\u0000\u0000\u0331\u0332\u0001\u0000\u0000"+
		"\u0000\u0332\u0330\u0001\u0000\u0000\u0000\u0332\u0333\u0001\u0000\u0000"+
		"\u0000\u0333\u0338\u0001\u0000\u0000\u0000\u0334\u0335\u0005\t\u0000\u0000"+
		"\u0335\u0336\u0005E\u0000\u0000\u0336\u0338\u0005\n\u0000\u0000\u0337"+
		"\u0330\u0001\u0000\u0000\u0000\u0337\u0334\u0001\u0000\u0000\u0000\u0338"+
		"\u0093\u0001\u0000\u0000\u0000\u0339\u033a\u0005\t\u0000\u0000\u033a\u033b"+
		"\u0003x<\u0000\u033b\u033f\u0005\u000b\u0000\u0000\u033c\u033e\u0003\u009a"+
		"M\u0000\u033d\u033c\u0001\u0000\u0000\u0000\u033e\u0341\u0001\u0000\u0000"+
		"\u0000\u033f\u033d\u0001\u0000\u0000\u0000\u033f\u0340\u0001\u0000\u0000"+
		"\u0000\u0340\u0342\u0001\u0000\u0000\u0000\u0341\u033f\u0001\u0000\u0000"+
		"\u0000\u0342\u0343\u0005\f\u0000\u0000\u0343\u0344\u0005\n\u0000\u0000"+
		"\u0344\u0095\u0001\u0000\u0000\u0000\u0345\u0346\u0005\u000f\u0000\u0000"+
		"\u0346\u0347\u00059\u0000\u0000\u0347\u0349\u0005\t\u0000\u0000\u0348"+
		"\u034a\u0003x<\u0000\u0349\u0348\u0001\u0000\u0000\u0000\u034a\u034b\u0001"+
		"\u0000\u0000\u0000\u034b\u0349\u0001\u0000\u0000\u0000\u034b\u034c\u0001"+
		"\u0000\u0000\u0000\u034c\u034d\u0001\u0000\u0000\u0000\u034d\u034e\u0005"+
		"\n\u0000\u0000\u034e\u0097\u0001\u0000\u0000\u0000\u034f\u035b\u0003\u00ba"+
		"]\u0000\u0350\u0351\u0005\r\u0000\u0000\u0351\u0355\u0003~?\u0000\u0352"+
		"\u0354\u0003~?\u0000\u0353\u0352\u0001\u0000\u0000\u0000\u0354\u0357\u0001"+
		"\u0000\u0000\u0000\u0355\u0353\u0001\u0000\u0000\u0000\u0355\u0356\u0001"+
		"\u0000\u0000\u0000\u0356\u0358\u0001\u0000\u0000\u0000\u0357\u0355\u0001"+
		"\u0000\u0000\u0000\u0358\u0359\u0005\u000e\u0000\u0000\u0359\u035b\u0001"+
		"\u0000\u0000\u0000\u035a\u034f\u0001\u0000\u0000\u0000\u035a\u0350\u0001"+
		"\u0000\u0000\u0000\u035b\u0099\u0001\u0000\u0000\u0000\u035c\u0363\u0003"+
		"\u00bc^\u0000\u035d\u035e\u0005\t\u0000\u0000\u035e\u035f\u0005\u0013"+
		"\u0000\u0000\u035f\u0360\u0003\u00bc^\u0000\u0360\u0361\u0005\n\u0000"+
		"\u0000\u0361\u0363\u0001\u0000\u0000\u0000\u0362\u035c\u0001\u0000\u0000"+
		"\u0000\u0362\u035d\u0001\u0000\u0000\u0000\u0363\u009b\u0001\u0000\u0000"+
		"\u0000\u0364\u0366\u0003\u009eO\u0000\u0365\u0364\u0001\u0000\u0000\u0000"+
		"\u0366\u0367\u0001\u0000\u0000\u0000\u0367\u0365\u0001\u0000\u0000\u0000"+
		"\u0367\u0368\u0001\u0000\u0000\u0000\u0368\u0370\u0001\u0000\u0000\u0000"+
		"\u0369\u036a\u0005\t\u0000\u0000\u036a\u036b\u0005\u000f\u0000\u0000\u036b"+
		"\u036c\u0005A\u0000\u0000\u036c\u036d\u0003v;\u0000\u036d\u036e\u0005"+
		"\n\u0000\u0000\u036e\u0370\u0001\u0000\u0000\u0000\u036f\u0365\u0001\u0000"+
		"\u0000\u0000\u036f\u0369\u0001\u0000\u0000\u0000\u0370\u009d\u0001\u0000"+
		"\u0000\u0000\u0371\u037b\u0003\u00a0P\u0000\u0372\u0373\u0005\t\u0000"+
		"\u0000\u0373\u0374\u0005\u0015\u0000\u0000\u0374\u0375\u0005\t\u0000\u0000"+
		"\u0375\u0376\u0003J%\u0000\u0376\u0377\u0005\n\u0000\u0000\u0377\u0378"+
		"\u0003\u00a0P\u0000\u0378\u0379\u0005\n\u0000\u0000\u0379\u037b\u0001"+
		"\u0000\u0000\u0000\u037a\u0371\u0001\u0000\u0000\u0000\u037a\u0372\u0001"+
		"\u0000\u0000\u0000\u037b\u009f\u0001\u0000\u0000\u0000\u037c\u03a2\u0003"+
		"X,\u0000\u037d\u037e\u0005\t\u0000\u0000\u037e\u037f\u0005\u000b\u0000"+
		"\u0000\u037f\u0380\u00050\u0000\u0000\u0380\u0381\u0005\f\u0000\u0000"+
		"\u0381\u0382\u0003X,\u0000\u0382\u0383\u0005\n\u0000\u0000\u0383\u03a2"+
		"\u0001\u0000\u0000\u0000\u0384\u0385\u0005\t\u0000\u0000\u0385\u0386\u0005"+
		"\u000b\u0000\u0000\u0386\u0387\u00050\u0000\u0000\u0387\u0388\u0005\f"+
		"\u0000\u0000\u0388\u0389\u0005\u000b\u0000\u0000\u0389\u038a\u0003~?\u0000"+
		"\u038a\u038b\u0005\f\u0000\u0000\u038b\u038c\u0003X,\u0000\u038c\u038d"+
		"\u0005\n\u0000\u0000\u038d\u03a2\u0001\u0000\u0000\u0000\u038e\u038f\u0005"+
		"\t\u0000\u0000\u038f\u0390\u0005\u000b\u0000\u0000\u0390\u0391\u00050"+
		"\u0000\u0000\u0391\u0392\u0005\f\u0000\u0000\u0392\u0393\u0003\u00d0h"+
		"\u0000\u0393\u0394\u0003X,\u0000\u0394\u0395\u0005\n\u0000\u0000\u0395"+
		"\u03a2\u0001\u0000\u0000\u0000\u0396\u0397\u0005\t\u0000\u0000\u0397\u0398"+
		"\u0005\u000b\u0000\u0000\u0398\u0399\u00050\u0000\u0000\u0399\u039a\u0005"+
		"\f\u0000\u0000\u039a\u039b\u0005\t\u0000\u0000\u039b\u039c\u0005\u0013"+
		"\u0000\u0000\u039c\u039d\u0003\u00d0h\u0000\u039d\u039e\u0003X,\u0000"+
		"\u039e\u039f\u0005\n\u0000\u0000\u039f\u03a0\u0005\n\u0000\u0000\u03a0"+
		"\u03a2\u0001\u0000\u0000\u0000\u03a1\u037c\u0001\u0000\u0000\u0000\u03a1"+
		"\u037d\u0001\u0000\u0000\u0000\u03a1\u0384\u0001\u0000\u0000\u0000\u03a1"+
		"\u038e\u0001\u0000\u0000\u0000\u03a1\u0396\u0001\u0000\u0000\u0000\u03a2"+
		"\u00a1\u0001\u0000\u0000\u0000\u03a3\u03a4\u0005\u0001\u0000\u0000\u03a4"+
		"\u00a3\u0001\u0000\u0000\u0000\u03a5\u03a6\u0005\t\u0000\u0000\u03a6\u03a7"+
		"\u0005\u0004\u0000\u0000\u03a7\u03a8\u0005\u0018\u0000\u0000\u03a8\u03a9"+
		"\u0003\u00a6S\u0000\u03a9\u03aa\u0005\n\u0000\u0000\u03aa\u00a5\u0001"+
		"\u0000\u0000\u0000\u03ab\u03af\u0003\\.\u0000\u03ac\u03af\u0003P(\u0000"+
		"\u03ad\u03af\u00032\u0019\u0000\u03ae\u03ab\u0001\u0000\u0000\u0000\u03ae"+
		"\u03ac\u0001\u0000\u0000\u0000\u03ae\u03ad\u0001\u0000\u0000\u0000\u03af"+
		"\u00a7\u0001\u0000\u0000\u0000\u03b0\u03b4\u0003P(\u0000\u03b1\u03b2\u0005"+
		"\t\u0000\u0000\u03b2\u03b4\u0005\n\u0000\u0000\u03b3\u03b0\u0001\u0000"+
		"\u0000\u0000\u03b3\u03b1\u0001\u0000\u0000\u0000\u03b4\u00a9\u0001\u0000"+
		"\u0000\u0000\u03b5\u03b8\u0003\u00acV\u0000\u03b6\u03b8\u0003\u00aeW\u0000"+
		"\u03b7\u03b5\u0001\u0000\u0000\u0000\u03b7\u03b6\u0001\u0000\u0000\u0000"+
		"\u03b8\u00ab\u0001\u0000\u0000\u0000\u03b9\u03ba\u0005\t\u0000\u0000\u03ba"+
		"\u03bb\u0005\u0015\u0000\u0000\u03bb\u03bc\u0005\t\u0000\u0000\u03bc\u03bd"+
		"\u0005\u0004\u0000\u0000\u03bd\u03be\u0005\u0007\u0000\u0000\u03be\u03bf"+
		"\u0003L&\u0000\u03bf\u03c1\u0005\n\u0000\u0000\u03c0\u03c2\u0003\u00ae"+
		"W\u0000\u03c1\u03c0\u0001\u0000\u0000\u0000\u03c2\u03c3\u0001\u0000\u0000"+
		"\u0000\u03c3\u03c1\u0001\u0000\u0000\u0000\u03c3\u03c4\u0001\u0000\u0000"+
		"\u0000\u03c4\u03c5\u0001\u0000\u0000\u0000\u03c5\u03c6\u0005\n\u0000\u0000"+
		"\u03c6\u00ad\u0001\u0000\u0000\u0000\u03c7\u03cb\u0003\u00b0X\u0000\u03c8"+
		"\u03cb\u0003\u00b2Y\u0000\u03c9\u03cb\u0003\u00b4Z\u0000\u03ca\u03c7\u0001"+
		"\u0000\u0000\u0000\u03ca\u03c8\u0001\u0000\u0000\u0000\u03ca\u03c9\u0001"+
		"\u0000\u0000\u0000\u03cb\u00af\u0001\u0000\u0000\u0000\u03cc\u03cd\u0005"+
		"\t\u0000\u0000\u03cd\u03ce\u0003\u00b6[\u0000\u03ce\u03cf\u0003\u00b8"+
		"\\\u0000\u03cf\u03d0\u0005\n\u0000\u0000\u03d0\u00b1\u0001\u0000\u0000"+
		"\u0000\u03d1\u03d2\u0005\t\u0000\u0000\u03d2\u03d3\u0005\u001d\u0000\u0000"+
		"\u03d3\u03d4\u0003P(\u0000\u03d4\u03d5\u0003\u00b6[\u0000\u03d5\u03d6"+
		"\u0003\u00b8\\\u0000\u03d6\u03d7\u0005\n\u0000\u0000\u03d7\u00b3\u0001"+
		"\u0000\u0000\u0000\u03d8\u03d9\u0005\t\u0000\u0000\u03d9\u03da\u0005\u001e"+
		"\u0000\u0000\u03da\u03db\u0003\u00b6[\u0000\u03db\u03dc\u0003\u00b8\\"+
		"\u0000\u03dc\u03dd\u0005\n\u0000\u0000\u03dd\u00b5\u0001\u0000\u0000\u0000"+
		"\u03de\u03df\u0007\u0001\u0000\u0000\u03df\u00b7\u0001\u0000\u0000\u0000"+
		"\u03e0\u03e4\u0003\u00b6[\u0000\u03e1\u03e3\u0003\u00b6[\u0000\u03e2\u03e1"+
		"\u0001\u0000\u0000\u0000\u03e3\u03e6\u0001\u0000\u0000\u0000\u03e4\u03e2"+
		"\u0001\u0000\u0000\u0000\u03e4\u03e5\u0001\u0000\u0000\u0000\u03e5\u00b9"+
		"\u0001\u0000\u0000\u0000\u03e6\u03e4\u0001\u0000\u0000\u0000\u03e7\u03e8"+
		"\u0007\u0002\u0000\u0000\u03e8\u00bb\u0001\u0000\u0000\u0000\u03e9\u03ea"+
		"\u0005\t\u0000\u0000\u03ea\u03ee\u0003n7\u0000\u03eb\u03ed\u0003\\.\u0000"+
		"\u03ec\u03eb\u0001\u0000\u0000\u0000\u03ed\u03f0\u0001\u0000\u0000\u0000"+
		"\u03ee\u03ec\u0001\u0000\u0000\u0000\u03ee\u03ef\u0001\u0000\u0000\u0000"+
		"\u03ef\u03f1\u0001\u0000\u0000\u0000\u03f0\u03ee\u0001\u0000\u0000\u0000"+
		"\u03f1\u03f2\u0005\n\u0000\u0000\u03f2\u00bd\u0001\u0000\u0000\u0000\u03f3"+
		"\u03f4\u0005\u000f\u0000\u0000\u03f4\u03f5\u0005/\u0000\u0000\u03f5\u03f9"+
		"\u0005\t\u0000\u0000\u03f6\u03f8\u0003\u00b8\\\u0000\u03f7\u03f6\u0001"+
		"\u0000\u0000\u0000\u03f8\u03fb\u0001\u0000\u0000\u0000\u03f9\u03f7\u0001"+
		"\u0000\u0000\u0000\u03f9\u03fa\u0001\u0000\u0000\u0000\u03fa\u03fc\u0001"+
		"\u0000\u0000\u0000\u03fb\u03f9\u0001\u0000\u0000\u0000\u03fc\u03ff\u0005"+
		"\n\u0000\u0000\u03fd\u03ff\u0001\u0000\u0000\u0000\u03fe\u03f3\u0001\u0000"+
		"\u0000\u0000\u03fe\u03fd\u0001\u0000\u0000\u0000\u03ff\u00bf\u0001\u0000"+
		"\u0000\u0000\u0400\u0401\u0005\u000f\u0000\u0000\u0401\u0403\u00051\u0000"+
		"\u0000\u0402\u0404\u0003\u00c2a\u0000\u0403\u0402\u0001\u0000\u0000\u0000"+
		"\u0404\u0405\u0001\u0000\u0000\u0000\u0405\u0403\u0001\u0000\u0000\u0000"+
		"\u0405\u0406\u0001\u0000\u0000\u0000\u0406\u00c1\u0001\u0000\u0000\u0000"+
		"\u0407\u0408\u0005\t\u0000\u0000\u0408\u040c\u0003|>\u0000\u0409\u040b"+
		"\u0003\u00a4R\u0000\u040a\u0409\u0001\u0000\u0000\u0000\u040b\u040e\u0001"+
		"\u0000\u0000\u0000\u040c\u040a\u0001\u0000\u0000\u0000\u040c\u040d\u0001"+
		"\u0000\u0000\u0000\u040d\u040f\u0001\u0000\u0000\u0000\u040e\u040c\u0001"+
		"\u0000\u0000\u0000\u040f\u0410\u0005\n\u0000\u0000\u0410\u00c3\u0001\u0000"+
		"\u0000\u0000\u0411\u0412\u0005\u000f\u0000\u0000\u0412\u0413\u00058\u0000"+
		"\u0000\u0413\u0414\u0003\u00c6c\u0000\u0414\u00c5\u0001\u0000\u0000\u0000"+
		"\u0415\u0417\u0003\u00c8d\u0000\u0416\u0415\u0001\u0000\u0000\u0000\u0417"+
		"\u0418\u0001\u0000\u0000\u0000\u0418\u0416\u0001\u0000\u0000\u0000\u0418"+
		"\u0419\u0001\u0000\u0000\u0000\u0419\u041e\u0001\u0000\u0000\u0000\u041a"+
		"\u041b\u0005\t\u0000\u0000\u041b\u041c\u0005E\u0000\u0000\u041c\u041e"+
		"\u0005\n\u0000\u0000\u041d\u0416\u0001\u0000\u0000\u0000\u041d\u041a\u0001"+
		"\u0000\u0000\u0000\u041e\u00c7\u0001\u0000\u0000\u0000\u041f\u0420\u0005"+
		"\t\u0000\u0000\u0420\u0422\u0003\u0098L\u0000\u0421\u0423\u0003\u00ca"+
		"e\u0000\u0422\u0421\u0001\u0000\u0000\u0000\u0423\u0424\u0001\u0000\u0000"+
		"\u0000\u0424\u0422\u0001\u0000\u0000\u0000\u0424\u0425\u0001\u0000\u0000"+
		"\u0000\u0425\u0426\u0001\u0000\u0000\u0000\u0426\u0427\u0005\n\u0000\u0000"+
		"\u0427\u00c9\u0001\u0000\u0000\u0000\u0428\u0429\u0005\t\u0000\u0000\u0429"+
		"\u042a\u0003|>\u0000\u042a\u042b\u0003|>\u0000\u042b\u042c\u0005\n\u0000"+
		"\u0000\u042c\u00cb\u0001\u0000\u0000\u0000\u042d\u042e\u0005\u000f\u0000"+
		"\u0000\u042e\u042f\u00059\u0000\u0000\u042f\u0433\u0005\t\u0000\u0000"+
		"\u0430\u0432\u0003|>\u0000\u0431\u0430\u0001\u0000\u0000\u0000\u0432\u0435"+
		"\u0001\u0000\u0000\u0000\u0433\u0431\u0001\u0000\u0000\u0000\u0433\u0434"+
		"\u0001\u0000\u0000\u0000\u0434\u0436\u0001\u0000\u0000\u0000\u0435\u0433"+
		"\u0001\u0000\u0000\u0000\u0436\u0437\u0005\n\u0000\u0000\u0437\u00cd\u0001"+
		"\u0000\u0000\u0000\u0438\u043c\u0005\u0002\u0000\u0000\u0439\u043b\u0005"+
		"\u0002\u0000\u0000\u043a\u0439\u0001\u0000\u0000\u0000\u043b\u043e\u0001"+
		"\u0000\u0000\u0000\u043c\u043a\u0001\u0000\u0000\u0000\u043c\u043d\u0001"+
		"\u0000\u0000\u0000\u043d\u043f\u0001\u0000\u0000\u0000\u043e\u043c\u0001"+
		"\u0000\u0000\u0000\u043f\u0440\u0005\u0007\u0000\u0000\u0440\u0441\u0003"+
		"L&\u0000\u0441\u0442\u0003\u00ceg\u0000\u0442\u0444\u0001\u0000\u0000"+
		"\u0000\u0443\u0438\u0001\u0000\u0000\u0000\u0443\u0444\u0001\u0000\u0000"+
		"\u0000\u0444\u00cf\u0001\u0000\u0000\u0000\u0445\u0446\u0005\u000b\u0000"+
		"\u0000\u0446\u0447\u0005\u0003\u0000\u0000\u0447\u0448\u0003~?\u0000\u0448"+
		"\u0449\u0005\f\u0000\u0000\u0449\u00d1\u0001\u0000\u0000\u0000\u044a\u0464"+
		"\u0005F\u0000\u0000\u044b\u0464\u0005G\u0000\u0000\u044c\u0464\u0005H"+
		"\u0000\u0000\u044d\u0464\u0005I\u0000\u0000\u044e\u0464\u0005J\u0000\u0000"+
		"\u044f\u0464\u0005K\u0000\u0000\u0450\u0464\u0005L\u0000\u0000\u0451\u0464"+
		"\u0005M\u0000\u0000\u0452\u0464\u0005N\u0000\u0000\u0453\u0464\u0005O"+
		"\u0000\u0000\u0454\u0464\u0005P\u0000\u0000\u0455\u0464\u0005Q\u0000\u0000"+
		"\u0456\u0464\u0005R\u0000\u0000\u0457\u0458\u0005\t\u0000\u0000\u0458"+
		"\u0459\u0005S\u0000\u0000\u0459\u045a\u0005\u0005\u0000\u0000\u045a\u0464"+
		"\u0005\n\u0000\u0000\u045b\u045c\u0005\t\u0000\u0000\u045c\u045d\u0005"+
		"T\u0000\u0000\u045d\u045e\u0005\u0005\u0000\u0000\u045e\u0464\u0005\n"+
		"\u0000\u0000\u045f\u0460\u0005\t\u0000\u0000\u0460\u0461\u0005U\u0000"+
		"\u0000\u0461\u0462\u0005\u0005\u0000\u0000\u0462\u0464\u0005\n\u0000\u0000"+
		"\u0463\u044a\u0001\u0000\u0000\u0000\u0463\u044b\u0001\u0000\u0000\u0000"+
		"\u0463\u044c\u0001\u0000\u0000\u0000\u0463\u044d\u0001\u0000\u0000\u0000"+
		"\u0463\u044e\u0001\u0000\u0000\u0000\u0463\u044f\u0001\u0000\u0000\u0000"+
		"\u0463\u0450\u0001\u0000\u0000\u0000\u0463\u0451\u0001\u0000\u0000\u0000"+
		"\u0463\u0452\u0001\u0000\u0000\u0000\u0463\u0453\u0001\u0000\u0000\u0000"+
		"\u0463\u0454\u0001\u0000\u0000\u0000\u0463\u0455\u0001\u0000\u0000\u0000"+
		"\u0463\u0456\u0001\u0000\u0000\u0000\u0463\u0457\u0001\u0000\u0000\u0000"+
		"\u0463\u045b\u0001\u0000\u0000\u0000\u0463\u045f\u0001\u0000\u0000\u0000"+
		"\u0464\u00d3\u0001\u0000\u0000\u0000N\u00d7\u00e2\u00f0\u00fe\u0109\u0110"+
		"\u011c\u0124\u013a\u0146\u0158\u0162\u0173\u0193\u019e\u01b4\u01bb\u01cc"+
		"\u01df\u0206\u020f\u021d\u0221\u0227\u0230\u0237\u0240\u0245\u0255\u0260"+
		"\u0281\u0289\u028f\u0297\u029e\u02a9\u02b0\u02bd\u02c1\u02c5\u02d3\u02d8"+
		"\u02de\u02fc\u0303\u030b\u0316\u031b\u0322\u0332\u0337\u033f\u034b\u0355"+
		"\u035a\u0362\u0367\u036f\u037a\u03a1\u03ae\u03b3\u03b7\u03c3\u03ca\u03e4"+
		"\u03ee\u03f9\u03fe\u0405\u040c\u0418\u041d\u0424\u0433\u043c\u0443\u0463";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}