package com.pennant.emp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;

import com.pennant.emp.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private JdbcTemplate jdbc;

	public Map<String, Object> countRecords() {
		return jdbc.queryForMap("select count(*) from employee");
	}

	public void saveEmployee(Employee emp) {

		jdbc.update("insert into employee values(?,?,?)", emp.getEmpId(), emp.getEmpName(), emp.getSalary());
		System.out.println("Dao: " + emp.getEmpName() + " Saved to DB");
	}

	public Employee findEmployee(int empId) {

		return jdbc.queryForObject("select * from employee where empid=?", new RowMapperDemo(), empId);
	}

	public List<Employee> listAll() {
		return jdbc.query("select * from employee", new ListAllEmployeeDemo());
	}

	public Map<String, Object> getEmployeeById(int empId) {
		// TODO Auto-generated method stub
		return jdbc.queryForMap("select * from employee where empid=?", empId);

	}

	public List<Map<String, Object>> getEmpData() {
		// TODO Auto-generated method stub
		return jdbc.queryForList("select * from employee");
	}

	// Implement with RowCallBackHandler interface
	public void getEmployees_V1() {

		jdbc.query("select * from employee", new RowCalBackHandlerDemo());
		// TODO Auto-generated method stub

	}

	// Using ResultSet Extractor Demo
	public Employee getEmployee_V2(int empId) {
		return jdbc.query("select * from employee where empid=?", new ResultSetExtractorDemo(), empId);
	}

	// Using ResultSet Extractor Demo
	public List<Employee> getEmployees_V3() {

		return jdbc.query("select * from employee", new ResultSetExtractor<List<Employee>>() {
			public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {

				List<Employee> emps = new ArrayList<Employee>();
				while (rs.next()) {
					Employee emp = new Employee();
					emp.setEmpId(rs.getInt(1));
					emp.setEmpName(rs.getString(2));
					emp.setSalary(rs.getDouble(3));
					emps.add(emp);
				}

				return emps;
			}
		});
	}

	public void deleteEmployee(int empId) {
		jdbc.update("delete from employee where empid=?", empId);
		System.out.println("Dao: " + empId + " Deleted from DB");
	}

	public void updateEmployee(Employee newEmp) {

		Employee emp = findEmployee(newEmp.getEmpId());

		if (emp.getEmpId() != newEmp.getEmpId()) {
			throw new RuntimeException();
		}
		jdbc.update("update employee set empname=?,salary=? where empid=?", newEmp.getEmpName(), newEmp.getSalary(),
				newEmp.getEmpId());
		System.out.println("Dao: " + newEmp.getEmpName() + " Updated to Db");

	}

}// end of Dao class

class ResultSetExtractorDemo implements ResultSetExtractor<Employee> {

	public Employee extractData(ResultSet rs) throws SQLException, DataAccessException {
		Employee emp = new Employee();
		if (rs.next()) {

			emp.setEmpId(rs.getInt(1));
			emp.setEmpName(rs.getString(2));
			emp.setSalary(rs.getDouble(3));
		}

		return emp;
	}
}

class RowCalBackHandlerDemo implements RowCallbackHandler {

	public void processRow(ResultSet rs) throws SQLException {

		// to take IO Reports

	}

}

class ListAllEmployeeDemo implements RowMapper<Employee> {

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {

		Employee emp = new Employee();
		emp.setEmpId(rs.getInt(1));
		emp.setEmpName(rs.getString(2));
		emp.setSalary(rs.getDouble(3));

		return emp;
	}
}

class RowMapperDemo implements RowMapper<Employee> {

	public Employee mapRow(ResultSet rs, int rowNo) throws SQLException {
		Employee emp = new Employee();
		emp.setEmpId(rs.getInt(1));
		emp.setEmpName(rs.getString(2));
		emp.setSalary(rs.getDouble(3));

		return emp;
	}

}
