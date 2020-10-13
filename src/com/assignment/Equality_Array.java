package com.assignment;
import java.util.*;
public class Equality_Array {
	public static void main(String[] args)
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter number of element :");
		int n=scan.nextInt();
		int array_1[]=new int[n];
		System.out.println("Enter elements in 1st array :"+n);
		for(int i=0;i<n;i++)
		{

			 array_1[i] =scan.nextInt();
		}
	    int array_2[]=new int[n];
	    System.out.println("Enter elements in 2nd array :"+n);
	    for(int j=0;j<n;j++)
	    {
			 array_2[j] =scan.nextInt(); 
		 
	    }
		
		if(Arrays.equals(array_1,array_2))
		{
			 System.out.println("Same"); 
		}
        else 
            System.out.println("Not same"); 
       
		scan.close();
	}
}
