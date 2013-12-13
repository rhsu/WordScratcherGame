package rhsu.wordScratcher.gameObjects;

public interface Scratcher 
{
	public RandomLetters getWordBank();
	public ScratcherBoard getCrossword();
	public WordList getWordList();
}
