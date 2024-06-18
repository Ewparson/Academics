package wilsonparsonAS4;

import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //total change
        System.out.print("Enter total change (in cents): ");
        int totalChange = scanner.nextInt();

        // number of quarters
        int quarters = totalChange / 25;
        totalChange %= 25;

        //  number of dimes
        int dimes = totalChange / 10;
        totalChange %= 10;

        // number of nickels
        int nickels = totalChange / 5;
        totalChange %= 5;

        // The remaining amount is in pennies
        int pennies = totalChange;

        // Display the results
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Pennies: " + pennies);

        // Close the scanner
        scanner.close();
    }
}
