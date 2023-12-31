/**
 * World is a class that contains all the player commands and game logic.
 * @author Nicha Techatassanasoontorn 21139671
 **/
package gameplay;

import gameplay.characters.Monster;
import gameplay.characters.Player;
import pickups.Pickup;
import pickups.openables.Openable;
import pickups.openables.TreasureChest;
import pickups.openables.Warchest;
import pickups.openers.Key;
import pickups.openers.Lockpick;
import pickups.valuables.Valuable;

import java.util.*;

import pickups.foods.*;
import pickups.wieldables.FistsofFury;
import pickups.wieldables.Wieldable;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import playercommand_grammar.MyCommandVisitor;
import playercommand_grammar.PlayerCommandLexer;
import playercommand_grammar.PlayerCommandParser;


public class World {
    public boolean isInBattleMode() {
        return this.mode.equals(PlayMode.battle);
    }

    public void displayBattleHelp() {
        System.out.println("Battle Mode Commands:");
        System.out.println("--------------------------------------------------------");
        System.out.println("attack monster - Attacks the monster in the room using the wielded weapon");
        System.out.println("wield weapon - Wields a weapon from inventory for battle.");
        System.out.println("wield fistsoffury - Wields fists of fury (doesnt appear in inventory).");
        System.out.println("talk - Attempt to talk to a monster.");
        System.out.println("help - Display available commands in this mode.");

        System.out.println("--------------------------------------------------------");
    }

    public void attackMonster(String monsterName) {
        // Check if you are in battle mode
        if (!isInBattleMode()) {
            System.out.println("You can't attack monsters when you're not in battle mode!");
            return; // Exit the method
        }

        // Find the monster with the given name
        Monster targetMonster = null;
        for (Monster monster : battleMonsters) {
            if (monster.getId().equalsIgnoreCase(monsterName)) {
                targetMonster = monster;
                break; // Exit the loop when the monster is found
            }
        }

        // Check if the target monster was found
        if (targetMonster == null) {
            System.out.println("\nNo monster with the name '" + monsterName + "' found in the room!\n");
            return; // Exit the method
        }

        // Store player and monster health before the attack
        int playerHealthBefore = player.getHp();
        int monsterHealthBefore = targetMonster.getHp();

        // Monster attacks the player
        int monsterAtk = player.defendAttack(targetMonster);

        String weaponUsed = "";

        // Check if the player has a weapon equipped; if not, equip "Fists of Fury"
        FistsofFury fists = new FistsofFury("You'll settle this with your bare hands!"
                ,1, 15);
        if (player.getWeapon() == null) {
            player.setWeapon(fists);
            System.out.println("You equip your fists before attacking!\n");
        }

        weaponUsed = player.getWeapon().getId();

        // Player attacks the monster
        int playerAtk = targetMonster.defendAttack(player);

        // Print the weapon the player uses to attack the monster
        System.out.println("Player wields " + weaponUsed + " to attack the monster for " + playerAtk + " hp!");
        System.out.println("The monster attacks the player for " + monsterAtk + " hp!\n");

        // Check if monster is defeated
        if (player.getHp() <= 0) {
            this.gameOver();
        } else if (targetMonster.getHp() <= 0) {
            // Player wins the battle
            currentRoom.removeMonster(targetMonster);
            System.out.println("Player defeats the monster!\n");
            System.out.println(this.currentRoom);
            this.mode = PlayMode.explore;
        }
    }



    private void gameOver() {
        System.out.println("\nThe monster beat you up so bad you are literally dead");
        System.out.println("Is this the end of your journey..?");
        System.out.println("GAME OVER");
        System.exit(0);
    }

    public void talkToMonster() {
        if (isInBattleMode()) {
            // Check if there is a monster to talk to in battleMonsters list
            if (battleMonsters.isEmpty()) {
                System.out.println("There are no monsters to talk to.");
                return;
            }

            // Get the first monster in the list
            Monster monsterToTalkTo = battleMonsters.get(0);

            // Talk to the monster
            int monsterAtk = player.defendAttack(monsterToTalkTo);

            System.out.println("The monster attacks the player for " + monsterAtk + " hp!\n");

            monsterToTalkTo.talk();


            // Check if player's HP is less than or equal to 0, and end the game if it is
            if (player.getHp() <= 0) {
                this.gameOver();
                return;
            }
            // Check if the monster's dialogue is finished
            if (monsterToTalkTo.isDialogueFinished() && !monsterToTalkTo.isContinueAttacking()) {

                // Exit battle mode
                this.mode = PlayMode.explore;

                // Remove the monster from battleMonsters list
                battleMonsters.remove(monsterToTalkTo);

                // Player wins the battle
                currentRoom.removeMonster(monsterToTalkTo);
                System.out.println("Player uses the power of words to defeat the monster!\n");
                System.out.println(this.currentRoom);
                this.mode = PlayMode.explore;
            }
        } else {
            System.out.println("You can't talk to monsters when you're not in battle mode!");
        }
    }


