package com.pennant.emp.service;

import com.pennant.emp.dao.EmployeeDao;
import com.pennant.emp.model.Employee;

public interface EmployeeService {

	void saveEmployee(Employee emp);

	Employee findEmployee(int empId);

	void deleteEmployee(int empId);

	void updateEmployee(Employee newEmp);

	public void setEmpDao(EmployeeDao empDao);
	

}