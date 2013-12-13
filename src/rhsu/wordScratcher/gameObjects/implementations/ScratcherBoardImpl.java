package rhsu.wordScratcher.gameObjects.implementations;

import java.io.BufferedReader;
import rhsu.board.implementations.CharBoard;
import rhsu.wordScratcher.gameObjects.ScratcherBoard;

/**
 *
 * @author rhsu
 */
public class ScratcherBoardImpl
	extends CharBoard
	implements ScratcherBoard<Character>
{
	public ScratcherBoardImpl(String filename)
	{
		super(filename);
	}
	
	public ScratcherBoardImpl(BufferedReader bufferedReader)
	{
		super(bufferedReader);
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
	
	@Override
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
	
	@Override
	public String[] getVerticalWords()
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
