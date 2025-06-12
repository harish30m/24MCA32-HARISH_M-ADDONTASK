import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string below: ");
        String text = sc.nextLine();
        String reverseText = "";
        for (int i = text.length() - 1; i >= 0; i--) 
	{
            reverseText += text.charAt(i);
        }
        System.out.println("Reversed Text: " + reverseText);
        sc.close();
    }
}

