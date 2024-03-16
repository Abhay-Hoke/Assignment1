package com.example.third;
import java.util.Scanner;



class Emplyoee{
	String name;
	int empId;
	float salary;
	int insuranceNumber;
	int maturityYear;
	float premium;

	public void acceptRecord(String n,int i,float s) {
	this.name = n;
	this.empId = i;
	this.salary = s;
	}
	
	public void acceptRecord(int e,int y,float p){
		this.insuranceNumber = e;
		this.maturityYear = y;
		this.premium = p;
}
	
	
	public void printRecord() {
		System.out.printf("%-20s%-15s%-15s%-15s%-15s%-15s","Name","EMPID","Salary","Ins.Number","Maturity Year","Premium");
		System.out.println();
		System.out.printf("%-20s%-15d%-15f%-15d%-15d%-15f",name,empId,salary,insuranceNumber,maturityYear,premium);
	}
}	
	
	
	public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Emplyoee emp = new Emplyoee();
		
		System.out.print("Enter Name: ");
		String n = sc.nextLine();
		
		System.out.print("Enter EmpID: ");
		int i = sc.nextInt();
		
		System.out.print("Enter Salary: ");
		float s = sc.nextFloat();
		
		System.out.print("Enter Insurance Number: ");
		int e = sc.nextInt();
		
		System.out.print("Enter Maturity Year: ");
		int y = sc.nextInt();
		
		System.out.print("Enter Premium: ");
		float p = sc.nextFloat();
		
		emp.acceptRecord(n,i,s);
		emp.acceptRecord(e,y,p);
		emp.printRecord();
		
		
		
		
		
		
		
		
		

	}

}
