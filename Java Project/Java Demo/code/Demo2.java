package project2;
import java.util.Scanner;
public class Demo2 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int noOfSubjects;
	
	System.out.print("Enter the number of subject:");
	noOfSubjects = sc.nextInt();
	
	for ( int i = 1; i <= noOfSubjects ; i++ )
	System.out.print("Enter subject-1 marks:");
	float subjectMarks = sc.nextFloat();

}
}