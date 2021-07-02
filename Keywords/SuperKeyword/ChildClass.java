package com.java.Keywords.SuperKeyword;

public class ChildClass extends ParentClass
{
	int num=110;
	public void printNum()
	{
		System.out.println("parent class num: "+super.num);
		System.out.println("child class num: "+num);
	}
	public static void main(String[] args) 
	{
		ChildClass cc=new ChildClass();
		cc.printNum();
	}
}
