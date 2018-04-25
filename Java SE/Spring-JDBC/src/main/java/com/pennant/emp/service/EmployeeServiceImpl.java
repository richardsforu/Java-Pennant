package com.pennant.emp.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pennant.emp.dao.EmployeeDao;
import com.pennant.emp.model.Employee;

@Service
public  class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao empDao;

	public void saveEmployee(Employee emp) {
		empDao.saveEmployee(emp);

	}

	public Employee findEmployee(int empId) {
		// TODO Auto-generated method stub
		return empDao.findEmployee(empId);
	}

	public List<Employee> listAll() {
		// TODO Auto-generated method stub
		return empDao.listAll();
	}

	public Map<String, Object> countRecords() {
		// TODO Auto-generated method stub
		return empDao.countRecords();
	}

	public Map<String, Object> getEmployeeById(int empId) {
		// TODO Auto-generated method stub
		return empDao.getEmployeeById(empId);
	}

	public List<Map<String, Object>> getEmpData() {
		// TODO Auto-generated method stub
		return empDao.getEmpData();
	}

	// RowCallBackHandler demo method
	public void getEmployees_V1() {
		empDao.getEmployees_V1();
		
	}

	public Employee getEmployee_V2(int empId) {
		// TODO Auto-generated method stub
		return empDao.getEmployee_V2(empId);
	}

	public List<Employee> getEmployees_V3() {
		// TODO Auto-generated method stub
		return empDao.getEmployees_V3();
	}

}
