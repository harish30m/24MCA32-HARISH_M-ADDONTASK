import java.util.Scanner;

public class ProductOddNumbers 
{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the upper limit: ");
        int limit = scanner.nextInt();
        long product = 1;

        for (int i = 1; i <= limit; i += 2) 
	{
            product *= i;
        }

        System.out.println("Product of Odd Integers (1 to " + limit + "): " + product);
    }
}

	
	/**
	 * This program calculates and prints the product of odd numbers from 1 to 15.
		(Odd numbers: 1, 3, 5, 7, ..., 15)
		
		Problem Flow:
		Start from 1 to 15
		Increment by 2 to get odd numbers
		Multiply all odd numbers
		Print the final product
		
		Input / Output Example:
		Output:
		Product of odd numbers from 1 to 15 = 2027025
		(Odd numbers: 1 × 3 × 5 × 7 × 9 × 11 × 13 × 15 = 2027025)

	 */


