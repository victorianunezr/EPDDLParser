public class EPDDLVisitor : EPDDLParserBaseVisitor<object>
{
    private readonly Domain _domain = new Domain();

    public Domain ParsedDomain => _domain;

    public override object VisitDomainDef(EPDDLParser.DomainDefContext context)
    {
        _domain.Name = context.domainName().GetText();
        Console.WriteLine($"Domain name: {_domain.Name}");
        return _domain;
    }

    public override object VisitActionDef(EPDDLParser.ActionDefContext context)
    {
        var action = new Action
        {
            Name = context.actionName().GetText(),
            Parameters = ParseParameters(context.parametersDef())
        };
        _domain.Actions.Add(action);
        Console.WriteLine($"Added Action: {action.Name}");
        return action;
    }

    public override object VisitPredicateDef(EPDDLParser.PredicateDefContext context)
    {
        var predicate = new Predicate
        {
            Name = context.predicateName().GetText(),
            Arguments = ParseArguments(context.typedVariableList())
        };
        _domain.Predicates.Add(predicate);
        Console.WriteLine($"Added Predicate: {predicate.Name}");
        return predicate;
    }

    public override object VisitRequireDef(EPDDLParser.RequireDefContext context)
    {
        var requirement = new Requirement { Name = context.requirementKey().GetText() };
        _domain.Requirements.Add(requirement);
        Console.WriteLine($"Added Requirement: {requirement.Name}");
        return requirement;
    }

    public override object VisitTypesDef(EPDDLParser.TypesDefContext context)
    {
        ParseTypedIdentList(context.typedIdentList(), _domain);
        return _domain.Types;
    }

    private void ParseTypedIdentList(EPDDLParser.TypedIdentListContext context, Domain domain)
    {
        if (context == null) return;

        var typeDef = new TypeDefinition();

        typeDef.Name = context.NAME(0)?.GetText();  // First NAME token is the main type name

        // Collect subtypes if any
        if (context.NAME().Length > 1)
        {
            typeDef.SubTypes = context.NAME().Skip(1).Select(name => name.GetText()).ToList();
        }

        domain.Types.Add(typeDef);

        // Handle recursive typedIdentList if present
        foreach (var subContext in context.typedIdentList())
        {
            ParseTypedIdentList(subContext, domain);
        }
    }
        private List<Parameter> ParseParameters(EPDDLParser.ParametersDefContext context)
    {
        throw new NotImplementedException();
    }

    private List<Parameter> ParseArguments(EPDDLParser.TypedVariableListContext context)
    {
        throw new NotImplementedException();
    }
}
