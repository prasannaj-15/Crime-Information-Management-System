package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.intr.PoliceStationDao;
import com.model.PoliceStation;
import com.utility.DBUtil;

public class PoliceStationDaoImpl implements PoliceStationDao{

	@Override
	public String RegisterPoliceStation(PoliceStation policeStation) {
		
		String message = "Police Station details not registered..";
		
		
		try (Connection conn = DBUtil.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("insert into police_station values(?,?,?,?,?,?)");
			
			ps.setInt(1, policeStation.getPolice_st_ID());
			ps.setString(2, policeStation.getName());
			ps.setString(3, policeStation.getPolice_st_area());
			ps.setInt(4, policeStation.getPhone());
			ps.setString(5, policeStation.getSho());
			ps.setInt(6, policeStation.getAdmin_ID());
			
			int x = ps.executeUpdate();
			
			if(x > 0) {
				message = "Police Station details registered successfully...";
			}
			
			
		}catch(SQLException e) {
			message = e.getMessage();
		}
		
		
		return message;
	}

	@Override
	public List<PoliceStation> GetAllDetailsOfPoliceStation() {
		
		List<PoliceStation> policeStation = new ArrayList<>();
		
		try (Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("select police_station_ID,police_station_name,police_station_area,police_station_phone,SHO_of_station from police_station");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				int ps_id = rs.getInt("police_station_ID");
				String ps_name = rs.getString("police_station_name");
				String area = rs.getString("police_station_area");
				int phone = rs.getInt("police_station_phone");
				String sho = rs.getString("SHO_of_station");
				
				PoliceStation pst = new PoliceStation(ps_id,ps_name,area,phone,sho);
				
				policeStation.add(pst);
				
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		return policeStation;
	}

	
	
}
