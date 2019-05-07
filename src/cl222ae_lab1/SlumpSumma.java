package cl222ae_lab1;

/* Random sum
*
*@ Christoffer Lundström - Linneaus University 2018
* 
* 
* 
*/

public class SlumpSumma {

	
	public static void main(String[] args) {
		
		double[] nums = {
				Math.random()*100, 
				Math.random()*100, 
				Math.random()*100, 
				Math.random()*100, 
				Math.random()*100};
		System.out.print("Random numbers: ");
		for (double num : nums) {
			
			System.out.print(String.format("%.0f ", num));
		}
		
		float sum = Math.round(nums[0]+nums[1]+nums[2]+nums[3]+nums[4]);
		System.out.println("\nSum of numbers: " + String.format("%.0f", sum));
	}
}
