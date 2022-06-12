package com.bridgelabz;

import java.util.Arrays;
import com.bridgelabz.utility.SortingFunction;
import com.bridgelabz.utility.Utility;

public class BinarySearchString
{      	    
	public static void main(String[] args)
	{
		SortingFunction sf=new SortingFunction();  
		Utility u=new Utility();
		System.out.println("Enter number of words to be sorted: ");
		int arraySize1=u.inputInteger();
		String b[]=sf.input1DStringArray(arraySize1);
		Arrays.sort(b);									//sorting the array
		System.out.println();

		System.out.println("The Sorted Order is: ");
		sf.print1DStringArray(b);						//printing the sorted array
		System.out.println();

		System.out.println("Enter Key: ");
		int p=sf.binarySearchString(b,u.inputString());

		if(p==-1)
		{
			System.out.println();
			System.out.println("Not Found");
		}
		else
		{
			System.out.println();
			System.out.println("Found at "+p+" position");
		}	        
	}
}
