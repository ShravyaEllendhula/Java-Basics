package com.java.Switch;

public class EnumSwitch 
{
	public enum day{s,m,t,w,T,f,S};
	public static void main(String[] args) 
	{
		
		day[] days=day.values();
		for(day alldays:days)
		{
			switch(alldays)
			{
			case s:
				System.out.println("sunday");
				break;
			case m:
				System.out.println("monday");
				break;
			case t:
				System.out.println("tuesday");
				break;
			case w:
				System.out.println("wednesday");
				break;
			case T:
				System.out.println("Thursday");
				break;
			case f:
				System.out.println("friday");
				break;
			case S:
				System.out.println("Saturday");
				break;
			}
		}
	}
}
