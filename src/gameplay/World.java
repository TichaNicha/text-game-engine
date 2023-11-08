
package gameplay;

import gameplay.characters.Player;
import pickups.Pickup;
import pickups.openables.Openable;
import pickups.openables.TreasureChest;
import pickups.openables.Warchest;
import pickups.openers.Key;
import pickups.openers.Lockpick;
import pickups.valuables.Valuable;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import pickups.foods.*;
import pickups.wieldables.FistsofFury;
import pickups.wieldables.Wieldable;
// Import the generated classes
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import playercommand_grammar.MyCommandVisitor;
import playercommand_grammar.PlayerCommandLexer;
import playercommand_grammar.PlayerCommandParser;


public class World {
    public enum PlayMode {battle, explore;}

    // A data structure to store rooms (e.g., a map from room names to Room objects)
    private Map<String, Room> rooms = new HashMap<>();

    private Room currentRoom = null;

    Player player;
    PlayMode mode = PlayMode.explore;



    //--------------------------------------------------------
    public void onEnterRoom()
	{
        // monster may appear
        // if monster appears change to battle mode, else stay in explore mode
        // description display
        System.out.println(currentRoom);
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
                    //processBattleUserInput();
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
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PlayerCommandParser parser = new PlayerCommandParser(tokens);

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

    public void displayHelp() {
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

        if (admiredItem != null) {
            // Check if the item is a Valuable
            if (admiredItem instanceof Valuable && !((Valuable) admiredItem).getConsumed()) {
                Valuable valuable = (Valuable) admiredItem;

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
            } else {
                System.out.println("You cannot admire this item.");
            }
        } else {
            System.out.println("Item not found in your inventory.");
        }
    }



    private void processBattleUserInput() {
        // Parse and process battle mode user input
        // Handle errors and invalid commands
        // Update battle state based on player input
        // Check for battle end conditions (win, lose, run, etc.)
    }
    //--------------------------------------------------------
}
