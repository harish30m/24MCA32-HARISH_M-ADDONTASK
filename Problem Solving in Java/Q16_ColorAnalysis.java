import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Color code character: ");
        char color = sc.next().charAt(0);
        switch (Character.toLowerCase(color)) 
	{
            case 'r':
                System.out.println("Color Code " + color + " is RED");
                break;
            case 'g':
                System.out.println("Color Code " + color + " is GREEN");
                break;
            case 'b':
                System.out.println("Color Code " + color + " is BLUE");
                break;
            default:
                System.out.println("Color Code " + color + " is BLACK");
        }
        sc.close();
    }
}
