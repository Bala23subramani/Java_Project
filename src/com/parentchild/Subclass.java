package com.parentchild;

public class Subclass extends Pclass {
	
	private void print2() {
		
		System.out.println("This is child class");

	}
		
		public static void main(String[] args) {
			Subclass p2=new Subclass();
			p2.print2();
			p2.print1();
			
		}

}
