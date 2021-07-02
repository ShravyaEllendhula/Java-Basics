package com.java.Keywords.SuperKeyword;

public class SubClass extends SuperClass
{
	int a;
	SubClass()
	{
		System.out.println("iam child class constructor");
	}
	SubClass(int a)
	{
		
		System.out.println("iam argumented constructor of child class");
		System.out.println("iam the arugument: "+a);
	}
	public void display()
	{
		System.out.println("Hello! iam display method");
	}
	public static void main(String[] args) 
	{
		SubClass sc=new SubClass();
		sc.display();
		SubClass sc2=new SubClass(10);
		sc.display();
	}
}
