package com.java.While_doWhile;

public class ArrayIteration_Do_while 
{
	public static void main(String[] args) 
	{
		int i[]= {10,20,30};
		int index=0;
		do
		{
			System.out.println(i[index]);
			index++;
		}
		while(index<i.length);
	}
}
