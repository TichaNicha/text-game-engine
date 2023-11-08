package pickups.wieldables;

import pickups.Pickup;

public abstract class Wieldable extends Pickup {

    private int high;
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
