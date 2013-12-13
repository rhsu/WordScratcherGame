package rhsu.wordScratcher.gameObjects;

/**
 *
 * @author rhsu
 */
public class ScratcherImpl
{
	private ScratcherBoardImpl crossword;
	private WordListImpl wordList;
	private RandomLettersImpl wordBank;
	
	public ScratcherImpl(String crosswordFilename, 
			String wordListHorizontal, 
			String wordListVertical)
	{
		crossword = new ScratcherBoardImpl(crosswordFilename);
		wordList = new WordListImpl(wordListHorizontal, wordListVertical);
		wordBank = new RandomLettersImpl();
	}
	
	public RandomLettersImpl getWordBank()
	{
		return wordBank;
	}
	
	public ScratcherBoardImpl getCrossword()
	{
		return crossword;
	}
	
	public WordListImpl getWordList()
	{
		return wordList;
	}
}
