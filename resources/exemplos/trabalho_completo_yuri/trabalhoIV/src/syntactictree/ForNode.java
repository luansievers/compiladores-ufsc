package syntactictree;

import parser.Token;

public class ForNode extends StatementNode {

    public ForParamsNode params;
	public StatementNode s3;

	public ForNode(Token t, ForParamsNode params,StatementNode s3) {
        super(t);
		this.params = params;
		this.s3 = s3;
		
        
    }
}
