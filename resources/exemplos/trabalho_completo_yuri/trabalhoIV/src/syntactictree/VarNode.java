package syntactictree;

import parser.Token;

public class VarNode extends ExpreNode{
	public int dimension;

	public VarNode(Token position) {
		super(position);
		this.dimension = 0;
	}
	
	public VarNode(Token position, int dimension) {
		super(position);
		this.dimension = dimension;
	}

}
