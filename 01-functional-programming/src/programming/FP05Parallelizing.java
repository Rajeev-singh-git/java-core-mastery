package programming;

import java.util.stream.LongStream;

public class FP05Parallelizing {
	
	/*Utilizing efficiency of multicore processor, which these days our laptop has
	 * IWhat parallel does it break list into many sub list and do parallel processing
	 * on each one of them
	 *  */
	
	
	
	public static void main(String[] args) {
		
		Long time = System.currentTimeMillis();
		
		//System.out.println(LongStream.range(0,100000000).sum());// time taken without parallel processing 285 millisecond
		
		System.out.println(LongStream.range(0,100000000).parallel().sum()); // // time taken with parallel processing 52 millisecond
		
		
		System.out.println(System.currentTimeMillis()-time); 
		
		
		
		
		
	}
	

}
