package com.java.Keywords.FinalKeyWord;

public class BlankFinal 
{
	final int MAX_VALUE;
	BlankFinal()
	{
		MAX_VALUE=100;
	}
	public void disp()
	{
		System.out.println(MAX_VALUE);
	}
	public static void main(String[] args) 
	{
		BlankFinal bf=new BlankFinal();
		bf.disp();
	}
}
