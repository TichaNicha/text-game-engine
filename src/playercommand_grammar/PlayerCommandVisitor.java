// Generated from C:/Users/64272/Downloads/Start_TextGameEngine/TextGameEngine/src/PlayerCommand.g4 by ANTLR 4.13.1
package playercommand_grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PlayerCommandParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PlayerCommandVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PlayerCommandParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(PlayerCommandParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayerCommandParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(PlayerCommandParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayerCommandParser#exploreCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExploreCommand(PlayerCommandParser.ExploreCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayerCommandParser#battleCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBattleCommand(PlayerCommandParser.BattleCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayerCommandParser#commonCommands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommonCommands(PlayerCommandParser.CommonCommandsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayerCommandParser#pickupCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPickupCommand(PlayerCommandParser.PickupCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayerCommandParser#admireCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdmireCommand(PlayerCommandParser.AdmireCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayerCommandParser#eatCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEatCommand(PlayerCommandParser.EatCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayerCommandParser#wieldCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWieldCommand(PlayerCommandParser.WieldCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayerCommandParser#openCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenCommand(PlayerCommandParser.OpenCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayerCommandParser#doorCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoorCommand(PlayerCommandParser.DoorCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayerCommandParser#exitCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExitCommand(PlayerCommandParser.ExitCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayerCommandParser#describeCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeCommand(PlayerCommandParser.DescribeCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayerCommandParser#statsCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatsCommand(PlayerCommandParser.StatsCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayerCommandParser#helpCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHelpCommand(PlayerCommandParser.HelpCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayerCommandParser#talkCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTalkCommand(PlayerCommandParser.TalkCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayerCommandParser#attackCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttackCommand(PlayerCommandParser.AttackCommandContext ctx);
}