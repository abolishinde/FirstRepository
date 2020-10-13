package com.assignment;
import java.util.*;

public class SphereTest 
{

	public static void main(String[] args) 
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("Enetr Radius:");
		Sphere s=new Sphere();
		s.radius=scan.nextDouble();
		double a=s.surface_area();
		System.out.println("Surface Area is :"+a);
		double v=s.volume();
		System.out.println("Volume of sphere is :"+v);
		scan.close();
	}

}
