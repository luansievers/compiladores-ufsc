package syntactictree;

import parser.Token;

public class ClassBodyStatementNode extends GeneralNode{
	  public ListNode classList = null;
	  public VarDeclNode varDeclaration = null;
	  public AtribStatNode atributionStatement = null;
	  public ConstructNode construct = null;
	  public MethodDeclNode method = null;
	  
	public ClassBodyStatementNode(ListNode classList,VarDeclNode varDeclaration,AtribStatNode atributionStatement,ConstructNode construct,MethodDeclNode method,Token position) {
		super(position);
		this.classList = classList;
		this.varDeclaration = varDeclaration;
		this.atributionStatement = atributionStatement;
		this.construct = construct;
		this.method = method;
	}

}
