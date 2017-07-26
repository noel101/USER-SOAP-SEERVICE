package com.apex.user.service;

import java.util.Date;

import com.apex.user.service.vo.Employee;

public class UserService {
	public String sayHello(){
		return "hello";
	}
	public String sayHelloWithName(String name){
		return "Hello"+ name;
		
	}
	public int add (int i, int j){
		return i+j;
	}
	public Date getServerDate(){
		return new Date();
	}
	public Employee getEmployee(int empId){
		
		Employee employee = new Employee(empId, "Meet", "xyz", "fremont", "ca", "94536", 1000+empId);
		
		return employee;
	}
}
