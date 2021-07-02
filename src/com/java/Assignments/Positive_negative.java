package com.java.Assignments;

import java.util.Scanner;

public class Positive_negative 
{
	public static void main(String[] args) 
	{
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter your number");
		int number=scanner.nextInt();
		if(number<0)
		{
			System.out.println("given number is negative ");
		}
		else if(number>0)
		{
			System.out.println("given number is positive");
		}
		else
		{
			System.out.println("given number is zero");
		}
	}
}
