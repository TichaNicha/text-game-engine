package playercommand_grammar;

import gameplay.World;
import org.antlr.v4.runtime.tree.ErrorNode;


public class MyCommandVisitor extends PlayerCommandBaseVisitor<String> {
    private World world; // Reference to the World class

    public MyCommandVisitor(World world) {
        this.world = world;
    }

    // Define similar visit methods for other commands as you did

    // Handle invalid commands
    @Override
    public String visitErrorNode(ErrorNode node) {
        System.out.println("Invalid command. Please enter a valid command.");
        return null;
    }

    @Override
    public String visitPickupCommand(PlayerCommandParser.PickupCommandContext ctx) {
        String item = ctx.WORD().getText();
        world.pickup(item);
        return null;
    }

    @Override
    public String visitAdmireCommand(PlayerCommandParser.AdmireCommandContext ctx) {
        String item = ctx.WORD().getText();
        world.admire(item);
        return null;
    }

    @Override
    public String visitEatCommand(PlayerCommandParser.EatCommandContext ctx) {
        String food = ctx.WORD().getText();
        world.eat(food);
        return null;
    }

    @Override
    public String visitWieldCommand(PlayerCommandParser.WieldCommandContext ctx) {
        String weapon = ctx.WORD().getText();
        world.wield(weapon);
        return null;
    }

    @Override
    public String visitOpenCommand(PlayerCommandParser.OpenCommandContext ctx) {
        String chest = ctx.WORD().getText();
        world.open(chest);
        return null;
    }

    @Override
    public String visitDoorCommand(PlayerCommandParser.DoorCommandContext ctx) {
        int doorNumber = Integer.parseInt(ctx.WORD().getText());
        world.openDoor(doorNumber);
        return null;
    }

    @Override
    public String visitExitCommand(PlayerCommandParser.ExitCommandContext ctx) {
        world.searchExit();
        return null;
    }

    @Override
    public String visitDescribeCommand(PlayerCommandParser.DescribeCommandContext ctx) {
        world.describeRoom();
        return null;
    }

    @Override
    public String visitStatsCommand(PlayerCommandParser.StatsCommandContext ctx) {
        world.displayStats();
        return null;
    }

    @Override
    public String visitHelpCommand(PlayerCommandParser.HelpCommandContext ctx) {
        world.displayHelp();
        return null;
    }

    // Handle invalid commands
    @Override
    public String visitCommand(PlayerCommandParser.CommandContext ctx) {
        return visitChildren(ctx); // Handle the valid commands
    }
}
