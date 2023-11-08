
package gameplay;

import gameplay.characters.Player;
import pickups.Pickup;
import pickups.valuables.Valuable;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import pickups.foods.*;
import pickups.wieldables.Wieldable;

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
        String input = scanner.nextLine();

        String[] tokens = input.split(" "); // Split the input into tokens

        if (tokens.length == 0) {
            System.out.println("Invalid command. Please enter a valid command.");
            return;
        }

        String command = tokens[0].toLowerCase(); // Convert the command to lowercase

        switch (command) {
            case "pickup":
                if (tokens.length < 2) {
                    System.out.println("Usage: pickup <item>");
                    return;
                }
                String itemToPickup = tokens[1].toLowerCase();
                pickup(itemToPickup);
                break;
            case "admire":
                if (tokens.length < 2) {
                    System.out.println("Usage: admire <item>");
                    return;
                }
                String admiredItem = tokens[1].toLowerCase();
                admire(admiredItem);
                break;
            case "eat":
                if (tokens.length < 2) {
                    System.out.println("Usage: eat <food>");
                    return;
                }
                String foodToEat = tokens[1].toLowerCase();
                eat(foodToEat);
                break;
            case "wield":
                if (tokens.length < 2) {
                    System.out.println("Usage: wield <weapon>");
                    return;
                }
                String weaponToWield = tokens[1].toLowerCase();
                wield(weaponToWield);
                break;
            case "open":
                if (tokens.length < 2) {
                    System.out.println("Usage: open <chest>");
                    return;
                }
                String chestToOpen = tokens[1].toLowerCase();
                open(chestToOpen);
                break;
            case "door":
                if (tokens.length < 2) {
                    System.out.println("Usage: door <door_number>");
                    return;
                }
                int doorNumber = Integer.parseInt(tokens[1]);
                openDoor(doorNumber);
                break;
            case "exit":
                searchExit();
                break;
            case "describe":
                describeRoom();
                break;
            case "stats":
                displayStats();
                break;
            case "help":
                displayHelp();
                break;
            default:
                System.out.println("Invalid command. Please enter a valid command.");
        }
    }

    private void eat(String food) {
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


    private void wield(String weapon) {
        // Check if the weapon is a valid weapon type (axe, fistsoffury, sword)
        if (isValidWeaponType(weapon)) {
            // Determine the selected weapon pickup
            Pickup weaponPickup = player.getInventory().select(weapon);

            if (weaponPickup instanceof Wieldable) {
                Wieldable weaponItem = (Wieldable) weaponPickup;
                // Equip the player with the weapon
                player.setWeapon(weaponItem);

                System.out.println("You wielded the " + weapon + " for battle.");
            }
        } else {
            System.out.println("Invalid weapon item.");
        }
    }

    // Check if the input is a valid weapon type
    private boolean isValidWeaponType(String weapon) {
        return weapon.equals("axe") || weapon.equals("fistsoffury") || weapon.equals("sword");
    }

    private void open(String chest) {
        // Handle the open logic
    }

    private void changeCurrentRoom(Room newRoom) {
        currentRoom = newRoom;
    }

    private void openDoor(int doorNumber) {
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




    private void searchExit() {
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

    private void describeRoom() {
        System.out.println(currentRoom);
    }

    private void displayStats() {
        // Handle the display stats logic
        System.out.println(this.player.stats());;
    }

    private void displayHelp() {
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
    private void pickup(String item) {
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
    private void admire(String item) {
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
                System.out.println("Desc: " + valuable.getDescription());
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
