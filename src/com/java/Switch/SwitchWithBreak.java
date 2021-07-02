package com.java.Switch;

public class SwitchWithBreak 
{
	public static void main(String[] args) 
	{
		int week=7;
		String dayName="";
		switch(week)
		{
		case 1: dayName="sunday";
		break;
		case 2: dayName="monday";
		break;
		case 3: dayName="tuesday";
		break;
		case 4: dayName="wednesday";
		break;
		case 5: dayName="thursday";
		break;
		case 6: dayName="friday";
		break;
		case 7: dayName="saturday";
		break;
		default : System.out.println("no match is available");
		
		}
		System.out.println(dayName);
	}
}
