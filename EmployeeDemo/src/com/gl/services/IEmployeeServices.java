package com.gl.services;

import com.gl.beans.Employee;

public interface IEmployeeServices {
	
	String genrateEmployeeEmailID(Employee employee);
	String genrateEmployeePassword(Employee employee);
	

}
