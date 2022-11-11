package com.dao.intr;

import java.util.List;

import com.model.PoliceStation;

public interface PoliceStationDao {
	
	public String RegisterPoliceStation(PoliceStation policeStation);
	public List<PoliceStation> GetAllDetailsOfPoliceStation();
	
}
