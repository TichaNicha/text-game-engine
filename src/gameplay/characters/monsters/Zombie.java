package gameplay.characters.monsters;

import gameplay.characters.Monster;

public class Zombie extends Monster {
    public Zombie(String desc, int hp, int appearanceChance, int atkDmg) {
        super(desc, hp, appearanceChance, atkDmg);
    }

    public void talk() {
        // Dialogue messages based on the dialogue counter

        System.out.print("Zombie: ");
        switch (this.getDialogueCounter()) {
            case 0:
                System.out.println("ggrhruahhuh"); // zombie noises
                break;
            case 1:
                System.out.println("ggruuuah?"); // more zombie nosies
                break;
            case 2:
                System.out.println("gogoruahahaha!"); // more zombie noises
                break;
            case 3:
                System.out.println("graah!"); // happy zombie noises
                break;
            case 4:
                System.out.println(">:( (The zombie runs away looking very angry.. What did you say?)"); // smiley face :)
                this.setDialogueFinished(true);
                this.setContinueAttacking(false);
                break;
            default:
                System.out.println("...");
                break;
        }

        // Increment the dialogue counter
        this.incrementDialogueCounter();
    }

    }