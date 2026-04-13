package programming;

import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;


//1. Find Functional interface behind second argument of reduce method. Create an implementation for the functional interface
public class FPO3FunctionalInterfaceExercise {
	
	@SuppressWarnings("unused")
	public static void main(String[]args) {
		List<Integer> numbers = List.of(12,13,14,15,16);
	
		
//		BinaryOperator<Integer> totalSum = Integer::sum; // It takes 2 input and return one output
		BinaryOperator<Integer> totalSum = (x,y)->x+y; /* I/P and O/P both are always same in Binary operator, 
														that's why we are  writing, integer only once in generic */
		
		//Supplier = Takes No input Gives Output
		Supplier<Integer> randomIntegerSupplier = ()->{
			Random random = new Random();
			return random.nextInt(1000);
			};
			
			System.out.println("Supplier Output\t" +randomIntegerSupplier.get());
			
			UnaryOperator<Integer> unaryOperator = (x) -> 3 *x;  //takes 1 input and return output of same type
			System.out.println("Unary Operator Output\t" +unaryOperator.apply(10));
			
			
			BiPredicate<Integer, String> biPredicate = (number,str) -> {  //Takes two argument, return one boolean O/P
				return number<10 && str.length()>5;
			};
			
			System.out.println(biPredicate.test(1,"Rajeev"));
			
			
			BiFunction <Integer, String, String> biFunction = (number,str) -> {  //Takes two argument, return one any type O/P
				return number + " " +str;
			};
			System.out.println(biFunction.apply(1,"Rajeev Singh"));
		
			BiConsumer <Integer, String> biConsumer = (s1,s2) -> {  //Takes two I/P, returns no O/P
				System.out.println(s1);
				System.out.println(s2);
			};
		    
			biConsumer.accept(11, "Rajeev is best");
			
			IntBinaryOperator intBinaryOperator = (x,y) -> x+y; /*Same as Binary operator, but takes only primitive type as
			argument, Advantage is with wrapper class we internally Autoboxing and Autounboxing happens, which is not required
			here, If we have to send only int type as argument better to use this */
			
//			IntBinaryOperator
//			IntConsumer
//			IntFunction
//			IntPredicate              Whenever playing with primitive,It's preferred to use
//			IntSupplier               primitive specific functional interface, when we are using lambda expression
//			IntToDoubleFunction
//			IntToLongFunction
			
			
			int sum = numbers.stream()
		         .reduce(0, totalSum);
		System.out.println(sum);
		
		

	
	}	
}
