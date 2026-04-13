package programming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/*Behind each Lambda expression that we write is functional interface.
 * 
 * Whatever lambda expression we write is implementation to the 
 * Functional Interface methods. 
  *Whenever we write lambda expression an instance of that particular class is created
 * filter implements "test" method of "predicate" interface.
 * map implements "apply" method of "Function" interface.
 * forEach implements "accept" method of "Consumer" interface.
 * Lambda expression finally become something like object. Objects are our first class citizens
 */

public class FPO3FunctionalInterface {
	
	@SuppressWarnings("unused")
	public static void main(String[]args) {
		List<Integer> numbers = List.of(12,13,14,15,16);
		
		Predicate<Integer> isEvenPredicate = x->x%2==0; //Predicate only returns boolean as output
		//Whenever we write single line of logic then in background Instance of predicate class with that logic 
		//gets created our us, similar to below method.
		Predicate<Integer> isEvenPredicate2 = new Predicate<Integer>() {

			@Override
			public boolean test(Integer x) {
				return  x%2==0;   
			}
		};
		
		Function<Integer, Integer> SquareFunction = x->x*x; //Function takes input and return output
		Function<Integer, String> stringOutoutFunction = x->x+""; //here, it takes integer as input and String as output
		Function<Integer, Integer> SquareFunction2 = new Function<Integer, Integer>(){

			@Override
			public Integer apply(Integer x) {
				return x*x;
			}
		};
		
		Consumer<Integer> sysoutConsumer = System.out::println;  //Consumer  takes input but does not return anything back
		Consumer<Integer> sysoutConsumer2 = new Consumer<Integer>() {

			@Override
			public void accept(Integer x) {
				System.out.println(x);
			}
		};
		
	
		numbers.stream()
		.filter(isEvenPredicate2)
		.map(SquareFunction2)
		.forEach(sysoutConsumer2);  //forEach(x->System.out.println(x)); Method reference is also simplified version of lambda
	}

}
