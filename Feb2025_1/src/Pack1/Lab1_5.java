package Pack1;
import java.util.*;

public class Lab1_5 {

	public static void main(String[] args) {
		System.out.println("Enter a Number to test if it's positive or negative: ");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		
		if (x < 0) {
			System.out.println(x + " is negative!");
		}
		else {
			System.out.println(x + " is positive!");
		}
		
		
	}
	
}
