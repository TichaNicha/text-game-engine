/**
 * Openable is an abstract class describing an openable object that can be unlocked and its pickup contents can be returned
 * @author Nicha Techatassanasoontorn 21139671
 **/
package pickups.openables;

import gameplay.Inventory;
import pickups.Pickup;
import pickups.openers.Opener;

public abstract class Openable extends Pickup {
    private boolean locked;
    private Inventory pickupContents;

    public Openable(String desc, boolean locked, Inventory pickupContents) {
        super(desc);
        this.locked = locked;
        this.pickupContents = pickupContents;
    }

    public abstract void unlockWith(Opener pickup, Inventory inventory);

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public Inventory getPickupContents() {
        return pickupContents;
    }
}

