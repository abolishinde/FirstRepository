package com.assignment;

public class Sphere 
{
	 double radius;
	
	 public Sphere()
	 {
		 
       super();
       this.radius=radius;
	 }
	  
	 public double surface_area()
	 {
		 double SurfaceArea = 4*Math.PI*radius*radius;
		 return SurfaceArea;
	 }
	 public double volume()
	 {
		 double Volume=(4/3)*Math.PI*radius*radius*radius;
		 return Volume;
	 }
}
