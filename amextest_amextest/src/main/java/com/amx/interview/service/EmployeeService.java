package com.amx.interview.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amx.interview.entity.Employee;
import com.amx.interview.presentation.EmployeeTO;
import com.amx.interview.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository empRepo;
	
	public EmployeeTO addEmp(EmployeeTO emp) {
		Employee e = new Employee();
		e.setAddress(emp.getAddress());
		e.setDeptId(emp.getDeptId());
		e.setEmpId(emp.getEmpId());
		e.setFirstName(emp.getFirstName());
		e.setLastName(emp.getLastName());
		empRepo.saveAndFlush(e);
		return emp;
	}
	
	public Employee getEmp(int id) {
		return empRepo.getOne(id);
	}
	
	public int delEmp(int id) {
		empRepo.deleteById(id);
		return id;
	}
}
