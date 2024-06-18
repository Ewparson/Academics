package class16;
import java.util.Scanner;

public class Demo1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float[] numbers = new float[5];
		float max = Float.MIN_VALUE;
		float min = Float.MAX_VALUE;
		
		for (int i = 0; i < numbers.length; i++ ) {
			System.out.print("Enter a number : ");
			numbers [i] = sc.nextFloat();
			}
		for (int i =0; i < numbers.length; i++) {
			if (min > numbers[i]) {
				min = numbers[i];
			}
			
			if (max < numbers[i] ) {
				max = numbers[i];
            }
	
		}
		System.out.println("the small number :" + min);
		System.out.println("the biggest number :" + max); 
	}

}