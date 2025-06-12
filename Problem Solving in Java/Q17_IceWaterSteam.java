import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the water temperature: ");
        double temp = sc.nextDouble();
        if (temp < 0) 
	{
            System.out.printf("Water status is ICE for the Temperature %.2f\n", temp);
        } 
	else if (temp <= 100) 
	{
            System.out.printf("Water status is WATER for the Temperature %.2f\n", temp);
        } 
	else 
	{
            System.out.printf("Water status is STEAM for the Temperature %.2f\n", temp);
        }
        sc.close();
    }
}

