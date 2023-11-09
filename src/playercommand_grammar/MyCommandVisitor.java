package playercommand_grammar;

import gameplay.World;
import org.antlr.v4.runtime.tree.ErrorNode;


public class MyCommandVisitor extends PlayerCommandBaseVisitor<String> {
    private World world; // Reference to the World class]
    private boolean errorPrinted = false;

    public MyCommandVisitor(World world) {
        this.world = world;
    }

    // Define similar visit methods for other commands as you did

    // Handle invalid commands
    @Override
    public String visitErrorNode(ErrorNode node) {
        if (!errorPrinted) {
            System.out.println("Invalid command. Please enter a valid command.");
            errorPrinted = true;
        }
        return null;
    }

    @Override
    public String visitPickupCommand(PlayerCommandParser.PickupCommandContext ctx) {
        if (world.isInBattleMode()) {
            System.out.println("You can't use this command when you're in battle!");
        } else {
            String item = ctx.WORD().getText();
            world.pickup(item);
        }
        return null;
    }

    @Override
    public String visitAdmireCommand(PlayerCommandParser.AdmireCommandContext ctx) {
        if (world.isInBattleMode()) {
            System.out.println("You can't use this command when you're in battle!");
        } else {
            String item = ctx.WORD().getText();
            world.admire(item);
        }
        return null;
    }
    @Override
    public String visitEatCommand(PlayerCommandParser.EatCommandContext ctx) {
        if (world.isInBattleMode()) {
            System.out.println("You can't use this command when you're in battle!");
        } else {
            String food = ctx.WORD().getText();
            world.eat(food);
        }
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
        if (world.isInBattleMode()) {
            System.out.println("You can't use this command when you're in battle!");
        } else {
            String chest = ctx.WORD().getText();
            world.open(chest);
        }
        return null;
    }

    @Override
    public String visitDoorCommand(PlayerCommandParser.DoorCommandContext ctx) {
        if (world.isInBattleMode()) {
            System.out.println("You can't use this command when you're in battle!");
        } else {
            int doorNumber = Integer.parseInt(ctx.WORD().getText());
            world.openDoor(doorNumber);
        }
        return null;
    }

    @Override
    public String visitExitCommand(PlayerCommandParser.ExitCommandContext ctx) {
        if (world.isInBattleMode()) {
            System.out.println("You can't use this command when you're in battle!");
        } else {
            world.searchExit();
        }
        return null;
    }

    @Override
    public String visitDescribeCommand(PlayerCommandParser.DescribeCommandContext ctx) {
        if (world.isInBattleMode()) {
            System.out.println("You can't use this command when you're in battle!");
        } else {
            world.describeRoom();

        }
        return null;
    }

    @Override
    public String visitStatsCommand(PlayerCommandParser.StatsCommandContext ctx) {
        if (world.isInBattleMode()) {
            System.out.println("You can't use this command when you're in battle!");
        } else {
            world.displayStats();

        }
        return null;
    }

    @Override
    public String visitHelpCommand(PlayerCommandParser.HelpCommandContext ctx) {
        if (world.isInBattleMode()) {
            // Handle help for battle mode
            world.displayBattleHelp();
        } else {
            // Handle help for explore mode
            world.displayExploreHelp();
        }
        return null;
    }

    @Override
    public String visitAttackCommand(PlayerCommandParser.AttackCommandContext ctx) {
        if (world.isInBattleMode()){
            String monsterName = ctx.WORD().getText();
            world.attackMonster(monsterName);
        } else{
            System.out.println("There's nothing to attack!");
        }
        return null;
    }


    @Override
    public String visitTalkCommand(PlayerCommandParser.TalkCommandContext ctx) {
        if (world.isInBattleMode()){
            world.talkToMonster();
        } else{
            System.out.println("There's no one to talk to..");
        }
        return null;
    }

    // Handle invalid commands
    @Override
    public String visitCommand(PlayerCommandParser.CommandContext ctx) {
        return visitChildren(ctx); // Handle the valid commands
    }
}
