import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many numbers you want to input: ");
        int n = sc.nextInt();
        double product = 1.0;
        for (int i = 1; i <= n; i++) 
	{
            System.out.print("Enter number " + i + ": ");
            double num = sc.nextDouble();
            product *= num;
        }
        System.out.println("Cumulative Total = " + product);
        sc.close();
    }
}

