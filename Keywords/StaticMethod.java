package com.java.Keywords;

public class StaticMethod 
{
	public static void myinfo()
	{
		System.out.println("iam shravya");
	}
	public void studentsInfo()
	{
		System.out.println("iam non static method");
		myinfo();
	}
	public static void main(String[] args) 
	{
		myinfo();
		StaticMethod method=new StaticMethod();
		method.studentsInfo();
	}
}
