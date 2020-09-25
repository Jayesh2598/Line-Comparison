package com.capgemini.training;

import java.util.Random;
import java.lang.Math;

public class LineComparison {
	
	public int x1,y1,x2,y2;

	public LineComparison(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	//Overriding compareTo method
	public int compareTo(LineComparison L) {
		if(this.LengthCalculator() == L.LengthCalculator())
			return 0;
		else if (this.LengthCalculator() > L.LengthCalculator())
			return 1;
		else
			return -1;
	}

	public static void main(String[] args) {
		
		System.out.println("Welcome to Line Comparison Computation Program!");
		
		//Generating random points
		int[] point1=points();			//Line 1 end points
		int[] point2=points();
		LineComparison Line1 = new LineComparison(point1[0], point1[1], point2[0], point2[1]);
		
		int[] point3=points();			//Line 2 end points
		int[] point4=points();
		LineComparison Line2 = new LineComparison(point3[0], point3[1], point4[0], point4[1]);
		
		//Calculating the length of both lines
		
		System.out.println("Points: ("+ point1[0] + ","+point1[1] +  ") ; ("+ point2[0] + "," +point2[1]+")");
		System.out.println("Points: ("+ point3[0] + ","+point3[1] +  ") ; ("+ point4[0] + "," +point4[1]+")");
		System.out.println("Line 1 length : "+Line1.LengthCalculator());
		System.out.println("Line 2 length : "+Line2.LengthCalculator());
		
		//Checking equality using CompareTo method
		int result= Line1.compareTo(Line2);
		if(result==0)
			System.out.println("Both the lines are equal in length.");
		else if (result<0)
			System.out.println("Length of line 1 is less than length of line 2.");
		else
			System.out.println("Length of line 1 is greater than length of line 2.");
	}
	
	public static int[] points() {
		
		int[] point=new int[2];
		Random ran = new Random();
		point[0]= ran.nextInt(1000);
		point[1]= ran.nextInt(1000);
		return point;
		
	}
	
	public double LengthCalculator() {
		
		double distance= Math.sqrt( Math.pow((this.x2- this.x1),2) + Math.pow((this.y2- this.y1),2) );
		return distance;
	}
	
	
}
