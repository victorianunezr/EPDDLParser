public class Domain
{
    public string Name { get; set; }
    public List<Action> Actions { get; set; } = new List<Action>();
    public List<Predicate> Predicates { get; set; } = new List<Predicate>();
    public List<TypeDefinition> Types { get; set; } = new List<TypeDefinition>();
    public List<Requirement> Requirements { get; set; } = new List<Requirement>();
    public State InitialState { get; set; }
}
