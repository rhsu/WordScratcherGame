package rhsu.wordScratcher.test;

import rhsu.wordScratcher.gameObjects.*;
import rhsu.wordScratcher.gui.*;
import java.util.LinkedList;
import rhsu.board.*;

/**
 *
 * @author rhsu
 */
public class Main 
{
	public static void scratcherGame()
	{
		TerminalApp app = new TerminalApp(true);
		app.playGame();
	}
	
	public static void main(String[] args)
	{
		scratcherGame();
	}
}