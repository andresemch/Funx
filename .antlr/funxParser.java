// Generated from /home/andres/Escritorio/PracLP/funx.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class funxParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, NUM=27, VARIABLE=28, FUNCIO=29, STRING=30, COMENTARI=31, 
		WS=32;
	public static final int
		RULE_root = 0, RULE_bloc = 1, RULE_instru = 2, RULE_funcio = 3, RULE_execfunc = 4, 
		RULE_expr = 5, RULE_cond = 6, RULE_ifcond = 7, RULE_elsecond = 8, RULE_bool = 9, 
		RULE_bucle = 10, RULE_assignacio = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "bloc", "instru", "funcio", "execfunc", "expr", "cond", "ifcond", 
			"elsecond", "bool", "bucle", "assignacio"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "';'", "'('", "')'", "'^'", "'%'", "'/'", "'*'", 
			"'+'", "'-'", "'if'", "'else'", "'not'", "'or'", "'and'", "'='", "'!='", 
			"'<'", "'>'", "'<='", "'>='", "'True'", "'False'", "'while'", "'<-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "NUM", "VARIABLE", "FUNCIO", "STRING", "COMENTARI", 
			"WS"
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
	public String getGrammarFileName() { return "funx.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public funxParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RootContext extends ParserRuleContext {
		public BlocContext bloc() {
			return getRuleContext(BlocContext.class,0);
		}
		public TerminalNode EOF() { return getToken(funxParser.EOF, 0); }
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			bloc();
			setState(25);
			match(EOF);
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

	public static class BlocContext extends ParserRuleContext {
		public List<InstruContext> instru() {
			return getRuleContexts(InstruContext.class);
		}
		public InstruContext instru(int i) {
			return getRuleContext(InstruContext.class,i);
		}
		public List<FuncioContext> funcio() {
			return getRuleContexts(FuncioContext.class);
		}
		public FuncioContext funcio(int i) {
			return getRuleContext(FuncioContext.class,i);
		}
		public BlocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloc; }
	}

	public final BlocContext bloc() throws RecognitionException {
		BlocContext _localctx = new BlocContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bloc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__10) | (1L << T__11) | (1L << T__24) | (1L << NUM) | (1L << VARIABLE) | (1L << FUNCIO))) != 0)) {
				{
				setState(29);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(27);
					instru();
					}
					break;
				case 2:
					{
					setState(28);
					funcio();
					}
					break;
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class InstruContext extends ParserRuleContext {
		public ExecfuncContext execfunc() {
			return getRuleContext(ExecfuncContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public BucleContext bucle() {
			return getRuleContext(BucleContext.class,0);
		}
		public AssignacioContext assignacio() {
			return getRuleContext(AssignacioContext.class,0);
		}
		public InstruContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instru; }
	}

	public final InstruContext instru() throws RecognitionException {
		InstruContext _localctx = new InstruContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instru);
		try {
			setState(39);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				execfunc();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(36);
				cond();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(37);
				bucle();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(38);
				assignacio();
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

	public static class FuncioContext extends ParserRuleContext {
		public TerminalNode FUNCIO() { return getToken(funxParser.FUNCIO, 0); }
		public List<TerminalNode> VARIABLE() { return getTokens(funxParser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(funxParser.VARIABLE, i);
		}
		public List<InstruContext> instru() {
			return getRuleContexts(InstruContext.class);
		}
		public InstruContext instru(int i) {
			return getRuleContext(InstruContext.class,i);
		}
		public FuncioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcio; }
	}

	public final FuncioContext funcio() throws RecognitionException {
		FuncioContext _localctx = new FuncioContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funcio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(FUNCIO);
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VARIABLE) {
				{
				{
				setState(42);
				match(VARIABLE);
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(48);
			match(T__0);
			setState(50); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(49);
				instru();
				}
				}
				setState(52); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__10) | (1L << T__11) | (1L << T__24) | (1L << NUM) | (1L << VARIABLE) | (1L << FUNCIO))) != 0) );
			setState(54);
			match(T__1);
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

	public static class ExecfuncContext extends ParserRuleContext {
		public TerminalNode FUNCIO() { return getToken(funxParser.FUNCIO, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExecfuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execfunc; }
	}

	public final ExecfuncContext execfunc() throws RecognitionException {
		ExecfuncContext _localctx = new ExecfuncContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_execfunc);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(FUNCIO);
			setState(60);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(57);
					expr(0);
					}
					} 
				}
				setState(62);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(63);
				match(T__2);
				}
				break;
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprParentesisContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprParentesisContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class NumeroContext extends ExprContext {
		public TerminalNode NUM() { return getToken(funxParser.NUM, 0); }
		public NumeroContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class NegatiuContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NegatiuContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprfuncContext extends ExprContext {
		public ExecfuncContext execfunc() {
			return getRuleContext(ExecfuncContext.class,0);
		}
		public ExprfuncContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class PotenciaContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public PotenciaContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprVariableContext extends ExprContext {
		public TerminalNode VARIABLE() { return getToken(funxParser.VARIABLE, 0); }
		public ExprVariableContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class SumaRestaContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public SumaRestaContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ModDivMultContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ModDivMultContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				{
				_localctx = new ExprParentesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(67);
				match(T__3);
				setState(68);
				expr(0);
				setState(69);
				match(T__4);
				}
				break;
			case VARIABLE:
				{
				_localctx = new ExprVariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(71);
				match(VARIABLE);
				}
				break;
			case NUM:
				{
				_localctx = new NumeroContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(72);
				match(NUM);
				}
				break;
			case T__10:
				{
				_localctx = new NegatiuContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(73);
				match(T__10);
				setState(74);
				expr(2);
				}
				break;
			case FUNCIO:
				{
				_localctx = new ExprfuncContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(75);
				execfunc();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(89);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(87);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new PotenciaContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(78);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(79);
						match(T__5);
						setState(80);
						expr(7);
						}
						break;
					case 2:
						{
						_localctx = new ModDivMultContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(81);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(82);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(83);
						expr(7);
						}
						break;
					case 3:
						{
						_localctx = new SumaRestaContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(84);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(85);
						_la = _input.LA(1);
						if ( !(_la==T__9 || _la==T__10) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(86);
						expr(6);
						}
						break;
					}
					} 
				}
				setState(91);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CondContext extends ParserRuleContext {
		public IfcondContext ifcond() {
			return getRuleContext(IfcondContext.class,0);
		}
		public ElsecondContext elsecond() {
			return getRuleContext(ElsecondContext.class,0);
		}
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			ifcond();
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(93);
				elsecond();
				}
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

	public static class IfcondContext extends ParserRuleContext {
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public List<InstruContext> instru() {
			return getRuleContexts(InstruContext.class);
		}
		public InstruContext instru(int i) {
			return getRuleContext(InstruContext.class,i);
		}
		public IfcondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifcond; }
	}

	public final IfcondContext ifcond() throws RecognitionException {
		IfcondContext _localctx = new IfcondContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ifcond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(T__11);
			setState(97);
			bool(0);
			setState(98);
			match(T__0);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__10) | (1L << T__11) | (1L << T__24) | (1L << NUM) | (1L << VARIABLE) | (1L << FUNCIO))) != 0)) {
				{
				{
				setState(99);
				instru();
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105);
			match(T__1);
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

	public static class ElsecondContext extends ParserRuleContext {
		public List<InstruContext> instru() {
			return getRuleContexts(InstruContext.class);
		}
		public InstruContext instru(int i) {
			return getRuleContext(InstruContext.class,i);
		}
		public ElsecondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsecond; }
	}

	public final ElsecondContext elsecond() throws RecognitionException {
		ElsecondContext _localctx = new ElsecondContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_elsecond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(T__12);
			setState(108);
			match(T__0);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__10) | (1L << T__11) | (1L << T__24) | (1L << NUM) | (1L << VARIABLE) | (1L << FUNCIO))) != 0)) {
				{
				{
				setState(109);
				instru();
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
			match(T__1);
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

	public static class BoolContext extends ParserRuleContext {
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
	 
		public BoolContext() { }
		public void copyFrom(BoolContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NegacioContext extends BoolContext {
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public NegacioContext(BoolContext ctx) { copyFrom(ctx); }
	}
	public static class ComparacioContext extends BoolContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ComparacioContext(BoolContext ctx) { copyFrom(ctx); }
	}
	public static class UnioContext extends BoolContext {
		public List<BoolContext> bool() {
			return getRuleContexts(BoolContext.class);
		}
		public BoolContext bool(int i) {
			return getRuleContext(BoolContext.class,i);
		}
		public UnioContext(BoolContext ctx) { copyFrom(ctx); }
	}
	public static class BoolParentesisContext extends BoolContext {
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public BoolParentesisContext(BoolContext ctx) { copyFrom(ctx); }
	}
	public static class TrueContext extends BoolContext {
		public TrueContext(BoolContext ctx) { copyFrom(ctx); }
	}
	public static class BoolVariableContext extends BoolContext {
		public TerminalNode VARIABLE() { return getToken(funxParser.VARIABLE, 0); }
		public BoolVariableContext(BoolContext ctx) { copyFrom(ctx); }
	}
	public static class FalseContext extends BoolContext {
		public FalseContext(BoolContext ctx) { copyFrom(ctx); }
	}
	public static class BooleanContext extends BoolContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BooleanContext(BoolContext ctx) { copyFrom(ctx); }
	}
	public static class DisjuncioContext extends BoolContext {
		public List<BoolContext> bool() {
			return getRuleContexts(BoolContext.class);
		}
		public BoolContext bool(int i) {
			return getRuleContext(BoolContext.class,i);
		}
		public DisjuncioContext(BoolContext ctx) { copyFrom(ctx); }
	}

	public final BoolContext bool() throws RecognitionException {
		return bool(0);
	}

	private BoolContext bool(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BoolContext _localctx = new BoolContext(_ctx, _parentState);
		BoolContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_bool, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				_localctx = new BoolParentesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(118);
				match(T__3);
				setState(119);
				bool(0);
				setState(120);
				match(T__4);
				}
				break;
			case 2:
				{
				_localctx = new NegacioContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(122);
				match(T__13);
				setState(123);
				bool(8);
				}
				break;
			case 3:
				{
				_localctx = new ComparacioContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(124);
				expr(0);
				setState(125);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(126);
				expr(0);
				}
				break;
			case 4:
				{
				_localctx = new BooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(128);
				expr(0);
				}
				break;
			case 5:
				{
				_localctx = new TrueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(129);
				match(T__22);
				}
				break;
			case 6:
				{
				_localctx = new FalseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(130);
				match(T__23);
				}
				break;
			case 7:
				{
				_localctx = new BoolVariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(131);
				match(VARIABLE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(142);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(140);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new DisjuncioContext(new BoolContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bool);
						setState(134);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(135);
						match(T__14);
						setState(136);
						bool(8);
						}
						break;
					case 2:
						{
						_localctx = new UnioContext(new BoolContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bool);
						setState(137);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(138);
						match(T__15);
						setState(139);
						bool(7);
						}
						break;
					}
					} 
				}
				setState(144);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BucleContext extends ParserRuleContext {
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public List<InstruContext> instru() {
			return getRuleContexts(InstruContext.class);
		}
		public InstruContext instru(int i) {
			return getRuleContext(InstruContext.class,i);
		}
		public BucleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bucle; }
	}

	public final BucleContext bucle() throws RecognitionException {
		BucleContext _localctx = new BucleContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_bucle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(T__24);
			setState(146);
			bool(0);
			setState(147);
			match(T__0);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__10) | (1L << T__11) | (1L << T__24) | (1L << NUM) | (1L << VARIABLE) | (1L << FUNCIO))) != 0)) {
				{
				{
				setState(148);
				instru();
				}
				}
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(154);
			match(T__1);
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

	public static class AssignacioContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(funxParser.VARIABLE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public AssignacioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignacio; }
	}

	public final AssignacioContext assignacio() throws RecognitionException {
		AssignacioContext _localctx = new AssignacioContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assignacio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(VARIABLE);
			setState(157);
			match(T__25);
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(158);
				expr(0);
				}
				break;
			case 2:
				{
				setState(159);
				bool(0);
				}
				break;
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 9:
			return bool_sempred((BoolContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean bool_sempred(BoolContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u00a5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\3\3\3\7\3 \n\3\f\3\16\3#\13\3\3\4\3"+
		"\4\3\4\3\4\3\4\5\4*\n\4\3\5\3\5\7\5.\n\5\f\5\16\5\61\13\5\3\5\3\5\6\5"+
		"\65\n\5\r\5\16\5\66\3\5\3\5\3\6\3\6\7\6=\n\6\f\6\16\6@\13\6\3\6\5\6C\n"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7O\n\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\7\7Z\n\7\f\7\16\7]\13\7\3\b\3\b\5\ba\n\b\3\t\3\t\3"+
		"\t\3\t\7\tg\n\t\f\t\16\tj\13\t\3\t\3\t\3\n\3\n\3\n\7\nq\n\n\f\n\16\nt"+
		"\13\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\5\13\u0087\n\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13"+
		"\u008f\n\13\f\13\16\13\u0092\13\13\3\f\3\f\3\f\3\f\7\f\u0098\n\f\f\f\16"+
		"\f\u009b\13\f\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u00a3\n\r\3\r\2\4\f\24\16\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\2\5\3\2\t\13\3\2\f\r\3\2\23\30\2\u00b6\2"+
		"\32\3\2\2\2\4!\3\2\2\2\6)\3\2\2\2\b+\3\2\2\2\n:\3\2\2\2\fN\3\2\2\2\16"+
		"^\3\2\2\2\20b\3\2\2\2\22m\3\2\2\2\24\u0086\3\2\2\2\26\u0093\3\2\2\2\30"+
		"\u009e\3\2\2\2\32\33\5\4\3\2\33\34\7\2\2\3\34\3\3\2\2\2\35 \5\6\4\2\36"+
		" \5\b\5\2\37\35\3\2\2\2\37\36\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2"+
		"\"\5\3\2\2\2#!\3\2\2\2$*\5\n\6\2%*\5\f\7\2&*\5\16\b\2\'*\5\26\f\2(*\5"+
		"\30\r\2)$\3\2\2\2)%\3\2\2\2)&\3\2\2\2)\'\3\2\2\2)(\3\2\2\2*\7\3\2\2\2"+
		"+/\7\37\2\2,.\7\36\2\2-,\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60"+
		"\62\3\2\2\2\61/\3\2\2\2\62\64\7\3\2\2\63\65\5\6\4\2\64\63\3\2\2\2\65\66"+
		"\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\678\3\2\2\289\7\4\2\29\t\3\2\2\2"+
		":>\7\37\2\2;=\5\f\7\2<;\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?B\3\2\2"+
		"\2@>\3\2\2\2AC\7\5\2\2BA\3\2\2\2BC\3\2\2\2C\13\3\2\2\2DE\b\7\1\2EF\7\6"+
		"\2\2FG\5\f\7\2GH\7\7\2\2HO\3\2\2\2IO\7\36\2\2JO\7\35\2\2KL\7\r\2\2LO\5"+
		"\f\7\4MO\5\n\6\2ND\3\2\2\2NI\3\2\2\2NJ\3\2\2\2NK\3\2\2\2NM\3\2\2\2O[\3"+
		"\2\2\2PQ\f\t\2\2QR\7\b\2\2RZ\5\f\7\tST\f\b\2\2TU\t\2\2\2UZ\5\f\7\tVW\f"+
		"\7\2\2WX\t\3\2\2XZ\5\f\7\bYP\3\2\2\2YS\3\2\2\2YV\3\2\2\2Z]\3\2\2\2[Y\3"+
		"\2\2\2[\\\3\2\2\2\\\r\3\2\2\2][\3\2\2\2^`\5\20\t\2_a\5\22\n\2`_\3\2\2"+
		"\2`a\3\2\2\2a\17\3\2\2\2bc\7\16\2\2cd\5\24\13\2dh\7\3\2\2eg\5\6\4\2fe"+
		"\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2ik\3\2\2\2jh\3\2\2\2kl\7\4\2\2l"+
		"\21\3\2\2\2mn\7\17\2\2nr\7\3\2\2oq\5\6\4\2po\3\2\2\2qt\3\2\2\2rp\3\2\2"+
		"\2rs\3\2\2\2su\3\2\2\2tr\3\2\2\2uv\7\4\2\2v\23\3\2\2\2wx\b\13\1\2xy\7"+
		"\6\2\2yz\5\24\13\2z{\7\7\2\2{\u0087\3\2\2\2|}\7\20\2\2}\u0087\5\24\13"+
		"\n~\177\5\f\7\2\177\u0080\t\4\2\2\u0080\u0081\5\f\7\2\u0081\u0087\3\2"+
		"\2\2\u0082\u0087\5\f\7\2\u0083\u0087\7\31\2\2\u0084\u0087\7\32\2\2\u0085"+
		"\u0087\7\36\2\2\u0086w\3\2\2\2\u0086|\3\2\2\2\u0086~\3\2\2\2\u0086\u0082"+
		"\3\2\2\2\u0086\u0083\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0085\3\2\2\2\u0087"+
		"\u0090\3\2\2\2\u0088\u0089\f\t\2\2\u0089\u008a\7\21\2\2\u008a\u008f\5"+
		"\24\13\n\u008b\u008c\f\b\2\2\u008c\u008d\7\22\2\2\u008d\u008f\5\24\13"+
		"\t\u008e\u0088\3\2\2\2\u008e\u008b\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e"+
		"\3\2\2\2\u0090\u0091\3\2\2\2\u0091\25\3\2\2\2\u0092\u0090\3\2\2\2\u0093"+
		"\u0094\7\33\2\2\u0094\u0095\5\24\13\2\u0095\u0099\7\3\2\2\u0096\u0098"+
		"\5\6\4\2\u0097\u0096\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\u009c\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009d\7\4"+
		"\2\2\u009d\27\3\2\2\2\u009e\u009f\7\36\2\2\u009f\u00a2\7\34\2\2\u00a0"+
		"\u00a3\5\f\7\2\u00a1\u00a3\5\24\13\2\u00a2\u00a0\3\2\2\2\u00a2\u00a1\3"+
		"\2\2\2\u00a3\31\3\2\2\2\24\37!)/\66>BNY[`hr\u0086\u008e\u0090\u0099\u00a2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}