    public enum PlayMode {battle, explore;}

    // A data structure to store rooms (e.g., a map from room names to Room objects)
    private Map<String, Room> rooms = new HashMap<>();

    private Room currentRoom = null;

    Player player;
    PlayMode mode = PlayMode.explore;

    List<Monster> battleMonsters;



    //--------------------------------------------------------
    public void onEnterRoom() {
        System.out.println(currentRoom);

        battleMonsters = new ArrayList<Monster>();
        // Check if the room has any monsters
        if (currentRoom.getMonsters() != null && currentRoom.getMonsters().length > 0) {
            // check monster spawn chance
            for (Monster monster : currentRoom.getMonsters()){
                if (monster.appear()){
                    battleMonsters.add(monster);
                    System.out.println("A monster appeared!");
                    // Monster(s) present, switch to battle mode
                    mode = PlayMode.battle;
                }
            }

        } else {
            // No monsters, stay in explore mode
            mode = PlayMode.explore;
        }

    }

    //--------------------------------------------------------
    public void play(Player player)
    {
        this.player = player;
        System.out.println("Welcome player " + player);

        System.out.println(player);
        this.currentRoom=rooms.get("1");

        this.onEnterRoom();

        boolean gameInProgress = true;
        while (gameInProgress) {
            switch (this.mode) {
                case explore:
                    processExploreUserInput();
                    break;
                case battle:
                    processBattleUserInput();
                    break;
            }

        }
    }



    // Add a room to the game world
    public void addRoom(String roomName, Room room) {
        rooms.put(roomName, room);

        // Set the current room when adding the first room
        if (currentRoom == null) {
            currentRoom = room;
        }
    }

    // Other methods for interacting with rooms, such as getting a room by name
    public Room getRoom(String roomName) {
        return rooms.get(roomName);
    }

    //--------------------------------------------------------
    private void processExploreUserInput() {
        Scanner scanner = new Scanner(System.in);
        String stringInput = scanner.nextLine();

        // Create a CharStream from your input
        CharStream input = CharStreams.fromString(stringInput);

        // Create a lexer and parser
        PlayerCommandLexer lexer = new PlayerCommandLexer(input);
        lexer.removeErrorListener(ConsoleErrorListener.INSTANCE);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PlayerCommandParser parser = new PlayerCommandParser(tokens);
        parser.removeErrorListeners();

        // Parse the command
        ParseTree tree = parser.command();

        // Implement logic to interpret the parsed command using your visitor
        MyCommandVisitor visitor = new MyCommandVisitor(this);
        visitor.visit(tree);

    }
    public void eat(String food) {
        // Get the current player's inventory
        Inventory playerInventory = player.getInventory();

        // Check if the food exists in the player's inventory
        Pickup foodItem = playerInventory.select(food);

        if (foodItem != null) {
            // Check if the item is a Food
            if (foodItem instanceof Food) {
                Food foodToEat = (Food) foodItem;

                // Eat the food item, increase health points, and consume it
                int previousHealth = player.getHp();
                player.increaseHealth(foodToEat.getHpRestored());
                foodToEat.Consume();
                playerInventory.remove(foodToEat);

                // Display information about the food and health increase
                System.out.println("You ate " + food + " and gained health points.");
                System.out.println("Description: " + foodToEat.getDescription());
                System.out.println("Your health increased by " + foodToEat.getHpRestored());

                // Display previous vs new health value
                int newHealth = player.getHp();
                System.out.println("Previous Health: " + previousHealth);
                System.out.println("New Health: " + newHealth);
                System.out.println("--------------------------------------------------------");
            } else {
                System.out.println("You cannot eat this item.");
            }
        } else {
            System.out.println("Item not found in your inventory.");
        }
    }


    // Check if the input is a valid food type
    private boolean isValidFoodType(String food) {
        return food.equals("mead") || food.equals("roastboar") || food.equals("bread");
    }


