package com.pennant.emp.service;

import com.pennant.emp.dao.EmployeeDao;
import com.pennant.emp.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao empDao;

	public void setEmpDao(EmployeeDao empDao) {
		this.empDao = empDao;
	}

	@Override
	public void saveEmployee(Employee emp) {
		empDao.saveEmployee(emp);
	}

	@Override
	public Employee findEmployee(int empId) {
		return null;
	}

	@Override
	public void deleteEmployee(int empId) {

	}

	@Override
	public void updateEmployee(Employee newEmp) {

	}

}
