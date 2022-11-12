package com.usecases;

import java.text.SimpleDateFormat;
import java.util.Scanner;

import com.dao.CrimeDaoImpl;
import com.dao.CriminalDaoImpl;
import com.dao.intr.CrimeDao;
import com.dao.intr.CriminalDao;
import com.model.Crime;
import com.model.Criminal;

public class RegisterNewCriminal {

static void registerNewCriminalRecord() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---Enter new Crime Information--");
		
		System.out.println("Enter criminal id :");
		int c_id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter criminal name :");
		String name = sc.nextLine();
		
		System.out.println("Enter crime age :");
		int age = sc.nextInt();
		
		System.out.println("Enter gender :");
		String gender = sc.next();
		sc.nextLine();
		
		System.out.println("Enter face mark :");
		String face_mark = sc.nextLine();
		
		System.out.println("Enter first arrested area :");
		String arr_area = sc.nextLine();
		
		System.out.println("Enter police station ID :");
		int ps_id = sc.nextInt();
		
		System.out.println("Enter police ID who arrested to criminal :");
		int p_id = sc.nextInt();
		
		System.out.println("Enter Crime ID :");
		int crime_id = sc.nextInt();
		
		CriminalDao dao = new CriminalDaoImpl();
		
		Criminal criminal = new Criminal(c_id,name,age,gender,face_mark,arr_area,ps_id,p_id,crime_id);
		
		String result = dao.addCriminalRecords(criminal);
		
		System.out.println(result);
		
	}
	
}
