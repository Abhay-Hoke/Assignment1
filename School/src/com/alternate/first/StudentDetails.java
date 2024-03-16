package com.alternate.first;

import java.util.Scanner;



public class StudentDetails {

	public static void main(String[] args) {
		Student stu = new Student();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Name of Student: ");
		stu.name = sc.nextLine();
		
		System.out.print("Enter RollNumber: ");
		stu.rollNumber = sc.nextInt();
		
		System.out.print("Enter Standards: ");
		stu.standards = sc.nextInt();
		
		System.out.print("Enter Marks: ");
		stu.marks = sc.nextFloat();

		System.out.printf("%-10s%-20s%-20s%-20s\n","Name","Roll Number","Standards","Marks");
		System.out.printf("%-10s%-20d%-20d%-20f\n",stu.name,stu.rollNumber,stu.standards,stu.marks);
		
		
		
		// TODO Auto-generated method stub

	}

}
