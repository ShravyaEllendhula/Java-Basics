package com.java.Variable;

public class InstanceVariable 
{
	String message="hi all iam instance member";
	
	public static void main(String[] args)
	{
		InstanceVariable instanceVariable=new InstanceVariable();
		InstanceVariable instanceVariable2=new InstanceVariable();
		
		System.out.println(instanceVariable.message);
		System.out.println(instanceVariable2.message);
		
		instanceVariable2.message="hi iam instance and changed inside 2nd object";
		
		 
		System.out.println(instanceVariable.message);
		System.out.println(instanceVariable2.message);
	}
}
