package AdditionMachine;
import java.util.Scanner;

public class Problem1 {
	
    public static void main(String[] args) {
    	
    	Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        float firstNumber = scanner.nextFloat();
        
        System.out.print("Enter second number:");
        float secondNumber = scanner.nextFloat();
        
        float sum = firstNumber + secondNumber;
        float difference = firstNumber - secondNumber;
        float product = firstNumber * secondNumber;
        
        System.out.println("Sum:" + sum + "\nDifference:" + difference + "\nProduct:" + product);
     
        scanner.close();
    }
}