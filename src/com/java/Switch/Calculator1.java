package com.java.Switch;
 import java.util.Scanner;

public class Calculator1 
{
	public static void main(String[] args) 
	{
		
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter your 1st number");
		int num1=scanner.nextInt();
		System.out.println("enter your 2nd number");
		int num2=scanner.nextInt();
		
		System.out.println("enter your operatior(+,-,*,/,%)");
		char operator=scanner.next().charAt(0);
		
		double result;
		switch(operator)
		{
		case '+':
			result=num1+num2;
			break;
		case '-':
			result=num1-num2;
		    break;
		case '*':
			result=num1*num2;
			break;
		case '/':
			result=num1/num2;
			break;
		case '%':
			result=num1%num2;
			break;
		default: System.out.println("you have entered wrong operator");
		return;
		}
		
		System.out.println(num1+" "+operator+" "+num2+" = "+result);
		
		
	}
}
