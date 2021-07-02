package com.java.Continue_break;

public class Continue_while 
{
	public static void main(String[] args) 
	{
		int number=6;
		while(number>0)
		{
			if(number==3)
			{
				number--;
				continue;
			}
			 System.out.println(number);
			 number--;
		}
	}
}
