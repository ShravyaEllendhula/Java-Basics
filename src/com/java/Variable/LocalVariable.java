package com.java.Variable;

public class LocalVariable
{
	public static void number()
	{
		int n=10;
		System.out.println("iam a local-variable from number method: "+n);
	}
	public static void main(String[] args) 
	{
		int n=20;
		System.out.println("iam local-variable from calling method: "+n);
		LocalVariable.number();
	}
}
