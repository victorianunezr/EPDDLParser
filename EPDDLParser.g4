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
    : LPAREN COLON ACTION_TYPE_LIBRARIES (libraryName)+ RPAREN
    ;

problemDomainNameDef
    : LPAREN COLON DOMAIN domainName RPAREN
    ;

agentNamesDef
    : LPAREN COLON AGENTS typedAgentList RPAREN
    ;

agentGroupsListDef
    : LPAREN COLON AGENT_GROUPS (agentGroupDef)+ RPAREN
    ;

agentGroupDef
    : LPAREN agentGroupName ASSIGN LPAREN agentName (agentName)* RPAREN RPAREN
    ;

objectNamesDef
    : LPAREN COLON OBJECTS typedIdentList RPAREN
    ;

staticPredListDef
    : LPAREN COLON STATIC (staticPredDef)+ RPAREN
    ;

requireDef
    : LPAREN COLON REQUIREMENTS (requirementKey)* RPAREN
    ;

typesDef
    : LPAREN COLON TYPES typedIdentList RPAREN
    ;

predicateListDef
    : LPAREN COLON PREDICATES (predicateDef)+ RPAREN
    ;

predicateDef
    : LPAREN predicateName typedVariableList RPAREN
    ;

actionDef
    : LPAREN COLON ACTION actionName parametersDef actionConditionDef actionTypeSignatureDef actionPreDef actionObsDef RPAREN
    ;

parametersDef
    : COLON PARAMETERS LPAREN typedVariableList RPAREN
    ;

modalityDef
    : LPAREN COLON MODALITY (modalityName)* RPAREN
    ;

observabilityGroupsDef
    : LPAREN COLON OBSERVABILITY_GROUPS (observingAgentGroup)* RPAREN
    ;

eventDef
    : LPAREN COLON EVENT eventName parametersDef eventPreDef eventPostDef RPAREN
    ;

eventPreDef
    : COLON PRECONDITION formulaOrEmpty
    ;

eventPostDef
    : COLON POSTCONDITIONS postconditionBlock
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
    : LPAREN COLON ACTION_TYPE actionTypeName parametersDef actionTypeGroupsDef actionTypeEventsDef actionTypeRelDef actionTypeDesignDef RPAREN
    ;

stateDef
    : LPAREN COLON STATE stateName stateWorldsDef stateRelDef stateValDef stateDesignDef RPAREN
    ;

initDef
    : LPAREN COLON INIT initialStateDescr RPAREN
    ;

goalDef
    : LPAREN COLON GOAL formula RPAREN
    ;

actionConditionDef
    : COLON WHERE conditionFormula
    | /* empty */ 
    ;

actionTypeSignatureDef
    : COLON ACTION_TYPE LPAREN actionTypeName (parameter)* RPAREN
    ;

actionPreDef
    : COLON PRECONDITION formulaOrEmpty
    ;

actionObsDef
    : COLON OBSERVABILITY_CONDITIONS (obsConditionDef)*
    | /* empty */ 
    ;

typedIdentList
    : (NAME (NAME)* ASSIGN type typedIdentList)*
    ;

typedVariableList
    : (VARIABLE (VARIABLE)* ASSIGN type typedVariableList)*
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
    : LPAREN modalityLabel modalityAgent RPAREN
    ;

groupModality
    : LPAREN modalityLabel modalityAgentGroup RPAREN
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
    : COLON 'worlds' LPAREN (worldName)+ RPAREN
    ;

stateRelDef
    : COLON RELATIONS stateRelations
    ;

stateRelations
    : (worldRelation)+
    | LPAREN '()' RPAREN  // Trivial relation
    ;

worldRelation
    : LPAREN agentGroup (worldNamePair)+ RPAREN
    ;

worldNamePair
    : LPAREN worldName worldName RPAREN
    ;

stateValDef
    : COLON VALUTATION stateValuation
    ;

stateValuation
    : (worldValuation)+
    | LPAREN '()' RPAREN  // Trivial valuation
    ;

worldValuation
    : LPAREN worldName LBRACKET (literal)* RBRACKET RPAREN
    ;

stateDesignDef
    : COLON DESIGNATED LPAREN (worldName)+ RPAREN
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
    | LPAREN COLON STATE_NAME stateName RPAREN
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
    | LPAREN RPAREN  // Trivial case, representing an empty formula
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
    : COLON OBSERVABILITY_GROUPS LPAREN (observingAgentGroup)* RPAREN
    | /* empty */
    ;

actionTypeEventsDef
    : COLON EVENT (eventSignature)+
    ;

eventSignature
    : LPAREN eventName (parameter)* RPAREN
    ;

actionTypeRelDef
    : COLON RELATIONS actionRelations
    ;

actionRelations
    : (eventRelation)+
    | LPAREN TRIVIAL_RELATION RPAREN  // Trivial relation
    ;

eventRelation
    : LPAREN agentGroup (eventNamePair)+ RPAREN
    ;

eventNamePair
    : LPAREN eventName eventName RPAREN
    ;

actionTypeDesignDef
    : COLON DESIGNATED LPAREN (eventName)* RPAREN
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