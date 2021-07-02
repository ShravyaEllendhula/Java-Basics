package com.java.While_doWhile;

import java.util.Scanner;

public class Factorial 
{
	public static void main(String[] args) 
	{
		int fact=1;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter your number");
		int num=scanner.nextInt();
		int i=1;
		while(i<=num)
		{
			fact=fact*i;
			i++;
		}
		System.out.println(fact);
	}
}
