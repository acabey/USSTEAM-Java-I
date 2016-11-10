import java.util.Scanner;

public class ApplesBananas {
    public static void main(String args[]) {
        
        Scanner kbInput = new Scanner(System.in);
        
        System.out.println("Do you want apples or bananas?");
        
        String fruitType = kbInput.next();
        
        System.out.println("How many " + fruitType + " do you want?");
        
        int fruitAmount = kbInput.nextInt();

        int fruitCost = 0;
        
        if (fruitType.toLowerCase().equals("apples")) {
            if (fruitAmount < 10) {
                fruitCost = fruitAmount * 15;
            }
            else if ((fruitAmount >= 10) && (fruitAmount <= 20)) {
                fruitCost = fruitAmount * 10;
            }
            else if (fruitAmount > 20) {
                fruitCost = fruitAmount * 10;
            }
        }
        
        else if (fruitType.toLowerCase().equals("bananas")) {
            if (fruitAmount < 5) {
                fruitCost = fruitAmount * 50;
            }
            else if ((fruitAmount >= 5) && (fruitAmount <= 10)) {
                fruitCost = fruitAmount * 35;
            }
            else if (fruitAmount > 10) {
                fruitCost = fruitAmount * 25;
            }
        }
        
        else {
            System.out.println("Sorry, we only sell apples and bananas");
            System.exit(0);
        }
        System.out.println("Your " + fruitAmount + " " + fruitType + " will cost " + fruitCost + " cents");
    }
    
    
}