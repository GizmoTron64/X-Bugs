package visitors;

import grammars.JavaGrammarBaseListener;
import grammars.JavaGrammarParser;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;

public class RTXCListener extends JavaGrammarBaseListener {
    JavaGrammarParser parser;

    public RTXCListener(JavaGrammarParser parser) {this.parser = parser;}

    @Override
    public void enterWaitStatement(JavaGrammarParser.WaitStatementContext ctx) {
        TokenStream tokens = parser.getTokenStream();
        TokenStreamRewriter rewriter = new TokenStreamRewriter(tokens);
        System.out.println(tokens.getText());
        rewriter.delete(0);
        System.out.println(tokens.getText());
    }

}
