package rhsu.wordScratcher;

import java.util.Random;

/**
 *
 * @author rhsu
 */
public class RandomLetters 
{
	final String alphabet = "abcdefghijklmnopqrstuvwxyz";
	final int N = alphabet.length();

	private String randomCharacters = "";
	
	public RandomLetters()
	{
		populateRandomCharacters();
	}
	
	public String getTest()
	{
		return randomCharacters;
	}
		
	private void populateRandomCharacters()
	{
		Random r = new Random();
		
		for (int i = 0; i < 18; i++) 
		{
			Character c = alphabet.charAt(r.nextInt(N));
			
			while(randomCharacters.contains(c.toString()))
			{
				c = alphabet.charAt(r.nextInt(N));
			}
				
			randomCharacters += c;
		}
	}
}
