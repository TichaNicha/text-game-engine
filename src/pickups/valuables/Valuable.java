/**
 * Valuable is a class that stores the valuable variable of an object.
 * @author Nicha Techatassanasoontorn 21139671
 **/
package pickups.valuables;

import pickups.Consumable;

public abstract class Valuable extends Consumable {

    private int value;
    public Valuable(String desc, int value) {
        super(desc);
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
