package com.sunbeam;

import java.util.Comparator;

public class Sort 

{
	
	static void selectionSort(Integer [] arr, Comparator<?> comparator) 
	{
		for(int i=0; i<arr.length-1; i++)
		for(int j=i+1; j<arr.length; j++)
		if(arr[i] > arr[j])
		{
		Integer temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		}
	}
	
	
	

	public static void main(String[] args) 
	{
       Integer[] arr = {9,3,4,5,2,1,8,6,7};
       
        selectionSort(arr, Comparator.naturalOrder());
        
        System.out.println("After sorting:");
        for (Integer num : arr) {
            System.out.print(num + " ");

	}

}
}
