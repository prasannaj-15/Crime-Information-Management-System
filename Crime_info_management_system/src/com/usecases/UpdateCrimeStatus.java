package com.usecases;

import java.util.Scanner;

import com.dao.CrimeDaoImpl;
import com.dao.intr.CrimeDao;

public class UpdateCrimeStatus {
	
	static void updateCrimeStatus() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("--- Update crime status ---");
		
		System.out.println("Enter Crime Id :");
		int crime_id = sc.nextInt();
		
		System.out.println("Enter new crime status");
		String status = sc.next();
		
		CrimeDao dao = new CrimeDaoImpl();
		
		String result = dao.updateCrimeStatus(status, crime_id);
		
		System.out.println(result);
	}

}
