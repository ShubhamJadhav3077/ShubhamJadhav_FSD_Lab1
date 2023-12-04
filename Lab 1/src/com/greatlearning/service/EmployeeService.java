package com.greatlearning.service;

import com.greatlearning.model.Employee;

public interface  EmployeeService {
	String generateEmailID(String fname, String lname, String deptname);
	String generatePassword();
	void showEmployeeDetails();
	void showEmployeeDetails(Employee e);

}
