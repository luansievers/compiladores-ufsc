package syntactictree;

import parser.Token;

public class ClassBodyNode extends GeneralNode{
	public ListNode list;
	public ClassBodyNode(ListNode list, Token token) {
		super(token);
		this.list=list;
	}

}
