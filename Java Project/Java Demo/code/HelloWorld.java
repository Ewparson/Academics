package demo1;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
    	byte num1 = 55;
    	byte num2 = 16;		
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        byte personAge = scanner.nextByte();
        System.out.println("Your age is: " + personAge);
        System.out.println(num1 + num2);
        scanner.close();
    }
}
