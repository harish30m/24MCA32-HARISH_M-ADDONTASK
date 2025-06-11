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


	/**
	 * This program allows the user to enter 3 test marks of a student, 
	 calculates the total and average, and displays the result.
	 
	Problem Flow:
	Get 3 marks from user
	Add marks → total
	Divide total by 3.0 → average
	Display total and average
	
	Input / Output Example:
	Input:
	Enter Mark 1: 80  
	Enter Mark 2: 75  
	Enter Mark 3: 85  
	Output:
	Total Marks   = 240  
	Average Marks = 80.0
	 */

