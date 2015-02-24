/**Class Football: Calculates QB rating (Passer Rating) from user inputs
 * Param: none
 * Variables: 
 * input: a scanner
 * TD, double, touchdowns
 * YDS, double, total yards
 * INT, double, interceptions
 * comp, double, completions
 * ATT, dobule, passes attempted
 * Return: none
 * a,b,c,d: doubles, intermediary calculations documented at http://en.wikipedia.org/wiki/Passer_rating, represent a value between 0 and 2.375, includsive
 * PasserRating: calcualted from a,b,c,d, which are ratios of TD, YDS,INT,COMP, and ATT
 */

import java.util.Scanner;

public class Football {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//touchdowns (TD), total yards (Yards), Interceptions (INT), completions (comp) and number of passes attempted (ATT)
		System.out.print("Enter touchdowns (TD): ");
		double TD = input.nextDouble();
		
		System.out.print("Enter total yards: ");
		double YDS = input.nextDouble();
		
		System.out.print("Enter Interceptions (INT): ");
		double INT = input.nextDouble();
		
		System.out.print("Enter completions (comp): ");
		double COMP = input.nextDouble();
		
		System.out.print("Enter number of passes attempted (ATT): ");
		double ATT = input.nextDouble();
		
		input.close();
		
		double a = Math.max(Math.min((COMP/ATT - .3) * 5, 2.375),0);
		double b = Math.max(Math.min((YDS/ATT - 3)*.25, 2.375), 0);
		double c = Math.max(Math.min((TD/ATT) * 20, 2.375), 0);
		double d = Math.max(Math.min(2.375 - (INT/ATT * 25), 2.375), 0);
		
		double PasserRating = (a+b+c+d)/6 * 100;
		System.out.println("Passer Rating is: "+PasserRating);
	}
}
