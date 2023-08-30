package com.newparent;

public class Manager extends Member {
		
		String department;

public static void main(String[] args) {
	
	 Manager Obj1 = new Manager();
     Obj1.name = "Ajith";
     Obj1.age = 50;
     Obj1.phoneNumber = "123456789";
     Obj1.address = "no 5, xyz street";
     Obj1.salary = 100000;
     Obj1.department = "IT";
    
     System.out.println("Manager Details:");
     System.out.println("Name: " +Obj1.name);
     System.out.println("Age: " +Obj1.age);
     System.out.println("Phone Number: " +Obj1.phoneNumber);
     System.out.println("Address: " +Obj1.address);
     System.out.println("Salary: " +Obj1.salary);
     System.out.println("Department: " +Obj1.department);
}
}

