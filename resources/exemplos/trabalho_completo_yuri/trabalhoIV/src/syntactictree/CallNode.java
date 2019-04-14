package syntactictree;

import parser.Token;

public class CallNode extends ExpreNode{

	public ExpreNode e1;
	public Token paren;
	public ListNode params;

	public CallNode(Token token, Token method,ExpreNode e1, ListNode params) {
		super(token);
		this.e1 = e1;
		this.paren = method;
		this.params = params;
	}
	

}
