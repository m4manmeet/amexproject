package com.amx.interview;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.amx.interview.entity.Department;
import com.amx.interview.entity.Employee;
import com.amx.interview.presentation.DepartmentTO;
import com.amx.interview.presentation.EmployeeTO;
import com.amx.interview.service.DeptService;
import com.amx.interview.service.EmployeeService;

public class BeanTest {
	private Employee employee;
	private Department dept;
	private EmployeeTO empTO;
	private DepartmentTO deptTO;
	private EmployeeService empService;
	private DeptService deptService;
	
	@Test
	public void getterAndSetters() throws Exception {
	    employee = new Employee();
	    employee.setFirstName("fname");
	    employee.setLastName("lastname");
	    employee.setAddress("address");
	    employee.setEmpId(3);
	    employee.setDeptId(2);
	    
	    
	    assertEquals(employee.getAddress(),"address");
	    assertEquals(employee.getDeptId(), 2);
	    assertEquals(employee.getEmpId(), 3);
	    assertEquals(employee.getFirstName(),"fname");
	    assertEquals(employee.getLastName(), "lastname");
	    
	    employee = new Employee(2, "first", "last", "add",3);
	    assertEquals(employee.getAddress(),"add");
	    assertEquals(employee.getDeptId(), 3);
	    assertEquals(employee.getEmpId(), 2);
	    assertEquals(employee.getFirstName(),"first");
	    assertEquals(employee.getLastName(), "last");
	    
	    
	    empTO = new EmployeeTO();
	    empTO.setFirstName("fname");
	    empTO.setLastName("lastname");
	    empTO.setAddress("address");
	    empTO.setEmpId(3);
	    empTO.setDeptId(2);

	    
	    assertEquals(empTO.getAddress(),"address");
	    assertEquals(empTO.getDeptId(), 2);
	    assertEquals(empTO.getEmpId(), 3);
	    assertEquals(empTO.getFirstName(),"fname");
	    assertEquals(empTO.getLastName(), "lastname");
	    
	    empTO = new EmployeeTO("first", "last", "add", 2, 3);
	    assertEquals(empTO.getAddress(),"add");
	    assertEquals(empTO.getDeptId(), 3);
	    assertEquals(empTO.getEmpId(), 2);
	    assertEquals(empTO.getFirstName(),"first");
	    assertEquals(empTO.getLastName(), "last");
	    
	    dept = new Department();
	    deptTO = new DepartmentTO();
	    dept.setId(2);
	    dept.setName("HR");
	    deptTO.setId(2);
	    deptTO.setName("Finance");
	    assertEquals(dept.getId(), 2);
	    assertEquals(dept.getName(),"HR");
	    assertEquals(deptTO.getId(), 2);
	    assertEquals(deptTO.getName(), "Finance");
	    
	}
}