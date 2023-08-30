package com.newparent;

public class Employee extends Member {
				
		String specialization;
		
	public static void main(String[] args) {
      
	        Employee Obj = new Employee();
	        Obj.name = "Vijay";
	        Obj.age = 25;
	        Obj.phoneNumber = "1234567";
	        Obj.address = "no 4, xyzz steet";
	        Obj.salary = 500000;
	        Obj.specialization= "Computer";
	        
	        System.out.println("Employee Details");
	        System.out.println("Name: " +Obj.name);
	        System.out.println("Age: " +Obj.age);
	        System.out.println("Phone Number: " +Obj.phoneNumber);
	        System.out.println("Address: " +Obj.address);
	        System.out.println("Salary: " +Obj.salary);
	        System.out.println("Specialization: " +Obj.specialization);
	}
	

}
