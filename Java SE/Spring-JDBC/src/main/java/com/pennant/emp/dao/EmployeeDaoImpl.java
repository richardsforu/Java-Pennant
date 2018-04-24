package com.pennant.emp.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.pennant.emp.model.Employee;
@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private JdbcTemplate jdbc;
	
	public Map<String, Object> countRecords() {
		return jdbc.queryForMap("select count(*) from employee");
	}
	
	public void saveEmployee(Employee emp) {
		
	}

	public Employee findEmployee(int empId) {
		
		return null;
	}

	public List<Employee> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Map<String, Object> getEmployeeById(int empId) {
		// TODO Auto-generated method stub
		return jdbc.queryForMap("select * from employee where empid=?",empId);
		
	}

	public List<Map<String, Object>> getEmpData() {
		// TODO Auto-generated method stub
		return jdbc.queryForList("select * from employee");
	}

}
