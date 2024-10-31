public class Action
{
    public string Name { get; set; }
    public List<Parameter> Parameters { get; set; } = new List<Parameter>();
    public Condition Precondition { get; set; }
    public Condition Effect { get; set; }
}
