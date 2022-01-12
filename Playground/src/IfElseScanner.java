import java.util.Scanner;

public class IfElseScanner {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// int value = 9;
		
		// Message that asks user to enter an integer
		System.out.println("Enter an integer:");
		
		// Takes in the value via java.util.scanner
		int value = input.nextInt();

		//Conditions that output a feedback 		
		if(value == 10) {
			System.out.println("Hello Baby");
		}else if(value < 10) {
			System.out.println("Oh my GOD!");
		}else {
			System.out.println("Your values does not comply");
			
			//System.out.println("You entered: " + value);
		}
		
	}
	
}
