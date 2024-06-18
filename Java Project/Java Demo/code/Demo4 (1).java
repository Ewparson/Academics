package class17;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); //Create object for scanner class
		
		int[] numbers = new int [10]; //
		String a = "ghff";
		int sum = 8; //value
		int avrg = 0;
		
		System.out.println( sum );
		
		for ( int i = 0; i < 10; i++) {
			
			System.out.println("enter data:");
			
			numbers[i] =  input.nextInt();
		}
		
		for ( int i = 0; i < 10; i++) {
						
			sum = sum + numbers[i];
		}
		
			
			//avrg = sum/ 10;

		
	}		
	
}


