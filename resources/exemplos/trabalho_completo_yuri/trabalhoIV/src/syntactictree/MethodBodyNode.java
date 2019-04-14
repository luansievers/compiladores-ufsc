package syntactictree;

import parser.Token;

public class MethodBodyNode extends GeneralNode{
	public ListNode params;
	public StatementNode statement;
	public MethodBodyNode(Token paren, ListNode params, StatementNode statement) {
		super(paren);
		this.params = params;
		this.statement = statement;
	}

}
