package syntacticTree;

import parser.*;

public class AtribDeclNode extends StatementNode {
    public AtribNode atrib;

    public AtribDeclNode(Token t, Token t1, AtribNode at) {
        super(t);
        super(t1);
        atrib = at;
    }
}
