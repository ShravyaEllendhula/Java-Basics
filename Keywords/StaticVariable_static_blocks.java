package com.java.Keywords;

public class StaticVariable_static_blocks 
{
	static int id;
	static String name;
	static int age;
	static String designation;
	static
	{
		System.out.println("block1");
		id=1133;
		name="shravya";
	}
	static
	{
		System.out.println("block2");
		age=20;
		designation="developer";
	}
	static
	{
		System.out.println("block3");
		id=200;
		age=22;
	}
	public static void main(String[] args) 
	{
		System.out.println("id is: "+id);
		System.out.println("name is: "+name);
		System.out.println("age is: "+age);
		System.out.println("designation is: "+designation);
	}
}
