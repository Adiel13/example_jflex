package udv.compiladores.app;

public class token {
	private TokenConstants tokenType;
	private String lexema;
	
	public token(TokenConstants tokenType, String lexema) {
		this.tokenType= tokenType;
		this.lexema = lexema;
	}
	
	public void setTokenType(TokenConstants tokenType) {
		this.tokenType= tokenType;
	}
	
	public void setLexema(String lexema) {
		this.lexema = lexema;
	}
	
	public TokenConstants gettokenType() {
		return this.tokenType;
	}
	
	public String getLexema() {
		return this.lexema;
	}
	
	
}
