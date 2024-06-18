package demo1;

public class intrestRate {
	public static void main(String[] args) {
	
	float principal = 1000;
	float interest  = 4;
	float time = 2;
	float interestRateValue = (principal * interest * time)/100;
	
	System.out.println("Total intrest paid:" + interestRateValue);
	
}
}