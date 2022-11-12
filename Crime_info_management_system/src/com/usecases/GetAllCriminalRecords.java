package com.usecases;

import java.util.List;

import com.dao.CriminalDaoImpl;
import com.dao.intr.CriminalDao;
import com.model.Criminal;

public class GetAllCriminalRecords {

	
	static void getAllCriminalRecords() {
	
	CriminalDao dao = new CriminalDaoImpl();
	
		List<Criminal> criminal = dao.getAllCriminalsDetails();
		
	
	System.out.println("=============================================================");
	System.out.println("\t---All Criminal Informations---");
	System.out.println("=============================================================");
	
	for(Criminal c : criminal) {
		
		int cid = c.getCriminal_ID();
		String name = c.getC_name();
		int age = c.getC_age();
		String gender = c.getGender();
		String face_mark = c.getFace_mark();
		String area = c.getArea();
		int ps_id = c.getPolice_st_ID();
		int p_id = c.getPolice_ID();
		int crime_id = c.getCrime_Id();
		
		
		System.out.print("\tCriminal id : "+cid
				+"\n\tCriminal name : "+name
				+"\n\tCrime age : "+age
				+"\n\tGender : "+gender
				+"\n\tFace Mark : "+ face_mark
				+"\n\tArea : "+area
				+"\n\tpolice station Id : "+ps_id
				+"\n\tpolice Inspector Id" +p_id
				+"\n\tCrime ID"+crime_id
				);
		System.out.println();
		System.out.println("-------------------------------------------------------------");
	
	
	}
	}
}
