package com.java.Operators;

import java.util.Scanner;

public class SmallestNumberUsingTernary 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter your 1st number");
		int i=scanner.nextInt();
		System.out.println("enter your 2nd number");
		int j=scanner.nextInt();
		System.out.println("enter your 3rd number");
		int k=scanner.nextInt();
		
		int temp=i<j?i:j;
		int result=k<temp?k:temp;
		System.out.println("your smallest number is:"+result);
	}
}
