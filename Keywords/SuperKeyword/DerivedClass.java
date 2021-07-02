package com.java.Keywords.SuperKeyword;

public class DerivedClass extends BaseClass
{
	DerivedClass()
	{
		super("hahaha");//default constructor  of super class didnot invoked
		System.out.println("iam derived class constructor");
	}
	public void display()
	{
		System.out.println("hello!!");
	}
	public static void main(String[] args) 
	{
		DerivedClass dc=new DerivedClass();
		dc.display();
	}
}
