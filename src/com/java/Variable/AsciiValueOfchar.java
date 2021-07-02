package com.java.Variable;

import java.util.Scanner;

public class AsciiValueOfchar 
{
	public static void main(String[] args) 
	{
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter your character");
		char ch=scanner.next().charAt(0);
		System.out.println((int)ch);
		
	}
}
