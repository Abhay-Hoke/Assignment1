package com.example.second;

import java.util.Scanner;

class Vehicle{
	String vehicleType;
	String modelName;
	int vehicleNumber;
	
	public void acceptRecord(String name,String model,int number){
		this.vehicleType = name;
		this.modelName = model;
		this.vehicleNumber = number;	
	}
	public void printRecords() {
		System.out.printf("%-20s%-20s%-20s","Vehicle Type","Model Name","Vehicle Number");
		System.out.println();
		System.out.printf("%-20s%-20s%-20d",vehicleType,modelName,vehicleNumber);
	}
}

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Vehicle veh = new Vehicle();
		
		System.out.print("Enter Vehicle Type: ");
		String name = sc.nextLine();
		
		System.out.print("Enter Model Name: ");
		String model = sc.nextLine();
		
		System.out.print("Enter Vehicle Number: ");
		int number = sc.nextInt();
		veh.acceptRecord(name,model,number);
		
		veh.printRecords();
		
				// TODO Auto-generated method stub

	}

}
