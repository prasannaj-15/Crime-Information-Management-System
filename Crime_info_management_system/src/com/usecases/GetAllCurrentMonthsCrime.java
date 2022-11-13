package com.usecases;

import java.util.List;

import com.dao.CrimeDaoImpl;
import com.dao.intr.CrimeDao;
import com.exceptions.CrimeException;
import com.model.Crime;

public class GetAllCurrentMonthsCrime {

	static void getAllCurrentMonthCrimes () {
CrimeDao dao = new CrimeDaoImpl();
		
		
		try {
			List<Crime> crime = dao.getCurrentMonthsCrimeRecords();
			
			System.out.println("=============================================================");
			System.out.println("\t---All Current Months Crime Informations---");
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
