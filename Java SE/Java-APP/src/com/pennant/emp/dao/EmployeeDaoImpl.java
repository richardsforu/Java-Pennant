package com.pennant.emp.dao;

import java.util.List;

import com.pennant.emp.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public void saveEmployee(Employee emp) {
		System.out.println("EmpDao: "+emp.getEmpName()+" Saved to DB");
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

	@Override
	public List<Employee> listEmps() {
		// TODO Auto-generated method stub
		return null;
	}

}
