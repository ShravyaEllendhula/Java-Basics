package com.java.Operators;

public class Logical 
{
	public static void main(String[] args)
	{
		//&&,||,!
		
		 boolean bn1 = true;
	     boolean bn2 = false;

	      System.out.println("bn1 && bn2: " + (bn1&&bn2));
	      System.out.println("bn1 || bn2: " + (bn1||bn2));
	      System.out.println("!(bn1 && bn2): " + !(bn1&&bn2));
	}
}
