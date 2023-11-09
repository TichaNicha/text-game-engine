package gameplay.characters.monsters;

import gameplay.Inventory;
import gameplay.characters.Monster;
import gameplay.characters.Player;
import pickups.valuables.Valuable;

public class Ogre extends Monster {
    public Ogre(String desc, int hp, int appearanceChance, int atkDmg) {
        super(desc, hp, appearanceChance, atkDmg);
    }

    public void talk() {
        // Dialogue messages based on the dialogue counter

        System.out.print("Ogre: ");
        switch (this.getDialogueCounter()) {
            case 0:
                System.out.println("ANOTHER ADVENTURER TRESPASSING IN MY HOUSE!?! (Ogre grumbles)");
                break;
            case 1:
                System.out.println("GET OUT!!! (Ogre's voice booms)");
                break;
            case 2:
                System.out.println("ITS ILLEGAL TO BE IN ONE'S HOUSE!! (Ogre continues attacking)"); // If the player doesn't have a valuable in their inventory
                break;
            case 3:
                System.out.println("HURRY UP AND LEAVE THIS PLACE!"); // If the player didn't give ogre the valuable
                break;
            case 4:
                System.out.println("IM DONE TALKING, TIME TO KILL YOU! (Ogre gets furious and attacks)");
                this.setDialogueFinished(true);
                this.setContinueAttacking(true);
                break;
            default:
                System.out.println("The ogre doesn't want to talk anymore...");
                break;
        }

        // Increment the dialogue counter
        this.incrementDialogueCounter();
    }
}
