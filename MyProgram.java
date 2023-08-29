import java.util.Scanner; // allows us to use functions in the Scanner class
							// these functions allow us to get input from the user

class MyProgram {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // creates a new Scanner object
												  // gets input from the System.in stream (the text console)

		System.out.println("Hello World!"); // show hello world and go to the next line (println)

		System.out.print("My name is: "); // show my name but stay on the same line (print)

		String name = scanner.nextLine(); // get the next line of input from the user
										  // and store it in the variable name

		System.out.println("Hello " + name + "!"); // combine strings with the + operator (concatenation)
												   // and print the result 

		

		scanner.close();
	}
}