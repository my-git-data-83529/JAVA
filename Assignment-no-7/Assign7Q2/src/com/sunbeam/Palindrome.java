package com.sunbeam;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) 
    {
       
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Enter a string: ");
        
        String str = sc.nextLine();
        
        
        sc.close();
        
        boolean isPalindrome = checkPalindrome(str);
        
        if (isPalindrome) 
        {
            System.out.println(str + " is a palindrome.");
        } 
        else 
        {
            System.out.println(str + " is not a palindrome.");
        }
    }

    public static boolean checkPalindrome(String str) 
    {
        
        // Reverse the string
        String reversed = new StringBuilder(str).reverse().toString();

        // Check if the original string equals the reversed string
        return str.equals(reversed);
    }
}



