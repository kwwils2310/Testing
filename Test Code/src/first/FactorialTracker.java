package first;

import java.util.Scanner;

/*
* @author Kyle Wilson
*
*
*/
public class FactorialTracker {
	
	
	public static void main(String[] args) {
		String ans;
		Factorial one = new Factorial();
		
			do {
				double factor;
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter Factorial: ");
				factor = scan.nextDouble();
				
				System.out.print("Factor: " + factor + "| Iterations: " + one.countInterations(factor) + "| Solution: " + one.RecFactor(factor) + "\n");
				
				
				System.out.println("Press y to go again.\n");
				ans = scan.next();
			}while (ans.equals("y") || ans.equals("Y"));
		
	}

	
	
}
