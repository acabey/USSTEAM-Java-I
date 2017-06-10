import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {

		Scanner kbInput = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		int num1 = kbInput.nextInt();
		kbInput.nextLine();

		System.out.println("Enter the second number");
		int num2 = kbInput.nextInt(); 
		kbInput.nextLine();

		System.out.println("Enter the opertion");
		char op = kbInput.nextLine().charAt(0);

		if (op == '+') {
			System.out.println(num1 + num2);
		} else if (op == '-') {
			System.out.println(num1 - num2);
		} else if (op == '*') {
			System.out.println(num1 * num2);
		} else if (op == '/') {
			System.out.println(num1 / num2);
		} else {
			System.out.println("Invalid operation");
		}
	}
}

