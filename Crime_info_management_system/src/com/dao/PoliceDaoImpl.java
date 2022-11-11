package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.intr.PoliceDao;
import com.model.Police;
import com.utility.DBUtil;

public class PoliceDaoImpl implements PoliceDao {

	
	// Register user method
	@Override
	public String addPoliceInfo(Police police) {
		
		String message = "Police information record not inserted..";
		
			try (Connection conn = DBUtil.provideConnection()) {
				
			 PreparedStatement	ps = conn.prepareStatement("insert into police (police_name,police_rank,police_phone,police_station_ID) values (?,?,?,?)");
				
//			 ps.setInt(1, police.getPolice_ID());
			 ps.setString(1, police.getPolice_name());
			 ps.setString(2, police.getRank());
			 ps.setString(3, police.getPhone());
			 ps.setInt(4, police.getPolice_st_ID());
			 
			 
			 int x = ps.executeUpdate();
			 
			 if(x > 0) {
				 message = "police information added successfully..";
			 }
				
			}catch(SQLException e) {
				message = e.getMessage();
			}
				
				
				
		
		return message;
	}

	
	// get Police details
	
	@Override
	public List<Police> getAllDetailsOfPolice() {
		
		List<Police> policeDetails = new ArrayList<>();
		
		try (Connection conn = DBUtil.provideConnection()){
			
			
			PreparedStatement ps = conn.prepareStatement("select * from police");
			
			 ResultSet rs= ps.executeQuery();
			
			 while(rs.next()) {
				 int pid = rs.getInt("police_ID");
				 String pname = rs.getString("police_name");
				 String rank = rs.getString("police_rank");
				 String phone = rs.getString("police_phone");
				 int police_st_id = rs.getInt("police_station_ID");
				 
				 Police police = new Police(pid,pname,rank,phone,police_st_id);
				 
				 policeDetails.add(police);
				 
			 }
			 
			 
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		
		return policeDetails;
		
	}

}
