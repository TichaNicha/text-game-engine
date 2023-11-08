// Generated from C:/Users/64272/Downloads/Start_TextGameEngine/TextGameEngine/src/PlayerCommand.g4 by ANTLR 4.13.1
package playercommand_grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PlayerCommandParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, WORD=12, WS=13, NEWLINE=14, InvalidCommand=15;
	public static final int
		RULE_start = 0, RULE_command = 1, RULE_battleCommand = 2, RULE_exploreCommand = 3, 
		RULE_pickupCommand = 4, RULE_admireCommand = 5, RULE_eatCommand = 6, RULE_wieldCommand = 7, 
		RULE_openCommand = 8, RULE_doorCommand = 9, RULE_exitCommand = 10, RULE_describeCommand = 11, 
		RULE_statsCommand = 12, RULE_helpCommand = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "command", "battleCommand", "exploreCommand", "pickupCommand", 
			"admireCommand", "eatCommand", "wieldCommand", "openCommand", "doorCommand", 
			"exitCommand", "describeCommand", "statsCommand", "helpCommand"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' dd'", "'pickup'", "'admire'", "'eat'", "'wield'", "'open'", 
			"'door'", "'exit'", "'describe'", "'stats'", "'help'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"WORD", "WS", "NEWLINE", "InvalidCommand"
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
	public String getGrammarFileName() { return "PlayerCommand.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PlayerCommandParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayerCommandVisitor ) return ((PlayerCommandVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			command();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CommandContext extends ParserRuleContext {
		public ExploreCommandContext exploreCommand() {
			return getRuleContext(ExploreCommandContext.class,0);
		}
		public BattleCommandContext battleCommand() {
			return getRuleContext(BattleCommandContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).exitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayerCommandVisitor ) return ((PlayerCommandVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_command);
		try {
			setState(32);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				exploreCommand();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				battleCommand();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BattleCommandContext extends ParserRuleContext {
		public BattleCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_battleCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).enterBattleCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).exitBattleCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayerCommandVisitor ) return ((PlayerCommandVisitor<? extends T>)visitor).visitBattleCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BattleCommandContext battleCommand() throws RecognitionException {
		BattleCommandContext _localctx = new BattleCommandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_battleCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExploreCommandContext extends ParserRuleContext {
		public PickupCommandContext pickupCommand() {
			return getRuleContext(PickupCommandContext.class,0);
		}
		public AdmireCommandContext admireCommand() {
			return getRuleContext(AdmireCommandContext.class,0);
		}
		public EatCommandContext eatCommand() {
			return getRuleContext(EatCommandContext.class,0);
		}
		public WieldCommandContext wieldCommand() {
			return getRuleContext(WieldCommandContext.class,0);
		}
		public OpenCommandContext openCommand() {
			return getRuleContext(OpenCommandContext.class,0);
		}
		public DoorCommandContext doorCommand() {
			return getRuleContext(DoorCommandContext.class,0);
		}
		public ExitCommandContext exitCommand() {
			return getRuleContext(ExitCommandContext.class,0);
		}
		public DescribeCommandContext describeCommand() {
			return getRuleContext(DescribeCommandContext.class,0);
		}
		public StatsCommandContext statsCommand() {
			return getRuleContext(StatsCommandContext.class,0);
		}
		public HelpCommandContext helpCommand() {
			return getRuleContext(HelpCommandContext.class,0);
		}
		public ExploreCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exploreCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).enterExploreCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).exitExploreCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayerCommandVisitor ) return ((PlayerCommandVisitor<? extends T>)visitor).visitExploreCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExploreCommandContext exploreCommand() throws RecognitionException {
		ExploreCommandContext _localctx = new ExploreCommandContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_exploreCommand);
		try {
			setState(46);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				pickupCommand();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				admireCommand();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(38);
				eatCommand();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 4);
				{
				setState(39);
				wieldCommand();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 5);
				{
				setState(40);
				openCommand();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 6);
				{
				setState(41);
				doorCommand();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 7);
				{
				setState(42);
				exitCommand();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 8);
				{
				setState(43);
				describeCommand();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 9);
				{
				setState(44);
				statsCommand();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 10);
				{
				setState(45);
				helpCommand();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PickupCommandContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(PlayerCommandParser.WORD, 0); }
		public PickupCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pickupCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).enterPickupCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).exitPickupCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayerCommandVisitor ) return ((PlayerCommandVisitor<? extends T>)visitor).visitPickupCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PickupCommandContext pickupCommand() throws RecognitionException {
		PickupCommandContext _localctx = new PickupCommandContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_pickupCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(T__1);
			setState(49);
			match(WORD);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AdmireCommandContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(PlayerCommandParser.WORD, 0); }
		public AdmireCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_admireCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).enterAdmireCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).exitAdmireCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayerCommandVisitor ) return ((PlayerCommandVisitor<? extends T>)visitor).visitAdmireCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdmireCommandContext admireCommand() throws RecognitionException {
		AdmireCommandContext _localctx = new AdmireCommandContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_admireCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(T__2);
			setState(52);
			match(WORD);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EatCommandContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(PlayerCommandParser.WORD, 0); }
		public EatCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eatCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).enterEatCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).exitEatCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayerCommandVisitor ) return ((PlayerCommandVisitor<? extends T>)visitor).visitEatCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EatCommandContext eatCommand() throws RecognitionException {
		EatCommandContext _localctx = new EatCommandContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_eatCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(T__3);
			setState(55);
			match(WORD);
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

	@SuppressWarnings("CheckReturnValue")
	public static class WieldCommandContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(PlayerCommandParser.WORD, 0); }
		public WieldCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wieldCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).enterWieldCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).exitWieldCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayerCommandVisitor ) return ((PlayerCommandVisitor<? extends T>)visitor).visitWieldCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WieldCommandContext wieldCommand() throws RecognitionException {
		WieldCommandContext _localctx = new WieldCommandContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_wieldCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(T__4);
			setState(58);
			match(WORD);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OpenCommandContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(PlayerCommandParser.WORD, 0); }
		public OpenCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).enterOpenCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).exitOpenCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayerCommandVisitor ) return ((PlayerCommandVisitor<? extends T>)visitor).visitOpenCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpenCommandContext openCommand() throws RecognitionException {
		OpenCommandContext _localctx = new OpenCommandContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_openCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(T__5);
			setState(61);
			match(WORD);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DoorCommandContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(PlayerCommandParser.WORD, 0); }
		public DoorCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doorCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).enterDoorCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).exitDoorCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayerCommandVisitor ) return ((PlayerCommandVisitor<? extends T>)visitor).visitDoorCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoorCommandContext doorCommand() throws RecognitionException {
		DoorCommandContext _localctx = new DoorCommandContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_doorCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(T__6);
			setState(64);
			match(WORD);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExitCommandContext extends ParserRuleContext {
		public ExitCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exitCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).enterExitCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).exitExitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayerCommandVisitor ) return ((PlayerCommandVisitor<? extends T>)visitor).visitExitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExitCommandContext exitCommand() throws RecognitionException {
		ExitCommandContext _localctx = new ExitCommandContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_exitCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(T__7);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DescribeCommandContext extends ParserRuleContext {
		public DescribeCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describeCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).enterDescribeCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).exitDescribeCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayerCommandVisitor ) return ((PlayerCommandVisitor<? extends T>)visitor).visitDescribeCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescribeCommandContext describeCommand() throws RecognitionException {
		DescribeCommandContext _localctx = new DescribeCommandContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_describeCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(T__8);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatsCommandContext extends ParserRuleContext {
		public StatsCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statsCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).enterStatsCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).exitStatsCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayerCommandVisitor ) return ((PlayerCommandVisitor<? extends T>)visitor).visitStatsCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatsCommandContext statsCommand() throws RecognitionException {
		StatsCommandContext _localctx = new StatsCommandContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_statsCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(T__9);
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

	@SuppressWarnings("CheckReturnValue")
	public static class HelpCommandContext extends ParserRuleContext {
		public HelpCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_helpCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).enterHelpCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).exitHelpCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayerCommandVisitor ) return ((PlayerCommandVisitor<? extends T>)visitor).visitHelpCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HelpCommandContext helpCommand() throws RecognitionException {
		HelpCommandContext _localctx = new HelpCommandContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_helpCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
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

	public static final String _serializedATN =
		"\u0004\u0001\u000fK\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0003\u0001!\b\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003/\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0000\u0000\u000e\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u0000\u0000F\u0000"+
		"\u001c\u0001\u0000\u0000\u0000\u0002 \u0001\u0000\u0000\u0000\u0004\""+
		"\u0001\u0000\u0000\u0000\u0006.\u0001\u0000\u0000\u0000\b0\u0001\u0000"+
		"\u0000\u0000\n3\u0001\u0000\u0000\u0000\f6\u0001\u0000\u0000\u0000\u000e"+
		"9\u0001\u0000\u0000\u0000\u0010<\u0001\u0000\u0000\u0000\u0012?\u0001"+
		"\u0000\u0000\u0000\u0014B\u0001\u0000\u0000\u0000\u0016D\u0001\u0000\u0000"+
		"\u0000\u0018F\u0001\u0000\u0000\u0000\u001aH\u0001\u0000\u0000\u0000\u001c"+
		"\u001d\u0003\u0002\u0001\u0000\u001d\u0001\u0001\u0000\u0000\u0000\u001e"+
		"!\u0003\u0006\u0003\u0000\u001f!\u0003\u0004\u0002\u0000 \u001e\u0001"+
		"\u0000\u0000\u0000 \u001f\u0001\u0000\u0000\u0000!\u0003\u0001\u0000\u0000"+
		"\u0000\"#\u0005\u0001\u0000\u0000#\u0005\u0001\u0000\u0000\u0000$/\u0003"+
		"\b\u0004\u0000%/\u0003\n\u0005\u0000&/\u0003\f\u0006\u0000\'/\u0003\u000e"+
		"\u0007\u0000(/\u0003\u0010\b\u0000)/\u0003\u0012\t\u0000*/\u0003\u0014"+
		"\n\u0000+/\u0003\u0016\u000b\u0000,/\u0003\u0018\f\u0000-/\u0003\u001a"+
		"\r\u0000.$\u0001\u0000\u0000\u0000.%\u0001\u0000\u0000\u0000.&\u0001\u0000"+
		"\u0000\u0000.\'\u0001\u0000\u0000\u0000.(\u0001\u0000\u0000\u0000.)\u0001"+
		"\u0000\u0000\u0000.*\u0001\u0000\u0000\u0000.+\u0001\u0000\u0000\u0000"+
		".,\u0001\u0000\u0000\u0000.-\u0001\u0000\u0000\u0000/\u0007\u0001\u0000"+
		"\u0000\u000001\u0005\u0002\u0000\u000012\u0005\f\u0000\u00002\t\u0001"+
		"\u0000\u0000\u000034\u0005\u0003\u0000\u000045\u0005\f\u0000\u00005\u000b"+
		"\u0001\u0000\u0000\u000067\u0005\u0004\u0000\u000078\u0005\f\u0000\u0000"+
		"8\r\u0001\u0000\u0000\u00009:\u0005\u0005\u0000\u0000:;\u0005\f\u0000"+
		"\u0000;\u000f\u0001\u0000\u0000\u0000<=\u0005\u0006\u0000\u0000=>\u0005"+
		"\f\u0000\u0000>\u0011\u0001\u0000\u0000\u0000?@\u0005\u0007\u0000\u0000"+
		"@A\u0005\f\u0000\u0000A\u0013\u0001\u0000\u0000\u0000BC\u0005\b\u0000"+
		"\u0000C\u0015\u0001\u0000\u0000\u0000DE\u0005\t\u0000\u0000E\u0017\u0001"+
		"\u0000\u0000\u0000FG\u0005\n\u0000\u0000G\u0019\u0001\u0000\u0000\u0000"+
		"HI\u0005\u000b\u0000\u0000I\u001b\u0001\u0000\u0000\u0000\u0002 .";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}