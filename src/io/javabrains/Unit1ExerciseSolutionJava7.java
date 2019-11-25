package io.javabrains;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseSolutionJava7 {

	public static void main(String[] args) {
List<Person> people = Arrays.asList (
				
				new Person ("Jon", "Sam", 20),
				new Person ("James", "Gary", 30),
				new Person ("Jane", "Mary", 40), 
				new Person ("Abel", "Carroll", 50),
				new Person ("Sam", "Carrolyn", 55),
				new Person ("Zack", "Arnold", 50)
				);
		
		//Step 1: Sort List by last name

		//Collection starts to sort the "people"
		//runs through each combination using the comparator method
		Collections.sort(people, new Comparator<Person>() {

			//last name is in ascending order
			//based on the person o1 and person o2, what should the sorting order be
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLname().compareTo(o2.getLname());
			}
		}); 
		
		//Step 2: Create a method that prints all elements in the list
		System.out.println("Printing all persons");
		printALL(people);
			
		//Step 3: Create a method that prints all people that have last name beginning with C
		System.out.println("\nPrinting all persons with last name begin with 'C' ");
		printLastNameBeginningWithC(people);
		
		//the method itself contains explicitly what needs to be done
		//pass the implementation of the interface with a method called "test" and it only passes if the last name begins with S
		System.out.println("\nPrinting all persons with last name begin with 'S' ");
		printConditionally(people, new Condition() {

			@Override
			public boolean test(Person p) {
				return p.getLname().startsWith("S");
			}});
		

	}

	//using a condition object 
	//uses the condition and it runs for each person in the people list
	//if the condition is met then it prints it
	private static void printConditionally(List<Person> people, Condition condition) {
		for (Person p : people) {
			if (condition.test(p)) {
				System.out.println(p);
			}
		}
		
	}

	private static void printLastNameBeginningWithC(List<Person> people) {
		for (Person p : people) {
			if (p.getLname().startsWith("C")) {
				System.out.println(p);
			}
		}
		
	}

	private static void printALL(List<Person> people) {
		for (Person p : people) {
			System.out.println(p);
		}
		
	}

	

}

//Looks at the person and if that person should be included or not
//the test method checks if the person last name begin with C
interface Condition {
	boolean test(Person p);
}
