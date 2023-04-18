package com.learning;

import java.util.function.Predicate;
import java.io.IOException;
import java.util.Scanner;
import com.controller.EmployeeController;
import com.controller.EmployeeInterface;



public class MainClass {


 public static void main(String[] args) throws IOException {

	 Predicate<User> auth= u->u.userName.equals("Tharun") && u.pwd.equals("PmmT@10");
     Scanner sc2= new Scanner(System.in);
     System.out.println("Enter User Name:");
     String userName=sc2.next();
     System.out.println("Enter Password:");
     String pwd=sc2.next();
     User user=new User(userName,pwd);
     
     if(auth.test(user)){
         System.out.println("Valid User"); 
     }
     else
      System.out.println("Invalid user");

System.out.println("Welcome");
EmployeeInterface ec = new EmployeeController();
ec.addEmployee();
ec.viewEmployee();

Scanner sc= new Scanner(System.in);
String choice = null;
do {
	System.out.println("Enter your choice");
	System.out.println("1. Add Employee");
	System.out.println("2. View Employee");
	System.out.println("3. Serialize Emplist");
	System.out.println("4. Deserialize Emplist");
	System.out.println("5. Sort Emp by ID");
	System.out.println("6. Sort by Emp name");
			System.out.println("7. Update Employee");
			System.out.println("8. Delete Employee");
	int ch1 =sc.nextInt();
	switch(ch1) {
	case 1:
	{
		ec.addEmployee();
		break;
	}
	case 2:
	{
		ec.viewEmployee();
		break;
	}
	case 3:
	{
		ec.serilizeEmp();
		break;
	}
	case 4:
	{
		ec.deserilizeEmp();
		break;
	}
	case 5: {
		ec.sortbyEid();;
		break;
	}
	case 6: {
		ec.sortbyEName();
		break;
	}
			case 7: {
				ec.updateEmployee();
				break;
			}
			case 8: {
				ec.deleteEmployee();
				break;
			}
	default:
	{
		System.out.println("Enter right choice");
		break;
	}
	}
	System.out.println("Do u want to continue Y or y");

	choice= sc.next();

}while(choice.equals("Y") || choice.equals("y"));
 System.out.println("Exited");
System.exit(0);
 }

static class User{
	    String userName;
	    String pwd;
	    
	    User(String userName,String pwd){
	        this.userName=userName;
	        this.pwd=pwd;
	    }
	}
}
