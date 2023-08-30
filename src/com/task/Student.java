package com.task;

public class Student {

	String name;
	
	void Out() {
		this.name = "unknown";
        System.out.println(name);
	}
	
	public static void main(String[] args) {
		
	
		Student st = new Student();
		st.Out();
	}
}
