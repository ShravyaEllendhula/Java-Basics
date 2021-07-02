package com.java.controlStatements;

public class NestedIf 
{
	public static void main(String[] args)
	{
		int i=10;
		int j=30;
		int k=20;
		
		if(i<j)
		{
			if(i<k)
			{
				System.out.println("i is smallest");
			}
		}
		if(j>i)
		{
			if(j>k)
			{
				System.out.println("j is biggest");
			}
		}
		if(k<j)
		{
			if(k>i)
			{
				System.out.println("k is smalle then j and bigger then i");
			}
		}
		else
		{
			System.out.println("error");
		}
	}
}
