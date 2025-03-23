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
    : LPAREN OBJECTS typedLine* RPAREN
    ;

typedLine
    : (NAME)+ DASH type
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

// actionDef
//     : LPAREN ACTION actionName parametersDef actionConditionDef actionPreDef actionTypeSignatureDef actionObsDef RPAREN
//     ;

actionDef
    : LPAREN ACTION actionName parametersDef ownersDef eventsDef accessibilityDef RPAREN
    ;

ownersDef
    : OWNERS agentList
    ;

agentList
    : LPAREN (agentName)* RPAREN
    | ALL
    ;

eventsDef
    : EVENTS LPAREN (eventDef)+ RPAREN
    ;

eventDef
    : LPAREN NAME
      (PRECONDITION formulaOrEmpty)
      (EFFECT effectDef)
      RPAREN
    ;

effectDef
    : TRIVIAL_DEF // effect is Top, i.e. everything applies as before the event
    | LPAREN (literal)+ RPAREN
    ;

literal
    : predicate
    | LPAREN NOT predicate RPAREN
    ;

accessibilityDef
    : ACCESSIBILITY TRIVIAL_DEF
    | ACCESSIBILITY LPAREN (accessibilityRel)+ RPAREN
    ;

accessibilityRel
    : LPAREN NAME NAME (NAME)+ RPAREN
    ;

// eventDef
//     : LPAREN EVENT eventName parametersDef eventPreDef eventPostDef RPAREN
//     ;

eventPreDef
    : PRECONDITION formulaOrEmpty
    ;

eventPostDef
    : POSTCONDITIONS postconditionBlock
    | /* empty */
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

// initDef
//     : LPAREN INIT initialStateDescr RPAREN
//     ;

initDef
    : LPAREN INIT worldsDef accessibilityDef RPAREN
    ;

worldsDef
    : WORLDS LPAREN (worldDef)+ RPAREN
    ;

worldDef
    : LPAREN worldName LPAREN (predicate)+ RPAREN RPAREN
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
    | /* empty */ 
    ;

actionPreDef
    : PRECONDITION formulaOrEmpty
    ;

actionObsDef
    : OBSERVABILITY_CONDITIONS (obsConditionDef)*
    | /* empty */ 
    ;

typedIdentList
    : type (type)*
    | NAME (NAME)* DASH type typedIdentList
    ;

typedVariableList
    : (VARIABLE)*
    | VARIABLE (VARIABLE)* DASH type typedVariableList
    ;

typedAgentList
    : (AGENT_NAME)*
    | AGENT_NAME (AGENT_NAME)* DASH type typedAgentList
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
    : predicate
    | LPAREN ASSIGN term term RPAREN
    ;

predicateFormula
    : LPAREN 'imply' predicateFormula predicateFormula RPAREN
    | LPAREN 'or' predicateFormula+ RPAREN
    | LPAREN 'and' predicateFormula+ RPAREN
    | LPAREN 'not' predicateFormula RPAREN
    | LPAREN 'exists' LPAREN typedVariableList RPAREN predicateFormula RPAREN
    | LPAREN 'forall' LPAREN typedVariableList RPAREN predicateFormula RPAREN
    | predicate
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

agentGroup
    : agentGroupName
    | LBRACE agentName (agentName)* RBRACE
    ;

initialStateDescr
    : (fTheoryFormula)*
    | LPAREN STATE_NAME stateName RPAREN
    ;

fTheoryFormula
    : simpleFTheoryFormula
    | LPAREN FORALL LPAREN typedVariableList RPAREN simpleFTheoryFormula RPAREN
    ;

simpleFTheoryFormula
    : predicateFormula
    | LBRACKET ALL RBRACKET predicateFormula
    | LBRACKET ALL RBRACKET LBRACKET agentName RBRACKET predicateFormula
    | LBRACKET ALL RBRACKET knowsWhether predicateFormula
    | LBRACKET ALL RBRACKET LPAREN NOT knowsWhether predicateFormula RPAREN
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
    : TRIVIAL_DEF
    | formula
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

knowsWhether
    : LBRACKET MODALITY_NAME agentName RBRACKET
    ;

requirementKey
    : REQUIREMENT_NAME
    ;