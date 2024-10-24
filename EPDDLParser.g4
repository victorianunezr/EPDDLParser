parser grammar EPDDLParser;

options { tokenVocab=EPDDLLexer; }

mainDef
    : domainDef
    | libraryDef
    | problemDef
    ;

domainDef
    : LPAREN DEFINE LPAREN DOMAIN domainName RPAREN (domainItemDef)* RPAREN
    ;

libraryDef
    : LPAREN DEFINE LPAREN LIBRARY libraryName RPAREN (libraryItemDef)* RPAREN
    ;

problemDef
    : LPAREN DEFINE LPAREN PROBLEM problemName RPAREN (problemItemDef)* RPAREN
    ;

domainItemDef
    : domainLibrariesNameDef
    | requireDef
    | typesDef
    | predicateListDef
    | modalityDef
    | actionDef
    ;

libraryItemDef
    : requireDef
    | modalityDef
    | observabilityGroupsDef
    | actionTypeDef
    | eventDef
    ;

problemItemDef
    : problemDomainNameDef
    | requireDef
    | modalityDef
    | agentNamesDef
    | agentGroupsListDef
    | objectNamesDef
    | staticPredListDef
    | initDef
    | stateDef
    | goalDef
    ;

domainLibrariesNameDef
    : LPAREN ACTION_TYPE_LIBRARIES (libraryName)+ RPAREN
    ;

problemDomainNameDef
    : LPAREN CDOMAIN domainName RPAREN
    ;

agentNamesDef
    : LPAREN AGENTS typedAgentList RPAREN
    ;

agentGroupsListDef
    : LPAREN AGENT_GROUPS (agentGroupDef)+ RPAREN
    ;

agentGroupDef
    : LPAREN agentGroupName ASSIGN LPAREN agentName (agentName)* RPAREN RPAREN
    ;

objectNamesDef
    : LPAREN OBJECTS typedIdentList RPAREN
    ;

staticPredListDef
    : LPAREN STATIC (staticPredDef)+ RPAREN
    ;

requireDef
    : LPAREN REQUIREMENTS (requirementKey)* RPAREN
    ;

typesDef
    : LPAREN TYPES typedIdentList RPAREN
    ;

predicateListDef
    : LPAREN PREDICATES (predicateDef)+ RPAREN
    ;

predicateDef
    : LPAREN predicateName typedVariableList RPAREN
    ;

actionDef
    : LPAREN ACTION actionName parametersDef actionConditionDef actionPreDef actionTypeSignatureDef actionObsDef RPAREN
    ;

parametersDef
    : PARAMETERS LPAREN typedVariableList RPAREN
    ;

modalityDef
    : LPAREN MODALITY (modalityName)* RPAREN
    ;

observabilityGroupsDef
    : LPAREN OBSERVABILITY_GROUPS (observingAgentGroup)* RPAREN
    ;

eventDef
    : LPAREN EVENT eventName parametersDef eventPreDef eventPostDef RPAREN
    ;

eventPreDef
    : PRECONDITION formulaOrEmpty
    ;

eventPostDef
    : POSTCONDITIONS postconditionBlock
    | /* empty */
    ;

postconditionBlock
    : LPAREN COLON (postcondition)* RPAREN
    ;

postcondition
    : simplePostcondition
    | LPAREN FORALL LPAREN typedVariableList RPAREN simplePostcondition RPAREN
    | LPAREN VARIABLE RPAREN
    ;

simplePostcondition
    : LPAREN IFF formulaOrEmpty literal RPAREN
    | LPAREN WHEN formulaOrEmpty literal RPAREN
    | LPAREN ALWAYS literal RPAREN
    ;

actionTypeDef
    : LPAREN ACTION_TYPE actionTypeName parametersDef actionTypeGroupsDef actionTypeEventsDef actionTypeRelDef actionTypeDesignDef RPAREN
    ;

stateDef
    : LPAREN STATE stateName stateWorldsDef stateRelDef stateValDef stateDesignDef RPAREN
    ;

initDef
    : LPAREN INIT initialStateDescr RPAREN
    ;

