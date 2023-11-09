/**
 * Character class contains basic attack/defend functions
 * @author Nicha Techatassanasoontorn 21139671
 **/
package gameplay.characters;

import gameplay.Entity;

public abstract class Character extends Entity {
    private int hp;

    public Character(String desc, int hp){
        super(desc);
        if (hp > 0){
            this.hp = hp;
        } else{
            System.out.println("Invalid hp: "+ hp);
        }
    }

    protected abstract int dealAttackDamage();
    public abstract int defendAttack(Character enemy);

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
