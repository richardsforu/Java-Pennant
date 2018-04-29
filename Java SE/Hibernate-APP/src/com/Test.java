package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.employee.Department;
import com.employee.Employee;

public class Test {

	public static void main(String[] args) {
	Configuration cf = new Configuration();
		cf.configure("hibernate.cfg.xml");

		SessionFactory sf = cf.buildSessionFactory();
		Session ses = sf.openSession();

		Employee e1 = new Employee();
		e1.setEmpId(10);
		e1.setEmpName("Praveen");
		e1.setSalary(3948394);

		Employee e2=new Employee(11, "James", 3847384);
		Employee e3=new Employee(12, "Bucky", 34335);
		Employee e4=new Employee(13, "Rose", 764646);
		Employee e5=new Employee(14, "Denis", 555666);
		
		
		
		Department dept = new Department();
		dept.setDeptId(10000);
		dept.setDeptName("HR");

	
		dept.getEmps().add(e1);
		dept.getEmps().add(e2);
		dept.getEmps().add(e3);
		dept.getEmps().add(e4);
		dept.getEmps().add(e5);
		
		//ses.save(dept);
		
		
		Department dept1= (Department)ses.load(Department.class, 10000);
		
		System.out.println("Dept Id: "+dept1.getDeptId());
		System.out.println("Name: "+dept1.getDeptName());
		System.out.println("---------------------------");
		
		for(Employee emp:dept1.getEmps()) {
			System.out.println("EMpId: "+emp.getEmpId());
			System.out.println("Name: "+emp.getEmpName());
			System.out.println("Salary: "+emp.getSalary());
			System.out.println("------------------------");
		}
		
		
		
		
		
	
		ses.beginTransaction().commit();

		System.out.println("---------- Done -----------");

	}

}
