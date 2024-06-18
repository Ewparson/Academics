package AdditionMachine;
import java.util.Scanner;

public class Problem2 {
	
    public static void main(String[] args) {
    	
    	//this is calling in a scanner
    	Scanner scanner = new Scanner(System.in);
        
    	//asking the user for a temperature input
        System.out.print("Enter Fahrenheit temperature: ");
        float fahrenheit = scanner.nextFloat();
        
        float celsius = (fahrenheit - 32) * 5.0f / 9.0f;
        

        System.out.println("Converted to Celsius:" + celsius);
     
        scanner.close();
    }
}
