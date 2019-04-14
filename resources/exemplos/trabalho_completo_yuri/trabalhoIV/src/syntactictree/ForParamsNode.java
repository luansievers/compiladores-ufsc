package syntactictree;

import parser.Token;

public class ForParamsNode extends GeneralNode{

	public AtribStatNode s1;
	public ExpreNode e1;
	public AtribStatNode s2;

	public ForParamsNode(Token position,AtribStatNode s1,ExpreNode e1,AtribStatNode s2) {
		super(position);
		this.s1 = s1;
		this.e1 = e1;
		this.s2 = s2;
	}

}
