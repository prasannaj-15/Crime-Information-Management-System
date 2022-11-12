package com.usecases;

import java.util.List;
import java.util.Scanner;

import com.dao.CrimeDaoImpl;
import com.dao.intr.CrimeDao;
import com.model.Crime;

public class GetAllCrimeDetailsAreaWise {

	static void getAllCrimeDetailsAreaWise() {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter police station name :");
			String area = sc.nextLine();
			
			CrimeDao dao = new CrimeDaoImpl();
			
			List<Crime> crime = dao.getAreaWiseCrimeDetails(area);
			
			 	
				System.out.println("=============================================================");
				System.out.println("\t---All Crime Informations area wise---");
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
	}
	
}
