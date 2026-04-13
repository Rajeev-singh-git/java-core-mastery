package programming;

import java.util.Comparator;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;


public class FPO3MethodReferences {
	
	public static void print(String str) {
		System.out.println(str);
	}
	
	
public static void main(String[] args) {
		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices",
				    "AWS", "Azure", "Docker", "Git", "PCF");
		
		courses.stream()
	//    .map(str->str.toUpperCase())
	     .map(String::toUpperCase)  //We can call pre-defined member method using Method reference
		 .forEach(FPO3MethodReferences::print); //We  can even call custom defined static method using Method Reference
		
	//	Supplier<String> supplier = () -> new String();  //Initializing Constructor	
    // 	Supplier<String> supplier = () -> String::new;   //Constructor reference
		//What is constructor reference find out ???
		
       }
		
		

}
