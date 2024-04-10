package com.sunbeam.EmployeePayment;

import java.util.Scanner;

public abstract class Employee 
{
     private String first_name;
     private String second_name;
     private String social_security_number;
     
     
	public Employee() {
		
	}


	public String getFirst_name() {
		return first_name;
	}



	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}



	public String getSecond_name() {
		return second_name;
	}



	public void setSecond_name(String second_name) {
		this.second_name = second_name;
	}



	public String getSocial_security_number() {
		return social_security_number;
	}



	public void setSocial_security_number(String social_security_number) {
		this.social_security_number = social_security_number;
	}



	public Employee(String first_name, String second_name, String social_security_number) 
	{
		this.first_name = first_name;
		this.second_name = second_name;
		this.social_security_number = social_security_number;
	}

	
	public void accept(Scanner sc)
	{
		System.out.println("============EMPLOYEES DETAILS============");
		System.out.println("Enter First name of employee: ");
		first_name = sc.next();
		System.out.println("Enter Last name of employee: ");
		second_name = sc.next();
		System.out.println("Enter social_security_number of employee: ");
		social_security_number = sc.next();
	}
	
	public void display()
	{
		System.out.println("==========EMPLOYEES PAYROLL CALCULATION DETAILS==========");
		System.out.println("First name : "+first_name);
		System.out.println("Last name : "+second_name);
		System.out.println("Social security number : "+social_security_number);
	}
     
	public abstract double calculateTotalSalary(); 
	
	
}
