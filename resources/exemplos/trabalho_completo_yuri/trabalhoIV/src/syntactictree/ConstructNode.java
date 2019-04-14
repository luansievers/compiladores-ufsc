package syntactictree;

import parser.Token;

public class ConstructNode extends GeneralNode{
	public MethodBodyNode methodBody;
	public ConstructNode(Token constructor,MethodBodyNode methodBody) {
		super(constructor);
		this.methodBody = methodBody;
	}

}
