package syntacticTree;

import parser.*;


public class SwitchNode extends StatementNode {
	public Token name;
	public ExpreNode expr;
    public ListNode switchcases;

    public SwitchNode(Token t, Token t2, ExpreNode e, ListNode l) {
        super(t);
		name = t2;
		expr = e;
        switchcases = l;
    }
}
