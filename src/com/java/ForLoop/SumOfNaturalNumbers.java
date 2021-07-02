package com.java.ForLoop;

import java.util.Scanner;

public class SumOfNaturalNumbers 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter your number");
		int num=scanner.nextInt();
		int sum=0;
		for(int i=0;i<=num;i++)
		{
			sum=sum+i;
		}
		System.out.println("sum is = "+sum);
		
	}
}
