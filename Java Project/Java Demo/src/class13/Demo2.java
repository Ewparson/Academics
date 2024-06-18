package class13;
import java.util.Scanner;

public class Demo2 {
	public static void main(String[] arg) {
		Scanner input = new Scanner(System.in);
		float grandTotal = 0.0f;
		String response = input.next();
		do {
			System.out.print("enter product price");
			float productPrice = input.nextFloat();
			grandTotal += productPrice;
			System.out.print("Do you have one or more product? (yes/no)");
			

		}while (response.equalsIgnoreCase ("yes"));
	}

}
