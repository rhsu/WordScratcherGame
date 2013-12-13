package rhsu.wordScratcher.gameObjects;

import rhsu.board.Board;

/**
 *
 * @author rhsu
 */
public interface ScratcherBoard<Character> extends Board<Character>
{
	public String[] getHorizontalWords();
	public String[] getVerticalWords();
}
