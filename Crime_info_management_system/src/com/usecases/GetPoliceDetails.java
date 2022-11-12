package com.usecases;

import java.util.List;

import com.dao.PoliceDaoImpl;
import com.dao.intr.PoliceDao;
import com.model.Police;

public class GetPoliceDetails {

	static void getAllPoliceDetails(){
		
//	}
	
	
//	public static void main(String[] args) {
		
		PoliceDao dao = new PoliceDaoImpl();
		
		List<Police> policeDetails = dao.getAllDetailsOfPolice();

		System.out.println("=============================================================");
		System.out.println("\t---All Police Informations---");
		System.out.println("=============================================================");
		
		for(Police p1 : policeDetails) {
			
			int pid = p1.getPolice_ID();
			String name = p1.getPolice_name();
			String rank = p1.getRank();
			String phone = p1.getPhone();
			int ps_id = p1.getPolice_st_ID();
			String email = p1.getEmail();
			
			System.out.print("\tPolice id : "+pid+"\n\tPolice Name : "
								+name+"\n\tPolice rank : "+ rank
								+"\n\tPolice Phone : "+phone
								+"\n\tPolice Station ID : "+ ps_id
								+"\n\tPolice Email :"+email);
			System.out.println();
			System.out.println("-------------------------------------------------------------");
		}
		
	}

}
