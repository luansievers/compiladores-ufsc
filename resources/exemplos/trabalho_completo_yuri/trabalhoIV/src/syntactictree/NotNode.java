package syntactictree;

import parser.Token;

public class NotNode extends ExpreNode{
	
	public ExpreNode expre;

	public NotNode(Token not, ExpreNode expre) {
		super(not);
		this.expre = expre;
		
	}

}
