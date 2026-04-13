package programming;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

// Basically, we can pass logic of method as an argument


public class FPO3BehaviourParameterizationExercise {
	
	@SuppressWarnings("unused")
	public static void main(String[]args) {
		List<Integer> numbers = List.of(12,13,14,15,16);
		List<Integer> squareOfNumbers =  mapAndCreateNewList(numbers,x->x*x);
		System.out.println(squareOfNumbers);
		List<Integer> cubeOfNumbers =  mapAndCreateNewList(numbers,x->x*x*x);
		System.out.println(cubeOfNumbers);
		List<Integer> doubleOfNumbers =  mapAndCreateNewList(numbers,x->x+x);
		System.out.println(doubleOfNumbers);
		
		
	}

	
	private static List<Integer> mapAndCreateNewList(List<Integer> numbers, Function<Integer,Integer> mapper) {
		return numbers.stream().map(mapper).collect(Collectors.toList());
	}

	
	
	
}
