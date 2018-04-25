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

	public void getEmployees_V1();

	public Employee getEmployee_V2(int empId); // For resultSet extractor interface

	public List<Employee> getEmployees_V3();//// For resultSet extractor interface

}
