import java.util.Scanner;
public class HelloClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hello World! " + scanner.nextLine());
		scanner.close();
	}

}
