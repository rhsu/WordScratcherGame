package rhsu.wordScratcher.gameObjects.implementations;

import rhsu.wordScratcher.gameObjects.RandomLetters;
import rhsu.wordScratcher.gameObjects.Scratcher;
import rhsu.wordScratcher.gameObjects.ScratcherBoard;
import rhsu.wordScratcher.gameObjects.WordList;

/**
 *
 * @author rhsu
 */
public class ScratcherImpl implements Scratcher
{
	private ScratcherBoard crossword;
	private WordList wordList;
	private RandomLetters wordBank;
	
	public ScratcherImpl(String crosswordFilename, 
			String wordListHorizontal, 
			String wordListVertical)
	{
		crossword = new ScratcherBoardImpl(crosswordFilename);
		wordList = new WordListImpl(wordListHorizontal, wordListVertical);
		wordBank = new RandomLettersImpl();
	}
	
	@Override
	public RandomLetters getWordBank()
	{
		return wordBank;
	}
	
	@Override
	public ScratcherBoard getCrossword()
	{
		return crossword;
	}
	
	@Override
	public WordList getWordList()
	{
		return wordList;
	}
}
