/**
 * Room class contains information about connecting rooms, monsters, and pickups in the room. It also contains getters and setters for all entities in the room.
 * @author Nicha Techatassanasoontorn 21139671
 **/
package gameplay;

import gameplay.characters.Monster;
import pickups.Pickup;

import java.util.List;

public class Room extends Entity{

    public boolean isFinalRoom() {
        return isFinalRoom;
    }

    public void setFinalRoom(boolean finalRoom) {
        isFinalRoom = finalRoom;
    }

    private boolean isFinalRoom;

    public void setConnectingRooms(List<Room> connectingRooms) {
        this.connectingRooms = connectingRooms.toArray(new Room[0]);
    }
    public void setConnectingRoomsbyID(List<String> connectingRoomIds){

    }

    public Monster[] getMonsters() {
        return monsters;
    }

    public void setMonsters(Monster[] monsters) {
        this.monsters = monsters;
    }

    public void setPickupsInRoom(Inventory pickupsInRoom) {
        this.pickupsInRoom = pickupsInRoom;
    }

    private Room[] connectingRooms;

    private Monster[] monsters;

    private Inventory pickupsInRoom;

    public Room() {
        super("Life is like a room of chocolates. You never know what you're" +
                " gonna get...");
        this.isFinalRoom = false;
        this.connectingRooms = null;
        this.monsters = null;
        this.pickupsInRoom = null;
    }

    public Room(String id) {
        super("Life is like a room of chocolates. You never know what you're" +
                " gonna get...");
        this.setId(id);
        this.isFinalRoom = false;
        this.connectingRooms = null;
        this.monsters = null;
        this.pickupsInRoom = null;
    }
    public Room(String id, String description, Inventory pickupsInRoom,
                List<Room> connectingRooms, List<Monster> monstersInRoom, boolean isFinalRoom){
        super(description);
        this.setId(id);
        this.pickupsInRoom = pickupsInRoom;
        this.connectingRooms = connectingRooms.toArray(new Room[0]);
        this.monsters = monstersInRoom.toArray(new Monster[0]);
        this.isFinalRoom = isFinalRoom;

    }

    public boolean isExit(){
        return this.isFinalRoom;
    }

    public Inventory getPickupsInRoom(){
        return this.pickupsInRoom;
    }

    public String getConnectingRoomsId(){

        String returnStr = "";

        for (int i = 0; i < connectingRooms.length; i++){
            returnStr += connectingRooms[i].getId();
            if (i < connectingRooms.length - 1){
                returnStr += ", ";
            }
        }
        return returnStr;
    }

    public Room[] getConnectingRooms(){
        return this.connectingRooms;
    }

    public String toString(){
        String returnStr = this.getDescription();
        returnStr += "\nRoom No. " + this.getId();
        returnStr += "\nPickups: "+pickupsInRoom;
        returnStr += "\nDoors: "+this.getConnectingRoomsId();
        if (this.isFinalRoom){
            returnStr += "\n\nYou notice a warm, inviting glow in the corner of this room...";
            returnStr += "\nSunlight filters through the cracks in the walls, illuminating your surroundings.";
            returnStr += "\nIt seems you've reached the exit. Should you venture forth and see what lies beyond?";
        }
        return returnStr + "\n";
    }

    public void addMonster(Monster monster) {
        if (monsters == null) {
            monsters = new Monster[1];
            monsters[0] = monster;
        } else {
            Monster[] newMonsters = new Monster[monsters.length + 1];
            System.arraycopy(monsters, 0, newMonsters, 0, monsters.length);
            newMonsters[monsters.length] = monster;
            monsters = newMonsters;
        }
    }

    public void addPickup(Pickup pickup) {
        if (pickupsInRoom == null || pickupsInRoom.isEmpty()) {
            pickupsInRoom = new Inventory();
        }
        pickupsInRoom.add(pickup);
    }

    public void removeMonster(Monster monsterToRemove) {
        int indexToRemove = -1;

        // Find the index of the monster to remove
        for (int i = 0; i < monsters.length; i++) {
            if (monsters[i] == monsterToRemove) {
                indexToRemove = i;
                break;
            }
        }

        if (indexToRemove != -1) {
            // Create a new array to hold the monsters without the one to remove
            Monster[] updatedMonsters = new Monster[monsters.length - 1];

            // Copy elements before the one to remove
            System.arraycopy(monsters, 0, updatedMonsters, 0, indexToRemove);

            // Copy elements after the one to remove
            System.arraycopy(monsters, indexToRemove + 1, updatedMonsters, indexToRemove, monsters.length - indexToRemove - 1);

            monsters = updatedMonsters;
        }
    }

}
