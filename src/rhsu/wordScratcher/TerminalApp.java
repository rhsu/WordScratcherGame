package rhsu.wordScratcher;

import java.util.Scanner;

/**
 *
 * @author rhsu
 */
public class TerminalApp 
{
	private Scratcher scratcher;
	private Scanner scanner;
	
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
	
	public TerminalApp()
	{
		scratcher = new Scratcher("Crossword1.txt", "Crossword1WordList.txt");
		scanner = new Scanner(System.in);
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
	}
	
	public void uncoverLetterPrompt()
	{
		print("Press enter to uncover a letter");
		
		scanner.nextLine();
		
		print("Printing the word bank");
		printBreaks();
		
		print(scratcher.getWordBank());
		print("Marking... the crossword puzzle");
		printBreaks();
		
	}
}
