package com.gl.services;

import java.security.SecureRandom;

import com.gl.beans.Employee;

public class EmployeeServicesImpl implements IEmployeeServices {

	@Override
	public String genrateEmployeeEmailID(Employee employee) {
		// TODO Auto-generated method stub
		
		return employee.getFirstName() + employee.getLastName() + "@" + employee.getDepartment().toString() + ".gl.com";
	}

	@Override
	public String genrateEmployeePassword(Employee employee) {
		// TODO Auto-generated method stub
		// ASCII range – alphanumeric (0-9, a-z, A-Z)
        final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
 
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();
 
        // each iteration of the loop randomly chooses a character from the given
        // ASCII range and appends it to the `StringBuilder` instance
 
        for (int i = 0; i < 10; i++)
        {
            int randomIndex = random.nextInt(chars.length());
            sb.append(chars.charAt(randomIndex));
        }
 
        return sb.toString();
	}

}
