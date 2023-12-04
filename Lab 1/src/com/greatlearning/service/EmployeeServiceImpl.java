package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public String generateEmailID(String fname, String lname, String deptname) {
		// TODO Auto-generated method stub
		return fname+lname+"@"+deptname+".gl.com";
	}

	@Override
	public String generatePassword() {
		// TODO Auto-generated method stub
		String caps="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower="abcdefghijklmnopqrstuvwxyz";
		String nums="0123456789";
		String splchars="!@#$%^&*()";
		
		String combined=caps+lower+nums+splchars; //size=72
		String myPass="";
		
		Random random=new Random();
		for(int i=1;i<=8;i++)
		{
			myPass=myPass+String.valueOf(combined.charAt(random.nextInt(combined.length())));
		}
		
		return myPass;
	}

	@Override
	public void showEmployeeDetails(Employee e) {
		// TODO Auto-generated method stub
		System.out.println("Employee First Name: "+e.getFirstName());
		System.out.println("Employee Last  Name: "+e.getLastName());
		System.out.println("Employee    EmailID: "+e.getEmail());
		System.out.println("Employee   Password: "+e.getPassword());
		
	}

	@Override
	public void showEmployeeDetails() {
		// TODO Auto-generated method stub
		
	}
	

}
