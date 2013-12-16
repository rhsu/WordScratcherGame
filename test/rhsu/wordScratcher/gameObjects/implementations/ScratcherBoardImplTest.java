/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package rhsu.wordScratcher.gameObjects.implementations;

import org.junit.*;
import static org.junit.Assert.*;
import rhsu.board.resources.ResourceRetriever;

/**
 *
 * @author rhsu
 */
public class ScratcherBoardImplTest 
{
	ScratcherBoardImpl test;
    
	public ScratcherBoardImplTest() 
	{
		test = new ScratcherBoardImpl(ResourceRetriever.GetResource
		(
			"testScratcherBoardImpl", "/rhsu/wordScratcher/test/resources/")
		);
    }

	
	@Ignore
	public void testToString() 
	{
		fail("not done yet");
	}

	@Test
	public void testGetHorizontalWords() 
	{	
		String[] expectedResult = { "abc", "de", "f", "g" };
		
		//assertArrayEquals(expectedResult, test.getHorizontalWords());
		
		for(String word : test.getHorizontalWords())
		{
			System.out.println(word);
		}
		
		System.out.println("done");
	}

	@Test
	public void testGetVerticalWords() 
	{
		String[] expectedResult = { "a", "f", "bd", "ceg" };
		//assertArrayEquals(expectedResult, test.getVerticalWords());
		
		for(String word : test.getVerticalWords())
		{
			System.out.println(word);
		}
	}

}