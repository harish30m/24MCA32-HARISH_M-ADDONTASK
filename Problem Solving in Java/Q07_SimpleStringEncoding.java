import java.util.Scanner;

public class StringEncoder 
{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        StringBuilder encoded = new StringBuilder();

        for (char c : input.toCharArray()) 
	{
            encoded.append((char)(c + 1)); 
        }

        System.out.println("Encoded String: " + encoded);
    }
}

	


