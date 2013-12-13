package rhsu.wordScratcher.gameObjects;

import java.util.LinkedList;
import rhsu.board.BoardPiece;
import rhsu.board.implementations.CharBoard;

/**
 *
 * @author rhsu
 */
public class ScratcherBoardImpl extends CharBoard
{
	public ScratcherBoardImpl(String filename)
	{
		super(filename);
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
	
	public String[] getHorizontalWords()
	{
		StringBuilder builder = new StringBuilder();
		
		for(int x = 0; x < this.horizontal_size; x++)
		{	
			for(int y = 0; y < this.vertical_size; y++)
			{
				builder.append(this.getValueAt(x, y));
			}
			
			builder.append("$");
		}
		
		return builder.toString().split("\\$");
	}
	
	public String[] getVeritcalWords()
	{
		StringBuilder builder = new StringBuilder();
		
		for(int x = 0; x < this.horizontal_size; x++)
		{	
			for(int y = 0; y < this.vertical_size; y++)
			{
				builder.append(this.getValueAt(y, x));
			}
			
			builder.append("$");
		}
		
		return builder.toString().split("\\$");
	}
}
