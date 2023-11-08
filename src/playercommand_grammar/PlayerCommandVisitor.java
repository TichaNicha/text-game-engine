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
	 * Visit a parse tree produced by {@link PlayerCommandParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(PlayerCommandParser.CommandContext ctx);
}