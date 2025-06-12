import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Heat code (1-3): ");
        int flag = sc.nextInt();
        switch (flag) 
	{
            case 1:
                System.out.println("Flag " + flag + " is HOT");
                break;
            case 2:
                System.out.println("Flag " + flag + " is LUKE WARM");
                break;
            case 3:
                System.out.println("Flag " + flag + " is COLD");
                break;
            default:
                System.out.println("Flag " + flag + " is OUT OF RANGE");
        }
        sc.close();
    }
}
