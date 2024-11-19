using Antlr4.Runtime;

class Program
{
    static void Main(string[] args)
    {
        string filePath = "input.txt";
        var input = File.ReadAllText(filePath);

        AntlrInputStream inputStream = new AntlrInputStream(input);
        EPDDLLexer lexer = new EPDDLLexer(inputStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);

        // Print the token stream for debugging
        tokenStream.Fill();
        foreach (var token in tokenStream.GetTokens())
        {
            Console.WriteLine(token.ToString());
        }

        EPDDLParser parser = new EPDDLParser(tokenStream);
        var tree = parser.mainDef();

        EPDDLVisitor visitor = new EPDDLVisitor();
        visitor.Visit(tree);

        Console.WriteLine(ParserUtils.FormatParseTree(tree, parser));
    }
}