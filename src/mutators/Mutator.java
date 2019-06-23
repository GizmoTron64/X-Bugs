package mutators;

import grammars.JavaGrammarLexer;
import grammars.JavaGrammarParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import visitors.RTXCVisitor;

import java.io.IOException;


public class Mutator {

    private CharStream charStream;
    private JavaGrammarLexer lexer;
    private CommonTokenStream tokens;
    private JavaGrammarParser parser;
    private TokenStreamRewriter rewriter;
    private RTXCVisitor visitor;
    private ParserRuleContext prc;
    private ParseTree tree;

    public Mutator() throws IOException {
        charStream = CharStreams.fromFileName("H:\\My Documents\\Dissertation\\wait.txt"); //  "C:\\Users\\headl\\OneDrive\\Documents\\Uni\\Dissertation\\waitStatement.txt"
        lexer = new JavaGrammarLexer(charStream);
        tokens = new CommonTokenStream(lexer);
        tokens.fill();
        parser = new JavaGrammarParser(tokens);
        tree = parser.waitStatement();
        rewriter = new TokenStreamRewriter(tokens);
        ParseTreeWalker walker = new ParseTreeWalker();

            //System.out.println(tree);
        //System.out.println(tree.toStringTree(parser));
        //System.out.println(tree.getText());
        //walker.walk(new RTXCListener(parser), tree);
        rewriter.insertAfter(8, "*2");
        System.out.println(tree.toStringTree(parser));


        System.out.println(tokens.getText());

    }



}
