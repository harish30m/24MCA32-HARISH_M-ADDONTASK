import java.util.Scanner;

public class SphereAreaVolume 
{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius of the sphere: ");
        double radius = scanner.nextDouble();
        double surfaceArea = 4 * Math.PI * radius * radius;
        double volume = (4.0 / 3) * Math.PI * Math.pow(radius, 3);
        System.out.println("Surface Area: " + surfaceArea);
        System.out.println("Volume: " + volume);
    }
}

	
	


