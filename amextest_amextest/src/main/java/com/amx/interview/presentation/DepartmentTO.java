package com.amx.interview.presentation;


public class DepartmentTO {
	
	private int id;
	private String name;
	
	
	public DepartmentTO() {
		
	}
	public DepartmentTO(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
