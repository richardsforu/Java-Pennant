package com;

import java.util.HashSet;

class Employee{
	int empId;

	public Employee(int empId) {
		this.empId = empId;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return empId;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean flag=false;
		
		Employee emp=(Employee) obj;
		if(this.empId==emp.empId) {
			flag=true;
		}
		// TODO Auto-generated method stub
		return flag;
	}
	
	
	
}

public class Test {
	
	
	
	
	
	public static void main(String[] args) {
		
		HashSet<Employee> hs=new HashSet<>();
		
		Employee e1=new Employee(10);
		Employee e2=new Employee(20);
		Employee e3=new Employee(30);
		
		hs.add(e3);
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		
		System.out.println(System.identityHashCode(e1));
		System.out.println(System.identityHashCode(e2));
		
		System.out.println("-------------------------");
		
		//System.out.println(hs.contains(new Employee(10)))
		
		/*if(!(hs.contains(new Employee(50)))) {
			hs.add(new Employee(50));
		}*/
		
		System.out.println(hs.contains(new Employee(20)));
		System.out.println(hs);
		
		/*Test t=new Test();
		t.f1();
		Integer a=2500;
		Integer b=2500;
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		//System.out.println(a.hashCode());
		//System.out.println(b.hashCode());
		
		if(a.equals(b)) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}*/
		
	}

}
