package com.java.ForLoop;

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
		int c=1 ;
		for(int i=2;i<=num;i++)
		{
			  a=b;
			  b=c;
			  c=a+b;
			  System.out.println(a);
		}
	}
}
