/**
 * Opener is an abstract class and extends the pickup class
 * @author Nicha Techatassanasoontorn 21139671
 **/

package pickups.openers;

import pickups.Pickup;

public abstract class Opener extends Pickup {
    public Opener(String desc) {
        super(desc);
    }
}
