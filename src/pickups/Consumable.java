package pickups;

public abstract class Consumable extends Pickup{

    private boolean consumed;
    public Consumable(String desc) {
        super(desc);
        this.consumed = false;
    }

    public String toString(){
        return this.getDescription();
    }

    public void Consume() {
        this.consumed = true;
    }

    public boolean getConsumed(){
        return this.consumed;
    }
}
