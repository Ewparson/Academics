package wilsonparsonAS5;
import java.util.Scanner;

	public class Problem2 {

		public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        
	        System.out.print("Enter first number: ");
	        int num1 = input.nextInt();

	        System.out.print("Enter second number: ");
	        int num2 = input.nextInt();

	        System.out.print("Enter third number: ");
	        int num3 = input.nextInt();
	        int largest;
	        if (num1 >= num2 && num1 >= num3) {
	            largest = num1;
	        } else if (num2 >= num1 && num2 >= num3) {
	            largest = num2;
	        } else {
	            largest = num3;
	        }

	        System.out.println("\nLargest number: " + largest);
	    }
	}