goalDef
    : LPAREN GOAL formula RPAREN
    ;

actionConditionDef
    : WHERE conditionFormula
    | /* empty */ 
    ;

actionTypeSignatureDef
    : ACTION_TYPE LPAREN actionTypeName (parameter)* RPAREN
    ;

actionPreDef
    : PRECONDITION formulaOrEmpty
    ;

actionObsDef
    : OBSERVABILITY_CONDITIONS (obsConditionDef)*
    | /* empty */ 
    ;

typedIdentList
    : (NAME (NAME)* ASSIGN type typedIdentList)*
    ;

typedVariableList
    : (VARIABLE (VARIABLE)* DASH type typedVariableList)?
    | /* empty */  // For optional empty list case
    ;

type
    : reservedType
    | NAME
    ;

reservedType
    : AGENT
    | PREDICATE
    | LITERAL
    | PREDICATE_FORMULA
    | FORMULA
    | POSTCONDITION
    ;

formula
    : LPAREN IMPLY formula formula RPAREN
    | LPAREN OR formula (formula)* RPAREN
    | LPAREN AND formula (formula)* RPAREN
    | LPAREN NOT formula RPAREN
    | LPAREN EXISTS LPAREN typedVariableList RPAREN formula RPAREN
    | LPAREN FORALL LPAREN typedVariableList RPAREN formula RPAREN
    | modality formula
    | predicateFormula
    | atomicEqFormula
    | TRUE
    | FALSE
    ;

conditionFormula
    : LPAREN AND condition (condition)* RPAREN
    | condition
    ;

condition
    : atomicCondition
    | LPAREN NOT atomicCondition RPAREN
    ;

atomicCondition
    : LPAREN predicateName (term)* RPAREN
    | LPAREN ASSIGN term term RPAREN
    ;

predicateFormula
    : LPAREN predicateName (term)* RPAREN
    ;

atomicEqFormula
    : LPAREN ASSIGN term term RPAREN
    ;

term
    : groundTerm
    | VARIABLE
    ;

groundTerm
    : NAME
    | agentName
    ;

modality
    : singleModality
    | groupModality
    ;

singleModality
    : LBRACKET modalityLabel modalityAgent RBRACKET
    | LT modalityLabel modalityAgent GT
    ;

groupModality
    : LBRACKET modalityLabel modalityAgentGroup RBRACKET
    | LT modalityLabel modalityAgentGroup GT
    ;

modalityLabel
    : modalityName
    | /* empty */ 
    ;

modalityAgent
    : agentName
    | VARIABLE
    | allAgents
    ;

modalityAgentGroup
    : modalityAgent (modalityAgent)*
    ;

allAgents
    : ALL
    ;

predicateName
    : NAME
    ;

domainName
    : NAME
    ;

problemName
    : NAME
    ;

libraryName
    : NAME
    ;

stateName
    : NAME
    ;

worldName
    : NAME
    ;

actionName
    : NAME
    ;

eventName
    : NAME
    ;

agentName
    : AGENT_NAME
    ;

modalityName
    : MODALITY_NAME
    ;

staticPredDef
    : LPAREN predicateName (genericName)* RPAREN
    ;

genericName
    : NAME
    | agentName
    ;

stateWorldsDef
    : WORLDS LPAREN (worldName)+ RPAREN
    ;

stateRelDef
    : RELATIONS stateRelations
    ;

stateRelations
    : (worldRelation)+
    | LPAREN TRIVIAL_DEF RPAREN
    ;

worldRelation
    : LPAREN agentGroup (worldNamePair)+ RPAREN
    ;

worldNamePair
    : LPAREN worldName worldName RPAREN
    ;

stateValDef
    : VALUATION stateValuation
    ;

stateValuation
    : (worldValuation)+
    | LPAREN TRIVIAL_DEF RPAREN  // Trivial valuation
    ;

worldValuation
    : LPAREN worldName LBRACKET (literal)* RBRACKET RPAREN
    ;

stateDesignDef
    : DESIGNATED LPAREN (worldName)+ RPAREN
    ;

