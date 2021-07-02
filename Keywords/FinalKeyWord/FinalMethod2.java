package com.java.Keywords.FinalKeyWord;

public class FinalMethod2 extends FinalMethod1
{
//	final public void demo1()
//	{
//		System.out.println("iam from finaMethod2-class");
//	}
	//not possible to override a final method
	public static void main(String[] args) 
	{
		FinalMethod2 fm2=new FinalMethod2();
		fm2.demo1();
	}
}
