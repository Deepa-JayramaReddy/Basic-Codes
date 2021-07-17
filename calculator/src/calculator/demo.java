package calculator;
import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	     
	     System.out.println("Enter the values of the numbers");
	     int a = sc.nextInt();
	     int b = sc.nextInt();
	     
	     cal obj=new cal();
	     obj.add(a, b);
	     obj.sub(a, b);
	     obj.multiply(a, b);
	     obj.divide(a,b);
		
	}
	
	

}