    public void wield(String weapon) {
        if (weapon.equals("fistsoffury")) {
            // The player can always equip "Fists of Fury"
            Wieldable fistsOfFury = new FistsofFury("You'll settle this with your bare hands!", 1, 15);
            player.setWeapon(fistsOfFury);
            System.out.println("Description: "+fistsOfFury.getDescription());
            System.out.println("You prepared your Fists of Fury for battle.");
            System.out.println("Low: "+fistsOfFury.getLow() + " High: "+fistsOfFury.getHigh()+"\n");
            return; // Exit the method after equipping
        }

        // Check if the weapon is a valid weapon type (axe, sword) and exists in the player's inventory
        if (isValidWeaponType(weapon)) {
            // Determine the selected weapon pickup
            Pickup weaponPickup = player.getInventory().select(weapon);

            if (weaponPickup instanceof Wieldable) {
                Wieldable weaponItem = (Wieldable) weaponPickup;
                // Equip the player with the weapon
                player.setWeapon(weaponItem);
                System.out.println("Description: "+weaponItem.getDescription());
                System.out.println("You wielded the " + weapon + " for battle.");
                System.out.println("Low: "+weaponItem.getLow() + " High: "+weaponItem.getHigh()+"\n");

            } else {
                System.out.println("You cannot wield this item as a weapon or you don't have that weapon in your inventory.");
            }
        } else {
            System.out.println("Invalid weapon item.");
        }
    }

    // Modify the isValidWeaponType to exclude "fistsoffury"
    private boolean isValidWeaponType(String weapon) {
        return weapon.equals("axe") || weapon.equals("sword");
    }


    public void open(String chest) {
        // Check if either a warchest or treasurechest is in the player's inventory
        Openable targetChest = null;
        Inventory playerInventory = player.getInventory();

        for (Pickup pickup : playerInventory.getItems()) {
            if (pickup instanceof Warchest || pickup instanceof TreasureChest) {
                targetChest = (Openable) pickup;
                break;
            }
        }

        if (targetChest == null) {
            System.out.println("You don't have any chests!");
            return;
        }

        // Handle opening the chest based on its type
        if (targetChest instanceof Warchest) {
            Warchest warchest = (Warchest) targetChest;
            // Check if the player has a Lockpick
            Lockpick lockpick = (Lockpick) playerInventory.select("lockpick");
            if (lockpick != null) {
                warchest.unlockWith(lockpick, playerInventory);
                playerInventory.remove(lockpick);
                playerInventory.remove(warchest);
            } else {
                System.out.println("You need a lockpick to unlock this warchest.");
            }
        } else if (targetChest instanceof TreasureChest) {
            TreasureChest treasureChest = (TreasureChest) targetChest;
            // Check if the player has a Key
            Key key = (Key) playerInventory.select("key");
            if (key != null) {
                treasureChest.unlockWith(key, playerInventory);
                playerInventory.remove(key);
                playerInventory.remove(treasureChest);
            } else {
                System.out.println("You need the correct key to unlock this treasure chest.");
            }
        }
    }

    public void changeCurrentRoom(Room newRoom) {
        currentRoom = newRoom;
    }

    public void openDoor(int doorNumber) {
        // Get the current room's connecting rooms
        Room[] connectingRooms = currentRoom.getConnectingRooms();

        // Check if the doorNumber corresponds to a valid connecting room
        boolean isValidDoor = false;
        for (Room room : connectingRooms) {
            if (room.getId().equals(Integer.toString(doorNumber))) {
                isValidDoor = true;
                break;
            }
        }
        if (isValidDoor) {
            // Determine the new room based on the doorNumber
            Room newRoom = rooms.get(Integer.toString(doorNumber));

            changeCurrentRoom(newRoom);
            System.out.println("You opened the door to " + newRoom.getId());
            this.onEnterRoom();
        } else {
            System.out.println("Invalid door number.");
        }
    }

    public void searchExit() {
        if (currentRoom.isExit()){
            System.out.println("Wow, you've found the exit in this room!");
            System.out.println("As you slowly open the door...");
            System.out.println("A gust of fresh air greets you. You step through the doorway, and...");
            System.out.println("The world outside is not the world you knew. Instead of freedom, a barren wasteland greets you.");
            System.out.println("Your journey continues into the great unknown, full of mysteries and unforeseen challenges.");
            System.out.println("THE END...");

            System.exit(0);
        } else{
            System.out.println("A shame, you can't seem to find an exit in this room.");
        }
    }

    public void describeRoom() {
        System.out.println(currentRoom);
    }

