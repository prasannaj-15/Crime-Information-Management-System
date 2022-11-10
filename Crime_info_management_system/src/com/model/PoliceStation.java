package com.model;

public class PoliceStation {

	private int police_st_ID;
	private String name;
	private String police_st_area;
	private int phone;
	private String sho;
	private int admin_ID;
	
	public PoliceStation() {
		// TODO Auto-generated constructor stub
	}

	public PoliceStation(int police_st_ID, String name, String police_st_area, int phone, String sho, int admin_ID) {
		super();
		this.police_st_ID = police_st_ID;
		this.name = name;
		this.police_st_area = police_st_area;
		this.phone = phone;
		this.sho = sho;
		this.admin_ID = admin_ID;
	}

	public int getPolice_st_ID() {
		return police_st_ID;
	}

	public void setPolice_st_ID(int police_st_ID) {
		this.police_st_ID = police_st_ID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPolice_st_area() {
		return police_st_area;
	}

	public void setPolice_st_area(String police_st_area) {
		this.police_st_area = police_st_area;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getSho() {
		return sho;
	}

	public void setSho(String sho) {
		this.sho = sho;
	}

	public int getAdmin_ID() {
		return admin_ID;
	}

	public void setAdmin_ID(int admin_ID) {
		this.admin_ID = admin_ID;
	}

	@Override
	public String toString() {
		return "PoliceStation [police_st_ID=" + police_st_ID + ", name=" + name + ", police_st_area=" + police_st_area
				+ ", phone=" + phone + ", sho=" + sho + ", admin_ID=" + admin_ID + "]";
	}
	
	
	
}
