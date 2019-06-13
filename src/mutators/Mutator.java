package mutators;

import grammars.JavaGrammarBaseVisitor;
import grammars.JavaGrammarLexer;
import grammars.JavaGrammarParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;


public class Mutator {

    private CharStream charStream;
    private JavaGrammarLexer lexer;
    private CommonTokenStream tokens;
    private JavaGrammarParser parser;
    private TokenStreamRewriter rewriter;

    public Mutator() {
        charStream = CharStreams.fromString("H:\\My Documents\\Dissertation\\test1.txt");
        lexer = new JavaGrammarLexer(charStream);
        tokens = new CommonTokenStream(lexer);
        parser = new JavaGrammarParser(tokens);
        rewriter = new TokenStreamRewriter(tokens);
    }

    public static class RTXCVisitor extends JavaGrammarBaseVisitor {

        @Override
        public Object visitJoinCall(JavaGrammarParser.JoinCallContext ctx) {
            
            return super.visitJoinCall(ctx);
        }

        @Override
        public Object visitWaitStatement(JavaGrammarParser.WaitStatementContext ctx) {
            return super.visitWaitStatement(ctx);
        }

        @Override
        public Object visitNotifyStatement(JavaGrammarParser.NotifyStatementContext ctx) {
            return super.visitNotifyStatement(ctx);
        }

        @Override
        public Object visitNotifyAllStatement(JavaGrammarParser.NotifyAllStatementContext ctx) {
            return super.visitNotifyAllStatement(ctx);
        }

        @Override
        public Object visitSleepStatement(JavaGrammarParser.SleepStatementContext ctx) {
            return super.visitSleepStatement(ctx);
        }
    }


}
