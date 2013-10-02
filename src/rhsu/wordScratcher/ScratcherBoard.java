package rhsu.wordScratcher;

import java.util.LinkedList;
import rhsu.board.BoardPiece;
import rhsu.board.implementations.CharBoard;

/**
 *
 * @author rhsu
 */
public class ScratcherBoard extends CharBoard
{
	ScratcherBoard(String filename)
	{
		super(filename);
	}
	
	public boolean contains(Character c)
	{
		for(int i = 0; i < this.horizontal_size; i++)
		{
			for(int j = 0; j < this.vertical_size; j++)
			{
				if(this.getValueAt(i, j).equals(c)) return true;
			}
		}
		
		return false;
	}
	
	public LinkedList<BoardPiece<Character>> findAll(Character c)
	{
		LinkedList<BoardPiece<Character>> result = new LinkedList<>();
		
		for(int i = 0; i < this.horizontal_size; i++)
		{
			for(int j = 0; j < this.vertical_size; j++)
			{
				if(this.getValueAt(i, j).equals(c)) result.add(new BoardPiece<>(i, j, c));
			}
		}
		
		return result;
	}
	
	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		
		for(int i = 0; i < this.horizontal_size; i++)
		{
			for(int j = 0; j < this.vertical_size; j++)
			{
				if(this.getValueAt(i, j) == '$')
				{
					builder.append(" ").append(" ");
				}
				else
				{
					builder.append(this.getValueAt(i, j)).append(" ");
				}
			}
			builder.append("\n");
		}
		
		return builder.toString();
	}
}
