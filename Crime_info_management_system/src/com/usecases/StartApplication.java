package com.usecases;

import java.util.Scanner;

public class StartApplication {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=============================================================");		
		System.out.println("\tWelcome to Crime Information Management System");
		System.out.println("=============================================================");
		
		
		boolean stop = false;
		
		while(!stop) {
			System.out.println("=============================================================");
			System.out.println("Select choice");
			System.out.println("=============================================================");
			System.out.println("1. Register new police station");
			System.out.println("2. Display all police station's");
			System.out.println("3. Register new police");
			System.out.println("4. display police details");
			System.out.println("5. Register new crime");
			System.out.println("6. exit");
			System.out.println("-------------------------------------------------------------");
			
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1: RegisterPoliceStation.registerPoliceStation();break;
			case 2: GetAllPoliceStationDetails.getAllPoliceStationDetails();break;
			case 3: RegisterPolice.registerPolice();break;
			case 4: GetPoliceDetails.getAllPoliceDetails();break;
			case 5: RegisterNewCrime.registerNewCrimeDetails();
			case 6: stop = true;break;
			default: System.out.println("please select right choice");
			
			}
		}
		
		
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("--- Thank You For Using Crime Information management System Application ---");
		System.out.println("---------------------------------------------------------------------------");
		
	}

}
