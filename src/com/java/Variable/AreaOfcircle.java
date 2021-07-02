package com.java.Variable;

import java.util.Scanner;

public class AreaOfcircle 
{
	public static void main(String[] args) 
	{
		double pi=3.14;
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter your radius");
		int radius=scanner.nextInt();
		double area=pi*radius*radius;
		System.out.println("circle area is: "+area);
		
		
		
		
	}
}
