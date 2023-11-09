/**
 * ReadWorldDataFile is a class that reads a txt file and parses it using the gamemap_grammar to create a game map
 * @author Nicha Techatassanasoontorn 21139671
 **/
package gameplay;

import gamemap_grammar.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import gamemap_grammar.GameMapParser;
import gamemap_grammar.GameMapParser.GamemapContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadWorldDataFile {

    /**
     * Static method to read a text file containing
     * a basic World to be played by the Game Engine
     */
    public static World basicWorld() {
        // Read your game map data from a text file
        String gameMapData = readTxt("src/gameplay/game_map.txt");

        // Create a lexer and parser for your grammar
        GameMapLexer lexer = new GameMapLexer(CharStreams.fromString(gameMapData));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GameMapParser parser = new GameMapParser(tokens);

        // Attach your listener to the parser to process the parsed data
        MyGameMapListener listener = new MyGameMapListener();
        parser.addParseListener(listener);
        ParseTreeWalker walker = new ParseTreeWalker();

        walker.walk(listener, parser.gamemap());

        // Get the constructed World object
        World world = listener.getWorld();

        return world;
    }

    private static String readTxt(String fileName) {
        try {
            // Create a FileReader to read the text file
            FileReader fileReader = new FileReader(fileName);

            // Create a BufferedReader to read lines from the FileReader
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Initialize a StringBuilder to store the contents of the file
            StringBuilder gameMapData = new StringBuilder();
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                // Append each line to the StringBuilder
                gameMapData.append(line).append("\n");
            }

            // Close the BufferedReader and FileReader
            bufferedReader.close();
            fileReader.close();

            return gameMapData.toString();
        } catch (IOException e) {
            // Handle any IOException that might occur (e.g., file not found)
            e.printStackTrace();
        }

        return "file read error!";
    }
}
