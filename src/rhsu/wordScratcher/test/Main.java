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
	public static void test()
	{		
		ScratcherBoard board = new ScratcherBoard("Crossword1.txt");
	}
	
	public static void test2()
	{
		Scratcher game = new Scratcher("Crossword1.txt", "Crossword1WordList.txt");
		
		LinkedList<BoardPiece<Character>> test = game.getCrossword().findAll('$');
		
		System.out.println(test.size());
	}
	
	public static void testRandomLetters()
	{
		RandomLetters test = new RandomLetters();
		
		while(test.revealNextLetter())
		{
			System.out.println(test);
		}
	}
	
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