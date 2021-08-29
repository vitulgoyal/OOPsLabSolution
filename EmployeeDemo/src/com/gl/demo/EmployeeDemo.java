package com.gl.demo;

import java.util.Scanner;

import com.gl.beans.Employee;
import com.gl.enums.Department;
import com.gl.services.EmployeeServicesImpl;

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Employee employee = new Employee();
		System.out.println("Enter the first name of Employee");
		employee.setFirstName(sc.next());
		System.out.println("Enter the last name of Employee");
		employee.setLastName(sc.next());
		System.out.println("Enter the Department Number of Employee from following:");
		System.out.println("1. Technical \n2. Admin \n3. Human Resource \n4. Legal \n");
		switch (sc.nextInt()) {
		case 1: {
			employee.setDepartment(Department.Technical);
			break;
		}
		case 2: {
			employee.setDepartment(Department.Admin);
			break;
		}
		case 3: {
			employee.setDepartment(Department.Human_Resource);
			break;
		}
		case 4: {
			employee.setDepartment(Department.Legal);
			break;
		}
		default:
			System.out.println("Invalid Department Input");
		}
		EmployeeServicesImpl emps = new EmployeeServicesImpl();
		employee.setEmailID(emps.genrateEmployeeEmailID(employee));
		employee.setPassword(emps.genrateEmployeePassword(employee));
		sc.close();
		EmployeeDemo.showEmployeeInfo(employee);

	}
	
	/* 
	 * Showing Full Information of an employee on console
	 * 
	 * */
	
	static void showEmployeeInfo(Employee employee) {
		System.out.println("Employee Name: " + employee.getFirstName() + " " + employee.getLastName());
		System.out.println("Employee Department: " + employee.getDepartment().toString());
		System.out.println("Employee EmailID: " + employee.getEmailID());
		System.out.println("Employee Password: " + employee.getPassword());
	}
	
	

}
