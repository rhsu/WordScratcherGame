package rhsu.wordScratcher;

import java.util.HashMap;
import java.util.Random;

/**
 *
 * @author rhsu
 */
public class RandomLetters 
{
	final String alphabet = "abcdefghijklmnopqrstuvwxyz";
	final int N = alphabet.length();
	
	private HashMap<Character, Boolean> randomCharacters;
	
	public RandomLetters()
	{
		populateRandomCharacters();
	}
	
	public HashMap<Character, Boolean> getRandomCharacters()
	{
		return randomCharacters;
	}
		
	private void populateRandomCharacters()
	{
		Random r = new Random();
		
		for (int i = 0; i < 18; i++) 
		{
			Character c = alphabet.charAt(r.nextInt(N));
			
			while(randomCharacters.containsKey(c))
			{
				c = alphabet.charAt(r.nextInt(N)); //generate a new key
			}
			
			randomCharacters.put(c, false);
		}
	}
}
