package syntactictree;

import parser.Token;

public class VarDeclNode extends StatementNode{
	public ListNode listVars;
	
	public VarDeclNode(Token position,ListNode listVars) {
		super(position);
		this.listVars = listVars;
	}

}
