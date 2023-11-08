package gameplay.characters;

import gameplay.Inventory;
import pickups.Pickup;
import pickups.valuables.Valuable;
import pickups.wieldables.FistsofFury;
import pickups.wieldables.Wieldable;

public class Player extends Character
{
    private String name;

    private int confidence;

    private Wieldable weapon = new FistsofFury("You'll settle this with your bare hands!",0, 10);

    private Inventory inventory;


    public Player(String name,int health,int confidence)
    {
        super("It's you! The player!!!! What else is there to explain..", health);
        this.name=name;
        this.confidence=confidence;
        this.weapon= null;
        this.inventory = new Inventory();
    }

    public String stats() {
        String playerName = "Name: " + this.getName();
        String playerHP = "HP: " + this.getHp();
        String playerConfidence = "Confidence Points: " + this.getConfidence();
        String equippedWeapon = "Equipped Weapon: " + this.getWeapon();
        String inventoryHeader = "Inventory: ";

        Inventory playerInventory = this.getInventory();
        StringBuilder inventory = new StringBuilder();

        // Iterate through the items in the inventory
        for (Pickup item : playerInventory.getItems()) {
            if (item != null) {
                inventory.append(item);
                inventory.append(", ");
            }
        }

        // Remove the trailing comma if there are items
        if (inventory.length() > 0) {
            inventory.deleteCharAt(inventory.length() - 2);
        } else {
            inventory.append("nothing");
        }

        String border = "╔════════════════════════════════════════════════╗\n";
        String borderBottom = "╚════════════════════════════════════════════════╝\n";
        String header = "║                Adventurer Card                 ║\n";
        String separator = "║------------------------------------------------║\n";

        // Combine info, including the formatted inventory
        String adventurerCard = border +
                header +
                separator +
                "║ " + formatLine(playerName) + "║\n" +
                "║ " + formatLine(playerHP) + "║\n" +
                "║ " + formatLine(playerConfidence) + "║\n" +
                "║ " + formatLine(equippedWeapon) + "║\n" +
                separator +
                "║ " + formatLine(inventoryHeader + inventory.toString()) + "\n" +
                borderBottom;

        return adventurerCard;
    }

    public String toString(){
        return this.getName();
    }

    // Format each line to a consistent length
    private String formatLine(String line) {
        int totalLength = 50; // Total width of each line
        int lineLength = line.length();
        int padding = totalLength - lineLength - 2; // Subtract 2 for the leading and trailing border

        if (padding % 2 != 0) {
            padding--;
        }

        int leftPadding = padding / 2;
        int rightPadding = padding / 2;

        String formattedLine = " ".repeat(leftPadding) + line + " ".repeat(rightPadding);

        return formattedLine;
    }

    public void increaseHealth(int hpIncrease){
        this.setHp(this.getHp() + hpIncrease);
    }

    @Override
    protected int dealAttackDamage() {
        int h = weapon.hit();
        int c = this.getConfidence();
        int d = h + h * c / 100;

        return d;
    }

    @Override
    public int defendAttack(Character enemy) {
        int d = enemy.dealAttackDamage();
        this.setHp(this.getHp()-d);
        this.setConfidence(this.getConfidence() - (d/2));
        return d;
    }

    public void Admire(Valuable item){
        this.setConfidence(this.getConfidence() + item.getValue());
    }

    public int getConfidence() {
        return confidence;
    }

    public void setConfidence(int confidence) {
        this.confidence = confidence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public Wieldable getWeapon(){
        return this.weapon;
    }
    public void setWeapon(Wieldable weapon){
        this.weapon = weapon;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}
