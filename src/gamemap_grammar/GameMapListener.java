// Generated from C:/Users/64272/Downloads/Start_TextGameEngine/TextGameEngine/src/GameMap.g4 by ANTLR 4.13.1
package gamemap_grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GameMapParser}.
 */
public interface GameMapListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GameMapParser#gamemap}.
	 * @param ctx the parse tree
	 */
	void enterGamemap(GameMapParser.GamemapContext ctx);
	/**
	 * Exit a parse tree produced by {@link GameMapParser#gamemap}.
	 * @param ctx the parse tree
	 */
	void exitGamemap(GameMapParser.GamemapContext ctx);
	/**
	 * Enter a parse tree produced by {@link GameMapParser#room}.
	 * @param ctx the parse tree
	 */
	void enterRoom(GameMapParser.RoomContext ctx);
	/**
	 * Exit a parse tree produced by {@link GameMapParser#room}.
	 * @param ctx the parse tree
	 */
	void exitRoom(GameMapParser.RoomContext ctx);
	/**
	 * Enter a parse tree produced by {@link GameMapParser#connections}.
	 * @param ctx the parse tree
	 */
	void enterConnections(GameMapParser.ConnectionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GameMapParser#connections}.
	 * @param ctx the parse tree
	 */
	void exitConnections(GameMapParser.ConnectionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GameMapParser#connection}.
	 * @param ctx the parse tree
	 */
	void enterConnection(GameMapParser.ConnectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GameMapParser#connection}.
	 * @param ctx the parse tree
	 */
	void exitConnection(GameMapParser.ConnectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GameMapParser#contents}.
	 * @param ctx the parse tree
	 */
	void enterContents(GameMapParser.ContentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GameMapParser#contents}.
	 * @param ctx the parse tree
	 */
	void exitContents(GameMapParser.ContentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GameMapParser#pickupContents}.
	 * @param ctx the parse tree
	 */
	void enterPickupContents(GameMapParser.PickupContentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GameMapParser#pickupContents}.
	 * @param ctx the parse tree
	 */
	void exitPickupContents(GameMapParser.PickupContentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GameMapParser#pickupList}.
	 * @param ctx the parse tree
	 */
	void enterPickupList(GameMapParser.PickupListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GameMapParser#pickupList}.
	 * @param ctx the parse tree
	 */
	void exitPickupList(GameMapParser.PickupListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GameMapParser#openableContents}.
	 * @param ctx the parse tree
	 */
	void enterOpenableContents(GameMapParser.OpenableContentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GameMapParser#openableContents}.
	 * @param ctx the parse tree
	 */
	void exitOpenableContents(GameMapParser.OpenableContentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GameMapParser#monsters}.
	 * @param ctx the parse tree
	 */
	void enterMonsters(GameMapParser.MonstersContext ctx);
	/**
	 * Exit a parse tree produced by {@link GameMapParser#monsters}.
	 * @param ctx the parse tree
	 */
	void exitMonsters(GameMapParser.MonstersContext ctx);
	/**
	 * Enter a parse tree produced by {@link GameMapParser#roomType}.
	 * @param ctx the parse tree
	 */
	void enterRoomType(GameMapParser.RoomTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GameMapParser#roomType}.
	 * @param ctx the parse tree
	 */
	void exitRoomType(GameMapParser.RoomTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GameMapParser#monsterList}.
	 * @param ctx the parse tree
	 */
	void enterMonsterList(GameMapParser.MonsterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GameMapParser#monsterList}.
	 * @param ctx the parse tree
	 */
	void exitMonsterList(GameMapParser.MonsterListContext ctx);
}