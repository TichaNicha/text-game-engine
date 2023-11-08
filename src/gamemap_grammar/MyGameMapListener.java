package gamemap_grammar;

import gameplay.Inventory;
import gameplay.*;
import gameplay.characters.monsters.Dragon;
import gameplay.characters.monsters.Ogre;
import gameplay.characters.monsters.Zombie;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;
import pickups.*;

import gameplay.characters.Monster;
import pickups.openables.TreasureChest;
import pickups.openables.Warchest;
import pickups.valuables.*;
import pickups.wieldables.*;
import pickups.foods.*;
import pickups.openers.*;

import java.util.*;

public class MyGameMapListener extends GameMapBaseListener {
    private World world = new World(); // Initialize the world
    private List<Room> allRooms = new ArrayList<>(); // List to store all rooms
    private Room currentRoom = new Room();
    private Inventory currentContents;
    private List<Room> connectingRooms;

    @Override
    public void exitRoom(GameMapParser.RoomContext ctx) {
        // Set room properties, such as roomType
        currentRoom.setId(ctx.ID().getText());
        if (ctx.roomType() != null) { // Check if roomType is defined
            currentRoom.setFinalRoom(true);
        }

        allRooms.add(currentRoom); // Add the currentRoom to the list

    }

    @Override
    public void enterContents(GameMapParser.ContentsContext ctx) {
        currentContents = new Inventory();
    }

    @Override
    public void exitContents(GameMapParser.ContentsContext ctx) {
        currentRoom.setPickupsInRoom(currentContents);
    }

    @Override
    public void enterPickupList(GameMapParser.PickupListContext ctx) {
        // Initialize a list to store pickups
        List<Pickup> pickups = new ArrayList<>();

        // Iterate through pickup items in the list
        for (TerminalNode pickupTerminal : ctx.PICKUP()) {
            String pickupType = pickupTerminal.getText();
            Pickup pickup = createPickupByType(pickupType);

            if (pickup != null) {
                pickups.add(pickup);
            }
        }

        // Add the pickups to the currentContents
        currentContents.addAll(pickups);
    }

    @Override
    public void enterOpenableContents(GameMapParser.OpenableContentsContext ctx) {
        // Process openable contents (e.g., warchest or treasurechest)
        if (ctx.OPENABLE_TYPE() != null) {
            String openableType = ctx.OPENABLE_TYPE().getText();
            // Initialize a list to store pickups for the openable
            Inventory openablePickups = new Inventory();

            // Iterate through pickup items in the list
            for (TerminalNode pickupTerminal : ctx.pickupList().PICKUP()) {
                String pickupType = pickupTerminal.getText();
                Pickup pickup = createPickupByType(pickupType);

                if (pickup != null) {
                    openablePickups.add(pickup);
                }
            }

            // Create the openable object (e.g., Warchest or TreasureChest)
            if (openableType.equals("warchest")) {
                Warchest warchest = new Warchest("A blood-stained chest that looks like it's been through a lot", true, openablePickups);
                currentContents.add(warchest);
            } else if (openableType.equals("treasurechest")) {
                TreasureChest treasureChest = new TreasureChest("A chest full of treasure", true, openablePickups);
                currentContents.add(treasureChest);
            }
        }
    }



    @Override
    public void exitConnection(GameMapParser.ConnectionContext ctx){
        String roomId = ctx.ID(0).getText(); // Get the current room's ID

        // Find the current room by ID in the list of all rooms
        for (Room room : allRooms) {
            if (room.getId().equals(roomId)) {
                currentRoom = room;
                break; // Found the current room, no need to continue searching
            }
        }
        // Initialize a list to store connected room objects
        List<Room> connectedRooms = new ArrayList<>();

        // Iterate through the connected room IDs in the context
        for (TerminalNode idTerminal : ctx.ID().subList(1, ctx.ID().size())) {
            String connectedRoomId = idTerminal.getText();

            // Find the connected room in the allRooms array
            for (Room room : allRooms) {
                if (room.getId().equals(connectedRoomId)) {
                    connectedRooms.add(room);
                    break;
                }
            }
        }

        // Update the currentRoom with the list of connected rooms
        if (currentRoom != null) {
            currentRoom.setConnectingRooms(connectedRooms);
        }
        // Add the currentRoom to your world
        world.addRoom(currentRoom.getId(), currentRoom);
        System.out.println(currentRoom);
    }


    // Override methods to handle other elements in your grammar
    private Pickup createPickupByType(String pickupType) {

        Pickup pickup = null;

            if (pickupType.equals("axe")) {
                pickup = new Axe("Axe. Like the deodorant!",
                        3, 6);
            } else if (pickupType.equals("fistsoffury")) {
                pickup = new FistsofFury("You'll settle this with your bare hands!"
                ,1, 15);
            } else if (pickupType.equals("sword")) {
                pickup = new Sword("A sword. The most consistent thing ever.",
                        4,5);
            } else if (pickupType.equals("chalice")) {
                pickup = new Chalice("Drinking out of it makes your water taste like metal.");
            } else if (pickupType.equals("moneybag")) {
                pickup = new MoneyBag("Money, money, money, is so funny, in a rich player's world.");
            } else if (pickupType.equals("ring")) {
                pickup = new Ring("You wonder what will happen if you present it to a monster.");
            } else if (pickupType.equals("coin")) {
                pickup = new Coin("This could buy you one big frozen coola at waccas back in the day.");
            } else if (pickupType.equals("goldbars")) {
                pickup = new GoldBars("You're rich!");
            } else if (pickupType.equals("jewel")) {
                pickup = new Jewel("Shiny..!");
            } else if (pickupType.equals("mobile")) {
                pickup = new Mobile("A futuristic device that sells for a high price!");
            } else if (pickupType.equals("mead")) {
                pickup = new Mead("It smells like sewage, beer, and sunshine.");
            } else if (pickupType.equals("roastboar")) {
                pickup = new RoastBoar("The smoky scent makes you drool.");
            } else if (pickupType.equals("bread")) {
                pickup = new Bread("A bit stale, but you don't mind.");
            } else if (pickupType.equals("warchest")) {
             //   pickup = new Warchest("A blood-stained chest that looks like its been through a lot..", true, chestContents);
            } else if (pickupType.equals("treasurechest")) {
              //  pickup = new TreasureChest("A chest full of treasure!", true, chestContents);
            } else if (pickupType.equals("key")) {
                pickup = new Key("Maybe its a key to someones heart?");
            } else if (pickupType.equals("lockpick")) {
                pickup = new Lockpick("Feels a bit illegal but its ok, everything's legal in the dungeon!");
            }
            return pickup;
    }
    private Monster createMonsterByType(String type) {
        // Create and return the appropriate monster object based on the type
        if (type.equals("dragon")) {
            return new Dragon("A beast that dominates the skies and decimates the land.",
                    70, 90, 10);
        } else if (type.equals("ogre")) {
            return new Ogre("A man-eating monster that preys on weak adventurers.",
                    30, 50, 5);
        } else if (type.equals("zombie")) {
            return new Zombie("An undead adventurer significantly weaker than when it used to be alive.",
                    15, 70, 3);
        }
        return null; // Handle the case when the type is not recognized
    }

    public World getWorld() {
        return world;
    }
}
