package syntactictree;

import parser.Token;

public class NewObjectNode extends ExpreNode{

	public Token name;
	public ListNode args;
	
	public NewObjectNode(Token token, Token name, ListNode args) {
		super(token);
		this.name = name;
		this.args = args;
	}

}
