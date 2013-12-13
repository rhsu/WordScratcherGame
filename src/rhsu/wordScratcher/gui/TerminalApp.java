package rhsu.wordScratcher.gui;

import java.util.Arrays;
import rhsu.wordScratcher.gameObjects.implementations.ScratcherImpl;
import java.util.List;
import java.util.Scanner;
import rhsu.board.BoardPiece;
import static rhsu.wordScratcher.UtilityFunctions;

/**
 *
 * @author rhsu
 */
public class TerminalApp
{
	private ScratcherImpl scratcher;
	private Scanner scanner;
	private boolean debugMode;
	
	public TerminalApp(boolean debugMode)
	{
		this();
		this.debugMode = debugMode;
	}
	
	public TerminalApp()
	{
		this.scratcher = new ScratcherImpl(
				"Crossword1.txt", 
				"Crossword1WordListHorizontal.txt", 
				"Crossword1WordListVertical.txt");
		this.scanner = new Scanner(System.in);
		this.debugMode = false;
	}
		
	public void playGame()
	{
		print("Welcome to Scracther game.");
		println();
		print(scratcher.getCrossword());
		print(scratcher.getWordList());
		println();
		print(scratcher.getWordBank());	
		
		while(scratcher.getWordBank().revealNextLetter())
		{
			uncoverLetterPrompt();
		}
		
		endGamePrompt();
		print("Game Over");
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
		
		List<BoardPiece<Character>> results = scratcher.getCrossword().findAll(recent);
		
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
		String[] uncoveredWordsHorizontal;
		String[] uncoveredWordsVertical;
		
		int numMatches = 0;
		
		uncoveredWordsHorizontal = scratcher.getCrossword().getHorizontalWords();
		uncoveredWordsVertical = scratcher.getCrossword().getVerticalWords();
		
		for(String word : scratcher.getWordList().getHorizontalWords())
		{
			if(Arrays.asList(uncoveredWordsHorizontal).contains(word))
			{
				print("Match!: " + word);
				numMatches++;
			}
		}
		
		for(String word : scratcher.getWordList().getVeritcalWords())
		{
			if(Arrays.asList(uncoveredWordsVertical).contains(word))
			{
				print("Match!: " + word);
				numMatches++;
			}
		}
		
		print(determineScorePrompt(numMatches));
	}
	
	private int determineScorePrompt(int score)
	{	
		switch(score)
		{
			case 3: 
				return 3;
			case 4: 
				return 6;
			case 5: 
				return 18;
			case 6: 
				return 20;
			case 7: 
				return 50;
			case 8: 
				return 100;
			case 9: 
				return 500;
			case 10: 
				return 5000;
			case 11: 
				return 50000;
		}
		
		return 0;
	}
}
