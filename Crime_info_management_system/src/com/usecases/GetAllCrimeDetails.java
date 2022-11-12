package com.usecases;

import java.util.List;

import com.dao.CrimeDaoImpl;
import com.dao.PoliceStationDaoImpl;
import com.dao.intr.CrimeDao;
import com.dao.intr.PoliceStationDao;
import com.model.Crime;
import com.model.PoliceStation;

public class GetAllCrimeDetails {

	static void getAllCrimeDetails() {

		CrimeDao dao = new CrimeDaoImpl();
		
		List<Crime> crime = dao.getAllCrimeDetails();
		
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
	}
	
}
