package syntactictree;

import parser.Token;

public class BlockNode extends StatementNode {
	ListNode stats;
	public BlockNode(Token position, ListNode list) {
		super(position);
		this.stats = list;
	}

}
