package com.model;

public class Criminal {

	private int criminal_ID;
	private String c_name;
	private int c_age;
	private String gender;
	private String face_mark;
	private String area;
	private int police_st_ID;
	private int police_ID;
	private int crime_Id;
	
	
	public Criminal() {
		// TODO Auto-generated constructor stub
	}


	
	public Criminal(int criminal_ID, String c_name, int c_age, String gender, String face_mark, String area,
			int police_st_ID, int police_ID, int crime_Id) {
		super();
		this.criminal_ID = criminal_ID;
		this.c_name = c_name;
		this.c_age = c_age;
		this.gender = gender;
		this.face_mark = face_mark;
		this.area = area;
		this.police_st_ID = police_st_ID;
		this.police_ID = police_ID;
		this.crime_Id = crime_Id;
	}



	public int getCriminal_ID() {
		return criminal_ID;
	}


	public void setCriminal_ID(int criminal_ID) {
		this.criminal_ID = criminal_ID;
	}


	public String getC_name() {
		return c_name;
	}


	public void setC_name(String c_name) {
		this.c_name = c_name;
	}


	public int getC_age() {
		return c_age;
	}


	public void setC_age(int c_age) {
		this.c_age = c_age;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getFace_mark() {
		return face_mark;
	}


	public void setFace_mark(String face_mark) {
		this.face_mark = face_mark;
	}


	public String getArea() {
		return area;
	}


	public void setArea(String area) {
		this.area = area;
	}


	public int getPolice_st_ID() {
		return police_st_ID;
	}


	public void setPolice_st_ID(int police_st_ID) {
		this.police_st_ID = police_st_ID;
	}

	

	public int getPolice_ID() {
		return police_ID;
	}



	public void setPolice_ID(int police_ID) {
		this.police_ID = police_ID;
	}



	public int getCrime_Id() {
		return crime_Id;
	}



	public void setCrime_Id(int crime_Id) {
		this.crime_Id = crime_Id;
	}



	@Override
	public String toString() {
		return "Criminal [criminal_ID=" + criminal_ID + ", c_name=" + c_name + ", c_age=" + c_age + ", gender=" + gender
				+ ", face_mark=" + face_mark + ", area=" + area + ", police_st_ID=" + police_st_ID + ", police_ID="
				+ police_ID + ", crime_Id=" + crime_Id + "]";
	}



	
	
	
}
