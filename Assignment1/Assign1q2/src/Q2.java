import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		
		double num1=0;
		double num2=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num1-");
		if(sc.hasNextDouble())
		{
		num1=sc.nextDouble();
		}
		else
		{
			System.out.println("Given Argument is not Double");
			System.exit(0);
		}
		System.out.println("Enter the num2-");
		if(sc.hasNextDouble())
		{
		num2=sc.nextDouble();
		}
		else
		{
			System.out.println("Given Argument is not Double");
			System.exit(0);
		}
		
		System.out.println("Average is"+(num1+num2)/2);
		
		
	}

}