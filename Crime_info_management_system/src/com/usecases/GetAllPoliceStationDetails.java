package com.usecases;

import java.util.List;

import com.dao.PoliceStationDaoImpl;
import com.dao.intr.PoliceStationDao;
import com.model.PoliceStation;

public class GetAllPoliceStationDetails {

	
	static void getAllPoliceStationDetails() {
		
		PoliceStationDao dao = new PoliceStationDaoImpl();
		
		List<PoliceStation> ps = dao.GetAllDetailsOfPoliceStation();
		
		System.out.println("=============================================================");
		System.out.println("\t---All Police Station's Informations---");
		System.out.println("=============================================================");
		
		for(PoliceStation ps1 : ps) {
			int ps_id = ps1.getPolice_st_ID();
			String name = ps1.getName();
			String area = ps1.getPolice_st_area();
			int phone = ps1.getPhone();
			String sho = ps1.getSho();
			
			System.out.print("\tPolice Station id : "+ps_id+"\n\tPolice Station Name : "
					+name+"\n\tPolice Station Area : "+ area
					+"\n\tPolice Station Phone No : "+phone
					+"\n\tPolice Station S.H.O : "+ sho);
			System.out.println();
			System.out.println("-------------------------------------------------------------");
		}
	}
	
}
