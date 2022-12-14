package com.usecases;

import java.util.List;
import java.util.Scanner;

import com.dao.CrimeDaoImpl;
import com.dao.intr.CrimeDao;
import com.exceptions.CrimeException;
import com.model.Crime;

public class GetPoliceStationWiseCrimeDetails {
	
	static void getPoliceStationWiseCrimeDetails() {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter police station name :");
		String police_station = sc.nextLine();
		
		CrimeDao dao = new CrimeDaoImpl();
		
		
		try {
			List<Crime> crime = dao.getPoliceStationWiseCrimeDetails(police_station);
			
			System.out.println("=============================================================");
			System.out.println("\t---All Crime Informations---");
			System.out.println("=============================================================");
			
			for(Crime c : crime) {
				
				int cid = c.getCrimeID();
				String type = c.getC_type();
				String desc = c.getC_desc();
				String victim = c.getVictims();
				String suspect = c.getSuspects();
				String date = c.getC_date();
				String status = c.getStatus();
				int ps_id = c.getPolice_st_ID();
				
				
				System.out.print("\tCrime id : "+cid
						+"\n\tCrime type : "+type
						+"\n\tCrime Description : "+ desc
						+"\n\tVictim : "+victim
						+"\n\tSuspect : "+ suspect
						+"\n\tDate : "+date
						+"\n\tstatus : "+status
						+"\n\tpolice station Id : "+ps_id
						);
				System.out.println();
				System.out.println("-------------------------------------------------------------");
			}
			
			
		} catch (CrimeException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		 	
			
		 
	}

}
