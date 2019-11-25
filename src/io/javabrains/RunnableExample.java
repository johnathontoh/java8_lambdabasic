package io.javabrains;

public class RunnableExample {

	//runnable is an interface
	//thread uses run and has only 1 method
	public static void main(String[] args) {
		Thread myThread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Printed inside runnable");
				
			}
			
		});
		
		myThread.run();
		
		//infers the run method from the thread class
		Thread myLambdaThread = new Thread(() -> System.out.println("Printed inside Lambda runnable"));
		myLambdaThread.run();
	}

}
