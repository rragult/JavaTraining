package com.controller;

import java.io.*;

public interface EmployeeInterface {
	public void addEmployee();
	public void viewEmployee();
	public void serilizeEmp() throws IOException;
	public void deserilizeEmp() throws IOException;
	public void sortbyEid();
	public void sortbyEName();
	public void updateEmployee();
	public void deleteEmployee();
}
