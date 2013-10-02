package rhsu.wordScratcher;

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
