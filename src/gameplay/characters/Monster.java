package gameplay.characters;

public class Monster extends Character{

    private int appearanceChance;
    private int atkDmg;

    public Monster(String desc, int hp, int appearanceChance, int atkDmg) {
        super(desc, hp);
        this.appearanceChance = appearanceChance;
        this.atkDmg = atkDmg;
    }
    @Override
    protected int dealAttackDamage() {
        int r = getRandomInt(1,11);
        return atkDmg+r;
    }

    @Override
    public int defendAttack(Character enemy) {
        int d = enemy.dealAttackDamage();
        // set new hp to old hp - d
        this.setHp(this.getHp()-d);
        return d;
    }

    public boolean appear(){
        // if monster's hp is less than 0, return false
        if (this.getHp() <= 0) {
            return false;
        } else{
            // generate random num btwn 1-100 and compare with appearance chance
            int num = getRandomInt(1,101);
            return num <= this.getAppearanceChance();
        }
    }

    public int getAppearanceChance() {
        return appearanceChance;
    }

    public int getAtkDmg() {
        return atkDmg;
    }

    public void setAtkDmg(int atkDmg) {
        this.atkDmg = atkDmg;
    }
}
