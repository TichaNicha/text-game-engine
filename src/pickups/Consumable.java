/**
 * Consumable extends Pickup and has a variable keeping track of consumption.
 * @author Nicha Techatassanasoontorn 21139671
 **/
package pickups;

public abstract class Consumable extends Pickup{

    private boolean consumed;
    public Consumable(String desc) {
        super(desc);
        this.consumed = false;
    }

    public void Consume() {
        this.consumed = true;
    }

    public boolean getConsumed(){
        return this.consumed;
    }
}
