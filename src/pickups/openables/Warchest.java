package pickups.openables;

import gameplay.Inventory;
import pickups.Pickup;
import pickups.openers.Lockpick;
import pickups.openers.Opener;

public class Warchest extends Openable{
    public Warchest(String desc, boolean locked, Inventory pickupContents) {
        super(desc, locked, pickupContents);
    }

    public void addContentsToInventory(Inventory inventory) {
        // Add the contents of the chest to the provided inventory
        for (Pickup content : this.getPickupContents().getItems()) {
            if (content != null) {
                inventory.add(content);
            }
        }
    }


    @Override
    public void unlockWith(Opener pickup, Inventory inventory) {
        if (pickup instanceof Lockpick) {
            if (isLocked()) {
                System.out.println("You successfully unlock the warchest, however you broke a lockpick in the process.");
                System.out.println("It contains: "+this.getPickupContents());
                setLocked(false); // Unlock the chest
                // Add the contents of the chest to the player's inventory
                this.addContentsToInventory(inventory);

            } else {
                System.out.println("The warchest is already unlocked.");
            }
        } else {
            System.out.println("You need a lockpick to unlock this warchest.");
        }
    }

}
