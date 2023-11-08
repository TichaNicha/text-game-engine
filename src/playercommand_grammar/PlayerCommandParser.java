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
		T__9=10, T__10=11, WORD=12, WS=13, NEWLINE=14;
	public static final int
		RULE_start = 0, RULE_command = 1, RULE_exploreCommand = 2, RULE_battleCommand = 3, 
		RULE_commonCommands = 4, RULE_pickupCommand = 5, RULE_admireCommand = 6, 
		RULE_eatCommand = 7, RULE_wieldCommand = 8, RULE_openCommand = 9, RULE_doorCommand = 10, 
		RULE_exitCommand = 11, RULE_describeCommand = 12, RULE_statsCommand = 13, 
		RULE_helpCommand = 14, RULE_attackCommand = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "command", "exploreCommand", "battleCommand", "commonCommands", 
			"pickupCommand", "admireCommand", "eatCommand", "wieldCommand", "openCommand", 
			"doorCommand", "exitCommand", "describeCommand", "statsCommand", "helpCommand", 
			"attackCommand"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'pickup'", "'admire'", "'eat'", "'wield'", "'open'", "'door'", 
			"'exit'", "'describe'", "'stats'", "'help'", "'attack'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"WORD", "WS", "NEWLINE"
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
			setState(32);
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
			setState(36);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				exploreCommand();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				battleCommand();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExploreCommandContext extends ParserRuleContext {
		public CommonCommandsContext commonCommands() {
			return getRuleContext(CommonCommandsContext.class,0);
		}
		public DescribeCommandContext describeCommand() {
			return getRuleContext(DescribeCommandContext.class,0);
		}
		public StatsCommandContext statsCommand() {
			return getRuleContext(StatsCommandContext.class,0);
		}
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
		enterRule(_localctx, 4, RULE_exploreCommand);
		try {
			setState(48);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				commonCommands();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				describeCommand();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				statsCommand();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(41);
				pickupCommand();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(42);
				admireCommand();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(43);
				eatCommand();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(44);
				wieldCommand();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(45);
				openCommand();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(46);
				doorCommand();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(47);
				exitCommand();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BattleCommandContext extends ParserRuleContext {
		public CommonCommandsContext commonCommands() {
			return getRuleContext(CommonCommandsContext.class,0);
		}
		public AttackCommandContext attackCommand() {
			return getRuleContext(AttackCommandContext.class,0);
		}
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
		enterRule(_localctx, 6, RULE_battleCommand);
		try {
			setState(52);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				commonCommands();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				attackCommand();
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
	public static class CommonCommandsContext extends ParserRuleContext {
		public HelpCommandContext helpCommand() {
			return getRuleContext(HelpCommandContext.class,0);
		}
		public WieldCommandContext wieldCommand() {
			return getRuleContext(WieldCommandContext.class,0);
		}
		public CommonCommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commonCommands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).enterCommonCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).exitCommonCommands(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayerCommandVisitor ) return ((PlayerCommandVisitor<? extends T>)visitor).visitCommonCommands(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommonCommandsContext commonCommands() throws RecognitionException {
		CommonCommandsContext _localctx = new CommonCommandsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_commonCommands);
		try {
			setState(56);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				helpCommand();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				wieldCommand();
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
		enterRule(_localctx, 10, RULE_pickupCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(T__0);
			setState(59);
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
		enterRule(_localctx, 12, RULE_admireCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(T__1);
			setState(62);
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
		enterRule(_localctx, 14, RULE_eatCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(T__2);
			setState(65);
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
		enterRule(_localctx, 16, RULE_wieldCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(T__3);
			setState(68);
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
		enterRule(_localctx, 18, RULE_openCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(T__4);
			setState(71);
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
		enterRule(_localctx, 20, RULE_doorCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(T__5);
			setState(74);
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
		enterRule(_localctx, 22, RULE_exitCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(T__6);
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
		enterRule(_localctx, 24, RULE_describeCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
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
		enterRule(_localctx, 26, RULE_statsCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
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
		enterRule(_localctx, 28, RULE_helpCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
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
	public static class AttackCommandContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(PlayerCommandParser.WORD, 0); }
		public AttackCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attackCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).enterAttackCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).exitAttackCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayerCommandVisitor ) return ((PlayerCommandVisitor<? extends T>)visitor).visitAttackCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttackCommandContext attackCommand() throws RecognitionException {
		AttackCommandContext _localctx = new AttackCommandContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_attackCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(T__10);
			setState(85);
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

	public static final String _serializedATN =
		"\u0004\u0001\u000eX\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u0001%\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u00021\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0003\u00035\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0003\u00049\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0000\u0000\u0010\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		"\u0000\u0000S\u0000 \u0001\u0000\u0000\u0000\u0002$\u0001\u0000\u0000"+
		"\u0000\u00040\u0001\u0000\u0000\u0000\u00064\u0001\u0000\u0000\u0000\b"+
		"8\u0001\u0000\u0000\u0000\n:\u0001\u0000\u0000\u0000\f=\u0001\u0000\u0000"+
		"\u0000\u000e@\u0001\u0000\u0000\u0000\u0010C\u0001\u0000\u0000\u0000\u0012"+
		"F\u0001\u0000\u0000\u0000\u0014I\u0001\u0000\u0000\u0000\u0016L\u0001"+
		"\u0000\u0000\u0000\u0018N\u0001\u0000\u0000\u0000\u001aP\u0001\u0000\u0000"+
		"\u0000\u001cR\u0001\u0000\u0000\u0000\u001eT\u0001\u0000\u0000\u0000 "+
		"!\u0003\u0002\u0001\u0000!\u0001\u0001\u0000\u0000\u0000\"%\u0003\u0004"+
		"\u0002\u0000#%\u0003\u0006\u0003\u0000$\"\u0001\u0000\u0000\u0000$#\u0001"+
		"\u0000\u0000\u0000%\u0003\u0001\u0000\u0000\u0000&1\u0003\b\u0004\u0000"+
		"\'1\u0003\u0018\f\u0000(1\u0003\u001a\r\u0000)1\u0003\n\u0005\u0000*1"+
		"\u0003\f\u0006\u0000+1\u0003\u000e\u0007\u0000,1\u0003\u0010\b\u0000-"+
		"1\u0003\u0012\t\u0000.1\u0003\u0014\n\u0000/1\u0003\u0016\u000b\u0000"+
		"0&\u0001\u0000\u0000\u00000\'\u0001\u0000\u0000\u00000(\u0001\u0000\u0000"+
		"\u00000)\u0001\u0000\u0000\u00000*\u0001\u0000\u0000\u00000+\u0001\u0000"+
		"\u0000\u00000,\u0001\u0000\u0000\u00000-\u0001\u0000\u0000\u00000.\u0001"+
		"\u0000\u0000\u00000/\u0001\u0000\u0000\u00001\u0005\u0001\u0000\u0000"+
		"\u000025\u0003\b\u0004\u000035\u0003\u001e\u000f\u000042\u0001\u0000\u0000"+
		"\u000043\u0001\u0000\u0000\u00005\u0007\u0001\u0000\u0000\u000069\u0003"+
		"\u001c\u000e\u000079\u0003\u0010\b\u000086\u0001\u0000\u0000\u000087\u0001"+
		"\u0000\u0000\u00009\t\u0001\u0000\u0000\u0000:;\u0005\u0001\u0000\u0000"+
		";<\u0005\f\u0000\u0000<\u000b\u0001\u0000\u0000\u0000=>\u0005\u0002\u0000"+
		"\u0000>?\u0005\f\u0000\u0000?\r\u0001\u0000\u0000\u0000@A\u0005\u0003"+
		"\u0000\u0000AB\u0005\f\u0000\u0000B\u000f\u0001\u0000\u0000\u0000CD\u0005"+
		"\u0004\u0000\u0000DE\u0005\f\u0000\u0000E\u0011\u0001\u0000\u0000\u0000"+
		"FG\u0005\u0005\u0000\u0000GH\u0005\f\u0000\u0000H\u0013\u0001\u0000\u0000"+
		"\u0000IJ\u0005\u0006\u0000\u0000JK\u0005\f\u0000\u0000K\u0015\u0001\u0000"+
		"\u0000\u0000LM\u0005\u0007\u0000\u0000M\u0017\u0001\u0000\u0000\u0000"+
		"NO\u0005\b\u0000\u0000O\u0019\u0001\u0000\u0000\u0000PQ\u0005\t\u0000"+
		"\u0000Q\u001b\u0001\u0000\u0000\u0000RS\u0005\n\u0000\u0000S\u001d\u0001"+
		"\u0000\u0000\u0000TU\u0005\u000b\u0000\u0000UV\u0005\f\u0000\u0000V\u001f"+
		"\u0001\u0000\u0000\u0000\u0004$048";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}