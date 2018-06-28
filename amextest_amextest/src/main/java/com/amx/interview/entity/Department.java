package com.amx.interview.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Department")
public class Department {
	
	@Id
	private int departmentId;
	private String name;
	
	
	public Department() {
		
	}
	public Department(int id, String name) {
		this.departmentId = id;
		this.name = name;
	}

	public int getId() {
		return departmentId;
	}

	public void setId(int id) {
		this.departmentId = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
		
}
