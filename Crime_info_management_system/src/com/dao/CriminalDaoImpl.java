package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.intr.CriminalDao;
import com.exceptions.CriminalException;
import com.model.Crime;
import com.model.Criminal;
import com.utility.DBUtil;

public class CriminalDaoImpl implements CriminalDao{

	@Override
	public String addCriminalRecords(Criminal criminal) {
		
		String message = "New criminal record not added...";
		
		
		try (Connection conn = DBUtil.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("insert into criminal values (?,?,?,?,?,?,?,?,?)");
			
			ps.setInt(1, criminal.getCriminal_ID());
			ps.setString(2, criminal.getC_name());
			ps.setInt(3, criminal.getC_age());
			ps.setString(4, criminal.getGender());
			ps.setString(5, criminal.getFace_mark());
			ps.setString(6,  criminal.getArea());
			ps.setInt(7, criminal.getPolice_st_ID());
			ps.setInt(8, criminal.getPolice_ID());
			ps.setInt(9, criminal.getCrime_Id());
			
			
			 int x = ps.executeUpdate();

			 if(x > 0)
				 message = "New criminal record added successfully....";
			
			
		} catch(SQLException e) {
			message = e.getMessage();
		}
		
		
		
		return message;
		
		
		
	}

	@Override
	public List<Criminal> getAllCriminalsDetails() throws CriminalException{

		List<Criminal> criminalDetails = new ArrayList<>();
		
		try (Connection conn = DBUtil.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("select * from criminal");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				int cid = rs.getInt("criminal_ID");
				String cname = rs.getString("criminal_name");
				int age = rs.getInt("criminal_age");
				String gender = rs.getString("criminal_gender");
				String face_mark = rs.getString("criminal_face_mark");
				String area = rs.getString("arrested_area");
				int ps_id = rs.getInt("police_station_ID");
				int p_id = rs.getInt("police_ID");
				int crime_id = rs.getInt("crimeID");
				
				Criminal criminal = new Criminal(cid,cname,age,gender,face_mark,area,ps_id,p_id,crime_id);
				
				criminalDetails.add(criminal);
				
				
				
			}
			
		} catch(SQLException e) {
			//e.printStackTrace();
			throw new CriminalException(e.getMessage());
		}
		
		if(criminalDetails.size() == 0) {
			throw new CriminalException("Criminal records are not found..");
		}
		
		return criminalDetails;
	}

	

	
	
	
}
