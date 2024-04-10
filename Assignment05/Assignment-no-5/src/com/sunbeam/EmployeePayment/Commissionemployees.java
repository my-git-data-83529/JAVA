package com.sunbeam.EmployeePayment;

import java.util.Scanner;

public class Commissionemployees extends Employee {

	private double gross_sale;
	private double commission_rate;
	
	public Commissionemployees() 
	{
		super();
	
	}

	public Commissionemployees(String first_name, String second_name, String social_security_number, double gross_sale, double commission_rate) 
	{
		super(first_name, second_name, social_security_number);
		this.gross_sale = gross_sale;
		this.commission_rate = commission_rate;
	}
	
	@Override
	public void accept(Scanner sc) 
	{
		super.accept(sc);
		System.out.println("Enter gross sale: ");
		gross_sale = sc.nextDouble();
		System.out.println("Enter commission rate: ");
		commission_rate = sc.nextDouble();
	}
	
	@Override
	public void display() 
	{
		super.display();
		System.out.println("Gross sale: "+gross_sale);
		System.out.println("Commission rate: "+commission_rate);
	}

	@Override
	public double calculateTotalSalary() {
		
		return commission_rate * gross_sale;
	}
}