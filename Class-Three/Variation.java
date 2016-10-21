import java.util.Scanner;

public class Variation {

	public static void main(String[] args) {
		// Make our scanner
		Scanner kbinput = new Scanner(System.in);
		
		// Ask the user for their number
		int myNumber = kbinput.nextInt();
		
		// Print out their number
		System.out.println("Your number is " + myNumber);
		
		// Change the number
		myNumber = myNumber * 2;
		
		// Print out the new number
		System.out.println("2 times your number is " + myNumber);
	}

}
