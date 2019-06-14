package mutators;

import grammars.JavaGrammarBaseVisitor;
import grammars.JavaGrammarLexer;
import grammars.JavaGrammarParser;
import org.antlr.v4.runtime.*;

import java.io.IOException;


public class Mutator {

    private CharStream charStream;
    private JavaGrammarLexer lexer;
    private CommonTokenStream tokens;
    private JavaGrammarParser parser;
    private RTXCVisitor visitor;

    public Mutator() throws IOException {
        charStream = CharStreams.fromFileName("H:\\My Documents\\Dissertation\\test1.txt");
        lexer = new JavaGrammarLexer(charStream);
        tokens = new CommonTokenStream(lexer);
        parser = new JavaGrammarParser(tokens);
        visitor = new RTXCVisitor();
    }

    public void visitWait() {
        visitor.visitWaitStatement(parser.waitStatement());
    }


    public static class RTXCVisitor extends JavaGrammarBaseVisitor {

        private TokenStreamRewriter rewriter;


        @Override
        public Object visitJoinCall(JavaGrammarParser.JoinCallContext ctx) {
            return super.visitJoinCall(ctx);
        }

        @Override
        public Object visitWaitStatement(JavaGrammarParser.WaitStatementContext ctx) {

            System.out.println(ctx);
            //rewriter.delete(ctx.start);
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
