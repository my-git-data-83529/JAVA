package com.sunbeam.exceptions;

import com.sunbeam.entity.StringLength;

public class ExceptionLineTooLong extends Exception 
{

       
private String message;

public ExceptionLineTooLong() 
{
			
}
		
@Override
public void printStackTrace() 
{
System.err.println("String is too long......");
}

}

