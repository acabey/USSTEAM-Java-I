import java.util.Scanner;
public class HelloClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("I like pizza");
		System.out.println("42 is a great number");
		System.out.println("What's your favorite number? ");
		System.out.println("I think 42 is better than " +scanner.nextLine());
		scanner.close();
	}

}
