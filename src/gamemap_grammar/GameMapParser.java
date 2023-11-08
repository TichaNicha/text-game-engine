// Generated from C:/Users/64272/Downloads/Start_TextGameEngine/TextGameEngine/src/GameMap.g4 by ANTLR 4.13.1
package gamemap_grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GameMapParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, OPENABLE_TYPE=8, 
		ID=9, PICKUP=10, WIELDABLE=11, CONSUMABLE=12, VALUABLE=13, FOOD=14, OPENER=15, 
		MONSTER=16, ROOMTYPE=17, WS=18, COMMENT=19, ERR=20, NEWLINE=21;
	public static final int
		RULE_gamemap = 0, RULE_room = 1, RULE_connections = 2, RULE_connection = 3, 
		RULE_pickupContents = 4, RULE_pickupList = 5, RULE_openableContents = 6, 
		RULE_monsters = 7, RULE_roomType = 8, RULE_monsterList = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"gamemap", "room", "connections", "connection", "pickupContents", "pickupList", 
			"openableContents", "monsters", "roomType", "monsterList"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'room'", "'connects'", "'to'", "','", "'contains'", "'with'", 
			"'is'", null, null, null, null, null, null, null, null, null, "'exit'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "OPENABLE_TYPE", "ID", 
			"PICKUP", "WIELDABLE", "CONSUMABLE", "VALUABLE", "FOOD", "OPENER", "MONSTER", 
			"ROOMTYPE", "WS", "COMMENT", "ERR", "NEWLINE"
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
	public String getGrammarFileName() { return "GameMap.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GameMapParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GamemapContext extends ParserRuleContext {
		public ConnectionsContext connections() {
			return getRuleContext(ConnectionsContext.class,0);
		}
		public List<RoomContext> room() {
			return getRuleContexts(RoomContext.class);
		}
		public RoomContext room(int i) {
			return getRuleContext(RoomContext.class,i);
		}
		public GamemapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gamemap; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterGamemap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitGamemap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitGamemap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GamemapContext gamemap() throws RecognitionException {
		GamemapContext _localctx = new GamemapContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_gamemap);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(20);
					room();
					}
					} 
				}
				setState(25);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(26);
			connections();
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
	public static class RoomContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GameMapParser.ID, 0); }
		public PickupContentsContext pickupContents() {
			return getRuleContext(PickupContentsContext.class,0);
		}
		public OpenableContentsContext openableContents() {
			return getRuleContext(OpenableContentsContext.class,0);
		}
		public MonstersContext monsters() {
			return getRuleContext(MonstersContext.class,0);
		}
		public RoomTypeContext roomType() {
			return getRuleContext(RoomTypeContext.class,0);
		}
		public RoomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_room; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterRoom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitRoom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitRoom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoomContext room() throws RecognitionException {
		RoomContext _localctx = new RoomContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_room);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(T__0);
			setState(29);
			match(ID);
			setState(31);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(30);
				pickupContents();
				}
				break;
			}
			setState(34);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(33);
				openableContents();
				}
				break;
			}
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(36);
				monsters();
				}
			}

			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(39);
				roomType();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConnectionsContext extends ParserRuleContext {
		public List<ConnectionContext> connection() {
			return getRuleContexts(ConnectionContext.class);
		}
		public ConnectionContext connection(int i) {
			return getRuleContext(ConnectionContext.class,i);
		}
		public ConnectionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_connections; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterConnections(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitConnections(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitConnections(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConnectionsContext connections() throws RecognitionException {
		ConnectionsContext _localctx = new ConnectionsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_connections);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(42);
				connection();
				}
				}
				setState(45); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConnectionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(GameMapParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GameMapParser.ID, i);
		}
		public ConnectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_connection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterConnection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitConnection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitConnection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConnectionContext connection() throws RecognitionException {
		ConnectionContext _localctx = new ConnectionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_connection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(T__0);
			setState(48);
			match(ID);
			setState(49);
			match(T__1);
			setState(50);
			match(T__2);
			setState(51);
			match(ID);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(52);
				match(T__3);
				setState(53);
				match(ID);
				}
				}
				setState(58);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PickupContentsContext extends ParserRuleContext {
		public PickupListContext pickupList() {
			return getRuleContext(PickupListContext.class,0);
		}
		public PickupContentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pickupContents; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterPickupContents(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitPickupContents(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitPickupContents(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PickupContentsContext pickupContents() throws RecognitionException {
		PickupContentsContext _localctx = new PickupContentsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_pickupContents);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(T__4);
			setState(60);
			pickupList();
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
	public static class PickupListContext extends ParserRuleContext {
		public List<TerminalNode> PICKUP() { return getTokens(GameMapParser.PICKUP); }
		public TerminalNode PICKUP(int i) {
			return getToken(GameMapParser.PICKUP, i);
		}
		public PickupListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pickupList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterPickupList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitPickupList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitPickupList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PickupListContext pickupList() throws RecognitionException {
		PickupListContext _localctx = new PickupListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_pickupList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(PICKUP);
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(63);
				match(T__3);
				setState(64);
				match(PICKUP);
				}
				}
				setState(69);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OpenableContentsContext extends ParserRuleContext {
		public TerminalNode OPENABLE_TYPE() { return getToken(GameMapParser.OPENABLE_TYPE, 0); }
		public PickupListContext pickupList() {
			return getRuleContext(PickupListContext.class,0);
		}
		public OpenableContentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openableContents; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterOpenableContents(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitOpenableContents(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitOpenableContents(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpenableContentsContext openableContents() throws RecognitionException {
		OpenableContentsContext _localctx = new OpenableContentsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_openableContents);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(T__4);
			setState(71);
			match(OPENABLE_TYPE);
			setState(72);
			match(T__5);
			setState(73);
			pickupList();
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
	public static class MonstersContext extends ParserRuleContext {
		public MonsterListContext monsterList() {
			return getRuleContext(MonsterListContext.class,0);
		}
		public MonstersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_monsters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterMonsters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitMonsters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitMonsters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MonstersContext monsters() throws RecognitionException {
		MonstersContext _localctx = new MonstersContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_monsters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(T__4);
			setState(76);
			monsterList();
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
	public static class RoomTypeContext extends ParserRuleContext {
		public TerminalNode ROOMTYPE() { return getToken(GameMapParser.ROOMTYPE, 0); }
		public RoomTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_roomType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterRoomType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitRoomType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitRoomType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoomTypeContext roomType() throws RecognitionException {
		RoomTypeContext _localctx = new RoomTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_roomType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(T__6);
			setState(79);
			match(ROOMTYPE);
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
	public static class MonsterListContext extends ParserRuleContext {
		public List<TerminalNode> MONSTER() { return getTokens(GameMapParser.MONSTER); }
		public TerminalNode MONSTER(int i) {
			return getToken(GameMapParser.MONSTER, i);
		}
		public MonsterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_monsterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterMonsterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitMonsterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitMonsterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MonsterListContext monsterList() throws RecognitionException {
		MonsterListContext _localctx = new MonsterListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_monsterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(MONSTER);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(82);
				match(T__3);
				setState(83);
				match(MONSTER);
				}
				}
				setState(88);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0015Z\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0005\u0000\u0016\b\u0000\n\u0000"+
		"\f\u0000\u0019\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001 \b\u0001\u0001\u0001\u0003\u0001#\b\u0001\u0001"+
		"\u0001\u0003\u0001&\b\u0001\u0001\u0001\u0003\u0001)\b\u0001\u0001\u0002"+
		"\u0004\u0002,\b\u0002\u000b\u0002\f\u0002-\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u00037\b"+
		"\u0003\n\u0003\f\u0003:\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005B\b\u0005\n\u0005\f\u0005E\t"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t"+
		"\u0001\t\u0005\tU\b\t\n\t\f\tX\t\t\u0001\t\u0000\u0000\n\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0000\u0000X\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0002\u001c\u0001\u0000\u0000\u0000\u0004+\u0001\u0000\u0000\u0000"+
		"\u0006/\u0001\u0000\u0000\u0000\b;\u0001\u0000\u0000\u0000\n>\u0001\u0000"+
		"\u0000\u0000\fF\u0001\u0000\u0000\u0000\u000eK\u0001\u0000\u0000\u0000"+
		"\u0010N\u0001\u0000\u0000\u0000\u0012Q\u0001\u0000\u0000\u0000\u0014\u0016"+
		"\u0003\u0002\u0001\u0000\u0015\u0014\u0001\u0000\u0000\u0000\u0016\u0019"+
		"\u0001\u0000\u0000\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0017\u0018"+
		"\u0001\u0000\u0000\u0000\u0018\u001a\u0001\u0000\u0000\u0000\u0019\u0017"+
		"\u0001\u0000\u0000\u0000\u001a\u001b\u0003\u0004\u0002\u0000\u001b\u0001"+
		"\u0001\u0000\u0000\u0000\u001c\u001d\u0005\u0001\u0000\u0000\u001d\u001f"+
		"\u0005\t\u0000\u0000\u001e \u0003\b\u0004\u0000\u001f\u001e\u0001\u0000"+
		"\u0000\u0000\u001f \u0001\u0000\u0000\u0000 \"\u0001\u0000\u0000\u0000"+
		"!#\u0003\f\u0006\u0000\"!\u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000"+
		"\u0000#%\u0001\u0000\u0000\u0000$&\u0003\u000e\u0007\u0000%$\u0001\u0000"+
		"\u0000\u0000%&\u0001\u0000\u0000\u0000&(\u0001\u0000\u0000\u0000\')\u0003"+
		"\u0010\b\u0000(\'\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000)\u0003"+
		"\u0001\u0000\u0000\u0000*,\u0003\u0006\u0003\u0000+*\u0001\u0000\u0000"+
		"\u0000,-\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000-.\u0001\u0000"+
		"\u0000\u0000.\u0005\u0001\u0000\u0000\u0000/0\u0005\u0001\u0000\u0000"+
		"01\u0005\t\u0000\u000012\u0005\u0002\u0000\u000023\u0005\u0003\u0000\u0000"+
		"38\u0005\t\u0000\u000045\u0005\u0004\u0000\u000057\u0005\t\u0000\u0000"+
		"64\u0001\u0000\u0000\u00007:\u0001\u0000\u0000\u000086\u0001\u0000\u0000"+
		"\u000089\u0001\u0000\u0000\u00009\u0007\u0001\u0000\u0000\u0000:8\u0001"+
		"\u0000\u0000\u0000;<\u0005\u0005\u0000\u0000<=\u0003\n\u0005\u0000=\t"+
		"\u0001\u0000\u0000\u0000>C\u0005\n\u0000\u0000?@\u0005\u0004\u0000\u0000"+
		"@B\u0005\n\u0000\u0000A?\u0001\u0000\u0000\u0000BE\u0001\u0000\u0000\u0000"+
		"CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000D\u000b\u0001\u0000"+
		"\u0000\u0000EC\u0001\u0000\u0000\u0000FG\u0005\u0005\u0000\u0000GH\u0005"+
		"\b\u0000\u0000HI\u0005\u0006\u0000\u0000IJ\u0003\n\u0005\u0000J\r\u0001"+
		"\u0000\u0000\u0000KL\u0005\u0005\u0000\u0000LM\u0003\u0012\t\u0000M\u000f"+
		"\u0001\u0000\u0000\u0000NO\u0005\u0007\u0000\u0000OP\u0005\u0011\u0000"+
		"\u0000P\u0011\u0001\u0000\u0000\u0000QV\u0005\u0010\u0000\u0000RS\u0005"+
		"\u0004\u0000\u0000SU\u0005\u0010\u0000\u0000TR\u0001\u0000\u0000\u0000"+
		"UX\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000"+
		"\u0000W\u0013\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000\t\u0017"+
		"\u001f\"%(-8CV";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}