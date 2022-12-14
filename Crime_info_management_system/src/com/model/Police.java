package com.model;

public class Police {

	private int police_ID;
	private String police_name;
	private String rank;
	private String phone;
	private int police_st_ID;
	private String email;
	private String password;
	
	public Police() {
		// TODO Auto-generated constructor stub
	}

	
	
	


	public Police(int police_ID, String police_name, String rank, String phone, int police_st_ID, String email) {
		super();
		this.police_ID = police_ID;
		this.police_name = police_name;
		this.rank = rank;
		this.phone = phone;
		this.police_st_ID = police_st_ID;
		this.email = email;
	}






	public Police(String police_name, String rank, String phone, int police_st_ID, String email, String password) {
		super();
		this.police_name = police_name;
		this.rank = rank;
		this.phone = phone;
		this.police_st_ID = police_st_ID;
		this.email = email;
		this.password = password;
	}



	public Police(int police_ID, String police_name, String rank, String phone, int police_st_ID) {
		super();
		this.police_ID = police_ID;
		this.police_name = police_name;
		this.rank = rank;
		this.phone = phone;
		this.police_st_ID = police_st_ID;
	}

	



	public int getPolice_ID() {
		return police_ID;
	}

	public void setPolice_ID(int police_ID) {
		this.police_ID = police_ID;
	}

	public String getPolice_name() {
		return police_name;
	}

	public void setPolice_name(String police_name) {
		this.police_name = police_name;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getPolice_st_ID() {
		return police_st_ID;
	}

	public void setPolice_st_ID(int police_st_ID) {
		this.police_st_ID = police_st_ID;
	}

	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}






	@Override
	public String toString() {
		return "police [police_ID=" + police_ID + ", police_name=" + police_name + ", rank=" + rank + ", phone=" + phone
				+ ", police_st_ID=" + police_st_ID + ", police_email=" + email + "]";
	}
	
	
	
}
