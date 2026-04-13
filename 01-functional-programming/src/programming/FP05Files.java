package programming;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class FP05Files {
	
	
	 public static void main(String[] args) throws IOException {
		 
		 //It will read and print content saved in file
		 //Files.lines(Paths.get("file.txt")).forEach(System.out::println);
		 
		 Files.lines(Paths.get("file.txt"))
		      .map(str->str.split(" "))   // Splits in words 
		      .flatMap(Arrays::stream)    //  Creates array of each
		      .distinct()     			  //filter distinct words
		      .sorted()        		      //sort them
		      .forEach(System.out::println);
		 
		 
		 Files.list(Paths.get(".")).forEach(System.out::println);  //will print all the file present
		 
		 Files.list(Paths.get("."))
		      .filter(Files::isDirectory)  //will print only directories
		      .forEach(System.out::println);
		
	}

}