    public void displayStats() {
        // Handle the display stats logic
        System.out.println(this.player.stats());;
    }

    public void displayExploreHelp() {
            System.out.println("Explore Mode Commands:");
            System.out.println("--------------------------------------------------------");
            System.out.println("door n - Opens door labeled n and enters the room.");
            System.out.println("pickup item - Pick up an item in the room and add it to your inventory.");
            System.out.println("exit - Search the room to find the exit.");
            System.out.println("describe - Describes the room, lists pickups on the floor, and shows the number of doors available.");
            System.out.println("admire valuable - Admire a valuable pickup in your inventory to increase confidence.");
            System.out.println("eat food - Eat a food pickup in your inventory to increase health points.");
            System.out.println("stats - Display your health and confidence points and inventory.");
            System.out.println("open chest - Open a treasure or war chest in your inventory.");
            System.out.println("wield weapon - Wields a weapon from inventory for battle.");
            System.out.println("wield fistsoffury - Wields fists of fury (doesnt appear in inventory).");
            System.out.println("help - Display available commands in this mode.");

            System.out.println("--------------------------------------------------------");
    }

    // Implement the pickup method to handle item pickup
    public void pickup(String item) {
        // Get the current room

        // Check if the item exists in the room's inventory
        Inventory roomInventory = currentRoom.getPickupsInRoom();
        Pickup pickedItem = roomInventory.select(item);

        if (pickedItem != null) {
            // Add the item to the player's inventory
            player.getInventory().add(pickedItem);

            // Remove the item from the room's inventory
            roomInventory.remove(pickedItem);

            System.out.println("You picked up " + item);
        } else {
            System.out.println("Item not found in the room.");
        }
    }

    // Implement the admire method to handle item admiration
    public void admire(String item) {
        // Get the current player's inventory
        Inventory playerInventory = player.getInventory();

        // Check if the item exists in the player's inventory
        Pickup admiredItem = playerInventory.select(item);

// Check if the item exists in the player's inventory
// Check if the item exists in the player's inventory
        List<Pickup> admiredItems = playerInventory.selectAll(item);

        if (!admiredItems.isEmpty()) {
            for (Pickup pickup : admiredItems) {
                if (pickup instanceof Valuable && !((Valuable) pickup).getConsumed()) {
                    Valuable valuable = (Valuable) pickup;

                    // Admire the valuable item and consume it
                    int previousConfidence = player.getConfidence();
                    player.Admire(valuable);
                    valuable.Consume();

                    // Display information about the admired item and confidence increase
                    System.out.println("You admired " + valuable);
                    System.out.println("Description: " + valuable.getDescription());
                    System.out.println("Your confidence increased by " + valuable.getValue());

                    // Display previous vs new confidence value
                    int newConfidence = player.getConfidence();
                    System.out.println("Previous Confidence: " + previousConfidence);
                    System.out.println("New Confidence: " + newConfidence);
                    System.out.println("--------------------------------------------------------");
                } else{
                    System.out.println("Usage: admire <unadmired valuable>");
                }
            }
        } else {
            System.out.println("No unadmired items found in your inventory.");
        }

    }


    private void processBattleUserInput() {

        for (Monster monster : battleMonsters) {
            // Check if monster's HP is less than 0 and set it to 0
            if (monster.getHp() < 0) {
                monster.setHp(0);
            }
            System.out.println("Monster: " + monster.getId() + " | HP: " + monster.getHp());
        }

// Check if the player's HP is less than 0 and set it to 0
        if (player.getHp() < 0) {
            player.setHp(0);
        }

        System.out.println("Player: " + player.getName() + " | HP: " + player.getHp() + " | CF: " + player.getConfidence());
        System.out.println("----------------------------------------------");
        System.out.println("What will you do?");


        Scanner scanner = new Scanner(System.in);
        String stringInput = scanner.nextLine();

        // Create a CharStream from your input
        CharStream input = CharStreams.fromString(stringInput);

        // Create a lexer and parser
        PlayerCommandLexer lexer = new PlayerCommandLexer(input);
        lexer.removeErrorListener(ConsoleErrorListener.INSTANCE);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PlayerCommandParser parser = new PlayerCommandParser(tokens);
        parser.removeErrorListeners();

        // Parse the command
        ParseTree tree = parser.command();

        // Implement logic to interpret the parsed command using your visitor
        MyCommandVisitor visitor = new MyCommandVisitor(this);
        visitor.visit(tree);
    }
    //--------------------------------------------------------
}
