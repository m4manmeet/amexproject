package com.amx.interview.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amx.interview.entity.Department;
import com.amx.interview.repository.DepartmentRepository;

@Service
public class DeptService {
	
	@Autowired
	DepartmentRepository depRepo;
	
	public int addDept(Department d) {
		int id = d.getId();
		if(d.getName() == null || d.getName().length() == 0 || d.getId() < 1) {
			return -1;
		}
		depRepo.saveAndFlush(d);
		return id;
	}
	
	public Department getDept(int id) {
		Department d = new Department();
		try {
			d = depRepo.getOne(id);
			return d;
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return d;
	}
	
}
