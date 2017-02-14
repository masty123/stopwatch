package stopwatch;
/**
 * append an array of Double Primitive
 * @author Theeruth Borisuth
 * * @version 29.01.2017
 */
public class TestSumDoublePrimitive implements Runnable {
	double [] values ;
	int counter = 0 ;
	public TestSumDoublePrimitive(int counter,int ARRAY_SIZE){
			this.counter = counter ;
			this.values = new double[ARRAY_SIZE];
			for (int k = 0 ; k < ARRAY_SIZE;	k++){
				values[k] = k+1;
			}
	}
	@Override
		public void run(){
			double sum = 0.0 ;
			for (int count = 0 , i = 0; count < counter ; count++){
				if (i >= values.length) i = 0;  // reuse the array when get to last value
				sum = sum + values[i];
			}
			System.out.print("sum = " + sum);
		}
	public String toString(){
		return String.format("Sum of double primitives with count=%,d\n", counter);
	}

}
