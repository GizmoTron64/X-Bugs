package visitors;

import grammars.JavaGrammarBaseVisitor;
import grammars.JavaGrammarParser;

public class RTXCVisitor extends JavaGrammarBaseVisitor {

    @Override
    public Object visitJoinCall(JavaGrammarParser.JoinCallContext ctx) {
        return super.visitJoinCall(ctx);
    }

    @Override
    public Object visitWaitStatement(JavaGrammarParser.WaitStatementContext ctx) {
        return ctx.getText();
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
