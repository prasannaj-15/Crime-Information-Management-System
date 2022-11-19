package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.intr.AdminDao;
import com.model.Admin;
import com.utility.DBUtil;

public class AdminImpl implements AdminDao{

	@Override
	public Admin getAdminDetails() {
		
		 Admin admin = new Admin();
		
		try (Connection conn = DBUtil.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("select * from admin where admin_id = 1");
			
			
			 ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				 String name = rs.getString("admin_username");
				 String pass = rs.getString("admin_password");
				 
				 admin = new Admin(name,pass);
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
	
		return admin;
	}

}
