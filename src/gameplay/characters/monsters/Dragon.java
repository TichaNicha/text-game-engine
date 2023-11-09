package gameplay.characters.monsters;

import gameplay.characters.Monster;

public class Dragon extends Monster {
    public Dragon(String desc, int hp, int appearanceChance, int atkDmg) {
        super(desc, hp, appearanceChance, atkDmg);
    }

    public void talk() {
        // Dialogue messages based on the dialogue counter

        System.out.print("Dragon: ");
        switch (this.getDialogueCounter()) {
            case 0:
                System.out.println("You have courage to face me adventurer. Unfortunately courage won't save you."); //
                break;
            case 1:
                System.out.println("Your life ends here. There is no escape from my wrath.");
                break;
            case 2:
                System.out.println("I will enjoy adding your bones to my collection. Any last words?"); // If the player doesn't have a valuable in their inventory
                break;
            case 3:
                System.out.println("You'll serve as a warning for all those who challenge me"); // If the player didn't give ogre the valuable
                break;
            case 4:
                System.out.println("This conversation is meaningless.");
                this.setDialogueFinished(true);
                this.setContinueAttacking(true);
                break;
            default:
                System.out.println("Nothing you say will save you.");
                break;
        }

        // Increment the dialogue counter
        this.incrementDialogueCounter();
    }
}
