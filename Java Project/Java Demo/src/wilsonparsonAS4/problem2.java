package wilsonparsonAS4;

import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // numbers select
        System.out.print("Enter number_1: ");
        double number1 = scanner.nextDouble();

        System.out.print("Enter number_2: ");
        double number2 = scanner.nextDouble();

        System.out.print("Enter number_3: ");
        double number3 = scanner.nextDouble();

        // Calculate the average
        double average = (number1 + number2 + number3) / 3.0;

        // print average
        System.out.println("Average of three numbers: " + average);

        // Close the scanner
        scanner.close();
    }
}

