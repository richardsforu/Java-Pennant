package com.pennant.emp.dao;

import java.util.List;

import com.pennant.emp.model.Employee;

public interface EmployeeDao {

	void saveEmployee(Employee emp);

	Employee findEmployee(int empId);

	void deleteEmployee(int empId);

	void updateEmployee(Employee newEmp);
	
	public List<Employee> listEmps();

}