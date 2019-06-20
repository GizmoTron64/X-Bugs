package mutators;

import grammars.JavaGrammarLexer;
import grammars.JavaGrammarParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
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
        charStream = CharStreams.fromFileName("C:\\Users\\headl\\OneDrive\\Documents\\Uni\\Dissertation\\test1.txt"); // H:\My Documents\Dissertation\
        lexer = new JavaGrammarLexer(charStream);
        tokens = new CommonTokenStream(lexer);
        parser = new JavaGrammarParser(tokens);
        rewriter = new TokenStreamRewriter(tokens);
        parser.setBuildParseTree(true);

        prc = parser.compilationUnit();

        visitor = new RTXCVisitor();
        visitor.visitWaitStatement(parser.waitStatement());

        System.out.println(prc.getText());

    }

    public void removeWaitStatements() {

    }







}
