/**
 * Wieldable has a low and high value. When the user attacks a random value is returned between the low and high value.
 * @author Nicha Techatassanasoontorn 21139671
 **/
package pickups.wieldables;

import pickups.Pickup;

public abstract class Wieldable extends Pickup {

    private int high;

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public int getLow() {
        return low;
    }

    public void setLow(int low) {
        this.low = low;
    }

    private int low;
    public Wieldable(String desc, int low, int high) {
        super(desc);
        if (high < low) {
            throw new IllegalArgumentException("High value must be greater than low value.");
        }
        this.high = high;
        this.low=low;
    }

    public int hit(){
        return getRandomInt(low, high);
    }
}
