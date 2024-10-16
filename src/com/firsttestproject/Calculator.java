package com.firsttestproject;
 public class Calculator {
	 calcSpecifications cs=new calcSpecifications();
	 int multiple;
	 
	void addTwoNumbers(int n1,int n2)
	{
		
		int sum=n1+n2;
		System.out.println("Sum of two Numbers is "+sum);
		
	}
	void subtractTwoNumbers(int n1,int n2)
	{
		int difference= n1-n2;
		System.out.println("difference of two Numbers is "+difference);
	}
	void multyplyTwoNum(int n1, int n2)
	{
		multiple=n1*n2;
		}

} 
 class calcSpecifications
 {
	 	int price=999;
		String cName="CASIO";
 }

class TestCalculator
{
	public static void  main(String[] args)
	{
		Calculator c1=new Calculator();
		StudentData s1=new StudentData();
		
		c1.addTwoNumbers(18, 150);
		c1.subtractTwoNumbers(78, 34);
		c1.multyplyTwoNum(12,11);
		c1.addTwoNumbers(45, 23);
		c1.subtractTwoNumbers(45, 23);
		c1.multyplyTwoNum(45, 23);
		System.out.println("Price of calculator is = " +c1.cs.price);
		System.out.println("Name of calculator is = " +c1.cs.cName);
		System.out.println("Multiplication of two numbers is = " +c1.multiple);
		s1.displayStudentData("Aman", 22, 78);
		s1.displayStudentData("Rajinder", 40, 80);
		s1.displayStudentData("Daman", 37, 81);
		s1.displayStudentData("Hardit", 7, 90);

	}
	
}


