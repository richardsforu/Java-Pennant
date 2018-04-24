package com.pennant.emp.service;

import java.util.List;
import java.util.Map;

import com.pennant.emp.model.Employee;

public interface EmployeeService {

	public void saveEmployee(Employee emp);

	public Employee findEmployee(int empId);

	public List<Employee> listAll();

	public Map<String, Object> countRecords();
	public Map<String, Object> getEmployeeById(int empId);
	public List<Map<String, Object>> getEmpData();

}

