package com.amx.interview.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.amx.interview.entity.Department;
import com.amx.interview.entity.Employee;
import com.amx.interview.service.DeptService;
import com.amx.interview.service.EmployeeService;

@RestController
public class EmpRestController {

	@Autowired
	DeptService depService;
	
	@Autowired
	EmployeeService empService;
	
	@GetMapping("/employees/{id}")
	public ResponseEntity<EmployeeTO> getEmployee(@PathVariable("id") int id) {

		Employee employee = empService.getEmp(id);
		EmployeeTO EmployeeTO = new EmployeeTO(employee.getFirstName(), employee.getLastName(), employee.getAddress(), employee.getDeptId());
		EmployeeTO.setEmpId(employee.getEmpId());
		return new ResponseEntity<EmployeeTO>(EmployeeTO, HttpStatus.OK);
		
	}

	@GetMapping("/departments/{id}")
	public ResponseEntity<DepartmentTO> getDepartment(@PathVariable("id") int id) {
		
		DepartmentTO dto = new DepartmentTO(2, "HR2");
		return new ResponseEntity<DepartmentTO>(dto, HttpStatus.OK);
		
	}
	
	@PostMapping("/employees")
	public ResponseEntity<EmployeeTO> addUser(@RequestBody EmployeeTO emp) {

		emp = empService.addEmp(emp);

		return new ResponseEntity<EmployeeTO>(emp, HttpStatus.OK);
	}
	
	@PostMapping("/departments")
	public ResponseEntity<DepartmentTO> addDept(@RequestBody DepartmentTO dto) {
		Department d = new Department(dto.getId(), dto.getName());
		
		depService.addDept(d);
		
		return new ResponseEntity<DepartmentTO>(dto, HttpStatus.OK);
	}
	
	@DeleteMapping("/employees/{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable int id) {

		empService.delEmp(id);

		return new ResponseEntity<String>("Emp deleted Successfully", HttpStatus.OK);
	}
}
