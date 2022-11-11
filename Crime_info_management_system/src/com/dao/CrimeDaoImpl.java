package com.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.dao.intr.CrimeDao;
import com.model.Crime;
import com.utility.DBUtil;

public class CrimeDaoImpl implements CrimeDao{

	@Override
	public String addCrimeRecords(Crime crime) {
		
		String message = "New crime record not added successfully";
		
		
		try (Connection conn = DBUtil.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("insert into crime values (?,?,?,?,?,?,?,?)");
			
			ps.setInt(1, crime.getCrimeID());
			ps.setString(2, crime.getC_type());
			ps.setString(3, crime.getC_desc());
			ps.setString(4, crime.getVictims());
			ps.setString(5, crime.getSuspects());
			ps.setDate(6, (Date) crime.getC_date());
			ps.setString(7, crime.getStatus());
			ps.setInt(8, crime.getPolice_st_ID());
			
			
			 int x = ps.executeUpdate();

			 if(x > 0)
				 message = "New crime record added successfully....";
			
			
		} catch(SQLException e) {
			message = e.getMessage();
		}
		
		
		
		return message;
		
	}

}
