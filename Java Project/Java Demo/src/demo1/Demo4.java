package demo1;
import java.util.Scanner;

public class Demo4 {
	public static void main(String[] args) {
 Scanner input = new Scanner (System.in);
 System.out.print("Ender your grade:");
 char grade = input.next().charAt(4);
 System.out.println(grade);
	}
 
}
