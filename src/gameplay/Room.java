package gameplay;

import gameplay.characters.Monster;

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
        return returnStr;
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

}
