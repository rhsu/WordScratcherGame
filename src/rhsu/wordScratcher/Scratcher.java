package rhsu.wordScratcher;

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
	protected ScratcherBoard crossword;
	protected LinkedList<String> wordList;
	
	public ScratcherBoard getCrossword()
	{
		return crossword;
	}
	
	public LinkedList<String> getWordList()
	{
		return wordList;
	}
	
	public Scratcher(String crosswordFilename, String wordlistFilename)
	{
		crossword = new ScratcherBoard(crosswordFilename);
		wordList = getWordList(wordlistFilename);
	}
	
	private LinkedList<String> getWordList(String wordlistFilename)
	{
		LinkedList<String> listOfWords = new LinkedList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(wordlistFilename)))
		{
			String line;
			while ((line = br.readLine()) != null)
			{
				listOfWords.add(line);
			}
		}
		catch(Exception ex)
		{
			ExceptionHandler.Handle(ex);
		}
		
		return listOfWords;
	}
}