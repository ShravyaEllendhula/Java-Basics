package com.java.Switch;

import java.util.Scanner;

public class VowelsOrConsonants
{
	public static void main(String[] args) 
	{
		boolean isVowel=false;
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter your alphabet");
		char ch=scanner.next().charAt(0);
		switch(ch)
		{
		case 'a':
		case'e':
		case'i':
		case'o':
		case'u':
		case'A':
		case'E':
		case'I':
		case'O':
		case'U': 
		isVowel=true;
		}
		if(isVowel==true)
		{
			System.out.println("given characher '"+ch+"' is vowel");
		}
		else
		{
			if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
			{
				System.out.println("the given character '"+ch+"' is consonent");
			}
			else
			{
				System.out.println("entered char is not an alphabet");
			}
		}
	}
	
	
}
