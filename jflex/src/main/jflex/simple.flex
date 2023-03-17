package udv.compiladores.app;

import java.io.*;
import java.util.ArrayList;

%%
%public
%class DemoLexer
%function next_token 

digit = [0-9]
letter = [a-zA-Z]
Whitespace = [ \t\f] | {LineTerminator}
LineTerminator = \r|\n|\r\n

%type token
%eofval{
	return new token(TokenConstants.EOF, null, -1, -1, null);
%eofval}
%%

<YYINITIAL>{letter}({letter}|{digit})* { return new token(TokenConstants.ID, yytext(), yyline, yycolumn, "{letter}({letter}|{digit})*"); }
<YYINITIAL>"\""({digit}|{letter}|{Whitespace})+"\"" {return new token(TokenConstants.VAL, yytext(), yyline, yycolumn, "({digit}|{letter}|{Whitespace})+"); }
<YYINITIAL>"{" { return new token(TokenConstants.LLA, yytext(), yyline, yycolumn, "{"); }
<YYINITIAL>"}" { return new token(TokenConstants.LLC, yytext(), yyline, yycolumn, "}"); }
<YYINITIAL>"[" { return new token(TokenConstants.CA, yytext(), yyline, yycolumn, "["); }
<YYINITIAL>"]" { return new token(TokenConstants.CC, yytext(), yyline, yycolumn, "]"); }
<YYINITIAL>":" { return new token(TokenConstants.DP, yytext(), yyline, yycolumn, ":"); }
<YYINITIAL>"," { return new token(TokenConstants.COMMA, yytext(), yyline, yycolumn, ","); }
<YYINITIAL>"\"" { return new token(TokenConstants.COMILLA, yytext(), yyline, yycolumn, "\""); }
<YYINITIAL>({digit})+ { return new token(TokenConstants.NUM, yytext(), yyline, yycolumn, "{letter}({letter}|{digit})*"); }

<YYINITIAL>{Whitespace} {}

\n {yychar=1;}
. {System.err.println("warning: Unrecognized character '" + yytext()+"' -- ignored" + " at : "+ (yyline+1) + " " + (yycolumn+1) + " " + yychar); }