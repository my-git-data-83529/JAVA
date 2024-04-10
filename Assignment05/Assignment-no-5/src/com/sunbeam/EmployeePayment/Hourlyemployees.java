package com.sunbeam.EmployeePayment;

import java.util.Scanner;

public class Hourlyemployees extends Employee
{

	private double wages;
	private double hours;
	
	public Hourlyemployees() 
	{
		super();
	}

	public Hourlyemployees(String first_name, String second_name, String social_security_number, double wages, double hours) {
		super(first_name, second_name, social_security_number);
		this.wages = wages;
		this.hours = hours;
	}
	
	@Override
	public void accept(Scanner sc) 
	{
		super.accept(sc);
		System.out.println("Enter wages: ");
		wages = sc.nextDouble();
		System.out.println("Enter hours: ");
		hours = sc.nextDouble();
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("Wages: "+wages);
		System.out.println("hours: "+hours);
	}

	@Override
	public double calculateTotalSalary() {
		if(hours<=40)
		{
			return wages*hours;
		}
		else if(hours>40)
		{
			return (40*wages + (hours-40) * wages *1.5 );
		}
		return 0;
	}

}
