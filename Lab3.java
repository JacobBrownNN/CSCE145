// Jacob Brown-Nelson
import java.util.Scanner;

public class Lab3 {

    public static void main(String[] args) {
        // Creating scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // price of one software package
        double packagePrice = 99.0;
        double discountRate = 0.0;
        
        // Prompt user to enter the number of packages ordered
        System.out.print("Enter the total number of software packages ordered: ");
        
        
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid value for package count! Exiting the program!");
            
        }
        
        int numberOfPackages = scanner.nextInt();

        
        if (numberOfPackages <= 0) {
            System.out.println("Invalid value for package count! Exiting the program!");
           
        }

        
        if (numberOfPackages >= 10 && numberOfPackages <= 19) {
            discountRate = 0.20;  // 20% discount
        } else if (numberOfPackages >= 20 && numberOfPackages <= 49) {
            discountRate = 0.30;  // 30% discount
        } else if (numberOfPackages >= 50 && numberOfPackages <= 99) {
            discountRate = 0.40;  // 40% discount
        } else if (numberOfPackages >= 100) {
            discountRate = 0.50;  // 50% discount
        }

        // Calculate the total bill before the discount
        double totalBeforeDiscount = numberOfPackages * packagePrice;
        
        // Calculate the discount amount
        double discountAmount = totalBeforeDiscount * discountRate;
        
        // Calculate the total after the discount is applied
        double totalAfterDiscount = totalBeforeDiscount - discountAmount;
        
        
        System.out.printf("Total Bill Amount (before discount) = $%.2f%n", totalBeforeDiscount);
        System.out.printf("Amount of discount = $%.2f%n", discountAmount);
        System.out.printf("Total Bill Amount (after discount) = $%.2f%n", totalAfterDiscount);
    }
}
