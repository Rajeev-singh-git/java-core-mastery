package programming;

import java.util.List;

public class FP02Exercise {
	
	
	public static void main(String[]args) {
		List<Integer> numbers = List.of(1,2,3,4,3,4,5,6,7,8,9,0,11,18,12);
		
		squareAndFindSum(numbers);
		cubeAndFindSum(numbers);
		sumOfOddNumber(numbers);
	}

	private static void sumOfOddNumber(List<Integer> numbers) {
		System.out.println("Sum of Odd number");
		int Sum = numbers.stream().filter(num->num%2!=0).reduce(0,Integer::sum);
		System.out.println(Sum);
		
		
	}

	private static void cubeAndFindSum(List<Integer> numbers) {
		// TODO Auto-generated method stub
		System.out.println("Sum of Cube");
		int Sum = numbers.stream().map(num->num*num*num).reduce(0,Integer::sum);
		System.out.println(Sum);
		
	}

	private static void squareAndFindSum(List<Integer> numbers) {
		// TODO Auto-generated method stub
		System.out.println("Sum of Square");
		int Sum = numbers.stream().map(num->num*num).reduce(0,Integer::sum);
		System.out.println(Sum);
		
	}
	

}
