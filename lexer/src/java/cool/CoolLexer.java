// Generated from CoolLexer.g4 by ANTLR 4.5
package cool;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CoolLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ERROR=1, TYPEID=2, OBJECTID=3, BOOL_CONST=4, INT_CONST=5, STR_CONST=6, 
		LPAREN=7, RPAREN=8, COLON=9, ATSYM=10, SEMICOLON=11, COMMA=12, PLUS=13, 
		MINUS=14, STAR=15, SLASH=16, TILDE=17, LT=18, EQUALS=19, LBRACE=20, RBRACE=21, 
		DOT=22, DARROW=23, LE=24, ASSIGN=25, CLASS=26, ELSE=27, FI=28, IF=29, 
		IN=30, INHERITS=31, LET=32, LOOP=33, POOL=34, THEN=35, WHILE=36, CASE=37, 
		ESAC=38, OF=39, NEW=40, ISVOID=41, NOT=42, SELF_TYPE=43, SELF=44, WHITESPACE=45, 
		INCORRECT_CHARACTER=46, END_COMMENT=47, UN_COMMENT=48, LINE_COMMENT=49, 
		COMMENT=50, CASE1=51, CASE2=52, OPEN1=53, CLOSE1=54, MSG1=55, CASE3=56, 
		OPEN2=57, CASE4=58, CASE5=59, CLOSE2=60, MSG2=61;
	public static final int FIRST = 1;
	public static final int SECOND = 2;
	public static String[] modeNames = {
		"DEFAULT_MODE", "FIRST", "SECOND"
	};

	public static final String[] ruleNames = {
		"ERROR", "SEMICOLON", "DARROW", "INT_CONST", "STR_CONST", "ESC_SEQ", "TYPEID", 
		"OBJECTID", "ESCAPE", "SELF_TYPE", "SELF", "LPAREN", "RPAREN", "COLON", 
		"ATSYM", "COMMA", "PLUS", "MINUS", "STAR", "SLASH", "TILDE", "LT", "EQUALS", 
		"LBRACE", "RBRACE", "DOT", "LE", "ASSIGN", "CLASS", "ELSE", "FI", "IF", 
		"IN", "INHERITS", "LET", "LOOP", "POOL", "THEN", "WHILE", "CASE", "ESAC", 
		"OF", "NEW", "ISVOID", "NOT", "TRUE", "FALSE", "BOOL_CONST", "WHITESPACE", 
		"INCORRECT_CHARACTER", "END_COMMENT", "UN_COMMENT", "LINE_COMMENT", "COMMENT", 
		"CASE1", "CASE2", "OPEN1", "CLOSE1", "MSG1", "CASE3", "OPEN2", "CASE4", 
		"CASE5", "CLOSE2", "MSG2"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, "'('", "')'", "':'", "'@'", 
		"';'", "','", "'+'", "'-'", "'*'", "'/'", "'~'", "'<'", "'='", "'{'", 
		"'}'", "'.'", "'=>'", "'<='", "'<-'", null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "'SELF_TYPE'", 
		"'self'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ERROR", "TYPEID", "OBJECTID", "BOOL_CONST", "INT_CONST", "STR_CONST", 
		"LPAREN", "RPAREN", "COLON", "ATSYM", "SEMICOLON", "COMMA", "PLUS", "MINUS", 
		"STAR", "SLASH", "TILDE", "LT", "EQUALS", "LBRACE", "RBRACE", "DOT", "DARROW", 
		"LE", "ASSIGN", "CLASS", "ELSE", "FI", "IF", "IN", "INHERITS", "LET", 
		"LOOP", "POOL", "THEN", "WHILE", "CASE", "ESAC", "OF", "NEW", "ISVOID", 
		"NOT", "SELF_TYPE", "SELF", "WHITESPACE", "INCORRECT_CHARACTER", "END_COMMENT", 
		"UN_COMMENT", "LINE_COMMENT", "COMMENT", "CASE1", "CASE2", "OPEN1", "CLOSE1", 
		"MSG1", "CASE3", "OPEN2", "CASE4", "CASE5", "CLOSE2", "MSG2"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}



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


	public CoolLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CoolLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 0:
			ERROR_action((RuleContext)_localctx, actionIndex);
			break;
		case 4:
			STR_CONST_action((RuleContext)_localctx, actionIndex);
			break;
		case 49:
			INCORRECT_CHARACTER_action((RuleContext)_localctx, actionIndex);
			break;
		case 50:
			END_COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 51:
			UN_COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 54:
			CASE1_action((RuleContext)_localctx, actionIndex);
			break;
		case 55:
			CASE2_action((RuleContext)_localctx, actionIndex);
			break;
		case 59:
			CASE3_action((RuleContext)_localctx, actionIndex);
			break;
		case 61:
			CASE4_action((RuleContext)_localctx, actionIndex);
			break;
		case 62:
			CASE5_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void ERROR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			reportError("Unterminated string constant");
			break;
		case 1:
			reportError("Unescaped new line in string literal");
			break;
		case 2:
			reportError("EOF in string constant");
			break;
		case 3:
			 reportError("String contains null character");
			break;
		}
	}
	private void STR_CONST_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			processString();
			break;
		}
	}
	private void INCORRECT_CHARACTER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			checkChar();
			break;
		}
	}
	private void END_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:
			reportError("Unmatched *)");
			break;
		}
	}
	private void UN_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7:
			reportError("Unmatched *)");
			break;
		}
	}
	private void CASE1_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8:
			reportError("EOF in comment");
			break;
		}
	}
	private void CASE2_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 9:
			reportError("EOF in comment");
			break;
		}
	}
	private void CASE3_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 10:
			reportError("EOF in comment");
			break;
		}
	}
	private void CASE4_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 11:
			reportError("EOF in comment");
			break;
		}
	}
	private void CASE5_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 12:
			reportError("EOF in comment");
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2?\u01d7\b\1\b\1\b"+
		"\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
		"\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21"+
		"\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30"+
		"\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37"+
		"\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t"+
		"*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63"+
		"\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t"+
		"<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\3\2\3\2\7\2\u008a\n\2\f\2\16\2\u008d"+
		"\13\2\3\2\3\2\3\2\3\2\3\2\5\2\u0094\n\2\3\2\3\2\5\2\u0098\n\2\3\2\3\2"+
		"\3\2\3\2\7\2\u009e\n\2\f\2\16\2\u00a1\13\2\3\2\3\2\3\2\3\2\7\2\u00a7\n"+
		"\2\f\2\16\2\u00aa\13\2\3\2\3\2\3\2\3\2\3\2\3\2\6\2\u00b2\n\2\r\2\16\2"+
		"\u00b3\3\2\7\2\u00b7\n\2\f\2\16\2\u00ba\13\2\3\2\3\2\5\2\u00be\n\2\3\3"+
		"\3\3\3\4\3\4\3\4\3\5\6\5\u00c6\n\5\r\5\16\5\u00c7\3\6\3\6\3\6\7\6\u00cd"+
		"\n\6\f\6\16\6\u00d0\13\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\7\b\u00d9\n\b\f\b"+
		"\16\b\u00dc\13\b\3\t\3\t\7\t\u00e0\n\t\f\t\16\t\u00e3\13\t\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3"+
		"\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3"+
		"\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\37\3\37\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3"+
		"\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3,\3,\3,\3"+
		",\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\61\3\61\5\61\u017a\n\61\3\62\6\62\u017d\n\62\r\62\16\62\u017e"+
		"\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65"+
		"\3\65\3\66\3\66\3\66\3\66\7\66\u0194\n\66\f\66\16\66\u0197\13\66\3\66"+
		"\3\66\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38\38\39\39\39\39\39\3:\3:\3"+
		":\3:\3:\3:\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3=\3=\3=\3=\3>\3>\3>\3>\3>\3"+
		">\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3B\3B\3B\3B\2\2C\5\3"+
		"\7\r\t\31\13\7\r\b\17\2\21\4\23\5\25\2\27-\31.\33\t\35\n\37\13!\f#\16"+
		"%\17\'\20)\21+\22-\23/\24\61\25\63\26\65\27\67\309\32;\33=\34?\35A\36"+
		"C\37E G!I\"K#M$O%Q&S\'U(W)Y*[+],_\2a\2c\6e/g\60i\61k\62m\63o\64q\65s\66"+
		"u\67w8y9{:};\177<\u0081=\u0083>\u0085?\5\2\3\4\36\6\2\f\f$$GHQQ\3\2$$"+
		"\4\2\f\f$$\3\2\2\2\3\2\62;\5\2\f\f$$^^\3\2C\\\6\2\62;C\\aac|\3\2c|\4\2"+
		"EEee\4\2NNnn\4\2CCcc\4\2UUuu\4\2GGgg\4\2HHhh\4\2KKkk\4\2PPpp\4\2JJjj\4"+
		"\2TTtt\4\2VVvv\4\2QQqq\4\2RRrr\4\2YYyy\4\2XXxx\4\2FFff\4\2WWww\b\2\n\f"+
		"\16\17\"\"$$^^xx\4\2\f\f\17\17\u01e2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3"+
		"\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2c\3\2\2\2\2e\3\2\2"+
		"\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\3q\3\2\2\2\3"+
		"s\3\2\2\2\3u\3\2\2\2\3w\3\2\2\2\3y\3\2\2\2\4{\3\2\2\2\4}\3\2\2\2\4\177"+
		"\3\2\2\2\4\u0081\3\2\2\2\4\u0083\3\2\2\2\4\u0085\3\2\2\2\5\u00bd\3\2\2"+
		"\2\7\u00bf\3\2\2\2\t\u00c1\3\2\2\2\13\u00c5\3\2\2\2\r\u00c9\3\2\2\2\17"+
		"\u00d4\3\2\2\2\21\u00d6\3\2\2\2\23\u00dd\3\2\2\2\25\u00e4\3\2\2\2\27\u00e7"+
		"\3\2\2\2\31\u00f1\3\2\2\2\33\u00f6\3\2\2\2\35\u00f8\3\2\2\2\37\u00fa\3"+
		"\2\2\2!\u00fc\3\2\2\2#\u00fe\3\2\2\2%\u0100\3\2\2\2\'\u0102\3\2\2\2)\u0104"+
		"\3\2\2\2+\u0106\3\2\2\2-\u0108\3\2\2\2/\u010a\3\2\2\2\61\u010c\3\2\2\2"+
		"\63\u010e\3\2\2\2\65\u0110\3\2\2\2\67\u0112\3\2\2\29\u0114\3\2\2\2;\u0117"+
		"\3\2\2\2=\u011a\3\2\2\2?\u0120\3\2\2\2A\u0125\3\2\2\2C\u0128\3\2\2\2E"+
		"\u012b\3\2\2\2G\u012e\3\2\2\2I\u0137\3\2\2\2K\u013b\3\2\2\2M\u0140\3\2"+
		"\2\2O\u0145\3\2\2\2Q\u014a\3\2\2\2S\u0150\3\2\2\2U\u0155\3\2\2\2W\u015a"+
		"\3\2\2\2Y\u015d\3\2\2\2[\u0161\3\2\2\2]\u0168\3\2\2\2_\u016c\3\2\2\2a"+
		"\u0171\3\2\2\2c\u0179\3\2\2\2e\u017c\3\2\2\2g\u0182\3\2\2\2i\u0185\3\2"+
		"\2\2k\u018a\3\2\2\2m\u018f\3\2\2\2o\u019a\3\2\2\2q\u01a0\3\2\2\2s\u01a4"+
		"\3\2\2\2u\u01a9\3\2\2\2w\u01af\3\2\2\2y\u01b5\3\2\2\2{\u01b9\3\2\2\2}"+
		"\u01bd\3\2\2\2\177\u01c3\3\2\2\2\u0081\u01c8\3\2\2\2\u0083\u01cd\3\2\2"+
		"\2\u0085\u01d3\3\2\2\2\u0087\u008b\7$\2\2\u0088\u008a\n\2\2\2\u0089\u0088"+
		"\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u008e\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f\7\f\2\2\u008f\u00be\b\2"+
		"\2\2\u0090\u0093\7$\2\2\u0091\u0094\5\17\7\2\u0092\u0094\n\3\2\2\u0093"+
		"\u0091\3\2\2\2\u0093\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097\7\f"+
		"\2\2\u0096\u0098\13\2\2\2\u0097\u0096\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\u009a\7$\2\2\u009a\u00be\b\2\3\2\u009b\u009f\7$\2"+
		"\2\u009c\u009e\n\4\2\2\u009d\u009c\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d"+
		"\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2"+
		"\u00a3\7\2\2\3\u00a3\u00be\b\2\4\2\u00a4\u00b1\7$\2\2\u00a5\u00a7\n\5"+
		"\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac\7^"+
		"\2\2\u00ac\u00ad\7w\2\2\u00ad\u00ae\7\62\2\2\u00ae\u00af\7\62\2\2\u00af"+
		"\u00b0\7\62\2\2\u00b0\u00b2\7\62\2\2\u00b1\u00a8\3\2\2\2\u00b2\u00b3\3"+
		"\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b8\3\2\2\2\u00b5"+
		"\u00b7\n\2\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2"+
		"\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb"+
		"\u00bc\t\2\2\2\u00bc\u00be\b\2\5\2\u00bd\u0087\3\2\2\2\u00bd\u0090\3\2"+
		"\2\2\u00bd\u009b\3\2\2\2\u00bd\u00a4\3\2\2\2\u00be\6\3\2\2\2\u00bf\u00c0"+
		"\7=\2\2\u00c0\b\3\2\2\2\u00c1\u00c2\7?\2\2\u00c2\u00c3\7@\2\2\u00c3\n"+
		"\3\2\2\2\u00c4\u00c6\t\6\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\f\3\2\2\2\u00c9\u00ce\7$\2\2"+
		"\u00ca\u00cd\5\17\7\2\u00cb\u00cd\n\7\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cb"+
		"\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"\u00d1\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2\7$\2\2\u00d2\u00d3\b\6"+
		"\6\2\u00d3\16\3\2\2\2\u00d4\u00d5\7^\2\2\u00d5\20\3\2\2\2\u00d6\u00da"+
		"\t\b\2\2\u00d7\u00d9\t\t\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da"+
		"\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\22\3\2\2\2\u00dc\u00da\3\2\2"+
		"\2\u00dd\u00e1\t\n\2\2\u00de\u00e0\t\t\2\2\u00df\u00de\3\2\2\2\u00e0\u00e3"+
		"\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\24\3\2\2\2\u00e3"+
		"\u00e1\3\2\2\2\u00e4\u00e5\7^\2\2\u00e5\u00e6\13\2\2\2\u00e6\26\3\2\2"+
		"\2\u00e7\u00e8\7U\2\2\u00e8\u00e9\7G\2\2\u00e9\u00ea\7N\2\2\u00ea\u00eb"+
		"\7H\2\2\u00eb\u00ec\7a\2\2\u00ec\u00ed\7V\2\2\u00ed\u00ee\7[\2\2\u00ee"+
		"\u00ef\7R\2\2\u00ef\u00f0\7G\2\2\u00f0\30\3\2\2\2\u00f1\u00f2\7u\2\2\u00f2"+
		"\u00f3\7g\2\2\u00f3\u00f4\7n\2\2\u00f4\u00f5\7h\2\2\u00f5\32\3\2\2\2\u00f6"+
		"\u00f7\7*\2\2\u00f7\34\3\2\2\2\u00f8\u00f9\7+\2\2\u00f9\36\3\2\2\2\u00fa"+
		"\u00fb\7<\2\2\u00fb \3\2\2\2\u00fc\u00fd\7B\2\2\u00fd\"\3\2\2\2\u00fe"+
		"\u00ff\7.\2\2\u00ff$\3\2\2\2\u0100\u0101\7-\2\2\u0101&\3\2\2\2\u0102\u0103"+
		"\7/\2\2\u0103(\3\2\2\2\u0104\u0105\7,\2\2\u0105*\3\2\2\2\u0106\u0107\7"+
		"\61\2\2\u0107,\3\2\2\2\u0108\u0109\7\u0080\2\2\u0109.\3\2\2\2\u010a\u010b"+
		"\7>\2\2\u010b\60\3\2\2\2\u010c\u010d\7?\2\2\u010d\62\3\2\2\2\u010e\u010f"+
		"\7}\2\2\u010f\64\3\2\2\2\u0110\u0111\7\177\2\2\u0111\66\3\2\2\2\u0112"+
		"\u0113\7\60\2\2\u01138\3\2\2\2\u0114\u0115\7>\2\2\u0115\u0116\7?\2\2\u0116"+
		":\3\2\2\2\u0117\u0118\7>\2\2\u0118\u0119\7/\2\2\u0119<\3\2\2\2\u011a\u011b"+
		"\t\13\2\2\u011b\u011c\t\f\2\2\u011c\u011d\t\r\2\2\u011d\u011e\t\16\2\2"+
		"\u011e\u011f\t\16\2\2\u011f>\3\2\2\2\u0120\u0121\t\17\2\2\u0121\u0122"+
		"\t\f\2\2\u0122\u0123\t\16\2\2\u0123\u0124\t\17\2\2\u0124@\3\2\2\2\u0125"+
		"\u0126\t\20\2\2\u0126\u0127\t\21\2\2\u0127B\3\2\2\2\u0128\u0129\t\21\2"+
		"\2\u0129\u012a\t\20\2\2\u012aD\3\2\2\2\u012b\u012c\t\21\2\2\u012c\u012d"+
		"\t\22\2\2\u012dF\3\2\2\2\u012e\u012f\t\21\2\2\u012f\u0130\t\22\2\2\u0130"+
		"\u0131\t\23\2\2\u0131\u0132\t\17\2\2\u0132\u0133\t\24\2\2\u0133\u0134"+
		"\t\21\2\2\u0134\u0135\t\25\2\2\u0135\u0136\t\16\2\2\u0136H\3\2\2\2\u0137"+
		"\u0138\t\f\2\2\u0138\u0139\t\17\2\2\u0139\u013a\t\25\2\2\u013aJ\3\2\2"+
		"\2\u013b\u013c\t\f\2\2\u013c\u013d\t\26\2\2\u013d\u013e\t\26\2\2\u013e"+
		"\u013f\t\27\2\2\u013fL\3\2\2\2\u0140\u0141\t\27\2\2\u0141\u0142\t\26\2"+
		"\2\u0142\u0143\t\26\2\2\u0143\u0144\t\f\2\2\u0144N\3\2\2\2\u0145\u0146"+
		"\t\25\2\2\u0146\u0147\t\23\2\2\u0147\u0148\t\17\2\2\u0148\u0149\t\22\2"+
		"\2\u0149P\3\2\2\2\u014a\u014b\t\30\2\2\u014b\u014c\t\23\2\2\u014c\u014d"+
		"\t\21\2\2\u014d\u014e\t\f\2\2\u014e\u014f\t\17\2\2\u014fR\3\2\2\2\u0150"+
		"\u0151\t\13\2\2\u0151\u0152\t\r\2\2\u0152\u0153\t\16\2\2\u0153\u0154\t"+
		"\17\2\2\u0154T\3\2\2\2\u0155\u0156\t\17\2\2\u0156\u0157\t\16\2\2\u0157"+
		"\u0158\t\r\2\2\u0158\u0159\t\13\2\2\u0159V\3\2\2\2\u015a\u015b\t\26\2"+
		"\2\u015b\u015c\t\20\2\2\u015cX\3\2\2\2\u015d\u015e\t\22\2\2\u015e\u015f"+
		"\t\17\2\2\u015f\u0160\t\30\2\2\u0160Z\3\2\2\2\u0161\u0162\t\21\2\2\u0162"+
		"\u0163\t\16\2\2\u0163\u0164\t\31\2\2\u0164\u0165\t\26\2\2\u0165\u0166"+
		"\t\21\2\2\u0166\u0167\t\32\2\2\u0167\\\3\2\2\2\u0168\u0169\t\22\2\2\u0169"+
		"\u016a\t\26\2\2\u016a\u016b\t\25\2\2\u016b^\3\2\2\2\u016c\u016d\7v\2\2"+
		"\u016d\u016e\t\24\2\2\u016e\u016f\t\33\2\2\u016f\u0170\t\17\2\2\u0170"+
		"`\3\2\2\2\u0171\u0172\7h\2\2\u0172\u0173\t\r\2\2\u0173\u0174\t\f\2\2\u0174"+
		"\u0175\t\16\2\2\u0175\u0176\t\17\2\2\u0176b\3\2\2\2\u0177\u017a\5_/\2"+
		"\u0178\u017a\5a\60\2\u0179\u0177\3\2\2\2\u0179\u0178\3\2\2\2\u017ad\3"+
		"\2\2\2\u017b\u017d\t\34\2\2\u017c\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e"+
		"\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0181\b\62"+
		"\7\2\u0181f\3\2\2\2\u0182\u0183\13\2\2\2\u0183\u0184\b\63\b\2\u0184h\3"+
		"\2\2\2\u0185\u0186\7,\2\2\u0186\u0187\7+\2\2\u0187\u0188\3\2\2\2\u0188"+
		"\u0189\b\64\t\2\u0189j\3\2\2\2\u018a\u018b\7,\2\2\u018b\u018c\7+\2\2\u018c"+
		"\u018d\3\2\2\2\u018d\u018e\b\65\n\2\u018el\3\2\2\2\u018f\u0190\7/\2\2"+
		"\u0190\u0191\7/\2\2\u0191\u0195\3\2\2\2\u0192\u0194\n\35\2\2\u0193\u0192"+
		"\3\2\2\2\u0194\u0197\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196"+
		"\u0198\3\2\2\2\u0197\u0195\3\2\2\2\u0198\u0199\b\66\7\2\u0199n\3\2\2\2"+
		"\u019a\u019b\7*\2\2\u019b\u019c\7,\2\2\u019c\u019d\3\2\2\2\u019d\u019e"+
		"\b\67\13\2\u019e\u019f\b\67\7\2\u019fp\3\2\2\2\u01a0\u01a1\13\2\2\2\u01a1"+
		"\u01a2\7\2\2\3\u01a2\u01a3\b8\f\2\u01a3r\3\2\2\2\u01a4\u01a5\7*\2\2\u01a5"+
		"\u01a6\7,\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a8\b9\r\2\u01a8t\3\2\2\2\u01a9"+
		"\u01aa\7*\2\2\u01aa\u01ab\7,\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ad\b:\16"+
		"\2\u01ad\u01ae\b:\7\2\u01aev\3\2\2\2\u01af\u01b0\7,\2\2\u01b0\u01b1\7"+
		"+\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b3\b;\17\2\u01b3\u01b4\b;\7\2\u01b4"+
		"x\3\2\2\2\u01b5\u01b6\13\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b8\b<\7\2"+
		"\u01b8z\3\2\2\2\u01b9\u01ba\13\2\2\2\u01ba\u01bb\7\2\2\3\u01bb\u01bc\b"+
		"=\20\2\u01bc|\3\2\2\2\u01bd\u01be\7*\2\2\u01be\u01bf\7,\2\2\u01bf\u01c0"+
		"\3\2\2\2\u01c0\u01c1\b>\16\2\u01c1\u01c2\b>\7\2\u01c2~\3\2\2\2\u01c3\u01c4"+
		"\7*\2\2\u01c4\u01c5\7,\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c7\b?\21\2\u01c7"+
		"\u0080\3\2\2\2\u01c8\u01c9\7,\2\2\u01c9\u01ca\7+\2\2\u01ca\u01cb\3\2\2"+
		"\2\u01cb\u01cc\b@\22\2\u01cc\u0082\3\2\2\2\u01cd\u01ce\7,\2\2\u01ce\u01cf"+
		"\7+\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d1\bA\17\2\u01d1\u01d2\bA\7\2\u01d2"+
		"\u0084\3\2\2\2\u01d3\u01d4\13\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d6\b"+
		"B\7\2\u01d6\u0086\3\2\2\2\25\2\3\4\u008b\u0093\u0097\u009f\u00a8\u00b3"+
		"\u00b8\u00bd\u00c7\u00cc\u00ce\u00da\u00e1\u0179\u017e\u0195\23\3\2\2"+
		"\3\2\3\3\2\4\3\2\5\3\6\6\b\2\2\3\63\7\3\64\b\3\65\t\7\3\2\38\n\39\13\7"+
		"\4\2\6\2\2\3=\f\3?\r\3@\16";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}