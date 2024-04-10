package com.sunbeam.EmployeePayment;

import java.util.Scanner;

public class Salariedemployees extends Employee {
	
	private double weeklysalary;
	
	public Salariedemployees() 
	{
		super();
	}

	public Salariedemployees(String first_name, String second_name, String social_security_number, double weeklysalary) 
	{
		super(first_name, second_name, social_security_number);
		this.weeklysalary = weeklysalary;
	}
	
	@Override
	public void accept(Scanner sc) 
	{
		super.accept(sc);
		System.out.println("Enter weekly salary: ");
		weeklysalary = sc.nextDouble();
	}
	
	@Override
	public void display() 
	{
		super.display();
		System.out.println("Weekly salary : "+weeklysalary);
		
	}

	@Override
	public double calculateTotalSalary() 
	{
		return weeklysalary;
	}

	
}
