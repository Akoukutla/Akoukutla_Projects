package com.revature.beans;

public class employees {

	private int empId;
	private String firstName;
	private String lastName;
	private String ePassword;
	private int manId;
	
	
	
	public employees(int empId, String firstName, String lastName,
			String ePassword, int manId) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.ePassword = ePassword;
		this.manId = manId;
	}



	public int getEmpId() {
		return empId;
	}



	public void setEmpId(int empId) {
		this.empId = empId;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getePassword() {
		return ePassword;
	}



	public void setePassword(String ePassword) {
		this.ePassword = ePassword;
	}



	public int getManId() {
		return manId;
	}



	public void setManId(int manId) {
		this.manId = manId;
	}
	
	
	
}


