package rhsu.wordScratcher.test;

import rhsu.wordScratcher.gameObjects.ScratcherBoard;
import rhsu.wordScratcher.gameObjects.RandomLetters;
import rhsu.wordScratcher.gameObjects.Scratcher;
import java.util.LinkedList;
import rhsu.board.BoardPiece;
import rhsu.wordScratcher.gui.TerminalApp;

/**
 *
 * @author rhsu
 */
public class Main 
{
	public static void scratcherGame()
	{
		TerminalApp app = new TerminalApp();
		app.playGame();
	}
	
	public static void main(String[] args)
	{
		scratcherGame();
	}
}