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
			System.out.println("4. Display police details");
			System.out.println("5. Register new crime");
			System.out.println("6. Display All crime details");
			System.out.println("7. Register new criminal record");
			System.out.println("8. Display All criminal records");
			System.out.println("9. Display particular police station's Crime Information");
			System.out.println("10. Display Area wise crime");
			System.out.println("11. Check Number of solved and unsolved crimes");
			System.out.println("12. Get current month crimes records");
			System.out.println("13. Update Crime status");
			System.out.println("14. exit");
			System.out.println("-------------------------------------------------------------");
			
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1: RegisterPoliceStation.registerPoliceStation();break;
			case 2: GetAllPoliceStationDetails.getAllPoliceStationDetails();break;
			case 3: RegisterPolice.registerPolice();break;
			case 4: GetPoliceDetails.getAllPoliceDetails();break;
			case 5: RegisterNewCrime.registerNewCrimeDetails();break;
			case 6: GetAllCrimeDetails.getAllCrimeDetails();break;
			case 7: RegisterNewCriminal.registerNewCriminalRecord();break;
			case 8: GetAllCriminalRecords.getAllCriminalRecords();break;
			case 9: GetPoliceStationWiseCrimeDetails.getPoliceStationWiseCrimeDetails();break;
			case 10: GetAllCrimeDetailsAreaWise.getAllCrimeDetailsAreaWise();break;
			case 11: GetNoOfSolvedAndUnsolvedCrimes.getNoOfSolvedAndUnsolvedCrimes();break;
			case 12: GetAllCurrentMonthsCrime.getAllCurrentMonthCrimes();break;
			case 13: UpdateCrimeStatus.updateCrimeStatus();break;
			case 14: stop = true;break;
			default: System.out.println("please select right choice");
			
			}
		}
		
		
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("--- Thank You For Using Crime Information management System Application ---");
		System.out.println("---------------------------------------------------------------------------");
		
	}

}
