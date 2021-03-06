package rhsu.wordScratcher.gameObjects;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author rhsu
 */
public class RandomLetters extends HashMap<Character, Boolean>
{
	final String alphabet = "abcdefghijklmnopqrstuvwxyz";
	final int N = alphabet.length();
	
	private Iterator iterator;
	private char recent = ' ';
	
	public RandomLetters()
	{
		populateRandomLetters();
		iterator = this.entrySet().iterator();
	}
	
	public char getRecent()
	{
		return recent;
	}
	
	private void populateRandomLetters()
	{
		Random r = new Random();
		
		for (int i = 0; i < 18; i++) 
		{
			Character c = alphabet.charAt(r.nextInt(N));
			
			while(this.containsKey(c))
			{
				c = alphabet.charAt(r.nextInt(N)); //generate a new key
			}
			
			this.put(c, false);
		}
	}
	
	public boolean revealNextLetter()
	{
		if(iterator.hasNext())
		{
			Map.Entry<Character, Boolean> entry = (Map.Entry) iterator.next();
			entry.setValue(true);
			recent = entry.getKey();
			return true;
		}
		return false;
	}
	
	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		
		for(Map.Entry<Character, Boolean> entry : this.entrySet())
		{
			//if visible
			if(entry.getValue())
			{
				builder.append(entry.getKey()).append(" ");
			}
		}
		
		return "".equals(builder.toString()) ? "There are no visible letters" : builder.toString();
	}
}
