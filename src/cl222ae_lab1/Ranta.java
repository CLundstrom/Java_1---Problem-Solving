package cl222ae_lab1;

/* Interest calculator.
*
*@ Christoffer Lundström - Linneaus University 2018
* 
* 
* 
*/
public class Ranta {

	public static void main(String[] args) {

		double savings = 1000;
		double interest = 1.05f;
		double years = 5;

		// Formula 1000 * 1.05^5
		double sum = savings * Math.pow(interest, years);
		sum = Math.round(sum);

		System.out.println("Savings year 0: " + String.format("%.0f", savings));
		System.out.println("Interest(%): " + Math.round(interest * 100) % 100);
		System.out.println(String.format("%.0f", years) + " year value: " + String.format("%.0f", sum));

	}
}
