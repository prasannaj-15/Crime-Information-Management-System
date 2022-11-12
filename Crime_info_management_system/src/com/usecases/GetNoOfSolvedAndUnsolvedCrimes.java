package com.usecases;

import java.util.List;

import com.dao.CrimeDaoImpl;
import com.dao.intr.CrimeDao;
import com.model.Crime;

public class GetNoOfSolvedAndUnsolvedCrimes {

	static void getNoOfSolvedAndUnsolvedCrimes() {
		
		CrimeDao dao = new CrimeDaoImpl();
		
//		List<Crime> crime = dao.getAllCrimeDetails();
		
		Crime crime = dao.getCountOfSolvedAndUnsolvedCrimes();
		
		
		System.out.println("=============================================================");
		System.out.println("\t--- No of Crimes Solved and Unsolved crimes ---");
		System.out.println("=============================================================");
		
		
		int solved = crime.getSolved();
		int unsolved = crime.getUnsolved();
		
		
		System.out.print("\tSolved Crimes : "+solved
				+"\n\tUnsolved Crimes : "+unsolved
				);
		System.out.println();
		System.out.println("-------------------------------------------------------------");
		
		/*for(Crime c : crime) {
			
			int solved = c.getSolved();
			int unsolved = c.getUnsolved();
			
			
			System.out.print("\tSolved Crimes : "+solved
					+"\n\tUnsolved Crimes : "+unsolved
					);
			System.out.println();
			System.out.println("-------------------------------------------------------------");
		}
		*/
	}
	
}
