package rhsu.wordScratcher.gameObjects;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;
import rhsu.board.exceptionHandler.ExceptionHandler;

/**
 *
 * @author rhsu
 */
public class Scratcher
{
	private ScratcherBoard crossword;
	private WordList wordList;
	private RandomLetters wordBank;
	
	public Scratcher(String crosswordFilename, 
			String wordListHorizontal, 
			String wordListVertical)
	{
		crossword = new ScratcherBoard(crosswordFilename);
		wordList = new WordList(wordListHorizontal, wordListVertical);
		wordBank = new RandomLetters();
	}
	
	public RandomLetters getWordBank()
	{
		return wordBank;
	}
	
	public ScratcherBoard getCrossword()
	{
		return crossword;
	}
	
	public WordList getWordList()
	{
		return wordList;
	}
}
