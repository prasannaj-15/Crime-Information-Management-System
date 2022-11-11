package com.usecases;

import java.util.Scanner;

import com.dao.PoliceStationDaoImpl;
import com.dao.intr.PoliceStationDao;
import com.model.PoliceStation;

public class RegisterPoliceStation {

	static void registerPoliceStation() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---Enter New Police Station Information--");
		
		System.out.println("Enter Police Station's ID :");
		int ps_id = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter Police Station's Name :");
		String name = sc.nextLine();
		
		System.out.println("Enter Police Station's Area :");
		String rank = sc.nextLine();
		
		System.out.println("Enter Police Station's phone number :");
		int phone = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter S.H.O Of this Police Station's :");
		String sho = sc.nextLine();
		
		System.out.println("Enter admin ID :");
		int admin_id = sc.nextInt();
		
		
		
		PoliceStationDao dao = new PoliceStationDaoImpl();
		
		PoliceStation policeStation = new PoliceStation(ps_id,name,rank,phone,sho,admin_id);
		
		String result = dao.RegisterPoliceStation(policeStation);
		
		System.out.println(result);
		
		
		
	}
	
	
}
