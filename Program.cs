using System;
using Antlr4.Runtime;
using Antlr4.Runtime.Tree;

class Program
{
static void Main(string[] args)
    {
        // Specify the path to your input file
        string filePath = "input.txt";

        // Read the entire file into a string
        var input = File.ReadAllText(filePath);

        // Create a lexer and parser for the input
        AntlrInputStream inputStream = new AntlrInputStream(input);
        EPDDLLexer lexer = new EPDDLLexer(inputStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);

        // Print the token stream for debugging
        tokenStream.Fill();
        foreach (var token in tokenStream.GetTokens())
        {
            Console.WriteLine(token.ToString());
        }

        // Create the parser
        EPDDLParser parser = new EPDDLParser(tokenStream);

        // Parse the input
        var tree = parser.mainDef();
        Console.WriteLine(FormatParseTree(tree, parser));
    }

    public static string FormatParseTree(IParseTree tree, Parser parser, int level = 0)
    {
        string indent = new string(' ', level * 2); // Create indentation based on tree depth
        if (tree is ITerminalNode terminalNode)
        {
            // If it's a terminal node (leaf), return its text
            return indent + terminalNode.GetText();
        }

        // If it's a non-terminal node, print the rule name and recurse
        string ruleName = parser.RuleNames[((RuleContext)tree).RuleIndex];
        string formattedTree = indent + "(" + ruleName;

        // Recurse over the children
        for (int i = 0; i < tree.ChildCount; i++)
        {
            formattedTree += "\n" + FormatParseTree(tree.GetChild(i), parser, level + 1);
        }

        formattedTree += ")";
        return formattedTree;
    }
}


