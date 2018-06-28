package com.amx.interview.presentation;

public class EmployeeTO {
	
	private int empId;
	private String firstName;
	private String lastName;
	private String address;
	private int deptId;
	
	
	public EmployeeTO() {
		
	}
	public EmployeeTO(String fName, String lName, String add, int empId, int deptId) {
		this.firstName = fName;
		this.lastName = lName;
		this.address = add;
		this.deptId = deptId;
		this.empId = empId;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	@Override
	public String toString() {
		
		return "Name: " + this.getFirstName() + " " + this.getLastName() + "  EmpId: " + 
				this.getEmpId() + "  DeptId: " + this.getDeptId() + "  Address: " + this.getAddress();
	}
	
	
	
}
