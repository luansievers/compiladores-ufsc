package syntactictree;

import parser.Token;

public class IndexNode extends ExpreNode{

	public ExpreNode e1;
	public ExpreNode e2;

	public IndexNode(Token t1, ExpreNode e1, ExpreNode e2) {
		super(t1);
		this.e1 = e1;
		this.e2 = e2;
	}

}
