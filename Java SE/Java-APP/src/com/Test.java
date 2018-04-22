package com;

import com.pennant.emp.dao.EmployeeDao;
import com.pennant.emp.dao.EmployeeDaoImpl;
import com.pennant.emp.model.Employee;
import com.pennant.emp.service.EmployeeService;
import com.pennant.emp.service.EmployeeServiceImpl;

public class Test {

	public static void main(String[] args) {

		Employee emp = new Employee();

		emp.setEmpId(10);
		emp.setEmpName("Praveen");
		emp.setSalary(9437934);

		// DB Operations

		EmployeeDao empDao = new EmployeeDaoImpl();

		EmployeeService empService = new EmployeeServiceImpl();
		empService.setEmpDao(empDao);

		empService.saveEmployee(emp);

	}

}
