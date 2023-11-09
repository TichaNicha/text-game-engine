/**
 * TreasureChest extends Openable and can be unlocked with a key object.
 * @author Nicha Techatassanasoontorn 21139671
 **/
package pickups.openables;

import gameplay.Inventory;
import pickups.Pickup;
import pickups.openers.Key;
import pickups.openers.Opener;

public class TreasureChest extends Openable {
    public TreasureChest(String desc, boolean locked, Inventory pickupContents) {
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
        if (pickup instanceof Key) {
            if (isLocked()) {
                System.out.println("You successfully unlock the treasure chest with a key. The key gets stuck in the hole so you can't use it anymore.");
                System.out.println("It contains: "+this.getPickupContents());
                setLocked(false); // Unlock the chest
                // Add the contents of the chest to the player's inventory
                this.addContentsToInventory(inventory);
            } else {
                System.out.println("The treasure chest is already unlocked.");
            }
        } else {
            System.out.println("You need the correct key to unlock this treasure chest.");
        }
    }
}
