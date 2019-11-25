package io.javabrains;

public class TypeInferenceExample {
	
	public static void main (String[] args) {
		StringLengthLambda myLambda = s -> s.length();
		System.out.print(myLambda.getLength("Hello Lambda"));
		
		printLambda(s -> s.length());
		
	}
	
	public static void printLambda(StringLengthLambda l) {
		System.out.print(l.getLength("Hello Lambda2"));
	}
	
	interface StringLengthLambda{
		int getLength(String s);
	}

}
