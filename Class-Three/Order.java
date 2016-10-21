import java.util.Scanner;

public class HelloClass {

	public static void main(String[] args) {
		/*
		
		This is just to clarify the order that code is run
		
		The code you write is run in the same order that it appears in your source file
		
		*/
		
		// This line only prepares Java for using a scanner, you won't see any direct effect
		// You can put it anywhere you want so long as you put it in before you try to use your Scanner
		Scanner kbinput = new Scanner(System.in);
		
		
		// First, I'm going to print out Hello World! -- This happens first!
		System.out.println("Hello World! -- This happens first!");
		
		
		// Then print out something else
		System.out.println("This happens second! -- Get ready for input!");
		
		
		// Now I'll get input from the user
		int myInteger = kbinput.nextInt();
		
		
		System.out.println("What did that do? -- This should be the fourth thing that happens");
		
		
		// Now we'll use our input that we got earlier
		System.out.println("You entered: " + myInteger);
		
		
		// Finally we'll close the scanner because we don't need it anymore
		kbinput.close();
	}

}
