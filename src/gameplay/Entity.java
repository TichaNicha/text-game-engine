/**
 * An abstract class with fields for description and id.
 * Has functions to generate a random number and compare ids (ignoring case).
 * @author Nicha Techatassanasoontorn 21139671
 **/
package gameplay;

import java.util.Random;

public abstract class Entity {

    private String description;
    private String id;

    // Constructor
    public Entity(String desc){
        this.description = desc;
        this.id = this.getClass().getSimpleName();
    }

    // Returns a random int between x and y (inclusive to x and exclusive to y)
    protected int getRandomInt(int x, int y){
        return new Random().nextInt(y-x) + x;
    }

    // Compares ids. Returns 0 if equal.
    protected boolean compareID(String otherID){
        if (this.getId().compareToIgnoreCase(otherID) == 0){
            return true;
        } else{
            return false;
        }
    }

    public String toString(){
        return this.getId();
    }

    // Getters and Setters
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id){
        this.id = id;
    }
}
