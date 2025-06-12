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

	
	


