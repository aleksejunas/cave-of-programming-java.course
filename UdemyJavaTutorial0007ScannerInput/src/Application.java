import java.util.Scanner; 

public class Application {
	public static void main(String[] args) {
		
		// Create scanner object
		Scanner input = new Scanner(System.in);
		
		// Output the prompt
		System.out.println("Enter a floating point value: ");
		
		// Wait for the user to enter something
		double value = input.nextDouble();
		
		// Tell them what they entered
		System.out.println("You entered: " + value);
	
	}
}



/*
 *  Create scanner object
		Scanner input = new Scanner(System.in);
		
		// Output the prompt
		System.out.println("Enter a line of text: ");
		
		// Wait for the user to enter a line of text
		String line = input.nextLine();
		
		// Tell them what they entered
	

/*
 * // Create scanner object
		Scanner input = new Scanner(System.in);
		
		// Output the prompt
		System.out.println("Enter an integer: ");
		
		// Wait for the user to enter something
		int value = input.nextInt();
		
		// Tell them what they entered
		System.out.println("You entered: " + value);
 * */
 