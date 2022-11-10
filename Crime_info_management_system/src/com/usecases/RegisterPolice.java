package com.usecases;

import java.util.Scanner;

import com.dao.PoliceDaoImpl;
import com.dao.intr.PoliceDao;
import com.model.Police;

public class RegisterPolice {
	
	static void register() {
		
		PoliceDao dao = new PoliceDaoImpl();
		
		Police police = new Police(3,"Nitin patil","Constable","956158741",1);
		
		String result = dao.addPoliceInfo(police);
		 
		System.out.println(result);
		
	}

	static void display() {
		System.out.println("Inside display method...");
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Select option");
		System.out.println("1.register police info");
		System.out.println("2.display police info");
		
		int choice = sc.nextInt();
		
		switch(choice) {
		
		case 1: register();break;
		case 2: display();break;
		default: System.out.println("please select correce option");
		}
		
		
		
	}

}
