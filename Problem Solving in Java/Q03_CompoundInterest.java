
	
	/**
	 * This program calculates Compound Interest using the formula:
 		F = P × (1 + i)ⁿ
 		Where:
			P = Principal amount
			i = Rate/100
			n = Number of years
 			Here, F is the final amount (principal + interest)
	
		 Problem Flow:
		Input P, R, and N from user
		Calculate i = R / 100
		Use formula F = P × (1 + i)^N
		Display the final compound amount
		
		Input / Output Example:
		Input:
		Enter Principal Value: 10000  
		Enter Rate of Interest: 10  
		Enter No. of Years: 2
		Output:
		Compound Interest 12100.00
	 */

public class CompoundInterest 
{
    public static void main(String[] args) 
	{
        double principal = 1000, rate = 5, time = 2;
        double amount = principal * Math.pow(1 + rate / 100, time);
        double interest = amount - principal;
        System.out.println("Compound Interest: " + interest);
    }
}

