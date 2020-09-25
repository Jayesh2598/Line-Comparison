package com.capgemini.training;

import java.util.Random;
import java.lang.Math;

public class LineComparison {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Line Comparison Computation Program!");
		
		//Generating random points
		int[] point1=points();
		int[] point2=points();
		
		//Calculating the distance between the two points
		double line_length = LengthCalculator(point1, point2);
		
		System.out.println("Points: ("+ point1[0] + ","+point1[1] +  ") ; ("+ point2[0] + "," +point2[1]+")");
		System.out.println(line_length);
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
