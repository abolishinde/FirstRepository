package com.assignment;
import java.util.*;
public class Pattern 
{
 public static void main(String[] args) 
 {
	    System.out.println("Enter number of rows");
		Scanner scan= new Scanner(System.in);
		int rows=scan.nextInt();
		int i,j;
		for(i = rows; i >= 1;i--) {
            for(j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
	 
	 
 }
}
