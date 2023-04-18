package com.controller;

import java.util.*;
import java.io.*;
import learn.Employee;

public class EmployeeController implements EmployeeInterface {

	Employee emp;
	List<Employee> emplist = new ArrayList<Employee>();



	public void addEmployee() {
		// TODO Auto-generated method stub
		emp = new Employee();
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the ID:");
		 int eid=sc.nextInt();
		 emp.setEid(eid);
		 
		 System.out.println("Enter the EName:");
		 String ename = sc.next();
		 emp.setEname(ename);
		 
		 emplist.add(emp);
	}
	public void viewEmployee() {
		// TODO Auto-generated method stub
		//Iterator i = emplist.iterator();
		//while(i.hasNext()) {
		//	System.out.println(i.next());
		//}
		System.out.println(emplist);
		
		emplist.forEach(System.out::println);
	}
	
	public void serilizeEmp() throws IOException {
		try{
		
			FileOutputStream fos = new FileOutputStream("dedalus.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(emplist);
			System.out.println("Serilized to file dedalus.txt");
			oos.close();
			fos.close();
			}
			catch(FileNotFoundException fnf)
			{
				System.out.println("No file");
			}
	}
	public void deserilizeEmp() throws IOException {
		try{
			
			
			FileInputStream fis = new FileInputStream("dedalus.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			emplist = (ArrayList<Employee>)ois.readObject();
			System.out.println("DeSerilized from file dedalus.txt");
			System.out.println(emp.getEid());
			System.out.println(emp.getEname());
			ois.close();
			fis.close();
			}
			catch(FileNotFoundException fnf)
			{
				System.out.println("No file");
			}
			catch(ClassNotFoundException cnf)
			{
				System.out.println("No Emp class");
			}
	}
	@Override
	public void sortbyEid() {
		Collections.sort(emplist);
		System.out.println("Sort by Eid");
		System.out.println(emplist);
		
	}
	@Override
	public void sortbyEName() {
		Collections.sort(emplist, Employee.NameComparator);
		System.out.println("Sort by Ename");
		System.out.println(emplist);
		
	}
}
