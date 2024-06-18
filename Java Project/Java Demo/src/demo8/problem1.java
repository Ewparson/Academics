package demo8;

import java.util.Scanner;

public class problem1 {
		public static void main(String[] args) {
	System.out.println("Enter bill total:");
	Scanner input = new Scanner(System.in);
	double totalBill = input.nextDouble();
	
	if ( totalBill < 100) {
		double saleTax = 1.04;	
	}else{
				double saleTax = 1.075;
	
	
	System.out.println("final bill amount:" + totalBill*saleTax);
	}
}
}
