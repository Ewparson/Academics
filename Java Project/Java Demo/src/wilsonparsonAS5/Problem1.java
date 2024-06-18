package wilsonparsonAS5;
import java.util.Scanner;

public class Problem1 {
	  public static void main(String[] args) {
	      Scanner input = new Scanner(System.in);

	        System.out.print("Enter hours worked: ");
	        double hoursWorked = input.nextDouble();

	        
	        System.out.print("Enter pay rate: ");
	        double payRate = input.nextDouble();

	   
	        double totalPay;
	        if (hoursWorked <= 40) {
	            totalPay = hoursWorked * payRate;
	        } else {
	            double regularPay = 40 * payRate;
	            double overtimeHours = hoursWorked - 40;
	            double overtimePay = overtimeHours * payRate * 1.5;
	            totalPay = regularPay + overtimePay;
	        }

	        
	        System.out.println("Total Pay: " + totalPay);
	    }
	}

