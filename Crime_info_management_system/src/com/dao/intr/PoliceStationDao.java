package com.dao.intr;

import java.util.List;

import com.exceptions.CrimeException;
import com.exceptions.PoliceStationException;
import com.model.PoliceStation;

public interface PoliceStationDao {
	
	public String RegisterPoliceStation(PoliceStation policeStation);
	public List<PoliceStation> GetAllDetailsOfPoliceStation() throws PoliceStationException;
	
}
