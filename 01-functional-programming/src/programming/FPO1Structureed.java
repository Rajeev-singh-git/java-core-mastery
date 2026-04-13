package programming;

import java.util.List;

public class FPO1Structureed {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(12,9,18,16,12,36);
		printAllNubersInStructured(numbers);
		printAllEvenNubersInStructured(numbers);
	}

	private static void printAllNubersInStructured(List<Integer> numbers) {
		// Our focus is  =  How to loop the numbers?
		for(int number:numbers) {
			System.out.println(number);
		}
	}
	
	private static void printAllEvenNubersInStructured(List<Integer> numbers) {
		// Our focus is  =  How to loop the numbers?
		for(int number:numbers) {
			if(number%2==0)
			System.out.println(number);
		}
	}

}
