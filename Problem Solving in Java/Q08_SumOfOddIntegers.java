import java.util.Scanner;

public class SumOddNumbers 
{
    public static void main(String[] args)
	{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the upper limit: ");
        int limit = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= limit; i += 2) 
	{
            sum += i;
        }

        System.out.println("Sum of Odd Integers: " + sum);
    }
}

	
