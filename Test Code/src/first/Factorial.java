package first;
import java.util.Scanner;

/*
* @author Kyle Wilson
*
*
*/

public class Factorial {

	static String ans;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		do {
			
			double x;
			double y = 1;
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter Factorial:\n ");
			x = scan.nextDouble();
			System.out.println("You choose " + x +"!\n");
			for (double i = 1; i <= x; i++) {
				y = i * y;

				System.out.println("Iteration " + i + ": " +  y + "\n");
			}

			System.out.println("The answer is: " + y + "\n");
			System.out.println("Press y to go again.\n");
			ans = scan.next();
		} while (ans.equals("y") || ans.equals("Y"));

	}

}
