package com.dao.intr;

import java.util.List;

import com.exceptions.PoliceException;
import com.model.Police;

public interface PoliceDao {
	
	public String addPoliceInfo(Police police);
	public List<Police> getAllDetailsOfPolice() throws PoliceException;
}
