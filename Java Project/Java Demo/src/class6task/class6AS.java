package class6task;
import java.util.Scanner;

public class class6AS {
	
	public static void main(String[] arg) {
		
		// Calls Scanner
		Scanner input = new Scanner(System.in);
		// static value of pi
		final float PI_VALUE = 3.14f;
		
		//ask the user for input
		System.out.println("Whats the Radius ");
		
		//Circle area
		float Radius = input.nextInt();
		float areaOfCircle = PI_VALUE * Radius * Radius;
		
		//ask and calculate area of the circle
		System.out.println("Area of the Circle is:" + areaOfCircle);
		input.close();
	}
}
