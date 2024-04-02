import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		int num1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the no-");
		num1 = sc.nextInt();
		
		System.out.println("Given no - "+num1);
	    System.out.println("Binary no-"+Integer.toBinaryString(num1));
	    System.out.println("Octal no-"+Integer.toOctalString(num1));
	    System.out.println("Hxadecimal no-"+Integer.toHexString(num1));
		
	
				

	}

}
