/**
 * Food is a class that stores an int representing its hp restored once eaten
 * @author Nicha Techatassanasoontorn 21139671
 **/
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
