import java.util.Scanner;

public class StudentMarks 
{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of subjects: ");
        int n = scanner.nextInt();
        int[] marks = new int[n];
        int total = 0;

        for (int i = 0; i < n; i++) 
	{
            System.out.print("Enter mark for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            total += marks[i];
        }

        double average = total / (double) n;
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }
}


	
