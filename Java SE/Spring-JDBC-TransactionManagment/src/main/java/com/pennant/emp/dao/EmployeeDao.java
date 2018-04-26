package com.pennant.emp.dao;

import java.util.List;
import java.util.Map;

import com.pennant.emp.model.Employee;

public interface EmployeeDao {

	public void deleteEmployee(int empId);
	public void updateEmployee(Employee newEmp);
	
	public void saveEmployee(Employee emp);

	public Employee findEmployee(int empId);

	public List<Employee> listAll();

	public Map<String, Object> countRecords();

	public Map<String, Object> getEmployeeById(int empId);

	public List<Map<String, Object>> getEmpData();

	public void getEmployees_V1();

	public Employee getEmployee_V2(int empId);

	public List<Employee> getEmployees_V3();

}
