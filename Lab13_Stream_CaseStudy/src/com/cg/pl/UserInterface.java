package com.cg.pl;

import com.cg.bean.Department;
import com.cg.bean.Employee;
import com.cg.service.EmployeeService;

import java.time.LocalDate;

public class UserInterface {
	public static void main(String[] args) {
		EmployeeService service = new EmployeeService();
		
		Employee emp = new Employee();
		emp.setEmployeeId(100);
		emp.setSalary(1000.00);
		emp.setDepartment(new Department(101, "AUTO", 100));
		service.addEmp(emp);
		
		emp = new Employee();
		emp.setEmployeeId(101);
		emp.setSalary(1000.00);
		emp.setDepartment(new Department(100, "Mac", 100));
		service.addEmp(emp);
		
		emp = new Employee();
		emp.setEmployeeId(102);
		emp.setFirstName("Tanmay");
		emp.setDepartment(null);
		emp.setSalary(1000.00);
		service.addEmp(emp);
		
		
		service.getEmployeesWithoutDepartment().stream().forEach(System.out::println);
	}
}
