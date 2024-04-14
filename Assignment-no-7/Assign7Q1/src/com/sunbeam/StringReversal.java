package com.sunbeam;

public class StringReversal
{
	

	    public static String reverseWithStringBuilder(String input) 
	    {
	        StringBuilder sb = new StringBuilder(input);
	        
	        return sb.reverse().toString();
	    }

	    public static void main(String[] args) 
	    {
	        String input = "Shrutika Patil";
	        
	        String reversed = reverseWithStringBuilder(input);
	        
	        System.out.println("Original: " + input);
	        
	        System.out.println("Reversed: " + reversed);
	    }
	
}


