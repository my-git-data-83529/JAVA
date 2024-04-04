package tester;

import java.util.Scanner;

import com.sunbeam.geometry.Point2D;

public class TestPointArray1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of points to plot: ");
		int numOfPoints = sc.nextInt();
		Point2D[] points = new Point2D[numOfPoints];

		// Accept x and y coordinates for each point
		for (int i = 0; i < numOfPoints; i++) 
		{
			System.out.print("Enter x coordinate for point " + (i + 1) + ": ");
			double x = sc.nextDouble();

			System.out.print("Enter y coordinate for point " + (i + 1) + ": ");
			double y = sc.nextDouble();

			points[i] = new Point2D(x, y);

		}

		int choice;
		do 
		{
			System.out.println("=========Point 2D Menu==========");
			System.out.println("1. Display details of a specific point");
			System.out.println("2. Display x, y co-ordinates of all points");
			System.out.println("3. Display distance between two points");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();

			switch (choice) 
			{
			case 1:
			{
				System.out.print("Enter the index of the point: ");
				int index = sc.nextInt();
				if (index >= 0 && index < points.length) {
					System.out.println("Point " + (index + 1) + " coordinates: (" + points[index].getX() + ", "
							+ points[index].getY() + ")");
				} 
				else 
				{
					System.out.println("Invalid index......");
				}
			}	
				break;

			case 2: 
			{
				System.out.println("All points:");
				for (Point2D point : points) 
				{
					System.out.println("(" + point.getX() + ", " + point.getY() + ")");
				}
			}
				break;

			case 3: 
			{
				System.out.print("Enter index of start point: ");
				int startIndex = sc.nextInt();

				System.out.print("Enter index of end point: ");
				int endIndex = sc.nextInt();

				if (startIndex >= 0 && startIndex < points.length || endIndex >= 0 && endIndex < points.length) {
					if ((points[startIndex]).isEqual(points[endIndex]))

					{
						System.out.println("Points are same ");
					} else {
						System.out.println("Points are not same");
						double distance =points[startIndex].calculateDistance(points[endIndex]);
						System.out.println("Distance: "+distance);
					}
				} else {
					System.out.println("Invalid index.......");
				}
			}
				break;

			case 4:
				System.out.println("Exiting...");
				break;

			default:
				System.out.println("Invalid choice!");
			}
		} while (choice != 4);
	}
}

