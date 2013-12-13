package rhsu.wordScratcher.gameObjects;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;
import rhsu.board.exceptionHandler.ExceptionHandler;

/**
 *
 * @author rhsu
 */
public class WordListImpl 
{
	private LinkedList<String> HorizontalWords;
	private LinkedList<String> VerticalWords;
	
	public WordListImpl(String horizontalFile, String verticalFile)
	{
		HorizontalWords = populateWords(horizontalFile);
		VerticalWords = populateWords(verticalFile);
	}
	
	public LinkedList<String> getHorizontalWords()
	{
		return HorizontalWords;
	}
	
	public LinkedList<String> getVeritcalWords()
	{
		return VerticalWords;
	}
	
	private LinkedList<String> populateWords(String file)
	{
		LinkedList<String> result = new LinkedList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(file)))
		{
			String line;
			while ((line = br.readLine()) != null)
			{
				result.add(line);
			}
		}
		catch(Exception ex)
		{
			ExceptionHandler.Handle(ex);
		}
		
		return result;
	}
	
	@Override
	public String toString()
	{
		StringBuilder stringBuilder = new StringBuilder();
		
		for(String word : HorizontalWords)
		{
			stringBuilder.append(word).append("\n");
		}
		
		for(String word : VerticalWords)
		{
			stringBuilder.append(word).append("\n");
		}
		
		return stringBuilder.toString();
	}
}
