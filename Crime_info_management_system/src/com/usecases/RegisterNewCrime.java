package com.usecases;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.dao.CrimeDaoImpl;
import com.dao.intr.CrimeDao;
import com.model.Crime;

public class RegisterNewCrime {

	static void registerNewCrimeDetails() {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");  
		
		System.out.println("---Enter new Crime Information--");
		
		System.out.println("Enter crime id :");
		int c_id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter crime type :");
		String name = sc.nextLine();
		
		System.out.println("Enter crime description :");
		String desc = sc.nextLine();
		
		System.out.println("Enter victim name :");
		String victim = sc.nextLine();
		
		System.out.println("Enter main suspect name :");
		String suspect = sc.nextLine();
		
		System.out.println("Enter crime Date and Time :");
		String dt = sc.nextLine();
		Date date = new Date();
		try {
			date = (Date)formatter.parse(dt);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		System.out.println("please select crime status :");
		System.out.println("1. Solved");
		System.out.println("2. Unsolved");
		int x = sc.nextInt();
		
		
		String status = null;
		if(x==1) {
			status = "Solved";
		}else if(x==2) {
			status = "Unsolved";
		}
		/*
		try {
			if(x==1) {
				status = "Solved";
			}else if(x==2) {
				status = "Unsolved";
			}else {
				throw new statusFailedException("select correct status"); 
			}
		} catch(Exception e) {
			e.getMessage();
		}
		
		*/
		
		System.out.println("Enter police station ID :");
		int ps_id = sc.nextInt();
		
		CrimeDao dao = new CrimeDaoImpl();
		
		Crime crime = new Crime(c_id,name,desc,victim,suspect,date,status,ps_id);
		
		String result = dao.addCrimeRecords(crime);
		
		System.out.println(result);
		
	}
}
