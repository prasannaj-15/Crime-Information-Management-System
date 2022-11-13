package com.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.intr.CrimeDao;
import com.exceptions.CrimeException;
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
			ps.setString(6,  crime.getC_date());
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

	@Override
	public List<Crime> getAllCrimeDetails()throws CrimeException {
		
		List<Crime> crimeDetails = new ArrayList<>();
		
		try (Connection conn = DBUtil.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("select * from crime");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				int cid = rs.getInt("crimeId");
				String cname = rs.getString("crime_type");
				String desc = rs.getString("crime_desc");
				String victims = rs.getString("victims");
				String suspect = rs.getString("main_suspect");
				String date = rs.getString("crime_date_and_time");
				String status = rs.getString("crime_status");
				int ps_id = rs.getInt("police_station_ID");
				
				Crime crime = new Crime(cid,cname,desc,victims,suspect,date,status,ps_id);
				
				crimeDetails.add(crime);
				
				
				
				
			}
			
		} catch(SQLException e) {
			//e.printStackTrace();
			throw new CrimeException(e.getMessage());
		}
		
		
		if(crimeDetails.size() == 0)
			throw new CrimeException("Crime Records Not found..");
		
		return crimeDetails;
	}

	@Override
	public List<Crime> getPoliceStationWiseCrimeDetails(String police_station) throws CrimeException {
		
		List<Crime> policeStationWisecrimeDetails = new ArrayList<>();
		
		try (Connection conn = DBUtil.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("select * from crime where police_station_ID = "
					+ "(select police_station_ID from police_station where police_station_name = ?)");
			
			ps.setString(1, police_station);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				int cid = rs.getInt("crimeId");
				String cname = rs.getString("crime_type");
				String desc = rs.getString("crime_desc");
				String victims = rs.getString("victims");
				String suspect = rs.getString("main_suspect");
				String date = rs.getString("crime_date_and_time");
				String status = rs.getString("crime_status");
				int ps_id = rs.getInt("police_station_ID");
				
				Crime crime = new Crime(cid,cname,desc,victims,suspect,date,status,ps_id);
				
				policeStationWisecrimeDetails.add(crime);
				
				
				
				
			}
			
		} catch(SQLException e) {
			//e.printStackTrace();
			throw new CrimeException(e.getMessage());
		}
		
		if(policeStationWisecrimeDetails.size() == 0)
			throw new CrimeException("Not found any crime records within this police station");
		
		return policeStationWisecrimeDetails;
		
	}

	@Override
	public List<Crime> getAreaWiseCrimeDetails(String area)throws CrimeException {
		
		
		List<Crime> areaWisecrimeDetails = new ArrayList<>();
		
		try (Connection conn = DBUtil.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("select * from crime where police_station_ID = "
					+ "(select police_station_ID from police_station where police_station_area = ?)");
			
			ps.setString(1, area);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				int cid = rs.getInt("crimeId");
				String cname = rs.getString("crime_type");
				String desc = rs.getString("crime_desc");
				String victims = rs.getString("victims");
				String suspect = rs.getString("main_suspect");
				String date = rs.getString("crime_date_and_time");
				String status = rs.getString("crime_status");
				int ps_id = rs.getInt("police_station_ID");
				
				Crime crime = new Crime(cid,cname,desc,victims,suspect,date,status,ps_id);
				
				areaWisecrimeDetails.add(crime);
				
				
				
				
			}
			
		} catch(SQLException e) {
			//e.printStackTrace();
			throw new CrimeException(e.getMessage());
		}
		
		if(areaWisecrimeDetails.size() == 0) {
			throw new CrimeException("No Crime records are found in this area..");
		}
		
		return areaWisecrimeDetails;
		
		
	}

	@Override
	public Crime getCountOfSolvedAndUnsolvedCrimes() {
		
		Crime crime = null;
		
		try (Connection conn = DBUtil.provideConnection()){
			
			PreparedStatement ps1 = conn.prepareStatement("select count(crimeId) Solved_crimes from crime where crime_status = 'solved'");
			
			PreparedStatement ps2 = conn.prepareStatement("select count(crimeId) Unsolved_crimes from crime where crime_status = 'Unsolved'");
			
			
			ResultSet rs1 = ps1.executeQuery();
			ResultSet rs2 = ps2.executeQuery();
			int solved = 0;
			int unsolved = 0;
			
			while(rs1.next()) {
				
				solved = rs1.getInt("Solved_Crimes");
			}
			
			while(rs2.next()) {
				
				unsolved = rs2.getInt("Unsolved_Crimes");
			}
			
			crime = new Crime(solved,unsolved);
			
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return crime;
		
	}

	@Override
	public List<Crime> getCurrentMonthsCrimeRecords()throws CrimeException {
		
		List<Crime> currentMonthCrimeRecord = new ArrayList<>();
		
		try (Connection conn = DBUtil.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("select * from crime where Month(crime_date_and_time)"
					+ " = Month(current_date())");
			
			
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				int cid = rs.getInt("crimeId");
				String cname = rs.getString("crime_type");
				String desc = rs.getString("crime_desc");
				String victims = rs.getString("victims");
				String suspect = rs.getString("main_suspect");
				String date = rs.getString("crime_date_and_time");
				String status = rs.getString("crime_status");
				int ps_id = rs.getInt("police_station_ID");
				
				Crime crime = new Crime(cid,cname,desc,victims,suspect,date,status,ps_id);
				
				currentMonthCrimeRecord.add(crime);
				
				
				
				
			}
			
		} catch(SQLException e) {
			//e.printStackTrace();
			throw new CrimeException(e.getMessage());
		}
		
		if(currentMonthCrimeRecord.size() == 0) {
			throw new CrimeException("This month zero crimes registered...");
		}
		
		return currentMonthCrimeRecord;
		
		
	}

	@Override
	public String updateCrimeStatus(String status, int crime_id) {
		
		String message = "Crime status not updated...";
		
		try (Connection conn = DBUtil.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("update crime set crime_status = ? where crimeId = ?");
			
			ps.setString(1, status);
			ps.setInt(2, crime_id);
			
			int x = ps.executeUpdate();
			
			if(x>0)
				message = "Crime status updated successfully...";
			
		}catch(SQLException e) {
			message = e.getMessage();
		}
		
		
		return message;
	}

}
