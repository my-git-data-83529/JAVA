package tester;

import java.util.Scanner;

import com.sunbeam.EmployeePayment.Basesalariedcommissionemployees;
import com.sunbeam.EmployeePayment.Commissionemployees;
import com.sunbeam.EmployeePayment.Employee;
import com.sunbeam.EmployeePayment.Hourlyemployees;
import com.sunbeam.EmployeePayment.Salariedemployees;

public class payrollcalculations {

	public static void main(String[] args) 
	{
		int type;
		Employee e;
		double Earning;
		Scanner sc = new Scanner(System.in);
        System.out.println("Type 1: Salaried Employee");
        System.out.println("Type 2: Hourly Employee");
        System.out.println("Type 3: Commission Employee");
        System.out.println("Type 4: Base with commission Employee");
        System.out.println("Enter your type: ");
        type = sc.nextInt();
        
        if(type==1)
        {
        	e = new Salariedemployees();
        	e.accept(sc);
        	e.display();
        	Earning = e.calculateTotalSalary();
        	System.out.println("Salaried Employee Earining: "+Earning);
        }
        else if(type==2)
        {
        	e = new Hourlyemployees();
        	e.accept(sc);
        	e.display();
        	Earning = e.calculateTotalSalary();
        	System.out.println("Hourly Employee Earining: "+Earning);
        }
        else if(type==3)
        {
        	e = new Commissionemployees();
        	e.accept(sc);
        	e.display();
        	Earning = e.calculateTotalSalary();
        	System.out.println("Commission Employee Earining: "+Earning);
        }
        else if(type==4)
        {
        	e = new Basesalariedcommissionemployees();
        	Basesalariedcommissionemployees b = null;
        	if(e instanceof Basesalariedcommissionemployees)
        	{	
        	b = (Basesalariedcommissionemployees)e;
        	b.accept(sc);
        	b.display();
        	Earning = b.calculateTotalSalary();
        	System.out.println("Base salaried Commission Employee Earining: "+Earning);
        	System.out.println("After 10 % hike: "+ b.reward());
        }
        else
        {
        	e.accept(sc);
        	e.display();
        	Earning = e.calculateTotalSalary();
        	System.out.println("Base salaried Commission Employee Earining: "+Earning);
        }
        	
        }
        else
        {
        	System.out.println("Enter proper type.......");
        }
		
	}

}
