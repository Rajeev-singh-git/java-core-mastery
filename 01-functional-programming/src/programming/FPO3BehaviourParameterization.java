package programming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* Passing logic  of method (behaviour) as an argument 
 * so that we don't have to repeat same code multiple times in some cases
 * */


public class FPO3BehaviourParameterization {
	
	@SuppressWarnings("unused")
	public static void main(String[]args) {
		List<Integer> numbers = List.of(12,13,14,15,16);
		
		//Predicate<Integer> predicate = x->x%2==0;
		
		filterAndPrint(numbers,x->x%2==0);
		filterAndPrint(numbers,x->x%2!=0);
		filterAndPrint(numbers,x->x%3==0);
	}

	private static void filterAndPrint(List<Integer> numbers, Predicate<Integer> predicate) {
		numbers.stream()
		.filter(predicate)
		.forEach(System.out::println);
	}
	
	
}