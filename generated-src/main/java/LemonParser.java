// Generated from Lemon.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LemonParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, IF=3, ELSEIF=4, ELSE=5, AND=6, OR=7, TRUE=8, FALSE=9, 
		MULT=10, DIV=11, PLUS=12, MINUS=13, GT=14, GE=15, LT=16, LE=17, EQ=18, 
		NE=19, FLOAT=20, INT=21, STR=22, TYPE=23, IDENTIFIER=24, LPAREN=25, RPAREN=26, 
		LBRACKET=27, RBRACKET=28, SEMI=29, COMMENT=30, WS=31;
	public static final int
		RULE_rule_set = 0, RULE_single_rule = 1, RULE_if_s = 2, RULE_else_if_s = 3, 
		RULE_else_s = 4, RULE_condition = 5, RULE_conclusion = 6, RULE_logical_expression = 7, 
		RULE_comparison_expression = 8, RULE_comparison_operand = 9, RULE_comp_operator = 10, 
		RULE_arithmetic_expression = 11, RULE_logical_entity = 12, RULE_numeric_entity = 13, 
		RULE_declaration = 14, RULE_show = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"rule_set", "single_rule", "if_s", "else_if_s", "else_s", "condition", 
			"conclusion", "logical_expression", "comparison_expression", "comparison_operand", 
			"comp_operator", "arithmetic_expression", "logical_entity", "numeric_entity", 
			"declaration", "show"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'show'", "'if'", "'else if'", "'else'", "'and'", "'or'", 
			"'true'", "'false'", "'*'", "'/'", "'+'", "'-'", "'>'", "'>='", "'<'", 
			"'<='", "'=='", "'!='", null, null, null, null, null, "'('", "')'", "'{'", 
			"'}'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "IF", "ELSEIF", "ELSE", "AND", "OR", "TRUE", "FALSE", 
			"MULT", "DIV", "PLUS", "MINUS", "GT", "GE", "LT", "LE", "EQ", "NE", "FLOAT", 
			"INT", "STR", "TYPE", "IDENTIFIER", "LPAREN", "RPAREN", "LBRACKET", "RBRACKET", 
			"SEMI", "COMMENT", "WS"
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
	public String getGrammarFileName() { return "Lemon.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LemonParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Rule_setContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(LemonParser.EOF, 0); }
		public List<Single_ruleContext> single_rule() {
			return getRuleContexts(Single_ruleContext.class);
		}
		public Single_ruleContext single_rule(int i) {
			return getRuleContext(Single_ruleContext.class,i);
		}
		public Rule_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rule_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).enterRule_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).exitRule_set(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LemonVisitor ) return ((LemonVisitor<? extends T>)visitor).visitRule_set(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rule_setContext rule_set() throws RecognitionException {
		Rule_setContext _localctx = new Rule_setContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_rule_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << IF) | (1L << TYPE))) != 0)) {
				{
				{
				setState(32);
				single_rule();
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(38);
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

	public static class Single_ruleContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ShowContext show() {
			return getRuleContext(ShowContext.class,0);
		}
		public If_sContext if_s() {
			return getRuleContext(If_sContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(LemonParser.SEMI, 0); }
		public Single_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).enterSingle_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).exitSingle_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LemonVisitor ) return ((LemonVisitor<? extends T>)visitor).visitSingle_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_ruleContext single_rule() throws RecognitionException {
		Single_ruleContext _localctx = new Single_ruleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_single_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				{
				setState(40);
				declaration();
				}
				break;
			case T__1:
				{
				setState(41);
				show();
				}
				break;
			case IF:
				{
				setState(42);
				if_s();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(45);
				match(SEMI);
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

	public static class If_sContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(LemonParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode LBRACKET() { return getToken(LemonParser.LBRACKET, 0); }
		public ConclusionContext conclusion() {
			return getRuleContext(ConclusionContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(LemonParser.RBRACKET, 0); }
		public List<Else_if_sContext> else_if_s() {
			return getRuleContexts(Else_if_sContext.class);
		}
		public Else_if_sContext else_if_s(int i) {
			return getRuleContext(Else_if_sContext.class,i);
		}
		public Else_sContext else_s() {
			return getRuleContext(Else_sContext.class,0);
		}
		public If_sContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).enterIf_s(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).exitIf_s(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LemonVisitor ) return ((LemonVisitor<? extends T>)visitor).visitIf_s(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_sContext if_s() throws RecognitionException {
		If_sContext _localctx = new If_sContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_if_s);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(IF);
			setState(49);
			condition();
			setState(50);
			match(LBRACKET);
			setState(51);
			conclusion();
			setState(52);
			match(RBRACKET);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(53);
				else_if_s();
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(59);
				else_s();
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

	public static class Else_if_sContext extends ParserRuleContext {
		public TerminalNode ELSEIF() { return getToken(LemonParser.ELSEIF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode LBRACKET() { return getToken(LemonParser.LBRACKET, 0); }
		public ConclusionContext conclusion() {
			return getRuleContext(ConclusionContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(LemonParser.RBRACKET, 0); }
		public Else_if_sContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_if_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).enterElse_if_s(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).exitElse_if_s(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LemonVisitor ) return ((LemonVisitor<? extends T>)visitor).visitElse_if_s(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_if_sContext else_if_s() throws RecognitionException {
		Else_if_sContext _localctx = new Else_if_sContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_else_if_s);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(ELSEIF);
			setState(63);
			condition();
			setState(64);
			match(LBRACKET);
			setState(65);
			conclusion();
			setState(66);
			match(RBRACKET);
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

	public static class Else_sContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(LemonParser.ELSE, 0); }
		public TerminalNode LBRACKET() { return getToken(LemonParser.LBRACKET, 0); }
		public ConclusionContext conclusion() {
			return getRuleContext(ConclusionContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(LemonParser.RBRACKET, 0); }
		public Else_sContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).enterElse_s(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).exitElse_s(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LemonVisitor ) return ((LemonVisitor<? extends T>)visitor).visitElse_s(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_sContext else_s() throws RecognitionException {
		Else_sContext _localctx = new Else_sContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_else_s);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(ELSE);
			setState(69);
			match(LBRACKET);
			setState(70);
			conclusion();
			setState(71);
			match(RBRACKET);
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

	public static class ConditionContext extends ParserRuleContext {
		public Logical_expressionContext logical_expression() {
			return getRuleContext(Logical_expressionContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LemonVisitor ) return ((LemonVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			logical_expression(0);
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

	public static class ConclusionContext extends ParserRuleContext {
		public List<Single_ruleContext> single_rule() {
			return getRuleContexts(Single_ruleContext.class);
		}
		public Single_ruleContext single_rule(int i) {
			return getRuleContext(Single_ruleContext.class,i);
		}
		public ConclusionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conclusion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).enterConclusion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).exitConclusion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LemonVisitor ) return ((LemonVisitor<? extends T>)visitor).visitConclusion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConclusionContext conclusion() throws RecognitionException {
		ConclusionContext _localctx = new ConclusionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_conclusion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << IF) | (1L << TYPE))) != 0)) {
				{
				{
				setState(75);
				single_rule();
				}
				}
				setState(80);
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

	public static class Logical_expressionContext extends ParserRuleContext {
		public Logical_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_expression; }
	 
		public Logical_expressionContext() { }
		public void copyFrom(Logical_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicalEntityContext extends Logical_expressionContext {
		public Logical_entityContext logical_entity() {
			return getRuleContext(Logical_entityContext.class,0);
		}
		public LogicalEntityContext(Logical_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).enterLogicalEntity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).exitLogicalEntity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LemonVisitor ) return ((LemonVisitor<? extends T>)visitor).visitLogicalEntity(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonExpressionContext extends Logical_expressionContext {
		public Comparison_expressionContext comparison_expression() {
			return getRuleContext(Comparison_expressionContext.class,0);
		}
		public ComparisonExpressionContext(Logical_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).enterComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).exitComparisonExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LemonVisitor ) return ((LemonVisitor<? extends T>)visitor).visitComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalExpressionInParenContext extends Logical_expressionContext {
		public TerminalNode LPAREN() { return getToken(LemonParser.LPAREN, 0); }
		public Logical_expressionContext logical_expression() {
			return getRuleContext(Logical_expressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LemonParser.RPAREN, 0); }
		public LogicalExpressionInParenContext(Logical_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).enterLogicalExpressionInParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).exitLogicalExpressionInParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LemonVisitor ) return ((LemonVisitor<? extends T>)visitor).visitLogicalExpressionInParen(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalExpressionAndContext extends Logical_expressionContext {
		public List<Logical_expressionContext> logical_expression() {
			return getRuleContexts(Logical_expressionContext.class);
		}
		public Logical_expressionContext logical_expression(int i) {
			return getRuleContext(Logical_expressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(LemonParser.AND, 0); }
		public LogicalExpressionAndContext(Logical_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).enterLogicalExpressionAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).exitLogicalExpressionAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LemonVisitor ) return ((LemonVisitor<? extends T>)visitor).visitLogicalExpressionAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalExpressionOrContext extends Logical_expressionContext {
		public List<Logical_expressionContext> logical_expression() {
			return getRuleContexts(Logical_expressionContext.class);
		}
		public Logical_expressionContext logical_expression(int i) {
			return getRuleContext(Logical_expressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(LemonParser.OR, 0); }
		public LogicalExpressionOrContext(Logical_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).enterLogicalExpressionOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).exitLogicalExpressionOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LemonVisitor ) return ((LemonVisitor<? extends T>)visitor).visitLogicalExpressionOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_expressionContext logical_expression() throws RecognitionException {
		return logical_expression(0);
	}

	private Logical_expressionContext logical_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Logical_expressionContext _localctx = new Logical_expressionContext(_ctx, _parentState);
		Logical_expressionContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_logical_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				_localctx = new ComparisonExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(82);
				comparison_expression();
				}
				break;
			case 2:
				{
				_localctx = new LogicalExpressionInParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(83);
				match(LPAREN);
				setState(84);
				logical_expression(0);
				setState(85);
				match(RPAREN);
				}
				break;
			case 3:
				{
				_localctx = new LogicalEntityContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(87);
				logical_entity();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(98);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(96);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalExpressionAndContext(new Logical_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logical_expression);
						setState(90);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(91);
						match(AND);
						setState(92);
						logical_expression(6);
						}
						break;
					case 2:
						{
						_localctx = new LogicalExpressionOrContext(new Logical_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logical_expression);
						setState(93);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(94);
						match(OR);
						setState(95);
						logical_expression(5);
						}
						break;
					}
					} 
				}
				setState(100);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class Comparison_expressionContext extends ParserRuleContext {
		public Comparison_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_expression; }
	 
		public Comparison_expressionContext() { }
		public void copyFrom(Comparison_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ComparisonExpressionParensContext extends Comparison_expressionContext {
		public TerminalNode LPAREN() { return getToken(LemonParser.LPAREN, 0); }
		public Comparison_expressionContext comparison_expression() {
			return getRuleContext(Comparison_expressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LemonParser.RPAREN, 0); }
		public ComparisonExpressionParensContext(Comparison_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).enterComparisonExpressionParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).exitComparisonExpressionParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LemonVisitor ) return ((LemonVisitor<? extends T>)visitor).visitComparisonExpressionParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonExpressionWithOperatorContext extends Comparison_expressionContext {
		public List<Comparison_operandContext> comparison_operand() {
			return getRuleContexts(Comparison_operandContext.class);
		}
		public Comparison_operandContext comparison_operand(int i) {
			return getRuleContext(Comparison_operandContext.class,i);
		}
		public Comp_operatorContext comp_operator() {
			return getRuleContext(Comp_operatorContext.class,0);
		}
		public ComparisonExpressionWithOperatorContext(Comparison_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).enterComparisonExpressionWithOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).exitComparisonExpressionWithOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LemonVisitor ) return ((LemonVisitor<? extends T>)visitor).visitComparisonExpressionWithOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comparison_expressionContext comparison_expression() throws RecognitionException {
		Comparison_expressionContext _localctx = new Comparison_expressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_comparison_expression);
		try {
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new ComparisonExpressionWithOperatorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				comparison_operand();
				setState(102);
				comp_operator();
				setState(103);
				comparison_operand();
				}
				break;
			case 2:
				_localctx = new ComparisonExpressionParensContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				match(LPAREN);
				setState(106);
				comparison_expression();
				setState(107);
				match(RPAREN);
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

	public static class Comparison_operandContext extends ParserRuleContext {
		public Arithmetic_expressionContext arithmetic_expression() {
			return getRuleContext(Arithmetic_expressionContext.class,0);
		}
		public Comparison_operandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).enterComparison_operand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).exitComparison_operand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LemonVisitor ) return ((LemonVisitor<? extends T>)visitor).visitComparison_operand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comparison_operandContext comparison_operand() throws RecognitionException {
		Comparison_operandContext _localctx = new Comparison_operandContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_comparison_operand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			arithmetic_expression(0);
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

	public static class Comp_operatorContext extends ParserRuleContext {
		public TerminalNode GT() { return getToken(LemonParser.GT, 0); }
		public TerminalNode GE() { return getToken(LemonParser.GE, 0); }
		public TerminalNode LT() { return getToken(LemonParser.LT, 0); }
		public TerminalNode LE() { return getToken(LemonParser.LE, 0); }
		public TerminalNode EQ() { return getToken(LemonParser.EQ, 0); }
		public TerminalNode NE() { return getToken(LemonParser.NE, 0); }
		public Comp_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).enterComp_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).exitComp_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LemonVisitor ) return ((LemonVisitor<? extends T>)visitor).visitComp_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comp_operatorContext comp_operator() throws RecognitionException {
		Comp_operatorContext _localctx = new Comp_operatorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_comp_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << GE) | (1L << LT) | (1L << LE) | (1L << EQ) | (1L << NE))) != 0)) ) {
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

	public static class Arithmetic_expressionContext extends ParserRuleContext {
		public Arithmetic_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_expression; }
	 
		public Arithmetic_expressionContext() { }
		public void copyFrom(Arithmetic_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArithmeticExpressionMultContext extends Arithmetic_expressionContext {
		public List<Arithmetic_expressionContext> arithmetic_expression() {
			return getRuleContexts(Arithmetic_expressionContext.class);
		}
		public Arithmetic_expressionContext arithmetic_expression(int i) {
			return getRuleContext(Arithmetic_expressionContext.class,i);
		}
		public TerminalNode MULT() { return getToken(LemonParser.MULT, 0); }
		public ArithmeticExpressionMultContext(Arithmetic_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).enterArithmeticExpressionMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).exitArithmeticExpressionMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LemonVisitor ) return ((LemonVisitor<? extends T>)visitor).visitArithmeticExpressionMult(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticExpressionMinusContext extends Arithmetic_expressionContext {
		public List<Arithmetic_expressionContext> arithmetic_expression() {
			return getRuleContexts(Arithmetic_expressionContext.class);
		}
		public Arithmetic_expressionContext arithmetic_expression(int i) {
			return getRuleContext(Arithmetic_expressionContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(LemonParser.MINUS, 0); }
		public ArithmeticExpressionMinusContext(Arithmetic_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).enterArithmeticExpressionMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).exitArithmeticExpressionMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LemonVisitor ) return ((LemonVisitor<? extends T>)visitor).visitArithmeticExpressionMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticExpressionParensContext extends Arithmetic_expressionContext {
		public TerminalNode LPAREN() { return getToken(LemonParser.LPAREN, 0); }
		public Arithmetic_expressionContext arithmetic_expression() {
			return getRuleContext(Arithmetic_expressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LemonParser.RPAREN, 0); }
		public ArithmeticExpressionParensContext(Arithmetic_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).enterArithmeticExpressionParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).exitArithmeticExpressionParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LemonVisitor ) return ((LemonVisitor<? extends T>)visitor).visitArithmeticExpressionParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticExpressionNumericEntityContext extends Arithmetic_expressionContext {
		public Numeric_entityContext numeric_entity() {
			return getRuleContext(Numeric_entityContext.class,0);
		}
		public ArithmeticExpressionNumericEntityContext(Arithmetic_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).enterArithmeticExpressionNumericEntity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).exitArithmeticExpressionNumericEntity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LemonVisitor ) return ((LemonVisitor<? extends T>)visitor).visitArithmeticExpressionNumericEntity(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticExpressionDivContext extends Arithmetic_expressionContext {
		public List<Arithmetic_expressionContext> arithmetic_expression() {
			return getRuleContexts(Arithmetic_expressionContext.class);
		}
		public Arithmetic_expressionContext arithmetic_expression(int i) {
			return getRuleContext(Arithmetic_expressionContext.class,i);
		}
		public TerminalNode DIV() { return getToken(LemonParser.DIV, 0); }
		public ArithmeticExpressionDivContext(Arithmetic_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).enterArithmeticExpressionDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).exitArithmeticExpressionDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LemonVisitor ) return ((LemonVisitor<? extends T>)visitor).visitArithmeticExpressionDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticExpressionPlusContext extends Arithmetic_expressionContext {
		public List<Arithmetic_expressionContext> arithmetic_expression() {
			return getRuleContexts(Arithmetic_expressionContext.class);
		}
		public Arithmetic_expressionContext arithmetic_expression(int i) {
			return getRuleContext(Arithmetic_expressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(LemonParser.PLUS, 0); }
		public ArithmeticExpressionPlusContext(Arithmetic_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).enterArithmeticExpressionPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).exitArithmeticExpressionPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LemonVisitor ) return ((LemonVisitor<? extends T>)visitor).visitArithmeticExpressionPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticExpressionNegationContext extends Arithmetic_expressionContext {
		public TerminalNode MINUS() { return getToken(LemonParser.MINUS, 0); }
		public Arithmetic_expressionContext arithmetic_expression() {
			return getRuleContext(Arithmetic_expressionContext.class,0);
		}
		public ArithmeticExpressionNegationContext(Arithmetic_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).enterArithmeticExpressionNegation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).exitArithmeticExpressionNegation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LemonVisitor ) return ((LemonVisitor<? extends T>)visitor).visitArithmeticExpressionNegation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arithmetic_expressionContext arithmetic_expression() throws RecognitionException {
		return arithmetic_expression(0);
	}

	private Arithmetic_expressionContext arithmetic_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Arithmetic_expressionContext _localctx = new Arithmetic_expressionContext(_ctx, _parentState);
		Arithmetic_expressionContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_arithmetic_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				{
				_localctx = new ArithmeticExpressionNegationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(116);
				match(MINUS);
				setState(117);
				arithmetic_expression(3);
				}
				break;
			case LPAREN:
				{
				_localctx = new ArithmeticExpressionParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(118);
				match(LPAREN);
				setState(119);
				arithmetic_expression(0);
				setState(120);
				match(RPAREN);
				}
				break;
			case FLOAT:
			case INT:
			case IDENTIFIER:
				{
				_localctx = new ArithmeticExpressionNumericEntityContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(122);
				numeric_entity();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(139);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(137);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticExpressionMultContext(new Arithmetic_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_expression);
						setState(125);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(126);
						match(MULT);
						setState(127);
						arithmetic_expression(8);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticExpressionDivContext(new Arithmetic_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_expression);
						setState(128);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(129);
						match(DIV);
						setState(130);
						arithmetic_expression(7);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticExpressionPlusContext(new Arithmetic_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_expression);
						setState(131);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(132);
						match(PLUS);
						setState(133);
						arithmetic_expression(6);
						}
						break;
					case 4:
						{
						_localctx = new ArithmeticExpressionMinusContext(new Arithmetic_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_expression);
						setState(134);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(135);
						match(MINUS);
						setState(136);
						arithmetic_expression(5);
						}
						break;
					}
					} 
				}
				setState(141);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class Logical_entityContext extends ParserRuleContext {
		public Logical_entityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_entity; }
	 
		public Logical_entityContext() { }
		public void copyFrom(Logical_entityContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogivalVariableContext extends Logical_entityContext {
		public TerminalNode IDENTIFIER() { return getToken(LemonParser.IDENTIFIER, 0); }
		public LogivalVariableContext(Logical_entityContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).enterLogivalVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).exitLogivalVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LemonVisitor ) return ((LemonVisitor<? extends T>)visitor).visitLogivalVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalConstContext extends Logical_entityContext {
		public TerminalNode TRUE() { return getToken(LemonParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(LemonParser.FALSE, 0); }
		public LogicalConstContext(Logical_entityContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).enterLogicalConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).exitLogicalConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LemonVisitor ) return ((LemonVisitor<? extends T>)visitor).visitLogicalConst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_entityContext logical_entity() throws RecognitionException {
		Logical_entityContext _localctx = new Logical_entityContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_logical_entity);
		int _la;
		try {
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
				_localctx = new LogicalConstContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case IDENTIFIER:
				_localctx = new LogivalVariableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Numeric_entityContext extends ParserRuleContext {
		public Numeric_entityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeric_entity; }
	 
		public Numeric_entityContext() { }
		public void copyFrom(Numeric_entityContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumericConstContext extends Numeric_entityContext {
		public TerminalNode FLOAT() { return getToken(LemonParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(LemonParser.INT, 0); }
		public NumericConstContext(Numeric_entityContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).enterNumericConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).exitNumericConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LemonVisitor ) return ((LemonVisitor<? extends T>)visitor).visitNumericConst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumbericVariableContext extends Numeric_entityContext {
		public TerminalNode IDENTIFIER() { return getToken(LemonParser.IDENTIFIER, 0); }
		public NumbericVariableContext(Numeric_entityContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).enterNumbericVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).exitNumbericVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LemonVisitor ) return ((LemonVisitor<? extends T>)visitor).visitNumbericVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numeric_entityContext numeric_entity() throws RecognitionException {
		Numeric_entityContext _localctx = new Numeric_entityContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_numeric_entity);
		int _la;
		try {
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT:
			case INT:
				_localctx = new NumericConstContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				_la = _input.LA(1);
				if ( !(_la==FLOAT || _la==INT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case IDENTIFIER:
				_localctx = new NumbericVariableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(LemonParser.TYPE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(LemonParser.IDENTIFIER, 0); }
		public TerminalNode FLOAT() { return getToken(LemonParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(LemonParser.INT, 0); }
		public TerminalNode STR() { return getToken(LemonParser.STR, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LemonVisitor ) return ((LemonVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(TYPE);
			setState(151);
			match(IDENTIFIER);
			setState(152);
			match(T__0);
			setState(153);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FLOAT) | (1L << INT) | (1L << STR))) != 0)) ) {
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

	public static class ShowContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(LemonParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(LemonParser.INT, 0); }
		public TerminalNode STR() { return getToken(LemonParser.STR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(LemonParser.IDENTIFIER, 0); }
		public ShowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_show; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).enterShow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).exitShow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LemonVisitor ) return ((LemonVisitor<? extends T>)visitor).visitShow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowContext show() throws RecognitionException {
		ShowContext _localctx = new ShowContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_show);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(T__1);
			setState(156);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FLOAT) | (1L << INT) | (1L << STR) | (1L << IDENTIFIER))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return logical_expression_sempred((Logical_expressionContext)_localctx, predIndex);
		case 11:
			return arithmetic_expression_sempred((Arithmetic_expressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean logical_expression_sempred(Logical_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean arithmetic_expression_sempred(Arithmetic_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!\u00a1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\7\2$\n"+
		"\2\f\2\16\2\'\13\2\3\2\3\2\3\3\3\3\3\3\5\3.\n\3\3\3\5\3\61\n\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\7\49\n\4\f\4\16\4<\13\4\3\4\5\4?\n\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\7\bO\n\b\f\b\16\bR\13\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\5\t[\n\t\3\t\3\t\3\t\3\t\3\t\3\t\7\tc\n\t\f\t\16"+
		"\tf\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\np\n\n\3\13\3\13\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r~\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\7\r\u008c\n\r\f\r\16\r\u008f\13\r\3\16\3\16\5\16\u0093"+
		"\n\16\3\17\3\17\5\17\u0097\n\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\2\4\20\30\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\7\3\2\20"+
		"\25\3\2\n\13\3\2\26\27\3\2\26\30\4\2\26\30\32\32\2\u00a4\2%\3\2\2\2\4"+
		"-\3\2\2\2\6\62\3\2\2\2\b@\3\2\2\2\nF\3\2\2\2\fK\3\2\2\2\16P\3\2\2\2\20"+
		"Z\3\2\2\2\22o\3\2\2\2\24q\3\2\2\2\26s\3\2\2\2\30}\3\2\2\2\32\u0092\3\2"+
		"\2\2\34\u0096\3\2\2\2\36\u0098\3\2\2\2 \u009d\3\2\2\2\"$\5\4\3\2#\"\3"+
		"\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&(\3\2\2\2\'%\3\2\2\2()\7\2\2\3)"+
		"\3\3\2\2\2*.\5\36\20\2+.\5 \21\2,.\5\6\4\2-*\3\2\2\2-+\3\2\2\2-,\3\2\2"+
		"\2.\60\3\2\2\2/\61\7\37\2\2\60/\3\2\2\2\60\61\3\2\2\2\61\5\3\2\2\2\62"+
		"\63\7\5\2\2\63\64\5\f\7\2\64\65\7\35\2\2\65\66\5\16\b\2\66:\7\36\2\2\67"+
		"9\5\b\5\28\67\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;>\3\2\2\2<:\3\2\2"+
		"\2=?\5\n\6\2>=\3\2\2\2>?\3\2\2\2?\7\3\2\2\2@A\7\6\2\2AB\5\f\7\2BC\7\35"+
		"\2\2CD\5\16\b\2DE\7\36\2\2E\t\3\2\2\2FG\7\7\2\2GH\7\35\2\2HI\5\16\b\2"+
		"IJ\7\36\2\2J\13\3\2\2\2KL\5\20\t\2L\r\3\2\2\2MO\5\4\3\2NM\3\2\2\2OR\3"+
		"\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\17\3\2\2\2RP\3\2\2\2ST\b\t\1\2T[\5\22\n\2"+
		"UV\7\33\2\2VW\5\20\t\2WX\7\34\2\2X[\3\2\2\2Y[\5\32\16\2ZS\3\2\2\2ZU\3"+
		"\2\2\2ZY\3\2\2\2[d\3\2\2\2\\]\f\7\2\2]^\7\b\2\2^c\5\20\t\b_`\f\6\2\2`"+
		"a\7\t\2\2ac\5\20\t\7b\\\3\2\2\2b_\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2"+
		"\2e\21\3\2\2\2fd\3\2\2\2gh\5\24\13\2hi\5\26\f\2ij\5\24\13\2jp\3\2\2\2"+
		"kl\7\33\2\2lm\5\22\n\2mn\7\34\2\2np\3\2\2\2og\3\2\2\2ok\3\2\2\2p\23\3"+
		"\2\2\2qr\5\30\r\2r\25\3\2\2\2st\t\2\2\2t\27\3\2\2\2uv\b\r\1\2vw\7\17\2"+
		"\2w~\5\30\r\5xy\7\33\2\2yz\5\30\r\2z{\7\34\2\2{~\3\2\2\2|~\5\34\17\2}"+
		"u\3\2\2\2}x\3\2\2\2}|\3\2\2\2~\u008d\3\2\2\2\177\u0080\f\t\2\2\u0080\u0081"+
		"\7\f\2\2\u0081\u008c\5\30\r\n\u0082\u0083\f\b\2\2\u0083\u0084\7\r\2\2"+
		"\u0084\u008c\5\30\r\t\u0085\u0086\f\7\2\2\u0086\u0087\7\16\2\2\u0087\u008c"+
		"\5\30\r\b\u0088\u0089\f\6\2\2\u0089\u008a\7\17\2\2\u008a\u008c\5\30\r"+
		"\7\u008b\177\3\2\2\2\u008b\u0082\3\2\2\2\u008b\u0085\3\2\2\2\u008b\u0088"+
		"\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\31\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0093\t\3\2\2\u0091\u0093\7\32\2"+
		"\2\u0092\u0090\3\2\2\2\u0092\u0091\3\2\2\2\u0093\33\3\2\2\2\u0094\u0097"+
		"\t\4\2\2\u0095\u0097\7\32\2\2\u0096\u0094\3\2\2\2\u0096\u0095\3\2\2\2"+
		"\u0097\35\3\2\2\2\u0098\u0099\7\31\2\2\u0099\u009a\7\32\2\2\u009a\u009b"+
		"\7\3\2\2\u009b\u009c\t\5\2\2\u009c\37\3\2\2\2\u009d\u009e\7\4\2\2\u009e"+
		"\u009f\t\6\2\2\u009f!\3\2\2\2\21%-\60:>PZbdo}\u008b\u008d\u0092\u0096";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}