package Stopwatch;
/**
 * Append chars to a string.
 * @author Theeruth Borisuth
 ** @version 29.01.2017
 */
public class AppendToString implements Runnable {
	final char character = 'a' ;
	int count = 0 ;
	
	public AppendToString(int count)
	{
		this.count = count ;
		System.out.printf("Append %d chars to String\n",count);

	}
	
	

	@Override
	public void run() 
	{
		String result = "";
		
		for (int i = 0 ; i < count ; i++)
		{
			result = result  + character ;
		}
			System.out.print("final string length = " + result.length());	
		
	}

	}

