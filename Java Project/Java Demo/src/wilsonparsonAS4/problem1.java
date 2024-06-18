package wilsonparsonAS4;
import java.util.Scanner;

public class problem1 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	
	    // ask user for days
	    System.out.print("Days rented: ");
	    int daysRented = input.nextInt();
	
	    // milese driven
	    System.out.print("Miles driven: ");
	    double milesDriven = input.nextDouble();
	
	    // Calculate  fee
	    double totalFee = (daysRented * 49.50) + (milesDriven * 0.09);
	
	    //finaly fee
	    System.out.println("Total Car Rental Fee: $" + totalFee);

    }
} 
