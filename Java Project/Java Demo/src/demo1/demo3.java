package demo1;
import java.util.Scanner;

public class demo3 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter you area code:");
		short areaCode = input.nextShort();
		if (areaCode <= 0) {
			System.out.println("Area Code not Valid");
		}else{
		switch (areaCode) {
		
		case 001:
			System.out.println("Denver");
			break;
		case 110:
			System.out.println("Parker");
			break;
		case 204:
			System.out.println("Boulder");
			break;
		case 124:
			System.out.println("Aurora");
			break;
		case 121:
			System.out.println("Golden");
			break;
		}
	}
}
}