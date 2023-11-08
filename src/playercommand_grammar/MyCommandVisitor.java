package playercommand_grammar;

import gameplay.World;

public class MyCommandVisitor extends PlayerCommandBaseVisitor<String> {
    private World world; // Reference to the World class

    public MyCommandVisitor(World world) {
        this.world = world;
    }

    @Override
    public String visitPickupCommand(PlayerCommandParser.PickupCommandContext ctx) {
        String item = ctx.PICKUP().getText();
        world.pickup(item);
        return null;
    }

    @Override
    public String visitAdmireCommand(PlayerCommandParser.AdmireCommandContext ctx) {
        String item = ctx.PICKUP().getText();
        world.admire(item);
        return null;
    }

    @Override
    public String visitEatCommand(PlayerCommandParser.EatCommandContext ctx) {
        String food = ctx.PICKUP().getText();
        world.eat(food);
        return null;
    }

    @Override
    public String visitWieldCommand(PlayerCommandParser.WieldCommandContext ctx) {
        String weapon = ctx.PICKUP().getText();
        world.wield(weapon);
        return null;
    }

    @Override
    public String visitOpenCommand(PlayerCommandParser.OpenCommandContext ctx) {
        String chest = ctx.PICKUP().getText();
        world.open(chest);
        return null;
    }

    @Override
    public String visitDoorCommand(PlayerCommandParser.DoorCommandContext ctx) {
        int doorNumber = Integer.parseInt(ctx.INT().getText());
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
}
