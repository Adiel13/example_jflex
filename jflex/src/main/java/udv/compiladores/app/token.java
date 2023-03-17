package udv.compiladores.app;

public class token {
	private TokenConstants tokenType;
	private String lexema;
	private String ER;
	private int line;
	private int column;
	
	public token(TokenConstants tokenType, String lexema, int line, int column, String ER) {
		this.tokenType= tokenType;
		this.lexema = lexema;
		this.line = line;
		this.column = column;
		this.ER = ER;
	}
	
	public void setTokenType(TokenConstants tokenType) {
		this.tokenType= tokenType;
	}
	
	public TokenConstants gettokenType() {
		return this.tokenType;
	}
	
	public String getLexema() {
		return this.lexema;
	}
	
	public void setLexema(String lexema) {
		this.lexema = lexema;
	}
	
	public String getER() {
		return this.ER;
	}
	
	public void setER(String ER) {
		this.ER = ER;
	}
	
	public int getLine() {
		return this.line;
	}
	
	public void setLine(int line) {
		this.line= line;
	}
	
	public int getColumn() {
		return this.column;
	}
	
	public void setColumn(int column) {
		this.column = column;
	}
	
	
}
