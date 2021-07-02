package com.java.Keywords.SuperKeyword;

public class Derived1 extends Base1
{
	public void printMsg()
	{
		display();
	}
	public static void main(String[] args) 
	{
		Derived1 c=new Derived1();
		c.printMsg();
	}
}
