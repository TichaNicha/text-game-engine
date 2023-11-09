package gameplay.characters.monsters;

import gameplay.characters.Monster;

public class Ogre extends Monster {
    public Ogre(String desc, int hp, int appearanceChance, int atkDmg) {
        super(desc, hp, appearanceChance, atkDmg);
    }

    public void talk() {
        // Dialogue messages based on the dialogue counter

        System.out.print("Ogre: ");
        switch (this.getDialogueCounter()) {
            case 0:
                System.out.println("ggrhruahhuh"); // ANOTHER ADVENTURER TRESPASSING IN MY HOUSE!?!
                break;
            case 1:
                System.out.println("ggruuuah?"); // GET OUT!!!
                break;
            case 2:
                System.out.println("gogoruahahaha!"); // If player has a valuable in their inventory "HM? YOU'VE BROUGHT ME A GIFT?" // ogre stops attacking
                // if player doesnt have valuable in their inventory ogre continues attacking "ITS ILLEGAL TO BE IN ONES HOUSE!!"
                break;
            case 3:
                System.out.println("graah!"); // HAHAHA DON'T MIND IF I DO (OGRE TAKES VALUABLE FROM PLAYERS INVENTORY) // ogre stops attacking
                // if player didnt give ogre the valuable "HURRY UP AND LEAVE THIS PLACE!" // OGRE ATTACKS
                break;
            case 4:
                System.out.println("RAAAH"); // STAY AS LONG AS YOU WISH ADVENTURER, CONSIDER IT THANKS FOR THE GIFT // ogre stops attacking
                // if player didnt give ogre the valuable "IM DONE TALKING, TIME TO KILL YOU!" OGRE ATTACKS
                this.setDialogueFinished(true);
                break;
            default:
                System.out.println("The ogre doesn't want to talk..");
                break;
        }

        // Increment the dialogue counter
        this.incrementDialogueCounter();
    }
}
