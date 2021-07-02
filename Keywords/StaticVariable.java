package com.java.Keywords;

public class StaticVariable 
{
	static String CompanyName;
	static
	{
		CompanyName="TCS";
	}
	String name;
	String name2;
	{
		name="shravya";
		name2="sai";
	}
	public static void main(String[] args) 
	{
		StaticVariable variable=new StaticVariable();
		StaticVariable variable2=new StaticVariable();
		variable.CompanyName="CTS";
		variable2.CompanyName="tcs";
		System.out.println(variable2.name+":"+variable2.CompanyName);
		System.out.println(variable.name2+":"+variable.CompanyName);
		
	}
}
