package stopwatch;
import java.util.Scanner;
/**
* A Stopwatch that measures elapsed time between a starting time
* and stopping time, or until the present time.
* @author Theeruth Borisuth
* @version 1.0
*/
public class Stopwatch {
	static Scanner input = new Scanner(System.in);
	/** constant for converting nanoseconds to seconds. */
	private static final double NANOSECONDS = 1.0E-9;
	/** time that the stopwatch was started, in nanoseconds. */
	private long startTime;
	/** time that stopwatch was stooped, in nanoseconds.*/
	private long stopTime;
	/**duration between startingtime and stoppedtime*/
	private long  elapsedtime ;
	/*like a start/stop button.*/
	private boolean isStart = false ;		
	public Stopwatch()
	{}
	/** @return isRunning is to check if stopwatch is running or not.*/
    public boolean isRunning(){
    	return isStart;
    }
    /**@return the durtion of stopwatch in seconds*/
    /**Start the stopwatch.*/
	public void start() {	
		if (!isStart) {
			isStart = true ;
			startTime = System.nanoTime();	
		} 
	}
	/**Stop the stopwatch*/
	public void stop(){	
		if(isStart){
			isStart = false ;
			stopTime = System.nanoTime();
			elapsedtime = stopTime - startTime ;	
		}
	}
	public double getElapsed(){
		if (isStart){
			return  (System.nanoTime()-stopTime)*NANOSECONDS;
		}
		return  elapsedtime*NANOSECONDS;
	}
}


