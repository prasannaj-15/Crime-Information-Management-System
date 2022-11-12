package com.dao.intr;

import java.util.List;

import com.model.Crime;

public interface CrimeDao {

	public String addCrimeRecords(Crime crime);
	
	public List<Crime> getAllCrimeDetails();
	
	public List<Crime> getPoliceStationWiseCrimeDetails(String police_station);
	
	public List<Crime> getAreaWiseCrimeDetails(String area);
	
	public Crime getCountOfSolvedAndUnsolvedCrimes();
	
	public List<Crime> getCurrentMonthsCrimeRecords();
	
	public String updateCrimeStatus(String status,int crime_id);
	
}
