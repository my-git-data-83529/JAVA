package com.sunbeam;

import java.util.Scanner;

public class Wordcounter 
{



    public static void main(String[] args) 
  {

    
    Scanner sc = new Scanner(System.in);
    
    
    System.out.print("Enter a sentence: ");
    
   String sentence = sc.nextLine();
    
    int wordCount = countWords(sentence);
    
    
    sc.close();

        System.out.println("Number of words in the string: " + wordCount);
    }

    public static int countWords(String str) 
    {
        
        str = str.trim();

        
        if (str.isEmpty()) 
        {
            return 0;
        }

        
        String[] words = str.split("\\s+");

        
        return words.length;
    }

}

	

