// Generated from /Users/javiercanto/Desktop/Fontys_Automata/Code/Z3/MyGrammar2.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyGrammar2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, COMMENT=20, ID=21, NUMBER=22, WS=23, INT_W=24;
	public static final int
		RULE_program = 0, RULE_command = 1, RULE_declare_fun = 2, RULE_declare_const = 3, 
		RULE_assert_cmd = 4, RULE_distinct_formula = 5, RULE_values = 6, RULE_formula = 7, 
		RULE_comparator = 8, RULE_equal = 9, RULE_operation = 10, RULE_comp = 11, 
		RULE_check_sat = 12, RULE_get_model = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "command", "declare_fun", "declare_const", "assert_cmd", "distinct_formula", 
			"values", "formula", "comparator", "equal", "operation", "comp", "check_sat", 
			"get_model"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "'declare-fun'", "')'", "'define-const'", "'assert'", "'distinct'", 
			"'>='", "'<='", "'<'", "'>'", "'='", "'+'", "'-'", "'/'", "'*'", "'and'", 
			"'or'", "'check-sat'", "'get-model'", null, null, null, null, "'Int'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "COMMENT", "ID", "NUMBER", 
			"WS", "INT_W"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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

	@Override
	public String getGrammarFileName() { return "MyGrammar2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MyGrammar2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(28);
				command();
				}
				}
				setState(31); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommandContext extends ParserRuleContext {
		public Declare_funContext declare_fun() {
			return getRuleContext(Declare_funContext.class,0);
		}
		public Assert_cmdContext assert_cmd() {
			return getRuleContext(Assert_cmdContext.class,0);
		}
		public Check_satContext check_sat() {
			return getRuleContext(Check_satContext.class,0);
		}
		public Get_modelContext get_model() {
			return getRuleContext(Get_modelContext.class,0);
		}
		public Declare_constContext declare_const() {
			return getRuleContext(Declare_constContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_command);
		try {
			setState(38);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				declare_fun();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				assert_cmd();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(35);
				check_sat();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(36);
				get_model();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(37);
				declare_const();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_funContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MyGrammar2Parser.ID, 0); }
		public List<TerminalNode> INT_W() { return getTokens(MyGrammar2Parser.INT_W); }
		public TerminalNode INT_W(int i) {
			return getToken(MyGrammar2Parser.INT_W, i);
		}
		public Declare_funContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_fun; }
	}

	public final Declare_funContext declare_fun() throws RecognitionException {
		Declare_funContext _localctx = new Declare_funContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declare_fun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(T__0);
			setState(41);
			match(T__1);
			setState(42);
			match(ID);
			setState(43);
			match(T__0);
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT_W) {
				{
				{
				setState(44);
				match(INT_W);
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
			match(T__2);
			setState(51);
			match(INT_W);
			setState(52);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_constContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MyGrammar2Parser.ID, 0); }
		public TerminalNode INT_W() { return getToken(MyGrammar2Parser.INT_W, 0); }
		public TerminalNode NUMBER() { return getToken(MyGrammar2Parser.NUMBER, 0); }
		public Declare_constContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_const; }
	}

	public final Declare_constContext declare_const() throws RecognitionException {
		Declare_constContext _localctx = new Declare_constContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declare_const);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(T__0);
			setState(55);
			match(T__3);
			setState(56);
			match(ID);
			setState(57);
			match(INT_W);
			setState(58);
			match(NUMBER);
			setState(59);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assert_cmdContext extends ParserRuleContext {
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public Assert_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assert_cmd; }
	}

	public final Assert_cmdContext assert_cmd() throws RecognitionException {
		Assert_cmdContext _localctx = new Assert_cmdContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assert_cmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(T__0);
			setState(62);
			match(T__4);
			setState(63);
			formula();
			setState(64);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Distinct_formulaContext extends ParserRuleContext {
		public List<ValuesContext> values() {
			return getRuleContexts(ValuesContext.class);
		}
		public ValuesContext values(int i) {
			return getRuleContext(ValuesContext.class,i);
		}
		public Distinct_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distinct_formula; }
	}

	public final Distinct_formulaContext distinct_formula() throws RecognitionException {
		Distinct_formulaContext _localctx = new Distinct_formulaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_distinct_formula);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(T__0);
			setState(67);
			match(T__5);
			setState(68);
			values();
			setState(69);
			values();
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID || _la==NUMBER) {
				{
				{
				setState(70);
				values();
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValuesContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MyGrammar2Parser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(MyGrammar2Parser.NUMBER, 0); }
		public ValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values; }
	}

	public final ValuesContext values() throws RecognitionException {
		ValuesContext _localctx = new ValuesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_values);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormulaContext extends ParserRuleContext {
		public Distinct_formulaContext distinct_formula() {
			return getRuleContext(Distinct_formulaContext.class,0);
		}
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public List<FormulaContext> formula() {
			return getRuleContexts(FormulaContext.class);
		}
		public FormulaContext formula(int i) {
			return getRuleContext(FormulaContext.class,i);
		}
		public ComparatorContext comparator() {
			return getRuleContext(ComparatorContext.class,0);
		}
		public List<ValuesContext> values() {
			return getRuleContexts(ValuesContext.class);
		}
		public ValuesContext values(int i) {
			return getRuleContext(ValuesContext.class,i);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public List<TerminalNode> NUMBER() { return getTokens(MyGrammar2Parser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(MyGrammar2Parser.NUMBER, i);
		}
		public EqualContext equal() {
			return getRuleContext(EqualContext.class,0);
		}
		public TerminalNode ID() { return getToken(MyGrammar2Parser.ID, 0); }
		public FormulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formula; }
	}

	public final FormulaContext formula() throws RecognitionException {
		FormulaContext _localctx = new FormulaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_formula);
		int _la;
		try {
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				distinct_formula();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				match(T__0);
				setState(82);
				comp();
				setState(83);
				formula();
				setState(84);
				formula();
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ID) | (1L << NUMBER))) != 0)) {
					{
					{
					setState(85);
					formula();
					}
					}
					setState(90);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(91);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(93);
				match(T__0);
				setState(94);
				comparator();
				setState(95);
				values();
				setState(96);
				values();
				setState(97);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(99);
				match(T__0);
				setState(100);
				operation();
				setState(101);
				match(NUMBER);
				setState(102);
				match(NUMBER);
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NUMBER) {
					{
					{
					setState(103);
					match(NUMBER);
					}
					}
					setState(108);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(109);
				match(T__2);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(111);
				match(T__0);
				setState(112);
				equal();
				setState(113);
				match(ID);
				setState(114);
				formula();
				setState(115);
				match(T__2);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(117);
				values();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparatorContext extends ParserRuleContext {
		public ComparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparator; }
	}

	public final ComparatorContext comparator() throws RecognitionException {
		ComparatorContext _localctx = new ComparatorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_comparator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualContext extends ParserRuleContext {
		public EqualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equal; }
	}

	public final EqualContext equal() throws RecognitionException {
		EqualContext _localctx = new EqualContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_equal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperationContext extends ParserRuleContext {
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompContext extends ParserRuleContext {
		public CompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp; }
	}

	public final CompContext comp() throws RecognitionException {
		CompContext _localctx = new CompContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_comp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			_la = _input.LA(1);
			if ( !(_la==T__15 || _la==T__16) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Check_satContext extends ParserRuleContext {
		public Check_satContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_check_sat; }
	}

	public final Check_satContext check_sat() throws RecognitionException {
		Check_satContext _localctx = new Check_satContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_check_sat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(T__0);
			setState(129);
			match(T__17);
			setState(130);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Get_modelContext extends ParserRuleContext {
		public Get_modelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_model; }
	}

	public final Get_modelContext get_model() throws RecognitionException {
		Get_modelContext _localctx = new Get_modelContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_get_model);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(T__0);
			setState(133);
			match(T__18);
			setState(134);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32\u008b\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\6\2 \n\2\r\2\16\2!\3\3\3"+
		"\3\3\3\3\3\3\3\5\3)\n\3\3\4\3\4\3\4\3\4\3\4\7\4\60\n\4\f\4\16\4\63\13"+
		"\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\7\7J\n\7\f\7\16\7M\13\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\7\tY\n\t\f\t\16\t\\\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\7\tk\n\t\f\t\16\tn\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\5\ty\n\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\2\2\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2"+
		"\6\3\2\27\30\3\2\t\f\3\2\16\21\3\2\22\23\2\u008a\2\37\3\2\2\2\4(\3\2\2"+
		"\2\6*\3\2\2\2\b8\3\2\2\2\n?\3\2\2\2\fD\3\2\2\2\16P\3\2\2\2\20x\3\2\2\2"+
		"\22z\3\2\2\2\24|\3\2\2\2\26~\3\2\2\2\30\u0080\3\2\2\2\32\u0082\3\2\2\2"+
		"\34\u0086\3\2\2\2\36 \5\4\3\2\37\36\3\2\2\2 !\3\2\2\2!\37\3\2\2\2!\"\3"+
		"\2\2\2\"\3\3\2\2\2#)\5\6\4\2$)\5\n\6\2%)\5\32\16\2&)\5\34\17\2\')\5\b"+
		"\5\2(#\3\2\2\2($\3\2\2\2(%\3\2\2\2(&\3\2\2\2(\'\3\2\2\2)\5\3\2\2\2*+\7"+
		"\3\2\2+,\7\4\2\2,-\7\27\2\2-\61\7\3\2\2.\60\7\32\2\2/.\3\2\2\2\60\63\3"+
		"\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\64\3\2\2\2\63\61\3\2\2\2\64\65\7\5"+
		"\2\2\65\66\7\32\2\2\66\67\7\5\2\2\67\7\3\2\2\289\7\3\2\29:\7\6\2\2:;\7"+
		"\27\2\2;<\7\32\2\2<=\7\30\2\2=>\7\5\2\2>\t\3\2\2\2?@\7\3\2\2@A\7\7\2\2"+
		"AB\5\20\t\2BC\7\5\2\2C\13\3\2\2\2DE\7\3\2\2EF\7\b\2\2FG\5\16\b\2GK\5\16"+
		"\b\2HJ\5\16\b\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LN\3\2\2\2MK\3"+
		"\2\2\2NO\7\5\2\2O\r\3\2\2\2PQ\t\2\2\2Q\17\3\2\2\2Ry\5\f\7\2ST\7\3\2\2"+
		"TU\5\30\r\2UV\5\20\t\2VZ\5\20\t\2WY\5\20\t\2XW\3\2\2\2Y\\\3\2\2\2ZX\3"+
		"\2\2\2Z[\3\2\2\2[]\3\2\2\2\\Z\3\2\2\2]^\7\5\2\2^y\3\2\2\2_`\7\3\2\2`a"+
		"\5\22\n\2ab\5\16\b\2bc\5\16\b\2cd\7\5\2\2dy\3\2\2\2ef\7\3\2\2fg\5\26\f"+
		"\2gh\7\30\2\2hl\7\30\2\2ik\7\30\2\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3"+
		"\2\2\2mo\3\2\2\2nl\3\2\2\2op\7\5\2\2py\3\2\2\2qr\7\3\2\2rs\5\24\13\2s"+
		"t\7\27\2\2tu\5\20\t\2uv\7\5\2\2vy\3\2\2\2wy\5\16\b\2xR\3\2\2\2xS\3\2\2"+
		"\2x_\3\2\2\2xe\3\2\2\2xq\3\2\2\2xw\3\2\2\2y\21\3\2\2\2z{\t\3\2\2{\23\3"+
		"\2\2\2|}\7\r\2\2}\25\3\2\2\2~\177\t\4\2\2\177\27\3\2\2\2\u0080\u0081\t"+
		"\5\2\2\u0081\31\3\2\2\2\u0082\u0083\7\3\2\2\u0083\u0084\7\24\2\2\u0084"+
		"\u0085\7\5\2\2\u0085\33\3\2\2\2\u0086\u0087\7\3\2\2\u0087\u0088\7\25\2"+
		"\2\u0088\u0089\7\5\2\2\u0089\35\3\2\2\2\t!(\61KZlx";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}