// Agent Group Definition
agentGroup
    : agentGroupName
    | LBRACE agentName (agentName)* RBRACE
    ;

// Literal Definition
literal
    : predicate
    | LPAREN NOT predicate RPAREN
    ;

// Initial State Description
initialStateDescr
    : (fTheoryFormula)+
    | LPAREN STATE_NAME stateName RPAREN
    ;

fTheoryFormula
    : simpleFTheoryFormula
    | LPAREN FORALL LPAREN typedVariableList RPAREN simpleFTheoryFormula RPAREN
    ;

simpleFTheoryFormula
    : predicateFormula
    | LPAREN LBRACKET ALL RBRACKET predicateFormula RPAREN
    | LPAREN LBRACKET ALL RBRACKET LBRACKET agentName RBRACKET predicateFormula RPAREN
    | LPAREN LBRACKET ALL RBRACKET knowsWhether predicateFormula RPAREN
    | LPAREN LBRACKET ALL RBRACKET LPAREN NOT knowsWhether predicateFormula RPAREN RPAREN
    ;

actionTypeName
    : NAME
    ;

parameter
    : LPAREN VARIABLE ASSIGN expression RPAREN
    ;

expression
    : term
    | formula
    | postconditionBlock
    ;

formulaOrEmpty
    : formula
    | TRIVIAL_DEF  // Trivial case, representing an empty formula
    ;

obsConditionDef
    : universalObsCond
    | obsCondition
    ;

universalObsCond
    : LPAREN FORALL LPAREN VARIABLE DASH type RPAREN (obsCondition)+ RPAREN
    ;

obsCondition
    : trivialObsCond
    | ifObsCond
    | otherwiseObsCond
    ;

trivialObsCond
    : LPAREN observingAgent observingAgentGroup RPAREN
    ;

ifObsCond
    : LPAREN IF formula observingAgent observingAgentGroup RPAREN
    ;

otherwiseObsCond
    : LPAREN OTHERWISE observingAgent observingAgentGroup RPAREN
    ;

observingAgent
    : AGENT_NAME
    | VARIABLE
    | ALL
    ;

observingAgentGroup
    : observingAgent (observingAgent)*
    ;

agentGroupName
    : AGENT_NAME
    | ALL
    ;

predicate
    : LPAREN predicateName (term)* RPAREN
    ;

actionTypeGroupsDef
    : OBSERVABILITY_GROUPS LPAREN (observingAgentGroup)* RPAREN
    | /* empty */
    ;

actionTypeEventsDef
    : EVENT (eventSignature)+
    ;

eventSignature
    : LPAREN eventName (parameter)* RPAREN
    ;

actionTypeRelDef
    : RELATIONS actionRelations
    ;

actionRelations
    : (eventRelation)+
    | LPAREN TRIVIAL_DEF RPAREN 
    ;

eventRelation
    : LPAREN agentGroup (eventNamePair)+ RPAREN
    ;

eventNamePair
    : LPAREN eventName eventName RPAREN
    ;

actionTypeDesignDef
    : DESIGNATED LPAREN (eventName)* RPAREN
    ;

typedAgentList
    : (AGENT_NAME (AGENT_NAME)* DASH type typedAgentList)?
    ;

knowsWhether
    : LBRACKET MODALITY_NAME agentName RBRACKET
    ;

requirementKey
    : DEL
    | TYPING
    | EQUALITY
    | MULTI_AGENT
    | ONTIC_ACTIONS
    | EXISTENTIAL_FORMULAE
    | UNIVERSAL_FORMULAE
    | UNIVERSAL_POSTCONDITIONS
    | MODAL_PRECONDITIONS
    | MODAL_POSTCONDITIONS
    | MODALITIES
    | ONTIC_CHANGE
    | COMMON_KNOWLEDGE
    | DYNAMIC_COMMON_KNOWLEDGE
    | FINITARY_S5_THEORY
    | LPAREN MAX_PRECONDITIONS_DEPTH INT RPAREN
    | LPAREN MAX_POSTCONDITIONS_DEPTH INT RPAREN
    | LPAREN MAX_MODAL_DEPTH INT RPAREN
    ;