package com.firsttestproject;

public class StudentData {
	CityDetails cd=new CityDetails();
	String name;
	int age;
	int marks;
	
	void displayStudentData(String n,int a, int m)
	{
		System.out.println("Name of student is : "+ n +", age of Student is : "+ a +" and marks are : "+ m + " and City is : ");
		cd.displayCity();
		
	}

}
