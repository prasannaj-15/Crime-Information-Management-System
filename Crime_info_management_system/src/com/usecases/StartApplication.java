package com.usecases;

import java.util.Scanner;

public class StartApplication {

	static void register() {
		System.out.println("Inside register...");
	}
	
	static void display() {
		System.out.println("Inside display...");
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		
		boolean stop = false;
		while(!stop) {
			System.out.println("Select choice");
			System.out.println("1.register police");
			System.out.println("2.display");
			System.out.println("3.exit");
			
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1: register();break;
			case 2: display();break;
			case 3: stop = true;
			default: System.out.println("please select right choice");
			
			}
		}
		
	}

}
