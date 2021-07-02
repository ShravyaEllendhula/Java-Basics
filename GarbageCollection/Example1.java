package com.java.GarbageCollection;

public class Example1 
{
	public static void main(String[] args) 
	{
		//1st case
		Example1 example1=new Example1();
		example1=null;
		
		//2nd case
		Example1 example=new Example1();
		Example1 example2=new Example1();
		example=example2;
		System.gc();
		
	}
	protected void finalize() throws Throwable
	{
		System.out.println("garbge collection is performed by jvm");
	}
}
