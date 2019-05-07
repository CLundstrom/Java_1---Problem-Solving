package cl222ae_lab1;

import java.util.List;

/* Simple change calculator
 *
 *@ Christoffer Lundström - Linneaus University 2018
 * 
 * 
 * 
*/

public class VaxelPengar {

	public static void main(String[] args) {

		HelperMethods hm = new HelperMethods();
		hm.GreetUser();
		List<Integer> change = hm.GetChange(hm.Price, hm.AmountReceived);
		hm.PrintChange(change);

	}

}
