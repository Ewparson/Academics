package demo1;
import java.util.Scanner;

public class demo2 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter you area code:");
		short areaCode = input.nextShort();
		if (areaCode < 0) {
			System.out.println("Area Code not found");
			
		}else {
		}
	if(areaCode == 001) {
		System.out.println("Denver");
	}
	else if (areaCode == 204) {
		System.out.println("Boulder");
	}
	else if(areaCode == 124) {
		System.out.println("Arapahoe");
	}
	else if(areaCode == 110) {
		System.out.println("Parker");
	}
		else if(areaCode == 121) {
		System.out.println("Golden");
		}
	}
}