package com.java.Operators;

public class Relational 
{
	public static void main(String[] args) 
	{
		//>,<,==,,>=,<=,!=
		
				int n1=20;
				int n2=30;
				int n3=20;
				
				System.out.println("n1: "+n1);
				System.out.println("n2: "+n2);
				System.out.println("n3: "+n3);
				
				if(n1==n3)
				{
					System.out.println("n1==n3 -->n1 and n3 are same");
				}
				else
				{
					System.out.println("n1==n3-->n1 and n3 are not same");
				}
				
				if(n1>n2)
				{
					System.out.println("n1>n2--n1 is bigger then n2");
					
				}
				else
				{
					System.out.println("n1>n2--n2 is bigger then n1");
				}
				if(n3<n2)
				{
					System.out.println("n3<n2--n3 is smaller then n2");
				}
				else
				{
					System.out.println("n3<n2--n3 is bigger then n2");
				}
				if(n1<=n3)
				{
					System.out.println("n1<=n3--n1 and n3 are equal");
				}
				else
				{
					System.out.println("n1<=n3--n1 is smaller then n3");
				}
				if(n2>=n3)
				{
					System.out.println("n2>=n3--n3 is smaller then n2");
					
				}
				else
				{
					System.out.println("n2>=n3--n3 and n2 are equal");
				}
				if(n1!=n2)
				{
					System.out.println("n1!=n2--n1 and n2 are not equal");
				}
	}
}
