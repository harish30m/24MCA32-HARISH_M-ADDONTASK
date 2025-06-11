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

	
	/**
	 *  This program calculates the Volume and Surface Area of a sphere 
	 *  using the following formulas:
			Volume (V) = (4/3) × π × r³
			Area (A) = 4 × π × r²
	
	Problem Flow:
	Get r (radius) from user
	Calculate area using A = 4πr²
	Calculate volume using V = (4/3)πr³
	Display both values
	
	 Input / Output Example:
	Input:
	Enter Radius of Sphere: 7
	Output:
	Volume of Sphere: 1436.571429
	Area of Sphere  : 615.428571
	
	 */


