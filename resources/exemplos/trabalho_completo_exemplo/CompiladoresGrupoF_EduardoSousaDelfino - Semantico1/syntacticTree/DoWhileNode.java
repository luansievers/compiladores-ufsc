package syntacticTree;

import parser.*;


public class DoWhileNode extends StatementNode {
    public StatementNode stat;
    public ExpreNode expr;

    public DoWhileNode(Token t, StatementNode s, ExpreNode e) {
        super(t);
        stat = s;
		expr = e;
    }
}
