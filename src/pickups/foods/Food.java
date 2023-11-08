package pickups.foods;

import pickups.Consumable;

public abstract class Food extends Consumable {
    private int hpRestored;

    public Food(String desc, int hpRestored) {
        super(desc);
        this.hpRestored = hpRestored;
    }

    public int getHpRestored(){
        return this.hpRestored;
    }
}
