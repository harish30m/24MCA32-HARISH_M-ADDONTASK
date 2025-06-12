import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("How many Fibonacci terms? ");
        int n = sc.nextInt();
        int f1 = 1, f2 = 1;
        if (n >= 1) System.out.print(f1 + " ");
        if (n >= 2) System.out.print(f2 + " ");
        for (int i = 3; i <= n; i++) 
	{
            int f = f1 + f2;
            System.out.print(f + " ");
            f1 = f2;
            f2 = f;
        }
        System.out.println();
        sc.close();
    }
}

