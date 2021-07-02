package com.java.Keywords.FinalKeyWord;

public class Student 
{
	final int S_ID;

public Student(int sID)
{
	this.S_ID=sID;
}
public void disp()
{
	System.out.println("Student id is: "+S_ID);
}
public static void main(String[] args) 
{
	Student s=new Student(1234);
	s.disp();
}
}