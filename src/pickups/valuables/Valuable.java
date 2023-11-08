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
