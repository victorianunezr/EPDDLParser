lexer grammar EPDDLLexer;

EVENT                    : ':event' ;
EVENTS                   : ':events' ;
PRECONDITION             : ':precondition' ;
EFFECT                   : ':effect' ;
ACCESSIBILITY            : ':accessibility' ;
OWNERS                   : ':owners';
POSTCONDITIONS           : ':postconditions' ;
STATE                    : ':state' ;
INIT                     : ':init' ;
GOAL                     : ':goal' ;
WHERE                    : ':where' ;
RELATIONS                : ':relations' ;
DESIGNATED               : ':designated' ;
PREDICATES               : ':predicates' ;
MODALITY                 : ':modality' ;
ACTION                   : ':action' ;
PARAMETERS               : ':parameters' ;
OBSERVABILITY_GROUPS     : ':observability-groups' ;
ACTION_TYPE_LIBRARIES    : ':action-type-libraries' ;
REQUIREMENTS             : ':requirements' ;
TYPES                    : ':types' ;
OBJECTS                  : ':objects' ;
STATIC                   : ':static' ;
AGENTS                   : ':agents' ;
AGENT_GROUPS             : ':agent-groups' ;
VALUATION                : ':valuation' ;
STATE_NAME               : ':state-name' ;
OBSERVABILITY_CONDITIONS : ':observability-conditions' ;
ACTION_TYPE              : ':action-type' ;
WORLDS                   : ':worlds' ;
CDOMAIN                  : ':domain' ;

// Set of allowed requirement keys - for now allowing any string not necessarily in this set for simplicity.
// DEL                        : ':del' ;
// TYPING                     : ':typing' ;
// EQUALITY                   : ':equality' ;
// EXISTENTIAL_FORMULAE       : ':existential-formulae' ;
// MULTI_AGENT                : ':multi-agent';
// ONTIC_ACTIONS              : ':ontic-actions';
// UNIVERSAL_FORMULAE         : ':universal-formulae' ;
// UNIVERSAL_POSTCONDITIONS   : ':universal-postconditions' ;
// MODAL_PRECONDITIONS        : ':modal-preconditions' ;
// MODAL_POSTCONDITIONS       : ':modal-postconditions' ;
// MODALITIES                 : ':modalities' ;
// ONTIC_CHANGE               : ':ontic-change' ;
// COMMON_KNOWLEDGE           : ':common-knowledge' ;
// DYNAMIC_COMMON_KNOWLEDGE   : ':dynamic-common-knowledge' ;
// FINITARY_S5_THEORY         : ':finitary-S5-theory' ;
// MAX_PRECONDITIONS_DEPTH    : ':maximum-preconditions-depth' ;
// MAX_POSTCONDITIONS_DEPTH   : ':maximum-postconditions-depth' ;
// MAX_MODAL_DEPTH            : ':maximum-modal-depth' ;
// FINITARY_THEORY            : ':ma-star-finitary-theory' ;

COLON           : ':' ;
IMPLY           : 'imply' ;
OR              : 'or' ;
AND             : 'and' ;
NOT             : 'not' ;
EXISTS          : 'exists' ;
FORALL          : 'forall' ;
TRUE            : 'true' ;
FALSE           : 'false' ;
ASSIGN          : '<-' ;
KW              : 'kw' ;
IFF             : 'iff' ;
WHEN            : 'when' ;
ALWAYS          : 'always' ;
IF              : 'if' ;
OTHERWISE       : 'otherwise' ;
DEFINE          : 'define' ;
DOMAIN          : 'domain' ;
LIBRARY         : 'library' ;
PROBLEM         : 'problem' ;
PREDICATE       : 'predicate' ;
PREDICATE_FORMULA : 'predicate-formula' ;
FORMULA         : 'formula' ;
POSTCONDITION   : 'postcondition' ;
LITERAL         : 'literal' ;
ALL             : 'All' ;
WORLD           : 'world' ;
AGENT           : 'agent' ;
TRIVIAL_DEF     : '()' ;

NAME            : [a-z] [a-zA-Z0-9_'-]* ;
AGENT_NAME      : [a-zA-Z] [a-zA-Z0-9_'-]* ;
MODALITY_NAME   : [a-z] [a-zA-Z0-9_'-]* '.' ;
REQUIREMENT_NAME: ':' [a-zA-Z]+ ('-' [a-zA-Z]+)*;
VARIABLE        : '?' [a-zA-Z] [a-zA-Z0-9_'-]* ;
INT             : [0-9]+ ;
WS              : [ \t\n\r]+ -> skip ;
COMMENT         : ';' ~[\r\n]* -> skip ;
DASH            : '-' ;
LPAREN          : '(' ;
RPAREN          : ')' ;
LBRACKET        : '[' ;
RBRACKET        : ']' ;
LBRACE          : '{' ;
RBRACE          : '}' ;
LT              : '<' ;
GT              : '>' ;