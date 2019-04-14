package semanalysis;

import parser.Token;

public class SemanticException extends Exception {
	
	public Token tkn;

	public SemanticException(String string) {
		super(string);
	}
	
	public SemanticException(Token vToken, String string) {
		super(string);
		tkn = vToken;
	}

}
