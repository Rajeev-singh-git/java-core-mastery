package programming;

import java.util.List;

public class FPO1Functional {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(12,9,18,16,12,36,39);
		System.out.println("All Numbers ");
		printAllNumbersInFunctional(numbers);
		System.out.println("Even Numbers only");
		printAllEvenNumbersInFunctional(numbers);
		System.out.println("Square of Even Numbers only");
		printSquareOfEvenNumbers(numbers);
		System.out.println("Odd Numbers only");
		printAllOddNumbersInFunctional(numbers);
		System.out.println("Cubes of Numbers Numbers only");
		printCubeOfOddNumbers(numbers);
		
	} 

   private static void printAllNumbersInFunctional(List<Integer> numbers) {
		//Our focus is  =  What to do?
		numbers.stream()
		.forEach(System.out::println); //Method Reference
	}
	
	private static void printAllEvenNumbersInFunctional(List<Integer> numbers) {
		//Our focus is  =  What to do?
		numbers.stream()
		  .filter(number -> number%2 ==0)  //Lambda Expression
		  .forEach(System.out::println);   //Method Reference
	}
	

	private static void printAllOddNumbersInFunctional(List<Integer> numbers) {
	   numbers.stream()
	   .filter(number -> number%2 !=0)
	   .forEach(System.out::println);  
	}
	
	 private static void printSquareOfEvenNumbers(List<Integer> numbers) {
			numbers.stream()
			.filter(number->number%2==0)
			.map(number->number*number)         // Mapping X -> X*X
			.forEach(System.out::println);
			
		}
	 
	 private static void printCubeOfOddNumbers(List<Integer> numbers) {
		 numbers.stream()
			.filter(no->no%2!=0)
			.map(no->no*no*no)         // Mapping X -> X*X
			.forEach(System.out::println);
			
		}
	
}
