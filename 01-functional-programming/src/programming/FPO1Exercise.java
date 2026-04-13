package programming;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class FPO1Exercise {
	
public static void main(String[] args) {
		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "Azure", "Docker", "Git", "PCF");
		List<String> lengthOfCourses = listOfLengthOfCourses(courses );
		System.out.println( lengthOfCourses);
		printAllCoursesInFunctional(courses);
		printSpringCoursesInFunctional(courses);
		printCoursesHavingAtLeastFourLetterInFunctional(courses);
		printNoOfCharOfEachCourse(courses);
		sortAllCourses(courses);
		sortCoursesReverseOrder(courses);
		sortCoursesLengthWise(courses);
	}

	private static List<String> listOfLengthOfCourses(List<String> courses) {
		System.out.println("List of length of all course titles");
	return courses.stream().map(str-> str+ " " +str.length()).collect(Collectors.toList());
}

	private static void sortCoursesLengthWise(List<String> courses) {
		System.out.println("Course sorted according to length");
	    courses.stream().sorted(Comparator.comparing(str -> str.length())).forEach(System.out::println);
	
}

	private static void sortCoursesReverseOrder(List<String> courses) {
		System.out.println("Course sorted in reverse order");
		courses.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	
}

	private static void sortAllCourses(List<String> courses) {
	System.out.println("Course sorted alphabetically");
	courses.stream().sorted().forEach(System.out::println);
	
}

	private static void printAllCoursesInFunctional(List<String> courses) {
	System.out.println("All Courses ");
	 courses.stream()
	.forEach(System.out::println);
	}

	private static void printSpringCoursesInFunctional(List<String> courses) {
	  System.out.println("Courses only containing spring word");
	  courses.stream()
	 .filter(course->course.contains("Spring"))
	 .forEach(System.out::println);
	} 
 
	private static void printCoursesHavingAtLeastFourLetterInFunctional(List<String> courses) {
	  System.out.println("Courses containing at least 4 letters");
	  courses.stream()
	 .filter(course-> course.length() >= 4)
	 .forEach(System.out::println);
		
	}
	
	private static void printNoOfCharOfEachCourse(List<String> courses) {
		System.out.println("No of Character of each course");
		courses.stream()
		 .map(course -> course + " " +course.length())
		 .forEach(System.out::println);
	}


}
