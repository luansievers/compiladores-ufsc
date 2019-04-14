package syntactictree;

import parser.Token;

public class MethodDeclNode extends GeneralNode{
	public Token name =null;
	public int dimension = 0;
	public MethodBodyNode methodBody = null;
			
	public MethodDeclNode(Token type,Token name,int dimension, MethodBodyNode methodBody) {
		super(type);
		this.name = name;
		this.dimension = dimension;
		this.methodBody = methodBody;
	}

}
