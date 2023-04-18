package com.dao;


import learn.Employee;

public interface EmployeeDao {

	public void insertEmployee(Employee emp);
	public void showEmployee();
	public void updateEmployee(int eid, String ename);
	public void deleteEmployee(int eid);
	
}
