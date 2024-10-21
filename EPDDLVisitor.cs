public class EPDDLVisitor : EPDDLParserBaseVisitor<object>
{
    public override object VisitActionDef(EPDDLParser.ActionDefContext context)
    {
        Console.WriteLine("Visiting Action Definition: " + context.actionName().GetText());
        // Custom logic to process actions
        return base.VisitActionDef(context);
    }

    public override object VisitPredicateDef(EPDDLParser.PredicateDefContext context)
    {
        Console.WriteLine("Visiting Predicate: " + context.predicateName().GetText());
        // Custom logic to process predicates
        return base.VisitPredicateDef(context);
    }
}
