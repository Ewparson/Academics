package class7;

import java.util.Scanner;

public class demo1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your age:");
		byte personAge = input.nextByte();
		
		System.out.print("Are you USA citizen : true/false");
		boolean citizenStatus = input.nextBoolean();
		
		if (personAge >= 18) {
			if (citizenStatus == true) {
				System.out.println("Eidible to vote");
			}
			System.out.println("You can vote");
		}else{
			System.out.println("To young to vote");
		}
	}
}
	