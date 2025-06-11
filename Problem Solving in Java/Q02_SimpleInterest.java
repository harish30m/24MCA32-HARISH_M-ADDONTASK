
	
	/**
	 * Write a Java program to calculate Simple Interest using the formula:
 		SI = (P × N × R) / 100
 		Where:
		P = Principal amount
		N = Number of years
		R = Rate of interest
		
		Problem Flow:
		User inputs:
			Principal (P)
			Rate (R)
			Years (N)
		Program calculates:
			SI = (P × N × R) / 100
		Output displays the Simple Interest value.
		
		Input / Output Example:
		Input:
		Enter Principal Amount: 10000  
		Enter Rate of Interest: 5  
		Enter No. of Years: 2
		Output:
		Simple Interest = 1000.00
	 */

public class SimpleInterest 
{
    public static void main(String[] args) 
	{
        double principal = 1000, rate = 5, time = 2;
        double interest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + interest);
    }
}

