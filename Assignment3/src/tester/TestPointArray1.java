package tester;

import java.util.Scanner;

import com.app.geometry.point2d;

public class TestPointArray1 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of points to plot: ");
        int numOfPoints = sc.nextInt();
        
        point2d[] points = new point2d[numOfPoints];
        
        
        for (int i = 0; i < numOfPoints; i++) {
            System.out.print("Enter x coordinate for point " + (i + 1) + ": ");
            double x = sc.nextDouble();
            System.out.print("Enter y coordinate for point " + (i + 1) + ": ");
            double y = sc.nextDouble();
            points[i] = new point2d(x, y);
        }
        
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Display details of a specific point");
            System.out.println("2. Display x, y coordinates of all points");
            System.out.println("3. Calculate distance between specified points");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    displayPointDetails(points, sc);
                    break;
                case 2:
                    displayAllPoints(points);
                    break;
                case 3:
                    calculateDistance(points, sc);
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
        
        sc.close();
    }

	private static void calculateDistance(point2d[] points, Scanner sc) {
		
		
	}

	private static void displayPointDetails(point2d[] points, Scanner sc) {

	}

	
	private static void displayAllPoints(point2d[] points) {
			
	}
    
	
	}
