//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     ANTLR Version: 4.13.2
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// Generated from EPDDLLexer.g4 by ANTLR 4.13.2

// Unreachable code detected
#pragma warning disable 0162
// The variable '...' is assigned but its value is never used
#pragma warning disable 0219
// Missing XML comment for publicly visible type or member '...'
#pragma warning disable 1591
// Ambiguous reference in cref attribute
#pragma warning disable 419

using System;
using System.IO;
using System.Text;
using Antlr4.Runtime;
using Antlr4.Runtime.Atn;
using Antlr4.Runtime.Misc;
using DFA = Antlr4.Runtime.Dfa.DFA;

[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.13.2")]
[System.CLSCompliant(false)]
public partial class EPDDLLexer : Lexer {
	protected static DFA[] decisionToDFA;
	protected static PredictionContextCache sharedContextCache = new PredictionContextCache();
	public const int
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
	public static string[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static string[] modeNames = {
		"DEFAULT_MODE"
	};

	public static readonly string[] ruleNames = {
		"NAME", "AGENT_NAME", "MODALITY_NAME", "VARIABLE", "INT", "WS", "DASH", 
		"SEMICOLON", "LPAREN", "RPAREN", "LBRACKET", "RBRACKET", "LBRACE", "RBRACE", 
		"COLON", "IMPLY", "OR", "AND", "NOT", "EXISTS", "FORALL", "TRUE", "FALSE", 
		"ASSIGN", "KW", "IFF", "WHEN", "ALWAYS", "IF", "OTHERWISE", "DEFINE", 
		"DOMAIN", "LIBRARY", "PROBLEM", "ACTION_TYPE_LIBRARIES", "REQUIREMENTS", 
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


	public EPDDLLexer(ICharStream input)
	: this(input, Console.Out, Console.Error) { }

	public EPDDLLexer(ICharStream input, TextWriter output, TextWriter errorOutput)
	: base(input, output, errorOutput)
	{
		Interpreter = new LexerATNSimulator(this, _ATN, decisionToDFA, sharedContextCache);
	}

	private static readonly string[] _LiteralNames = {
		null, null, null, null, null, null, null, "'-'", "';'", "'('", "')'", 
		"'['", "']'", "'{'", "'}'", "':'", "'imply'", "'or'", "'and'", "'not'", 
		"'exists'", "'forall'", "'true'", "'false'", "'<-'", "'kw'", "'iff'", 
		"'when'", "'always'", "'if'", "'otherwise'", "'define'", "'domain'", "'library'", 
		"'problem'", "'action-type-libraries'", "'requirements'", "'types'", "'predicate'", 
		"'predicate-formula'", "'formula'", "'postcondition'", "'literal'", "'predicates'", 
		"'modality'", "'action'", "'parameters'", "'observability-groups'", "'All'", 
		"'event'", "'precondition'", "'postconditions'", "'state'", "'init'", 
		"'goal'", "'where'", "'relations'", "'designated'", "'world'", "'objects'", 
		"'static'", "'agent'", "'agents'", "'agent-groups'", "'valuation'", "'state-name'", 
		"'observability-conditions'", "'action-type'", "'worlds'", "'()'", "':del'", 
		"':typing'", "':equality'", "':existential-formulae'", "':universal-formulae'", 
		"':universal-postconditions'", "':modal-preconditions'", "':modal-postconditions'", 
		"':modalities'", "':ontic-change'", "':common-knowledge'", "':dynamic-common-knowledge'", 
		"':finitary-S5-theory'", "':maximum-preconditions-depth'", "':maximum-postconditions-depth'", 
		"':maximum-modal-depth'"
	};
	private static readonly string[] _SymbolicNames = {
		null, "NAME", "AGENT_NAME", "MODALITY_NAME", "VARIABLE", "INT", "WS", 
		"DASH", "SEMICOLON", "LPAREN", "RPAREN", "LBRACKET", "RBRACKET", "LBRACE", 
		"RBRACE", "COLON", "IMPLY", "OR", "AND", "NOT", "EXISTS", "FORALL", "TRUE", 
		"FALSE", "ASSIGN", "KW", "IFF", "WHEN", "ALWAYS", "IF", "OTHERWISE", "DEFINE", 
		"DOMAIN", "LIBRARY", "PROBLEM", "ACTION_TYPE_LIBRARIES", "REQUIREMENTS", 
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
	public static readonly IVocabulary DefaultVocabulary = new Vocabulary(_LiteralNames, _SymbolicNames);

	[NotNull]
	public override IVocabulary Vocabulary
	{
		get
		{
			return DefaultVocabulary;
		}
	}

	public override string GrammarFileName { get { return "EPDDLLexer.g4"; } }

	public override string[] RuleNames { get { return ruleNames; } }

	public override string[] ChannelNames { get { return channelNames; } }

	public override string[] ModeNames { get { return modeNames; } }

	public override int[] SerializedAtn { get { return _serializedATN; } }

	static EPDDLLexer() {
		decisionToDFA = new DFA[_ATN.NumberOfDecisions];
		for (int i = 0; i < _ATN.NumberOfDecisions; i++) {
			decisionToDFA[i] = new DFA(_ATN.GetDecisionState(i), i);
		}
	}
	private static int[] _serializedATN = {
		4,0,85,995,6,-1,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
		6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,13,7,13,2,14,
		7,14,2,15,7,15,2,16,7,16,2,17,7,17,2,18,7,18,2,19,7,19,2,20,7,20,2,21,
		7,21,2,22,7,22,2,23,7,23,2,24,7,24,2,25,7,25,2,26,7,26,2,27,7,27,2,28,
		7,28,2,29,7,29,2,30,7,30,2,31,7,31,2,32,7,32,2,33,7,33,2,34,7,34,2,35,
		7,35,2,36,7,36,2,37,7,37,2,38,7,38,2,39,7,39,2,40,7,40,2,41,7,41,2,42,
		7,42,2,43,7,43,2,44,7,44,2,45,7,45,2,46,7,46,2,47,7,47,2,48,7,48,2,49,
		7,49,2,50,7,50,2,51,7,51,2,52,7,52,2,53,7,53,2,54,7,54,2,55,7,55,2,56,
		7,56,2,57,7,57,2,58,7,58,2,59,7,59,2,60,7,60,2,61,7,61,2,62,7,62,2,63,
		7,63,2,64,7,64,2,65,7,65,2,66,7,66,2,67,7,67,2,68,7,68,2,69,7,69,2,70,
		7,70,2,71,7,71,2,72,7,72,2,73,7,73,2,74,7,74,2,75,7,75,2,76,7,76,2,77,
		7,77,2,78,7,78,2,79,7,79,2,80,7,80,2,81,7,81,2,82,7,82,2,83,7,83,2,84,
		7,84,1,0,1,0,5,0,174,8,0,10,0,12,0,177,9,0,1,1,1,1,5,1,181,8,1,10,1,12,
		1,184,9,1,1,2,1,2,5,2,188,8,2,10,2,12,2,191,9,2,1,2,1,2,1,3,1,3,4,3,197,
		8,3,11,3,12,3,198,1,4,4,4,202,8,4,11,4,12,4,203,1,5,4,5,207,8,5,11,5,12,
		5,208,1,5,1,5,1,6,1,6,1,7,1,7,1,8,1,8,1,9,1,9,1,10,1,10,1,11,1,11,1,12,
		1,12,1,13,1,13,1,14,1,14,1,15,1,15,1,15,1,15,1,15,1,15,1,16,1,16,1,16,
		1,17,1,17,1,17,1,17,1,18,1,18,1,18,1,18,1,19,1,19,1,19,1,19,1,19,1,19,
		1,19,1,20,1,20,1,20,1,20,1,20,1,20,1,20,1,21,1,21,1,21,1,21,1,21,1,22,
		1,22,1,22,1,22,1,22,1,22,1,23,1,23,1,23,1,24,1,24,1,24,1,25,1,25,1,25,
		1,25,1,26,1,26,1,26,1,26,1,26,1,27,1,27,1,27,1,27,1,27,1,27,1,27,1,28,
		1,28,1,28,1,29,1,29,1,29,1,29,1,29,1,29,1,29,1,29,1,29,1,29,1,30,1,30,
		1,30,1,30,1,30,1,30,1,30,1,31,1,31,1,31,1,31,1,31,1,31,1,31,1,32,1,32,
		1,32,1,32,1,32,1,32,1,32,1,32,1,33,1,33,1,33,1,33,1,33,1,33,1,33,1,33,
		1,34,1,34,1,34,1,34,1,34,1,34,1,34,1,34,1,34,1,34,1,34,1,34,1,34,1,34,
		1,34,1,34,1,34,1,34,1,34,1,34,1,34,1,34,1,35,1,35,1,35,1,35,1,35,1,35,
		1,35,1,35,1,35,1,35,1,35,1,35,1,35,1,36,1,36,1,36,1,36,1,36,1,36,1,37,
		1,37,1,37,1,37,1,37,1,37,1,37,1,37,1,37,1,37,1,38,1,38,1,38,1,38,1,38,
		1,38,1,38,1,38,1,38,1,38,1,38,1,38,1,38,1,38,1,38,1,38,1,38,1,38,1,39,
		1,39,1,39,1,39,1,39,1,39,1,39,1,39,1,40,1,40,1,40,1,40,1,40,1,40,1,40,
		1,40,1,40,1,40,1,40,1,40,1,40,1,40,1,41,1,41,1,41,1,41,1,41,1,41,1,41,
		1,41,1,42,1,42,1,42,1,42,1,42,1,42,1,42,1,42,1,42,1,42,1,42,1,43,1,43,
		1,43,1,43,1,43,1,43,1,43,1,43,1,43,1,44,1,44,1,44,1,44,1,44,1,44,1,44,
		1,45,1,45,1,45,1,45,1,45,1,45,1,45,1,45,1,45,1,45,1,45,1,46,1,46,1,46,
		1,46,1,46,1,46,1,46,1,46,1,46,1,46,1,46,1,46,1,46,1,46,1,46,1,46,1,46,
		1,46,1,46,1,46,1,46,1,47,1,47,1,47,1,47,1,48,1,48,1,48,1,48,1,48,1,48,
		1,49,1,49,1,49,1,49,1,49,1,49,1,49,1,49,1,49,1,49,1,49,1,49,1,49,1,50,
		1,50,1,50,1,50,1,50,1,50,1,50,1,50,1,50,1,50,1,50,1,50,1,50,1,50,1,50,
		1,51,1,51,1,51,1,51,1,51,1,51,1,52,1,52,1,52,1,52,1,52,1,53,1,53,1,53,
		1,53,1,53,1,54,1,54,1,54,1,54,1,54,1,54,1,55,1,55,1,55,1,55,1,55,1,55,
		1,55,1,55,1,55,1,55,1,56,1,56,1,56,1,56,1,56,1,56,1,56,1,56,1,56,1,56,
		1,56,1,57,1,57,1,57,1,57,1,57,1,57,1,58,1,58,1,58,1,58,1,58,1,58,1,58,
		1,58,1,59,1,59,1,59,1,59,1,59,1,59,1,59,1,60,1,60,1,60,1,60,1,60,1,60,
		1,61,1,61,1,61,1,61,1,61,1,61,1,61,1,62,1,62,1,62,1,62,1,62,1,62,1,62,
		1,62,1,62,1,62,1,62,1,62,1,62,1,63,1,63,1,63,1,63,1,63,1,63,1,63,1,63,
		1,63,1,63,1,64,1,64,1,64,1,64,1,64,1,64,1,64,1,64,1,64,1,64,1,64,1,65,
		1,65,1,65,1,65,1,65,1,65,1,65,1,65,1,65,1,65,1,65,1,65,1,65,1,65,1,65,
		1,65,1,65,1,65,1,65,1,65,1,65,1,65,1,65,1,65,1,65,1,66,1,66,1,66,1,66,
		1,66,1,66,1,66,1,66,1,66,1,66,1,66,1,66,1,67,1,67,1,67,1,67,1,67,1,67,
		1,67,1,68,1,68,1,68,1,69,1,69,1,69,1,69,1,69,1,70,1,70,1,70,1,70,1,70,
		1,70,1,70,1,70,1,71,1,71,1,71,1,71,1,71,1,71,1,71,1,71,1,71,1,71,1,72,
		1,72,1,72,1,72,1,72,1,72,1,72,1,72,1,72,1,72,1,72,1,72,1,72,1,72,1,72,
		1,72,1,72,1,72,1,72,1,72,1,72,1,72,1,73,1,73,1,73,1,73,1,73,1,73,1,73,
		1,73,1,73,1,73,1,73,1,73,1,73,1,73,1,73,1,73,1,73,1,73,1,73,1,73,1,74,
		1,74,1,74,1,74,1,74,1,74,1,74,1,74,1,74,1,74,1,74,1,74,1,74,1,74,1,74,
		1,74,1,74,1,74,1,74,1,74,1,74,1,74,1,74,1,74,1,74,1,74,1,75,1,75,1,75,
		1,75,1,75,1,75,1,75,1,75,1,75,1,75,1,75,1,75,1,75,1,75,1,75,1,75,1,75,
		1,75,1,75,1,75,1,75,1,76,1,76,1,76,1,76,1,76,1,76,1,76,1,76,1,76,1,76,
		1,76,1,76,1,76,1,76,1,76,1,76,1,76,1,76,1,76,1,76,1,76,1,76,1,77,1,77,
		1,77,1,77,1,77,1,77,1,77,1,77,1,77,1,77,1,77,1,77,1,78,1,78,1,78,1,78,
		1,78,1,78,1,78,1,78,1,78,1,78,1,78,1,78,1,78,1,78,1,79,1,79,1,79,1,79,
		1,79,1,79,1,79,1,79,1,79,1,79,1,79,1,79,1,79,1,79,1,79,1,79,1,79,1,79,
		1,80,1,80,1,80,1,80,1,80,1,80,1,80,1,80,1,80,1,80,1,80,1,80,1,80,1,80,
		1,80,1,80,1,80,1,80,1,80,1,80,1,80,1,80,1,80,1,80,1,80,1,80,1,81,1,81,
		1,81,1,81,1,81,1,81,1,81,1,81,1,81,1,81,1,81,1,81,1,81,1,81,1,81,1,81,
		1,81,1,81,1,81,1,81,1,82,1,82,1,82,1,82,1,82,1,82,1,82,1,82,1,82,1,82,
		1,82,1,82,1,82,1,82,1,82,1,82,1,82,1,82,1,82,1,82,1,82,1,82,1,82,1,82,
		1,82,1,82,1,82,1,82,1,82,1,83,1,83,1,83,1,83,1,83,1,83,1,83,1,83,1,83,
		1,83,1,83,1,83,1,83,1,83,1,83,1,83,1,83,1,83,1,83,1,83,1,83,1,83,1,83,
		1,83,1,83,1,83,1,83,1,83,1,83,1,83,1,84,1,84,1,84,1,84,1,84,1,84,1,84,
		1,84,1,84,1,84,1,84,1,84,1,84,1,84,1,84,1,84,1,84,1,84,1,84,1,84,1,84,
		0,0,85,1,1,3,2,5,3,7,4,9,5,11,6,13,7,15,8,17,9,19,10,21,11,23,12,25,13,
		27,14,29,15,31,16,33,17,35,18,37,19,39,20,41,21,43,22,45,23,47,24,49,25,
		51,26,53,27,55,28,57,29,59,30,61,31,63,32,65,33,67,34,69,35,71,36,73,37,
		75,38,77,39,79,40,81,41,83,42,85,43,87,44,89,45,91,46,93,47,95,48,97,49,
		99,50,101,51,103,52,105,53,107,54,109,55,111,56,113,57,115,58,117,59,119,
		60,121,61,123,62,125,63,127,64,129,65,131,66,133,67,135,68,137,69,139,
		70,141,71,143,72,145,73,147,74,149,75,151,76,153,77,155,78,157,79,159,
		80,161,81,163,82,165,83,167,84,169,85,1,0,6,1,0,97,122,5,0,39,39,48,57,
		65,90,95,95,97,122,1,0,65,90,4,0,48,57,65,90,95,95,97,122,1,0,48,57,3,
		0,9,10,13,13,32,32,1000,0,1,1,0,0,0,0,3,1,0,0,0,0,5,1,0,0,0,0,7,1,0,0,
		0,0,9,1,0,0,0,0,11,1,0,0,0,0,13,1,0,0,0,0,15,1,0,0,0,0,17,1,0,0,0,0,19,
		1,0,0,0,0,21,1,0,0,0,0,23,1,0,0,0,0,25,1,0,0,0,0,27,1,0,0,0,0,29,1,0,0,
		0,0,31,1,0,0,0,0,33,1,0,0,0,0,35,1,0,0,0,0,37,1,0,0,0,0,39,1,0,0,0,0,41,
		1,0,0,0,0,43,1,0,0,0,0,45,1,0,0,0,0,47,1,0,0,0,0,49,1,0,0,0,0,51,1,0,0,
		0,0,53,1,0,0,0,0,55,1,0,0,0,0,57,1,0,0,0,0,59,1,0,0,0,0,61,1,0,0,0,0,63,
		1,0,0,0,0,65,1,0,0,0,0,67,1,0,0,0,0,69,1,0,0,0,0,71,1,0,0,0,0,73,1,0,0,
		0,0,75,1,0,0,0,0,77,1,0,0,0,0,79,1,0,0,0,0,81,1,0,0,0,0,83,1,0,0,0,0,85,
		1,0,0,0,0,87,1,0,0,0,0,89,1,0,0,0,0,91,1,0,0,0,0,93,1,0,0,0,0,95,1,0,0,
		0,0,97,1,0,0,0,0,99,1,0,0,0,0,101,1,0,0,0,0,103,1,0,0,0,0,105,1,0,0,0,
		0,107,1,0,0,0,0,109,1,0,0,0,0,111,1,0,0,0,0,113,1,0,0,0,0,115,1,0,0,0,
		0,117,1,0,0,0,0,119,1,0,0,0,0,121,1,0,0,0,0,123,1,0,0,0,0,125,1,0,0,0,
		0,127,1,0,0,0,0,129,1,0,0,0,0,131,1,0,0,0,0,133,1,0,0,0,0,135,1,0,0,0,
		0,137,1,0,0,0,0,139,1,0,0,0,0,141,1,0,0,0,0,143,1,0,0,0,0,145,1,0,0,0,
		0,147,1,0,0,0,0,149,1,0,0,0,0,151,1,0,0,0,0,153,1,0,0,0,0,155,1,0,0,0,
		0,157,1,0,0,0,0,159,1,0,0,0,0,161,1,0,0,0,0,163,1,0,0,0,0,165,1,0,0,0,
		0,167,1,0,0,0,0,169,1,0,0,0,1,171,1,0,0,0,3,178,1,0,0,0,5,185,1,0,0,0,
		7,194,1,0,0,0,9,201,1,0,0,0,11,206,1,0,0,0,13,212,1,0,0,0,15,214,1,0,0,
		0,17,216,1,0,0,0,19,218,1,0,0,0,21,220,1,0,0,0,23,222,1,0,0,0,25,224,1,
		0,0,0,27,226,1,0,0,0,29,228,1,0,0,0,31,230,1,0,0,0,33,236,1,0,0,0,35,239,
		1,0,0,0,37,243,1,0,0,0,39,247,1,0,0,0,41,254,1,0,0,0,43,261,1,0,0,0,45,
		266,1,0,0,0,47,272,1,0,0,0,49,275,1,0,0,0,51,278,1,0,0,0,53,282,1,0,0,
		0,55,287,1,0,0,0,57,294,1,0,0,0,59,297,1,0,0,0,61,307,1,0,0,0,63,314,1,
		0,0,0,65,321,1,0,0,0,67,329,1,0,0,0,69,337,1,0,0,0,71,359,1,0,0,0,73,372,
		1,0,0,0,75,378,1,0,0,0,77,388,1,0,0,0,79,406,1,0,0,0,81,414,1,0,0,0,83,
		428,1,0,0,0,85,436,1,0,0,0,87,447,1,0,0,0,89,456,1,0,0,0,91,463,1,0,0,
		0,93,474,1,0,0,0,95,495,1,0,0,0,97,499,1,0,0,0,99,505,1,0,0,0,101,518,
		1,0,0,0,103,533,1,0,0,0,105,539,1,0,0,0,107,544,1,0,0,0,109,549,1,0,0,
		0,111,555,1,0,0,0,113,565,1,0,0,0,115,576,1,0,0,0,117,582,1,0,0,0,119,
		590,1,0,0,0,121,597,1,0,0,0,123,603,1,0,0,0,125,610,1,0,0,0,127,623,1,
		0,0,0,129,633,1,0,0,0,131,644,1,0,0,0,133,669,1,0,0,0,135,681,1,0,0,0,
		137,688,1,0,0,0,139,691,1,0,0,0,141,696,1,0,0,0,143,704,1,0,0,0,145,714,
		1,0,0,0,147,736,1,0,0,0,149,756,1,0,0,0,151,782,1,0,0,0,153,803,1,0,0,
		0,155,825,1,0,0,0,157,837,1,0,0,0,159,851,1,0,0,0,161,869,1,0,0,0,163,
		895,1,0,0,0,165,915,1,0,0,0,167,944,1,0,0,0,169,974,1,0,0,0,171,175,7,
		0,0,0,172,174,7,1,0,0,173,172,1,0,0,0,174,177,1,0,0,0,175,173,1,0,0,0,
		175,176,1,0,0,0,176,2,1,0,0,0,177,175,1,0,0,0,178,182,7,2,0,0,179,181,
		7,3,0,0,180,179,1,0,0,0,181,184,1,0,0,0,182,180,1,0,0,0,182,183,1,0,0,
		0,183,4,1,0,0,0,184,182,1,0,0,0,185,189,7,0,0,0,186,188,7,1,0,0,187,186,
		1,0,0,0,188,191,1,0,0,0,189,187,1,0,0,0,189,190,1,0,0,0,190,192,1,0,0,
		0,191,189,1,0,0,0,192,193,5,46,0,0,193,6,1,0,0,0,194,196,5,63,0,0,195,
		197,7,1,0,0,196,195,1,0,0,0,197,198,1,0,0,0,198,196,1,0,0,0,198,199,1,
		0,0,0,199,8,1,0,0,0,200,202,7,4,0,0,201,200,1,0,0,0,202,203,1,0,0,0,203,
		201,1,0,0,0,203,204,1,0,0,0,204,10,1,0,0,0,205,207,7,5,0,0,206,205,1,0,
		0,0,207,208,1,0,0,0,208,206,1,0,0,0,208,209,1,0,0,0,209,210,1,0,0,0,210,
		211,6,5,0,0,211,12,1,0,0,0,212,213,5,45,0,0,213,14,1,0,0,0,214,215,5,59,
		0,0,215,16,1,0,0,0,216,217,5,40,0,0,217,18,1,0,0,0,218,219,5,41,0,0,219,
		20,1,0,0,0,220,221,5,91,0,0,221,22,1,0,0,0,222,223,5,93,0,0,223,24,1,0,
		0,0,224,225,5,123,0,0,225,26,1,0,0,0,226,227,5,125,0,0,227,28,1,0,0,0,
		228,229,5,58,0,0,229,30,1,0,0,0,230,231,5,105,0,0,231,232,5,109,0,0,232,
		233,5,112,0,0,233,234,5,108,0,0,234,235,5,121,0,0,235,32,1,0,0,0,236,237,
		5,111,0,0,237,238,5,114,0,0,238,34,1,0,0,0,239,240,5,97,0,0,240,241,5,
		110,0,0,241,242,5,100,0,0,242,36,1,0,0,0,243,244,5,110,0,0,244,245,5,111,
		0,0,245,246,5,116,0,0,246,38,1,0,0,0,247,248,5,101,0,0,248,249,5,120,0,
		0,249,250,5,105,0,0,250,251,5,115,0,0,251,252,5,116,0,0,252,253,5,115,
		0,0,253,40,1,0,0,0,254,255,5,102,0,0,255,256,5,111,0,0,256,257,5,114,0,
		0,257,258,5,97,0,0,258,259,5,108,0,0,259,260,5,108,0,0,260,42,1,0,0,0,
		261,262,5,116,0,0,262,263,5,114,0,0,263,264,5,117,0,0,264,265,5,101,0,
		0,265,44,1,0,0,0,266,267,5,102,0,0,267,268,5,97,0,0,268,269,5,108,0,0,
		269,270,5,115,0,0,270,271,5,101,0,0,271,46,1,0,0,0,272,273,5,60,0,0,273,
		274,5,45,0,0,274,48,1,0,0,0,275,276,5,107,0,0,276,277,5,119,0,0,277,50,
		1,0,0,0,278,279,5,105,0,0,279,280,5,102,0,0,280,281,5,102,0,0,281,52,1,
		0,0,0,282,283,5,119,0,0,283,284,5,104,0,0,284,285,5,101,0,0,285,286,5,
		110,0,0,286,54,1,0,0,0,287,288,5,97,0,0,288,289,5,108,0,0,289,290,5,119,
		0,0,290,291,5,97,0,0,291,292,5,121,0,0,292,293,5,115,0,0,293,56,1,0,0,
		0,294,295,5,105,0,0,295,296,5,102,0,0,296,58,1,0,0,0,297,298,5,111,0,0,
		298,299,5,116,0,0,299,300,5,104,0,0,300,301,5,101,0,0,301,302,5,114,0,
		0,302,303,5,119,0,0,303,304,5,105,0,0,304,305,5,115,0,0,305,306,5,101,
		0,0,306,60,1,0,0,0,307,308,5,100,0,0,308,309,5,101,0,0,309,310,5,102,0,
		0,310,311,5,105,0,0,311,312,5,110,0,0,312,313,5,101,0,0,313,62,1,0,0,0,
		314,315,5,100,0,0,315,316,5,111,0,0,316,317,5,109,0,0,317,318,5,97,0,0,
		318,319,5,105,0,0,319,320,5,110,0,0,320,64,1,0,0,0,321,322,5,108,0,0,322,
		323,5,105,0,0,323,324,5,98,0,0,324,325,5,114,0,0,325,326,5,97,0,0,326,
		327,5,114,0,0,327,328,5,121,0,0,328,66,1,0,0,0,329,330,5,112,0,0,330,331,
		5,114,0,0,331,332,5,111,0,0,332,333,5,98,0,0,333,334,5,108,0,0,334,335,
		5,101,0,0,335,336,5,109,0,0,336,68,1,0,0,0,337,338,5,97,0,0,338,339,5,
		99,0,0,339,340,5,116,0,0,340,341,5,105,0,0,341,342,5,111,0,0,342,343,5,
		110,0,0,343,344,5,45,0,0,344,345,5,116,0,0,345,346,5,121,0,0,346,347,5,
		112,0,0,347,348,5,101,0,0,348,349,5,45,0,0,349,350,5,108,0,0,350,351,5,
		105,0,0,351,352,5,98,0,0,352,353,5,114,0,0,353,354,5,97,0,0,354,355,5,
		114,0,0,355,356,5,105,0,0,356,357,5,101,0,0,357,358,5,115,0,0,358,70,1,
		0,0,0,359,360,5,114,0,0,360,361,5,101,0,0,361,362,5,113,0,0,362,363,5,
		117,0,0,363,364,5,105,0,0,364,365,5,114,0,0,365,366,5,101,0,0,366,367,
		5,109,0,0,367,368,5,101,0,0,368,369,5,110,0,0,369,370,5,116,0,0,370,371,
		5,115,0,0,371,72,1,0,0,0,372,373,5,116,0,0,373,374,5,121,0,0,374,375,5,
		112,0,0,375,376,5,101,0,0,376,377,5,115,0,0,377,74,1,0,0,0,378,379,5,112,
		0,0,379,380,5,114,0,0,380,381,5,101,0,0,381,382,5,100,0,0,382,383,5,105,
		0,0,383,384,5,99,0,0,384,385,5,97,0,0,385,386,5,116,0,0,386,387,5,101,
		0,0,387,76,1,0,0,0,388,389,5,112,0,0,389,390,5,114,0,0,390,391,5,101,0,
		0,391,392,5,100,0,0,392,393,5,105,0,0,393,394,5,99,0,0,394,395,5,97,0,
		0,395,396,5,116,0,0,396,397,5,101,0,0,397,398,5,45,0,0,398,399,5,102,0,
		0,399,400,5,111,0,0,400,401,5,114,0,0,401,402,5,109,0,0,402,403,5,117,
		0,0,403,404,5,108,0,0,404,405,5,97,0,0,405,78,1,0,0,0,406,407,5,102,0,
		0,407,408,5,111,0,0,408,409,5,114,0,0,409,410,5,109,0,0,410,411,5,117,
		0,0,411,412,5,108,0,0,412,413,5,97,0,0,413,80,1,0,0,0,414,415,5,112,0,
		0,415,416,5,111,0,0,416,417,5,115,0,0,417,418,5,116,0,0,418,419,5,99,0,
		0,419,420,5,111,0,0,420,421,5,110,0,0,421,422,5,100,0,0,422,423,5,105,
		0,0,423,424,5,116,0,0,424,425,5,105,0,0,425,426,5,111,0,0,426,427,5,110,
		0,0,427,82,1,0,0,0,428,429,5,108,0,0,429,430,5,105,0,0,430,431,5,116,0,
		0,431,432,5,101,0,0,432,433,5,114,0,0,433,434,5,97,0,0,434,435,5,108,0,
		0,435,84,1,0,0,0,436,437,5,112,0,0,437,438,5,114,0,0,438,439,5,101,0,0,
		439,440,5,100,0,0,440,441,5,105,0,0,441,442,5,99,0,0,442,443,5,97,0,0,
		443,444,5,116,0,0,444,445,5,101,0,0,445,446,5,115,0,0,446,86,1,0,0,0,447,
		448,5,109,0,0,448,449,5,111,0,0,449,450,5,100,0,0,450,451,5,97,0,0,451,
		452,5,108,0,0,452,453,5,105,0,0,453,454,5,116,0,0,454,455,5,121,0,0,455,
		88,1,0,0,0,456,457,5,97,0,0,457,458,5,99,0,0,458,459,5,116,0,0,459,460,
		5,105,0,0,460,461,5,111,0,0,461,462,5,110,0,0,462,90,1,0,0,0,463,464,5,
		112,0,0,464,465,5,97,0,0,465,466,5,114,0,0,466,467,5,97,0,0,467,468,5,
		109,0,0,468,469,5,101,0,0,469,470,5,116,0,0,470,471,5,101,0,0,471,472,
		5,114,0,0,472,473,5,115,0,0,473,92,1,0,0,0,474,475,5,111,0,0,475,476,5,
		98,0,0,476,477,5,115,0,0,477,478,5,101,0,0,478,479,5,114,0,0,479,480,5,
		118,0,0,480,481,5,97,0,0,481,482,5,98,0,0,482,483,5,105,0,0,483,484,5,
		108,0,0,484,485,5,105,0,0,485,486,5,116,0,0,486,487,5,121,0,0,487,488,
		5,45,0,0,488,489,5,103,0,0,489,490,5,114,0,0,490,491,5,111,0,0,491,492,
		5,117,0,0,492,493,5,112,0,0,493,494,5,115,0,0,494,94,1,0,0,0,495,496,5,
		65,0,0,496,497,5,108,0,0,497,498,5,108,0,0,498,96,1,0,0,0,499,500,5,101,
		0,0,500,501,5,118,0,0,501,502,5,101,0,0,502,503,5,110,0,0,503,504,5,116,
		0,0,504,98,1,0,0,0,505,506,5,112,0,0,506,507,5,114,0,0,507,508,5,101,0,
		0,508,509,5,99,0,0,509,510,5,111,0,0,510,511,5,110,0,0,511,512,5,100,0,
		0,512,513,5,105,0,0,513,514,5,116,0,0,514,515,5,105,0,0,515,516,5,111,
		0,0,516,517,5,110,0,0,517,100,1,0,0,0,518,519,5,112,0,0,519,520,5,111,
		0,0,520,521,5,115,0,0,521,522,5,116,0,0,522,523,5,99,0,0,523,524,5,111,
		0,0,524,525,5,110,0,0,525,526,5,100,0,0,526,527,5,105,0,0,527,528,5,116,
		0,0,528,529,5,105,0,0,529,530,5,111,0,0,530,531,5,110,0,0,531,532,5,115,
		0,0,532,102,1,0,0,0,533,534,5,115,0,0,534,535,5,116,0,0,535,536,5,97,0,
		0,536,537,5,116,0,0,537,538,5,101,0,0,538,104,1,0,0,0,539,540,5,105,0,
		0,540,541,5,110,0,0,541,542,5,105,0,0,542,543,5,116,0,0,543,106,1,0,0,
		0,544,545,5,103,0,0,545,546,5,111,0,0,546,547,5,97,0,0,547,548,5,108,0,
		0,548,108,1,0,0,0,549,550,5,119,0,0,550,551,5,104,0,0,551,552,5,101,0,
		0,552,553,5,114,0,0,553,554,5,101,0,0,554,110,1,0,0,0,555,556,5,114,0,
		0,556,557,5,101,0,0,557,558,5,108,0,0,558,559,5,97,0,0,559,560,5,116,0,
		0,560,561,5,105,0,0,561,562,5,111,0,0,562,563,5,110,0,0,563,564,5,115,
		0,0,564,112,1,0,0,0,565,566,5,100,0,0,566,567,5,101,0,0,567,568,5,115,
		0,0,568,569,5,105,0,0,569,570,5,103,0,0,570,571,5,110,0,0,571,572,5,97,
		0,0,572,573,5,116,0,0,573,574,5,101,0,0,574,575,5,100,0,0,575,114,1,0,
		0,0,576,577,5,119,0,0,577,578,5,111,0,0,578,579,5,114,0,0,579,580,5,108,
		0,0,580,581,5,100,0,0,581,116,1,0,0,0,582,583,5,111,0,0,583,584,5,98,0,
		0,584,585,5,106,0,0,585,586,5,101,0,0,586,587,5,99,0,0,587,588,5,116,0,
		0,588,589,5,115,0,0,589,118,1,0,0,0,590,591,5,115,0,0,591,592,5,116,0,
		0,592,593,5,97,0,0,593,594,5,116,0,0,594,595,5,105,0,0,595,596,5,99,0,
		0,596,120,1,0,0,0,597,598,5,97,0,0,598,599,5,103,0,0,599,600,5,101,0,0,
		600,601,5,110,0,0,601,602,5,116,0,0,602,122,1,0,0,0,603,604,5,97,0,0,604,
		605,5,103,0,0,605,606,5,101,0,0,606,607,5,110,0,0,607,608,5,116,0,0,608,
		609,5,115,0,0,609,124,1,0,0,0,610,611,5,97,0,0,611,612,5,103,0,0,612,613,
		5,101,0,0,613,614,5,110,0,0,614,615,5,116,0,0,615,616,5,45,0,0,616,617,
		5,103,0,0,617,618,5,114,0,0,618,619,5,111,0,0,619,620,5,117,0,0,620,621,
		5,112,0,0,621,622,5,115,0,0,622,126,1,0,0,0,623,624,5,118,0,0,624,625,
		5,97,0,0,625,626,5,108,0,0,626,627,5,117,0,0,627,628,5,97,0,0,628,629,
		5,116,0,0,629,630,5,105,0,0,630,631,5,111,0,0,631,632,5,110,0,0,632,128,
		1,0,0,0,633,634,5,115,0,0,634,635,5,116,0,0,635,636,5,97,0,0,636,637,5,
		116,0,0,637,638,5,101,0,0,638,639,5,45,0,0,639,640,5,110,0,0,640,641,5,
		97,0,0,641,642,5,109,0,0,642,643,5,101,0,0,643,130,1,0,0,0,644,645,5,111,
		0,0,645,646,5,98,0,0,646,647,5,115,0,0,647,648,5,101,0,0,648,649,5,114,
		0,0,649,650,5,118,0,0,650,651,5,97,0,0,651,652,5,98,0,0,652,653,5,105,
		0,0,653,654,5,108,0,0,654,655,5,105,0,0,655,656,5,116,0,0,656,657,5,121,
		0,0,657,658,5,45,0,0,658,659,5,99,0,0,659,660,5,111,0,0,660,661,5,110,
		0,0,661,662,5,100,0,0,662,663,5,105,0,0,663,664,5,116,0,0,664,665,5,105,
		0,0,665,666,5,111,0,0,666,667,5,110,0,0,667,668,5,115,0,0,668,132,1,0,
		0,0,669,670,5,97,0,0,670,671,5,99,0,0,671,672,5,116,0,0,672,673,5,105,
		0,0,673,674,5,111,0,0,674,675,5,110,0,0,675,676,5,45,0,0,676,677,5,116,
		0,0,677,678,5,121,0,0,678,679,5,112,0,0,679,680,5,101,0,0,680,134,1,0,
		0,0,681,682,5,119,0,0,682,683,5,111,0,0,683,684,5,114,0,0,684,685,5,108,
		0,0,685,686,5,100,0,0,686,687,5,115,0,0,687,136,1,0,0,0,688,689,5,40,0,
		0,689,690,5,41,0,0,690,138,1,0,0,0,691,692,5,58,0,0,692,693,5,100,0,0,
		693,694,5,101,0,0,694,695,5,108,0,0,695,140,1,0,0,0,696,697,5,58,0,0,697,
		698,5,116,0,0,698,699,5,121,0,0,699,700,5,112,0,0,700,701,5,105,0,0,701,
		702,5,110,0,0,702,703,5,103,0,0,703,142,1,0,0,0,704,705,5,58,0,0,705,706,
		5,101,0,0,706,707,5,113,0,0,707,708,5,117,0,0,708,709,5,97,0,0,709,710,
		5,108,0,0,710,711,5,105,0,0,711,712,5,116,0,0,712,713,5,121,0,0,713,144,
		1,0,0,0,714,715,5,58,0,0,715,716,5,101,0,0,716,717,5,120,0,0,717,718,5,
		105,0,0,718,719,5,115,0,0,719,720,5,116,0,0,720,721,5,101,0,0,721,722,
		5,110,0,0,722,723,5,116,0,0,723,724,5,105,0,0,724,725,5,97,0,0,725,726,
		5,108,0,0,726,727,5,45,0,0,727,728,5,102,0,0,728,729,5,111,0,0,729,730,
		5,114,0,0,730,731,5,109,0,0,731,732,5,117,0,0,732,733,5,108,0,0,733,734,
		5,97,0,0,734,735,5,101,0,0,735,146,1,0,0,0,736,737,5,58,0,0,737,738,5,
		117,0,0,738,739,5,110,0,0,739,740,5,105,0,0,740,741,5,118,0,0,741,742,
		5,101,0,0,742,743,5,114,0,0,743,744,5,115,0,0,744,745,5,97,0,0,745,746,
		5,108,0,0,746,747,5,45,0,0,747,748,5,102,0,0,748,749,5,111,0,0,749,750,
		5,114,0,0,750,751,5,109,0,0,751,752,5,117,0,0,752,753,5,108,0,0,753,754,
		5,97,0,0,754,755,5,101,0,0,755,148,1,0,0,0,756,757,5,58,0,0,757,758,5,
		117,0,0,758,759,5,110,0,0,759,760,5,105,0,0,760,761,5,118,0,0,761,762,
		5,101,0,0,762,763,5,114,0,0,763,764,5,115,0,0,764,765,5,97,0,0,765,766,
		5,108,0,0,766,767,5,45,0,0,767,768,5,112,0,0,768,769,5,111,0,0,769,770,
		5,115,0,0,770,771,5,116,0,0,771,772,5,99,0,0,772,773,5,111,0,0,773,774,
		5,110,0,0,774,775,5,100,0,0,775,776,5,105,0,0,776,777,5,116,0,0,777,778,
		5,105,0,0,778,779,5,111,0,0,779,780,5,110,0,0,780,781,5,115,0,0,781,150,
		1,0,0,0,782,783,5,58,0,0,783,784,5,109,0,0,784,785,5,111,0,0,785,786,5,
		100,0,0,786,787,5,97,0,0,787,788,5,108,0,0,788,789,5,45,0,0,789,790,5,
		112,0,0,790,791,5,114,0,0,791,792,5,101,0,0,792,793,5,99,0,0,793,794,5,
		111,0,0,794,795,5,110,0,0,795,796,5,100,0,0,796,797,5,105,0,0,797,798,
		5,116,0,0,798,799,5,105,0,0,799,800,5,111,0,0,800,801,5,110,0,0,801,802,
		5,115,0,0,802,152,1,0,0,0,803,804,5,58,0,0,804,805,5,109,0,0,805,806,5,
		111,0,0,806,807,5,100,0,0,807,808,5,97,0,0,808,809,5,108,0,0,809,810,5,
		45,0,0,810,811,5,112,0,0,811,812,5,111,0,0,812,813,5,115,0,0,813,814,5,
		116,0,0,814,815,5,99,0,0,815,816,5,111,0,0,816,817,5,110,0,0,817,818,5,
		100,0,0,818,819,5,105,0,0,819,820,5,116,0,0,820,821,5,105,0,0,821,822,
		5,111,0,0,822,823,5,110,0,0,823,824,5,115,0,0,824,154,1,0,0,0,825,826,
		5,58,0,0,826,827,5,109,0,0,827,828,5,111,0,0,828,829,5,100,0,0,829,830,
		5,97,0,0,830,831,5,108,0,0,831,832,5,105,0,0,832,833,5,116,0,0,833,834,
		5,105,0,0,834,835,5,101,0,0,835,836,5,115,0,0,836,156,1,0,0,0,837,838,
		5,58,0,0,838,839,5,111,0,0,839,840,5,110,0,0,840,841,5,116,0,0,841,842,
		5,105,0,0,842,843,5,99,0,0,843,844,5,45,0,0,844,845,5,99,0,0,845,846,5,
		104,0,0,846,847,5,97,0,0,847,848,5,110,0,0,848,849,5,103,0,0,849,850,5,
		101,0,0,850,158,1,0,0,0,851,852,5,58,0,0,852,853,5,99,0,0,853,854,5,111,
		0,0,854,855,5,109,0,0,855,856,5,109,0,0,856,857,5,111,0,0,857,858,5,110,
		0,0,858,859,5,45,0,0,859,860,5,107,0,0,860,861,5,110,0,0,861,862,5,111,
		0,0,862,863,5,119,0,0,863,864,5,108,0,0,864,865,5,101,0,0,865,866,5,100,
		0,0,866,867,5,103,0,0,867,868,5,101,0,0,868,160,1,0,0,0,869,870,5,58,0,
		0,870,871,5,100,0,0,871,872,5,121,0,0,872,873,5,110,0,0,873,874,5,97,0,
		0,874,875,5,109,0,0,875,876,5,105,0,0,876,877,5,99,0,0,877,878,5,45,0,
		0,878,879,5,99,0,0,879,880,5,111,0,0,880,881,5,109,0,0,881,882,5,109,0,
		0,882,883,5,111,0,0,883,884,5,110,0,0,884,885,5,45,0,0,885,886,5,107,0,
		0,886,887,5,110,0,0,887,888,5,111,0,0,888,889,5,119,0,0,889,890,5,108,
		0,0,890,891,5,101,0,0,891,892,5,100,0,0,892,893,5,103,0,0,893,894,5,101,
		0,0,894,162,1,0,0,0,895,896,5,58,0,0,896,897,5,102,0,0,897,898,5,105,0,
		0,898,899,5,110,0,0,899,900,5,105,0,0,900,901,5,116,0,0,901,902,5,97,0,
		0,902,903,5,114,0,0,903,904,5,121,0,0,904,905,5,45,0,0,905,906,5,83,0,
		0,906,907,5,53,0,0,907,908,5,45,0,0,908,909,5,116,0,0,909,910,5,104,0,
		0,910,911,5,101,0,0,911,912,5,111,0,0,912,913,5,114,0,0,913,914,5,121,
		0,0,914,164,1,0,0,0,915,916,5,58,0,0,916,917,5,109,0,0,917,918,5,97,0,
		0,918,919,5,120,0,0,919,920,5,105,0,0,920,921,5,109,0,0,921,922,5,117,
		0,0,922,923,5,109,0,0,923,924,5,45,0,0,924,925,5,112,0,0,925,926,5,114,
		0,0,926,927,5,101,0,0,927,928,5,99,0,0,928,929,5,111,0,0,929,930,5,110,
		0,0,930,931,5,100,0,0,931,932,5,105,0,0,932,933,5,116,0,0,933,934,5,105,
		0,0,934,935,5,111,0,0,935,936,5,110,0,0,936,937,5,115,0,0,937,938,5,45,
		0,0,938,939,5,100,0,0,939,940,5,101,0,0,940,941,5,112,0,0,941,942,5,116,
		0,0,942,943,5,104,0,0,943,166,1,0,0,0,944,945,5,58,0,0,945,946,5,109,0,
		0,946,947,5,97,0,0,947,948,5,120,0,0,948,949,5,105,0,0,949,950,5,109,0,
		0,950,951,5,117,0,0,951,952,5,109,0,0,952,953,5,45,0,0,953,954,5,112,0,
		0,954,955,5,111,0,0,955,956,5,115,0,0,956,957,5,116,0,0,957,958,5,99,0,
		0,958,959,5,111,0,0,959,960,5,110,0,0,960,961,5,100,0,0,961,962,5,105,
		0,0,962,963,5,116,0,0,963,964,5,105,0,0,964,965,5,111,0,0,965,966,5,110,
		0,0,966,967,5,115,0,0,967,968,5,45,0,0,968,969,5,100,0,0,969,970,5,101,
		0,0,970,971,5,112,0,0,971,972,5,116,0,0,972,973,5,104,0,0,973,168,1,0,
		0,0,974,975,5,58,0,0,975,976,5,109,0,0,976,977,5,97,0,0,977,978,5,120,
		0,0,978,979,5,105,0,0,979,980,5,109,0,0,980,981,5,117,0,0,981,982,5,109,
		0,0,982,983,5,45,0,0,983,984,5,109,0,0,984,985,5,111,0,0,985,986,5,100,
		0,0,986,987,5,97,0,0,987,988,5,108,0,0,988,989,5,45,0,0,989,990,5,100,
		0,0,990,991,5,101,0,0,991,992,5,112,0,0,992,993,5,116,0,0,993,994,5,104,
		0,0,994,170,1,0,0,0,7,0,175,182,189,198,203,208,1,6,0,0
	};

	public static readonly ATN _ATN =
		new ATNDeserializer().Deserialize(_serializedATN);


}
