import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to generate factorial table: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) 
	{
            long fact = 1;
            for (int j = 1; j <= i; j++) 
	    {
                fact *= j;
            }
            System.out.println(i + "! = " + fact);
        }
        sc.close();
    }
}
