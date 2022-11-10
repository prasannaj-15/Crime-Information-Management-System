package com.model;

public class Crime {

	private int crimeID;
	private String c_type;
	private String c_desc;
	private String victims;
	private String suspects;
	private String c_date;
	private String police_st_ID;
	
	public Crime() {
		// TODO Auto-generated constructor stub
	}

	public Crime(int crimeID, String c_type, String c_desc, String victims, String suspects, String c_date,
			String police_st_ID) {
		super();
		this.crimeID = crimeID;
		this.c_type = c_type;
		this.c_desc = c_desc;
		this.victims = victims;
		this.suspects = suspects;
		this.c_date = c_date;
		this.police_st_ID = police_st_ID;
	}

	public int getCrimeID() {
		return crimeID;
	}

	public void setCrimeID(int crimeID) {
		this.crimeID = crimeID;
	}

	public String getC_type() {
		return c_type;
	}

	public void setC_type(String c_type) {
		this.c_type = c_type;
	}

	public String getC_desc() {
		return c_desc;
	}

	public void setC_desc(String c_desc) {
		this.c_desc = c_desc;
	}

	public String getVictims() {
		return victims;
	}

	public void setVictims(String victims) {
		this.victims = victims;
	}

	public String getSuspects() {
		return suspects;
	}

	public void setSuspects(String suspects) {
		this.suspects = suspects;
	}

	public String getC_date() {
		return c_date;
	}

	public void setC_date(String c_date) {
		this.c_date = c_date;
	}

	public String getPolice_st_ID() {
		return police_st_ID;
	}

	public void setPolice_st_ID(String police_st_ID) {
		this.police_st_ID = police_st_ID;
	}

	@Override
	public String toString() {
		return "crime [crimeID=" + crimeID + ", c_type=" + c_type + ", c_desc=" + c_desc + ", victims=" + victims
				+ ", suspects=" + suspects + ", c_date=" + c_date + ", police_st_ID=" + police_st_ID + "]";
	}
	
	
}
