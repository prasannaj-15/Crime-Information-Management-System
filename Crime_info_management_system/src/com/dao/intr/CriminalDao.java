package com.dao.intr;

import java.util.List;

import com.exceptions.CriminalException;
import com.model.Criminal;

public interface CriminalDao {

	public String addCriminalRecords(Criminal criminal);
	
	public List<Criminal> getAllCriminalsDetails() throws CriminalException;
	
}
