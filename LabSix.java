//Jacob Brown-Nelson

import java.util.Scanner;

public class LabSix {
    public static void main(String[] args) {
       

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height of the triangle: ");
        int height = scanner.nextInt();

        // Loop to print upper
        for (int i = 1; i <= height; i++) {
            printStars(i);
        }

        // Loop to print the lower part of the triangle
        for (int i = height - 1; i >= 1; i--) {
            printStars(i);
        }

        System.out.println("*"); 
        System.out.println("End of program!");
        scanner.close();
    }

    // Method to print the asterisks for lines
    public static void printStars(int count) {
        for (int j = 0; j < count; j++) {
            System.out.print("*");
        }
        System.out.println(); // Moved to the next line 
    }
}
