using Antlr4.Runtime;
using Antlr4.Runtime.Tree;

public class ParserUtils
{
    public static string FormatParseTree(IParseTree tree, Parser parser, int level = 0)
    {
        string indent = new string(' ', level * 2); // Indentation based on tree depth
        if (tree is ITerminalNode terminalNode)
        {
            return indent + terminalNode.GetText();
        }

        // If it's a non-terminal node, print the rule name and recurse
        string ruleName = parser.RuleNames[((RuleContext)tree).RuleIndex];
        string formattedTree = indent + "(" + ruleName;

        for (int i = 0; i < tree.ChildCount; i++)
        {
            formattedTree += "\n" + FormatParseTree(tree.GetChild(i), parser, level + 1);
        }

        formattedTree += ")";
        return formattedTree;
    }
}