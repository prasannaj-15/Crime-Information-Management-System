package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.dao.intr.PoliceDao;
import com.model.Police;
import com.utility.DBUtil;

public class PoliceDaoImpl implements PoliceDao {

	@Override
	public String addPoliceInfo(Police police) {
		
		String message = "Police information record not inserted..";
		
			try (Connection conn = DBUtil.provideConnection()) {
				
			 PreparedStatement	ps = conn.prepareStatement("insert into police values (?,?,?,?,?)");
				
			 ps.setInt(1, police.getPolice_ID());
			 ps.setString(2, police.getPolice_name());
			 ps.setString(3, police.getRank());
			 ps.setString(4, police.getPhone());
			 ps.setInt(5, police.getPolice_st_ID());
			 
			 
			 int x = ps.executeUpdate();
			 
			 if(x > 0) {
				 message = "police information added successfully..";
			 }
				
			}catch(SQLException e) {
				message = e.getMessage();
			}
				
				
				
		
		return message;
	}

}
