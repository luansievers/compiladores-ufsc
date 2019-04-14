package syntactictree;

import parser.Token;

public class ClassDeclNode extends GeneralNode{

	public Token nameToken;
	public Token superNameToken;
	public ClassBodyNode classBody;

	public ClassDeclNode(Token classToken, Token nameToken, Token superNameToken,ClassBodyNode classBody) {
		super(classToken);
		this.nameToken = nameToken;
		this.superNameToken = superNameToken;
		this.classBody = classBody;
	}

}
