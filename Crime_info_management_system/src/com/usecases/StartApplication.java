package com.usecases;

import java.util.Scanner;

public class StartApplication {

	static void policeStation() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println();	
		System.out.println("=============================================================");		
		System.out.println("\t--- police station menu ---");
		System.out.println("=============================================================");
		
		System.out.println("1. Register new police station");
		System.out.println("2. Display all police station's");
		System.out.println("3. Go to main menu");
		
		
		int ch = sc.nextInt();
		
		switch(ch) {
		case 1: RegisterPoliceStation.registerPoliceStation();break;
		case 2: GetAllPoliceStationDetails.getAllPoliceStationDetails();break;
		case 3: return;
		default:System.out.println("please select correct option");
		}
		
		}
		
	}
	
	//police
	static void police() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println();	
		System.out.println("=============================================================");		
		System.out.println("\t--- police menu ---");
		System.out.println("=============================================================");
		
		System.out.println("1. Register new police");
		System.out.println("2. Display All police details");
		System.out.println("3. Go to main menu");
		
		
		int ch = sc.nextInt();
		
		switch(ch) {
		case 1: RegisterPolice.registerPolice();break;
		case 2: GetPoliceDetails.getAllPoliceDetails();break;
		case 3: return;
		default:System.out.println("please select correct option");
		}
		
		}
		
	}
	
	//crime
	static void crime() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println();	
		System.out.println("=============================================================");		
		System.out.println("\t--- Crime menu ---");
		System.out.println("=============================================================");
		
		System.out.println("1. Register new crime");
		System.out.println("2. Display all crime details");
		System.out.println("3. Display particular police station's Crime Information");
		System.out.println("4. Display Area wise crime");
		System.out.println("5. Check Number of solved and unsolved crimes");
		System.out.println("6. Get current month crimes records");
		System.out.println("7. Update Crime status");
		System.out.println("8. Go to main menu");
		
		
		int ch = sc.nextInt();
		
		switch(ch) {
		case 1: RegisterNewCrime.registerNewCrimeDetails();break;
		case 2: GetAllCrimeDetails.getAllCrimeDetails();break;
		case 3: GetPoliceStationWiseCrimeDetails.getPoliceStationWiseCrimeDetails();break;
		case 4: GetAllCrimeDetailsAreaWise.getAllCrimeDetailsAreaWise();break;
		case 5: GetNoOfSolvedAndUnsolvedCrimes.getNoOfSolvedAndUnsolvedCrimes();break;
		case 6: GetAllCurrentMonthsCrime.getAllCurrentMonthCrimes();break;
		case 7: UpdateCrimeStatus.updateCrimeStatus();break;
		case 8: return;
		default:System.out.println("please select correct option");
		}
		
		}
		
	}
	
	
static void criminal() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println();	
		System.out.println("=============================================================");		
		System.out.println("\t--- Criminal menu ---");
		System.out.println("=============================================================");
		
		System.out.println("1. Register new criminal record");
		System.out.println("2.  Display All criminal records");
		System.out.println("3. Go to main menu");
		
		
		int ch = sc.nextInt();
		
		switch(ch) {
		case 1: RegisterNewCriminal.registerNewCriminalRecord();break;
		case 2: GetAllCriminalRecords.getAllCriminalRecords();break;
		case 3: return;
		default:System.out.println("please select correct option");
		}
		
		}
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=============================================================");		
		System.out.println("\tWelcome to Crime Information Management System");
		System.out.println("=============================================================");
		
		
		boolean stop = false;
		
		while(!stop) {
			System.out.println("=============================================================");
			System.out.println("Select Menu");
			System.out.println("=============================================================");
			System.out.println("1. Police Station Information");
			System.out.println("2. Police Information");
			System.out.println("3. Crime Information");
			System.out.println("4. Criminal Information");
			System.out.println("5. exit");
			System.out.println("-------------------------------------------------------------");
			
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1: policeStation();break;
			case 2: police();break;
			case 3: crime();break;
			case 4: criminal();break;
			case 5: stop = true;break;
			default: System.out.println("please select correct option");
			
			}
		}
		
		
		System.out.println("===========================================================================");
		System.out.println("--- Thank You For Using Crime Information management System Application ---");
		System.out.println("===========================================================================");
		
	}

}
