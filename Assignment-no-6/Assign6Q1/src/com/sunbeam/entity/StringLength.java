package com.sunbeam.entity;

import java.util.Scanner;

import com.sunbeam.exceptions.ExceptionLineTooLong;

public class StringLength
{
	
	public static void main(String[] args)
	
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE STRING:-");
		String s = sc.nextLine();
		
		try
		{
			int length = s.length();
			if(length > 80)
			{
			
			throw new ExceptionLineTooLong();
		
			}
			
			//System.out.println("STRING LENGTH IS:-"+length);
		}
		
		 catch (ExceptionLineTooLong e) 
		{
		  e.printStackTrace();
			
		} 
		finally 
		{
		 System.out.println("Inside Finally block");
		 sc.close();
	        }
			
			System.out.println("Program Executed Successfully");
		
       }

		
		
		
		
		
	
	

	
}
