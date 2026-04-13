package programming;

import java.util.List;

public class FPO2Structured {
	
	public static void main(String[]args) {
	
	List<Integer> numbers = List.of(12,13,14,12,14,18,21);
         int sum = addListStructured(numbers);
         System.out.println(sum);
	
	
	}

	private static int addListStructured(List<Integer> numbers) {
		// TODO Auto-generated method stub
		int sum =0;
		for(int number : numbers) {
			sum += number;
		}
		
		return sum;
	}

	

}
