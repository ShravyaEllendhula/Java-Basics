package com.java.Keywords.SuperKeyword;

public class Child1 extends Parent1
{
	public void display()
	{
		System.out.println("iam child class display method");
	}
	public void printMsg()
	{
		display();
		super.display();
	}
	public static void main(String[] args) 
	{
		Child1 c=new Child1();
		c.printMsg();
	}
}
