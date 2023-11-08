// Generated from C:/Users/64272/Downloads/Start_TextGameEngine/TextGameEngine/src/GameMap.g4 by ANTLR 4.13.1
package gamemap_grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GameMapParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GameMapVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GameMapParser#gamemap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGamemap(GameMapParser.GamemapContext ctx);
	/**
	 * Visit a parse tree produced by {@link GameMapParser#room}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoom(GameMapParser.RoomContext ctx);
	/**
	 * Visit a parse tree produced by {@link GameMapParser#connections}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConnections(GameMapParser.ConnectionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GameMapParser#connection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConnection(GameMapParser.ConnectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GameMapParser#pickupContents}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPickupContents(GameMapParser.PickupContentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GameMapParser#pickupList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPickupList(GameMapParser.PickupListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GameMapParser#openableContents}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenableContents(GameMapParser.OpenableContentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GameMapParser#monsters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMonsters(GameMapParser.MonstersContext ctx);
	/**
	 * Visit a parse tree produced by {@link GameMapParser#roomType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoomType(GameMapParser.RoomTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GameMapParser#monsterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMonsterList(GameMapParser.MonsterListContext ctx);
}