package com.java.Continue_break;

public class Continue_doWhile 
{
	public static void main(String[] args) 
	{
		int num=1;
		do
		{
			if(num==5)
			{
				num++;
				continue;
			}
			System.out.println(num);
			num++;
			
		}
		while(num<=10);
	}
}
