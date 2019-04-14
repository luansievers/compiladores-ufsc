package syntactictree;

import parser.Token;

public class SuperNode extends StatementNode {
    public ListNode args;

    public SuperNode(Token t, ListNode p) {
        super(t);
        args = p;
    }

}
