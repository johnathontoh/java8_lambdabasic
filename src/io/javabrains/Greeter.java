package io.javabrains;

public class Greeter {

	public void greet () {
		//always print hello world to the console
		System.out.print("Hello World");
	}
	
	//send the implementation from the interface to this method
	//use this method to run the perform method
	//uses an interface and implement it using another class
	//passing in "Greeting" which has the perform method
	public void greet2(Greeting greet2) {
		greet2.perform();
	}
	
	//greetingFunction = () -> System.out.print("\nHello World3");
	//greet(() -> System.out.print("\nHello World3"));
	//doubleNumberFunction = (int a) -> a * 2;
	//addFunction = (int a, int b) -> a + b;
	//safeDivideFunction = (int a, int b) -> {if (b == 0) return 0; return a / b;};
	//stringLengthCountFunction = (String s) -> s.length();
	
	
	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		greeter.greet();
		
		HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
		
		//call this greet2 by creating an implementation of the Greeting which is the HelloWordGreeting
		greeter.greet2(helloWorldGreeting);
		
		MyLambda myLambdaFunction = () -> System.out.print("\nHello World 3");
		
		//created a new class that implemented the "Greeting" interface and provided the logic in that class
		//this is an instance of the class that implements the "Greeting" interface
		Greeting helloWorldGreeting2 = new HelloWorldGreeting();
		
		//You can use an existing interface that already matches the type of the lambda function
		//This behaves like an implementation of the "Greeting" interface
		//Implement the interface by implementing the function but not a class
		//creates a function/ lambda expression inline
		//lambda expression of type "Greeting" interface
		Greeting myLambdaFunction2 = () -> System.out.print("\nHello World 4");
		
		MyAdd addFunction = (int a, int b) -> a + b;
		
		//call the interface method
		myLambdaFunction.foo();
		myLambdaFunction2.perform();
		
		//inline implementation of an interface
		//defined as an anonymous inner class
		//a class defined inside another class and does not have a name
		//creates an implementation of "Greeting" which has the perform method and also creating a new instance but using the "new" word
		//the "innerClassGreeting" variable now contains the instance
		Greeting innerClassGreeting = new Greeting() {
			public void perform() {
				System.out.print("\nHello World 5");
			}
		};
		
		innerClassGreeting.perform();
		
		//any method that accepts the "greeting" interface works fine
		greeter.greet2(myLambdaFunction2);
		greeter.greet2(innerClassGreeting);
		
		

	}
	
	//Create a new lambda function type 

}

//Create an interface first
//interface name does not matter
//the interface should only have 1 method
interface MyLambda {
	
	//create a method in the interface that has the exact same signature as the lambda that you are trying to declare
	//takes in no argument and returns a void
	//method name does not matter
	void foo();
}

interface MyAdd {
	int add (int x, int y);
	
}
