// Generated from C:/Users/64272/Downloads/Start_TextGameEngine/TextGameEngine/src/PlayerCommand.g4 by ANTLR 4.13.1
package playercommand_grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PlayerCommandParser}.
 */
public interface PlayerCommandListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PlayerCommandParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(PlayerCommandParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayerCommandParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(PlayerCommandParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayerCommandParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(PlayerCommandParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayerCommandParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(PlayerCommandParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayerCommandParser#exploreCommand}.
	 * @param ctx the parse tree
	 */
	void enterExploreCommand(PlayerCommandParser.ExploreCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayerCommandParser#exploreCommand}.
	 * @param ctx the parse tree
	 */
	void exitExploreCommand(PlayerCommandParser.ExploreCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayerCommandParser#battleCommand}.
	 * @param ctx the parse tree
	 */
	void enterBattleCommand(PlayerCommandParser.BattleCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayerCommandParser#battleCommand}.
	 * @param ctx the parse tree
	 */
	void exitBattleCommand(PlayerCommandParser.BattleCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayerCommandParser#commonCommands}.
	 * @param ctx the parse tree
	 */
	void enterCommonCommands(PlayerCommandParser.CommonCommandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayerCommandParser#commonCommands}.
	 * @param ctx the parse tree
	 */
	void exitCommonCommands(PlayerCommandParser.CommonCommandsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayerCommandParser#pickupCommand}.
	 * @param ctx the parse tree
	 */
	void enterPickupCommand(PlayerCommandParser.PickupCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayerCommandParser#pickupCommand}.
	 * @param ctx the parse tree
	 */
	void exitPickupCommand(PlayerCommandParser.PickupCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayerCommandParser#admireCommand}.
	 * @param ctx the parse tree
	 */
	void enterAdmireCommand(PlayerCommandParser.AdmireCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayerCommandParser#admireCommand}.
	 * @param ctx the parse tree
	 */
	void exitAdmireCommand(PlayerCommandParser.AdmireCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayerCommandParser#eatCommand}.
	 * @param ctx the parse tree
	 */
	void enterEatCommand(PlayerCommandParser.EatCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayerCommandParser#eatCommand}.
	 * @param ctx the parse tree
	 */
	void exitEatCommand(PlayerCommandParser.EatCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayerCommandParser#wieldCommand}.
	 * @param ctx the parse tree
	 */
	void enterWieldCommand(PlayerCommandParser.WieldCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayerCommandParser#wieldCommand}.
	 * @param ctx the parse tree
	 */
	void exitWieldCommand(PlayerCommandParser.WieldCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayerCommandParser#openCommand}.
	 * @param ctx the parse tree
	 */
	void enterOpenCommand(PlayerCommandParser.OpenCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayerCommandParser#openCommand}.
	 * @param ctx the parse tree
	 */
	void exitOpenCommand(PlayerCommandParser.OpenCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayerCommandParser#doorCommand}.
	 * @param ctx the parse tree
	 */
	void enterDoorCommand(PlayerCommandParser.DoorCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayerCommandParser#doorCommand}.
	 * @param ctx the parse tree
	 */
	void exitDoorCommand(PlayerCommandParser.DoorCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayerCommandParser#exitCommand}.
	 * @param ctx the parse tree
	 */
	void enterExitCommand(PlayerCommandParser.ExitCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayerCommandParser#exitCommand}.
	 * @param ctx the parse tree
	 */
	void exitExitCommand(PlayerCommandParser.ExitCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayerCommandParser#describeCommand}.
	 * @param ctx the parse tree
	 */
	void enterDescribeCommand(PlayerCommandParser.DescribeCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayerCommandParser#describeCommand}.
	 * @param ctx the parse tree
	 */
	void exitDescribeCommand(PlayerCommandParser.DescribeCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayerCommandParser#statsCommand}.
	 * @param ctx the parse tree
	 */
	void enterStatsCommand(PlayerCommandParser.StatsCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayerCommandParser#statsCommand}.
	 * @param ctx the parse tree
	 */
	void exitStatsCommand(PlayerCommandParser.StatsCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayerCommandParser#helpCommand}.
	 * @param ctx the parse tree
	 */
	void enterHelpCommand(PlayerCommandParser.HelpCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayerCommandParser#helpCommand}.
	 * @param ctx the parse tree
	 */
	void exitHelpCommand(PlayerCommandParser.HelpCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayerCommandParser#talkCommand}.
	 * @param ctx the parse tree
	 */
	void enterTalkCommand(PlayerCommandParser.TalkCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayerCommandParser#talkCommand}.
	 * @param ctx the parse tree
	 */
	void exitTalkCommand(PlayerCommandParser.TalkCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayerCommandParser#attackCommand}.
	 * @param ctx the parse tree
	 */
	void enterAttackCommand(PlayerCommandParser.AttackCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayerCommandParser#attackCommand}.
	 * @param ctx the parse tree
	 */
	void exitAttackCommand(PlayerCommandParser.AttackCommandContext ctx);
}