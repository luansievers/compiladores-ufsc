package syntactictree;

import parser.Token;

public class AtribStatNode extends StatementNode{
	public Token ident;
	public ExpreNode name;
	public ExpreNode value;
	public Token type;
	public int dimension;
	
	public AtribStatNode(Token type, Token equals, ExpreNode name,Token ident, ExpreNode value, int dimension) {
		super(equals);
		this.name = name;
		this.type = type;
		this.value = value;
		this.ident = ident;
		this.dimension = dimension;
	}

}
