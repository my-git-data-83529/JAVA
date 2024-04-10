package com.sunbeam.EmployeePayment;

import java.util.Scanner;

public class Basesalariedcommissionemployees extends Commissionemployees
{

	private double base_salary;
	
	
	public Basesalariedcommissionemployees() 
	{
		super();
	}

	public Basesalariedcommissionemployees(String first_name, String second_name, String social_security_number,
			double gross_sale, double commission_rate, double base_salary) 
	{
		super(first_name, second_name, social_security_number, gross_sale, commission_rate);
		this.base_salary = base_salary;
	}
	
	@Override
	public void accept(Scanner sc) 
	{
		super.accept(sc);
		System.out.println("Enter base salary: ");
		base_salary = sc.nextDouble();
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("Base salary: "+base_salary);
	}
	 
	@Override
	public double calculateTotalSalary() 
	{
		
		return super.calculateTotalSalary()+ base_salary;
	}
	public double reward()
	{
		return calculateTotalSalary()+base_salary*.10;
	}
}
