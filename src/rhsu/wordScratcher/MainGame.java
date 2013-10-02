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
		
		LinkedList<Character> test = game.getCrossword().findAll('c');
		
		System.out.println(test.size());
	}
	
	public static void main(String[] args)
	{
		test2();
	}
}