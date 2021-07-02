package com.java.Variable;

public class StaticVariable 
{
	static String message="hi iam a static member";
	public static void main(String[] args) 
	{
		System.out.println("accessed by class name: "+StaticVariable.message);
		
		StaticVariable staticVariable1 = new StaticVariable();
		StaticVariable staticVariable2 = new StaticVariable();
		 
		System.out.println(staticVariable1.message);
		System.out.println(staticVariable2.message);
		
		staticVariable1.message="hi iam static but iam changed inside so each object got reflected";
		
		
		StaticVariable staticVariable3 = new StaticVariable();
		StaticVariable staticVariable4 = new StaticVariable();
		
		 System.out.println(staticVariable1.message);
		 System.out.println(staticVariable2.message);
		 System.out.println(staticVariable3.message);
		 System.out.println(staticVariable4.message);
		
	}
}
