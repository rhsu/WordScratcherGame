package rhsu.wordScratcher.gameObjects;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author rhsu
 */
public class RandomLettersImpl extends HashMap<Character, Boolean>
{
	final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
	final int N = ALPHABET.length();
	
	private Iterator iterator;
	private char recent = ' ';
	
	public RandomLettersImpl()
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
		Random random = new Random();
		
		for (int i = 0; i < 18; i++) 
		{
			Character c = ALPHABET.charAt(random.nextInt(N));
			
			//while this character already exists, populate a new key.
			while(this.containsKey(c))
			{
				//generate a new key
				c = ALPHABET.charAt(random.nextInt(N)); 
			}
			
			//add the character to the structure and set its visibility to false
			this.put(c, false);
		}
	}
	
	/**
	 * Iterates through the structure. If there is a next letter, then sets
	 * that letter's visibility to true.
	 * @return True if there exists a next element
	 */
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
				builder.append(String.format("%s ", entry.getKey()));
			}
		}
		
		return "".equals(builder.toString())  
				? "There are no visible letters" 
				: builder.toString();
	}
}
