package mutators;

import grammars.JavaGrammarLexer;
import grammars.JavaGrammarParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import visitors.RTXCListener;
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
        charStream = CharStreams.fromFileName("C:\\Users\\headl\\OneDrive\\Documents\\Uni\\Dissertation\\waitStatement.txt"); // H:\My Documents\Dissertation\
        lexer = new JavaGrammarLexer(charStream);
        tokens = new CommonTokenStream(lexer);
        parser = new JavaGrammarParser(tokens);
        tree = parser.compilationUnit();
        ParseTreeWalker walker = new ParseTreeWalker();

            //System.out.println(tree);
        //System.out.println(tree.toStringTree(parser));
        //System.out.println(tree.getText());
        walker.walk(new RTXCListener(parser), tree);
        System.out.println(tree.toStringTree(parser));

        System.out.println(tree.getText());

    }



}
