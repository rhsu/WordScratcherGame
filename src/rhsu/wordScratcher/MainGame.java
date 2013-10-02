package rhsu.wordScratcher;

/**
 *
 * @author rhsu
 */
public class MainGame 
{
	public static void test()
	{		
		ScratcherBoard board = new ScratcherBoard("Crossword1.txt");
		
		System.out.println(board);
	}
	
	public static void main(String[] args)
	{
		Scratcher game = new Scratcher("Crossword1.txt", "Crossword1WordList.txt");
		
		RandomLetters letters = new RandomLetters();
		
		System.out.println(letters.getTest());
	}
}