import java.util.Scanner;

public class Multiplier {
    /**
     * Ask the user for a number
     * Get the user input
     * Ask for another number
     * Print the first number multiplied by the second number
     */
    
    public static void main(String args[]) {
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("This is a Multiplier");
        System.out.println("Please enter a number: ");
        int firstNumber = userInput.nextInt();
        System.out.println("Please enter another number: ");
        int secondNumber = userInput.nextInt();
        
        System.out.println("The first number multiplied by the second number is: " + firstNumber*secondNumber);
        
        userInput.close();
    }
    
    
}