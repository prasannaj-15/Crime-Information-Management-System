package com.usecases;

import java.util.Scanner;

import com.dao.AdminImpl;
import com.dao.intr.AdminDao;
import com.model.Admin;

public class GetAdminDetails {

	static void getAdminDetails() {
		
		AdminDao dao = new AdminImpl();
		
		Admin admin = dao.getAdminDetails();
		
		String name = admin.getAdmin_username();
		String pass = admin.getAdmin_password();
		
		System.out.println("=============================================================");
		System.out.println("\t--- please Confirm you are admin ---");
		System.out.println("=============================================================");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\t--- Enter admin username ---");
		String n1 = sc.next();
		
		System.out.println("\t--- Enter admin password ---");
		String p1 = sc.next();
		
		if(name.equals(n1) && pass.equals(p1)) {
			RegisterPoliceStation.registerPoliceStation();
		}
		else {
			System.out.println("--- Wrong credentials --");
			System.out.println("--- press 1 to try again --");
			System.out.println("--- press 2 to go back --");
			int n = sc.nextInt();
			
			
			
			if(n==1) {
				getAdminDetails();
				
			}else {
				StartApplication.policeStation();
			}
			
		}
		
	}
	
}
