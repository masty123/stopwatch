package Stopwatch;
/**
 * append chars to a StringBuilder
 * @author Theeruth Borisuth
 * * @version 29.01.2017
 */
public class AppendToStringBuilder implements Runnable
{
	final char character = 'a' ;
	int count = 0 ;
	public AppendToStringBuilder(int count)
	{
		this.count = count ;
				System.out.printf("Append %d chars to StringBuilder\n", count);
	}
	@Override
	
		public void run() 
		{
			StringBuilder builder = new StringBuilder();
			
			for (int i = 0 ; i < count ; i++)
			{
				builder = builder.append(character) ;
			}
			String result = builder.toString();
			System.out.print("final string length = " + result.length());	
		}
	
}
