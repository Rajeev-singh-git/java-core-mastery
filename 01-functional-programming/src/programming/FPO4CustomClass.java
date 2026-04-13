package programming;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Course{
	private String name;
	private String category;
	private int reviewScore;
	private int noOfStudents;
	
	
	
	
	public Course(String name, String category, int reviewScore, int noOfStudents) {
		super();
		this.name = name;
		this.category = category;
		this.reviewScore = reviewScore;
		this.noOfStudents = noOfStudents;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getReviewScore() {
		return reviewScore;
	}
	public void setReviewScore(int reviewScore) {
		this.reviewScore = reviewScore;
	}
	public int getNoOfStudents() {
		return noOfStudents;
	}
	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}
	
	public String toString() {
		return name+ ":" + noOfStudents + ":" +reviewScore;
		
	}
	
}



public class FPO4CustomClass {

	public static void main(String[] args) {
	   List<Course> courses = List.of(
				new Course("Spring","Framework", 98, 20000),
				new Course("Spring Boot","Framework", 96, 30000),
				new Course("API","Microservices", 97, 30000),
				new Course("Angular","Frontend Framework", 99, 18000),
				new Course("Git","Cloud", 99, 85000),
				new Course("Azure","Cloud", 100, 96000)
			);
	   
	   Predicate<Course> reviewScoreGreaterThan95Predicate = course -> course.getReviewScore()>95;
	   Predicate<Course> reviewScoreGreaterThan90Predicate = course -> course.getReviewScore()>90;
	   Predicate<Course> reviewScoreLessThan90Predicate = course -> course.getReviewScore()<90;
	   
	   System.out.println(courses.stream().allMatch(reviewScoreGreaterThan95Predicate));  //true
	   System.out.println(courses.stream().noneMatch(reviewScoreLessThan90Predicate));    //true
	   System.out.println(courses.stream().anyMatch(reviewScoreGreaterThan90Predicate));  //true
	   
	   Comparator<Course> comparingByNoStudentsIncreasing =  Comparator.comparingInt(Course::getNoOfStudents);
	   Comparator<Course> comparingByNoStudentsDecreasing =  Comparator.comparingInt(Course::getNoOfStudents).reversed();
	   Comparator<Course> comparingByNoStudentsAndNoOfReviews = 
			   Comparator.comparing(Course::getNoOfStudents).thenComparing(Course::getReviewScore).reversed();
	   
	   /* when comparing primitive type use specific method defined for them like for int  "comparingInt".
	   Just using "comparing" method is not efficient as internally Autoboxing, Autounboxing happens */
		
	   
	   System.out.println(courses.stream().sorted(comparingByNoStudentsIncreasing).collect(Collectors.toList()));
	   //[Angular:18000:99, Spring:20000:98, Spring Boot:30000:96, API:30000:97, Git:85000:99, Azure:96000:100]
	   System.out.println(courses.stream().sorted(comparingByNoStudentsDecreasing).collect(Collectors.toList()));
	   //[Azure:96000:100, Git:85000:99, Spring Boot:30000:96, API:30000:97, Spring:20000:98, Angular:18000:99]
	   System.out.println(courses.stream().sorted(comparingByNoStudentsAndNoOfReviews).collect(Collectors.toList()));
	   //[Azure:96000:100, Git:85000:99, API:30000:97, Spring Boot:30000:96, Spring:20000:98, Angular:18000:99]
	   
	   System.out.println(
			   courses.stream()
			   .sorted(comparingByNoStudentsAndNoOfReviews)
			   .limit(5) //It will limit the o/p to 5 only
			   .collect(Collectors.toList()));
	   //[Azure:96000:100, Git:85000:99, API:30000:97, Spring Boot:30000:96, Spring:20000:98]
		
	   System.out.println(
			   courses.stream()
			   .sorted(comparingByNoStudentsAndNoOfReviews)
			   .skip(3) //It will skip first 3 O/P
			   .collect(Collectors.toList()));
	   //[Spring Boot:30000:96, Spring:20000:98, Angular:18000:99]
	   
	   System.out.println(
			   courses.stream()
			   .sorted(comparingByNoStudentsAndNoOfReviews)
			   .skip(3) //It will skip first 3 O/P
			   .limit(2) // and print next 2 O/p
			   .collect(Collectors.toList()));
	   //[Spring Boot:30000:96, Spring:20000:98]
         
	   System.out.println(courses);
	   //[Spring:20000:98, Spring Boot:30000:96, API:30000:97, Angular:18000:99, Git:85000:99, Azure:96000:100]
	   
	
	   System.out.println(courses.stream()
	   	  .takeWhile(course -> course.getReviewScore()<100)//Return all the courses until  review is not greater than or equal to 100
	       .collect(Collectors.toList()));
      //[Spring:20000:98, Spring Boot:30000:96, API:30000:97, Angular:18000:99, Git:85000:99]
	   
	   System.out.println(courses.stream()
			   	  .dropWhile(course -> course.getReviewScore()<99)//Until this condition is true it will skip all the elements,  
			      .collect(Collectors.toList()));                 // after that will print everything
	   //[Angular:18000:99, Git:85000:99, Azure:96000:100]@
	   
	   
	   System.out.println(courses.stream()
			        .max(comparingByNoStudentsAndNoOfReviews)); //will print last element of this comparison result
	    //Optional[Angular:18000:99]
	   
	   System.out.println(courses.stream()
		        .min(comparingByNoStudentsAndNoOfReviews));//will print first element of this comparison result
	   //Optional[Azure:96000:100]  //optional is a way to handle null value or null pointer exception
	   
	   System.out.println(courses.stream()
			    .filter(reviewScoreLessThan90Predicate)
		        .min(comparingByNoStudentsAndNoOfReviews)
		        .orElse(new Course("Kubernetes","Cloud",91,20000))
		        );
	     //Kubernetes:20000:91
	   
	   System.out.println(courses.stream()
			    .filter(reviewScoreLessThan90Predicate)
		        .min(comparingByNoStudentsAndNoOfReviews));
       //Optional.empty = When a value does not exist, it will not return null instead will return optional.empty
	  
	   System.out.println(courses.stream()
			    .filter(reviewScoreGreaterThan95Predicate)
		        .findFirst()
		        );
	   //Optional[Spring:20000:98]
	   
	   System.out.println(courses.stream()
			    .filter(reviewScoreGreaterThan95Predicate)
		        .findAny()
		        );
	   
	   //Optional[Spring:20000:98]  //can return any calue which satistfy filter condition
	   
	   System.out.println(courses.stream()
			    .filter(reviewScoreGreaterThan95Predicate)
		        .mapToInt(Course::getNoOfStudents) // for primitive, preferred to use "mapToInt" than "map".
                .sum());
	   //279000
	   

	   System.out.println(courses.stream()
			    .filter(reviewScoreGreaterThan95Predicate)
		        .mapToInt(Course::getNoOfStudents) 
                .average());
	   //OptionalDouble[46500.0]
	   
	   

	   System.out.println(courses.stream()
			    .filter(reviewScoreGreaterThan95Predicate)
		        .mapToInt(Course::getNoOfStudents) 
                .count());
	   //6
	   
	   System.out.println(courses.stream()
			    .filter(reviewScoreGreaterThan95Predicate)
		        .mapToInt(Course::getNoOfStudents) 
               .max());
	   //OptionalInt[96000]
	   
	   System.out.println(
			   courses.stream()
			   .collect(Collectors.groupingBy(Course::getCategory)));
	   //{Cloud=[Git:85000:99, Azure:96000:100], 
	   //Frontend Framework=[Angular:18000:99],
	   //Microservices=[API:30000:97],
	   //Framework=[Spring:20000:98, Spring Boot:30000:96]}
	   
	   System.out.println(
			   courses.stream()
			   .collect(Collectors.groupingBy(Course::getCategory, Collectors.counting())));
	   //{Cloud=2, Frontend Framework=1, Microservices=1, Framework=2}
	   
	   System.out.println(
			   courses.stream()
			   .collect(Collectors.groupingBy(Course::getCategory,
					   Collectors.maxBy(Comparator.comparing(Course::getReviewScore)))));
	   
	   //{Cloud=Optional[Azure:96000:100], Frontend Framework=Optional[Angular:18000:99], Microservices=Optional[API:30000:97], Framework=Optional[Spring:20000:98]}

	   System.out.println(
			   courses.stream()
			   .collect(Collectors.groupingBy(Course::getCategory,
					   Collectors.mapping(Course::getName, Collectors.toList()))));
	   //{Cloud=[Git, Azure], Frontend Framework=[Angular], Microservices=[API], Framework=[Spring, Spring Boot]}
	   
	   Predicate<Course> reviewScoreGreaterThan95Predicate2 = createPredicateWithCutoffReviewScore(95);
	   Predicate<Course> reviewScoreGreaterThan90Predicate2 = createPredicateWithCutoffReviewScore(90);;

	   
	}

	private static Predicate<Course> createPredicateWithCutoffReviewScore(int cutoffReviewScore) {
		return course -> course.getReviewScore()>cutoffReviewScore;  //We are returning a method from a method
	}

}
