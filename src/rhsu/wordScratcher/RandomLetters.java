package rhsu.wordScratcher;

import java.util.LinkedList;
import java.util.Random;

/**
 *
 * @author rhsu
 */
public class RandomLetters 
{
	//final String alphabet = "AAAAABCDEEEEEFGHIIIIIIJKLMNOOOOOPQRSTUUUUUVWXYZ";
	final String alphabet = "abcdefghijklmnopqrstuvwxyz";
	final int N = alphabet.length();

	private LinkedList<Character> randomCharacterList;
	
	public RandomLetters()
	{
		randomCharacterList = new LinkedList<>();
		populateRandomCharacters();
	}
	
	public LinkedList<Character> getRandomCharacters()
	{
		return randomCharacterList;
	}
			
	private void populateRandomCharacters()
	{
		Random r = new Random();
		
		for (int i = 0; i < 18; i++) 
		{
			Character c = alphabet.charAt(r.nextInt(N));
			
			while(randomCharacterList.contains(c))
			{
				c = alphabet.charAt(r.nextInt(N));
			}
				
			randomCharacterList.add(c);
		}
	}
}
