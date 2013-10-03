package rhsu.wordScratcher.gui;

import rhsu.wordScratcher.gameObjects.Scratcher;
import java.util.LinkedList;
import java.util.Scanner;
import rhsu.board.BoardPiece;

/**
 *
 * @author rhsu
 */
public class TerminalApp 
{
	private Scratcher scratcher;
	private Scanner scanner;
	private boolean debugMode;
	
	public TerminalApp(boolean debugMode)
	{
		this();
		this.debugMode = debugMode;
	}
	
	public TerminalApp()
	{
		this.scratcher = new Scratcher("Crossword1.txt", 
				"Crossword1WordListHorizontal.txt", 
				"Crossword1WordListVertical.txt");
		this.scanner = new Scanner(System.in);
		this.debugMode = false;
	}
	
	private static void printBreaks()
	{
		print("...");
		print("...");
		print("...");
	}
	
	private static void print(Object o)
	{
		System.out.println(o);
	}
	
	private static void println()
	{
		System.out.println();
	}
		
	public void playGame()
	{
		print("Scracther game.");
		print(scratcher.getCrossword());
		print(scratcher.getWordList());
		println();
		print(scratcher.getWordBank());	
		
		while(scratcher.getWordBank().revealNextLetter())
		{
			uncoverLetterPrompt();
		}
		
		endGamePrompt();
	}
		
	private void uncoverLetterPrompt()
	{
		print("Press enter to uncover a letter");
		
		if(!debugMode) scanner.nextLine();
		
		print("Printing the word bank");
		printBreaks();
		
		print(scratcher.getWordBank());

		markCrosswordPuzzle();
	}
	
	private void markCrosswordPuzzle()
	{
		print("Marking... the crossword puzzle");
		printBreaks();
		
		char recent = scratcher.getWordBank().getRecent();
		
		LinkedList<BoardPiece<Character>> results = scratcher.getCrossword().findAll(recent);
		
		if(results.isEmpty())
		{
			print("No match.");
		}
		else
		{
			for(BoardPiece<Character> item : results)
			{
				int i = item.getHorizontal();
				int j = item.getVertical();
				scratcher.getCrossword().setValueAt(i, j, Character.toUpperCase(recent));
			}
		}
		
		print(scratcher.getCrossword());
	}
	
	private void endGamePrompt()
	{
		print("Game Over");
	}
}
