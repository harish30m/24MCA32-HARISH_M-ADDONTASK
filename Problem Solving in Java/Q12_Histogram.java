import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Enter 5 numbers between 1 and 30:");
        for (int i = 0; i < 5; i++) 
	{
            numbers[i] = sc.nextInt();
        }
        for (int num : numbers) 
	{
            System.out.print(num + " ");
            for (int i = 0; i < num; i++) 
	    {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
