package com.java.While_doWhile;

import java.util.Scanner;

public class Fibonacy 
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter your number");
		int num=scanner.nextInt();
		int a=0;
		int b=0;
		int c=1;
		int i=1;
		while(i<=num)
		{
			a=b;
			b=c;
			c=a+b;
			System.out.println(a);
			i++;
		}
	}
}
