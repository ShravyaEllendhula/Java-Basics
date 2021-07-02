package com.java.Keywords;

public class StaticMembers 
{
	static int age;
	static
	{
		age=20;
		System.out.println("iam static block");
	}
	public static void staticMethod()
	{
		System.out.println("iam static method of outer class");
	}
	public static class StaticClass
	{
		public static void method2()
		{
			System.out.println("i am static inner class method");
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("age is:"+age);
		staticMethod();
		StaticMembers.StaticClass sc =new StaticMembers.StaticClass();
		sc.method2();
		
	}
}
