package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("emp")
public class Employee {

	private int empId = 10;
	private String empName = "Praveen";
	private double salary = 93439469;

	public Employee() {
		System.out.println("Employee Object Created");
	}
	/*
	 * public Employee(Department dept) { this.dept=dept; }
	 */

	@Autowired
	private Department dept;

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		// System.out.println("--- empId setter");
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
