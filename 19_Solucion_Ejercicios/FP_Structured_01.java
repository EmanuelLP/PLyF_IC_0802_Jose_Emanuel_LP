import java.util.List;

/*Structued Approach*/

public class FP_Structured_01{
	
	public static void main(String [] args){

		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
		  
		FP_Structured_01.printOnlyOddNumbersfromtheList(numbers);
		System.out.println("");
		FP_Structured_01.printAllCoursesIndividually(courses);
		System.out.println("");
		FP_Structured_01.printCoursesContainingWord(courses);
		System.out.println("");
		FP_Structured_01.printCoursesWhoseNameHasAtleast(courses);
		System.out.println("");
		FP_Structured_01.printCubesOfOddNumbers(numbers);
		System.out.println("");
		FP_Structured_01.printNumberOfCharacters(courses);
		System.out.println("");

		
	/*	printOnlyOddNumbersfromtheList(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
		System.out.println("");*/ 
		/*printAllCoursesIndividually(List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes"));
		System.out.println("");*/ 
	}


	
	private static void printOnlyOddNumbersfromtheList(List<Integer> numbers){
		//How to loop the numbers?
		for(int number : numbers){
			if(number % 2 != 0){
				System.out.print(number+", ");
			}
		}
		System.out.println("");
	}
	private static void printAllCoursesIndividually(List<String> courses){
		//How to loop the numbers?
		courses.stream()
			.forEach(course -> System.out.println("-->"+course));
		System.out.println("");
	}

	private static void printCoursesContainingWord(List<String> courses){
		//How to loop the numbers?
		courses.stream()
            .filter(course -> course.contains("Spring"))
            .forEach(course -> System.out.print("-->"+course+"\t"));
        System.out.println("");
	}

	private static void printCoursesWhoseNameHasAtleast(List<String> courses){
		//How to loop the numbers?
		courses.stream()
            .filter(course -> course.length() >= 4)
            .forEach(course -> System.out.print(course+", "));
        System.out.println("");
	}

	private static void printCubesOfOddNumbers(List<Integer> numbers){
		//How to loop the numbers?
		numbers.stream()
            .filter(number -> number % 2 != 0)
            .map(number -> number *number * number)
            .forEach(number -> System.out.print(number+", "));
        System.out.println("");
	}

	private static void printNumberOfCharacters(List<String> courses){
		//How to loop the numbers?
		courses.stream()
			.forEach(course -> System.out.print(course.length()+", "));
		System.out.println("");
	}

}