package stopwatch;


/**
 * append an array of Double objects
 * @author Theeruth Borisuth
 * * @version 29.01.2017
 */	
public class TestSumDouble implements Runnable{	
	int counter = 0 ;
	Double [] values ;
	public TestSumDouble(int counter,int ARRAY_SIZE){
			this.counter = counter ;
			this.values = new Double[ARRAY_SIZE];
			for (int i = 0 ; i < ARRAY_SIZE;	i++){
				values[i] = new Double(i+1);
			}
	}
	@Override
		public void run(){
			Double sum = new Double(0.0) ;
			
			for (int count = 0 , i = 0; count < counter ; count++){
				if (i >= values.length) i = 0;  // reuse the array when get to last value
				sum = sum + values[i];
			}
			System.out.print("sum = " + sum);
		}
	public String toString(){
		return String.format("Sum of Double objects  with count=%,d",counter);
	}
}
