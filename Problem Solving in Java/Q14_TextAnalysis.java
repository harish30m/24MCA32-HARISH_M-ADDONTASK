import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text below:");
        String text = sc.nextLine();
        int letters = 0, digits = 0, spaces = 0, others = 0;
        for (int i = 0; i < text.length(); i++) 
	{
            char ch = text.charAt(i);
            if (Character.isLetter(ch)) 
	    {
                letters++;
            } 
	    else if (Character.isDigit(ch)) 
	    {
                digits++;
            } else if (Character.isWhitespace(ch)) 
	    {
                spaces++;
            } else 
	    {
                others++;
            }
        }
        System.out.println("Letters : " + letters);
        System.out.println("Digits : " + digits);
        System.out.println("Space Chars : " + spaces);
        System.out.println("Others : " + others);
        sc.close();
    }
}

