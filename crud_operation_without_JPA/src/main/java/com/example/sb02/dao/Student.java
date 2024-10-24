package com.example.sb02.dao;

public class Student {
	private String fName;
	private String lName;
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public Student(String fName, String lName) {
		super();
		this.fName = fName;
		this.lName = lName;
	}
	

}
