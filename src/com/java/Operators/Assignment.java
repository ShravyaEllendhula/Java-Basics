package com.java.Operators;

public class Assignment 
{
	public static void main(String[] args) 
	{
		//=,+=,-=,*=,/=,%=
		int x=10;
		int y=100;
		
		System.out.println("x value: "+x);
		System.out.println("y valye: "+y);
		y=x;
		System.out.println("y=xx: "+y);
		y+=x;//y=y+x;
		System.out.println("y+=x: "+y);
		y-=x;
		System.out.println("y-=x: "+y);
		y*=x;
		System.out.println("y*=x: "+y);
		y/=x;
		System.out.println("y/=x: "+y);
		y%=x;
		System.out.println("y%=x: "+y);
	}
}
