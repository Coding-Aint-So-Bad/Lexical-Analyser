lexer grammar CoolLexer;

tokens{
	ERROR,
	TYPEID,
	OBJECTID,
	BOOL_CONST,
	INT_CONST,
	STR_CONST,
	LPAREN,
	RPAREN,
	COLON,
	ATSYM,
	SEMICOLON,
	COMMA,
	PLUS,
	MINUS,
	STAR,
	SLASH,
	TILDE,
	LT,
	EQUALS,
	LBRACE,
	RBRACE,
	DOT,
	DARROW,
	LE,
	ASSIGN,
	CLASS,
	ELSE,
	FI,
	IF,
	IN,
	INHERITS,
	LET,
	LOOP,
	POOL,
	THEN,
	WHILE,
	CASE,
	ESAC,
	OF,
	NEW,
	ISVOID,
	NOT
}

/*
  DO NOT EDIT CODE ABOVE THIS LINE
*/

@members{

	/*
		YOU CAN ADD YOUR MEMBER VARIABLES AND METHODS HERE
	*/

	/**
	* Function to report errors.
	* Use this function whenever your lexer encounters any erroneous input
	* DO NOT EDIT THIS FUNCTION
	*/
	public void reportError(String errorString){
		setText(errorString);
		setType(ERROR);
	}

	public void notLocated() {
		Token t = _factory.create(_tokenFactorySourcePair, _type, _text, _channel, _tokenStartCharIndex, getCharIndex()-1, _tokenStartLine, _tokenStartCharPositionInLine);
		String msg = t.getText();
		reportError(msg);
	}

	public void processString() {
		Token t = _factory.create(_tokenFactorySourcePair, _type, _text, _channel, _tokenStartCharIndex, getCharIndex()-1, _tokenStartLine, _tokenStartCharPositionInLine);
		String text = t.getText();

		//write your code to test strings here

		String phrase = "";

		/*if(text.indexOf('\0') != -1)
		{
			reportError("String contains null character");
			return;
		}*/
		if(text.length()>1024) 
		{
			reportError("String constant too long");
			return; //We have an upper limit on the length of the string and if breached, we must report error.
		}

		StringBuilder buff = new StringBuilder(0);

		for(int i=0; i<text.length(); i++)
		{
			/*if(text.charAt(i) == '\0') //The condition where there is a null charecter present in the string
			{
				reportError("String contains null character");
				return;
			}*/
			if(text.charAt(i) == '\\')
			{
				if(text.charAt(i+1)== 't')
					buff.append('\t');
				else if(text.charAt(i+1) == 'n')
					buff.append('\n');
				else if(text.charAt(i+1) == 'f')
					buff.append('\f');
				else if(text.charAt(i+1) == 'b')
					buff.append('\b');
				else if(text.charAt(i+1) == '\\')
					buff.append('\\');
				else if(text.charAt(i+1) == '"')
					buff.append('"');	
				else
					buff.append(text.charAt(i+1));													
			}
			else
			{
				buff.append(text.charAt(i));
			}
			setText(phrase);
			return;
		}
	}

	public void checkChar() {
		Token t = _factory.create(_tokenFactorySourcePair, _type, _text, _channel, _tokenStartCharIndex, getCharIndex()-1, _tokenStartLine, _tokenStartCharPositionInLine);
		String msg = t.getText();
		reportError(msg);
	}
}

/*
	WRITE ALL LEXER RULES BELOW
*/

ERROR 		: '"' ~["\nEOF]*('\n'){reportError("Unterminated string constant");} | '"' (ESC_SEQ | ~["]) '\n'(.?) '"' {reportError("Unescaped new line in string literal");} | '"' ~[\n"]*(EOF) {reportError("EOF in string constant");} | '"' ( ~[\u0000]* ('\\u0000') )+ ~["\nEOF]* ["\nEOF] { reportError("String contains null character");};
SEMICOLON   : ';';
DARROW      : '=>';

INT_CONST	: [0-9]+;
STR_CONST	: '"'(ESC_SEQ | ~('"'|'\n'|'\\'))*'"' {processString();};

fragment ESC_SEQ : '\\';

TYPEID		: [A-Z][0-9a-zA-Z_]*;
OBJECTID	: [a-z][0-9a-zA-Z_]*;

fragment ESCAPE : '\\'.;
SELF_TYPE 	: 'SELF_TYPE';
SELF 		: 'self';

LPAREN  	: '(';
RPAREN 		: ')';
COLON 		: ':';
ATSYM 		: '@';
COMMA 		: ',';
PLUS 		: '+';
MINUS 		: '-';
STAR 		: '*';
SLASH 		: '/';
TILDE 		: '~';
LT 			: '<';
EQUALS 		: '=';
LBRACE 		: '{';
RBRACE 		: '}';
DOT 		: '.';
LE 			: '<=';
ASSIGN 		: '<-';


/*
Keywords that are case insensitive can have a mix of upper and lower case letters
*/

CLASS		: [cC][lL][aA][sS][sS];
ELSE		: [eE][lL][sS][eE];
FI 			: [fF][iI];
IF 			: [iI][fF];
IN 			: [iI][nN];
INHERITS	: [iI][nN][hH][eE][rR][iI][tT][sS];
LET 		: [lL][eE][tT];
LOOP  		: [lL][oO][oO][pP];
POOL 		: [pP][oO][oO][lL];
THEN 		: [tT][hH][eE][nN];
WHILE 		: [wW][hH][iI][lL][eE];
CASE 		: [cC][aA][sS][eE];
ESAC 		: [eE][sS][aA][cC];
OF 			: [oO][fF];
NEW 		: [nN][eE][wW];
ISVOID 		: [iI][sS][vV][oO][iI][dD];
NOT 		: [nN][oO][tT];

fragment TRUE 		: 't'[rR][uU][eE];
fragment FALSE 		: 'f'[aA][lL][sS][eE]; 

/* BOOL_CONST must begin with a lower case letter */

BOOL_CONST 	: TRUE | FALSE;

WHITESPACE 	: [\t\r\f\n\v\b" "]+ -> skip ;
/* This causes us to skip spaces, tabs, and newlines */

/* Keywords are finished */

INCORRECT_CHARACTER : . {checkChar();};
END_COMMENT : '*)' {reportError("Unmatched *)");};
UN_COMMENT  : '*)' {reportError("Unmatched *)");};
LINE_COMMENT: '--'~[\r\n]* -> skip ;

COMMENT 	: '(*'-> pushMode(FIRST), skip;

mode FIRST;
CASE1 		: .(EOF) {reportError("EOF in comment");};
CASE2 		: '(*'	{reportError("EOF in comment");};
OPEN1 		: '(*' -> pushMode(SECOND), skip;
CLOSE1 		: '*)' -> popMode, skip;
MSG1 		: . -> skip;

mode SECOND;
CASE3		: .(EOF) {reportError("EOF in comment");};
OPEN2 		: '(*' -> pushMode(SECOND), skip;
CASE4		: '(*'  {reportError("EOF in comment");};
CASE5		: '*)'  {reportError("EOF in comment");};
CLOSE2 		: '*)' -> popMode, skip;
MSG2 		: . -> skip;