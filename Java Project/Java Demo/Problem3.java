package wilsonparsonAS5;
import java.util.Scanner;

	public class Problem3 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	       
	        System.out.print("Enter number 1: ");
	        double num1 = scanner.nextDouble();

	        System.out.print("Enter number 2: ");
	        double num2 = scanner.nextDouble();

	        System.out.print("Enter number 3: ");
	        double num3 = scanner.nextDouble();

	        System.out.print("Enter number 4: ");
	        double num4 = scanner.nextDouble();

	        System.out.print("Enter number 5: ");
	        double num5 = scanner.nextDouble();

	        
	        double smallest = num1;
	        if (num2 < smallest) {
	            smallest = num2;
	        }
	        if (num3 < smallest) {
	            smallest = num3;
	        }
	        if (num4 < smallest) {
	            smallest = num4;
	        }
	        if (num5 < smallest) {
	            smallest = num5;
	        }

	        // Display the result
	        System.out.println("Smallest number: " + smallest);
    }
}


