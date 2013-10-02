package rhsu.wordScratcher;

import java.util.LinkedList;

/**
 *
 * @author rhsu
 */
public class MainGame 
{
	public static void test()
	{		
		ScratcherBoard board = new ScratcherBoard("Crossword1.txt");
	}
	
	public static void test2()
	{
		Scratcher game = new Scratcher("Crossword1.txt", "Crossword1WordList.txt");
		
		LinkedList<Character> test = game.getCrossword().findAll('$');
		
		System.out.println(test.size());
	}
	
	public static void testRandomLetters()
	{
		RandomLetters test = new RandomLetters();
		
		System.out.println(test);
		
		test.revealNextLetter();
		
		System.out.println(test);
		
		test.revealNextLetter();
		
		System.out.println(test);
	}
	
	public static void main(String[] args)
	{
		testRandomLetters();
	}
}