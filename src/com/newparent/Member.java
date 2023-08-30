package com.newparent;

public class Member {
	
	    String name;
	    int age;
	    String phoneNumber;
	    String address;
	    int salary;

	    public void printSalary() {
	        System.out.println("Salary");
	    }
	    public static void main(String[] args) {
			Member ps= new Member();
			ps.printSalary();
		}
	}

	
	