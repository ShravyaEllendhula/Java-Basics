package com.java.Keywords.FinalKeyWord;

public class Demo1 
{
	final int MAX_VALUE=100;
	public void disp()
	{
		//MAX_VAlUE=20;//we cannot reinitialze the final variable
	}
	public static void main(String[] args) 
	{
		Demo1 d1=new Demo1();
		d1.disp();
	}
}
