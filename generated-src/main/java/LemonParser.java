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
		MULT=10, DIV=11, MOD=12, PLUS=13, MINUS=14, GT=15, GE=16, LT=17, LE=18, 
		EQ=19, NE=20, FLOAT=21, INT=22, STR=23, NUL=24, TYPE=25, IDENTIFIER=26, 
		LPAREN=27, RPAREN=28, LBRACKET=29, RBRACKET=30, SEMI=31, COMMENT=32, WS=33;
	public static final int
		RULE_rule_set = 0, RULE_single_rule = 1, RULE_if_s = 2, RULE_else_if_s = 3, 
		RULE_else_s = 4, RULE_condition = 5, RULE_conclusion = 6, RULE_logical_expression = 7, 
		RULE_comparison_expression = 8, RULE_comparison_operand = 9, RULE_comp_operator = 10, 
		RULE_arithmetic_expression = 11, RULE_logical_entity = 12, RULE_numeric_entity = 13, 
		RULE_declaration = 14, RULE_show = 15, RULE_expression = 16, RULE_number_atom = 17, 
		RULE_atom = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"rule_set", "single_rule", "if_s", "else_if_s", "else_s", "condition", 
			"conclusion", "logical_expression", "comparison_expression", "comparison_operand", 
			"comp_operator", "arithmetic_expression", "logical_entity", "numeric_entity", 
			"declaration", "show", "expression", "number_atom", "atom"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'show'", "'if'", "'else if'", "'else'", "'and'", "'or'", 
			"'true'", "'false'", "'*'", "'/'", "'%'", "'+'", "'-'", "'>'", "'>='", 
			"'<'", "'<='", "'=='", "'!='", null, null, null, "'nul'", null, null, 
			"'('", "')'", "'{'", "'}'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "IF", "ELSEIF", "ELSE", "AND", "OR", "TRUE", "FALSE", 
			"MULT", "DIV", "MOD", "PLUS", "MINUS", "GT", "GE", "LT", "LE", "EQ", 
			"NE", "FLOAT", "INT", "STR", "NUL", "TYPE", "IDENTIFIER", "LPAREN", "RPAREN", 
			"LBRACKET", "RBRACKET", "SEMI", "COMMENT", "WS"
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
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << IF) | (1L << TYPE))) != 0)) {
				{
				{
				setState(38);
				single_rule();
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44);
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
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				{
				setState(46);
				declaration();
				}
				break;
			case T__1:
				{
				setState(47);
				show();
				}
				break;
			case IF:
				{
				setState(48);
				if_s();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(51);
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
			setState(54);
			match(IF);
			setState(55);
			condition();
			setState(56);
			match(LBRACKET);
			setState(57);
			conclusion();
			setState(58);
			match(RBRACKET);
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(59);
				else_if_s();
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(65);
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
			setState(68);
			match(ELSEIF);
			setState(69);
			condition();
			setState(70);
			match(LBRACKET);
			setState(71);
			conclusion();
			setState(72);
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
			setState(74);
			match(ELSE);
			setState(75);
			match(LBRACKET);
			setState(76);
			conclusion();
			setState(77);
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
			setState(79);
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
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << IF) | (1L << TYPE))) != 0)) {
				{
				{
				setState(81);
				single_rule();
				}
				}
				setState(86);
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
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				_localctx = new ComparisonExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(88);
				comparison_expression();
				}
				break;
			case 2:
				{
				_localctx = new LogicalExpressionInParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(89);
				match(LPAREN);
				setState(90);
				logical_expression(0);
				setState(91);
				match(RPAREN);
				}
				break;
			case 3:
				{
				_localctx = new LogicalEntityContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(93);
				logical_entity();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(104);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(102);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalExpressionAndContext(new Logical_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logical_expression);
						setState(96);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(97);
						match(AND);
						setState(98);
						logical_expression(6);
						}
						break;
					case 2:
						{
						_localctx = new LogicalExpressionOrContext(new Logical_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_logical_expression);
						setState(99);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(100);
						match(OR);
						setState(101);
						logical_expression(5);
						}
						break;
					}
					} 
				}
				setState(106);
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
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new ComparisonExpressionWithOperatorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				comparison_operand();
				setState(108);
				comp_operator();
				setState(109);
				comparison_operand();
				}
				break;
			case 2:
				_localctx = new ComparisonExpressionParensContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				match(LPAREN);
				setState(112);
				comparison_expression();
				setState(113);
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
			setState(117);
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
			setState(119);
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
	public static class ArithmeticExpressionModContext extends Arithmetic_expressionContext {
		public List<Arithmetic_expressionContext> arithmetic_expression() {
			return getRuleContexts(Arithmetic_expressionContext.class);
		}
		public Arithmetic_expressionContext arithmetic_expression(int i) {
			return getRuleContext(Arithmetic_expressionContext.class,i);
		}
		public TerminalNode MOD() { return getToken(LemonParser.MOD, 0); }
		public ArithmeticExpressionModContext(Arithmetic_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).enterArithmeticExpressionMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).exitArithmeticExpressionMod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LemonVisitor ) return ((LemonVisitor<? extends T>)visitor).visitArithmeticExpressionMod(this);
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
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				{
				_localctx = new ArithmeticExpressionNegationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(122);
				match(MINUS);
				setState(123);
				arithmetic_expression(3);
				}
				break;
			case LPAREN:
				{
				_localctx = new ArithmeticExpressionParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(124);
				match(LPAREN);
				setState(125);
				arithmetic_expression(0);
				setState(126);
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
				setState(128);
				numeric_entity();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(148);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(146);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticExpressionMultContext(new Arithmetic_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_expression);
						setState(131);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(132);
						match(MULT);
						setState(133);
						arithmetic_expression(9);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticExpressionDivContext(new Arithmetic_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_expression);
						setState(134);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(135);
						match(DIV);
						setState(136);
						arithmetic_expression(8);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticExpressionModContext(new Arithmetic_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_expression);
						setState(137);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(138);
						match(MOD);
						setState(139);
						arithmetic_expression(7);
						}
						break;
					case 4:
						{
						_localctx = new ArithmeticExpressionPlusContext(new Arithmetic_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_expression);
						setState(140);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(141);
						match(PLUS);
						setState(142);
						arithmetic_expression(6);
						}
						break;
					case 5:
						{
						_localctx = new ArithmeticExpressionMinusContext(new Arithmetic_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_arithmetic_expression);
						setState(143);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(144);
						match(MINUS);
						setState(145);
						arithmetic_expression(5);
						}
						break;
					}
					} 
				}
				setState(150);
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
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
				_localctx = new LogicalConstContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
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
				setState(152);
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
		public Number_atomContext number_atom() {
			return getRuleContext(Number_atomContext.class,0);
		}
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
		try {
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT:
			case INT:
				_localctx = new NumericConstContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				number_atom();
				}
				break;
			case IDENTIFIER:
				_localctx = new NumbericVariableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(TYPE);
			setState(160);
			match(IDENTIFIER);
			setState(161);
			match(T__0);
			setState(162);
			expression();
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(T__1);
			setState(165);
			expression();
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpressionLogicalContext extends ExpressionContext {
		public Logical_expressionContext logical_expression() {
			return getRuleContext(Logical_expressionContext.class,0);
		}
		public ExpressionLogicalContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).enterExpressionLogical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).exitExpressionLogical(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LemonVisitor ) return ((LemonVisitor<? extends T>)visitor).visitExpressionLogical(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionArithmeticContext extends ExpressionContext {
		public Arithmetic_expressionContext arithmetic_expression() {
			return getRuleContext(Arithmetic_expressionContext.class,0);
		}
		public ExpressionArithmeticContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).enterExpressionArithmetic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).exitExpressionArithmetic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LemonVisitor ) return ((LemonVisitor<? extends T>)visitor).visitExpressionArithmetic(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionAtomContext extends ExpressionContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public ExpressionAtomContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).enterExpressionAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).exitExpressionAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LemonVisitor ) return ((LemonVisitor<? extends T>)visitor).visitExpressionAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expression);
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new ExpressionArithmeticContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				arithmetic_expression(0);
				}
				break;
			case 2:
				_localctx = new ExpressionLogicalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				logical_expression(0);
				}
				break;
			case 3:
				_localctx = new ExpressionAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(169);
				atom();
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

	public static class Number_atomContext extends ParserRuleContext {
		public Number_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number_atom; }
	 
		public Number_atomContext() { }
		public void copyFrom(Number_atomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FloatAtomContext extends Number_atomContext {
		public TerminalNode FLOAT() { return getToken(LemonParser.FLOAT, 0); }
		public FloatAtomContext(Number_atomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).enterFloatAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).exitFloatAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LemonVisitor ) return ((LemonVisitor<? extends T>)visitor).visitFloatAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntAtomContext extends Number_atomContext {
		public TerminalNode INT() { return getToken(LemonParser.INT, 0); }
		public IntAtomContext(Number_atomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).enterIntAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).exitIntAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LemonVisitor ) return ((LemonVisitor<? extends T>)visitor).visitIntAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Number_atomContext number_atom() throws RecognitionException {
		Number_atomContext _localctx = new Number_atomContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_number_atom);
		try {
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new IntAtomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(INT);
				}
				break;
			case FLOAT:
				_localctx = new FloatAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				match(FLOAT);
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

	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumberAtomContext extends AtomContext {
		public Number_atomContext number_atom() {
			return getRuleContext(Number_atomContext.class,0);
		}
		public NumberAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).enterNumberAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).exitNumberAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LemonVisitor ) return ((LemonVisitor<? extends T>)visitor).visitNumberAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringAtomContext extends AtomContext {
		public TerminalNode STR() { return getToken(LemonParser.STR, 0); }
		public StringAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).enterStringAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).exitStringAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LemonVisitor ) return ((LemonVisitor<? extends T>)visitor).visitStringAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NulAtomContext extends AtomContext {
		public TerminalNode NUL() { return getToken(LemonParser.NUL, 0); }
		public NulAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).enterNulAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).exitNulAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LemonVisitor ) return ((LemonVisitor<? extends T>)visitor).visitNulAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenExpressionContext extends AtomContext {
		public TerminalNode LPAREN() { return getToken(LemonParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LemonParser.RPAREN, 0); }
		public ParenExpressionContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).enterParenExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).exitParenExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LemonVisitor ) return ((LemonVisitor<? extends T>)visitor).visitParenExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanAtomContext extends AtomContext {
		public TerminalNode TRUE() { return getToken(LemonParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(LemonParser.FALSE, 0); }
		public BooleanAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).enterBooleanAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).exitBooleanAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LemonVisitor ) return ((LemonVisitor<? extends T>)visitor).visitBooleanAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierAtomContext extends AtomContext {
		public TerminalNode IDENTIFIER() { return getToken(LemonParser.IDENTIFIER, 0); }
		public IdentifierAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).enterIdentifierAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LemonListener ) ((LemonListener)listener).exitIdentifierAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LemonVisitor ) return ((LemonVisitor<? extends T>)visitor).visitIdentifierAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_atom);
		int _la;
		try {
			setState(185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				_localctx = new ParenExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				match(LPAREN);
				setState(177);
				expression();
				setState(178);
				match(RPAREN);
				}
				break;
			case FLOAT:
			case INT:
				_localctx = new NumberAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				number_atom();
				}
				break;
			case TRUE:
			case FALSE:
				_localctx = new BooleanAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(181);
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
				_localctx = new IdentifierAtomContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(182);
				match(IDENTIFIER);
				}
				break;
			case STR:
				_localctx = new StringAtomContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(183);
				match(STR);
				}
				break;
			case NUL:
				_localctx = new NulAtomContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(184);
				match(NUL);
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
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		case 6:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u00be\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\7\2*\n\2\f\2\16\2-\13\2\3\2\3\2\3\3\3\3\3\3\5"+
		"\3\64\n\3\3\3\5\3\67\n\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4?\n\4\f\4\16\4B\13"+
		"\4\3\4\5\4E\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\b\7\bU\n\b\f\b\16\bX\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\ta\n\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\7\ti\n\t\f\t\16\tl\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\5\nv\n\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0084"+
		"\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0095"+
		"\n\r\f\r\16\r\u0098\13\r\3\16\3\16\5\16\u009c\n\16\3\17\3\17\5\17\u00a0"+
		"\n\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\5\22\u00ad"+
		"\n\22\3\23\3\23\5\23\u00b1\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\5\24\u00bc\n\24\3\24\2\4\20\30\25\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&\2\4\3\2\21\26\3\2\n\13\2\u00c7\2+\3\2\2\2\4\63\3\2\2\2"+
		"\68\3\2\2\2\bF\3\2\2\2\nL\3\2\2\2\fQ\3\2\2\2\16V\3\2\2\2\20`\3\2\2\2\22"+
		"u\3\2\2\2\24w\3\2\2\2\26y\3\2\2\2\30\u0083\3\2\2\2\32\u009b\3\2\2\2\34"+
		"\u009f\3\2\2\2\36\u00a1\3\2\2\2 \u00a6\3\2\2\2\"\u00ac\3\2\2\2$\u00b0"+
		"\3\2\2\2&\u00bb\3\2\2\2(*\5\4\3\2)(\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2"+
		"\2\2,.\3\2\2\2-+\3\2\2\2./\7\2\2\3/\3\3\2\2\2\60\64\5\36\20\2\61\64\5"+
		" \21\2\62\64\5\6\4\2\63\60\3\2\2\2\63\61\3\2\2\2\63\62\3\2\2\2\64\66\3"+
		"\2\2\2\65\67\7!\2\2\66\65\3\2\2\2\66\67\3\2\2\2\67\5\3\2\2\289\7\5\2\2"+
		"9:\5\f\7\2:;\7\37\2\2;<\5\16\b\2<@\7 \2\2=?\5\b\5\2>=\3\2\2\2?B\3\2\2"+
		"\2@>\3\2\2\2@A\3\2\2\2AD\3\2\2\2B@\3\2\2\2CE\5\n\6\2DC\3\2\2\2DE\3\2\2"+
		"\2E\7\3\2\2\2FG\7\6\2\2GH\5\f\7\2HI\7\37\2\2IJ\5\16\b\2JK\7 \2\2K\t\3"+
		"\2\2\2LM\7\7\2\2MN\7\37\2\2NO\5\16\b\2OP\7 \2\2P\13\3\2\2\2QR\5\20\t\2"+
		"R\r\3\2\2\2SU\5\4\3\2TS\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\17\3\2"+
		"\2\2XV\3\2\2\2YZ\b\t\1\2Za\5\22\n\2[\\\7\35\2\2\\]\5\20\t\2]^\7\36\2\2"+
		"^a\3\2\2\2_a\5\32\16\2`Y\3\2\2\2`[\3\2\2\2`_\3\2\2\2aj\3\2\2\2bc\f\7\2"+
		"\2cd\7\b\2\2di\5\20\t\bef\f\6\2\2fg\7\t\2\2gi\5\20\t\7hb\3\2\2\2he\3\2"+
		"\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\21\3\2\2\2lj\3\2\2\2mn\5\24\13\2n"+
		"o\5\26\f\2op\5\24\13\2pv\3\2\2\2qr\7\35\2\2rs\5\22\n\2st\7\36\2\2tv\3"+
		"\2\2\2um\3\2\2\2uq\3\2\2\2v\23\3\2\2\2wx\5\30\r\2x\25\3\2\2\2yz\t\2\2"+
		"\2z\27\3\2\2\2{|\b\r\1\2|}\7\20\2\2}\u0084\5\30\r\5~\177\7\35\2\2\177"+
		"\u0080\5\30\r\2\u0080\u0081\7\36\2\2\u0081\u0084\3\2\2\2\u0082\u0084\5"+
		"\34\17\2\u0083{\3\2\2\2\u0083~\3\2\2\2\u0083\u0082\3\2\2\2\u0084\u0096"+
		"\3\2\2\2\u0085\u0086\f\n\2\2\u0086\u0087\7\f\2\2\u0087\u0095\5\30\r\13"+
		"\u0088\u0089\f\t\2\2\u0089\u008a\7\r\2\2\u008a\u0095\5\30\r\n\u008b\u008c"+
		"\f\b\2\2\u008c\u008d\7\16\2\2\u008d\u0095\5\30\r\t\u008e\u008f\f\7\2\2"+
		"\u008f\u0090\7\17\2\2\u0090\u0095\5\30\r\b\u0091\u0092\f\6\2\2\u0092\u0093"+
		"\7\20\2\2\u0093\u0095\5\30\r\7\u0094\u0085\3\2\2\2\u0094\u0088\3\2\2\2"+
		"\u0094\u008b\3\2\2\2\u0094\u008e\3\2\2\2\u0094\u0091\3\2\2\2\u0095\u0098"+
		"\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\31\3\2\2\2\u0098"+
		"\u0096\3\2\2\2\u0099\u009c\t\3\2\2\u009a\u009c\7\34\2\2\u009b\u0099\3"+
		"\2\2\2\u009b\u009a\3\2\2\2\u009c\33\3\2\2\2\u009d\u00a0\5$\23\2\u009e"+
		"\u00a0\7\34\2\2\u009f\u009d\3\2\2\2\u009f\u009e\3\2\2\2\u00a0\35\3\2\2"+
		"\2\u00a1\u00a2\7\33\2\2\u00a2\u00a3\7\34\2\2\u00a3\u00a4\7\3\2\2\u00a4"+
		"\u00a5\5\"\22\2\u00a5\37\3\2\2\2\u00a6\u00a7\7\4\2\2\u00a7\u00a8\5\"\22"+
		"\2\u00a8!\3\2\2\2\u00a9\u00ad\5\30\r\2\u00aa\u00ad\5\20\t\2\u00ab\u00ad"+
		"\5&\24\2\u00ac\u00a9\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ab\3\2\2\2\u00ad"+
		"#\3\2\2\2\u00ae\u00b1\7\30\2\2\u00af\u00b1\7\27\2\2\u00b0\u00ae\3\2\2"+
		"\2\u00b0\u00af\3\2\2\2\u00b1%\3\2\2\2\u00b2\u00b3\7\35\2\2\u00b3\u00b4"+
		"\5\"\22\2\u00b4\u00b5\7\36\2\2\u00b5\u00bc\3\2\2\2\u00b6\u00bc\5$\23\2"+
		"\u00b7\u00bc\t\3\2\2\u00b8\u00bc\7\34\2\2\u00b9\u00bc\7\31\2\2\u00ba\u00bc"+
		"\7\32\2\2\u00bb\u00b2\3\2\2\2\u00bb\u00b6\3\2\2\2\u00bb\u00b7\3\2\2\2"+
		"\u00bb\u00b8\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00ba\3\2\2\2\u00bc\'\3"+
		"\2\2\2\24+\63\66@DV`hju\u0083\u0094\u0096\u009b\u009f\u00ac\u00b0\u00bb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}