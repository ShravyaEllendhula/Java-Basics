package com.java.Variable;

import java.util.Scanner;

public class TriangleArea
{
	public static void main(String[] args) 
	{
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter bedth value");
		double b=scanner.nextDouble();
		System.out.println("enter hight value");
		double h=scanner.nextDouble();
		double area=  0.5*(b*h);
		System.out.println(area);
	}
}
