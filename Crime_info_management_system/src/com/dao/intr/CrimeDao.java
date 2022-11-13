package com.dao.intr;

import java.util.List;

import com.exceptions.CrimeException;
import com.model.Crime;

public interface CrimeDao {

	public String addCrimeRecords(Crime crime);
	
	public List<Crime> getAllCrimeDetails() throws CrimeException;
	
	public List<Crime> getPoliceStationWiseCrimeDetails(String police_station) throws CrimeException;
	
	public List<Crime> getAreaWiseCrimeDetails(String area) throws CrimeException;
	
	public Crime getCountOfSolvedAndUnsolvedCrimes();
	
	public List<Crime> getCurrentMonthsCrimeRecords() throws CrimeException;
	
	public String updateCrimeStatus(String status,int crime_id);
	
}
