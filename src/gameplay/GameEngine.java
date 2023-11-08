package gameplay;

import gameplay.characters.Player;

public class GameEngine
{

    public static void main(String[] args)
    {
        //read the World object instance from a text file or literal
        World world = ReadWorldDataFile.basicWorld();

        Player playerOne = new Player("Sir Kendric",100,50);
        world.play(playerOne);
    }

}
