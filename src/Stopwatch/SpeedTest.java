package Stopwatch;

import java.io.IOException;


/**
 * Task file for Stopwatch.
 *
 * The methods perform some common tasks involving strings and doubles,
 * to compare speed of using different data types.
 *
 * This class has a lot of duplicate code!
 * Each task method contains the same code for starting the stopwatch,
 * stopping the stopwatch, printing elapsed time, and describing the task
 * (even though the description of each task is different).
 * 
 * Your job is to separate the code that is the same in each method
 * from the code that is different, and restructure it so that 
 * you can re-use the task-timer code that is the same.
 * 
 * When you get done you should have 7 classes:
 * A TaskTimer class (the reusable code) that can time any task
 * 5 task classes that implement Runnable. Each task has a toString that describes the task.
 * A Main class (application) to run the tasks using TaskTimer.
 * 
 * You can define the 5 task classes in the same source file as
 * the Main class or put them in separate files.
 * To define multiple classes in one source file, only one class
 * is declared "public" and the other classes omit the "public".
 */
public class SpeedTest {
	// size of the array used in floating point tasks.
	// Don't make this too big to avoid slowing down test with paging
	// or possible out-of-memory error.
	static final int ARRAY_SIZE = 500000;
	
	
	
	/**
	 * Run the tasks.
	 */
	public static void main(String[] args) throws IOException {

		Runnable result = new AppendToString(50000);
		TaskTimer.prompt(result);
		// same task but with a larger string size (append more chars)
		Runnable result1 = new AppendToString(100000);
		TaskTimer.prompt(result1);
		// do the same thing using StringBuilder.
		Runnable result2 = new AppendToStringBuilder(100000);
		TaskTimer.prompt(result2);		
		// Use a large loop count for floating point tests in order to get accurate times
		int counter = 1000000000; 
		
		Runnable result3 = new TestSumDoublePrimitive(counter,ARRAY_SIZE);
		TaskTimer.prompt(result3);	
		Runnable result4 = new TestSumDouble(counter,ARRAY_SIZE);
		TaskTimer.prompt(result4);
		Runnable result5 = new SumBigDecimal(counter,ARRAY_SIZE);
		TaskTimer.prompt(result5);
	}
}