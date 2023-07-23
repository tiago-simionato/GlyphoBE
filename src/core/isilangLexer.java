// Generated from isilang.g4 by ANTLR 4.7.1
package src.core;

  import src.ast.Program;
  import src.ast.AbstractCommand;
  import src.symbols.DataType;

  import src.symbols.identifiers.AbstractIdentifier;
  import src.symbols.identifiers.IntegerId;
  import src.symbols.identifiers.RealId;
  import src.symbols.identifiers.BooleanId;

  import src.symbols.IdTable;
  
  import src.exceptions.semanticException;

  import java.util.ArrayList;
  import java.util.List;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class isilangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, TYPE=11, NUMBER=12, REAL=13, TEXT=14, ATTR=15, SUM=16, SUB=17, 
		MUL=18, DIV=19, RELOP=20, ID=21, COMMA=22, FP=23, OP=24, CP=25, OB=26, 
		CB=27, BLANK=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "TYPE", "NUMBER", "REAL", "TEXT", "ATTR", "SUM", "SUB", "MUL", 
		"DIV", "RELOP", "ID", "COMMA", "FP", "OP", "CP", "OB", "CB", "BLANK"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'programa'", "'fimprog'", "'declare'", "'leia'", "'escreva'", "'se'", 
		"'entao'", "'ou se'", "'senao'", "'enquanto'", null, null, null, null, 
		"':='", "'+'", "'-'", "'*'", "'/'", null, null, "','", "'.'", "'('", "')'", 
		"'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "TYPE", 
		"NUMBER", "REAL", "TEXT", "ATTR", "SUM", "SUB", "MUL", "DIV", "RELOP", 
		"ID", "COMMA", "FP", "OP", "CP", "OB", "CB", "BLANK"
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


	  private Program program = new Program();
	  private List<AbstractCommand> mainThread = new ArrayList<AbstractCommand>();
	  private IdTable st = new IdTable();
	  public static DataType currentType;
	  public static DataType currentExprType;
	  private AbstractIdentifier currentId;
	  private String idName;

	  public void isIdDeclared(String idName) {
	    if (!st.exists(idName)) {
	      throw new semanticException("Identifier " + idName + " not declared");
	    }
	  }

	  public void isIdTypeOk(String idName, DataType type) {
	    System.out.println(st.get(idName).getType());
	    System.out.println(type);
	    if (st.get(idName).getType() != type) {
	      throw new semanticException("Identifier used in the wrong type of expression");
	    }
	  }


	public isilangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "isilang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 10:
			TYPE_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void TYPE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 isilangParser.currentType = DataType.INTEGER; 
			break;
		case 1:
			 isilangParser.currentType = DataType.REAL;    
			break;
		case 2:
			 isilangParser.currentType = DataType.BOOLEAN; 
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u00e2\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\5\f\u0099\n\f\3\r\6\r\u009c\n\r\r\r\16\r\u009d\3\16\6\16\u00a1"+
		"\n\16\r\16\16\16\u00a2\3\16\3\16\6\16\u00a7\n\16\r\16\16\16\u00a8\3\16"+
		"\3\16\3\17\3\17\7\17\u00af\n\17\f\17\16\17\u00b2\13\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\5\25\u00ca\n\25\3\26\3\26\7\26\u00ce\n\26\f"+
		"\26\16\26\u00d1\13\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\2\2\36\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36\3\2\b\3\2\62;\b\2\13\13\"#//\62;C\\c"+
		"|\4\2>>@@\4\2C\\c|\5\2\62;C\\c|\5\2\13\f\17\17\"\"\2\u00ec\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\3;\3\2\2\2\5D\3\2"+
		"\2\2\7L\3\2\2\2\tT\3\2\2\2\13Y\3\2\2\2\ra\3\2\2\2\17d\3\2\2\2\21j\3\2"+
		"\2\2\23p\3\2\2\2\25v\3\2\2\2\27\u0098\3\2\2\2\31\u009b\3\2\2\2\33\u00a0"+
		"\3\2\2\2\35\u00ac\3\2\2\2\37\u00b5\3\2\2\2!\u00b8\3\2\2\2#\u00ba\3\2\2"+
		"\2%\u00bc\3\2\2\2\'\u00be\3\2\2\2)\u00c9\3\2\2\2+\u00cb\3\2\2\2-\u00d2"+
		"\3\2\2\2/\u00d4\3\2\2\2\61\u00d6\3\2\2\2\63\u00d8\3\2\2\2\65\u00da\3\2"+
		"\2\2\67\u00dc\3\2\2\29\u00de\3\2\2\2;<\7r\2\2<=\7t\2\2=>\7q\2\2>?\7i\2"+
		"\2?@\7t\2\2@A\7c\2\2AB\7o\2\2BC\7c\2\2C\4\3\2\2\2DE\7h\2\2EF\7k\2\2FG"+
		"\7o\2\2GH\7r\2\2HI\7t\2\2IJ\7q\2\2JK\7i\2\2K\6\3\2\2\2LM\7f\2\2MN\7g\2"+
		"\2NO\7e\2\2OP\7n\2\2PQ\7c\2\2QR\7t\2\2RS\7g\2\2S\b\3\2\2\2TU\7n\2\2UV"+
		"\7g\2\2VW\7k\2\2WX\7c\2\2X\n\3\2\2\2YZ\7g\2\2Z[\7u\2\2[\\\7e\2\2\\]\7"+
		"t\2\2]^\7g\2\2^_\7x\2\2_`\7c\2\2`\f\3\2\2\2ab\7u\2\2bc\7g\2\2c\16\3\2"+
		"\2\2de\7g\2\2ef\7p\2\2fg\7v\2\2gh\7c\2\2hi\7q\2\2i\20\3\2\2\2jk\7q\2\2"+
		"kl\7w\2\2lm\7\"\2\2mn\7u\2\2no\7g\2\2o\22\3\2\2\2pq\7u\2\2qr\7g\2\2rs"+
		"\7p\2\2st\7c\2\2tu\7q\2\2u\24\3\2\2\2vw\7g\2\2wx\7p\2\2xy\7s\2\2yz\7w"+
		"\2\2z{\7c\2\2{|\7p\2\2|}\7v\2\2}~\7q\2\2~\26\3\2\2\2\177\u0080\7K\2\2"+
		"\u0080\u0081\7P\2\2\u0081\u0082\7V\2\2\u0082\u0083\7G\2\2\u0083\u0084"+
		"\7K\2\2\u0084\u0085\7T\2\2\u0085\u0086\7Q\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\u0099\b\f\2\2\u0088\u0089\7T\2\2\u0089\u008a\7G\2\2\u008a\u008b\7C\2"+
		"\2\u008b\u008c\7N\2\2\u008c\u008d\3\2\2\2\u008d\u0099\b\f\3\2\u008e\u008f"+
		"\7D\2\2\u008f\u0090\7Q\2\2\u0090\u0091\7Q\2\2\u0091\u0092\7N\2\2\u0092"+
		"\u0093\7G\2\2\u0093\u0094\7C\2\2\u0094\u0095\7P\2\2\u0095\u0096\7Q\2\2"+
		"\u0096\u0097\3\2\2\2\u0097\u0099\b\f\4\2\u0098\177\3\2\2\2\u0098\u0088"+
		"\3\2\2\2\u0098\u008e\3\2\2\2\u0099\30\3\2\2\2\u009a\u009c\t\2\2\2\u009b"+
		"\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2"+
		"\2\2\u009e\32\3\2\2\2\u009f\u00a1\t\2\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a2"+
		"\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"\u00a6\7\60\2\2\u00a5\u00a7\t\2\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00a8\3"+
		"\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\u00ab\7T\2\2\u00ab\34\3\2\2\2\u00ac\u00b0\7$\2\2\u00ad\u00af\t\3\2\2"+
		"\u00ae\u00ad\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1"+
		"\3\2\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b4\7$\2\2\u00b4"+
		"\36\3\2\2\2\u00b5\u00b6\7<\2\2\u00b6\u00b7\7?\2\2\u00b7 \3\2\2\2\u00b8"+
		"\u00b9\7-\2\2\u00b9\"\3\2\2\2\u00ba\u00bb\7/\2\2\u00bb$\3\2\2\2\u00bc"+
		"\u00bd\7,\2\2\u00bd&\3\2\2\2\u00be\u00bf\7\61\2\2\u00bf(\3\2\2\2\u00c0"+
		"\u00ca\t\4\2\2\u00c1\u00c2\7@\2\2\u00c2\u00ca\7?\2\2\u00c3\u00c4\7>\2"+
		"\2\u00c4\u00ca\7?\2\2\u00c5\u00c6\7?\2\2\u00c6\u00ca\7?\2\2\u00c7\u00c8"+
		"\7#\2\2\u00c8\u00ca\7?\2\2\u00c9\u00c0\3\2\2\2\u00c9\u00c1\3\2\2\2\u00c9"+
		"\u00c3\3\2\2\2\u00c9\u00c5\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca*\3\2\2\2"+
		"\u00cb\u00cf\t\5\2\2\u00cc\u00ce\t\6\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00d1"+
		"\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0,\3\2\2\2\u00d1"+
		"\u00cf\3\2\2\2\u00d2\u00d3\7.\2\2\u00d3.\3\2\2\2\u00d4\u00d5\7\60\2\2"+
		"\u00d5\60\3\2\2\2\u00d6\u00d7\7*\2\2\u00d7\62\3\2\2\2\u00d8\u00d9\7+\2"+
		"\2\u00d9\64\3\2\2\2\u00da\u00db\7}\2\2\u00db\66\3\2\2\2\u00dc\u00dd\7"+
		"\177\2\2\u00dd8\3\2\2\2\u00de\u00df\t\7\2\2\u00df\u00e0\3\2\2\2\u00e0"+
		"\u00e1\b\35\5\2\u00e1:\3\2\2\2\13\2\u0098\u009d\u00a2\u00a8\u00ae\u00b0"+
		"\u00c9\u00cf\6\3\f\2\3\f\3\3\f\4\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}