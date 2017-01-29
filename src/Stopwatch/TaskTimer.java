package Stopwatch;
/**
 * A Stopwatch that measures elapsed time between a starting time
 * and stopping time, or until the present time.
 * @author Theeruth Borisuth
 * @version 29.01.2017
 * @since 27.01. 2017
 */
public class TaskTimer {
	public static void prompt(Runnable outp)
	{
		Stopwatch timer = new Stopwatch();
		timer.start();
		outp.run();
		timer.stop();
		System.out.printf("\nElapsed time %.3f sec\n\n",timer.getElapsed());
	}


}
