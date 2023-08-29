/*
28 August 2023
APCSA Bootcamp
*/

import java.util.Scanner; // allows us to use functions in the Scanner class
							// these functions allow us to get input from the user

class MyProgram {
	public static void main(String[] args) {

		// creates a new Scanner object
		// gets input from the System.in stream (the text console)
		Scanner scanner = new Scanner(System.in);

		// show "My name is: " and stay on the same line (print)
		System.out.print("My name is: ");

		// get the next line of input from the user
		// and store it in the variable 'name'
		String name = scanner.nextLine();

		// combine strings and the variable 'name' with the + operator (string
		// concatenation/combining)
		String greeting = "Hello " + name + "!";

		// show the greeting
		System.out.println(greeting);

		// print instead of println to
		// stay on the same line
		System.out.print("How old are you? ");

		// get the next line of input from the user
		// and store it in the variable 'age'
		int age = scanner.nextInt();

		/*
		the == operator checks if two values are equal
		ex. 5 == 5 is true, 5 == 6 is false
		the % operator (modulus) returns the remainder of a division
		ex. 5 % 2 == 1, 8 % 2 == 0
		
		a boolean variable can only be true or false
		the isEven variable will be true if age is divisible by 2, false otherwise
		 */
		boolean isEven = (age % 2 == 0);

		/*
		an if statement checks if a given condition returns true
		ex. if (age > 10) { ... } checks if age is greater than 10
		
		isEven is a boolean variable, so we can use it in an if statement
		 */
		if (isEven) {
			// combining strings and integers works!
			System.out.println("Your age, " + age + ", is even!");
		} else {
			System.out.println("Your age, " + age + ", is odd!");
		}

		System.out.print("Give me a number: ");
		int number = scanner.nextInt();

		// dividing an int by an int will return an int
		// the result will be truncated to the decimal point / rounded down to the nearest integer
		int intAge = age / number;
		System.out.println(age + " int divided by " + number + " is " + intAge);

		// type casting (converting) an int to a double
		// we convert number into a double and store it in doubleNumber
		double doubleNumber = (double) number;

		// dividing a double by an int OR double will return a double (decimal number)
		// doubles will alawys have a decimal point, even if it has to end with .0
		double doubleAge = age / doubleNumber;
		System.out.println(age + " double divided by " + number + " is " + doubleAge);

		scanner.close();
		// close the scanner to prevent memory leaks
	}
}