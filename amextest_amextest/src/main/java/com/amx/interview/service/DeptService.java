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
		depRepo.saveAndFlush(d);
		return id;
	}
	
}
