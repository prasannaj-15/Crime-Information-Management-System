package com.usecases;

import java.util.Scanner;

import com.dao.PoliceDaoImpl;
import com.dao.intr.PoliceDao;
import com.model.Police;

public class RegisterPolice {
	
	static void registerPolice() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---Enter new Police information--");
		
		System.out.println("Enter Name :");
		String name = sc.nextLine();
		
		System.out.println("Enter Rank :");
		String rank = sc.next();
		
		System.out.println("Enter phone number :");
		String phone = sc.next();
		
		System.out.println("Enter police station ID :");
		int ps_id = sc.nextInt();
		
		System.out.println("Enter email Id :");
		String email = sc.next();
		
		System.out.println("Enter password :");
		String password = sc.next();
		
		
		PoliceDao dao = new PoliceDaoImpl();
		
		Police police = new Police(name,rank,phone,ps_id,email,password);
		
		String result = dao.addPoliceInfo(police);
		 
		System.out.println(result+"\n");

		
	}

}
