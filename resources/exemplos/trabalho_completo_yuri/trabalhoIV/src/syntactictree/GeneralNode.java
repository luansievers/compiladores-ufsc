package syntactictree;
import parser.Token;
public abstract class GeneralNode {
	public Token position;
	public int number;
	
	public GeneralNode(Token position){
		this.position=position;
		this.number = 0;
	}
}
