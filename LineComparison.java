package com.capgemini.training;

import java.util.Random;
import java.lang.Math;

public class LineComparison {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Line Comparison Computation Program!");
		
		//Generating random points
		int[] point1=points();			//Line 1 end points
		int[] point2=points();
		
		int[] point3=points();			//Line 2 end points
		int[] point4=points();
		
		//Calculating the length of both lines
		Double line1_length = new Double(LengthCalculator(point1, point2));
		Double line2_length = new Double(LengthCalculator(point3, point4));
		
		System.out.println("Points: ("+ point1[0] + ","+point1[1] +  ") ; ("+ point2[0] + "," +point2[1]+")");
		System.out.println("Points: ("+ point3[0] + ","+point3[1] +  ") ; ("+ point4[0] + "," +point4[1]+")");
		System.out.println("Line 1 length : "+line1_length);
		System.out.println("Line 2 length : "+line2_length);
		
		//Checking equality using equals method
		System.out.println("Are the two lines equal? "+ line1_length.equals(line2_length));
	}
	
	public static int[] points() {
		
		int[] point=new int[2];
		Random ran = new Random();
		point[0]= ran.nextInt(1000);
		point[1]= ran.nextInt(1000);
		return point;
		
	}
	
	public static double LengthCalculator(int[] point1, int[] point2) {
		
		double distance= Math.sqrt( Math.pow((point1[0]- point2[0]),2) + Math.pow((point1[1]- point2[1]),2) );
		return distance;
	}
	
	
}
